package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/e0;", "<init>", "()V", "androidx/lifecycle/s0", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final ProcessLifecycleOwner f2124i = new ProcessLifecycleOwner();

    /* renamed from: a, reason: collision with root package name */
    public int f2125a;

    /* renamed from: b, reason: collision with root package name */
    public int f2126b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f2129e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2127c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2128d = true;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f2130f = new g0(this);

    /* renamed from: g, reason: collision with root package name */
    public final aa.c f2131g = new aa.c(3, this);

    /* renamed from: h, reason: collision with root package name */
    public final n1 f2132h = new n1(this);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i5 = this.f2126b + 1;
        this.f2126b = i5;
        if (i5 == 1) {
            if (this.f2127c) {
                this.f2130f.e(w.ON_RESUME);
                this.f2127c = false;
            } else {
                Handler handler = this.f2129e;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.f2131g);
            }
        }
    }

    @Override // androidx.lifecycle.e0
    public final y getLifecycle() {
        return this.f2130f;
    }
}
