package ru.ozon.app.android.gallery.view;

import DN.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.c;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import androidx.fragment.app.G;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.GalleryPagerAdapter;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.databinding.ActivityGalleryBinding;
import ru.ozon.app.android.gallery.preview.GalleryPreviewAdapter;
import ru.ozon.app.android.video.VideoPosition;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u001dJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001dJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u001dJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\u001dJ\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/gallery/view/GalleryView;", "", "Lru/ozon/app/android/gallery/databinding/ActivityGalleryBinding;", "binding", "Landroid/view/Window;", "window", "Landroidx/fragment/app/G;", "fragmentManager", "Lkotlin/Function1;", "", "", "onPageSelectedListener", "Lkotlin/Function0;", "onCloseClickListener", "Lru/ozon/app/android/video/VideoPosition;", "videoPosition", "", "widgetName", "<init>", "(Lru/ozon/app/android/gallery/databinding/ActivityGalleryBinding;Landroid/view/Window;Landroidx/fragment/app/G;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/VideoPosition;Ljava/lang/String;)V", "", "Lru/ozon/app/android/gallery/ItemVO;", "items", "bindItems", "(Ljava/util/List;)V", "page", "setCurrentPage", "(I)V", "notifyPreviewAdapter", "()V", "position", "smoothScrollToPosition", "lockPager", "unLockPager", "showCloseBtn", "hideCloseBtn", "showPreview", "hidePreview", "", "isFullScreen", "setFullScreen", "(Z)V", "Lru/ozon/app/android/gallery/databinding/ActivityGalleryBinding;", "Landroid/view/Window;", "Landroidx/fragment/app/G;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/VideoPosition;", "Ljava/lang/String;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryView {

    @NotNull
    private final ActivityGalleryBinding binding;

    @NotNull
    private final G fragmentManager;

    @NotNull
    private final Function0<Unit> onCloseClickListener;

    @NotNull
    private final Function1<Integer, Unit> onPageSelectedListener;
    private final VideoPosition videoPosition;
    private final String widgetName;

    @NotNull
    private final Window window;

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryView(@NotNull ActivityGalleryBinding binding, @NotNull Window window, @NotNull G fragmentManager, @NotNull Function1<? super Integer, Unit> onPageSelectedListener, @NotNull Function0<Unit> onCloseClickListener, VideoPosition videoPosition, String str) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(onPageSelectedListener, "onPageSelectedListener");
        Intrinsics.checkNotNullParameter(onCloseClickListener, "onCloseClickListener");
        this.binding = binding;
        this.window = window;
        this.fragmentManager = fragmentManager;
        this.onPageSelectedListener = onPageSelectedListener;
        this.onCloseClickListener = onCloseClickListener;
        this.videoPosition = videoPosition;
        this.widgetName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindItems$lambda$1$lambda$0(GalleryView galleryView, View view) {
        galleryView.onCloseClickListener.invoke();
    }

    public final void bindItems(@NotNull List<? extends ItemVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ActivityGalleryBinding activityGalleryBinding = this.binding;
        activityGalleryBinding.viewPager.setAdapter(new GalleryPagerAdapter(items, this.fragmentManager, this.videoPosition, this.widgetName));
        activityGalleryBinding.viewPager.addOnPageChangeListener(new ViewPager.m() { // from class: ru.ozon.app.android.gallery.view.GalleryView$bindItems$1$1
            @Override // androidx.viewpager.widget.ViewPager.j
            public void onPageSelected(int position) {
                Function1 function1;
                function1 = GalleryView.this.onPageSelectedListener;
                function1.invoke(Integer.valueOf(position));
            }
        });
        activityGalleryBinding.previewRv.setAdapter(new GalleryPreviewAdapter(items, new GalleryView$bindItems$1$2(activityGalleryBinding), new GalleryView$bindItems$1$3(activityGalleryBinding)));
        activityGalleryBinding.closeIv.setOnClickListener(new b(this, 12));
        Drawable background = activityGalleryBinding.closeIv.getBackground();
        Context context = this.window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        background.setColorFilter(c.f(ResourceExtKt.color(context, R$color.clear_dark_key_600), UserVerificationMethods.USER_VERIFY_PATTERN), PorterDuff.Mode.SRC_ATOP);
    }

    public final void hideCloseBtn() {
        AppCompatImageView closeIv = this.binding.closeIv;
        Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
        ViewExtKt.gone(closeIv);
    }

    public final void hidePreview() {
        RecyclerView previewRv = this.binding.previewRv;
        Intrinsics.checkNotNullExpressionValue(previewRv, "previewRv");
        ViewExtKt.gone(previewRv);
    }

    public final void lockPager() {
        this.binding.viewPager.setLocked(true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void notifyPreviewAdapter() {
        RecyclerView.g adapter = this.binding.previewRv.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setCurrentPage(int page) {
        this.binding.viewPager.setCurrentItem(page);
    }

    public final void setFullScreen(boolean isFullScreen) {
        Window window = this.window;
        Q0 q02 = new Q0(window.getDecorView(), window);
        q02.f();
        Intrinsics.checkNotNullExpressionValue(this.window.getContext(), "getContext(...)");
        q02.e(!ThemeExtKt.isDarkThemeActive(r1));
        if (isFullScreen) {
            C5334o0.a(this.window, false);
            q02.a(7);
        } else {
            C5334o0.a(this.window, true);
            q02.g(7);
        }
    }

    public final void showCloseBtn() {
        AppCompatImageView closeIv = this.binding.closeIv;
        Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
        ViewExtKt.show(closeIv);
    }

    public final void showPreview() {
        RecyclerView previewRv = this.binding.previewRv;
        Intrinsics.checkNotNullExpressionValue(previewRv, "previewRv");
        ViewExtKt.show(previewRv);
    }

    public final void smoothScrollToPosition(int position) {
        this.binding.previewRv.smoothScrollToPosition(position);
    }

    public final void unLockPager() {
        this.binding.viewPager.setLocked(false);
    }
}
