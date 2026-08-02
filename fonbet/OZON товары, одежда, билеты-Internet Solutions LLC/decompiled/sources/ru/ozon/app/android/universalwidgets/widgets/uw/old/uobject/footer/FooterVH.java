package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer;

import W10.c;
import WZ.t;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.universalwidgets.databinding.ItemUwidgetFooterBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.FooterVH;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.FooterVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/FooterVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "color", "", "createStubFooter", "(I)V", "onViewInVisibleBounds", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Ll20/d;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "Lru/ozon/app/android/universalwidgets/databinding/ItemUwidgetFooterBinding;", "binding", "Lru/ozon/app/android/universalwidgets/databinding/ItemUwidgetFooterBinding;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FooterVH extends k<FooterVO> {

    @NotNull
    private final ItemUwidgetFooterBinding binding;
    private d info;
    private FooterVO item;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterVH(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        ItemUwidgetFooterBinding bind = ItemUwidgetFooterBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3(FooterVO footerVO, FooterVH footerVH, ItemUwidgetFooterBinding itemUwidgetFooterBinding, View view) {
        t tokenizedEvent = footerVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(footerVH.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        UWDeeplink deeplink = footerVO.getDeeplink();
        if (deeplink != null) {
            ComposerReferences composerReferences = footerVH.ref;
            ConstraintLayout constraintLayout = itemUwidgetFooterBinding.getConstraintLayout();
            constraintLayout.setTransitionName("transition_view" + footerVO);
            Unit unit = Unit.f71690a;
            OpenNestedPageExtKt.navigate(deeplink, composerReferences, "FooterVH", U.i(new Pair("transition_view", constraintLayout)));
        }
    }

    private final void createStubFooter(int color) {
        ItemUwidgetFooterBinding itemUwidgetFooterBinding = this.binding;
        itemUwidgetFooterBinding.getConstraintLayout().getLayoutParams().height = ResourceExtKt.toPx(12);
        itemUwidgetFooterBinding.uWidgetFooterCl.setBackground(null);
        itemUwidgetFooterBinding.uWidgetFooterCl.setBackgroundColor(color);
        itemUwidgetFooterBinding.uWidgetFooterTitleTv.setVisibility(8);
        itemUwidgetFooterBinding.uWidgetFooterDisclosureIv.setVisibility(8);
        itemUwidgetFooterBinding.getConstraintLayout().setOnClickListener(null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        FooterVO footerVO = this.item;
        if (footerVO == null || (tokenizedEvent = footerVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FooterVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull final FooterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
        this.item = item;
        String type = item.getType();
        if (Intrinsics.d(type, "stub")) {
            createStubFooter(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
            return;
        }
        if (Intrinsics.d(type, "stub_white_2")) {
            createStubFooter(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor0));
            return;
        }
        final ItemUwidgetFooterBinding itemUwidgetFooterBinding = this.binding;
        itemUwidgetFooterBinding.getConstraintLayout().getLayoutParams().height = -2;
        itemUwidgetFooterBinding.uWidgetFooterCl.setBackground(getContext().getDrawable(R$drawable.bg_white_ripple_blue));
        TextView uWidgetFooterTitleTv = itemUwidgetFooterBinding.uWidgetFooterTitleTv;
        Intrinsics.checkNotNullExpressionValue(uWidgetFooterTitleTv, "uWidgetFooterTitleTv");
        TextViewExtKt.setTextOrGone(uWidgetFooterTitleTv, item.getTitle());
        ImageView uWidgetFooterDisclosureIv = itemUwidgetFooterBinding.uWidgetFooterDisclosureIv;
        Intrinsics.checkNotNullExpressionValue(uWidgetFooterDisclosureIv, "uWidgetFooterDisclosureIv");
        ViewExtKt.showOrGone(uWidgetFooterDisclosureIv, item.getDisclosure());
        itemUwidgetFooterBinding.getConstraintLayout().setOnClickListener(new View.OnClickListener() { // from class: KX.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FooterVH.bind$lambda$4$lambda$3(FooterVO.this, this, itemUwidgetFooterBinding, view);
            }
        });
    }
}
