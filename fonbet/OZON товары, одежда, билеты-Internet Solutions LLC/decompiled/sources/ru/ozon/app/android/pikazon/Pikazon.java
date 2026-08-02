package ru.ozon.app.android.pikazon;

import Ae.M0;
import B0.C2454a;
import Dg0.a;
import Dg0.b;
import Dg0.c;
import Dg0.d;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import T5.m;
import We.E;
import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.glide.loaders.CdnChooserUrlChecker;
import ru.ozon.app.android.pikazon.glide.loaders.PerformanceListener;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactoryStub;
import ru.ozon.app.android.pikazon.glide.memoryCategory.MemoryCategory;
import ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCacheDecorator;
import ru.ozon.app.android.pikazon.glide.thumbnail.ThumbRequestListener;
import ru.ozon.app.android.pikazon.glide.transformations.factory.ImageTransformationsFactory;
import ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandler;
import ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandlerConfig;
import ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandlerImpl;
import ru.ozon.app.android.pikazon.interceptors.ThrottlingInterceptor;
import ru.ozon.app.android.pikazon.interceptors.UserAgentInterceptor;
import ru.ozon.app.android.pikazon.internal.DisabledPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.internal.PikazonLimbLPApiDelegateImpl;
import ru.ozon.app.android.pikazon.logging.PikazonLogConfig;
import ru.ozon.app.android.pikazon.logging.PikazonLogger;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTracker;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTrackerImpl;
import ru.ozon.app.android.pikazon.placeholdertracker.ViewVisibilityInteractor;
import ru.ozon.app.android.pikazon.processors.DefaultIconImageSourceProcessor;
import ru.ozon.app.android.pikazon.processors.ImageSourceProcessor;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;
import ru.ozon.app.android.pikazon.resources.PikazonResourceManager;
import ru.ozon.app.android.pikazon.resources.PikazonResourceManagerImpl;
import ru.ozon.app.android.pikazon.retry.OnConnectionRestored;
import ru.ozon.app.android.pikazon.retry.utils.ConnectionRestoredPoliciesKt;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0094\u00012\u00020\u0001:\b\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001B\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u0010J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010J\u001b\u0010\u001d\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0017\u00105\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010>\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR(\u0010O\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bS\u0010F\u001a\u0004\bO\u0010Q\"\u0004\bR\u0010)R\u001a\u0010U\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR'\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z0Y8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010dR&\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b0f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR(\u0010l\u001a\b\u0012\u0004\u0012\u00020#0k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR(\u0010r\u001a\b\u0012\u0004\u0012\u00020\u001f0k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010m\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR$\u0010(\u001a\u00020\r2\u0006\u0010u\u001a\u00020\r8F@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010P\u001a\u0004\b(\u0010QR$\u0010,\u001a\u00020*2\u0006\u0010u\u001a\u00020*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010v\u001a\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\"\u0010{\u001a\u00020\r8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010P\u001a\u0004\b|\u0010Q\"\u0004\b}\u0010)R#\u0010~\u001a\u00020\r8@@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b~\u0010P\u001a\u0004\b\u007f\u0010Q\"\u0005\b\u0080\u0001\u0010)R'\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u0087\u0001\u001a\u00030\u0086\u00018@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0098\u0001"}, d2 = {"Lru/ozon/app/android/pikazon/Pikazon;", "", "LWe/E;", "client", "Lru/ozon/app/android/pikazon/Pikazon$Config;", "config", "<init>", "(LWe/E;Lru/ozon/app/android/pikazon/Pikazon$Config;)V", "Lru/ozon/app/android/pikazon/resources/PikazonResourceManager;", "pikazonResourceManager", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;", "imagePathHandlerConfig", "(LWe/E;Lru/ozon/app/android/pikazon/resources/PikazonResourceManager;Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;Lru/ozon/app/android/pikazon/Pikazon$Config;)V", "", "isEnabled", "setImagePreviewEnabled", "(Z)Lru/ozon/app/android/pikazon/Pikazon;", "Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;", "memoryCategory", "setMemoryCategory", "(Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;)Lru/ozon/app/android/pikazon/Pikazon;", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;)Lru/ozon/app/android/pikazon/Pikazon;", "enabled", "setInMemoryRetainCacheEnabled", "setUseNewVisibilityChecker", "Lru/ozon/app/android/pikazon/request/PikazonRequestListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addPikazonRequestListener", "(Lru/ozon/app/android/pikazon/request/PikazonRequestListener;)Lru/ozon/app/android/pikazon/Pikazon;", "Lru/ozon/app/android/pikazon/glide/loaders/PerformanceListener;", "performanceListener", "addPerformanceListener", "(Lru/ozon/app/android/pikazon/glide/loaders/PerformanceListener;)Lru/ozon/app/android/pikazon/Pikazon;", "Lru/ozon/app/android/pikazon/logging/error/PikazonErrorsLogger;", "errorsLogger", "addErrorsLogger", "(Lru/ozon/app/android/pikazon/logging/error/PikazonErrorsLogger;)Lru/ozon/app/android/pikazon/Pikazon;", "", "isComposeIntrinsicSizeEnabled", "(Z)V", "Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "strategy", "onConnectionRestored", "(Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;)Lru/ozon/app/android/pikazon/Pikazon;", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTracker;", "getPlaceholderTracker", "()Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTracker;", "LAe/M0;", "LUd0/a;", "getCdnChooserConfigFlow$lib_release", "()LAe/M0;", "getCdnChooserConfigFlow", "Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor;", "getViewVisibilityInteractor", "()Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor;", "okHttpClient", "LWe/E;", "getOkHttpClient", "()LWe/E;", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandler;", "imagePathHandler", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandler;", "getImagePathHandler", "()Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandler;", "Lru/ozon/app/android/pikazon/resources/PikazonResourceManager;", "getPikazonResourceManager", "()Lru/ozon/app/android/pikazon/resources/PikazonResourceManager;", "getPikazonResourceManager$annotations", "()V", "Lru/ozon/app/android/pikazon/Pikazon$Config;", "getConfig$lib_release", "()Lru/ozon/app/android/pikazon/Pikazon$Config;", "Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;", "cdnChooserUrlChecker", "Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;", "getCdnChooserUrlChecker$lib_release", "()Lru/ozon/app/android/pikazon/glide/loaders/CdnChooserUrlChecker;", "isInTestMode", "Z", "()Z", "setInTestMode", "isInTestMode$annotations", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheDecorator;", "thumbCache", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheDecorator;", "getThumbCache$lib_release", "()Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheDecorator;", "Lru/ozon/app/android/pikazon/glide/transformations/factory/ImageTransformationsFactory;", "LT5/m;", "Landroid/graphics/Bitmap;", "imageTransformationsFactory$delegate", "LSc/j;", "getImageTransformationsFactory$lib_release", "()Lru/ozon/app/android/pikazon/glide/transformations/factory/ImageTransformationsFactory;", "imageTransformationsFactory", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackerImpl;", "placeholderTracker$delegate", "getPlaceholderTracker$lib_release", "()Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackerImpl;", "placeholderTracker", "", "requestListeners", "Ljava/util/Set;", "getRequestListeners$lib_release", "()Ljava/util/Set;", "", "errorsLoggers", "Ljava/util/List;", "getErrorsLoggers$lib_release", "()Ljava/util/List;", "setErrorsLoggers$lib_release", "(Ljava/util/List;)V", "performanceListeners", "getPerformanceListeners$lib_release", "setPerformanceListeners$lib_release", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "getOnConnectionRestored", "()Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "_viewVisibilityInteractor", "Lru/ozon/app/android/pikazon/placeholdertracker/ViewVisibilityInteractor;", "isInMemoryRetainCacheEnabled", "isInMemoryRetainCacheEnabled$lib_release", "setInMemoryRetainCacheEnabled$lib_release", "useNewVisibilityChecker", "getUseNewVisibilityChecker$lib_release", "setUseNewVisibilityChecker$lib_release", "Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;", "getMemoryCategory$lib_release", "()Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;", "setMemoryCategory$lib_release", "(Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;)V", "", "maxDiskCacheSizeInBytes", "J", "getMaxDiskCacheSizeInBytes$lib_release", "()J", "setMaxDiskCacheSizeInBytes$lib_release", "(J)V", "getPikazonLimbLibrary", "()Ljava/lang/Object;", "pikazonLimbLibrary", "Lru/ozon/app/android/pikazon/internal/PikazonLimbLPApiDelegateImpl;", "get_pikazonLimbLibraryApi", "()Lru/ozon/app/android/pikazon/internal/PikazonLimbLPApiDelegateImpl;", "_pikazonLimbLibraryApi", "Companion", "Config", "NetworkConfiguration", "LoadTimeLogsConfiguration", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Pikazon {
    private static volatile Pikazon instance;
    private static volatile PikazonLimbLPApiDelegateImpl limbInstance;
    private ViewVisibilityInteractor _viewVisibilityInteractor;

    @NotNull
    private final CdnChooserUrlChecker cdnChooserUrlChecker;

    @NotNull
    private final Config config;

    @NotNull
    private List<PikazonErrorsLogger> errorsLoggers;

    @NotNull
    private final ImagePathHandler imagePathHandler;

    /* renamed from: imageTransformationsFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageTransformationsFactory;
    private boolean isComposeIntrinsicSizeEnabled;
    private volatile boolean isInMemoryRetainCacheEnabled;
    private boolean isInTestMode;
    private volatile long maxDiskCacheSizeInBytes;

    @NotNull
    private volatile MemoryCategory memoryCategory;

    @NotNull
    private final E okHttpClient;

    @NotNull
    private OnConnectionRestored onConnectionRestored;

    @NotNull
    private List<PerformanceListener> performanceListeners;

    @NotNull
    private final PikazonResourceManager pikazonResourceManager;

    /* renamed from: placeholderTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j placeholderTracker;

    @NotNull
    private final Set<PikazonRequestListener<Object>> requestListeners;

    @NotNull
    private final ThumbCacheDecorator thumbCache;
    private boolean useNewVisibilityChecker;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReentrantLock lock = new ReentrantLock();

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ\u001f\u0010#\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/pikazon/Pikazon$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/pikazon/Pikazon$Config;", "config", "Lru/ozon/app/android/pikazon/internal/PikazonLimbLPApiDelegateImpl;", "createOrUpdateLimbInstance", "(Lru/ozon/app/android/pikazon/Pikazon$Config;)Lru/ozon/app/android/pikazon/internal/PikazonLimbLPApiDelegateImpl;", "Lru/ozon/app/android/pikazon/Pikazon;", "createDefault", "()Lru/ozon/app/android/pikazon/Pikazon;", "LWe/E;", "", "userAgentHeader", "", "throttleTime", "addInterceptors", "(LWe/E;Ljava/lang/String;Ljava/lang/Long;)LWe/E;", "httpClient", "bind", "(LWe/E;Lru/ozon/app/android/pikazon/Pikazon$Config;)Lru/ozon/app/android/pikazon/Pikazon;", "okHttpClient", "Lru/ozon/app/android/pikazon/resources/PikazonResourceManager;", "pikazonResourceManager", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;", "imagePathHandlerConfig", "(LWe/E;Lru/ozon/app/android/pikazon/resources/PikazonResourceManager;Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;Lru/ozon/app/android/pikazon/Pikazon$Config;)Lru/ozon/app/android/pikazon/Pikazon;", "getInstance", "LDg0/a;", "featureFlag", "", "defaultValue", "getInternalConfigFeatureFlag$lib_release", "(LDg0/a;Z)Z", "getInternalConfigFeatureFlag", "LDg0/d;", "getPikazonInternalConfig", "()LDg0/d;", "pikazonInternalConfig", "isInitialized", "()Z", "DEFAULT_IMAGE_BUCKETS", "Ljava/lang/String;", "instance", "Lru/ozon/app/android/pikazon/Pikazon;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "limbInstance", "Lru/ozon/app/android/pikazon/internal/PikazonLimbLPApiDelegateImpl;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final E addInterceptors(E e11, String str, Long l11) {
            if (str == null && l11 == null) {
                return e11;
            }
            e11.getClass();
            E.a aVar = new E.a(e11);
            if (l11 != null && l11.longValue() > 0) {
                aVar.S().add(0, new ThrottlingInterceptor(l11.longValue()));
            }
            if (str != null) {
                aVar.S().add(0, new UserAgentInterceptor(str));
            }
            return new E(aVar);
        }

        private final Pikazon createDefault() {
            return new Pikazon(new E(), new Config(R.drawable.ic_dialog_info, new DisabledPerformanceAvailabilityChecker(), (String) null, (Set) null, (PikazonUrlFactory) null, 28, (DefaultConstructorMarker) null), null);
        }

        private final PikazonLimbLPApiDelegateImpl createOrUpdateLimbInstance(Config config) {
            PikazonLimbLPApiDelegateImpl pikazonLimbLPApiDelegateImpl = Pikazon.limbInstance;
            if (pikazonLimbLPApiDelegateImpl != null) {
                pikazonLimbLPApiDelegateImpl.setDisabledWarmUp(config.getDisableImageWarmUp());
                pikazonLimbLPApiDelegateImpl.setCdnChooserEnabled(config.getCdnChooserEnabled());
                return pikazonLimbLPApiDelegateImpl;
            }
            PikazonLimbLPApiDelegateImpl pikazonLimbLPApiDelegateImpl2 = new PikazonLimbLPApiDelegateImpl(config.getCdnChooserEnabled(), config.getDisableImageWarmUp());
            Pikazon.limbInstance = pikazonLimbLPApiDelegateImpl2;
            return pikazonLimbLPApiDelegateImpl2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d getPikazonInternalConfig() {
            int i11 = c.f6713b;
            return null;
        }

        @NotNull
        public final Pikazon bind(@NotNull E httpClient, @NotNull Config config) {
            Intrinsics.checkNotNullParameter(httpClient, "httpClient");
            Intrinsics.checkNotNullParameter(config, "config");
            ReentrantLock reentrantLock = Pikazon.lock;
            reentrantLock.lock();
            try {
                Pikazon pikazon = new Pikazon(httpClient, config, null);
                Pikazon.instance = pikazon;
                Pikazon.INSTANCE.createOrUpdateLimbInstance(pikazon.getConfig()).warmUpPikazonAfterModify();
                return pikazon;
            } finally {
                reentrantLock.unlock();
            }
        }

        @NotNull
        public final Pikazon getInstance() {
            Pikazon pikazon = Pikazon.instance;
            if (pikazon != null) {
                return pikazon;
            }
            ReentrantLock reentrantLock = Pikazon.lock;
            reentrantLock.lock();
            try {
                Pikazon pikazon2 = Pikazon.instance;
                if (pikazon2 != null) {
                    Unit unit = Unit.f71690a;
                    return pikazon2;
                }
                Companion companion = Pikazon.INSTANCE;
                Pikazon createDefault = companion.createDefault();
                Pikazon.instance = createDefault;
                companion.createOrUpdateLimbInstance(createDefault.getConfig());
                return createDefault;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean getInternalConfigFeatureFlag$lib_release(@NotNull a featureFlag, boolean defaultValue) {
            List<b> featureFlags;
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            d pikazonInternalConfig = getPikazonInternalConfig();
            b bVar = null;
            if (pikazonInternalConfig != null && (featureFlags = pikazonInternalConfig.getFeatureFlags()) != null) {
                Iterator<T> it = featureFlags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((b) next).getName() == featureFlag) {
                        bVar = next;
                        break;
                    }
                }
                bVar = bVar;
            }
            return bVar != null ? bVar.getEnabled() : defaultValue;
        }

        public final boolean isInitialized() {
            return Pikazon.instance != null;
        }

        private Companion() {
        }

        @InterfaceC3999a
        @NotNull
        public final Pikazon bind(@NotNull E okHttpClient, @NotNull PikazonResourceManager pikazonResourceManager, @NotNull ImagePathHandlerConfig imagePathHandlerConfig, @NotNull Config config) {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(pikazonResourceManager, "pikazonResourceManager");
            Intrinsics.checkNotNullParameter(imagePathHandlerConfig, "imagePathHandlerConfig");
            Intrinsics.checkNotNullParameter(config, "config");
            ReentrantLock reentrantLock = Pikazon.lock;
            reentrantLock.lock();
            try {
                Pikazon pikazon = new Pikazon(okHttpClient, pikazonResourceManager, imagePathHandlerConfig, config, null);
                Pikazon.instance = pikazon;
                Pikazon.INSTANCE.createOrUpdateLimbInstance(pikazon.getConfig()).warmUpPikazonAfterModify();
                return pikazon;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/Pikazon$NetworkConfiguration;", "", "userAgentHeader", "", "isCronetEnabled", "", "<init>", "(Ljava/lang/String;Z)V", "getUserAgentHeader$lib_release", "()Ljava/lang/String;", "isCronetEnabled$lib_release", "()Z", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkConfiguration {
        private final boolean isCronetEnabled;
        private final String userAgentHeader;

        public NetworkConfiguration(String str, boolean z11) {
            this.userAgentHeader = str;
            this.isCronetEnabled = z11;
        }

        /* renamed from: getUserAgentHeader$lib_release, reason: from getter */
        public final String getUserAgentHeader() {
            return this.userAgentHeader;
        }

        /* renamed from: isCronetEnabled$lib_release, reason: from getter */
        public final boolean getIsCronetEnabled() {
            return this.isCronetEnabled;
        }
    }

    public /* synthetic */ Pikazon(E e11, Config config, DefaultConstructorMarker defaultConstructorMarker) {
        this(e11, config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List cdnChooserUrlChecker$lambda$0(Pikazon pikazon) {
        Ud0.a value;
        M0<Ud0.a> cdnChooserConfigFlow$lib_release = pikazon.getCdnChooserConfigFlow$lib_release();
        if (cdnChooserConfigFlow$lib_release == null || (value = cdnChooserConfigFlow$lib_release.getValue()) == null) {
            return null;
        }
        return value.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewVisibilityInteractor getViewVisibilityInteractor() {
        ViewVisibilityInteractor viewVisibilityInteractor = this._viewVisibilityInteractor;
        return viewVisibilityInteractor == null ? ViewVisibilityInteractor.Default.INSTANCE : viewVisibilityInteractor;
    }

    private final PikazonLimbLPApiDelegateImpl get_pikazonLimbLibraryApi() {
        return limbInstance;
    }

    @NotNull
    public final Pikazon addErrorsLogger(@NotNull PikazonErrorsLogger errorsLogger) {
        Intrinsics.checkNotNullParameter(errorsLogger, "errorsLogger");
        this.errorsLoggers.add(errorsLogger);
        return this;
    }

    @NotNull
    public final Pikazon addPerformanceListener(@NotNull PerformanceListener performanceListener) {
        Intrinsics.checkNotNullParameter(performanceListener, "performanceListener");
        this.performanceListeners.add(performanceListener);
        return this;
    }

    @NotNull
    public final Pikazon addPikazonRequestListener(@NotNull PikazonRequestListener<Object> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.requestListeners.add(listener);
        return this;
    }

    public final M0<Ud0.a> getCdnChooserConfigFlow$lib_release() {
        PikazonLimbLPApiDelegateImpl pikazonLimbLPApiDelegateImpl = get_pikazonLimbLibraryApi();
        if (pikazonLimbLPApiDelegateImpl != null) {
            return pikazonLimbLPApiDelegateImpl.getConfigFlow();
        }
        return null;
    }

    @NotNull
    /* renamed from: getCdnChooserUrlChecker$lib_release, reason: from getter */
    public final CdnChooserUrlChecker getCdnChooserUrlChecker() {
        return this.cdnChooserUrlChecker;
    }

    @NotNull
    /* renamed from: getConfig$lib_release, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @NotNull
    public final List<PikazonErrorsLogger> getErrorsLoggers$lib_release() {
        return this.errorsLoggers;
    }

    @NotNull
    public final ImagePathHandler getImagePathHandler() {
        return this.imagePathHandler;
    }

    @NotNull
    public final ImageTransformationsFactory<m<Bitmap>> getImageTransformationsFactory$lib_release() {
        return (ImageTransformationsFactory) this.imageTransformationsFactory.getValue();
    }

    public final long getMaxDiskCacheSizeInBytes$lib_release() {
        Long maxDiskCacheSizeInBytes;
        d pikazonInternalConfig = INSTANCE.getPikazonInternalConfig();
        return (pikazonInternalConfig == null || (maxDiskCacheSizeInBytes = pikazonInternalConfig.getMaxDiskCacheSizeInBytes()) == null) ? this.maxDiskCacheSizeInBytes : maxDiskCacheSizeInBytes.longValue();
    }

    @NotNull
    /* renamed from: getMemoryCategory$lib_release, reason: from getter */
    public final MemoryCategory getMemoryCategory() {
        return this.memoryCategory;
    }

    @NotNull
    public final E getOkHttpClient() {
        return this.okHttpClient;
    }

    @NotNull
    public final OnConnectionRestored getOnConnectionRestored() {
        return this.onConnectionRestored;
    }

    @NotNull
    public final List<PerformanceListener> getPerformanceListeners$lib_release() {
        return this.performanceListeners;
    }

    public final Object getPikazonLimbLibrary() {
        PikazonLimbLPApiDelegateImpl pikazonLimbLPApiDelegateImpl = get_pikazonLimbLibraryApi();
        if (pikazonLimbLPApiDelegateImpl != null) {
            return pikazonLimbLPApiDelegateImpl.getPikazonLimbApi();
        }
        return null;
    }

    @NotNull
    public final PlaceholderTracker getPlaceholderTracker() {
        return getPlaceholderTracker$lib_release();
    }

    @NotNull
    public final PlaceholderTrackerImpl getPlaceholderTracker$lib_release() {
        return (PlaceholderTrackerImpl) this.placeholderTracker.getValue();
    }

    @NotNull
    public final Set<PikazonRequestListener<Object>> getRequestListeners$lib_release() {
        return this.requestListeners;
    }

    @NotNull
    /* renamed from: getThumbCache$lib_release, reason: from getter */
    public final ThumbCacheDecorator getThumbCache() {
        return this.thumbCache;
    }

    public final boolean getUseNewVisibilityChecker$lib_release() {
        return INSTANCE.getInternalConfigFeatureFlag$lib_release(a.USE_NEW_VISIBILITY_CHECKER, this.useNewVisibilityChecker);
    }

    public final boolean isComposeIntrinsicSizeEnabled() {
        return INSTANCE.getInternalConfigFeatureFlag$lib_release(a.IS_COMPOSE_INTRINSIC_SIZE_ENABLED, this.isComposeIntrinsicSizeEnabled);
    }

    public final boolean isInMemoryRetainCacheEnabled$lib_release() {
        return INSTANCE.getInternalConfigFeatureFlag$lib_release(a.IN_MEMORY_RETAIN_CACHE_ENABLED, this.isInMemoryRetainCacheEnabled);
    }

    /* renamed from: isInTestMode, reason: from getter */
    public final boolean getIsInTestMode() {
        return this.isInTestMode;
    }

    @NotNull
    public final Pikazon onConnectionRestored(@NotNull OnConnectionRestored strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.onConnectionRestored = strategy;
        return this;
    }

    @NotNull
    public final Pikazon setImagePreviewEnabled(boolean isEnabled) {
        this.thumbCache.setEnabled(INSTANCE.getInternalConfigFeatureFlag$lib_release(a.THUMBNAIL_CACHE_ENABLED, isEnabled));
        return this;
    }

    @NotNull
    public final Pikazon setInMemoryRetainCacheEnabled(boolean enabled) {
        this.isInMemoryRetainCacheEnabled = enabled;
        return this;
    }

    public final void setInTestMode(boolean z11) {
        this.isInTestMode = z11;
    }

    @NotNull
    public final Pikazon setMemoryCategory(@NotNull MemoryCategory memoryCategory) {
        Intrinsics.checkNotNullParameter(memoryCategory, "memoryCategory");
        this.memoryCategory = memoryCategory;
        return this;
    }

    @NotNull
    public final Pikazon setUseNewVisibilityChecker(boolean enabled) {
        this.useNewVisibilityChecker = enabled;
        return this;
    }

    public /* synthetic */ Pikazon(E e11, PikazonResourceManager pikazonResourceManager, ImagePathHandlerConfig imagePathHandlerConfig, Config config, DefaultConstructorMarker defaultConstructorMarker) {
        this(e11, pikazonResourceManager, imagePathHandlerConfig, config);
    }

    public final void isComposeIntrinsicSizeEnabled(boolean isEnabled) {
        this.isComposeIntrinsicSizeEnabled = INSTANCE.getInternalConfigFeatureFlag$lib_release(a.IS_COMPOSE_INTRINSIC_SIZE_ENABLED, isEnabled);
    }

    @InterfaceC3999a
    @NotNull
    public final Pikazon setMemoryCategory(@NotNull Context context, @NotNull MemoryCategory memoryCategory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(memoryCategory, "memoryCategory");
        setMemoryCategory(memoryCategory);
        return this;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;", "", "successLoadValidTimeMs", "", "cancelRequestValidTimeMs", "<init>", "(JJ)V", "getSuccessLoadValidTimeMs$lib_release", "()J", "getCancelRequestValidTimeMs$lib_release", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadTimeLogsConfiguration {
        private final long cancelRequestValidTimeMs;
        private final long successLoadValidTimeMs;

        public LoadTimeLogsConfiguration(long j11, long j12) {
            this.successLoadValidTimeMs = j11;
            this.cancelRequestValidTimeMs = j12;
        }

        /* renamed from: getCancelRequestValidTimeMs$lib_release, reason: from getter */
        public final long getCancelRequestValidTimeMs() {
            return this.cancelRequestValidTimeMs;
        }

        /* renamed from: getSuccessLoadValidTimeMs$lib_release, reason: from getter */
        public final long getSuccessLoadValidTimeMs() {
            return this.successLoadValidTimeMs;
        }

        public /* synthetic */ LoadTimeLogsConfiguration(long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 20000L : j11, (i11 & 2) != 0 ? 20000L : j12);
        }
    }

    private Pikazon(E e11, Config config) {
        Integer throttleTime;
        d.b connectionRestoredPolicy;
        OnConnectionRestored asOnConnectionRestored;
        CdnChooserUrlChecker cdnChooserUrlChecker = new CdnChooserUrlChecker(new BY.c(this));
        this.cdnChooserUrlChecker = cdnChooserUrlChecker;
        ThumbCacheDecorator thumbCacheDecorator = new ThumbCacheDecorator();
        this.thumbCache = thumbCacheDecorator;
        this.imageTransformationsFactory = k.b(Pikazon$imageTransformationsFactory$2.INSTANCE);
        this.placeholderTracker = k.b(new Pikazon$placeholderTracker$2(this));
        this.requestListeners = e0.e(new ThumbRequestListener(thumbCacheDecorator));
        this.errorsLoggers = new ArrayList();
        this.performanceListeners = new ArrayList();
        this.isComposeIntrinsicSizeEnabled = true;
        this.memoryCategory = MemoryCategory.NORMAL;
        Companion companion = INSTANCE;
        d pikazonInternalConfig = companion.getPikazonInternalConfig();
        this.onConnectionRestored = (pikazonInternalConfig == null || (connectionRestoredPolicy = pikazonInternalConfig.getConnectionRestoredPolicy()) == null || (asOnConnectionRestored = ConnectionRestoredPoliciesKt.asOnConnectionRestored(connectionRestoredPolicy)) == null) ? OnConnectionRestored.DoNothing.INSTANCE : asOnConnectionRestored;
        NetworkConfiguration networkConfiguration = config.getNetworkConfiguration();
        Long l11 = null;
        String userAgentHeader = networkConfiguration != null ? networkConfiguration.getUserAgentHeader() : null;
        d pikazonInternalConfig2 = companion.getPikazonInternalConfig();
        if (pikazonInternalConfig2 != null && (throttleTime = pikazonInternalConfig2.getThrottleTime()) != null) {
            l11 = Long.valueOf(throttleTime.intValue());
        }
        this.okHttpClient = companion.addInterceptors(e11, userAgentHeader, l11);
        this.config = config;
        this.imagePathHandler = new ImagePathHandlerImpl(cdnChooserUrlChecker);
        this.pikazonResourceManager = new PikazonResourceManagerImpl();
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B?\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB?\b\u0016\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0011B_\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\r\u0010\u0017Bu\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\r\u0010\u001cB\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\r\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u00108\u001a\u0004\u0018\u00010\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R$\u0010\u0015\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R$\u0010\u0016\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b?\u0010>R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u00108\u001a\u0004\u0018\u00010\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010BR$\u0010C\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/pikazon/Pikazon$Config;", "", "", "imageBuckets", "", "defaultImage", "", "Lru/ozon/app/android/pikazon/processors/ImageSourceProcessor;", "imageSourceProcessors", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;", "pikazonUrlFactory", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "performanceAvailabilityChecker", "<init>", "(Ljava/lang/String;ILjava/util/Set;Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;)V", "_performanceAvailabilityChecker", "_imageBuckets", "(ILru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;Ljava/lang/String;Ljava/util/Set;Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;)V", "Lru/ozon/app/android/pikazon/Pikazon$NetworkConfiguration;", "networkConfiguration", "", "disableImageWarmUp", "cdnChooserEnabled", "(Ljava/lang/String;ILjava/util/Set;Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;Lru/ozon/app/android/pikazon/Pikazon$NetworkConfiguration;ZZ)V", "Landroid/content/Context;", "applicationContext", "Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;", "logConfig", "(Ljava/lang/String;ILjava/util/Set;Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;Lru/ozon/app/android/pikazon/Pikazon$NetworkConfiguration;ZZLandroid/content/Context;Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;)V", "Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;", "_loadTimeLogsConfiguration", "(Ljava/lang/String;ILjava/util/Set;Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;Lru/ozon/app/android/pikazon/Pikazon$NetworkConfiguration;ZZLandroid/content/Context;Lru/ozon/app/android/pikazon/logging/PikazonLogConfig;Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "config", "", "setLoadTimeLogsConfiguration", "(Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;)V", "Ljava/lang/String;", "getImageBuckets", "I", "getDefaultImage", "Ljava/util/Set;", "getImageSourceProcessors", "()Ljava/util/Set;", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;", "getPikazonUrlFactory", "()Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrlFactory;", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "getPerformanceAvailabilityChecker", "()Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pikazon/Pikazon$NetworkConfiguration;", "getNetworkConfiguration$lib_release", "()Lru/ozon/app/android/pikazon/Pikazon$NetworkConfiguration;", "Z", "getDisableImageWarmUp$lib_release", "()Z", "getCdnChooserEnabled$lib_release", "Landroid/content/Context;", "getApplicationContext$lib_release", "()Landroid/content/Context;", "loadTimeLogsConfiguration", "Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;", "getLoadTimeLogsConfiguration$lib_release", "()Lru/ozon/app/android/pikazon/Pikazon$LoadTimeLogsConfiguration;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Config {
        private Context applicationContext;
        private boolean cdnChooserEnabled;
        private final int defaultImage;
        private boolean disableImageWarmUp;

        @NotNull
        private final String imageBuckets;

        @NotNull
        private final Set<ImageSourceProcessor> imageSourceProcessors;

        @NotNull
        private LoadTimeLogsConfiguration loadTimeLogsConfiguration;
        private NetworkConfiguration networkConfiguration;

        @NotNull
        private final PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker;

        @NotNull
        private final PikazonUrlFactory pikazonUrlFactory;

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC3999a
        public Config(@NotNull String imageBuckets, int i11, @NotNull Set<? extends ImageSourceProcessor> imageSourceProcessors, @NotNull PikazonUrlFactory pikazonUrlFactory, @NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker) {
            Intrinsics.checkNotNullParameter(imageBuckets, "imageBuckets");
            Intrinsics.checkNotNullParameter(imageSourceProcessors, "imageSourceProcessors");
            Intrinsics.checkNotNullParameter(pikazonUrlFactory, "pikazonUrlFactory");
            Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
            this.imageBuckets = imageBuckets;
            this.defaultImage = i11;
            this.imageSourceProcessors = imageSourceProcessors;
            this.pikazonUrlFactory = pikazonUrlFactory;
            this.performanceAvailabilityChecker = performanceAvailabilityChecker;
            this.loadTimeLogsConfiguration = new LoadTimeLogsConfiguration(0L, 0L, 3, null);
        }

        private final void setLoadTimeLogsConfiguration(LoadTimeLogsConfiguration config) {
            int i11 = c.f6713b;
            Long valueOf = config != null ? Long.valueOf(config.getSuccessLoadValidTimeMs()) : null;
            long longValue = valueOf != null ? valueOf.longValue() : this.loadTimeLogsConfiguration.getSuccessLoadValidTimeMs();
            Long valueOf2 = config != null ? Long.valueOf(config.getCancelRequestValidTimeMs()) : null;
            this.loadTimeLogsConfiguration = new LoadTimeLogsConfiguration(longValue, valueOf2 != null ? valueOf2.longValue() : this.loadTimeLogsConfiguration.getCancelRequestValidTimeMs());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.d(this.imageBuckets, config.imageBuckets) && this.defaultImage == config.defaultImage && Intrinsics.d(this.imageSourceProcessors, config.imageSourceProcessors) && Intrinsics.d(this.pikazonUrlFactory, config.pikazonUrlFactory) && Intrinsics.d(this.performanceAvailabilityChecker, config.performanceAvailabilityChecker);
        }

        /* renamed from: getApplicationContext$lib_release, reason: from getter */
        public final Context getApplicationContext() {
            return this.applicationContext;
        }

        /* renamed from: getCdnChooserEnabled$lib_release, reason: from getter */
        public final boolean getCdnChooserEnabled() {
            return this.cdnChooserEnabled;
        }

        public final int getDefaultImage() {
            return this.defaultImage;
        }

        /* renamed from: getDisableImageWarmUp$lib_release, reason: from getter */
        public final boolean getDisableImageWarmUp() {
            return this.disableImageWarmUp;
        }

        @NotNull
        public final String getImageBuckets() {
            return this.imageBuckets;
        }

        @NotNull
        public final Set<ImageSourceProcessor> getImageSourceProcessors() {
            return this.imageSourceProcessors;
        }

        @NotNull
        /* renamed from: getLoadTimeLogsConfiguration$lib_release, reason: from getter */
        public final LoadTimeLogsConfiguration getLoadTimeLogsConfiguration() {
            return this.loadTimeLogsConfiguration;
        }

        /* renamed from: getNetworkConfiguration$lib_release, reason: from getter */
        public final NetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        @NotNull
        public final PikazonPerformanceAvailabilityChecker getPerformanceAvailabilityChecker() {
            return this.performanceAvailabilityChecker;
        }

        @NotNull
        public final PikazonUrlFactory getPikazonUrlFactory() {
            return this.pikazonUrlFactory;
        }

        public int hashCode() {
            return this.performanceAvailabilityChecker.hashCode() + ((this.pikazonUrlFactory.hashCode() + ((this.imageSourceProcessors.hashCode() + C2454a.a(this.defaultImage, this.imageBuckets.hashCode() * 31, 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.imageBuckets;
            int i11 = this.defaultImage;
            Set<ImageSourceProcessor> set = this.imageSourceProcessors;
            PikazonUrlFactory pikazonUrlFactory = this.pikazonUrlFactory;
            PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker = this.performanceAvailabilityChecker;
            StringBuilder c11 = C3660k.c(i11, "Config(imageBuckets=", str, ", defaultImage=", ", imageSourceProcessors=");
            c11.append(set);
            c11.append(", pikazonUrlFactory=");
            c11.append(pikazonUrlFactory);
            c11.append(", performanceAvailabilityChecker=");
            c11.append(pikazonPerformanceAvailabilityChecker);
            c11.append(")");
            return c11.toString();
        }

        public /* synthetic */ Config(String str, int i11, Set set, PikazonUrlFactory pikazonUrlFactory, PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? "100,200,350,500,800,1000" : str, i11, (Set<? extends ImageSourceProcessor>) ((i12 & 4) != 0 ? e0.h(new DefaultIconImageSourceProcessor()) : set), (i12 & 8) != 0 ? new PikazonUrlFactoryStub() : pikazonUrlFactory, pikazonPerformanceAvailabilityChecker);
        }

        public /* synthetic */ Config(int i11, PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker, String str, Set set, PikazonUrlFactory pikazonUrlFactory, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, pikazonPerformanceAvailabilityChecker, (i12 & 4) != 0 ? "100,200,350,500,800,1000" : str, (Set<? extends ImageSourceProcessor>) ((i12 & 8) != 0 ? e0.h(new DefaultIconImageSourceProcessor()) : set), (i12 & 16) != 0 ? new PikazonUrlFactoryStub() : pikazonUrlFactory);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Config(int i11, @NotNull PikazonPerformanceAvailabilityChecker _performanceAvailabilityChecker, @NotNull String _imageBuckets, @NotNull Set<? extends ImageSourceProcessor> imageSourceProcessors, @NotNull PikazonUrlFactory pikazonUrlFactory) {
            this((r1 == null || (r1 = r1.getSizeBuckets()) == null || (r1 = C7714v.V(r1, ",", null, null, null, 62)) == null) ? _imageBuckets : r1, i11, imageSourceProcessors, pikazonUrlFactory, new PikazonPerformanceAvailabilityChecker() { // from class: ru.ozon.app.android.pikazon.Pikazon.Config.1
                private final /* synthetic */ PikazonPerformanceAvailabilityChecker $$delegate_0;

                {
                    this.$$delegate_0 = PikazonPerformanceAvailabilityChecker.this;
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
                public boolean isImageErrorsAnalyticsEnabled(PikazonErrorsLogger.AnalyticsPlatform analyticsPlatform) {
                    Intrinsics.checkNotNullParameter(analyticsPlatform, "analyticsPlatform");
                    return Pikazon.INSTANCE.getInternalConfigFeatureFlag$lib_release(a.IMAGE_LOADING_FAILURE_LOGGING_ENABLED, PikazonPerformanceAvailabilityChecker.this.isImageErrorsAnalyticsEnabled(analyticsPlatform));
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
                public boolean isImagePlaceholderAnalyticsEnabled() {
                    return Pikazon.INSTANCE.getInternalConfigFeatureFlag$lib_release(a.IMAGE_PLACEHOLDER_ANALYTICS_ENABLED, PikazonPerformanceAvailabilityChecker.this.isImagePlaceholderAnalyticsEnabled());
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
                public boolean isLoadCancellingAnalyticsEnabled() {
                    return Pikazon.INSTANCE.getInternalConfigFeatureFlag$lib_release(a.IMAGE_LOADING_FAILURE_LOGGING_ENABLED, PikazonPerformanceAvailabilityChecker.this.isLoadCancellingAnalyticsEnabled());
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
                public boolean isPerformanceAnalyticsEnabled() {
                    return Pikazon.INSTANCE.getInternalConfigFeatureFlag$lib_release(a.PERF_LOGS_IN_CONSOLE_ENABLED, PikazonPerformanceAvailabilityChecker.this.isPerformanceAnalyticsEnabled());
                }
            });
            Set<Integer> sizeBuckets;
            String V11;
            Intrinsics.checkNotNullParameter(_performanceAvailabilityChecker, "_performanceAvailabilityChecker");
            Intrinsics.checkNotNullParameter(_imageBuckets, "_imageBuckets");
            Intrinsics.checkNotNullParameter(imageSourceProcessors, "imageSourceProcessors");
            Intrinsics.checkNotNullParameter(pikazonUrlFactory, "pikazonUrlFactory");
            Companion companion = Pikazon.INSTANCE;
            d pikazonInternalConfig = companion.getPikazonInternalConfig();
            this.cdnChooserEnabled = companion.getInternalConfigFeatureFlag$lib_release(a.CDN_CHOOSER_ENABLED, this.cdnChooserEnabled);
            setLoadTimeLogsConfiguration(null);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Config(java.lang.String r2, int r3, java.util.Set r4, ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory r5, ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker r6, ru.ozon.app.android.pikazon.Pikazon.NetworkConfiguration r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L6
                java.lang.String r2 = "100,200,350,500,800,1000"
            L6:
                r11 = r10 & 4
                if (r11 == 0) goto L13
                ru.ozon.app.android.pikazon.processors.DefaultIconImageSourceProcessor r4 = new ru.ozon.app.android.pikazon.processors.DefaultIconImageSourceProcessor
                r4.<init>()
                java.util.Set r4 = kotlin.collections.e0.h(r4)
            L13:
                r11 = r10 & 8
                if (r11 == 0) goto L1c
                ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactoryStub r5 = new ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactoryStub
                r5.<init>()
            L1c:
                r11 = r10 & 32
                if (r11 == 0) goto L21
                r7 = 0
            L21:
                r11 = r10 & 64
                r0 = 0
                if (r11 == 0) goto L27
                r8 = r0
            L27:
                r10 = r10 & 128(0x80, float:1.8E-43)
                if (r10 == 0) goto L35
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3e
            L35:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3e:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pikazon.Pikazon.Config.<init>(java.lang.String, int, java.util.Set, ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory, ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker, ru.ozon.app.android.pikazon.Pikazon$NetworkConfiguration, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(@NotNull String imageBuckets, int i11, @NotNull Set<? extends ImageSourceProcessor> imageSourceProcessors, @NotNull PikazonUrlFactory pikazonUrlFactory, @NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, NetworkConfiguration networkConfiguration, boolean z11, boolean z12) {
            this(i11, performanceAvailabilityChecker, imageBuckets, imageSourceProcessors, pikazonUrlFactory);
            Intrinsics.checkNotNullParameter(imageBuckets, "imageBuckets");
            Intrinsics.checkNotNullParameter(imageSourceProcessors, "imageSourceProcessors");
            Intrinsics.checkNotNullParameter(pikazonUrlFactory, "pikazonUrlFactory");
            Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
            this.networkConfiguration = networkConfiguration;
            this.disableImageWarmUp = z11;
            this.cdnChooserEnabled = Pikazon.INSTANCE.getInternalConfigFeatureFlag$lib_release(a.CDN_CHOOSER_ENABLED, z12);
            setLoadTimeLogsConfiguration(null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(@NotNull String imageBuckets, int i11, @NotNull Set<? extends ImageSourceProcessor> imageSourceProcessors, @NotNull PikazonUrlFactory pikazonUrlFactory, @NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, NetworkConfiguration networkConfiguration, boolean z11, boolean z12, Context context, @NotNull PikazonLogConfig logConfig) {
            this(i11, performanceAvailabilityChecker, imageBuckets, imageSourceProcessors, pikazonUrlFactory);
            Intrinsics.checkNotNullParameter(imageBuckets, "imageBuckets");
            Intrinsics.checkNotNullParameter(imageSourceProcessors, "imageSourceProcessors");
            Intrinsics.checkNotNullParameter(pikazonUrlFactory, "pikazonUrlFactory");
            Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
            Intrinsics.checkNotNullParameter(logConfig, "logConfig");
            int i12 = c.f6713b;
            this.networkConfiguration = networkConfiguration;
            this.disableImageWarmUp = z11;
            this.cdnChooserEnabled = Pikazon.INSTANCE.getInternalConfigFeatureFlag$lib_release(a.CDN_CHOOSER_ENABLED, z12);
            this.applicationContext = context;
            PikazonLogger.INSTANCE.initialize(logConfig);
            setLoadTimeLogsConfiguration(null);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Config(java.lang.String r3, int r4, java.util.Set r5, ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory r6, ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker r7, ru.ozon.app.android.pikazon.Pikazon.NetworkConfiguration r8, boolean r9, boolean r10, android.content.Context r11, ru.ozon.app.android.pikazon.logging.PikazonLogConfig r12, ru.ozon.app.android.pikazon.Pikazon.LoadTimeLogsConfiguration r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r2 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                java.lang.String r3 = "100,200,350,500,800,1000"
            L6:
                r15 = r14 & 4
                if (r15 == 0) goto L13
                ru.ozon.app.android.pikazon.processors.DefaultIconImageSourceProcessor r5 = new ru.ozon.app.android.pikazon.processors.DefaultIconImageSourceProcessor
                r5.<init>()
                java.util.Set r5 = kotlin.collections.e0.h(r5)
            L13:
                r15 = r14 & 8
                if (r15 == 0) goto L1c
                ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactoryStub r6 = new ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactoryStub
                r6.<init>()
            L1c:
                r15 = r14 & 32
                r0 = 0
                if (r15 == 0) goto L22
                r8 = r0
            L22:
                r15 = r14 & 64
                r1 = 0
                if (r15 == 0) goto L28
                r9 = r1
            L28:
                r15 = r14 & 128(0x80, float:1.8E-43)
                if (r15 == 0) goto L2d
                r10 = r1
            L2d:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L32
                r11 = r0
            L32:
                r15 = r14 & 512(0x200, float:7.17E-43)
                if (r15 == 0) goto L38
                ru.ozon.app.android.pikazon.logging.PikazonLogConfig$Disabled r12 = ru.ozon.app.android.pikazon.logging.PikazonLogConfig.Disabled.INSTANCE
            L38:
                r14 = r14 & 1024(0x400, float:1.435E-42)
                if (r14 == 0) goto L49
                r15 = r0
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L55
            L49:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L55:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.pikazon.Pikazon.Config.<init>(java.lang.String, int, java.util.Set, ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory, ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker, ru.ozon.app.android.pikazon.Pikazon$NetworkConfiguration, boolean, boolean, android.content.Context, ru.ozon.app.android.pikazon.logging.PikazonLogConfig, ru.ozon.app.android.pikazon.Pikazon$LoadTimeLogsConfiguration, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(@NotNull String imageBuckets, int i11, @NotNull Set<? extends ImageSourceProcessor> imageSourceProcessors, @NotNull PikazonUrlFactory pikazonUrlFactory, @NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, NetworkConfiguration networkConfiguration, boolean z11, boolean z12, Context context, @NotNull PikazonLogConfig logConfig, LoadTimeLogsConfiguration loadTimeLogsConfiguration) {
            this(imageBuckets, i11, imageSourceProcessors, pikazonUrlFactory, performanceAvailabilityChecker, networkConfiguration, z11, z12, context, logConfig);
            Intrinsics.checkNotNullParameter(imageBuckets, "imageBuckets");
            Intrinsics.checkNotNullParameter(imageSourceProcessors, "imageSourceProcessors");
            Intrinsics.checkNotNullParameter(pikazonUrlFactory, "pikazonUrlFactory");
            Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
            Intrinsics.checkNotNullParameter(logConfig, "logConfig");
            setLoadTimeLogsConfiguration(loadTimeLogsConfiguration);
        }
    }

    @InterfaceC3999a
    private Pikazon(E e11, PikazonResourceManager pikazonResourceManager, ImagePathHandlerConfig imagePathHandlerConfig, Config config) {
        Integer throttleTime;
        d.b connectionRestoredPolicy;
        OnConnectionRestored asOnConnectionRestored;
        CdnChooserUrlChecker cdnChooserUrlChecker = new CdnChooserUrlChecker(new BY.c(this));
        this.cdnChooserUrlChecker = cdnChooserUrlChecker;
        ThumbCacheDecorator thumbCacheDecorator = new ThumbCacheDecorator();
        this.thumbCache = thumbCacheDecorator;
        this.imageTransformationsFactory = k.b(Pikazon$imageTransformationsFactory$2.INSTANCE);
        this.placeholderTracker = k.b(new Pikazon$placeholderTracker$2(this));
        this.requestListeners = e0.e(new ThumbRequestListener(thumbCacheDecorator));
        this.errorsLoggers = new ArrayList();
        this.performanceListeners = new ArrayList();
        this.isComposeIntrinsicSizeEnabled = true;
        this.memoryCategory = MemoryCategory.NORMAL;
        Companion companion = INSTANCE;
        d pikazonInternalConfig = companion.getPikazonInternalConfig();
        this.onConnectionRestored = (pikazonInternalConfig == null || (connectionRestoredPolicy = pikazonInternalConfig.getConnectionRestoredPolicy()) == null || (asOnConnectionRestored = ConnectionRestoredPoliciesKt.asOnConnectionRestored(connectionRestoredPolicy)) == null) ? OnConnectionRestored.DoNothing.INSTANCE : asOnConnectionRestored;
        NetworkConfiguration networkConfiguration = config.getNetworkConfiguration();
        Long l11 = null;
        String userAgentHeader = networkConfiguration != null ? networkConfiguration.getUserAgentHeader() : null;
        d pikazonInternalConfig2 = companion.getPikazonInternalConfig();
        if (pikazonInternalConfig2 != null && (throttleTime = pikazonInternalConfig2.getThrottleTime()) != null) {
            l11 = Long.valueOf(throttleTime.intValue());
        }
        this.okHttpClient = companion.addInterceptors(e11, userAgentHeader, l11);
        this.config = config;
        this.imagePathHandler = new ImagePathHandlerImpl(imagePathHandlerConfig, cdnChooserUrlChecker);
        this.pikazonResourceManager = pikazonResourceManager;
    }
}
