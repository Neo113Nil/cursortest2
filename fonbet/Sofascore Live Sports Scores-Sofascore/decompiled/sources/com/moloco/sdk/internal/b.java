package com.moloco.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v0;
import defpackage.bsk;
import defpackage.e1d;
import defpackage.g6b;
import defpackage.o13;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj2;
                d dVar = (d) obj;
                WeakHashMap weakHashMap = bsk.a;
                if (frameLayout.isAttachedToWindow()) {
                    dVar.a(frameLayout);
                } else {
                    frameLayout.addOnAttachStateChangeListener(new c(frameLayout, dVar, frameLayout));
                }
                break;
            case 1:
                ((MolocoInitializationListener) obj2).onMolocoInitializationStatus((MolocoInitStatus) obj);
                break;
            case 2:
                ((View) obj2).removeOnAttachStateChangeListener((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r) obj);
                break;
            case 3:
                ((g6b) obj2).d((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t) obj);
                break;
            case 4:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b) obj;
                break;
            case 5:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d) obj;
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u) obj2).getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (dVar2 != null) {
                    for (List list : dVar2.c) {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj3 : list) {
                            String str = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj3).d;
                            if (str == null || StringsKt.R(str)) {
                                arrayList8.add(obj3);
                            }
                        }
                        Iterator it = arrayList8.iterator();
                        while (it.hasNext()) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m mVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) it.next()).e;
                            if (mVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) mVar).a;
                                o13.v(uVar.d, arrayList);
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar = uVar.e;
                                if (aVar != null) {
                                    o13.v(aVar.b, arrayList2);
                                    o13.v(aVar.c, arrayList3);
                                }
                                o13.v(uVar.f, arrayList6);
                            } else if (!(mVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k)) {
                                zzl.b();
                                break;
                            } else {
                                o13.v(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) mVar).a, arrayList7);
                            }
                        }
                        arrayList4.add(arrayList6);
                        arrayList5.add(arrayList7);
                    }
                }
                break;
            case 6:
                View view = (View) obj2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v vVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v) obj;
                if (view != null && view.getParent() == vVar) {
                    vVar.removeView(view);
                }
                break;
            case 7:
                View view2 = (View) obj2;
                v0 v0Var = (v0) obj;
                if (view2.getViewTreeObserver().isAlive()) {
                    view2.getViewTreeObserver().removeOnPreDrawListener(v0Var);
                }
                break;
            default:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdWebViewRenderer", "Countdown finished - skip button is now available", null, false, 12, null);
                ((e1d) obj2).setValue(Boolean.TRUE);
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
