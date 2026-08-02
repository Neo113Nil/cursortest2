package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import Sc.s;
import Wc.a;
import androidx.compose.ui.platform.P1;
import j1.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import x1.F;
import x1.InterfaceC10628c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1", f = "MercuryCertificatesAddressWidget.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ i $focusManager;
    final /* synthetic */ P1 $keyboardController;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/c;", "", "<anonymous>", "(Lx1/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1$1", f = "MercuryCertificatesAddressWidget.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, d<? super Unit>, Object> {
        final /* synthetic */ i $focusManager;
        final /* synthetic */ P1 $keyboardController;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i iVar, P1 p12, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$focusManager = iVar;
            this.$keyboardController = p12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$focusManager, this.$keyboardController, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r8.L$0
                x1.c r1 = (x1.InterfaceC10628c) r1
                Sc.s.b(r9)
                goto L2e
            L11:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L19:
                Sc.s.b(r9)
                java.lang.Object r9 = r8.L$0
                x1.c r9 = (x1.InterfaceC10628c) r9
                r1 = r9
            L21:
                x1.o r9 = x1.EnumC10640o.Initial
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r9 = r1.i0(r9, r8)
                if (r9 != r0) goto L2e
                return r0
            L2e:
                x1.m r9 = (x1.C10638m) r9
                java.util.List r9 = r9.b()
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.Iterator r9 = r9.iterator()
            L3a:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L5a
                java.lang.Object r3 = r9.next()
                r4 = r3
                x1.x r4 = (x1.x) r4
                boolean r5 = r4.g()
                if (r5 == 0) goto L3a
                long r4 = x1.C10639n.f(r4)
                r6 = 0
                boolean r4 = k1.C7459e.d(r4, r6)
                if (r4 != 0) goto L3a
                goto L5b
            L5a:
                r3 = 0
            L5b:
                x1.x r3 = (x1.x) r3
                if (r3 == 0) goto L21
                j1.i r9 = r8.$focusManager
                r3 = 0
                r9.g(r3)
                androidx.compose.ui.platform.P1 r9 = r8.$keyboardController
                if (r9 == 0) goto L21
                r9.hide()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1(i iVar, P1 p12, d<? super MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1> dVar) {
        super(2, dVar);
        this.$focusManager = iVar;
        this.$keyboardController = p12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1 mercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1 = new MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1(this.$focusManager, this.$keyboardController, dVar);
        mercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1.L$0 = obj;
        return mercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f7 = (F) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$focusManager, this.$keyboardController, null);
            this.label = 1;
            if (f7.N0(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
