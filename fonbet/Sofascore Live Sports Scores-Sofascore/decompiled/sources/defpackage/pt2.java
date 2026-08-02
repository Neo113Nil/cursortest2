package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pt2 extends pea {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pt2(Object obj, int i) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.pea
    public final void A(Typeface typeface, boolean z) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                st2 st2Var = chip.e;
                chip.setText(st2Var.M0 ? st2Var.O : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    e9j e9jVar = (e9j) obj;
                    e9jVar.e = true;
                    d9j d9jVar = (d9j) e9jVar.f.get();
                    if (d9jVar != null) {
                        d9jVar.a();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.pea
    public final void z(int i) {
        switch (this.g) {
            case 0:
                break;
            default:
                e9j e9jVar = (e9j) this.h;
                e9jVar.e = true;
                d9j d9jVar = (d9j) e9jVar.f.get();
                if (d9jVar != null) {
                    d9jVar.a();
                    break;
                }
                break;
        }
    }

    private final void K(int i) {
    }
}
