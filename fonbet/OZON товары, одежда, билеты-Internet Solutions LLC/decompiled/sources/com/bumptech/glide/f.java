package com.bumptech.glide;

import S1.p;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import com.bumptech.glide.c;
import java.util.List;
import java.util.Map;
import m6.C8089b;
import m6.C8092e;
import p6.f;

/* loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final b f57570k = new b();

    /* renamed from: a, reason: collision with root package name */
    private final W5.i f57571a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b<j> f57572b;

    /* renamed from: c, reason: collision with root package name */
    private final p f57573c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f57574d;

    /* renamed from: e, reason: collision with root package name */
    private final List<l6.h<Object>> f57575e;

    /* renamed from: f, reason: collision with root package name */
    private final C5132a f57576f;

    /* renamed from: g, reason: collision with root package name */
    private final V5.l f57577g;

    /* renamed from: h, reason: collision with root package name */
    private final g f57578h;

    /* renamed from: i, reason: collision with root package name */
    private final int f57579i;

    /* renamed from: j, reason: collision with root package name */
    private l6.i f57580j;

    public f(@NonNull Context context, @NonNull W5.i iVar, @NonNull f.b bVar, @NonNull p pVar, @NonNull c.a aVar, @NonNull C5132a c5132a, @NonNull List list, @NonNull V5.l lVar, @NonNull g gVar, int i11) {
        super(context.getApplicationContext());
        this.f57571a = iVar;
        this.f57573c = pVar;
        this.f57574d = aVar;
        this.f57575e = list;
        this.f57576f = c5132a;
        this.f57577g = lVar;
        this.f57578h = gVar;
        this.f57579i = i11;
        this.f57572b = p6.f.a(bVar);
    }

    @NonNull
    public final m6.f a(@NonNull ImageView imageView, @NonNull Class cls) {
        this.f57573c.getClass();
        if (Bitmap.class.equals(cls)) {
            return new C8089b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C8092e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }

    @NonNull
    public final W5.b b() {
        return this.f57571a;
    }

    public final List<l6.h<Object>> c() {
        return this.f57575e;
    }

    public final synchronized l6.i d() {
        try {
            if (this.f57580j == null) {
                this.f57580j = this.f57574d.build().lock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f57580j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T> o<?, T> e(@NonNull Class<T> cls) {
        C5132a c5132a = this.f57576f;
        o<?, T> oVar = (o) c5132a.get(cls);
        if (oVar == null) {
            for (Map.Entry entry : c5132a.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    oVar = (o) entry.getValue();
                }
            }
        }
        return oVar == null ? f57570k : oVar;
    }

    @NonNull
    public final V5.l f() {
        return this.f57577g;
    }

    public final g g() {
        return this.f57578h;
    }

    public final int h() {
        return this.f57579i;
    }

    @NonNull
    public final j i() {
        return this.f57572b.get();
    }
}
