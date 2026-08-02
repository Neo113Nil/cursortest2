package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒷ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0674 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2282;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2283;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0858 f2284;

    public C0674(C0558 c0558, C0858 c0858, Context context) {
        this.f2282 = c0558;
        this.f2284 = c0858;
        this.f2283 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        boolean mo143;
        AbstractC1008.m610(new C0677(this));
        C0558 c0558 = this.f2282;
        Context context = this.f2283;
        synchronized (c0558) {
            mo143 = AbstractC0274.m142().mo143();
        }
        if (!mo143) {
            AbstractC1008.m615(new C0652(c0558), AbstractC0274.m142().mo154());
        }
        String str = AbstractC0854.f2872;
        ArrayList arrayList = new ArrayList(AbstractC0854.f2870.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            List<AbstractC0706> list = (List) AbstractC0854.f2870.get(str2);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC0706 abstractC0706 : list) {
                    if (AbstractC0854.m521(abstractC0706)) {
                        arrayList2.add(abstractC0706);
                    }
                }
                linkedHashMap.put(str2, arrayList2);
            }
        }
        AbstractC1008.m610(new C0637(c0558, context, linkedHashMap));
    }
}
