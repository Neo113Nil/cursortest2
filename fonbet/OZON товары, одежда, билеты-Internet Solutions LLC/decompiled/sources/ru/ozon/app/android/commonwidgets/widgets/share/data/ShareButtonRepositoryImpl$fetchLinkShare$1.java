package ru.ozon.app.android.commonwidgets.widgets.share.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.commonwidgets.widgets.share.data.ShareButtonRepositoryImpl", f = "ShareButtonRepositoryImpl.kt", l = {15}, m = "fetchLinkShare")
/* loaded from: classes11.dex */
final class ShareButtonRepositoryImpl$fetchLinkShare$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShareButtonRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareButtonRepositoryImpl$fetchLinkShare$1(ShareButtonRepositoryImpl shareButtonRepositoryImpl, d<? super ShareButtonRepositoryImpl$fetchLinkShare$1> dVar) {
        super(dVar);
        this.this$0 = shareButtonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.fetchLinkShare(null, this);
    }
}
