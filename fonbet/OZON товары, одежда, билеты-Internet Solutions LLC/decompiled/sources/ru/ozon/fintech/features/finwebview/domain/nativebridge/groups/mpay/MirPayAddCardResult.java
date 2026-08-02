package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayAddCardResult;", "", "referenceId", "", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReferenceId", "()Ljava/lang/String;", "getResult", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayAddCardResult {
    private final String referenceId;
    private final String result;

    public MirPayAddCardResult(@i(name = "reference_id") String str, @i(name = "result") String str2) {
        this.referenceId = str;
        this.result = str2;
    }

    public static /* synthetic */ MirPayAddCardResult copy$default(MirPayAddCardResult mirPayAddCardResult, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mirPayAddCardResult.referenceId;
        }
        if ((i11 & 2) != 0) {
            str2 = mirPayAddCardResult.result;
        }
        return mirPayAddCardResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final MirPayAddCardResult copy(@i(name = "reference_id") String referenceId, @i(name = "result") String result) {
        return new MirPayAddCardResult(referenceId, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayAddCardResult)) {
            return false;
        }
        MirPayAddCardResult mirPayAddCardResult = (MirPayAddCardResult) other;
        return Intrinsics.d(this.referenceId, mirPayAddCardResult.referenceId) && Intrinsics.d(this.result, mirPayAddCardResult.result);
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.referenceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.result;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return e.a("MirPayAddCardResult(referenceId=", this.referenceId, ", result=", this.result, ")");
    }
}
