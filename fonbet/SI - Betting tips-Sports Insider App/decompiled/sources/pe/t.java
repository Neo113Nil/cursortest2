package pe;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g1;
import androidx.recyclerview.widget.z1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21886a;

    public t(int i5) {
        this.f21886a = i5;
    }

    @Override // androidx.recyclerview.widget.g1
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, z1 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int i5 = this.f21886a;
        outRect.top = i5;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (parent.getAdapter() == null || r4.getItemCount() - 1 != childAdapterPosition) {
            return;
        }
        outRect.bottom = i5;
    }
}
