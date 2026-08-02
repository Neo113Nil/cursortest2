package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0098da {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f13590a;

    EnumC0098da(int i5) {
        this.f13590a = i5;
    }

    public static EnumC0098da a(Integer num) {
        if (num != null) {
            for (EnumC0098da enumC0098da : values()) {
                if (enumC0098da.f13590a == num.intValue()) {
                    return enumC0098da;
                }
            }
        }
        return UNKNOWN;
    }
}
