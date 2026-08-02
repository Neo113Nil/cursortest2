package com.vk.push.core.analytics;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.b6l;
import xsna.bdn;
import xsna.drm0;
import xsna.myc0;
import xsna.nm8;
import xsna.o0b;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.v46;
import xsna.w0b;
import xsna.w46;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: BaseAnalyticsSender.kt */
/* loaded from: classes.dex */
public abstract class BaseAnalyticsSender implements AnalyticsSender {
    public final FeatureManager a;
    public final AnalyticsTimingsStore b;
    public final Logger c;
    public final nm8 d;

    /* compiled from: BaseAnalyticsSender.kt */
    @b6l(c = "com.vk.push.core.analytics.BaseAnalyticsSender$1", f = "BaseAnalyticsSender.kt", l = {34, 35}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return BaseAnalyticsSender.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
        
            if (com.vk.push.core.analytics.BaseAnalyticsSender.access$handleEvent(r4, r7, r6) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0058 -> B:6:0x0013). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o0b it;
            o0b o0bVar;
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                it = BaseAnalyticsSender.this.d.iterator();
                this.L$0 = it;
                this.label = 1;
                a = it.a(this);
                if (a != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0bVar = (o0b) this.L$0;
                kotlin.a.a(obj);
                it = o0bVar;
                this.L$0 = it;
                this.label = 1;
                a = it.a(this);
                if (a != coroutineSingletons) {
                    o0bVar = it;
                    obj = a;
                    if (((Boolean) obj).booleanValue()) {
                        return s3q0.a;
                    }
                    BaseAnalyticsEvent baseAnalyticsEvent = (BaseAnalyticsEvent) o0bVar.next();
                    BaseAnalyticsSender baseAnalyticsSender = BaseAnalyticsSender.this;
                    this.L$0 = o0bVar;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            o0bVar = (o0b) this.L$0;
            kotlin.a.a(obj);
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    /* compiled from: BaseAnalyticsSender.kt */
    @b6l(c = "com.vk.push.core.analytics.BaseAnalyticsSender", f = "BaseAnalyticsSender.kt", l = {71}, m = "shouldSendEvent")
    public static final class b extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseAnalyticsSender.this.a(null, this);
        }
    }

    public BaseAnalyticsSender(FeatureManager featureManager, AnalyticsTimingsStore analyticsTimingsStore, Logger logger, yvj yvjVar) {
        this.a = featureManager;
        this.b = analyticsTimingsStore;
        this.c = logger;
        this.d = w0b.a(-2, BufferOverflow.SUSPEND, null, 4);
        myc0.h(yvjVar, null, null, new a(null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (r2.sendImpl(r8, r7, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r9 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleEvent(BaseAnalyticsSender baseAnalyticsSender, BaseAnalyticsEvent baseAnalyticsEvent, spj spjVar) {
        com.vk.push.core.analytics.a aVar;
        Object obj;
        int i;
        BaseAnalyticsSender baseAnalyticsSender2;
        Map map;
        baseAnalyticsSender.getClass();
        if (spjVar instanceof com.vk.push.core.analytics.a) {
            aVar = (com.vk.push.core.analytics.a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar.L$0 = baseAnalyticsSender;
                    aVar.L$1 = baseAnalyticsEvent;
                    aVar.label = 1;
                    obj = baseAnalyticsSender.a(baseAnalyticsEvent, aVar);
                } else if (i == 1) {
                    baseAnalyticsEvent = (BaseAnalyticsEvent) aVar.L$1;
                    baseAnalyticsSender = (BaseAnalyticsSender) aVar.L$0;
                    kotlin.a.a(obj);
                } else if (i == 2) {
                    BaseAnalyticsEvent baseAnalyticsEvent2 = (BaseAnalyticsEvent) aVar.L$1;
                    BaseAnalyticsSender baseAnalyticsSender3 = (BaseAnalyticsSender) aVar.L$0;
                    kotlin.a.a(obj);
                    baseAnalyticsSender2 = baseAnalyticsSender3;
                    baseAnalyticsEvent = baseAnalyticsEvent2;
                    map = (Map) obj;
                    aVar.L$0 = baseAnalyticsSender2;
                    aVar.L$1 = baseAnalyticsEvent;
                    aVar.L$2 = map;
                    aVar.label = 3;
                    obj = baseAnalyticsEvent.getParams(aVar);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    map = (Map) aVar.L$2;
                    baseAnalyticsEvent = (BaseAnalyticsEvent) aVar.L$1;
                    baseAnalyticsSender2 = (BaseAnalyticsSender) aVar.L$0;
                    kotlin.a.a(obj);
                    LinkedHashMap n = pn00.n(map, (Map) obj);
                    new w46(baseAnalyticsEvent, n);
                    baseAnalyticsSender2.getClass();
                    aVar.L$0 = null;
                    aVar.L$1 = null;
                    aVar.L$2 = null;
                    aVar.label = 4;
                }
                if (((Boolean) obj).booleanValue()) {
                    new v46(baseAnalyticsEvent);
                    baseAnalyticsSender.getClass();
                    return s3q0.a;
                }
                aVar.L$0 = baseAnalyticsSender;
                aVar.L$1 = baseAnalyticsEvent;
                aVar.label = 2;
                obj = baseAnalyticsSender.getBaseParams(aVar);
                if (obj != coroutineSingletons) {
                    baseAnalyticsSender2 = baseAnalyticsSender;
                    map = (Map) obj;
                    aVar.L$0 = baseAnalyticsSender2;
                    aVar.L$1 = baseAnalyticsEvent;
                    aVar.L$2 = map;
                    aVar.label = 3;
                    obj = baseAnalyticsEvent.getParams(aVar);
                }
                return coroutineSingletons;
            }
        }
        aVar = new com.vk.push.core.analytics.a(baseAnalyticsSender, spjVar);
        obj = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BaseAnalyticsEvent baseAnalyticsEvent, spj<? super Boolean> spjVar) {
        b bVar;
        int i;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Feature.StringFeature analyticsEventsBlackList = CommonFeaturesKt.getAnalyticsEventsBlackList();
                    bVar.L$0 = baseAnalyticsEvent;
                    bVar.label = 1;
                    obj = this.a.getFeatureValue(analyticsEventsBlackList, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    baseAnalyticsEvent = (BaseAnalyticsEvent) bVar.L$0;
                    kotlin.a.a(obj);
                }
                return Boolean.valueOf(!drm0.c0((CharSequence) obj, new String[]{StringUtils.COMMA}, 0, 6).contains(baseAnalyticsEvent.getEventName()));
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!drm0.c0((CharSequence) obj2, new String[]{StringUtils.COMMA}, 0, 6).contains(baseAnalyticsEvent.getEventName()));
    }

    public abstract Object getBaseParams(spj<? super Map<String, String>> spjVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.push.common.analytics.AnalyticsSender
    public void send(BaseAnalyticsEvent baseAnalyticsEvent) {
        this.b.storeTiming((Class<? extends BaseAnalyticsEvent>) baseAnalyticsEvent.getClass());
        this.d.f(baseAnalyticsEvent);
    }

    public abstract Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map<String, String> map, spj<? super s3q0> spjVar);

    public /* synthetic */ BaseAnalyticsSender(FeatureManager featureManager, AnalyticsTimingsStore analyticsTimingsStore, Logger logger, yvj yvjVar, int i, zcl zclVar) {
        this(featureManager, analyticsTimingsStore, logger, (i & 8) != 0 ? zvj.a(CoroutineExtensionsKt.getSingleThread(bdn.a)) : yvjVar);
    }
}
