package V7;

import T7.C1678s;
import T7.Y;
import V7.c;
import com.facebook.GraphRequest;
import g6.C4331C;
import g6.C4338J;
import g6.C4339K;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12560a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12561b;

    public static final void b() {
        f12561b = true;
        if (C4331C.p()) {
            f12560a.e();
        }
    }

    public static final void c(Throwable th2) {
        if (!f12561b || d() || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            C1678s c1678s = C1678s.f11164a;
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            C1678s.b d10 = C1678s.d(className);
            if (d10 != C1678s.b.Unknown) {
                C1678s.c(d10);
                hashSet.add(d10.toString());
            }
        }
        if (!C4331C.p() || hashSet.isEmpty()) {
            return;
        }
        c.a aVar = c.a.f12570a;
        c.a.c(new JSONArray((Collection) hashSet)).f();
    }

    public static final boolean d() {
        return false;
    }

    public static final void f(c instrumentData, C4339K response) {
        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d10 = response.d();
                if (Intrinsics.areEqual(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        if (Y.a0()) {
            return;
        }
        File[] n10 = k.n();
        ArrayList arrayList = new ArrayList();
        int length = n10.length;
        int i10 = 0;
        while (i10 < length) {
            File file = n10[i10];
            i10++;
            final c d10 = c.a.d(file);
            if (d10.isValid()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", d10.toString());
                    GraphRequest.c cVar = GraphRequest.f30314n;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C4331C.m()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.A(null, format, jSONObject, new GraphRequest.b() { // from class: V7.a
                        @Override // com.facebook.GraphRequest.b
                        public final void a(C4339K c4339k) {
                            b.f(c.this, c4339k);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new C4338J(arrayList).h();
    }
}
