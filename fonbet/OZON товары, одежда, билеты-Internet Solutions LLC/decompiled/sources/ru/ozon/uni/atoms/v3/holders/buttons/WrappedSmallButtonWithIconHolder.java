package ru.ozon.uni.atoms.v3.holders.buttons;

import CX.a;
import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.SmallButtonWithIconAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonWithIconView;
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
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/WrappedSmallButtonWithIconHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonWithIconView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonWithIconView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "iconSize", "", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onBind", "", "item", "mapStyle", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;", "selected", "", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;Ljava/lang/Boolean;)I", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WrappedSmallButtonWithIconHolder extends AtomV3<ButtonV3Atom.SmallButtonWithIcon, SmallButtonWithIconView> implements WrappedAtomHolder {

    @NotNull
    private final StyleAppearance<SmallButtonWithIconView> appearance;
    private final int iconSize;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.values().length];
            try {
                iArr[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.STYLE_TYPE_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.STYLE_TYPE_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.STYLE_TYPE_SECONDARY_WHITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.STYLE_TYPE_SECONDARY_DELETE_WHITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.STYLE_TYPE_SECONDARY_SELECTED_WHITE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.STYLE_TYPE_SECONDARY_DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle.STYLE_TYPE_INVALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedSmallButtonWithIconHolder(@NotNull SmallButtonWithIconView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.iconSize = ResourceExtKt.toPx(16, getContext());
        this.appearance = StyleAppearance.INSTANCE.of(new SmallButtonWithIconAppearance());
        getContainerView().setOnClickListener(new a(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(WrappedSmallButtonWithIconHolder wrappedSmallButtonWithIconHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon = (ButtonV3Atom.SmallButtonWithIcon) wrappedSmallButtonWithIconHolder.getData();
        AtomActionDTO action = smallButtonWithIcon.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, smallButtonWithIcon.getTrackingInfo())) == null) {
            return;
        }
        wrappedSmallButtonWithIconHolder.handleAction(atomAction);
    }

    private final int mapStyle(ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle style, Boolean selected) {
        Integer valueOf;
        int i11;
        boolean z11 = selected != null && selected.equals(Boolean.TRUE);
        boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(getContext());
        switch (WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                if (!roundCornersFlag) {
                    valueOf = z11 ? Integer.valueOf(R$style.SmallButtonWithIcon_Primary_Selected) : null;
                    if (valueOf == null) {
                        i11 = R$style.SmallButtonWithIcon_Primary;
                        break;
                    } else {
                        i11 = valueOf.intValue();
                        break;
                    }
                } else {
                    valueOf = z11 ? Integer.valueOf(R$style.SmallButtonWithIcon_Primary_Selected_Round) : null;
                    if (valueOf == null) {
                        i11 = R$style.SmallButtonWithIcon_Primary_Round;
                        break;
                    } else {
                        i11 = valueOf.intValue();
                        break;
                    }
                }
            case 2:
                if (!roundCornersFlag) {
                    valueOf = z11 ? Integer.valueOf(R$style.SmallButtonWithIcon_SecondarySelected) : null;
                    if (valueOf == null) {
                        i11 = R$style.SmallButtonWithIcon_Secondary;
                        break;
                    } else {
                        i11 = valueOf.intValue();
                        break;
                    }
                } else {
                    valueOf = z11 ? Integer.valueOf(R$style.SmallButtonWithIcon_SecondarySelected_Round) : null;
                    if (valueOf == null) {
                        i11 = R$style.SmallButtonWithIcon_Secondary_Round;
                        break;
                    } else {
                        i11 = valueOf.intValue();
                        break;
                    }
                }
            case 3:
                if (!roundCornersFlag) {
                    valueOf = z11 ? Integer.valueOf(R$style.SmallButtonWithIcon_SecondarySelectedWhite) : null;
                    if (valueOf == null) {
                        i11 = R$style.SmallButtonWithIcon_SecondaryWhite;
                        break;
                    } else {
                        i11 = valueOf.intValue();
                        break;
                    }
                } else {
                    valueOf = z11 ? Integer.valueOf(R$style.SmallButtonWithIcon_SecondarySelectedWhite_Round) : null;
                    if (valueOf == null) {
                        i11 = R$style.SmallButtonWithIcon_SecondaryWhite_Round;
                        break;
                    } else {
                        i11 = valueOf.intValue();
                        break;
                    }
                }
            case 4:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButtonWithIcon_SecondaryDeleteWhite;
                    break;
                } else {
                    i11 = R$style.SmallButtonWithIcon_SecondaryDeleteWhite_Round;
                    break;
                }
            case 5:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButtonWithIcon_SecondarySelectedWhite;
                    break;
                } else {
                    i11 = R$style.SmallButtonWithIcon_SecondarySelectedWhite_Round;
                    break;
                }
            case 6:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButtonWithIcon_SecondaryDelete;
                    break;
                } else {
                    i11 = R$style.SmallButtonWithIcon_SecondaryDelete_Round;
                    break;
                }
            case 7:
                if (!roundCornersFlag) {
                    i11 = R$style.SmallButtonWithIcon_Primary;
                    break;
                } else {
                    i11 = R$style.SmallButtonWithIcon_Primary_Round;
                    break;
                }
            default:
                throw new o();
        }
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf(i11))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.SmallButtonWithIcon item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((WrappedSmallButtonWithIconHolder) item);
        SmallButtonWithIconView containerView = getContainerView();
        int mapStyle = mapStyle(item.getTheme(), item.isSelected());
        StyleAppearance<SmallButtonWithIconView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, mapStyle);
        this.appearance.apply(containerView);
        containerView.setText(item.getText());
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
        imageLoader.load(context2, icon, i11, i11, new WrappedSmallButtonWithIconHolder$onBind$1$1$1(containerView));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context3, item.getTintColor());
        if (parseColor != null) {
            containerView.setTintColor(parseColor.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrappedSmallButtonWithIconHolder(@NotNull Context context, String str) {
        this(new SmallButtonWithIconView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
