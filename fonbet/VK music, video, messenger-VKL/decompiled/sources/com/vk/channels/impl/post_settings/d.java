package com.vk.channels.impl.post_settings;

import android.content.Context;
import com.vk.channels.impl.post_settings.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.a0a;
import xsna.bpn0;
import xsna.daz;
import xsna.gd40;
import xsna.hm50;
import xsna.mxv;
import xsna.xwk;

/* compiled from: PostSettingsNavigationEventRouter.kt */
/* loaded from: classes16.dex */
public final class d implements hm50<c> {
    public final Context a;
    public final mxv b;
    public final gd40 c;
    public final bpn0 d = new bpn0(new daz(8));

    public d(Context context, mxv mxvVar, gd40 gd40Var) {
        this.a = context;
        this.b = mxvVar;
        this.c = gd40Var;
    }

    @Override // xsna.hm50
    public final void a(c cVar) {
        c cVar2 = cVar;
        Context context = this.a;
        if (cVar2 instanceof c.b) {
            xwk.d().e().a(context, ((String) this.d.getValue()) + ((c.b) cVar2).a);
            return;
        }
        if (!(cVar2 instanceof c.C0541c)) {
            if (!(cVar2 instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.c.invoke();
        } else {
            this.b.k();
            xwk.d().f().a(context, "https://" + a0a.d + "/@authors-markirovka-reklamy", false);
        }
    }
}
