package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.internal.d;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class i implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {
    private static i f;
    private float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private final com.iab.omid.library.bytedance2.devicevolume.e b;
    private final com.iab.omid.library.bytedance2.devicevolume.b c;
    private com.iab.omid.library.bytedance2.devicevolume.d d;
    private c e;

    public i(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    public static i c() {
        i iVar = f;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        f = iVar2;
        return iVar2;
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f2) {
        this.a = f2;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public float b() {
        return this.a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.d();
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

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}
