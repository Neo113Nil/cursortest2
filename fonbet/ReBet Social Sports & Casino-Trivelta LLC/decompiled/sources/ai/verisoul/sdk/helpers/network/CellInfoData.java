package ai.verisoul.sdk.helpers.network;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJl\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006'"}, d2 = {"Lai/verisoul/sdk/helpers/network/CellInfoData;", "", "type", "", "mcc", "mnc", "cid", "", "tac", "pci", "arfcn", "signalStrength", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getArfcn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCid", "getMcc", "()Ljava/lang/String;", "getMnc", "getPci", "getSignalStrength", "getTac", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lai/verisoul/sdk/helpers/network/CellInfoData;", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CellInfoData {

    @c("arfcn")
    @Nullable
    private final Integer arfcn;

    @c("cid")
    @Nullable
    private final Integer cid;

    @c("mcc")
    @Nullable
    private final String mcc;

    @c("mnc")
    @Nullable
    private final String mnc;

    @c("pci")
    @Nullable
    private final Integer pci;

    @c("signal_strength")
    @Nullable
    private final Integer signalStrength;

    @c("tac")
    @Nullable
    private final Integer tac;

    @c("type")
    @NotNull
    private final String type;

    public CellInfoData(@NotNull String type, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.mcc = str;
        this.mnc = str2;
        this.cid = num;
        this.tac = num2;
        this.pci = num3;
        this.arfcn = num4;
        this.signalStrength = num5;
    }

    public static /* synthetic */ CellInfoData copy$default(CellInfoData cellInfoData, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cellInfoData.type;
        }
        if ((i10 & 2) != 0) {
            str2 = cellInfoData.mcc;
        }
        if ((i10 & 4) != 0) {
            str3 = cellInfoData.mnc;
        }
        if ((i10 & 8) != 0) {
            num = cellInfoData.cid;
        }
        if ((i10 & 16) != 0) {
            num2 = cellInfoData.tac;
        }
        if ((i10 & 32) != 0) {
            num3 = cellInfoData.pci;
        }
        if ((i10 & 64) != 0) {
            num4 = cellInfoData.arfcn;
        }
        if ((i10 & 128) != 0) {
            num5 = cellInfoData.signalStrength;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        Integer num8 = num2;
        Integer num9 = num3;
        return cellInfoData.copy(str, str2, str3, num, num8, num9, num6, num7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMcc() {
        return this.mcc;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMnc() {
        return this.mnc;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getCid() {
        return this.cid;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getTac() {
        return this.tac;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPci() {
        return this.pci;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getArfcn() {
        return this.arfcn;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getSignalStrength() {
        return this.signalStrength;
    }

    @NotNull
    public final CellInfoData copy(@NotNull String type, @Nullable String mcc, @Nullable String mnc, @Nullable Integer cid, @Nullable Integer tac, @Nullable Integer pci, @Nullable Integer arfcn, @Nullable Integer signalStrength) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CellInfoData(type, mcc, mnc, cid, tac, pci, arfcn, signalStrength);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellInfoData)) {
            return false;
        }
        CellInfoData cellInfoData = (CellInfoData) other;
        return Intrinsics.areEqual(this.type, cellInfoData.type) && Intrinsics.areEqual(this.mcc, cellInfoData.mcc) && Intrinsics.areEqual(this.mnc, cellInfoData.mnc) && Intrinsics.areEqual(this.cid, cellInfoData.cid) && Intrinsics.areEqual(this.tac, cellInfoData.tac) && Intrinsics.areEqual(this.pci, cellInfoData.pci) && Intrinsics.areEqual(this.arfcn, cellInfoData.arfcn) && Intrinsics.areEqual(this.signalStrength, cellInfoData.signalStrength);
    }

    @Nullable
    public final Integer getArfcn() {
        return this.arfcn;
    }

    @Nullable
    public final Integer getCid() {
        return this.cid;
    }

    @Nullable
    public final String getMcc() {
        return this.mcc;
    }

    @Nullable
    public final String getMnc() {
        return this.mnc;
    }

    @Nullable
    public final Integer getPci() {
        return this.pci;
    }

    @Nullable
    public final Integer getSignalStrength() {
        return this.signalStrength;
    }

    @Nullable
    public final Integer getTac() {
        return this.tac;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.mcc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mnc;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cid;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tac;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pci;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.arfcn;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.signalStrength;
        return hashCode7 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CellInfoData(type=" + this.type + ", mcc=" + this.mcc + ", mnc=" + this.mnc + ", cid=" + this.cid + ", tac=" + this.tac + ", pci=" + this.pci + ", arfcn=" + this.arfcn + ", signalStrength=" + this.signalStrength + ")";
    }
}
