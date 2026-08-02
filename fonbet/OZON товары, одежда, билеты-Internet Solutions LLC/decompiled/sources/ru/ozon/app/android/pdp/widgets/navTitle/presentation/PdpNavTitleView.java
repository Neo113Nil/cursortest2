package ru.ozon.app.android.pdp.widgets.navTitle.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navTitle/presentation/PdpNavTitleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/navTitle/presentation/PdpNavTitleVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpNavTitleView extends LinearLayout {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpNavTitleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.navTitleTitle);
        textAtomV2View.setFocusableInTouchMode(false);
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.navTitleSubtitle);
        textAtomV2View2.setFocusableInTouchMode(false);
        this.subtitle = textAtomV2View2;
        setOrientation(1);
        setGravity(16);
        addView(textAtomV2View);
        addView(textAtomV2View2);
    }

    public final void bind(@NotNull PdpNavTitleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.title, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitle, item.getSubtitle(), null, 2, null);
    }
}
