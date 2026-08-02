package com.vk.catalog2.common.ui.holders.search;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.lists.RecyclerPaginatedView;
import java.util.List;
import xsna.g380;
import xsna.rda;

/* compiled from: CommonSearchResultsVh.kt */
/* loaded from: classes16.dex */
public interface CommonSearchResultsVh extends CatalogViewHolder, rda, g380, ResumableViewHolder {
    View H8();

    /* renamed from: O0 */
    List<UIBlock> mo78O0();

    String V();

    RecyclerPaginatedView ck();

    void setOnTouchListener(View.OnTouchListener onTouchListener);
}
