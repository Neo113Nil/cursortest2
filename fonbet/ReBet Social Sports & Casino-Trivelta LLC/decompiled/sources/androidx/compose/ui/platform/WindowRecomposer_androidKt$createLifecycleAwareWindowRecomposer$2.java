package androidx.compose.ui.platform;

import B.y;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Ph.S;
import android.view.View;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements InterfaceC2191p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f17666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f17667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f17668c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC2185j.a.values().length];
            try {
                iArr[AbstractC2185j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2185j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2185j.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2185j.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2185j.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2185j.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2185j.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f17669n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f17670o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f17671p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2193s f17672q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f17673r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f17674s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef objectRef, y yVar, InterfaceC2193s interfaceC2193s, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, Continuation continuation) {
            super(2, continuation);
            this.f17671p = objectRef;
            this.f17672q = interfaceC2193s;
            this.f17673r = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
            this.f17674s = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f17671p, null, this.f17672q, this.f17673r, this.f17674s, continuation);
            bVar.f17670o = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C0 c02;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f17669n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    android.support.v4.media.session.b.a(this.f17671p.element);
                    this.f17670o = null;
                    this.f17669n = 1;
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    c02 = null;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c02 = (C0) this.f17670o;
                try {
                    ResultKt.throwOnFailure(obj);
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                    this.f17672q.getLifecycle().d(this.f17673r);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (c02 != null) {
                C0.a.b(c02, null, 1, null);
            }
            this.f17672q.getLifecycle().d(this.f17673r);
            throw th;
        }
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            AbstractC1459k.d(this.f17666a, null, S.f9050d, new b(this.f17667b, null, source, this, this.f17668c, null), 1, null);
            return;
        }
        Object obj = null;
        if (i10 == 2) {
            obj.getClass();
            throw null;
        }
        if (i10 == 3) {
            throw null;
        }
        if (i10 == 4) {
            throw null;
        }
    }
}
