package bo.app;

import java.io.File;

/* loaded from: classes.dex */
public final class d7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25388a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25389b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25390c;

    /* renamed from: d, reason: collision with root package name */
    public j5 f25391d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25392e;

    /* renamed from: f, reason: collision with root package name */
    public final File f25393f;

    public d7(String str, int i10, File file) {
        this.f25388a = str;
        this.f25392e = i10;
        this.f25393f = file;
        this.f25389b = new long[i10];
    }

    public final File a(int i10) {
        return new File(this.f25393f, this.f25388a + "." + i10 + ".tmp");
    }
}
