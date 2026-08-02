package ru.ozon.app.android.pdp.widgets.navBar.core;

import WZ.x;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.app.android.pdp.widgets.navBar.data.NavBarDTO;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/core/NavBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "<init>", "()V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "toFavoriteProductMolecule", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV4;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "toSmallIconButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/navBar/data/NavBarDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarMapper implements Function2<NavBarDTO, d, List<? extends NavBarVO>>, NavBarUtils {
    private final FavoriteProductMolecule toFavoriteProductMolecule(FavoriteProductMoleculeV4 favoriteProductMoleculeV4) {
        return new FavoriteProductMolecule(null, favoriteProductMoleculeV4.getSku(), favoriteProductMoleculeV4.isFavorite(), toSmallIconButton(favoriteProductMoleculeV4.getFavoriteButton()), toSmallIconButton(favoriteProductMoleculeV4.getUnfavoriteButton()), favoriteProductMoleculeV4.getAddToListAction(), null, 65, null);
    }

    private final ButtonV3Atom.SmallIconButton toSmallIconButton(IconButtonV3DTO iconButtonV3DTO) {
        AtomActionDTO atomActionDTO;
        TestInfo testInfo;
        String icon = iconButtonV3DTO.getIcon();
        CommonControlSettings common = iconButtonV3DTO.getCommon();
        if (common != null) {
            atomActionDTO = common.getAction();
            testInfo = null;
        } else {
            atomActionDTO = null;
            testInfo = null;
        }
        String iconColor = iconButtonV3DTO.getIconColor();
        CommonControlSettings common2 = iconButtonV3DTO.getCommon();
        TestInfo testInfo2 = common2 != null ? common2.getTestInfo() : testInfo;
        CommonControlSettings common3 = iconButtonV3DTO.getCommon();
        return new ButtonV3Atom.SmallIconButton(icon, atomActionDTO, iconColor, null, null, testInfo2, common3 != null ? common3.getTrackingInfo() : testInfo, 24, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils
    @NotNull
    public ValueAnimator alphaAnimation(boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> function1) {
        return NavBarUtils.DefaultImpls.alphaAnimation(this, z11, i11, i12, j11, z12, function1);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants
    public long getAnimationDuration() {
        return NavBarUtils.DefaultImpls.getAnimationDuration(this);
    }

    public float getButtonCornerRadius() {
        return NavBarUtils.DefaultImpls.getButtonCornerRadius(this);
    }

    @NotNull
    public String getInvisibleButtonBackground() {
        return NavBarUtils.DefaultImpls.getInvisibleButtonBackground(this);
    }

    @NotNull
    public String getInvisibleIconTintColor() {
        return NavBarUtils.DefaultImpls.getInvisibleIconTintColor(this);
    }

    @NotNull
    public String getNavBarBackground() {
        return NavBarUtils.DefaultImpls.getNavBarBackground(this);
    }

    public int getNavbarBottomCornerRadius() {
        return NavBarUtils.DefaultImpls.getNavbarBottomCornerRadius(this);
    }

    @NotNull
    public String getVisibleIconTintColor() {
        return NavBarUtils.DefaultImpls.getVisibleIconTintColor(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d1  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<NavBarVO> invoke(@NotNull NavBarDTO state, @NotNull d widgetInfo) {
        float buttonCornerRadius;
        Integer cornerRadius;
        int intValue;
        NavBarDTO.ButtonsConfig buttonsConfig;
        NavBarDTO.ButtonsConfig buttonsConfig2;
        NavBarDTO.ButtonsConfig buttonsConfig3;
        List<Object> rightButtons;
        List list;
        String str;
        ArrayList arrayList;
        String backgroundColor;
        CornerRadius cornerRadiusToken;
        int navbarBottomCornerRadius;
        int intValue2;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        String str2;
        Object obj;
        NavBarVO.Button.NavBarButton navBarButton;
        NavBarVO.Button button;
        String str3;
        NavBarVO.CommonBgForIcon commonBgForIcon;
        AtomAction atomAction;
        NavBarVO.CommonBgForIcon commonBgForIcon2;
        NavBarDTO.Colors colors;
        NavBarDTO.Colors colors2;
        NavBarDTO.Colors colors3;
        CornerRadius cornerRadiusToken2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        NavBarDTO.ButtonsConfig buttonsConfig4 = state.getButtonsConfig();
        if (buttonsConfig4 == null || (cornerRadiusToken2 = buttonsConfig4.getCornerRadiusToken()) == null) {
            NavBarDTO.ButtonsConfig buttonsConfig5 = state.getButtonsConfig();
            if (buttonsConfig5 == null || (cornerRadius = buttonsConfig5.getCornerRadius()) == null) {
                buttonCornerRadius = getButtonCornerRadius();
                float f7 = buttonCornerRadius;
                buttonsConfig = state.getButtonsConfig();
                if (buttonsConfig != null || (colors3 = buttonsConfig.getColors()) == null || (r0 = colors3.getButtonBackgroundColor()) == null) {
                    String invisibleButtonBackground = getInvisibleButtonBackground();
                }
                String str4 = invisibleButtonBackground;
                buttonsConfig2 = state.getButtonsConfig();
                if (buttonsConfig2 != null || (colors2 = buttonsConfig2.getColors()) == null || (r0 = colors2.getIconTintColor()) == null) {
                    String invisibleIconTintColor = getInvisibleIconTintColor();
                }
                String str5 = invisibleIconTintColor;
                buttonsConfig3 = state.getButtonsConfig();
                if (buttonsConfig3 != null || (colors = buttonsConfig3.getColors()) == null || (r0 = colors.getScrolledIconTintColor()) == null) {
                    String visibleIconTintColor = getVisibleIconTintColor();
                }
                String str6 = visibleIconTintColor;
                String icon = state.getBackButton().getIcon();
                CommonControlSettings common = state.getBackButton().getCommon();
                NavBarVO.Button.NavBarButton navBarButton2 = new NavBarVO.Button.NavBarButton(icon, f7, str4, str5, str6, null, common == null ? common.toAtomAction() : null);
                rightButtons = state.getRightButtons();
                if (rightButtons != null) {
                    List<Object> list2 = rightButtons;
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    List<Object> list3 = list2;
                    if (list3 != null) {
                        list = C7714v.K0(list3, 3);
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i11 = 0;
                            for (Object obj2 : list) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    C7714v.O0();
                                    throw null;
                                }
                                boolean z11 = i11 == 0;
                                boolean z12 = i11 == C7714v.P(list);
                                if (obj2 instanceof NavBarDTO.NavBarButton) {
                                    NavBarDTO.NavBarButton navBarButton3 = (NavBarDTO.NavBarButton) obj2;
                                    String icon2 = navBarButton3.getIcon();
                                    if (state.isCommonBgForIcons()) {
                                        atomAction = null;
                                        commonBgForIcon2 = new NavBarVO.CommonBgForIcon(z11, z12);
                                    } else {
                                        atomAction = null;
                                        commonBgForIcon2 = null;
                                    }
                                    CommonControlSettings common2 = navBarButton3.getCommon();
                                    button = new NavBarVO.Button.NavBarButton(icon2, f7, str4, str5, str6, commonBgForIcon2, common2 != null ? common2.toAtomAction() : atomAction);
                                    navBarButton = navBarButton2;
                                } else if (obj2 instanceof FavoriteProductMoleculeV4) {
                                    FavoriteProductMolecule favoriteProductMolecule = toFavoriteProductMolecule((FavoriteProductMoleculeV4) obj2);
                                    if (state.isCommonBgForIcons()) {
                                        navBarButton = navBarButton2;
                                        NavBarVO.CommonBgForIcon commonBgForIcon3 = new NavBarVO.CommonBgForIcon(z11, z12);
                                        str3 = str6;
                                        commonBgForIcon = commonBgForIcon3;
                                    } else {
                                        navBarButton = navBarButton2;
                                        str3 = str6;
                                        commonBgForIcon = null;
                                    }
                                    button = new NavBarVO.Button.FavoriteMoleculeButtonWrapper(favoriteProductMolecule, f7, str4, str5, commonBgForIcon, str3);
                                    str6 = str3;
                                } else {
                                    navBarButton = navBarButton2;
                                    button = null;
                                }
                                if (button != null) {
                                    arrayList2.add(button);
                                }
                                i11 = i12;
                                navBarButton2 = navBarButton;
                            }
                            str = null;
                            arrayList = arrayList2;
                        } else {
                            str = null;
                            arrayList = null;
                        }
                        NavBarVO.Button.NavBarButton navBarButton4 = navBarButton2;
                        backgroundColor = state.getBackgroundColor();
                        if (backgroundColor == null) {
                            backgroundColor = getNavBarBackground();
                        }
                        String str7 = backgroundColor;
                        boolean isAlwaysSolid = state.isAlwaysSolid();
                        float opacityChangeLevel = state.getOpacityChangeLevel() / 100.0f;
                        cornerRadiusToken = state.getCornerRadiusToken();
                        if (cornerRadiusToken != null) {
                            intValue2 = cornerRadiusToken.getPx();
                        } else {
                            Integer cornerRadius2 = state.getCornerRadius();
                            if (cornerRadius2 == null) {
                                navbarBottomCornerRadius = getNavbarBottomCornerRadius();
                                int i13 = navbarBottomCornerRadius;
                                trackingInfo = state.getTrackingInfo();
                                if (trackingInfo == null) {
                                    str2 = str;
                                    obj = x.b(trackingInfo, Long.valueOf(widgetId), str2);
                                } else {
                                    str2 = str;
                                    obj = str2;
                                }
                                Map<String, TokenizedTrackingInfo> subwidgetTrackingInfo = state.getSubwidgetTrackingInfo();
                                return C7714v.a0(new NavBarVO(widgetId, navBarButton4, arrayList, isAlwaysSolid, opacityChangeLevel, i13, str7, obj, subwidgetTrackingInfo == null ? x.b(subwidgetTrackingInfo, Long.valueOf(widgetId), str2) : str2));
                            }
                            intValue2 = cornerRadius2.intValue();
                        }
                        navbarBottomCornerRadius = UiExtKt.toPx(intValue2);
                        int i132 = navbarBottomCornerRadius;
                        trackingInfo = state.getTrackingInfo();
                        if (trackingInfo == null) {
                        }
                        Map<String, TokenizedTrackingInfo> subwidgetTrackingInfo2 = state.getSubwidgetTrackingInfo();
                        return C7714v.a0(new NavBarVO(widgetId, navBarButton4, arrayList, isAlwaysSolid, opacityChangeLevel, i132, str7, obj, subwidgetTrackingInfo2 == null ? x.b(subwidgetTrackingInfo2, Long.valueOf(widgetId), str2) : str2));
                    }
                }
                list = null;
                if (list != null) {
                }
                NavBarVO.Button.NavBarButton navBarButton42 = navBarButton2;
                backgroundColor = state.getBackgroundColor();
                if (backgroundColor == null) {
                }
                String str72 = backgroundColor;
                boolean isAlwaysSolid2 = state.isAlwaysSolid();
                float opacityChangeLevel2 = state.getOpacityChangeLevel() / 100.0f;
                cornerRadiusToken = state.getCornerRadiusToken();
                if (cornerRadiusToken != null) {
                }
                navbarBottomCornerRadius = UiExtKt.toPx(intValue2);
                int i1322 = navbarBottomCornerRadius;
                trackingInfo = state.getTrackingInfo();
                if (trackingInfo == null) {
                }
                Map<String, TokenizedTrackingInfo> subwidgetTrackingInfo22 = state.getSubwidgetTrackingInfo();
                return C7714v.a0(new NavBarVO(widgetId, navBarButton42, arrayList, isAlwaysSolid2, opacityChangeLevel2, i1322, str72, obj, subwidgetTrackingInfo22 == null ? x.b(subwidgetTrackingInfo22, Long.valueOf(widgetId), str2) : str2));
            }
            intValue = cornerRadius.intValue();
        } else {
            intValue = cornerRadiusToken2.getPx();
        }
        buttonCornerRadius = UiExtKt.toPxF(intValue);
        float f72 = buttonCornerRadius;
        buttonsConfig = state.getButtonsConfig();
        if (buttonsConfig != null) {
        }
        String invisibleButtonBackground2 = getInvisibleButtonBackground();
        String str42 = invisibleButtonBackground2;
        buttonsConfig2 = state.getButtonsConfig();
        if (buttonsConfig2 != null) {
        }
        String invisibleIconTintColor2 = getInvisibleIconTintColor();
        String str52 = invisibleIconTintColor2;
        buttonsConfig3 = state.getButtonsConfig();
        if (buttonsConfig3 != null) {
        }
        String visibleIconTintColor2 = getVisibleIconTintColor();
        String str62 = visibleIconTintColor2;
        String icon3 = state.getBackButton().getIcon();
        CommonControlSettings common3 = state.getBackButton().getCommon();
        NavBarVO.Button.NavBarButton navBarButton22 = new NavBarVO.Button.NavBarButton(icon3, f72, str42, str52, str62, null, common3 == null ? common3.toAtomAction() : null);
        rightButtons = state.getRightButtons();
        if (rightButtons != null) {
        }
        list = null;
        if (list != null) {
        }
        NavBarVO.Button.NavBarButton navBarButton422 = navBarButton22;
        backgroundColor = state.getBackgroundColor();
        if (backgroundColor == null) {
        }
        String str722 = backgroundColor;
        boolean isAlwaysSolid22 = state.isAlwaysSolid();
        float opacityChangeLevel22 = state.getOpacityChangeLevel() / 100.0f;
        cornerRadiusToken = state.getCornerRadiusToken();
        if (cornerRadiusToken != null) {
        }
        navbarBottomCornerRadius = UiExtKt.toPx(intValue2);
        int i13222 = navbarBottomCornerRadius;
        trackingInfo = state.getTrackingInfo();
        if (trackingInfo == null) {
        }
        Map<String, TokenizedTrackingInfo> subwidgetTrackingInfo222 = state.getSubwidgetTrackingInfo();
        return C7714v.a0(new NavBarVO(widgetId, navBarButton422, arrayList, isAlwaysSolid22, opacityChangeLevel22, i13222, str722, obj, subwidgetTrackingInfo222 == null ? x.b(subwidgetTrackingInfo222, Long.valueOf(widgetId), str2) : str2));
    }
}
