package j6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");


    /* renamed from: a, reason: collision with root package name */
    public final String f53808a;

    o(String str) {
        this.f53808a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        o[] valuesCustom = values();
        return (o[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String b() {
        return this.f53808a;
    }
}
