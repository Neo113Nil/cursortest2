package ru.ozon.uni.android.cell.dataAddon;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.cell.dataAddon.data.DataPreset;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.main.BackgroundWrapper;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"ru/ozon/uni/android/cell/dataAddon/DataTitleSubtitleCellView$addonView$1", "Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;", "Lru/ozon/uni/android/cell/dataAddon/DataViewApi;", "", "text", "", "setText", "(Ljava/lang/String;)V", "", "dataTextColor", "", "alpha", "setTextColor", "(IF)V", "Lru/ozon/uni/android/cell/dataAddon/data/DataPreset;", "addonPreset", "withPreset", "(Lru/ozon/uni/android/cell/dataAddon/data/DataPreset;)V", "Landroid/widget/TextView;", "mainView", "Landroid/widget/TextView;", "getMainView", "()Landroid/widget/TextView;", "setMainView", "(Landroid/widget/TextView;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataTitleSubtitleCellView$addonView$1 extends BackgroundWrapper implements DataViewApi {
    private TextView mainView;

    DataTitleSubtitleCellView$addonView$1(Context context, DataTitleSubtitleCellView dataTitleSubtitleCellView, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TextView withSmartLabelPreset;
        Function1 function1;
        withSmartLabelPreset = DataTitleSubtitleCellViewKt.withSmartLabelPreset(new TextView(context), dataTitleSubtitleCellView.getPreset().getDataAddonWrapperPreset().getAddonPreset().getSmartLabelPreset());
        this.mainView = withSmartLabelPreset;
        setSettings(dataTitleSubtitleCellView.getPreset().getDataAddonWrapperPreset().getAddonPreset().getBackgroundWrapperPreset());
        setMinimumHeight(UiExtKt.toPx(dataTitleSubtitleCellView.getPreset().getDataAddonWrapperPreset().getAddonPreset().getMinHeight()));
        function1 = dataTitleSubtitleCellView.locatorInitializer;
        function1.invoke(this);
        addView(this.mainView);
    }

    @Override // ru.ozon.uni.android.cell.dataAddon.DataViewApi
    public void setText(String text) {
        this.mainView.setText(text);
    }

    @Override // ru.ozon.uni.android.cell.dataAddon.DataViewApi
    public void setTextColor(int dataTextColor, float alpha) {
        this.mainView.setTextColor(dataTextColor);
        this.mainView.setAlpha(alpha);
    }

    @Override // ru.ozon.uni.android.cell.dataAddon.DataViewApi
    public void withPreset(DataPreset addonPreset) {
        Intrinsics.checkNotNullParameter(addonPreset, "addonPreset");
        setSettings(addonPreset.getBackgroundWrapperPreset());
        setMinimumHeight(UiExtKt.toPx(addonPreset.getMinHeight()));
        DataTitleSubtitleCellViewKt.withSmartLabelPreset(this.mainView, addonPreset.getSmartLabelPreset());
    }
}
