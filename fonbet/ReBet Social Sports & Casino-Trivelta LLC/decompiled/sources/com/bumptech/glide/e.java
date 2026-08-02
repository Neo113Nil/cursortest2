package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.c;
import com.bumptech.glide.util.f;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final n f29559k = new b();

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f29560a;

    /* renamed from: b, reason: collision with root package name */
    public final f.b f29561b;

    /* renamed from: c, reason: collision with root package name */
    public final M4.g f29562c;

    /* renamed from: d, reason: collision with root package name */
    public final c.a f29563d;

    /* renamed from: e, reason: collision with root package name */
    public final List f29564e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f29565f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.k f29566g;

    /* renamed from: h, reason: collision with root package name */
    public final f f29567h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29568i;

    /* renamed from: j, reason: collision with root package name */
    public L4.h f29569j;

    public e(Context context, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, f.b bVar2, M4.g gVar, c.a aVar, Map map, List list, com.bumptech.glide.load.engine.k kVar, f fVar, int i10) {
        super(context.getApplicationContext());
        this.f29560a = bVar;
        this.f29562c = gVar;
        this.f29563d = aVar;
        this.f29564e = list;
        this.f29565f = map;
        this.f29566g = kVar;
        this.f29567h = fVar;
        this.f29568i = i10;
        this.f29561b = com.bumptech.glide.util.f.a(bVar2);
    }

    public M4.k a(ImageView imageView, Class cls) {
        return this.f29562c.a(imageView, cls);
    }

    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f29560a;
    }

    public List c() {
        return this.f29564e;
    }

    public synchronized L4.h d() {
        try {
            if (this.f29569j == null) {
                this.f29569j = (L4.h) this.f29563d.build().M();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f29569j;
    }

    public n e(Class cls) {
        n nVar = (n) this.f29565f.get(cls);
        if (nVar == null) {
            for (Map.Entry entry : this.f29565f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nVar = (n) entry.getValue();
                }
            }
        }
        return nVar == null ? f29559k : nVar;
    }

    public com.bumptech.glide.load.engine.k f() {
        return this.f29566g;
    }

    public f g() {
        return this.f29567h;
    }

    public int h() {
        return this.f29568i;
    }

    public j i() {
        return (j) this.f29561b.get();
    }
}
