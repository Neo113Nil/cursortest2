package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer;

import KX.b;
import W10.c;
import WZ.t;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.FooterVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 82\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00018B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$H\u0014¢\u0006\u0004\b&\u0010'J3\u0010.\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u001e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00103R\u0014\u00104\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/FooterVHOptimized;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "color", "", "createStubFooter", "(I)V", "Landroidx/appcompat/widget/AppCompatTextView;", "createTitleTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "createDisclosureIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Ljava/lang/String;)V", "", "disclosure", "bindImage", "(Ljava/lang/Boolean;)V", "setupLayoutParams", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "onViewInVisibleBounds", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Ll20/d;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "footerTitleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "footerDisclosureIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FooterVHOptimized extends k<FooterVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final View containerView;

    @NotNull
    private final AppCompatImageView footerDisclosureIv;

    @NotNull
    private final AppCompatTextView footerTitleTv;
    private d info;
    private FooterVO item;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/FooterVHOptimized$Companion;", "", "<init>", "()V", "FOOTER_STUB_HEIGHT", "", "TITLE_TOP_MARGIN_DP", "TITLE_END_MARGIN_DP", "TITLE_START_MARGIN_DP", "TITLE_BOTTOM_MARGIN_DP", "TITLE_GONE_END_MARGIN_DP", "IMAGE_WIDTH_DP", "IMAGE_HEIGHT_DP", "IMAGE_MARGIN_END_DP", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterVHOptimized(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        this.ref = ref;
        AppCompatTextView createTitleTv = createTitleTv();
        this.footerTitleTv = createTitleTv;
        AppCompatImageView createDisclosureIv = createDisclosureIv();
        this.footerDisclosureIv = createDisclosureIv;
        ConstraintLayout constraintLayout = containerView instanceof ConstraintLayout ? (ConstraintLayout) containerView : null;
        if (constraintLayout != null) {
            constraintLayout.addView(createTitleTv);
            constraintLayout.addView(createDisclosureIv);
            setupLayoutParams(createTitleTv);
            setupLayoutParams(createDisclosureIv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(FooterVO footerVO, FooterVHOptimized footerVHOptimized, View view) {
        t tokenizedEvent = footerVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(footerVHOptimized.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        UWDeeplink deeplink = footerVO.getDeeplink();
        if (deeplink != null) {
            ComposerReferences composerReferences = footerVHOptimized.ref;
            View view2 = footerVHOptimized.containerView;
            view2.setTransitionName("transition_view" + footerVO);
            Unit unit = Unit.f71690a;
            OpenNestedPageExtKt.navigate(deeplink, composerReferences, "FooterVH", U.i(new Pair("transition_view", view2)));
        }
    }

    private final void bindImage(Boolean disclosure) {
        ViewExtKt.showOrGone(this.footerDisclosureIv, disclosure);
    }

    private final void bindTitle(String title) {
        TextViewExtKt.setTextOrGone(this.footerTitleTv, title);
    }

    private final AppCompatImageView createDisclosureIv() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(R$id.uWidgetFooterDisclosureIv);
        appCompatImageView.setImageResource(R$drawable.ic_disclosure_blue);
        return appCompatImageView;
    }

    private final void createStubFooter(int color) {
        this.containerView.getLayoutParams().height = ResourceExtKt.toPx(12);
        this.containerView.setBackground(null);
        this.containerView.setBackgroundColor(color);
        this.footerTitleTv.setVisibility(8);
        this.footerDisclosureIv.setVisibility(8);
        this.containerView.setOnClickListener(null);
    }

    private final AppCompatTextView createTitleTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.uWidgetFooterTitleTv);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        return appCompatTextView;
    }

    private final void setupLayoutParams(AppCompatTextView appCompatTextView) {
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        bVar.f41616W = true;
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41657u = R$id.uWidgetFooterDisclosureIv;
        bVar.setMarginEnd(ResourceExtKt.toPx(8));
        bVar.setMarginStart(ResourceExtKt.toPx(16));
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(24);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ResourceExtKt.toPx(16);
        bVar.f41595B = ResourceExtKt.toPx(16);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L_Blue);
        bVar.f41598E = 0.0f;
        bVar.f41604K = 2;
        appCompatTextView.setLayoutParams(bVar);
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
    public void bind(@NotNull FooterVO item, @NotNull d info) {
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
        this.containerView.getLayoutParams().height = -2;
        this.containerView.setBackground(getContext().getDrawable(R$drawable.bg_white_ripple_blue));
        bindTitle(item.getTitle());
        bindImage(item.getDisclosure());
        this.containerView.setOnClickListener(new b(0, item, this));
    }

    private final void setupLayoutParams(AppCompatImageView appCompatImageView) {
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = ResourceExtKt.toPx(16);
            ((ViewGroup.MarginLayoutParams) bVar).height = ResourceExtKt.toPx(16);
            bVar.setMarginEnd(ResourceExtKt.toPx(12));
            int i11 = R$id.uWidgetFooterTitleTv;
            bVar.f41642l = i11;
            bVar.f41636i = i11;
            bVar.f41658v = 0;
            appCompatImageView.setLayoutParams(bVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
