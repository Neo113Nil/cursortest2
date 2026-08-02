package ru.ozon.fintech.features.offline.data.model.transfer;

import D3.g;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/transfer/BankInfo;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "rusName", "logoUrl", "isRanked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getName", "getRusName", "getLogoUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/fintech/features/offline/data/model/transfer/BankInfo;", "equals", "other", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BankInfo {

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "isRanked")
    private final Boolean isRanked;

    @i(name = "logoUrl")
    private final String logoUrl;

    @i(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @i(name = "rusName")
    private final String rusName;

    public BankInfo(@NotNull String id2, String str, String str2, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.name = str;
        this.rusName = str2;
        this.logoUrl = str3;
        this.isRanked = bool;
    }

    public static /* synthetic */ BankInfo copy$default(BankInfo bankInfo, String str, String str2, String str3, String str4, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bankInfo.id;
        }
        if ((i11 & 2) != 0) {
            str2 = bankInfo.name;
        }
        if ((i11 & 4) != 0) {
            str3 = bankInfo.rusName;
        }
        if ((i11 & 8) != 0) {
            str4 = bankInfo.logoUrl;
        }
        if ((i11 & 16) != 0) {
            bool = bankInfo.isRanked;
        }
        Boolean bool2 = bool;
        String str5 = str3;
        return bankInfo.copy(str, str2, str5, str4, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRusName() {
        return this.rusName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsRanked() {
        return this.isRanked;
    }

    @NotNull
    public final BankInfo copy(@NotNull String id2, String name, String rusName, String logoUrl, Boolean isRanked) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new BankInfo(id2, name, rusName, logoUrl, isRanked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankInfo)) {
            return false;
        }
        BankInfo bankInfo = (BankInfo) other;
        return Intrinsics.d(this.id, bankInfo.id) && Intrinsics.d(this.name, bankInfo.name) && Intrinsics.d(this.rusName, bankInfo.rusName) && Intrinsics.d(this.logoUrl, bankInfo.logoUrl) && Intrinsics.d(this.isRanked, bankInfo.isRanked);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRusName() {
        return this.rusName;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rusName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logoUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isRanked;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isRanked() {
        return this.isRanked;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.rusName;
        String str4 = this.logoUrl;
        Boolean bool = this.isRanked;
        StringBuilder d11 = C3660k.d("BankInfo(id=", str, ", name=", str2, ", rusName=");
        a.h(d11, str3, ", logoUrl=", str4, ", isRanked=");
        return g.d(d11, bool, ")");
    }
}
