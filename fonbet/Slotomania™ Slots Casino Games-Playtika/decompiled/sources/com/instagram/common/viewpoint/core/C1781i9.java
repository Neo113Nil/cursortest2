package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1781i9 implements InterfaceC0999Ou {
    private C1000Ov A00(InterfaceC0998Ot interfaceC0998Ot) {
        return (C1000Ov) interfaceC0998Ot.A7E();
    }

    public final void A01(InterfaceC0998Ot interfaceC0998Ot) {
        if (!interfaceC0998Ot.A9R()) {
            interfaceC0998Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC0998Ot);
        float A8r = A8r(interfaceC0998Ot);
        float elevation = AbstractC1002Ox.A00(A8S, A8r, interfaceC0998Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1002Ox.A01(A8S, A8r, interfaceC0998Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC0998Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final ColorStateList A71(InterfaceC0998Ot interfaceC0998Ot) {
        return A00(interfaceC0998Ot).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final float A7v(InterfaceC0998Ot interfaceC0998Ot) {
        return interfaceC0998Ot.A7F().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final float A8S(InterfaceC0998Ot interfaceC0998Ot) {
        return A00(interfaceC0998Ot).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final float A8X(InterfaceC0998Ot interfaceC0998Ot) {
        return A8r(interfaceC0998Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final float A8Y(InterfaceC0998Ot interfaceC0998Ot) {
        return A8r(interfaceC0998Ot) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final float A8r(InterfaceC0998Ot interfaceC0998Ot) {
        return A00(interfaceC0998Ot).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void AAE() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void AAG(InterfaceC0998Ot interfaceC0998Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1000Ov background = new C1000Ov(colorStateList, f);
        interfaceC0998Ot.AJK(background);
        View view = interfaceC0998Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC0998Ot, f3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void ADP(InterfaceC0998Ot interfaceC0998Ot) {
        AJX(interfaceC0998Ot, A8S(interfaceC0998Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void AFT(InterfaceC0998Ot interfaceC0998Ot) {
        AJX(interfaceC0998Ot, A8S(interfaceC0998Ot));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void AJJ(InterfaceC0998Ot interfaceC0998Ot, ColorStateList colorStateList) {
        A00(interfaceC0998Ot).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void AJP(InterfaceC0998Ot interfaceC0998Ot, float f) {
        interfaceC0998Ot.A7F().setElevation(f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void AJX(InterfaceC0998Ot interfaceC0998Ot, float f) {
        A00(interfaceC0998Ot).A07(f, interfaceC0998Ot.A9R(), interfaceC0998Ot.A8q());
        A01(interfaceC0998Ot);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0999Ou
    public final void AJj(InterfaceC0998Ot interfaceC0998Ot, float f) {
        A00(interfaceC0998Ot).A06(f);
    }
}
