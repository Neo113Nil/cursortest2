package ru.ozon.app.android.storefront.stories.playstories.presentation.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/CubePageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$i;", "<init>", "()V", "Landroid/view/View;", "page", "", "position", "", "transformPage", "(Landroid/view/View;F)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CubePageTransformer implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void transformPage(@NotNull View page, float position) {
        Intrinsics.checkNotNullParameter(page, "page");
        page.setPivotX(position < 0.0f ? page.getWidth() : 0.0f);
        page.setPivotY(page.getHeight() * 0.5f);
        page.setRotationY(position * 45.0f);
    }
}
