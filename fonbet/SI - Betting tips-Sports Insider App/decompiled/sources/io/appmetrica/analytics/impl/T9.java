package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    public final Tl f12914a = new Tl();

    /* renamed from: b, reason: collision with root package name */
    public V9 f12915b = new V9();

    public final synchronized void a(V9 v92) {
        this.f12915b = v92;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f12915b.f13030a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    V9 v92 = this.f12915b;
                    IdentifierStatus identifierStatus = v92.f13031b;
                    String str2 = v92.f13032c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new gf.m();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f12914a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
