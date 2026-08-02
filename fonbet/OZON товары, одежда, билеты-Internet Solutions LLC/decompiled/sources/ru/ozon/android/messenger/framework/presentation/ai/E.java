package ru.ozon.android.messenger.framework.presentation.ai;

import android.view.View;
import androidx.compose.foundation.gestures.C5177u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r0.C9115P;
import r0.C9140t;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantListKt$AiMessageItem$1$1$1", f = "AiAssistantList.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class E extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89237d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f89238e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ View f89239f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantListKt$AiMessageItem$1$1$1$1", f = "AiAssistantList.kt", l = {221, 222}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89240d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f89241e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f89242f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f89242f = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f89242f, dVar);
            aVar.f89241e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r7 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC10628c interfaceC10628c;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89240d;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC10628c = (InterfaceC10628c) this.f89241e;
                this.f89241e = interfaceC10628c;
                this.f89240d = 1;
                obj = C9115P.d(interfaceC10628c, null, this, 2);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    if (((x1.x) obj) != null) {
                        HapticVibrator.INSTANCE.vibrate(this.f89242f, HapticToken.SOFT);
                    }
                    return Unit.f71690a;
                }
                interfaceC10628c = (InterfaceC10628c) this.f89241e;
                Sc.s.b(obj);
            }
            long d11 = ((x1.x) obj).d();
            this.f89241e = null;
            this.f89240d = 2;
            obj = C5177u.d(interfaceC10628c, d11, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(View view, kotlin.coroutines.d<? super E> dVar) {
        super(2, dVar);
        this.f89239f = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        E e11 = new E(this.f89239f, dVar);
        e11.f89238e = obj;
        return e11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((E) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89237d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f7 = (x1.F) this.f89238e;
            a aVar2 = new a(this.f89239f, null);
            this.f89237d = 1;
            if (C9140t.b(f7, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
