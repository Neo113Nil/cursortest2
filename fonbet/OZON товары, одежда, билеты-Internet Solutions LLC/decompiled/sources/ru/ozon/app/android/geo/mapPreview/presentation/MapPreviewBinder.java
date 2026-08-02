package ru.ozon.app.android.geo.mapPreview.presentation;

import BF.b;
import Lm0.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.G;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.AbstractC7094b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.geo.mapPreview.data.Pin;
import ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewBinder;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.LogoPosition;
import ru.ozon.app.android.mapcommon.map.model.PointModel;
import ru.ozon.app.android.mapcommon.mapcommon.OzonMapControllerWrapper;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import uc.i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewBinder;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroidx/lifecycle/v;", "lifecycle", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "ozonMapController", "Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;", "vo", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/v;Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;)V", "", "bindLifecycle", "()V", "", "loading", "showProgress", "(Z)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/lifecycle/v;", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;", "getVo", "()Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;", "setVo", "(Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;)V", "Lnc/b;", "initMapDisposable", "Lnc/b;", "Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "defaultMapPosition", "Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "getDefaultMapPosition", "()Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapPreviewBinder {
    private CameraPositionModel defaultMapPosition;
    private InterfaceC8487b initMapDisposable;

    @NotNull
    private final AbstractC5434v lifecycle;

    @NotNull
    private final OzonMapControllerWrapper ozonMapController;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private MapPreviewVO vo;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            MapPreviewBinder.this.showProgress(z11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewBinder$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    public MapPreviewBinder(@NotNull ComposerReferences refs, @NotNull AbstractC5434v lifecycle, @NotNull OzonMapControllerWrapper ozonMapController, @NotNull MapPreviewVO vo) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(ozonMapController, "ozonMapController");
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.refs = refs;
        this.lifecycle = lifecycle;
        this.ozonMapController = ozonMapController;
        this.vo = vo;
        AbstractC7094b initMap = ozonMapController.initMap(new AnonymousClass1());
        InterfaceC9019a interfaceC9019a = new InterfaceC9019a() { // from class: Jy.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                MapPreviewBinder._init_$lambda$3(MapPreviewBinder.this);
            }
        };
        b bVar = new b(new AnonymousClass3(a.f17149a), 3);
        initMap.getClass();
        i iVar = new i(bVar, interfaceC9019a);
        initMap.a(iVar);
        this.initMapDisposable = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(final MapPreviewBinder mapPreviewBinder) {
        final View contentView = mapPreviewBinder.ozonMapController.getContentView();
        G.a(contentView, new Runnable() { // from class: ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewBinder$_init_$lambda$3$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                OzonMapControllerWrapper ozonMapControllerWrapper;
                OzonMapControllerWrapper ozonMapControllerWrapper2;
                OzonMapControllerWrapper ozonMapControllerWrapper3;
                OzonMapControllerWrapper ozonMapControllerWrapper4;
                ComposerReferences composerReferences;
                Context applicationContext;
                mapPreviewBinder.bindLifecycle();
                ozonMapControllerWrapper = mapPreviewBinder.ozonMapController;
                ozonMapControllerWrapper.setRotateGesturesEnabled(false);
                ozonMapControllerWrapper.setTiltGesturesEnabled(false);
                ozonMapControllerWrapper.setScrollGesturesEnabled(mapPreviewBinder.getVo().getIsUserInteractionEnabled());
                ozonMapControllerWrapper.setZoomGesturesEnabled(mapPreviewBinder.getVo().getIsUserInteractionEnabled());
                BoundingBoxModel boundingBoxModel = new BoundingBoxModel(new PointModel(mapPreviewBinder.getVo().getViewport().getLeftBottom().getLatitude(), mapPreviewBinder.getVo().getViewport().getLeftBottom().getLongitude()), new PointModel(mapPreviewBinder.getVo().getViewport().getRightTop().getLatitude(), mapPreviewBinder.getVo().getViewport().getRightTop().getLongitude()));
                ozonMapControllerWrapper2 = mapPreviewBinder.ozonMapController;
                CameraPositionModel cameraPosition = ozonMapControllerWrapper2.getCameraPosition(boundingBoxModel);
                if (cameraPosition == null) {
                    return;
                }
                CameraPositionModel copy = cameraPosition.copy(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, 0.0f);
                ozonMapControllerWrapper3 = mapPreviewBinder.ozonMapController;
                OzonMapController.DefaultImpls.setLogoAlignment$default(ozonMapControllerWrapper3, LogoPosition.LEFT_TOP, 0, 0, 6, null);
                ozonMapControllerWrapper4 = mapPreviewBinder.ozonMapController;
                OzonMapController.DefaultImpls.moveToAnimated$default(ozonMapControllerWrapper4, copy, null, null, 6, null);
                mapPreviewBinder.defaultMapPosition = copy;
                List<Pin> pins = mapPreviewBinder.getVo().getPins();
                if (pins != null) {
                    for (Pin pin : pins) {
                        composerReferences = mapPreviewBinder.refs;
                        r a11 = composerReferences.getContainer().a();
                        if (a11 != null && (applicationContext = a11.getApplicationContext()) != null) {
                            ContextExtKt.loadAsBitmap$default(applicationContext, pin.getIcon(), null, null, null, new MapPreviewBinder$2$1$2$1(mapPreviewBinder, pin), 14, null);
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindLifecycle() {
        this.lifecycle.a(new androidx.lifecycle.G() { // from class: ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewBinder$bindLifecycle$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AbstractC5434v.a.values().length];
                    try {
                        iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                OzonMapControllerWrapper ozonMapControllerWrapper;
                OzonMapControllerWrapper ozonMapControllerWrapper2;
                OzonMapControllerWrapper ozonMapControllerWrapper3;
                AbstractC5434v abstractC5434v;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                try {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i11 == 1) {
                        ozonMapControllerWrapper = MapPreviewBinder.this.ozonMapController;
                        ozonMapControllerWrapper.onStart();
                    } else if (i11 == 2) {
                        ozonMapControllerWrapper2 = MapPreviewBinder.this.ozonMapController;
                        ozonMapControllerWrapper2.onStop();
                    } else {
                        if (i11 != 3) {
                            return;
                        }
                        ozonMapControllerWrapper3 = MapPreviewBinder.this.ozonMapController;
                        ozonMapControllerWrapper3.onDestroy();
                        abstractC5434v = MapPreviewBinder.this.lifecycle;
                        abstractC5434v.e(this);
                    }
                } catch (Exception e11) {
                    a.f17149a.e(e11);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgress(boolean loading) {
        ViewGroup composerProgressBar;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        if (view == null || (composerProgressBar = ComposerViewExtensionKt.composerProgressBar(view)) == null) {
            return;
        }
        composerProgressBar.setVisibility(loading ? 0 : 8);
    }

    public final CameraPositionModel getDefaultMapPosition() {
        return this.defaultMapPosition;
    }

    @NotNull
    public final MapPreviewVO getVo() {
        return this.vo;
    }

    public final void setVo(@NotNull MapPreviewVO mapPreviewVO) {
        Intrinsics.checkNotNullParameter(mapPreviewVO, "<set-?>");
        this.vo = mapPreviewVO;
    }
}
