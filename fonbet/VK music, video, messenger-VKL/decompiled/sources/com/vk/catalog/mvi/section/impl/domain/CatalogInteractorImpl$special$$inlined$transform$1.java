package com.vk.catalog.mvi.section.impl.domain;

import com.vk.catalog.mvi.domain.CatalogListenEvent$BlockUpdate;
import com.vk.catalog.mvi.domain.CatalogListenEvent$SectionUpdate;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.axr0;
import xsna.b6l;
import xsna.bwr0;
import xsna.cwr0;
import xsna.cxr0;
import xsna.dyr0;
import xsna.ewr0;
import xsna.fyr0;
import xsna.hwr0;
import xsna.hxr0;
import xsna.ksr;
import xsna.lsr;
import xsna.qwr0;
import xsna.s3q0;
import xsna.spj;
import xsna.wxr0;
import xsna.wzs;
import xsna.y4a;

/* compiled from: Emitters.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.domain.CatalogInteractorImpl$special$$inlined$transform$1", f = "CatalogInteractorImpl.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CatalogInteractorImpl$special$$inlined$transform$1 extends SuspendLambda implements wzs<lsr<? super y4a>, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Emitters.kt */
    /* renamed from: com.vk.catalog.mvi.section.impl.domain.CatalogInteractorImpl$special$$inlined$transform$1$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static final class AnonymousClass1<T> implements lsr {
        public final /* synthetic */ lsr<y4a> b;

        @b6l(c = "com.vk.catalog.mvi.section.impl.domain.CatalogInteractorImpl$special$$inlined$transform$1$1", f = "CatalogInteractorImpl.kt", l = {41, 42, 43, 46, 47, 48, 51, 52, 55, 56, 57, 58, 59, 60, 63}, m = "emit")
        /* renamed from: com.vk.catalog.mvi.section.impl.domain.CatalogInteractorImpl$special$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04761 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public C04761(spj spjVar) {
                super(spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(lsr lsrVar) {
            this.b = lsrVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0164, code lost:
        
            if (r2.emit(r7, r0) != r1) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0130, code lost:
        
            if (r2.emit(r7, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0119, code lost:
        
            if (r2.emit(r7, r0) != r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
        
            if (r2.emit(r7, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
        
            if (r2.emit(r7, r0) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0180, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x019c, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01d3, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0209, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0224, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L85;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            C04761 c04761;
            lsr<y4a> lsrVar;
            int i;
            int i2;
            int i3;
            if (spjVar instanceof C04761) {
                c04761 = (C04761) spjVar;
                int i4 = c04761.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c04761.label = i4 - Integer.MIN_VALUE;
                    Object obj = c04761.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (c04761.label) {
                        case 0:
                            a.a(obj);
                            bwr0 bwr0Var = (bwr0) t;
                            boolean z = bwr0Var instanceof cwr0;
                            lsrVar = this.b;
                            if (z) {
                                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate = CatalogListenEvent$BlockUpdate.VideosAdd;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = lsrVar;
                                c04761.I$0 = 0;
                                c04761.label = 1;
                                if (lsrVar.emit(catalogListenEvent$BlockUpdate, c04761) != coroutineSingletons) {
                                    i3 = 0;
                                    CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate2 = CatalogListenEvent$BlockUpdate.VideosHistoryAdd;
                                    c04761.L$0 = null;
                                    c04761.L$1 = null;
                                    c04761.L$2 = null;
                                    c04761.L$3 = lsrVar;
                                    c04761.I$0 = i3;
                                    c04761.label = 2;
                                    break;
                                }
                            } else if (bwr0Var instanceof wxr0) {
                                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate3 = CatalogListenEvent$BlockUpdate.VideosRemove;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = lsrVar;
                                c04761.I$0 = 0;
                                c04761.label = 4;
                                if (lsrVar.emit(catalogListenEvent$BlockUpdate3, c04761) != coroutineSingletons) {
                                    i2 = 0;
                                    CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate4 = CatalogListenEvent$BlockUpdate.VideosHistoryRemove;
                                    c04761.L$0 = null;
                                    c04761.L$1 = null;
                                    c04761.L$2 = null;
                                    c04761.L$3 = lsrVar;
                                    c04761.I$0 = i2;
                                    c04761.label = 5;
                                    break;
                                }
                            } else if (bwr0Var instanceof fyr0) {
                                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate5 = CatalogListenEvent$BlockUpdate.VideosUpdate;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = lsrVar;
                                c04761.I$0 = 0;
                                c04761.label = 7;
                                if (lsrVar.emit(catalogListenEvent$BlockUpdate5, c04761) != coroutineSingletons) {
                                    i = 0;
                                    CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate = CatalogListenEvent$SectionUpdate.VideosUpdate;
                                    c04761.L$0 = null;
                                    c04761.L$1 = null;
                                    c04761.L$2 = null;
                                    c04761.L$3 = null;
                                    c04761.I$0 = i;
                                    c04761.label = 8;
                                    break;
                                }
                            } else if (bwr0Var instanceof ewr0) {
                                CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate2 = CatalogListenEvent$SectionUpdate.AlbumsAdd;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = null;
                                c04761.I$0 = 0;
                                c04761.label = 9;
                                break;
                            } else if (bwr0Var instanceof hwr0) {
                                CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate3 = CatalogListenEvent$SectionUpdate.AlbumsRemove;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = null;
                                c04761.I$0 = 0;
                                c04761.label = 10;
                                break;
                            } else if (bwr0Var instanceof hxr0) {
                                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate6 = CatalogListenEvent$BlockUpdate.VideosLike;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = null;
                                c04761.I$0 = 0;
                                c04761.label = 11;
                                break;
                            } else if (bwr0Var instanceof dyr0) {
                                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate7 = CatalogListenEvent$BlockUpdate.VideosUnlike;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = null;
                                c04761.I$0 = 0;
                                c04761.label = 12;
                                break;
                            } else if (bwr0Var instanceof axr0) {
                                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate8 = CatalogListenEvent$BlockUpdate.VideosBookmarksAdd;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = null;
                                c04761.I$0 = 0;
                                c04761.label = 13;
                                break;
                            } else {
                                if (!(bwr0Var instanceof cxr0)) {
                                    if (bwr0Var instanceof qwr0) {
                                        CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate4 = CatalogListenEvent$SectionUpdate.ClipDraftsAdd;
                                        c04761.L$0 = null;
                                        c04761.L$1 = null;
                                        c04761.L$2 = null;
                                        c04761.L$3 = null;
                                        c04761.I$0 = 0;
                                        c04761.label = 15;
                                        break;
                                    }
                                    return s3q0.a;
                                }
                                CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate9 = CatalogListenEvent$BlockUpdate.VideosBookmarksRemove;
                                c04761.L$0 = null;
                                c04761.L$1 = null;
                                c04761.L$2 = null;
                                c04761.L$3 = null;
                                c04761.I$0 = 0;
                                c04761.label = 14;
                                break;
                            }
                            return coroutineSingletons;
                        case 1:
                            i3 = c04761.I$0;
                            lsrVar = (lsr) c04761.L$3;
                            a.a(obj);
                            CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate22 = CatalogListenEvent$BlockUpdate.VideosHistoryAdd;
                            c04761.L$0 = null;
                            c04761.L$1 = null;
                            c04761.L$2 = null;
                            c04761.L$3 = lsrVar;
                            c04761.I$0 = i3;
                            c04761.label = 2;
                            break;
                        case 2:
                            i3 = c04761.I$0;
                            lsrVar = (lsr) c04761.L$3;
                            a.a(obj);
                            CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate5 = CatalogListenEvent$SectionUpdate.VideosAdd;
                            c04761.L$0 = null;
                            c04761.L$1 = null;
                            c04761.L$2 = null;
                            c04761.L$3 = null;
                            c04761.I$0 = i3;
                            c04761.label = 3;
                            break;
                        case 3:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            a.a(obj);
                            return s3q0.a;
                        case 4:
                            i2 = c04761.I$0;
                            lsrVar = (lsr) c04761.L$3;
                            a.a(obj);
                            CatalogListenEvent$BlockUpdate catalogListenEvent$BlockUpdate42 = CatalogListenEvent$BlockUpdate.VideosHistoryRemove;
                            c04761.L$0 = null;
                            c04761.L$1 = null;
                            c04761.L$2 = null;
                            c04761.L$3 = lsrVar;
                            c04761.I$0 = i2;
                            c04761.label = 5;
                            break;
                        case 5:
                            i2 = c04761.I$0;
                            lsrVar = (lsr) c04761.L$3;
                            a.a(obj);
                            CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate6 = CatalogListenEvent$SectionUpdate.VideosRemove;
                            c04761.L$0 = null;
                            c04761.L$1 = null;
                            c04761.L$2 = null;
                            c04761.L$3 = null;
                            c04761.I$0 = i2;
                            c04761.label = 6;
                            break;
                        case 7:
                            i = c04761.I$0;
                            lsrVar = (lsr) c04761.L$3;
                            a.a(obj);
                            CatalogListenEvent$SectionUpdate catalogListenEvent$SectionUpdate7 = CatalogListenEvent$SectionUpdate.VideosUpdate;
                            c04761.L$0 = null;
                            c04761.L$1 = null;
                            c04761.L$2 = null;
                            c04761.L$3 = null;
                            c04761.I$0 = i;
                            c04761.label = 8;
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            c04761 = new C04761(spjVar);
            Object obj2 = c04761.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (c04761.label) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogInteractorImpl$special$$inlined$transform$1(ksr ksrVar, spj spjVar) {
        super(2, spjVar);
        this.$this_transform = ksrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        CatalogInteractorImpl$special$$inlined$transform$1 catalogInteractorImpl$special$$inlined$transform$1 = new CatalogInteractorImpl$special$$inlined$transform$1(this.$this_transform, spjVar);
        catalogInteractorImpl$special$$inlined$transform$1.L$0 = obj;
        return catalogInteractorImpl$special$$inlined$transform$1;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super y4a> lsrVar, spj<? super s3q0> spjVar) {
        return ((CatalogInteractorImpl$special$$inlined$transform$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            ksr ksrVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lsrVar);
            this.L$0 = null;
            this.label = 1;
            if (ksrVar.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return s3q0.a;
    }
}
