package hk0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class d<I extends InterfaceC7968a> extends RecyclerView.C {

    @NotNull
    private final Context context;
    private I item;
    private Function0<Unit> onAttach;
    private Function0<Unit> onBind;
    private Function0<Unit> onDetach;
    private Function0<Unit> onRecycle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
    }

    public void attach() {
        Function0<Unit> function0 = this.onAttach;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public void bind(@NotNull I item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }

    public void detach() {
        Function0<Unit> function0 = this.onDetach;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final I getItem() {
        return this.item;
    }

    public final Function0<Unit> getOnBind$uikit_recycler_release() {
        return this.onBind;
    }

    public void recycle() {
        Function0<Unit> function0 = this.onRecycle;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
