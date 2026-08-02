package ru.ozon.uni.ozi.components.navBar.addons;

import P9.a;
import S0.InterfaceC3967k;
import a1.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope;", "<init>", "()V", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "", "enabled", "Lt0/q;", "interactionSource", "BackIconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;ZLt0/q;LS0/k;II)V", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "addonMarker", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "getAddonMarker$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarTopStartScope extends OziNavBarScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final OziNavBarTopStartScope INSTANCE = new OziNavBarTopStartScope();

    @NotNull
    private final OziNavBarScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope;", "getINSTANCE$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziNavBarTopStartScope getINSTANCE$uni_release() {
            return OziNavBarTopStartScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private OziNavBarTopStartScope() {
        super(null);
        this.addonMarker = OziNavBarScope.AddonMarker.TopStart;
    }

    public final void BackIconButton(@NotNull Function0<Unit> onClick, e eVar, boolean z11, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        interfaceC3967k.o(1847074912);
        if ((i12 & 2) != 0) {
            eVar = e.f40358c0;
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        if ((i12 & 8) != 0) {
            interfaceC3967k.o(1687081408);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar = (q) C11;
            interfaceC3967k.k();
        }
        d h11 = InterfaceC6250b.a.h();
        e.a aVar = e.f40358c0;
        a.b(aVar, "TOP_START");
        AddonBuilder(h11, aVar, c.c(131066966, new OziNavBarTopStartScope$BackIconButton$2(eVar, onClick, z11, qVar), interfaceC3967k), interfaceC3967k, ((i11 >> 3) & 7168) | 438, 0);
        interfaceC3967k.k();
    }

    @Override // ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope
    @NotNull
    /* renamed from: getAddonMarker$uni_release, reason: from getter */
    public OziNavBarScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
