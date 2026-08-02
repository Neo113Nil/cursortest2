package defpackage;

import android.net.Uri;
import androidx.media3.common.b;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nzf extends ozf {
    public final jlf f;
    public final d4a g;

    public nzf(b bVar, hv9 hv9Var, h1h h1hVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(bVar, hv9Var, h1hVar, arrayList, arrayList2, arrayList3);
        Uri.parse(((o71) hv9Var.get(0)).a);
        long j = h1hVar.e;
        jlf jlfVar = j <= 0 ? null : new jlf(null, h1hVar.d, j);
        this.f = jlfVar;
        this.g = jlfVar == null ? new d4a(new jlf(null, 0L, -1L), 17) : null;
    }

    @Override // defpackage.ozf
    public final String a() {
        return null;
    }

    @Override // defpackage.ozf
    public final jd4 b() {
        return this.g;
    }

    @Override // defpackage.ozf
    public final jlf c() {
        return this.f;
    }
}
