package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import c20.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2ButtonsModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsVO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R,\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2ButtonsOverlayBaseViewMapper;", "Lc20/r;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2ButtonsModel;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2ButtonsModel;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lkotlin/Function2;", "mapper", "Lkotlin/jvm/functions/Function2;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class EmptyStateV2ButtonsOverlayBaseViewMapper extends r<EmptyStateV2ButtonsModel, EmptyStateV2ButtonsVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final Function2<EmptyStateV2ButtonsModel, d, List<EmptyStateV2ButtonsVO>> mapper = EmptyStateV2ButtonsOverlayBaseViewMapper$mapper$1.INSTANCE;

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<EmptyStateV2ButtonsVO> map(@NotNull EmptyStateV2ButtonsModel state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }
}
