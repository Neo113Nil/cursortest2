package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hif implements ptc {
    public final Context a;
    public final Class b;

    public hif(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.ptc
    public final otc a(l2a l2aVar) {
        Class cls = this.b;
        return new jif(this.a, l2aVar.b(File.class, cls), l2aVar.b(Uri.class, cls), cls);
    }
}
