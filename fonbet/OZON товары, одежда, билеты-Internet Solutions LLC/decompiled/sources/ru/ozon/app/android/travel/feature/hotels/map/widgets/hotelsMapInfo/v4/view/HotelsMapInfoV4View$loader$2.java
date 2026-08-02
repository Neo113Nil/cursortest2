package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ProgressBar;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4View$loader$2 extends AbstractC7737t implements Function0<ProgressBar> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HotelsMapInfoV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4View$loader$2(Context context, HotelsMapInfoV4View hotelsMapInfoV4View) {
        super(0);
        this.$context = context;
        this.this$0 = hotelsMapInfoV4View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ProgressBar invoke() {
        int i11;
        int i12;
        int i13;
        int i14;
        ProgressBar progressBar = new ProgressBar(this.$context, null, R.attr.progressBarStyleLarge);
        HotelsMapInfoV4View hotelsMapInfoV4View = this.this$0;
        Context context = this.$context;
        i11 = hotelsMapInfoV4View.dp40;
        i12 = hotelsMapInfoV4View.dp40;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.gravity = 1;
        i13 = hotelsMapInfoV4View.loaderTopOffset;
        layoutParams.topMargin = i13;
        progressBar.setLayoutParams(layoutParams);
        i14 = hotelsMapInfoV4View.dp4;
        progressBar.setPadding(i14, i14, i14, i14);
        progressBar.setVisibility(8);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicActionPrimary)));
        progressBar.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), ResourceExtKt.toPxF(20, context)));
        this.this$0.addView(progressBar);
        return progressBar;
    }
}
