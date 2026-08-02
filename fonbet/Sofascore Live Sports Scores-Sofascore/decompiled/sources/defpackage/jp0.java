package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zztd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jp0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jp0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        on4 on4Var;
        bka bkaVar;
        yg6 yg6Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((lp0) ((kp0) obj).c).i.g(-1, new a70(12));
                break;
            case 1:
                if (audioTrack.equals(((on4) ((kp0) obj).c).u) && (bkaVar = (on4Var = (on4) ((kp0) obj).c).r) != null && on4Var.U && (yg6Var = ((t2c) bkaVar.b).O0) != null) {
                    yg6Var.a.h.c(2);
                    break;
                }
                break;
            default:
                zzeg zzegVar = ((zztd) ((kp0) obj).c).i;
                zzegVar.c(-1, fff.r);
                zzegVar.d();
                break;
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lp0) ((kp0) obj).c).i.g(-1, new a70(13));
                break;
            case 1:
            default:
                super.onPresentationEnded(audioTrack);
                break;
            case 2:
                zzeg zzegVar = ((zztd) ((kp0) obj).c).i;
                zzegVar.c(-1, ubf.p);
                zzegVar.d();
                break;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        on4 on4Var;
        bka bkaVar;
        yg6 yg6Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lp0) ((kp0) obj).c).i.g(-1, new a70(12));
                break;
            case 1:
                if (audioTrack.equals(((on4) ((kp0) obj).c).u) && (bkaVar = (on4Var = (on4) ((kp0) obj).c).r) != null && on4Var.U && (yg6Var = ((t2c) bkaVar.b).O0) != null) {
                    yg6Var.a.h.c(2);
                    break;
                }
                break;
            default:
                zzeg zzegVar = ((zztd) ((kp0) obj).c).i;
                zzegVar.c(-1, dff.q);
                zzegVar.d();
                break;
        }
    }
}
