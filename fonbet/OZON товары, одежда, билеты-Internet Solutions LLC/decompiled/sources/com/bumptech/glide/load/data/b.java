package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f57620a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f57621b;

    /* renamed from: c, reason: collision with root package name */
    private T f57622c;

    public b(AssetManager assetManager, String str) {
        this.f57621b = assetManager;
        this.f57620a = str;
    }

    protected abstract void a(T t2) throws IOException;

    protected abstract T b(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        T t2 = this.f57622c;
        if (t2 == null) {
            return;
        }
        try {
            a(t2);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final T5.a getDataSource() {
        return T5.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super T> aVar) {
        try {
            T b11 = b(this.f57621b, this.f57620a);
            this.f57622c = b11;
            aVar.a(b11);
        } catch (IOException e11) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e11);
            }
            aVar.onLoadFailed(e11);
        }
    }
}
