package defpackage;

import com.blaze.blazesdk.shared.results.BlazeResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class h1m {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends h1m {
        public final BlazeResult.Error a;

        public a(@Nullable BlazeResult.Error error) {
            super(null);
            this.a = error;
        }

        public static a copy$default(a aVar, BlazeResult.Error error, int i, Object obj) {
            if ((i & 1) != 0) {
                error = aVar.a;
            }
            aVar.getClass();
            return new a(error);
        }

        @Override // defpackage.h1m
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            BlazeResult.Error error = this.a;
            if (error == null) {
                return 0;
            }
            return error.hashCode();
        }

        public final String toString() {
            return "InitializationError(error=" + this.a + ')';
        }
    }

    public h1m(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract boolean a();
}
