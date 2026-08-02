package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class l0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: a, reason: collision with root package name */
    public final List f19539a;

    public l0(P p10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f19539a = null;
    }

    public C2150z a() {
        return new C2150z(getMessage());
    }
}
