package f1;

import e1.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4227e {

    /* renamed from: a, reason: collision with root package name */
    public final int f46175a;

    /* renamed from: f1.e$b */
    public static final class b extends AbstractC4227e {

        /* renamed from: b, reason: collision with root package name */
        public final long f46176b;

        /* renamed from: c, reason: collision with root package name */
        public final List f46177c;

        /* renamed from: d, reason: collision with root package name */
        public final List f46178d;

        public b(int i10, long j10) {
            super(i10);
            this.f46176b = j10;
            this.f46177c = new ArrayList();
            this.f46178d = new ArrayList();
        }

        public void b(b bVar) {
            this.f46178d.add(bVar);
        }

        public void c(c cVar) {
            this.f46177c.add(cVar);
        }

        public b d(int i10) {
            int size = this.f46178d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f46178d.get(i11);
                if (bVar.f46175a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i10) {
            int size = this.f46177c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) this.f46177c.get(i11);
                if (cVar.f46175a == i10) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // f1.AbstractC4227e
        public String toString() {
            return AbstractC4227e.a(this.f46175a) + " leaves: " + Arrays.toString(this.f46177c.toArray()) + " containers: " + Arrays.toString(this.f46178d.toArray());
        }
    }

    /* renamed from: f1.e$c */
    public static final class c extends AbstractC4227e {

        /* renamed from: b, reason: collision with root package name */
        public final J f46179b;

        public c(int i10, J j10) {
            super(i10);
            this.f46179b = j10;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f46175a);
    }

    public AbstractC4227e(int i10) {
        this.f46175a = i10;
    }
}
