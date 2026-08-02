package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.EmptyStateFullscreenDecoration;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2TopPartModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2FullViewMapper;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2BaseViewMapper;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "<init>", "(Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/EmptyStateFullscreenDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "", "dp16", "I", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2FullViewMapper extends EmptyStateV2BaseViewMapper {
    private final int dp16;

    @NotNull
    private final String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2FullViewMapper(@NotNull ActionHandlersFactory actionHandlersFactory) {
        super(actionHandlersFactory);
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        this.tag = "EMPTY_STATE_FULL_VIEW";
        this.dp16 = ResourceExtKt.toPx(16);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof EmptyStateV2TopPartModel) && ((EmptyStateV2TopPartModel) state).getSize() == EmptyStateV2DTO.EmptyStateSize.FULLSCREEN;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<EmptyStateFullscreenDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new EmptyStateFullscreenDecoration(getTag()));
    }

    @Override // ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2BaseViewMapper
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public EmptyStateView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmptyStateView emptyStateView = new EmptyStateView(context, null, 0, 0, 14, null);
        ViewExtKt.updatePadding$default(emptyStateView, 0, 0, 0, this.dp16, 7, null);
        emptyStateView.setLayoutParams(new ConstraintLayout.b(-1, 0));
        return emptyStateView;
    }
}
