package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f29687a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f29688b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29689c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f29688b = contentResolver;
        this.f29687a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f29689c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
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
    public final void e(com.bumptech.glide.h hVar, d.a aVar) {
        try {
            Object f10 = f(this.f29687a, this.f29688b);
            this.f29689c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e10);
        }
    }

    public abstract Object f(Uri uri, ContentResolver contentResolver);
}
