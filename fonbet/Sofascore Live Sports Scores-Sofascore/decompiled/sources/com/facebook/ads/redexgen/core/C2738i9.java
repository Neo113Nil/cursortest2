package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2738i9 implements InterfaceC1956Ou {
    private C1957Ov A00(InterfaceC1955Ot interfaceC1955Ot) {
        return (C1957Ov) interfaceC1955Ot.A7E();
    }

    public final void A01(InterfaceC1955Ot interfaceC1955Ot) {
        if (!interfaceC1955Ot.A9R()) {
            interfaceC1955Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC1955Ot);
        float A8r = A8r(interfaceC1955Ot);
        float elevation = AbstractC1959Ox.A00(A8S, A8r, interfaceC1955Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1959Ox.A01(A8S, A8r, interfaceC1955Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC1955Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final ColorStateList A71(InterfaceC1955Ot interfaceC1955Ot) {
        return A00(interfaceC1955Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final float A7v(InterfaceC1955Ot interfaceC1955Ot) {
        return interfaceC1955Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final float A8S(InterfaceC1955Ot interfaceC1955Ot) {
        return A00(interfaceC1955Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final float A8X(InterfaceC1955Ot interfaceC1955Ot) {
        return A8r(interfaceC1955Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final float A8Y(InterfaceC1955Ot interfaceC1955Ot) {
        return A8r(interfaceC1955Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final float A8r(InterfaceC1955Ot interfaceC1955Ot) {
        return A00(interfaceC1955Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void AAG(InterfaceC1955Ot interfaceC1955Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1957Ov background = new C1957Ov(colorStateList, f);
        interfaceC1955Ot.AJK(background);
        View view = interfaceC1955Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC1955Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void ADP(InterfaceC1955Ot interfaceC1955Ot) {
        AJX(interfaceC1955Ot, A8S(interfaceC1955Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void AFT(InterfaceC1955Ot interfaceC1955Ot) {
        AJX(interfaceC1955Ot, A8S(interfaceC1955Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void AJJ(InterfaceC1955Ot interfaceC1955Ot, ColorStateList colorStateList) {
        A00(interfaceC1955Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void AJP(InterfaceC1955Ot interfaceC1955Ot, float f) {
        interfaceC1955Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void AJX(InterfaceC1955Ot interfaceC1955Ot, float f) {
        A00(interfaceC1955Ot).A07(f, interfaceC1955Ot.A9R(), interfaceC1955Ot.A8q());
        A01(interfaceC1955Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1956Ou
    public final void AJj(InterfaceC1955Ot interfaceC1955Ot, float f) {
        A00(interfaceC1955Ot).A06(f);
    }
}
