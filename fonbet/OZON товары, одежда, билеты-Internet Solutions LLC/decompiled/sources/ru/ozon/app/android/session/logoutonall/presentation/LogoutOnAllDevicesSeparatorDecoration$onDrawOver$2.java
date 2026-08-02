package ru.ozon.app.android.session.logoutonall.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Landroidx/recyclerview/widget/RecyclerView$C;", "invoke", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class LogoutOnAllDevicesSeparatorDecoration$onDrawOver$2 extends AbstractC7737t implements Function1<View, RecyclerView.C> {
    final /* synthetic */ RecyclerView $parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogoutOnAllDevicesSeparatorDecoration$onDrawOver$2(RecyclerView recyclerView) {
        super(1);
        this.$parent = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final RecyclerView.C invoke(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$parent.getChildViewHolder(it);
    }
}
