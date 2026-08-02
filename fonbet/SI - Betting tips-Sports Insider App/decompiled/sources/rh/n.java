package rh;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public interface n {
    String a(SSLSocket sSLSocket);

    boolean b(SSLSocket sSLSocket);

    void c(SSLSocket sSLSocket, String str, List list);

    boolean isSupported();
}
