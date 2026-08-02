package F1;

import android.view.Surface;
import v1.C6628s;

/* renamed from: F1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1148j extends C6628s {

    /* renamed from: d, reason: collision with root package name */
    public final int f3332d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3333e;

    public C1148j(Throwable th2, v1.t tVar, Surface surface) {
        super(th2, tVar);
        this.f3332d = System.identityHashCode(surface);
        this.f3333e = surface == null || surface.isValid();
    }
}
