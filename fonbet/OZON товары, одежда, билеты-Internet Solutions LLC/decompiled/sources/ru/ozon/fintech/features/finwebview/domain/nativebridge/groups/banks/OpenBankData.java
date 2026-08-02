package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks;

import androidx.annotation.Keep;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/banks/OpenBankData;", "", "memberId", "", "packageName", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getMemberId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPackageName", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/banks/OpenBankData;", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenBankData {
    private final Long memberId;
    private final String packageName;

    public OpenBankData(Long l11, String str) {
        this.memberId = l11;
        this.packageName = str;
    }

    public static /* synthetic */ OpenBankData copy$default(OpenBankData openBankData, Long l11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = openBankData.memberId;
        }
        if ((i11 & 2) != 0) {
            str = openBankData.packageName;
        }
        return openBankData.copy(l11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getMemberId() {
        return this.memberId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final OpenBankData copy(Long memberId, String packageName) {
        return new OpenBankData(memberId, packageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenBankData)) {
            return false;
        }
        OpenBankData openBankData = (OpenBankData) other;
        return Intrinsics.d(this.memberId, openBankData.memberId) && Intrinsics.d(this.packageName, openBankData.packageName);
    }

    public final Long getMemberId() {
        return this.memberId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        Long l11 = this.memberId;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.packageName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenBankData(memberId=" + this.memberId + ", packageName=" + this.packageName + ")";
    }

    public /* synthetic */ OpenBankData(Long l11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(l11, (i11 & 2) != 0 ? null : str);
    }
}
