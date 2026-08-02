package bo.app;

import com.facebook.react.uimanager.ViewProps;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: b, reason: collision with root package name */
    public static final i3 f25551b;

    /* renamed from: c, reason: collision with root package name */
    public static final i3 f25552c;

    /* renamed from: d, reason: collision with root package name */
    public static final i3 f25553d;

    /* renamed from: e, reason: collision with root package name */
    public static final i3 f25554e;

    /* renamed from: f, reason: collision with root package name */
    public static final i3 f25555f;

    /* renamed from: g, reason: collision with root package name */
    public static final i3 f25556g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i3[] f25557h;

    /* renamed from: a, reason: collision with root package name */
    public final String f25558a;

    static {
        i3 i3Var = new i3("INTEGER", 0, "integer");
        f25551b = i3Var;
        i3 i3Var2 = new i3("COLOR", 1, ViewProps.COLOR);
        f25552c = i3Var2;
        i3 i3Var3 = new i3("BOOLEAN", 2, "bool");
        f25553d = i3Var3;
        i3 i3Var4 = new i3("STRING", 3, "string");
        f25554e = i3Var4;
        i3 i3Var5 = new i3("DRAWABLE_IDENTIFIER", 4, "drawable");
        f25555f = i3Var5;
        i3 i3Var6 = new i3("STRING_ARRAY", 5, "array");
        f25556g = i3Var6;
        i3[] i3VarArr = {i3Var, i3Var2, i3Var3, i3Var4, i3Var5, i3Var6};
        f25557h = i3VarArr;
        EnumEntriesKt.enumEntries(i3VarArr);
    }

    public i3(String str, int i10, String str2) {
        this.f25558a = str2;
    }

    public static i3 valueOf(String str) {
        return (i3) Enum.valueOf(i3.class, str);
    }

    public static i3[] values() {
        return (i3[]) f25557h.clone();
    }
}
