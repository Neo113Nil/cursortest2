package com.moloco.sdk.acm;

import com.facebook.c0;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();
    public final c0 a;
    public long b;
    public final ArrayList c = new ArrayList();
    public final String d;

    public h(String str, c0 c0Var) {
        this.a = c0Var;
        this.d = str;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = this.c;
        if (arrayList.size() >= 10 || str.length() > 100 || str2.length() > 100) {
            return;
        }
        arrayList.add(new e(str, str2));
    }
}
