package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final ArrayList e;

    public n(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, ArrayList arrayList) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = linkedHashMap3;
        this.d = linkedHashMap4;
        this.e = arrayList;
        ypa.b(new com.moloco.sdk.acm.services.d(this, 7));
    }

    public final String a(int i) {
        i iVar = (i) this.a.get(Integer.valueOf(i));
        if (iVar != null) {
            return iVar.b;
        }
        return null;
    }

    public final Uri b(int i) {
        j jVar = (j) this.b.get(Integer.valueOf(i));
        if (jVar != null) {
            return jVar.b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && this.b.equals(nVar.b) && this.c.equals(nVar.c) && this.d.equals(nVar.d) && this.e.equals(nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PreparedNativeAssets(data=" + this.a + ", images=" + this.b + ", titles=" + this.c + ", videos=" + this.d + ", failedAssets=" + this.e + ')';
    }
}
