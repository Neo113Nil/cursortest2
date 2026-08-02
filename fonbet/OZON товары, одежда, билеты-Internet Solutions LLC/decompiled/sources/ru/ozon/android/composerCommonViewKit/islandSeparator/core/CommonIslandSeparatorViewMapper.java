package ru.ozon.android.composerCommonViewKit.islandSeparator.core;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.R$layout;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorDecoration;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorViewHolder;
import ru.ozon.composer.ui.widget.g;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/android/composerCommonViewKit/islandSeparator/core/CommonIslandSeparatorViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "state", "Ll20/d;", "info", "map", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/IslandSeparatorMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/core/IslandSeparatorMapper;", "mapper", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonIslandSeparatorViewMapper extends g<IslandSeparatorDTO, IslandSeparatorVO> {
    private final int layout = R$layout.pdp_widget_island_separator;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(CommonIslandSeparatorViewMapper$mapper$2.INSTANCE);

    private final IslandSeparatorMapper getMapper() {
        return (IslandSeparatorMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof IslandSeparatorDTO)) {
            return false;
        }
        IslandSeparatorDTO islandSeparatorDTO = (IslandSeparatorDTO) state;
        Boolean isSticky = islandSeparatorDTO.isSticky();
        Boolean bool = Boolean.TRUE;
        return (Intrinsics.d(isSticky, bool) || Intrinsics.d(islandSeparatorDTO.isOverlay(), bool)) ? false : true;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public ru.ozon.composer.ui.widget.k<IslandSeparatorVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new IslandSeparatorViewHolder(view);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new IslandSeparatorDecoration());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<IslandSeparatorVO> map(@NotNull IslandSeparatorDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
