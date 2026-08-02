package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class k8 extends Lambda implements Function0<Configuration$DeviceMetadata> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f40739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(n8 n8Var) {
        super(0);
        O4 o42 = O4.f39477a;
        this.f40739a = n8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Configuration$DeviceMetadata invoke() {
        Configuration$DeviceMetadata.a newBuilder = Configuration$DeviceMetadata.newBuilder();
        O4 o42 = O4.f39477a;
        n8 n8Var = this.f40739a;
        newBuilder.d(O4.f39479c);
        newBuilder.e(O4.f39480d);
        newBuilder.f(O4.f39484h);
        newBuilder.g(O4.f39483g);
        newBuilder.c(((Locale) n8Var.f40869i.getValue()).toLanguageTag());
        newBuilder.a(((Locale) n8Var.f40869i.getValue()).getCountry());
        newBuilder.b(((Locale) n8Var.f40869i.getValue()).getLanguage());
        newBuilder.b(O4.f39487k);
        newBuilder.a(O4.f39486j);
        return newBuilder.build();
    }
}
