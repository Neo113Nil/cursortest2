package T7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum C {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");


    /* renamed from: a, reason: collision with root package name */
    public final String f10981a;

    C(String str) {
        this.f10981a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static C[] valuesCustom() {
        C[] valuesCustom = values();
        return (C[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String b() {
        return this.f10981a;
    }
}
