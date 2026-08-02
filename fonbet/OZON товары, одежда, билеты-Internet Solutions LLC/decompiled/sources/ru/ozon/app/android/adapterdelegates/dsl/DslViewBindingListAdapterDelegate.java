package ru.ozon.app.android.adapterdelegates.dsl;

import X4.a;
import android.view.LayoutInflater;
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

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\u0004\b\u0001\u0010\u0002*\b\b\u0002\u0010\u0004*\u00020\u00032 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00060\u0005B{\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00020\u0007\u0012$\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\"\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0017H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020$H\u0014¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020$H\u0014¢\u0006\u0004\b*\u0010&R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R2\u0010\u000f\u001a \u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R,\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/adapterdelegates/dsl/DslViewBindingListAdapterDelegate;", "I", "T", "LX4/a;", "V", "Lru/ozon/app/android/adapterdelegates/AbsListItemAdapterDelegate;", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lkotlin/Function2;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "binding", "Lkotlin/Function3;", "", "", "", "on", "Lkotlin/Function1;", "", "initializerBlock", "layoutInflater", "<init>", "(Lkotlin/jvm/functions/Function2;Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "item", "", "items", "position", "isForViewType", "(Ljava/lang/Object;Ljava/util/List;I)Z", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "holder", "", "payloads", "onBindViewHolder", "(Ljava/lang/Object;Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onFailedToRecycleView", "(Landroidx/recyclerview/widget/RecyclerView$C;)Z", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Lkotlin/jvm/functions/Function2;", "Lfd/n;", "Lkotlin/jvm/functions/Function1;", "kotlin-dsl-viewbinding_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class DslViewBindingListAdapterDelegate<I extends T, T, V extends a> extends AbsListItemAdapterDelegate<I, T, AdapterDelegateViewBindingViewHolder<I, V>> {

    @NotNull
    private final Function2<LayoutInflater, ViewGroup, V> binding;

    @NotNull
    private final Function1<AdapterDelegateViewBindingViewHolder<I, V>, Unit> initializerBlock;

    @NotNull
    private final Function1<ViewGroup, LayoutInflater> layoutInflater;

    @NotNull
    private final InterfaceC6511n<T, List<? extends T>, Integer, Boolean> on;

    /* JADX WARN: Multi-variable type inference failed */
    public DslViewBindingListAdapterDelegate(@NotNull Function2<? super LayoutInflater, ? super ViewGroup, ? extends V> binding, @NotNull InterfaceC6511n<? super T, ? super List<? extends T>, ? super Integer, Boolean> on, @NotNull Function1<? super AdapterDelegateViewBindingViewHolder<I, V>, Unit> initializerBlock, @NotNull Function1<? super ViewGroup, ? extends LayoutInflater> layoutInflater) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(on, "on");
        Intrinsics.checkNotNullParameter(initializerBlock, "initializerBlock");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        this.binding = binding;
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
        onBindViewHolder((DslViewBindingListAdapterDelegate<I, T, V>) obj, (AdapterDelegateViewBindingViewHolder<DslViewBindingListAdapterDelegate<I, T, V>, V>) c11, (List<Object>) list);
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected boolean onFailedToRecycleView(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Boolean> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onFailedToRecycleView$kotlin_dsl_viewbinding_release();
        return function0 == null ? super.onFailedToRecycleView(holder) : function0.invoke().booleanValue();
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected void onViewAttachedToWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onViewAttachedToWindow$kotlin_dsl_viewbinding_release();
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected void onViewDetachedFromWindow(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onViewDetachedFromWindow$kotlin_dsl_viewbinding_release();
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected void onViewRecycled(@NotNull RecyclerView.C holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Function0<Unit> function0 = ((AdapterDelegateViewBindingViewHolder) holder).get_onViewRecycled$kotlin_dsl_viewbinding_release();
        if (function0 != null) {
            function0.invoke();
        }
    }

    protected void onBindViewHolder(I item, @NotNull AdapterDelegateViewBindingViewHolder<I, V> holder, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Intrinsics.g(item, "null cannot be cast to non-null type kotlin.Any");
        holder.set_item$kotlin_dsl_viewbinding_release(item);
        Function1<List<? extends Object>, Unit> function1 = holder.get_bind$kotlin_dsl_viewbinding_release();
        if (function1 != null) {
            function1.invoke(payloads);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    @NotNull
    public AdapterDelegateViewBindingViewHolder<I, V> onCreateViewHolder(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AdapterDelegateViewBindingViewHolder<I, V> adapterDelegateViewBindingViewHolder = new AdapterDelegateViewBindingViewHolder<>((a) this.binding.invoke(this.layoutInflater.invoke(parent), parent), null, 2, null);
        this.initializerBlock.invoke(adapterDelegateViewBindingViewHolder);
        return adapterDelegateViewBindingViewHolder;
    }
}
