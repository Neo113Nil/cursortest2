package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C;

/* loaded from: classes10.dex */
public final class z extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f90763a;

    z(A a11) {
        this.f90763a = a11;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f7, float f11) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(e22, "e2");
        float x11 = motionEvent != null ? motionEvent.getX() - e22.getX() : f7;
        if (motionEvent != null) {
            f11 = motionEvent.getY() - e22.getY();
        }
        boolean z11 = Math.abs(x11) > Math.abs(f11);
        if (z11) {
            A a11 = this.f90763a;
            recyclerView = a11.f90414a;
            View findChildViewUnder = recyclerView.findChildViewUnder(e22.getX(), e22.getY());
            C c11 = null;
            if (findChildViewUnder != null) {
                recyclerView2 = a11.f90414a;
                Object childViewHolder = recyclerView2.getChildViewHolder(findChildViewUnder);
                if (childViewHolder instanceof C) {
                    c11 = (C) childViewHolder;
                }
            }
            if (f7 > 0.0f) {
                if (c11 != null) {
                    c11.a();
                    return z11;
                }
            } else if (f7 < 0.0f && c11 != null) {
                c11.b();
            }
        }
        return z11;
    }
}
