package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jif implements otc {
    public final Context a;
    public final otc b;
    public final otc c;
    public final Class d;

    public jif(Context context, otc otcVar, otc otcVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = otcVar;
        this.c = otcVar2;
        this.d = cls;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        Uri uri = (Uri) obj;
        return new ntc(new wjd(uri), new iif(this.a, this.b, this.c, uri, i, i2, uvdVar, this.d));
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && aa.g((Uri) obj);
    }
}
