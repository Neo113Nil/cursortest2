package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzwy;
import com.google.android.gms.internal.cast.zzwz;
import defpackage.bgp;
import defpackage.dcp;
import defpackage.fn0;
import defpackage.hcp;
import defpackage.vp2;
import defpackage.wfp;
import defpackage.wt3;
import defpackage.x5n;
import defpackage.yhk;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzwz<MessageType extends zzwz<MessageType, BuilderType>, BuilderType extends zzwy<MessageType, BuilderType>> implements zzzi {
    protected int zza = 0;

    public static void b(List list, ArrayList arrayList) {
        Charset charset = zzym.a;
        int size = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof wfp) {
            wfp wfpVar = (wfp) list;
            int i = wfpVar.c + size;
            int length = wfpVar.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = x5n.e(length, 3, 2, 1, 10);
                    }
                    wfpVar.b = Arrays.copyOf(wfpVar.b, length);
                } else {
                    wfpVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                int size4 = list.size() - size2;
                String k = fn0.k(size4, "Element at index ", " is null.", new StringBuilder(String.valueOf(size4).length() + 26));
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size2) {
                        yhk.s(k);
                        return;
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public int a(bgp bgpVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzzi
    public final dcp t() {
        try {
            zzyd zzydVar = (zzyd) this;
            int zzE = zzydVar.zzE();
            dcp dcpVar = zzxk.b;
            byte[] bArr = new byte[zzE];
            Logger logger = zzxp.b;
            hcp hcpVar = new hcp(bArr, zzE);
            zzydVar.u(hcpVar);
            if (hcpVar.e - hcpVar.f == 0) {
                return new dcp(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
