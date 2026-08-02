package fc;

import androidx.annotation.NonNull;
import bc.AbstractC5634j;
import bc.AbstractC5641q;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: fc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6496a extends AbstractC5641q {
    @Override // bc.AbstractC5641q
    @NonNull
    public final AbstractC5634j.a a(@NonNull String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                throw new IOException("Bad response code: " + responseCode + ", url: " + str);
            }
            String headerField = httpURLConnection.getHeaderField("Content-Type");
            if (headerField == null) {
                headerField = null;
            } else {
                int indexOf = headerField.indexOf(59);
                if (indexOf > -1) {
                    headerField = headerField.substring(0, indexOf);
                }
            }
            return AbstractC5634j.a(new BufferedInputStream(httpURLConnection.getInputStream()), headerField);
        } catch (IOException e11) {
            throw new IllegalStateException(Nk.a.b("Exception obtaining network resource: ", str), e11);
        }
    }
}
