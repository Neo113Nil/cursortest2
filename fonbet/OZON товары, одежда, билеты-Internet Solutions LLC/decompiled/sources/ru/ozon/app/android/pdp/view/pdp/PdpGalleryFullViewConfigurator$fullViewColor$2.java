package ru.ozon.app.android.pdp.view.pdp;

import a00.C4911f;
import androidx.core.content.a;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PdpGalleryFullViewConfigurator$fullViewColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ PdpGalleryFullViewConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpGalleryFullViewConfigurator$fullViewColor$2(PdpGalleryFullViewConfigurator pdpGalleryFullViewConfigurator) {
        super(0);
        this.this$0 = pdpGalleryFullViewConfigurator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C4911f ownerContainer;
        r a11;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null) {
            return null;
        }
        return Integer.valueOf(a.getColor(a11, R$color.bg_dark_key));
    }
}
