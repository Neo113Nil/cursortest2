package com.moloco.sdk.acm.db;

import defpackage.k6g;
import defpackage.y0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g extends y0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k6g k6gVar, int i) {
        super(k6gVar);
        this.d = i;
    }

    @Override // defpackage.y0
    public final String c() {
        switch (this.d) {
            case 0:
                return "DELETE FROM events";
            default:
                return "DELETE FROM sqlite_sequence WHERE name='events'";
        }
    }
}
