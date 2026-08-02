package com.vk.newsfeed.posting.mediapicker.videovk.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.paging.list.a;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.newsfeed.posting.impl.R$styleable;
import com.vkontakte.android.R;
import xsna.ee;
import xsna.gzv;
import xsna.k990;
import xsna.oq;
import xsna.tlo0;
import xsna.tq;
import xsna.uqu0;

/* compiled from: PickerRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class PickerRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public static final /* synthetic */ int O = 0;

    public PickerRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            String string = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            uqu0 uqu0Var = new uqu0(context, attributeSet, 4);
            tlo0.a aVar = tlo0.Companion;
            aVar.getClass();
            if (string == null) {
                string = context.getString(R.string.liblists_empty_list);
            }
            uqu0Var.a(new a(null, new VkPlaceholder.b((tlo0) null, oq.d(aVar, string), b.a(null, new k990(4), 3), 3), null));
            return uqu0Var;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        VkErrorView vkErrorView = new VkErrorView(context, attributeSet, 4, 0);
        a a = a.C0851a.a(context, new gzv(vkErrorView, 29));
        vkErrorView.c(new a(a.a, new VkPlaceholder.b((tlo0) null, (tlo0) tq.h(tlo0.Companion, R.string.posting_common_network_error), (com.vk.core.compose.component.semantics.a) (0 == true ? 1 : 0), 11), a.c));
        return vkErrorView;
    }

    @Override // com.vk.lists.AbstractPaginatedView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int scrollState = getRecyclerView().getScrollState();
        if (motionEvent.getActionMasked() == 0 && scrollState == 2) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (!canScrollVertically(-1) || !canScrollVertically(1)) {
                getRecyclerView().stopScroll();
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
