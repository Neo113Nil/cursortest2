package defpackage;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class el9 implements cz7 {
    public final mqi a;
    public final mqi b;
    public final boolean c;

    public el9(mqi mqiVar, mqi mqiVar2, boolean z) {
        this.a = mqiVar;
        this.b = mqiVar2;
        this.c = z;
    }

    @Override // defpackage.cz7
    public final ez7 a(Object obj, xvd xvdVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.c(uri.getScheme(), "http") && !Intrinsics.c(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        return new hl9(uri.toString(), xvdVar, this.a, this.b, this.c);
    }
}
