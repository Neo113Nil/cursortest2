package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import u0.C9896e;

/* loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, e.a aVar, float f7, float f11, Function1 function1, @NotNull Function1 function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        float f12;
        int i14;
        Function1 function13;
        int i15;
        float f13;
        Function1 function14;
        e.a aVar2;
        float f14;
        float f15;
        J0 m02;
        Function1 onAction = function12;
        C9896e BottomSheetButtons = C9896e.f99653a;
        Intrinsics.checkNotNullParameter(BottomSheetButtons, "$this$BottomSheetButtons");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(594885377);
        int i16 = 2;
        if ((i11 & 6) == 0) {
            i13 = (u11.n(BottomSheetButtons) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(list) ? 32 : 16;
        }
        int i17 = i13 | 3456;
        int i18 = i12 & 8;
        if (i18 != 0) {
            i17 = i13 | 28032;
        } else if ((i11 & 24576) == 0) {
            f12 = f11;
            i17 |= u11.q(f12) ? 16384 : 8192;
            i14 = i12 & 16;
            if (i14 == 0) {
                i17 |= 196608;
            } else if ((196608 & i11) == 0) {
                function13 = function1;
                i17 |= u11.F(function13) ? 131072 : 65536;
                if ((1572864 & i11) == 0) {
                    i17 |= u11.F(onAction) ? 1048576 : 524288;
                }
                i15 = i17;
                if ((599187 & i15) == 599186 || !u11.b()) {
                    e.a aVar3 = androidx.compose.ui.e.f40358c0;
                    f13 = a.f91049c;
                    if (i18 != 0) {
                        f12 = a.f91049c;
                    }
                    float f16 = f12;
                    if (i14 != 0) {
                        function13 = null;
                    }
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ButtonV3DTO buttonV3DTO = (ButtonV3DTO) it.next();
                            u11.G(-1755840147, buttonV3DTO.getTitle());
                            Function1 function15 = function13;
                            DsButtonAtomKt.DsButtonAtom(buttonV3DTO, T.h(a0.e(aVar3, 1.0f), f13, 0.0f, i16), false, onAction, u11, (i15 >> 9) & 7168, 4);
                            CommonControlSettings common = buttonV3DTO.getCommon();
                            Map<String, TokenizedTrackingInfo> trackingInfo = common != null ? common.getTrackingInfo() : null;
                            if (trackingInfo != null) {
                                AbstractC5434v.a aVar4 = AbstractC5434v.a.ON_RESUME;
                                u11.o(1964073909);
                                boolean F11 = ((458752 & i15) == 131072) | u11.F(trackingInfo);
                                Object C11 = u11.C();
                                if (F11 || C11 == InterfaceC3967k.a.a()) {
                                    C11 = new g(function15, trackingInfo);
                                    u11.x(C11);
                                }
                                u11.k();
                                e3.i.a(aVar4, null, (Function0) C11, u11, 6);
                            }
                            ru.ozon.android.messenger.framework.presentation.common.utils.a.a(f16, u11);
                            u11.J();
                            onAction = function12;
                            function13 = function15;
                            i16 = 2;
                        }
                    }
                    function14 = function13;
                    aVar2 = aVar3;
                    f14 = f13;
                    f15 = f16;
                } else {
                    u11.j();
                    f14 = f7;
                    f15 = f12;
                    function14 = function13;
                    aVar2 = aVar;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new h(list, aVar2, f14, f15, function14, function12, i11, i12));
                    return;
                }
                return;
            }
            function13 = function1;
            if ((1572864 & i11) == 0) {
            }
            i15 = i17;
            if ((599187 & i15) == 599186) {
            }
            e.a aVar32 = androidx.compose.ui.e.f40358c0;
            f13 = a.f91049c;
            if (i18 != 0) {
            }
            float f162 = f12;
            if (i14 != 0) {
            }
            if (list != null) {
            }
            function14 = function13;
            aVar2 = aVar32;
            f14 = f13;
            f15 = f162;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        f12 = f11;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        function13 = function1;
        if ((1572864 & i11) == 0) {
        }
        i15 = i17;
        if ((599187 & i15) == 599186) {
        }
        e.a aVar322 = androidx.compose.ui.e.f40358c0;
        f13 = a.f91049c;
        if (i18 != 0) {
        }
        float f1622 = f12;
        if (i14 != 0) {
        }
        if (list != null) {
        }
        function14 = function13;
        aVar2 = aVar322;
        f14 = f13;
        f15 = f1622;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
