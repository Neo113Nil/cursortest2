package ru.ozon.app.android.adapterdelegates.dsl;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003:\u0001/B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bRL\u0010\u001d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u001a\u0010\u001c\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R4\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R4\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010!2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R4\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R4\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%R\u0011\u0010.\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b-\u0010\u0014¨\u00060"}, d2 = {"Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateLayoutContainerViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lkotlin/Function1;", "", "", "bindingBlock", "bind", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "_item", "Ljava/lang/Object;", "get_item$kotlin_dsl_layoutcontainer_release", "()Ljava/lang/Object;", "set_item$kotlin_dsl_layoutcontainer_release", "(Ljava/lang/Object;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "_bind", "Lkotlin/jvm/functions/Function1;", "get_bind$kotlin_dsl_layoutcontainer_release", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "_onViewRecycled", "Lkotlin/jvm/functions/Function0;", "get_onViewRecycled$kotlin_dsl_layoutcontainer_release", "()Lkotlin/jvm/functions/Function0;", "", "_onFailedToRecycleView", "get_onFailedToRecycleView$kotlin_dsl_layoutcontainer_release", "_onViewAttachedToWindow", "get_onViewAttachedToWindow$kotlin_dsl_layoutcontainer_release", "_onViewDetachedFromWindow", "get_onViewDetachedFromWindow$kotlin_dsl_layoutcontainer_release", "getItem", "item", "Uninitialized", "kotlin-dsl-layoutcontainer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class AdapterDelegateLayoutContainerViewHolder<T> extends RecyclerView.C {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private Function1<? super List<? extends Object>, Unit> _bind;

    @NotNull
    private Object _item;
    private Function0<Boolean> _onFailedToRecycleView;
    private Function0<Unit> _onViewAttachedToWindow;
    private Function0<Unit> _onViewDetachedFromWindow;
    private Function0<Unit> _onViewRecycled;

    @NotNull
    private final View containerView;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateLayoutContainerViewHolder$Uninitialized;", "", "()V", "kotlin-dsl-layoutcontainer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class Uninitialized {

        @NotNull
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterDelegateLayoutContainerViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this._$_findViewCache = new LinkedHashMap();
        this.containerView = containerView;
        this._item = Uninitialized.INSTANCE;
        Context context = getContainerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "containerView.context");
        this.context = context;
    }

    public final void bind(@NotNull Function1<? super List<? extends Object>, Unit> bindingBlock) {
        Intrinsics.checkNotNullParameter(bindingBlock, "bindingBlock");
        if (this._bind != null) {
            throw new IllegalStateException("bind { ... } is already defined. Only one bind { ... } is allowed.");
        }
        this._bind = bindingBlock;
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    public final T getItem() {
        T t2 = (T) this._item;
        if (t2 != Uninitialized.INSTANCE) {
            return t2;
        }
        throw new IllegalArgumentException("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
    }

    public final Function1<List<? extends Object>, Unit> get_bind$kotlin_dsl_layoutcontainer_release() {
        return this._bind;
    }

    public final Function0<Boolean> get_onFailedToRecycleView$kotlin_dsl_layoutcontainer_release() {
        return this._onFailedToRecycleView;
    }

    public final Function0<Unit> get_onViewAttachedToWindow$kotlin_dsl_layoutcontainer_release() {
        return this._onViewAttachedToWindow;
    }

    public final Function0<Unit> get_onViewDetachedFromWindow$kotlin_dsl_layoutcontainer_release() {
        return this._onViewDetachedFromWindow;
    }

    public final Function0<Unit> get_onViewRecycled$kotlin_dsl_layoutcontainer_release() {
        return this._onViewRecycled;
    }

    public final void set_item$kotlin_dsl_layoutcontainer_release(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this._item = obj;
    }
}
