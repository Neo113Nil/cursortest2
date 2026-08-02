package defpackage;

import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aff {
    public static final ThreadLocal c = new ThreadLocal();
    public final Parser a;
    public final MessageLite b;

    public aff(MessageLite messageLite) {
        z1a.y(messageLite, "defaultInstance cannot be null");
        this.b = messageLite;
        this.a = messageLite.getParserForType();
    }
}
