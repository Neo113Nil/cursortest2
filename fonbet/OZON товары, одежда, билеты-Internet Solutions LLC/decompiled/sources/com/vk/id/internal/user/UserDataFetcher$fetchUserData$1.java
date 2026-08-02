package com.vk.id.internal.user;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.internal.user.UserDataFetcher", f = "UserDataFetcher.kt", l = {56, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "fetchUserData")
/* loaded from: classes9.dex */
final class UserDataFetcher$fetchUserData$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserDataFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDataFetcher$fetchUserData$1(UserDataFetcher userDataFetcher, d<? super UserDataFetcher$fetchUserData$1> dVar) {
        super(dVar);
        this.this$0 = userDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.fetchUserData(this);
    }
}
