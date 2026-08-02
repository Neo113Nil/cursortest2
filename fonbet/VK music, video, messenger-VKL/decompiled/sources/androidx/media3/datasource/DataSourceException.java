package androidx.media3.datasource;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes12.dex */
public class DataSourceException extends IOException {
    public final int reason;

    public DataSourceException(int i) {
        this.reason = i;
    }

    public DataSourceException(@Nullable Exception exc, int i) {
        super(exc);
        this.reason = i;
    }

    public DataSourceException(@Nullable String str, int i) {
        super(str);
        this.reason = i;
    }

    public DataSourceException(@Nullable String str, @Nullable Exception exc, int i) {
        super(str, exc);
        this.reason = i;
    }
}
