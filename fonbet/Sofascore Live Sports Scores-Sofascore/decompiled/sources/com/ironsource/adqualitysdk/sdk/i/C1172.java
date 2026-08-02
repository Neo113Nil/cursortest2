package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1172 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1170 f3662;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View f3663;

    public C1172(C1170 c1170, View view) {
        this.f3662 = c1170;
        this.f3663 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C1064 c1064 = this.f3662.f3659.f3649;
        View view = this.f3663;
        C1064 c10642 = C1064.f3359;
        synchronized (c1064) {
            Iterator it = c1064.f3361.iterator();
            while (it.hasNext()) {
                ((Y) it.next()).mo75(view);
            }
        }
    }
}
