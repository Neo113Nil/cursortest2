package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: DataRewinder.java */
/* loaded from: classes12.dex */
public interface a<T> {

    /* compiled from: DataRewinder.java */
    /* renamed from: com.bumptech.glide.load.data.a$a, reason: collision with other inner class name */
    public interface InterfaceC0098a<T> {
        @NonNull
        Class<T> b();

        @NonNull
        a<T> build(@NonNull T t);
    }

    void a();

    @NonNull
    T b() throws IOException;
}
