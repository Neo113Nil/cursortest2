package v2;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: v2.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10190e {

    /* renamed from: a, reason: collision with root package name */
    private final String f101684a;

    /* renamed from: b, reason: collision with root package name */
    private final String f101685b;

    /* renamed from: c, reason: collision with root package name */
    private final String f101686c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f101687d;

    /* renamed from: e, reason: collision with root package name */
    private final String f101688e;

    public C10190e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        str.getClass();
        this.f101684a = str;
        str2.getClass();
        this.f101685b = str2;
        this.f101686c = str3;
        list.getClass();
        this.f101687d = list;
        this.f101688e = str + "-" + str2 + "-" + str3;
    }

    public final List<List<byte[]>> a() {
        return this.f101687d;
    }

    @NonNull
    final String b() {
        return this.f101688e;
    }

    @NonNull
    public final String c() {
        return this.f101684a;
    }

    @NonNull
    public final String d() {
        return this.f101685b;
    }

    @NonNull
    public final String e() {
        return this.f101686c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f101684a + ", mProviderPackage: " + this.f101685b + ", mQuery: " + this.f101686c + ", mCertificates:");
        int i11 = 0;
        while (true) {
            List<List<byte[]>> list = this.f101687d;
            if (i11 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List<byte[]> list2 = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list2.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i11++;
        }
    }
}
