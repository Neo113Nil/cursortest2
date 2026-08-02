package ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegateListener;", "", "showWithAnimation", "", "hideWithAnimation", "show", "isForce", "", "hide", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface VideoMoleculeVisibilityDelegateListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void hideWithAnimation(@NotNull VideoMoleculeVisibilityDelegateListener videoMoleculeVisibilityDelegateListener) {
        }

        public static void showWithAnimation(@NotNull VideoMoleculeVisibilityDelegateListener videoMoleculeVisibilityDelegateListener) {
        }
    }

    void hide(boolean isForce);

    void hideWithAnimation();

    void show(boolean isForce);

    void showWithAnimation();
}
