package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f29665a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f29666b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29667c;

    public b(AssetManager assetManager, String str) {
        this.f29666b = assetManager;
        this.f29665a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f29667c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object f10 = f(this.f29666b, this.f29665a);
            this.f29667c = f10;
            aVar.f(f10);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e10);
        }
    }

    public abstract Object f(AssetManager assetManager, String str);
}
