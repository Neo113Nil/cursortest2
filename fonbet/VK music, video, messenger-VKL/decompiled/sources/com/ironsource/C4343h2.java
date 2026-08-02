package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ac3;

/* renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4343h2 implements Vc {
    private final V0 a;
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C4343h2(V0 v0, com.ironsource.mediationsdk.e eVar) {
        this.a = v0;
        this.b = eVar;
    }

    @Override // com.ironsource.Vc
    public void a(B b, String str, C4440ma c4440ma) {
        this.b.a(b.h(), b.r(), b.m(), str);
        a(c4440ma, b);
    }

    @Override // com.ironsource.Vc
    public void a(List<? extends B> list, B b) {
        if (this.c) {
            return;
        }
        this.c = true;
        C4504q2 h = b.h();
        this.b.a(h, b.r(), b.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C4504q2> concurrentHashMap = new ConcurrentHashMap<>();
        for (B b2 : list) {
            arrayList.add(b2.p());
            concurrentHashMap.put(b2.p(), b2.h());
        }
        this.b.a(arrayList, concurrentHashMap, b.r(), b.m(), h);
    }

    private final void a(C4440ma c4440ma, B b) {
        W8 w8 = new W8(b.e());
        Iterator it = new HashSet(c4440ma.a()).iterator();
        while (it.hasNext()) {
            this.a.d(new ac3(this, (ImpressionDataListener) it.next(), w8, 5));
            this.a.d().h().a(w8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4343h2 c4343h2, ImpressionDataListener impressionDataListener, W8 w8) {
        IronLog.CALLBACK.verbose(C4484p0.a(c4343h2.a, "onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + w8, (String) null, 2, (Object) null));
        impressionDataListener.onImpressionSuccess(w8);
    }
}
