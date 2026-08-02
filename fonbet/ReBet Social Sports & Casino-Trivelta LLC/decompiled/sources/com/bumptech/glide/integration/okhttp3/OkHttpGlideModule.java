package com.bumptech.glide.integration.okhttp3;

import B4.h;
import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.integration.okhttp3.b;
import com.bumptech.glide.j;
import java.io.InputStream;

@Deprecated
/* loaded from: classes.dex */
public class OkHttpGlideModule implements J4.b {
    @Override // J4.b
    public void a(Context context, d dVar) {
    }

    @Override // J4.b
    public void b(Context context, c cVar, j jVar) {
        jVar.r(h.class, InputStream.class, new b.a());
    }
}
