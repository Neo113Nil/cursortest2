package p3;

import android.net.Uri;
import j3.InterfaceC7268j;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: p3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8846f extends InterfaceC7268j {

    /* renamed from: p3.f$a */
    public interface a {
        InterfaceC8846f createDataSource();
    }

    void addTransferListener(z zVar);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(i iVar) throws IOException;
}
