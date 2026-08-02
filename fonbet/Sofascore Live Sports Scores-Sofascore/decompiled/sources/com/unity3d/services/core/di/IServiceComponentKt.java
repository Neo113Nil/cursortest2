package com.unity3d.services.core.di;

import com.ironsource.U3;
import defpackage.joa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "Lcom/unity3d/services/core/di/IServiceComponent;", "", "named", "get", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "Lysa;", U3.a.t, "Ljoa;", "inject", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;Lysa;)Ljoa;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IServiceComponentKt {
    public static final <T> T get(IServiceComponent iServiceComponent, String str) {
        iServiceComponent.getClass();
        str.getClass();
        iServiceComponent.getServiceProvider().getRegistry();
        Intrinsics.h();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        iServiceComponent.getClass();
        str.getClass();
        iServiceComponent.getServiceProvider().getRegistry();
        Intrinsics.h();
        throw null;
    }

    public static final <T> joa inject(IServiceComponent iServiceComponent, String str, ysa ysaVar) {
        iServiceComponent.getClass();
        str.getClass();
        ysaVar.getClass();
        Intrinsics.h();
        throw null;
    }

    public static joa inject$default(IServiceComponent iServiceComponent, String str, ysa ysaVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            ysaVar = ysa.c;
        }
        iServiceComponent.getClass();
        str.getClass();
        ysaVar.getClass();
        Intrinsics.h();
        throw null;
    }
}
