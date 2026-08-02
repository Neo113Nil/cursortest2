package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pxm {
    public final boolean a;
    public final Function2 b;
    public a c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: pxm$a$a, reason: collision with other inner class name */
        public static final class C1356a extends a {
            public final n4m a;

            public C1356a(@Nullable n4m n4mVar) {
                super(null);
                this.a = n4mVar;
            }

            public static C1356a copy$default(C1356a c1356a, n4m n4mVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    n4mVar = c1356a.a;
                }
                c1356a.getClass();
                return new C1356a(n4mVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1356a) && Intrinsics.c(this.a, ((C1356a) obj).a);
            }

            public final int hashCode() {
                n4m n4mVar = this.a;
                if (n4mVar == null) {
                    return 0;
                }
                return n4mVar.hashCode();
            }

            public final String toString() {
                return "Loaded(playable=" + this.a + ')';
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public pxm(boolean z, @NotNull Function2<? super BlazeContentExtraInfo, ? super Function1<? super n4m, Unit>, Unit> function2) {
        function2.getClass();
        this.a = z;
        this.b = function2;
        this.c = ywm.a;
    }

    public static pxm copy$default(pxm pxmVar, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pxmVar.a;
        }
        if ((i & 2) != 0) {
            function2 = pxmVar.b;
        }
        pxmVar.getClass();
        function2.getClass();
        return new pxm(z, function2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxm)) {
            return false;
        }
        pxm pxmVar = (pxm) obj;
        return this.a == pxmVar.a && Intrinsics.c(this.b, pxmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlayerPlaceholderModel(shouldHideUntilLoaded=" + this.a + ", loadingBlock=" + this.b + ')';
    }
}
