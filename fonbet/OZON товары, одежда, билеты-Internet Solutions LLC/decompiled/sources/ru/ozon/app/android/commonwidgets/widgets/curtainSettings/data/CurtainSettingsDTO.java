package ru.ozon.app.android.commonwidgets.widgets.curtainSettings.data;

import GZ.e;
import I0.C3173b;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001:\u0001>B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¦\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\nHÖ\u0001J\t\u0010=\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001c¨\u0006?"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO;", "", "showCloseButton", "", "scrollableContent", "containerBackgroundColor", "", "allowResizeByGesture", "hideToungle", "minHeight", "", "heightMode", "Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO$HeightMode;", "disableCloseByGestures", "onCloseAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "closeButtonBgColor", "closeButtonIconColor", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO$HeightMode;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getShowCloseButton", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScrollableContent", "getContainerBackgroundColor", "()Ljava/lang/String;", "getAllowResizeByGesture", "getHideToungle", "getMinHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeightMode", "()Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO$HeightMode;", "getDisableCloseByGestures", "()Z", "getOnCloseAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCloseButtonBgColor", "getCloseButtonIconColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO$HeightMode;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO;", "equals", "other", "hashCode", "toString", "HeightMode", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurtainSettingsDTO {
    private final Boolean allowResizeByGesture;
    private final String closeButtonBgColor;
    private final String closeButtonIconColor;
    private final String containerBackgroundColor;
    private final boolean disableCloseByGestures;

    @NotNull
    private final HeightMode heightMode;
    private final Boolean hideToungle;
    private final Integer minHeight;
    private final AtomActionDTO onCloseAction;
    private final Boolean scrollableContent;
    private final Boolean showCloseButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainSettings/data/CurtainSettingsDTO$HeightMode;", "", "<init>", "(Ljava/lang/String;I)V", "HALF_SCREEN", "HUG_CONTENT", "FULL_SCREEN", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeightMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HeightMode[] $VALUES;
        public static final HeightMode HALF_SCREEN = new HeightMode("HALF_SCREEN", 0);
        public static final HeightMode HUG_CONTENT = new HeightMode("HUG_CONTENT", 1);
        public static final HeightMode FULL_SCREEN = new HeightMode("FULL_SCREEN", 2);

        private static final /* synthetic */ HeightMode[] $values() {
            return new HeightMode[]{HALF_SCREEN, HUG_CONTENT, FULL_SCREEN};
        }

        static {
            HeightMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private HeightMode(String str, int i11) {
        }

        public static HeightMode valueOf(String str) {
            return (HeightMode) Enum.valueOf(HeightMode.class, str);
        }

        public static HeightMode[] values() {
            return (HeightMode[]) $VALUES.clone();
        }
    }

    public CurtainSettingsDTO(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, Integer num, @NotNull HeightMode heightMode, boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, String str2, String str3) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.showCloseButton = bool;
        this.scrollableContent = bool2;
        this.containerBackgroundColor = str;
        this.allowResizeByGesture = bool3;
        this.hideToungle = bool4;
        this.minHeight = num;
        this.heightMode = heightMode;
        this.disableCloseByGestures = z11;
        this.onCloseAction = atomActionDTO;
        this.trackingInfo = map;
        this.closeButtonBgColor = str2;
        this.closeButtonIconColor = str3;
    }

    public static /* synthetic */ CurtainSettingsDTO copy$default(CurtainSettingsDTO curtainSettingsDTO, Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, Integer num, HeightMode heightMode, boolean z11, AtomActionDTO atomActionDTO, Map map, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = curtainSettingsDTO.showCloseButton;
        }
        if ((i11 & 2) != 0) {
            bool2 = curtainSettingsDTO.scrollableContent;
        }
        if ((i11 & 4) != 0) {
            str = curtainSettingsDTO.containerBackgroundColor;
        }
        if ((i11 & 8) != 0) {
            bool3 = curtainSettingsDTO.allowResizeByGesture;
        }
        if ((i11 & 16) != 0) {
            bool4 = curtainSettingsDTO.hideToungle;
        }
        if ((i11 & 32) != 0) {
            num = curtainSettingsDTO.minHeight;
        }
        if ((i11 & 64) != 0) {
            heightMode = curtainSettingsDTO.heightMode;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = curtainSettingsDTO.disableCloseByGestures;
        }
        if ((i11 & 256) != 0) {
            atomActionDTO = curtainSettingsDTO.onCloseAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = curtainSettingsDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str2 = curtainSettingsDTO.closeButtonBgColor;
        }
        if ((i11 & 2048) != 0) {
            str3 = curtainSettingsDTO.closeButtonIconColor;
        }
        String str4 = str2;
        String str5 = str3;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        HeightMode heightMode2 = heightMode;
        boolean z12 = z11;
        Boolean bool5 = bool4;
        Integer num2 = num;
        return curtainSettingsDTO.copy(bool, bool2, str, bool3, bool5, num2, heightMode2, z12, atomActionDTO2, map2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCloseButtonBgColor() {
        return this.closeButtonBgColor;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCloseButtonIconColor() {
        return this.closeButtonIconColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getScrollableContent() {
        return this.scrollableContent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContainerBackgroundColor() {
        return this.containerBackgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getAllowResizeByGesture() {
        return this.allowResizeByGesture;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHideToungle() {
        return this.hideToungle;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMinHeight() {
        return this.minHeight;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final HeightMode getHeightMode() {
        return this.heightMode;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDisableCloseByGestures() {
        return this.disableCloseByGestures;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomActionDTO getOnCloseAction() {
        return this.onCloseAction;
    }

    @NotNull
    public final CurtainSettingsDTO copy(Boolean showCloseButton, Boolean scrollableContent, String containerBackgroundColor, Boolean allowResizeByGesture, Boolean hideToungle, Integer minHeight, @NotNull HeightMode heightMode, boolean disableCloseByGestures, AtomActionDTO onCloseAction, Map<String, TokenizedTrackingInfo> trackingInfo, String closeButtonBgColor, String closeButtonIconColor) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        return new CurtainSettingsDTO(showCloseButton, scrollableContent, containerBackgroundColor, allowResizeByGesture, hideToungle, minHeight, heightMode, disableCloseByGestures, onCloseAction, trackingInfo, closeButtonBgColor, closeButtonIconColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainSettingsDTO)) {
            return false;
        }
        CurtainSettingsDTO curtainSettingsDTO = (CurtainSettingsDTO) other;
        return Intrinsics.d(this.showCloseButton, curtainSettingsDTO.showCloseButton) && Intrinsics.d(this.scrollableContent, curtainSettingsDTO.scrollableContent) && Intrinsics.d(this.containerBackgroundColor, curtainSettingsDTO.containerBackgroundColor) && Intrinsics.d(this.allowResizeByGesture, curtainSettingsDTO.allowResizeByGesture) && Intrinsics.d(this.hideToungle, curtainSettingsDTO.hideToungle) && Intrinsics.d(this.minHeight, curtainSettingsDTO.minHeight) && this.heightMode == curtainSettingsDTO.heightMode && this.disableCloseByGestures == curtainSettingsDTO.disableCloseByGestures && Intrinsics.d(this.onCloseAction, curtainSettingsDTO.onCloseAction) && Intrinsics.d(this.trackingInfo, curtainSettingsDTO.trackingInfo) && Intrinsics.d(this.closeButtonBgColor, curtainSettingsDTO.closeButtonBgColor) && Intrinsics.d(this.closeButtonIconColor, curtainSettingsDTO.closeButtonIconColor);
    }

    public final Boolean getAllowResizeByGesture() {
        return this.allowResizeByGesture;
    }

    public final String getCloseButtonBgColor() {
        return this.closeButtonBgColor;
    }

    public final String getCloseButtonIconColor() {
        return this.closeButtonIconColor;
    }

    public final String getContainerBackgroundColor() {
        return this.containerBackgroundColor;
    }

    public final boolean getDisableCloseByGestures() {
        return this.disableCloseByGestures;
    }

    @NotNull
    public final HeightMode getHeightMode() {
        return this.heightMode;
    }

    public final Boolean getHideToungle() {
        return this.hideToungle;
    }

    public final Integer getMinHeight() {
        return this.minHeight;
    }

    public final AtomActionDTO getOnCloseAction() {
        return this.onCloseAction;
    }

    public final Boolean getScrollableContent() {
        return this.scrollableContent;
    }

    public final Boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Boolean bool = this.showCloseButton;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.scrollableContent;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.containerBackgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.allowResizeByGesture;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hideToungle;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.minHeight;
        int a11 = C3532b.a((this.heightMode.hashCode() + ((hashCode5 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.disableCloseByGestures);
        AtomActionDTO atomActionDTO = this.onCloseAction;
        int hashCode6 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.closeButtonBgColor;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.closeButtonIconColor;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.showCloseButton;
        Boolean bool2 = this.scrollableContent;
        String str = this.containerBackgroundColor;
        Boolean bool3 = this.allowResizeByGesture;
        Boolean bool4 = this.hideToungle;
        Integer num = this.minHeight;
        HeightMode heightMode = this.heightMode;
        boolean z11 = this.disableCloseByGestures;
        AtomActionDTO atomActionDTO = this.onCloseAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str2 = this.closeButtonBgColor;
        String str3 = this.closeButtonIconColor;
        StringBuilder sb2 = new StringBuilder("CurtainSettingsDTO(showCloseButton=");
        sb2.append(bool);
        sb2.append(", scrollableContent=");
        sb2.append(bool2);
        sb2.append(", containerBackgroundColor=");
        Sh.a.d(bool3, str, ", allowResizeByGesture=", ", hideToungle=", sb2);
        e.d(bool4, num, ", minHeight=", ", heightMode=", sb2);
        sb2.append(heightMode);
        sb2.append(", disableCloseByGestures=");
        sb2.append(z11);
        sb2.append(", onCloseAction=");
        Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", closeButtonBgColor=");
        return C3173b.c(sb2, str2, ", closeButtonIconColor=", str3, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CurtainSettingsDTO(java.lang.Boolean r16, java.lang.Boolean r17, java.lang.String r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.Integer r21, ru.ozon.app.android.commonwidgets.widgets.curtainSettings.data.CurtainSettingsDTO.HeightMode r22, boolean r23, ru.ozon.uni.atoms.data.AtomActionDTO r24, java.util.Map r25, java.lang.String r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 64
            if (r1 == 0) goto La
            ru.ozon.app.android.commonwidgets.widgets.curtainSettings.data.CurtainSettingsDTO$HeightMode r1 = ru.ozon.app.android.commonwidgets.widgets.curtainSettings.data.CurtainSettingsDTO.HeightMode.HUG_CONTENT
            r9 = r1
            goto Lc
        La:
            r9 = r22
        Lc:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L13
            r1 = 0
            r10 = r1
            goto L15
        L13:
            r10 = r23
        L15:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L1c
            r12 = r2
            goto L1e
        L1c:
            r12 = r25
        L1e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L24
            r13 = r2
            goto L26
        L24:
            r13 = r26
        L26:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L3b
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r11 = r24
            r2 = r15
            goto L4c
        L3b:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r11 = r24
        L4c:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.commonwidgets.widgets.curtainSettings.data.CurtainSettingsDTO.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, ru.ozon.app.android.commonwidgets.widgets.curtainSettings.data.CurtainSettingsDTO$HeightMode, boolean, ru.ozon.uni.atoms.data.AtomActionDTO, java.util.Map, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
