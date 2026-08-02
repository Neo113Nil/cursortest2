package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import B1.V;
import C.o0;
import D1.InterfaceC2801g;
import Fr.g;
import J0.C3349u1;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Xc.a;
import Xc.b;
import Z1.h;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b1\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope;", "", "<init>", "()V", "Landroidx/compose/ui/e;", "modifier", "Le1/b$c;", "verticalAlignment", "LZ1/h;", "minWidth", "Lkotlin/Function0;", "", "content", "AddonBuilder-942rkJo", "(Landroidx/compose/ui/e;Le1/b$c;FLkotlin/jvm/functions/Function2;LS0/k;II)V", "AddonBuilder", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "getAddonMarker", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "addonMarker", "AddonMarker", "AddonLayoutId", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellCenterScope;", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope;", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellStartScope;", "", "alpha", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DebugMenuCellScope {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonLayoutId;", "", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "marker", "Le1/b$c;", "alignment", "LZ1/h;", "minWidth", "<init>", "(Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;Le1/b$c;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "getMarker", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "Le1/b$c;", "getAlignment", "()Le1/b$c;", "F", "getMinWidth-D9Ej5fM", "()F", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddonLayoutId {

        @NotNull
        private final InterfaceC6250b.c alignment;

        @NotNull
        private final AddonMarker marker;
        private final float minWidth;

        public /* synthetic */ AddonLayoutId(AddonMarker addonMarker, InterfaceC6250b.c cVar, float f7, DefaultConstructorMarker defaultConstructorMarker) {
            this(addonMarker, cVar, f7);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddonLayoutId)) {
                return false;
            }
            AddonLayoutId addonLayoutId = (AddonLayoutId) other;
            return this.marker == addonLayoutId.marker && Intrinsics.d(this.alignment, addonLayoutId.alignment) && h.b(this.minWidth, addonLayoutId.minWidth);
        }

        @NotNull
        public final InterfaceC6250b.c getAlignment() {
            return this.alignment;
        }

        /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
        public final float getMinWidth() {
            return this.minWidth;
        }

        public int hashCode() {
            return Float.hashCode(this.minWidth) + ((this.alignment.hashCode() + (this.marker.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            AddonMarker addonMarker = this.marker;
            InterfaceC6250b.c cVar = this.alignment;
            String c11 = h.c(this.minWidth);
            StringBuilder sb2 = new StringBuilder("AddonLayoutId(marker=");
            sb2.append(addonMarker);
            sb2.append(", alignment=");
            sb2.append(cVar);
            sb2.append(", minWidth=");
            return o0.c(sb2, c11, ")");
        }

        private AddonLayoutId(AddonMarker marker, InterfaceC6250b.c alignment, float f7) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.marker = marker;
            this.alignment = alignment;
            this.minWidth = f7;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Center", "End", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddonMarker {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AddonMarker[] $VALUES;
        public static final AddonMarker Start = new AddonMarker("Start", 0);
        public static final AddonMarker Center = new AddonMarker("Center", 1);
        public static final AddonMarker End = new AddonMarker("End", 2);

        private static final /* synthetic */ AddonMarker[] $values() {
            return new AddonMarker[]{Start, Center, End};
        }

        static {
            AddonMarker[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AddonMarker(String str, int i11) {
        }

        public static AddonMarker valueOf(String str) {
            return (AddonMarker) Enum.valueOf(AddonMarker.class, str);
        }

        public static AddonMarker[] values() {
            return (AddonMarker[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DebugMenuCellScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AddonBuilder_942rkJo$lambda$0(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* renamed from: AddonBuilder-942rkJo, reason: not valid java name */
    protected final void m1616AddonBuilder942rkJo(e eVar, InterfaceC6250b.c cVar, float f7, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        InterfaceC6250b.c cVar2;
        float f11;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1337788626);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(cVar) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(content) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.n(this) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && u11.b()) {
            u11.j();
            cVar2 = cVar;
            f11 = f7;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            InterfaceC6250b.c i17 = i15 != 0 ? InterfaceC6250b.a.i() : cVar;
            float f12 = i16 != 0 ? 0 : f7;
            A1 a12 = (A1) u11.m(DebugMenuCellKt.getLocalAddonAlpha());
            e b11 = androidx.compose.ui.layout.a.b(eVar, new AddonLayoutId(getAddonMarker(), i17, f12, null));
            u11.o(1768989674);
            boolean n11 = u11.n(a12);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new DebugMenuCellScope$AddonBuilder$1$1(a12);
                u11.x(C11);
            }
            u11.k();
            e a11 = androidx.compose.ui.graphics.a.a(b11, (Function1) C11);
            V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, a11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            C3349u1.e((i13 >> 9) & 14, content, u11);
            cVar2 = i17;
            f11 = f12;
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DebugMenuCellScope$AddonBuilder$3(this, eVar2, cVar2, f11, content, i11, i12));
        }
    }

    @NotNull
    public abstract AddonMarker getAddonMarker();

    private DebugMenuCellScope() {
    }
}
