package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.IconData;
import com.google.ads.interactivemedia.v3.impl.data.IconsViewData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gnn implements orn {
    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
        ArrayList arrayList = new ArrayList();
        IconsViewData iconsView = javaScriptMsgData.iconsView();
        if (iconsView == null || iconsView.icons() == null) {
            return;
        }
        Iterator<IconData> it = iconsView.icons().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }
}
