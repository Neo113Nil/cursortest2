package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl$observeViewIntent$1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl$observeViewIntent$1$1", f = "AddEdoViewModelV2Impl.kt", l = {38, 42}, m = "emit")
/* loaded from: classes12.dex */
final class AddEdoViewModelV2Impl$observeViewIntent$1$1$emit$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AddEdoViewModelV2Impl$observeViewIntent$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddEdoViewModelV2Impl$observeViewIntent$1$1$emit$1(AddEdoViewModelV2Impl$observeViewIntent$1.AnonymousClass1<? super T> anonymousClass1, d<? super AddEdoViewModelV2Impl$observeViewIntent$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.emit((AddEdoViewModelV2.ViewIntent) null, (d<? super Unit>) this);
    }
}
