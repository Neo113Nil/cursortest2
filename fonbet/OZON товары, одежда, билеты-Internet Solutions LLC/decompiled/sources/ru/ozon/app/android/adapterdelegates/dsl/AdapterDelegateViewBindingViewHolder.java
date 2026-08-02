package ru.ozon.app.android.adapterdelegates.dsl;

import X4.a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u00017B\u0019\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$RL\u0010&\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\u001a\u0010%\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R4\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R4\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00112\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R4\u00101\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-R4\u00103\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R\u0011\u00106\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b5\u0010\u001d¨\u00068"}, d2 = {"Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "T", "LX4/a;", "V", "Landroidx/recyclerview/widget/RecyclerView$C;", "binding", "Landroid/view/View;", "view", "<init>", "(LX4/a;Landroid/view/View;)V", "Lkotlin/Function1;", "", "", "", "bindingBlock", "bind", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "block", "onViewRecycled", "(Lkotlin/jvm/functions/Function0;)V", "onViewAttachedToWindow", "onViewDetachedFromWindow", "LX4/a;", "getBinding", "()LX4/a;", "_item", "Ljava/lang/Object;", "get_item$kotlin_dsl_viewbinding_release", "()Ljava/lang/Object;", "set_item$kotlin_dsl_viewbinding_release", "(Ljava/lang/Object;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "_bind", "Lkotlin/jvm/functions/Function1;", "get_bind$kotlin_dsl_viewbinding_release", "()Lkotlin/jvm/functions/Function1;", "_onViewRecycled", "Lkotlin/jvm/functions/Function0;", "get_onViewRecycled$kotlin_dsl_viewbinding_release", "()Lkotlin/jvm/functions/Function0;", "", "_onFailedToRecycleView", "get_onFailedToRecycleView$kotlin_dsl_viewbinding_release", "_onViewAttachedToWindow", "get_onViewAttachedToWindow$kotlin_dsl_viewbinding_release", "_onViewDetachedFromWindow", "get_onViewDetachedFromWindow$kotlin_dsl_viewbinding_release", "getItem", "item", "Uninitialized", "kotlin-dsl-viewbinding_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class AdapterDelegateViewBindingViewHolder<T, V extends a> extends RecyclerView.C {
    private Function1<? super List<? extends Object>, Unit> _bind;

    @NotNull
    private Object _item;
    private Function0<Boolean> _onFailedToRecycleView;
    private Function0<Unit> _onViewAttachedToWindow;
    private Function0<Unit> _onViewDetachedFromWindow;
    private Function0<Unit> _onViewRecycled;

    @NotNull
    private final V binding;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder$Uninitialized;", "", "()V", "kotlin-dsl-viewbinding_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class Uninitialized {

        @NotNull
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AdapterDelegateViewBindingViewHolder(a aVar, View view, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, view);
        if ((i11 & 2) != 0) {
            view = aVar.getRoot();
            Intrinsics.checkNotNullExpressionValue(view, "binding.root");
        }
    }

    public final void bind(@NotNull Function1<? super List<? extends Object>, Unit> bindingBlock) {
        Intrinsics.checkNotNullParameter(bindingBlock, "bindingBlock");
        if (this._bind != null) {
            throw new IllegalStateException("bind { ... } is already defined. Only one bind { ... } is allowed.");
        }
        this._bind = bindingBlock;
    }

    @NotNull
    public final V getBinding() {
        return this.binding;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final T getItem() {
        T t2 = (T) this._item;
        if (t2 != Uninitialized.INSTANCE) {
            return t2;
        }
        throw new IllegalArgumentException("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
    }

    public final Function1<List<? extends Object>, Unit> get_bind$kotlin_dsl_viewbinding_release() {
        return this._bind;
    }

    public final Function0<Boolean> get_onFailedToRecycleView$kotlin_dsl_viewbinding_release() {
        return this._onFailedToRecycleView;
    }

    public final Function0<Unit> get_onViewAttachedToWindow$kotlin_dsl_viewbinding_release() {
        return this._onViewAttachedToWindow;
    }

    public final Function0<Unit> get_onViewDetachedFromWindow$kotlin_dsl_viewbinding_release() {
        return this._onViewDetachedFromWindow;
    }

    public final Function0<Unit> get_onViewRecycled$kotlin_dsl_viewbinding_release() {
        return this._onViewRecycled;
    }

    public final void onViewAttachedToWindow(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this._onViewAttachedToWindow != null) {
            throw new IllegalStateException("onViewAttachedToWindow { ... } is already defined. Only one onViewAttachedToWindow { ... } is allowed.");
        }
        this._onViewAttachedToWindow = block;
    }

    public final void onViewDetachedFromWindow(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this._onViewDetachedFromWindow != null) {
            throw new IllegalStateException("onViewDetachedFromWindow { ... } is already defined. Only one onViewDetachedFromWindow { ... } is allowed.");
        }
        this._onViewDetachedFromWindow = block;
    }

    public final void onViewRecycled(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this._onViewRecycled != null) {
            throw new IllegalStateException("onViewRecycled { ... } is already defined. Only one onViewRecycled { ... } is allowed.");
        }
        this._onViewRecycled = block;
    }

    public final void set_item$kotlin_dsl_viewbinding_release(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this._item = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterDelegateViewBindingViewHolder(@NotNull V binding, @NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(view, "view");
        this.binding = binding;
        this._item = Uninitialized.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.context = context;
    }
}
