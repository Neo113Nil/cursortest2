package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭲ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0605 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0445 f1974;

    public C0605(C0445 c0445) {
        this.f1974 = c0445;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r3.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("6lgVzlbZ4H7uSwDUQ9H6efRYHcNW\n", "uhRUjROUpTA=\n")) == false) goto L13;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0445 c0445 = this.f1974;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0445.getClass();
        int hashCode = str.hashCode();
        if (hashCode != -1097819034) {
            if (hashCode == 1554700484) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("g9sM0FBFtVWHyBnKRU2vXYbbAcBWWrVenQ==\n", "05dNkxUI8Bs=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (c != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }
}
