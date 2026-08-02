package ru.ozon.android.messenger.framework.presentation.chatlist;

import androidx.core.view.GestureDetectorCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;

/* loaded from: classes10.dex */
public final class A implements ru.ozon.android.messenger.framework.presentation.common.view.recycler.l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MessengerMetricsRecyclerView f90414a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<C> f90415b;

    public A(@NotNull MessengerMetricsRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f90414a = recyclerView;
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(recyclerView.getContext(), new z(this));
        recyclerView.addOnScrollListener(new x(this));
        recyclerView.addOnItemTouchListener(new y(gestureDetectorCompat));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.l
    public final void a(@NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        WeakReference<C> weakReference = this.f90415b;
        C c11 = weakReference != null ? weakReference.get() : null;
        if (holder.equals(c11)) {
            return;
        }
        if (c11 != null) {
            c11.b();
        }
        this.f90415b = new WeakReference<>(holder);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.l
    public final void b(@NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.r holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f90415b = null;
    }
}
