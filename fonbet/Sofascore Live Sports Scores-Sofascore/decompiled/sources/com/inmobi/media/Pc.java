package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import defpackage.ku3;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Pc extends AbstractC3406f1 {
    public static final /* synthetic */ int h = 0;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pc(ku3 ku3Var, C3906y9 c3906y9) {
        super(ku3Var, c3906y9);
        ku3Var.getClass();
        ku3Var.getClass();
        this.g = "Pc";
    }

    @Override // com.inmobi.media.AbstractC3406f1
    public final void a(String str, List list, Map map, String str2, String str3, boolean z) {
        str.getClass();
        list.getClass();
        map.getClass();
        str3.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("NativeAdSessionManager", "initializeAdSession");
        }
        X4.a(this.a, new Oc(this, AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, z), X0.a(str, list, map, str2, str3), null));
    }

    @Override // com.inmobi.media.AbstractC3406f1
    public final void a() {
        if (this.e == null) {
            this.g.getClass();
        } else {
            X4.a(this.a, new C3588m2(this, null));
        }
    }
}
