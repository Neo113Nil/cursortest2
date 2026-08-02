package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Um extends M2 {
    public Um(int i5, @NonNull String str) {
        this(i5, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f12558a;
    }

    public Um(int i5, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i5, str, publicLogger);
    }

    @NonNull
    public final String a() {
        return this.f12559b;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i5 = this.f12558a;
            if (length <= i5) {
                return str;
            }
            String str2 = new String(bytes, 0, i5, "UTF-8");
            try {
                this.f12560c.warning("\"%s\" %s exceeded limit of %d bytes", this.f12559b, str, Integer.valueOf(this.f12558a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
