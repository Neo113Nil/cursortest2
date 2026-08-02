package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import xsna.evk;
import xsna.mjp0;
import xsna.suk;

/* compiled from: DataSource.java */
/* loaded from: classes12.dex */
public interface a extends suk {

    /* compiled from: DataSource.java */
    /* renamed from: androidx.media3.datasource.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0045a {
        a createDataSource();
    }

    void addTransferListener(mjp0 mjp0Var);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Nullable
    Uri getUri();

    long open(evk evkVar) throws IOException;
}
