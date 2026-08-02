package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.mio;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzz {
    public String a;
    public Uri b;
    public final List c;
    public final s d;
    public final zzai e;

    public zzz() {
        new zzaa();
        mio mioVar = zzgxm.b;
        s sVar = s.e;
        this.c = Collections.EMPTY_LIST;
        this.d = s.e;
        new zzae();
        this.e = zzai.a;
    }

    public final zzak a() {
        Uri uri = this.b;
        zzag zzagVar = uri != null ? new zzag(uri, this.c, this.d) : null;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(), zzagVar, new zzaf(), zzan.C, this.e);
    }
}
