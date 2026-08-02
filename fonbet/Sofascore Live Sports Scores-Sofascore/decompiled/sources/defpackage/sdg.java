package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sdg extends RelativeLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdg(int i, Context context, Object obj) {
        super(context);
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        rcg rcgVar;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (keyEvent != null) {
                    tdg tdgVar = (tdg) obj;
                    if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                        if (tdgVar.v != ndg.b) {
                            return false;
                        }
                        kcg kcgVar = tdgVar.m;
                        if (kcgVar == null) {
                            Intrinsics.i("closeController");
                            throw null;
                        }
                        if (kcgVar.b <= 0 || (rcgVar = (rcg) kcgVar.e.e) == rcg.d || rcgVar == rcg.e) {
                            xag xagVar = tdgVar.q;
                            if (xagVar != null) {
                                bea.r(xagVar);
                            }
                            veg vegVar = tdgVar.r;
                            if (vegVar != null) {
                                vegVar.a("window.mraidbridge.notifyCloseEvent();");
                            }
                        }
                        return true;
                    }
                }
                return super.onKeyPreIme(i, keyEvent);
            case 1:
                if (keyEvent != null) {
                    tfg tfgVar = (tfg) obj;
                    if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                        if (tfgVar.M != jfg.b) {
                            return false;
                        }
                        ahg ahgVar = tfgVar.r;
                        if (ahgVar == null) {
                            Intrinsics.i("videoCloseController");
                            throw null;
                        }
                        if (ahgVar.m) {
                            tfgVar.onCloseRequested();
                        }
                        return true;
                    }
                }
                return super.onKeyPreIme(i, keyEvent);
            default:
                if (keyEvent != null) {
                    yhg yhgVar = (yhg) obj;
                    if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                        if (yhgVar.q != mhg.b) {
                            return false;
                        }
                        if (yhgVar.e.f) {
                            yhgVar.onCloseRequested();
                        } else {
                            ahg ahgVar2 = yhgVar.v;
                            if (ahgVar2 == null) {
                                Intrinsics.i("videoCloseController");
                                throw null;
                            }
                            if (ahgVar2.m) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return super.onKeyPreIme(i, keyEvent);
        }
    }
}
