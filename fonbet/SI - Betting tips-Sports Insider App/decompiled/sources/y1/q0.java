package y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f25609b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f25610c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f25611d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f25612e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f25613f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f25614g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f25615h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f25616i;
    public static final e j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f25617k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f25618l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f25619m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f25620n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f25621o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f25622p;
    public static final e q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25623a;

    static {
        boolean z5 = false;
        f25609b = new f(2, z5);
        int i5 = 4;
        f25610c = new f(i5, z5);
        boolean z7 = true;
        f25611d = new e(i5, z7);
        f25612e = new e(5, z7);
        f25613f = new f(3, z5);
        f25614g = new e(6, z7);
        f25615h = new e(7, z7);
        f25616i = new f(1, z5);
        j = new e(2, z7);
        f25617k = new e(3, z7);
        int i10 = 0;
        f25618l = new f(i10, z5);
        f25619m = new e(i10, z7);
        f25620n = new e(1, z7);
        f25621o = new f(5, z7);
        f25622p = new e(8, z7);
        q = new e(9, z7);
    }

    public q0(boolean z5) {
        this.f25623a = z5;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return d(value);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
