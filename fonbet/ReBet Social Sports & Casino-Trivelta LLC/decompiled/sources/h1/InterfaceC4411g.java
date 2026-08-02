package h1;

import android.net.Uri;
import b1.InterfaceC2358l;
import java.util.Collections;
import java.util.Map;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4411g extends InterfaceC2358l {

    /* renamed from: h1.g$a */
    public interface a {
        InterfaceC4411g a();
    }

    long b(C4418n c4418n);

    void c(InterfaceC4403F interfaceC4403F);

    void close();

    default Map f() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();
}
