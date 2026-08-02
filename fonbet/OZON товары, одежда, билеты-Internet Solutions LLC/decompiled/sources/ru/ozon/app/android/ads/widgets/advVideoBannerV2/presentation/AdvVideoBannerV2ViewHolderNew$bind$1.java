package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2NewBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2ViewHolderNew$bind$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ AdvBannerVideoV2VO $item;
    final /* synthetic */ AdvVideoBannerV2ViewHolderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2ViewHolderNew$bind$1(AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew, AdvBannerVideoV2VO advBannerVideoV2VO) {
        super(2);
        this.this$0 = advVideoBannerV2ViewHolderNew;
        this.$item = advBannerVideoV2VO;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View it) {
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding;
        Function1 function1;
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(it, "it");
        widgetAdvVideoBannerV2NewBinding = this.this$0.binding;
        if (widgetAdvVideoBannerV2NewBinding == null) {
            return;
        }
        BadgeView advLabelBadgeView = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.getAdvLabelBadgeView();
        BadgeDTO badge = this.$item.getBadge();
        function1 = this.this$0.actionHandler;
        BadgeHolderKt.bind(advLabelBadgeView, badge, (Function1<? super AtomAction, Unit>) function1);
        TextAtom legalInformation = this.$item.getLegalInformation();
        if (legalInformation != null) {
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.bindLegalInformation(legalInformation);
        }
    }
}
