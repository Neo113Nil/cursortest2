package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import com.bumptech.glide.manager.n;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z.C6900a;
import z4.InterfaceC6925a;
import z4.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.engine.k f29510c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.load.engine.bitmap_recycle.d f29511d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.engine.bitmap_recycle.b f29512e;

    /* renamed from: f, reason: collision with root package name */
    public z4.h f29513f;

    /* renamed from: g, reason: collision with root package name */
    public A4.a f29514g;

    /* renamed from: h, reason: collision with root package name */
    public A4.a f29515h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC6925a.InterfaceC0980a f29516i;

    /* renamed from: j, reason: collision with root package name */
    public z4.i f29517j;

    /* renamed from: k, reason: collision with root package name */
    public com.bumptech.glide.manager.c f29518k;

    /* renamed from: n, reason: collision with root package name */
    public n.b f29521n;

    /* renamed from: o, reason: collision with root package name */
    public A4.a f29522o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29523p;

    /* renamed from: q, reason: collision with root package name */
    public List f29524q;

    /* renamed from: a, reason: collision with root package name */
    public final Map f29508a = new C6900a();

    /* renamed from: b, reason: collision with root package name */
    public final f.a f29509b = new f.a();

    /* renamed from: l, reason: collision with root package name */
    public int f29519l = 4;

    /* renamed from: m, reason: collision with root package name */
    public c.a f29520m = new a();

    public class a implements c.a {
        public a() {
        }

        @Override // com.bumptech.glide.c.a
        public L4.h build() {
            return new L4.h();
        }
    }

    public static final class b {
    }

    public static final class c {
    }

    public com.bumptech.glide.c a(Context context, List list, J4.a aVar) {
        if (this.f29514g == null) {
            this.f29514g = A4.a.m1();
        }
        if (this.f29515h == null) {
            this.f29515h = A4.a.A0();
        }
        if (this.f29522o == null) {
            this.f29522o = A4.a.w0();
        }
        if (this.f29517j == null) {
            this.f29517j = new i.a(context).a();
        }
        if (this.f29518k == null) {
            this.f29518k = new com.bumptech.glide.manager.e();
        }
        if (this.f29511d == null) {
            int b10 = this.f29517j.b();
            if (b10 > 0) {
                this.f29511d = new com.bumptech.glide.load.engine.bitmap_recycle.k(b10);
            } else {
                this.f29511d = new com.bumptech.glide.load.engine.bitmap_recycle.e();
            }
        }
        if (this.f29512e == null) {
            this.f29512e = new com.bumptech.glide.load.engine.bitmap_recycle.i(this.f29517j.a());
        }
        if (this.f29513f == null) {
            this.f29513f = new z4.g(this.f29517j.d());
        }
        if (this.f29516i == null) {
            this.f29516i = new z4.f(context);
        }
        if (this.f29510c == null) {
            this.f29510c = new com.bumptech.glide.load.engine.k(this.f29513f, this.f29516i, this.f29515h, this.f29514g, A4.a.y1(), this.f29522o, this.f29523p);
        }
        List list2 = this.f29524q;
        if (list2 == null) {
            this.f29524q = Collections.EMPTY_LIST;
        } else {
            this.f29524q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f29510c, this.f29513f, this.f29511d, this.f29512e, new com.bumptech.glide.manager.n(this.f29521n), this.f29518k, this.f29519l, this.f29520m, this.f29508a, this.f29524q, list, aVar, this.f29509b.b());
    }

    public void b(n.b bVar) {
        this.f29521n = bVar;
    }
}
