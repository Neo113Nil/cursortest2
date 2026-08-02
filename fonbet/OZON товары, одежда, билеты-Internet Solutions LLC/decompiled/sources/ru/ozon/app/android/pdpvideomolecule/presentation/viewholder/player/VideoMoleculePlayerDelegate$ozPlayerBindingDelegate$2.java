package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegate;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate.OzPlayerBindingDelegateFactory;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class VideoMoleculePlayerDelegate$ozPlayerBindingDelegate$2 extends AbstractC7737t implements Function0<OzPlayerBindingDelegate> {
    final /* synthetic */ VideoMoleculePlayerDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculePlayerDelegate$ozPlayerBindingDelegate$2(VideoMoleculePlayerDelegate videoMoleculePlayerDelegate) {
        super(0);
        this.this$0 = videoMoleculePlayerDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OzPlayerBindingDelegate invoke() {
        boolean z11;
        OzPlayerBindingDelegateFactory ozPlayerBindingDelegateFactory = OzPlayerBindingDelegateFactory.INSTANCE;
        z11 = this.this$0.usePlayerFromPool;
        return ozPlayerBindingDelegateFactory.create$pdpvideomolecule_prodGoogleAllVendorsRelease(z11);
    }
}
