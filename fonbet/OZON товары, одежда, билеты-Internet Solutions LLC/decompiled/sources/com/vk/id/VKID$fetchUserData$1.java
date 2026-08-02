package com.vk.id;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.VKID", f = "VKID.kt", l = {685}, m = "fetchUserData-IoAF18A")
/* loaded from: classes9.dex */
final class VKID$fetchUserData$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKID$fetchUserData$1(VKID vkid, d<? super VKID$fetchUserData$1> dVar) {
        super(dVar);
        this.this$0 = vkid;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m45fetchUserDataIoAF18A = this.this$0.m45fetchUserDataIoAF18A(this);
        return m45fetchUserDataIoAF18A == Wc.a.COROUTINE_SUSPENDED ? m45fetchUserDataIoAF18A : r.a(m45fetchUserDataIoAF18A);
    }
}
