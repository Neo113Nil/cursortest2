package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4Resources;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ImageButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/pdp/utils/DPS;", "context", "Landroid/content/Context;", "tintRes", "", "galleryResources", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;", "isOnBoardingChild", "", "<init>", "(Landroid/content/Context;Ljava/lang/Integer;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4Resources;Z)V", "curTintColor", "Ljava/lang/Integer;", "bind", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4ImageButtonView extends AppCompatImageView implements DPS {
    private Integer curTintColor;

    @NotNull
    private final GalleryV4Resources galleryResources;

    public /* synthetic */ GalleryV4ImageButtonView(Context context, Integer num, GalleryV4Resources galleryV4Resources, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, num, galleryV4Resources, (i11 & 8) != 0 ? false : z11);
    }

    public final void bind(@NotNull Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        ViewExtKt.bindOrGone$default(this, icon, null, 2, null);
        setContentDescription(icon.getImage());
    }

    public int getDp24() {
        return DPS.DefaultImpls.getDp24(this);
    }

    public int getDp36() {
        return DPS.DefaultImpls.getDp36(this);
    }

    public int getDp6() {
        return DPS.DefaultImpls.getDp6(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4ImageButtonView(@NotNull Context context, Integer num, @NotNull GalleryV4Resources galleryResources, boolean z11) {
        super(context, null, 0);
        LinearLayout.LayoutParams layoutParams;
        GalleryV4ImageButtonView galleryV4ImageButtonView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(galleryResources, "galleryResources");
        this.galleryResources = galleryResources;
        setId(R$id.galleryV4ImageButton);
        if (z11) {
            layoutParams = new LinearLayout.LayoutParams(getDp24(), getDp24());
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, getDp6(), getDp6(), getDp6());
            galleryV4ImageButtonView = this;
        } else {
            layoutParams = new LinearLayout.LayoutParams(getDp36(), getDp36());
            galleryV4ImageButtonView = this;
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(galleryV4ImageButtonView, getDp6(), 0, getDp6(), 0, 10, null);
        }
        setLayoutParams(layoutParams);
        Integer buttonsTint = galleryResources.getButtonsTint();
        if (buttonsTint != null) {
            ThemeExtKt.tint(this, buttonsTint);
        }
        galleryV4ImageButtonView.curTintColor = num;
    }
}
