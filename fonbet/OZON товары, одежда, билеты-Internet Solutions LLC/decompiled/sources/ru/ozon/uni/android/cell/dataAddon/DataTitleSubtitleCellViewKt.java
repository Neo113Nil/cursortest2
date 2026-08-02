package ru.ozon.uni.android.cell.dataAddon;

import android.content.Context;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.cell.label.data.SmartLabelPreset;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"withSmartLabelPreset", "Landroid/widget/TextView;", "preset", "Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataTitleSubtitleCellViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView withSmartLabelPreset(TextView textView, SmartLabelPreset smartLabelPreset) {
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(textView, context, smartLabelPreset.getTextAppearanceResId());
        textView.setGravity(smartLabelPreset.getTextAlignment());
        textView.setCompoundDrawablePadding(UiExtKt.toPx(smartLabelPreset.getGap()));
        return textView;
    }
}
