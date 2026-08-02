package com.vk.id.captcha.sensors;

import O9.d;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.captcha.b.a;
import com.vk.id.captcha.sensors.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001:\u00016B;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001d\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\u0014\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00078\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u00103\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/vk/id/captcha/sensors/SensorsDataRepositoryImpl;", "Lcom/vk/id/captcha/sensors/SensorsDataRepository;", "Landroid/os/Handler;", "handler", "Lcom/vk/id/captcha/sensors/BaseSensorListener;", "Lcom/vk/id/captcha/sensors/model/SensorData$AccelerometerSensorData;", "accelerometer", "Lcom/vk/id/captcha/sensors/model/SensorData$GyroscopeSensorData;", "gyroscope", "Lcom/vk/id/captcha/sensors/model/SensorData$MotionSensorData;", "motion", "<init>", "(Landroid/os/Handler;Lcom/vk/id/captcha/sensors/BaseSensorListener;Lcom/vk/id/captcha/sensors/BaseSensorListener;Lcom/vk/id/captcha/sensors/BaseSensorListener;)V", "", "Lcom/vk/id/captcha/sensors/model/SensorData;", "getCurrentData", "()Ljava/util/List;", "Lkotlin/Function1;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "", "onDataUpdate", "onNewData", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/vk/id/captcha/sensors/model/Sensors;", "sensors", "Lcom/vk/id/captcha/sensors/model/PeriodMs;", "periodMs", "startListening-vmuVbT4", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "startListening", "stopListening", "()V", "Lcom/vk/id/captcha/sensors/BaseSensorListener;", "", "accelerometerChanged", "Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentAccelerometerSensorData", "Lcom/vk/id/captcha/sensors/model/SensorData$AccelerometerSensorData;", "setCurrentAccelerometerSensorData", "(Lcom/vk/id/captcha/sensors/model/SensorData$AccelerometerSensorData;)V", "currentGyroscopeSensorData", "Lcom/vk/id/captcha/sensors/model/SensorData$GyroscopeSensorData;", "setCurrentGyroscopeSensorData", "(Lcom/vk/id/captcha/sensors/model/SensorData$GyroscopeSensorData;)V", "currentMotionSensorData", "Lcom/vk/id/captcha/sensors/model/SensorData$MotionSensorData;", "setCurrentMotionSensorData", "(Lcom/vk/id/captcha/sensors/model/SensorData$MotionSensorData;)V", "currentSensors", "Ljava/util/List;", "gyroscopeChanged", "Landroid/os/Handler;", "motionChanged", "Companion", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.vk.id.captcha.c.f, reason: from Kotlin metadata */
/* loaded from: classes9.dex */
public final class SensorsDataRepositoryImpl implements SensorsDataRepository {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f60554a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f60555b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final BaseSensorListener<a.C0922a> f60556c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final BaseSensorListener<a.b> f60557d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final BaseSensorListener<a.c> f60558e;

    /* renamed from: f, reason: collision with root package name */
    private a.C0922a f60559f;

    /* renamed from: g, reason: collision with root package name */
    private a.b f60560g;

