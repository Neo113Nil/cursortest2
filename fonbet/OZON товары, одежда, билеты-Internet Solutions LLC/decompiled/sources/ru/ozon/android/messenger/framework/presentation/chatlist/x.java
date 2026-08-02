package ru.ozon.android.messenger.framework.presentation.chatlist;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C;

/* loaded from: classes10.dex */
public final class x extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f90761a;

    x(A a11) {
        this.f90761a = a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r1.f90761a.f90415b;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        WeakReference weakReference;
        C c11;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i11 != 1 || weakReference == null || (c11 = (C) weakReference.get()) == null) {
            return;
        }
        c11.b();
    }
}
