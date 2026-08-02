package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import android.content.res.Resources;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q;
import defpackage.dnd;
import defpackage.j8f;
import defpackage.k8f;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((j8f) ((k8f) obj3)).d(new f((File) obj, (g) obj2));
                break;
            case 1:
                long j = ((dnd) obj).a;
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g) obj3).j = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(((int) dnd.f(j)) / Resources.getSystem().getDisplayMetrics().density, ((int) dnd.g(j)) / Resources.getSystem().getDisplayMetrics().density);
                break;
            case 2:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) obj3;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g) obj;
                gVar.getClass();
                ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g) obj2).getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar2 = iVar.a;
                gVar2.j = gVar;
                if (iVar.d instanceof q) {
                    Function0 function0 = iVar.b;
                    if (function0 != null) {
                        function0.invoke();
                    } else {
                        gVar2.b(gVar);
                    }
                }
                break;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) obj3;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c) obj2;
                dVar.getClass();
                cVar.getClass();
                eVar.f(dVar);
                eVar.e(cVar);
                break;
        }
        return Unit.a;
    }
}
