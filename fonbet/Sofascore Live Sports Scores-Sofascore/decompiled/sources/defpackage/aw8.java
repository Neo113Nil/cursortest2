package defpackage;

import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aw8 implements ygc {
    public static final aw8 b = new aw8(0);
    public final /* synthetic */ int a;

    public /* synthetic */ aw8(int i) {
        this.a = i;
    }

    @Override // defpackage.ygc
    public final wgc a(Class cls) {
        switch (this.a) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    a70.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (wgc) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e) {
                    vp2.e("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.ygc
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
