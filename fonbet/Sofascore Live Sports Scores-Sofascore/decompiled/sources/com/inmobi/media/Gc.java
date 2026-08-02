package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Gc extends hoi implements Function2 {
    public final /* synthetic */ Hc a;
    public final /* synthetic */ Jc b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gc(Hc hc, Jc jc, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = hc;
        this.b = jc;
        this.c = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Gc(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Gc) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Context context = this.a.b;
        if (context != null) {
            AudioManager audioManager = null;
            try {
                Object systemService = context.getSystemService("audio");
                if (!(systemService instanceof AudioManager)) {
                    systemService = null;
                }
                audioManager = (AudioManager) systemService;
            } catch (Throwable unused) {
            }
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    Hc hc = this.a;
                    if (streamVolume != hc.c) {
                        hc.c = streamVolume;
                        InterfaceC3880x9 interfaceC3880x9 = this.b.b;
                        if (interfaceC3880x9 != null) {
                            ((C3906y9) interfaceC3880x9).a("MraidMediaProcessor", "volume change detected - " + this.c);
                        }
                        this.b.a(this.a.a, streamVolume);
                    }
                } catch (Exception e) {
                    InterfaceC3880x9 interfaceC3880x92 = this.b.b;
                    if (interfaceC3880x92 != null) {
                        ((C3906y9) interfaceC3880x92).a("MraidMediaProcessor", "Unexpected error in volume listener", e);
                    }
                }
            }
        }
        return Unit.a;
    }
}
