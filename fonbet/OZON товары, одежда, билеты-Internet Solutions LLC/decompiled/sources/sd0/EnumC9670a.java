package sd0;

import Xc.b;
import com.google.android.gms.common.Scopes;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9670a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9670a[] $VALUES;
    public static final EnumC9670a Email;
    public static final EnumC9670a Phone;
    public static final EnumC9670a Profile;

    @NotNull
    private final String serializedName;

    static {
        EnumC9670a enumC9670a = new EnumC9670a("Profile", 0, Scopes.PROFILE);
        Profile = enumC9670a;
        EnumC9670a enumC9670a2 = new EnumC9670a("Email", 1, Scopes.EMAIL);
        Email = enumC9670a2;
        EnumC9670a enumC9670a3 = new EnumC9670a("Phone", 2, "phone");
        Phone = enumC9670a3;
        EnumC9670a[] enumC9670aArr = {enumC9670a, enumC9670a2, enumC9670a3};
        $VALUES = enumC9670aArr;
        $ENTRIES = b.a(enumC9670aArr);
    }

    private EnumC9670a(String str, int i11, String str2) {
        this.serializedName = str2;
    }

    public static EnumC9670a valueOf(String str) {
        return (EnumC9670a) Enum.valueOf(EnumC9670a.class, str);
    }

    public static EnumC9670a[] values() {
        return (EnumC9670a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.serializedName;
    }
}
