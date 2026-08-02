package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f57642a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f57643b;

    /* renamed from: c, reason: collision with root package name */
    private T f57644c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f57643b = contentResolver;
        this.f57642a = uri;
    }

    protected abstract void a(T t2) throws IOException;

    protected abstract Object b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        T t2 = this.f57644c;
        if (t2 != null) {
            try {
                a(t2);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final T5.a getDataSource() {
        return T5.a.LOCAL;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super T> aVar) {
        try {
            ?? r32 = (T) b(this.f57643b, this.f57642a);
            this.f57644c = r32;
            aVar.a(r32);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e11);
            }
            aVar.onLoadFailed(e11);
        }
    }
}
