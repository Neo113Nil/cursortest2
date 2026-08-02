package com.vk.push.core.feature;

import android.content.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.push.common.EmptyLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.Omicron;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import com.vk.push.core.remote.config.omicron.ParseException;
import com.vk.push.core.remote.config.omicron.segment.SegmentsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.api.json.JsonToken;
import xsna.arm0;
import xsna.b6l;
import xsna.bdn;
import xsna.drm0;
import xsna.go9;
import xsna.izs;
import xsna.j5g;
import xsna.lhg;
import xsna.ms9;
import xsna.myc0;
import xsna.quq;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yok0;
import xsna.yvj;
import xsna.zcl;
import xsna.zvj;

/* compiled from: FeatureManagerImpl.kt */
/* loaded from: classes.dex */
public final class FeatureManagerImpl implements FeatureManager {

    @Deprecated
    public static final String APP_ID_DEV = "rustore_push_service_test";

    @Deprecated
    public static final String APP_ID_RELEASE = "rustore_push_service";

    @Deprecated
    public static final String UPDATE_INTERVAL_FILE_NAME = "omicron_update_interval.txt";
    public static final b j = new b();
    public final Context a;
    public final HttpClient b;
    public final CrashReporterRepository c;
    public final IssueKeyBlackListRepository d;
    public final DeviceIdRepository e;
    public final Logger f;
    public final FileDataSource g;
    public final yvj h;
    public volatile yok0 i;

