package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface rf6 {
    void a(de0 de0Var);

    int b();

    void closeSession(byte[] bArr);

    nr8 d(byte[] bArr);

    pf6 e(byte[] bArr, List list, int i, HashMap hashMap);

    boolean f(String str, byte[] bArr);

    qf6 getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    default void c(byte[] bArr, cse cseVar) {
    }
}
