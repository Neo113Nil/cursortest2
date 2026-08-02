package gk0;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* loaded from: classes7.dex */
public interface r {
    @NotNull
    ConcurrentHashMap<Resources, ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>>> a();

    void b();

    @NotNull
    M c(@NotNull Context context);

    void d(@NotNull Context context);
}
