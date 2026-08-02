package com.vk.id.logout;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.logout.VKIDLoggerOut", f = "VKIDLoggerOut.kt", l = {28, 32, DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 51}, m = "logout")
/* loaded from: classes9.dex */
final class VKIDLoggerOut$logout$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VKIDLoggerOut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDLoggerOut$logout$1(VKIDLoggerOut vKIDLoggerOut, d<? super VKIDLoggerOut$logout$1> dVar) {
        super(dVar);
        this.this$0 = vKIDLoggerOut;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.logout(null, null, false, null, this);
    }
}
