package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l8 extends Lambda implements Function0<Configuration$PlatformIdentifierConfiguration> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(String str) {
        super(0);
        this.f40773a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Configuration$PlatformIdentifierConfiguration invoke() {
        Configuration$PlatformIdentifierConfiguration.a newBuilder = Configuration$PlatformIdentifierConfiguration.newBuilder();
        Configuration$AndroidPlatformIdentifierConfiguration.a newBuilder2 = Configuration$AndroidPlatformIdentifierConfiguration.newBuilder();
        String str = this.f40773a;
        if (str == null) {
            str = "";
        }
        return newBuilder.a(newBuilder2.a(str).build()).build();
    }
}
