package ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellScope;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00152\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope;", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope;", "<init>", "()V", "", "label", "Landroidx/compose/ui/e;", "modifier", "", "showChevron", "Le1/b$c;", "verticalAlignment", "", "Badge", "(Ljava/lang/String;Landroidx/compose/ui/e;ZLe1/b$c;LS0/k;II)V", "Chevron", "(Landroidx/compose/ui/e;Le1/b$c;LS0/k;II)V", "isToggled", "isEnabled", "Lt0/q;", "interactionSource", "Lkotlin/Function1;", "onCheckedChange", "Toggle", "(ZLandroidx/compose/ui/e;ZLt0/q;Lkotlin/jvm/functions/Function1;Le1/b$c;LS0/k;II)V", "Copy", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "addonMarker", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "getAddonMarker", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellScope$AddonMarker;", "Companion", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuCellEndScope extends DebugMenuCellScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DebugMenuCellEndScope INSTANCE = new DebugMenuCellEndScope();

    @NotNull
    private final DebugMenuCellScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope;", "getINSTANCE", "()Lru/ozon/debugMenu/internal/core/ui/widgets/cell/addons/DebugMenuCellEndScope;", "ozon-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DebugMenuCellEndScope getINSTANCE() {
            return DebugMenuCellEndScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private DebugMenuCellEndScope() {
        super(null);
        this.addonMarker = DebugMenuCellScope.AddonMarker.End;
    }

    public final void Badge(@NotNull String label, e eVar, boolean z11, InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(label, "label");
        interfaceC3967k.o(178914694);
        if ((i12 & 2) != 0) {
            eVar = e.f40358c0;
        }
        e eVar2 = eVar;
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        m1616AddonBuilder942rkJo(T.j(eVar2, 8, 0.0f, 0.0f, 0.0f, 14), (i12 & 8) != 0 ? InterfaceC6250b.a.i() : cVar, 0.0f, c.c(744349787, new DebugMenuCellEndScope$Badge$1(label, z11), interfaceC3967k), interfaceC3967k, ((i11 >> 6) & 112) | 3072 | (i11 & 57344), 4);
        interfaceC3967k.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Chevron(e eVar, InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        InterfaceC6250b.c cVar2;
        DebugMenuCellScope debugMenuCellScope;
        InterfaceC6250b.c cVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1350753233);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            cVar2 = cVar;
            i13 |= u11.n(cVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                debugMenuCellScope = this;
                i13 |= u11.n(debugMenuCellScope) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
                    InterfaceC6250b.c i16 = i15 != 0 ? InterfaceC6250b.a.i() : cVar2;
                    eVar2 = eVar3;
                    debugMenuCellScope.m1616AddonBuilder942rkJo(T.j(eVar3, 8, 0.0f, 0.0f, 0.0f, 14), i16, 0.0f, ComposableSingletons$DebugMenuCellEndScopeKt.INSTANCE.m1614getLambda1$ozon_debug_menu_release(), u11, (i13 & 112) | 3072 | ((i13 << 6) & 57344), 4);
                    cVar3 = i16;
                } else {
                    u11.j();
                    cVar3 = cVar2;
                }
                e eVar4 = eVar2;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new DebugMenuCellEndScope$Chevron$1(this, eVar4, cVar3, i11, i12));
                    return;
                }
                return;
            }
            debugMenuCellScope = this;
            if ((i13 & 147) == 146) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            eVar2 = eVar3;
            debugMenuCellScope.m1616AddonBuilder942rkJo(T.j(eVar3, 8, 0.0f, 0.0f, 0.0f, 14), i16, 0.0f, ComposableSingletons$DebugMenuCellEndScopeKt.INSTANCE.m1614getLambda1$ozon_debug_menu_release(), u11, (i13 & 112) | 3072 | ((i13 << 6) & 57344), 4);
            cVar3 = i16;
            e eVar42 = eVar2;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        cVar2 = cVar;
        if ((i12 & 4) == 0) {
        }
        debugMenuCellScope = this;
        if ((i13 & 147) == 146) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        eVar2 = eVar3;
        debugMenuCellScope.m1616AddonBuilder942rkJo(T.j(eVar3, 8, 0.0f, 0.0f, 0.0f, 14), i16, 0.0f, ComposableSingletons$DebugMenuCellEndScopeKt.INSTANCE.m1614getLambda1$ozon_debug_menu_release(), u11, (i13 & 112) | 3072 | ((i13 << 6) & 57344), 4);
        cVar3 = i16;
        e eVar422 = eVar2;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public final void Copy(e eVar, InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        interfaceC3967k.o(1779899013);
        if ((i12 & 1) != 0) {
            eVar = e.f40358c0;
        }
        e eVar2 = eVar;
        if ((i12 & 2) != 0) {
            cVar = InterfaceC6250b.a.i();
        }
        m1616AddonBuilder942rkJo(T.j(eVar2, 8, 0.0f, 0.0f, 0.0f, 14), cVar, 0.0f, ComposableSingletons$DebugMenuCellEndScopeKt.INSTANCE.m1615getLambda2$ozon_debug_menu_release(), interfaceC3967k, (i11 & 112) | 3072 | ((i11 << 6) & 57344), 4);
        interfaceC3967k.k();
    }

    public final void Toggle(boolean z11, e eVar, boolean z12, q qVar, Function1<? super Boolean, Unit> function1, InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        q qVar2;
        interfaceC3967k.o(1402058910);
        if ((i12 & 2) != 0) {
            eVar = e.f40358c0;
        }
        e eVar2 = eVar;
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        if ((i12 & 8) != 0) {
            interfaceC3967k.o(-693478383);
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
        m1616AddonBuilder942rkJo(T.j(eVar2, 8, 0.0f, 0.0f, 0.0f, 14), (i12 & 32) != 0 ? InterfaceC6250b.a.i() : cVar, 0.0f, c.c(-1462079767, new DebugMenuCellEndScope$Toggle$2(z11, z12, qVar2, (i12 & 16) != 0 ? null : function1), interfaceC3967k), interfaceC3967k, ((i11 >> 12) & 112) | 3072 | ((i11 >> 6) & 57344), 4);
        interfaceC3967k.k();
    }

    @Override // ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellScope
    @NotNull
    public DebugMenuCellScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
