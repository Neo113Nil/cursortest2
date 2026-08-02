package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import xsna.f2a;

/* compiled from: DraftShortVideoStateMapper.kt */
/* loaded from: classes.dex */
public final class g implements f2a<DraftShortVideoListView.State> {
    @Override // xsna.f2a
    public final List<DraftShortVideoListView.State> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        String id = catalogBlockDto.getId();
        UserId q = catalogBlockDto.n1().q();
        if (q == null) {
            q = UserId.d;
        }
        return Collections.singletonList(new DraftShortVideoListView.State.LoadingState(id, catalogBlockVariant, q, null));
    }
}
