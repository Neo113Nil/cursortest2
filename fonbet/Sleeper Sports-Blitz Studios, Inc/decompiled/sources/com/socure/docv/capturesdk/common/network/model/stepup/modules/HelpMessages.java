package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/HelpMessages;", "", "title", "", "alignFaceFrame", "holdDevice", "lookDirectly", "placeIdFlat", "holdPhoneOverId", "flipYourId", "focusCameraId", "openPassport", "holdPhoneOverPassport", "focusCameraPassport", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlignFaceFrame", "()Ljava/lang/String;", "getFlipYourId", "getFocusCameraId", "getFocusCameraPassport", "getHoldDevice", "getHoldPhoneOverId", "getHoldPhoneOverPassport", "getLookDirectly", "getOpenPassport", "getPlaceIdFlat", "getTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HelpMessages {
    public static final int $stable = 0;
    private final String alignFaceFrame;
    private final String flipYourId;
    private final String focusCameraId;
    private final String focusCameraPassport;
    private final String holdDevice;
    private final String holdPhoneOverId;
    private final String holdPhoneOverPassport;
    private final String lookDirectly;
    private final String openPassport;
    private final String placeIdFlat;
    private final String title;

    public HelpMessages() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ HelpMessages copy$default(HelpMessages helpMessages, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpMessages.title;
        }
        if ((i & 2) != 0) {
            str2 = helpMessages.alignFaceFrame;
        }
        if ((i & 4) != 0) {
            str3 = helpMessages.holdDevice;
        }
        if ((i & 8) != 0) {
            str4 = helpMessages.lookDirectly;
        }
        if ((i & 16) != 0) {
            str5 = helpMessages.placeIdFlat;
        }
        if ((i & 32) != 0) {
            str6 = helpMessages.holdPhoneOverId;
        }
        if ((i & 64) != 0) {
            str7 = helpMessages.flipYourId;
        }
        if ((i & 128) != 0) {
            str8 = helpMessages.focusCameraId;
        }
        if ((i & 256) != 0) {
            str9 = helpMessages.openPassport;
        }
        if ((i & 512) != 0) {
            str10 = helpMessages.holdPhoneOverPassport;
        }
        if ((i & 1024) != 0) {
            str11 = helpMessages.focusCameraPassport;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return helpMessages.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getHoldPhoneOverPassport() {
        return this.holdPhoneOverPassport;
    }

    /* renamed from: component11, reason: from getter */
    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHoldDevice() {
        return this.holdDevice;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHoldPhoneOverId() {
        return this.holdPhoneOverId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFlipYourId() {
        return this.flipYourId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOpenPassport() {
        return this.openPassport;
    }

    public final HelpMessages copy(String title, String alignFaceFrame, String holdDevice, String lookDirectly, String placeIdFlat, String holdPhoneOverId, String flipYourId, String focusCameraId, String openPassport, String holdPhoneOverPassport, String focusCameraPassport) {
        return new HelpMessages(title, alignFaceFrame, holdDevice, lookDirectly, placeIdFlat, holdPhoneOverId, flipYourId, focusCameraId, openPassport, holdPhoneOverPassport, focusCameraPassport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpMessages)) {
            return false;
        }
        HelpMessages helpMessages = (HelpMessages) other;
        return Intrinsics.areEqual(this.title, helpMessages.title) && Intrinsics.areEqual(this.alignFaceFrame, helpMessages.alignFaceFrame) && Intrinsics.areEqual(this.holdDevice, helpMessages.holdDevice) && Intrinsics.areEqual(this.lookDirectly, helpMessages.lookDirectly) && Intrinsics.areEqual(this.placeIdFlat, helpMessages.placeIdFlat) && Intrinsics.areEqual(this.holdPhoneOverId, helpMessages.holdPhoneOverId) && Intrinsics.areEqual(this.flipYourId, helpMessages.flipYourId) && Intrinsics.areEqual(this.focusCameraId, helpMessages.focusCameraId) && Intrinsics.areEqual(this.openPassport, helpMessages.openPassport) && Intrinsics.areEqual(this.holdPhoneOverPassport, helpMessages.holdPhoneOverPassport) && Intrinsics.areEqual(this.focusCameraPassport, helpMessages.focusCameraPassport);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alignFaceFrame;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.holdDevice;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lookDirectly;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.placeIdFlat;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.holdPhoneOverId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.flipYourId;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.focusCameraId;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.openPassport;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.holdPhoneOverPassport;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.focusCameraPassport;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "HelpMessages(title=" + this.title + ", alignFaceFrame=" + this.alignFaceFrame + ", holdDevice=" + this.holdDevice + ", lookDirectly=" + this.lookDirectly + ", placeIdFlat=" + this.placeIdFlat + ", holdPhoneOverId=" + this.holdPhoneOverId + ", flipYourId=" + this.flipYourId + ", focusCameraId=" + this.focusCameraId + ", openPassport=" + this.openPassport + ", holdPhoneOverPassport=" + this.holdPhoneOverPassport + ", focusCameraPassport=" + this.focusCameraPassport + ")";
    }

    public HelpMessages(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.title = str;
        this.alignFaceFrame = str2;
        this.holdDevice = str3;
        this.lookDirectly = str4;
        this.placeIdFlat = str5;
        this.holdPhoneOverId = str6;
        this.flipYourId = str7;
        this.focusCameraId = str8;
        this.openPassport = str9;
        this.holdPhoneOverPassport = str10;
        this.focusCameraPassport = str11;
    }

    public /* synthetic */ HelpMessages(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    public final String getHoldDevice() {
        return this.holdDevice;
    }

    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    public final String getHoldPhoneOverId() {
        return this.holdPhoneOverId;
    }

    public final String getFlipYourId() {
        return this.flipYourId;
    }

    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    public final String getOpenPassport() {
        return this.openPassport;
    }

    public final String getHoldPhoneOverPassport() {
        return this.holdPhoneOverPassport;
    }

    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }
}
