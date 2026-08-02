package defpackage;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zwf implements ResultCallback {
    public final /* synthetic */ hxf a;

    public zwf(hxf hxfVar) {
        this.a = hxfVar;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(Result result) {
        hxf hxfVar = this.a;
        if (hxfVar.u != null) {
            hxfVar.a0(this);
            hxfVar.m.b();
        }
    }
}
