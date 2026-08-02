package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class W1 extends AbstractC2596fo {
    public static String[] A01 = {"hExgTQdw1kv5p4SGmSicbF82985LCpum", "OSM8v", "iL8QA6bjiVhv7y8TzYON6pF30CxXc7Eu", "LpLF7ms2E8gIcrW5L7jBJg3HcpVfC8m9", "nyKyIbOxza05szDl5mK4c2SMRynlWefb", "BGGrZQbo3jXV4aVW1zlLDKwbTLCVQORY", "wI7v5HbNskmPwObzpny5FWr5GhKQDnFZ", "gz5SetHbJQqiE2gsx67H3auEs"};
    public final /* synthetic */ C2136Vz A00;

    public W1(C2136Vz c2136Vz) {
        this.A00 = c2136Vz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2596fo
    public final void A00() {
        C15076r c15076r;
        C15076r c15076r2;
        c15076r = this.A00.A07;
        if (c15076r == null) {
            return;
        }
        C2136Vz c2136Vz = this.A00;
        if (A01[4].charAt(24) != 'R') {
            throw new RuntimeException();
        }
        A01[0] = "oRBMgw8vkLwlbJMhgBKrYszA0eyE8H4t";
        c15076r2 = c2136Vz.A07;
        c15076r2.A0X();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0 != false) goto L15;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2596fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03() {
        C15076r c15076r;
        boolean z;
        boolean z2;
        boolean A0T;
        c15076r = this.A00.A07;
        if (c15076r != null) {
            z = this.A00.A0E;
            if (!z) {
                z2 = this.A00.A0D;
                if (!z2) {
                    C2136Vz c2136Vz = this.A00;
                    if (A01[4].charAt(24) != 'R') {
                        throw new RuntimeException();
                    }
                    A01[5] = "C0qKRDQoQScpUymuNxw7FdDIXXvcdKLa";
                    A0T = c2136Vz.A0T();
                }
                this.A00.A0R(EnumC2539et.A02);
            }
            this.A00.A0D = false;
            this.A00.A0E = false;
        }
    }
}
