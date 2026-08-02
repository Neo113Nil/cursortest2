package com.vk.id;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.AuthResultHandler", f = "AuthResultHandler.kt", l = {57, 84, 97, Logger.NONE}, m = "handleOauth")
/* loaded from: classes9.dex */
final class AuthResultHandler$handleOauth$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthResultHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthResultHandler$handleOauth$1(AuthResultHandler authResultHandler, d<? super AuthResultHandler$handleOauth$1> dVar) {
        super(dVar);
        this.this$0 = authResultHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleOauth;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        handleOauth = this.this$0.handleOauth(null, null, this);
        return handleOauth;
    }
}
