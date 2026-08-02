package ru.ozon.uni.atoms.v3.holders.badge;

import DS.a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.URLUtil;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeStyleType;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.badge.ImagePosition;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.extensions.view.BadgeViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;
import ru.ozon.uni.core.R$drawable;

@InterfaceC3999a
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0014\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00062\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020%2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020\u0017*\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u0004\u0018\u00010,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020\u000e*\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b5\u0010\u0010J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010?\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/badge/BadgeHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "", "atomContext", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "item", "", "loadImage", "(Lru/ozon/uni/atoms/data/badge/Badge;)V", "loadAccessoryImage", "Lru/ozon/uni/atoms/data/badge/Badge$StyleType;", "style", "", "checkIsAccessoryImageTheme", "(Lru/ozon/uni/atoms/data/badge/Badge$StyleType;)Z", "Lru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;", "iconPosition", "isLarge", "addImagePlaceholderToBadge", "(Lru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;Z)V", "image", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "onDrawableLoaded", "loadImageAsDrawable", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeStyleType;", "mapTextStyle", "(Lru/ozon/uni/atoms/data/badge/Badge$StyleType;)Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeStyleType;", "Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;", "mapTheme", "(Lru/ozon/uni/atoms/data/badge/Badge$StyleType;)Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView$BadgeTheme;", "Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;", "mapIconPosition", "(Lru/ozon/uni/atoms/data/badge/Badge$IconPosition;)Lru/ozon/uni/android/uikit/view/atoms/badge/ImagePosition;", "Lru/ozon/uni/atoms/data/badge/Badge$GradientColor;", "", "mapToGradientColors", "(Lru/ozon/uni/atoms/data/badge/Badge$GradientColor;)[I", "gradientColors", "color", "trySetGradientBackground", "(Lru/ozon/uni/android/uikit/view/atoms/badge/BadgeView;[ILjava/lang/String;)V", "onRecycle", "()V", "onBind", "testId", "setTestId", "(Ljava/lang/String;)V", "lastImageUrl", "Ljava/lang/String;", "placeholderDrawable$delegate", "LSc/j;", "getPlaceholderDrawable", "()Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeHolder extends AtomV3<Badge, BadgeView> implements WrappedAtomHolder {
    private String lastImageUrl;

    /* renamed from: placeholderDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j placeholderDrawable;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Badge.StyleType.values().length];
            try {
                iArr[Badge.StyleType.STYLE_TYPE_DISCOUNT_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_DISCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_PREMIUM_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_PREMIUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_INVALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_LARGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_XSMALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Badge.IconPosition.values().length];
            try {
                iArr2[Badge.IconPosition.ICON_POSITION_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Badge.IconPosition.ICON_POSITION_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Badge.IconPosition.ICON_POSITION_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeHolder(@NotNull BadgeView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.placeholderDrawable = k.a(n.NONE, BadgeHolder$placeholderDrawable$2.INSTANCE);
    }

    private final void addImagePlaceholderToBadge(ImagePosition iconPosition, boolean isLarge) {
        getContainerView().setImageDrawable(getPlaceholderDrawable(), iconPosition, isLarge);
    }

    private final boolean checkIsAccessoryImageTheme(Badge.StyleType style) {
        if (style == null) {
            style = Badge.StyleType.STYLE_TYPE_SMALL;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private final Drawable getPlaceholderDrawable() {
        return (Drawable) this.placeholderDrawable.getValue();
    }

    private final void loadAccessoryImage(Badge item) {
        if (checkIsAccessoryImageTheme(item.getTheme())) {
            Badge.Accessory accessory = item.getAccessory();
            if ((accessory != null ? accessory.getIcon() : null) != null) {
                String icon = item.getAccessory().getIcon();
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                String iconTintColor = item.getAccessory().getIconTintColor();
                if (iconTintColor == null) {
                    iconTintColor = item.getTintColor();
                }
                loadImageAsDrawable(icon, new BadgeHolder$loadAccessoryImage$1(this, styleParser.parseColor(context, iconTintColor, BadgeUtilsKt.getDefaultTintColorId(item))));
                return;
            }
        }
        getContainerView().setAccessoryDrawable(null, null);
    }

    private final void loadImage(Badge item) {
        String image = item.getImage();
        ImagePosition mapIconPosition = mapIconPosition(item.getIconPosition());
        boolean isLargeTheme = BadgeUtilsKt.isLargeTheme(item);
        loadAccessoryImage(item);
        if (image == null && BadgeUtilsKt.isPremiumTheme(item)) {
            getContainerView().setImageResource(R$drawable.ic_s_status_points_compact, mapIconPosition, isLargeTheme);
            this.lastImageUrl = null;
        } else if (!Intrinsics.d(this.lastImageUrl, image) || image == null) {
            this.lastImageUrl = image;
            if (image == null || image.length() == 0) {
                getContainerView().setImageDrawable(null, mapIconPosition, isLargeTheme);
            } else {
                addImagePlaceholderToBadge(mapIconPosition, isLargeTheme);
                loadImageAsDrawable(image, new BadgeHolder$loadImage$1(this, mapIconPosition, isLargeTheme));
            }
        }
    }

    private final void loadImageAsDrawable(String image, Function1<? super Drawable, Unit> onDrawableLoaded) {
        if (URLUtil.isNetworkUrl(image)) {
            ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
            Context context = getContext();
            BadgeView.Companion companion = BadgeView.INSTANCE;
            imageLoader.load(context, image, companion.getICON_SIZE_DEFAULT_PX(), companion.getICON_SIZE_DEFAULT_PX(), onDrawableLoaded);
            return;
        }
        Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(getContext(), image);
        if (loadDrawableByName != null) {
            BadgeView.Companion companion2 = BadgeView.INSTANCE;
            loadDrawableByName.setBounds(0, 0, companion2.getICON_SIZE_DEFAULT_PX(), companion2.getICON_SIZE_DEFAULT_PX());
        } else {
            loadDrawableByName = null;
        }
        onDrawableLoaded.invoke(loadDrawableByName);
    }

    private final ImagePosition mapIconPosition(Badge.IconPosition iconPosition) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[iconPosition.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                return ImagePosition.RIGHT;
            }
            throw new o();
        }
        return ImagePosition.LEFT;
    }

    private final BadgeStyleType mapTextStyle(Badge.StyleType style) {
        BadgeStyleType badgeStyleType;
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_DISCOUNT_SMALL;
                break;
            case 2:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_DISCOUNT;
                break;
            case 3:
            case 7:
            case 8:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_BASE;
                break;
            case 4:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_SMALL;
                break;
            case 5:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_PREMIUM_SMALL;
                break;
            case 6:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_PREMIUM;
                break;
            case 9:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_XSMALL;
                break;
            default:
                badgeStyleType = BadgeStyleType.STYLE_TYPE_DISCOUNT_SMALL;
                break;
        }
        return (BadgeStyleType) ExtensionsKt.getExhaustive(badgeStyleType);
    }

    private final BadgeView.BadgeTheme mapTheme(Badge.StyleType style) {
        BadgeView.BadgeTheme badgeTheme;
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
            case 4:
            case 5:
                badgeTheme = BadgeView.BadgeTheme.SMALL;
                break;
            case 2:
            case 3:
            case 6:
            case 7:
                badgeTheme = BadgeView.BadgeTheme.MEDIUM;
                break;
            case 8:
                badgeTheme = BadgeView.BadgeTheme.LARGE;
                break;
            case 9:
                badgeTheme = BadgeView.BadgeTheme.XSMALL;
                break;
            default:
                badgeTheme = BadgeView.BadgeTheme.SMALL;
                break;
        }
        return (BadgeView.BadgeTheme) ExtensionsKt.getExhaustive(badgeTheme);
    }

    private final int[] mapToGradientColors(Badge.GradientColor gradientColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), gradientColor.getStartColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            Integer parseColor2 = styleParser.parseColor(getContext(), gradientColor.getEndColor());
            if (parseColor2 != null) {
                return new int[]{intValue, parseColor2.intValue()};
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onBind$lambda$3$lambda$1(BadgeHolder badgeHolder, View view) {
        AtomAction atomAction;
        Badge badge = (Badge) badgeHolder.getData();
        AtomActionDTO action = badge.getAction();
        if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, badge.getTrackingInfo())) != null) {
            badgeHolder.handleAction(atomAction);
            return;
        }
        Object parent = badgeHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final void trySetGradientBackground(BadgeView badgeView, int[] iArr, String str) {
        if (iArr != null) {
            badgeView.setBadgeGradientBackground(iArr);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = badgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str);
        if (parseColor != null) {
            badgeView.setBackgroundColor(parseColor.intValue());
        }
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        getContainerView().setOnClickListener(null);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        getContainerView().setContentDescription(testId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Badge item) {
        String image;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((BadgeHolder) item);
        BadgeView containerView = getContainerView();
        containerView.setOnClickListener(new a(this, 8));
        containerView.setTextStyle(mapTextStyle(item.getTheme()));
        containerView.setTheme(mapTheme(item.getTheme()));
        containerView.setText(item.getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeViewExtKt.setTintColor(containerView, styleParser.parseColor(context, item.getTintColor(), BadgeUtilsKt.getDefaultTintColorId(item)), item.getImage());
        loadImage(item);
        String iconTintColor = item.getIconTintColor();
        if (iconTintColor != null && (image = item.getImage()) != null && !ExtensionsKt.isUrl(image)) {
            Context context2 = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, iconTintColor);
            if (parseColor != null) {
                containerView.setImageColorFilter(Integer.valueOf(parseColor.intValue()));
            }
        }
        if (item.getGradientBackgroundColor() != null) {
            trySetGradientBackground(containerView, mapToGradientColors(item.getGradientBackgroundColor()), BadgeUtilsKt.getBackgroundColor(item));
            return;
        }
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context3, BadgeUtilsKt.getBackgroundColor(item));
        if (parseColor2 != null) {
            containerView.setBackgroundColor(parseColor2.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeHolder(@NotNull Context context, String str) {
        this((BadgeView) q.f64554a.g(N.b(BadgeView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
