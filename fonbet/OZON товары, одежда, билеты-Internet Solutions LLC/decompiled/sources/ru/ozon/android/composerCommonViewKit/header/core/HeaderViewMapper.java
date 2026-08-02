package ru.ozon.android.composerCommonViewKit.header.core;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderVO;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderView;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderViewHolder;
import ru.ozon.composer.ui.widget.g;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/android/composerCommonViewKit/header/core/HeaderViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "<init>", "(Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "Lru/ozon/android/composerCommonViewKit/header/core/HeaderMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/android/composerCommonViewKit/header/core/HeaderMapper;", "mapper", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderViewMapper extends g<HeaderDTO, HeaderVO> {

    @NotNull
    private final ActionHandlersFactory actionHandlersFactory;
    private final Integer layout;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    public HeaderViewMapper(@NotNull ActionHandlersFactory actionHandlersFactory) {
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        this.actionHandlersFactory = actionHandlersFactory;
        this.mapper = k.b(HeaderViewMapper$mapper$2.INSTANCE);
    }

    private final HeaderMapper getMapper() {
        return (HeaderMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof HeaderDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public ru.ozon.composer.ui.widget.k<HeaderVO> createHolder(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HeaderViewHolder((HeaderView) view, container.X(), this.actionHandlersFactory, container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new HeaderView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HeaderVO> map(@NotNull HeaderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
