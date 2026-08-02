package com.vk.movika.sdk.android.defaultplayer.container;

import android.content.Context;

/* loaded from: classes3.dex */
public final class h {
    public final boolean a;
    public final boolean b;
    public final com.vk.movika.sdk.android.defaultplayer.layout.a c;
    public final com.vk.movika.sdk.android.defaultplayer.control.b d;
    public final boolean e;
    public final com.vk.movika.sdk.android.defaultplayer.interactive.c f;

    public h(Context context, boolean z, boolean z2, com.vk.movika.sdk.android.defaultplayer.control.b bVar, com.vk.movika.sdk.android.defaultplayer.control.c cVar, com.vk.movika.sdk.android.defaultplayer.interactive.c cVar2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z2;
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar = new com.vk.movika.sdk.android.defaultplayer.layout.a(context);
        bVar = (i & 32) != 0 ? new com.vk.movika.sdk.android.defaultplayer.control.b(context, null, false, z3, 18) : bVar;
        cVar2 = (i & 256) != 0 ? null : cVar2;
        this.a = z;
        this.b = false;
        this.c = aVar;
        this.d = bVar;
        this.e = true;
        this.f = cVar2;
    }
}
