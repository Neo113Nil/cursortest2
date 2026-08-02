package ru.ozon.app.android.cscore.adultimage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeliveryAdultImageView$eyeIconAtom$2 extends AbstractC7737t implements Function0<IconDTO> {
    final /* synthetic */ DeliveryAdultImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryAdultImageView$eyeIconAtom$2(DeliveryAdultImageView deliveryAdultImageView) {
        super(0);
        this.this$0 = deliveryAdultImageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconDTO invoke() {
        IconDTO createEyeIconAtom;
        createEyeIconAtom = this.this$0.createEyeIconAtom();
        return createEyeIconAtom;
    }
}
