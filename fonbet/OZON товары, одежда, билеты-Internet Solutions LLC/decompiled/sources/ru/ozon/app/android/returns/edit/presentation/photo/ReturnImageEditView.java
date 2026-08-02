package ru.ozon.app.android.returns.edit.presentation.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "marinHorizontal", "titleMarinTop", "titleMarinBottom", "validationMarinBottom", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "validationTAV", "getValidationTAV", "photosRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getPhotosRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnImageEditView extends LinearLayout {
    private final int marinHorizontal;

    @NotNull
    private final RecyclerView photosRecyclerView;
    private final int titleMarinBottom;
    private final int titleMarinTop;

    @NotNull
    private final TextAtomV2View titleTAV;
    private final int validationMarinBottom;

    @NotNull
    private final TextAtomV2View validationTAV;

    public /* synthetic */ ReturnImageEditView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final RecyclerView getPhotosRecyclerView() {
        return this.photosRecyclerView;
    }

    @NotNull
    public final TextAtomV2View getTitleTAV() {
        return this.titleTAV;
    }

    @NotNull
    public final TextAtomV2View getValidationTAV() {
        return this.validationTAV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnImageEditView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.marinHorizontal = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.titleMarinTop = px2;
        int px3 = ResourceExtKt.toPx(4, context);
        this.titleMarinBottom = px3;
        int px4 = ResourceExtKt.toPx(4, context);
        this.validationMarinBottom = px4;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(px, px2, px, px3);
        textAtomV2View.setLayoutParams(marginLayoutParams);
        this.titleTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(px, 0, px, px4);
        textAtomV2View2.setLayoutParams(marginLayoutParams2);
        ViewExtKt.gone(textAtomV2View2);
        this.validationTAV = textAtomV2View2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        setOrientation(1);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.photosRecyclerView = recyclerView;
        View.generateViewId();
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(recyclerView);
    }
}
