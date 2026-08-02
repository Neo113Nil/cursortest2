package xj;

import Am.C2438a;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.internal.StandardFieldsContract;

/* loaded from: classes6.dex */
public final class c extends StandardFieldsContract {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f105596a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f105597b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final id.e f105598c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final id.e f105599d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final id.e f105600e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final id.e f105601f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final id.e f105602g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final id.e f105603h;

    static {
        m<?>[] mVarArr = {C2438a.c(c.class, "uuid", "getUuid()Ljava/lang/String;", 0), C2438a.c(c.class, "ozonId", "getOzonId()Ljava/lang/String;", 0), C2438a.c(c.class, "userId", "getUserId()Ljava/lang/String;", 0), C2438a.c(c.class, "model", "getModel()Ljava/lang/String;", 0), C2438a.c(c.class, "manufacturer", "getManufacturer()Ljava/lang/String;", 0), C2438a.c(c.class, "firstLaunch", "getFirstLaunch()Ljava/lang/String;", 0)};
        f105597b = mVarArr;
        c cVar = new c();
        f105596a = cVar;
        f105598c = (id.e) StandardFieldsContract.field$default(cVar, null, 1, null).a(cVar, mVarArr[0]);
        f105599d = (id.e) StandardFieldsContract.field$default(cVar, null, 1, null).a(cVar, mVarArr[1]);
        f105600e = (id.e) StandardFieldsContract.field$default(cVar, null, 1, null).a(cVar, mVarArr[2]);
        f105601f = (id.e) StandardFieldsContract.field$default(cVar, null, 1, null).a(cVar, mVarArr[3]);
        f105602g = (id.e) StandardFieldsContract.field$default(cVar, null, 1, null).a(cVar, mVarArr[4]);
        f105603h = cVar.field("first_launch").a(cVar, mVarArr[5]);
    }

    private c() {
    }

    @NotNull
    public final String c() {
        return (String) f105603h.getValue(this, f105597b[5]);
    }

    @NotNull
    public final String d() {
        return (String) f105602g.getValue(this, f105597b[4]);
    }

    @NotNull
    public final String e() {
        return (String) f105601f.getValue(this, f105597b[3]);
    }

    @NotNull
    public final String f() {
        return (String) f105599d.getValue(this, f105597b[1]);
    }

    @NotNull
    public final String g() {
        return (String) f105600e.getValue(this, f105597b[2]);
    }

    @NotNull
    public final String h() {
        return (String) f105598c.getValue(this, f105597b[0]);
    }
}
