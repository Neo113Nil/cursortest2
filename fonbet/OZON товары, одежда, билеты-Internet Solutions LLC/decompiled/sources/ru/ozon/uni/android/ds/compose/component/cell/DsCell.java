package ru.ozon.uni.android.ds.compose.component.cell;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import J0.C3349u1;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Xc.a;
import Xc.b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell;", "", "<init>", "()V", "LZ1/h;", "SeparatorThickness", "F", "getSeparatorThickness-D9Ej5fM$uni_release", "()F", "Le1/b$c;", "AddonContentVerticalAlignment", "Le1/b$c;", "getAddonContentVerticalAlignment$uni_release", "()Le1/b$c;", "AddonType", "AddonLayoutId", "Scope", "StartScope", "CenterScope", "EndScope", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsCell {

    @NotNull
    public static final DsCell INSTANCE = new DsCell();
    private static final float SeparatorThickness = 1;

    @NotNull
    private static final InterfaceC6250b.c AddonContentVerticalAlignment = InterfaceC6250b.a.i();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonLayoutId;", "", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "type", "Le1/b$c;", "verticalAlignment", "<init>", "(Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;Le1/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "getType", "()Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "Le1/b$c;", "getVerticalAlignment", "()Le1/b$c;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddonLayoutId {

        @NotNull
        private final AddonType type;

        @NotNull
        private final InterfaceC6250b.c verticalAlignment;

        public AddonLayoutId(@NotNull AddonType type, @NotNull InterfaceC6250b.c verticalAlignment) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
            this.type = type;
            this.verticalAlignment = verticalAlignment;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddonLayoutId)) {
                return false;
            }
            AddonLayoutId addonLayoutId = (AddonLayoutId) other;
            return this.type == addonLayoutId.type && Intrinsics.d(this.verticalAlignment, addonLayoutId.verticalAlignment);
        }

        @NotNull
        public final InterfaceC6250b.c getVerticalAlignment() {
            return this.verticalAlignment;
        }

        public int hashCode() {
            return this.verticalAlignment.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AddonLayoutId(type=" + this.type + ", verticalAlignment=" + this.verticalAlignment + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Center", "End", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddonType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AddonType[] $VALUES;
        public static final AddonType Start = new AddonType("Start", 0);
        public static final AddonType Center = new AddonType("Center", 1);
        public static final AddonType End = new AddonType("End", 2);

        private static final /* synthetic */ AddonType[] $values() {
            return new AddonType[]{Start, Center, End};
        }

        static {
            AddonType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AddonType(String str, int i11) {
        }

        public static AddonType valueOf(String str) {
            return (AddonType) Enum.valueOf(AddonType.class, str);
        }

        public static AddonType[] values() {
            return (AddonType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$Scope;", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "addonType", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "getAddonType$uni_release", "()Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CenterScope extends Scope {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final CenterScope Instance = new CenterScope();

        @NotNull
        private final AddonType addonType;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope$Companion;", "", "<init>", "()V", "Instance", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;", "getInstance$uni_release", "()Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final CenterScope getInstance$uni_release() {
                return CenterScope.Instance;
            }

            private Companion() {
            }
        }

        public CenterScope() {
            super(null);
            this.addonType = AddonType.Center;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$Scope;", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "addonType", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "getAddonType$uni_release", "()Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EndScope extends Scope {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final EndScope Instance = new EndScope();

        @NotNull
        private final AddonType addonType;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope$Companion;", "", "<init>", "()V", "Instance", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;", "getInstance$uni_release", "()Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final EndScope getInstance$uni_release() {
                return EndScope.Instance;
            }

            private Companion() {
            }
        }

        public EndScope() {
            super(null);
            this.addonType = AddonType.End;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$Scope;", "", "<init>", "()V", "Le1/b$c;", "verticalAlignment", "Lkotlin/Function0;", "", "content", "Addon", "(Le1/b$c;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$CenterScope;", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$EndScope;", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Scope {
        public /* synthetic */ Scope(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void Addon(InterfaceC6250b.c cVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
            int i13;
            Intrinsics.checkNotNullParameter(content, "content");
            C3969l u11 = interfaceC3967k.u(319694169);
            int i14 = i12 & 1;
            if (i14 != 0) {
                i13 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                i13 = (u11.n(cVar) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
            if ((i12 & 2) != 0) {
                i13 |= 48;
            } else if ((i11 & 48) == 0) {
                i13 |= u11.F(content) ? 32 : 16;
            }
            if ((i13 & 19) == 18 && u11.b()) {
                u11.j();
            } else {
                if (i14 != 0) {
                    cVar = InterfaceC6250b.a.i();
                }
                e b11 = androidx.compose.ui.layout.a.b(e.f40358c0, new AddonLayoutId(AddonType.Start, cVar));
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, b11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                C3349u1.e((i13 >> 3) & 14, content, u11);
            }
            InterfaceC6250b.c cVar2 = cVar;
            J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new DsCell$Scope$Addon$2(this, cVar2, content, i11, i12));
            }
        }

        private Scope() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$Scope;", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "addonType", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "getAddonType$uni_release", "()Lru/ozon/uni/android/ds/compose/component/cell/DsCell$AddonType;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StartScope extends Scope {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final StartScope Instance = new StartScope();

        @NotNull
        private final AddonType addonType;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope$Companion;", "", "<init>", "()V", "Instance", "Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;", "getInstance$uni_release", "()Lru/ozon/uni/android/ds/compose/component/cell/DsCell$StartScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final StartScope getInstance$uni_release() {
                return StartScope.Instance;
            }

            private Companion() {
            }
        }

        public StartScope() {
            super(null);
            this.addonType = AddonType.Start;
        }
    }

    private DsCell() {
    }

    @NotNull
    public final InterfaceC6250b.c getAddonContentVerticalAlignment$uni_release() {
        return AddonContentVerticalAlignment;
    }

    /* renamed from: getSeparatorThickness-D9Ej5fM$uni_release, reason: not valid java name */
    public final float m1698getSeparatorThicknessD9Ej5fM$uni_release() {
        return SeparatorThickness;
    }
}
