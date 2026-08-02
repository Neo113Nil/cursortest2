package ru.ozon.app.android.storefront.core.socialAtoms.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SocialTextAtomHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<SocialTextAtomHolder> {
    final /* synthetic */ SocialTextAtomView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SocialTextAtomHolderKt$bind$provider$1(SocialTextAtomView socialTextAtomView) {
        super(0);
        this.$this_bind = socialTextAtomView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SocialTextAtomHolder invoke() {
        return new SocialTextAtomHolder(this.$this_bind, (String) null);
    }
}
