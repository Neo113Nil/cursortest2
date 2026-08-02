package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import Sc.s;
import Wc.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import r0.C9115P;
import r0.C9140t;
import x1.C10638m;
import x1.EnumC10640o;
import x1.F;
import x1.InterfaceC10628c;
import x1.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1", f = "PlacementSliderAutoScrollEffect.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $onTouchInProgressChanged;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/c;", "", "<anonymous>", "(Lx1/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1$1", f = "PlacementSliderAutoScrollEffect.kt", l = {84, 88}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends i implements Function2<InterfaceC10628c, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $onTouchInProgressChanged;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Boolean, Unit> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onTouchInProgressChanged = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onTouchInProgressChanged, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        
            if (r5 != r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004c -> B:8:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC10628c interfaceC10628c;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    interfaceC10628c = (InterfaceC10628c) this.L$0;
                    this.L$0 = interfaceC10628c;
                    this.label = 1;
                    if (C9115P.d(interfaceC10628c, null, this, 2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC10628c = (InterfaceC10628c) this.L$0;
                        s.b(obj);
                        List<x> b11 = ((C10638m) obj).b();
                        if (!(b11 instanceof Collection) || !b11.isEmpty()) {
                            Iterator<T> it = b11.iterator();
                            while (it.hasNext()) {
                                if (((x) it.next()).g()) {
                                    this.L$0 = interfaceC10628c;
                                    this.label = 2;
                                    obj = interfaceC10628c.i0(EnumC10640o.Main, this);
                                }
                            }
                        }
                        this.$onTouchInProgressChanged.invoke(Boolean.FALSE);
                        return Unit.f71690a;
                    }
                    interfaceC10628c = (InterfaceC10628c) this.L$0;
                    s.b(obj);
                }
                this.$onTouchInProgressChanged.invoke(Boolean.TRUE);
                this.L$0 = interfaceC10628c;
                this.label = 2;
                obj = interfaceC10628c.i0(EnumC10640o.Main, this);
            } catch (Throwable th2) {
                this.$onTouchInProgressChanged.invoke(Boolean.FALSE);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1(Function1<? super Boolean, Unit> function1, d<? super PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1> dVar) {
        super(2, dVar);
        this.$onTouchInProgressChanged = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1 placementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1 = new PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1(this.$onTouchInProgressChanged, dVar);
        placementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1.L$0 = obj;
        return placementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f7 = (F) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onTouchInProgressChanged, null);
            this.label = 1;
            if (C9140t.b(f7, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((PlacementSliderAutoScrollEffectKt$pausePlacementSliderAutoScrollOnTouch$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