    /* renamed from: h, reason: collision with root package name */
    private a.c f60561h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private List<? extends com.vk.id.captcha.sensors.a.b> f60562i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f60563j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f60564k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f60565l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/captcha/c/a/a$a;", "p0", "", "a", "(Lcom/vk/id/captcha/c/a/a$a;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.f$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<a.C0922a, Unit> {
        private /* synthetic */ Function1<List<? extends com.vk.id.captcha.sensors.a.a>, Unit> $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super List<? extends com.vk.id.captcha.sensors.a.a>, Unit> function1) {
            super(1);
            this.$b = function1;
        }

        public final void a(@NotNull a.C0922a c0922a) {
            Intrinsics.checkNotNullParameter(c0922a, "");
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, c0922a);
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, this.$b);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(a.C0922a c0922a) {
            a(c0922a);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/captcha/c/a/a$b;", "p0", "", "a", "(Lcom/vk/id/captcha/c/a/a$b;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.f$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<a.b, Unit> {
        private /* synthetic */ Function1<List<? extends com.vk.id.captcha.sensors.a.a>, Unit> $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super List<? extends com.vk.id.captcha.sensors.a.a>, Unit> function1) {
            super(1);
            this.$b = function1;
        }

        public final void a(@NotNull a.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "");
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, bVar);
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, this.$b);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(a.b bVar) {
            a(bVar);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/captcha/c/a/a$c;", "p0", "", "a", "(Lcom/vk/id/captcha/c/a/a$c;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.f$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<a.c, Unit> {
        private /* synthetic */ Function1<List<? extends com.vk.id.captcha.sensors.a.a>, Unit> $b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super List<? extends com.vk.id.captcha.sensors.a.a>, Unit> function1) {
            super(1);
            this.$b = function1;
        }

        public final void a(@NotNull a.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "");
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, cVar);
            SensorsDataRepositoryImpl.a(SensorsDataRepositoryImpl.this, this.$b);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(a.c cVar) {
            a(cVar);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/f$a;", "", "Landroid/content/Context;", "p0", "Lcom/vk/id/captcha/c/f;", "a", "(Landroid/content/Context;)Lcom/vk/id/captcha/c/f;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.f$a */
    public static final class a {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0926a extends C7735q implements Function1<float[], a.C0922a> {
            C0926a(a.C0922a.Companion companion) {
                super(1, companion, a.C0922a.Companion.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$a;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a.C0922a invoke(@NotNull float[] fArr) {
                Intrinsics.checkNotNullParameter(fArr, "");
                return ((a.C0922a.Companion) this.receiver).a(fArr);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.f$a$b */
        /* synthetic */ class b extends C7735q implements Function1<float[], a.b> {
            b(a.b.Companion companion) {
                super(1, companion, a.b.Companion.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$b;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a.b invoke(@NotNull float[] fArr) {
                Intrinsics.checkNotNullParameter(fArr, "");
                return ((a.b.Companion) this.receiver).a(fArr);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.f$a$c */
        /* synthetic */ class c extends C7735q implements Function1<float[], a.c> {
            c(a.c.Companion companion) {
                super(1, companion, a.c.Companion.class, "a", "a([F)Lcom/vk/id/captcha/c/a/a$c;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a.c invoke(@NotNull float[] fArr) {
                Intrinsics.checkNotNullParameter(fArr, "");
                return ((a.c.Companion) this.receiver).a(fArr);
            }
        }

        private a() {
        }

        @NotNull
        public static SensorsDataRepositoryImpl a(@NotNull Context p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            AndroidSensorListener androidSensorListener = new AndroidSensorListener(p02, null, 1, new C0926a(a.C0922a.INSTANCE), 2, null);
            int i11 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            d dVar = null;
            AndroidSensorListener androidSensorListener2 = new AndroidSensorListener(p02, dVar, 4, new b(a.b.INSTANCE), i11, defaultConstructorMarker);
            AndroidSensorListener androidSensorListener3 = new AndroidSensorListener(p02, dVar, 11, new c(a.c.INSTANCE), i11, defaultConstructorMarker);
            a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
            return new SensorsDataRepositoryImpl(new Handler(a.Companion.a().getC()), androidSensorListener, androidSensorListener2, androidSensorListener3, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.vk.id.captcha.c.f$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60569a;

        static {
            int[] iArr = new int[com.vk.id.captcha.sensors.a.b.a().length];
            try {
                iArr[com.vk.id.captcha.sensors.a.b.f60545a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.vk.id.captcha.sensors.a.b.f60546b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.vk.id.captcha.sensors.a.b.f60547c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60569a = iArr;
        }
    }

    public /* synthetic */ SensorsDataRepositoryImpl(Handler handler, BaseSensorListener baseSensorListener, BaseSensorListener baseSensorListener2, BaseSensorListener baseSensorListener3, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, baseSensorListener, baseSensorListener2, baseSensorListener3);
    }

    private SensorsDataRepositoryImpl(Handler handler, BaseSensorListener<a.C0922a> baseSensorListener, BaseSensorListener<a.b> baseSensorListener2, BaseSensorListener<a.c> baseSensorListener3) {
        this.f60555b = handler;
        this.f60556c = baseSensorListener;
        this.f60557d = baseSensorListener2;
        this.f60558e = baseSensorListener3;
        this.f60562i = K.f71697a;
    }

    @Override // com.vk.id.captcha.sensors.SensorsDataRepository
    public final void a(@NotNull List<? extends com.vk.id.captcha.sensors.a.b> list, int i11, @NotNull Function1<? super List<? extends com.vk.id.captcha.sensors.a.a>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.f60562i = list;
        Iterator<? extends com.vk.id.captcha.sensors.a.b> it = list.iterator();
        while (it.hasNext()) {
            int i12 = b.f60569a[it.next().ordinal()];
            if (i12 == 1) {
                this.f60556c.a(i11);
                this.f60556c.a(new AnonymousClass1(function1));
            } else if (i12 == 2) {
                this.f60557d.a(i11);
                this.f60557d.a(new AnonymousClass2(function1));
            } else if (i12 == 3) {
                this.f60558e.a(i11);
                this.f60558e.a(new AnonymousClass3(function1));
            }
        }
    }

    @Override // com.vk.id.captcha.sensors.SensorsDataRepository
    public final void a() {
        this.f60556c.a();
        this.f60557d.a();
        this.f60558e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(list, "");
        function1.invoke(list);
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, a.C0922a c0922a) {
        sensorsDataRepositoryImpl.f60559f = c0922a;
        sensorsDataRepositoryImpl.f60563j = true;
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, Function1 function1) {
        a.C0922a c0922a = sensorsDataRepositoryImpl.f60559f;
        a.b bVar = sensorsDataRepositoryImpl.f60560g;
        a.c cVar = sensorsDataRepositoryImpl.f60561h;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.vk.id.captcha.sensors.a.b> it = sensorsDataRepositoryImpl.f60562i.iterator();
        while (it.hasNext()) {
            int i11 = b.f60569a[it.next().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 && cVar != null && sensorsDataRepositoryImpl.f60565l) {
                        arrayList.add(cVar);
                    }
                } else if (bVar != null && sensorsDataRepositoryImpl.f60564k) {
                    arrayList.add(bVar);
                }
            } else if (c0922a != null && sensorsDataRepositoryImpl.f60563j) {
                arrayList.add(c0922a);
            }
        }
        if (arrayList.size() == sensorsDataRepositoryImpl.f60562i.size()) {
            sensorsDataRepositoryImpl.f60555b.post(new d(1, function1, arrayList));
            Iterator<? extends com.vk.id.captcha.sensors.a.b> it2 = sensorsDataRepositoryImpl.f60562i.iterator();
            while (it2.hasNext()) {
                int i12 = b.f60569a[it2.next().ordinal()];
                if (i12 == 1) {
                    sensorsDataRepositoryImpl.f60563j = false;
                } else if (i12 == 2) {
                    sensorsDataRepositoryImpl.f60564k = false;
                } else if (i12 == 3) {
                    sensorsDataRepositoryImpl.f60565l = false;
                }
            }
        }
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, a.b bVar) {
        sensorsDataRepositoryImpl.f60560g = bVar;
        sensorsDataRepositoryImpl.f60564k = true;
    }

    public static final /* synthetic */ void a(SensorsDataRepositoryImpl sensorsDataRepositoryImpl, a.c cVar) {
        sensorsDataRepositoryImpl.f60561h = cVar;
        sensorsDataRepositoryImpl.f60565l = true;
    }
}
