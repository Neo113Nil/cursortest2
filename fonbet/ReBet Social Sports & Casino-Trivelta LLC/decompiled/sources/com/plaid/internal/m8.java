package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class m8 extends Lambda implements Function0<Configuration$SDKMetadata> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f40809a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(n8 n8Var) {
        super(0);
        this.f40809a = n8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Configuration$SDKMetadata invoke() {
        Configuration$SDKMetadata.a newBuilder = Configuration$SDKMetadata.newBuilder();
        n8 n8Var = this.f40809a;
        newBuilder.a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_ANDROID);
        newBuilder.c(n8Var.f40861a);
        newBuilder.a();
        newBuilder.b(n8Var.f40865e);
        newBuilder.a(n8Var.f40867g);
        if (n8Var.f40862b != null) {
            newBuilder.a(Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_REACTNATIVEANDROID).a(n8Var.f40862b).build());
        }
        if (n8Var.f40863c != null) {
            Configuration$SDKMetadata.WrappingSDK.newBuilder().a(com.plaid.internal.core.protos.link.workflow.primitives.g.CLIENT_TYPE_FLUTTERANDROID).a(n8Var.f40863c).build();
        }
        return newBuilder.build();
    }
}
