package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f2253a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f2254b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f2255c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f2256d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f2257e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x[] f2258f;

    static {
        x xVar = new x("DESTROYED", 0);
        f2253a = xVar;
        x xVar2 = new x("INITIALIZED", 1);
        f2254b = xVar2;
        x xVar3 = new x("CREATED", 2);
        f2255c = xVar3;
        x xVar4 = new x("STARTED", 3);
        f2256d = xVar4;
        x xVar5 = new x("RESUMED", 4);
        f2257e = xVar5;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5};
        f2258f = xVarArr;
        com.google.android.play.core.appupdate.b.l(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f2258f.clone();
    }

    public final boolean a(x state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
