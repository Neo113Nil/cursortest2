package ru.ozon.app.android.atoms.v3.holders.multilineBadge;

import Ez.ViewOnClickListenerC2978b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.app.android.uikit.view.atoms.multilineBadge.MultilineBadgeView;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J!\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/multilineBadge/MultilineBadgeHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/badge/MultilineBadge;", "Lru/ozon/app/android/uikit/view/atoms/multilineBadge/MultilineBadgeView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/multilineBadge/MultilineBadgeView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "minimumBadgeHeight", "", "onBind", "", "item", "setTestId", "testId", "loadIcon", "icon", "tintColor", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getMinHeight", "theme", "Lru/ozon/app/android/atoms/data/badge/MultilineBadge$ThemeType;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MultilineBadgeHolder extends AtomV3<MultilineBadge, MultilineBadgeView> implements WrappedAtomHolder {
    private final int minimumBadgeHeight;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MultilineBadge.ThemeType.values().length];
            try {
                iArr[MultilineBadge.ThemeType.THEME_TYPE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultilineBadgeHolder(@NotNull MultilineBadgeView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.minimumBadgeHeight = ResourceExtKt.toPx(48);
        getContainerView().setOnClickListener(new ViewOnClickListenerC2978b(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(MultilineBadgeHolder multilineBadgeHolder, View view) {
        AtomAction atomAction;
        MultilineBadge multilineBadge = (MultilineBadge) multilineBadgeHolder.getData();
        AtomActionDTO action = multilineBadge.getAction();
        if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, multilineBadge.getTrackingInfo())) != null) {
            multilineBadgeHolder.handleAction(atomAction);
            return;
        }
        Object parent = multilineBadgeHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    private final int getMinHeight(MultilineBadge.ThemeType theme) {
        if (WhenMappings.$EnumSwitchMapping$0[theme.ordinal()] == 1) {
            return this.minimumBadgeHeight;
        }
        return 0;
    }

    private final void loadIcon(String icon, Integer tintColor) {
        ImageView multilineBadgeImage = getContainerView().getMultilineBadgeImage();
        if (icon == null) {
            ViewExtKt.gone(multilineBadgeImage);
            return;
        }
        ViewExtKt.show(multilineBadgeImage);
        AtomConfig.INSTANCE.getImageLoader().load(multilineBadgeImage, icon);
        getContainerView().setImageTint(tintColor);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void setTestId(@NotNull String testId) {
        Intrinsics.checkNotNullParameter(testId, "testId");
        getContainerView().setContentDescription(testId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull MultilineBadge item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((MultilineBadgeHolder) item);
        MultilineBadgeView containerView = getContainerView();
        containerView.setText(item.getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(item.getTextStyle());
        containerView.setTextStyle(parseTextStyle != null ? parseTextStyle.intValue() : R$style.TextStyle_Caption);
        MultilineBadge.ThemeType theme = item.getTheme();
        if (theme == null) {
            theme = MultilineBadge.ThemeType.THEME_TYPE_DEFAULT;
        }
        containerView.setMinHeightContainer(getMinHeight(theme));
        Boolean isFullWidth = item.isFullWidth();
        containerView.setFullWidth(isFullWidth != null ? isFullWidth.booleanValue() : false);
        containerView.setMaxLines(item.getMaxLines());
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            containerView.setBackgroundColor(parseColor.intValue());
        } else {
            containerView.setDefaultBackground();
        }
        loadIcon(item.getIcon(), styleParser.parseColor(getContext(), item.getIconTintColor()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultilineBadgeHolder(@NotNull Context context, String str) {
        this(new MultilineBadgeView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
