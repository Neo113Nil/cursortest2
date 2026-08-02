package defpackage;

import com.blaze.blazesdk.follow.models.BlazeFollowEntityType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aim {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends aim {
        public final BlazeFollowEntityType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull BlazeFollowEntityType blazeFollowEntityType) {
            super(null);
            blazeFollowEntityType.getClass();
            this.a = blazeFollowEntityType;
        }

        public static a copy$default(a aVar, BlazeFollowEntityType blazeFollowEntityType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeFollowEntityType = aVar.a;
            }
            aVar.getClass();
            blazeFollowEntityType.getClass();
            return new a(blazeFollowEntityType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Specific(followEntityType=" + this.a + ')';
        }
    }

    public aim(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
