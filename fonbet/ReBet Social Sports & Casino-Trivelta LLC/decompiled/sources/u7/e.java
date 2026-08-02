package u7;

import D6.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u7.c;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f66215e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f66216f = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: u7.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            e f10;
            f10 = e.f();
            return f10;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public int f66217a;

    /* renamed from: b, reason: collision with root package name */
    public List f66218b;

    /* renamed from: c, reason: collision with root package name */
    public final C6527a f66219c = new C6527a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f66220d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c b(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            return d().c(is);
        }

        public final c c(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            try {
                return b(is);
            } catch (IOException e10) {
                throw p.a(e10);
            }
        }

        public final e d() {
            return (e) e.f66216f.getValue();
        }

        public final int e(int i10, InputStream inputStream, byte[] bArr) {
            if (bArr.length < i10) {
                throw new IllegalStateException("Check failed.");
            }
            if (!inputStream.markSupported()) {
                return D6.a.b(inputStream, bArr, 0, i10);
            }
            try {
                inputStream.mark(i10);
                return D6.a.b(inputStream, bArr, 0, i10);
            } finally {
                inputStream.reset();
            }
        }

        public a() {
        }
    }

    public e() {
        h();
    }

    public static final c d(InputStream inputStream) {
        return f66215e.c(inputStream);
    }

    public static final e e() {
        return f66215e.d();
    }

    public static final e f() {
        return new e();
    }

    public final c c(InputStream is) {
        Intrinsics.checkNotNullParameter(is, "is");
        int i10 = this.f66217a;
        byte[] bArr = new byte[i10];
        int e10 = f66215e.e(i10, is, bArr);
        c a10 = this.f66219c.a(bArr, e10);
        if (Intrinsics.areEqual(a10, C6528b.f66208n) && !this.f66220d) {
            a10 = c.f66212d;
        }
        if (a10 != c.f66212d) {
            return a10;
        }
        List list = this.f66218b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c a11 = ((c.b) it.next()).a(bArr, e10);
                if (a11 != c.f66212d) {
                    return a11;
                }
            }
        }
        return c.f66212d;
    }

    public final e g(boolean z10) {
        this.f66220d = z10;
        return this;
    }

    public final void h() {
        this.f66217a = this.f66219c.b();
        List list = this.f66218b;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f66217a = Math.max(this.f66217a, ((c.b) it.next()).b());
            }
        }
    }
}
