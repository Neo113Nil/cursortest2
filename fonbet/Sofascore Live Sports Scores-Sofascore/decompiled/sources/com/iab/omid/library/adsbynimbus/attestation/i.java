package com.iab.omid.library.adsbynimbus.attestation;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import defpackage.a70;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class i implements b {
    private final Context a;
    private final j b;

    public i(Context context) {
        if (context == null) {
            a70.p("Application context cannot be null");
            throw null;
        }
        this.a = context;
        this.b = j.a(context);
    }

    private boolean b(String str) {
        try {
            new URL(str);
            if (!str.startsWith("https://")) {
                if (!str.startsWith("http://")) {
                    return false;
                }
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.adsbynimbus.attestation.b
    public void a(a aVar) {
        String str;
        String str2;
        if (!this.b.b()) {
            str = "Attestation failed: Full attestation capability not available";
        } else if (aVar == null) {
            str = "Attestation failed: AttestationArgs is null";
        } else if (aVar.a() == null) {
            str = "Attestation failed: attestationData is null";
        } else {
            String str3 = aVar.a().get("verifierurl");
            String a = a(aVar.a().get("version"));
            if (str3 == null || str3.trim().isEmpty()) {
                str = "Attestation failed: verifier URL is null or empty";
            } else {
                if (b(str3)) {
                    com.iab.omid.library.adsbynimbus.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: ".concat(str3));
                    try {
                        if (this.a == null) {
                            com.iab.omid.library.adsbynimbus.utils.d.b("Attestation failed: application context is null");
                            return;
                        } else {
                            PrivacyPass.getInstance(this.a).attest(new VerificationContext(Collections.singletonList(str3)), (AttestAPICallback) null, a);
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str2 = "Attestation failed: Invalid input parameters";
                        com.iab.omid.library.adsbynimbus.utils.d.a(str2, e);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "Attestation failed: unexpected error";
                        com.iab.omid.library.adsbynimbus.utils.d.a(str2, e);
                        return;
                    }
                }
                str = "Attestation failed: invalid verifier URL format: ".concat(str3);
            }
        }
        com.iab.omid.library.adsbynimbus.utils.d.b(str);
    }

    @Override // com.iab.omid.library.adsbynimbus.attestation.b
    public List<String> c() {
        return Collections.singletonList("1.0");
    }

    @Override // com.iab.omid.library.adsbynimbus.attestation.b
    public h b() {
        return h.NATIVE;
    }

    private String a(String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    @Override // com.iab.omid.library.adsbynimbus.attestation.b
    public String a() {
        return "FireTVFOSDAT";
    }
}
