package defpackage;

import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e9g extends Exception {
    public final XmlPullParserException a;

    public e9g(XmlPullParserException xmlPullParserException) {
        this.a = xmlPullParserException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9g) && this.a.equals(((e9g) obj).a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Something went wrong when parsing the feed. Please check if the XML is valid";
    }

    public final int hashCode() {
        return this.a.hashCode() + (1959183951 * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RssParsingException(message=Something went wrong when parsing the feed. Please check if the XML is valid, cause=" + this.a + ')';
    }
}
