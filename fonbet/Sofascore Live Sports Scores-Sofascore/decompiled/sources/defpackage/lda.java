package defpackage;

import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lda {
    public final JavaScriptMessage$MsgChannel a;
    public final Object b;
    public final String c;
    public final JavaScriptMessage$MsgType d;
    public final String e;

    public lda(JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel, JavaScriptMessage$MsgType javaScriptMessage$MsgType, String str, Object obj, String str2) {
        this.a = javaScriptMessage$MsgChannel;
        this.d = javaScriptMessage$MsgType;
        this.c = str;
        this.b = obj;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lda)) {
            return false;
        }
        lda ldaVar = (lda) obj;
        return this.a == ldaVar.a && Objects.equals(this.b, ldaVar.b) && Objects.equals(this.c, ldaVar.c) && this.d == ldaVar.d && Objects.equals(this.e, ldaVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s, replyToMessageId=%s]", this.a, this.d, this.c, this.b, this.e);
    }
}
