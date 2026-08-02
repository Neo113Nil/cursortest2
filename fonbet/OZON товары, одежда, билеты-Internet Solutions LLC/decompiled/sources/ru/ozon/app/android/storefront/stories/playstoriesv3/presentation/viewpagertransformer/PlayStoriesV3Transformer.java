package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.viewpagertransformer;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/viewpagertransformer/PlayStoriesV3Transformer;", "Landroidx/viewpager2/widget/ViewPager2$i;", "<init>", "()V", "Landroid/view/View;", "page", "", "position", "", "transformPage", "(Landroid/view/View;F)V", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesV3Transformer implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void transformPage(@NotNull View page, float position) {
        Intrinsics.checkNotNullParameter(page, "page");
        float f7 = 1;
        page.setScaleY(f7 - (Math.abs(position) * 0.1f));
        page.setAlpha(f7 - (Math.abs(position) * 0.4f));
    }
}
