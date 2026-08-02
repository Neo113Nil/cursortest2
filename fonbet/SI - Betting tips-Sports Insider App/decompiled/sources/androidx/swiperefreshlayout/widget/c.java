package androidx.swiperefreshlayout.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f2643a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2644b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2645c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f2646d;

    /* renamed from: e, reason: collision with root package name */
    public float f2647e;

    /* renamed from: f, reason: collision with root package name */
    public float f2648f;

    /* renamed from: g, reason: collision with root package name */
    public float f2649g;

    /* renamed from: h, reason: collision with root package name */
    public float f2650h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2651i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public float f2652k;

    /* renamed from: l, reason: collision with root package name */
    public float f2653l;

    /* renamed from: m, reason: collision with root package name */
    public float f2654m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2655n;

    /* renamed from: o, reason: collision with root package name */
    public Path f2656o;

    /* renamed from: p, reason: collision with root package name */
    public float f2657p;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public int f2658r;

    /* renamed from: s, reason: collision with root package name */
    public int f2659s;

    /* renamed from: t, reason: collision with root package name */
    public int f2660t;

    /* renamed from: u, reason: collision with root package name */
    public int f2661u;

    public c() {
        Paint paint = new Paint();
        this.f2644b = paint;
        Paint paint2 = new Paint();
        this.f2645c = paint2;
        Paint paint3 = new Paint();
        this.f2646d = paint3;
        this.f2647e = 0.0f;
        this.f2648f = 0.0f;
        this.f2649g = 0.0f;
        this.f2650h = 5.0f;
        this.f2657p = 1.0f;
        this.f2660t = KotlinVersion.MAX_COMPONENT_VALUE;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i5) {
        this.j = i5;
        this.f2661u = this.f2651i[i5];
    }
}
