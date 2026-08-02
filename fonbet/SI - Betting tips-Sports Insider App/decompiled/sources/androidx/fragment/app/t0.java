package androidx.fragment.app;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class t0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f2087b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f2088c;

    /* renamed from: d, reason: collision with root package name */
    public final k1 f2089d;

    public t0(p0 context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f2086a = context;
        this.f2087b = context;
        this.f2088c = handler;
        this.f2089d = new k1();
    }
}
