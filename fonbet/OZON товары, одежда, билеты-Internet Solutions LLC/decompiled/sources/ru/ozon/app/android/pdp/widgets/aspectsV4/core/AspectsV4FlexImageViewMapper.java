package ru.ozon.app.android.pdp.widgets.aspectsV4.core;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
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
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4ImageSubWidgetObject;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectV4WidgetComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4FlexboxItemDecoration;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageListViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageVO;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageConst;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/core/AspectsV4FlexImageViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/di/AspectV4WidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4ImageSubWidgetObject;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageListViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/core/AspectV4ImageMapper;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/core/AspectV4ImageMapper;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectsV4FlexImageViewMapper extends WidgetViewMapper2<AspectV4WidgetComponent, AspectsV4ImageSubWidgetObject, AspectsV4ImageVO> {

    @NotNull
    private final Function2<View, ComposerReferences, AspectsV4ImageListViewHolder> holderProducer = new AspectsV4FlexImageViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        AspectsV4ImageSubWidgetObject aspectsV4ImageSubWidgetObject = state instanceof AspectsV4ImageSubWidgetObject ? (AspectsV4ImageSubWidgetObject) state : null;
        return (aspectsV4ImageSubWidgetObject != null ? aspectsV4ImageSubWidgetObject.getLayoutType() : null) == AspectsV4DTO.LayoutType.MULTILINE;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.aspectsVariantsRv);
        FlexboxLayout.a aVar = new FlexboxLayout.a(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) aVar).leftMargin = dimens.getDP_16();
        ((ViewGroup.MarginLayoutParams) aVar).rightMargin = dimens.getDP_10();
        recyclerView.setPadding(recyclerView.getPaddingLeft(), AspectsV4ImageConst.INSTANCE.getOVER_BOUNDS(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        recyclerView.setLayoutParams(aVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(parent.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.addItemDecoration(new AspectsV4FlexboxItemDecoration());
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AspectsV4ImageListViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AspectV4WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AspectV4WidgetComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public AspectV4ImageMapper getMapper() {
        return component().getImageMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AspectsV4ImageVO oldItem, @NotNull AspectsV4ImageVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }
}
