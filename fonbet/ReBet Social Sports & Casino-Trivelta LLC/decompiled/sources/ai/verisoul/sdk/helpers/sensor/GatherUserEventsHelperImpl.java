package ai.verisoul.sdk.helpers.sensor;

import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X0;
import ai.verisoul.sdk.Core;
import ai.verisoul.sdk.data.remote.VerisoulHttpService;
import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerData;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerRequestData;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerSensorData;
import ai.verisoul.sdk.helpers.sensor.accelerometer.MotionEventData;
import ai.verisoul.sdk.helpers.sensor.accelerometer.PointerData;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.logger.Logger;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010\u001f\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020%2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010,J\u000f\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u0010,J \u00101\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u0010\u0005J\u0017\u00104\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020=0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00105R\u0016\u0010D\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00105R\u0014\u0010E\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010K\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010FR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020!0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelperImpl;", "Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", "", "projectId", "<init>", "(Ljava/lang/String;)V", "Landroid/view/MotionEvent;", "motionEvent", "sessionId", "", "processMotionEvent", "(Landroid/view/MotionEvent;Ljava/lang/String;)V", "", "checkIfLimitHasExceeded", "()Z", "", "sampleNumber", "Lai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;", "motionEventData", "", "startGatheringDataTimestamp", "gatherData", "(Ljava/lang/String;ILai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;J)V", "", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerData;", "preTouchData", "postTouchData", "touchTimestamp", "combinePreAndPostData", "(Ljava/util/List;Ljava/util/List;J)Ljava/util/List;", EventKeys.DATA, "uploadAccelerometerData", "(Ljava/util/List;Lai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;Ljava/lang/String;Ljava/lang/String;IJ)V", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerSensorData;", "sensorData", "uploadData", "(Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerSensorData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerRequestData;", "mappedAccelerometerData", "(Ljava/util/List;)Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerRequestData;", "Lai/verisoul/sdk/helpers/sensor/accelerometer/PointerData;", "getPointedData", "(Landroid/view/MotionEvent;)Lai/verisoul/sdk/helpers/sensor/accelerometer/PointerData;", "shutdown", "()V", "beginSession", "(Ljava/lang/String;Ljava/lang/String;)V", "endSession", "reset", "onUserTouchedScreen", "(Landroid/view/MotionEvent;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendInitialAccelerometerData", "checkIfAccelerometerDataShouldBeSend", "Ljava/lang/String;", "tag", "LPh/M;", "exceptionHandler", "LPh/M;", "LPh/P;", "scope", "LPh/P;", "LPh/C0;", "sensorJob", "LPh/C0;", "", "uploadJobs", "Ljava/util/List;", "currentSessionId", "sessionIdData", "oneSecond", "J", "initialCallSampleData", "I", "touchEventLimitCounter", "gatherUserMovementEventsCounter", "sessionStartTimestamp", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "dataQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", "accelerometerHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "getAccelerometerHelper", "()Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", "accelerometerHelper", "Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionHelper$delegate", "getSessionHelper", "()Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionHelper", "Lai/verisoul/sdk/data/remote/VerisoulHttpService;", "httpService$delegate", "getHttpService", "()Lai/verisoul/sdk/data/remote/VerisoulHttpService;", "httpService", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGatherUserEventsHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GatherUserEventsHelperImpl.kt\nai/verisoul/sdk/helpers/sensor/GatherUserEventsHelperImpl\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n48#2,4:344\n67#3:348\n67#3:349\n67#3:350\n766#4:351\n857#4,2:352\n766#4:354\n857#4,2:355\n1549#4:357\n1620#4,3:358\n1549#4:361\n1620#4,3:362\n1549#4:365\n1620#4,3:366\n1549#4:369\n1620#4,3:370\n*S KotlinDebug\n*F\n+ 1 GatherUserEventsHelperImpl.kt\nai/verisoul/sdk/helpers/sensor/GatherUserEventsHelperImpl\n*L\n26#1:344,4\n43#1:348\n46#1:349\n50#1:350\n255#1:351\n255#1:352,2\n256#1:354\n256#1:355,2\n306#1:357\n306#1:358,3\n307#1:361\n307#1:362,3\n308#1:365\n308#1:366,3\n309#1:369\n309#1:370,3\n*E\n"})
/* loaded from: classes.dex */
public final class GatherUserEventsHelperImpl implements GatherUserEventsHelper {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GatherUserEventsHelperImpl.class, "accelerometerHelper", "getAccelerometerHelper()Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", 0)), Reflection.property1(new PropertyReference1Impl(GatherUserEventsHelperImpl.class, "sessionHelper", "getSessionHelper()Lai/verisoul/sdk/helpers/session/SessionHelper;", 0)), Reflection.property1(new PropertyReference1Impl(GatherUserEventsHelperImpl.class, "httpService", "getHttpService()Lai/verisoul/sdk/data/remote/VerisoulHttpService;", 0))};

    /* renamed from: accelerometerHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate accelerometerHelper;

    @NotNull
    private String currentSessionId;

    @NotNull
    private final ConcurrentLinkedQueue<AccelerometerSensorData> dataQueue;

    @NotNull
    private final M exceptionHandler;
    private int gatherUserMovementEventsCounter;

    /* renamed from: httpService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate httpService;
    private final int initialCallSampleData;
    private final long oneSecond;

    @NotNull
    private final String projectId;

    @NotNull
    private final P scope;

    @Nullable
    private C0 sensorJob;

    /* renamed from: sessionHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate sessionHelper;

    @NotNull
    private String sessionIdData;
    private long sessionStartTimestamp;

    @NotNull
    private final String tag;
    private final int touchEventLimitCounter;

    @NotNull
    private final List<C0> uploadJobs;

    public GatherUserEventsHelperImpl(@NotNull String projectId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.projectId = projectId;
        this.tag = "Verisoul-[" + GatherUserEventsHelperImpl.class.getSimpleName() + "]";
        GatherUserEventsHelperImpl$special$$inlined$CoroutineExceptionHandler$1 gatherUserEventsHelperImpl$special$$inlined$CoroutineExceptionHandler$1 = new GatherUserEventsHelperImpl$special$$inlined$CoroutineExceptionHandler$1(M.f9041T2, this);
        this.exceptionHandler = gatherUserEventsHelperImpl$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = Q.a(X0.b(null, 1, null).plus(C1452g0.b()).plus(gatherUserEventsHelperImpl$special$$inlined$CoroutineExceptionHandler$1));
        this.uploadJobs = new ArrayList();
        this.currentSessionId = "";
        this.sessionIdData = "";
        this.oneSecond = 1000L;
        this.initialCallSampleData = -1;
        this.touchEventLimitCounter = 10;
        this.gatherUserMovementEventsCounter = 1;
        this.dataQueue = new ConcurrentLinkedQueue<>();
        this.accelerometerHelper = new InjectDelegate(AccelerometerHelper.class);
        this.sessionHelper = new InjectDelegate(SessionHelper.class);
        this.httpService = new InjectDelegate(VerisoulHttpService.class);
    }

    private final boolean checkIfLimitHasExceeded() {
        return this.gatherUserMovementEventsCounter > this.touchEventLimitCounter || System.currentTimeMillis() - this.sessionStartTimestamp >= Core.sensorDataTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AccelerometerData> combinePreAndPostData(List<AccelerometerData> preTouchData, List<AccelerometerData> postTouchData, long touchTimestamp) {
        if (preTouchData == null) {
            return postTouchData;
        }
        long j10 = this.oneSecond;
        long j11 = touchTimestamp - j10;
        long j12 = j10 + touchTimestamp;
        ArrayList arrayList = new ArrayList();
        for (Object obj : preTouchData) {
            long timestamp = ((AccelerometerData) obj).getTimestamp();
            if (j11 <= timestamp && timestamp <= touchTimestamp) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : postTouchData) {
            long timestamp2 = ((AccelerometerData) obj2).getTimestamp();
            if (touchTimestamp <= timestamp2 && timestamp2 <= j12) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    private final void gatherData(String sessionId, int sampleNumber, MotionEventData motionEventData, long startGatheringDataTimestamp) {
        C0 d10;
        long currentTimeMillis = System.currentTimeMillis();
        d10 = AbstractC1459k.d(this.scope, null, null, new GatherUserEventsHelperImpl$gatherData$job$1(this, getAccelerometerHelper().getCurrentBufferSnapshot(), currentTimeMillis, motionEventData, sessionId, sampleNumber, startGatheringDataTimestamp, null), 3, null);
        synchronized (this.uploadJobs) {
            this.uploadJobs.add(d10);
            CollectionsKt.removeAll((List) this.uploadJobs, (Function1) new Function1<C0, Boolean>() { // from class: ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl$gatherData$1$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull C0 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.isCompleted());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccelerometerHelper getAccelerometerHelper() {
        return (AccelerometerHelper) this.accelerometerHelper.getValue(this, $$delegatedProperties[0]);
    }

    private final VerisoulHttpService getHttpService() {
        return (VerisoulHttpService) this.httpService.getValue(this, $$delegatedProperties[2]);
    }

    private final PointerData getPointedData(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 0) {
            return null;
        }
        if (motionEvent.getPointerCount() <= 0) {
            Logger.INSTANCE.error(this.tag, "Invalid pointer index: 0 for count: " + motionEvent.getPointerCount());
            return null;
        }
        try {
            return new PointerData(motionEvent.getX(0), motionEvent.getY(0));
        } catch (Exception e10) {
            Logger.INSTANCE.error(this.tag, "Failed to get pointer data: " + e10.getMessage());
            return null;
        }
    }

    private final SessionHelper getSessionHelper() {
        return (SessionHelper) this.sessionHelper.getValue(this, $$delegatedProperties[1]);
    }

    private final AccelerometerRequestData mappedAccelerometerData(List<AccelerometerData> data) {
        List<AccelerometerData> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((AccelerometerData) it.next()).getX()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((AccelerometerData) it2.next()).getY()));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Float.valueOf(((AccelerometerData) it3.next()).getZ()));
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Long.valueOf(((AccelerometerData) it4.next()).getTimestamp()));
        }
        return new AccelerometerRequestData(arrayList, arrayList2, arrayList3, arrayList4);
    }

    private final void processMotionEvent(MotionEvent motionEvent, String sessionId) {
        long currentTimeMillis = System.currentTimeMillis();
        PointerData pointedData = getPointedData(motionEvent);
        if (pointedData != null) {
            long eventTime = motionEvent.getEventTime();
            long downTime = motionEvent.getDownTime();
            long currentTimeMillis2 = System.currentTimeMillis() - SystemClock.uptimeMillis();
            gatherData(sessionId, this.gatherUserMovementEventsCounter, new MotionEventData(currentTimeMillis2 + eventTime, currentTimeMillis2 + downTime, Float.valueOf(pointedData.getX()), Float.valueOf(pointedData.getY())), currentTimeMillis);
            checkIfAccelerometerDataShouldBeSend(sessionId);
        }
    }

    private final void shutdown() {
        Logger.INSTANCE.info(this.tag, "Shutting down user events helper");
        endSession();
        Q.f(this.scope, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadAccelerometerData(List<AccelerometerData> data, MotionEventData motionEventData, String sessionId, String projectId, int sampleNumber, long startGatheringDataTimestamp) {
        AccelerometerRequestData mappedAccelerometerData = mappedAccelerometerData(data);
        if (Intrinsics.areEqual(sessionId, "")) {
            sessionId = this.sessionIdData;
        }
        String str = sessionId;
        AccelerometerSensorData accelerometerSensorData = new AccelerometerSensorData(mappedAccelerometerData, motionEventData, str, projectId, sampleNumber);
        System.currentTimeMillis();
        if (!Intrinsics.areEqual(str, "")) {
            AbstractC1459k.d(this.scope, null, null, new GatherUserEventsHelperImpl$uploadAccelerometerData$1(this, accelerometerSensorData, null), 3, null);
        } else {
            Logger.INSTANCE.error(this.tag, "Session Id not yet fetched, add accelerometer request to queue");
            this.dataQueue.add(accelerometerSensorData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadData(AccelerometerSensorData accelerometerSensorData, Continuation<? super Unit> continuation) {
        GatherUserEventsHelperImpl$uploadData$1 gatherUserEventsHelperImpl$uploadData$1;
        int i10;
        GatherUserEventsHelperImpl gatherUserEventsHelperImpl;
        if (continuation instanceof GatherUserEventsHelperImpl$uploadData$1) {
            gatherUserEventsHelperImpl$uploadData$1 = (GatherUserEventsHelperImpl$uploadData$1) continuation;
            int i11 = gatherUserEventsHelperImpl$uploadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gatherUserEventsHelperImpl$uploadData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = gatherUserEventsHelperImpl$uploadData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gatherUserEventsHelperImpl$uploadData$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        VerisoulHttpService httpService = getHttpService();
                        gatherUserEventsHelperImpl$uploadData$1.L$0 = this;
                        gatherUserEventsHelperImpl$uploadData$1.label = 1;
                        if (httpService.submitAccelerometerData(accelerometerSensorData, gatherUserEventsHelperImpl$uploadData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        gatherUserEventsHelperImpl = this;
                        Logger.INSTANCE.debug(gatherUserEventsHelperImpl.tag, "Upload cancelled");
                        throw e;
                    } catch (Exception e11) {
                        e = e11;
                        gatherUserEventsHelperImpl = this;
                        Logger.INSTANCE.error(gatherUserEventsHelperImpl.tag, "Failed to upload accelerometer data: " + e.getMessage());
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gatherUserEventsHelperImpl = (GatherUserEventsHelperImpl) gatherUserEventsHelperImpl$uploadData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e12) {
                        e = e12;
                        Logger.INSTANCE.debug(gatherUserEventsHelperImpl.tag, "Upload cancelled");
                        throw e;
                    } catch (Exception e13) {
                        e = e13;
                        Logger.INSTANCE.error(gatherUserEventsHelperImpl.tag, "Failed to upload accelerometer data: " + e.getMessage());
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        gatherUserEventsHelperImpl$uploadData$1 = new GatherUserEventsHelperImpl$uploadData$1(this, continuation);
        Object obj2 = gatherUserEventsHelperImpl$uploadData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gatherUserEventsHelperImpl$uploadData$1.label;
        if (i10 != 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper
    public void beginSession(@NotNull String sessionId, @NotNull String projectId) {
        C0 d10;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        endSession();
        this.currentSessionId = sessionId;
        this.sessionStartTimestamp = System.currentTimeMillis();
        this.gatherUserMovementEventsCounter = 1;
        getAccelerometerHelper().startListening();
        sendInitialAccelerometerData(sessionId);
        d10 = AbstractC1459k.d(this.scope, null, null, new GatherUserEventsHelperImpl$beginSession$1(this, sessionId, null), 3, null);
        this.sensorJob = d10;
    }

    @Override // ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper
    public void checkIfAccelerometerDataShouldBeSend(@NotNull String sessionId) {
        C0 d10;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionIdData = sessionId;
        d10 = AbstractC1459k.d(this.scope, null, null, new GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$job$1(this, sessionId, null), 3, null);
        synchronized (this.uploadJobs) {
            this.uploadJobs.add(d10);
            CollectionsKt.removeAll((List) this.uploadJobs, (Function1) new Function1<C0, Boolean>() { // from class: ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl$checkIfAccelerometerDataShouldBeSend$1$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull C0 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.isCompleted());
                }
            });
        }
    }

    @Override // ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper
    public void endSession() {
        AbstractC1457j.b(null, new GatherUserEventsHelperImpl$endSession$1(this, null), 1, null);
        getAccelerometerHelper().stopListening();
        reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r6.setSubmitTouchDataIsDone(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onUserTouchedScreen(@NotNull MotionEvent motionEvent, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        GatherUserEventsHelperImpl$onUserTouchedScreen$1 gatherUserEventsHelperImpl$onUserTouchedScreen$1;
        Object obj;
        int i10;
        GatherUserEventsHelperImpl gatherUserEventsHelperImpl;
        if (continuation instanceof GatherUserEventsHelperImpl$onUserTouchedScreen$1) {
            gatherUserEventsHelperImpl$onUserTouchedScreen$1 = (GatherUserEventsHelperImpl$onUserTouchedScreen$1) continuation;
            int i11 = gatherUserEventsHelperImpl$onUserTouchedScreen$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gatherUserEventsHelperImpl$onUserTouchedScreen$1.label = i11 - Integer.MIN_VALUE;
                obj = gatherUserEventsHelperImpl$onUserTouchedScreen$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gatherUserEventsHelperImpl$onUserTouchedScreen$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    SessionHelper sessionHelper = getSessionHelper();
                    gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$0 = this;
                    gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$1 = motionEvent;
                    gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$2 = str;
                    gatherUserEventsHelperImpl$onUserTouchedScreen$1.label = 1;
                    obj = sessionHelper.isNeedToSubmitTouchData(gatherUserEventsHelperImpl$onUserTouchedScreen$1);
                    if (obj != coroutine_suspended) {
                        gatherUserEventsHelperImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                str = (String) gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$2;
                motionEvent = (MotionEvent) gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$1;
                gatherUserEventsHelperImpl = (GatherUserEventsHelperImpl) gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (motionEvent.getAction() != 0) {
                    return Unit.INSTANCE;
                }
                if (!gatherUserEventsHelperImpl.checkIfLimitHasExceeded()) {
                    if (!gatherUserEventsHelperImpl.getAccelerometerHelper().isAccelerometerRegistered()) {
                        return Unit.INSTANCE;
                    }
                    gatherUserEventsHelperImpl.processMotionEvent(motionEvent, str);
                    gatherUserEventsHelperImpl.gatherUserMovementEventsCounter++;
                    return Unit.INSTANCE;
                }
                gatherUserEventsHelperImpl.getAccelerometerHelper().stopListening();
                SessionHelper sessionHelper2 = gatherUserEventsHelperImpl.getSessionHelper();
                gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$0 = null;
                gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$1 = null;
                gatherUserEventsHelperImpl$onUserTouchedScreen$1.L$2 = null;
                gatherUserEventsHelperImpl$onUserTouchedScreen$1.label = 2;
            }
        }
        gatherUserEventsHelperImpl$onUserTouchedScreen$1 = new GatherUserEventsHelperImpl$onUserTouchedScreen$1(this, continuation);
        obj = gatherUserEventsHelperImpl$onUserTouchedScreen$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gatherUserEventsHelperImpl$onUserTouchedScreen$1.label;
        if (i10 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper
    public void reset() {
        this.gatherUserMovementEventsCounter = 1;
    }

    @Override // ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper
    public void sendInitialAccelerometerData(@NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        long currentTimeMillis = System.currentTimeMillis();
        Float valueOf = Float.valueOf(0.0f);
        gatherData(sessionId, this.initialCallSampleData, new MotionEventData(0L, 0L, valueOf, valueOf), currentTimeMillis);
    }
}
