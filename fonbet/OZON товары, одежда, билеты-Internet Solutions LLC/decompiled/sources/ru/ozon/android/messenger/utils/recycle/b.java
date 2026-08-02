package ru.ozon.android.messenger.utils.recycle;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<View, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f91973b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ RecyclerView f91974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, RecyclerView recyclerView) {
        super(1);
        this.f91973b = cVar;
        this.f91974c = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View view) {
        a aVar;
        boolean b11;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        aVar = this.f91973b.f91975a;
        RecyclerView recyclerView = this.f91974c;
        if (recyclerView.getChildAdapterPosition(it) == -1) {
            b11 = false;
        } else {
            b11 = ((i.d) aVar).b(recyclerView.getChildAdapterPosition(it));
        }
        return Boolean.valueOf(b11);
    }
}
