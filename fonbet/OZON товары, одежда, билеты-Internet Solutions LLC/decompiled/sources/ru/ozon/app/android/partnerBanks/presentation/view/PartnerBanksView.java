package ru.ozon.app.android.partnerBanks.presentation.view;

import Ez.ViewOnClickListenerC2979c;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ#\u0010\u001e\u001a\u00020\f2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)¨\u00061"}, d2 = {"Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "model", "", "bindOrGoneIcons", "(Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;)V", "", "checkTitleVisible", "()Z", "checkIconsVisible", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindOrGone", "(Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;Lkotlin/jvm/functions/Function1;)V", "bind", "onChange", "setOnChangeCroppedWidget", "(Lkotlin/jvm/functions/Function1;)V", "boundData", "Lru/ozon/app/android/partnerBanks/presentation/PartnerBanksVO;", "Lkotlin/jvm/functions/Function1;", "isCropped", "Z", "onChangeCroppedWidget", "LSc/j;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "LSc/j;", "", "Landroid/widget/ImageView;", "iconViews", "Ljava/util/List;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PartnerBanksView extends LinearLayout {

    @NotNull
    private final InterfaceC4008j<BadgeView> badgeView;
    private PartnerBanksVO boundData;

    @NotNull
    private final List<ImageView> iconViews;
    private boolean isCropped;
    private Function1<? super AtomAction, Unit> onAction;
    private Function1<? super Boolean, Unit> onChangeCroppedWidget;

    @NotNull
    private final InterfaceC4008j<TextAtomV2View> titleTav;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int MARGIN_BETWEEN_ITEMS = Dimens.INSTANCE.getDP_2();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView$Companion;", "", "<init>", "()V", "DEFAULT_LOCATOR", "", "MARGIN_BETWEEN_ITEMS", "", "getMARGIN_BETWEEN_ITEMS", "()I", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMARGIN_BETWEEN_ITEMS() {
            return PartnerBanksView.MARGIN_BETWEEN_ITEMS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PartnerBanksView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PartnerBanksView partnerBanksView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        PartnerBanksVO partnerBanksVO = partnerBanksView.boundData;
        if (partnerBanksVO == null || (action = partnerBanksVO.getAction()) == null || (function1 = partnerBanksView.onAction) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindOrGoneIcons(PartnerBanksVO model) {
        String image;
        Iterator<T> it = this.iconViews.iterator();
        while (it.hasNext()) {
            ViewExtKt.gone((ImageView) it.next());
        }
        List<PartnerBanksDTO.BankIcon> icons = model.getIcons();
        if (icons != null) {
            int px = UiExtKt.toPx(model.getIconsSize());
            int px2 = UiExtKt.toPx(model.getIconsPadding());
            int i11 = 0;
            for (Object obj : icons) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                PartnerBanksDTO.BankIcon bankIcon = (PartnerBanksDTO.BankIcon) obj;
                PartnerBanksDTO.CustomIconSize customIconSize = bankIcon.getCustomIconSize();
                int px3 = customIconSize != null ? UiExtKt.toPx(customIconSize.getWidth()) : px;
                int px4 = customIconSize != null ? UiExtKt.toPx(customIconSize.getHeigh()) : px;
                int i13 = customIconSize != null ? 0 : px2;
                ImageView imageView = (ImageView) C7714v.Q(i11, this.iconViews);
                if (imageView == null) {
                    imageView = new ImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px3, px4);
                    layoutParams.leftMargin = (i11 != 0 || checkTitleVisible()) ? MARGIN_BETWEEN_ITEMS : 0;
                    imageView.setLayoutParams(layoutParams);
                    int childCount = this.badgeView.isInitialized() ? getChildCount() - 1 : getChildCount();
                    this.iconViews.add(imageView);
                    addView(imageView, childCount);
                }
                ImageView imageView2 = imageView;
                ViewExtKt.show(imageView2);
                Context context = imageView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (!ThemeExtKt.isDarkThemeActive(context) || (image = bankIcon.getDarkImage()) == null) {
                    image = bankIcon.getImage();
                }
                ru.ozon.app.android.pdp.utils.ViewExtKt.loadIcon$default(imageView2, image, null, null, 6, null);
                imageView2.setPadding(i13, i13, i13, i13);
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                int i14 = layoutParams2.height;
                int i15 = layoutParams2.width;
                layoutParams2.width = px3;
                layoutParams2.height = px4;
                if (i14 != px4 || i15 != px3) {
                    imageView2.setLayoutParams(layoutParams2);
                }
                TestInfo testInfo = bankIcon.getTestInfo();
                imageView2.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
                if (i11 == 0) {
                    ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams != null) {
                        int i16 = marginLayoutParams.leftMargin;
                        int i17 = marginLayoutParams.topMargin;
                        int i18 = marginLayoutParams.rightMargin;
                        int i19 = marginLayoutParams.bottomMargin;
                        int i21 = model.getTitle() != null ? MARGIN_BETWEEN_ITEMS : 0;
                        marginLayoutParams.leftMargin = i21;
                        if (i16 == i21) {
                            ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                            if (i17 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                                ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                                if (i18 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                                    ViewGroup.LayoutParams layoutParams6 = imageView2.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                                    if (i19 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                                    }
                                }
                            }
                        }
                        imageView2.setLayoutParams(marginLayoutParams);
                    }
                }
                i11 = i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIconsVisible() {
        return !this.iconViews.isEmpty() && this.iconViews.get(0).getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkTitleVisible() {
        return this.titleTav.isInitialized() && this.titleTav.getValue().getVisibility() == 0;
    }

    public final void bind(@NotNull PartnerBanksVO model, Function1<? super AtomAction, Unit> onAction) {
        String automatizationId;
        Intrinsics.checkNotNullParameter(model, "model");
        TestInfo testInfo = model.getTestInfo();
        if (testInfo != null && (automatizationId = testInfo.getAutomatizationId()) != null) {
            setContentDescription(automatizationId);
        }
        if (model.getTitle() != null || this.titleTav.isInitialized()) {
            TextHolderKt.bindOrGone(this.titleTav.getValue(), model.getTitle(), onAction);
        }
        bindOrGoneIcons(model);
        if (model.getBadge() != null || this.badgeView.isInitialized()) {
            BadgeView value = this.badgeView.getValue();
            BadgeHolderKt.bindOrGone(value, model.getBadge(), onAction);
            ViewGroup.LayoutParams layoutParams = value.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            int i15 = (model.getTitle() != null || CollectionsExtKt.isNotNullOrEmpty(model.getIcons())) ? MARGIN_BETWEEN_ITEMS : 0;
            marginLayoutParams.leftMargin = i15;
            if (i11 == i15) {
                ViewGroup.LayoutParams layoutParams2 = value.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = value.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = value.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                            return;
                        }
                    }
                }
            }
            value.setLayoutParams(marginLayoutParams);
        }
    }

    public final void bindOrGone(PartnerBanksVO model, Function1<? super AtomAction, Unit> onAction) {
        this.boundData = model;
        this.onAction = onAction;
        if (model == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            bind(model, onAction);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Function1<? super Boolean, Unit> function1 = this.onChangeCroppedWidget;
        if (function1 != null) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            if (getMeasuredWidth() != size) {
                measuredWidth = getMeasuredWidth();
            }
            boolean z11 = measuredWidth < size ? false : measuredWidth > size ? true : this.isCropped;
            if (this.isCropped != z11) {
                function1.invoke(Boolean.valueOf(z11));
                this.isCropped = z11;
            }
        }
    }

    public final void setOnChangeCroppedWidget(Function1<? super Boolean, Unit> onChange) {
        this.onChangeCroppedWidget = onChange;
    }

    public /* synthetic */ PartnerBanksView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerBanksView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleTav = DelegatesKt.lazyUnsafe(new PartnerBanksView$titleTav$1(context, this));
        this.iconViews = new ArrayList();
        this.badgeView = DelegatesKt.lazyUnsafe(new PartnerBanksView$badgeView$1(context, this));
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setContentDescription("PartnersBankView");
        setOnClickListener(new ViewOnClickListenerC2979c(this, 3));
    }
}
