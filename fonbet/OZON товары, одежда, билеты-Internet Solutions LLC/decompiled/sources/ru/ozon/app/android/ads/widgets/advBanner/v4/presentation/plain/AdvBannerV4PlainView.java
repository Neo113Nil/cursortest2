package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.R$id;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "itemsRv", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "getItemsRv", "()Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4PlainView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int RV_PADDINGS_PX = ResourceExtKt.toPx(12);

    @NotNull
    private final LoopedRecyclerView itemsRv;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainView$Companion;", "", "<init>", "()V", "RV_PADDINGS_PX", "", "getRV_PADDINGS_PX", "()I", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getRV_PADDINGS_PX() {
            return AdvBannerV4PlainView.RV_PADDINGS_PX;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdvBannerV4PlainView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final LoopedRecyclerView getItemsRv() {
        return this.itemsRv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvBannerV4PlainView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        LoopedRecyclerView loopedRecyclerView = new LoopedRecyclerView(context, attributeSet, i11);
        loopedRecyclerView.setId(R$id.itemsRv);
        loopedRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        loopedRecyclerView.setNestedScrollingEnabled(false);
        loopedRecyclerView.setClipToPadding(false);
        int i13 = RV_PADDINGS_PX;
        loopedRecyclerView.setPadding(i13, loopedRecyclerView.getPaddingTop(), i13, loopedRecyclerView.getPaddingBottom());
        loopedRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.itemsRv = loopedRecyclerView;
        setId(R$id.advBanner);
        addView(loopedRecyclerView);
    }
}
