package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0017¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ButtonsRv;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/pdp/utils/DPS;", "context", "Landroid/content/Context;", "preCreationConfig", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;)V", "onTouchEvent", "", "e", "Landroid/view/MotionEvent;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV5ButtonsRv extends RecyclerView implements DPS {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5ButtonsRv(@NotNull Context context, @NotNull GalleryV5PreCreationConfig preCreationConfig) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        setId(R$id.galleryV5ButtonsV);
        setNestedScrollingEnabled(false);
        setLayoutManager(preCreationConfig.getIsCreateOnBoarding() ? new GalleryV5RightAlignedLinearLayoutManager(context) : new LinearLayoutManager(context, 1, false));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        layoutParams.setMargins(getDp8(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, getDp12(), getDp4());
        setLayoutParams(layoutParams);
        setItemAnimator(null);
        setOverScrollMode(2);
        addItemDecoration(new GalleryV5ButtonDecorator());
    }

    public int getDp12() {
        return DPS.DefaultImpls.getDp12(this);
    }

    public int getDp4() {
        return DPS.DefaultImpls.getDp4(this);
    }

    public int getDp8() {
        return DPS.DefaultImpls.getDp8(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent e11) {
        return false;
    }
}
