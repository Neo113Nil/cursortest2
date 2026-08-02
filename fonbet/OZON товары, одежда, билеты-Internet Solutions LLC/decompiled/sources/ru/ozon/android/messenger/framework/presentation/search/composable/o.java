package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.foundation.layout.a0;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.search.J;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.repository.UniTheme;
import v0.InterfaceC10165e;

/* loaded from: classes10.dex */
public final class o extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f91680b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1 f91681c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f91682d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1 f91683e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, Function1 function1, Context context, Function1 function12, ru.ozon.android.messenger.framework.core.d dVar) {
        super(4);
        this.f91680b = list;
        this.f91681c = function1;
        this.f91682d = context;
        this.f91683e = function12;
        this.f91684f = dVar;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k2.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            J j11 = (J) this.f91680b.get(intValue);
            interfaceC3967k2.o(-1147674358);
            if (j11 instanceof J.a) {
                interfaceC3967k2.o(-1147625410);
                J.a aVar = (J.a) j11;
                Object c11 = ((ru.ozon.android.messenger.framework.presentation.models.u) C7714v.K(aVar.a().b())).c();
                if (c11 instanceof ru.ozon.android.messenger.blocks.chat.search.i) {
                    interfaceC3967k2.o(-1147520072);
                    androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
                    interfaceC3967k2.o(-1561032613);
                    Function1 function1 = this.f91681c;
                    boolean n11 = interfaceC3967k2.n(function1) | interfaceC3967k2.F(c11);
                    Object C11 = interfaceC3967k2.C();
                    if (n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new k(function1, (ru.ozon.android.messenger.blocks.chat.search.i) c11);
                        interfaceC3967k2.x(C11);
                    }
                    interfaceC3967k2.k();
                    androidx.compose.ui.e c12 = androidx.compose.foundation.i.c(e11, false, null, null, (Function0) C11, 7);
                    ru.ozon.android.messenger.blocks.chat.search.i iVar = (ru.ozon.android.messenger.blocks.chat.search.i) c11;
                    List<BadgeDTO> b11 = iVar.b();
                    TextDTO d11 = iVar.d();
                    TextDTO h11 = iVar.h();
                    TextDTO a11 = iVar.g().a();
                    OzonSpannableString ozonSpannableString = new OzonSpannableString(ru.ozon.android.messenger.utils.d.a(iVar.g().b(), this.f91682d));
                    TextPreset textPreset = TextPreset.PRESET_CUSTOM;
                    UniTheme uniTheme = UniTheme.INSTANCE;
                    TextDTO textDTO = new TextDTO(ozonSpannableString, null, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getCompact400Small().getId(), uniTheme.getColorTokens().getTextSecondary().getId(), null, null, null, null, false, null, null, null, null, null, 523838, null);
                    IconDTO a12 = iVar.a();
                    List<Icon> i12 = iVar.i();
                    interfaceC3967k2.o(-1560993405);
                    boolean F11 = interfaceC3967k2.F(c11);
                    Function1 function12 = this.f91683e;
                    boolean n12 = F11 | interfaceC3967k2.n(function12);
                    Object C12 = interfaceC3967k2.C();
                    if (n12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new l(function12, (ru.ozon.android.messenger.blocks.chat.search.i) c11);
                        interfaceC3967k2.x(C12);
                    }
                    interfaceC3967k2.k();
                    ru.ozon.android.messenger.blocks.chat.search.g.a(c12, h11, a11, textDTO, b11, a12, i12, d11, (Function0) C12, interfaceC3967k2, (IconDTO.$stable << 15) | (Icon.$stable << 18));
                    interfaceC3967k2.k();
                } else {
                    interfaceC3967k2.o(-1145937212);
                    E.a(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), this.f91684f, (ru.ozon.android.messenger.framework.presentation.models.e) C7714v.K(ru.ozon.android.messenger.framework.presentation.models.f.b(aVar.a())), interfaceC3967k2, 6);
                    interfaceC3967k2.k();
                }
                interfaceC3967k2.k();
            } else {
                if (!(j11 instanceof J.b)) {
                    throw U7.l.c(interfaceC3967k2, -1561042407);
                }
                interfaceC3967k2.o(-1145343407);
                j.a(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), interfaceC3967k2, 6);
                interfaceC3967k2.k();
            }
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
