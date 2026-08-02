package i1;

import java.io.File;

/* loaded from: classes.dex */
public abstract class i implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f47960a;

    /* renamed from: b, reason: collision with root package name */
    public final long f47961b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47962c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47963d;

    /* renamed from: e, reason: collision with root package name */
    public final File f47964e;

    /* renamed from: f, reason: collision with root package name */
    public final long f47965f;

    public i(String str, long j10, long j11, long j12, File file) {
        this.f47960a = str;
        this.f47961b = j10;
        this.f47962c = j11;
        this.f47963d = file != null;
        this.f47964e = file;
        this.f47965f = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        if (!this.f47960a.equals(iVar.f47960a)) {
            return this.f47960a.compareTo(iVar.f47960a);
        }
        long j10 = this.f47961b - iVar.f47961b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f47963d;
    }

    public boolean c() {
        return this.f47962c == -1;
    }

    public String toString() {
        return "[" + this.f47961b + ", " + this.f47962c + "]";
    }
}
