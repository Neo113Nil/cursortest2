package ru.ozon.composer.compose.widget;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"2\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll20/c;", "I", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/l;", "viewItem", "item", "Lru/ozon/composer/compose/widget/i;", "c", "(Ll10/i;Lru/ozon/composer/ui/widget/l;Ll20/c;LS0/k;I)Lru/ozon/composer/compose/widget/i;", "", "key", "", "isUpdatesEnabled", "", "Le00/c;", "b", "(Lru/ozon/composer/compose/widget/i;Ljava/lang/String;ZLS0/k;II)Ljava/util/List;", "Lkotlin/Function2;", "a", "Lfd/o;", "()Lfd/o;", "zeroPlaceholders", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC6512o<String, Boolean, InterfaceC3967k, Integer, List<e00.c>> f94642a = b.f94645b;

    static final class a extends AbstractC7737t implements InterfaceC6512o<String, Boolean, InterfaceC3967k, Integer, List<? extends e00.c>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l10.i f94643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f94644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l10.i iVar, l lVar) {
            super(4);
            this.f94643b = iVar;
            this.f94644c = lVar;
        }

        @Override // fd.InterfaceC6512o
        public final List<? extends e00.c> invoke(String str, Boolean bool, InterfaceC3967k interfaceC3967k, Integer num) {
            String key = str;
            boolean booleanValue = bool.booleanValue();
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(key, "key");
            interfaceC3967k2.o(1339608149);
            l lVar = this.f94644c;
            List<e00.c> a11 = e00.d.a(key, booleanValue, this.f94643b, lVar, interfaceC3967k2, intValue & 126);
            interfaceC3967k2.k();
            return a11;
        }
    }

    static final class b extends AbstractC7737t implements InterfaceC6512o<String, Boolean, InterfaceC3967k, Integer, List<? extends e00.c>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f94645b = new b(4);

        @Override // fd.InterfaceC6512o
        public final List<? extends e00.c> invoke(String str, Boolean bool, InterfaceC3967k interfaceC3967k, Integer num) {
            String unused$var$ = str;
            bool.getClass();
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            num.intValue();
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            interfaceC3967k2.o(-656673355);
            K k11 = K.f71697a;
            interfaceC3967k2.k();
            return k11;
        }
    }

    @NotNull
    public static final InterfaceC6512o<String, Boolean, InterfaceC3967k, Integer, List<e00.c>> a() {
        return f94642a;
    }

    @NotNull
    public static final <I extends l20.c> List<e00.c> b(@NotNull i<I> iVar, @NotNull String key, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        interfaceC3967k.o(1598019143);
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        List<e00.c> invoke = iVar.c().invoke(key, Boolean.valueOf(z11), interfaceC3967k, Integer.valueOf((i11 >> 3) & 126));
        interfaceC3967k.k();
        return invoke;
    }

    @NotNull
    public static final <I extends l20.c> i<I> c(@NotNull l10.i container, @NotNull l viewItem, @NotNull I item, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Intrinsics.checkNotNullParameter(item, "item");
        interfaceC3967k.o(168128207);
        interfaceC3967k.o(894405732);
        boolean n11 = interfaceC3967k.n(viewItem);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            i iVar = new i(item, viewItem.c(), viewItem, viewItem.n(), new a(container, viewItem));
            interfaceC3967k.x(iVar);
            C11 = iVar;
        }
        i<I> iVar2 = (i) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return iVar2;
    }
}
