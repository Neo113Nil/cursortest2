package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View;
import we0.EnumC10550f;
import we0.h;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$1", f = "HotelsMapInfoV4Wrapper.kt", l = {183}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$observeActions$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ HotelsMapInfoV4View $this_run;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$observeActions$2$1(HotelsMapInfoV4View hotelsMapInfoV4View, HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, d<? super HotelsMapInfoV4Wrapper$observeActions$2$1> dVar) {
        super(2, dVar);
        this.$this_run = hotelsMapInfoV4View;
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4Wrapper$observeActions$2$1 hotelsMapInfoV4Wrapper$observeActions$2$1 = new HotelsMapInfoV4Wrapper$observeActions$2$1(this.$this_run, this.this$0, dVar);
        hotelsMapInfoV4Wrapper$observeActions$2$1.L$0 = obj;
        return hotelsMapInfoV4Wrapper$observeActions$2$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Throwable th2;
        Object a11;
        Throwable b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                final HotelsMapInfoV4View hotelsMapInfoV4View = this.$this_run;
                final HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper = this.this$0;
                try {
                    r.Companion companion = r.INSTANCE;
                    final C0 e11 = hotelsMapInfoV4View.getController().g().e();
                    InterfaceC2395h l11 = C2399j.l(new InterfaceC2395h<h>() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$1$invokeSuspend$lambda$1$$inlined$filter$1

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$1$invokeSuspend$lambda$1$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC2397i {
                            final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$1$invokeSuspend$lambda$1$$inlined$filter$1$2", f = "HotelsMapInfoV4Wrapper.kt", l = {50}, m = "emit")
                            /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$1$invokeSuspend$lambda$1$$inlined$filter$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                                this.$this_unsafeFlow = interfaceC2397i;
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
                                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                        i11 = anonymousClass1.label;
                                        if (i11 != 0) {
                                            s.b(obj2);
                                            InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                            h hVar = (h) obj;
                                            if (hVar.c() && hVar.b() != EnumC10550f.APPLICATION) {
                                                anonymousClass1.label = 1;
                                                if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                                    return aVar;
                                                }
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
                                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                }
                                return Unit.f71690a;
                            }
                        }

                        @Override // Ae.InterfaceC2395h
                        public Object collect(InterfaceC2397i<? super h> interfaceC2397i, d dVar) {
                            Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                        }
                    }, 400L);
                    InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$1$1$2
                        @Override // Ae.InterfaceC2397i
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                            return emit((h) obj2, (d<? super Unit>) dVar);
                        }

                        public final Object emit(h hVar, d<? super Unit> dVar) {
                            HotelsMapInfoV4Wrapper.this.viewModel.onEvent(new MapEvent.OnMoveMap(hVar.a().e(), MapExtKt.getVisibleArea(hotelsMapInfoV4View.getController()), MapExtKt.getPosition(hotelsMapInfoV4View.getController()).c(), HotelsMapInfoV4Wrapper.this.getCurrentPinIdsOnMapExceptDistrictLabels(), HotelsMapInfoV4Wrapper.this.getCurrentPolygonsIdsOnMap()));
                            return Unit.f71690a;
                        }
                    };
                    this.L$0 = m12;
                    this.label = 1;
                    if (l11.collect(interfaceC2397i, this) == aVar) {
                        return aVar;
                    }
                    m11 = m12;
                } catch (Throwable th3) {
                    m11 = m12;
                    th2 = th3;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = (M) this.L$0;
                try {
                    s.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    r.Companion companion22 = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            }
            a11 = Unit.f71690a;
            r.Companion companion3 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 != null) {
                ThrowableExtKt.log(b11, m11.getClass().getSimpleName().concat("_positionUpdateFlow"));
            }
            return Unit.f71690a;
        } catch (CancellationException e12) {
            throw e12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4Wrapper$observeActions$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
