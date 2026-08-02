package com.vk.id.internal.auth;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.internal.auth.AuthProvidersChooserDefault", f = "AuthProvidersChooserDefault.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "chooseBest")
/* loaded from: classes9.dex */
final class AuthProvidersChooserDefault$chooseBest$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AuthProvidersChooserDefault this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthProvidersChooserDefault$chooseBest$1(AuthProvidersChooserDefault authProvidersChooserDefault, d<? super AuthProvidersChooserDefault$chooseBest$1> dVar) {
        super(dVar);
        this.this$0 = authProvidersChooserDefault;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.chooseBest(null, this);
    }
}
