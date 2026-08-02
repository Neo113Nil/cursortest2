package ru.ozon.app.android.pdp.widgets.characteristics.presentation.simpleCharacteristics;

import Im.a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/simpleCharacteristics/CharacteristicsSimpleValueView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "valueTav", "getValueTav", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsSimpleValueView extends LinearLayout {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private final TextAtomV2View valueTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicsSimpleValueView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.titleTav, 0, -2);
        a11.weight = 1.0f;
        textAtomV2View.setLayoutParams(a11);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams a12 = a.a(textAtomV2View2, R$id.valueTav, 0, -2);
        a12.weight = 1.0f;
        textAtomV2View2.setLayoutParams(a12);
        this.valueTav = textAtomV2View2;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        setOrientation(0);
        Dimens dimens = Dimens.INSTANCE;
        setPadding(getPaddingLeft(), dimens.getDP_12(), getPaddingRight(), dimens.getDP_12());
        setLayoutParams(layoutParams);
        addView(textAtomV2View);
        addView(textAtomV2View2);
    }

    @NotNull
    public final TextAtomV2View getTitleTav() {
        return this.titleTav;
    }

    @NotNull
    public final TextAtomV2View getValueTav() {
        return this.valueTav;
    }
}
