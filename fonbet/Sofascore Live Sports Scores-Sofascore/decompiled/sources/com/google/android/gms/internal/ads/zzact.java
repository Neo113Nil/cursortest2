package com.google.android.gms.internal.ads;

import defpackage.wgo;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzact {
    public final ByteBuffer a = ByteBuffer.allocateDirect(500);
    public zzgw b;

    public final void a(ArrayList arrayList) {
        zzgw zzgwVar;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((zzgv) arrayList.get(i)).a == 1) {
                try {
                    zzgwVar = new zzgw((zzgv) arrayList.get(i));
                } catch (wgo unused) {
                    zzgwVar = null;
                }
                this.b = zzgwVar;
            }
        }
    }
}
