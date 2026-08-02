package ru.ozon.app.android.travel.data.storage.offline;

import G.g;
import Lh.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "", "cacheLifetimeLimitInMillis", "", "widgets", "", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "created", "<init>", "(JLjava/util/List;J)V", "getCacheLifetimeLimitInMillis", "()J", "getWidgets", "()Ljava/util/List;", "getCreated", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfflineTravelWidgetsStateDTO {
    private final long cacheLifetimeLimitInMillis;
    private final long created;

    @NotNull
    private final List<OfflineTravelWidget> widgets;

    public OfflineTravelWidgetsStateDTO(long j11, @NotNull List<OfflineTravelWidget> widgets, long j12) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.cacheLifetimeLimitInMillis = j11;
        this.widgets = widgets;
        this.created = j12;
    }

    public static /* synthetic */ OfflineTravelWidgetsStateDTO copy$default(OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO, long j11, List list, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = offlineTravelWidgetsStateDTO.cacheLifetimeLimitInMillis;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            list = offlineTravelWidgetsStateDTO.widgets;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            j12 = offlineTravelWidgetsStateDTO.created;
        }
        return offlineTravelWidgetsStateDTO.copy(j13, list2, j12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCacheLifetimeLimitInMillis() {
        return this.cacheLifetimeLimitInMillis;
    }

    @NotNull
    public final List<OfflineTravelWidget> component2() {
        return this.widgets;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    @NotNull
    public final OfflineTravelWidgetsStateDTO copy(long cacheLifetimeLimitInMillis, @NotNull List<OfflineTravelWidget> widgets, long created) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        return new OfflineTravelWidgetsStateDTO(cacheLifetimeLimitInMillis, widgets, created);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineTravelWidgetsStateDTO)) {
            return false;
        }
        OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO = (OfflineTravelWidgetsStateDTO) other;
        return this.cacheLifetimeLimitInMillis == offlineTravelWidgetsStateDTO.cacheLifetimeLimitInMillis && Intrinsics.d(this.widgets, offlineTravelWidgetsStateDTO.widgets) && this.created == offlineTravelWidgetsStateDTO.created;
    }

    public final long getCacheLifetimeLimitInMillis() {
        return this.cacheLifetimeLimitInMillis;
    }

    public final long getCreated() {
        return this.created;
    }

    @NotNull
    public final List<OfflineTravelWidget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        return Long.hashCode(this.created) + g.b(Long.hashCode(this.cacheLifetimeLimitInMillis) * 31, 31, this.widgets);
    }

    @NotNull
    public String toString() {
        long j11 = this.cacheLifetimeLimitInMillis;
        List<OfflineTravelWidget> list = this.widgets;
        long j12 = this.created;
        StringBuilder b11 = b.b(j11, "OfflineTravelWidgetsStateDTO(cacheLifetimeLimitInMillis=", ", widgets=", list);
        b11.append(", created=");
        b11.append(j12);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ OfflineTravelWidgetsStateDTO(long j11, List list, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, (i11 & 4) != 0 ? System.currentTimeMillis() : j12);
    }
}
