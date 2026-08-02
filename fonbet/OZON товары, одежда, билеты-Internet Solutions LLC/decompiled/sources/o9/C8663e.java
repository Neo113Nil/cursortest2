package o9;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o9.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8663e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f77809a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77810b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f77811c;

    /* renamed from: d, reason: collision with root package name */
    private final String f77812d;

    /* renamed from: e, reason: collision with root package name */
    private Object f77813e;

    /* renamed from: f, reason: collision with root package name */
    private final int f77814f;

    /* renamed from: g, reason: collision with root package name */
    private final int f77815g;

    public C8663e(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    public final List<byte[]> a() {
        return this.f77811c;
    }

    public final String b() {
        return this.f77812d;
    }

    public final Object c() {
        return this.f77813e;
    }

    public final byte[] d() {
        return this.f77809a;
    }

    public final int e() {
        return this.f77814f;
    }

    public final int f() {
        return this.f77815g;
    }

    public final String g() {
        return this.f77810b;
    }

    public final boolean h() {
        return this.f77814f >= 0 && this.f77815g >= 0;
    }

    public final void i(Object obj) {
        this.f77813e = obj;
    }

    public C8663e(byte[] bArr, String str, ArrayList arrayList, String str2, int i11, int i12) {
        this.f77809a = bArr;
        this.f77810b = str;
        this.f77811c = arrayList;
        this.f77812d = str2;
        this.f77814f = i12;
        this.f77815g = i11;
    }
}
