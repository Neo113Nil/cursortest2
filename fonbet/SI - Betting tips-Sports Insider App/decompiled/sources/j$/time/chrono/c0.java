package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c0 implements l {
    public static final c0 BEFORE_ROC;
    public static final c0 ROC;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c0[] f17309a;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long C(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.o(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.r(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.m(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.x xVar) {
        return j$.com.android.tools.r8.a.v(this, xVar);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f17309a.clone();
    }

    static {
        c0 c0Var = new c0("BEFORE_ROC", 0);
        BEFORE_ROC = c0Var;
        c0 c0Var2 = new c0("ROC", 1);
        ROC = c0Var2;
        f17309a = new c0[]{c0Var, c0Var2};
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), j$.time.temporal.a.ERA);
    }
}
