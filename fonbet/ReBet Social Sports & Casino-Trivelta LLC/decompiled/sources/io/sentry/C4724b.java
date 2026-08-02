package io.sentry;

import java.util.concurrent.Callable;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.sentry.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4724b {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f51882a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f51883b;

    @Nullable
    private byte[] bytes;

    /* renamed from: c, reason: collision with root package name */
    public String f51884c;

    /* renamed from: d, reason: collision with root package name */
    public final String f51885d;

    /* renamed from: e, reason: collision with root package name */
    public final String f51886e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f51887f;

    /* renamed from: g, reason: collision with root package name */
    public String f51888g;

    public C4724b(byte[] bArr, String str, String str2, boolean z10) {
        this(bArr, str, str2, "event.attachment", z10);
    }

    public static C4724b a(Callable callable, String str, String str2, boolean z10) {
        return new C4724b(callable, str, str2, "event.attachment", z10);
    }

    public static C4724b b(byte[] bArr) {
        return new C4724b(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static C4724b c(byte[] bArr) {
        return new C4724b(bArr, "tombstone.pb", "application/x-protobuf", false);
    }

    public static C4724b d(io.sentry.protocol.G g10) {
        return new C4724b((G0) g10, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String e() {
        return this.f51888g;
    }

    public Callable f() {
        return this.f51883b;
    }

    public byte[] g() {
        return this.bytes;
    }

    public String h() {
        return this.f51886e;
    }

    public String i() {
        return this.f51885d;
    }

    public String j() {
        return this.f51884c;
    }

    public G0 k() {
        return this.f51882a;
    }

    public boolean l() {
        return this.f51887f;
    }

    public C4724b(byte[] bArr, String str, String str2, String str3, boolean z10) {
        this.bytes = bArr;
        this.f51882a = null;
        this.f51883b = null;
        this.f51885d = str;
        this.f51886e = str2;
        this.f51888g = str3;
        this.f51887f = z10;
    }

    public C4724b(G0 g02, String str, String str2, String str3, boolean z10) {
        this.bytes = null;
        this.f51882a = g02;
        this.f51883b = null;
        this.f51885d = str;
        this.f51886e = str2;
        this.f51888g = str3;
        this.f51887f = z10;
    }

    public C4724b(Callable callable, String str, String str2, String str3, boolean z10) {
        this.bytes = null;
        this.f51882a = null;
        this.f51883b = callable;
        this.f51885d = str;
        this.f51886e = str2;
        this.f51888g = str3;
        this.f51887f = z10;
    }
}
