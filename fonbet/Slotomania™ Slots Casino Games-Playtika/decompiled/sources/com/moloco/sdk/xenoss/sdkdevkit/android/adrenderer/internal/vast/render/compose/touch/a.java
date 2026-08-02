package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes7.dex */
public final class a implements PressGestureScope, Density {
    public final /* synthetic */ Density a;
    public boolean b;
    public boolean c;
    public final Mutex d;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.PressGestureScopeImpl2", f = "Tap.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "awaitRelease", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a, reason: collision with other inner class name */
    public static final class C0366a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public C0366a(Continuation<? super C0366a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return a.this.awaitRelease(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.PressGestureScopeImpl2", f = "Tap.kt", i = {0}, l = {130}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return a.this.tryAwaitRelease(this);
        }
    }

    public a(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.a = density;
        this.d = MutexKt.Mutex(false);
    }

    public final void a() {
        this.c = true;
        Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitRelease(Continuation<? super Unit> continuation) {
        C0366a c0366a;
        Object obj;
        int i;
        if (continuation instanceof C0366a) {
            c0366a = (C0366a) continuation;
            int i2 = c0366a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0366a.c = i2 - Integer.MIN_VALUE;
                obj = c0366a.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0366a.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    c0366a.c = 1;
                    obj = tryAwaitRelease(c0366a);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new GestureCancellationException("The press gesture was canceled.");
                }
                return Unit.INSTANCE;
            }
        }
        c0366a = new C0366a(continuation);
        obj = c0366a.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0366a.c;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void b() {
        this.b = true;
        Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    public final void c() {
        Mutex.DefaultImpls.tryLock$default(this.d, null, 1, null);
        this.b = false;
        this.c = false;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.a.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo329roundToPxR2X_6o(long j) {
        return this.a.mo329roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo330roundToPx0680j_4(float f) {
        return this.a.mo330roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo331toDpGaN1DYA(long j) {
        return this.a.mo331toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo332toDpu2uoSUM(float f) {
        return this.a.mo332toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo334toDpSizekrfVVM(long j) {
        return this.a.mo334toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo335toPxR2X_6o(long j) {
        return this.a.mo335toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo336toPx0680j_4(float f) {
        return this.a.mo336toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.a.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo337toSizeXkaWNTQ(long j) {
        return this.a.mo337toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo338toSp0xMU5do(float f) {
        return this.a.mo338toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo339toSpkPz2Gy4(float f) {
        return this.a.mo339toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAwaitRelease(Continuation<? super Boolean> continuation) {
        b bVar;
        int i;
        a aVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.b && !this.c) {
                        Mutex mutex = this.d;
                        bVar.a = this;
                        bVar.d = 1;
                        if (Mutex.DefaultImpls.lock$default(mutex, null, bVar, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(aVar.b);
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        return Boxing.boxBoolean(aVar.b);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo333toDpu2uoSUM(int i) {
        return this.a.mo333toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo340toSpkPz2Gy4(int i) {
        return this.a.mo340toSpkPz2Gy4(i);
    }
}
