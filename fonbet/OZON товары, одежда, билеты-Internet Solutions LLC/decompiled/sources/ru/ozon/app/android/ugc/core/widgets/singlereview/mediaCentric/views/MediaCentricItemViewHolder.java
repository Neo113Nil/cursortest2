package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import WZ.l;
import WZ.t;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO.MediaItemVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R(\u0010\r\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "T", "Ljk0/j;", "LWZ/l;", "tokenizedAnalytics", "Landroid/view/View;", "view", "<init>", "(LWZ/l;Landroid/view/View;)V", "", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;)V", "", "", "payloads", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;Ljava/util/List;)V", "LWZ/l;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "getItem", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricImageViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricVideoViewHolder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class MediaCentricItemViewHolder<T extends MediaCentricVO.MediaItemVO> extends j {
    private T item;

    @NotNull
    private final l tokenizedAnalytics;

    public /* synthetic */ MediaCentricItemViewHolder(l lVar, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, view);
    }

    public void bind(@NotNull T item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
    }

    protected final T getItem() {
        return this.item;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t viewEvent;
        super.onViewInVisibleBounds();
        T t2 = this.item;
        if (t2 == null || (viewEvent = t2.getViewEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, viewEvent);
    }

    private MediaCentricItemViewHolder(l lVar, View view) {
        super(view);
        this.tokenizedAnalytics = lVar;
    }

    public void bind(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }
}
