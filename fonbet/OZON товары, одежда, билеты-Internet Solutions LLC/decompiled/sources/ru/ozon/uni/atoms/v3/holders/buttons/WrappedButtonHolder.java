package ru.ozon.uni.atoms.v3.holders.buttons;

import DQ.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/WrappedButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onRecycle", "", "onBind", "item", "mapStyle", "", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton$SmallButtonStyle;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WrappedButtonHolder extends AtomV3<ButtonV3Atom.SmallButton, SmallButtonView> implements WrappedAtomHolder {

    @NotNull
    private final StyleAppearance<SmallButtonView> appearance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.SmallButton.SmallButtonStyle.values().length];
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_PRIMARY_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_PRIMARY_GREEN_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_SECONDARY_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_SECONDARY_WHITE_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_SECONDARY_CONFIRMED_SMALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_DELETE_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_DELETE_WHITE_SMALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_PRIMARY_EXPRESS_SMALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_PRIMARY_FRESH_SMALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_SECONDARY_SMALL_FRESH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ButtonV3Atom.SmallButton.SmallButtonStyle.STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedButtonHolder(@NotNull SmallButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
    }

    private final int mapStyle(ButtonV3Atom.SmallButton.SmallButtonStyle style) {
        int i11;
        boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(getContext());
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Primary;
                    break;
                } else {
                    i11 = R$style.SmallButton_Primary_Round;
                    break;
                }
            case 2:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Primary;
                    break;
                } else {
                    i11 = R$style.SmallButton_Primary_Round;
                    break;
                }
            case 3:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Primary_Green;
                    break;
                } else {
                    i11 = R$style.SmallButton_Primary_Green_Round;
                    break;
                }
            case 4:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Secondary;
                    break;
                } else {
                    i11 = R$style.SmallButton_Secondary_Round;
                    break;
                }
            case 5:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Tertiary;
                    break;
                } else {
                    i11 = R$style.SmallButton_Tertiary_Round;
                    break;
                }
            case 6:
                i11 = R$style.SmallButton_Secondary_Confirmed;
                break;
            case 7:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Danger;
                    break;
                } else {
                    i11 = R$style.SmallButton_Danger_Round;
                    break;
                }
            case 8:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Important;
                    break;
                } else {
                    i11 = R$style.SmallButton_Important_Round;
                    break;
                }
            case 9:
                i11 = R$style.SmallButton_Primary_Express;
                break;
            case 10:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Primary_Fresh;
                    break;
                } else {
                    i11 = R$style.SmallButton_Primary_Fresh_Round;
                    break;
                }
            case 11:
                i11 = R$style.SmallButton_Secondary_Fresh;
                break;
            case 12:
                i11 = R$style.SmallButton_Tertiary_Fresh;
                break;
            default:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButton_Primary;
                    break;
                } else {
                    i11 = R$style.SmallButton_Primary_Round;
                    break;
                }
        }
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf(i11))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onBind$lambda$2$lambda$1(WrappedButtonHolder wrappedButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.SmallButton smallButton = (ButtonV3Atom.SmallButton) wrappedButtonHolder.getData();
        AtomActionDTO action = smallButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, smallButton.getTrackingInfo())) == null) {
            return;
        }
        wrappedButtonHolder.handleAction(atomAction);
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        getContainerView().setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.SmallButton item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((WrappedButtonHolder) item);
        ButtonV3Atom.SmallButton.SmallButtonStyle theme = item.getTheme();
        if (theme == null) {
            theme = item.getStyle();
        }
        int mapStyle = mapStyle(theme);
        SmallButtonView containerView = getContainerView();
        containerView.setOnClickListener(new b(this, 4));
        containerView.setText(item.getText());
        StyleAppearance<SmallButtonView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, mapStyle);
        this.appearance.apply(containerView);
        if (item.getAction() != null) {
            ViewExtKt.enable(getContainerView());
        } else {
            ViewExtKt.disable(getContainerView());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrappedButtonHolder(@NotNull Context context, String str) {
        this((SmallButtonView) q.f64554a.g(N.b(SmallButtonView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
