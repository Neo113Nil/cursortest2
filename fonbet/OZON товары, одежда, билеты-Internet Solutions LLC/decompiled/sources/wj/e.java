package wj;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final long f104577a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104578b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f104579c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f104580d;

    /* renamed from: e, reason: collision with root package name */
    private final int f104581e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f104582f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f104583g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f104584h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f104585i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f104586j;

    /* renamed from: k, reason: collision with root package name */
    private final long f104587k;

    /* renamed from: l, reason: collision with root package name */
    private final long f104588l;

    public e(long j11, @NotNull String url, @NotNull String httpVersion, @NotNull String method, int i11, @NotNull String responseMessage, @NotNull String requestHeaders, @NotNull String responseHeaders, byte[] bArr, byte[] bArr2, long j12, long j13) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        this.f104577a = j11;
        this.f104578b = url;
        this.f104579c = httpVersion;
        this.f104580d = method;
        this.f104581e = i11;
        this.f104582f = responseMessage;
        this.f104583g = requestHeaders;
        this.f104584h = responseHeaders;
        this.f104585i = bArr;
        this.f104586j = bArr2;
        this.f104587k = j12;
        this.f104588l = j13;
    }

    public static e a(e eVar, long j11) {
        String url = eVar.f104578b;
        String httpVersion = eVar.f104579c;
        String method = eVar.f104580d;
        int i11 = eVar.f104581e;
        String responseMessage = eVar.f104582f;
        String requestHeaders = eVar.f104583g;
        String responseHeaders = eVar.f104584h;
        byte[] bArr = eVar.f104585i;
        byte[] bArr2 = eVar.f104586j;
        long j12 = eVar.f104587k;
        long j13 = eVar.f104588l;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        return new e(j11, url, httpVersion, method, i11, responseMessage, requestHeaders, responseHeaders, bArr, bArr2, j12, j13);
    }

    public final long b() {
        return this.f104577a;
    }

    @NotNull
    public final String c() {
        return this.f104579c;
    }

    @NotNull
    public final String d() {
        return this.f104580d;
    }

    public final byte[] e() {
        return this.f104585i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ozonLogger.android.harLogger.internal.HarLogEntity");
        e eVar = (e) obj;
        if (this.f104577a != eVar.f104577a || !Intrinsics.d(this.f104578b, eVar.f104578b) || !Intrinsics.d(this.f104579c, eVar.f104579c) || !Intrinsics.d(this.f104580d, eVar.f104580d) || this.f104581e != eVar.f104581e || !Intrinsics.d(this.f104582f, eVar.f104582f) || !Intrinsics.d(this.f104583g, eVar.f104583g) || !Intrinsics.d(this.f104584h, eVar.f104584h)) {
            return false;
        }
        byte[] bArr = eVar.f104585i;
        byte[] bArr2 = this.f104585i;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        byte[] bArr3 = eVar.f104586j;
        byte[] bArr4 = this.f104586j;
        if (bArr4 != null) {
            if (bArr3 == null || !Arrays.equals(bArr4, bArr3)) {
                return false;
            }
        } else if (bArr3 != null) {
            return false;
        }
        return this.f104587k == eVar.f104587k && this.f104588l == eVar.f104588l;
    }

    @NotNull
    public final String f() {
        return this.f104583g;
    }

    public final byte[] g() {
        return this.f104586j;
    }

    public final int h() {
        return this.f104581e;
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.a(G.g.a((G.g.a(G.g.a(G.g.a(Long.hashCode(this.f104577a) * 31, 31, this.f104578b), 31, this.f104579c), 31, this.f104580d) + this.f104581e) * 31, 31, this.f104582f), 31, this.f104583g), 31, this.f104584h);
        byte[] bArr = this.f104585i;
        int hashCode = (a11 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.f104586j;
        return Long.hashCode(this.f104588l) + Pk0.c.a((hashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31, 31, this.f104587k);
    }

    @NotNull
    public final String i() {
        return this.f104584h;
    }

    @NotNull
    public final String j() {
        return this.f104582f;
    }

    public final long k() {
        return this.f104588l;
    }

    public final long l() {
        return this.f104587k;
    }

    @NotNull
    public final String m() {
        return this.f104578b;
    }

    @NotNull
    public final String toString() {
        String arrays = Arrays.toString(this.f104585i);
        String arrays2 = Arrays.toString(this.f104586j);
        StringBuilder sb2 = new StringBuilder("HarLogEntity(countSession=");
        sb2.append(this.f104577a);
        sb2.append(", url=");
        sb2.append(this.f104578b);
        sb2.append(", httpVersion=");
        sb2.append(this.f104579c);
        sb2.append(", method=");
        sb2.append(this.f104580d);
        sb2.append(", responseCode=");
        sb2.append(this.f104581e);
        sb2.append(", responseMessage=");
        sb2.append(this.f104582f);
        sb2.append(", requestHeaders=");
        sb2.append(this.f104583g);
        sb2.append(", responseHeaders=");
        Nh.a.h(sb2, this.f104584h, ", requestBody=", arrays, ", responseBody=");
        sb2.append(arrays2);
        sb2.append(", time=");
        sb2.append(this.f104587k);
        sb2.append(", responseTime=");
        return P4.f.a(this.f104588l, ")", sb2);
    }
}
