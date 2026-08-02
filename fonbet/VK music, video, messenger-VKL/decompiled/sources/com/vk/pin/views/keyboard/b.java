package com.vk.pin.views.keyboard;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vkontakte.android.R;
import xsna.dgy;
import xsna.egy;
import xsna.fgy;
import xsna.iah0;
import xsna.kma0;
import xsna.krv0;
import xsna.qno;
import xsna.sf6;
import xsna.tdy;
import xsna.vla0;

/* compiled from: KeyboardKeyFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class b implements a {
    public final tdy a;
    public int b = 1;
    public int c;

    public b(tdy tdyVar) {
        this.a = tdyVar;
    }

    @Override // com.vk.pin.views.keyboard.a
    public final sf6<? super PinKeyboardView.a> createKeyboardKey(Context context, int i) {
        sf6<? super PinKeyboardView.a> kma0Var;
        tdy tdyVar = this.a;
        if ((i >= 0 && i < 9) || i == 10) {
            int i2 = this.b;
            this.b = i2 + 1;
            int i3 = i2 % 10;
            dgy dgyVar = new dgy(context, this);
            dgyVar.setAutoSizeTextTypeUniformWithConfiguration(16, 24, 1, 1);
            dgyVar.setText(String.valueOf(i3));
            dgyVar.setGravity(17);
            dgyVar.setTypeface(null, tdyVar.f);
            dgyVar.setTextColor(krv0.m(R.attr.vk_ui_text_primary, context));
            kma0Var = new vla0(dgyVar, String.valueOf(i3));
        } else if (i == 9) {
            kma0Var = new qno(new egy(context, this));
        } else {
            if (i != 11) {
                throw new IllegalArgumentException();
            }
            fgy fgyVar = new fgy(context, this);
            TypedValue typedValue = krv0.a;
            krv0.p(fgyVar, R.drawable.vk_icon_backspace_outline_28, R.attr.vk_ui_icon_secondary);
            fgyVar.setScaleType(ImageView.ScaleType.CENTER);
            kma0Var = new kma0(fgyVar);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(tdyVar.b, tdyVar.c, tdyVar.d, tdyVar.e);
        layoutParams.weight = 1.0f;
        View view = kma0Var.a;
        view.setLayoutParams(layoutParams);
        if (kma0Var instanceof qno) {
            view.setBackground(null);
            return kma0Var;
        }
        int i4 = tdyVar.a;
        if (i4 != 0) {
            view.setBackgroundResource(i4);
            return kma0Var;
        }
        if (kma0Var instanceof kma0) {
            view.setBackgroundResource(R.drawable.pin_remove_button_bg);
            return kma0Var;
        }
        if (kma0Var instanceof vla0) {
            view.setBackgroundResource(R.drawable.pin_button_grey);
        }
        return kma0Var;
    }

    @Override // com.vk.pin.views.keyboard.a
    public final int getActualSize(int i, int i2) {
        int minSize = getMinSize(i, i2);
        return Math.min(Math.max(Math.max(i, i2), minSize), getMaxSize(i, i2));
    }

    @Override // com.vk.pin.views.keyboard.a
    public final int getKeysCount() {
        return 12;
    }

    @Override // com.vk.pin.views.keyboard.a
    public final int getMaxSize(int i, int i2) {
        int i3 = this.c;
        if (i3 != 0) {
            return i3;
        }
        int a = iah0.a(76);
        if (a * 4 > i2 || a * 3 > i) {
            int min = Math.min(i / 3, i2 / 4);
            this.c = min;
            return min;
        }
        int i4 = a - (((double) iah0.f().density) <= 1.5d ? this.a.g : 0);
        this.c = i4;
        return i4;
    }

    @Override // com.vk.pin.views.keyboard.a
    public final int getMinSize(int i, int i2) {
        return iah0.a(24);
    }
}
