package q3;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import m3.s;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f81450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81451b;

    /* renamed from: c, reason: collision with root package name */
    private final TreeSet<r> f81452c = new TreeSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f81453d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private m f81454e;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f81455a;

        /* renamed from: b, reason: collision with root package name */
        public final long f81456b;

        public a(long j11, long j12) {
            this.f81455a = j11;
            this.f81456b = j12;
        }
    }

    public j(int i11, String str, m mVar) {
        this.f81450a = i11;
        this.f81451b = str;
        this.f81454e = mVar;
    }

    public final void a(r rVar) {
        this.f81452c.add(rVar);
    }

    public final boolean b(l lVar) {
        this.f81454e = this.f81454e.a(lVar);
        return !r2.equals(r0);
    }

    public final long c(long j11, long j12) {
        G10.a.c(j11 >= 0);
        G10.a.c(j12 >= 0);
        r e11 = e(j11, j12);
        boolean z11 = e11.f81437d;
        long j13 = e11.f81436c;
        if (!z11) {
            return -Math.min(j13 != -1 ? j13 : Long.MAX_VALUE, j12);
        }
        long j14 = j11 + j12;
        long j15 = j14 >= 0 ? j14 : Long.MAX_VALUE;
        long j16 = e11.f81435b + j13;
        if (j16 < j15) {
            for (r rVar : this.f81452c.tailSet(e11, false)) {
                long j17 = rVar.f81435b;
                if (j17 > j16) {
                    break;
                }
                j16 = Math.max(j16, j17 + rVar.f81436c);
                if (j16 >= j15) {
                    break;
                }
            }
        }
        return Math.min(j16 - j11, j12);
    }

    public final m d() {
        return this.f81454e;
    }

    public final r e(long j11, long j12) {
        long j13 = j12;
        r rVar = new r(this.f81451b, j11, -1L, -9223372036854775807L, null);
        TreeSet<r> treeSet = this.f81452c;
        r floor = treeSet.floor(rVar);
        if (floor != null && floor.f81435b + floor.f81436c > j11) {
            return floor;
        }
        r ceiling = treeSet.ceiling(rVar);
        if (ceiling != null) {
            long j14 = ceiling.f81435b - j11;
            j13 = j13 == -1 ? j14 : Math.min(j14, j13);
        }
        return new r(this.f81451b, j11, j13, -9223372036854775807L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f81450a == jVar.f81450a && this.f81451b.equals(jVar.f81451b) && this.f81452c.equals(jVar.f81452c) && this.f81454e.equals(jVar.f81454e)) {
                return true;
            }
        }
        return false;
    }

    public final TreeSet<r> f() {
        return this.f81452c;
    }

    public final boolean g() {
        return this.f81452c.isEmpty();
    }

    public final boolean h(long j11, long j12) {
        int i11 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f81453d;
            if (i11 >= arrayList.size()) {
                return false;
            }
            a aVar = arrayList.get(i11);
            long j13 = aVar.f81456b;
            long j14 = aVar.f81455a;
            if (j13 == -1) {
                if (j11 >= j14) {
                    return true;
                }
            } else if (j12 != -1 && j14 <= j11 && j11 + j12 <= j14 + j13) {
                return true;
            }
            i11++;
        }
    }

    public final int hashCode() {
        return this.f81454e.hashCode() + G.g.a(this.f81450a * 31, 31, this.f81451b);
    }

    public final boolean i() {
        return this.f81453d.isEmpty();
    }

    public final boolean j(long j11, long j12) {
        int i11 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f81453d;
            if (i11 >= arrayList.size()) {
                arrayList.add(new a(j11, j12));
                return true;
            }
            a aVar = arrayList.get(i11);
            long j13 = aVar.f81455a;
            if (j13 > j11) {
                if (j12 == -1 || j11 + j12 > j13) {
                    break;
                }
                i11++;
            } else {
                long j14 = aVar.f81456b;
                if (j14 == -1 || j13 + j14 > j11) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final boolean k(h hVar) {
        if (!this.f81452c.remove(hVar)) {
            return false;
        }
        File file = hVar.f81438e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final r l(r rVar, long j11, boolean z11) {
        long j12;
        File file;
        TreeSet<r> treeSet = this.f81452c;
        G10.a.h(treeSet.remove(rVar));
        File file2 = rVar.f81438e;
        file2.getClass();
        if (z11) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            j12 = j11;
            File c11 = r.c(parentFile, this.f81450a, rVar.f81435b, j12);
            if (file2.renameTo(c11)) {
                file = c11;
                G10.a.h(rVar.f81437d);
                r rVar2 = new r(rVar.f81434a, rVar.f81435b, rVar.f81436c, j12, file);
                treeSet.add(rVar2);
                return rVar2;
            }
            s.f("CachedContent", "Failed to rename " + file2 + " to " + c11);
        } else {
            j12 = j11;
        }
        file = file2;
        G10.a.h(rVar.f81437d);
        r rVar22 = new r(rVar.f81434a, rVar.f81435b, rVar.f81436c, j12, file);
        treeSet.add(rVar22);
        return rVar22;
    }

    public final void m(long j11) {
        int i11 = 0;
        while (true) {
            ArrayList<a> arrayList = this.f81453d;
            if (i11 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (arrayList.get(i11).f81455a == j11) {
                arrayList.remove(i11);
                return;
            }
            i11++;
        }
    }
}
