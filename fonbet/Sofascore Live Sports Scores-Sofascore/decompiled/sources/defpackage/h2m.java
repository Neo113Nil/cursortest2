package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum h2m {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");

    public static final HashMap f = new HashMap();
    public final String a;

    static {
        for (h2m h2mVar : values()) {
            f.put(h2mVar.a, h2mVar);
        }
    }

    h2m(String str) {
        this.a = str;
    }
}
