package ru.ozon.android.messenger.blocks.replyInputBlock;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f86340b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f86340b = eVar;
        this.f86341c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e eVar = this.f86340b;
            SeparatorDTO separator = eVar.a().getSeparator();
            String colorToken = separator != null ? separator.getColorToken() : null;
            IconDTO leftIcon = eVar.a().getLeftIcon();
            ProductMediaDTO messageMedia = eVar.a().getMessageMedia();
            TextDTO titleAtom = eVar.a().getTitleAtom();
            TextDTO subtitleAtom = eVar.a().getSubtitleAtom();
            IconButtonV3DTO closeIconButton = eVar.a().getCloseIconButton();
            interfaceC3967k2.o(773216750);
            boolean F11 = interfaceC3967k2.F(eVar);
            ru.ozon.android.messenger.framework.core.d dVar = this.f86341c;
            boolean F12 = F11 | interfaceC3967k2.F(dVar);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(eVar, dVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            f.a(colorToken, leftIcon, messageMedia, titleAtom, subtitleAtom, closeIconButton, (Function1) C11, interfaceC3967k2, (IconDTO.$stable << 3) | (ProductMediaDTO.$stable << 6) | (IconButtonV3DTO.$stable << 15));
        }
        return Unit.f71690a;
    }
}
