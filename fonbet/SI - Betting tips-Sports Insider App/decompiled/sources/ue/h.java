package ue;

import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import ic.i0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final p0 f24257b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f24258c;

    /* renamed from: d, reason: collision with root package name */
    public final vc.a f24259d;

    public h() {
        p0 p0Var = new p0(null);
        this.f24257b = p0Var;
        this.f24258c = p0Var;
        this.f24259d = new vc.a();
    }

    public static boolean f(String str, WeakReference contextWeak) {
        Intrinsics.checkNotNullParameter(contextWeak, "contextWeak");
        if (str == null) {
            return false;
        }
        return zc.e.e(str, contextWeak, null);
    }

    public final void e(c0 c0Var) {
        this.f24257b.h(new i0(new ic.f(c0Var)));
    }
}
