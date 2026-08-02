package com.vk.core.view.components.paging.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.components.paging.list.a;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.ee;
import xsna.tlo0;
import xsna.tq;
import xsna.uqu0;
import xsna.wfu0;

/* compiled from: VkRecyclerPaginatedView.kt */
/* loaded from: classes17.dex */
public class VkRecyclerPaginatedView extends RecyclerPaginatedView {
    public static final /* synthetic */ int N = 0;

    public VkRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.lists.AbstractPaginatedView
    public View c(Context context, AttributeSet attributeSet) {
        uqu0 uqu0Var = new uqu0(context, attributeSet, 4);
        uqu0Var.a(new a(null, new VkPlaceholder.b((tlo0) null, (tlo0) tq.h(tlo0.Companion, R.string.liblists_empty_list), (com.vk.core.compose.component.semantics.a) (0 == true ? 1 : 0), 11), null, 5));
        return uqu0Var;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public ee d(Context context, AttributeSet attributeSet) {
        VkErrorView vkErrorView = new VkErrorView(context, attributeSet, 4, 0);
        vkErrorView.c(a.C0851a.a(context, new wfu0(vkErrorView, 2)));
        return vkErrorView;
    }

    public VkRecyclerPaginatedView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
