package ru.ozon.app.android.common.buttonwidget.di;

import GZ.g;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LGZ/g;", "invoke", "()LGZ/g;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ButtonWidgetComponent$Companion$create$1$1$ozonRouter$2 extends AbstractC7737t implements Function0<g> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonWidgetComponent$Companion$create$1$1$ozonRouter$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final g invoke() {
        return ((NavigationComponentApi) this.$storage.getComponent(NavigationComponentApi.class)).getOzonRouter();
    }
}
