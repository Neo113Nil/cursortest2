package com.huawei.hms.framework.network.grs.h.g;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import xsna.kjp;
import xsna.ppm0;
import xsna.w2i0;
import xsna.y2i0;

/* loaded from: classes13.dex */
public class a {
    private static final HostnameVerifier a = new ppm0();

    public static HostnameVerifier a() {
        return a;
    }

    public static SSLSocketFactory a(Context context) {
        try {
            return new w2i0(new y2i0(context.getAssets().open(GrsApp.getInstance().getBrand(DomExceptionUtils.SEPARATOR) + "grs_sp.bks")), kjp.a());
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
