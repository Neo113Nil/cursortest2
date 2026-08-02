package com.google.android.gms.internal.ads;

import defpackage.aro;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzioa extends aro {
    public static final /* synthetic */ int b = 0;

    static {
        zzinx.a(Collections.EMPTY_MAP);
    }

    public static zzinz a(int i) {
        return new zzinz(i);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zziof) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
