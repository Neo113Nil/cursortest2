package ru.ozon.app.android.session.logout.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LogoutSeparatorDecoration$onDrawOver$1 extends AbstractC7737t implements Function1<View, Boolean> {
    final /* synthetic */ RecyclerView $parent;
    final /* synthetic */ IntRange $validRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogoutSeparatorDecoration$onDrawOver$1(IntRange intRange, RecyclerView recyclerView) {
        super(1);
        this.$validRange = intRange;
        this.$parent = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int f71842a = this.$validRange.getF71842a();
        int f71843b = this.$validRange.getF71843b();
        int childAdapterPosition = this.$parent.getChildAdapterPosition(it);
        boolean z11 = false;
        if (f71842a <= childAdapterPosition && childAdapterPosition <= f71843b) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
