package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import defpackage.auj;
import defpackage.b7g;
import defpackage.cuj;
import defpackage.f1d;
import defpackage.gv9;
import defpackage.k0j;
import defpackage.k13;
import defpackage.l6g;
import defpackage.muj;
import defpackage.ns8;
import defpackage.p75;
import defpackage.unb;
import defpackage.vtj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(ns8 ns8Var, WebView webView, int i, f1d f1dVar, Function1 function1, t tVar, Function0 function0, Function0 function02) {
        this.b = ns8Var;
        this.c = webView;
        this.d = i;
        this.e = f1dVar;
        this.f = function1;
        this.g = tVar;
        this.h = function0;
        this.i = function02;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4 A[LOOP:0: B:16:0x009e->B:18:0x00a4, LOOP_END] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        Iterator it;
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.f;
        int i2 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                f1d f1dVar = (f1d) obj6;
                Context context = (Context) obj;
                context.getClass();
                return (View) ((ns8) obj8).invoke(context, (WebView) obj7, Integer.valueOf(i2), f1dVar, (Function1) obj5, new c(f1dVar, (Function0) obj3, 2), (Function0) obj4, (t) obj2, new p75(12.0f), Boolean.FALSE);
            case 1:
                f1d f1dVar2 = (f1d) obj6;
                t tVar = (t) obj2;
                Context context2 = (Context) obj;
                context2.getClass();
                return (View) ((ns8) obj8).invoke(context2, (WebView) obj7, Integer.valueOf(i2), f1dVar2, (Function1) obj5, new c(f1dVar2, (Function0) obj4, 3), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(3, (Function0) obj3), tVar, new p75(12.0f), Boolean.TRUE);
            default:
                String str = (String) obj8;
                muj mujVar = (muj) obj7;
                List list = (List) obj6;
                auj aujVar = (auj) obj5;
                List list2 = (List) obj4;
                List list3 = (List) obj3;
                gv9 gv9Var = (gv9) obj2;
                String str2 = mujVar.o;
                String str3 = mujVar.q;
                vtj vtjVar = mujVar.l;
                int i3 = mujVar.m;
                gv9 W = l6g.W(list);
                Integer valueOf = Integer.valueOf(i2);
                b7g i4 = aujVar != null ? vtjVar.i(mujVar.i(), aujVar, str3) : null;
                boolean z2 = i2 > 1;
                gv9 W2 = l6g.W(list2);
                gv9 W3 = l6g.W(list3);
                if (gv9Var == null || !gv9Var.isEmpty()) {
                    Iterator<E> it2 = gv9Var.iterator();
                    while (it2.hasNext()) {
                        if (((k0j) it2.next()).e) {
                            z = true;
                            String h = vtjVar.h(mujVar.i());
                            String c = vtjVar.c(mujVar.i());
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(vtjVar.d(mujVar.i(), (auj) it.next()));
                            }
                            return new unb(new cuj(str, str2, i3, W, valueOf, i4, z2, false, W2, W3, gv9Var, z, h, c, l6g.W(arrayList), vtjVar.getConfig()));
                        }
                    }
                }
                z = false;
                String h2 = vtjVar.h(mujVar.i());
                String c2 = vtjVar.c(mujVar.i());
                ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                }
                return new unb(new cuj(str, str2, i3, W, valueOf, i4, z2, false, W2, W3, gv9Var, z, h2, c2, l6g.W(arrayList2), vtjVar.getConfig()));
        }
    }

    public /* synthetic */ b(ns8 ns8Var, WebView webView, int i, f1d f1dVar, Function1 function1, Function0 function0, t tVar, Function0 function02) {
        this.b = ns8Var;
        this.c = webView;
        this.d = i;
        this.e = f1dVar;
        this.f = function1;
        this.h = function0;
        this.g = tVar;
        this.i = function02;
    }

    public /* synthetic */ b(String str, muj mujVar, List list, int i, auj aujVar, List list2, List list3, gv9 gv9Var) {
        this.b = str;
        this.c = mujVar;
        this.e = list;
        this.d = i;
        this.f = aujVar;
        this.h = list2;
        this.i = list3;
        this.g = gv9Var;
    }
}
