package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.bidtoken.providers.l;
import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettingsImpl;
import com.moloco.sdk.service_locator.a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public interface l extends j<k> {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public static final com.moloco.sdk.internal.ilrd.f b() {
            return a.b.a.g().a();
        }

        public final l a() {
            w wVar = new w();
            com.moloco.sdk.service_locator.a aVar = com.moloco.sdk.service_locator.a.a;
            v vVar = new v(new com.moloco.sdk.internal.services.bidtoken.t(new InternalMolocoPrivacySettingsImpl(aVar.a())));
            a.h hVar = a.h.a;
            s sVar = new s(hVar.c());
            e eVar = new e(aVar.a());
            u uVar = new u(a.i.a.b());
            a.e eVar2 = a.e.a;
            return new m(CollectionsKt.listOf((Object[]) new j[]{wVar, vVar, sVar, eVar, uVar, new i(eVar2.j()), new c(hVar.d()), new o(eVar2.l(), eVar2.m()), new g(eVar2.i()), new b(eVar2.g()), new q(new Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.providers.l$a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.a.b();
                }
            }), new y(aVar.a(), null, null, 6, null)}));
        }
    }
}
