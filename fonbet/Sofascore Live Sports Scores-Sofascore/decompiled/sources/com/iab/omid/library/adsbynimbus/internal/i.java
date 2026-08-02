package com.iab.omid.library.adsbynimbus.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adsbynimbus.internal.d;
import com.iab.omid.library.adsbynimbus.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.adsbynimbus.devicevolume.c {
    private static i f;
    private float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private final com.iab.omid.library.adsbynimbus.devicevolume.e b;
    private final com.iab.omid.library.adsbynimbus.devicevolume.b c;
    private com.iab.omid.library.adsbynimbus.devicevolume.d d;
    private c e;

    public i(com.iab.omid.library.adsbynimbus.devicevolume.e eVar, com.iab.omid.library.adsbynimbus.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    public static i c() {
        i iVar = f;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(new com.iab.omid.library.adsbynimbus.devicevolume.e(), new com.iab.omid.library.adsbynimbus.devicevolume.b());
        f = iVar2;
        return iVar2;
    }

    @Override // com.iab.omid.library.adsbynimbus.devicevolume.c
    public void a(float f2) {
        this.a = f2;
        Iterator<com.iab.omid.library.adsbynimbus.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public float b() {
        return this.a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.c();
    }

    private c a() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        c c = c.c();
        this.e = c;
        return c;
    }

    public void a(Context context) {
        this.d = this.b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.adsbynimbus.internal.d.a
    public void a(boolean z) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}
