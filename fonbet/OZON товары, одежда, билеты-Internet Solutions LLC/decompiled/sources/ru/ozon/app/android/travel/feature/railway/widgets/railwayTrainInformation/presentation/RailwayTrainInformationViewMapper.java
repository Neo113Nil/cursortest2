package ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation;

import android.view.View;
import android.view.ViewGroup;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.railway.R$layout;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.data.RailwayTrainInformationDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.di.RailwayTrainInformationComponent;
import ru.ozon.app.android.travel.utils.utils.ClipChildrenPageModifier;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\t0\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R0\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060&j\u0002`'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040(0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/di/RailwayTrainInformationComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RailwayTrainInformationViewMapper extends WidgetViewMapper2<RailwayTrainInformationComponent, RailwayTrainInformationDTO, RailwayTrainInformationVO> {
    private final int layout = R$layout.widget_railway_train_information;

    @NotNull
    private final Function2<View, ComposerReferences, RailwayTrainInformationWidgetViewHolder> holderProducer = new RailwayTrainInformationViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        super.constructLayout(composerRootView, viewObject, references, voHelper);
        new ClipChildrenPageModifier().clipChildrenComposerRV(composerRootView);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, RailwayTrainInformationWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<RailwayTrainInformationDTO, d, List<RailwayTrainInformationVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<RailwayTrainInformationComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return RailwayTrainInformationComponent.INSTANCE.create(storage);
    }
}
