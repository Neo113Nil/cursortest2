package v2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.graphics.g;

/* renamed from: v2.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10195j {

    /* renamed from: v2.j$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f101705a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f101706b;

        @Deprecated
        public a(int i11, b[] bVarArr) {
            this.f101705a = i11;
            this.f101706b = bVarArr;
        }

        public final b[] a() {
            return this.f101706b;
        }

        public final int b() {
            return this.f101705a;
        }
    }

    /* renamed from: v2.j$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f101707a;

        /* renamed from: b, reason: collision with root package name */
        private final int f101708b;

        /* renamed from: c, reason: collision with root package name */
        private final int f101709c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f101710d;

        /* renamed from: e, reason: collision with root package name */
        private final int f101711e;

        @Deprecated
        public b(@NonNull Uri uri, int i11, int i12, boolean z11, int i13) {
            uri.getClass();
            this.f101707a = uri;
            this.f101708b = i11;
            this.f101709c = i12;
            this.f101710d = z11;
            this.f101711e = i13;
        }

        public final int a() {
            return this.f101711e;
        }

        public final int b() {
            return this.f101708b;
        }

        @NonNull
        public final Uri c() {
            return this.f101707a;
        }

        public final int d() {
            return this.f101709c;
        }

        public final boolean e() {
            return this.f101710d;
        }
    }

    /* renamed from: v2.j$c */
    public static class c {
    }

    @NonNull
    public static a a(@NonNull Context context, @NonNull C10190e c10190e) throws PackageManager.NameNotFoundException {
        return C10189d.a(context, c10190e);
    }

    public static Typeface b(@NonNull Context context, @NonNull C10190e c10190e, int i11, boolean z11, int i12, @NonNull Handler handler, @NonNull g.a aVar) {
        C10188c c10188c = new C10188c(aVar, handler);
        return z11 ? C10191f.c(context, c10190e, c10188c, i11, i12) : C10191f.b(context, c10190e, i11, c10188c);
    }
}
