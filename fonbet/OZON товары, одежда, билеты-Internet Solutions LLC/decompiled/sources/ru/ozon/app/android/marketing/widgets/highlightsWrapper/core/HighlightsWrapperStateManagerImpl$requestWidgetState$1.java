package ru.ozon.app.android.marketing.widgets.highlightsWrapper.core;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl", f = "HighlightsWrapperStateManagerImpl.kt", l = {42}, m = "requestWidgetState")
/* loaded from: classes12.dex */
final class HighlightsWrapperStateManagerImpl$requestWidgetState$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HighlightsWrapperStateManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsWrapperStateManagerImpl$requestWidgetState$1(HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl, d<? super HighlightsWrapperStateManagerImpl$requestWidgetState$1> dVar) {
        super(dVar);
        this.this$0 = highlightsWrapperStateManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.requestWidgetState(null, this);
    }
}
