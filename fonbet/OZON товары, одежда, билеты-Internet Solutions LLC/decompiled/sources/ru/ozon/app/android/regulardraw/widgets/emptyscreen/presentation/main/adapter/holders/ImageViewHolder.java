package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/ImageViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/atom/image/Image;", "view", "", "isSmallScreen", "Landroid/widget/FrameLayout;", "containerView", "<init>", "(Lru/ozon/uni/android/atom/image/Image;ZLandroid/widget/FrameLayout;)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "item", "", "bind", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "Lru/ozon/uni/android/atom/image/Image;", "Z", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageViewHolder extends j {
    private final boolean isSmallScreen;

    @NotNull
    private final Image view;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = Image.$stable;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/ImageViewHolder$Companion;", "", "<init>", "()V", "SMALL_IMAGE_SIZE_DP", "", "create", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/ImageViewHolder;", "context", "Landroid/content/Context;", "isSmallScreen", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ImageViewHolder create(@NotNull Context context, boolean isSmallScreen) {
            Intrinsics.checkNotNullParameter(context, "context");
            Image image = new Image(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            image.setLayoutParams(layoutParams);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new RecyclerView.p(-1, -2));
            frameLayout.addView(image);
            Unit unit = Unit.f71690a;
            return new ImageViewHolder(image, isSmallScreen, frameLayout);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(@NotNull Image view, boolean z11, @NotNull FrameLayout containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.view = view;
        this.isSmallScreen = z11;
    }

    public final void bind(@NotNull ImageDTO item) {
        ImageDTO copy;
        Intrinsics.checkNotNullParameter(item, "item");
        Image image = this.view;
        copy = item.copy((r34 & 1) != 0 ? item.image : null, (r34 & 2) != 0 ? item.backgroundColor : null, (r34 & 4) != 0 ? item.aspectRatio : null, (r34 & 8) != 0 ? item.hasParanja : false, (r34 & 16) != 0 ? item.layoutPaddingLeft : null, (r34 & 32) != 0 ? item.layoutPaddingRight : null, (r34 & 64) != 0 ? item.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? item.layoutPaddingBottom : null, (r34 & 256) != 0 ? item.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? item.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? item.testInfo : null, (r34 & 2048) != 0 ? item.trackingInfo : null, (r34 & 4096) != 0 ? item.imageWidth : this.isSmallScreen ? 160 : item.getImageWidth(), (r34 & 8192) != 0 ? item.imageType : null, (r34 & 16384) != 0 ? item.fitType : null, (r34 & 32768) != 0 ? item.customRatio : null);
        ImageHolderKt.bind$default(image, copy, null, 2, null);
    }
}
