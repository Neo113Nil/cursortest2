package ru.ozon.app.android.regulardraw.miniapp;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/fragment/app/m;", "invoke", "()Landroidx/fragment/app/m;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class RegularDrawAppHandler$getMiniAppDestination$1 extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
    final /* synthetic */ String $miniAppName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegularDrawAppHandler$getMiniAppDestination$1(String str) {
        super(0);
        this.$miniAppName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ComponentCallbacksC5392m invoke() {
        return RegularDrawMiniAppFragment.INSTANCE.newInstance(this.$miniAppName);
    }
}
