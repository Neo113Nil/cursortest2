package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fek implements mja {
    @Override // defpackage.mja
    public final String a(Object obj, xvd xvdVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.c(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = xvdVar.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = l.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
