package q6;

import T7.C1678s;
import T7.Y;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o6.C5816a;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.k;
import q6.f;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f63425a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f63426b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final List f63427c = CollectionsKt.listOf((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* renamed from: d, reason: collision with root package name */
    public static final List f63428d = CollectionsKt.listOf((Object[]) new String[]{ViewProps.NONE, "address", "health"});

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: q6.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0878a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String b() {
            int i10 = C0878a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String c() {
            int i10 = C0878a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        public static final a f63431h = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public String f63432a;

        /* renamed from: b, reason: collision with root package name */
        public String f63433b;

        /* renamed from: c, reason: collision with root package name */
        public String f63434c;

        /* renamed from: d, reason: collision with root package name */
        public int f63435d;

        /* renamed from: e, reason: collision with root package name */
        public File f63436e;

        /* renamed from: f, reason: collision with root package name */
        public q6.b f63437f;

        /* renamed from: g, reason: collision with root package name */
        public Runnable f63438g;

        @Nullable
        private float[] thresholds;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final void g(List slaves, File file) {
                Intrinsics.checkNotNullParameter(slaves, "$slaves");
                Intrinsics.checkNotNullParameter(file, "file");
                final q6.b a10 = q6.b.f63411m.a(file);
                if (a10 != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f63431h.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new k.a() { // from class: q6.h
                            @Override // p6.k.a
                            public final void a(File file2) {
                                f.b.a.h(f.b.this, a10, file2);
                            }
                        });
                    }
                }
            }

            public static final void h(b slave, q6.b bVar, File file) {
                Intrinsics.checkNotNullParameter(slave, "$slave");
                Intrinsics.checkNotNullParameter(file, "file");
                slave.i(bVar);
                slave.k(file);
                Runnable runnable = slave.f63438g;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            public final b c(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString("use_case");
                    String assetUri = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", null);
                    int i10 = jSONObject.getInt("version_id");
                    float[] d10 = f.d(f.f63425a, jSONObject.getJSONArray("thresholds"));
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new b(useCase, assetUri, optString, i10, d10);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void d(String str, int i10) {
                File[] listFiles;
                File a10 = j.a();
                if (a10 == null || (listFiles = a10.listFiles()) == null || listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i10;
                int length = listFiles.length;
                int i11 = 0;
                while (i11 < length) {
                    File file = listFiles[i11];
                    i11++;
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    if (StringsKt.startsWith$default(name, str, false, 2, (Object) null) && !StringsKt.startsWith$default(name, str2, false, 2, (Object) null)) {
                        file.delete();
                    }
                }
            }

            public final void e(String str, String str2, k.a aVar) {
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new k(str, file, aVar).execute(new String[0]);
                }
            }

            public final void f(b master, final List slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                d(master.g(), master.h());
                e(master.b(), master.g() + '_' + master.h(), new k.a() { // from class: q6.g
                    @Override // p6.k.a
                    public final void a(File file) {
                        f.b.a.g(slaves, file);
                    }
                });
            }

            public a() {
            }
        }

        public b(String useCase, String assetUri, String str, int i10, float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.f63432a = useCase;
            this.f63433b = assetUri;
            this.f63434c = str;
            this.f63435d = i10;
            this.thresholds = fArr;
        }

        public final String b() {
            return this.f63433b;
        }

        public final q6.b c() {
            return this.f63437f;
        }

        public final File d() {
            return this.f63436e;
        }

        public final String e() {
            return this.f63434c;
        }

        public final float[] f() {
            return this.thresholds;
        }

        public final String g() {
            return this.f63432a;
        }

        public final int h() {
            return this.f63435d;
        }

        public final void i(q6.b bVar) {
            this.f63437f = bVar;
        }

        public final b j(Runnable runnable) {
            this.f63438g = runnable;
            return this;
        }

        public final void k(File file) {
            this.f63436e = file;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final void f() {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            Y y10 = Y.f11042a;
            Y.E0(new Runnable() { // from class: q6.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.g();
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: all -> 0x002d, Exception -> 0x007e, TryCatch #2 {Exception -> 0x007e, all -> 0x002d, blocks: (B:4:0x000e, B:6:0x0020, B:9:0x0027, B:10:0x0034, B:12:0x0044, B:14:0x004a, B:16:0x0072, B:20:0x0052, B:24:0x005b, B:25:0x002f), top: B:3:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g() {
        JSONObject jSONObject;
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            if (string != null && string.length() != 0) {
                jSONObject = new JSONObject(string);
                long j10 = sharedPreferences.getLong("model_request_timestamp", 0L);
                C1678s c1678s = C1678s.f11164a;
                if (C1678s.g(C1678s.b.ModelRequest) || jSONObject.length() == 0 || !f63425a.n(j10)) {
                    jSONObject = f63425a.k();
                    if (jSONObject != null) {
                        return;
                    } else {
                        sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                    }
                }
                f fVar = f63425a;
                fVar.e(jSONObject);
                fVar.h();
                return;
            }
            jSONObject = new JSONObject();
            long j102 = sharedPreferences.getLong("model_request_timestamp", 0L);
            C1678s c1678s2 = C1678s.f11164a;
            if (C1678s.g(C1678s.b.ModelRequest)) {
            }
            jSONObject = f63425a.k();
            if (jSONObject != null) {
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public static final void i() {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            t6.e.b();
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public static final void j() {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            C5816a.a();
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public static final File l(a task) {
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            b bVar = (b) f63426b.get(task.c());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final String[] q(a task, float[][] denses, String[] texts) {
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            b bVar = (b) f63426b.get(task.c());
            q6.b c10 = bVar == null ? null : bVar.c();
            if (c10 == null) {
                return null;
            }
            float[] f10 = bVar.f();
            int length = texts.length;
            int length2 = denses[0].length;
            C6119a c6119a = new C6119a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, c6119a.a(), i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            C6119a b10 = c10.b(c6119a, texts, task.b());
            if (b10 != null && f10 != null && b10.a().length != 0 && f10.length != 0) {
                int i12 = c.$EnumSwitchMapping$0[task.ordinal()];
                if (i12 == 1) {
                    return f63425a.s(b10, f10);
                }
                if (i12 == 2) {
                    return f63425a.r(b10, f10);
                }
                throw new NoWhenBranchMatchedException();
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public final void e(JSONObject jSONObject) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b c10 = b.f63431h.c(jSONObject.getJSONObject(keys.next()));
                    if (c10 != null) {
                        f63426b.put(c10.g(), c10);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void h() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i10 = 0;
            for (Map.Entry entry : f63426b.entrySet()) {
                String str2 = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                if (Intrinsics.areEqual(str2, a.MTML_APP_EVENT_PREDICTION.c())) {
                    String b10 = bVar.b();
                    int max = Math.max(i10, bVar.h());
                    C1678s c1678s = C1678s.f11164a;
                    if (C1678s.g(C1678s.b.SuggestedEvents) && m()) {
                        arrayList.add(bVar.j(new Runnable() { // from class: q6.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.i();
                            }
                        }));
                    }
                    str = b10;
                    i10 = max;
                }
                if (Intrinsics.areEqual(str2, a.MTML_INTEGRITY_DETECT.c())) {
                    str = bVar.b();
                    i10 = Math.max(i10, bVar.h());
                    C1678s c1678s2 = C1678s.f11164a;
                    if (C1678s.g(C1678s.b.IntelligentIntegrity)) {
                        arrayList.add(bVar.j(new Runnable() { // from class: q6.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.j();
                            }
                        }));
                    }
                }
            }
            if (str == null || i10 <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f63431h.f(new b("MTML", str, null, i10, null), arrayList);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final JSONObject k() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest x10 = GraphRequest.f30314n.x(null, "app/model_asset", null);
            x10.J(bundle);
            JSONObject c10 = x10.k().c();
            if (c10 == null) {
                return null;
            }
            return p(c10);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final boolean m() {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            Locale N10 = Y.N();
            if (N10 == null) {
                return true;
            }
            String language = N10.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "locale.language");
            return StringsKt.contains$default((CharSequence) language, (CharSequence) "en", false, 2, (Object) null);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean n(long j10) {
        if (Y7.a.d(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final float[] o(JSONArray jSONArray) {
        if (Y7.a.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        String string = jSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        fArr[i10] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return fArr;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final JSONObject p(JSONObject jSONObject) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(EventKeys.DATA);
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                        jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                        jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                        jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                        if (jSONObject3.has("rules_uri")) {
                            jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                        }
                        jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final String[] r(C6119a c6119a, float[] fArr) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            int b10 = c6119a.b(0);
            int b11 = c6119a.b(1);
            float[] a10 = c6119a.a();
            if (b11 != fArr.length) {
                return null;
            }
            IntRange until = RangesKt.until(0, b10);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                Object obj = ViewProps.NONE;
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(nextInt * b11) + i11] >= fArr[i10]) {
                        obj = f63428d.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final String[] s(C6119a c6119a, float[] fArr) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            int b10 = c6119a.b(0);
            int b11 = c6119a.b(1);
            float[] a10 = c6119a.a();
            if (b11 != fArr.length) {
                return null;
            }
            IntRange until = RangesKt.until(0, b10);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                Object obj = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(nextInt * b11) + i11] >= fArr[i10]) {
                        obj = f63427c.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }
}
