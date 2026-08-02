package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j51 extends p50 {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ j51(int i, View view) {
        this.b = i;
        this.c = view;
    }

    @Override // defpackage.p50
    public final void a(Drawable drawable) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                k51 k51Var = (k51) view;
                k51Var.setIndeterminate(false);
                k51Var.c(k51Var.b);
                break;
            case 1:
                k51 k51Var2 = (k51) view;
                if (!k51Var2.g) {
                    k51Var2.setVisibility(k51Var2.h);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) view).o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.p50
    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.c;
                ColorStateList colorStateList = materialCheckBox.o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.s, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }
}
