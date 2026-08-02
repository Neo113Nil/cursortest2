package ru.ozon.app.android.videomolecule.presentation.rv.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeTitleViewHolder;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeTitle;", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "text", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "widgetId", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "getText", "()Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "J", "getWidgetId", "()J", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoMoleculeTitle extends VideoMoleculeBottomContentModel {
    private final AtomActionDTO action;

    @NotNull
    private final SocialTextAtomDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final long widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeTitle(@NotNull SocialTextAtomDTO text, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, long j11) {
        super(VideoMoleculeTitleViewHolder.INSTANCE.getViewType(), j11);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.widgetId = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMoleculeTitle)) {
            return false;
        }
        VideoMoleculeTitle videoMoleculeTitle = (VideoMoleculeTitle) other;
        return Intrinsics.d(this.text, videoMoleculeTitle.text) && Intrinsics.d(this.action, videoMoleculeTitle.action) && Intrinsics.d(this.trackingInfo, videoMoleculeTitle.trackingInfo) && this.widgetId == videoMoleculeTitle.widgetId;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final SocialTextAtomDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Long.hashCode(this.widgetId) + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "VideoMoleculeTitle(text=" + this.text + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", widgetId=" + this.widgetId + ")";
    }
}
