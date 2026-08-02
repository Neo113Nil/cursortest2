package com.google.android.gms.internal.pal;

import defpackage.a70;
import defpackage.p4n;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzyy {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zzabe zzabeVar = new zzabe(stringWriter);
            zzabeVar.e = true;
            zzaba.a.getClass();
            p4n.a(zzabeVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }
}
