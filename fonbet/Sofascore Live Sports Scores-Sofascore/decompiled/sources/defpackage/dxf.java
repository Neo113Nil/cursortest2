package defpackage;

import com.google.android.gms.cast.framework.media.MediaQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dxf extends MediaQueue.Callback {
    public final /* synthetic */ hxf a;

    public dxf(hxf hxfVar) {
        this.a = hxfVar;
    }

    @Override // com.google.android.gms.cast.framework.media.MediaQueue.Callback
    public final void a() {
        hxf hxfVar = this.a;
        hxfVar.b0();
        hxfVar.m.b();
    }
}
