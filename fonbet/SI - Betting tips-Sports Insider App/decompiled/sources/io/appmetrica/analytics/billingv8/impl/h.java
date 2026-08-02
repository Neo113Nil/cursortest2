package io.appmetrica.analytics.billingv8.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f11585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f11586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f11585a = linkedHashMap;
        this.f11586b = map;
        this.f11587c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f11585a;
        Map map2 = this.f11586b;
        i iVar = this.f11587c;
        m.a(map, map2, iVar.f11591d, iVar.f11590c.getBillingInfoManager());
        return Unit.f19194a;
    }
}
