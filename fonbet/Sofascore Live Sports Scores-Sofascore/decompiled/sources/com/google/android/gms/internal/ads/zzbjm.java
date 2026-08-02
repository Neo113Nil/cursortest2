package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import defpackage.a70;
import defpackage.f2n;
import defpackage.nnn;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public final class zzbjm {
    public static final void a(zzbjl zzbjlVar, zzbjj zzbjjVar) {
        File externalStorageDirectory;
        Context context = zzbjjVar.c;
        String str = zzbjjVar.d;
        if (context == null) {
            a70.p("Context can't be null. Please set up context in CsiConfiguration.");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a70.p("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
            return;
        }
        String str2 = zzbjjVar.a;
        LinkedHashMap linkedHashMap = zzbjjVar.b;
        zzbjlVar.e = context;
        zzbjlVar.f = str;
        zzbjlVar.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        zzbjlVar.h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzblc.c.c()).booleanValue());
        if (zzbjlVar.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            int i = zzgar.a;
            zzbjlVar.i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            zzbjlVar.b.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcgj.a.execute(new f2n(zzbjlVar, 19));
        HashMap hashMap = zzbjlVar.c;
        nnn nnnVar = zzbjr.b;
        hashMap.put("action", nnnVar);
        hashMap.put("ad_format", nnnVar);
        hashMap.put("e", zzbjr.c);
    }
}
