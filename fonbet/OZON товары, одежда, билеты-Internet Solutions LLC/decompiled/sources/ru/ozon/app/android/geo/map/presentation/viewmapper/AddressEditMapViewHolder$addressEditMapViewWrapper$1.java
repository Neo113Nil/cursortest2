package ru.ozon.app.android.geo.map.presentation.viewmapper;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "invoke", "()Lru/ozon/composer/ui/widget/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AddressEditMapViewHolder$addressEditMapViewWrapper$1 extends AbstractC7737t implements Function0<l> {
    final /* synthetic */ AddressEditMapViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewHolder$addressEditMapViewWrapper$1(AddressEditMapViewHolder addressEditMapViewHolder) {
        super(0);
        this.this$0 = addressEditMapViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final l invoke() {
        i iVar;
        iVar = this.this$0.container;
        ArrayList a11 = iVar.J().q().a(AddressEditMapVO.class);
        if (a11 != null) {
            return (l) C7714v.M(a11);
        }
        return null;
    }
}
