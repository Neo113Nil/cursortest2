package com.vk.movika.sdk.android.defaultplayer.control;

import android.content.Context;
import kotlin.collections.EmptyList;
import xsna.j8y;
import xsna.q1t;

/* loaded from: classes3.dex */
public final class b {
    public final Context a;
    public final q1t b;
    public final boolean c;
    public final boolean d;
    public final j8y e;

    public b(Context context, q1t q1tVar, boolean z, boolean z2, int i) {
        q1tVar = (i & 2) != 0 ? null : q1tVar;
        z = (i & 4) != 0 ? false : z;
        EmptyList emptyList = EmptyList.b;
        this.a = context;
        this.b = q1tVar;
        this.c = z;
        this.d = z2;
        this.e = com.vk.movika.sdk.base.data.b.a(emptyList);
    }
}
