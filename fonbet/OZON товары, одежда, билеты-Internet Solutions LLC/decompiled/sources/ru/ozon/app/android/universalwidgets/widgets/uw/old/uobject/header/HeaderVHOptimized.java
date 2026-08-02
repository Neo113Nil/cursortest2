package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header;

import CG.a;
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
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.HeaderVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 22\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00012B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ#\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b\u000e\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+R\u001e\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u0010-\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/header/HeaderVHOptimized;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "bindStub", "()V", "item", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Ljava/lang/String;)V", "subtitle", "bindSubtitle", "", "disclosure", "bindImage", "(Ljava/lang/Boolean;)V", "Landroidx/appcompat/widget/AppCompatTextView;", "createTitleTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "createSubtitleTv", "Landroidx/appcompat/widget/AppCompatImageView;", "createDisclosureIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "setupTitleLayoutParams", "setupSubtitleLayoutParams", "setupDisclosureLayoutParams", "onViewInVisibleBounds", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;", "Ll20/d;", "headerTitleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "headerSubtitleTv", "headerDisclosureIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderVHOptimized extends k<HeaderVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final View containerView;

    @NotNull
    private final AppCompatImageView headerDisclosureIv;

    @NotNull
    private final AppCompatTextView headerSubtitleTv;

    @NotNull
    private final AppCompatTextView headerTitleTv;
    private d info;
    private HeaderVO item;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/header/HeaderVHOptimized$Companion;", "", "<init>", "()V", "HEADER_STUB_HEIGHT", "", "TITLE_MARGIN_START_DP", "TITLE_MARGIN_END_DP", "TITLE_MARGIN_TOP_DP", "TITLE_MARGIN_GONE_END_DP", "TITLE_MARGIN_GONE_BOTTOM_DP", "SUBTITLE_MARGIN_START_DP", "SUBTITLE_MARGIN_END_DP", "SUBTITLE_MARGIN_TOP_DP", "SUBTITLE_MARGIN_BOTTOM_DP", "SUBTITLE_MARGIN_GONE_END_DP", "SUBTITLE_MARGIN_GONE_TOP_DP", "IMAGE_WIDTH_DP", "IMAGE_HEIGHT_DP", "IMAGE_MARGIN_END_DP", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderVHOptimized(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        this.ref = ref;
        AppCompatTextView createTitleTv = createTitleTv();
        this.headerTitleTv = createTitleTv;
        AppCompatTextView createSubtitleTv = createSubtitleTv();
        this.headerSubtitleTv = createSubtitleTv;
        AppCompatImageView createDisclosureIv = createDisclosureIv();
        this.headerDisclosureIv = createDisclosureIv;
        ConstraintLayout constraintLayout = containerView instanceof ConstraintLayout ? (ConstraintLayout) containerView : null;
        if (constraintLayout != null) {
            constraintLayout.addView(createTitleTv);
            constraintLayout.addView(createSubtitleTv);
            constraintLayout.addView(createDisclosureIv);
            setupTitleLayoutParams();
            setupSubtitleLayoutParams();
            setupDisclosureLayoutParams();
        }
        this.itemView.setOnClickListener(new a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(HeaderVHOptimized headerVHOptimized, View view) {
        t tokenizedEvent;
        UWDeeplink deeplink;
        String str;
        HeaderVO headerVO = headerVHOptimized.item;
        if (headerVO != null && (deeplink = headerVO.getDeeplink()) != null) {
            ComposerReferences composerReferences = headerVHOptimized.ref;
            View view2 = headerVHOptimized.containerView;
            HeaderVO headerVO2 = headerVHOptimized.item;
            if (headerVO2 == null || (str = headerVO2.toString()) == null) {
                str = "";
            }
            view2.setTransitionName("transition_view".concat(str));
            Unit unit = Unit.f71690a;
            OpenNestedPageExtKt.navigate(deeplink, composerReferences, "HeaderVH", U.i(new Pair("transition_view", view2)));
        }
        HeaderVO headerVO3 = headerVHOptimized.item;
        if (headerVO3 == null || (tokenizedEvent = headerVO3.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(headerVHOptimized.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    private final void bindImage(Boolean disclosure) {
        ViewExtKt.showOrGone(this.headerDisclosureIv, disclosure);
    }

    private final void bindStub() {
        ViewExtKt.gone(this.headerTitleTv);
        ViewExtKt.gone(this.headerSubtitleTv);
        ViewExtKt.gone(this.headerDisclosureIv);
        this.containerView.setBackground(null);
        this.containerView.setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
        this.itemView.getLayoutParams().height = ResourceExtKt.toPx(12);
    }

    private final void bindSubtitle(String subtitle) {
        TextViewExtKt.setTextOrGone(this.headerSubtitleTv, subtitle);
    }

    private final void bindTitle(String title) {
        TextViewExtKt.setTextOrGone(this.headerTitleTv, title);
    }

    private final AppCompatImageView createDisclosureIv() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(R$id.uWidgetHeaderDisclosureIv);
        appCompatImageView.setImageResource(R$drawable.ic_disclosure_gray);
        return appCompatImageView;
    }

    private final AppCompatTextView createSubtitleTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.uWidgetHeaderSubTitleTv);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M_Gray60);
        return appCompatTextView;
    }

    private final AppCompatTextView createTitleTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.uWidgetHeaderTitleTv);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Head_M);
        return appCompatTextView;
    }

    private final void setupDisclosureLayoutParams() {
        AppCompatImageView appCompatImageView = this.headerDisclosureIv;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = ResourceExtKt.toPx(16);
        ((ViewGroup.MarginLayoutParams) bVar).height = ResourceExtKt.toPx(16);
        bVar.setMarginEnd(ResourceExtKt.toPx(12));
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        bVar.f41636i = 0;
        bVar.f41598E = 1.0f;
        appCompatImageView.setLayoutParams(bVar);
    }

    private final void setupSubtitleLayoutParams() {
        AppCompatTextView appCompatTextView = this.headerSubtitleTv;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        bVar.f41616W = true;
        bVar.setMarginEnd(ResourceExtKt.toPx(8));
        bVar.setMarginStart(ResourceExtKt.toPx(16));
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(2);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ResourceExtKt.toPx(18);
        bVar.f41595B = ResourceExtKt.toPx(16);
        bVar.f41660x = ResourceExtKt.toPx(16);
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41657u = R$id.uWidgetHeaderDisclosureIv;
        bVar.f41638j = R$id.uWidgetHeaderTitleTv;
        bVar.f41598E = 0.0f;
        appCompatTextView.setLayoutParams(bVar);
    }

    private final void setupTitleLayoutParams() {
        AppCompatTextView appCompatTextView = this.headerTitleTv;
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
        bVar.f41640k = R$id.uWidgetHeaderSubTitleTv;
        bVar.f41657u = R$id.uWidgetHeaderDisclosureIv;
        bVar.f41604K = 2;
        bVar.setMarginEnd(ResourceExtKt.toPx(8));
        bVar.setMarginStart(ResourceExtKt.toPx(16));
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(20);
        bVar.f41595B = ResourceExtKt.toPx(16);
        bVar.f41662z = ResourceExtKt.toPx(18);
        bVar.f41598E = 0.0f;
        appCompatTextView.setLayoutParams(bVar);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        HeaderVO headerVO = this.item;
        if (headerVO == null || (tokenizedEvent = headerVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.info = info;
        if (Intrinsics.d(item.getType(), "stub")) {
            bindStub();
        } else {
            bind(item);
        }
    }

    private final void bind(HeaderVO item) {
        bindTitle(item.getTitle());
        bindSubtitle(item.getSubtitle());
        bindImage(item.getDisclosure());
        this.containerView.setBackground(getContext().getDrawable(ru.ozon.app.android.uikit.R$drawable.bg_white_ripple_blue));
        this.itemView.getLayoutParams().height = -2;
    }
}
