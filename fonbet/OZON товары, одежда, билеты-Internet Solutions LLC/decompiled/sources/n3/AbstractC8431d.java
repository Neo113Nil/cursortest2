package n3;

import java.util.ArrayList;
import java.util.Arrays;
import m3.C8050C;

/* renamed from: n3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8431d {

    /* renamed from: a, reason: collision with root package name */
    public final int f76375a;

    /* renamed from: n3.d$a */
    public static final class a extends AbstractC8431d {

        /* renamed from: b, reason: collision with root package name */
        public final long f76376b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f76377c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f76378d;

        public a(int i11, long j11) {
            super(i11);
            this.f76376b = j11;
            this.f76377c = new ArrayList();
            this.f76378d = new ArrayList();
        }

        public final a b(int i11) {
            ArrayList arrayList = this.f76378d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = (a) arrayList.get(i12);
                if (aVar.f76375a == i11) {
                    return aVar;
                }
            }
            return null;
        }

        public final b c(int i11) {
            ArrayList arrayList = this.f76377c;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = (b) arrayList.get(i12);
                if (bVar.f76375a == i11) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // n3.AbstractC8431d
        public final String toString() {
            return AbstractC8431d.a(this.f76375a) + " leaves: " + Arrays.toString(this.f76377c.toArray()) + " containers: " + Arrays.toString(this.f76378d.toArray());
        }
    }

    /* renamed from: n3.d$b */
    public static final class b extends AbstractC8431d {

        /* renamed from: b, reason: collision with root package name */
        public final C8050C f76379b;

        public b(int i11, C8050C c8050c) {
            super(i11);
            this.f76379b = c8050c;
        }
    }

    AbstractC8431d(int i11) {
        this.f76375a = i11;
    }

    public static String a(int i11) {
        return "" + ((char) ((i11 >> 24) & 255)) + ((char) ((i11 >> 16) & 255)) + ((char) ((i11 >> 8) & 255)) + ((char) (i11 & 255));
    }

    public String toString() {
        return a(this.f76375a);
    }
}
