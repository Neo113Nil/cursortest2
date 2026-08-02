package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.A1;
import S0.InterfaceC3967k;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9895d;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.composable.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9519a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f91646a = new C4912a(false, 690972780, C1715a.f91647b);

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.composable.a$a, reason: collision with other inner class name */
    static final class C1715a extends AbstractC7737t implements fd.p<InterfaceC9895d, androidx.compose.ui.e, A1<? extends AbstractC7799Q>, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1715a f91647b = new C1715a(5);

        @Override // fd.p
        public final Unit invoke(InterfaceC9895d interfaceC9895d, androidx.compose.ui.e eVar, A1<? extends AbstractC7799Q> a12, InterfaceC3967k interfaceC3967k, Integer num) {
            int i11;
            InterfaceC9895d Shimmer = interfaceC9895d;
            androidx.compose.ui.e shimmerModifier = eVar;
            A1<? extends AbstractC7799Q> brush = a12;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Shimmer, "$this$Shimmer");
            Intrinsics.checkNotNullParameter(shimmerModifier, "shimmerModifier");
            Intrinsics.checkNotNullParameter(brush, "brush");
            if ((intValue & 48) == 0) {
                i11 = (interfaceC3967k2.n(shimmerModifier) ? 32 : 16) | intValue;
            } else {
                i11 = intValue;
            }
            if ((intValue & 384) == 0) {
                i11 |= interfaceC3967k2.n(brush) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i11 & 1169) == 1168 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                j.d(shimmerModifier, 8, brush, interfaceC3967k2, (i11 & 896) | ((i11 >> 3) & 14) | 48);
            }
            return Unit.f71690a;
        }
    }
}
