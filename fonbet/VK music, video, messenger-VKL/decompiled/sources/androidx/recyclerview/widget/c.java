package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.m;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import xsna.uzz;

/* compiled from: AsyncDifferConfig.java */
/* loaded from: classes12.dex */
public final class c<T> {

    @Nullable
    public final Executor a;

    @NonNull
    public final Executor b;

    @NonNull
    public final m.e<T> c;

    /* compiled from: AsyncDifferConfig.java */
    public static final class a<T> {
        public static final Object a = new Object();
        public static ExecutorService b;
    }

    public c(@Nullable uzz uzzVar, @NonNull Executor executor, @NonNull m.e eVar) {
        this.a = uzzVar;
        this.b = executor;
        this.c = eVar;
    }
}
