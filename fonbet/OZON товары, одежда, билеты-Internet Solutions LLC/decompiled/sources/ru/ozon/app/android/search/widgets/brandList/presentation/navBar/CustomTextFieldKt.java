package ru.ozon.app.android.search.widgets.brandList.presentation.navBar;

import B0.C2475h;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.K0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aM\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "placeholderText", "LK1/T;", "textStyle", "Ll1/Z;", "placeholderColor", "searchText", "Lkotlin/Function1;", "", "onValueChange", "CustomTextField-fWhpE4E", "(Landroidx/compose/ui/e;Ljava/lang/String;LK1/T;JLjava/lang/String;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "CustomTextField", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CustomTextFieldKt {
    /* renamed from: CustomTextField-fWhpE4E, reason: not valid java name */
    public static final void m969CustomTextFieldfWhpE4E(e eVar, @NotNull String placeholderText, @NotNull T textStyle, long j11, @NotNull String searchText, @NotNull Function1<? super String, Unit> onValueChange, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        long j12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        C3969l u11 = interfaceC3967k.u(211955434);
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
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(placeholderText) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(textStyle) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
            j12 = j11;
        } else {
            j12 = j11;
            if ((i11 & 3072) == 0) {
                i13 |= u11.s(j12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.n(searchText) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= u11.F(onValueChange) ? 131072 : 65536;
        }
        int i15 = i13;
        if ((74899 & i15) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
            int i16 = i15 >> 12;
            e eVar4 = eVar3;
            c3969l = u11;
            C2475h.d(searchText, onValueChange, eVar4, false, false, textStyle, null, null, true, 0, 0, null, null, null, new K0(textStyle.f()), c.c(-605341555, new CustomTextFieldKt$CustomTextField$1(searchText, placeholderText, textStyle, j12), u11), c3969l, (i16 & 112) | (i16 & 14) | 100663296 | ((i15 << 6) & 896) | ((i15 << 9) & 458752), 196608, 16088);
            eVar2 = eVar4;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new CustomTextFieldKt$CustomTextField$2(eVar2, placeholderText, textStyle, j11, searchText, onValueChange, i11, i12));
        }
    }
}
