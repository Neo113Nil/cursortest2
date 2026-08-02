package com.vk.movika.sdk.android.defaultplayer.container;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements gzs {
    public final /* synthetic */ g b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f(g gVar, boolean z) {
        this.b = gVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = com.vk.movika.sdk.utils.f.b.b - 1;
        g gVar = this.b;
        if (i <= 0) {
            com.vk.movika.sdk.utils.c.a(gVar, "InteractiveView");
        }
        if (gVar.g) {
            if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                com.vk.movika.sdk.utils.c.a(gVar, "InteractiveView");
                gVar.toString();
            }
            return s3q0.a;
        }
        if (gVar.e) {
            gVar.a(this.c);
        }
        gVar.g = true;
        b bVar = (b) gVar;
        ArrayList arrayList = bVar.n;
        if (bVar.a) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
            }
        }
        arrayList.clear();
        return s3q0.a;
    }
}
