package ik0;

import android.view.View;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {
    public static final Integer a(@NotNull D d11, @NotNull RecyclerView recyclerView) {
        View findSnapView;
        Intrinsics.checkNotNullParameter(d11, "<this>");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (findSnapView = d11.findSnapView(layoutManager)) == null) {
            return null;
        }
        return Integer.valueOf(layoutManager.getPosition(findSnapView));
    }
}
