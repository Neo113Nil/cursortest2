package ru.ozon.app.android.partpayment.formpage.data.validation;

import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.validation.PassFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/validation/VerifySmsDTO;", "", "deeplink", "", "message", "fields", "", "Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormDTO$ErrorField;", "isCompleted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getDeeplink", "()Ljava/lang/String;", "getMessage", "getFields", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VerifySmsDTO {
    private final String deeplink;
    private final List<PassFormDTO.ErrorField> fields;
    private final boolean isCompleted;
    private final String message;

    public VerifySmsDTO(String str, String str2, List<PassFormDTO.ErrorField> list, boolean z11) {
        this.deeplink = str;
        this.message = str2;
        this.fields = list;
        this.isCompleted = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerifySmsDTO copy$default(VerifySmsDTO verifySmsDTO, String str, String str2, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = verifySmsDTO.deeplink;
        }
        if ((i11 & 2) != 0) {
            str2 = verifySmsDTO.message;
        }
        if ((i11 & 4) != 0) {
            list = verifySmsDTO.fields;
        }
        if ((i11 & 8) != 0) {
            z11 = verifySmsDTO.isCompleted;
        }
        return verifySmsDTO.copy(str, str2, list, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<PassFormDTO.ErrorField> component3() {
        return this.fields;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    @NotNull
    public final VerifySmsDTO copy(String deeplink, String message, List<PassFormDTO.ErrorField> fields, boolean isCompleted) {
        return new VerifySmsDTO(deeplink, message, fields, isCompleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifySmsDTO)) {
            return false;
        }
        VerifySmsDTO verifySmsDTO = (VerifySmsDTO) other;
        return Intrinsics.d(this.deeplink, verifySmsDTO.deeplink) && Intrinsics.d(this.message, verifySmsDTO.message) && Intrinsics.d(this.fields, verifySmsDTO.fields) && this.isCompleted == verifySmsDTO.isCompleted;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final List<PassFormDTO.ErrorField> getFields() {
        return this.fields;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.deeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PassFormDTO.ErrorField> list = this.fields;
        return Boolean.hashCode(this.isCompleted) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    @NotNull
    public String toString() {
        String str = this.deeplink;
        String str2 = this.message;
        List<PassFormDTO.ErrorField> list = this.fields;
        boolean z11 = this.isCompleted;
        StringBuilder d11 = C3660k.d("VerifySmsDTO(deeplink=", str, ", message=", str2, ", fields=");
        d11.append(list);
        d11.append(", isCompleted=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }
}
