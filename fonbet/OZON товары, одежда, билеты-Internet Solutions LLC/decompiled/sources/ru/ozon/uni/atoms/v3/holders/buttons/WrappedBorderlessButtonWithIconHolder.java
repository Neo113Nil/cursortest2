package ru.ozon.uni.atoms.v3.holders.buttons;

import EJ.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/WrappedBorderlessButtonWithIconHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonWithIconView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonWithIconView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "iconSize", "", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onBind", "", "item", "mapTheme", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon$SmallBorderlessButtonWithIconTheme;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WrappedBorderlessButtonWithIconHolder extends AtomV3<ButtonV3Atom.SmallBorderlessButtonWithIcon, SmallBorderlessButtonWithIconView> implements WrappedAtomHolder {

    @NotNull
    private final StyleAppearance<SmallBorderlessButtonWithIconView> appearance;
    private final int iconSize;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.SmallBorderlessButtonWithIcon.SmallBorderlessButtonWithIconTheme.values().length];
            try {
                iArr[ButtonV3Atom.SmallBorderlessButtonWithIcon.SmallBorderlessButtonWithIconTheme.THEME_TYPE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.SmallBorderlessButtonWithIcon.SmallBorderlessButtonWithIconTheme.THEME_TYPE_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedBorderlessButtonWithIconHolder(@NotNull SmallBorderlessButtonWithIconView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.iconSize = ResourceExtKt.toPx(16, getContext());
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        getContainerView().setOnClickListener(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$0(WrappedBorderlessButtonWithIconHolder wrappedBorderlessButtonWithIconHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = (ButtonV3Atom.SmallBorderlessButtonWithIcon) wrappedBorderlessButtonWithIconHolder.getData();
        AtomActionDTO action = smallBorderlessButtonWithIcon.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, smallBorderlessButtonWithIcon.getTrackingInfo())) == null) {
            return;
        }
        wrappedBorderlessButtonWithIconHolder.handleAction(atomAction);
    }

    private final int mapTheme(ButtonV3Atom.SmallBorderlessButtonWithIcon.SmallBorderlessButtonWithIconTheme theme) {
        int i11 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return R$style.SmallBorderlessButtonWithIcon_Bold;
        }
        return R$style.SmallBorderlessButtonWithIcon;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.SmallBorderlessButtonWithIcon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((WrappedBorderlessButtonWithIconHolder) item);
        SmallBorderlessButtonWithIconView containerView = getContainerView();
        containerView.setText(item.getText());
        StyleAppearance<SmallBorderlessButtonWithIconView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, mapTheme(item.getTheme()));
        this.appearance.apply(containerView);
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
        ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String icon = item.getIcon();
        int i11 = this.iconSize;
        imageLoader.load(context2, icon, i11, i11, new WrappedBorderlessButtonWithIconHolder$onBind$1$1(containerView));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        containerView.setTint(styleParser.parseColor(context3, item.getTintColor(), StyleParser.OzColor.OZ_SEMANTIC_TEXT_ACTION));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrappedBorderlessButtonWithIconHolder(@NotNull Context context, String str) {
        this(new SmallBorderlessButtonWithIconView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
