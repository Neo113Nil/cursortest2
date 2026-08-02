package com.vk.push.core.remote.config.omicron;

import android.net.Uri;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.a;
import com.vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.retriever.RetrievalStatus;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.vk.push.core.remote.config.omicron.timetable.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: OmicronLogicFactory.java */
/* loaded from: classes.dex */
public final class a {
    public static final TimeUnit f = TimeUnit.MINUTES;
    public final SerializationDataStorage a;
    public final NetworkDataRetriever b;
    public final SharedPreferencesUpdateTimetable c;
    public final TimeProvider d;
    public final DefaultExecutorFactory e;

    /* compiled from: OmicronLogicFactory.java */
    /* renamed from: com.vk.push.core.remote.config.omicron.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1732a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RetrievalStatus.values().length];
            b = iArr;
            try {
                iArr[RetrievalStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[RetrievalStatus.NOT_MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[UpdateBehaviour.values().length];
            a = iArr2;
            try {
                iArr2[UpdateBehaviour.WAIT_FOR_ACTUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UpdateBehaviour.CACHE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[UpdateBehaviour.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: OmicronLogicFactory.java */
    public abstract class b {
        public final AtomicReference<Data> a = new AtomicReference<>();
        public Data b;
        public final OmicronConfig c;
        public final DataId d;

        public b(OmicronConfig omicronConfig) {
            this.c = omicronConfig;
            this.d = new DataId(new Uri.Builder().scheme(omicronConfig.b).authority(omicronConfig.c).path(omicronConfig.d).toString(), omicronConfig.a);
        }

        public abstract Data a();

        public final void b() {
            OmicronConfig omicronConfig = this.c;
            AnalyticsHandler analyticsHandler = omicronConfig.f;
            SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = a.this.c;
            long j = omicronConfig.g;
            TimeUnit timeUnit = a.f;
            DataId dataId = this.d;
            analyticsHandler.onCacheHit(dataId, sharedPreferencesUpdateTimetable.shouldUpdate(dataId, j, timeUnit));
        }
    }

    /* compiled from: OmicronLogicFactory.java */
    /* loaded from: classes5.dex */
    public class c extends b {
        public c(OmicronConfig omicronConfig) {
            super(omicronConfig);
        }

        @Override // com.vk.push.core.remote.config.omicron.a.b
        public final Data a() {
            SerializationDataStorage serializationDataStorage = a.this.a;
            DataId dataId = this.d;
            Data data = serializationDataStorage.getData(dataId);
            if (data != null) {
                b();
                return data;
            }
            Data build = Data.newBuilder().build();
            this.c.f.onCacheMiss(dataId);
            return build;
        }
    }

    /* compiled from: OmicronLogicFactory.java */
    public class d extends b {
        public final ExecutorService f;

        public d(OmicronConfig omicronConfig) {
            super(omicronConfig);
            this.f = a.this.e.newSingleThreadExecutor();
        }

        @Override // com.vk.push.core.remote.config.omicron.a.b
        public final Data a() {
            final DataQuery build;
            SerializationDataStorage serializationDataStorage = a.this.a;
            DataId dataId = this.d;
            Data data = serializationDataStorage.getData(dataId);
            OmicronConfig omicronConfig = this.c;
            if (data == null) {
                data = Data.newBuilder().build();
                build = DataQuery.newBuilder().environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build();
                omicronConfig.f.onCacheMiss(dataId);
            } else {
                build = DataQuery.newBuilder().version(data.getVersion()).condition(data.getCondition()).segments(data.getSegments()).environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build();
                b();
            }
            this.f.execute(new Runnable() { // from class: xsna.q080
                @Override // java.lang.Runnable
                public final void run() {
                    a.d dVar = a.d.this;
                    com.vk.push.core.remote.config.omicron.a aVar = com.vk.push.core.remote.config.omicron.a.this;
                    SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = aVar.c;
                    NetworkDataRetriever networkDataRetriever = aVar.b;
                    DataId dataId2 = dVar.d;
                    OmicronConfig omicronConfig2 = dVar.c;
                    if (sharedPreferencesUpdateTimetable.shouldUpdate(dataId2, omicronConfig2.g, com.vk.push.core.remote.config.omicron.a.f)) {
                        int i = a.C1732a.b[networkDataRetriever.retrieve(dataId2, build).ordinal()];
                        if (i == 1) {
                            aVar.a.putData(dataId2, networkDataRetriever.getData());
                            dVar.a.set(networkDataRetriever.getData());
                            omicronConfig2.f.onCacheUpdated(dataId2);
                        } else if (i != 2) {
                            return;
                        }
                        sharedPreferencesUpdateTimetable.setUpdateDate(dataId2, aVar.d.getCurrentDate());
                    }
                }
            });
            return data;
        }
    }

    /* compiled from: OmicronLogicFactory.java */
    /* loaded from: classes5.dex */
    public class e extends b {
        public final ExecutorService f;

        public e(OmicronConfig omicronConfig) {
            super(omicronConfig);
            this.f = a.this.e.newSingleThreadExecutor();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
        @Override // com.vk.push.core.remote.config.omicron.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Data a() {
            Data data;
            DataId dataId = this.d;
            Future submit = this.f.submit(new Callable() { // from class: xsna.r080
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Data data2;
                    a.e eVar = a.e.this;
                    com.vk.push.core.remote.config.omicron.a aVar = com.vk.push.core.remote.config.omicron.a.this;
                    NetworkDataRetriever networkDataRetriever = aVar.b;
                    DataId dataId2 = eVar.d;
                    DataQuery.Builder newBuilder = DataQuery.newBuilder();
                    OmicronConfig omicronConfig = eVar.c;
                    int i = a.C1732a.b[networkDataRetriever.retrieve(dataId2, newBuilder.environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build()).ordinal()];
                    if (i != 1) {
                        data2 = null;
                        if (i != 2) {
                            return null;
                        }
                    } else {
                        data2 = networkDataRetriever.getData();
                        aVar.a.putData(dataId2, data2);
                        eVar.a.set(data2);
                        omicronConfig.f.onCacheUpdated(dataId2);
                    }
                    aVar.c.setUpdateDate(dataId2, aVar.d.getCurrentDate());
                    return data2;
                }
            });
            OmicronConfig omicronConfig = this.c;
            float f = omicronConfig.i;
            AnalyticsHandler analyticsHandler = omicronConfig.f;
            long j = (long) (f * 1000.0f);
            Data data2 = null;
            try {
                data = (Data) submit.get(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
            }
            try {
                analyticsHandler.onWaitForActualOnTime(dataId);
            } catch (InterruptedException | ExecutionException unused3) {
                data2 = data;
                data = data2;
                if (data != null) {
                }
            } catch (TimeoutException unused4) {
                data2 = data;
                analyticsHandler.onWaitForActualTimeout(dataId);
                data = data2;
                if (data != null) {
                }
            }
            if (data != null) {
                return data;
            }
            Data data3 = a.this.a.getData(dataId);
            if (data3 != null) {
                b();
                return data3;
            }
            Data build = Data.newBuilder().build();
            omicronConfig.f.onCacheMiss(dataId);
            return build;
        }
    }

    public a(SerializationDataStorage serializationDataStorage, NetworkDataRetriever networkDataRetriever, SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable, TimeProvider timeProvider, DefaultExecutorFactory defaultExecutorFactory) {
        this.a = serializationDataStorage;
        this.b = networkDataRetriever;
        this.c = sharedPreferencesUpdateTimetable;
        this.d = timeProvider;
        this.e = defaultExecutorFactory;
    }
}
