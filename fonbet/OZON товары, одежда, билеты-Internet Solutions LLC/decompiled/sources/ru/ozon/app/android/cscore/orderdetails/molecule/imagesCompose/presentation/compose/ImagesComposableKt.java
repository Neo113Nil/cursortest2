package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import D1.InterfaceC2801g;
import Fr.g;
import Ge.n;
import I1.o;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import Sc.s;
import Wc.a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImagesVO;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import t0.p;
import t0.q;
import u0.E;
import v0.C10164d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImagesVO;", "item", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "horizontalPadding", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImageVO;", "adultListDelegate", "", "maxCount", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "ImagesComposable", "(Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImagesVO;Lru/ozon/app/android/cscore/padding/HorizontalPadding;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;ILkotlin/jvm/functions/Function1;LS0/k;I)V", "", "cropWithCounter", "(Ljava/util/List;I)Ljava/util/List;", "Lkotlin/text/Regex;", "counterRegex", "Lkotlin/text/Regex;", "images", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImagesComposableKt {

    @NotNull
    private static final Regex counterRegex = new Regex("\\d+");

    public static final void ImagesComposable(@NotNull ComposableImagesVO item, @NotNull HorizontalPadding horizontalPadding, @NotNull AdultListDelegate<ComposableImageVO> adultListDelegate, final int i11, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1968056146);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(horizontalPadding) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(adultListDelegate) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.r(i11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 24576) == 0) {
            i13 |= u11.F(actionHandler) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            u11.o(202029954);
            int i14 = i13 & 7168;
            boolean n11 = u11.n(adultListDelegate) | (i14 == 2048);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                final InterfaceC2395h a11 = n.a(adultListDelegate.observeItems());
                C11 = new InterfaceC2395h<List<? extends ComposableImageVO>>() { // from class: ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose.ImagesComposableKt$ImagesComposable$lambda$1$$inlined$map$1

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose.ImagesComposableKt$ImagesComposable$lambda$1$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC2397i {
                        final /* synthetic */ int $maxCount$inlined;
                        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @e(c = "ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose.ImagesComposableKt$ImagesComposable$lambda$1$$inlined$map$1$2", f = "ImagesComposable.kt", l = {50}, m = "emit")
                        /* renamed from: ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose.ImagesComposableKt$ImagesComposable$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends c {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= LinearLayoutManager.INVALID_OFFSET;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2397i interfaceC2397i, int i11) {
                            this.$this_unsafeFlow = interfaceC2397i;
                            this.$maxCount$inlined = i11;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                        @Override // Ae.InterfaceC2397i
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, d dVar) {
                            AnonymousClass1 anonymousClass1;
                            int i11;
                            List cropWithCounter;
                            if (dVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) dVar;
                                int i12 = anonymousClass1.label;
                                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                    anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                    Object obj2 = anonymousClass1.result;
                                    a aVar = a.COROUTINE_SUSPENDED;
                                    i11 = anonymousClass1.label;
                                    if (i11 != 0) {
                                        s.b(obj2);
                                        InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                        List list = (List) obj;
                                        Intrinsics.f(list);
                                        cropWithCounter = ImagesComposableKt.cropWithCounter(list, this.$maxCount$inlined);
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(cropWithCounter, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
                                    } else {
                                        if (i11 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        s.b(obj2);
                                    }
                                    return Unit.f71690a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(dVar);
                            Object obj22 = anonymousClass1.result;
                            a aVar2 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                            }
                            return Unit.f71690a;
                        }
                    }

                    @Override // Ae.InterfaceC2395h
                    public Object collect(InterfaceC2397i<? super List<? extends ComposableImageVO>> interfaceC2397i, d dVar) {
                        Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, i11), dVar);
                        return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                    }
                };
                u11.x(C11);
            }
            InterfaceC2395h interfaceC2395h = (InterfaceC2395h) C11;
            u11.k();
            Object images = item.getImages();
            u11.o(202035874);
            boolean n12 = u11.n(images) | (i14 == 2048);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = cropWithCounter(item.getImages(), i11);
                u11.x(C12);
            }
            u11.k();
            InterfaceC3978p0 a12 = C6285b.a(interfaceC2395h, (List) C12, u11, 0);
            u11.o(202041528);
            int i15 = i13 & 57344;
            boolean F11 = u11.F(item) | (i15 == 16384);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ImagesComposableKt$ImagesComposable$onBlockClick$1$1(item, actionHandler);
                u11.x(C13);
            }
            Function0 function0 = (Function0) C13;
            u11.k();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            u11.o(202049792);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = p.a();
                u11.x(C14);
            }
            u11.k();
            androidx.compose.ui.e j11 = T.j(i.b(e11, (q) C14, null, false, null, null, function0, 28), horizontalPadding.getLeft().m1867getDpD9Ej5fM(), 12, horizontalPadding.getRight().m1867getDpD9Ej5fM(), 0.0f, 8);
            u11.o(202059160);
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = ImagesComposableKt$ImagesComposable$2$1.INSTANCE;
                u11.x(C15);
            }
            u11.k();
            androidx.compose.ui.e a13 = Q1.a(o.c(j11, false, (Function1) C15), "product-image");
            C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, a13);
            Function0 a15 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a14, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO title = item.getTitle();
            u11.o(284970686);
            if (title != null) {
                DsTextAtomKt.DsTextAtom(title, null, u11, 0, 2);
                E.a(u11, a0.f(aVar, 8));
            }
            u11.k();
            androidx.compose.ui.e e12 = a0.e(aVar, 1.0f);
            C5179b.i n13 = C5179b.n(6);
            u11.o(284979114);
            boolean n14 = u11.n(a12) | (i15 == 16384);
            Object C16 = u11.C();
            if (n14 || C16 == InterfaceC3967k.a.a()) {
                C16 = new ImagesComposableKt$ImagesComposable$3$2$1(a12, actionHandler);
                u11.x(C16);
            }
            u11.k();
            C10164d.b(e12, null, null, n13, null, null, false, (Function1) C16, u11, 24582, 238);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ImagesComposableKt$ImagesComposable$4(item, horizontalPadding, adultListDelegate, i11, actionHandler, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ComposableImageVO> ImagesComposable$lambda$3(A1<? extends List<ComposableImageVO>> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ComposableImageVO> cropWithCounter(List<ComposableImageVO> list, int i11) {
        TextDTO textDTO;
        String value;
        List K02 = C7714v.K0(list, i11);
        ArrayList arrayList = new ArrayList(C7714v.z(K02, 10));
        int i12 = 0;
        for (Object obj : K02) {
            int i13 = i12 + 1;
            Integer num = null;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            ComposableImageVO composableImageVO = (ComposableImageVO) obj;
            if (i12 == i11 - 1 && i11 != list.size()) {
                int size = list.size() - i11;
                TextDTO counter = list.get(C7714v.P(list)).getCounter();
                if (counter != null) {
                    MatchResult b11 = counterRegex.b(0, counter.getText());
                    if (b11 != null && (value = b11.getValue()) != null) {
                        num = Integer.valueOf(Integer.parseInt(value));
                    }
                    if (num != null) {
                        size += num.intValue();
                    }
                    textDTO = TextDTO.copy$default(counter, OzonSpannableStringKt.toOzonSpannableString("+" + size), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
                } else {
                    textDTO = new TextDTO(OzonSpannableStringKt.toOzonSpannableString("+" + size), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_ACCENT_500_MEDIUM.getToken(), UniColors.TEXT_LIGHT_KEY.getToken(), null, null, null, null, false, null, null, null, null, null, 523838, null);
                }
                composableImageVO = ComposableImageVO.copy$default(composableImageVO, null, null, textDTO, false, false, false, null, null, null, null, null, null, 4091, null);
            }
            arrayList.add(composableImageVO);
            i12 = i13;
        }
        return arrayList;
    }
}
