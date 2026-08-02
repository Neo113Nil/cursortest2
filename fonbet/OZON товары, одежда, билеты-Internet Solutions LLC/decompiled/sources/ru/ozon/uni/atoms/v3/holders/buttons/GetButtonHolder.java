package ru.ozon.uni.atoms.v3.holders.buttons;

import Ar.c;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.GetButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/GetButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/GetButtonView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/GetButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onBind", "", "item", "mapStyle", "", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton$Theme;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetButtonHolder extends AtomV3<ButtonV3Atom.GetButton, GetButtonView> implements WrappedAtomHolder {

    @NotNull
    private final StyleAppearance<GetButtonView> appearance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.GetButton.Theme.values().length];
            try {
                iArr[ButtonV3Atom.GetButton.Theme.STYLE_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.GetButton.Theme.STYLE_TYPE_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.GetButton.Theme.STYLE_TYPE_WHITE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.GetButton.Theme.STYLE_TYPE_BLUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3Atom.GetButton.Theme.STYLE_TYPE_GREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3Atom.GetButton.Theme.STYLE_TYPE_JOINT_PURCHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetButtonHolder(@NotNull GetButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        getContainerView().setOnClickListener(new c(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(GetButtonHolder getButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.GetButton getButton = (ButtonV3Atom.GetButton) getButtonHolder.getData();
        AtomActionDTO action = getButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, getButton.getTrackingInfo())) == null) {
            return;
        }
        getButtonHolder.handleAction(atomAction);
    }

    private final int mapStyle(ButtonV3Atom.GetButton.Theme style) {
        int i11;
        boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(getContext());
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                if (!roundCornersFlag) {
                    i11 = R$style.GetButton_White;
                    break;
                } else {
                    i11 = R$style.GetButton_White_Round;
                    break;
                }
            case 2:
                if (!roundCornersFlag) {
                    i11 = R$style.GetButton_White;
                    break;
                } else {
                    i11 = R$style.GetButton_White_Round;
                    break;
                }
            case 3:
                if (!roundCornersFlag) {
                    i11 = R$style.GetButton_White_2;
                    break;
                } else {
                    i11 = R$style.GetButton_White_2_Round;
                    break;
                }
            case 4:
                if (!roundCornersFlag) {
                    i11 = R$style.GetButton_Blue;
                    break;
                } else {
                    i11 = R$style.GetButton_Blue_Round;
                    break;
                }
            case 5:
                if (!roundCornersFlag) {
                    i11 = R$style.GetButton_Green;
                    break;
                } else {
                    i11 = R$style.GetButton_Green_Round;
                    break;
                }
            case 6:
                if (!roundCornersFlag) {
                    i11 = R$style.GetButton_JointPurchase;
                    break;
                } else {
                    i11 = R$style.GetButton_JointPurchase_Round;
                    break;
                }
            default:
                if (!roundCornersFlag) {
                    i11 = R$style.GetButton_White;
                    break;
                } else {
                    i11 = R$style.GetButton_White_Round;
                    break;
                }
        }
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf(i11))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.GetButton item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((GetButtonHolder) item);
        GetButtonView containerView = getContainerView();
        containerView.setText(item.getText());
        StyleAppearance<GetButtonView> styleAppearance = this.appearance;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetButtonHolder(@NotNull Context context, String str) {
        this(new GetButtonView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
