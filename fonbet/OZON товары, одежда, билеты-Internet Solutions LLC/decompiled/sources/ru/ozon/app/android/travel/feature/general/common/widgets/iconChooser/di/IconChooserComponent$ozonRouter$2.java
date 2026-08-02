package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.di;

import GZ.g;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LGZ/g;", "invoke", "()LGZ/g;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class IconChooserComponent$ozonRouter$2 extends AbstractC7737t implements Function0<g> {
    final /* synthetic */ IconChooserComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconChooserComponent$ozonRouter$2(IconChooserComponent iconChooserComponent) {
        super(0);
        this.this$0 = iconChooserComponent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final g invoke() {
        C7475g c7475g;
        c7475g = this.this$0.storage;
        return ((NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class)).getOzonRouter();
    }
}
