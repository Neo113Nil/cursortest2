package com.vk.ecomm.onlinebooking.impl.calendar.ui;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.reefton.protocol.ReefProtocol$Event;
import java.util.Iterator;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fh9;
import xsna.gzs;
import xsna.izg0;
import xsna.ksr;
import xsna.lsr;
import xsna.mtk0;
import xsna.nr2;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wow;
import xsna.wzs;
import xsna.xvy;
import xsna.yvj;

/* compiled from: BookingCalendarDayBlockView.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1", f = "BookingCalendarDayBlockView.kt", l = {ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE, 84}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<wow<BookingCalendarScreenState.DaySelector.a>> $days;
    final /* synthetic */ xvy $listState;
    int I$0;
    Object L$0;
    int label;

    /* compiled from: BookingCalendarDayBlockView.kt */
    public static final class a implements gzs<wow<BookingCalendarScreenState.DaySelector.a>> {
        public final /* synthetic */ mtk0<wow<BookingCalendarScreenState.DaySelector.a>> b;

        public a(mtk0<wow<BookingCalendarScreenState.DaySelector.a>> mtk0Var) {
            this.b = mtk0Var;
        }

        @Override // xsna.gzs
        public final wow<BookingCalendarScreenState.DaySelector.a> invoke() {
            return new wow<>(this.b.getValue().b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1(xvy xvyVar, mtk0<wow<BookingCalendarScreenState.DaySelector.a>> mtk0Var, spj<? super BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1> spjVar) {
        super(2, spjVar);
        this.$listState = xvyVar;
        this.$days = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1(this.$listState, this.$days, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r7.k(r3, 0, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r7 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final izg0 M = nr2.M(new a(this.$days));
            ksr<wow<BookingCalendarScreenState.DaySelector.a>> ksrVar = new ksr<wow<BookingCalendarScreenState.DaySelector.a>>() { // from class: com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    @b6l(c = "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1$invokeSuspend$$inlined$filter$1$2", f = "BookingCalendarDayBlockView.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt$BookingCalendarDaySelectorView$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(spj spjVar) {
                            super(spjVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(lsr lsrVar) {
                        this.b = lsrVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    a.a(obj2);
                                    if (!((wow) obj).b.isEmpty()) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a.a(obj2);
                                }
                                return s3q0.a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(spjVar);
                        Object obj22 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super wow<BookingCalendarScreenState.DaySelector.a>> lsrVar, spj spjVar) {
                    Object collect = izg0.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            };
            this.label = 1;
            obj = rsr.n(ksrVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        Iterator it = ((wow) obj).b.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((BookingCalendarScreenState.DaySelector.a) it.next()).d == BookingCalendarScreenState.DaySelector.DayType.Selected) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            xvy xvyVar = this.$listState;
            this.L$0 = null;
            this.I$0 = i2;
            this.label = 2;
            fh9 fh9Var = xvy.y;
        }
        return s3q0.a;
    }
}
