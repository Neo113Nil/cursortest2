package ru.ozon.app.android.partpayment.homecredit;

import GZ.g;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/partpayment/homecredit/HomeCreditResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/partpayment/homecredit/HomeCreditResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HomeCreditActionHandler$processAction$singleDisposable$3 extends AbstractC7737t implements Function1<HomeCreditResponse, Unit> {
    final /* synthetic */ C4911f $ownerContainer;
    final /* synthetic */ HomeCreditActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeCreditActionHandler$processAction$singleDisposable$3(C4911f c4911f, HomeCreditActionHandler homeCreditActionHandler) {
        super(1);
        this.$ownerContainer = c4911f;
        this.this$0 = homeCreditActionHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HomeCreditResponse homeCreditResponse) {
        invoke2(homeCreditResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HomeCreditResponse homeCreditResponse) {
        ViewGroup rootView;
        g gVar;
        String message = homeCreditResponse.getMessage();
        if (message == null) {
            String deeplink = homeCreditResponse.getDeeplink();
            if (deeplink != null) {
                gVar = this.this$0.ozonRouter;
                g.a.a(gVar, deeplink, null, null, 6);
                return;
            }
            return;
        }
        ComponentCallbacksC5392m c11 = this.$ownerContainer.c();
        if ((c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) && (rootView = ContextExtKt.getRootView(this.$ownerContainer.i())) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, null, this.$ownerContainer.g(), 58, null).show();
    }
}
