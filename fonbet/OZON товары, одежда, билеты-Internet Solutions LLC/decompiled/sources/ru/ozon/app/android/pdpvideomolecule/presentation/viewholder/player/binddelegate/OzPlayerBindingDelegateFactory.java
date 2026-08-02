package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.binddelegate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegateFactory;", "", "<init>", "()V", "create", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/binddelegate/OzPlayerBindingDelegate;", "usePlayerFromPool", "", "create$pdpvideomolecule_prodGoogleAllVendorsRelease", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OzPlayerBindingDelegateFactory {

    @NotNull
    public static final OzPlayerBindingDelegateFactory INSTANCE = new OzPlayerBindingDelegateFactory();

    private OzPlayerBindingDelegateFactory() {
    }

    @NotNull
    public final OzPlayerBindingDelegate create$pdpvideomolecule_prodGoogleAllVendorsRelease(boolean usePlayerFromPool) {
        return usePlayerFromPool ? new OzPlayerBindingDelegateDefaultPlayerV2() : new OzPlayerBindingDelegateDefault();
    }
}
