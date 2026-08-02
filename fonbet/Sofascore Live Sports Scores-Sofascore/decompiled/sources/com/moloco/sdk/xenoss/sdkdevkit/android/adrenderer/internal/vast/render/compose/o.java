package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e b;

    public /* synthetic */ o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                com.facebook.login.i iVar = eVar.v;
                Integer valueOf = Integer.valueOf(eVar.E);
                String str = eVar.l;
                List list = (List) iVar.b;
                if (list != null) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1) iVar.d).a(list, null, valueOf, str);
                    iVar.b = null;
                }
                break;
            default:
                com.facebook.login.i iVar2 = eVar.v;
                Integer valueOf2 = Integer.valueOf(eVar.E);
                String str2 = eVar.l;
                List list2 = (List) iVar2.c;
                if (list2 != null) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1) iVar2.d).a(list2, null, valueOf2, str2);
                    iVar2.c = null;
                }
                break;
        }
        return Unit.a;
    }
}
