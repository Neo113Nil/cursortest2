package ru.ozon.app.android.returns.creation.widgets.steps.viewMapper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import k20.C7471c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.steps.data.ReturnCreationStepsDTO;
import ru.ozon.app.android.returns.creation.widgets.steps.data.Step;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewHolder.ReturnCreationStepsView;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject.ReturnCreationStepsVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R2\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/steps/viewMapper/ReturnCreationStepsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/returns/creation/widgets/steps/data/ReturnCreationStepsDTO;", "Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/ReturnCreationStepsVO;", "<init>", "()V", "Ll20/d;", "info", "toVo", "(Lru/ozon/app/android/returns/creation/widgets/steps/data/ReturnCreationStepsDTO;Ll20/d;)Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/ReturnCreationStepsVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "mapper", "getMapper", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationStepsViewMapper extends WidgetViewMapper2 {
    private final Integer layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<ReturnCreationStepsVO>> holderProducer = ReturnCreationStepsViewMapper$holderProducer$1.INSTANCE;

    @NotNull
    private final Function2<ReturnCreationStepsDTO, d, List<ReturnCreationStepsVO>> mapper = new ReturnCreationStepsViewMapper$mapper$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final ReturnCreationStepsVO toVo(ReturnCreationStepsDTO returnCreationStepsDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        List<Step> steps = returnCreationStepsDTO.getSteps();
        ArrayList arrayList = new ArrayList(C7714v.z(steps, 10));
        for (Step step : steps) {
            arrayList.add(new ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject.Step(step.getIcon(), step.getText(), step.getAction()));
        }
        return new ReturnCreationStepsVO(hashCode, arrayList, returnCreationStepsDTO.getSeparatorColor(), returnCreationStepsDTO.getBackgroundColor());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ReturnCreationStepsView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ReturnCreationStepsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ReturnCreationStepsDTO, d, List<ReturnCreationStepsVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
