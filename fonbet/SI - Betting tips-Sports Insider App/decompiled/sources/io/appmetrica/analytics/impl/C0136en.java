package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136en extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0162fn f13709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0136en(C0162fn c0162fn) {
        super(0);
        this.f13709a = c0162fn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0162fn c0162fn = this.f13709a;
        String a7 = c0162fn.f13777a.a();
        if (a7 != null) {
        }
        String a10 = c0162fn.f13778b.a();
        if (a10 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a10);
        }
        return hashMap;
    }
}
