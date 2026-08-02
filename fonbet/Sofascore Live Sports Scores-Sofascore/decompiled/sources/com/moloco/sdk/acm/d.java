package com.moloco.sdk.acm;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public final ArrayList a;
    public final String b;
    public int c;

    public d(String str) {
        str.getClass();
        this.a = new ArrayList();
        this.b = str;
        this.c = 1;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.size() >= 10 || str.length() > 100 || str2.length() > 100) {
            return;
        }
        arrayList.add(new e(str, str2));
    }
}
