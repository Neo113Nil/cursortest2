package com.iab.omid.library.bigosg.attestation;

import android.content.Context;

/* loaded from: classes13.dex */
public final class e {
    private static final d a = new d();

    public static void a(Context context, String str, a aVar) {
        String concat;
        String str2;
        if (context == null) {
            str2 = "Attestation failed: Application Context cannot be null";
        } else {
            if (str != null) {
                try {
                    if (!str.trim().isEmpty()) {
                        if (aVar != null) {
                            if (c.a(context).a(str)) {
                                b a2 = a.a(str, context);
                                if (a2 != null) {
                                    a2.a(aVar);
                                    return;
                                }
                                concat = "Failed to create mechanism: ".concat(str);
                            } else {
                                concat = "Mechanism not supported on this device: ".concat(str);
                            }
                            com.iab.omid.library.bigosg.utils.d.d(concat);
                            return;
                        }
                        str2 = "Attestation failed: Attestation arguments cannot be null";
                    }
                } catch (Exception e) {
                    com.iab.omid.library.bigosg.utils.d.a("Error during attestation with mechanism: ".concat(String.valueOf(str)), e);
                    return;
                }
            }
            str2 = "Attestation failed: Mechanism name cannot be null or empty";
        }
        com.iab.omid.library.bigosg.utils.d.b(str2);
    }
}
