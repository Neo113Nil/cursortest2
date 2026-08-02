package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import C.D;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "adBannerRv", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "getAdBannerRv", "()Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerView extends FrameLayout {

    @NotNull
    private final LoopedRecyclerView adBannerRv;

    public /* synthetic */ AdBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final LoopedRecyclerView getAdBannerRv() {
        return this.adBannerRv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdBannerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        LoopedRecyclerView loopedRecyclerView = new LoopedRecyclerView(context, attributeSet, i11);
        loopedRecyclerView.setId(R$id.adBannerRv);
        loopedRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        loopedRecyclerView.setNestedScrollingEnabled(false);
        loopedRecyclerView.setClipToPadding(false);
        loopedRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        loopedRecyclerView.setPadding(D.d(12), 0, D.d(12), 0);
        this.adBannerRv = loopedRecyclerView;
        setId(R$id.adBanner);
        addView(loopedRecyclerView);
    }
}
