package com.google.android.gms.internal.measurement;

import android.content.Context;
import defpackage.ddb;
import defpackage.tmi;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqe {
    public final Context a;
    public final tmi b;
    public final tmi c;
    public final tmi d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile ddb h = null;

    public zzqe(Context context, tmi tmiVar, tmi tmiVar2, tmi tmiVar3) {
        this.a = context;
        this.b = tmiVar;
        this.c = tmiVar2;
        this.d = tmiVar3;
    }
}
