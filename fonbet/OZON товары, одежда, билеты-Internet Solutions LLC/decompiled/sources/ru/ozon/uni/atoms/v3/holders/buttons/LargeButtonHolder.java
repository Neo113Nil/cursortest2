package ru.ozon.uni.atoms.v3.holders.buttons;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.LargeButtonAppearance;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/LargeButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "iconSize", "", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onBind", "", "item", "mapStyle", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LargeButtonHolder extends AtomV3<ButtonV3Atom.LargeButton, LargeButtonView> {

    @NotNull
    private final StyleAppearance<LargeButtonView> appearance;
    private final int iconSize;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.LargeButton.LargeButtonStyle.values().length];
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_WHITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_DELETE_WHITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_GREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_EXPRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY_FRESH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_FRESH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY_WHITE_FRESH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeButtonHolder(@NotNull LargeButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.iconSize = ResourceExtKt.toPx(24, getContext());
        this.appearance = StyleAppearance.INSTANCE.of(new LargeButtonAppearance());
        getContainerView().setOnClickListener(new View.OnClickListener() { // from class: Vk0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LargeButtonHolder._init_$lambda$1(LargeButtonHolder.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(LargeButtonHolder largeButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.LargeButton largeButton = (ButtonV3Atom.LargeButton) largeButtonHolder.getData();
        AtomActionDTO action = largeButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, largeButton.getTrackingInfo())) == null) {
            return;
        }
        largeButtonHolder.handleAction(atomAction);
    }

    private final int mapStyle(ButtonV3Atom.LargeButton.LargeButtonStyle style) {
        int i11;
        boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(getContext());
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Primary;
                    break;
                } else {
                    i11 = R$style.LargeButton_Primary_Round;
                    break;
                }
            case 2:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Primary;
                    break;
                } else {
                    i11 = R$style.LargeButton_Primary_Round;
                    break;
                }
            case 3:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Secondary;
                    break;
                } else {
                    i11 = R$style.LargeButton_Secondary_Round;
                    break;
                }
            case 4:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Tertiary;
                    break;
                } else {
                    i11 = R$style.LargeButton_Tertiary_Round;
                    break;
                }
            case 5:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Secondary_Confirmed;
                    break;
                } else {
                    i11 = R$style.LargeButton_Secondary_Confirmed_Round;
                    break;
                }
            case 6:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Danger;
                    break;
                } else {
                    i11 = R$style.LargeButton_Danger_Round;
                    break;
                }
            case 7:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Important;
                    break;
                } else {
                    i11 = R$style.LargeButton_Important_Round;
                    break;
                }
            case 8:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Primary_Green;
                    break;
                } else {
                    i11 = R$style.LargeButton_Primary_Green_Round;
                    break;
                }
            case 9:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Primary_Express;
                    break;
                } else {
                    i11 = R$style.LargeButton_Primary_Express_Round;
                    break;
                }
            case 10:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Primary_Fresh;
                    break;
                } else {
                    i11 = R$style.LargeButton_Primary_Fresh_Round;
                    break;
                }
            case 11:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Secondary_Fresh;
                    break;
                } else {
                    i11 = R$style.LargeButton_Secondary_Fresh_Round;
                    break;
                }
            case 12:
                i11 = R$style.LargeButton_Tertiary_Fresh;
                break;
            default:
                if (!roundCornersFlag) {
                    i11 = R$style.LargeButton_Primary;
                    break;
                } else {
                    i11 = R$style.LargeButton_Primary_Round;
                    break;
                }
        }
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf(i11))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.LargeButton item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((LargeButtonHolder) item);
        LargeButtonView containerView = getContainerView();
        StyleAppearance<LargeButtonView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3Atom.LargeButton.LargeButtonStyle theme = item.getTheme();
        if (theme == null) {
            theme = item.getStyle();
        }
        styleAppearance.read(context, mapStyle(theme));
        this.appearance.apply(containerView);
        containerView.setText(item.getText());
        containerView.setSubText(item.getSubtext());
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
        if (item.getIcon() == null) {
            containerView.setImageDrawable(null);
            return;
        }
        ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String icon = item.getIcon();
        int i11 = this.iconSize;
        imageLoader.load(context2, icon, i11, i11, new LargeButtonHolder$onBind$1$1(containerView));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeButtonHolder(@NotNull Context context, String str) {
        this(new LargeButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
