package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.view.animation.PathInterpolator;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.erx0;
import xsna.ie00;
import xsna.ksr;
import xsna.lsr;
import xsna.nb9;
import xsna.pen;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.v2s;
import xsna.w2s;
import xsna.wra;
import xsna.wzs;
import xsna.xpx0;
import xsna.yvj;
import xsna.zmp0;

/* compiled from: FoldingFeatureObserver.kt */
@b6l(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ w2s this$0;

    /* compiled from: Collect.kt */
    public static final class a implements lsr<v2s> {
        public final /* synthetic */ w2s b;

        public a(w2s w2sVar) {
            this.b = w2sVar;
        }

        @Override // xsna.lsr
        public final Object emit(v2s v2sVar, spj<? super s3q0> spjVar) {
            s3q0 s3q0Var;
            v2s v2sVar2 = v2sVar;
            SlidingPaneLayout.a aVar = this.b.d;
            if (aVar == null) {
                s3q0Var = null;
            } else {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.w = v2sVar2;
                wra wraVar = new wra();
                wraVar.setDuration(300L);
                wraVar.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                zmp0.a(slidingPaneLayout, wraVar);
                slidingPaneLayout.requestLayout();
                s3q0Var = s3q0.a;
            }
            return s3q0Var == CoroutineSingletons.COROUTINE_SUSPENDED ? s3q0Var : s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldingFeatureObserver$registerLayoutStateChangeCallback$1(w2s w2sVar, Activity activity, spj<? super FoldingFeatureObserver$registerLayoutStateChangeCallback$1> spjVar) {
        super(2, spjVar);
        this.this$0 = w2sVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.this$0, this.$activity, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((FoldingFeatureObserver$registerLayoutStateChangeCallback$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nb9 i2 = rsr.i(new xpx0(this.this$0.a, this.$activity, null));
            bdn bdnVar = bdn.a;
            final ksr q = rsr.q(i2, ie00.a);
            final w2s w2sVar = this.this$0;
            ksr l = rsr.l(new ksr<v2s>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                /* compiled from: Collect.kt */
                /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements lsr<erx0> {
                    public final /* synthetic */ lsr b;
                    public final /* synthetic */ w2s c;

                    @b6l(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", l = {138}, m = "emit")
                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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

                    public AnonymousClass2(lsr lsrVar, w2s w2sVar) {
                        this.b = lsrVar;
                        this.c = w2sVar;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    /* JADX WARN: Type inference failed for: r7v4 */
                    /* JADX WARN: Type inference failed for: r7v5 */
                    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(erx0 erx0Var, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        v2s v2sVar;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    a.a(obj);
                                    this.c.getClass();
                                    Iterator it = erx0Var.a.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            v2sVar = 0;
                                            break;
                                        }
                                        v2sVar = it.next();
                                        if (((pen) v2sVar) instanceof v2s) {
                                            break;
                                        }
                                    }
                                    v2s v2sVar2 = v2sVar instanceof v2s ? v2sVar : null;
                                    if (v2sVar2 != null) {
                                        anonymousClass1.label = 1;
                                        if (this.b.emit(v2sVar2, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
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
                        anonymousClass1 = new AnonymousClass1(spjVar);
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super v2s> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, w2sVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            });
            a aVar = new a(this.this$0);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
