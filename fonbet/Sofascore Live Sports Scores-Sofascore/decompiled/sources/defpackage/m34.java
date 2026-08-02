package defpackage;

import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m34 extends p8 {
    public final /* synthetic */ int c;
    public final esk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m34(esk eskVar, int i) {
        super(eskVar.a);
        this.c = i;
        switch (i) {
            case 1:
                super(eskVar.a);
                this.d = eskVar;
                break;
            case 2:
                super(eskVar.a);
                this.d = eskVar;
                break;
            case 3:
                super(eskVar.a);
                this.d = eskVar;
                break;
            default:
                this.d = eskVar;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        esk eskVar = this.d;
        byte b = 0;
        int i4 = 1;
        switch (i3) {
            case 0:
                az9 az9Var = (az9) obj;
                az9Var.getClass();
                eskVar.b.setContent(new tc3(950039973, new l34(az9Var, b), true));
                break;
            case 1:
                zye zyeVar = (zye) obj;
                zyeVar.getClass();
                sea.v(eskVar.a, i == 0, zyeVar.h, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                eskVar.b.setContent(new tc3(-2049252050, new kce(zyeVar, i4, b), true));
                break;
            case 2:
                aze azeVar = (aze) obj;
                azeVar.getClass();
                sea.v(eskVar.a, azeVar.f, azeVar.g, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                String string = this.b.getString(R.string.status_set, yid.p(azeVar.a));
                string.getClass();
                StringBuilder sb = new StringBuilder(string);
                String str = azeVar.b;
                if (str.length() > 0) {
                    sb.append(" • ");
                    sb.append(str);
                }
                eskVar.b.setContent(new tc3(-1056841696, new oce(azeVar, sb.toString(), b), true));
                break;
            default:
                bze bzeVar = (bze) obj;
                bzeVar.getClass();
                sea.v(eskVar.a, i == 0, bzeVar.e, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                eskVar.b.setContent(new tc3(873027707, new pce(bzeVar, i4, b), true));
                break;
        }
    }
}
