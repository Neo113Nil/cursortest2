package ru.ozon.uni.android.atom.notification.view;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationBarView$iconButtonView$2 extends AbstractC7737t implements Function0<IconButtonV3View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NotificationBarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationBarView$iconButtonView$2(Context context, NotificationBarView notificationBarView) {
        super(0);
        this.$context = context;
        this.this$0 = notificationBarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconButtonV3View invoke() {
        Map map;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(this.$context, null, 0, 0, 14, null);
        NotificationBarView notificationBarView = this.this$0;
        iconButtonV3View.setId(R$id.iconButtonView);
        map = notificationBarView.locatorInitializers;
        Function1 function1 = (Function1) map.get(Integer.valueOf(iconButtonV3View.getId()));
        if (function1 != null) {
            function1.invoke(iconButtonV3View);
        }
        return iconButtonV3View;
    }
}
