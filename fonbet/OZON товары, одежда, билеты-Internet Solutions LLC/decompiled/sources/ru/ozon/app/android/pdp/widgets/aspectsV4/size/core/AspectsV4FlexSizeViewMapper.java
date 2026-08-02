package ru.ozon.app.android.pdp.widgets.aspectsV4.size.core;

import Kk.c;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4DTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4SizeSubWidgetObject;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeVO;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeWidgetViewHolder;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/core/AspectsV4FlexSizeViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/di/AspectsV4WidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4SizeSubWidgetObject;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "oldItem", "newItem", "getPayload", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO;Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/core/AspectsV4SizeMapper;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/size/core/AspectsV4SizeMapper;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectsV4FlexSizeViewMapper extends WidgetViewMapper2<AspectsV4WidgetComponent, AspectsV4SizeSubWidgetObject, AspectsV4SizeVO> {

    @NotNull
    private final Function2<View, ComposerReferences, AspectsV4SizeWidgetViewHolder> holderProducer = new AspectsV4FlexSizeViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        AspectsV4SizeSubWidgetObject aspectsV4SizeSubWidgetObject = state instanceof AspectsV4SizeSubWidgetObject ? (AspectsV4SizeSubWidgetObject) state : null;
        return (aspectsV4SizeSubWidgetObject != null ? aspectsV4SizeSubWidgetObject.getLayoutType() : null) == AspectsV4DTO.LayoutType.MULTILINE;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AspectsV4SizeWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AspectsV4WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AspectsV4WidgetComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public RecyclerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.aspectsV4Rv);
        FlexboxLayout.a aVar = new FlexboxLayout.a(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) aVar).leftMargin = dimens.getDP_16();
        ((ViewGroup.MarginLayoutParams) aVar).rightMargin = dimens.getDP_16();
        recyclerView.setLayoutParams(aVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new FlexboxLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new RecyclerView.n() { // from class: ru.ozon.app.android.pdp.widgets.aspectsV4.size.core.AspectsV4FlexSizeViewMapper$createView$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent2, RecyclerView.A state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent2, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                int dp_4 = AspectsV4FlexSizeViewMapper.this.component().getAppType() == AppType.SELECT ? Dimens.INSTANCE.getDP_4() : Dimens.INSTANCE.getDP_6();
                RecyclerView.o layoutManager = parent2.getLayoutManager();
                FlexboxLayoutManager flexboxLayoutManager = layoutManager instanceof FlexboxLayoutManager ? (FlexboxLayoutManager) layoutManager : null;
                if (flexboxLayoutManager != null && flexboxLayoutManager.getFlexLines().size() > 0) {
                    outRect.top = dp_4;
                }
                outRect.right = dp_4;
            }
        });
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public AspectsV4SizeMapper getMapper() {
        return component().getSizeMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AspectsV4SizeVO oldItem, @NotNull AspectsV4SizeVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }
}
