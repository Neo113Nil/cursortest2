package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$id;
import ru.ozon.app.android.bank.R$layout;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "image", "Lru/ozon/uni/android/atom/image/Image;", "getImage", "()Lru/ozon/uni/android/atom/image/Image;", "closeButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getCloseButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "getSubtitle", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerItemView extends FrameLayout {

    @NotNull
    private final ButtonV3View button;

    @NotNull
    private final IconButtonV3View closeButton;

    @NotNull
    private final Image image;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    public /* synthetic */ AdBannerItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final ButtonV3View getButton() {
        return this.button;
    }

    @NotNull
    public final IconButtonV3View getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final TextAtomV2View getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtomV2View getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdBannerItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.ad_banner_item, this);
        this.image = (Image) findViewById(R$id.image);
        this.closeButton = (IconButtonV3View) findViewById(R$id.closeButton);
        this.title = (TextAtomV2View) findViewById(R$id.title);
        this.subtitle = (TextAtomV2View) findViewById(R$id.subtitle);
        this.button = (ButtonV3View) findViewById(R$id.button);
    }
}
