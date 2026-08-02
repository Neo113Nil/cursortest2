package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾄ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1175 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1170 f3669;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View f3670;

    public C1175(C1170 c1170, View view) {
        this.f3669 = c1170;
        this.f3670 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C1064 c1064 = this.f3669.f3659.f3649;
        View view = this.f3670;
        C1064 c10642 = C1064.f3359;
        synchronized (c1064) {
            Iterator it = c1064.f3361.iterator();
            while (it.hasNext()) {
                ((Y) it.next()).mo76(view);
            }
        }
    }
}
