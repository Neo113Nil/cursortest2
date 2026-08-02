package ru.ozon.app.android.favorites.domain.favoritemanager.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "", "sku", "", "changeSourceId", "", "<init>", "(JLjava/lang/Integer;)V", "getSku", "()J", "getChangeSourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteAdd;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteRemove;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FavoriteEvent {
    private final Integer changeSourceId;
    private final long sku;

    public /* synthetic */ FavoriteEvent(long j11, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, num);
    }

    public Integer getChangeSourceId() {
        return this.changeSourceId;
    }

    public long getSku() {
        return this.sku;
    }

    private FavoriteEvent(long j11, Integer num) {
        this.sku = j11;
        this.changeSourceId = num;
    }
}
