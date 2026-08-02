package ru.ozon.app.android.search.widgets.insight.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.insight.data.InsightDTO;
import ru.ozon.app.android.search.widgets.insight.di.InsightWidgetComponent;
import ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModel;
import ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightViewModelImpl;
import ru.ozon.app.android.search.widgets.insight.presentation.InsightWidgetVO;
import ru.ozon.app.android.search.widgets.insight.presentation.InsightWidgetView;
import ru.ozon.app.android.search.widgets.insight.presentation.InsightWidgetViewHolder;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/core/InsightViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/search/widgets/insight/data/InsightDTO;", "Lru/ozon/app/android/search/widgets/insight/presentation/InsightWidgetVO;", "Lru/ozon/app/android/search/widgets/insight/di/InsightWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/search/widgets/insight/di/InsightWidgetComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/search/widgets/insight/data/InsightDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/search/widgets/insight/di/InsightWidgetComponent;", "Lru/ozon/app/android/search/widgets/insight/core/InsightMapper;", "mapper", "Lru/ozon/app/android/search/widgets/insight/core/InsightMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsightViewMapper extends g<InsightDTO, InsightWidgetVO> {

    @NotNull
    private final InsightWidgetComponent component;

    @NotNull
    private final InsightMapper mapper;

    public InsightViewMapper(@NotNull InsightWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<InsightWidgetVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new InsightWidgetViewHolder((InsightWidgetView) view, container, (DeleteSearchInsightViewModel) new z0(container.a0().b(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.insight.core.InsightViewMapper$createHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                InsightWidgetComponent insightWidgetComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                insightWidgetComponent = InsightViewMapper.this.component;
                DeleteSearchInsightViewModelImpl viewModel = insightWidgetComponent.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(DeleteSearchInsightViewModelImpl.class));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InsightWidgetView insightWidgetView = new InsightWidgetView(context, null, 0, 0, 14, null);
        insightWidgetView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return insightWidgetView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<InsightWidgetVO> map(@NotNull InsightDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }
}
