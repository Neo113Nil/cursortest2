package defpackage;

import android.media.AudioManager;
import com.inmobi.media.U1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nn0 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nn0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                sn0 sn0Var = (sn0) obj;
                sn0Var.getClass();
                if (i != -3 && i != -2) {
                    if (i == -1) {
                        ih6 ih6Var = sn0Var.c;
                        if (ih6Var != null) {
                            ih6Var.h.b(33, -1, 0).b();
                        }
                        sn0Var.a();
                        sn0Var.b(1);
                        break;
                    } else if (i == 1) {
                        sn0Var.b(2);
                        ih6 ih6Var2 = sn0Var.c;
                        if (ih6Var2 != null) {
                            ih6Var2.h.b(33, 1, 0).b();
                            break;
                        }
                    } else {
                        fn0.r(i, "Unknown focus change type: ");
                        break;
                    }
                } else if (i == -2) {
                    ih6 ih6Var3 = sn0Var.c;
                    if (ih6Var3 != null) {
                        ih6Var3.h.b(33, 0, 0).b();
                    }
                    sn0Var.b(3);
                    break;
                } else {
                    sn0Var.b(4);
                    break;
                }
                break;
            default:
                U1.a((U1) obj, i);
                break;
        }
    }
}
