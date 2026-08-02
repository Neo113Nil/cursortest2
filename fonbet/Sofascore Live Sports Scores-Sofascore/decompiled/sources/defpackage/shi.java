package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class shi implements otc {
    public final /* synthetic */ int a;
    public final otc b;

    public /* synthetic */ shi(otc otcVar, int i) {
        this.a = i;
        this.b = otcVar;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        Uri fromFile;
        int i3 = this.a;
        otc otcVar = this.b;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    fromFile = null;
                } else if (str.charAt(0) == '/') {
                    fromFile = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
                }
                if (fromFile == null || !otcVar.b(fromFile)) {
                    return null;
                }
                return otcVar.a(fromFile, i, i2, uvdVar);
            default:
                return otcVar.a(new qz8((URL) obj), i, i2, uvdVar);
        }
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
