package j6;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5094a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* renamed from: a, reason: collision with root package name */
    public static final C0775a f53667a = new C0775a(null);

    /* renamed from: j6.a$a, reason: collision with other inner class name */
    public static final class C0775a {
        public /* synthetic */ C0775a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC5094a a(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            return Intrinsics.areEqual(rawValue, "MOBILE_APP_INSTALL") ? EnumC5094a.MOBILE_APP_INSTALL : Intrinsics.areEqual(rawValue, "CUSTOM_APP_EVENTS") ? EnumC5094a.CUSTOM : EnumC5094a.OTHER;
        }

        public C0775a() {
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5094a[] valuesCustom() {
        EnumC5094a[] valuesCustom = values();
        return (EnumC5094a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
