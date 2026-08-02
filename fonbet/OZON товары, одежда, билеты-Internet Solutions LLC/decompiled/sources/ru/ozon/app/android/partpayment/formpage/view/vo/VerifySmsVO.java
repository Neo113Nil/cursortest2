package ru.ozon.app.android.partpayment.formpage.view.vo;

import N3.C3660k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vo/VerifySmsVO;", "", "", "deeplink", "message", "", "fields", "", "isCompleted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getMessage", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "Z", "()Z", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VerifySmsVO {
    private final String deeplink;
    private final Map<String, String> fields;
    private final boolean isCompleted;
    private final String message;

    public VerifySmsVO(String str, String str2, Map<String, String> map, boolean z11) {
        this.deeplink = str;
        this.message = str2;
        this.fields = map;
        this.isCompleted = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifySmsVO)) {
            return false;
        }
        VerifySmsVO verifySmsVO = (VerifySmsVO) other;
        return Intrinsics.d(this.deeplink, verifySmsVO.deeplink) && Intrinsics.d(this.message, verifySmsVO.message) && Intrinsics.d(this.fields, verifySmsVO.fields) && this.isCompleted == verifySmsVO.isCompleted;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, String> getFields() {
        return this.fields;
    }

    public int hashCode() {
        String str = this.deeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.fields;
        return Boolean.hashCode(this.isCompleted) + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    /* renamed from: isCompleted, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    @NotNull
    public String toString() {
        String str = this.deeplink;
        String str2 = this.message;
        Map<String, String> map = this.fields;
        boolean z11 = this.isCompleted;
        StringBuilder d11 = C3660k.d("VerifySmsVO(deeplink=", str, ", message=", str2, ", fields=");
        d11.append(map);
        d11.append(", isCompleted=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }
}
