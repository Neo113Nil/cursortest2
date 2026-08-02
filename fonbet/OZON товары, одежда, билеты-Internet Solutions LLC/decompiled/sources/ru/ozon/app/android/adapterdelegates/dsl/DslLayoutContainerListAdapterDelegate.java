package ru.ozon.app.android.adapterdelegates.dsl;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AbsListItemAdapterDelegate;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\u0004\b\u0001\u0010\u00022\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003Bk\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\u00020\f2\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\"H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\"H\u0014¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\"H\u0014¢\u0006\u0004\b(\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0001R2\u0010\n\u001a \u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R&\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/adapterdelegates/dsl/DslLayoutContainerListAdapterDelegate;", "I", "T", "Lru/ozon/app/android/adapterdelegates/AbsListItemAdapterDelegate;", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateLayoutContainerViewHolder;", "", "layout", "Lkotlin/Function3;", "", "", "on", "Lkotlin/Function1;", "", "initializerBlock", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "layoutInflater", "<init>", "(ILfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "item", "", "items", "position", "isForViewType", "(Ljava/lang/Object;Ljava/util/List;I)Z", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateLayoutContainerViewHolder;", "holder", "", "payloads", "onBindViewHolder", "(Ljava/lang/Object;Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateLayoutContainerViewHolder;Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onFailedToRecycleView", "(Landroidx/recyclerview/widget/RecyclerView$C;)Z", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Lfd/n;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "kotlin-dsl-layoutcontainer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class DslLayoutContainerListAdapterDelegate<I extends T, T> extends AbsListItemAdapterDelegate<I, T, AdapterDelegateLayoutContainerViewHolder<I>> {

    @NotNull
    private final Function1<AdapterDelegateLayoutContainerViewHolder<I>, Unit> initializerBlock;
    private final int layout;

    @NotNull
    private final Function2<ViewGroup, Integer, View> layoutInflater;

    @NotNull
    private final InterfaceC6511n<T, List<? extends T>, Integer, Boolean> on;

    /* JADX WARN: Multi-variable type inference failed */
    public DslLayoutContainerListAdapterDelegate(int i11, @NotNull InterfaceC6511n<? super T, ? super List<? extends T>, ? super Integer, Boolean> on, @NotNull Function1<? super AdapterDelegateLayoutContainerViewHolder<I>, Unit> initializerBlock, @NotNull Function2<? super ViewGroup, ? super Integer, ? extends View> layoutInflater) {
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(initializerBlock, "initializerBlock");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        this.layout = i11;
        this.on = on;
        this.initializerBlock = initializerBlock;
        this.layoutInflater = layoutInflater;
    }

    @Override // ru.ozon.app.android.adapterdelegates.AbsListItemAdapterDelegate
    protected boolean isForViewType(T item, @NotNull List<T> items, int position) {
        Intrinsics.checkNotNullParameter(items, "items");
        return this.on.invoke(item, items, Integer.valueOf(position)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.adapterdelegates.AbsListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, RecyclerView.C c11, List list) {
        onBindViewHolder((DslLayoutContainerListAdapterDelegate<I, T>) obj, (AdapterDelegateLayoutContainerViewHolder<DslLayoutContainerListAdapterDelegate<I, T>>) c11, (List<Object>) list);
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected boolean onFailedToRecycleView(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Boolean> function0 = ((AdapterDelegateLayoutContainerViewHolder) holder).get_onFailedToRecycleView$kotlin_dsl_layoutcontainer_release();
        return function0 == null ? super.onFailedToRecycleView(holder) : function0.invoke().booleanValue();
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected void onViewAttachedToWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateLayoutContainerViewHolder) holder).get_onViewAttachedToWindow$kotlin_dsl_layoutcontainer_release();
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected void onViewDetachedFromWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateLayoutContainerViewHolder) holder).get_onViewDetachedFromWindow$kotlin_dsl_layoutcontainer_release();
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected void onViewRecycled(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateLayoutContainerViewHolder) holder).get_onViewRecycled$kotlin_dsl_layoutcontainer_release();
        if (function0 != null) {
            function0.invoke();
        }
    }

    protected void onBindViewHolder(I item, @NotNull AdapterDelegateLayoutContainerViewHolder<I> holder, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Intrinsics.g(item, "null cannot be cast to non-null type kotlin.Any");
        holder.set_item$kotlin_dsl_layoutcontainer_release(item);
        Function1<List<? extends Object>, Unit> function1 = holder.get_bind$kotlin_dsl_layoutcontainer_release();
        if (function1 != null) {
            function1.invoke(payloads);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    @NotNull
    public AdapterDelegateLayoutContainerViewHolder<I> onCreateViewHolder(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AdapterDelegateLayoutContainerViewHolder<I> adapterDelegateLayoutContainerViewHolder = new AdapterDelegateLayoutContainerViewHolder<>(this.layoutInflater.invoke(parent, Integer.valueOf(this.layout)));
        this.initializerBlock.invoke(adapterDelegateLayoutContainerViewHolder);
        return adapterDelegateLayoutContainerViewHolder;
    }
}
