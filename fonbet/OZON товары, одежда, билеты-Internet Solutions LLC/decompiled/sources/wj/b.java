package wj;

import Ej.p;
import android.content.Context;
import android.net.Uri;
import bd.q;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.harLogger.HttpArchive;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import sf.t;
import sf.z;
import vj.C10324a;

/* loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final HttpArchive a(@NotNull Tc.b response, @NotNull C10324a harLogConfig) {
        HttpArchive.PostData postData;
        String str;
        int i11;
        K k11;
        int i12 = 1;
        int i13 = 0;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(harLogConfig, "harLogConfig");
        ArrayList arrayList = new ArrayList(C7714v.z(response, 10));
        Iterator<E> it = response.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            ArrayList e11 = e(eVar.f());
            ArrayList p02 = C7714v.p0(e(eVar.i()), (Intrinsics.d(eVar.c(), "http/1.0") || Intrinsics.d(eVar.c(), "http/1.1")) ? K.f71697a : C7714v.a0(new HttpArchive.Header(":status", String.valueOf(eVar.h()))));
            h c11 = c(e11);
            h c12 = c(p02);
            if (Intrinsics.d(eVar.d(), "POST")) {
                String a11 = c11.a();
                K k12 = K.f71697a;
                byte[] e12 = eVar.e();
                postData = new HttpArchive.PostData(a11, k12, e12 != null ? d(e12) : null);
            } else {
                postData = null;
            }
            HttpArchive.Content content = eVar.g() == null ? null : new HttpArchive.Content(eVar.g().length, null, c12.a(), d(eVar.g()), null);
            try {
                str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.US).format(Long.valueOf(eVar.l()));
            } catch (Throwable th2) {
                p.b("Date conversion error: " + th2.getMessage());
                str = "";
            }
            String d11 = eVar.d();
            String m11 = eVar.m();
            String c13 = eVar.c();
            if (Intrinsics.d(c13, "h2")) {
                c13 = "http/2.0";
            }
            K k13 = K.f71697a;
            String query = Uri.parse(eVar.m()).getQuery();
            if (query == null) {
                i11 = i12;
                k11 = k13;
            } else {
                char[] cArr = new char[i12];
                cArr[i13] = '&';
                List l11 = kotlin.text.h.l(query, cArr, i13, 6);
                int i14 = i13;
                ArrayList arrayList2 = new ArrayList(C7714v.z(l11, 10));
                Iterator it2 = l11.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    Iterator it3 = it2;
                    char[] cArr2 = new char[1];
                    cArr2[i14] = '=';
                    int i15 = i14;
                    List l12 = kotlin.text.h.l(str2, cArr2, i15, 6);
                    arrayList2.add(new HttpArchive.Query((String) l12.get(i15), C7714v.V(C7714v.D(l12, 1), "=", null, null, null, 62)));
                    it2 = it3;
                    i14 = 0;
                }
                i11 = 1;
                k11 = arrayList2;
            }
            int length = eVar.f().length();
            byte[] e13 = eVar.e();
            HttpArchive.Request request = new HttpArchive.Request(d11, m11, c13, k13, e11, k11, postData, length, e13 != null ? e13.length : 0);
            int h11 = eVar.h();
            String j11 = eVar.j();
            String c14 = eVar.c();
            String str3 = Intrinsics.d(c14, "h2") ? "http/2.0" : c14;
            K k14 = K.f71697a;
            int length2 = eVar.i().length();
            byte[] g10 = eVar.g();
            arrayList.add(new HttpArchive.HarEntry(str, (int) eVar.k(), request, new HttpArchive.Response(h11, j11, str3, k14, p02, content, "", length2, g10 != null ? g10.length : -1)));
            i12 = i11;
            i13 = 0;
        }
        HttpArchive.Creator creator = new HttpArchive.Creator(harLogConfig.a(), harLogConfig.h(), harLogConfig.b());
        return new HttpArchive(new HttpArchive.Log(null, creator, creator, arrayList, 1, null));
    }

    @NotNull
    public static final File b(@NotNull Context context, @NotNull C10324a harLogConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(harLogConfig, "harLogConfig");
        File file = new File(context.getCacheDir(), harLogConfig.c());
        file.mkdirs();
        return new File(file, "requests_log.har");
    }

    private static final h c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str = null;
        String str2 = "application/json";
        while (it.hasNext()) {
            HttpArchive.Header header = (HttpArchive.Header) it.next();
            String lowerCase = header.getName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.d(lowerCase, "content-encoding")) {
                str = header.getValue();
            } else if (Intrinsics.d(lowerCase, "content-type")) {
                str2 = header.getValue();
            }
        }
        return new h(str, str2);
    }

    private static final String d(byte[] bArr) {
        return q.d(new BufferedReader(new InputStreamReader(z.d(new t(z.k(new ByteArrayInputStream(bArr)))).a2(), Charsets.UTF_8), 8192));
    }

    private static final ArrayList e(String str) {
        List m11 = kotlin.text.h.m(str, new String[]{"\n"}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            List m12 = kotlin.text.h.m((String) it.next(), new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
            arrayList.add(new HttpArchive.Header((String) m12.get(0), C7714v.V(C7714v.D(m12, 1), ProductContainerDTO.RATIO_DELIMITER, null, null, null, 62)));
        }
        return arrayList;
    }
}
