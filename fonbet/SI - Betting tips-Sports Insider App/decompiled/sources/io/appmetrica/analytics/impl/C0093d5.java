package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093d5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13562a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13563b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f13564c;

    public C0093d5(Context context) {
        this.f13564c = context.getApplicationContext();
    }

    public final Ga a(Q4 q42, C0397p4 c0397p4, O7 o7, HashMap hashMap) {
        Ga ga2 = (Ga) hashMap.get(q42.toString());
        if (ga2 != null) {
            ga2.a(c0397p4);
            return ga2;
        }
        Ga a7 = o7.a(this.f13564c, q42, c0397p4);
        hashMap.put(q42.toString(), a7);
        return a7;
    }
}
