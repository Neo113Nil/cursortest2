package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import android.view.TextureView;
import com.google.protobuf.Internal;
import com.moloco.sdk.i2;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ad2;
import defpackage.u53;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar) {
        this.b = context;
        this.c = eVar;
        this.d = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                Internal.ListAdapter listAdapter = (Internal.ListAdapter) obj2;
                ad2 ad2Var = (ad2) ((n) obj).a;
                ArrayList arrayList = new ArrayList();
                if (listAdapter.contains(i2.MAX)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding AppLovin as ILRD provider", null, false, 12, null);
                    arrayList.add(new com.moloco.sdk.internal.ilrd.provider.c(context, ad2Var));
                }
                if (listAdapter.contains(i2.LEVEL_PLAY)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding IronSource as ILRD provider", null, false, 12, null);
                    arrayList.add(new com.moloco.sdk.internal.ilrd.provider.f(context, ad2Var));
                }
                return CollectionsKt.S0(arrayList);
            default:
                boolean z = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) obj2).s;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j a = com.moloco.sdk.service_locator.g.a();
                context.getClass();
                a.getClass();
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l(new u53(new TextureView(context), z, a, new com.moloco.sdk.internal.publisher.nativead.parser.b(context, 1)), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q) obj);
        }
    }

    public /* synthetic */ o(Internal.ListAdapter listAdapter, Context context, n nVar) {
        this.c = listAdapter;
        this.b = context;
        this.d = nVar;
    }
}
