package com.vk.id.onetap.compose.button.auth;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.onetap.compose.button.auth.VKIDButtonKt", f = "VKIDButton.kt", l = {231, 232}, m = "animateFailedUser")
/* loaded from: classes9.dex */
final class VKIDButtonKt$animateFailedUser$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    VKIDButtonKt$animateFailedUser$1(d<? super VKIDButtonKt$animateFailedUser$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object animateFailedUser;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        animateFailedUser = VKIDButtonKt.animateFailedUser(null, null, null, this);
        return animateFailedUser;
    }
}
