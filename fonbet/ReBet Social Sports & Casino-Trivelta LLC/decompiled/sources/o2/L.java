package o2;

import android.util.SparseArray;
import e1.Q;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface L {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f58980a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58981b;
        public final byte[] initializationData;

        public a(String str, int i10, byte[] bArr) {
            this.f58980a = str;
            this.f58981b = i10;
            this.initializationData = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f58982a;

        /* renamed from: b, reason: collision with root package name */
        public final String f58983b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58984c;

        /* renamed from: d, reason: collision with root package name */
        public final List f58985d;
        public final byte[] descriptorBytes;

        public b(int i10, String str, int i11, List list, byte[] bArr) {
            this.f58982a = i10;
            this.f58983b = str;
            this.f58984c = i11;
            this.f58985d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.descriptorBytes = bArr;
        }

        public int a() {
            int i10 = this.f58984c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        L a(int i10, b bVar);

        SparseArray b();
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f58986a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58987b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58988c;

        /* renamed from: d, reason: collision with root package name */
        public int f58989d;

        /* renamed from: e, reason: collision with root package name */
        public String f58990e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public void a() {
            int i10 = this.f58989d;
            this.f58989d = i10 == Integer.MIN_VALUE ? this.f58987b : i10 + this.f58988c;
            this.f58990e = this.f58986a + this.f58989d;
        }

        public String b() {
            d();
            return this.f58990e;
        }

        public int c() {
            d();
            return this.f58989d;
        }

        public final void d() {
            if (this.f58989d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f58986a = str;
            this.f58987b = i11;
            this.f58988c = i12;
            this.f58989d = Integer.MIN_VALUE;
            this.f58990e = "";
        }
    }

    void a(e1.J j10, int i10);

    void b();

    void c(Q q10, H1.r rVar, d dVar);
}
