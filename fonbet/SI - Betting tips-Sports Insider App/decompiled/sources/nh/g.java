package nh;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final d[] f20953a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f20954b;

    static {
        d dVar = new d("", d.f20933i);
        ByteString byteString = d.f20930f;
        d dVar2 = new d("GET", byteString);
        d dVar3 = new d("POST", byteString);
        ByteString byteString2 = d.f20931g;
        d dVar4 = new d("/", byteString2);
        d dVar5 = new d("/index.html", byteString2);
        ByteString byteString3 = d.f20932h;
        d dVar6 = new d("http", byteString3);
        d dVar7 = new d("https", byteString3);
        ByteString byteString4 = d.f20929e;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d("200", byteString4), new d("204", byteString4), new d("206", byteString4), new d("304", byteString4), new d("400", byteString4), new d("404", byteString4), new d("500", byteString4), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f20953a = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i5 = 0; i5 < 61; i5++) {
            if (!linkedHashMap.containsKey(dVarArr[i5].f20934a)) {
                linkedHashMap.put(dVarArr[i5].f20934a, Integer.valueOf(i5));
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        f20954b = unmodifiableMap;
    }

    public static void a(ByteString name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i5 = 0; i5 < size; i5++) {
            byte b10 = name.getByte(i5);
            if (65 <= b10 && b10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
    }
}
