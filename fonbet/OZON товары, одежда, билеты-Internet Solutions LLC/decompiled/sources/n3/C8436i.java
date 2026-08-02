package n3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import m3.C8050C;
import m3.N;

/* renamed from: n3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8436i {

    /* renamed from: a, reason: collision with root package name */
    private final b f76458a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<C8050C> f76459b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f76460c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f76461d = new PriorityQueue<>();

    /* renamed from: e, reason: collision with root package name */
    private int f76462e = -1;

    /* renamed from: f, reason: collision with root package name */
    private a f76463f;

    /* renamed from: n3.i$a */
    /* loaded from: classes8.dex */
    private static final class a implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        public long f76465b = -9223372036854775807L;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f76464a = new ArrayList();

        public final void a(long j11, C8050C c8050c) {
            G10.a.c(j11 != -9223372036854775807L);
            ArrayList arrayList = this.f76464a;
            G10.a.h(arrayList.isEmpty());
            this.f76465b = j11;
            arrayList.add(c8050c);
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.f76465b, aVar.f76465b);
        }
    }

    /* renamed from: n3.i$b */
    public interface b {
        void c(long j11, C8050C c8050c);
    }

    public C8436i(b bVar) {
        this.f76458a = bVar;
    }

    private void d(int i11) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue<a> priorityQueue = this.f76461d;
            if (priorityQueue.size() <= i11) {
                return;
            }
            a poll = priorityQueue.poll();
            int i12 = N.f74289a;
            int i13 = 0;
            while (true) {
                int size = poll.f76464a.size();
                arrayList = poll.f76464a;
                if (i13 >= size) {
                    break;
                }
                this.f76458a.c(poll.f76465b, (C8050C) arrayList.get(i13));
                this.f76459b.push((C8050C) arrayList.get(i13));
                i13++;
            }
            arrayList.clear();
            a aVar = this.f76463f;
            if (aVar != null && aVar.f76465b == poll.f76465b) {
                this.f76463f = null;
            }
            this.f76460c.push(poll);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r8 < r0.f76465b) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j11, C8050C c8050c) {
        int i11 = this.f76462e;
        if (i11 != 0) {
            PriorityQueue<a> priorityQueue = this.f76461d;
            if (i11 != -1 && priorityQueue.size() >= this.f76462e) {
                a peek = priorityQueue.peek();
                int i12 = N.f74289a;
            }
            ArrayDeque<C8050C> arrayDeque = this.f76459b;
            C8050C c8050c2 = arrayDeque.isEmpty() ? new C8050C() : arrayDeque.pop();
            c8050c2.O(c8050c.a());
            System.arraycopy(c8050c.e(), c8050c.f(), c8050c2.e(), 0, c8050c2.a());
            a aVar = this.f76463f;
            if (aVar != null && j11 == aVar.f76465b) {
                aVar.f76464a.add(c8050c2);
                return;
            }
            ArrayDeque<a> arrayDeque2 = this.f76460c;
            a aVar2 = arrayDeque2.isEmpty() ? new a() : arrayDeque2.pop();
            aVar2.a(j11, c8050c2);
            priorityQueue.add(aVar2);
            this.f76463f = aVar2;
            int i13 = this.f76462e;
            if (i13 != -1) {
                d(i13);
                return;
            }
            return;
        }
        this.f76458a.c(j11, c8050c);
    }

    public final void b() {
        this.f76461d.clear();
    }

    public final void c() {
        d(0);
    }

    public final int e() {
        return this.f76462e;
    }

    public final void f(int i11) {
        G10.a.h(i11 >= 0);
        this.f76462e = i11;
        d(i11);
    }
}
