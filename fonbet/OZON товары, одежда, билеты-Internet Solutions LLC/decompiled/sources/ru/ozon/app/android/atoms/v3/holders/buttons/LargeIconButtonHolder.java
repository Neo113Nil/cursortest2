package ru.ozon.app.android.atoms.v3.holders.buttons;

import AD.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.LargeIconButtonAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/buttons/LargeIconButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "isSemanticBackground", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;Ljava/lang/String;Z)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;Z)V", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onBind", "", "item", "mapStyle", "", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeIconButtonHolder extends AtomV3<ButtonV3Atom.LargeIconButton, LargeIconButtonView> implements WrappedAtomHolder {

    @NotNull
    private final StyleAppearance<LargeIconButtonView> appearance;
    private final boolean isSemanticBackground;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.LargeIconButtonStyle.values().length];
            try {
                iArr[ButtonV3Atom.LargeIconButtonStyle.STYLE_TYPE_WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.LargeIconButtonStyle.STYLE_TYPE_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.LargeIconButtonStyle.STYLE_TYPE_SECONDARY_WHITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.LargeIconButtonStyle.STYLE_TYPE_PRIMARY_FRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LargeIconButtonHolder(LargeIconButtonView largeIconButtonView, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(largeIconButtonView, str, (i11 & 4) != 0 ? true : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(LargeIconButtonHolder largeIconButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.LargeIconButton largeIconButton = (ButtonV3Atom.LargeIconButton) largeIconButtonHolder.getData();
        AtomActionDTO action = largeIconButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, largeIconButton.getTrackingInfo())) == null) {
            return;
        }
        largeIconButtonHolder.handleAction(atomAction);
    }

    private final int mapStyle(ButtonV3Atom.LargeIconButtonStyle style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? R$style.LargeIconButton_White : R$style.LargeIconButton_Fresh : R$style.LargeIconButton_Tertiary : R$style.LargeIconButton_Grey : this.isSemanticBackground ? R$style.LargeIconButton_SemanticWhite : R$style.LargeIconButton_White))).intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeIconButtonHolder(@NotNull LargeIconButtonView view, String str, boolean z11) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.isSemanticBackground = z11;
        this.appearance = StyleAppearance.INSTANCE.of(new LargeIconButtonAppearance());
        getContainerView().setOnClickListener(new b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.LargeIconButton item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((LargeIconButtonHolder) item);
        if (item.getTintColor() != null) {
            getContainerView().setTint(StyleParser.INSTANCE.parseColor(getContext(), item.getTintColor(), R$color.oz_black));
        } else {
            getContainerView().clearTint();
        }
        AtomConfig.INSTANCE.getImageLoader().load(getContainerView(), item.getIcon());
        LargeIconButtonView containerView = getContainerView();
        StyleAppearance<LargeIconButtonView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, mapStyle(item.getTheme()));
        this.appearance.apply(containerView);
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
    }

    public /* synthetic */ LargeIconButtonHolder(Context context, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? true : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeIconButtonHolder(@NotNull Context context, String str, boolean z11) {
        this(new LargeIconButtonView(context, null, 0, 6, null), str, z11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
