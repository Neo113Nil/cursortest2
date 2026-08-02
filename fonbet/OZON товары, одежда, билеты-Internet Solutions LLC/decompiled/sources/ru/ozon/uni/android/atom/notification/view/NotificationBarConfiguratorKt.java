package ru.ozon.uni.android.atom.notification.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.notification.data.NotificationBarViewConfig;
import ru.ozon.uni.android.atom.notification.utils.MappersKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0005\u001a\u001b\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0005\u001a\u001b\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001e\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010\u001e\u001a\u00020\u0003*\u00020 2\u0006\u0010\u0011\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010!\u001a\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Lru/ozon/uni/android/atom/notification/view/NotificationBarView;", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig;", "config", "", "configure", "(Lru/ozon/uni/android/atom/notification/view/NotificationBarView;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig;)V", "setTitle", "setSubtitle", "Landroidx/appcompat/widget/AppCompatTextView;", "updateTextRightMargin", "(Landroidx/appcompat/widget/AppCompatTextView;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig;)V", "", "maxLines", "safeMaxLines", "(I)I", "setLeftContent", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon;", "icon", "setIcon", "(Lru/ozon/uni/android/atom/notification/view/NotificationBarView;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$LeftContent$Icon;)V", "setRightContent", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button;", "rightContent", "setupButton", "(Lru/ozon/uni/android/atom/notification/view/NotificationBarView;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button;)V", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon;", "setupIconButton", "(Lru/ozon/uni/android/atom/notification/view/NotificationBarView;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button", "setButtonStyle", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Button;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$RightContent$Icon;)V", "Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;", "", "toVerticalBias", "(Lru/ozon/uni/android/atom/notification/data/NotificationBarViewConfig$Alignment;)F", "dp8", "I", "dp16", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBarConfiguratorKt {
    private static final int dp8 = UiExtKt.toPx(8);
    private static final int dp16 = UiExtKt.toPx(16);

    public static final void configure(@NotNull NotificationBarView notificationBarView, @NotNull NotificationBarViewConfig config) {
        Intrinsics.checkNotNullParameter(notificationBarView, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        setTitle(notificationBarView, config);
        setSubtitle(notificationBarView, config);
        setLeftContent(notificationBarView, config);
        setRightContent(notificationBarView, config);
    }

    private static final int safeMaxLines(int i11) {
        if (i11 > 0) {
            return i11;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void setButtonStyle(ButtonV3View buttonV3View, NotificationBarViewConfig.RightContent.Button button) {
        Color solid;
        buttonV3View.setStyle(MappersKt.toButtonStyle(button.getStyleType()));
        if (button.getStyleType() == NotificationBarViewConfig.RightContent.ButtonStyle.CUSTOM) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(button.getBackgroundColor());
            if (gradientByToken != null) {
                Context context = buttonV3View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                solid = TokensExtKt.toGradient(gradientByToken, context);
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = buttonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, button.getBackgroundColor());
            solid = parseColor != null ? new Color.Solid(parseColor.intValue()) : null;
            if (solid != null) {
                buttonV3View.setBackColor(solid);
            }
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context3 = buttonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor2 = styleParser2.parseColor(context3, button.getDataBackgroundColor());
            if (parseColor2 != null) {
                buttonV3View.setDataBackColor(parseColor2.intValue());
            }
            Context context4 = buttonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Integer parseColor3 = styleParser2.parseColor(context4, button.getTitleColor());
            if (parseColor3 != null) {
                int intValue = parseColor3.intValue();
                buttonV3View.setTitleColor(intValue);
                buttonV3View.setDataTextColor(intValue);
                buttonV3View.setSubtitleColor(intValue);
            }
            Context context5 = buttonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            Integer parseColor4 = styleParser2.parseColor(context5, button.getDataTextColor());
            if (parseColor4 != null) {
                buttonV3View.setDataTextColor(parseColor4.intValue());
            }
            Context context6 = buttonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            Integer parseColor5 = styleParser2.parseColor(context6, button.getIconColor());
            if (parseColor5 != null) {
                buttonV3View.setIconColor(parseColor5.intValue());
            }
            Context context7 = buttonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            Integer parseColor6 = styleParser2.parseColor(context7, button.getSubtitleColor());
            if (parseColor6 != null) {
                buttonV3View.setSubtitleColor(parseColor6.intValue());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (r0 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void setIcon(NotificationBarView notificationBarView, NotificationBarViewConfig.LeftContent.Icon icon) {
        Color solid;
        IconView iconView$uni_release = notificationBarView.getIconView$uni_release();
        iconView$uni_release.setVisibility(0);
        iconView$uni_release.setSize(MappersKt.toIconSize(icon.getSize()));
        iconView$uni_release.setShape(MappersKt.toIconShape(icon.getShape()));
        iconView$uni_release.setHasParanja(false);
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(icon.getBackgroundColor());
        if (gradientByToken != null) {
            Context context = iconView$uni_release.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            solid = TokensExtKt.toGradient(gradientByToken, context);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = iconView$uni_release.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        solid = new Color.Solid(styleParser.parseColor(context2, icon.getBackgroundColor(), R$color.bg_primary));
        iconView$uni_release.setBackColor(solid);
        iconView$uni_release.setBackgroundImage(icon.getBackgroundImage());
        iconView$uni_release.setBackgroundFitType(MappersKt.toIconFitType(icon.getBackgroundImageFitType()));
        Context context3 = iconView$uni_release.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        iconView$uni_release.setGraphic(TokensExtKt.getIconResByToken(context3, icon.getIcon()));
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context4 = iconView$uni_release.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        iconView$uni_release.setGraphicColor(styleParser2.parseColor(context4, icon.getIconTintColor()));
    }

    private static final void setLeftContent(NotificationBarView notificationBarView, NotificationBarViewConfig notificationBarViewConfig) {
        NotificationBarViewConfig.LeftContent leftContent = notificationBarViewConfig.getLeftContent();
        if (leftContent == null) {
            ViewExtKt.gone(notificationBarView.getIconView$uni_release());
            return;
        }
        if (leftContent instanceof NotificationBarViewConfig.LeftContent.Icon) {
            NotificationBarViewConfig.LeftContent.Icon icon = (NotificationBarViewConfig.LeftContent.Icon) leftContent;
            setIcon(notificationBarView, icon);
            IconView iconView$uni_release = notificationBarView.getIconView$uni_release();
            ViewGroup.LayoutParams layoutParams = iconView$uni_release.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41599F = toVerticalBias(icon.getAlignment());
            iconView$uni_release.setLayoutParams(bVar);
        }
    }

    private static final void setRightContent(NotificationBarView notificationBarView, NotificationBarViewConfig notificationBarViewConfig) {
        NotificationBarViewConfig.RightContent rightContent = notificationBarViewConfig.getRightContent();
        if (rightContent == null) {
            ViewExtKt.gone(notificationBarView.getIconButtonView$uni_release());
            ViewExtKt.gone(notificationBarView.getButtonView$uni_release());
            return;
        }
        if (rightContent instanceof NotificationBarViewConfig.RightContent.Button) {
            ViewExtKt.gone(notificationBarView.getIconButtonView$uni_release());
            NotificationBarViewConfig.RightContent.Button button = (NotificationBarViewConfig.RightContent.Button) rightContent;
            setupButton(notificationBarView, button);
            AppCompatTextView titleTv = notificationBarView.getTitleTv();
            ViewGroup.LayoutParams layoutParams = titleTv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41657u = R$id.buttonView;
            titleTv.setLayoutParams(bVar);
            ButtonV3View buttonView$uni_release = notificationBarView.getButtonView$uni_release();
            ViewGroup.LayoutParams layoutParams2 = buttonView$uni_release.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f41599F = toVerticalBias(button.getAlignment());
            buttonView$uni_release.setLayoutParams(bVar2);
            return;
        }
        if (!(rightContent instanceof NotificationBarViewConfig.RightContent.Icon)) {
            if (rightContent instanceof NotificationBarViewConfig.RightContent.None) {
                ViewExtKt.gone(notificationBarView.getIconButtonView$uni_release());
                ViewExtKt.gone(notificationBarView.getButtonView$uni_release());
                return;
            }
            return;
        }
        ViewExtKt.gone(notificationBarView.getButtonView$uni_release());
        notificationBarView.setHasCloseBehavior(rightContent instanceof NotificationBarViewConfig.RightContent.Icon.Close);
        setupIconButton(notificationBarView, (NotificationBarViewConfig.RightContent.Icon) rightContent);
        AppCompatTextView titleTv2 = notificationBarView.getTitleTv();
        ViewGroup.LayoutParams layoutParams3 = titleTv2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.f41657u = R$id.iconButtonView;
        titleTv2.setLayoutParams(bVar3);
        IconButtonV3View iconButtonView$uni_release = notificationBarView.getIconButtonView$uni_release();
        ViewGroup.LayoutParams layoutParams4 = iconButtonView$uni_release.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
        bVar4.f41599F = toVerticalBias(rightContent.getAlignment());
        iconButtonView$uni_release.setLayoutParams(bVar4);
    }

    private static final void setSubtitle(NotificationBarView notificationBarView, NotificationBarViewConfig notificationBarViewConfig) {
        String subtitle = notificationBarViewConfig.getSubtitle();
        if (subtitle == null) {
            ViewExtKt.gone(notificationBarView.getSubtitleTv());
            return;
        }
        notificationBarView.getSubtitleTv().setText(subtitle);
        notificationBarView.getSubtitleTv().setMaxLines(safeMaxLines(notificationBarViewConfig.getSubtitleMaxLines()));
        updateTextRightMargin(notificationBarView.getSubtitleTv(), notificationBarViewConfig);
    }

    private static final void setTitle(NotificationBarView notificationBarView, NotificationBarViewConfig notificationBarViewConfig) {
        notificationBarView.getTitleTv().setText(notificationBarViewConfig.getTitle());
        notificationBarView.getTitleTv().setMaxLines(safeMaxLines(notificationBarViewConfig.getTitleMaxLines()));
        updateTextRightMargin(notificationBarView.getTitleTv(), notificationBarViewConfig);
        AppCompatTextView titleTv = notificationBarView.getTitleTv();
        ViewGroup.LayoutParams layoutParams = titleTv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41599F = notificationBarViewConfig.getSubtitle() != null ? 0.0f : 0.5f;
        titleTv.setLayoutParams(bVar);
    }

    private static final void setupButton(NotificationBarView notificationBarView, NotificationBarViewConfig.RightContent.Button button) {
        ButtonV3View buttonView$uni_release = notificationBarView.getButtonView$uni_release();
        Context context = buttonView$uni_release.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        buttonView$uni_release.setMaxWidth(UiExtKt.toPx(110, context));
        buttonView$uni_release.setVisibility(0);
        buttonView$uni_release.setSize(MappersKt.toButtonSize(button.getSize()));
        setButtonStyle(buttonView$uni_release, button);
        buttonView$uni_release.setHoverDisabled(button.getIsHoverDisabled());
        buttonView$uni_release.setTitle(button.getTitle());
        buttonView$uni_release.setDataText(button.getDataText());
        buttonView$uni_release.setIconResource(DrawableResource.INSTANCE.fromToken(button.getIcon()));
        buttonView$uni_release.setSubtitle(button.getSubtitle());
    }

    private static final void setupIconButton(NotificationBarView notificationBarView, NotificationBarViewConfig.RightContent.Icon icon) {
        IconButtonV3View iconButtonView$uni_release = notificationBarView.getIconButtonView$uni_release();
        iconButtonView$uni_release.setVisibility(0);
        iconButtonView$uni_release.setSize(MappersKt.toIconButtonSize(icon.getSize()));
        iconButtonView$uni_release.setHoverDisabled(icon.getIsHoverDisabled());
        setButtonStyle(iconButtonView$uni_release, icon);
        iconButtonView$uni_release.setIconDrawable(DrawableResource.INSTANCE.fromToken(icon.getIcon()));
    }

    private static final float toVerticalBias(NotificationBarViewConfig.Alignment alignment) {
        return alignment == NotificationBarViewConfig.Alignment.TOP ? 0.0f : 0.5f;
    }

    private static final void updateTextRightMargin(AppCompatTextView appCompatTextView, NotificationBarViewConfig notificationBarViewConfig) {
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = Intrinsics.d(notificationBarViewConfig.getRightContent(), NotificationBarViewConfig.RightContent.None.INSTANCE) ? dp16 : dp8;
        if (marginLayoutParams.getMarginEnd() != i11) {
            ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginEnd(i11);
            appCompatTextView.setLayoutParams(marginLayoutParams2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void setButtonStyle(IconButtonV3View iconButtonV3View, NotificationBarViewConfig.RightContent.Icon icon) {
        Color solid;
        iconButtonV3View.setStyle(MappersKt.toButtonStyle(icon.getStyleType()));
        if (icon.getStyleType() == NotificationBarViewConfig.RightContent.ButtonStyle.CUSTOM) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(icon.getBackgroundColor());
            if (gradientByToken != null) {
                Context context = iconButtonV3View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                solid = TokensExtKt.toGradient(gradientByToken, context);
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = iconButtonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, icon.getBackgroundColor());
            solid = parseColor != null ? new Color.Solid(parseColor.intValue()) : null;
            if (solid != null) {
                iconButtonV3View.setBackColor(solid);
            }
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context3 = iconButtonV3View.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor2 = styleParser2.parseColor(context3, icon.getIconColor());
            if (parseColor2 != null) {
                iconButtonV3View.setIconColor(parseColor2.intValue());
            }
        }
    }
}
