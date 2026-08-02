package ru.ozon.app.android.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.utils.JsonAsyncParseHelper", f = "JsonAsyncParseHelper.kt", l = {18}, m = "asyncReadJsonArray")
/* loaded from: classes7.dex */
final class JsonAsyncParseHelper$asyncReadJsonArray$1<T> extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonAsyncParseHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonAsyncParseHelper$asyncReadJsonArray$1(JsonAsyncParseHelper jsonAsyncParseHelper, d<? super JsonAsyncParseHelper$asyncReadJsonArray$1> dVar) {
        super(dVar);
        this.this$0 = jsonAsyncParseHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.asyncReadJsonArray(null, null, this);
    }
}
