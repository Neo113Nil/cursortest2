package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum zj3 {
    b("opened", true),
    c("closed", true),
    d("disconnected", true),
    e("reconnected", true),
    f("subscriptions re-established", false),
    g("discovered servers", false),
    h("lame duck mode", false);

    public final String a;

    zj3(String str, boolean z) {
        if (z) {
            this.a = "nats: connection ".concat(str);
        } else {
            this.a = "nats: ".concat(str);
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
