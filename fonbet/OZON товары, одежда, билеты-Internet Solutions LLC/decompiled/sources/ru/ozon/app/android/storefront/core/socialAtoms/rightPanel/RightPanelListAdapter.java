package ru.ozon.app.android.storefront.core.socialAtoms.rightPanel;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroidx/recyclerview/widget/i$d;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/i$d;)V", "", "items", "", "setup", "(Ljava/util/List;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RightPanelListAdapter extends t<RightPanelItemVO, RecyclerView.C> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightPanelListAdapter(@NotNull i.d<RightPanelItemVO> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    public final void setup(@NotNull List<RightPanelItemVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        submitList(items);
    }
}
