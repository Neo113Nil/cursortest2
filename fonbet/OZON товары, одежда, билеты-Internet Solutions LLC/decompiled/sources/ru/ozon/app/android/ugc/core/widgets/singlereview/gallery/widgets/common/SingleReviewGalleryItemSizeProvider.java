package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common;

import android.content.Context;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "defaultBigSize", "I", "getDefaultBigSize", "()I", "smallItemSize", "getSmallItemSize", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewGalleryItemSizeProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int defaultItemSize;
    private static final int dividerSize;
    private static final int horizontalMargin;
    private static final int topMargin;
    private final int defaultBigSize;
    private final int smallItemSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/common/SingleReviewGalleryItemSizeProvider$Companion;", "", "<init>", "()V", "topMargin", "", "getTopMargin", "()I", "horizontalMargin", "getHorizontalMargin", "dividerSize", "getDividerSize", "defaultItemSize", "getDefaultItemSize", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDefaultItemSize() {
            return SingleReviewGalleryItemSizeProvider.defaultItemSize;
        }

        public final int getDividerSize() {
            return SingleReviewGalleryItemSizeProvider.dividerSize;
        }

        public final int getHorizontalMargin() {
            return SingleReviewGalleryItemSizeProvider.horizontalMargin;
        }

        public final int getTopMargin() {
            return SingleReviewGalleryItemSizeProvider.topMargin;
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        topMargin = dimens.getDP_16();
        horizontalMargin = dimens.getDP_16();
        dividerSize = dimens.getDP_4();
        defaultItemSize = ResourceExtKt.toPx(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    public SingleReviewGalleryItemSizeProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = context.getResources().getDisplayMetrics().widthPixels - (horizontalMargin * 2);
        this.defaultBigSize = i11;
        this.smallItemSize = (i11 - (dividerSize * 2)) / 3;
    }

    public final int getSmallItemSize() {
        return this.smallItemSize;
    }
}
