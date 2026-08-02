package ru.ozon.app.android.error.summary.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "padding", "", "toolbar", "Landroid/widget/FrameLayout;", "backButton", "Lru/ozon/uni/android/atom/icon/IconView;", "getBackButton", "()Lru/ozon/uni/android/atom/icon/IconView;", "sharingButton", "getSharingButton", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryView extends LinearLayoutCompat {

    @NotNull
    private final IconView backButton;
    private final int padding;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final IconView sharingButton;

    @NotNull
    private final FrameLayout toolbar;

    public /* synthetic */ ErrorSummaryView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @NotNull
    public final IconView getBackButton() {
        return this.backButton;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @NotNull
    public final IconView getSharingButton() {
        return this.sharingButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorSummaryView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.padding = px;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayoutCompat.a(-1, -2));
        frameLayout.setPadding(px, 0, px, px);
        addView(frameLayout);
        this.toolbar = frameLayout;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        iconView.setImageResource(R$drawable.ic_m_back);
        IconDTO.IconShape iconShape = IconDTO.IconShape.SHAPE_NONE;
        iconView.setShape(iconShape);
        frameLayout.addView(iconView);
        this.backButton = iconView;
        IconView iconView2 = new IconView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        iconView2.setLayoutParams(layoutParams);
        iconView2.setImageResource(ru.ozon.uni.R$drawable.ic_m_share);
        iconView2.setShape(iconShape);
        frameLayout.addView(iconView2);
        this.sharingButton = iconView2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayoutCompat.a(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setPadding(px, 0, px, 0);
        addView(recyclerView);
        this.recyclerView = recyclerView;
        setOrientation(1);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary));
    }
}
