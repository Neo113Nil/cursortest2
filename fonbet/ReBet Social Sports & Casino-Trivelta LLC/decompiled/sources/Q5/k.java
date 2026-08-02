package Q5;

import com.twilio.voice.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f9434a;

    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9435b = new a();

        public a() {
            super(Constants.PLATFORM_ANDROID, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 407082532;
        }

        public String toString() {
            return "Android";
        }
    }

    public static abstract class b extends k {

        /* renamed from: b, reason: collision with root package name */
        public final String f9436b;

        public static final class a extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String version) {
                super("react-native", version, null);
                Intrinsics.checkNotNullParameter(version, "version");
            }
        }

        public /* synthetic */ b(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public final String b() {
            return this.f9436b;
        }

        public b(String str, String str2) {
            super(str, null);
            this.f9436b = str2;
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f9434a;
    }

    public k(String str) {
        this.f9434a = str;
    }
}
