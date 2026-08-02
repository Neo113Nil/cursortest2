package ru.ozon.fintech.ui.container;

import E30.i;
import G.g;
import Kk.C3532b;
import Kk.d;
import Pk0.f;
import android.graphics.Rect;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.InfinityState;
import com.detmir.recycli.adapters.RecyclerItem;
import com.detmir.recycli.adapters.ScrollKeeper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.container.LayoutType;

@Keep
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0001H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bHÆ\u0003¢\u0006\u0004\b7\u0010.J\u001e\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b<\u0010=JÈ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010!J\u0010\u0010A\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010D\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010CHÖ\u0003¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010)R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bL\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010,R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u00106R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bY\u0010.R%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\b[\u00109R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\\\u001a\u0004\b]\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010^\u001a\u0004\b_\u0010=¨\u0006`"}, d2 = {"Lru/ozon/fintech/ui/container/RecyclerContainerItem;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lcom/detmir/recycli/adapters/ScrollKeeper;", "scrollKeeper", "", "animateItems", "allowSnap", "Lru/ozon/fintech/ui/container/LayoutType;", "layoutType", "", "recyclerState", "Lcom/detmir/recycli/adapters/InfinityState;", "infinityRecyclerState", "", "backgroundColor", "Lru/ozon/fintech/ui/container/OutOfParentBounds;", "outOfParentBounds", "Landroid/graphics/Rect;", "dmPadding", "Landroidx/recyclerview/widget/RecyclerView$n;", "recyclerItemDecorations", "Lkotlin/Function1;", "", "rangeCallback", "Lkotlin/Function0;", "onView", "Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;", "attachItemViewToWindowCallback", "<init>", "(Ljava/lang/String;Lcom/detmir/recycli/adapters/ScrollKeeper;ZZLru/ozon/fintech/ui/container/LayoutType;Ljava/util/List;Lcom/detmir/recycli/adapters/InfinityState;Ljava/lang/Integer;Lru/ozon/fintech/ui/container/OutOfParentBounds;Landroid/graphics/Rect;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;)V", "provideId", "()Ljava/lang/String;", "other", "areContentsTheSame", "(Lcom/detmir/recycli/adapters/RecyclerItem;)Z", "component1", "component2", "()Lcom/detmir/recycli/adapters/ScrollKeeper;", "component3", "()Z", "component4", "component5", "()Lru/ozon/fintech/ui/container/LayoutType;", "component6", "()Ljava/util/List;", "component7", "()Lcom/detmir/recycli/adapters/InfinityState;", "component8", "()Ljava/lang/Integer;", "component9", "()Lru/ozon/fintech/ui/container/OutOfParentBounds;", "component10", "()Landroid/graphics/Rect;", "component11", "component12", "()Lkotlin/jvm/functions/Function1;", "component13", "()Lkotlin/jvm/functions/Function0;", "component14", "()Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;", "copy", "(Ljava/lang/String;Lcom/detmir/recycli/adapters/ScrollKeeper;ZZLru/ozon/fintech/ui/container/LayoutType;Ljava/util/List;Lcom/detmir/recycli/adapters/InfinityState;Ljava/lang/Integer;Lru/ozon/fintech/ui/container/OutOfParentBounds;Landroid/graphics/Rect;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;)Lru/ozon/fintech/ui/container/RecyclerContainerItem;", "toString", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/detmir/recycli/adapters/ScrollKeeper;", "getScrollKeeper", "Z", "getAnimateItems", "getAllowSnap", "Lru/ozon/fintech/ui/container/LayoutType;", "getLayoutType", "Ljava/util/List;", "getRecyclerState", "Lcom/detmir/recycli/adapters/InfinityState;", "getInfinityRecyclerState", "Ljava/lang/Integer;", "getBackgroundColor", "Lru/ozon/fintech/ui/container/OutOfParentBounds;", "getOutOfParentBounds", "Landroid/graphics/Rect;", "getDmPadding", "getRecyclerItemDecorations", "Lkotlin/jvm/functions/Function1;", "getRangeCallback", "Lkotlin/jvm/functions/Function0;", "getOnView", "Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;", "getAttachItemViewToWindowCallback", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecyclerContainerItem implements RecyclerItem {
    private final boolean allowSnap;
    private final boolean animateItems;
    private final AttachItemViewToWindowCallback attachItemViewToWindowCallback;
    private final Integer backgroundColor;

    @NotNull
    private final Rect dmPadding;

    @NotNull
    private final String id;
    private final InfinityState infinityRecyclerState;

    @NotNull
    private final LayoutType layoutType;
    private final Function0<Unit> onView;
    private final OutOfParentBounds outOfParentBounds;
    private final Function1<Integer, Unit> rangeCallback;

    @NotNull
    private final List<RecyclerView.n> recyclerItemDecorations;
    private final List<RecyclerItem> recyclerState;

    @NotNull
    private final ScrollKeeper scrollKeeper;

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerContainerItem(@NotNull String id2, @NotNull ScrollKeeper scrollKeeper, boolean z11, boolean z12, @NotNull LayoutType layoutType, List<? extends RecyclerItem> list, InfinityState infinityState, Integer num, OutOfParentBounds outOfParentBounds, @NotNull Rect dmPadding, @NotNull List<? extends RecyclerView.n> recyclerItemDecorations, Function1<? super Integer, Unit> function1, Function0<Unit> function0, AttachItemViewToWindowCallback attachItemViewToWindowCallback) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(scrollKeeper, "scrollKeeper");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(dmPadding, "dmPadding");
        Intrinsics.checkNotNullParameter(recyclerItemDecorations, "recyclerItemDecorations");
        this.id = id2;
        this.scrollKeeper = scrollKeeper;
        this.animateItems = z11;
        this.allowSnap = z12;
        this.layoutType = layoutType;
        this.recyclerState = list;
        this.infinityRecyclerState = infinityState;
        this.backgroundColor = num;
        this.outOfParentBounds = outOfParentBounds;
        this.dmPadding = dmPadding;
        this.recyclerItemDecorations = recyclerItemDecorations;
        this.rangeCallback = function1;
        this.onView = function0;
        this.attachItemViewToWindowCallback = attachItemViewToWindowCallback;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof RecyclerContainerItem)) {
            return false;
        }
        RecyclerContainerItem recyclerContainerItem = (RecyclerContainerItem) other;
        return Intrinsics.d(this.scrollKeeper, recyclerContainerItem.scrollKeeper) && this.animateItems == recyclerContainerItem.animateItems && this.allowSnap == recyclerContainerItem.allowSnap && Intrinsics.d(this.layoutType, recyclerContainerItem.layoutType) && Intrinsics.d(this.recyclerState, recyclerContainerItem.recyclerState) && Intrinsics.d(this.backgroundColor, recyclerContainerItem.backgroundColor) && Intrinsics.d(this.dmPadding, recyclerContainerItem.dmPadding) && Intrinsics.d(this.infinityRecyclerState, recyclerContainerItem.infinityRecyclerState) && Intrinsics.d(this.attachItemViewToWindowCallback, recyclerContainerItem.attachItemViewToWindowCallback);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Rect getDmPadding() {
        return this.dmPadding;
    }

    @NotNull
    public final List<RecyclerView.n> component11() {
        return this.recyclerItemDecorations;
    }

    public final Function1<Integer, Unit> component12() {
        return this.rangeCallback;
    }

    public final Function0<Unit> component13() {
        return this.onView;
    }

    /* renamed from: component14, reason: from getter */
    public final AttachItemViewToWindowCallback getAttachItemViewToWindowCallback() {
        return this.attachItemViewToWindowCallback;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ScrollKeeper getScrollKeeper() {
        return this.scrollKeeper;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAnimateItems() {
        return this.animateItems;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowSnap() {
        return this.allowSnap;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    public final List<RecyclerItem> component6() {
        return this.recyclerState;
    }

    /* renamed from: component7, reason: from getter */
    public final InfinityState getInfinityRecyclerState() {
        return this.infinityRecyclerState;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component9, reason: from getter */
    public final OutOfParentBounds getOutOfParentBounds() {
        return this.outOfParentBounds;
    }

    @NotNull
    public final RecyclerContainerItem copy(@NotNull String id2, @NotNull ScrollKeeper scrollKeeper, boolean animateItems, boolean allowSnap, @NotNull LayoutType layoutType, List<? extends RecyclerItem> recyclerState, InfinityState infinityRecyclerState, Integer backgroundColor, OutOfParentBounds outOfParentBounds, @NotNull Rect dmPadding, @NotNull List<? extends RecyclerView.n> recyclerItemDecorations, Function1<? super Integer, Unit> rangeCallback, Function0<Unit> onView, AttachItemViewToWindowCallback attachItemViewToWindowCallback) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(scrollKeeper, "scrollKeeper");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(dmPadding, "dmPadding");
        Intrinsics.checkNotNullParameter(recyclerItemDecorations, "recyclerItemDecorations");
        return new RecyclerContainerItem(id2, scrollKeeper, animateItems, allowSnap, layoutType, recyclerState, infinityRecyclerState, backgroundColor, outOfParentBounds, dmPadding, recyclerItemDecorations, rangeCallback, onView, attachItemViewToWindowCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecyclerContainerItem)) {
            return false;
        }
        RecyclerContainerItem recyclerContainerItem = (RecyclerContainerItem) other;
        return Intrinsics.d(this.id, recyclerContainerItem.id) && Intrinsics.d(this.scrollKeeper, recyclerContainerItem.scrollKeeper) && this.animateItems == recyclerContainerItem.animateItems && this.allowSnap == recyclerContainerItem.allowSnap && Intrinsics.d(this.layoutType, recyclerContainerItem.layoutType) && Intrinsics.d(this.recyclerState, recyclerContainerItem.recyclerState) && Intrinsics.d(this.infinityRecyclerState, recyclerContainerItem.infinityRecyclerState) && Intrinsics.d(this.backgroundColor, recyclerContainerItem.backgroundColor) && Intrinsics.d(this.outOfParentBounds, recyclerContainerItem.outOfParentBounds) && Intrinsics.d(this.dmPadding, recyclerContainerItem.dmPadding) && Intrinsics.d(this.recyclerItemDecorations, recyclerContainerItem.recyclerItemDecorations) && Intrinsics.d(this.rangeCallback, recyclerContainerItem.rangeCallback) && Intrinsics.d(this.onView, recyclerContainerItem.onView) && Intrinsics.d(this.attachItemViewToWindowCallback, recyclerContainerItem.attachItemViewToWindowCallback);
    }

    public final boolean getAllowSnap() {
        return this.allowSnap;
    }

    public final boolean getAnimateItems() {
        return this.animateItems;
    }

    public final AttachItemViewToWindowCallback getAttachItemViewToWindowCallback() {
        return this.attachItemViewToWindowCallback;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Rect getDmPadding() {
        return this.dmPadding;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final InfinityState getInfinityRecyclerState() {
        return this.infinityRecyclerState;
    }

    @NotNull
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    public final Function0<Unit> getOnView() {
        return this.onView;
    }

    public final OutOfParentBounds getOutOfParentBounds() {
        return this.outOfParentBounds;
    }

    public final Function1<Integer, Unit> getRangeCallback() {
        return this.rangeCallback;
    }

    @NotNull
    public final List<RecyclerView.n> getRecyclerItemDecorations() {
        return this.recyclerItemDecorations;
    }

    public final List<RecyclerItem> getRecyclerState() {
        return this.recyclerState;
    }

    @NotNull
    public final ScrollKeeper getScrollKeeper() {
        return this.scrollKeeper;
    }

    public int hashCode() {
        int hashCode = (this.layoutType.hashCode() + C3532b.a(C3532b.a((this.scrollKeeper.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.animateItems), 31, this.allowSnap)) * 31;
        List<RecyclerItem> list = this.recyclerState;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        InfinityState infinityState = this.infinityRecyclerState;
        int hashCode3 = (hashCode2 + (infinityState == null ? 0 : infinityState.hashCode())) * 31;
        Integer num = this.backgroundColor;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        OutOfParentBounds outOfParentBounds = this.outOfParentBounds;
        int b11 = g.b(d.a(this.dmPadding, (hashCode4 + (outOfParentBounds == null ? 0 : outOfParentBounds.hashCode())) * 31, 31), 31, this.recyclerItemDecorations);
        Function1<Integer, Unit> function1 = this.rangeCallback;
        int hashCode5 = (b11 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0<Unit> function0 = this.onView;
        int hashCode6 = (hashCode5 + (function0 == null ? 0 : function0.hashCode())) * 31;
        AttachItemViewToWindowCallback attachItemViewToWindowCallback = this.attachItemViewToWindowCallback;
        return hashCode6 + (attachItemViewToWindowCallback != null ? attachItemViewToWindowCallback.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        ScrollKeeper scrollKeeper = this.scrollKeeper;
        boolean z11 = this.animateItems;
        boolean z12 = this.allowSnap;
        LayoutType layoutType = this.layoutType;
        List<RecyclerItem> list = this.recyclerState;
        InfinityState infinityState = this.infinityRecyclerState;
        Integer num = this.backgroundColor;
        OutOfParentBounds outOfParentBounds = this.outOfParentBounds;
        Rect rect = this.dmPadding;
        List<RecyclerView.n> list2 = this.recyclerItemDecorations;
        Function1<Integer, Unit> function1 = this.rangeCallback;
        Function0<Unit> function0 = this.onView;
        AttachItemViewToWindowCallback attachItemViewToWindowCallback = this.attachItemViewToWindowCallback;
        StringBuilder sb2 = new StringBuilder("RecyclerContainerItem(id=");
        sb2.append(str);
        sb2.append(", scrollKeeper=");
        sb2.append(scrollKeeper);
        sb2.append(", animateItems=");
        f.c(", allowSnap=", ", layoutType=", sb2, z11, z12);
        sb2.append(layoutType);
        sb2.append(", recyclerState=");
        sb2.append(list);
        sb2.append(", infinityRecyclerState=");
        sb2.append(infinityState);
        sb2.append(", backgroundColor=");
        sb2.append(num);
        sb2.append(", outOfParentBounds=");
        sb2.append(outOfParentBounds);
        sb2.append(", dmPadding=");
        sb2.append(rect);
        sb2.append(", recyclerItemDecorations=");
        sb2.append(list2);
        sb2.append(", rangeCallback=");
        sb2.append(function1);
        sb2.append(", onView=");
        sb2.append(function0);
        sb2.append(", attachItemViewToWindowCallback=");
        sb2.append(attachItemViewToWindowCallback);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public RecyclerContainerItem(String str, ScrollKeeper scrollKeeper, boolean z11, boolean z12, LayoutType layoutType, List list, InfinityState infinityState, Integer num, OutOfParentBounds outOfParentBounds, Rect rect, List list2, Function1 function1, Function0 function0, AttachItemViewToWindowCallback attachItemViewToWindowCallback, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new ScrollKeeper(null, null, 3, null) : scrollKeeper, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? LayoutType.Linear.INSTANCE : layoutType, (i11 & 32) != 0 ? null : list, (i11 & 64) != 0 ? null : infinityState, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num, (i11 & 256) != 0 ? null : outOfParentBounds, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? i.a() : rect, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? K.f71697a : list2, (i11 & 2048) != 0 ? null : function1, (i11 & 4096) != 0 ? null : function0, (i11 & 8192) != 0 ? null : attachItemViewToWindowCallback);
    }
}
