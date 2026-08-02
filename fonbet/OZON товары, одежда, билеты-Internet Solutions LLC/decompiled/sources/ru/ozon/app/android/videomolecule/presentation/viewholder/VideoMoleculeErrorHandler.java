package ru.ozon.app.android.videomolecule.presentation.viewholder;

import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.videomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeErrorHandler;", "", "refs", "Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeUiReferences;", "videoMoleculePlayerDelegate", "Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;", "<init>", "(Lru/ozon/app/android/videomolecule/presentation/viewholder/VideoMoleculeUiReferences;Lru/ozon/app/android/videomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegate;)V", "flashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "showVideoLoadingError", "", "onRemove", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeErrorHandler {
    private Flashbar flashbar;

    @NotNull
    private final VideoMoleculeUiReferences refs;

    @NotNull
    private final VideoMoleculePlayerDelegate videoMoleculePlayerDelegate;

    public VideoMoleculeErrorHandler(@NotNull VideoMoleculeUiReferences refs, @NotNull VideoMoleculePlayerDelegate videoMoleculePlayerDelegate) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(videoMoleculePlayerDelegate, "videoMoleculePlayerDelegate");
        this.refs = refs;
        this.videoMoleculePlayerDelegate = videoMoleculePlayerDelegate;
    }

    public final void onRemove() {
        Flashbar flashbar = this.flashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        this.flashbar = null;
    }

    public final void showVideoLoadingError() {
        ViewGroup rootView = this.refs.getRootView();
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            J viewLifecycleOwner = this.refs.getViewLifecycleOwner();
            int i11 = R$drawable.ic_m_danger;
            String value = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY_NEGATIVE.getValue();
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, rootView, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.error_common_error_technical_error_title)), OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(ru.ozon.uni.R$string.error_flashbar_universal_network_error)), null, null, Integer.valueOf(i11), null, value, null, new Action(StringProvider.getString(R$string.common_action_refresh), true, new VideoMoleculeErrorHandler$showVideoLoadingError$1$1(this)), null, null, null, null, null, null, viewLifecycleOwner, 64856, null);
            this.flashbar = create$default;
            if (create$default != null) {
                create$default.show();
            }
        }
    }
}
