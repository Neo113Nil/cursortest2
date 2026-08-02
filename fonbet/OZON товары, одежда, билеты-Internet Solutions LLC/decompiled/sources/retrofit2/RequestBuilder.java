package retrofit2;

import We.A;
import We.C;
import We.D;
import We.G;
import We.K;
import We.w;
import We.z;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import sf.C9681g;
import sf.InterfaceC9682h;

/* loaded from: classes6.dex */
final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final A baseUrl;
    private K body;
    private C contentType;
    private w.a formBuilder;
    private final boolean hasBody;
    private final z.a headersBuilder;
    private final String method;
    private D.a multipartBuilder;
    private String relativeUrl;
    private final G.a requestBuilder = new G.a();
    private A.a urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    private static class ContentTypeOverridingRequestBody extends K {
        private final C contentType;
        private final K delegate;

        ContentTypeOverridingRequestBody(K k11, C c11) {
            this.delegate = k11;
            this.contentType = c11;
        }

        @Override // We.K
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // We.K
        /* renamed from: contentType */
        public C getContentType() {
            return this.contentType;
        }

        @Override // We.K
        public void writeTo(InterfaceC9682h interfaceC9682h) throws IOException {
            this.delegate.writeTo(interfaceC9682h);
        }
    }

    RequestBuilder(String str, A a11, String str2, z zVar, C c11, boolean z11, boolean z12, boolean z13) {
        this.method = str;
        this.baseUrl = a11;
        this.relativeUrl = str2;
        this.contentType = c11;
        this.hasBody = z11;
        if (zVar != null) {
            this.headersBuilder = zVar.h();
        } else {
            this.headersBuilder = new z.a();
        }
        if (z12) {
            this.formBuilder = new w.a();
        } else if (z13) {
            D.a aVar = new D.a();
            this.multipartBuilder = aVar;
            aVar.d(D.f33542f);
        }
    }

    private static String canonicalizeForPath(String str, boolean z11) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt < 32 || codePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) != -1 || (!z11 && (codePointAt == 47 || codePointAt == 37))) {
                C9681g c9681g = new C9681g();
                c9681g.D0(0, i11, str);
                canonicalizeForPath(c9681g, str, i11, length, z11);
                return c9681g.G0();
            }
            i11 += Character.charCount(codePointAt);
        }
        return str;
    }

    void addFormField(String str, String str2, boolean z11) {
        if (z11) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    void addHeader(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.headersBuilder.a(str, str2);
            return;
        }
        try {
            C.f33536g.getClass();
            this.contentType = C.a.a(str2);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException(Nk.a.b("Malformed content type: ", str2), e11);
        }
    }

    void addHeaders(z headers) {
        z.a aVar = this.headersBuilder;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            aVar.c(headers.e(i11), headers.k(i11));
        }
    }

    void addPart(z zVar, K k11) {
        this.multipartBuilder.a(zVar, k11);
    }

    void addPathParam(String str, String str2, boolean z11) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String canonicalizeForPath = canonicalizeForPath(str2, z11);
        String replace = this.relativeUrl.replace("{" + str + "}", canonicalizeForPath);
        if (PATH_TRAVERSAL.matcher(replace).matches()) {
            throw new IllegalArgumentException(Nk.a.b("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        this.relativeUrl = replace;
    }

    void addQueryParam(String str, String str2, boolean z11) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            A.a k11 = this.baseUrl.k(str3);
            this.urlBuilder = k11;
            if (k11 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z11) {
            this.urlBuilder.a(str, str2);
        } else {
            this.urlBuilder.d(str, str2);
        }
    }

    <T> void addTag(Class<T> cls, T t2) {
        this.requestBuilder.i(cls, t2);
    }

    G.a get() {
        A t2;
        A.a aVar = this.urlBuilder;
        if (aVar != null) {
            t2 = aVar.e();
        } else {
            t2 = this.baseUrl.t(this.relativeUrl);
            if (t2 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        K k11 = this.body;
        if (k11 == null) {
            w.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                k11 = aVar2.c();
            } else {
                D.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    k11 = aVar3.c();
                } else if (this.hasBody) {
                    k11 = K.create((C) null, new byte[0]);
                }
            }
        }
        C c11 = this.contentType;
        if (c11 != null) {
            if (k11 != null) {
                k11 = new ContentTypeOverridingRequestBody(k11, c11);
            } else {
                this.headersBuilder.a("Content-Type", c11.toString());
            }
        }
        G.a aVar4 = this.requestBuilder;
        aVar4.j(t2);
        aVar4.e(this.headersBuilder.e());
        aVar4.f(k11, this.method);
        return aVar4;
    }

    void setBody(K k11) {
        this.body = k11;
    }

    void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    void addPart(D.c cVar) {
        this.multipartBuilder.b(cVar);
    }

    private static void canonicalizeForPath(C9681g c9681g, String str, int i11, int i12, boolean z11) {
        C9681g c9681g2 = null;
        while (i11 < i12) {
            int codePointAt = str.codePointAt(i11);
            if (!z11 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1 && (z11 || (codePointAt != 47 && codePointAt != 37))) {
                    c9681g.K0(codePointAt);
                } else {
                    if (c9681g2 == null) {
                        c9681g2 = new C9681g();
                    }
                    c9681g2.K0(codePointAt);
                    while (!c9681g2.m()) {
                        byte readByte = c9681g2.readByte();
                        c9681g.d0(37);
                        char[] cArr = HEX_DIGITS;
                        c9681g.d0(cArr[((readByte & 255) >> 4) & 15]);
                        c9681g.d0(cArr[readByte & 15]);
                    }
                }
            }
            i11 += Character.charCount(codePointAt);
        }
    }
}
