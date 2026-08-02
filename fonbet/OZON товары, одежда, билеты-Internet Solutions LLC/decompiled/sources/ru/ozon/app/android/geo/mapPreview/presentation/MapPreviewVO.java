package ru.ozon.app.android.geo.mapPreview.presentation;

import Bl.b;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.mapPreview.data.Pin;
import ru.ozon.app.android.geo.mapPreview.data.ViewPort;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/geo/mapPreview/presentation/MapPreviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isUserInteractionEnabled", "", "Lru/ozon/app/android/geo/mapPreview/data/Pin;", "pins", "Lru/ozon/app/android/geo/mapPreview/data/ViewPort;", "viewport", "<init>", "(JZLjava/util/List;Lru/ozon/app/android/geo/mapPreview/data/ViewPort;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "Lru/ozon/app/android/geo/mapPreview/data/ViewPort;", "getViewport", "()Lru/ozon/app/android/geo/mapPreview/data/ViewPort;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MapPreviewVO implements c {
    private final long id;
    private final boolean isUserInteractionEnabled;
    private final List<Pin> pins;

    @NotNull
    private final ViewPort viewport;

    public MapPreviewVO(long j11, boolean z11, List<Pin> list, @NotNull ViewPort viewport) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        this.id = j11;
        this.isUserInteractionEnabled = z11;
        this.pins = list;
        this.viewport = viewport;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapPreviewVO)) {
            return false;
        }
        MapPreviewVO mapPreviewVO = (MapPreviewVO) other;
        return this.id == mapPreviewVO.id && this.isUserInteractionEnabled == mapPreviewVO.isUserInteractionEnabled && Intrinsics.d(this.pins, mapPreviewVO.pins) && Intrinsics.d(this.viewport, mapPreviewVO.viewport);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<Pin> getPins() {
        return this.pins;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final ViewPort getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        int a11 = C3532b.a(Long.hashCode(this.id) * 31, 31, this.isUserInteractionEnabled);
        List<Pin> list = this.pins;
        return this.viewport.hashCode() + ((a11 + (list == null ? 0 : list.hashCode())) * 31);
    }

    /* renamed from: isUserInteractionEnabled, reason: from getter */
    public final boolean getIsUserInteractionEnabled() {
        return this.isUserInteractionEnabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isUserInteractionEnabled;
        List<Pin> list = this.pins;
        ViewPort viewPort = this.viewport;
        StringBuilder c11 = b.c(j11, "MapPreviewVO(id=", ", isUserInteractionEnabled=", z11);
        c11.append(", pins=");
        c11.append(list);
        c11.append(", viewport=");
        c11.append(viewPort);
        c11.append(")");
        return c11.toString();
    }
}
