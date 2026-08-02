package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z84 extends rn5 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z84(qn5 qn5Var, int i) {
        super(qn5Var);
        this.e = i;
    }

    @Override // defpackage.rn5
    public void q() {
        switch (this.e) {
            case 0:
                qn5 qn5Var = this.b;
                qn5Var.o = null;
                CheckableImageButton checkableImageButton = qn5Var.g;
                checkableImageButton.setOnLongClickListener(null);
                fkf.L(checkableImageButton, null);
                break;
        }
    }
}
