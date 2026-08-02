package cg;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f3916b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f3917c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f3918d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f3919e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f3920f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f3921g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f3922h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e[] f3923i;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f3924a;

    static {
        e eVar = new e("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f3916b = eVar;
        e eVar2 = new e("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        f3917c = eVar2;
        e eVar3 = new e("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f3918d = eVar3;
        e eVar4 = new e("SECONDS", 3, TimeUnit.SECONDS);
        f3919e = eVar4;
        e eVar5 = new e("MINUTES", 4, TimeUnit.MINUTES);
        f3920f = eVar5;
        e eVar6 = new e("HOURS", 5, TimeUnit.HOURS);
        f3921g = eVar6;
        e eVar7 = new e("DAYS", 6, TimeUnit.DAYS);
        f3922h = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f3923i = eVarArr;
        com.google.android.play.core.appupdate.b.l(eVarArr);
    }

    public e(String str, int i5, TimeUnit timeUnit) {
        this.f3924a = timeUnit;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3923i.clone();
    }
}
