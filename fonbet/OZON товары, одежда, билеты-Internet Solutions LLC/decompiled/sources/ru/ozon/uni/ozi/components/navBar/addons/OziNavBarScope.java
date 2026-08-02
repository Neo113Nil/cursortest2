package ru.ozon.uni.ozi.components.navBar.addons;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
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
import m3.C8060b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope;", "", "<init>", "()V", "Le1/b;", "alignment", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "content", "AddonBuilder", "(Le1/b;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "Filler$uni_release", "(LS0/k;I)V", "Filler", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "getAddonMarker$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "addonMarker", "AddonMarker", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomCenterScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomStartScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarEndScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziNavBarScope {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "", "<init>", "(Ljava/lang/String;I)V", "TopStart", "TopCenter", "TopEndScope", "BottomStart", "BottomCenter", "BottomEndScope", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddonMarker {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AddonMarker[] $VALUES;
        public static final AddonMarker TopStart = new AddonMarker("TopStart", 0);
        public static final AddonMarker TopCenter = new AddonMarker("TopCenter", 1);
        public static final AddonMarker TopEndScope = new AddonMarker("TopEndScope", 2);
        public static final AddonMarker BottomStart = new AddonMarker("BottomStart", 3);
        public static final AddonMarker BottomCenter = new AddonMarker("BottomCenter", 4);
        public static final AddonMarker BottomEndScope = new AddonMarker("BottomEndScope", 5);

        private static final /* synthetic */ AddonMarker[] $values() {
            return new AddonMarker[]{TopStart, TopCenter, TopEndScope, BottomStart, BottomCenter, BottomEndScope};
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

    public /* synthetic */ OziNavBarScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected final void AddonBuilder(@NotNull InterfaceC6250b alignment, e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC3967k.o(-850863462);
        if ((i12 & 2) != 0) {
            eVar = e.f40358c0;
        }
        P9.a.b(eVar, getAddonMarker().name());
        e b11 = androidx.compose.ui.layout.a.b(eVar, getAddonMarker());
        V f7 = C5185h.f(alignment, false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, b11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        content.invoke(interfaceC3967k, Integer.valueOf((i11 >> 6) & 14));
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    public final void Filler$uni_release(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1666649862);
        AddonBuilder(InterfaceC6250b.a.e(), null, ComposableSingletons$OziNavBarScopeKt.INSTANCE.m3112getLambda1$uni_release(), interfaceC3967k, ((i11 << 9) & 7168) | 390, 2);
        interfaceC3967k.k();
    }

    @NotNull
    /* renamed from: getAddonMarker$uni_release */
    public abstract AddonMarker getAddonMarker();

    private OziNavBarScope() {
    }
}
