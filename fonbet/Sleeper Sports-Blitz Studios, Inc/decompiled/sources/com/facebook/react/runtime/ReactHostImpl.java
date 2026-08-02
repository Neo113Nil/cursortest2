package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.common.logging.FLog;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.MemoryPressureRouter;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.devsupport.DefaultDevSupportManagerFactory;
import com.facebook.react.devsupport.DevMenuConfiguration;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.FrameTimingSequence;
import com.facebook.react.devsupport.inspector.FrameTimingsObserver;
import com.facebook.react.devsupport.inspector.InspectorNetworkHelper;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.devsupport.inspector.TracingStateListener;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.runtime.BridgelessAtomicRef;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.BlackHoleEventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ReactHostImpl.kt */
@Metadata(d1 = {"\u0000\u0092\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u008b\u00022\u00020\u0001:\u0004\u008a\u0002\u008b\u0002BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0013J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LH\u0016J\u001b\u0010N\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010O\u001a\u00020 H\u0000¢\u0006\u0002\bPJ\u001b\u0010Q\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010O\u001a\u00020 H\u0000¢\u0006\u0002\bRJ\u001b\u0010S\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010O\u001a\u00020 H\u0000¢\u0006\u0002\bTJ\u001c\u0010U\u001a\u00020=2\b\u0010*\u001a\u0004\u0018\u00010,2\b\u0010V\u001a\u0004\u0018\u000107H\u0017J\u0012\u0010U\u001a\u00020=2\b\u0010*\u001a\u0004\u0018\u00010,H\u0017J\u0012\u0010W\u001a\u00020=2\b\u0010*\u001a\u0004\u0018\u00010,H\u0017J\u0012\u0010X\u001a\u00020=2\b\u0010*\u001a\u0004\u0018\u00010,H\u0017J\b\u0010X\u001a\u00020=H\u0017J\b\u0010Y\u001a\u00020=H\u0017J\u0012\u0010Y\u001a\u00020=2\b\u0010*\u001a\u0004\u0018\u00010,H\u0017J\u0010\u0010Z\u001a\u00020=2\u0006\u0010[\u001a\u00020\fH\u0002J\"\u0010`\u001a\u00020a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J\b\u0010i\u001a\u00020\fH\u0017J\u0010\u0010n\u001a\u00020=2\u0006\u0010o\u001a\u00020:H\u0016J\u0010\u0010p\u001a\u00020=2\u0006\u0010o\u001a\u00020:H\u0016J\u0010\u0010q\u001a\u00020=2\u0006\u0010r\u001a\u00020sH\u0016J\u0016\u0010t\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010u\u001a\u00020cH\u0016J\u0012\u0010v\u001a\u00020=2\b\u0010w\u001a\u0004\u0018\u00010cH\u0003J\u0018\u0010|\u001a\u00020=2\u0006\u0010}\u001a\u00020c2\u0006\u0010o\u001a\u00020~H\u0003JQ\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010u\u001a\u00020c2\u0011\u0010\u0080\u0001\u001a\f\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`\u0082\u00012&\u0010\u0083\u0001\u001a!\u0012\u0016\u0012\u00140\f¢\u0006\u000f\b\u0085\u0001\u0012\n\b\u0086\u0001\u0012\u0005\b\b(\u0087\u0001\u0012\u0004\u0012\u00020=0\u0084\u0001H\u0016J)\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010u\u001a\u00020c2\u0011\u0010\u0080\u0001\u001a\f\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`\u0082\u0001H\u0016J\u0011\u0010\u0088\u0001\u001a\u0002052\u0006\u0010%\u001a\u00020$H\u0002J,\u0010\u0098\u0001\u001a\u00020\f\"\n\b\u0000\u0010\u0099\u0001*\u00030\u009a\u00012\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0099\u00010\u009c\u0001H\u0000¢\u0006\u0003\b\u009d\u0001J2\u0010¢\u0001\u001a\u0005\u0018\u0001H\u0099\u0001\"\n\b\u0000\u0010\u0099\u0001*\u00030\u009a\u00012\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0099\u00010\u009c\u0001H\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010\u009a\u00012\u0007\u0010¥\u0001\u001a\u00020cH\u0000¢\u0006\u0003\b£\u0001J/\u0010®\u0001\u001a\u00020=2\u0006\u0010*\u001a\u00020,2\u0007\u0010¯\u0001\u001a\u00020)2\u0007\u0010°\u0001\u001a\u00020)2\n\u0010±\u0001\u001a\u0005\u0018\u00010²\u0001H\u0017J\u0012\u0010³\u0001\u001a\u00020=2\u0007\u0010´\u0001\u001a\u00020\fH\u0017J\u0013\u0010µ\u0001\u001a\u00020=2\b\u0010¶\u0001\u001a\u00030²\u0001H\u0017J\u0012\u0010·\u0001\u001a\u00020=2\u0007\u0010¸\u0001\u001a\u00020cH\u0017JH\u0010·\u0001\u001a\u00020=2\u0007\u0010¹\u0001\u001a\u00020c2\u0006\u0010b\u001a\u00020c2,\u0010º\u0001\u001a'\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020c0y\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020c0y0\u0084\u0001H\u0017J\u0011\u0010»\u0001\u001a\u00020=2\u0006\u0010\u0002\u001a\u00020\u0003H\u0017J\u001f\u0010Ã\u0001\u001a\b\u0012\u0004\u0012\u00020\f0#2\b\u0010Ä\u0001\u001a\u00030Å\u0001H\u0000¢\u0006\u0003\bÆ\u0001J3\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\f0#2\u0007\u0010È\u0001\u001a\u00020)2\u0007\u0010É\u0001\u001a\u00020c2\n\u0010Ê\u0001\u001a\u0005\u0018\u00010Ë\u0001H\u0000¢\u0006\u0003\bÌ\u0001J\u001e\u0010Í\u0001\u001a\u00020=2\r\u0010Î\u0001\u001a\b0\u0081\u0001j\u0003`\u0082\u0001H\u0000¢\u0006\u0003\bÏ\u0001J0\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\f0#2\u0006\u0010b\u001a\u00020c2\u0007\u0010Ñ\u0001\u001a\u00020c2\b\u0010Ò\u0001\u001a\u00030Ó\u0001H\u0000¢\u0006\u0003\bÔ\u0001J\u0017\u0010Õ\u0001\u001a\u00020=2\u0006\u0010O\u001a\u00020 H\u0000¢\u0006\u0003\bÖ\u0001J\u0017\u0010×\u0001\u001a\u00020=2\u0006\u0010O\u001a\u00020 H\u0000¢\u0006\u0003\bØ\u0001J\u0017\u0010Ù\u0001\u001a\u00020\f2\u0006\u0010O\u001a\u00020 H\u0000¢\u0006\u0003\bÚ\u0001J\u0017\u0010Û\u0001\u001a\u00020\f2\u0006\u0010b\u001a\u00020cH\u0000¢\u0006\u0003\bÜ\u0001J\u0018\u0010Ý\u0001\u001a\u00020=2\r\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u00020=0<H\u0016J\u0018\u0010ß\u0001\u001a\u00020=2\r\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u00020=0<H\u0016J\u000f\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020M0#H\u0003J\u0014\u0010â\u0001\u001a\u00020=2\t\u0010ã\u0001\u001a\u0004\u0018\u00010]H\u0003J(\u0010ä\u0001\u001a\u00020=2\u0007\u0010å\u0001\u001a\u00020c2\u0006\u0010w\u001a\u00020c2\f\b\u0002\u0010æ\u0001\u001a\u0005\u0018\u00010ç\u0001H\u0002JJ\u0010è\u0001\u001a\b\u0012\u0004\u0012\u00020\f0#2\u0007\u0010å\u0001\u001a\u00020c2\t\b\u0002\u0010é\u0001\u001a\u00020\t2%\u0010ê\u0001\u001a \u0012\u0015\u0012\u00130$¢\u0006\u000e\b\u0085\u0001\u0012\t\b\u0086\u0001\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020=0\u0084\u0001H\u0002JJ\u0010ë\u0001\u001a\b\u0012\u0004\u0012\u00020M0#2\u0007\u0010å\u0001\u001a\u00020c2\t\b\u0002\u0010é\u0001\u001a\u00020\t2%\u0010ê\u0001\u001a \u0012\u0015\u0012\u00130$¢\u0006\u000e\b\u0085\u0001\u0012\t\b\u0086\u0001\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020=0\u0084\u0001H\u0002J\u000f\u0010ì\u0001\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u000f\u0010í\u0001\u001a\b\u0012\u0004\u0012\u00020$0#H\u0003J!\u0010î\u0001\u001a\b\u0012\u0004\u0012\u00020$0#2\u0007\u0010ï\u0001\u001a\u00020)2\u0007\u0010ð\u0001\u001a\u00020)H\u0003J\u000f\u0010ñ\u0001\u001a\b\u0012\u0004\u0012\u00020$0#H\u0003J\u0010\u0010ö\u0001\u001a\t\u0012\u0005\u0012\u00030Å\u00010#H\u0002J\u001a\u0010÷\u0001\u001a\u00020=2\u0007\u0010ø\u0001\u001a\u00020c2\u0006\u0010%\u001a\u00020$H\u0002J\u001a\u0010ù\u0001\u001a\u00020=2\u0007\u0010ø\u0001\u001a\u00020c2\u0006\u0010%\u001a\u00020$H\u0002Jb\u0010û\u0001\u001aA\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020$0#¢\u0006\u000f\b\u0085\u0001\u0012\n\b\u0086\u0001\u0012\u0005\b\b(ý\u0001\u0012\u0016\u0012\u00140c¢\u0006\u000f\b\u0085\u0001\u0012\n\b\u0086\u0001\u0012\u0005\b\b(þ\u0001\u0012\u0006\u0012\u0004\u0018\u00010$0ü\u00012\u0007\u0010ÿ\u0001\u001a\u00020c2\u0007\u0010ø\u0001\u001a\u00020c2\u0006\u0010u\u001a\u00020cH\u0002J\u0017\u0010\u0080\u0002\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010u\u001a\u00020cH\u0003J*\u0010\u0082\u0002\u001a\b\u0012\u0004\u0012\u00020M0#2\u0006\u0010u\u001a\u00020c2\u0011\u0010\u0080\u0001\u001a\f\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`\u0082\u0001H\u0003J\u0011\u0010\u0083\u0002\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0003\b\u0084\u0002J\t\u0010\u0085\u0002\u001a\u00020?H\u0002J\t\u0010\u0086\u0002\u001a\u00020=H\u0002J\u0019\u0010\u0087\u0002\u001a\u00020=2\b\u0010%\u001a\u0004\u0018\u00010$H\u0001¢\u0006\u0003\b\u0088\u0002J\t\u0010\u0089\u0002\u001a\u00020=H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010-\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010, /*\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010.0.0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<09X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010G\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010\\\u001a\u0004\u0018\u00010]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010f\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0016\u0010j\u001a\u0004\u0018\u00010k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\"\u0010x\u001a\u0010\u0012\u0004\u0012\u00020c\u0012\u0006\u0012\u0004\u0018\u00010c0y8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R-\u0010\u0089\u0001\u001a\u0004\u0018\u00010,2\b\u0010*\u001a\u0004\u0018\u00010,8@@BX\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u0004\u0018\u00010,8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u0091\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001f\u0010\u009e\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u009f\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u001a\u0010¦\u0001\u001a\u0005\u0018\u00010§\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010ª\u0001\u001a\u0005\u0018\u00010«\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010¼\u0001\u001a\u0005\u0018\u00010½\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010À\u0001\u001a\u0002078@X\u0080\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001b\u0010à\u0001\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001e\u0010ò\u0001\u001a\t\u0012\u0005\u0012\u00030Å\u00010#8BX\u0082\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ô\u0001R\u001d\u0010õ\u0001\u001a\b\u0012\u0004\u0012\u00020\f0#8BX\u0082\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010ô\u0001R\u001b\u0010ú\u0001\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0081\u0002\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u008c\u0002"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl;", "Lcom/facebook/react/ReactHost;", "context", "Landroid/content/Context;", "reactHostDelegate", "Lcom/facebook/react/runtime/ReactHostDelegate;", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "bgExecutor", "Ljava/util/concurrent/Executor;", "uiExecutor", "allowPackagerServerAccess", "", "useDevSupport", "devSupportManagerFactory", "Lcom/facebook/react/devsupport/DevSupportManagerFactory;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLcom/facebook/react/devsupport/DevSupportManagerFactory;)V", "delegate", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostDelegate;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V", "reactHostImplDevHelper", "Lcom/facebook/react/runtime/ReactHostImplDevHelper;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "memoryPressureRouter", "Lcom/facebook/react/MemoryPressureRouter;", "getMemoryPressureRouter", "()Lcom/facebook/react/MemoryPressureRouter;", "attachedSurfaces", "", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "createReactInstanceTaskRef", "Lcom/facebook/react/runtime/BridgelessAtomicRef;", "Lcom/facebook/react/runtime/internal/bolts/Task;", "Lcom/facebook/react/runtime/ReactInstance;", "reactInstance", "bridgelessReactContextRef", "Lcom/facebook/react/runtime/BridgelessReactContext;", "id", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/app/Activity;", "lastUsedActivityRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "stateTracker", "Lcom/facebook/react/runtime/ReactHostStateTracker;", "reactLifecycleStateManager", "Lcom/facebook/react/runtime/ReactLifecycleStateManager;", "memoryPressureListener", "Lcom/facebook/react/bridge/MemoryPressureListener;", "defaultHardwareBackBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "reactInstanceEventListeners", "", "Lcom/facebook/react/ReactInstanceEventListener;", "beforeDestroyListeners", "Lkotlin/Function0;", "", "reactHostInspectorTarget", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getReactHostInspectorTarget$ReactAndroid_release", "()Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "setReactHostInspectorTarget$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactHostInspectorTarget;)V", "frameTimingsObserver", "Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "hostInvalidated", "lifecycleState", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "start", "Lcom/facebook/react/interfaces/TaskInterface;", "Ljava/lang/Void;", "prerenderSurface", "surface", "prerenderSurface$ReactAndroid_release", "startSurface", "startSurface$ReactAndroid_release", "stopSurface", "stopSurface$ReactAndroid_release", "onHostResume", "defaultBackButtonImpl", "onHostLeaveHint", "onHostPause", "onHostDestroy", "maybeEnableDevSupport", "enabled", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "createSurface", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "moduleName", "", "initialProps", "Landroid/os/Bundle;", "isInstanceInitialized", "isInstanceInitialized$ReactAndroid_release", "()Z", "onBackPressed", "reactQueueConfiguration", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "addReactInstanceEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeReactInstanceEventListener", "setDevMenuConfiguration", AnalyticsConstantsKt.KEY_CONFIG, "Lcom/facebook/react/devsupport/DevMenuConfiguration;", "reload", DiscardedEvent.JsonKeys.REASON, "setPausedInDebuggerMessage", "message", "hostMetadata", "", "getHostMetadata", "()Ljava/util/Map;", "loadNetworkResource", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "destroy", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDestroyFinished", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "instanceDestroyedSuccessfully", "createMemoryPressureListener", "currentActivity", "getCurrentActivity$ReactAndroid_release", "()Landroid/app/Activity;", "setCurrentActivity", "(Landroid/app/Activity;)V", "lastUsedActivity", "getLastUsedActivity$ReactAndroid_release", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "uiManager", "Lcom/facebook/react/fabric/FabricUIManager;", "getUiManager$ReactAndroid_release", "()Lcom/facebook/react/fabric/FabricUIManager;", "hasNativeModule", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/react/bridge/NativeModule;", "nativeModuleInterface", "Ljava/lang/Class;", "hasNativeModule$ReactAndroid_release", "nativeModules", "", "getNativeModules$ReactAndroid_release", "()Ljava/util/Collection;", "getNativeModule", "getNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "nativeModuleName", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor$ReactAndroid_release", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "jsCallInvokerHolder", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJsCallInvokerHolder$ReactAndroid_release", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onWindowFocusChange", "hasFocus", "onNewIntent", SDKConstants.PARAM_INTENT, "setBundleSource", "filePath", "debugServerHost", "queryMapper", "onConfigurationChanged", "javaScriptContextHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder$ReactAndroid_release", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "defaultBackButtonHandler", "getDefaultBackButtonHandler$ReactAndroid_release", "()Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "loadBundle", "bundleLoader", "Lcom/facebook/react/bridge/JSBundleLoader;", "loadBundle$ReactAndroid_release", "registerSegment", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "path", "callback", "Lcom/facebook/react/bridge/Callback;", "registerSegment$ReactAndroid_release", "handleHostException", JWKParameterNames.RSA_EXPONENT, "handleHostException$ReactAndroid_release", "callFunctionOnModule", "methodName", StepData.ARGS, "Lcom/facebook/react/bridge/NativeArray;", "callFunctionOnModule$ReactAndroid_release", "attachSurface", "attachSurface$ReactAndroid_release", "detachSurface", "detachSurface$ReactAndroid_release", "isSurfaceAttached", "isSurfaceAttached$ReactAndroid_release", "isSurfaceWithModuleNameAttached", "isSurfaceWithModuleNameAttached$ReactAndroid_release", "addBeforeDestroyListener", "onBeforeDestroy", "removeBeforeDestroyListener", "startTask", "getOrCreateStartTask", "moveToHostDestroy", "currentContext", "raiseSoftException", "callingMethod", "throwable", "", "callWithExistingReactInstance", "executor", "runnable", "callAfterGetOrCreateReactInstance", "getOrCreateReactInstance", "waitThenCallGetOrCreateReactInstanceTask", "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "tryNum", "maxTries", "getOrCreateReactInstanceTask", "jsBundleLoader", "getJsBundleLoader", "()Lcom/facebook/react/runtime/internal/bolts/Task;", "isMetroRunning", "loadJSBundleFromMetro", "stopAttachedSurfaces", "method", "startAttachedSurfaces", "reloadTask", "createReactInstanceUnwrapper", "Lkotlin/Function2;", "task", "stage", "tag", "getOrCreateReloadTask", "destroyTask", "getOrCreateDestroyTask", "getOrCreateReactHostInspectorTarget", "getOrCreateReactHostInspectorTarget$ReactAndroid_release", "createReactHostInspectorTarget", "destroyReactHostInspectorTarget", "unregisterInstanceFromInspector", "unregisterInstanceFromInspector$ReactAndroid_release", "invalidate", "CreationResult", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReactHostImpl implements ReactHost {
    private static final int BRIDGELESS_MARKER_INSTANCE_KEY = 1;
    private static final String TAG = "ReactHost";
    private final AtomicReference<Activity> activity;
    private final boolean allowPackagerServerAccess;
    private final Set<ReactSurfaceImpl> attachedSurfaces;
    private final List<Function0<Unit>> beforeDestroyListeners;
    private final Executor bgExecutor;
    private final BridgelessAtomicRef<BridgelessReactContext> bridgelessReactContextRef;
    private final ComponentFactory componentFactory;
    private final Context context;
    private final BridgelessAtomicRef<Task<ReactInstance>> createReactInstanceTaskRef;
    private DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler;
    private Task<Void> destroyTask;
    private final DevSupportManager devSupportManager;
    private FrameTimingsObserver frameTimingsObserver;
    private volatile boolean hostInvalidated;
    private final int id;
    private final AtomicReference<WeakReference<Activity>> lastUsedActivityRef;
    private MemoryPressureListener memoryPressureListener;
    private final MemoryPressureRouter memoryPressureRouter;
    private final ReactHostDelegate reactHostDelegate;
    private final ReactHostImplDevHelper reactHostImplDevHelper;
    private ReactHostInspectorTarget reactHostInspectorTarget;
    private ReactInstance reactInstance;
    private final List<ReactInstanceEventListener> reactInstanceEventListeners;
    private final ReactLifecycleStateManager reactLifecycleStateManager;
    private Task<ReactInstance> reloadTask;
    private Task<Void> startTask;
    private final ReactHostStateTracker stateTracker;
    private final Executor uiExecutor;
    private final boolean useDevSupport;
    private static final Companion Companion = new Companion(null);
    private static final AtomicInteger counter = new AtomicInteger(0);

    /* compiled from: ReactHostImpl.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TracingState.values().length];
            try {
                iArr[TracingState.ENABLED_IN_BACKGROUND_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingState.ENABLED_IN_CDP_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingState.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, Executor bgExecutor, Executor uiExecutor, boolean z, boolean z2, DevSupportManagerFactory devSupportManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactHostDelegate, "reactHostDelegate");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        Intrinsics.checkNotNullParameter(bgExecutor, "bgExecutor");
        Intrinsics.checkNotNullParameter(uiExecutor, "uiExecutor");
        this.context = context;
        this.reactHostDelegate = reactHostDelegate;
        this.componentFactory = componentFactory;
        this.bgExecutor = bgExecutor;
        this.uiExecutor = uiExecutor;
        this.allowPackagerServerAccess = z;
        this.useDevSupport = z2;
        ReactHostImplDevHelper reactHostImplDevHelper = new ReactHostImplDevHelper(this);
        this.reactHostImplDevHelper = reactHostImplDevHelper;
        DefaultDevSupportManagerFactory defaultDevSupportManagerFactory = devSupportManagerFactory == null ? new DefaultDevSupportManagerFactory() : devSupportManagerFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        DevSupportManager create = defaultDevSupportManagerFactory.create(applicationContext, reactHostImplDevHelper, reactHostDelegate.getJsMainModulePath(), true, null, null, 2, null, null, null, null, z2);
        if (create instanceof DevSupportManagerBase) {
            ((DevSupportManagerBase) create).setTracingStateProvider$ReactAndroid_release(reactHostImplDevHelper);
        }
        this.devSupportManager = create;
        this.memoryPressureRouter = new MemoryPressureRouter(context);
        this.attachedSurfaces = new HashSet();
        this.createReactInstanceTaskRef = new BridgelessAtomicRef<>(Task.INSTANCE.forResult(null));
        this.bridgelessReactContextRef = new BridgelessAtomicRef<>(null, 1, null);
        int andIncrement = counter.getAndIncrement();
        this.id = andIncrement;
        this.activity = new AtomicReference<>();
        this.lastUsedActivityRef = new AtomicReference<>(new WeakReference(null));
        ReactHostStateTracker reactHostStateTracker = new ReactHostStateTracker(andIncrement);
        this.stateTracker = reactHostStateTracker;
        this.reactLifecycleStateManager = new ReactLifecycleStateManager(reactHostStateTracker);
        this.reactInstanceEventListeners = new CopyOnWriteArrayList();
        this.beforeDestroyListeners = new CopyOnWriteArrayList();
    }

    public /* synthetic */ ReactHostImpl(Context context, ReactHostDelegate reactHostDelegate, ComponentFactory componentFactory, ExecutorService executorService, Executor executor, boolean z, boolean z2, DevSupportManagerFactory devSupportManagerFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, reactHostDelegate, componentFactory, (i & 8) != 0 ? Executors.newSingleThreadExecutor() : executorService, (i & 16) != 0 ? Task.UI_THREAD_EXECUTOR : executor, z, z2, (i & 128) != 0 ? null : devSupportManagerFactory);
    }

    @Override // com.facebook.react.ReactHost
    public DevSupportManager getDevSupportManager() {
        return this.devSupportManager;
    }

    @Override // com.facebook.react.ReactHost
    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.memoryPressureRouter;
    }

    /* renamed from: getReactHostInspectorTarget$ReactAndroid_release, reason: from getter */
    public final ReactHostInspectorTarget getReactHostInspectorTarget() {
        return this.reactHostInspectorTarget;
    }

    public final void setReactHostInspectorTarget$ReactAndroid_release(ReactHostInspectorTarget reactHostInspectorTarget) {
        this.reactHostInspectorTarget = reactHostInspectorTarget;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReactHostImpl(Context context, ReactHostDelegate delegate, ComponentFactory componentFactory, boolean z, boolean z2) {
        this(context, delegate, componentFactory, r0, Task.UI_THREAD_EXECUTOR, z, z2, null, 128, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
    }

    @Override // com.facebook.react.ReactHost
    public LifecycleState getLifecycleState() {
        return this.reactLifecycleStateManager.getState();
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> start() {
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda39
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Task orCreateStartTask;
                orCreateStartTask = ReactHostImpl.this.getOrCreateStartTask();
                return orCreateStartTask;
            }
        }, this.bgExecutor);
    }

    public final TaskInterface<Void> prerenderSurface$ReactAndroid_release(final ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        final String str = "prerenderSurface(surfaceId = " + surface.getSurfaceID() + ")";
        this.stateTracker.enterState(str, AppEventsConstants.EVENT_NAME_SCHEDULE);
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit prerenderSurface$lambda$2;
                prerenderSurface$lambda$2 = ReactHostImpl.prerenderSurface$lambda$2(ReactHostImpl.this, str, surface, (ReactInstance) obj);
                return prerenderSurface$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prerenderSurface$lambda$2(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.prerenderSurface(reactSurfaceImpl);
        return Unit.INSTANCE;
    }

    public final TaskInterface<Void> startSurface$ReactAndroid_release(final ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        final String str = "startSurface(surfaceId = " + surface.getSurfaceID() + ")";
        this.stateTracker.enterState(str, AppEventsConstants.EVENT_NAME_SCHEDULE);
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit startSurface$lambda$3;
                startSurface$lambda$3 = ReactHostImpl.startSurface$lambda$3(ReactHostImpl.this, str, surface, (ReactInstance) obj);
                return startSurface$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startSurface$lambda$3(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.startSurface(reactSurfaceImpl);
        return Unit.INSTANCE;
    }

    public final TaskInterface<Void> stopSurface$ReactAndroid_release(final ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        final String str = "stopSurface(surfaceId = " + surface.getSurfaceID() + ")";
        this.stateTracker.enterState(str, AppEventsConstants.EVENT_NAME_SCHEDULE);
        detachSurface$ReactAndroid_release(surface);
        return callWithExistingReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit stopSurface$lambda$4;
                stopSurface$lambda$4 = ReactHostImpl.stopSurface$lambda$4(ReactHostImpl.this, str, surface, (ReactInstance) obj);
                return stopSurface$lambda$4;
            }
        }).makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopSurface$lambda$4(ReactHostImpl reactHostImpl, String str, ReactSurfaceImpl reactSurfaceImpl, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.stopSurface(reactSurfaceImpl);
        return Unit.INSTANCE;
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultBackButtonImpl) {
        this.defaultHardwareBackBtnHandler = defaultBackButtonImpl;
        onHostResume(activity);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostResume(activity)", null, 2, null);
        setCurrentActivity(activity);
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.setCurrentWindow(activity != null ? activity.getWindow() : null);
        }
        maybeEnableDevSupport(true);
        this.reactLifecycleStateManager.moveToOnHostResume(getCurrentReactContext(), activity);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostLeaveHint(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onUserLeaveHint(activity)", null, 2, null);
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onUserLeaveHint(activity);
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostPause(activity)", null, 2, null);
        Activity currentActivity$ReactAndroid_release = getCurrentActivity$ReactAndroid_release();
        if (currentActivity$ReactAndroid_release != null) {
            boolean z = activity == currentActivity$ReactAndroid_release;
            if (!z) {
                String str = "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + currentActivity$ReactAndroid_release.getClass().getSimpleName() + " Paused activity: " + (activity == null ? AbstractJsonLexerKt.NULL : activity.getClass().getSimpleName());
                if (ReactNativeFeatureFlags.skipActivityIdentityAssertionOnHostPause()) {
                    FLog.w(TAG, "onHostPause(activity)", str);
                } else {
                    Assertions.assertCondition(z, str);
                }
            }
        }
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), currentActivity$ReactAndroid_release);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostPause()", null, 2, null);
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.moveToOnHostPause(getCurrentReactContext(), getCurrentActivity$ReactAndroid_release());
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostDestroy()", null, 2, null);
        maybeEnableDevSupport(false);
        moveToHostDestroy(getCurrentReactContext());
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy(Activity activity) {
        ReactHostStateTracker.enterState$default(this.stateTracker, "onHostDestroy(activity)", null, 2, null);
        if (getCurrentActivity$ReactAndroid_release() == activity) {
            maybeEnableDevSupport(false);
            moveToHostDestroy(getCurrentReactContext());
        }
    }

    private final void maybeEnableDevSupport(boolean enabled) {
        if (this.useDevSupport) {
            getDevSupportManager().setDevSupportEnabled(enabled);
        }
    }

    @Override // com.facebook.react.ReactHost
    public ReactContext getCurrentReactContext() {
        return this.bridgelessReactContextRef.getNullable();
    }

    @Override // com.facebook.react.ReactHost
    public ReactSurface createSurface(Context context, String moduleName, Bundle initialProps) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        ReactSurfaceImpl reactSurfaceImpl = new ReactSurfaceImpl(context, moduleName, initialProps);
        ReactSurfaceView reactSurfaceView = new ReactSurfaceView(context, reactSurfaceImpl);
        reactSurfaceView.setShouldLogContentAppeared(true);
        reactSurfaceImpl.attachView(reactSurfaceView);
        reactSurfaceImpl.attach(this);
        return reactSurfaceImpl;
    }

    public final boolean isInstanceInitialized$ReactAndroid_release() {
        return this.reactInstance != null;
    }

    @Override // com.facebook.react.ReactHost
    public boolean onBackPressed() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.getNativeModule(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.ReactHost
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getReactQueueConfiguration();
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public void addReactInstanceEventListener(ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.reactInstanceEventListeners.add(listener);
    }

    @Override // com.facebook.react.ReactHost
    public void removeReactInstanceEventListener(ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.reactInstanceEventListeners.remove(listener);
    }

    @Override // com.facebook.react.ReactHost
    public void setDevMenuConfiguration(DevMenuConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        getDevSupportManager().setDevMenuEnabled(config.getDevMenuEnabled());
        getDevSupportManager().setShakeGestureEnabled(config.getShakeGestureEnabled());
        getDevSupportManager().setKeyboardShortcutsEnabled(config.getKeyboardShortcutsEnabled());
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> reload(final String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda22
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Task reload$lambda$8;
                reload$lambda$8 = ReactHostImpl.reload$lambda$8(ReactHostImpl.this, reason);
                return reload$lambda$8;
            }
        }, this.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Task reload$lambda$8(final ReactHostImpl reactHostImpl, final String str) {
        Task<ReactInstance> orCreateReloadTask;
        Task<Void> task = reactHostImpl.destroyTask;
        if (task != null) {
            reactHostImpl.stateTracker.enterState("reload()", "Waiting for destroy to finish, before reloading React Native.");
            orCreateReloadTask = task.continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda15
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task2) {
                    Task reload$lambda$8$lambda$6$lambda$5;
                    reload$lambda$8$lambda$6$lambda$5 = ReactHostImpl.reload$lambda$8$lambda$6$lambda$5(ReactHostImpl.this, str, task2);
                    return reload$lambda$8$lambda$6$lambda$5;
                }
            }, reactHostImpl.bgExecutor);
        }
        orCreateReloadTask = reactHostImpl.getOrCreateReloadTask(str);
        return orCreateReloadTask.makeVoid().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda16
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task reload$lambda$8$lambda$7;
                reload$lambda$8$lambda$7 = ReactHostImpl.reload$lambda$8$lambda$7(ReactHostImpl.this, task2);
                return reload$lambda$8$lambda$7;
            }
        }, reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$8$lambda$6$lambda$5(ReactHostImpl reactHostImpl, String str, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.getOrCreateReloadTask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task reload$lambda$8$lambda$7(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isFaulted()) {
            return task;
        }
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(error);
        } else {
            reactHostImpl.reactHostDelegate.handleInstanceException(error);
        }
        return reactHostImpl.getOrCreateDestroyTask("Reload failed", error);
    }

    private final void setPausedInDebuggerMessage(String message) {
        if (message == null) {
            getDevSupportManager().hidePausedInDebuggerOverlay();
        } else {
            getDevSupportManager().showPausedInDebuggerOverlay(message, new DevSupportManager.PausedInDebuggerOverlayCommandListener() { // from class: com.facebook.react.runtime.ReactHostImpl$setPausedInDebuggerMessage$1
                @Override // com.facebook.react.devsupport.interfaces.DevSupportManager.PausedInDebuggerOverlayCommandListener
                public void onResume() {
                    UiThreadUtil.assertOnUiThread();
                    ReactHostInspectorTarget reactHostInspectorTarget = ReactHostImpl.this.getReactHostInspectorTarget();
                    if (reactHostInspectorTarget != null) {
                        reactHostInspectorTarget.sendDebuggerResumeCommand();
                    }
                }
            });
        }
    }

    private final Map<String, String> getHostMetadata() {
        return AndroidInfoHelpers.getInspectorHostMetadata(this.context);
    }

    private final void loadNetworkResource(String url, InspectorNetworkRequestListener listener) {
        InspectorNetworkHelper.loadNetworkResource(url, listener);
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> destroy(String reason, Exception ex, final Function1<? super Boolean, Unit> onDestroyFinished) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(onDestroyFinished, "onDestroyFinished");
        TaskInterface<Void> destroy = destroy(reason, ex);
        Intrinsics.checkNotNull(destroy, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<java.lang.Void>");
        return Task.continueWith$default((Task) destroy, new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda10
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                Void destroy$lambda$9;
                destroy$lambda$9 = ReactHostImpl.destroy$lambda$9(Function1.this, task);
                return destroy$lambda$9;
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void destroy$lambda$9(Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        function1.invoke(Boolean.valueOf(task.isCompleted() && !task.isFaulted()));
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public TaskInterface<Void> destroy(final String reason, final Exception ex) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda37
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Task destroy$lambda$11;
                destroy$lambda$11 = ReactHostImpl.destroy$lambda$11(ReactHostImpl.this, reason, ex);
                return destroy$lambda$11;
            }
        }, this.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$11(final ReactHostImpl reactHostImpl, final String str, final Exception exc) {
        Task<ReactInstance> task = reactHostImpl.reloadTask;
        if (task != null) {
            reactHostImpl.stateTracker.enterState("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
            return task.continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda41
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task2) {
                    Task destroy$lambda$11$lambda$10;
                    destroy$lambda$11$lambda$10 = ReactHostImpl.destroy$lambda$11$lambda$10(ReactHostImpl.this, str, exc, task2);
                    return destroy$lambda$11$lambda$10;
                }
            }, reactHostImpl.bgExecutor);
        }
        return reactHostImpl.getOrCreateDestroyTask(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task destroy$lambda$11$lambda$10(ReactHostImpl reactHostImpl, String str, Exception exc, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.getOrCreateDestroyTask(str, exc);
    }

    private final MemoryPressureListener createMemoryPressureListener(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda14
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i) {
                ReactHostImpl.createMemoryPressureListener$lambda$13(ReactHostImpl.this, weakReference, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$13(ReactHostImpl reactHostImpl, final WeakReference weakReference, final int i) {
        reactHostImpl.bgExecutor.execute(new Runnable() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.createMemoryPressureListener$lambda$13$lambda$12(weakReference, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$13$lambda$12(WeakReference weakReference, int i) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.handleMemoryPressure(i);
        }
    }

    public final Activity getCurrentActivity$ReactAndroid_release() {
        return this.activity.get();
    }

    private final void setCurrentActivity(Activity activity) {
        this.activity.set(activity);
        if (activity != null) {
            this.lastUsedActivityRef.set(new WeakReference<>(activity));
        }
    }

    public final Activity getLastUsedActivity$ReactAndroid_release() {
        WeakReference<Activity> weakReference = this.lastUsedActivityRef.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
        EventDispatcher eventDispatcher;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (eventDispatcher = reactInstance.getEventDispatcher()) == null) ? BlackHoleEventDispatcher.INSTANCE : eventDispatcher;
    }

    public final FabricUIManager getUiManager$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getFabricUIManager();
        }
        return null;
    }

    public final <T extends NativeModule> boolean hasNativeModule$ReactAndroid_release(Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.hasNativeModule(nativeModuleInterface);
        }
        return false;
    }

    public final Collection<NativeModule> getNativeModules$ReactAndroid_release() {
        Collection<NativeModule> nativeModules;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (nativeModules = reactInstance.getNativeModules()) == null) ? CollectionsKt.emptyList() : nativeModules;
    }

    public final <T extends NativeModule> T getNativeModule$ReactAndroid_release(Class<T> nativeModuleInterface) {
        Intrinsics.checkNotNullParameter(nativeModuleInterface, "nativeModuleInterface");
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && Intrinsics.areEqual(nativeModuleInterface, UIManagerModule.class)) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose(TAG, new ReactNoCrashSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return (T) reactInstance.getNativeModule(nativeModuleInterface);
        }
        return null;
    }

    public final NativeModule getNativeModule$ReactAndroid_release(String nativeModuleName) {
        Intrinsics.checkNotNullParameter(nativeModuleName, "nativeModuleName");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getNativeModule(nativeModuleName);
        }
        return null;
    }

    public final RuntimeExecutor getRuntimeExecutor$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        raiseSoftException$default(this, "getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready", null, 4, null);
        return null;
    }

    public final CallInvokerHolder getJsCallInvokerHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        raiseSoftException$default(this, "getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready", null, 4, null);
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + requestCode + "\", resultCode = \"" + resultCode + "\", data = \"" + data + "\")";
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, requestCode, resultCode, data);
        } else {
            raiseSoftException$default(this, str, "Tried to access onActivityResult while context is not ready", null, 4, null);
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onWindowFocusChange(boolean hasFocus) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(hasFocus);
            return;
        }
        raiseSoftException$default(this, "onWindowFocusChange(hasFocus = \"" + hasFocus + "\")", "Tried to access onWindowFocusChange while context is not ready", null, 4, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        Intrinsics.checkNotNullParameter(intent, "intent");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && ((Intrinsics.areEqual("android.intent.action.VIEW", action) || Intrinsics.areEqual("android.nfc.action.NDEF_DISCOVERED", action)) && (deviceEventManagerModule = (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)) != null)) {
                deviceEventManagerModule.emitNewIntentReceived(data);
            }
            currentReactContext.onNewIntent(getCurrentActivity$ReactAndroid_release(), intent);
            return;
        }
        raiseSoftException$default(this, "onNewIntent(intent = \"" + intent + "\")", "Tried to access onNewIntent while context is not ready", null, 4, null);
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        getDevSupportManager().setBundleFilePath(filePath);
        reload("Change bundle source");
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(String debugServerHost, String moduleName, Function1<? super Map<String, String>, ? extends Map<String, String>> queryMapper) {
        Intrinsics.checkNotNullParameter(debugServerHost, "debugServerHost");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(queryMapper, "queryMapper");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new ReactHostImpl$setBundleSource$1(this, queryMapper, debugServerHost, moduleName, null), 3, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onConfigurationChanged(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (ReactNativeFeatureFlags.enableFontScaleChangesUpdatingLayout()) {
                float pixelFromSP = PixelUtil.toPixelFromSP(1.0d);
                DisplayMetricsHolder.initDisplayMetrics(currentReactContext);
                if (pixelFromSP != PixelUtil.toPixelFromSP(1.0d)) {
                    synchronized (this.attachedSurfaces) {
                        Iterator<T> it = this.attachedSurfaces.iterator();
                        while (it.hasNext()) {
                            ReactSurfaceView view = ((ReactSurfaceImpl) it.next()).getView();
                            if (view != null) {
                                view.requestLayout();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
            AppearanceModule appearanceModule = (AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class);
            if (appearanceModule != null) {
                appearanceModule.onConfigurationChanged(context);
            }
        }
    }

    public final JavaScriptContextHolder getJavaScriptContextHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    public final DefaultHardwareBackBtnHandler getDefaultBackButtonHandler$ReactAndroid_release() {
        return new DefaultHardwareBackBtnHandler() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda34
            @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
            public final void invokeDefaultOnBackPressed() {
                ReactHostImpl._get_defaultBackButtonHandler_$lambda$18(ReactHostImpl.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_defaultBackButtonHandler_$lambda$18(ReactHostImpl reactHostImpl) {
        UiThreadUtil.assertOnUiThread();
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = reactHostImpl.defaultHardwareBackBtnHandler;
        if (defaultHardwareBackBtnHandler != null) {
            defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
        }
    }

    public final Task<Boolean> loadBundle$ReactAndroid_release(final JSBundleLoader bundleLoader) {
        Intrinsics.checkNotNullParameter(bundleLoader, "bundleLoader");
        final String str = "loadBundle()";
        this.stateTracker.enterState("loadBundle()", AppEventsConstants.EVENT_NAME_SCHEDULE);
        return callWithExistingReactInstance$default(this, "loadBundle()", null, new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit loadBundle$lambda$19;
                loadBundle$lambda$19 = ReactHostImpl.loadBundle$lambda$19(ReactHostImpl.this, str, bundleLoader, (ReactInstance) obj);
                return loadBundle$lambda$19;
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBundle$lambda$19(ReactHostImpl reactHostImpl, String str, JSBundleLoader jSBundleLoader, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.loadJSBundle(jSBundleLoader);
        return Unit.INSTANCE;
    }

    public final Task<Boolean> registerSegment$ReactAndroid_release(final int segmentId, final String path, final Callback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        final String str = "registerSegment(segmentId = \"" + segmentId + "\", path = \"" + path + "\")";
        this.stateTracker.enterState(str, AppEventsConstants.EVENT_NAME_SCHEDULE);
        return callWithExistingReactInstance$default(this, str, null, new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit registerSegment$lambda$20;
                registerSegment$lambda$20 = ReactHostImpl.registerSegment$lambda$20(ReactHostImpl.this, str, segmentId, path, callback, (ReactInstance) obj);
                return registerSegment$lambda$20;
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerSegment$lambda$20(ReactHostImpl reactHostImpl, String str, int i, String str2, Callback callback, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.enterState(str, "Execute");
        reactInstance.registerSegment(i, str2);
        if (callback != null) {
            callback.invoke(new Object[0]);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void handleHostException$ReactAndroid_release(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        String str = "handleHostException(message = \"" + e.getMessage() + "\")";
        ReactHostStateTracker.enterState$default(this.stateTracker, str, null, 2, null);
        if (this.useDevSupport) {
            getDevSupportManager().handleException(e);
        } else {
            this.reactHostDelegate.handleInstanceException(e);
        }
        destroy(str, e);
    }

    public final Task<Boolean> callFunctionOnModule$ReactAndroid_release(final String moduleName, final String methodName, final NativeArray args) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        return callWithExistingReactInstance$default(this, "callFunctionOnModule(\"" + moduleName + "\", \"" + methodName + "\")", null, new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit callFunctionOnModule$lambda$21;
                callFunctionOnModule$lambda$21 = ReactHostImpl.callFunctionOnModule$lambda$21(moduleName, methodName, args, (ReactInstance) obj);
                return callFunctionOnModule$lambda$21;
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callFunctionOnModule$lambda$21(String str, String str2, NativeArray nativeArray, ReactInstance reactInstance) {
        Intrinsics.checkNotNullParameter(reactInstance, "reactInstance");
        reactInstance.callFunctionOnModule(str, str2, nativeArray);
        return Unit.INSTANCE;
    }

    public final void attachSurface$ReactAndroid_release(ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        ReactHostStateTracker.enterState$default(this.stateTracker, "attachSurface(surfaceId = " + surface.getSurfaceID() + ")", null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.add(surface);
        }
    }

    public final void detachSurface$ReactAndroid_release(ReactSurfaceImpl surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        ReactHostStateTracker.enterState$default(this.stateTracker, "detachSurface(surfaceId = " + surface.getSurfaceID() + ")", null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.remove(surface);
        }
    }

    public final boolean isSurfaceAttached$ReactAndroid_release(ReactSurfaceImpl surface) {
        boolean contains;
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.attachedSurfaces) {
            contains = this.attachedSurfaces.contains(surface);
        }
        return contains;
    }

    public final boolean isSurfaceWithModuleNameAttached$ReactAndroid_release(String moduleName) {
        boolean z;
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        synchronized (this.attachedSurfaces) {
            Set<ReactSurfaceImpl> set = this.attachedSurfaces;
            z = false;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((ReactSurfaceImpl) it.next()).getModuleName(), moduleName)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    @Override // com.facebook.react.ReactHost
    public void addBeforeDestroyListener(Function0<Unit> onBeforeDestroy) {
        Intrinsics.checkNotNullParameter(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.add(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void removeBeforeDestroyListener(Function0<Unit> onBeforeDestroy) {
        Intrinsics.checkNotNullParameter(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.remove(onBeforeDestroy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task<Void> getOrCreateStartTask() {
        Task<Void> task = this.startTask;
        if (task != null) {
            return task;
        }
        this.stateTracker.enterState("getOrCreateStartTask()", AppEventsConstants.EVENT_NAME_SCHEDULE);
        if (ReactBuildConfig.DEBUG) {
            Assertions.assertCondition(ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
            Assertions.assertCondition(ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
            Assertions.assertCondition(ReactNativeNewArchitectureFeatureFlags.useTurboModules(), "useTurboModules FeatureFlag must be set to start ReactNative.");
        }
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            Assertions.assertCondition(!ReactNativeNewArchitectureFeatureFlags.useFabricInterop(), "useFabricInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
            Assertions.assertCondition(!ReactNativeNewArchitectureFeatureFlags.useTurboModuleInterop(), "useTurboModuleInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
        }
        Task continueWithTask = waitThenCallGetOrCreateReactInstanceTask().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda20
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateStartTask$lambda$29;
                orCreateStartTask$lambda$29 = ReactHostImpl.getOrCreateStartTask$lambda$29(ReactHostImpl.this, task2);
                return orCreateStartTask$lambda$29;
            }
        }, this.bgExecutor);
        this.startTask = continueWithTask;
        return continueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$29(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            final Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (reactHostImpl.useDevSupport) {
                reactHostImpl.getDevSupportManager().handleException(error);
            } else {
                reactHostImpl.reactHostDelegate.handleInstanceException(error);
            }
            return Task.continueWithTask$default(reactHostImpl.getOrCreateDestroyTask("getOrCreateStartTask() failure: " + error.getMessage(), error), new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda1
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task2) {
                    Task orCreateStartTask$lambda$29$lambda$28;
                    orCreateStartTask$lambda$29$lambda$28 = ReactHostImpl.getOrCreateStartTask$lambda$29$lambda$28(error, task2);
                    return orCreateStartTask$lambda$29$lambda$28;
                }
            }, null, 2, null);
        }
        return task.makeVoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateStartTask$lambda$29$lambda$28(Exception exc, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Task.INSTANCE.forError(exc);
    }

    private final void moveToHostDestroy(ReactContext currentContext) {
        this.reactLifecycleStateManager.moveToOnHostDestroy(currentContext);
        setCurrentActivity(null);
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.setCurrentWindow(null);
        }
    }

    static /* synthetic */ void raiseSoftException$default(ReactHostImpl reactHostImpl, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        reactHostImpl.raiseSoftException(str, str2, th);
    }

    private final void raiseSoftException(String callingMethod, String message, Throwable throwable) {
        String str = "raiseSoftException(" + callingMethod + ")";
        this.stateTracker.enterState(str, message);
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(str + ": " + message, throwable));
    }

    static /* synthetic */ Task callWithExistingReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callWithExistingReactInstance(str, executor, function1);
    }

    private final Task<Boolean> callWithExistingReactInstance(final String callingMethod, Executor executor, final Function1<? super ReactInstance, Unit> runnable) {
        return this.createReactInstanceTaskRef.get().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda32
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                Boolean callWithExistingReactInstance$lambda$31;
                callWithExistingReactInstance$lambda$31 = ReactHostImpl.callWithExistingReactInstance$lambda$31(ReactHostImpl.this, callingMethod, runnable, task);
                return callWithExistingReactInstance$lambda$31;
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean callWithExistingReactInstance$lambda$31(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        boolean z;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, "callWithExistingReactInstance(" + str + ")", "Execute: reactInstance is null. Dropping work.", null, 4, null);
            z = false;
        } else {
            function1.invoke(reactInstance);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    static /* synthetic */ Task callAfterGetOrCreateReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            executor = Task.IMMEDIATE_EXECUTOR;
        }
        return reactHostImpl.callAfterGetOrCreateReactInstance(str, executor, function1);
    }

    private final Task<Void> callAfterGetOrCreateReactInstance(final String callingMethod, Executor executor, final Function1<? super ReactInstance, Unit> runnable) {
        return getOrCreateReactInstance().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda40
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                Void callAfterGetOrCreateReactInstance$lambda$32;
                callAfterGetOrCreateReactInstance$lambda$32 = ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$32(ReactHostImpl.this, callingMethod, runnable, task);
                return callAfterGetOrCreateReactInstance$lambda$32;
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void callAfterGetOrCreateReactInstance$lambda$32(ReactHostImpl reactHostImpl, String str, Function1 function1, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, "callAfterGetOrCreateReactInstance(" + str + ")", "Execute: reactInstance is null. Dropping work.", null, 4, null);
            return null;
        }
        function1.invoke(reactInstance);
        return null;
    }

    private final Task<ReactInstance> getOrCreateReactInstance() {
        return Task.INSTANCE.call(new Callable() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda44
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Task waitThenCallGetOrCreateReactInstanceTask;
                waitThenCallGetOrCreateReactInstanceTask = ReactHostImpl.this.waitThenCallGetOrCreateReactInstanceTask();
                return waitThenCallGetOrCreateReactInstanceTask;
            }
        }, this.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTask() {
        return waitThenCallGetOrCreateReactInstanceTaskWithRetries(0, 4);
    }

    private final Task<ReactInstance> waitThenCallGetOrCreateReactInstanceTaskWithRetries(final int tryNum, final int maxTries) {
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            this.stateTracker.enterState("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return task;
        }
        Task<Void> task2 = this.destroyTask;
        if (task2 != null) {
            if (tryNum < maxTries) {
                this.stateTracker.enterState("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + tryNum + ").");
                return task2.onSuccessTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda45
                    @Override // com.facebook.react.runtime.internal.bolts.Continuation
                    public final Object then(Task task3) {
                        Task waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35;
                        waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35 = ReactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35(ReactHostImpl.this, tryNum, maxTries, task3);
                        return waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35;
                    }
                }, this.bgExecutor);
            }
            raiseSoftException$default(this, "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.", null, 4, null);
        }
        return getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35(ReactHostImpl reactHostImpl, int i, int i2, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return reactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries(i + 1, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactHostImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$CreationResult;", "", "instance", "Lcom/facebook/react/runtime/ReactInstance;", "context", "Lcom/facebook/react/bridge/ReactContext;", "isReloading", "", "<init>", "(Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/bridge/ReactContext;Z)V", "getInstance", "()Lcom/facebook/react/runtime/ReactInstance;", "getContext", "()Lcom/facebook/react/bridge/ReactContext;", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class CreationResult {
        private final ReactContext context;
        private final ReactInstance instance;
        private final boolean isReloading;

        public CreationResult(ReactInstance instance, ReactContext context, boolean z) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(context, "context");
            this.instance = instance;
            this.context = context;
            this.isReloading = z;
        }

        public final ReactInstance getInstance() {
            return this.instance;
        }

        public final ReactContext getContext() {
            return this.context;
        }

        /* renamed from: isReloading, reason: from getter */
        public final boolean getIsReloading() {
            return this.isReloading;
        }
    }

    private final Task<ReactInstance> getOrCreateReactInstanceTask() {
        final String str = "getOrCreateReactInstanceTask()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateReactInstanceTask()", null, 2, null);
        return this.createReactInstanceTaskRef.getOrCreate(new BridgelessAtomicRef.Provider() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda13
            @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
            public final Object get() {
                Task orCreateReactInstanceTask$lambda$44;
                orCreateReactInstanceTask$lambda$44 = ReactHostImpl.getOrCreateReactInstanceTask$lambda$44(ReactHostImpl.this, str);
                return orCreateReactInstanceTask$lambda$44;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReactInstanceTask$lambda$44(final ReactHostImpl reactHostImpl, final String str) {
        reactHostImpl.stateTracker.enterState(str, "Start");
        Assertions.assertCondition(!reactHostImpl.hostInvalidated, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        Task<TContinuationResult> onSuccess = reactHostImpl.getJsBundleLoader().onSuccess(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda23
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                ReactHostImpl.CreationResult orCreateReactInstanceTask$lambda$44$lambda$40;
                orCreateReactInstanceTask$lambda$44$lambda$40 = ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40(ReactHostImpl.this, str, task);
                return orCreateReactInstanceTask$lambda$44$lambda$40;
            }
        }, reactHostImpl.bgExecutor);
        onSuccess.continueWith(new ReactHostImpl$sam$com_facebook_react_runtime_internal_bolts_Continuation$0(new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit orCreateReactInstanceTask$lambda$44$lambda$42;
                orCreateReactInstanceTask$lambda$44$lambda$42 = ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$42(ReactHostImpl.this, str, (Task) obj);
                return orCreateReactInstanceTask$lambda$44$lambda$42;
            }
        }), reactHostImpl.uiExecutor);
        return Task.onSuccess$default(onSuccess, new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda25
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task) {
                ReactInstance orCreateReactInstanceTask$lambda$44$lambda$43;
                orCreateReactInstanceTask$lambda$44$lambda$43 = ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$43(task);
                return orCreateReactInstanceTask$lambda$44$lambda$43;
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreationResult getOrCreateReactInstanceTask$lambda$44$lambda$40(final ReactHostImpl reactHostImpl, final String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        BridgelessReactContext orCreate = reactHostImpl.bridgelessReactContextRef.getOrCreate(new BridgelessAtomicRef.Provider() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda17
            @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
            public final Object get() {
                BridgelessReactContext orCreateReactInstanceTask$lambda$44$lambda$40$lambda$37;
                orCreateReactInstanceTask$lambda$44$lambda$40$lambda$37 = ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$37(ReactHostImpl.this, str);
                return orCreateReactInstanceTask$lambda$44$lambda$40$lambda$37;
            }
        });
        orCreate.setJSExceptionHandler(reactHostImpl.getDevSupportManager());
        reactHostImpl.stateTracker.enterState(str, "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(orCreate, reactHostImpl.reactHostDelegate, reactHostImpl.componentFactory, reactHostImpl.getDevSupportManager(), new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda18
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$38(ReactHostImpl.this, exc);
            }
        }, reactHostImpl.useDevSupport, reactHostImpl.getOrCreateReactHostInspectorTarget$ReactAndroid_release());
        reactHostImpl.reactInstance = reactInstance;
        MemoryPressureListener createMemoryPressureListener = reactHostImpl.createMemoryPressureListener(reactInstance);
        reactHostImpl.memoryPressureListener = createMemoryPressureListener;
        reactHostImpl.getMemoryPressureRouter().addMemoryPressureListener(createMemoryPressureListener);
        reactInstance.initializeEagerTurboModules();
        reactHostImpl.stateTracker.enterState(str, "Loading JS Bundle");
        reactInstance.loadJSBundle((JSBundleLoader) result);
        reactHostImpl.stateTracker.enterState(str, "DevSupportManager.onNewReactContextCreated()");
        BridgelessReactContext bridgelessReactContext = orCreate;
        reactHostImpl.getDevSupportManager().onNewReactContextCreated(bridgelessReactContext);
        orCreate.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$39();
            }
        });
        return new CreationResult(reactInstance, bridgelessReactContext, reactHostImpl.reloadTask != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BridgelessReactContext getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$37(ReactHostImpl reactHostImpl, String str) {
        reactHostImpl.stateTracker.enterState(str, "Creating BridgelessReactContext");
        return new BridgelessReactContext(reactHostImpl.context, reactHostImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$38(ReactHostImpl reactHostImpl, Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        reactHostImpl.handleHostException$ReactAndroid_release(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$39() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrCreateReactInstanceTask$lambda$44$lambda$42(final ReactHostImpl reactHostImpl, String str, final Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            reactHostImpl.uiExecutor.execute(new Runnable() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$42$lambda$41(ReactHostImpl.this, task);
                }
            });
            return Unit.INSTANCE;
        }
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        CreationResult creationResult = (CreationResult) result;
        ReactContext context = creationResult.getContext();
        boolean isReloading = creationResult.getIsReloading();
        boolean z = reactHostImpl.reactLifecycleStateManager.getState() == LifecycleState.RESUMED;
        if (isReloading && !z) {
            reactHostImpl.reactLifecycleStateManager.moveToOnHostResume(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        } else {
            reactHostImpl.reactLifecycleStateManager.resumeReactContextIfHostResumed(context, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        }
        reactHostImpl.stateTracker.enterState(str, "Executing ReactInstanceEventListeners");
        Iterator<ReactInstanceEventListener> it = reactHostImpl.reactInstanceEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onReactContextInitialized(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$42$lambda$41(ReactHostImpl reactHostImpl, Task task) {
        Exception error = task.getError();
        if (error == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        reactHostImpl.handleHostException$ReactAndroid_release(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance getOrCreateReactInstanceTask$lambda$44$lambda$43(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result != null) {
            return ((CreationResult) result).getInstance();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Task<JSBundleLoader> getJsBundleLoader() {
        ReactHostStateTracker.enterState$default(this.stateTracker, "getJSBundleLoader()", null, 2, null);
        if (getDevSupportManager().getBundleFilePath() != null) {
            try {
                Task.Companion companion = Task.INSTANCE;
                JSBundleLoader.Companion companion2 = JSBundleLoader.INSTANCE;
                String bundleFilePath = getDevSupportManager().getBundleFilePath();
                if (bundleFilePath != null) {
                    return companion.forResult(companion2.createFileLoader(bundleFilePath));
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Exception e) {
                return Task.INSTANCE.forError(e);
            }
        }
        if (this.useDevSupport && this.allowPackagerServerAccess) {
            return isMetroRunning().onSuccessTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda43
                @Override // com.facebook.react.runtime.internal.bolts.Continuation
                public final Object then(Task task) {
                    Task _get_jsBundleLoader_$lambda$45;
                    _get_jsBundleLoader_$lambda$45 = ReactHostImpl._get_jsBundleLoader_$lambda$45(ReactHostImpl.this, task);
                    return _get_jsBundleLoader_$lambda$45;
                }
            }, this.bgExecutor);
        }
        if (ReactBuildConfig.DEBUG) {
            FLog.d(TAG, "Packager server access is disabled in this environment");
        }
        try {
            return Task.INSTANCE.forResult(this.reactHostDelegate.getJsBundleLoader());
        } catch (Exception e2) {
            return Task.INSTANCE.forError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task _get_jsBundleLoader_$lambda$45(ReactHostImpl reactHostImpl, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Object result = task.getResult();
        if (result == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (((Boolean) result).booleanValue()) {
            return reactHostImpl.loadJSBundleFromMetro();
        }
        return Task.INSTANCE.forResult(reactHostImpl.reactHostDelegate.getJsBundleLoader());
    }

    private final Task<Boolean> isMetroRunning() {
        final String str = "isMetroRunning()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "isMetroRunning()", null, 2, null);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        getDevSupportManager().isPackagerRunning(new PackagerStatusCallback() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda35
            @Override // com.facebook.react.devsupport.interfaces.PackagerStatusCallback
            public final void onPackagerStatusFetched(boolean z) {
                ReactHostImpl._get_isMetroRunning_$lambda$46(ReactHostImpl.this, str, taskCompletionSource, z);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_isMetroRunning_$lambda$46(ReactHostImpl reactHostImpl, String str, TaskCompletionSource taskCompletionSource, boolean z) {
        reactHostImpl.stateTracker.enterState(str, "Async result = " + z);
        taskCompletionSource.setResult(Boolean.valueOf(z));
    }

    private final Task<JSBundleLoader> loadJSBundleFromMetro() {
        final String str = "loadJSBundleFromMetro()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "loadJSBundleFromMetro()", null, 2, null);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        DevSupportManager devSupportManager = getDevSupportManager();
        Intrinsics.checkNotNull(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
        final DevSupportManagerBase devSupportManagerBase = (DevSupportManagerBase) devSupportManager;
        DevServerHelper devServerHelper = devSupportManagerBase.getDevServerHelper();
        String jsAppBundleName = devSupportManagerBase.getJsAppBundleName();
        if (jsAppBundleName != null) {
            final String devServerBundleURL = devServerHelper.getDevServerBundleURL(jsAppBundleName);
            devSupportManagerBase.reloadJSFromServer(devServerBundleURL, new BundleLoadCallback() { // from class: com.facebook.react.runtime.ReactHostImpl$loadJSBundleFromMetro$1
                @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
                public void onSuccess() {
                    ReactHostStateTracker reactHostStateTracker;
                    reactHostStateTracker = ReactHostImpl.this.stateTracker;
                    reactHostStateTracker.enterState(str, "Creating BundleLoader");
                    taskCompletionSource.setResult(JSBundleLoader.INSTANCE.createCachedBundleFromNetworkLoader(devServerBundleURL, devSupportManagerBase.getDownloadedJSBundleFile()));
                }

                @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
                public void onError(Exception cause) {
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    taskCompletionSource.setError(cause);
                }
            });
            return taskCompletionSource.getTask();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final void stopAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.enterState(method, "Stopping all React Native surfaces");
        synchronized (this.attachedSurfaces) {
            for (ReactSurfaceImpl reactSurfaceImpl : this.attachedSurfaces) {
                reactInstance.stopSurface(reactSurfaceImpl);
                reactSurfaceImpl.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void startAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.enterState(method, "Restarting previously running React Native Surfaces");
        synchronized (this.attachedSurfaces) {
            Iterator<ReactSurfaceImpl> it = this.attachedSurfaces.iterator();
            while (it.hasNext()) {
                reactInstance.startSurface(it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final Function2<Task<ReactInstance>, String, ReactInstance> createReactInstanceUnwrapper(final String tag, final String method, final String reason) {
        return new Function2() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ReactInstance createReactInstanceUnwrapper$lambda$49;
                createReactInstanceUnwrapper$lambda$49 = ReactHostImpl.createReactInstanceUnwrapper$lambda$49(ReactHostImpl.this, tag, reason, method, (Task) obj, (String) obj2);
                return createReactInstanceUnwrapper$lambda$49;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance createReactInstanceUnwrapper$lambda$49(ReactHostImpl reactHostImpl, String str, String str2, String str3, Task task, String stage) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(stage, "stage");
        ReactInstance reactInstance = (ReactInstance) task.getResult();
        ReactInstance reactInstance2 = reactHostImpl.reactInstance;
        String str4 = "Stage: " + stage;
        String str5 = str + " reason: " + str2;
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task faulted. " + str4 + ". " + ("Fault reason: " + error.getMessage()) + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (task.isCancelled()) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task cancelled. " + str4 + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task returned null. " + str4 + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance2 != null && !Intrinsics.areEqual(reactInstance, reactInstance2)) {
            raiseSoftException$default(reactHostImpl, str3, str + ": Detected two different ReactInstances. Returning old. " + str4 + ". " + str5, null, 4, null);
        }
        return reactInstance;
    }

    private final Task<ReactInstance> getOrCreateReloadTask(final String reason) {
        final String str = "getOrCreateReloadTask()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateReloadTask()", null, 2, null);
        Task<ReactInstance> task = this.reloadTask;
        if (task != null) {
            return task;
        }
        final Function2<Task<ReactInstance>, String, ReactInstance> createReactInstanceUnwrapper = createReactInstanceUnwrapper("Reload", "getOrCreateReloadTask()", reason);
        this.stateTracker.enterState("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
        Task<ReactInstance> continueWithTask = this.createReactInstanceTaskRef.getAndReset().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda2
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateReloadTask$lambda$51;
                orCreateReloadTask$lambda$51 = ReactHostImpl.getOrCreateReloadTask$lambda$51(ReactHostImpl.this, str, createReactInstanceUnwrapper, reason, task2);
                return orCreateReloadTask$lambda$51;
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda3
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateReloadTask$lambda$52;
                orCreateReloadTask$lambda$52 = ReactHostImpl.getOrCreateReloadTask$lambda$52(Function2.this, this, str, task2);
                return orCreateReloadTask$lambda$52;
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda4
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateReloadTask$lambda$54;
                orCreateReloadTask$lambda$54 = ReactHostImpl.getOrCreateReloadTask$lambda$54(Function2.this, this, str, task2);
                return orCreateReloadTask$lambda$54;
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda5
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateReloadTask$lambda$55;
                orCreateReloadTask$lambda$55 = ReactHostImpl.getOrCreateReloadTask$lambda$55(Function2.this, this, str, task2);
                return orCreateReloadTask$lambda$55;
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda6
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateReloadTask$lambda$56;
                orCreateReloadTask$lambda$56 = ReactHostImpl.getOrCreateReloadTask$lambda$56(Function2.this, this, str, task2);
                return orCreateReloadTask$lambda$56;
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda7
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateReloadTask$lambda$57;
                orCreateReloadTask$lambda$57 = ReactHostImpl.getOrCreateReloadTask$lambda$57(ReactHostImpl.this, str, reason, task2);
                return orCreateReloadTask$lambda$57;
            }
        }, this.bgExecutor);
        this.reloadTask = continueWithTask;
        return continueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$51(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        reactHostImpl.stateTracker.enterState(str, "Starting React Native reload");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting reload");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Reload reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        if (nullable != null && reactHostImpl2.reactLifecycleStateManager.getState() == LifecycleState.RESUMED) {
            reactHostImpl2.stateTracker.enterState(str3, "Calling ReactContext.onHostPause()");
            nullable.onHostPause();
        }
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$52(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Surface shutdown");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$54(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        MemoryPressureListener memoryPressureListener = reactHostImpl.memoryPressureListener;
        if (memoryPressureListener != null) {
            reactHostImpl.stateTracker.enterState(str, "Removing memory pressure listener");
            reactHostImpl.getMemoryPressureRouter().removeMemoryPressureListener(memoryPressureListener);
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable != null) {
            reactHostImpl.stateTracker.enterState(str, "Resetting ReactContext ref");
            reactHostImpl.bridgelessReactContextRef.reset();
            reactHostImpl.stateTracker.enterState(str, "Destroying ReactContext");
            nullable.destroy();
        }
        if (reactHostImpl.useDevSupport && nullable != null) {
            reactHostImpl.stateTracker.enterState(str, "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            reactHostImpl.getDevSupportManager().onReactInstanceDestroyed(nullable);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$55(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.enterState(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.enterState(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.stateTracker.enterState(str2, "Resetting start task ref");
        reactHostImpl2.startTask = null;
        return reactHostImpl2.getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$56(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "5: Restarting surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface restart: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.startAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateReloadTask$lambda$57(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            reactHostImpl.raiseSoftException(str, "Error during reload. ReactInstance task faulted. Fault reason: " + error.getMessage() + ". Reload reason: " + str2, task.getError());
        }
        if (task.isCancelled()) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "Error during reload. ReactInstance task cancelled. Reload reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Resetting reload task ref");
        reactHostImpl2.reloadTask = null;
        return task;
    }

    private final Task<Void> getOrCreateDestroyTask(final String reason, Exception ex) {
        final String str = "getOrCreateDestroyTask()";
        ReactHostStateTracker.enterState$default(this.stateTracker, "getOrCreateDestroyTask()", null, 2, null);
        Task<Void> task = this.destroyTask;
        if (task != null) {
            return task;
        }
        final Function2<Task<ReactInstance>, String, ReactInstance> createReactInstanceUnwrapper = createReactInstanceUnwrapper("Destroy", "getOrCreateDestroyTask()", reason);
        this.stateTracker.enterState("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
        Task<Void> continueWith$default = Task.continueWith$default(this.createReactInstanceTaskRef.getAndReset().continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda26
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateDestroyTask$lambda$60;
                orCreateDestroyTask$lambda$60 = ReactHostImpl.getOrCreateDestroyTask$lambda$60(ReactHostImpl.this, str, createReactInstanceUnwrapper, reason, task2);
                return orCreateDestroyTask$lambda$60;
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda27
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateDestroyTask$lambda$62;
                orCreateDestroyTask$lambda$62 = ReactHostImpl.getOrCreateDestroyTask$lambda$62(Function2.this, this, str, task2);
                return orCreateDestroyTask$lambda$62;
            }
        }, this.bgExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda28
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateDestroyTask$lambda$63;
                orCreateDestroyTask$lambda$63 = ReactHostImpl.getOrCreateDestroyTask$lambda$63(Function2.this, this, str, reason, task2);
                return orCreateDestroyTask$lambda$63;
            }
        }, this.uiExecutor).continueWithTask(new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda29
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Task orCreateDestroyTask$lambda$64;
                orCreateDestroyTask$lambda$64 = ReactHostImpl.getOrCreateDestroyTask$lambda$64(Function2.this, this, str, task2);
                return orCreateDestroyTask$lambda$64;
            }
        }, this.bgExecutor), new Continuation() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda30
            @Override // com.facebook.react.runtime.internal.bolts.Continuation
            public final Object then(Task task2) {
                Void orCreateDestroyTask$lambda$65;
                orCreateDestroyTask$lambda$65 = ReactHostImpl.getOrCreateDestroyTask$lambda$65(ReactHostImpl.this, str, reason, task2);
                return orCreateDestroyTask$lambda$65;
            }
        }, null, 2, null);
        this.destroyTask = continueWith$default;
        return continueWith$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$60(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        reactHostImpl.stateTracker.enterState(str, "Starting React Native destruction");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting destroy");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        if (reactHostImpl.hostInvalidated) {
            reactHostImpl.destroyReactHostInspectorTarget();
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.stateTracker.enterState(str, "DevSupportManager cleanup");
            reactHostImpl.getDevSupportManager().stopInspector();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Destroy reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Move ReactHost to onHostDestroy()");
        reactHostImpl2.reactLifecycleStateManager.moveToOnHostDestroy(nullable);
        return Task.INSTANCE.forResult(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$62(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Stopping surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        synchronized (reactHostImpl.attachedSurfaces) {
            reactHostImpl.attachedSurfaces.clear();
            Unit unit = Unit.INSTANCE;
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$63(Function2 function2, ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        Intrinsics.checkNotNullParameter(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<Function0<Unit>> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        BridgelessReactContext nullable = reactHostImpl.bridgelessReactContextRef.getNullable();
        if (nullable == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Destroy reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.enterState(str3, "Destroying MemoryPressureRouter");
        reactHostImpl2.getMemoryPressureRouter().destroy(reactHostImpl2.context);
        if (nullable != null) {
            reactHostImpl2.stateTracker.enterState(str3, "Resetting ReactContext ref");
            reactHostImpl2.bridgelessReactContextRef.reset();
            reactHostImpl2.stateTracker.enterState(str3, "Destroying ReactContext");
            nullable.destroy();
        }
        reactHostImpl2.setCurrentActivity(null);
        ResourceDrawableIdHelper.clear();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getOrCreateDestroyTask$lambda$64(Function2 function2, ReactHostImpl reactHostImpl, String str, Task task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        Intrinsics.checkNotNullParameter(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.enterState(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.enterState(str2, "Destroying ReactInstance");
            reactInstance.destroy();
        }
        reactHostImpl2.stateTracker.enterState(str2, "Resetting start/destroy task ref");
        reactHostImpl2.startTask = null;
        reactHostImpl2.destroyTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void getOrCreateDestroyTask$lambda$65(ReactHostImpl reactHostImpl, String str, String str2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isFaulted()) {
            Exception error = task.getError();
            if (error == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            reactHostImpl.raiseSoftException(str, "React destruction failed. ReactInstance task faulted. Fault reason: " + error.getMessage() + ". Destroy reason: " + str2, task.getError());
        }
        if (!task.isCancelled()) {
            return null;
        }
        raiseSoftException$default(reactHostImpl, str, "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str2, null, 4, null);
        return null;
    }

    public final ReactHostInspectorTarget getOrCreateReactHostInspectorTarget$ReactAndroid_release() {
        if (this.reactHostInspectorTarget == null && InspectorFlags.getFuseboxEnabled()) {
            this.reactHostInspectorTarget = createReactHostInspectorTarget();
        }
        return this.reactHostInspectorTarget;
    }

    private final ReactHostInspectorTarget createReactHostInspectorTarget() {
        final ReactHostInspectorTarget reactHostInspectorTarget = new ReactHostInspectorTarget(this);
        reactHostInspectorTarget.registerTracingStateListener(new TracingStateListener() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda21
            @Override // com.facebook.react.devsupport.inspector.TracingStateListener
            public final void onStateChanged(TracingState tracingState, boolean z) {
                ReactHostImpl.createReactHostInspectorTarget$lambda$68(ReactHostImpl.this, reactHostInspectorTarget, tracingState, z);
            }
        });
        return reactHostInspectorTarget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createReactHostInspectorTarget$lambda$68(ReactHostImpl reactHostImpl, final ReactHostInspectorTarget reactHostInspectorTarget, TracingState state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1 || i == 2) {
            FrameTimingsObserver frameTimingsObserver = new FrameTimingsObserver(z, new Function1() { // from class: com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit createReactHostInspectorTarget$lambda$68$lambda$67;
                    createReactHostInspectorTarget$lambda$68$lambda$67 = ReactHostImpl.createReactHostInspectorTarget$lambda$68$lambda$67(ReactHostInspectorTarget.this, (FrameTimingSequence) obj);
                    return createReactHostInspectorTarget$lambda$68$lambda$67;
                }
            });
            Activity currentActivity$ReactAndroid_release = reactHostImpl.getCurrentActivity$ReactAndroid_release();
            frameTimingsObserver.setCurrentWindow(currentActivity$ReactAndroid_release != null ? currentActivity$ReactAndroid_release.getWindow() : null);
            frameTimingsObserver.start();
            reactHostImpl.frameTimingsObserver = frameTimingsObserver;
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        FrameTimingsObserver frameTimingsObserver2 = reactHostImpl.frameTimingsObserver;
        if (frameTimingsObserver2 != null) {
            frameTimingsObserver2.stop();
        }
        reactHostImpl.frameTimingsObserver = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createReactHostInspectorTarget$lambda$68$lambda$67(ReactHostInspectorTarget reactHostInspectorTarget, FrameTimingSequence frameTimingsSequence) {
        Intrinsics.checkNotNullParameter(frameTimingsSequence, "frameTimingsSequence");
        reactHostInspectorTarget.recordFrameTimings(frameTimingsSequence);
        return Unit.INSTANCE;
    }

    private final void destroyReactHostInspectorTarget() {
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.stop();
        }
        this.frameTimingsObserver = null;
        ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
        if (reactHostInspectorTarget != null) {
            reactHostInspectorTarget.close();
        }
        this.reactHostInspectorTarget = null;
    }

    public final void unregisterInstanceFromInspector$ReactAndroid_release(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
                boolean z = false;
                if (reactHostInspectorTarget != null && reactHostInspectorTarget.isValid()) {
                    z = true;
                }
                Assertions.assertCondition(z, "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    @Override // com.facebook.react.ReactHost
    public void invalidate() {
        FLog.d(TAG, "ReactHostImpl.invalidate()");
        this.hostInvalidated = true;
        destroy("ReactHostImpl.invalidate()", null);
    }

    /* compiled from: ReactHostImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl$Companion;", "", "<init>", "()V", "TAG", "", "BRIDGELESS_MARKER_INSTANCE_KEY", "", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
