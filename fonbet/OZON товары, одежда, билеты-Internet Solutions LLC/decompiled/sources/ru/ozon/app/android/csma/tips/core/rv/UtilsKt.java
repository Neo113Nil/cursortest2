package ru.ozon.app.android.csma.tips.core.rv;

import LB.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "", "", "click", "setOnClickListener", "(Landroidx/recyclerview/widget/RecyclerView$C;Lkotlin/jvm/functions/Function1;)V", "tips_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UtilsKt {
    public static final void setOnClickListener(@NotNull RecyclerView.C c11, @NotNull Function1<? super Integer, Unit> click) {
        Intrinsics.checkNotNullParameter(c11, "<this>");
        Intrinsics.checkNotNullParameter(click, "click");
        c11.itemView.setOnClickListener(new a(3, c11, click));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$2(RecyclerView.C c11, Function1 function1, View view) {
        Integer valueOf = Integer.valueOf(c11.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            function1.invoke(Integer.valueOf(valueOf.intValue()));
        }
    }
}
