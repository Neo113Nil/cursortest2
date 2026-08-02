package ru.ozon.app.android.cart;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/ViewGroup$MarginLayoutParams;", "createDefaultMarginLayoutParams", "()Landroid/view/ViewGroup$MarginLayoutParams;", "Landroidx/recyclerview/widget/RecyclerView;", "", "position", "Ll20/c;", "getItemVoOfPosition", "(Landroidx/recyclerview/widget/RecyclerView;I)Ll20/c;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UtilsKt {
    @NotNull
    public static final ViewGroup.MarginLayoutParams createDefaultMarginLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public static final c getItemVoOfPosition(@NotNull RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Object adapter = recyclerView.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar == null) {
            return null;
        }
        return lVar.b(i11);
    }
}
