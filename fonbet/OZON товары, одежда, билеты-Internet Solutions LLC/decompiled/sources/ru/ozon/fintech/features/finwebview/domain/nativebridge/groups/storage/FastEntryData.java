package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage;

import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/storage/FastEntryData;", "", "isEnabled", "", "tokenId", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getTokenId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FastEntryData {
    private final boolean isEnabled;
    private final String tokenId;

    public FastEntryData(@i(name = "is_enabled") boolean z11, @i(name = "token_id") String str) {
        this.isEnabled = z11;
        this.tokenId = str;
    }

    public static /* synthetic */ FastEntryData copy$default(FastEntryData fastEntryData, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = fastEntryData.isEnabled;
        }
        if ((i11 & 2) != 0) {
            str = fastEntryData.tokenId;
        }
        return fastEntryData.copy(z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    public final FastEntryData copy(@i(name = "is_enabled") boolean isEnabled, @i(name = "token_id") String tokenId) {
        return new FastEntryData(isEnabled, tokenId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastEntryData)) {
            return false;
        }
        FastEntryData fastEntryData = (FastEntryData) other;
        return this.isEnabled == fastEntryData.isEnabled && Intrinsics.d(this.tokenId, fastEntryData.tokenId);
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.tokenId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "FastEntryData(isEnabled=" + this.isEnabled + ", tokenId=" + this.tokenId + ")";
    }

    public /* synthetic */ FastEntryData(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str);
    }
}
