package ru.ozon.app.android.atoms.v3.holders.buttons;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.view.View;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolder;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.SmallIconButtonAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/buttons/WrappedIconButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "", "atomContext", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButtonStyle;", "style", "", "mapStyle", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButtonStyle;)I", "item", "", "onBind", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "accentTintColor$delegate", "LSc/j;", "getAccentTintColor", "()I", "accentTintColor", "cachedIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WrappedIconButtonHolder extends AtomV3<ButtonV3Atom.SmallIconButton, SmallIconButtonView> implements WrappedAtomHolder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: accentTintColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j accentTintColor;

    @NotNull
    private final StyleAppearance<SmallIconButtonView> appearance;
    private ButtonV3Atom.SmallIconButton cachedIconButton;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/buttons/WrappedIconButtonHolder$Companion;", "", "<init>", "()V", "IC_M_KEBAB", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.SmallIconButtonStyle.values().length];
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_SECONDARY_CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_CLEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_PRIMARY_FRESH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_DELETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_PARANDJA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_APPAREL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedIconButtonHolder(@NotNull SmallIconButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.appearance = StyleAppearance.INSTANCE.of(new SmallIconButtonAppearance());
        this.accentTintColor = k.a(n.NONE, new WrappedIconButtonHolder$accentTintColor$2(this));
        getContainerView().setOnClickListener(new View.OnClickListener() { // from class: am.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WrappedIconButtonHolder._init_$lambda$1(WrappedIconButtonHolder.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(WrappedIconButtonHolder wrappedIconButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.SmallIconButton smallIconButton = (ButtonV3Atom.SmallIconButton) wrappedIconButtonHolder.getData();
        AtomActionDTO action = smallIconButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, smallIconButton.getTrackingInfo())) == null) {
            return;
        }
        wrappedIconButtonHolder.handleAction(atomAction);
    }

    private final int getAccentTintColor() {
        return ((Number) this.accentTintColor.getValue()).intValue();
    }

    private final int mapStyle(ButtonV3Atom.SmallIconButtonStyle style) {
        int i11;
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                i11 = R$style.SmallIconButton_White;
                break;
            case 2:
                i11 = R$style.SmallIconButton_Primary;
                break;
            case 3:
                i11 = R$style.SmallIconButton_Secondary;
                break;
            case 4:
                i11 = R$style.SmallIconButton_Secondary_Confirmed;
                break;
            case 5:
                i11 = R$style.SmallIconButton_Transparent;
                break;
            case 6:
                i11 = R$style.SmallIconButton_Fresh;
                break;
            case 7:
                i11 = R$style.SmallIconButton_Delete;
                break;
            case 8:
                i11 = R$style.SmallIconButton_Parandja;
                break;
            case 9:
                i11 = R$style.SmallIconButton_Apparel;
                break;
            default:
                i11 = R$style.SmallIconButton_White;
                break;
        }
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf(i11))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.SmallIconButton item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((WrappedIconButtonHolder) item);
        Integer valueOf = item.getTintColor() != null ? Integer.valueOf(StyleParser.INSTANCE.parseColor(getContext(), item.getTintColor(), R$color.oz_semantic_text_primary)) : Intrinsics.d(item.getIcon(), "ic_m_kebab") ? Integer.valueOf(getAccentTintColor()) : null;
        SmallIconButtonView containerView = getContainerView();
        if (valueOf != null) {
            containerView.setTint(valueOf.intValue());
        } else {
            containerView.clearColorFilter();
        }
        ButtonV3Atom.SmallIconButton smallIconButton = this.cachedIconButton;
        if (!Intrinsics.d(smallIconButton != null ? smallIconButton.getIcon() : null, item.getIcon())) {
            AtomConfig.INSTANCE.getImageLoader().load(containerView, item.getIcon());
        }
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.cachedIconButton;
        if ((smallIconButton2 != null ? smallIconButton2.getTheme() : null) != item.getTheme()) {
            StyleAppearance<SmallIconButtonView> styleAppearance = this.appearance;
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            styleAppearance.read(context, mapStyle(item.getTheme()));
            this.appearance.apply(containerView);
        }
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
        this.cachedIconButton = ButtonV3Atom.SmallIconButton.copy$default(item, null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrappedIconButtonHolder(@NotNull Context context, String str) {
        this((SmallIconButtonView) q.f64554a.g(N.b(SmallIconButtonView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
