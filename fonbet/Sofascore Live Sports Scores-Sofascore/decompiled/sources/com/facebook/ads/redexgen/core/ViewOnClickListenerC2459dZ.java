package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2459dZ implements View.OnClickListener {
    public static String[] A01 = {"iIV4C6PCamFbOwLs9osqMP65CW35qHVZ", "vu8ePLRZods6FhLp1sOjcscbCnKQtV0u", "aj5bYqq1P6NsPozz4AKHPhJxq4tExiSQ", "sREORf6VoPUSDy", "tYmkAFK6aojaVt6XrGIUitMYwL", "t5b15Ic4Fw72vyTqFljisKwND31PO9vi", "k2wG1EEpilyBuA", "DdpD6jZ5PRtvRqlim5b1myDycB"};
    public final /* synthetic */ C5F A00;

    public ViewOnClickListenerC2459dZ(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1904Mt abstractC1904Mt;
        boolean z;
        boolean z2;
        InterfaceC2472dm interfaceC2472dm;
        AbstractC1904Mt abstractC1904Mt2;
        Handler handler;
        Runnable runnable;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1904Mt = this.A00.A0V;
            if (abstractC1904Mt instanceof AnonymousClass85) {
                z = this.A00.A0K;
                if (A01[5].charAt(19) != 'i') {
                    throw new RuntimeException();
                }
                A01[5] = "JfKhMnDlcffILoVNGoui3HCKoOWuag6G";
                if (!z) {
                    this.A00.A0L = true;
                    interfaceC2472dm = this.A00.A0Z;
                    interfaceC2472dm.ACQ();
                    C5F c5f = this.A00;
                    abstractC1904Mt2 = this.A00.A0V;
                    c5f.A0g(((AnonymousClass85) abstractC1904Mt2).A0M().toString());
                    if (((AbstractC1791Ij) this.A00).A06.A0q() >= 0) {
                        handler = this.A00.A08;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((AbstractC1791Ij) this.A00).A06.A0q());
                    }
                }
                C5F c5f2 = this.A00;
                z2 = this.A00.A0K;
                c5f2.A0j(z2 ? false : true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
