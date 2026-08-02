package com.vk.push.core.network.http.ssl;

import android.content.Context;
import android.content.res.Resources;
import com.vk.push.common.Logger;
import com.vk.push.core.R;
import com.vk.push.core.data.repository.CrashReporterRepository;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Lambda;
import xsna.a0a;
import xsna.ape0;
import xsna.bpn0;
import xsna.emb;
import xsna.gzs;
import xsna.ro;
import xsna.s3q0;

/* compiled from: SSLConfigurator.kt */
/* loaded from: classes5.dex */
public final class SSLConfigurator {
    public final Context a;
    public final CrashReporterRepository b;
    public final Logger c;
    public final bpn0 d = new bpn0(new a());

    /* compiled from: SSLConfigurator.kt */
    public static final class a extends Lambda implements gzs<SSLSocketFactory> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final SSLSocketFactory invoke() {
            SSLContext access$createSSLContext = SSLConfigurator.access$createSSLContext(SSLConfigurator.this);
            access$createSSLContext.init(new KeyManager[0], SSLConfigurator.access$createTrustManagers(SSLConfigurator.this), new SecureRandom());
            return access$createSSLContext.getSocketFactory();
        }
    }

    public SSLConfigurator(Context context, CrashReporterRepository crashReporterRepository, Logger logger) {
        this.a = context;
        this.b = crashReporterRepository;
        this.c = logger.createLogger("SSLConfigurator");
    }

    public static final SSLContext access$createSSLContext(SSLConfigurator sSLConfigurator) {
        sSLConfigurator.getClass();
        try {
            try {
                return SSLContext.getInstance("TLSv1.3");
            } catch (NoSuchAlgorithmException e) {
                sSLConfigurator.c.error("TLS algorithm not available", e);
                throw new IOException("Failed to create SSL context", e);
            }
        } catch (NoSuchAlgorithmException unused) {
            return SSLContext.getInstance("TLS");
        }
    }

    public static final javax.net.ssl.TrustManager[] access$createTrustManagers(SSLConfigurator sSLConfigurator) {
        sSLConfigurator.getClass();
        Logger logger = sSLConfigurator.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            InputStream openRawResource = sSLConfigurator.a.getResources().openRawResource(R.raw.vkcm_cacerts_pins);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(openRawResource), emb.b);
                ArrayList arrayList = new ArrayList();
                a0a.a(inputStreamReader, new ape0(arrayList, 17));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((String) it.next());
                }
                s3q0 s3q0Var = s3q0.a;
                ro.e(openRawResource, null);
                Logger.DefaultImpls.debug$default(logger, "Loaded " + linkedHashSet.size() + " certificate pins", null, 2, null);
                return new javax.net.ssl.TrustManager[]{new TrustManager(linkedHashSet, sSLConfigurator.b, logger)};
            } finally {
            }
        } catch (Resources.NotFoundException e) {
            logger.error("Certificate pins not found in resources", e);
            throw new IOException("Certificate pins not found in resources", e);
        } catch (IOException e2) {
            logger.error("Failed to read certificate pins file", e2);
            throw new IOException("Failed to load certificate pins from resources", e2);
        }
    }

    public final void configureSSL$core_release(HttpURLConnection httpURLConnection) {
        boolean z = httpURLConnection instanceof HttpsURLConnection;
        Logger logger = this.c;
        if (!z) {
            Logger.DefaultImpls.debug$default(logger, "Skipping SSL configuration for non-HTTPS connection", null, 2, null);
            return;
        }
        try {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory((SSLSocketFactory) this.d.getValue());
        } catch (KeyManagementException e) {
            logger.error("Failed to initialize SSL context", e);
            throw new IOException("Failed to configure SSL", e);
        }
    }
}
