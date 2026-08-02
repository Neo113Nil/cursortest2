package com.bumptech.glide.integration.webp;

import Ra.h;
import S5.e;
import S5.f;
import S5.g;
import T5.k;
import W5.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c6.C5749a;
import com.bumptech.glide.j;
import j6.AbstractC7289c;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends AbstractC7289c {
    @Override // j6.AbstractC7289c
    public final void registerComponents(Context context, com.bumptech.glide.c cVar, j jVar) {
        Resources resources = context.getResources();
        d c11 = cVar.c();
        W5.b b11 = cVar.b();
        S5.j jVar2 = new S5.j(jVar.e(), resources.getDisplayMetrics(), c11, b11);
        S5.a aVar = new S5.a(b11, c11);
        k cVar2 = new S5.c(jVar2);
        k fVar = new f(jVar2, b11);
        S5.d dVar = new S5.d(context, b11, c11);
        jVar.n(cVar2, ByteBuffer.class, Bitmap.class, "Bitmap");
        jVar.n(fVar, InputStream.class, Bitmap.class, "Bitmap");
        jVar.n(new C5749a(resources, cVar2), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.n(new C5749a(resources, fVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.n(new S5.b(aVar), ByteBuffer.class, Bitmap.class, "Bitmap");
        jVar.n(new e(aVar), InputStream.class, Bitmap.class, "Bitmap");
        jVar.n(dVar, ByteBuffer.class, S5.k.class, "legacy_prepend_all");
        jVar.n(new g(dVar, b11), InputStream.class, S5.k.class, "legacy_prepend_all");
        jVar.m(new h());
    }
}
