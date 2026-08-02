package com.vk.articles;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vk.articles.a;

/* compiled from: ArticleWebView.kt */
/* loaded from: classes15.dex */
public final class b extends Handler {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Looper looper) {
        super(looper);
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a.c onScrollEndListener;
        if (message.what != 0 || (onScrollEndListener = this.a.getOnScrollEndListener()) == null) {
            return;
        }
        onScrollEndListener.a();
    }
}
