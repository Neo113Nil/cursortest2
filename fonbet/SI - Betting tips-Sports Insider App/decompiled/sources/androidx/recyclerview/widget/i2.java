package androidx.recyclerview.widget;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2430a;

    /* renamed from: b, reason: collision with root package name */
    public int f2431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2432c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2433d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2434e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2436g;

    public i2(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2436g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2430a = -1;
        this.f2431b = Integer.MIN_VALUE;
        this.f2432c = false;
        this.f2433d = false;
        this.f2434e = false;
        int[] iArr = this.f2435f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
