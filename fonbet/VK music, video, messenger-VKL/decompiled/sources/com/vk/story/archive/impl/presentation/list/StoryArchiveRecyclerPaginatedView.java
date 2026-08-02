package com.vk.story.archive.impl.presentation.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import xsna.gzs;
import xsna.jai;
import xsna.s3q0;
import xsna.w69;

/* compiled from: StoryArchiveRecyclerPaginatedView.kt */
/* loaded from: classes6.dex */
public final class StoryArchiveRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public static final /* synthetic */ int P = 0;
    public gzs<s3q0> O;

    public StoryArchiveRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new jai(-188268599, new w69(this, 13), true));
        return composeView;
    }

    public final gzs<s3q0> getOpenCamera() {
        return this.O;
    }

    public final void setOpenCamera(gzs<s3q0> gzsVar) {
        this.O = gzsVar;
    }
}
