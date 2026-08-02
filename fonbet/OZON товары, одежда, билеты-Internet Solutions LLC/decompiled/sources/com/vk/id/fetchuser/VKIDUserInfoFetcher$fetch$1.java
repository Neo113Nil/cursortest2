package com.vk.id.fetchuser;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.fetchuser.VKIDUserInfoFetcher", f = "VKIDUserInfoFetcher.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER, TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "fetch")
/* loaded from: classes9.dex */
final class VKIDUserInfoFetcher$fetch$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VKIDUserInfoFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDUserInfoFetcher$fetch$1(VKIDUserInfoFetcher vKIDUserInfoFetcher, d<? super VKIDUserInfoFetcher$fetch$1> dVar) {
        super(dVar);
        this.this$0 = vKIDUserInfoFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.fetch(null, null, null, this);
    }
}
