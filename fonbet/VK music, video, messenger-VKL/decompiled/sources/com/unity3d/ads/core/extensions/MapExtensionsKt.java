package com.unity3d.ads.core.extensions;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import xsna.emb;

/* compiled from: MapExtensions.kt */
/* loaded from: classes14.dex */
public final class MapExtensionsKt {
    public static final int sizeInKb(Map<String, String> map) {
        Iterator<T> it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Charset charset = emb.b;
            i += str.getBytes(charset).length + str2.getBytes(charset).length;
        }
        return i / 1024;
    }
}
