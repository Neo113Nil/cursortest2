package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import Ae.w0;
import Ae.x0;
import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.ShowMessageEvent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SubscribeEvent;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerHeaderViewModel$processAction$1$1$1 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ boolean $shouldShowMessage;
    final /* synthetic */ SellerHeaderViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel$processAction$1$1$1$1", f = "SellerHeaderViewModel.kt", l = {57, 59}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel$processAction$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $actionId;
        final /* synthetic */ Map<String, String> $params;
        final /* synthetic */ boolean $shouldShowMessage;
        int label;
        final /* synthetic */ SellerHeaderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerHeaderViewModel sellerHeaderViewModel, String str, Map<String, String> map, boolean z11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = sellerHeaderViewModel;
            this.$actionId = str;
            this.$params = map;
            this.$shouldShowMessage = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$actionId, this.$params, this.$shouldShowMessage, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                x0<SubscribeEvent> subscribeStateFlow = this.this$0.getSubscribeStateFlow();
                String str = this.$actionId;
                Map<String, String> map = this.$params;
                SubscribeEvent.ErrorEvent errorEvent = new SubscribeEvent.ErrorEvent(str, map != null ? map.get("sellerId") : null);
                this.label = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            if (Intrinsics.d(this.$actionId, "sisLike") && this.$shouldShowMessage) {
                w0<ShowMessageEvent> showMessageEventFlow = this.this$0.getShowMessageEventFlow();
                ShowMessageEvent.ErrorEvent errorEvent2 = ShowMessageEvent.ErrorEvent.INSTANCE;
                this.label = 2;
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerHeaderViewModel$processAction$1$1$1(SellerHeaderViewModel sellerHeaderViewModel, String str, Map<String, String> map, boolean z11) {
        super(1);
        this.this$0 = sellerHeaderViewModel;
        this.$actionId = str;
        this.$params = map;
        this.$shouldShowMessage = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        C10727i.c(androidx.lifecycle.x0.a(this.this$0), null, null, new AnonymousClass1(this.this$0, this.$actionId, this.$params, this.$shouldShowMessage, null), 3);
        Lm0.a.f17149a.e(th2);
    }
}
