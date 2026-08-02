package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

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
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/pdp/utils/DPS;", "context", "Landroid/content/Context;", "isOnBoardingChild", "", "<init>", "(Landroid/content/Context;Z)V", "bind", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV5ImageButtonView extends AppCompatImageView implements DPS {
    public /* synthetic */ GalleryV5ImageButtonView(Context context, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? false : z11);
    }

    public final void bind(Icon icon) {
        ViewExtKt.bindOrGone$default(this, icon, null, 2, null);
        setContentDescription(icon != null ? icon.getImage() : null);
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
    public GalleryV5ImageButtonView(@NotNull Context context, boolean z11) {
        super(context, null, 0);
        LinearLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        setId(R$id.galleryV5ImageButton);
        if (z11) {
            layoutParams = new LinearLayout.LayoutParams(getDp24(), getDp24());
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, getDp6(), getDp6(), getDp6());
        } else {
            layoutParams = new LinearLayout.LayoutParams(getDp36(), getDp36());
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(this, getDp6(), 0, getDp6(), 0, 10, null);
        }
        setLayoutParams(layoutParams);
    }
}
