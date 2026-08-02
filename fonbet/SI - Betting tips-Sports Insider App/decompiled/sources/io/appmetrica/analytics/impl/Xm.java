package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xm extends M2 {
    public Xm(int i5, @NonNull String str) {
        this(i5, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f12558a;
    }

    public Xm(int i5, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i5, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i5 = this.f12558a;
            if (length > i5) {
                String substring = str.substring(0, i5);
                this.f12560c.warning("\"%s\" %s size exceeded limit of %d characters", this.f12559b, str, Integer.valueOf(this.f12558a));
                return substring;
            }
        }
        return str;
    }

    @NonNull
    public final String a() {
        return this.f12559b;
    }
}
