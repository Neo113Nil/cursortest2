package ru.ozon.app.android.common.actionHandlers.shareSellerLink;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.common.actionHandlers.shareSellerLink.ShareSellerLinkActionHandler", f = "ShareSellerLinkActionHandler.kt", l = {90}, m = "requestShortLink")
/* loaded from: classes11.dex */
final class ShareSellerLinkActionHandler$requestShortLink$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShareSellerLinkActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareSellerLinkActionHandler$requestShortLink$1(ShareSellerLinkActionHandler shareSellerLinkActionHandler, d<? super ShareSellerLinkActionHandler$requestShortLink$1> dVar) {
        super(dVar);
        this.this$0 = shareSellerLinkActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object requestShortLink;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        requestShortLink = this.this$0.requestShortLink(null, this);
        return requestShortLink;
    }
}
