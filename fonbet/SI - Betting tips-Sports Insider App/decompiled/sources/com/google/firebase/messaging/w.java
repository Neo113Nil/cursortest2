package com.google.firebase.messaging;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f6175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6176b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6177c;

    public w(String str, String str2, String str3) {
        this.f6175a = str;
        this.f6176b = str2;
        this.f6177c = str3;
    }

    public w(h9.c cVar) {
        this.f6175a = cVar.u("gcm.n.title");
        cVar.q("gcm.n.title");
        Object[] p10 = cVar.p("gcm.n.title");
        if (p10 != null) {
            String[] strArr = new String[p10.length];
            for (int i5 = 0; i5 < p10.length; i5++) {
                strArr[i5] = String.valueOf(p10[i5]);
            }
        }
        this.f6176b = cVar.u("gcm.n.body");
        cVar.q("gcm.n.body");
        Object[] p11 = cVar.p("gcm.n.body");
        if (p11 != null) {
            String[] strArr2 = new String[p11.length];
            for (int i10 = 0; i10 < p11.length; i10++) {
                strArr2[i10] = String.valueOf(p11[i10]);
            }
        }
        cVar.u("gcm.n.icon");
        if (TextUtils.isEmpty(cVar.u("gcm.n.sound2"))) {
            cVar.u("gcm.n.sound");
        }
        cVar.u("gcm.n.tag");
        cVar.u("gcm.n.color");
        this.f6177c = cVar.u("gcm.n.click_action");
        cVar.u("gcm.n.android_channel_id");
        String u10 = cVar.u("gcm.n.link_android");
        u10 = TextUtils.isEmpty(u10) ? cVar.u("gcm.n.link") : u10;
        if (!TextUtils.isEmpty(u10)) {
            Uri.parse(u10);
        }
        cVar.u("gcm.n.image");
        cVar.u("gcm.n.ticker");
        cVar.m("gcm.n.notification_priority");
        cVar.m("gcm.n.visibility");
        cVar.m("gcm.n.notification_count");
        cVar.l("gcm.n.sticky");
        cVar.l("gcm.n.local_only");
        cVar.l("gcm.n.default_sound");
        cVar.l("gcm.n.default_vibrate_timings");
        cVar.l("gcm.n.default_light_settings");
        cVar.r();
        cVar.o();
        cVar.v();
    }
}
