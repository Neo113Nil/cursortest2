package defpackage;

import com.blaze.blazesdk.utils.parsing.EnumWithValue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s6m implements EnumWithValue {
    public static final s6m a;
    public static final /* synthetic */ s6m[] b;

    static {
        s6m s6mVar = new s6m();
        a = s6mVar;
        b = new s6m[]{s6mVar};
    }

    public static s6m valueOf(String str) {
        return (s6m) Enum.valueOf(s6m.class, str);
    }

    public static s6m[] values() {
        return (s6m[]) b.clone();
    }

    @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
    public final String getValue() {
        return "Growing";
    }
}
