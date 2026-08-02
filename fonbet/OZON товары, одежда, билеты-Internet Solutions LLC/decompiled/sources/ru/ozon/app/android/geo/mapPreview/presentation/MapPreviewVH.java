package ru.ozon.app.android.geo.mapPreview.presentation;

import AS.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.databinding.WidgetMapPreviewBinding;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.mapcommon.OzonMapControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.MapCommonProvider;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/geo/databinding/WidgetMapPreviewBinding;", "binding", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProvider;", "ozonMapProvider", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/databinding/WidgetMapPreviewBinding;Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProvider;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/databinding/WidgetMapPreviewBinding;", "Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewBinder;", "binder", "Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewBinder;", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "ozonMapController", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapPreviewVH extends k<MapPreviewVO> {
    private MapPreviewBinder binder;

    @NotNull
    private final WidgetMapPreviewBinding binding;

    @NotNull
    private final OzonMapControllerWrapper ozonMapController;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MapPreviewVH(@NotNull ComposerReferences refs, @NotNull WidgetMapPreviewBinding binding, @NotNull MapCommonProvider ozonMapProvider) {
        super(r0);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ozonMapProvider, "ozonMapProvider");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.refs = refs;
        this.binding = binding;
        MapPreviewView mapContainer = binding.mapContainer;
        Intrinsics.checkNotNullExpressionValue(mapContainer, "mapContainer");
        this.ozonMapController = ozonMapProvider.provideOzonMapControllerWrapper(mapContainer);
        binding.centerInMapIbv.setOnClickListener(new a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MapPreviewVH mapPreviewVH, View view) {
        CameraPositionModel defaultMapPosition;
        MapPreviewBinder mapPreviewBinder = mapPreviewVH.binder;
        if (mapPreviewBinder == null || (defaultMapPosition = mapPreviewBinder.getDefaultMapPosition()) == null) {
            return;
        }
        OzonMapController.DefaultImpls.moveToAnimated$default(mapPreviewVH.ozonMapController, defaultMapPosition, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MapPreviewVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AppCompatImageView centerInMapIbv = this.binding.centerInMapIbv;
        Intrinsics.checkNotNullExpressionValue(centerInMapIbv, "centerInMapIbv");
        centerInMapIbv.setVisibility(item.getIsUserInteractionEnabled() ? 0 : 8);
        setIsRecyclable(false);
        MapPreviewBinder mapPreviewBinder = this.binder;
        if (mapPreviewBinder != null) {
            mapPreviewBinder.setVo(item);
        } else {
            ComposerReferences composerReferences = this.refs;
            this.binder = new MapPreviewBinder(composerReferences, U7.d.c(composerReferences), this.ozonMapController, item);
        }
    }
}
