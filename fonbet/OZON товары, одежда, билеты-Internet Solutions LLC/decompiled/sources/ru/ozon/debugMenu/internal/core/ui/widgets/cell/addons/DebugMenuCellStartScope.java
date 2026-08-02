package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import S0.InterfaceC3967k;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellScope;
import t0.p;
import t0.q;
import y20.C10833a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellStartScope;", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope;", "<init>", "()V", "", "selected", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "onClick", "enabled", "Lt0/q;", "interactionSource", "Le1/b$c;", "verticalAlignment", "Radio", "(ZLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;ZLt0/q;Le1/b$c;LS0/k;II)V", "Lq1/b;", "painter", "Ll1/Z;", "graphicColor", "Icon-cf5BqRc", "(Lq1/b;Landroidx/compose/ui/e;JLe1/b$c;LS0/k;II)V", "Icon", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "addonMarker", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "getAddonMarker", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "Companion", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuCellStartScope extends DebugMenuCellScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DebugMenuCellStartScope INSTANCE = new DebugMenuCellStartScope();

    @NotNull
    private final DebugMenuCellScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellStartScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellStartScope;", "getINSTANCE", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellStartScope;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DebugMenuCellStartScope getINSTANCE() {
            return DebugMenuCellStartScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private DebugMenuCellStartScope() {
        super(null);
        this.addonMarker = DebugMenuCellScope.AddonMarker.Start;
    }

    /* renamed from: Icon-cf5BqRc, reason: not valid java name */
    public final void m1618Iconcf5BqRc(@NotNull AbstractC8972b painter, e eVar, long j11, InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        interfaceC3967k.o(542561951);
        if ((i12 & 2) != 0) {
            eVar = e.f40358c0;
        }
        m1616AddonBuilder942rkJo(T.j(eVar, 0.0f, 0.0f, 10, 0.0f, 11), (i12 & 8) != 0 ? InterfaceC6250b.a.i() : cVar, 0.0f, c.c(-1535160268, new DebugMenuCellStartScope$Icon$1(painter, (i12 & 4) != 0 ? C10833a.a(interfaceC3967k).f() : j11), interfaceC3967k), interfaceC3967k, ((i11 >> 6) & 112) | 3072 | (i11 & 57344), 4);
        interfaceC3967k.k();
    }

    public final void Radio(boolean z11, e eVar, Function0<Unit> function0, boolean z12, q qVar, InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        interfaceC3967k.o(345906874);
        if ((i12 & 2) != 0) {
            eVar = e.f40358c0;
        }
        e eVar2 = eVar;
        if ((i12 & 4) != 0) {
            function0 = null;
        }
        boolean z13 = (i12 & 8) != 0 ? true : z12;
        if ((i12 & 16) != 0) {
            interfaceC3967k.o(1197680133);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar2 = (q) C11;
            interfaceC3967k.k();
        } else {
            qVar2 = qVar;
        }
        m1616AddonBuilder942rkJo(T.j(eVar2, 0.0f, 0.0f, 8, 0.0f, 11), (i12 & 32) != 0 ? InterfaceC6250b.a.i() : cVar, 0.0f, c.c(-1389117297, new DebugMenuCellStartScope$Radio$2(function0, z11, z13, qVar2), interfaceC3967k), interfaceC3967k, ((i11 >> 12) & 112) | 3072 | ((i11 >> 6) & 57344), 4);
        interfaceC3967k.k();
    }

    @Override // ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellScope
    @NotNull
    public DebugMenuCellScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
