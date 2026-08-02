package com.google.android.gms.internal.ads;

import android.view.View;
import defpackage.a70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfwo {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ArrayList a = new ArrayList();

    public final void a(View view) {
        zzfwn zzfwnVar;
        if (view == null) {
            a70.p("FriendlyObstruction is null");
            return;
        }
        if (!b.matcher("Ad overlay").matches()) {
            a70.p("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            return;
        }
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzfwnVar = null;
                break;
            } else {
                zzfwnVar = (zzfwn) it.next();
                if (zzfwnVar.a.get() == view) {
                    break;
                }
            }
        }
        if (zzfwnVar == null) {
            arrayList.add(new zzfwn(view));
        }
    }
}
