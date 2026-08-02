package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation;

import Ae.O0;
import Ae.x0;
import Sc.o;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModelImpl;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "items", "", "updateItems", "(Ljava/util/List;)V", "", "position", "updateSelected", "(Ljava/util/List;I)Ljava/util/List;", "", "playbackAvailable", "updatePlaybackAvailability", "(Ljava/util/List;Z)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;", "item", "setupViewModel", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;)V", "setCurrentItemPosition", "(I)V", "pauseVideo", "()V", "resumeVideo", "isVideoStartEventNotProcessed", "(I)Z", "isVideoEndEventNotProcessed", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "atomAction", "processContentViewAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "onCleared", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "isSaveViewActionSent", "Z", "", "processedVideoStartForPosition", "Ljava/util/Set;", "processedVideoEndForPosition", "LAe/x0;", "LAe/x0;", "getItems", "()LAe/x0;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricViewModelImpl extends w0 implements InterfaceC6786a, MediaCentricViewModel {

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private boolean isSaveViewActionSent;

    @NotNull
    private final x0<List<MediaCentricVO.MediaItemVO>> items;

    @NotNull
    private final Set<Integer> processedVideoEndForPosition;

    @NotNull
    private final Set<Integer> processedVideoStartForPosition;

    public MediaCentricViewModelImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.processedVideoStartForPosition = new LinkedHashSet();
        this.processedVideoEndForPosition = new LinkedHashSet();
        this.items = O0.a(K.f71697a);
    }

    private final void updateItems(List<? extends MediaCentricVO.MediaItemVO> items) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new MediaCentricViewModelImpl$updateItems$1(this, items, null), 3);
    }

    private final List<MediaCentricVO.MediaItemVO> updatePlaybackAvailability(List<? extends MediaCentricVO.MediaItemVO> list, boolean z11) {
        List<? extends MediaCentricVO.MediaItemVO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof MediaCentricVO.MediaItemVO.Video) {
                obj = MediaCentricVO.MediaItemVO.Video.copy$default((MediaCentricVO.MediaItemVO.Video) obj, 0, null, null, false, z11, null, null, null, null, null, 1007, null);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private final List<MediaCentricVO.MediaItemVO> updateSelected(List<? extends MediaCentricVO.MediaItemVO> list, int i11) {
        Object copy$default;
        List<? extends MediaCentricVO.MediaItemVO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            MediaCentricVO.MediaItemVO mediaItemVO = (MediaCentricVO.MediaItemVO) obj;
            if (mediaItemVO instanceof MediaCentricVO.MediaItemVO.Image) {
                copy$default = MediaCentricVO.MediaItemVO.Image.copy$default((MediaCentricVO.MediaItemVO.Image) mediaItemVO, 0, null, null, i11 == i12, null, 23, null);
            } else {
                if (!(mediaItemVO instanceof MediaCentricVO.MediaItemVO.Video)) {
                    throw new o();
                }
                copy$default = MediaCentricVO.MediaItemVO.Video.copy$default((MediaCentricVO.MediaItemVO.Video) mediaItemVO, 0, null, null, i11 == i12, false, null, null, null, null, null, 1015, null);
            }
            arrayList.add(copy$default);
            i12 = i13;
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    public boolean isVideoEndEventNotProcessed(int position) {
        return this.processedVideoEndForPosition.add(Integer.valueOf(position));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    public boolean isVideoStartEventNotProcessed(int position) {
        return this.processedVideoStartForPosition.add(Integer.valueOf(position));
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    public void pauseVideo() {
        updateItems(updatePlaybackAvailability(getItems().getValue(), false));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    public void processContentViewAction(@NotNull AtomAction.ComposerAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        if (atomAction == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new MediaCentricViewModelImpl$processContentViewAction$1(this, atomAction, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    public void resumeVideo() {
        updateItems(updatePlaybackAvailability(getItems().getValue(), true));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    public void setCurrentItemPosition(int position) {
        updateItems(updateSelected(getItems().getValue(), position));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    public void setupViewModel(@NotNull MediaCentricVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getItems().setValue(updateSelected(item.getMediaItems(), item.getSelectedPosition()));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModel
    @NotNull
    public x0<List<MediaCentricVO.MediaItemVO>> getItems() {
        return this.items;
    }
}
