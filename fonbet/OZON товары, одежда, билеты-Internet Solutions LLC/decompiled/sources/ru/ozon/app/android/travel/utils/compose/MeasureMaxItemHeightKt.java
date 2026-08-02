package ru.ozon.app.android.travel.utils.compose;

import B1.v0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001ac\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "", "items", "Lkotlin/Function0;", "LZ1/h;", "itemWidthProvider", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "", "itemContent", "content", "WithMaxItemHeight", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;Lfd/n;Lfd/n;LS0/k;II)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MeasureMaxItemHeightKt {
    public static final <T> void WithMaxItemHeight(@NotNull List<? extends T> items, @NotNull Function0<h> itemWidthProvider, e eVar, @NotNull InterfaceC6511n<? super T, ? super InterfaceC3967k, ? super Integer, Unit> itemContent, @NotNull InterfaceC6511n<? super h, ? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemWidthProvider, "itemWidthProvider");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(545721105);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(items) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(itemWidthProvider) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(itemContent) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.F(content) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar;
            u11.o(-682622648);
            boolean F11 = ((i13 & 112) == 32) | u11.F(items) | ((i13 & 7168) == 2048) | ((57344 & i13) == 16384);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new MeasureMaxItemHeightKt$WithMaxItemHeight$1$1(itemWidthProvider, items, itemContent, content);
                u11.x(C11);
            }
            u11.k();
            v0.b(eVar3, (Function2) C11, u11, (i13 >> 6) & 14, 0);
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MeasureMaxItemHeightKt$WithMaxItemHeight$2(items, itemWidthProvider, eVar2, itemContent, content, i11, i12));
        }
    }
}
