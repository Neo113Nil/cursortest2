package ru.ozon.app.android.stickyIslandSeparator;

import N10.h;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorDecoration;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.di.IslandSeparatorWidgetComponent;
import ru.ozon.app.android.islandSeparator.R$layout;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000f\u0010\u001f\"\u0004\b \u0010!R2\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R,\u00100\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'¨\u00063"}, d2 = {"Lru/ozon/app/android/stickyIslandSeparator/StickyIslandSeparatorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/di/IslandSeparatorWidgetComponent;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "item", "LN10/h;", "getStickyWidgetConfig", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;)LN10/h;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "stickyWidgetConfig", "LN10/h;", "()LN10/h;", "setStickyWidgetConfig", "(LN10/h;)V", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorViewHolder;", "holderProducer", "getHolderProducer", "Companion", "island-separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickyIslandSeparatorViewMapper extends WidgetViewMapper2<IslandSeparatorWidgetComponent, IslandSeparatorDTO, IslandSeparatorVO> {

    @NotNull
    private final Function2<View, ComposerReferences, IslandSeparatorViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<IslandSeparatorDTO, d, List<IslandSeparatorVO>> mapper;

    @NotNull
    private h stickyWidgetConfig;

    public StickyIslandSeparatorViewMapper() {
        Intrinsics.checkNotNullParameter("STICKY_TAG", "tag");
        this.stickyWidgetConfig = new h("STICKY_TAG", 6);
        this.mapper = new StickyIslandSeparatorViewMapper$mapper$1(this);
        this.layout = R$layout.pdp_widget_island_separator;
        this.holderProducer = StickyIslandSeparatorViewMapper$holderProducer$1.INSTANCE;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof IslandSeparatorDTO) && Intrinsics.d(((IslandSeparatorDTO) state).isSticky(), Boolean.TRUE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new IslandSeparatorDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, IslandSeparatorViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<IslandSeparatorDTO, d, List<IslandSeparatorVO>> getMapper() {
        return this.mapper;
    }

    public void setStickyWidgetConfig(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.stickyWidgetConfig = hVar;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<IslandSeparatorWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return IslandSeparatorWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public h getStickyWidgetConfig(@NotNull IslandSeparatorVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String b11 = getStickyWidgetConfig().b();
        String tag = item.getStickyGroupTag();
        if (tag != null && !Intrinsics.d(b11, tag)) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            setStickyWidgetConfig(new h(tag, 6));
        } else if (tag == null && !Intrinsics.d(b11, "STICKY_TAG")) {
            Intrinsics.checkNotNullParameter("STICKY_TAG", "tag");
            setStickyWidgetConfig(new h("STICKY_TAG", 6));
        }
        return getStickyWidgetConfig();
    }
}
