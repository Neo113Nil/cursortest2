package com.google.android.material.chip;

import android.widget.CompoundButton;
import s7.InterfaceC9612g;

/* loaded from: classes9.dex */
final class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Chip f58147a;

    a(Chip chip) {
        this.f58147a = chip;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        InterfaceC9612g.a aVar;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2;
        InterfaceC9612g.a aVar2;
        Chip chip = this.f58147a;
        aVar = chip.f58125i;
        if (aVar != null) {
            aVar2 = chip.f58125i;
            aVar2.a(chip, z11);
        }
        onCheckedChangeListener = chip.f58124h;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener2 = chip.f58124h;
            onCheckedChangeListener2.onCheckedChanged(compoundButton, z11);
        }
    }
}
