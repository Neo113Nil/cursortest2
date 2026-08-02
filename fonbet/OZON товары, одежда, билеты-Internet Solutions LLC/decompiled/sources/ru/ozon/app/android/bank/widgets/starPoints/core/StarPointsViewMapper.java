package ru.ozon.app.android.bank.widgets.starPoints.core;

import AB.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.bank.widgets.starPoints.data.StarPointsDTO;
import ru.ozon.app.android.bank.widgets.starPoints.di.DaggerStarPointsComponent;
import ru.ozon.app.android.bank.widgets.starPoints.di.StarPointsComponent;
import ru.ozon.app.android.bank.widgets.starPoints.presentation.StarPointsVO;
import ru.ozon.app.android.bank.widgets.starPoints.presentation.StarPointsView;
import ru.ozon.app.android.bank.widgets.starPoints.presentation.StarPointsWidgetVH;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R6\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"Lru/ozon/app/android/bank/widgets/starPoints/core/StarPointsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/bank/widgets/starPoints/di/StarPointsComponent;", "Lru/ozon/app/android/bank/widgets/starPoints/data/StarPointsDTO;", "Lru/ozon/app/android/bank/widgets/starPoints/presentation/StarPointsVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/bank/widgets/starPoints/presentation/StarPointsWidgetVH;", "holderProducer", "getHolderProducer", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StarPointsViewMapper extends WidgetViewMapper2<StarPointsComponent, StarPointsDTO, StarPointsVO> {
    private final Integer layout;

    @NotNull
    private final Function2<StarPointsDTO, d, List<StarPointsVO>> mapper = new StarPointsMapper();

    @NotNull
    private final Function2<View, ComposerReferences, StarPointsWidgetVH> holderProducer = StarPointsViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final StarPointsComponent widgetComponent$lambda$1(C7475g c7475g) {
        return DaggerStarPointsComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        StarPointsView starPointsView = (StarPointsView) q.f64554a.i(N.b(StarPointsView.class), parent.getContext());
        if (starPointsView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            starPointsView = new StarPointsView(context, null, 0, 0, 14, null);
        }
        starPointsView.setId(R$id.starPointContainerCl);
        starPointsView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return starPointsView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, StarPointsWidgetVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<StarPointsDTO, d, List<StarPointsVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StarPointsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(StarPointsComponent.class), new b(storage, 2));
    }
}
