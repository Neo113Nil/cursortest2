package ru.ozon.app.android.marketing.widgets.highlightsWrapper.core;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl", f = "HighlightsWrapperStateManagerImpl.kt", l = {123}, m = "requestAsync-gIAlu-s")
/* loaded from: classes12.dex */
final class HighlightsWrapperStateManagerImpl$requestAsync$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HighlightsWrapperStateManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsWrapperStateManagerImpl$requestAsync$1(HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl, d<? super HighlightsWrapperStateManagerImpl$requestAsync$1> dVar) {
        super(dVar);
        this.this$0 = highlightsWrapperStateManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m791requestAsyncgIAlus;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        m791requestAsyncgIAlus = this.this$0.m791requestAsyncgIAlus(null, this);
        return m791requestAsyncgIAlus == a.COROUTINE_SUSPENDED ? m791requestAsyncgIAlus : r.a(m791requestAsyncgIAlus);
    }
}
