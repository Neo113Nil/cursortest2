package com.vk.id.onetap.compose.button.auth;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.onetap.compose.button.auth.VKIDButtonKt", f = "VKIDButton.kt", l = {210, 214}, m = "animateFetchedUserIfNeeded")
/* loaded from: classes9.dex */
final class VKIDButtonKt$animateFetchedUserIfNeeded$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    VKIDButtonKt$animateFetchedUserIfNeeded$1(d<? super VKIDButtonKt$animateFetchedUserIfNeeded$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object animateFetchedUserIfNeeded;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        animateFetchedUserIfNeeded = VKIDButtonKt.animateFetchedUserIfNeeded(null, null, null, null, this);
        return animateFetchedUserIfNeeded;
    }
}
