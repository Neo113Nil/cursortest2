package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import Sc.o;
import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.R$drawable;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0019\u001a\u00020\n*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "", "stateId", "currentIconName", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "toVI", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$IconSelector;", "", "widgetId", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$IconSelector;Ljava/lang/Long;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "mapIconName", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$IconSelector;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "", "mapToResourceId", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;)I", "mapToActivityAlias", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;)Ljava/lang/String;", "mapToIconEnum", "(Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "iconChooserVI", "", "isSelected", "selectOrDeselect", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;Z)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "currentSelectedItem", "updateSelectedState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;)Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconChooserMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconChooserVI.IconEnum.values().length];
            try {
                iArr[IconChooserVI.IconEnum.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconChooserVI.IconEnum.PREMIUM_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconChooserVI.IconEnum.PREMIUM_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconChooserVI.IconEnum.PREMIUM_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    public static final IconChooserVI.IconEnum mapIconName(@NotNull IconChooserDTO.IconSelector iconSelector) {
        Intrinsics.checkNotNullParameter(iconSelector, "<this>");
        String androidName = iconSelector.getAndroidName();
        int hashCode = androidName.hashCode();
        if (hashCode != 1001935141) {
            switch (hashCode) {
                case 1033929135:
                    if (androidName.equals("ic_launcher_premium_1")) {
                        return IconChooserVI.IconEnum.PREMIUM_1;
                    }
                    break;
                case 1033929136:
                    if (androidName.equals("ic_launcher_premium_2")) {
                        return IconChooserVI.IconEnum.PREMIUM_2;
                    }
                    break;
                case 1033929137:
                    if (androidName.equals("ic_launcher_premium_3")) {
                        return IconChooserVI.IconEnum.PREMIUM_3;
                    }
                    break;
            }
        } else if (androidName.equals("ic_launcher")) {
            return IconChooserVI.IconEnum.DEFAULT;
        }
        return IconChooserVI.IconEnum.DEFAULT;
    }

    @NotNull
    public static final String mapToActivityAlias(@NotNull IconChooserVI.IconEnum iconEnum) {
        Intrinsics.checkNotNullParameter(iconEnum, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[iconEnum.ordinal()];
        if (i11 == 1) {
            return "OzonTravelActivityDefault";
        }
        if (i11 == 2) {
            return "OzonTravelActivityPremium1";
        }
        if (i11 == 3) {
            return "OzonTravelActivityPremium2";
        }
        if (i11 == 4) {
            return "OzonTravelActivityPremium3";
        }
        throw new o();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    public static final IconChooserVI.IconEnum mapToIconEnum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int hashCode = str.hashCode();
        if (hashCode != -365401426) {
            switch (hashCode) {
                case -368904723:
                    if (str.equals("OzonTravelActivityPremium1")) {
                        return IconChooserVI.IconEnum.PREMIUM_1;
                    }
                    break;
                case -368904722:
                    if (str.equals("OzonTravelActivityPremium2")) {
                        return IconChooserVI.IconEnum.PREMIUM_2;
                    }
                    break;
                case -368904721:
                    if (str.equals("OzonTravelActivityPremium3")) {
                        return IconChooserVI.IconEnum.PREMIUM_3;
                    }
                    break;
            }
        } else if (str.equals("OzonTravelActivityDefault")) {
            return IconChooserVI.IconEnum.DEFAULT;
        }
        return IconChooserVI.IconEnum.DEFAULT;
    }

    public static final int mapToResourceId(@NotNull IconChooserVI.IconEnum iconEnum) {
        Intrinsics.checkNotNullParameter(iconEnum, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[iconEnum.ordinal()];
        if (i11 == 1) {
            return R$drawable.image_ic_main;
        }
        if (i11 == 2) {
            return R$drawable.image_ic_premium_1;
        }
        if (i11 == 3) {
            return R$drawable.image_ic_premium_2;
        }
        if (i11 == 4) {
            return R$drawable.image_ic_premium_3;
        }
        throw new o();
    }

    @NotNull
    public static final IconChooserVI.IconSelectorVI selectOrDeselect(@NotNull IconChooserVI.IconSelectorVI iconSelectorVI, @NotNull IconChooserVI iconChooserVI, boolean z11) {
        AspectDTO aspectDTO;
        Intrinsics.checkNotNullParameter(iconSelectorVI, "<this>");
        Intrinsics.checkNotNullParameter(iconChooserVI, "iconChooserVI");
        AspectDTO aspect = iconSelectorVI.getAspect();
        if (aspect != null) {
            aspectDTO = AspectDTO.copy$default(aspect, null, z11 ? AspectDTO.AspectState.SELECTED : AspectDTO.AspectState.ENABLED, null, null, null, 29, null);
        } else {
            aspectDTO = null;
        }
        return IconChooserVI.IconSelectorVI.copy$default(iconSelectorVI, TextDTO.copy$default(iconSelectorVI.getTitle(), null, null, null, null, null, null, null, z11 ? iconChooserVI.getSelectedStyle().getSelectedTypographyToken() : iconChooserVI.getEnabledStyle().getEnabledTypographyToken(), z11 ? iconChooserVI.getSelectedStyle().getSelectedTextColor() : iconChooserVI.getEnabledStyle().getEnabledTextColor(), null, null, null, null, false, null, null, null, null, null, 523903, null), aspectDTO, null, null, 12, null);
    }

    @NotNull
    public static final IconChooserVI toVI(@NotNull IconChooserDTO iconChooserDTO, @NotNull String stateId, @NotNull String currentIconName) {
        String str;
        String str2;
        String str3;
        TextDTO title;
        TextDTO title2;
        AspectDTO enabledAspect;
        AspectDTO.CustomStyle customStyle;
        Intrinsics.checkNotNullParameter(iconChooserDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(currentIconName, "currentIconName");
        long hashCode = stateId.hashCode();
        IconChooserDTO.IconSelector iconSelector = (IconChooserDTO.IconSelector) C7714v.M(iconChooserDTO.getIconSelectors());
        TextDTO title3 = iconChooserDTO.getTitle();
        List<IconChooserDTO.IconSelector> iconSelectors = iconChooserDTO.getIconSelectors();
        ArrayList arrayList = new ArrayList(C7714v.z(iconSelectors, 10));
        Iterator<T> it = iconSelectors.iterator();
        while (it.hasNext()) {
            arrayList.add(toVI((IconChooserDTO.IconSelector) it.next(), Long.valueOf(hashCode), currentIconName));
        }
        IconChooserDTO.SelectedStyle selectedStyle = iconChooserDTO.getSelectedStyle();
        if (iconSelector == null || (enabledAspect = iconSelector.getEnabledAspect()) == null || (customStyle = enabledAspect.getCustomStyle()) == null || (str = customStyle.getBorderColor()) == null) {
            str = "graphicNeutral";
        }
        if (iconSelector == null || (title2 = iconSelector.getTitle()) == null || (str2 = title2.getTextColor()) == null) {
            str2 = "textSecondary";
        }
        if (iconSelector == null || (title = iconSelector.getTitle()) == null || (str3 = title.getTypographyToken()) == null) {
            str3 = "tsCompact400Small";
        }
        IconChooserVI.EnabledStyle enabledStyle = new IconChooserVI.EnabledStyle(str, str3, str2);
        Map<String, TokenizedTrackingInfo> trackingInfo = iconChooserDTO.getTrackingInfo();
        return new IconChooserVI(hashCode, title3, arrayList, selectedStyle, enabledStyle, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }

    public static /* synthetic */ IconChooserVI toVI$default(IconChooserDTO iconChooserDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "ic_launcher";
        }
        return toVI(iconChooserDTO, str, str2);
    }

    @NotNull
    public static final IconChooserVI updateSelectedState(@NotNull IconChooserVI iconChooserVI, @NotNull IconChooserVI.IconEnum currentSelectedItem) {
        Intrinsics.checkNotNullParameter(iconChooserVI, "<this>");
        Intrinsics.checkNotNullParameter(currentSelectedItem, "currentSelectedItem");
        List<IconChooserVI.IconSelectorVI> iconSelectors = iconChooserVI.getIconSelectors();
        ArrayList arrayList = new ArrayList(C7714v.z(iconSelectors, 10));
        for (IconChooserVI.IconSelectorVI iconSelectorVI : iconSelectors) {
            arrayList.add(selectOrDeselect(iconSelectorVI, iconChooserVI, currentSelectedItem == iconSelectorVI.getAppIcon()));
        }
        return IconChooserVI.copy$default(iconChooserVI, 0L, null, arrayList, null, null, null, 59, null);
    }

    @NotNull
    public static final IconChooserVI.IconSelectorVI toVI(@NotNull IconChooserDTO.IconSelector iconSelector, Long l11, @NotNull String currentIconName) {
        AspectDTO aspectDTO;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(iconSelector, "<this>");
        Intrinsics.checkNotNullParameter(currentIconName, "currentIconName");
        boolean checkIconNameSame = IconChooserViewModelKt.checkIconNameSame(currentIconName, iconSelector.getAndroidName());
        TextDTO title = iconSelector.getTitle();
        IconChooserVI.IconEnum mapIconName = mapIconName(iconSelector);
        AspectDTO enabledAspect = iconSelector.getEnabledAspect();
        t tVar = null;
        if (enabledAspect != null) {
            aspectDTO = AspectDTO.copy$default(enabledAspect, null, checkIconNameSame ? AspectDTO.AspectState.SELECTED : AspectDTO.AspectState.ENABLED, null, null, null, 29, null);
        } else {
            aspectDTO = null;
        }
        AspectDTO enabledAspect2 = iconSelector.getEnabledAspect();
        if (enabledAspect2 != null && (common = enabledAspect2.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = x.b(trackingInfo, l11, null);
        }
        return new IconChooserVI.IconSelectorVI(title, aspectDTO, mapIconName, tVar);
    }
}
