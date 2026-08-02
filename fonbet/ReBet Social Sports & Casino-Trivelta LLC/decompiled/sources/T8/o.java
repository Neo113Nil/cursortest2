package T8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o extends RecyclerView.F {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    public abstract void b(Object obj);

    public boolean c(Function0 onLoad) {
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        return false;
    }

    public abstract void d();
}
