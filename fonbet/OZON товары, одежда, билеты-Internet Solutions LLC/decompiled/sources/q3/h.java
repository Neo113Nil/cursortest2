package q3;

import java.io.File;

/* loaded from: classes.dex */
public class h implements Comparable<h> {

    /* renamed from: a, reason: collision with root package name */
    public final String f81434a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81435b;

    /* renamed from: c, reason: collision with root package name */
    public final long f81436c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f81437d;

    /* renamed from: e, reason: collision with root package name */
    public final File f81438e;

    /* renamed from: f, reason: collision with root package name */
    public final long f81439f;

    public h(String str, long j11, long j12, long j13, File file) {
        this.f81434a = str;
        this.f81435b = j11;
        this.f81436c = j12;
        this.f81437d = file != null;
        this.f81438e = file;
        this.f81439f = j13;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        String str = hVar.f81434a;
        String str2 = this.f81434a;
        if (!str2.equals(str)) {
            return str2.compareTo(hVar.f81434a);
        }
        long j11 = this.f81435b - hVar.f81435b;
        if (j11 == 0) {
            return 0;
        }
        return j11 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f81435b);
        sb2.append(", ");
        return P4.f.a(this.f81436c, "]", sb2);
    }
}
