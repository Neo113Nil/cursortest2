package jk0;

import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h<T extends j> implements g<T> {
    @Override // jk0.g
    @NotNull
    public final f<T> a(RecyclerView.o oVar, @NotNull J containerViewLifecycleOwner, M10.a aVar) {
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        if (oVar instanceof b) {
            return new C7435a(containerViewLifecycleOwner, aVar);
        }
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        return new m(containerViewLifecycleOwner);
    }
}
