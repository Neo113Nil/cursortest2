package ru.ozon.app.android.uikit.recycler;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import ik0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "", "separator", "orientation", "", "needLastDecoration", "", "setupSeparatorItemDecoration", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;IIZ)V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecyclerViewExtKt {
    public static final void setupSeparatorItemDecoration(@NotNull RecyclerView recyclerView, @NotNull Context context, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        a.a(recyclerView, context, i11, i12, z11);
    }

    public static /* synthetic */ void setupSeparatorItemDecoration$default(RecyclerView recyclerView, Context context, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        setupSeparatorItemDecoration(recyclerView, context, i11, i12, z11);
    }
}
