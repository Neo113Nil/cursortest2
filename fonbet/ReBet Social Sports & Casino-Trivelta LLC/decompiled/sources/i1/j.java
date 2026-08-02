package i1;

import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f47966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47967b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet f47968c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f47969d;

    /* renamed from: e, reason: collision with root package name */
    public n f47970e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f47971a;

        /* renamed from: b, reason: collision with root package name */
        public final long f47972b;

        public a(long j10, long j11) {
            this.f47971a = j10;
            this.f47972b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f47972b;
            if (j12 == -1) {
                return j10 >= this.f47971a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f47971a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f47971a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f47972b;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public j(int i10, String str) {
        this(i10, str, n.f47992c);
    }

    public void a(s sVar) {
        this.f47968c.add(sVar);
    }

    public boolean b(m mVar) {
        this.f47970e = this.f47970e.g(mVar);
        return !r2.equals(r0);
    }

    public n c() {
        return this.f47970e;
    }

    public s d(long j10, long j11) {
        s h10 = s.h(this.f47967b, j10);
        s sVar = (s) this.f47968c.floor(h10);
        if (sVar != null && sVar.f47961b + sVar.f47962c > j10) {
            return sVar;
        }
        s sVar2 = (s) this.f47968c.ceiling(h10);
        if (sVar2 != null) {
            long j12 = sVar2.f47961b - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return s.g(this.f47967b, j10, j11);
    }

    public TreeSet e() {
        return this.f47968c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f47966a == jVar.f47966a && this.f47967b.equals(jVar.f47967b) && this.f47968c.equals(jVar.f47968c) && this.f47970e.equals(jVar.f47970e)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f47968c.isEmpty();
    }

    public boolean g(long j10, long j11) {
        for (int i10 = 0; i10 < this.f47969d.size(); i10++) {
            if (((a) this.f47969d.get(i10)).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f47969d.isEmpty();
    }

    public int hashCode() {
        return (((this.f47966a * 31) + this.f47967b.hashCode()) * 31) + this.f47970e.hashCode();
    }

    public boolean i(long j10, long j11) {
        for (int i10 = 0; i10 < this.f47969d.size(); i10++) {
            if (((a) this.f47969d.get(i10)).b(j10, j11)) {
                return false;
            }
        }
        this.f47969d.add(new a(j10, j11));
        return true;
    }

    public boolean j(i iVar) {
        if (!this.f47968c.remove(iVar)) {
            return false;
        }
        File file = iVar.f47964e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public s k(s sVar, long j10, boolean z10) {
        long j11;
        AbstractC4134a.g(this.f47968c.remove(sVar));
        File file = (File) AbstractC4134a.e(sVar.f47964e);
        if (z10) {
            j11 = j10;
            File i10 = s.i((File) AbstractC4134a.e(file.getParentFile()), this.f47966a, sVar.f47961b, j11);
            if (file.renameTo(i10)) {
                file = i10;
            } else {
                AbstractC4156x.i("CachedContent", "Failed to rename " + file + " to " + i10);
            }
        } else {
            j11 = j10;
        }
        s d10 = sVar.d(file, j11);
        this.f47968c.add(d10);
        return d10;
    }

    public void l(long j10) {
        for (int i10 = 0; i10 < this.f47969d.size(); i10++) {
            if (((a) this.f47969d.get(i10)).f47971a == j10) {
                this.f47969d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public j(int i10, String str, n nVar) {
        this.f47966a = i10;
        this.f47967b = str;
        this.f47970e = nVar;
        this.f47968c = new TreeSet();
        this.f47969d = new ArrayList();
    }
}
