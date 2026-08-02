package r90;

import android.app.Activity;
import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* renamed from: r90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9218a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r90.a$a, reason: collision with other inner class name */
    public static final class EnumC1415a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1415a[] $VALUES;
        public static final EnumC1415a NEED_OPEN_SETTINGS;
        public static final EnumC1415a NEED_PERMISSION_RATIONALE_REQUEST;
        public static final EnumC1415a NEED_PERMISSION_REQUEST;
        public static final EnumC1415a PERMISSION_GRANTED;

        static {
            EnumC1415a enumC1415a = new EnumC1415a("PERMISSION_GRANTED", 0);
            PERMISSION_GRANTED = enumC1415a;
            EnumC1415a enumC1415a2 = new EnumC1415a("NEED_PERMISSION_REQUEST", 1);
            NEED_PERMISSION_REQUEST = enumC1415a2;
            EnumC1415a enumC1415a3 = new EnumC1415a("NEED_PERMISSION_RATIONALE_REQUEST", 2);
            NEED_PERMISSION_RATIONALE_REQUEST = enumC1415a3;
            EnumC1415a enumC1415a4 = new EnumC1415a("NEED_OPEN_SETTINGS", 3);
            NEED_OPEN_SETTINGS = enumC1415a4;
            EnumC1415a[] enumC1415aArr = {enumC1415a, enumC1415a2, enumC1415a3, enumC1415a4};
            $VALUES = enumC1415aArr;
            $ENTRIES = Xc.b.a(enumC1415aArr);
        }

        private EnumC1415a() {
            throw null;
        }

        public static EnumC1415a valueOf(String str) {
            return (EnumC1415a) Enum.valueOf(EnumC1415a.class, str);
        }

        public static EnumC1415a[] values() {
            return (EnumC1415a[]) $VALUES.clone();
        }
    }

    boolean a(@NotNull String str);

    @NotNull
    EnumC1415a b(@NotNull Activity activity, @NotNull String str, boolean z11);

    boolean c(@NotNull Context context, @NotNull String str);
}
