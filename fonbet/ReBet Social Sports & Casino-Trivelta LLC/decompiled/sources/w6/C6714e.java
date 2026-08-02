package w6;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6714e {

    /* renamed from: a, reason: collision with root package name */
    public static final C6714e f67479a = new C6714e();

    public static final String a(InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof C6715f)) {
                return f67479a.c(key);
            }
            List d10 = ((C6715f) key).d();
            Intrinsics.checkNotNullExpressionValue(d10, "getCacheKeys(...)");
            C6714e c6714e = f67479a;
            Object obj = d10.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return c6714e.c((InterfaceC6713d) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final List b(InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!(key instanceof C6715f)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(key.c() ? key.a() : f67479a.c(key));
                return arrayList;
            }
            List d10 = ((C6715f) key).d();
            Intrinsics.checkNotNullExpressionValue(d10, "getCacheKeys(...)");
            ArrayList arrayList2 = new ArrayList(d10.size());
            int size = d10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C6714e c6714e = f67479a;
                Object obj = d10.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList2.add(c6714e.c((InterfaceC6713d) obj));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String c(InterfaceC6713d interfaceC6713d) {
        String a10 = interfaceC6713d.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getUriString(...)");
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        byte[] bytes = a10.getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String a11 = com.facebook.common.util.c.a(bytes);
        Intrinsics.checkNotNullExpressionValue(a11, "makeSHA1HashBase64(...)");
        return a11;
    }
}
