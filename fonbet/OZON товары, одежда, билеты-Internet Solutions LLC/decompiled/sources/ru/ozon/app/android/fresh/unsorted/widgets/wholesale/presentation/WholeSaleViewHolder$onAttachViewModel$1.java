package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation;

import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WholeSaleViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<WholeSaleViewModel.Action, Unit> {
    final /* synthetic */ WholeSaleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WholeSaleViewHolder$onAttachViewModel$1(WholeSaleViewHolder wholeSaleViewHolder) {
        super(1);
        this.this$0 = wholeSaleViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WholeSaleViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WholeSaleViewModel.Action action) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        ComposerReferences composerReferences4;
        ComposerReferences composerReferences5;
        if (Intrinsics.d(action, WholeSaleViewModel.Action.AddToCartError.INSTANCE)) {
            WholeSaleVO boundedData = this.this$0.getBoundedData();
            if (boundedData != null) {
                WholeSaleViewHolder wholeSaleViewHolder = this.this$0;
                composerReferences4 = wholeSaleViewHolder.refs;
                ComponentCallbacksC5392m c11 = composerReferences4.getContainer().c();
                ViewGroup rootView = c11 != null ? ContextExtKt.getRootView(c11) : null;
                if (rootView != null) {
                    FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                    int i11 = R$drawable.ic_m_cancel_filled;
                    String token = UniColors.GRAPHIC_NEGATIVE_PRIMARY.getToken();
                    OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(boundedData.getErrorMessage());
                    composerReferences5 = wholeSaleViewHolder.refs;
                    FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, token, null, null, null, null, null, 3000L, null, null, composerReferences5.getContainer().g(), 57178, null).show();
                }
            }
        } else {
            if (!Intrinsics.d(action, WholeSaleViewModel.Action.AddToCartSuccess.INSTANCE)) {
                throw new o();
            }
            WholeSaleVO boundedData2 = this.this$0.getBoundedData();
            if (boundedData2 != null) {
                WholeSaleViewHolder wholeSaleViewHolder2 = this.this$0;
                composerReferences = wholeSaleViewHolder2.refs;
                r a11 = composerReferences.getContainer().a();
                ViewGroup rootView2 = a11 != null ? ContextExtKt.getRootView(a11) : null;
                if (rootView2 != null) {
                    FlashbarFactory flashbarFactory2 = FlashbarFactory.INSTANCE;
                    int i12 = R$drawable.ic_m_confirmed_filled;
                    String token2 = UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken();
                    OzonSpannableString ozonSpannableString2 = OzonSpannableStringKt.toOzonSpannableString(boundedData2.getSuccessMessage());
                    composerReferences2 = wholeSaleViewHolder2.refs;
                    FlashbarFactory.create$default(flashbarFactory2, rootView2, null, ozonSpannableString2, null, null, Integer.valueOf(i12), null, token2, null, null, null, null, null, 3000L, null, null, composerReferences2.getContainer().g(), 57178, null).show();
                }
            }
        }
        composerReferences3 = this.this$0.refs;
        composerReferences3.getNavigator().popBackStack();
    }
}
