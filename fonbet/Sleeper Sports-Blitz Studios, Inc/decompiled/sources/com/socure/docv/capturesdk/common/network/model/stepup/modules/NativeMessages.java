package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00060"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeMessages;", "", "title", "", "holdPhoneFront", "ensureTopHead", "clickCapture", "placeIdFlat", "positionPhoneId", "makeSureInfo", "openPassport", "positionPhonePassport", "ensurePersonalInfo", "flipYourId", "ensureBarcode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClickCapture", "()Ljava/lang/String;", "getEnsureBarcode", "getEnsurePersonalInfo", "getEnsureTopHead", "getFlipYourId", "getHoldPhoneFront", "getMakeSureInfo", "getOpenPassport", "getPlaceIdFlat", "getPositionPhoneId", "getPositionPhonePassport", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NativeMessages {
    public static final int $stable = 0;
    private final String clickCapture;
    private final String ensureBarcode;
    private final String ensurePersonalInfo;
    private final String ensureTopHead;
    private final String flipYourId;
    private final String holdPhoneFront;
    private final String makeSureInfo;
    private final String openPassport;
    private final String placeIdFlat;
    private final String positionPhoneId;
    private final String positionPhonePassport;
    private final String title;

    public NativeMessages() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ NativeMessages copy$default(NativeMessages nativeMessages, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeMessages.title;
        }
        if ((i & 2) != 0) {
            str2 = nativeMessages.holdPhoneFront;
        }
        if ((i & 4) != 0) {
            str3 = nativeMessages.ensureTopHead;
        }
        if ((i & 8) != 0) {
            str4 = nativeMessages.clickCapture;
        }
        if ((i & 16) != 0) {
            str5 = nativeMessages.placeIdFlat;
        }
        if ((i & 32) != 0) {
            str6 = nativeMessages.positionPhoneId;
        }
        if ((i & 64) != 0) {
            str7 = nativeMessages.makeSureInfo;
        }
        if ((i & 128) != 0) {
            str8 = nativeMessages.openPassport;
        }
        if ((i & 256) != 0) {
            str9 = nativeMessages.positionPhonePassport;
        }
        if ((i & 512) != 0) {
            str10 = nativeMessages.ensurePersonalInfo;
        }
        if ((i & 1024) != 0) {
            str11 = nativeMessages.flipYourId;
        }
        if ((i & 2048) != 0) {
            str12 = nativeMessages.ensureBarcode;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return nativeMessages.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEnsurePersonalInfo() {
        return this.ensurePersonalInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final String getFlipYourId() {
        return this.flipYourId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getEnsureBarcode() {
        return this.ensureBarcode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHoldPhoneFront() {
        return this.holdPhoneFront;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEnsureTopHead() {
        return this.ensureTopHead;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClickCapture() {
        return this.clickCapture;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPositionPhoneId() {
        return this.positionPhoneId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMakeSureInfo() {
        return this.makeSureInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOpenPassport() {
        return this.openPassport;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPositionPhonePassport() {
        return this.positionPhonePassport;
    }

    public final NativeMessages copy(String title, String holdPhoneFront, String ensureTopHead, String clickCapture, String placeIdFlat, String positionPhoneId, String makeSureInfo, String openPassport, String positionPhonePassport, String ensurePersonalInfo, String flipYourId, String ensureBarcode) {
        return new NativeMessages(title, holdPhoneFront, ensureTopHead, clickCapture, placeIdFlat, positionPhoneId, makeSureInfo, openPassport, positionPhonePassport, ensurePersonalInfo, flipYourId, ensureBarcode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeMessages)) {
            return false;
        }
        NativeMessages nativeMessages = (NativeMessages) other;
        return Intrinsics.areEqual(this.title, nativeMessages.title) && Intrinsics.areEqual(this.holdPhoneFront, nativeMessages.holdPhoneFront) && Intrinsics.areEqual(this.ensureTopHead, nativeMessages.ensureTopHead) && Intrinsics.areEqual(this.clickCapture, nativeMessages.clickCapture) && Intrinsics.areEqual(this.placeIdFlat, nativeMessages.placeIdFlat) && Intrinsics.areEqual(this.positionPhoneId, nativeMessages.positionPhoneId) && Intrinsics.areEqual(this.makeSureInfo, nativeMessages.makeSureInfo) && Intrinsics.areEqual(this.openPassport, nativeMessages.openPassport) && Intrinsics.areEqual(this.positionPhonePassport, nativeMessages.positionPhonePassport) && Intrinsics.areEqual(this.ensurePersonalInfo, nativeMessages.ensurePersonalInfo) && Intrinsics.areEqual(this.flipYourId, nativeMessages.flipYourId) && Intrinsics.areEqual(this.ensureBarcode, nativeMessages.ensureBarcode);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.holdPhoneFront;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ensureTopHead;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickCapture;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.placeIdFlat;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.positionPhoneId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.makeSureInfo;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.openPassport;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.positionPhonePassport;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ensurePersonalInfo;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.flipYourId;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.ensureBarcode;
        return hashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        return "NativeMessages(title=" + this.title + ", holdPhoneFront=" + this.holdPhoneFront + ", ensureTopHead=" + this.ensureTopHead + ", clickCapture=" + this.clickCapture + ", placeIdFlat=" + this.placeIdFlat + ", positionPhoneId=" + this.positionPhoneId + ", makeSureInfo=" + this.makeSureInfo + ", openPassport=" + this.openPassport + ", positionPhonePassport=" + this.positionPhonePassport + ", ensurePersonalInfo=" + this.ensurePersonalInfo + ", flipYourId=" + this.flipYourId + ", ensureBarcode=" + this.ensureBarcode + ")";
    }

    public NativeMessages(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.title = str;
        this.holdPhoneFront = str2;
        this.ensureTopHead = str3;
        this.clickCapture = str4;
        this.placeIdFlat = str5;
        this.positionPhoneId = str6;
        this.makeSureInfo = str7;
        this.openPassport = str8;
        this.positionPhonePassport = str9;
        this.ensurePersonalInfo = str10;
        this.flipYourId = str11;
        this.ensureBarcode = str12;
    }

    public /* synthetic */ NativeMessages(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getHoldPhoneFront() {
        return this.holdPhoneFront;
    }

    public final String getEnsureTopHead() {
        return this.ensureTopHead;
    }

    public final String getClickCapture() {
        return this.clickCapture;
    }

    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    public final String getPositionPhoneId() {
        return this.positionPhoneId;
    }

    public final String getMakeSureInfo() {
        return this.makeSureInfo;
    }

    public final String getOpenPassport() {
        return this.openPassport;
    }

    public final String getPositionPhonePassport() {
        return this.positionPhonePassport;
    }

    public final String getEnsurePersonalInfo() {
        return this.ensurePersonalInfo;
    }

    public final String getFlipYourId() {
        return this.flipYourId;
    }

    public final String getEnsureBarcode() {
        return this.ensureBarcode;
    }
}
