package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum rto {
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");

    public final String a;

    rto(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
