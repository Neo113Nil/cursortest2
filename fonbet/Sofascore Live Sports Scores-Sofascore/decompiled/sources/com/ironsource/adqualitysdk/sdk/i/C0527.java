package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0527 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f1763 = new HashMap();

    public C0527() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r4 = r3.f1763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r4.isEmpty() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r4 = r4.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if (r4.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        r1 = (java.lang.String) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r0.contains(r1) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r1 = m349(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r1.f1794 != com.ironsource.adqualitysdk.sdk.i.EnumC0546.f1806) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r4 = true;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean m350(boolean z) {
        boolean z2;
        try {
            ArrayList arrayList = new ArrayList();
            if (z) {
                Iterator it = AbstractC0854.f2871.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toLowerCase());
                }
            } else {
                arrayList.add(AbstractC0854.f2872.toLowerCase());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0543 m349 = m349((String) it2.next());
                if (m349 == null || m349.f1794 != EnumC0546.f1806) {
                    break;
                }
            }
            z2 = false;
        } finally {
        }
        return z2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0543 m349(String str) {
        HashMap hashMap = this.f1763;
        if (hashMap != null) {
            return (C0543) hashMap.get(str);
        }
        return null;
    }
}
