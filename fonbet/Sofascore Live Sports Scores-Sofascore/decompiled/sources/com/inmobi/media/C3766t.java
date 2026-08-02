package com.inmobi.media;

import com.squareup.picasso.Picasso;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3766t implements Function1 {
    public final /* synthetic */ C3844w a;

    public C3766t(C3844w c3844w) {
        this.a = c3844w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3906y9 c3906y9 = this.a.d;
        if (c3906y9 != null) {
            c3906y9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C3844w c3844w = this.a;
        C3906y9 c3906y92 = c3844w.d;
        if (c3906y92 != null) {
            c3906y92.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = C3447gg.a;
        C3447gg.b(c3844w.a).cancelTag(c3844w.e);
        return Unit.a;
    }
}
