package f1;

import e1.AbstractC4134a;
import e1.J;
import e1.Z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: f1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4233k {

    /* renamed from: a, reason: collision with root package name */
    public final b f46286a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f46287b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f46288c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final PriorityQueue f46289d = new PriorityQueue();

    /* renamed from: e, reason: collision with root package name */
    public int f46290e = -1;

    /* renamed from: f, reason: collision with root package name */
    public a f46291f;

    /* renamed from: f1.k$a */
    public static final class a implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public long f46293b = -9223372036854775807L;

        /* renamed from: a, reason: collision with root package name */
        public final List f46292a = new ArrayList();

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f46293b, aVar.f46293b);
        }

        public void b(long j10, J j11) {
            AbstractC4134a.a(j10 != -9223372036854775807L);
            AbstractC4134a.g(this.f46292a.isEmpty());
            this.f46293b = j10;
            this.f46292a.add(j11);
        }
    }

    /* renamed from: f1.k$b */
    public interface b {
        void a(long j10, J j11);
    }

    public C4233k(b bVar) {
        this.f46286a = bVar;
    }

    public void a(long j10, J j11) {
        int i10 = this.f46290e;
        if (i10 == 0 || (i10 != -1 && this.f46289d.size() >= this.f46290e && j10 < ((a) Z.i((a) this.f46289d.peek())).f46293b)) {
            this.f46286a.a(j10, j11);
            return;
        }
        J c10 = c(j11);
        a aVar = this.f46291f;
        if (aVar != null && j10 == aVar.f46293b) {
            aVar.f46292a.add(c10);
            return;
        }
        a aVar2 = this.f46288c.isEmpty() ? new a() : (a) this.f46288c.pop();
        aVar2.b(j10, c10);
        this.f46289d.add(aVar2);
        this.f46291f = aVar2;
        int i11 = this.f46290e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f46289d.clear();
    }

    public final J c(J j10) {
        J j11 = this.f46287b.isEmpty() ? new J() : (J) this.f46287b.pop();
        j11.X(j10.a());
        System.arraycopy(j10.f(), j10.g(), j11.f(), 0, j11.a());
        return j11;
    }

    public void d() {
        e(0);
    }

    public final void e(int i10) {
        while (this.f46289d.size() > i10) {
            a aVar = (a) Z.i((a) this.f46289d.poll());
            for (int i11 = 0; i11 < aVar.f46292a.size(); i11++) {
                this.f46286a.a(aVar.f46293b, (J) aVar.f46292a.get(i11));
                this.f46287b.push((J) aVar.f46292a.get(i11));
            }
            aVar.f46292a.clear();
            a aVar2 = this.f46291f;
            if (aVar2 != null && aVar2.f46293b == aVar.f46293b) {
                this.f46291f = null;
            }
            this.f46288c.push(aVar);
        }
    }

    public int f() {
        return this.f46290e;
    }

    public void g(int i10) {
        AbstractC4134a.g(i10 >= 0);
        this.f46290e = i10;
        e(i10);
    }
}
