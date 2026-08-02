package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation;

import Bi.b;
import D40.d;
import Kk.C3531a;
import Lx.a;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.domain.ProfileAvatarVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 J0\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00180'J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001aH\u0002J\u001c\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/ProfileAvatarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundView", "Landroid/widget/ImageView;", "avatarView", "Lru/ozon/uni/android/atom/icon/IconView;", "editView", "notificationView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "labelView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "loader", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "showProgress", "", "show", "", "addAvatarLocator", "locator", "", "setAvatar", "avatar", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "bind", "item", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/domain/ProfileAvatarVO;", "onChangeAvatar", "Lkotlin/Function0;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupLayout", "isInSettings", "bindBackground", "image", "color", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileAvatarView extends ConstraintLayout {

    @NotNull
    private final IconView avatarView;

    @NotNull
    private final ImageView backgroundView;

    @NotNull
    private final IconView editView;

    @NotNull
    private final IndicatorView labelView;

    @NotNull
    private final LoaderView loader;

    @NotNull
    private final IconButtonV3View notificationView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int heightInSettings = UiExtKt.toPx(164);
    private static final int heightInProfile = UiExtKt.toPx(230);
    private static final int horizontalMargin = UiExtKt.toPx(8);
    private static final int avatarBottomMargin = UiExtKt.toPx(16);
    private static final int titleBottomMargin = UiExtKt.toPx(20);
    private static final int labelMargin = UiExtKt.toPx(5);
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/ProfileAvatarView$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProfileAvatarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(String image, String color) {
        ImageViewExtKt.clearResource(this.backgroundView);
        this.backgroundView.setBackground(null);
        if (image != null) {
            ImageViewExtKt.load$default(this.backgroundView, image, C7714v.a0(ImageTransformation.CenterCrop.INSTANCE), null, null, null, false, null, 124, null);
            return;
        }
        ImageView imageView = this.backgroundView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setBackgroundColor(styleParser.parseColor(context, color, defaultBackgroundColor));
    }

    private final void setupLayout(boolean isInSettings) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = isInSettings ? heightInSettings : heightInProfile;
        setLayoutParams(layoutParams);
        IconView iconView = this.avatarView;
        ViewGroup.LayoutParams layoutParams2 = iconView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
        if (isInSettings) {
            bVar.f41636i = 0;
            bVar.f41642l = 0;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
        } else {
            bVar.f41636i = -1;
            bVar.f41640k = R$id.avatarProfileTitle;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = avatarBottomMargin;
        }
        iconView.setLayoutParams(bVar);
    }

    public final void addAvatarLocator(@NotNull String locator) {
        Intrinsics.checkNotNullParameter(locator, "locator");
        this.avatarView.setContentDescription(locator);
    }

    public final void bind(@NotNull ProfileAvatarVO item, @NotNull Function0<Unit> onChangeAvatar, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onChangeAvatar, "onChangeAvatar");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconHolderKt.bindOrGone$default(this.avatarView, item.getAvatar(), null, 2, null);
        this.avatarView.setForeground(item.getAvatar().getBackgroundImage() == null ? new ColorDrawable(getContext().getColor(UniColors.BG_APPAREL_SECONDARY.getResId())) : null);
        IconHolderKt.bindOrGone$default(this.editView, item.getEdit(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.notificationView, item.getNotification(), actionHandler);
        IndicatorHolderKt.bindOrGone(this.labelView, item.getLabel(), actionHandler);
        TextHolderKt.bindOrGone(this.titleView, item.getTitle(), actionHandler);
        this.avatarView.setOnClickListener(new a(onChangeAvatar, 0));
        this.editView.setOnClickListener(new BS.a(onChangeAvatar, 3));
        setupLayout(item.getIsInSettings());
        bindBackground(item.getBackgroundImage(), item.getBackgroundColor());
    }

    public final void setAvatar(@NotNull IconDTO avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        IconHolderKt.bindOrGone$default(this.avatarView, avatar, null, 2, null);
    }

    public final void showProgress(boolean show) {
        ViewExtKt.showOrGone(this.loader, Boolean.valueOf(show));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAvatarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.avatarProfileBackgroundImage);
        imageView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        addView(imageView);
        this.backgroundView = imageView;
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        IconView iconView = new IconView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.avatarProfilePicture, -2, -2);
        a11.f41628e = 0;
        a11.f41634h = 0;
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.avatarView = iconView;
        IconView iconView2 = new IconView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        ConstraintLayout.b a12 = C3531a.a(iconView2, R$id.avatarProfileEditIcon, -2, -2);
        int i14 = R$id.avatarProfilePicture;
        a12.f41634h = i14;
        a12.f41642l = i14;
        iconView2.setLayoutParams(a12);
        addView(iconView2);
        this.editView = iconView2;
        int i15 = 14;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i16 = 0;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, i13, i16, i15, defaultConstructorMarker2);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.avatarProfileNotificationsButton, -2, -2);
        c11.f41636i = R$id.avatarProfilePicture;
        c11.f41634h = 0;
        int i17 = horizontalMargin;
        ((ViewGroup.MarginLayoutParams) c11).rightMargin = i17;
        iconButtonV3View.setLayoutParams(c11);
        addView(iconButtonV3View);
        this.notificationView = iconButtonV3View;
        IndicatorView indicatorView = new IndicatorView(context, null, i13, i16, i15, defaultConstructorMarker2);
        indicatorView.setId(R$id.avatarProfileNotificationsIndicator);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int i18 = R$id.avatarProfileNotificationsButton;
        bVar.f41636i = i18;
        bVar.f41634h = i18;
        int i19 = labelMargin;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i19;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i19;
        indicatorView.setLayoutParams(bVar);
        addView(indicatorView);
        this.labelView = indicatorView;
        int i21 = 6;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, i13, i21, defaultConstructorMarker3);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.avatarProfileTitle, -2, -2);
        d11.f41628e = 0;
        d11.f41634h = 0;
        d11.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) d11).bottomMargin = titleBottomMargin;
        ((ViewGroup.MarginLayoutParams) d11).rightMargin = i17;
        ((ViewGroup.MarginLayoutParams) d11).leftMargin = i17;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        LoaderView loaderView = new LoaderView(context, null, i13, i21, defaultConstructorMarker3);
        loaderView.setId(R$id.avatarProfileLoader);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        int i22 = R$id.avatarProfilePicture;
        bVar2.f41636i = i22;
        bVar2.f41628e = i22;
        bVar2.f41634h = i22;
        bVar2.f41642l = i22;
        loaderView.setLayoutParams(bVar2);
        loaderView.setLoaderSize(LoaderSize.LOADER_400);
        loaderView.setColor(context.getColor(UniColors.GRAPHIC_FRESH.getResId()));
        loaderView.setVisibility(8);
        addView(loaderView);
        this.loader = loaderView;
    }
}
