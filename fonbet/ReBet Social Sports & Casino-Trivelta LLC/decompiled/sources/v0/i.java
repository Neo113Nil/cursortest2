package v0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.v;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f66808a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66809b;

        /* renamed from: c, reason: collision with root package name */
        public final int f66810c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f66811d;

        /* renamed from: e, reason: collision with root package name */
        public final String f66812e;

        /* renamed from: f, reason: collision with root package name */
        public final int f66813f;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f66813f;
        }

        public String c() {
            if (i()) {
                return this.f66808a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.f66809b;
        }

        public Uri e() {
            return this.f66808a;
        }

        public String f() {
            return this.f66812e;
        }

        public int g() {
            return this.f66810c;
        }

        public boolean h() {
            return this.f66811d;
        }

        public boolean i() {
            return Objects.equals(this.f66808a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f66808a = (Uri) x0.f.g(uri);
            this.f66809b = i10;
            this.f66810c = i11;
            this.f66811d = z10;
            this.f66812e = str;
            this.f66813f = i12;
        }

        public b(String str, String str2) {
            this.f66808a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f66809b = 0;
            this.f66810c = 400;
            this.f66811d = false;
            this.f66812e = str2;
            this.f66813f = 0;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return v.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        List a10;
        a10 = g.a(new Object[]{eVar});
        return d.e(context, a10, cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C6594a c6594a = new C6594a(cVar, j.b(handler));
        if (!z10) {
            return h.d(context, list, i10, null, c6594a);
        }
        if (list.size() <= 1) {
            return h.e(context, (e) list.get(0), c6594a, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f66806a;

        /* renamed from: b, reason: collision with root package name */
        public final List f66807b;

        public a(int i10, b[] bVarArr) {
            this.f66806a = i10;
            this.f66807b = Collections.singletonList(bVarArr);
        }

        public static a a(int i10, List list) {
            return new a(i10, list);
        }

        public static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f66807b.get(0);
        }

        public List d() {
            return this.f66807b;
        }

        public int e() {
            return this.f66806a;
        }

        public boolean f() {
            return this.f66807b.size() > 1;
        }

        public a(int i10, List list) {
            this.f66806a = i10;
            this.f66807b = list;
        }
    }
}
