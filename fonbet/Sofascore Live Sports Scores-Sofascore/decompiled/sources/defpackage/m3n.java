package defpackage;

import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m3n extends zba {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3n b;

    public /* synthetic */ m3n(p3n p3nVar, int i) {
        this.a = i;
        this.b = p3nVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public void d3(Status status) {
        switch (this.a) {
            case 1:
                ((o3n) this.b).a(status);
                break;
            default:
                super.d3(status);
                break;
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public void p3(Status status) {
        switch (this.a) {
            case 0:
                ((n3n) this.b).a(status);
                break;
            default:
                super.p3(status);
                break;
        }
    }
}
