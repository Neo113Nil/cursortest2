package com.plaid.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPlaidWebview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$submit$jsonMessage$1$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,206:1\n215#2,2:207\n*S KotlinDebug\n*F\n+ 1 PlaidWebview.kt\ncom/plaid/core/webview/PlaidWebview$submit$jsonMessage$1$1$1\n*L\n149#1:207,2\n*E\n"})
/* loaded from: classes3.dex */
public final class Y5 extends Lambda implements Function1<ei.C, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f39795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(Map<String, String> map) {
        super(1);
        this.f39795a = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ei.C c10) {
        ei.C putJsonObject = c10;
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        Map<String, String> map = this.f39795a;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ei.i.a(putJsonObject, entry.getKey(), entry.getValue());
            }
        }
        return Unit.INSTANCE;
    }
}
