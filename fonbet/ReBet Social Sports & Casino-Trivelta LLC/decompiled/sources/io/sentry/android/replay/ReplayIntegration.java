package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import com.facebook.react.uimanager.ViewProps;
import i3.C4527h;
import io.sentry.C4778l3;
import io.sentry.EnumC4774l;
import io.sentry.EnumC4788n3;
import io.sentry.F1;
import io.sentry.F3;
import io.sentry.G1;
import io.sentry.H3;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.J;
import io.sentry.N1;
import io.sentry.P;
import io.sentry.W0;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.i;
import io.sentry.android.replay.s;
import io.sentry.transport.z;
import io.sentry.util.AbstractC4851i;
import io.sentry.util.C4843a;
import java.io.Closeable;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lb.C5444x;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\\^`QBP\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001cJ\u0019\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u001f\u0010*\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u0010\u001cJ\u000f\u00100\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010\u001cJ\u0019\u00102\u001a\u00020\u001a2\b\u00101\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u001a2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000206H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010\u001cJ\u000f\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\b=\u0010.J\u0017\u0010?\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001aH\u0016¢\u0006\u0004\bA\u0010\u001cJ\u0017\u0010D\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001aH\u0016¢\u0006\u0004\bF\u0010\u001cJ\u0017\u0010I\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010V\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020SH\u0016¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR1\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010bR\u0016\u0010e\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010h\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010iR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010|\u001a\u00020x8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010{R#\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020~0}8\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\b\u007f\u0010t\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R$\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020~0}8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010t\u001a\u0006\b\u0084\u0001\u0010\u0081\u0001R \u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008e\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0088\u0001\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0094\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010\u0093\u0001R7\u0010\u0097\u0001\u001a!\u0012\u0014\u0012\u00120,¢\u0006\r\b\u0012\u0012\t\b\u0013\u0012\u0005\b\b(\u0095\u0001\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010bR\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010\u009d\u0001\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010aR\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R \u0010ª\u0001\u001a\u00020~8@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¦\u0001\u0010§\u0001*\u0006\b¨\u0001\u0010©\u0001R \u0010\u00ad\u0001\u001a\u00020~8@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b«\u0001\u0010§\u0001*\u0006\b¬\u0001\u0010©\u0001¨\u0006¯\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/u0;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/r;", "Lio/sentry/android/replay/gestures/c;", "Lio/sentry/G1;", "Lio/sentry/P$b;", "Lio/sentry/transport/z$b;", "Lio/sentry/android/replay/u;", "Landroid/content/Context;", "context", "Lio/sentry/transport/o;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/g;", "recorderProvider", "Lkotlin/Function1;", "Lio/sentry/protocol/u;", "Lkotlin/ParameterName;", "name", "replayId", "Lio/sentry/android/replay/i;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "(Landroid/content/Context;Lio/sentry/transport/o;)V", "", "n2", "()V", "l2", "a2", "m2", "o2", "", "unfinishedReplayId", "b2", "(Ljava/lang/String;)V", "d2", "Lio/sentry/e0;", "scopes", "Lio/sentry/F3;", "options", "J", "(Lio/sentry/e0;Lio/sentry/F3;)V", "", "j2", "()Z", ViewProps.START, "resume", "isTerminating", "A0", "(Ljava/lang/Boolean;)V", "r", "()Lio/sentry/protocol/u;", "Lio/sentry/F1;", "converter", "z0", "(Lio/sentry/F1;)V", "n1", "()Lio/sentry/F1;", "pause", "m1", "traceId", "k", "(Lio/sentry/protocol/u;)V", "stop", "Landroid/graphics/Bitmap;", "bitmap", "w0", "(Landroid/graphics/Bitmap;)V", "close", "Lio/sentry/P$a;", "status", "B", "(Lio/sentry/P$a;)V", "Lio/sentry/transport/z;", "rateLimiter", "D0", "(Lio/sentry/transport/z;)V", "Landroid/view/MotionEvent;", "event", W9.d.f13160a, "(Landroid/view/MotionEvent;)V", "", "width", "height", "U", "(II)V", "Lio/sentry/android/replay/s;", "config", "g", "(Lio/sentry/android/replay/s;)V", "a", "Landroid/content/Context;", com.google.crypto.tink.integration.android.b.f37029b, "Lio/sentry/transport/o;", "c", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", com.bumptech.glide.gifdecoder.e.f29601m, "Lio/sentry/P$a;", "lastKnownConnectionStatus", "f", "Z", "debugMaskingEnabled", "Lio/sentry/F3;", C4527h.f48087o, "Lio/sentry/e0;", com.google.android.material.shape.i.f35755A, "Lio/sentry/android/replay/g;", "recorder", "Lio/sentry/android/replay/gestures/a;", "j", "Lio/sentry/android/replay/gestures/a;", "gestureRecorder", "Lio/sentry/util/z;", "Lkotlin/Lazy;", "g2", "()Lio/sentry/util/z;", "random", "Lio/sentry/android/replay/p;", "l", "i2", "()Lio/sentry/android/replay/p;", "rootViewsSpy", "Lkotlin/Lazy;", "Lio/sentry/android/replay/util/l;", X9.m.f13664a, "getLazyReplayExecutor$sentry_android_replay_release", "()Lkotlin/Lazy;", "lazyReplayExecutor", "n", "getLazyPersistingExecutor$sentry_android_replay_release", "lazyPersistingExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "o", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "p", "isManualPause$sentry_android_replay_release", "isManualPause", "Lio/sentry/android/replay/capture/h;", "q", "Lio/sentry/android/replay/capture/h;", "captureStrategy", "Lio/sentry/F1;", "replayBreadcrumbConverter", "isFullSession", "s", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/h;", "t", "Lio/sentry/android/replay/util/h;", "mainLooperHandler", "u", "gestureRecorderProvider", "Lio/sentry/util/a;", "v", "Lio/sentry/util/a;", "lifecycleLock", "Lio/sentry/android/replay/m;", "w", "Lio/sentry/android/replay/m;", "lifecycle", "h2", "()Lio/sentry/android/replay/util/l;", "getReplayExecutor$sentry_android_replay_release$delegate", "(Lio/sentry/android/replay/ReplayIntegration;)Ljava/lang/Object;", "replayExecutor", "f2", "getPersistingExecutor$sentry_android_replay_release$delegate", "persistingExecutor", C5444x.f55808b, "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReplayIntegration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,590:1\n13309#2,2:591\n*S KotlinDebug\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n*L\n471#1:591,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ReplayIntegration implements InterfaceC4839u0, Closeable, r, io.sentry.android.replay.gestures.c, G1, P.b, z.b, u {

    /* renamed from: y, reason: collision with root package name */
    public static final int f51409y = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final io.sentry.transport.o dateProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Function0 recorderProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Function1 replayCacheProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile P.a lastKnownConnectionStatus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean debugMaskingEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public F3 options;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public InterfaceC4740e0 scopes;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public io.sentry.android.replay.g recorder;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public io.sentry.android.replay.gestures.a gestureRecorder;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final Lazy random;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Lazy rootViewsSpy;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final Lazy lazyReplayExecutor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Lazy lazyPersistingExecutor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean isEnabled;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean isManualPause;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public io.sentry.android.replay.capture.h captureStrategy;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public F1 replayBreadcrumbConverter;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Function1 replayCaptureStrategyProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public io.sentry.android.replay.util.h mainLooperHandler;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public Function0 gestureRecorderProvider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final C4843a lifecycleLock;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final m lifecycle;

    public static final class b implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean b() {
            return false;
        }
    }

    public static final class c implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f51433a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            Intrinsics.checkNotNullParameter(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayIntegration-");
            int i10 = this.f51433a;
            this.f51433a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f51434a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            Intrinsics.checkNotNullParameter(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayPersister-");
            int i10 = this.f51434a;
            this.f51434a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(Date newTimestamp) {
            Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
            io.sentry.android.replay.capture.h hVar = ReplayIntegration.this.captureStrategy;
            if (hVar != null) {
                io.sentry.android.replay.capture.h hVar2 = ReplayIntegration.this.captureStrategy;
                Integer valueOf = hVar2 != null ? Integer.valueOf(hVar2.c()) : null;
                Intrinsics.checkNotNull(valueOf);
                hVar.b(valueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.h hVar3 = ReplayIntegration.this.captureStrategy;
            if (hVar3 == null) {
                return;
            }
            hVar3.j(newTimestamp);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Date) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.replay.util.l invoke() {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new d());
            Intrinsics.checkNotNull(newSingleThreadScheduledExecutor);
            F3 f32 = ReplayIntegration.this.options;
            if (f32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                f32 = null;
            }
            return new io.sentry.android.replay.util.l(newSingleThreadScheduledExecutor, f32);
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.replay.util.l invoke() {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new c());
            Intrinsics.checkNotNull(newSingleThreadScheduledExecutor);
            F3 f32 = ReplayIntegration.this.options;
            if (f32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                f32 = null;
            }
            return new io.sentry.android.replay.util.l(newSingleThreadScheduledExecutor, f32);
        }
    }

    public static final class h extends Lambda implements Function2 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Bitmap f51439e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f51440f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Bitmap bitmap, Ref.ObjectRef objectRef) {
            super(2);
            this.f51439e = bitmap;
            this.f51440f = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(io.sentry.android.replay.i onScreenshotRecorded, long j10) {
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            F3 f32 = ReplayIntegration.this.options;
            if (f32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                f32 = null;
            }
            f32.getSessionReplay().n();
            onScreenshotRecorded.U(this.f51439e, j10, (String) this.f51440f.element);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((io.sentry.android.replay.i) obj, ((Number) obj2).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f51441d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.sentry.util.z invoke() {
            return new io.sentry.util.z();
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f51442d = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return p.f51645e.b();
        }
    }

    static {
        C4778l3.d().b("maven:io.sentry:sentry-android-replay", "8.48.0");
    }

    public ReplayIntegration(Context context, io.sentry.transport.o dateProvider, Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.replayCacheProvider = function1;
        this.lastKnownConnectionStatus = P.a.UNKNOWN;
        this.random = LazyKt.lazy(i.f51441d);
        this.rootViewsSpy = LazyKt.lazy(j.f51442d);
        this.lazyReplayExecutor = LazyKt.lazy(new g());
        this.lazyPersistingExecutor = LazyKt.lazy(new f());
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        W0 b10 = W0.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getInstance(...)");
        this.replayBreadcrumbConverter = b10;
        this.mainLooperHandler = new io.sentry.android.replay.util.h(null, 1, null);
        this.lifecycleLock = new C4843a();
        this.lifecycle = new m();
    }

    public static /* synthetic */ void c2(ReplayIntegration replayIntegration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        replayIntegration.b2(str);
    }

    public static final void e2(ReplayIntegration replayIntegration) {
        F3 f32;
        h.c c10;
        F3 f33 = replayIntegration.options;
        if (f33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            f33 = null;
        }
        io.sentry.cache.t findPersistingScopeObserver = f33.findPersistingScopeObserver();
        if (findPersistingScopeObserver != null) {
            F3 f34 = replayIntegration.options;
            if (f34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                f34 = null;
            }
            String str = (String) findPersistingScopeObserver.C(f34, "replay.json", String.class);
            if (str != null) {
                io.sentry.protocol.u uVar = new io.sentry.protocol.u(str);
                if (Intrinsics.areEqual(uVar, io.sentry.protocol.u.f52477c)) {
                    c2(replayIntegration, null, 1, null);
                    return;
                }
                i.a aVar = io.sentry.android.replay.i.f51619l;
                F3 f35 = replayIntegration.options;
                if (f35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    f35 = null;
                }
                io.sentry.android.replay.d c11 = aVar.c(f35, uVar, replayIntegration.replayCacheProvider);
                if (c11 == null) {
                    c2(replayIntegration, null, 1, null);
                    return;
                }
                F3 f36 = replayIntegration.options;
                if (f36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    f36 = null;
                }
                Object C10 = findPersistingScopeObserver.C(f36, "breadcrumbs.json", List.class);
                List list = C10 instanceof List ? (List) C10 : null;
                h.a aVar2 = io.sentry.android.replay.capture.h.f51567a;
                InterfaceC4740e0 interfaceC4740e0 = replayIntegration.scopes;
                F3 f37 = replayIntegration.options;
                if (f37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    f32 = null;
                } else {
                    f32 = f37;
                }
                c10 = aVar2.c(interfaceC4740e0, f32, c11.b(), c11.h(), uVar, c11.d(), c11.e().c(), c11.e().d(), c11.f(), c11.a(), c11.e().b(), c11.e().a(), c11.g(), list, new LinkedList(c11.c()), (r37 & 32768) != 0 ? CollectionsKt.emptyList() : null);
                if (c10 instanceof h.c.a) {
                    J c12 = io.sentry.util.l.c(new b());
                    InterfaceC4740e0 interfaceC4740e02 = replayIntegration.scopes;
                    Intrinsics.checkNotNull(c12);
                    ((h.c.a) c10).a(interfaceC4740e02, c12);
                }
                replayIntegration.b2(str);
                return;
            }
        }
        c2(replayIntegration, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k2(Ref.ObjectRef objectRef, InterfaceC4730c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String b10 = it.b();
        objectRef.element = b10 != null ? StringsKt.substringAfterLast$default(b10, '.', (String) null, 2, (Object) null) : 0;
    }

    @Override // io.sentry.G1
    public void A0(Boolean isTerminating) {
        if (this.isEnabled.get() && j2()) {
            io.sentry.protocol.u uVar = io.sentry.protocol.u.f52477c;
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            F3 f32 = null;
            if (uVar.equals(hVar != null ? hVar.a() : null)) {
                F3 f33 = this.options;
                if (f33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    f32 = f33;
                }
                f32.getLogger().c(EnumC4788n3.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.h hVar2 = this.captureStrategy;
            if (hVar2 != null) {
                hVar2.e(Intrinsics.areEqual(isTerminating, Boolean.TRUE), new e());
            }
            io.sentry.android.replay.capture.h hVar3 = this.captureStrategy;
            this.captureStrategy = hVar3 != null ? hVar3.h() : null;
        }
    }

    @Override // io.sentry.P.b
    public void B(P.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.lastKnownConnectionStatus = status;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (status == P.a.DISCONNECTED) {
                l2();
            } else {
                n2();
            }
        }
    }

    @Override // io.sentry.transport.z.b
    public void D0(io.sentry.transport.z rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (rateLimiter.A0(EnumC4774l.All) || rateLimiter.A0(EnumC4774l.Replay)) {
                l2();
            } else {
                n2();
            }
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 scopes, F3 options) {
        ReplayIntegration replayIntegration;
        F3 f32;
        io.sentry.android.replay.g xVar;
        io.sentry.android.replay.gestures.a aVar;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().c(EnumC4788n3.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        if (!options.getSessionReplay().E() && !options.getSessionReplay().F()) {
            options.getLogger().c(EnumC4788n3.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        Function0 function0 = this.recorderProvider;
        if (function0 == null || (xVar = (io.sentry.android.replay.g) function0.invoke()) == null) {
            replayIntegration = this;
            f32 = options;
            xVar = new x(f32, replayIntegration, this, this.mainLooperHandler, h2());
        } else {
            replayIntegration = this;
            f32 = options;
        }
        replayIntegration.recorder = xVar;
        Function0 function02 = replayIntegration.gestureRecorderProvider;
        if (function02 == null || (aVar = (io.sentry.android.replay.gestures.a) function02.invoke()) == null) {
            aVar = new io.sentry.android.replay.gestures.a(f32, this);
        }
        replayIntegration.gestureRecorder = aVar;
        replayIntegration.isEnabled.set(true);
        f32.getConnectionStatusProvider().x1(this);
        io.sentry.transport.z e10 = scopes.e();
        if (e10 != null) {
            e10.J(this);
        }
        io.sentry.util.n.a("Replay");
        d2();
    }

    @Override // io.sentry.android.replay.u
    public void U(int width, int height) {
        if (this.isEnabled.get() && j2()) {
            F3 f32 = this.options;
            F3 f33 = null;
            if (f32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                f32 = null;
            }
            if (f32.getSessionReplay().G()) {
                s.a aVar = s.f51663g;
                Context context = this.context;
                F3 f34 = this.options;
                if (f34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    f33 = f34;
                }
                H3 sessionReplay = f33.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                g(aVar.b(context, sessionReplay, width, height));
            }
        }
    }

    public final void a2() {
        InterfaceC4740e0 interfaceC4740e0;
        InterfaceC4740e0 interfaceC4740e02;
        io.sentry.transport.z e10;
        io.sentry.transport.z e11;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (this.lastKnownConnectionStatus == P.a.DISCONNECTED || !(((interfaceC4740e0 = this.scopes) == null || (e11 = interfaceC4740e0.e()) == null || !e11.A0(EnumC4774l.All)) && ((interfaceC4740e02 = this.scopes) == null || (e10 = interfaceC4740e02.e()) == null || !e10.A0(EnumC4774l.Replay)))) {
                l2();
            }
        }
    }

    public final void b2(String unfinishedReplayId) {
        File[] listFiles;
        F3 f32 = this.options;
        if (f32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            f32 = null;
        }
        String cacheDirPath = f32.getCacheDirPath();
        if (cacheDirPath == null || (listFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        Intrinsics.checkNotNull(listFiles);
        for (File file : listFiles) {
            String name = file.getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt.startsWith$default(name, "replay_", false, 2, (Object) null)) {
                String uVar = r().toString();
                Intrinsics.checkNotNullExpressionValue(uVar, "toString(...)");
                if (!StringsKt.contains$default((CharSequence) name, (CharSequence) uVar, false, 2, (Object) null) && (StringsKt.isBlank(unfinishedReplayId) || !StringsKt.contains$default((CharSequence) name, (CharSequence) unfinishedReplayId, false, 2, (Object) null))) {
                    AbstractC4851i.a(file);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.transport.z e10;
        InterfaceC4765j0 d10 = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.CLOSED;
                if (mVar.b(nVar)) {
                    F3 f32 = this.options;
                    if (f32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        f32 = null;
                    }
                    f32.getConnectionStatusProvider().J1(this);
                    InterfaceC4740e0 interfaceC4740e0 = this.scopes;
                    if (interfaceC4740e0 != null && (e10 = interfaceC4740e0.e()) != null) {
                        e10.Y1(this);
                    }
                    stop();
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.close();
                    }
                    this.recorder = null;
                    i2().close();
                    if (this.lazyReplayExecutor.isInitialized()) {
                        F3 f33 = this.options;
                        if (f33 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("options");
                            f33 = null;
                        }
                        if (f33.getThreadChecker().a()) {
                            h2().k();
                        } else {
                            h2().shutdown();
                        }
                    }
                    if (this.lazyPersistingExecutor.isInitialized()) {
                        F3 f34 = this.options;
                        if (f34 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("options");
                            f34 = null;
                        }
                        if (f34.getThreadChecker().a()) {
                            f2().k();
                        } else {
                            f2().shutdown();
                        }
                    }
                    this.lifecycle.d(nVar);
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(d10, null);
                    return;
                }
            }
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.gestures.c
    public void d(MotionEvent event) {
        io.sentry.android.replay.capture.h hVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isEnabled.get() && this.lifecycle.c() && (hVar = this.captureStrategy) != null) {
            hVar.d(event);
        }
    }

    public final void d2() {
        F3 f32 = this.options;
        F3 f33 = null;
        if (f32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            f32 = null;
        }
        InterfaceC4760i0 executorService = f32.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        F3 f34 = this.options;
        if (f34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
        } else {
            f33 = f34;
        }
        io.sentry.android.replay.util.e.b(executorService, f33, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.k
            @Override // java.lang.Runnable
            public final void run() {
                ReplayIntegration.e2(ReplayIntegration.this);
            }
        });
    }

    public final io.sentry.android.replay.util.l f2() {
        return (io.sentry.android.replay.util.l) this.lazyPersistingExecutor.getValue();
    }

    public final void g(s config) {
        io.sentry.android.replay.g gVar;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.isEnabled.get() && j2()) {
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                hVar.g(config);
            }
            io.sentry.android.replay.g gVar2 = this.recorder;
            if (gVar2 != null) {
                gVar2.g(config);
            }
            if (this.lifecycle.a() != n.PAUSED || (gVar = this.recorder) == null) {
                return;
            }
            gVar.pause();
        }
    }

    public final io.sentry.util.z g2() {
        return (io.sentry.util.z) this.random.getValue();
    }

    public final io.sentry.android.replay.util.l h2() {
        return (io.sentry.android.replay.util.l) this.lazyReplayExecutor.getValue();
    }

    public final p i2() {
        return (p) this.rootViewsSpy.getValue();
    }

    public boolean j2() {
        return this.lifecycle.a().compareTo(n.STARTED) >= 0 && this.lifecycle.a().compareTo(n.STOPPED) < 0;
    }

    @Override // io.sentry.G1
    public void k(io.sentry.protocol.u traceId) {
        io.sentry.android.replay.capture.h hVar;
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        if (this.isEnabled.get() && j2() && (hVar = this.captureStrategy) != null) {
            hVar.k(traceId);
        }
    }

    public final void l2() {
        InterfaceC4765j0 d10 = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.PAUSED;
                if (mVar.b(nVar)) {
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.pause();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.pause();
                    }
                    this.lifecycle.d(nVar);
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(d10, null);
                    return;
                }
            }
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    @Override // io.sentry.G1
    /* renamed from: m1, reason: from getter */
    public boolean getDebugMaskingEnabled() {
        return this.debugMaskingEnabled;
    }

    public final void m2() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList B10 = i2().B();
            io.sentry.android.replay.g gVar = this.recorder;
            Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            B10.add((io.sentry.android.replay.e) gVar);
        }
        i2().B().add(this.gestureRecorder);
    }

    @Override // io.sentry.G1
    /* renamed from: n1, reason: from getter */
    public F1 getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final void n2() {
        InterfaceC4740e0 interfaceC4740e0;
        InterfaceC4740e0 interfaceC4740e02;
        io.sentry.transport.z e10;
        io.sentry.transport.z e11;
        InterfaceC4765j0 d10 = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.RESUMED;
                if (mVar.b(nVar)) {
                    if (!this.isManualPause.get() && this.lastKnownConnectionStatus != P.a.DISCONNECTED && (((interfaceC4740e0 = this.scopes) == null || (e11 = interfaceC4740e0.e()) == null || !e11.A0(EnumC4774l.All)) && ((interfaceC4740e02 = this.scopes) == null || (e10 = interfaceC4740e02.e()) == null || !e10.A0(EnumC4774l.Replay)))) {
                        this.lifecycle.d(nVar);
                        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                        if (hVar != null) {
                            hVar.resume();
                        }
                        io.sentry.android.replay.g gVar = this.recorder;
                        if (gVar != null) {
                            gVar.resume();
                            Unit unit = Unit.INSTANCE;
                        }
                        AutoCloseableKt.closeFinally(d10, null);
                        return;
                    }
                    AutoCloseableKt.closeFinally(d10, null);
                    return;
                }
            }
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    public final void o2() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList B10 = i2().B();
            io.sentry.android.replay.g gVar = this.recorder;
            Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            B10.remove((io.sentry.android.replay.e) gVar);
        }
        i2().B().remove(this.gestureRecorder);
    }

    @Override // io.sentry.G1
    public void pause() {
        this.isManualPause.set(true);
        l2();
    }

    @Override // io.sentry.G1
    public io.sentry.protocol.u r() {
        io.sentry.protocol.u a10;
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null && (a10 = hVar.a()) != null) {
            return a10;
        }
        io.sentry.protocol.u EMPTY_ID = io.sentry.protocol.u.f52477c;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @Override // io.sentry.G1
    public void resume() {
        this.isManualPause.set(false);
        n2();
    }

    @Override // io.sentry.G1
    public void start() {
        io.sentry.android.replay.capture.h fVar;
        F3 f32;
        F3 f33;
        InterfaceC4765j0 d10 = this.lifecycleLock.d();
        try {
            if (!this.isEnabled.get()) {
                AutoCloseableKt.closeFinally(d10, null);
                return;
            }
            m mVar = this.lifecycle;
            n nVar = n.STARTED;
            if (!mVar.b(nVar)) {
                F3 f34 = this.options;
                if (f34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    f34 = null;
                }
                f34.getLogger().c(EnumC4788n3.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                AutoCloseableKt.closeFinally(d10, null);
                return;
            }
            io.sentry.util.z g22 = g2();
            F3 f35 = this.options;
            if (f35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                f35 = null;
            }
            boolean a10 = io.sentry.android.replay.util.n.a(g22, f35.getSessionReplay().z());
            if (!a10) {
                F3 f36 = this.options;
                if (f36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    f36 = null;
                }
                if (!f36.getSessionReplay().F()) {
                    F3 f37 = this.options;
                    if (f37 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        f37 = null;
                    }
                    f37.getLogger().c(EnumC4788n3.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    AutoCloseableKt.closeFinally(d10, null);
                    return;
                }
            }
            this.lifecycle.d(nVar);
            Function1 function1 = this.replayCaptureStrategyProvider;
            if (function1 == null || (fVar = (io.sentry.android.replay.capture.h) function1.invoke(Boolean.valueOf(a10))) == null) {
                if (a10) {
                    F3 f38 = this.options;
                    if (f38 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        f33 = null;
                    } else {
                        f33 = f38;
                    }
                    fVar = new io.sentry.android.replay.capture.m(f33, this.scopes, this.dateProvider, h2(), f2(), this.replayCacheProvider);
                } else {
                    F3 f39 = this.options;
                    if (f39 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        f32 = null;
                    } else {
                        f32 = f39;
                    }
                    fVar = new io.sentry.android.replay.capture.f(f32, this.scopes, this.dateProvider, g2(), h2(), f2(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = fVar;
            io.sentry.android.replay.g gVar = this.recorder;
            if (gVar != null) {
                gVar.start();
            }
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                h.b.a(hVar, 0, null, null, 7, null);
            }
            m2();
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(d10, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.G1
    public void stop() {
        InterfaceC4765j0 d10 = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.STOPPED;
                if (mVar.b(nVar)) {
                    o2();
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.reset();
                    }
                    io.sentry.android.replay.g gVar2 = this.recorder;
                    if (gVar2 != null) {
                        gVar2.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.gestureRecorder;
                    if (aVar != null) {
                        aVar.b();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.d(nVar);
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(d10, null);
                    return;
                }
            }
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.r
    public void w0(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC4740e0 interfaceC4740e0 = this.scopes;
        if (interfaceC4740e0 != null) {
            interfaceC4740e0.l(new N1() { // from class: io.sentry.android.replay.l
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    ReplayIntegration.k2(Ref.ObjectRef.this, interfaceC4730c0);
                }
            });
        }
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null) {
            hVar.f(bitmap, new h(bitmap, objectRef));
        }
        a2();
    }

    @Override // io.sentry.G1
    public void z0(F1 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, io.sentry.transport.o dateProvider) {
        this(io.sentry.android.replay.util.b.a(context), dateProvider, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }
}
