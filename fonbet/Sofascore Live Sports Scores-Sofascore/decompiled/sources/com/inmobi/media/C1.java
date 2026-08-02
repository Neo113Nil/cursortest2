package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C1 extends B5 {
    public final Context b;
    public final long c;
    public final int d;
    public final String e;
    public final ActivityManager f;
    public final Qa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Context context, C5 c5, long j, int i) {
        super(c5);
        context.getClass();
        c5.getClass();
        this.b = context;
        this.c = j;
        this.d = i;
        this.e = "C1";
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        this.f = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = Qa.b;
        this.g = Pa.a(context, "appClose");
    }

    @Override // com.inmobi.media.B5
    public final void a() {
        Hl.a(new B1(this, null));
    }

    @Override // com.inmobi.media.B5
    public final void b() {
    }
}
