package ru.ozon.app.android.uikit.view.input;

import android.content.Context;
import android.content.res.ColorStateList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MobilizationTextInputLayout$textColor$2 extends AbstractC7737t implements Function0<ColorStateList> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MobilizationTextInputLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobilizationTextInputLayout$textColor$2(Context context, MobilizationTextInputLayout mobilizationTextInputLayout) {
        super(0);
        this.$context = context;
        this.this$0 = mobilizationTextInputLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ColorStateList invoke() {
        int changeAlpha;
        int[][] iArr = {new int[]{-16842910}, new int[0]};
        int parseColor = StyleParser.INSTANCE.parseColor(this.$context, UniColors.TEXT_PRIMARY.getToken(), R$color.text_primary);
        changeAlpha = this.this$0.changeAlpha(parseColor, 0.4f);
        return new ColorStateList(iArr, new int[]{changeAlpha, parseColor});
    }
}
