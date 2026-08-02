package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface d<T> {

    public interface a<T> {
        void a(T t2);

        void onLoadFailed(@NonNull Exception exc);
    }

    void cancel();

    void cleanup();

    @NonNull
    Class<T> getDataClass();

    @NonNull
    T5.a getDataSource();

    void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull a<? super T> aVar);
}