    /* compiled from: FeatureManagerImpl.kt */
    @b6l(c = "com.vk.push.core.feature.FeatureManagerImpl$1", f = "FeatureManagerImpl.kt", l = {55}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* compiled from: FeatureManagerImpl.kt */
        @b6l(c = "com.vk.push.core.feature.FeatureManagerImpl$1$1", f = "FeatureManagerImpl.kt", l = {66, 67}, m = "invokeSuspend")
        /* renamed from: com.vk.push.core.feature.FeatureManagerImpl$a$a, reason: collision with other inner class name */
        public static final class C1731a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ FeatureManagerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1731a(FeatureManagerImpl featureManagerImpl, spj<? super C1731a> spjVar) {
                super(2, spjVar);
                this.this$0 = featureManagerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C1731a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C1731a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (com.vk.push.core.feature.FeatureManagerImpl.access$saveIssueKeysBlacklist(r5, r4) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
            
                if (com.vk.push.core.feature.FeatureManagerImpl.m98access$saveUpdateIntervalIoAF18A(r5, r4) == r0) goto L15;
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
                    FeatureManagerImpl featureManagerImpl = this.this$0;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                    ((Result) obj).getClass();
                }
                FeatureManagerImpl featureManagerImpl2 = this.this$0;
                this.label = 2;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return FeatureManagerImpl.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            OmicronConfig.Builder builder;
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.a.a(obj);
                Triple triple = new Triple(OmicronEnvironment.RELEASE, FeatureManagerImpl.APP_ID_RELEASE, new EmptyLogger());
                OmicronEnvironment omicronEnvironment = (OmicronEnvironment) triple.d();
                String str = (String) triple.g();
                Logger logger = (Logger) triple.h();
                OmicronConfig.Builder appId = OmicronConfig.newBuilder().environment(omicronEnvironment).appId(str);
                FeatureManagerImpl featureManagerImpl = FeatureManagerImpl.this;
                OmicronConfig.Builder useDefaultRequestExecutor = appId.analyticsHandler(FeatureManagerImpl.access$provideAnalyticsHandler(featureManagerImpl, logger, featureManagerImpl.c)).useDefaultRequestExecutor(FeatureManagerImpl.this.b);
                bVar = FeatureManagerImpl.j;
                FeatureManagerImpl featureManagerImpl2 = FeatureManagerImpl.this;
                this.L$0 = useDefaultRequestExecutor;
                this.L$1 = bVar;
                this.I$0 = 0;
                this.label = 1;
                Object access$getFileUpdateInterval = FeatureManagerImpl.access$getFileUpdateInterval(featureManagerImpl2, this);
                if (access$getFileUpdateInterval == coroutineSingletons) {
                    return coroutineSingletons;
                }
                builder = useDefaultRequestExecutor;
                obj = access$getFileUpdateInterval;
                i = 0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                bVar = (b) this.L$1;
                builder = (OmicronConfig.Builder) this.L$0;
                kotlin.a.a(obj);
            }
            int intValue = ((Number) obj).intValue();
            bVar.getClass();
            Omicron.getInstance().init(FeatureManagerImpl.this.a, builder.updateInterval((int) TimeUnit.HOURS.toMinutes(intValue)).deviceIdProvider(new quq(FeatureManagerImpl.this)).build());
            if (i != 0) {
                Omicron.getInstance().needUpdateCache();
            }
            myc0.h(FeatureManagerImpl.this.h, null, null, new C1731a(FeatureManagerImpl.this, null), 3);
            return s3q0.a;
        }
    }

    /* compiled from: FeatureManagerImpl.kt */
    public static final class b {
    }

    /* compiled from: FeatureManagerImpl.kt */
    @b6l(c = "com.vk.push.core.feature.FeatureManagerImpl", f = "FeatureManagerImpl.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "getFeatureValue")
    /* loaded from: classes5.dex */
    public static final class c extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(spj<? super c> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureManagerImpl.this.getFeatureValue((Feature.BooleanFeature) null, this);
        }
    }

    /* compiled from: FeatureManagerImpl.kt */
    @b6l(c = "com.vk.push.core.feature.FeatureManagerImpl", f = "FeatureManagerImpl.kt", l = {83}, m = "getFeatureValue")
    public static final class d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(spj<? super d> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureManagerImpl.this.getFeatureValue((Feature.StringFeature) null, this);
        }
    }

    /* compiled from: FeatureManagerImpl.kt */
    @b6l(c = "com.vk.push.core.feature.FeatureManagerImpl", f = "FeatureManagerImpl.kt", l = {JsonToken.END_ARRAY}, m = "getFeatureValue")
    public static final class e extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(spj<? super e> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeatureManagerImpl.this.getFeatureValue((Feature.IntFeature) null, this);
        }
    }

    /* compiled from: FeatureManagerImpl.kt */
    /* loaded from: classes5.dex */
    public static final class f extends Lambda implements izs<String, CharSequence> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ CharSequence invoke(String str) {
            return StringUtils.COMMA;
        }
    }

    public FeatureManagerImpl(Context context, HttpClient httpClient, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, DeviceIdRepository deviceIdRepository, Logger logger, FileDataSource fileDataSource, yvj yvjVar) {
        this.a = context;
        this.b = httpClient;
        this.c = crashReporterRepository;
        this.d = issueKeyBlackListRepository;
        this.e = deviceIdRepository;
        this.f = logger;
        this.g = fileDataSource;
        this.h = yvjVar;
        this.i = myc0.h(yvjVar, null, null, new a(null), 3);
    }

    public static IllegalStateException a(String str, Throwable th) {
        return new IllegalStateException(go9.b("Incorrect access to ", str), th);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getFileUpdateInterval(FeatureManagerImpl featureManagerImpl, spj spjVar) {
        com.vk.push.core.feature.a aVar;
        int i;
        Object m99getDataIoAF18A;
        Integer m;
        featureManagerImpl.getClass();
        if (spjVar instanceof com.vk.push.core.feature.a) {
            aVar = (com.vk.push.core.feature.a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    FileDataSource fileDataSource = featureManagerImpl.g;
                    aVar.label = 1;
                    m99getDataIoAF18A = fileDataSource.m99getDataIoAF18A(aVar);
                    if (m99getDataIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    m99getDataIoAF18A = ((Result) obj).d();
                }
                if (m99getDataIoAF18A instanceof Result.Failure) {
                    m99getDataIoAF18A = null;
                }
                String str = (String) m99getDataIoAF18A;
                return new Integer((str != null || (m = arm0.m(10, str)) == null) ? CommonFeaturesKt.getUpdateTimeInterval().getDefaultValue() : m.intValue());
            }
        }
        aVar = new com.vk.push.core.feature.a(featureManagerImpl, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        if (m99getDataIoAF18A instanceof Result.Failure) {
        }
        String str2 = (String) m99getDataIoAF18A;
        return new Integer((str2 != null || (m = arm0.m(10, str2)) == null) ? CommonFeaturesKt.getUpdateTimeInterval().getDefaultValue() : m.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1] */
    public static final FeatureManagerImpl$provideAnalyticsHandler$1 access$provideAnalyticsHandler(FeatureManagerImpl featureManagerImpl, final Logger logger, final CrashReporterRepository crashReporterRepository) {
        featureManagerImpl.getClass();
        return new AnalyticsHandler() { // from class: com.vk.push.core.feature.FeatureManagerImpl$provideAnalyticsHandler$1
            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheHit(DataId dataId, boolean z) {
                Logger.DefaultImpls.info$default(Logger.this, "onCacheHit: dataId: " + dataId + ", outdated: " + z, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheMiss(DataId dataId) {
                Logger.DefaultImpls.info$default(Logger.this, "onCacheMiss: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onCacheUpdated(DataId dataId) {
                Logger.DefaultImpls.info$default(Logger.this, "onCacheUpdated: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigReceivedFromNetwork(String str) {
                Logger.DefaultImpls.info$default(Logger.this, "onConfigReceivedFromNetwork: ".concat(str), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestEnded(int i) {
                Logger.DefaultImpls.info$default(Logger.this, lhg.a(i, "onConfigRequestEnded: "), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestFailedWithException(Throwable th) {
                Logger.DefaultImpls.info$default(Logger.this, ms9.b("onConfigRequestFailedWithException: ", th), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onConfigRequestStarted(String str) {
                Logger.DefaultImpls.info$default(Logger.this, "onConfigRequestStarted: ".concat(str), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onGetDataError(Throwable th, String str) {
                Logger.DefaultImpls.info$default(Logger.this, "onGetDataError: throwable: " + th + ", data: " + str, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onHandledException(Throwable th) {
                Logger.DefaultImpls.info$default(Logger.this, ms9.b("onHandledException: ", th), null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseError(DataId dataId, int i) {
                Logger.DefaultImpls.info$default(Logger.this, "onResponseError: dataId: " + dataId + ", statusCode: " + i, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseException(DataId dataId, Throwable th) {
                Logger.DefaultImpls.info$default(Logger.this, "onResponseException: dataId: " + dataId + ", exception: " + th, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseNotModified(DataId dataId) {
                Logger.DefaultImpls.info$default(Logger.this, "onResponseNotModified: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseParseException(DataId dataId, ParseException parseException) {
                Logger.DefaultImpls.info$default(Logger.this, "onResponseParseException: dataId: " + dataId + ", exception: " + parseException, null, 2, null);
                if (parseException != null) {
                    crashReporterRepository.nonFatalReport(parseException, IssueKey.OMICRON_PARSE_ERROR);
                }
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onResponseSuccess(DataId dataId) {
                Logger.DefaultImpls.info$default(Logger.this, "onResponseSuccess: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onWaitForActualOnTime(DataId dataId) {
                Logger.DefaultImpls.info$default(Logger.this, "onWaitForActualOnTime: " + dataId, null, 2, null);
            }

            @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
            public void onWaitForActualTimeout(DataId dataId) {
                Logger.DefaultImpls.info$default(Logger.this, "onWaitForActualTimeout: " + dataId, null, 2, null);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r8.setBlackList(r9, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$saveIssueKeysBlacklist(FeatureManagerImpl featureManagerImpl, spj spjVar) {
        com.vk.push.core.feature.b bVar;
        int i;
        IssueKeyBlackListRepository issueKeyBlackListRepository;
        featureManagerImpl.getClass();
        if (spjVar instanceof com.vk.push.core.feature.b) {
            bVar = (com.vk.push.core.feature.b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    IssueKeyBlackListRepository issueKeyBlackListRepository2 = featureManagerImpl.d;
                    if (issueKeyBlackListRepository2 == null) {
                        return null;
                    }
                    Feature.StringFeature nonFatalEventsBlackList = CommonFeaturesKt.getNonFatalEventsBlackList();
                    bVar.L$0 = issueKeyBlackListRepository2;
                    bVar.label = 1;
                    Object featureValue = featureManagerImpl.getFeatureValue(nonFatalEventsBlackList, bVar);
                    if (featureValue != obj2) {
                        obj = featureValue;
                        issueKeyBlackListRepository = issueKeyBlackListRepository2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                issueKeyBlackListRepository = (IssueKeyBlackListRepository) bVar.L$0;
                kotlin.a.a(obj);
                List<String> c0 = drm0.c0((CharSequence) obj, new String[]{StringUtils.COMMA}, 0, 6);
                bVar.L$0 = null;
                bVar.label = 2;
            }
        }
        bVar = new com.vk.push.core.feature.b(featureManagerImpl, spjVar);
        Object obj3 = bVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        List<String> c02 = drm0.c0((CharSequence) obj3, new String[]{StringUtils.COMMA}, 0, 6);
        bVar.L$0 = null;
        bVar.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: access$saveUpdateInterval-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m98access$saveUpdateIntervalIoAF18A(FeatureManagerImpl featureManagerImpl, spj spjVar) {
        com.vk.push.core.feature.c cVar;
        int i;
        FileDataSource fileDataSource;
        featureManagerImpl.getClass();
        if (spjVar instanceof com.vk.push.core.feature.c) {
            cVar = (com.vk.push.core.feature.c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    FileDataSource fileDataSource2 = featureManagerImpl.g;
                    Feature.IntFeature updateTimeInterval = CommonFeaturesKt.getUpdateTimeInterval();
                    cVar.L$0 = fileDataSource2;
                    cVar.label = 1;
                    Object featureValue = featureManagerImpl.getFeatureValue(updateTimeInterval, cVar);
                    if (featureValue != obj2) {
                        obj = featureValue;
                        fileDataSource = fileDataSource2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                fileDataSource = (FileDataSource) cVar.L$0;
                kotlin.a.a(obj);
                String valueOf = String.valueOf(((Number) obj).intValue());
                cVar.L$0 = null;
                cVar.label = 2;
                Object m100setDatagIAlus = fileDataSource.m100setDatagIAlus(valueOf, cVar);
                return m100setDatagIAlus != obj2 ? obj2 : m100setDatagIAlus;
            }
        }
        cVar = new com.vk.push.core.feature.c(featureManagerImpl, spjVar);
        Object obj3 = cVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i != 0) {
        }
        String valueOf2 = String.valueOf(((Number) obj3).intValue());
        cVar.L$0 = null;
        cVar.label = 2;
        Object m100setDatagIAlus2 = fileDataSource.m100setDatagIAlus(valueOf2, cVar);
        if (m100setDatagIAlus2 != obj22) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:9)(2:18|19))(3:20|(2:22|(1:24))|25)|10|11|12|13))|26|6|(0)(0)|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r0.c.nonFatalReport(a(r5.getKey(), r6), com.vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS);
        r5 = r5.getDefaultValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFeatureValue(Feature.BooleanFeature booleanFeature, spj<? super Boolean> spjVar) {
        c cVar;
        int i;
        FeatureManagerImpl featureManagerImpl;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    yok0 yok0Var = this.i;
                    if (yok0Var != null) {
                        cVar.L$0 = this;
                        cVar.L$1 = booleanFeature;
                        cVar.label = 1;
                        if (yok0Var.y(cVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    featureManagerImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanFeature = (Feature.BooleanFeature) cVar.L$1;
                    featureManagerImpl = (FeatureManagerImpl) cVar.L$0;
                    kotlin.a.a(obj);
                }
                boolean defaultValue = Omicron.getInstance().getLatestBoolean(booleanFeature.getKey(), booleanFeature.getDefaultValue());
                return Boolean.valueOf(defaultValue);
            }
        }
        cVar = new c(spjVar);
        Object obj2 = cVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i != 0) {
        }
        boolean defaultValue2 = Omicron.getInstance().getLatestBoolean(booleanFeature.getKey(), booleanFeature.getDefaultValue());
        return Boolean.valueOf(defaultValue2);
    }

    @Override // com.vk.push.core.feature.FeatureManager
    public String getSegments() {
        Collection<String> values = SegmentsHolder.getSegments().values();
        return values.isEmpty() ? "empty" : values.size() == 1 ? (String) j5g.X(values) : j5g.g0(values, null, null, null, 0, f.i, 31);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:9)(2:18|19))(3:20|(2:22|(1:24))|25)|10|11|12|13))|26|6|(0)(0)|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r0.c.nonFatalReport(a(r5.getKey(), r6), com.vk.push.core.data.repository.IssueKey.OMICRON_EARLY_FEATURE_ACCESS);
        r5 = r5.getDefaultValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFeatureValue(Feature.IntFeature intFeature, spj<? super Integer> spjVar) {
        e eVar;
        int i;
        FeatureManagerImpl featureManagerImpl;
        if (spjVar instanceof e) {
            eVar = (e) spjVar;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    yok0 yok0Var = this.i;
                    if (yok0Var != null) {
                        eVar.L$0 = this;
                        eVar.L$1 = intFeature;
                        eVar.label = 1;
                        if (yok0Var.y(eVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    featureManagerImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intFeature = (Feature.IntFeature) eVar.L$1;
                    featureManagerImpl = (FeatureManagerImpl) eVar.L$0;
                    kotlin.a.a(obj);
                }
                int defaultValue = Omicron.getInstance().getLatestInt(intFeature.getKey(), intFeature.getDefaultValue());
                return new Integer(defaultValue);
            }
        }
        eVar = new e(spjVar);
        Object obj2 = eVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.label;
        if (i != 0) {
        }
        int defaultValue2 = Omicron.getInstance().getLatestInt(intFeature.getKey(), intFeature.getDefaultValue());
        return new Integer(defaultValue2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeatureManagerImpl(Context context, HttpClient httpClient, CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, DeviceIdRepository deviceIdRepository, Logger logger, FileDataSource fileDataSource, yvj yvjVar, int i, zcl zclVar) {
        this(context, httpClient, crashReporterRepository, issueKeyBlackListRepository, deviceIdRepository, logger, r15, r16);
        yvj yvjVar2;
        FileDataSource fileDataSource2 = (i & 64) != 0 ? new FileDataSource(context, UPDATE_INTERVAL_FILE_NAME, null, 4, null) : fileDataSource;
        if ((i & 128) != 0) {
            bdn bdnVar = bdn.a;
            yvjVar2 = zvj.a(wgl.c);
        } else {
            yvjVar2 = yvjVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.core.feature.FeatureManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFeatureValue(Feature.StringFeature stringFeature, spj<? super String> spjVar) {
        d dVar;
        int i;
        FeatureManagerImpl featureManagerImpl;
        try {
            if (spjVar instanceof d) {
                dVar = (d) spjVar;
                int i2 = dVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = dVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        yok0 yok0Var = this.i;
                        if (yok0Var != null) {
                            dVar.L$0 = this;
                            dVar.L$1 = stringFeature;
                            dVar.label = 1;
                            if (yok0Var.y(dVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        featureManagerImpl = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stringFeature = (Feature.StringFeature) dVar.L$1;
                        featureManagerImpl = (FeatureManagerImpl) dVar.L$0;
                        kotlin.a.a(obj);
                    }
                    return Omicron.getInstance().getLatestString(stringFeature.getKey(), stringFeature.getDefaultValue());
                }
            }
            return Omicron.getInstance().getLatestString(stringFeature.getKey(), stringFeature.getDefaultValue());
        } catch (Throwable th) {
            featureManagerImpl.c.nonFatalReport(a(stringFeature.getKey(), th), IssueKey.OMICRON_EARLY_FEATURE_ACCESS);
            return stringFeature.getDefaultValue();
        }
        dVar = new d(spjVar);
        Object obj2 = dVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.label;
        if (i != 0) {
        }
    }
}
