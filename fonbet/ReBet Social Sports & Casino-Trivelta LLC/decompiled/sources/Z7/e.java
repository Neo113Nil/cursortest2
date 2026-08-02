package Z7;

import T7.Y;
import V7.k;
import com.facebook.GraphRequest;
import g6.C4331C;
import g6.C4339K;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f14730a = new e();

    public static final void d() {
        if (C4331C.p()) {
            h();
        }
    }

    public static final File[] e() {
        File f10 = k.f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: Z7.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean f11;
                f11 = e.f(file, str);
                return f11;
            }
        });
        Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    public static final boolean f(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).matches(name);
    }

    public static final void g(String str) {
        try {
            new a(str).d();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (Y.a0()) {
            return;
        }
        File[] e10 = e();
        final ArrayList arrayList = new ArrayList();
        int length = e10.length;
        int i10 = 0;
        while (i10 < length) {
            File file = e10[i10];
            i10++;
            a aVar = new a(file);
            if (aVar.isValid()) {
                arrayList.add(aVar);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: Z7.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i11;
                i11 = e.i((a) obj, (a) obj2);
                return i11;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
            jSONArray.put(arrayList.get(i11));
        }
        k kVar = k.f12578a;
        k.s("error_reports", jSONArray, new GraphRequest.b() { // from class: Z7.c
            @Override // com.facebook.GraphRequest.b
            public final void a(C4339K c4339k) {
                e.j(arrayList, c4339k);
            }
        });
    }

    public static final int i(a aVar, a o22) {
        Intrinsics.checkNotNullExpressionValue(o22, "o2");
        return aVar.b(o22);
    }

    public static final void j(ArrayList validReports, C4339K response) {
        Intrinsics.checkNotNullParameter(validReports, "$validReports");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d10 = response.d();
                if (Intrinsics.areEqual(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
