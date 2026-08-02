package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC14675d {
    public static void A00(InterfaceC3148pF interfaceC3148pF) {
        if (interfaceC3148pF != null) {
            try {
                interfaceC3148pF.close();
            } catch (IOException unused) {
            }
        }
    }
}
