package ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation.rv;

import W10.c;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.databinding.ItemBrandzoneCarouselExpressBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation.BrandzoneItemVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR*\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010&\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/rv/BrandzoneCarouselAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneItemVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/rv/BrandzoneItemViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/rv/BrandzoneItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/rv/BrandzoneItemViewHolder;I)V", "getItemViewType", "(I)I", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "setWidgetInfo", "(Ll20/d;)V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "composerVO", "Lru/ozon/composer/ui/widget/l;", "getComposerVO", "()Lru/ozon/composer/ui/widget/l;", "setComposerVO", "(Lru/ozon/composer/ui/widget/l;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LW10/c;", "getTrackingData", "()LW10/c;", "setTrackingData", "(LW10/c;)V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BrandzoneCarouselAdapter extends i<BrandzoneItemVO, BrandzoneItemViewHolder> {
    private l composerVO;

    @NotNull
    private final Function1<AtomAction, Unit> onClick;

    @NotNull
    private final ComposerReferences refs;
    private c trackingData;
    private d widgetInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrandzoneCarouselAdapter(@NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> onClick, @NotNull J containerViewLifecycleOwner) {
        super(new BrandzoneDiffUtil(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.refs = refs;
        this.onClick = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$layout.item_brandzone_carousel_express;
    }

    public final void setComposerVO(l lVar) {
        this.composerVO = lVar;
    }

    public final void setTrackingData(c cVar) {
        this.trackingData = cVar;
    }

    public final void setWidgetInfo(d dVar) {
        this.widgetInfo = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BrandzoneItemViewHolder holder, int position) {
        c cVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        BrandzoneItemVO item = getItem(position);
        d dVar = this.widgetInfo;
        if (dVar == null) {
            return;
        }
        Intrinsics.f(item);
        k.bindItem$default(holder, item, dVar, null, 4, null);
        l lVar = this.composerVO;
        if (lVar == null || (cVar = this.trackingData) == null) {
            return;
        }
        holder.bindTrackingData(lVar, cVar, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BrandzoneItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemBrandzoneCarouselExpressBinding bind = ItemBrandzoneCarouselExpressBinding.bind(ViewGroupExtKt.inflate(parent, R$layout.item_brandzone_carousel_express));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new BrandzoneItemViewHolder(bind, this.refs, this.onClick);
    }
}
