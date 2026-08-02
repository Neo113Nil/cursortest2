package jk0;

import android.os.Looper;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.L;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class p extends L {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet<I> f70180k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull j lifecycleOwner) {
        super(lifecycleOwner);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f70180k = new LinkedHashSet<>();
    }

    @Override // androidx.lifecycle.L, androidx.lifecycle.AbstractC5434v
    public final void a(@NotNull I observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (Looper.getMainLooper().isCurrentThread()) {
            super.a(observer);
            this.f70180k.add(observer);
        }
    }

    @Override // androidx.lifecycle.L, androidx.lifecycle.AbstractC5434v
    public final void e(@NotNull I observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (Looper.getMainLooper().isCurrentThread()) {
            super.e(observer);
            this.f70180k.remove(observer);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull p registry, @NotNull j lifecycleOwner) {
        this(lifecycleOwner);
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        if (registry.b() == AbstractC5434v.b.DESTROYED) {
            Iterator<I> it = registry.f70180k.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                I next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                a(next);
            }
        }
    }
}
