package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation;

import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import Q1.X;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormInputState;
import ru.ozon.app.android.monetization.ui.AddressSearchSheetPresenter;
import ru.ozon.app.android.monetization.ui.AddressSearchSheetPresenterKt;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormVI;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.UniTestTagsKt;
import t0.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u000b\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View;", "views", "LS0/A1;", "", "", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "inputStates", "Lkotlin/Function2;", "", "onInputChanged", "BloggerPersonalDataFormContent", "(Ljava/util/List;LS0/A1;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input;", "view", "state", "Landroidx/compose/ui/e;", "modifier", "Input", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input;Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Separator;", "Separator", "(Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Separator;Landroidx/compose/ui/e;LS0/k;II)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BloggerPersonalDataFormContentKt {
    public static final void BloggerPersonalDataFormContent(@NotNull List<? extends BloggerPersonalDataFormVI.View> views, @NotNull A1<? extends Map<String, BloggerPersonalDataFormInputState>> inputStates, @NotNull Function2<? super String, ? super String, Unit> onInputChanged, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(inputStates, "inputStates");
        Intrinsics.checkNotNullParameter(onInputChanged, "onInputChanged");
        C3969l u11 = interfaceC3967k.u(-1656155990);
        int i12 = (i11 & 6) == 0 ? (u11.F(views) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(inputStates) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onInputChanged) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e e11 = a0.e(e.f40358c0, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(113693528);
            int size = views.size();
            for (int i14 = 0; i14 < size; i14++) {
                BloggerPersonalDataFormVI.View view = views.get(i14);
                if (view instanceof BloggerPersonalDataFormVI.View.Input) {
                    u11.o(1677602141);
                    BloggerPersonalDataFormVI.View.Input input = (BloggerPersonalDataFormVI.View.Input) view;
                    BloggerPersonalDataFormInputState bloggerPersonalDataFormInputState = inputStates.getValue().get(input.getName());
                    if (bloggerPersonalDataFormInputState != null) {
                        Input(input, bloggerPersonalDataFormInputState, onInputChanged, T.h(e.f40358c0, 16, 0.0f, 2), u11, (i13 & 896) | 3072, 0);
                        Unit unit = Unit.f71690a;
                    }
                    u11.k();
                } else {
                    if (!(view instanceof BloggerPersonalDataFormVI.View.Separator)) {
                        u11.o(-1054264597);
                        u11.k();
                        throw new o();
                    }
                    u11.o(-1054256179);
                    Separator((BloggerPersonalDataFormVI.View.Separator) view, null, u11, 0, 2);
                    u11.k();
                }
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BloggerPersonalDataFormContentKt$BloggerPersonalDataFormContent$2(views, inputStates, onInputChanged, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Input(BloggerPersonalDataFormVI.View.Input input, BloggerPersonalDataFormInputState bloggerPersonalDataFormInputState, Function2<? super String, ? super String, Unit> function2, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        BloggerPersonalDataFormInputState bloggerPersonalDataFormInputState2;
        int i14;
        e eVar2;
        BloggerPersonalDataFormVI.View.Input.Type type;
        DsInputType dsInputType;
        e uniResourceIdTestTag;
        boolean z11;
        Object C11;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1395240204);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(input) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            bloggerPersonalDataFormInputState2 = bloggerPersonalDataFormInputState;
            i13 |= u11.F(bloggerPersonalDataFormInputState2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                eVar2 = eVar;
                i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
                    boolean z12 = bloggerPersonalDataFormInputState2.getError() != null;
                    type = input.getType();
                    u11.o(1920849536);
                    if (type == BloggerPersonalDataFormVI.View.Input.Type.ADDRESS) {
                        AddressSearchSheetPresenter rememberAddressSearchSheetPresenter = AddressSearchSheetPresenterKt.rememberAddressSearchSheetPresenter(input.getName(), u11, 0);
                        u11.o(1920855269);
                        boolean n11 = u11.n(rememberAddressSearchSheetPresenter);
                        Object C12 = u11.C();
                        if (n11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new BloggerPersonalDataFormContentKt$Input$inputType$1$1(rememberAddressSearchSheetPresenter);
                            u11.x(C12);
                        }
                        u11.k();
                        dsInputType = new DsInputType.Button((Function0) C12);
                    } else {
                        if (type != BloggerPersonalDataFormVI.View.Input.Type.TEXT) {
                            throw new o();
                        }
                        dsInputType = DsInputType.Default.INSTANCE;
                    }
                    u11.k();
                    String value = bloggerPersonalDataFormInputState.getValue();
                    String placeholder = input.getPlaceholder();
                    String automatizationId = input.getAutomatizationId();
                    u11.o(1920867308);
                    uniResourceIdTestTag = automatizationId == null ? null : UniTestTagsKt.uniResourceIdTestTag(eVar4, automatizationId, u11, (i13 >> 9) & 14);
                    u11.k();
                    if (uniResourceIdTestTag == null) {
                        uniResourceIdTestTag = eVar4;
                    }
                    DsInputStatus dsInputStatus = z12 ? DsInputStatus.ERROR : DsInputStatus.NEUTRAL;
                    C7807Z m11 = z12 ? C7807Z.m(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextNegative()) : null;
                    String error = bloggerPersonalDataFormInputState.getError();
                    u11.o(1920861738);
                    z11 = ((i13 & 14) == 4) | ((i13 & 896) == 256);
                    C11 = u11.C();
                    if (!z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new BloggerPersonalDataFormContentKt$Input$3$1(function2, input);
                        u11.x(C11);
                    }
                    u11.k();
                    c3969l = u11;
                    DsInputBaseKt.m1743DsInputBaseawFkL_c(value, (Function1<? super String, Unit>) C11, uniResourceIdTestTag, (DsInputSize) null, dsInputType, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, placeholder, (DsInputLabelPosition) null, (String) null, error, m11, (UniIconToken) null, (UniIconToken) null, false, false, false, (N0) null, (M0) null, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, 0, 12582912, 0, 536726888);
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    c3969l = u11;
                    eVar3 = eVar2;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new BloggerPersonalDataFormContentKt$Input$4(input, bloggerPersonalDataFormInputState, function2, eVar3, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar;
            if ((i13 & 1171) == 1170) {
            }
            if (i14 != 0) {
            }
            if (bloggerPersonalDataFormInputState2.getError() != null) {
            }
            type = input.getType();
            u11.o(1920849536);
            if (type == BloggerPersonalDataFormVI.View.Input.Type.ADDRESS) {
            }
            u11.k();
            String value2 = bloggerPersonalDataFormInputState.getValue();
            String placeholder2 = input.getPlaceholder();
            String automatizationId2 = input.getAutomatizationId();
            u11.o(1920867308);
            if (automatizationId2 == null) {
            }
            u11.k();
            if (uniResourceIdTestTag == null) {
            }
            if (z12) {
            }
            if (z12) {
            }
            String error2 = bloggerPersonalDataFormInputState.getError();
            u11.o(1920861738);
            if ((i13 & 896) == 256) {
            }
            z11 = ((i13 & 14) == 4) | ((i13 & 896) == 256);
            C11 = u11.C();
            if (!z11) {
            }
            C11 = new BloggerPersonalDataFormContentKt$Input$3$1(function2, input);
            u11.x(C11);
            u11.k();
            c3969l = u11;
            DsInputBaseKt.m1743DsInputBaseawFkL_c(value2, (Function1<? super String, Unit>) C11, uniResourceIdTestTag, (DsInputSize) null, dsInputType, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, placeholder2, (DsInputLabelPosition) null, (String) null, error2, m11, (UniIconToken) null, (UniIconToken) null, false, false, false, (N0) null, (M0) null, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, 0, 12582912, 0, 536726888);
            eVar3 = eVar4;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        bloggerPersonalDataFormInputState2 = bloggerPersonalDataFormInputState;
        if ((i12 & 4) == 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        if (bloggerPersonalDataFormInputState2.getError() != null) {
        }
        type = input.getType();
        u11.o(1920849536);
        if (type == BloggerPersonalDataFormVI.View.Input.Type.ADDRESS) {
        }
        u11.k();
        String value22 = bloggerPersonalDataFormInputState.getValue();
        String placeholder22 = input.getPlaceholder();
        String automatizationId22 = input.getAutomatizationId();
        u11.o(1920867308);
        if (automatizationId22 == null) {
        }
        u11.k();
        if (uniResourceIdTestTag == null) {
        }
        if (z12) {
        }
        if (z12) {
        }
        String error22 = bloggerPersonalDataFormInputState.getError();
        u11.o(1920861738);
        if ((i13 & 896) == 256) {
        }
        z11 = ((i13 & 14) == 4) | ((i13 & 896) == 256);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new BloggerPersonalDataFormContentKt$Input$3$1(function2, input);
        u11.x(C11);
        u11.k();
        c3969l = u11;
        DsInputBaseKt.m1743DsInputBaseawFkL_c(value22, (Function1<? super String, Unit>) C11, uniResourceIdTestTag, (DsInputSize) null, dsInputType, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, placeholder22, (DsInputLabelPosition) null, (String) null, error22, m11, (UniIconToken) null, (UniIconToken) null, false, false, false, (N0) null, (M0) null, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, 0, 12582912, 0, 536726888);
        eVar3 = eVar4;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Separator(BloggerPersonalDataFormVI.View.Separator separator, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e b11;
        C3969l u11 = interfaceC3967k.u(1985637735);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(separator) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e j11 = T.j(a0.f(a0.e(eVar, 1.0f), separator.getHeight()), separator.getLeftPadding() != null ? r0.intValue() : 0, 0.0f, separator.getRightPadding() != null ? r0.intValue() : 0, 0.0f, 10);
            C7807Z c7807z = TokenParserKt.tokenToColor(separator.getTintColor(), u11, 0);
            b11 = androidx.compose.foundation.e.b(j11, c7807z != null ? c7807z.w() : C7807Z.f72258l, y0.a());
            C5185h.a(b11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BloggerPersonalDataFormContentKt$Separator$1(separator, eVar, i11, i12));
        }
    }
}
