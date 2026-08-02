package ru.ozon.app.android.pdp.widgets.badgeListV2.presentation;

import Cm.e;
import Nh.a;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Lru/ozon/app/android/pdp/utils/DPS;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "config", "<init>", "(Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "PaddingConfig", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV2ItemDecorator extends RecyclerView.n implements DPS {

    @NotNull
    private final PaddingConfig config;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "", "", "inset", "spacedBy", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getInset", "getSpacedBy", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingConfig {
        private final int inset;
        private final int spacedBy;

        public PaddingConfig(int i11, int i12) {
            this.inset = i11;
            this.spacedBy = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingConfig)) {
                return false;
            }
            PaddingConfig paddingConfig = (PaddingConfig) other;
            return this.inset == paddingConfig.inset && this.spacedBy == paddingConfig.spacedBy;
        }

        public final int getInset() {
            return this.inset;
        }

        public final int getSpacedBy() {
            return this.spacedBy;
        }

        public int hashCode() {
            return Integer.hashCode(this.spacedBy) + (Integer.hashCode(this.inset) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("PaddingConfig(inset=", this.inset, ", spacedBy=", ")", this.spacedBy);
        }
    }

    public BadgeListV2ItemDecorator(@NotNull PaddingConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = a.a(parent, "parent", state, "state", view);
        if (a11 == -1) {
            return;
        }
        int px = UiExtKt.toPx(this.config.getInset());
        outRect.left = a11 == 0 ? px : UiExtKt.toPx(this.config.getSpacedBy());
        if (a11 != state.b() - 1) {
            px = 0;
        }
        outRect.right = px;
    }
}
