package com.vk.pin.views.keyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.superapp.vkpay.pin.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.kma0;
import xsna.sf6;
import xsna.tdy;
import xsna.ufg;

/* compiled from: PinKeyboardView.kt */
/* loaded from: classes3.dex */
public final class PinKeyboardView extends LinearLayout {
    public final com.vk.pin.views.keyboard.a b;
    public a c;
    public final ArrayList d;
    public boolean e;

    /* compiled from: PinKeyboardView.kt */
    public interface a {
        void C(boolean z);

        void s(String str);
    }

    public PinKeyboardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes;
        this.d = new ArrayList();
        setOrientation(1);
        Context context2 = getContext();
        if (context2 != null && (obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0)) != null) {
            tdy tdyVar = new tdy(obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getDimensionPixelSize(5, 0), obtainStyledAttributes.getDimensionPixelSize(6, 0), obtainStyledAttributes.getDimensionPixelSize(4, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getInt(0, 0), obtainStyledAttributes.getDimensionPixelSize(7, 0));
            String string = obtainStyledAttributes.getString(2);
            string = string == null ? "" : string;
            if (string.length() > 0) {
                Object newInstance = getContext().getClassLoader().loadClass(string).getConstructor(tdy.class).newInstance(tdyVar);
                if (!(newInstance instanceof com.vk.pin.views.keyboard.a)) {
                    throw new IllegalArgumentException("Factory should extend KeyboardKeyFactory");
                }
                this.b = (com.vk.pin.views.keyboard.a) newInstance;
            } else {
                this.b = new b(tdyVar);
            }
            obtainStyledAttributes.recycle();
        }
        ArrayList arrayList = new ArrayList();
        com.vk.pin.views.keyboard.a aVar = this.b;
        int keysCount = ((aVar == null ? null : aVar).getKeysCount() - 1) / 3;
        if (keysCount >= 0) {
            int i3 = 0;
            while (true) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                layoutParams.weight = 1.0f;
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                arrayList.add(linearLayout);
                if (i3 == keysCount) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        com.vk.pin.views.keyboard.a aVar2 = this.b;
        int keysCount2 = (aVar2 == null ? null : aVar2).getKeysCount();
        for (int i4 = 0; i4 < keysCount2; i4++) {
            com.vk.pin.views.keyboard.a aVar3 = this.b;
            if (aVar3 == null) {
                aVar3 = null;
            }
            sf6<? super a> createKeyboardKey = aVar3.createKeyboardKey(getContext(), i4);
            ((LinearLayout) arrayList.get(i4 / 3)).addView(createKeyboardKey.a);
            this.d.add(createKeyboardKey);
        }
        a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addView((LinearLayout) it.next());
        }
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            final sf6 sf6Var = (sf6) it.next();
            View view = sf6Var.a;
            view.setOnClickListener(new ufg(1, this, sf6Var));
            if (sf6Var instanceof kma0) {
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.hma0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        PinKeyboardView pinKeyboardView = PinKeyboardView.this;
                        if (pinKeyboardView.e) {
                            return true;
                        }
                        sf6Var.b(pinKeyboardView.c);
                        return true;
                    }
                });
            }
        }
    }

    public final void setOnKeysListener(a aVar) {
        this.c = aVar;
        a();
    }

    public PinKeyboardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PinKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinKeyboardView(Context context) {
        this(context, null);
    }
}
