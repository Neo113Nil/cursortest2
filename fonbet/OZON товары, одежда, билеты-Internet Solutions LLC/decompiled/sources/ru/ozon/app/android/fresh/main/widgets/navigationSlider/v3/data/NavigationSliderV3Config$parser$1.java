package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "params", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavigationSliderV3Config$parser$1 extends AbstractC7737t implements Function2<String, String, List<? extends Object>> {
    final /* synthetic */ NavigationSliderV3Config this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV3Config$parser$1(NavigationSliderV3Config navigationSliderV3Config) {
        super(2);
        this.this$0 = navigationSliderV3Config;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Object> invoke(String str, String str2) {
        NavSliderV3Parser navSliderV3Parser;
        navSliderV3Parser = this.this$0.jsonParser;
        return navSliderV3Parser.invoke(str, str2);
    }
}
