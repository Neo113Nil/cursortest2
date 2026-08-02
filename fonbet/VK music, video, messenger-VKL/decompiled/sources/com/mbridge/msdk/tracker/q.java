package com.mbridge.msdk.tracker;

import android.util.Log;

/* compiled from: ProcessorWrapper.java */
/* loaded from: classes14.dex */
class q implements l {
    private final g a;

    public q(g gVar) {
        this.a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.a)) {
            return;
        }
        this.a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.a)) {
            return;
        }
        try {
            h j = eVar.j();
            if (y.a(j)) {
                eVar.a(j.a(eVar));
            }
            this.a.b(eVar);
        } catch (Exception e) {
            if (a.a) {
                Log.e("TrackManager", "process event error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.a)) {
            return new long[]{0, 0};
        }
        return this.a.a();
    }
}
