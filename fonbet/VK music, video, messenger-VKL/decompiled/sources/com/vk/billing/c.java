package com.vk.billing;

import com.vk.billing.GoogleStorePurchasesManagerImpl;
import java.util.ArrayList;
import java.util.Map;
import xsna.asu0;
import xsna.j27;
import xsna.ugq;

/* compiled from: GoogleStorePurchasesManagerImpl.kt */
/* loaded from: classes15.dex */
public final class c implements j27 {
    public final /* synthetic */ GoogleStorePurchasesManagerImpl a;
    public final /* synthetic */ Map<String, Object> b;
    public final /* synthetic */ ArrayList<String> c;
    public final /* synthetic */ String d;
    public final /* synthetic */ GoogleStorePurchasesManagerImpl.b e;

    public c(GoogleStorePurchasesManagerImpl googleStorePurchasesManagerImpl, Map<String, Object> map, ArrayList<String> arrayList, String str, GoogleStorePurchasesManagerImpl.b bVar) {
        this.a = googleStorePurchasesManagerImpl;
        this.b = map;
        this.c = arrayList;
        this.d = str;
        this.e = bVar;
    }

    @Override // xsna.j27
    public final void a() {
        GoogleStorePurchasesManagerImpl.b bVar = this.e;
        if (bVar != null) {
            bVar.e(3);
        }
    }

    @Override // xsna.j27
    public final void b() {
        asu0.a.getClass();
        asu0.n().submit(new ugq(this.a, this.b, this.c, this.d, this.e));
    }

    @Override // xsna.j27
    public final String getName() {
        return "getGooglePlayPrices";
    }
}
