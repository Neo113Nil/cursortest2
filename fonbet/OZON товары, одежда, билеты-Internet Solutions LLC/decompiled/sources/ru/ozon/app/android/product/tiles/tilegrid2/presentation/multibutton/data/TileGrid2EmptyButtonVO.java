package ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ButtonsVO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2EmptyButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ButtonsVO;", "", "rootTileWidgetId", "id", "<init>", "(JJ)V", "J", "getRootTileWidgetId", "()J", "getId", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2EmptyButtonVO implements TileGrid2ButtonsVO {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long id;
    private final long rootTileWidgetId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2EmptyButtonVO$Companion;", "", "<init>", "()V", "getInstance", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2EmptyButtonVO;", "rootTileWidgetId", "", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TileGrid2EmptyButtonVO getInstance$default(Companion companion, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = -1;
            }
            return companion.getInstance(j11);
        }

        @NotNull
        public final TileGrid2EmptyButtonVO getInstance(long rootTileWidgetId) {
            return new TileGrid2EmptyButtonVO(rootTileWidgetId, 0L, 2, null);
        }

        private Companion() {
        }
    }

    private TileGrid2EmptyButtonVO(long j11, long j12) {
        this.rootTileWidgetId = j11;
        this.id = j12;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return TileGrid2ButtonsVO.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TileGrid2ButtonsVO.DefaultImpls.getViewItemKey(this);
    }

    /* synthetic */ TileGrid2EmptyButtonVO(long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? -1L : j12);
    }
}
