package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class i4m {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends i4m {
        public final boolean a;

        public a(boolean z) {
            super(null);
            this.a = z;
        }

        public static a copy$default(a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            aVar.getClass();
            return new a(z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return lnb.r(new StringBuilder("ConfigurationChanged(isPipEnabledInStyle="), this.a, ')');
        }
    }

    public i4m(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends i4m {
        public final int a;
        public final String b;

        public /* synthetic */ b(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str);
        }

        public static b copy$default(b bVar, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.a;
            }
            if ((i2 & 2) != 0) {
                str = bVar.b;
            }
            bVar.getClass();
            return new b(i, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.c(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SystemExitedPip(currentOrientation=");
            sb.append(this.a);
            sb.append(", failureReason=");
            return lnb.q(sb, this.b, ')');
        }

        public b(int i, @Nullable String str) {
            super(null);
            this.a = i;
            this.b = str;
        }
    }
}
