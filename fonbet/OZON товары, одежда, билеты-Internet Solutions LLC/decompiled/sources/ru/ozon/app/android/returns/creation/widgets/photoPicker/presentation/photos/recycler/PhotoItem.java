package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler;

import GR.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "", "", "id", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "link", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteButton", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "state", "<init>", "(JLru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "getLink", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "deleteButton$1", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "getState", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhotoItem {

    @NotNull
    private static final IconButtonV3DTO deleteButton;

    @NotNull
    private static final IconButtonV3DTO reloadButton;

    @NotNull
    private static final IconButtonV3DTO stopButton;

    /* renamed from: deleteButton$1, reason: from kotlin metadata */
    @NotNull
    private final IconButtonV3DTO deleteButton;
    private final long id;

    @NotNull
    private final SignedLink link;

    @NotNull
    private final PhotoItemViewState state;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = IconButtonV3DTO.$stable;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem$Companion;", "", "<init>", "()V", "reloadButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getReloadButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "stopButton", "getStopButton", "deleteButton", "getDeleteButton", "createDeleteIconButton", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IconButtonV3DTO createDeleteIconButton() {
            return new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_300, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled_compact", null, UniColors.GRAPHIC_TERTIARY.getToken(), UniColors.BG_PRIMARY.getToken(), null, null, null, null, null, null, null, 16272, null);
        }

        @NotNull
        public final IconButtonV3DTO getDeleteButton() {
            return PhotoItem.deleteButton;
        }

        @NotNull
        public final IconButtonV3DTO getReloadButton() {
            return PhotoItem.reloadButton;
        }

        @NotNull
        public final IconButtonV3DTO getStopButton() {
            return PhotoItem.stopButton;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_400;
        ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.CUSTOM;
        UniTheme uniTheme = UniTheme.INSTANCE;
        String id2 = uniTheme.getIconTokens().getIc_s_reload_filled().getId();
        String id3 = uniTheme.getColorTokens().getGraphicSecondaryOnLight().getId();
        String id4 = uniTheme.getColorTokens().getGraphicPrimaryOnDark().getId();
        IconButtonV3DTO.IconButtonShape iconButtonShape = IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE;
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.DISMISS;
        Boolean bool = null;
        String str = null;
        reloadButton = new IconButtonV3DTO(sizes, styleTypes, iconButtonShape, id2, bool, id4, id3, new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, str, 16144, null);
        stopButton = new IconButtonV3DTO(sizes, styleTypes, iconButtonShape, uniTheme.getIconTokens().getIc_s_cross_filled().getId(), bool, uniTheme.getColorTokens().getGraphicPrimaryOnDark().getId(), uniTheme.getColorTokens().getGraphicSecondaryOnLight().getId(), new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), null, null, null, null, 0 == true ? 1 : 0, str, 16144, 0 == true ? 1 : 0);
        IconButtonV3DTO.Sizes sizes2 = IconButtonV3DTO.Sizes.SIZE_300;
        String id5 = uniTheme.getIconTokens().getIc_s_cross_filled().getId();
        String id6 = uniTheme.getColorTokens().getGraphicSolidNeutral().getId();
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        deleteButton = new IconButtonV3DTO(sizes2, styleTypes, iconButtonShape, id5, null, uniTheme.getColorTokens().getGraphicPrimaryOnDark().getId(), id6, new CommonControlSettings(new AtomActionDTO(behavior, null, null, null, 14, null), null, null, 6, null), null, 0 == true ? 1 : 0, objArr, null, null, objArr2, 16144, null);
    }

    public PhotoItem(long j11, @NotNull SignedLink link, @NotNull IconButtonV3DTO deleteButton2, @NotNull PhotoItemViewState state) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(deleteButton2, "deleteButton");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.link = link;
        this.deleteButton = deleteButton2;
        this.state = state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoItem)) {
            return false;
        }
        PhotoItem photoItem = (PhotoItem) other;
        return this.id == photoItem.id && Intrinsics.d(this.link, photoItem.link) && Intrinsics.d(this.deleteButton, photoItem.deleteButton) && Intrinsics.d(this.state, photoItem.state);
    }

    @NotNull
    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final SignedLink getLink() {
        return this.link;
    }

    @NotNull
    public final PhotoItemViewState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode() + b.c(this.deleteButton, (this.link.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "PhotoItem(id=" + this.id + ", link=" + this.link + ", deleteButton=" + this.deleteButton + ", state=" + this.state + ")";
    }
}
