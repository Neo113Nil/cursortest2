package ru.ozon.android.messenger.framework.presentation.chatlist;

import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MFragmentChatListBinding;

/* loaded from: classes10.dex */
public final class o extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f90511a;

    o(k kVar) {
        this.f90511a = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r6 != (r5 != null ? r5.topMargin : 0)) goto L22;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        boolean z11;
        boolean z12;
        MFragmentChatListBinding mFragmentChatListBinding;
        MFragmentChatListBinding mFragmentChatListBinding2;
        MFragmentChatListBinding mFragmentChatListBinding3;
        MFragmentChatListBinding mFragmentChatListBinding4;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        k kVar = this.f90511a;
        z11 = kVar.f90505n;
        if (z11) {
            return;
        }
        z12 = kVar.f90506o;
        if (z12) {
            return;
        }
        mFragmentChatListBinding = kVar.f90497f;
        boolean z13 = true;
        boolean canScrollVertically = mFragmentChatListBinding.chatListRv.canScrollVertically(1);
        mFragmentChatListBinding2 = kVar.f90497f;
        m.b B11 = mFragmentChatListBinding2.supportViewRoot.B(R$id.swipeTransition);
        if (!canScrollVertically) {
            if (!canScrollVertically) {
                mFragmentChatListBinding3 = kVar.f90497f;
                int top = mFragmentChatListBinding3.rootList.getTop();
                mFragmentChatListBinding4 = kVar.f90497f;
                SquircleLinearLayout rootList = mFragmentChatListBinding4.rootList;
                Intrinsics.checkNotNullExpressionValue(rootList, "rootList");
                ViewGroup.LayoutParams layoutParams = rootList.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            }
            z13 = false;
        }
        B11.D(z13);
    }
}
