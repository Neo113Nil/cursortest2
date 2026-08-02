package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo;

import Ak.C2436a;
import D40.a;
import E00.b;
import G.g;
import Kk.C3532b;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0081\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ¦\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b+\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b/\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010.R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b\u0011\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b\u0018\u0010.R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020?\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010!\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010G\u001a\u0004\bL\u0010!\"\u0004\bM\u0010JR\"\u0010N\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010G\u001a\u0004\bO\u0010!\"\u0004\bP\u0010JR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006X"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LE00/b;", "", "id", "", "backgroundColor", "overlayColor", "", "forceWhiteStatusBar", "backgroundImage", "darkBackgroundImage", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "backIconVO", "isRounded", "disableRounding", "isStickyThirdLevel", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;", "spacings", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;", "showFullNavbarMode", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "teeth", "isSelectApp", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;ZZZLru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;Z)V", "copy", "(JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;ZZZLru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;Z)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "getOverlayColor", "Z", "getForceWhiteStatusBar", "()Z", "getBackgroundImage", "getDarkBackgroundImage", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "getBackIconVO", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "getDisableRounding", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;", "getSpacings", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;", "getShowFullNavbarMode", "()Lru/ozon/app/android/storefront/widgets/navbarv2/data/ShellNavBarDTO$ShowFullNavBarMode;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "getTeeth", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "", "Landroid/view/ViewGroup;", "floorContainers", "Ljava/util/Map;", "getFloorContainers", "()Ljava/util/Map;", "setFloorContainers", "(Ljava/util/Map;)V", "statusBarBottomMargin", "I", "getStatusBarBottomMargin", "setStatusBarBottomMargin", "(I)V", "firstFloorBottomMargin", "getFirstFloorBottomMargin", "setFirstFloorBottomMargin", "secondFloorBottomMargin", "getSecondFloorBottomMargin", "setSecondFloorBottomMargin", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/RichPromoSettings;", "richPromoSettings", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/RichPromoSettings;", "getRichPromoSettings", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/RichPromoSettings;", "setRichPromoSettings", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/RichPromoSettings;)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ShellNavBarVO implements c, b {

    @NotNull
    private final ShellNavBarBackButtonVO backIconVO;

    @NotNull
    private final String backgroundColor;
    private final String backgroundImage;
    private final String darkBackgroundImage;
    private final boolean disableRounding;
    private int firstFloorBottomMargin;
    private Map<String, ? extends ViewGroup> floorContainers;
    private final boolean forceWhiteStatusBar;
    private final long id;
    private final boolean isRounded;
    private final boolean isSelectApp;
    private final boolean isStickyThirdLevel;
    private final String overlayColor;

    @NotNull
    private RichPromoSettings richPromoSettings;
    private int secondFloorBottomMargin;
    private final ShellNavBarDTO.ShowFullNavBarMode showFullNavbarMode;

    @NotNull
    private final ShellNavBarSpacings spacings;
    private int statusBarBottomMargin;
    private final ShellNavBarTeethVO teeth;

    public ShellNavBarVO(long j11, @NotNull String backgroundColor, String str, boolean z11, String str2, String str3, @NotNull ShellNavBarBackButtonVO backIconVO, boolean z12, boolean z13, boolean z14, @NotNull ShellNavBarSpacings spacings, ShellNavBarDTO.ShowFullNavBarMode showFullNavBarMode, ShellNavBarTeethVO shellNavBarTeethVO, boolean z15) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backIconVO, "backIconVO");
        Intrinsics.checkNotNullParameter(spacings, "spacings");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.overlayColor = str;
        this.forceWhiteStatusBar = z11;
        this.backgroundImage = str2;
        this.darkBackgroundImage = str3;
        this.backIconVO = backIconVO;
        this.isRounded = z12;
        this.disableRounding = z13;
        this.isStickyThirdLevel = z14;
        this.spacings = spacings;
        this.showFullNavbarMode = showFullNavBarMode;
        this.teeth = shellNavBarTeethVO;
        this.isSelectApp = z15;
        this.statusBarBottomMargin = spacings.getStatusBarBottomSpacing();
        this.secondFloorBottomMargin = spacings.getLevel2BottomSpacing();
        this.richPromoSettings = new RichPromoSettings(false, false);
    }

    @NotNull
    public final ShellNavBarVO copy(long id2, @NotNull String backgroundColor, String overlayColor, boolean forceWhiteStatusBar, String backgroundImage, String darkBackgroundImage, @NotNull ShellNavBarBackButtonVO backIconVO, boolean isRounded, boolean disableRounding, boolean isStickyThirdLevel, @NotNull ShellNavBarSpacings spacings, ShellNavBarDTO.ShowFullNavBarMode showFullNavbarMode, ShellNavBarTeethVO teeth, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backIconVO, "backIconVO");
        Intrinsics.checkNotNullParameter(spacings, "spacings");
        return new ShellNavBarVO(id2, backgroundColor, overlayColor, forceWhiteStatusBar, backgroundImage, darkBackgroundImage, backIconVO, isRounded, disableRounding, isStickyThirdLevel, spacings, showFullNavbarMode, teeth, isSelectApp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShellNavBarVO)) {
            return false;
        }
        ShellNavBarVO shellNavBarVO = (ShellNavBarVO) other;
        return this.id == shellNavBarVO.id && Intrinsics.d(this.backgroundColor, shellNavBarVO.backgroundColor) && Intrinsics.d(this.overlayColor, shellNavBarVO.overlayColor) && this.forceWhiteStatusBar == shellNavBarVO.forceWhiteStatusBar && Intrinsics.d(this.backgroundImage, shellNavBarVO.backgroundImage) && Intrinsics.d(this.darkBackgroundImage, shellNavBarVO.darkBackgroundImage) && Intrinsics.d(this.backIconVO, shellNavBarVO.backIconVO) && this.isRounded == shellNavBarVO.isRounded && this.disableRounding == shellNavBarVO.disableRounding && this.isStickyThirdLevel == shellNavBarVO.isStickyThirdLevel && Intrinsics.d(this.spacings, shellNavBarVO.spacings) && this.showFullNavbarMode == shellNavBarVO.showFullNavbarMode && Intrinsics.d(this.teeth, shellNavBarVO.teeth) && this.isSelectApp == shellNavBarVO.isSelectApp;
    }

    @NotNull
    public final ShellNavBarBackButtonVO getBackIconVO() {
        return this.backIconVO;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getDarkBackgroundImage() {
        return this.darkBackgroundImage;
    }

    public final boolean getDisableRounding() {
        return this.disableRounding;
    }

    public final Map<String, ViewGroup> getFloorContainers() {
        return this.floorContainers;
    }

    public final boolean getForceWhiteStatusBar() {
        return this.forceWhiteStatusBar;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getOverlayColor() {
        return this.overlayColor;
    }

    @NotNull
    public final RichPromoSettings getRichPromoSettings() {
        return this.richPromoSettings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ShellNavBarDTO.ShowFullNavBarMode getShowFullNavbarMode() {
        return this.showFullNavbarMode;
    }

    @NotNull
    public final ShellNavBarSpacings getSpacings() {
        return this.spacings;
    }

    public final int getStatusBarBottomMargin() {
        return this.statusBarBottomMargin;
    }

    public final ShellNavBarTeethVO getTeeth() {
        return this.teeth;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor);
        String str = this.overlayColor;
        int a12 = C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.forceWhiteStatusBar);
        String str2 = this.backgroundImage;
        int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkBackgroundImage;
        int hashCode2 = (this.spacings.hashCode() + C3532b.a(C3532b.a(C3532b.a((this.backIconVO.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.isRounded), 31, this.disableRounding), 31, this.isStickyThirdLevel)) * 31;
        ShellNavBarDTO.ShowFullNavBarMode showFullNavBarMode = this.showFullNavbarMode;
        int hashCode3 = (hashCode2 + (showFullNavBarMode == null ? 0 : showFullNavBarMode.hashCode())) * 31;
        ShellNavBarTeethVO shellNavBarTeethVO = this.teeth;
        return Boolean.hashCode(this.isSelectApp) + ((hashCode3 + (shellNavBarTeethVO != null ? shellNavBarTeethVO.hashCode() : 0)) * 31);
    }

    /* renamed from: isRounded, reason: from getter */
    public final boolean getIsRounded() {
        return this.isRounded;
    }

    /* renamed from: isSelectApp, reason: from getter */
    public final boolean getIsSelectApp() {
        return this.isSelectApp;
    }

    /* renamed from: isStickyThirdLevel, reason: from getter */
    public final boolean getIsStickyThirdLevel() {
        return this.isStickyThirdLevel;
    }

    public final void setFirstFloorBottomMargin(int i11) {
        this.firstFloorBottomMargin = i11;
    }

    public final void setFloorContainers(Map<String, ? extends ViewGroup> map) {
        this.floorContainers = map;
    }

    public final void setRichPromoSettings(@NotNull RichPromoSettings richPromoSettings) {
        Intrinsics.checkNotNullParameter(richPromoSettings, "<set-?>");
        this.richPromoSettings = richPromoSettings;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        String str2 = this.overlayColor;
        boolean z11 = this.forceWhiteStatusBar;
        String str3 = this.backgroundImage;
        String str4 = this.darkBackgroundImage;
        ShellNavBarBackButtonVO shellNavBarBackButtonVO = this.backIconVO;
        boolean z12 = this.isRounded;
        boolean z13 = this.disableRounding;
        boolean z14 = this.isStickyThirdLevel;
        ShellNavBarSpacings shellNavBarSpacings = this.spacings;
        ShellNavBarDTO.ShowFullNavBarMode showFullNavBarMode = this.showFullNavbarMode;
        ShellNavBarTeethVO shellNavBarTeethVO = this.teeth;
        boolean z15 = this.isSelectApp;
        StringBuilder c11 = C2436a.c(j11, "ShellNavBarVO(id=", ", backgroundColor=", str);
        a.g(", overlayColor=", str2, ", forceWhiteStatusBar=", c11, z11);
        Nh.a.h(c11, ", backgroundImage=", str3, ", darkBackgroundImage=", str4);
        c11.append(", backIconVO=");
        c11.append(shellNavBarBackButtonVO);
        c11.append(", isRounded=");
        c11.append(z12);
        C2436a.e(", disableRounding=", ", isStickyThirdLevel=", c11, z13, z14);
        c11.append(", spacings=");
        c11.append(shellNavBarSpacings);
        c11.append(", showFullNavbarMode=");
        c11.append(showFullNavBarMode);
        c11.append(", teeth=");
        c11.append(shellNavBarTeethVO);
        c11.append(", isSelectApp=");
        c11.append(z15);
        c11.append(")");
        return c11.toString();
    }
}
