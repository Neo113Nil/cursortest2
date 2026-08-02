package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class l {
    public int a;
    public final String b;
    public InputStream c;
    public Map d;
    public String e;
    public final ArrayList f = new ArrayList();

    public l(FilterInputStream filterInputStream, int i, String str, Map map, String str2) {
        this.c = filterInputStream;
        this.a = i;
        this.b = str;
        this.d = map;
        this.e = str2;
    }

    public void a() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public l() {
    }
}
