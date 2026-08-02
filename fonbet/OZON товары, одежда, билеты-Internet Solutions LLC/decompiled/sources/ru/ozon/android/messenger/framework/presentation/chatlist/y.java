package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.view.MotionEvent;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class y extends RecyclerView.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GestureDetectorCompat f90762a;

    y(GestureDetectorCompat gestureDetectorCompat) {
        this.f90762a = gestureDetectorCompat;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e11, "e");
        return this.f90762a.a(e11);
    }
}
