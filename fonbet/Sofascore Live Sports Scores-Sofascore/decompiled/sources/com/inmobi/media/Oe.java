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
public final class Oe extends C2 {
    public static final /* synthetic */ int i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oe(ku3 ku3Var, InterfaceC3880x9 interfaceC3880x9) {
        super(ku3Var, interfaceC3880x9);
        ku3Var.getClass();
    }

    @Override // com.inmobi.media.AbstractC3406f1
    public final void a(String str, List list, Map map, String str2, String str3, boolean z) {
        str.getClass();
        list.getClass();
        map.getClass();
        str3.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        X4.a(this.a, new Ne(this, AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z), X0.a(str, list, map, str2, str3), null));
    }
}
