package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.title;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "bind", "", "data", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsTitleView extends LinearLayout {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsTitleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(g10);
        this.title = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(g11);
        this.subtitle = textAtomV2View2;
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setOrientation(1);
    }

    public final void bind(@NotNull AviaCheckTariffsTitleVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        TextHolderKt.bind$default(this.title, data.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitle, data.getSubtitle(), null, 2, null);
    }
}
