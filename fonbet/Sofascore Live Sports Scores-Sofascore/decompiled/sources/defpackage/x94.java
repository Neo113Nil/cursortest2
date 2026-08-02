package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x94 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ aa4 e;

    public x94(aa4 aa4Var, int i, Uri uri, boolean z, Bundle bundle) {
        this.e = aa4Var;
        this.a = i;
        this.b = uri;
        this.c = z;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b.onRelationshipValidationResult(this.a, this.b, this.c, this.d);
    }
}
