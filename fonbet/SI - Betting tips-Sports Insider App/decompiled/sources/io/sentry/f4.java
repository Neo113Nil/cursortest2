package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum f4 {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE;

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
