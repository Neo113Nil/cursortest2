package ru.ozon.app.android.error.summary.presentation.shared;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryExperimentSharedDTO;", "", "id", "", "variantId", "alias", "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "getVariantId", "getAlias", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ErrorSummaryExperimentSharedDTO {
    private final String alias;
    private final int id;
    private final int variantId;

    public ErrorSummaryExperimentSharedDTO(@i(name = "id") int i11, @i(name = "variant_id") int i12, @i(name = "alias") String str) {
        this.id = i11;
        this.variantId = i12;
        this.alias = str;
    }

    public static /* synthetic */ ErrorSummaryExperimentSharedDTO copy$default(ErrorSummaryExperimentSharedDTO errorSummaryExperimentSharedDTO, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = errorSummaryExperimentSharedDTO.id;
        }
        if ((i13 & 2) != 0) {
            i12 = errorSummaryExperimentSharedDTO.variantId;
        }
        if ((i13 & 4) != 0) {
            str = errorSummaryExperimentSharedDTO.alias;
        }
        return errorSummaryExperimentSharedDTO.copy(i11, i12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVariantId() {
        return this.variantId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    public final ErrorSummaryExperimentSharedDTO copy(@i(name = "id") int id2, @i(name = "variant_id") int variantId, @i(name = "alias") String alias) {
        return new ErrorSummaryExperimentSharedDTO(id2, variantId, alias);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorSummaryExperimentSharedDTO)) {
            return false;
        }
        ErrorSummaryExperimentSharedDTO errorSummaryExperimentSharedDTO = (ErrorSummaryExperimentSharedDTO) other;
        return this.id == errorSummaryExperimentSharedDTO.id && this.variantId == errorSummaryExperimentSharedDTO.variantId && Intrinsics.d(this.alias, errorSummaryExperimentSharedDTO.alias);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final int getId() {
        return this.id;
    }

    public final int getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.variantId, Integer.hashCode(this.id) * 31, 31);
        String str = this.alias;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        int i12 = this.variantId;
        return o0.c(C2438a.a("ErrorSummaryExperimentSharedDTO(id=", i11, ", variantId=", ", alias=", i12), this.alias, ")");
    }
}
