package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.wearable.zzab;
import com.google.android.gms.internal.wearable.zzac;
import com.google.android.gms.internal.wearable.zzad;
import com.google.android.gms.internal.wearable.zzcn;
import com.google.android.gms.internal.wearable.zzt;
import com.google.android.gms.internal.wearable.zzu;
import com.google.android.gms.internal.wearable.zzv;
import defpackage.a70;
import defpackage.rtn;
import defpackage.vp2;
import defpackage.wt3;
import defpackage.yhk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class PutDataMapRequest {
    public final PutDataRequest a;
    public final DataMap b = new DataMap();

    public PutDataMapRequest(PutDataRequest putDataRequest) {
        this.a = putDataRequest;
    }

    public static PutDataMapRequest b(String str) {
        Parcelable.Creator<PutDataRequest> creator = PutDataRequest.CREATOR;
        if (TextUtils.isEmpty(str)) {
            a70.p("An empty path was supplied.");
            return null;
        }
        if (!str.startsWith("/")) {
            a70.p("A path must start with a single / .");
            return null;
        }
        if (str.startsWith("//")) {
            a70.p("A path must start with a single / .");
            return null;
        }
        Uri build = new Uri.Builder().scheme("wear").path(str).build();
        if (build != null) {
            return new PutDataMapRequest(new PutDataRequest(build, new Bundle(), null, PutDataRequest.e));
        }
        yhk.s("uri must not be null");
        return null;
    }

    public final PutDataRequest a() {
        ArrayList arrayList = new ArrayList();
        zzu n = zzad.n();
        HashMap hashMap = this.b.a;
        TreeSet treeSet = new TreeSet(hashMap.keySet());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = hashMap.get(str);
            zzv n2 = zzac.n();
            n2.i();
            ((zzac) n2.b).o(str);
            zzab a = zzt.a(obj, arrayList);
            n2.i();
            ((zzac) n2.b).p(a);
            arrayList2.add((zzac) n2.j());
        }
        n.i();
        ((zzad) n.b).o(arrayList2);
        zzad zzadVar = (zzad) n.j();
        try {
            int zzT = zzadVar.zzT();
            byte[] bArr = new byte[zzT];
            boolean z = zzcn.b;
            rtn rtnVar = new rtn(bArr, zzT);
            zzadVar.a(rtnVar);
            if (rtnVar.u() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (rtnVar.u() < 0) {
                throw new IllegalStateException("Wrote more data than expected.");
            }
            PutDataRequest putDataRequest = this.a;
            putDataRequest.c = bArr;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String num = Integer.toString(i);
                Asset asset = (Asset) arrayList.get(i);
                if (num == null) {
                    a70.r("asset key cannot be null: ".concat(String.valueOf(asset)));
                    return null;
                }
                if (asset == null) {
                    a70.r("asset cannot be null: key=".concat(num));
                    return null;
                }
                if (Log.isLoggable("DataMap", 3)) {
                    new StringBuilder(num.length() + 33 + asset.toString().length());
                }
                putDataRequest.b.putParcelable(num, asset);
            }
            return putDataRequest;
        } catch (IOException e) {
            String name = zzad.class.getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
