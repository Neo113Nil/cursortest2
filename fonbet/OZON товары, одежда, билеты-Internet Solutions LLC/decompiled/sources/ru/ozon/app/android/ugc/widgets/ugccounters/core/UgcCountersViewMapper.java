package ru.ozon.app.android.ugc.widgets.ugccounters.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO;
import ru.ozon.app.android.ugc.widgets.ugccounters.di.UgcCountersComponent;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImagesPreCreationConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersLlViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersRvViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR2\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R,\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040%0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/core/UgcCountersViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/ugccounters/di/UgcCountersComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "imagesPreCreationConfig", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "hasExpandingBlock", "Z", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcCountersViewMapper extends WidgetViewMapper2<UgcCountersComponent, UgcCountersDTO, UgcCountersVO> {
    private boolean hasExpandingBlock;

    @NotNull
    private final Function2<View, ComposerReferences, k<UgcCountersVO>> holderProducer = new UgcCountersViewMapper$holderProducer$1(this);
    private UgcCountersImagesPreCreationConfig imagesPreCreationConfig;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        boolean z11;
        Object obj;
        Intrinsics.g(state, "null cannot be cast to non-null type ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO");
        UgcCountersDTO ugcCountersDTO = (UgcCountersDTO) state;
        List<UgcCountersDTO.Block> blocks = ugcCountersDTO.getBlocks();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            OnBoardingDTO onboarding = ((UgcCountersDTO.Block) it.next()).getOnboarding();
            if (onboarding != null) {
                arrayList.add(onboarding);
            }
        }
        boolean canShow = component().getOnboardingViewModel().canShow(arrayList, "rpProduct.ugcCounters_onboarding");
        if (component().getWidgetImagePlaceholderAdapter().canMapPlaceholderWidget("UgcCountersWidget", state, true) && !canShow) {
            return false;
        }
        List<UgcCountersDTO.Block> blocks2 = ugcCountersDTO.getBlocks();
        if (!(blocks2 instanceof Collection) || !blocks2.isEmpty()) {
            Iterator<T> it2 = blocks2.iterator();
            while (it2.hasNext()) {
                if (((UgcCountersDTO.Block) it2.next()) instanceof UgcCountersDTO.Block.Expanding) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        this.hasExpandingBlock = z11;
        Iterator<T> it3 = ugcCountersDTO.getBlocks().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (obj instanceof UgcCountersDTO.Block.Image) {
                break;
            }
        }
        UgcCountersDTO.Block.Image image = (UgcCountersDTO.Block.Image) obj;
        if (image != null) {
            int i11 = image.getLabel() != null ? 1 : 0;
            int[] iArr = {image.getUrls().size() - i11, 3};
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (i13 < i12) {
                i12 = i13;
            }
            CornerRadius cornerRadius = image.getCornerRadius();
            if (cornerRadius == null) {
                cornerRadius = CornerRadius.RADIUS_400;
            }
            this.imagesPreCreationConfig = new UgcCountersImagesPreCreationConfig(i12, i11, ResourceExtKt.toPxF(cornerRadius.getPx()));
        }
        return super.canMap(state);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.hasExpandingBlock) {
            UgcCountersLlViewHolder.Companion companion = UgcCountersLlViewHolder.INSTANCE;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return companion.createView(context);
        }
        UgcCountersRvViewHolder.Companion companion2 = UgcCountersRvViewHolder.INSTANCE;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return companion2.createView(context2);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<UgcCountersVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<UgcCountersDTO, d, List<UgcCountersVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<UgcCountersComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return UgcCountersComponent.INSTANCE.getInstance(storage);
    }
}
