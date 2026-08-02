package com.iab.omid.library.bigosg.attestation;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* loaded from: classes13.dex */
public class i implements b {
    private final Context a;
    private final j b;

    public i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.a = context;
        this.b = j.a(context);
    }

    @Override // com.iab.omid.library.bigosg.attestation.b
    public String a() {
        return "FireTVFOSDAT";
    }

    @Override // com.iab.omid.library.bigosg.attestation.b
    public h b() {
        return h.NATIVE;
    }

    @Override // com.iab.omid.library.bigosg.attestation.b
    public List<String> c() {
        return Collections.singletonList("1.0");
    }

    private String a(String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    private boolean b(String str) {
        try {
            new URL(str);
            if (str.startsWith("https://")) {
                return true;
            }
            return str.startsWith("http://");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.bigosg.attestation.b
    public void a(a aVar) {
        if (!this.b.b()) {
            com.iab.omid.library.bigosg.utils.d.b("Attestation failed: Full attestation capability not available");
            return;
        }
        if (aVar == null) {
            com.iab.omid.library.bigosg.utils.d.b("Attestation failed: AttestationArgs is null");
            return;
        }
        if (aVar.a() == null) {
            com.iab.omid.library.bigosg.utils.d.b("Attestation failed: attestationData is null");
            return;
        }
        String str = aVar.a().get("verifierurl");
        String a = a(aVar.a().get("version"));
        if (str == null || str.trim().isEmpty()) {
            com.iab.omid.library.bigosg.utils.d.b("Attestation failed: verifier URL is null or empty");
            return;
        }
        if (!b(str)) {
            com.iab.omid.library.bigosg.utils.d.b("Attestation failed: invalid verifier URL format: ".concat(str));
            return;
        }
        com.iab.omid.library.bigosg.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: ".concat(str));
        try {
            if (this.a == null) {
                com.iab.omid.library.bigosg.utils.d.b("Attestation failed: application context is null");
            } else {
                PrivacyPass.getInstance(this.a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, a);
            }
        } catch (IllegalArgumentException e) {
            com.iab.omid.library.bigosg.utils.d.a("Attestation failed: Invalid input parameters", e);
        } catch (Exception e2) {
            com.iab.omid.library.bigosg.utils.d.a("Attestation failed: unexpected error", e2);
        }
    }
}
