package defpackage;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qek implements otc {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));
    public final otc a;

    public qek(otc otcVar) {
        this.a = otcVar;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        return this.a.a(new qz8(((Uri) obj).toString(), s89.a), i, i2, uvdVar);
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
