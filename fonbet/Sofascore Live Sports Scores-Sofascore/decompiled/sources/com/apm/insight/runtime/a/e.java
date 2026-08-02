package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e extends c {
    public e(Context context, b bVar, d dVar) {
        super(CrashType.BLOCK, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a = super.a(aVar);
        com.apm.insight.a.a(a, (Header) null, this.a);
        return a;
    }

    @Override // com.apm.insight.runtime.a.c
    public final boolean b() {
        return true;
    }

    @Override // com.apm.insight.runtime.a.c
    public final boolean c() {
        return false;
    }
}
