package ru.ozon.tracker.model;

import De.C2860c;
import N3.C3660k;
import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J¶\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u00020\fJ\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\fHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"¨\u0006D"}, d2 = {"Lru/ozon/tracker/model/TrinityPage;", "Landroid/os/Parcelable;", "current", "", "previous", "currentUrl", "referralUrl", "nextUrl", "pageViewId", "previousPageViewId", "composerPageType", "categoryId", "", "tagId", "", "sku", "highlightId", "sellerId", "brandId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrent", "()Ljava/lang/String;", "getPrevious", "getCurrentUrl", "getReferralUrl", "getNextUrl", "getPageViewId", "getPreviousPageViewId", "getComposerPageType", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTagId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSku", "getHighlightId", "getSellerId", "getBrandId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lru/ozon/tracker/model/TrinityPage;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrinityPage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrinityPage> CREATOR = new Creator();
    private final Long brandId;
    private final Integer categoryId;
    private final String composerPageType;
    private final String current;
    private final String currentUrl;
    private final Long highlightId;
    private final String nextUrl;
    private final String pageViewId;
    private final String previous;
    private final String previousPageViewId;
    private final String referralUrl;
    private final Long sellerId;
    private final Long sku;
    private final Long tagId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrinityPage> {
        @Override // android.os.Parcelable.Creator
        public final TrinityPage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrinityPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final TrinityPage[] newArray(int i11) {
            return new TrinityPage[i11];
        }
    }

    public TrinityPage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrent() {
        return this.current;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getTagId() {
        return this.tagId;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getSku() {
        return this.sku;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getHighlightId() {
        return this.highlightId;
    }

    /* renamed from: component13, reason: from getter */
    public final Long getSellerId() {
        return this.sellerId;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getBrandId() {
        return this.brandId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrevious() {
        return this.previous;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReferralUrl() {
        return this.referralUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNextUrl() {
        return this.nextUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPageViewId() {
        return this.pageViewId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPreviousPageViewId() {
        return this.previousPageViewId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getComposerPageType() {
        return this.composerPageType;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final TrinityPage copy(String current, String previous, String currentUrl, String referralUrl, String nextUrl, String pageViewId, String previousPageViewId, String composerPageType, Integer categoryId, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId) {
        return new TrinityPage(current, previous, currentUrl, referralUrl, nextUrl, pageViewId, previousPageViewId, composerPageType, categoryId, tagId, sku, highlightId, sellerId, brandId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrinityPage)) {
            return false;
        }
        TrinityPage trinityPage = (TrinityPage) other;
        return Intrinsics.d(this.current, trinityPage.current) && Intrinsics.d(this.previous, trinityPage.previous) && Intrinsics.d(this.currentUrl, trinityPage.currentUrl) && Intrinsics.d(this.referralUrl, trinityPage.referralUrl) && Intrinsics.d(this.nextUrl, trinityPage.nextUrl) && Intrinsics.d(this.pageViewId, trinityPage.pageViewId) && Intrinsics.d(this.previousPageViewId, trinityPage.previousPageViewId) && Intrinsics.d(this.composerPageType, trinityPage.composerPageType) && Intrinsics.d(this.categoryId, trinityPage.categoryId) && Intrinsics.d(this.tagId, trinityPage.tagId) && Intrinsics.d(this.sku, trinityPage.sku) && Intrinsics.d(this.highlightId, trinityPage.highlightId) && Intrinsics.d(this.sellerId, trinityPage.sellerId) && Intrinsics.d(this.brandId, trinityPage.brandId);
    }

    public final Long getBrandId() {
        return this.brandId;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final String getComposerPageType() {
        return this.composerPageType;
    }

    public final String getCurrent() {
        return this.current;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final Long getHighlightId() {
        return this.highlightId;
    }

    public final String getNextUrl() {
        return this.nextUrl;
    }

    public final String getPageViewId() {
        return this.pageViewId;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public final String getPreviousPageViewId() {
        return this.previousPageViewId;
    }

    public final String getReferralUrl() {
        return this.referralUrl;
    }

    public final Long getSellerId() {
        return this.sellerId;
    }

    public final Long getSku() {
        return this.sku;
    }

    public final Long getTagId() {
        return this.tagId;
    }

    public int hashCode() {
        String str = this.current;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.previous;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referralUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nextUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pageViewId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.previousPageViewId;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.composerPageType;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.categoryId;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.tagId;
        int hashCode10 = (hashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sku;
        int hashCode11 = (hashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.highlightId;
        int hashCode12 = (hashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.sellerId;
        int hashCode13 = (hashCode12 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.brandId;
        return hashCode13 + (l15 != null ? l15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.current;
        String str2 = this.previous;
        String str3 = this.currentUrl;
        String str4 = this.referralUrl;
        String str5 = this.nextUrl;
        String str6 = this.pageViewId;
        String str7 = this.previousPageViewId;
        String str8 = this.composerPageType;
        Integer num = this.categoryId;
        Long l11 = this.tagId;
        Long l12 = this.sku;
        Long l13 = this.highlightId;
        Long l14 = this.sellerId;
        Long l15 = this.brandId;
        StringBuilder d11 = C3660k.d("TrinityPage(current=", str, ", previous=", str2, ", currentUrl=");
        a.h(d11, str3, ", referralUrl=", str4, ", nextUrl=");
        a.h(d11, str5, ", pageViewId=", str6, ", previousPageViewId=");
        a.h(d11, str7, ", composerPageType=", str8, ", categoryId=");
        d11.append(num);
        d11.append(", tagId=");
        d11.append(l11);
        d11.append(", sku=");
        TY.a.e(d11, l12, ", highlightId=", l13, ", sellerId=");
        d11.append(l14);
        d11.append(", brandId=");
        d11.append(l15);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.current);
        dest.writeString(this.previous);
        dest.writeString(this.currentUrl);
        dest.writeString(this.referralUrl);
        dest.writeString(this.nextUrl);
        dest.writeString(this.pageViewId);
        dest.writeString(this.previousPageViewId);
        dest.writeString(this.composerPageType);
        Integer num = this.categoryId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num);
        }
        Long l11 = this.tagId;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l11);
        }
        Long l12 = this.sku;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l12);
        }
        Long l13 = this.highlightId;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l13);
        }
        Long l14 = this.sellerId;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l14);
        }
        Long l15 = this.brandId;
        if (l15 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l15);
        }
    }

    public TrinityPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15) {
        this.current = str;
        this.previous = str2;
        this.currentUrl = str3;
        this.referralUrl = str4;
        this.nextUrl = str5;
        this.pageViewId = str6;
        this.previousPageViewId = str7;
        this.composerPageType = str8;
        this.categoryId = num;
        this.tagId = l11;
        this.sku = l12;
        this.highlightId = l13;
        this.sellerId = l14;
        this.brandId = l15;
    }

    public /* synthetic */ TrinityPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : l11, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l12, (i11 & 2048) != 0 ? null : l13, (i11 & 4096) != 0 ? null : l14, (i11 & 8192) != 0 ? null : l15);
    }
}
