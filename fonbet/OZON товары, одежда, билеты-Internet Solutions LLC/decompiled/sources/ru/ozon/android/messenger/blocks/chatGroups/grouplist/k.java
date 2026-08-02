package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import android.os.Parcelable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class k implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f84723a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RecyclerView f84724b;

    k(RecyclerView recyclerView) {
        this.f84724b = recyclerView;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        LinearLayoutManager linearLayoutManager = this.f84723a;
        j.f84714l = linearLayoutManager != null ? linearLayoutManager.onSaveInstanceState() : null;
        this.f84723a = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(J owner) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(owner, "owner");
        RecyclerView recyclerView = this.f84724b;
        Intrinsics.f(recyclerView);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        this.f84723a = linearLayoutManager;
        parcelable = j.f84714l;
        linearLayoutManager.onRestoreInstanceState(parcelable);
    }
}
