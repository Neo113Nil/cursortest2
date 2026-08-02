package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import d00.C6020f;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarComposableKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import ru.ozon.composer.compose.widget.k;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "MorkovskTabBarWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "Lk20/g;", "widgetComponentStorage", "", "MorkovskTabbarWidgetContent", "(Lru/ozon/composer/compose/widget/i;Lk20/g;LS0/k;I)V", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/di/MorkovskTabbarComponent;", "component", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MorkovskTabBarWidgetKt {
    @NotNull
    public static final i MorkovskTabBarWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.a("regulardraw", "tabbar", k.a(2), new MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1(jsonDeserializer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MorkovskTabbarWidgetContent(ru.ozon.composer.compose.widget.i<MorkovskTabbarVI> iVar, C7475g c7475g, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        ru.ozon.composer.compose.widget.i<MorkovskTabbarVI> iVar2;
        C7475g c7475g2;
        C3969l u11 = interfaceC3967k.u(-2061085299);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c7475g) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            iVar2 = iVar;
            c7475g2 = c7475g;
        } else {
            iVar2 = iVar;
            c7475g2 = c7475g;
            MorkovskTabbarComposableKt.MorkovskTabbarComposable(iVar2.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(iVar2, c7475g2, null, null, null, u11, i12 & 126, 14)), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MorkovskTabBarWidgetKt$MorkovskTabbarWidgetContent$1(iVar2, c7475g2, i11));
        }
    }
}
