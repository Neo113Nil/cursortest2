package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.AbstractC4779m;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.G3;
import io.sentry.InterfaceC4740e0;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.protocol.u;
import io.sentry.transport.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public abstract class a implements h {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "currentSegment", "getCurrentSegment()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* renamed from: u, reason: collision with root package name */
    public static final C0749a f51457u = new C0749a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f51458v = 8;

    /* renamed from: b, reason: collision with root package name */
    public final F3 f51459b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4740e0 f51460c;

    /* renamed from: d, reason: collision with root package name */
    public final o f51461d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f51462e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f51463f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f51464g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.android.replay.gestures.b f51465h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f51466i;

    /* renamed from: j, reason: collision with root package name */
    public io.sentry.android.replay.i f51467j;

    /* renamed from: k, reason: collision with root package name */
    public final ReadWriteProperty f51468k;

    /* renamed from: l, reason: collision with root package name */
    public final ReadWriteProperty f51469l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicLong f51470m;

    /* renamed from: n, reason: collision with root package name */
    public final ReadWriteProperty f51471n;

    /* renamed from: o, reason: collision with root package name */
    public final ReadWriteProperty f51472o;

    /* renamed from: p, reason: collision with root package name */
    public final ReadWriteProperty f51473p;

    /* renamed from: q, reason: collision with root package name */
    public final ReadWriteProperty f51474q;

    /* renamed from: r, reason: collision with root package name */
    public final Deque f51475r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f51476s;

    /* renamed from: t, reason: collision with root package name */
    public final List f51477t;

    /* renamed from: io.sentry.android.replay.capture.a$a, reason: collision with other inner class name */
    public static final class C0749a {
        public /* synthetic */ C0749a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0749a() {
        }
    }

    public static final class b implements ReadWriteProperty {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f51478a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f51479b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51480c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f51481d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f51482e;

        /* renamed from: io.sentry.android.replay.capture.a$b$a, reason: collision with other inner class name */
        public static final class RunnableC0750a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f51483a;

            public RunnableC0750a(Function0 function0) {
                this.f51483a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f51483a.invoke();
            }
        }

        /* renamed from: io.sentry.android.replay.capture.a$b$b, reason: collision with other inner class name */
        public static final class C0751b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51484d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f51485e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f51486f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f51487g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f51488h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0751b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f51484d = str;
                this.f51485e = obj;
                this.f51486f = obj2;
                this.f51487g = aVar;
                this.f51488h = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m131invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m131invoke() {
                Object obj = this.f51486f;
                io.sentry.android.replay.i o10 = this.f51487g.o();
                if (o10 != null) {
                    o10.Y1(this.f51488h, String.valueOf(obj));
                }
            }
        }

        public b(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f51479b = aVar;
            this.f51480c = str;
            this.f51481d = aVar2;
            this.f51482e = str2;
            this.f51478a = new AtomicReference(obj);
        }

        public final void a(Function0 function0) {
            if (this.f51479b.f51459b.getThreadChecker().a()) {
                this.f51479b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0750a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f51479b.f51459b.getLogger().b(EnumC4788n3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f51478a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f51478a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new C0751b(this.f51480c, andSet, obj2, this.f51481d, this.f51482e));
        }
    }

    public static final class c implements ReadWriteProperty {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f51489a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f51490b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51491c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f51492d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f51493e;

        /* renamed from: io.sentry.android.replay.capture.a$c$a, reason: collision with other inner class name */
        public static final class RunnableC0752a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f51494a;

            public RunnableC0752a(Function0 function0) {
                this.f51494a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f51494a.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51495d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f51496e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f51497f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f51498g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f51499h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f51495d = str;
                this.f51496e = obj;
                this.f51497f = obj2;
                this.f51498g = aVar;
                this.f51499h = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m132invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m132invoke() {
                Object obj = this.f51497f;
                io.sentry.android.replay.i o10 = this.f51498g.o();
                if (o10 != null) {
                    o10.Y1(this.f51499h, String.valueOf(obj));
                }
            }
        }

        public c(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f51490b = aVar;
            this.f51491c = str;
            this.f51492d = aVar2;
            this.f51493e = str2;
            this.f51489a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f51490b.f51459b.getThreadChecker().a()) {
                this.f51490b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0752a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f51490b.f51459b.getLogger().b(EnumC4788n3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f51489a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f51489a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f51491c, andSet, obj2, this.f51492d, this.f51493e));
        }
    }

    public static final class d implements ReadWriteProperty {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f51500a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f51501b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51502c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f51503d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f51504e;

        /* renamed from: io.sentry.android.replay.capture.a$d$a, reason: collision with other inner class name */
        public static final class RunnableC0753a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f51505a;

            public RunnableC0753a(Function0 function0) {
                this.f51505a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f51505a.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51506d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f51507e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f51508f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f51509g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f51510h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f51506d = str;
                this.f51507e = obj;
                this.f51508f = obj2;
                this.f51509g = aVar;
                this.f51510h = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m133invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m133invoke() {
                Object obj = this.f51508f;
                io.sentry.android.replay.i o10 = this.f51509g.o();
                if (o10 != null) {
                    o10.Y1(this.f51510h, String.valueOf(obj));
                }
            }
        }

        public d(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f51501b = aVar;
            this.f51502c = str;
            this.f51503d = aVar2;
            this.f51504e = str2;
            this.f51500a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f51501b.f51459b.getThreadChecker().a()) {
                this.f51501b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0753a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f51501b.f51459b.getLogger().b(EnumC4788n3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f51500a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f51500a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f51502c, andSet, obj2, this.f51503d, this.f51504e));
        }
    }

    public static final class e implements ReadWriteProperty {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f51511a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f51512b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51513c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f51514d;

        /* renamed from: io.sentry.android.replay.capture.a$e$a, reason: collision with other inner class name */
        public static final class RunnableC0754a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f51515a;

            public RunnableC0754a(Function0 function0) {
                this.f51515a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f51515a.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51516d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f51517e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f51518f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f51519g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f51516d = str;
                this.f51517e = obj;
                this.f51518f = obj2;
                this.f51519g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m134invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m134invoke() {
                Object obj = this.f51517e;
                s sVar = (s) this.f51518f;
                if (sVar == null) {
                    return;
                }
                io.sentry.android.replay.i o10 = this.f51519g.o();
                if (o10 != null) {
                    o10.Y1("config.height", String.valueOf(sVar.c()));
                }
                io.sentry.android.replay.i o11 = this.f51519g.o();
                if (o11 != null) {
                    o11.Y1("config.width", String.valueOf(sVar.d()));
                }
                io.sentry.android.replay.i o12 = this.f51519g.o();
                if (o12 != null) {
                    o12.Y1("config.frame-rate", String.valueOf(sVar.b()));
                }
                io.sentry.android.replay.i o13 = this.f51519g.o();
                if (o13 != null) {
                    o13.Y1("config.bit-rate", String.valueOf(sVar.a()));
                }
            }
        }

        public e(Object obj, a aVar, String str, a aVar2) {
            this.f51512b = aVar;
            this.f51513c = str;
            this.f51514d = aVar2;
            this.f51511a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f51512b.f51459b.getThreadChecker().a()) {
                this.f51512b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0754a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f51512b.f51459b.getLogger().b(EnumC4788n3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f51511a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f51511a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f51513c, andSet, obj2, this.f51514d));
        }
    }

    public static final class f implements ReadWriteProperty {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f51520a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f51521b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51522c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f51523d;

        /* renamed from: io.sentry.android.replay.capture.a$f$a, reason: collision with other inner class name */
        public static final class RunnableC0755a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f51524a;

            public RunnableC0755a(Function0 function0) {
                this.f51524a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f51524a.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51525d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f51526e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f51527f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f51528g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f51525d = str;
                this.f51526e = obj;
                this.f51527f = obj2;
                this.f51528g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m135invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m135invoke() {
                Object obj = this.f51526e;
                Date date = (Date) this.f51527f;
                io.sentry.android.replay.i o10 = this.f51528g.o();
                if (o10 != null) {
                    o10.Y1("segment.timestamp", date == null ? null : AbstractC4779m.g(date));
                }
            }
        }

        public f(Object obj, a aVar, String str, a aVar2) {
            this.f51521b = aVar;
            this.f51522c = str;
            this.f51523d = aVar2;
            this.f51520a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f51521b.f51459b.getThreadChecker().a()) {
                this.f51521b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0755a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f51521b.f51459b.getLogger().b(EnumC4788n3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f51520a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f51520a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f51522c, andSet, obj2, this.f51523d));
        }
    }

    public static final class g implements ReadWriteProperty {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference f51529a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f51530b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51531c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f51532d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f51533e;

        /* renamed from: io.sentry.android.replay.capture.a$g$a, reason: collision with other inner class name */
        public static final class RunnableC0756a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f51534a;

            public RunnableC0756a(Function0 function0) {
                this.f51534a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f51534a.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51535d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f51536e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f51537f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f51538g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f51539h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f51535d = str;
                this.f51536e = obj;
                this.f51537f = obj2;
                this.f51538g = aVar;
                this.f51539h = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m136invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m136invoke() {
                Object obj = this.f51537f;
                io.sentry.android.replay.i o10 = this.f51538g.o();
                if (o10 != null) {
                    o10.Y1(this.f51539h, String.valueOf(obj));
                }
            }
        }

        public g(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f51530b = aVar;
            this.f51531c = str;
            this.f51532d = aVar2;
            this.f51533e = str2;
            this.f51529a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f51530b.f51459b.getThreadChecker().a()) {
                this.f51530b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0756a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f51530b.f51459b.getLogger().b(EnumC4788n3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f51529a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f51529a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f51531c, andSet, obj2, this.f51532d, this.f51533e));
        }
    }

    public a(F3 options, InterfaceC4740e0 interfaceC4740e0, o dateProvider, ScheduledExecutorService replayExecutor, ScheduledExecutorService persistingExecutor, Function1 function1) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        this.f51459b = options;
        this.f51460c = interfaceC4740e0;
        this.f51461d = dateProvider;
        this.f51462e = replayExecutor;
        this.f51463f = persistingExecutor;
        this.f51464g = function1;
        this.f51465h = new io.sentry.android.replay.gestures.b(dateProvider);
        this.f51466i = new AtomicBoolean(false);
        this.f51468k = new e(null, this, "", this);
        this.f51469l = new f(null, this, "segment.timestamp", this);
        this.f51470m = new AtomicLong();
        this.f51471n = new g(null, this, "replay.screen-at-start", this, "replay.screen-at-start");
        this.f51472o = new b(u.f52477c, this, "replay.id", this, "replay.id");
        this.f51473p = new c(-1, this, "segment.id", this, "segment.id");
        this.f51474q = new d(null, this, "replay.type", this, "replay.type");
        this.f51475r = new ConcurrentLinkedDeque();
        this.f51476s = new Object();
        this.f51477t = new ArrayList();
    }

    public static /* synthetic */ h.c n(a aVar, long j10, Date date, u uVar, int i10, int i11, int i12, int i13, int i14, G3.b bVar, io.sentry.android.replay.i iVar, String str, List list, Deque deque, int i15, Object obj) {
        Deque deque2;
        a aVar2;
        long j11;
        Date date2;
        u uVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
        }
        G3.b u10 = (i15 & 256) != 0 ? aVar.u() : bVar;
        io.sentry.android.replay.i iVar2 = (i15 & 512) != 0 ? aVar.f51467j : iVar;
        String v10 = (i15 & 1024) != 0 ? aVar.v() : str;
        List list2 = (i15 & 2048) != 0 ? null : list;
        if ((i15 & 4096) != 0) {
            deque2 = aVar.f51475r;
            aVar2 = aVar;
            date2 = date;
            uVar2 = uVar;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
            j11 = j10;
        } else {
            deque2 = deque;
            aVar2 = aVar;
            j11 = j10;
            date2 = date;
            uVar2 = uVar;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
        }
        return aVar2.m(j11, date2, uVar2, i16, i17, i18, i19, i20, u10, iVar2, v10, list2, deque2);
    }

    public void A(G3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f51474q.setValue(this, $$delegatedProperties[5], bVar);
    }

    public final void B(String str) {
        this.f51471n.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.h
    public u a() {
        return (u) this.f51472o.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void b(int i10) {
        this.f51473p.setValue(this, $$delegatedProperties[4], Integer.valueOf(i10));
    }

    @Override // io.sentry.android.replay.capture.h
    public int c() {
        return ((Number) this.f51473p.getValue(this, $$delegatedProperties[4])).intValue();
    }

    @Override // io.sentry.android.replay.capture.h
    public void d(MotionEvent event) {
        List a10;
        Intrinsics.checkNotNullParameter(event, "event");
        s r10 = r();
        if (r10 == null || (a10 = this.f51465h.a(event, r10)) == null) {
            return;
        }
        CollectionsKt.addAll(this.f51475r, a10);
    }

    @Override // io.sentry.android.replay.capture.h
    public void g(s recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        z(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void i(int i10, u replayId, G3.b bVar) {
        io.sentry.android.replay.i iVar;
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Function1 function1 = this.f51464g;
        if (function1 == null || (iVar = (io.sentry.android.replay.i) function1.invoke(replayId)) == null) {
            iVar = new io.sentry.android.replay.i(this.f51459b, replayId);
        }
        this.f51467j = iVar;
        y(replayId);
        b(i10);
        if (bVar == null) {
            bVar = this instanceof m ? G3.b.SESSION : G3.b.BUFFER;
        }
        A(bVar);
        j(AbstractC4779m.c());
        this.f51470m.set(this.f51461d.a());
    }

    @Override // io.sentry.android.replay.capture.h
    public void j(Date date) {
        this.f51469l.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(u traceId) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        if (Intrinsics.areEqual(traceId, u.f52477c)) {
            return;
        }
        synchronized (this.f51476s) {
            try {
                if (this.f51477t.size() < 100) {
                    String uVar = traceId.toString();
                    Intrinsics.checkNotNullExpressionValue(uVar, "toString(...)");
                    if (!this.f51477t.contains(uVar)) {
                        this.f51477t.add(uVar);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final h.c m(long j10, Date currentSegmentTimestamp, u replayId, int i10, int i11, int i12, int i13, int i14, G3.b replayType, io.sentry.android.replay.i iVar, String str, List list, Deque events) {
        List list2;
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        synchronized (this.f51476s) {
            list2 = CollectionsKt.toList(this.f51477t);
            this.f51477t.clear();
        }
        return h.f51567a.c(this.f51460c, this.f51459b, j10, currentSegmentTimestamp, replayId, i10, i11, i12, replayType, iVar, i13, i14, str, list, events, list2);
    }

    public final io.sentry.android.replay.i o() {
        return this.f51467j;
    }

    public final Deque p() {
        return this.f51475r;
    }

    @Override // io.sentry.android.replay.capture.h
    public void pause() {
    }

    public final ScheduledExecutorService q() {
        return this.f51463f;
    }

    public final s r() {
        return (s) this.f51468k.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void resume() {
        j(AbstractC4779m.c());
    }

    public final ScheduledExecutorService s() {
        return this.f51462e;
    }

    @Override // io.sentry.android.replay.capture.h
    public void stop() {
        io.sentry.android.replay.i iVar = this.f51467j;
        if (iVar != null) {
            iVar.close();
        }
        this.f51470m.set(0L);
        j(null);
        u EMPTY_ID = u.f52477c;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        y(EMPTY_ID);
    }

    public final AtomicLong t() {
        return this.f51470m;
    }

    public G3.b u() {
        return (G3.b) this.f51474q.getValue(this, $$delegatedProperties[5]);
    }

    public final String v() {
        return (String) this.f51471n.getValue(this, $$delegatedProperties[2]);
    }

    public Date w() {
        return (Date) this.f51469l.getValue(this, $$delegatedProperties[1]);
    }

    public final AtomicBoolean x() {
        return this.f51466i;
    }

    public void y(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.f51472o.setValue(this, $$delegatedProperties[3], uVar);
    }

    public final void z(s sVar) {
        this.f51468k.setValue(this, $$delegatedProperties[0], sVar);
    }
}
