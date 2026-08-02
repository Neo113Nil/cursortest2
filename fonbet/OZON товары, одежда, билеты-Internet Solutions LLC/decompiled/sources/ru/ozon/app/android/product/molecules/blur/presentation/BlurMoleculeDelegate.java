package ru.ozon.app.android.product.molecules.blur.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.s;
import Ge.n;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "view", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "vo", "Lkotlin/Function0;", "", "onClick", "bind", "(Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;Lkotlin/jvm/functions/Function0;)V", "moleculeVO", "subscribe", "(Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;)V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "()V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lxe/M;", "scope", "Lxe/M;", "moleculeView", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "onAdultConfirmed", "Lkotlin/jvm/functions/Function0;", "getOnAdultConfirmed", "()Lkotlin/jvm/functions/Function0;", "setOnAdultConfirmed", "(Lkotlin/jvm/functions/Function0;)V", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlurMoleculeDelegate {

    @NotNull
    private final AdultHandler adultHandler;
    private BlurMoleculeView moleculeView;
    private Function0<Unit> onAdultConfirmed;

    @NotNull
    private final M scope;

    public BlurMoleculeDelegate(@NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.adultHandler = adultHandler;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11).plus(new BlurMoleculeDelegate$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(BlurMoleculeDelegate blurMoleculeDelegate, BlurMoleculeView blurMoleculeView, BlurMoleculeVO blurMoleculeVO, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        blurMoleculeDelegate.bind(blurMoleculeView, blurMoleculeVO, function0);
    }

    public final void bind(@NotNull BlurMoleculeView view, BlurMoleculeVO vo, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.moleculeView = view;
        if (vo == null || (vo.getIsAdult() && this.adultHandler.isUserAnAdult())) {
            view.setVisibility(8);
        } else {
            view.bind(vo, onClick);
        }
    }

    public final Function0<Unit> getOnAdultConfirmed() {
        return this.onAdultConfirmed;
    }

    public final void setOnAdultConfirmed(Function0<Unit> function0) {
        this.onAdultConfirmed = function0;
    }

    public final void subscribe(@NotNull final BlurMoleculeVO moleculeVO) {
        Intrinsics.checkNotNullParameter(moleculeVO, "moleculeVO");
        final InterfaceC2395h a11 = n.a(this.adultHandler.observeUserAdultState());
        C2399j.C(new C2408n0(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate$subscribe$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate$subscribe$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ BlurMoleculeVO $moleculeVO$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate$subscribe$$inlined$filter$1$2", f = "BlurMoleculeDelegate.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate$subscribe$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, BlurMoleculeVO blurMoleculeVO) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$moleculeVO$inlined = blurMoleculeVO;
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
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (this.$moleculeVO$inlined.getIsAdult()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
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
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, moleculeVO), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new BlurMoleculeDelegate$subscribe$2(this, null)), this.scope);
    }

    public final void unsubscribe() {
        this.moleculeView = null;
        E0.d(this.scope.getCoroutineContext());
    }
}
