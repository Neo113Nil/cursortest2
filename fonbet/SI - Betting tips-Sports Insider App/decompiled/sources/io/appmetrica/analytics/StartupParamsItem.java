package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import d9.e;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f11379a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f11380b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11381c;

    public StartupParamsItem(String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f11379a = str;
        this.f11380b = startupParamsItemStatus;
        this.f11381c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f11379a, startupParamsItem.f11379a) && this.f11380b == startupParamsItem.f11380b && Objects.equals(this.f11381c, startupParamsItem.f11381c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.f11381c;
    }

    public String getId() {
        return this.f11379a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f11380b;
    }

    public int hashCode() {
        return Objects.hash(this.f11379a, this.f11380b, this.f11381c);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartupParamsItem{id='");
        sb2.append(this.f11379a);
        sb2.append("', status=");
        sb2.append(this.f11380b);
        sb2.append(", errorDetails='");
        return e.l(sb2, this.f11381c, "'}");
    }
}
