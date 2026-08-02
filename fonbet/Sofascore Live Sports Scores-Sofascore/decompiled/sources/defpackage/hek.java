package defpackage;

import android.net.Uri;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hek implements otc {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(U3.i.b, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "android.resource")));
    public final gek a;

    public hek(gek gekVar) {
        this.a = gekVar;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        xd4 ri0Var;
        Uri uri = (Uri) obj;
        wjd wjdVar = new wjd(uri);
        gek gekVar = this.a;
        switch (gekVar.a) {
            case 0:
                ri0Var = new ri0(gekVar.b, uri, gekVar.c, 0);
                break;
            case 1:
                ri0Var = new ri0(gekVar.b, uri, gekVar.c, 1);
                break;
            default:
                ri0Var = new ngi(gekVar.b, uri, gekVar.c);
                break;
        }
        return new ntc(wjdVar, ri0Var);
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
