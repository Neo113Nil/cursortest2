package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import B1.V;
import B1.v0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C0;
import S0.C3956f1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import S0.InterfaceC3972m0;
import S0.J0;
import S0.Q;
import T7.E;
import WZ.t;
import Z1.d;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6994n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import u0.InterfaceC9895d;
import y0.C10792B;
import y0.b0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ag\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\u000e\u0010\u0019\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lu0/d;", "", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$Page;", "pages", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;", "underImage", "Ly0/b0;", "pagerState", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "trackBackSwipe", "trackPageView", "Content", "(Lu0/d;Ljava/util/List;Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;Ly0/b0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "", "imageSize", "UnderImage", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$UnderImage;Ly0/b0;ILS0/k;I)V", "state", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/ui/ImageSizeHelper;", "imageSizeHelper", "Page", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Content$Page;Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/ui/ImageSizeHelper;LS0/k;I)V", "lastPage", "", "rotation", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(@NotNull InterfaceC9895d interfaceC9895d, @NotNull List<AppOnboardingVI.Content.Page> pages, AppOnboardingVI.Content.UnderImage underImage, @NotNull b0 pagerState, Function1<? super t, Unit> function1, Function1<? super t, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function13;
        int i14;
        Function1<? super t, Unit> function14;
        int i15;
        Function1<? super t, Unit> function15;
        Function1<? super t, Unit> function16;
        Object C11;
        boolean F11;
        Object C12;
        boolean z11;
        b0 b0Var;
        List<AppOnboardingVI.Content.Page> list;
        Function1<? super t, Unit> function17;
        boolean F12;
        Object C13;
        int I11;
        Object C14;
        Function1<? super t, Unit> function18;
        Function1<? super t, Unit> function19;
        J0 m02;
        Intrinsics.checkNotNullParameter(interfaceC9895d, "<this>");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        C3969l u11 = interfaceC3967k.u(-1430643639);
        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9895d) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(pages) ? 32 : 16;
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(underImage) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 4) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.n(pagerState) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = i12 & 8;
        if (i16 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            function13 = function1;
            i13 |= u11.F(function13) ? 16384 : 8192;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 196608;
            } else if ((196608 & i11) == 0) {
                function14 = function12;
                i13 |= u11.F(function14) ? 131072 : 65536;
                i15 = i13;
                if ((74899 & i15) == 74898 || !u11.b()) {
                    if (i16 != 0) {
                        u11.o(-457303229);
                        Object C15 = u11.C();
                        if (C15 == InterfaceC3967k.a.a()) {
                            C15 = ContentKt$Content$1$1.INSTANCE;
                            u11.x(C15);
                        }
                        u11.k();
                        function15 = (Function1) C15;
                    } else {
                        function15 = function13;
                    }
                    if (i14 != 0) {
                        u11.o(-457301629);
                        Object C16 = u11.C();
                        if (C16 == InterfaceC3967k.a.a()) {
                            C16 = ContentKt$Content$2$1.INSTANCE;
                            u11.x(C16);
                        }
                        u11.k();
                        function16 = (Function1) C16;
                    } else {
                        function16 = function14;
                    }
                    u11.o(-457300681);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = C3956f1.a(pagerState.r());
                        u11.x(C11);
                    }
                    InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
                    u11.k();
                    Integer valueOf = Integer.valueOf(pagerState.M());
                    u11.o(-457297380);
                    int i17 = i15 & 7168;
                    F11 = (i17 == 2048) | u11.F(pages) | ((i15 & 57344) == 16384);
                    C12 = u11.C();
                    if (!F11 || C12 == InterfaceC3967k.a.a()) {
                        z11 = true;
                        ContentKt$Content$3$1 contentKt$Content$3$1 = new ContentKt$Content$3$1(pagerState, pages, function15, interfaceC3972m0, null);
                        b0Var = pagerState;
                        list = pages;
                        function17 = function15;
                        u11.x(contentKt$Content$3$1);
                        C12 = contentKt$Content$3$1;
                    } else {
                        b0Var = pagerState;
                        function17 = function15;
                        z11 = true;
                        list = pages;
                    }
                    u11.k();
                    Q.e(u11, valueOf, (Function2) C12);
                    Integer valueOf2 = Integer.valueOf(b0Var.r());
                    u11.o(-457290095);
                    F12 = u11.F(list) | (i17 == 2048 ? z11 : false) | ((458752 & i15) == 131072 ? z11 : false);
                    C13 = u11.C();
                    if (!F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new ContentKt$Content$4$1(list, b0Var, function16, null);
                        u11.x(C13);
                    }
                    u11.k();
                    Q.e(u11, valueOf2, (Function2) C13);
                    e a11 = interfaceC9895d.a(e.f40358c0, z11);
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, a11);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    u11.o(-1361237496);
                    C14 = u11.C();
                    if (C14 == InterfaceC3967k.a.a()) {
                        C14 = new ImageSizeHelper(list.size());
                        u11.x(C14);
                    }
                    ImageSizeHelper imageSizeHelper = (ImageSizeHelper) C14;
                    u11.k();
                    u11.o(-1361235361);
                    if (underImage != null) {
                        UnderImage(underImage, b0Var, imageSizeHelper.getImageSizeState(), u11, (i15 >> 6) & 112);
                    }
                    u11.k();
                    C10792B.a(pagerState, null, null, null, list.size(), 0.0f, null, null, false, null, null, a1.c.c(-1104211679, new ContentKt$Content$5$2(list, imageSizeHelper), u11), u11, (i15 >> 9) & 14, 8174);
                    u11.f();
                    function18 = function17;
                    function19 = function16;
                } else {
                    u11.j();
                    function18 = function13;
                    function19 = function14;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ContentKt$Content$6(interfaceC9895d, pages, underImage, pagerState, function18, function19, i11, i12));
                    return;
                }
                return;
            }
            function14 = function12;
            i15 = i13;
            if ((74899 & i15) == 74898) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            u11.o(-457300681);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            InterfaceC3972m0 interfaceC3972m02 = (InterfaceC3972m0) C11;
            u11.k();
            Integer valueOf3 = Integer.valueOf(pagerState.M());
            u11.o(-457297380);
            int i172 = i15 & 7168;
            F11 = (i172 == 2048) | u11.F(pages) | ((i15 & 57344) == 16384);
            C12 = u11.C();
            if (F11) {
            }
            z11 = true;
            ContentKt$Content$3$1 contentKt$Content$3$12 = new ContentKt$Content$3$1(pagerState, pages, function15, interfaceC3972m02, null);
            b0Var = pagerState;
            list = pages;
            function17 = function15;
            u11.x(contentKt$Content$3$12);
            C12 = contentKt$Content$3$12;
            u11.k();
            Q.e(u11, valueOf3, (Function2) C12);
            Integer valueOf22 = Integer.valueOf(b0Var.r());
            u11.o(-457290095);
            F12 = u11.F(list) | (i172 == 2048 ? z11 : false) | ((458752 & i15) == 131072 ? z11 : false);
            C13 = u11.C();
            if (!F12) {
            }
            C13 = new ContentKt$Content$4$1(list, b0Var, function16, null);
            u11.x(C13);
            u11.k();
            Q.e(u11, valueOf22, (Function2) C13);
            e a112 = interfaceC9895d.a(e.f40358c0, z11);
            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, a112);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            u11.o(-1361237496);
            C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
            }
            ImageSizeHelper imageSizeHelper2 = (ImageSizeHelper) C14;
            u11.k();
            u11.o(-1361235361);
            if (underImage != null) {
            }
            u11.k();
            C10792B.a(pagerState, null, null, null, list.size(), 0.0f, null, null, false, null, null, a1.c.c(-1104211679, new ContentKt$Content$5$2(list, imageSizeHelper2), u11), u11, (i15 >> 9) & 14, 8174);
            u11.f();
            function18 = function17;
            function19 = function16;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function13 = function1;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        function14 = function12;
        i15 = i13;
        if ((74899 & i15) == 74898) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        u11.o(-457300681);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3972m0 interfaceC3972m022 = (InterfaceC3972m0) C11;
        u11.k();
        Integer valueOf32 = Integer.valueOf(pagerState.M());
        u11.o(-457297380);
        int i1722 = i15 & 7168;
        F11 = (i1722 == 2048) | u11.F(pages) | ((i15 & 57344) == 16384);
        C12 = u11.C();
        if (F11) {
        }
        z11 = true;
        ContentKt$Content$3$1 contentKt$Content$3$122 = new ContentKt$Content$3$1(pagerState, pages, function15, interfaceC3972m022, null);
        b0Var = pagerState;
        list = pages;
        function17 = function15;
        u11.x(contentKt$Content$3$122);
        C12 = contentKt$Content$3$122;
        u11.k();
        Q.e(u11, valueOf32, (Function2) C12);
        Integer valueOf222 = Integer.valueOf(b0Var.r());
        u11.o(-457290095);
        F12 = u11.F(list) | (i1722 == 2048 ? z11 : false) | ((458752 & i15) == 131072 ? z11 : false);
        C13 = u11.C();
        if (!F12) {
        }
        C13 = new ContentKt$Content$4$1(list, b0Var, function16, null);
        u11.x(C13);
        u11.k();
        Q.e(u11, valueOf222, (Function2) C13);
        e a1122 = interfaceC9895d.a(e.f40358c0, z11);
        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, a1122);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        u11.o(-1361237496);
        C14 = u11.C();
        if (C14 == InterfaceC3967k.a.a()) {
        }
        ImageSizeHelper imageSizeHelper22 = (ImageSizeHelper) C14;
        u11.k();
        u11.o(-1361235361);
        if (underImage != null) {
        }
        u11.k();
        C10792B.a(pagerState, null, null, null, list.size(), 0.0f, null, null, false, null, null, a1.c.c(-1104211679, new ContentKt$Content$5$2(list, imageSizeHelper22), u11), u11, (i15 >> 9) & 14, 8174);
        u11.f();
        function18 = function17;
        function19 = function16;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Page(AppOnboardingVI.Content.Page page, ImageSizeHelper imageSizeHelper, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2057780111);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(page) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(imageSizeHelper) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.o(1880500134);
            boolean F11 = u11.F(page) | u11.F(imageSizeHelper);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ContentKt$Page$1$1(page, imageSizeHelper);
                u11.x(C11);
            }
            u11.k();
            v0.b(null, (Function2) C11, u11, 0, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ContentKt$Page$2(page, imageSizeHelper, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnderImage(AppOnboardingVI.Content.UnderImage underImage, b0 b0Var, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(1209575100);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(underImage) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(b0Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.r(i11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else if (i11 > 0) {
            u11.o(-1152048673);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C0.a(0.0f);
                u11.x(C11);
            }
            InterfaceC3970l0 interfaceC3970l0 = (InterfaceC3970l0) C11;
            u11.k();
            int r11 = b0Var.r();
            float s11 = b0Var.s();
            List<C7807Z> list = underImage.getGradients().get(r11);
            List<List<C7807Z>> gradients = underImage.getGradients();
            int i14 = s11 >= 0.0f ? r11 + 1 : r11 - 1;
            List<C7807Z> list2 = (i14 < 0 || i14 >= gradients.size()) ? list : gradients.get(i14);
            long g10 = C7811b0.g(list.get(0).w(), list2.get(0).w(), Math.abs(s11));
            long g11 = C7811b0.g(list.get(1).w(), list2.get(1).w(), Math.abs(s11));
            Unit unit = Unit.f71690a;
            u11.o(-1152028326);
            boolean z11 = (i13 & 112) == 32;
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ContentKt$UnderImage$1$1(b0Var, interfaceC3970l0, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g12 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(462124496);
            d dVar = (d) u11.m(K0.e());
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            u0.E.a(u11, a0.f(aVar, dsSpacings.m1855getDp40D9Ej5fM()));
            String image = underImage.getImage();
            e b11 = androidx.compose.ui.graphics.a.b(C6994n.a(a0.r(aVar, dsSpacings.m1855getDp40D9Ej5fM() + dVar.B(i11)), interfaceC3970l0.getFloatValue()), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, false, 131067);
            u11.o(529545914);
            boolean s12 = u11.s(g10) | u11.s(g11);
            Object C13 = u11.C();
            if (s12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ContentKt$UnderImage$2$1$1$1(g10, g11);
                u11.x(C13);
            }
            u11.k();
            Ag0.e.a(image, C5182e.a(androidx.compose.ui.draw.c.c(b11, (Function1) C13), 1.0f, false), null, null, null, 0.0f, null, u11, 3072, 244);
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ContentKt$UnderImage$3(underImage, b0Var, i11, i12));
        }
    }
}
