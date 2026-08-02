package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeFrameLayoutDelegate;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UwObjectGridOneView$badgeDelegate$2 extends AbstractC7737t implements Function0<AdvBadgeFrameLayoutDelegate> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UwObjectGridOneView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UwObjectGridOneView$badgeDelegate$2(UwObjectGridOneView uwObjectGridOneView, Context context) {
        super(0);
        this.this$0 = uwObjectGridOneView;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdvBadgeFrameLayoutDelegate invoke() {
        return new AdvBadgeFrameLayoutDelegate(this.this$0, AppTypeResolver.INSTANCE.isSelect(this.$context) ? ResourceExtKt.toPx(12) : ResourceExtKt.toPx(8) + this.this$0.getMargin16(), null, 4, null);
    }
}
