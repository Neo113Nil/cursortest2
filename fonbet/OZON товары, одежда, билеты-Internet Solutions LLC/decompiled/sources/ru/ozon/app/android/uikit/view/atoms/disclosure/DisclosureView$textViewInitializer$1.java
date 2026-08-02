package ru.ozon.app.android.uikit.view.atoms.disclosure;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/appcompat/widget/AppCompatTextView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DisclosureView$textViewInitializer$1 extends AbstractC7737t implements Function0<AppCompatTextView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DisclosureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisclosureView$textViewInitializer$1(Context context, DisclosureView disclosureView) {
        super(0);
        this.$context = context;
        this.this$0 = disclosureView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppCompatTextView invoke() {
        int i11;
        int i12;
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.$context);
        DisclosureView disclosureView = this.this$0;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        i11 = disclosureView.dp4;
        layoutParams.setMargins(i11, 0, 0, 0);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption_Bold);
        i12 = disclosureView.defaultTintColor;
        appCompatTextView.setTextColor(i12);
        return appCompatTextView;
    }
}
