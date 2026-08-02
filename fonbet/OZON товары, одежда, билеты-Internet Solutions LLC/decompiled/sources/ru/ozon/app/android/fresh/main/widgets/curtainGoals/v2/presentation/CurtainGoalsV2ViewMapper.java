package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import Pc.a;
import android.view.View;
import h20.InterfaceC6786a;
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
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.data.CurtainGoalsV2DTO;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2Component;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R<\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0016j\b\u0012\u0004\u0012\u00020\u0004`\u00170\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u000e\u0012\n\b\u0001\u0012\u00060\u001dj\u0002`\u001e0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R0\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\"j\u0002`#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001b¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/di/CurtainGoalsV2Component;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/data/CurtainGoalsV2DTO;", "Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/presentation/CurtainGoalsV2VO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainGoalsV2ViewMapper extends WidgetViewMapper2<CurtainGoalsV2Component, CurtainGoalsV2DTO, CurtainGoalsV2VO> {
    private final int layout = R$layout.widget_curtain_goals_v2;

    @NotNull
    private final Function2<View, ComposerReferences, k<CurtainGoalsV2VO>> holderProducer = new CurtainGoalsV2ViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CurtainGoalsV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CurtainGoalsV2DTO, d, List<CurtainGoalsV2VO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CurtainGoalsV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CurtainGoalsV2Component.INSTANCE.create(storage);
    }
}
