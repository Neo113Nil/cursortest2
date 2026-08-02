package e40;

import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6293a {

    /* renamed from: a, reason: collision with root package name */
    private final File f61990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f61991b;

    /* renamed from: c, reason: collision with root package name */
    private final String f61992c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f61993d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f61994e;

    /* renamed from: f, reason: collision with root package name */
    private final String f61995f;

    /* renamed from: g, reason: collision with root package name */
    private final String f61996g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f61997h;

    public C6293a() {
        this(null, null, null, null, null, null, false, 255);
    }

    public final String a() {
        return this.f61995f;
    }

    public final boolean b() {
        return this.f61993d;
    }

    public final List<String> c() {
        return this.f61994e;
    }

    public final File d() {
        return this.f61990a;
    }

    public final boolean e() {
        return this.f61997h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6293a)) {
            return false;
        }
        C6293a c6293a = (C6293a) obj;
        return Intrinsics.d(this.f61990a, c6293a.f61990a) && Intrinsics.d(this.f61991b, c6293a.f61991b) && Intrinsics.d(this.f61992c, c6293a.f61992c) && this.f61993d == c6293a.f61993d && Intrinsics.d(this.f61994e, c6293a.f61994e) && Intrinsics.d(this.f61995f, c6293a.f61995f) && Intrinsics.d(this.f61996g, c6293a.f61996g) && this.f61997h == c6293a.f61997h;
    }

    public final String f() {
        return this.f61992c;
    }

    public final String g() {
        return this.f61991b;
    }

    public final String h() {
        return this.f61996g;
    }

    public final int hashCode() {
        File file = this.f61990a;
        int hashCode = (file == null ? 0 : file.hashCode()) * 31;
        String str = this.f61991b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61992c;
        int a11 = C3532b.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f61993d);
        List<String> list = this.f61994e;
        int hashCode3 = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f61995f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61996g;
        return Boolean.hashCode(this.f61997h) + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraResults(photoFile=");
        sb2.append(this.f61990a);
        sb2.append(", qrResult=");
        sb2.append(this.f61991b);
        sb2.append(", qrRawData=");
        sb2.append(this.f61992c);
        sb2.append(", closedByUser=");
        sb2.append(this.f61993d);
        sb2.append(", phoneResult=");
        sb2.append(this.f61994e);
        sb2.append(", bankCardResult=");
        sb2.append(this.f61995f);
        sb2.append(", videoFileKey=");
        sb2.append(this.f61996g);
        sb2.append(", qrButtonTap=");
        return Pk0.a.a(")", sb2, this.f61997h);
    }

    public C6293a(File file, String str, String str2, List list, String str3, String str4, boolean z11, int i11) {
        file = (i11 & 1) != 0 ? null : file;
        str = (i11 & 2) != 0 ? null : str;
        str2 = (i11 & 4) != 0 ? null : str2;
        boolean z12 = (i11 & 8) == 0;
        list = (i11 & 16) != 0 ? null : list;
        str3 = (i11 & 32) != 0 ? null : str3;
        str4 = (i11 & 64) != 0 ? null : str4;
        z11 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11;
        this.f61990a = file;
        this.f61991b = str;
        this.f61992c = str2;
        this.f61993d = z12;
        this.f61994e = list;
        this.f61995f = str3;
        this.f61996g = str4;
        this.f61997h = z11;
    }
}
