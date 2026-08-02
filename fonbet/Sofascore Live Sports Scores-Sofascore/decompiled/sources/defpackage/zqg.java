package defpackage;

import android.app.Activity;
import com.ironsource.A8;
import com.ironsource.Sb;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class zqg implements l.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Sb b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zqg(Sb sb, Object obj, int i) {
        this.a = i;
        this.b = sb;
        this.c = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        int i = this.a;
        Object obj = this.c;
        Sb sb = this.b;
        switch (i) {
            case 0:
                Sb.a(sb, (Activity) obj, aVar);
                break;
            default:
                Sb.a(sb, (A8) obj, aVar);
                break;
        }
    }
}
