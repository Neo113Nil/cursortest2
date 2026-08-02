package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import B0.C2454a;
import C.o0;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b/\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007PQRSTUVB\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J¶\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001cHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b8\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010'R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bG\u0010FR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010N\u001a\u0004\b\u001d\u0010OR\u0017\u0010\u001e\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\b\u001e\u0010O¨\u0006W"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "items", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "pickerItem", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "removeIcon", "playIcon", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$EmptyVO;", "emptyItem", "", "maxItemsCount", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "photoConfig", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "videoConfig", "LWZ/t;", "uploadEvent", "uploadErrorEvent", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;", "hidePickerBadgeCondition", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;", "onBoardingConfigVO", "", "isExpanded", "isModal", "<init>", "(JLjava/util/List;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$EmptyVO;ILru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;LWZ/t;LWZ/t;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;ZZ)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$EmptyVO;ILru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;LWZ/t;LWZ/t;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;ZZ)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "getPickerItem", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlayIcon", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$EmptyVO;", "getEmptyItem", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$EmptyVO;", "I", "getMaxItemsCount", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "getPhotoConfig", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "getVideoConfig", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "LWZ/t;", "getUploadEvent", "()LWZ/t;", "getUploadErrorEvent", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;", "getHidePickerBadgeCondition", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;", "getOnBoardingConfigVO", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;", "Z", "()Z", "PickerItemVO", "MediaVO", "PhotoVO", "VideoVO", "PickerVO", "EmptyVO", "OnBoardingConfigVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MediaPickerVO implements c {

    @NotNull
    private final EmptyVO emptyItem;
    private final MediaPickerDTO.PickerItemBadgeDTO.HideCondition hidePickerBadgeCondition;
    private final long id;
    private final boolean isExpanded;
    private final boolean isModal;

    @NotNull
    private final List<MediaVO> items;
    private final int maxItemsCount;
    private final OnBoardingConfigVO onBoardingConfigVO;

    @NotNull
    private final MediaPickerDTO.PhotoConfig photoConfig;

    @NotNull
    private final PickerVO pickerItem;

    @NotNull
    private final IconDTO playIcon;

    @NotNull
    private final IconDTO removeIcon;
    private final t uploadErrorEvent;
    private final t uploadEvent;
    private final MediaPickerDTO.VideoConfig videoConfig;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$EmptyVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "centerIcon", "removeIcon", "", "borderColor", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCenterIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRemoveIcon", "Ljava/lang/String;", "getBorderColor", "id", "getId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyVO implements PickerItemVO {
        private final String borderColor;

        @NotNull
        private final IconDTO centerIcon;

        @NotNull
        private final String id;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final IconDTO removeIcon;
        private final t tokenizedEvent;

        public EmptyVO(@NotNull ImageDTO image, t tVar, @NotNull IconDTO centerIcon, @NotNull IconDTO removeIcon, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(centerIcon, "centerIcon");
            Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
            this.image = image;
            this.tokenizedEvent = tVar;
            this.centerIcon = centerIcon;
            this.removeIcon = removeIcon;
            this.borderColor = str;
            this.id = "empty";
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyVO)) {
                return false;
            }
            EmptyVO emptyVO = (EmptyVO) other;
            return Intrinsics.d(this.image, emptyVO.image) && Intrinsics.d(this.tokenizedEvent, emptyVO.tokenizedEvent) && Intrinsics.d(this.centerIcon, emptyVO.centerIcon) && Intrinsics.d(this.removeIcon, emptyVO.removeIcon) && Intrinsics.d(this.borderColor, emptyVO.borderColor);
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public IconDTO getCenterIcon() {
            return this.centerIcon;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final IconDTO getRemoveIcon() {
            return this.removeIcon;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            int a11 = C2971a.a(this.removeIcon, C2971a.a(this.centerIcon, (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31), 31);
            String str = this.borderColor;
            return a11 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            t tVar = this.tokenizedEvent;
            IconDTO iconDTO = this.centerIcon;
            IconDTO iconDTO2 = this.removeIcon;
            String str = this.borderColor;
            StringBuilder sb2 = new StringBuilder("EmptyVO(image=");
            sb2.append(imageDTO);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", centerIcon=");
            sb2.append(iconDTO);
            sb2.append(", removeIcon=");
            sb2.append(iconDTO2);
            sb2.append(", borderColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "attachment", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "getAttachment", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "removeIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PhotoVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$VideoVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MediaVO extends PickerItemVO {
        @NotNull
        AttachmentVO getAttachment();

        @NotNull
        IconDTO getRemoveIcon();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$OnBoardingConfigVO;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "onBoardingKey", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getOnBoardingKey", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoardingConfigVO {

        @NotNull
        private final AtomAction action;
        private final String onBoardingKey;
        private final t tokenizedEvent;

        public OnBoardingConfigVO(@NotNull AtomAction action, t tVar, String str) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.tokenizedEvent = tVar;
            this.onBoardingKey = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBoardingConfigVO)) {
                return false;
            }
            OnBoardingConfigVO onBoardingConfigVO = (OnBoardingConfigVO) other;
            return Intrinsics.d(this.action, onBoardingConfigVO.action) && Intrinsics.d(this.tokenizedEvent, onBoardingConfigVO.tokenizedEvent) && Intrinsics.d(this.onBoardingKey, onBoardingConfigVO.onBoardingKey);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final String getOnBoardingKey() {
            return this.onBoardingKey;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
            String str = this.onBoardingKey;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            String str = this.onBoardingKey;
            StringBuilder sb2 = new StringBuilder("OnBoardingConfigVO(action=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", onBoardingKey=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010'\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PhotoVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "removeIcon", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attachment", "centerIcon", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PhotoVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "getAttachment", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "getCenterIcon", "id", "Ljava/lang/String;", "getId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoVO implements MediaVO {

        @NotNull
        private final AttachmentVO.AttachedImageVO attachment;
        private final IconDTO centerIcon;

        @NotNull
        private final String id;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final IconDTO removeIcon;
        private final t tokenizedEvent;

        public PhotoVO(@NotNull ImageDTO image, t tVar, @NotNull IconDTO removeIcon, @NotNull AttachmentVO.AttachedImageVO attachment, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
            Intrinsics.checkNotNullParameter(attachment, "attachment");
            this.image = image;
            this.tokenizedEvent = tVar;
            this.removeIcon = removeIcon;
            this.attachment = attachment;
            this.centerIcon = iconDTO;
            String image2 = getImage().getImage();
            this.id = image2 == null ? "photo" : image2;
        }

        public static /* synthetic */ PhotoVO copy$default(PhotoVO photoVO, ImageDTO imageDTO, t tVar, IconDTO iconDTO, AttachmentVO.AttachedImageVO attachedImageVO, IconDTO iconDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = photoVO.image;
            }
            if ((i11 & 2) != 0) {
                tVar = photoVO.tokenizedEvent;
            }
            if ((i11 & 4) != 0) {
                iconDTO = photoVO.removeIcon;
            }
            if ((i11 & 8) != 0) {
                attachedImageVO = photoVO.attachment;
            }
            if ((i11 & 16) != 0) {
                iconDTO2 = photoVO.centerIcon;
            }
            IconDTO iconDTO3 = iconDTO2;
            IconDTO iconDTO4 = iconDTO;
            return photoVO.copy(imageDTO, tVar, iconDTO4, attachedImageVO, iconDTO3);
        }

        @NotNull
        public final PhotoVO copy(@NotNull ImageDTO image, t tokenizedEvent, @NotNull IconDTO removeIcon, @NotNull AttachmentVO.AttachedImageVO attachment, IconDTO centerIcon) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
            Intrinsics.checkNotNullParameter(attachment, "attachment");
            return new PhotoVO(image, tokenizedEvent, removeIcon, attachment, centerIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoVO)) {
                return false;
            }
            PhotoVO photoVO = (PhotoVO) other;
            return Intrinsics.d(this.image, photoVO.image) && Intrinsics.d(this.tokenizedEvent, photoVO.tokenizedEvent) && Intrinsics.d(this.removeIcon, photoVO.removeIcon) && Intrinsics.d(this.attachment, photoVO.attachment) && Intrinsics.d(this.centerIcon, photoVO.centerIcon);
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        public IconDTO getCenterIcon() {
            return this.centerIcon;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public ImageDTO getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.MediaVO
        @NotNull
        public IconDTO getRemoveIcon() {
            return this.removeIcon;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            int hashCode2 = (this.attachment.hashCode() + C2971a.a(this.removeIcon, (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31)) * 31;
            IconDTO iconDTO = this.centerIcon;
            return hashCode2 + (iconDTO != null ? iconDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PhotoVO(image=" + this.image + ", tokenizedEvent=" + this.tokenizedEvent + ", removeIcon=" + this.removeIcon + ", attachment=" + this.attachment + ", centerIcon=" + this.centerIcon + ")";
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.MediaVO
        @NotNull
        public AttachmentVO.AttachedImageVO getAttachment() {
            return this.attachment;
        }

        public /* synthetic */ PhotoVO(ImageDTO imageDTO, t tVar, IconDTO iconDTO, AttachmentVO.AttachedImageVO attachedImageVO, IconDTO iconDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, tVar, iconDTO, attachedImageVO, (i11 & 16) != 0 ? null : iconDTO2);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "", "", "getId", "()Ljava/lang/String;", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCenterIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "centerIcon", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$EmptyVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PickerItemVO {
        IconDTO getCenterIcon();

        @NotNull
        String getId();

        @NotNull
        ImageDTO getImage();

        t getTokenizedEvent();
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerItemVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "centerIcon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCenterIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "id", "Ljava/lang/String;", "getId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickerVO implements PickerItemVO {
        private final BadgeDTO badge;
        private final IconDTO centerIcon;

        @NotNull
        private final String id;

        @NotNull
        private final ImageDTO image;
        private final t tokenizedEvent;

        public PickerVO(@NotNull ImageDTO image, t tVar, IconDTO iconDTO, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.tokenizedEvent = tVar;
            this.centerIcon = iconDTO;
            this.badge = badgeDTO;
            this.id = FormPageDTO.Field.FIELD_TYPE_PICKER;
        }

        public static /* synthetic */ PickerVO copy$default(PickerVO pickerVO, ImageDTO imageDTO, t tVar, IconDTO iconDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = pickerVO.image;
            }
            if ((i11 & 2) != 0) {
                tVar = pickerVO.tokenizedEvent;
            }
            if ((i11 & 4) != 0) {
                iconDTO = pickerVO.centerIcon;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = pickerVO.badge;
            }
            return pickerVO.copy(imageDTO, tVar, iconDTO, badgeDTO);
        }

        @NotNull
        public final PickerVO copy(@NotNull ImageDTO image, t tokenizedEvent, IconDTO centerIcon, BadgeDTO badge) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new PickerVO(image, tokenizedEvent, centerIcon, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickerVO)) {
                return false;
            }
            PickerVO pickerVO = (PickerVO) other;
            return Intrinsics.d(this.image, pickerVO.image) && Intrinsics.d(this.tokenizedEvent, pickerVO.tokenizedEvent) && Intrinsics.d(this.centerIcon, pickerVO.centerIcon) && Intrinsics.d(this.badge, pickerVO.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        public IconDTO getCenterIcon() {
            return this.centerIcon;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public ImageDTO getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
            IconDTO iconDTO = this.centerIcon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PickerVO(image=" + this.image + ", tokenizedEvent=" + this.tokenizedEvent + ", centerIcon=" + this.centerIcon + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010'\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$VideoVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "removeIcon", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "attachment", "centerIcon", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$VideoVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "getAttachment", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "getCenterIcon", "id", "Ljava/lang/String;", "getId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoVO implements MediaVO {

        @NotNull
        private final AttachmentVO.AttachedVideoVO attachment;

        @NotNull
        private final IconDTO centerIcon;

        @NotNull
        private final String id;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final IconDTO removeIcon;
        private final t tokenizedEvent;

        public VideoVO(@NotNull ImageDTO image, t tVar, @NotNull IconDTO removeIcon, @NotNull AttachmentVO.AttachedVideoVO attachment, @NotNull IconDTO centerIcon) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
            Intrinsics.checkNotNullParameter(attachment, "attachment");
            Intrinsics.checkNotNullParameter(centerIcon, "centerIcon");
            this.image = image;
            this.tokenizedEvent = tVar;
            this.removeIcon = removeIcon;
            this.attachment = attachment;
            this.centerIcon = centerIcon;
            String image2 = getImage().getImage();
            this.id = image2 == null ? "video" : image2;
        }

        public static /* synthetic */ VideoVO copy$default(VideoVO videoVO, ImageDTO imageDTO, t tVar, IconDTO iconDTO, AttachmentVO.AttachedVideoVO attachedVideoVO, IconDTO iconDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = videoVO.image;
            }
            if ((i11 & 2) != 0) {
                tVar = videoVO.tokenizedEvent;
            }
            if ((i11 & 4) != 0) {
                iconDTO = videoVO.removeIcon;
            }
            if ((i11 & 8) != 0) {
                attachedVideoVO = videoVO.attachment;
            }
            if ((i11 & 16) != 0) {
                iconDTO2 = videoVO.centerIcon;
            }
            IconDTO iconDTO3 = iconDTO2;
            IconDTO iconDTO4 = iconDTO;
            return videoVO.copy(imageDTO, tVar, iconDTO4, attachedVideoVO, iconDTO3);
        }

        @NotNull
        public final VideoVO copy(@NotNull ImageDTO image, t tokenizedEvent, @NotNull IconDTO removeIcon, @NotNull AttachmentVO.AttachedVideoVO attachment, @NotNull IconDTO centerIcon) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
            Intrinsics.checkNotNullParameter(attachment, "attachment");
            Intrinsics.checkNotNullParameter(centerIcon, "centerIcon");
            return new VideoVO(image, tokenizedEvent, removeIcon, attachment, centerIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoVO)) {
                return false;
            }
            VideoVO videoVO = (VideoVO) other;
            return Intrinsics.d(this.image, videoVO.image) && Intrinsics.d(this.tokenizedEvent, videoVO.tokenizedEvent) && Intrinsics.d(this.removeIcon, videoVO.removeIcon) && Intrinsics.d(this.attachment, videoVO.attachment) && Intrinsics.d(this.centerIcon, videoVO.centerIcon);
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public IconDTO getCenterIcon() {
            return this.centerIcon;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public String getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        @NotNull
        public ImageDTO getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.MediaVO
        @NotNull
        public IconDTO getRemoveIcon() {
            return this.removeIcon;
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.PickerItemVO
        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return this.centerIcon.hashCode() + ((this.attachment.hashCode() + C2971a.a(this.removeIcon, (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "VideoVO(image=" + this.image + ", tokenizedEvent=" + this.tokenizedEvent + ", removeIcon=" + this.removeIcon + ", attachment=" + this.attachment + ", centerIcon=" + this.centerIcon + ")";
        }

        @Override // ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO.MediaVO
        @NotNull
        public AttachmentVO.AttachedVideoVO getAttachment() {
            return this.attachment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaPickerVO(long j11, @NotNull List<? extends MediaVO> items, @NotNull PickerVO pickerItem, @NotNull IconDTO removeIcon, @NotNull IconDTO playIcon, @NotNull EmptyVO emptyItem, int i11, @NotNull MediaPickerDTO.PhotoConfig photoConfig, MediaPickerDTO.VideoConfig videoConfig, t tVar, t tVar2, MediaPickerDTO.PickerItemBadgeDTO.HideCondition hideCondition, OnBoardingConfigVO onBoardingConfigVO, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pickerItem, "pickerItem");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(playIcon, "playIcon");
        Intrinsics.checkNotNullParameter(emptyItem, "emptyItem");
        Intrinsics.checkNotNullParameter(photoConfig, "photoConfig");
        this.id = j11;
        this.items = items;
        this.pickerItem = pickerItem;
        this.removeIcon = removeIcon;
        this.playIcon = playIcon;
        this.emptyItem = emptyItem;
        this.maxItemsCount = i11;
        this.photoConfig = photoConfig;
        this.videoConfig = videoConfig;
        this.uploadEvent = tVar;
        this.uploadErrorEvent = tVar2;
        this.hidePickerBadgeCondition = hideCondition;
        this.onBoardingConfigVO = onBoardingConfigVO;
        this.isExpanded = z11;
        this.isModal = z12;
    }

    @NotNull
    public final MediaPickerVO copy(long id2, @NotNull List<? extends MediaVO> items, @NotNull PickerVO pickerItem, @NotNull IconDTO removeIcon, @NotNull IconDTO playIcon, @NotNull EmptyVO emptyItem, int maxItemsCount, @NotNull MediaPickerDTO.PhotoConfig photoConfig, MediaPickerDTO.VideoConfig videoConfig, t uploadEvent, t uploadErrorEvent, MediaPickerDTO.PickerItemBadgeDTO.HideCondition hidePickerBadgeCondition, OnBoardingConfigVO onBoardingConfigVO, boolean isExpanded, boolean isModal) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pickerItem, "pickerItem");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(playIcon, "playIcon");
        Intrinsics.checkNotNullParameter(emptyItem, "emptyItem");
        Intrinsics.checkNotNullParameter(photoConfig, "photoConfig");
        return new MediaPickerVO(id2, items, pickerItem, removeIcon, playIcon, emptyItem, maxItemsCount, photoConfig, videoConfig, uploadEvent, uploadErrorEvent, hidePickerBadgeCondition, onBoardingConfigVO, isExpanded, isModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPickerVO)) {
            return false;
        }
        MediaPickerVO mediaPickerVO = (MediaPickerVO) other;
        return this.id == mediaPickerVO.id && Intrinsics.d(this.items, mediaPickerVO.items) && Intrinsics.d(this.pickerItem, mediaPickerVO.pickerItem) && Intrinsics.d(this.removeIcon, mediaPickerVO.removeIcon) && Intrinsics.d(this.playIcon, mediaPickerVO.playIcon) && Intrinsics.d(this.emptyItem, mediaPickerVO.emptyItem) && this.maxItemsCount == mediaPickerVO.maxItemsCount && Intrinsics.d(this.photoConfig, mediaPickerVO.photoConfig) && Intrinsics.d(this.videoConfig, mediaPickerVO.videoConfig) && Intrinsics.d(this.uploadEvent, mediaPickerVO.uploadEvent) && Intrinsics.d(this.uploadErrorEvent, mediaPickerVO.uploadErrorEvent) && this.hidePickerBadgeCondition == mediaPickerVO.hidePickerBadgeCondition && Intrinsics.d(this.onBoardingConfigVO, mediaPickerVO.onBoardingConfigVO) && this.isExpanded == mediaPickerVO.isExpanded && this.isModal == mediaPickerVO.isModal;
    }

    @NotNull
    public final EmptyVO getEmptyItem() {
        return this.emptyItem;
    }

    public final MediaPickerDTO.PickerItemBadgeDTO.HideCondition getHidePickerBadgeCondition() {
        return this.hidePickerBadgeCondition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<MediaVO> getItems() {
        return this.items;
    }

    public final int getMaxItemsCount() {
        return this.maxItemsCount;
    }

    public final OnBoardingConfigVO getOnBoardingConfigVO() {
        return this.onBoardingConfigVO;
    }

    @NotNull
    public final MediaPickerDTO.PhotoConfig getPhotoConfig() {
        return this.photoConfig;
    }

    @NotNull
    public final PickerVO getPickerItem() {
        return this.pickerItem;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getUploadErrorEvent() {
        return this.uploadErrorEvent;
    }

    public final t getUploadEvent() {
        return this.uploadEvent;
    }

    public final MediaPickerDTO.VideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.photoConfig.hashCode() + C2454a.a(this.maxItemsCount, (this.emptyItem.hashCode() + C2971a.a(this.playIcon, C2971a.a(this.removeIcon, (this.pickerItem.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.items)) * 31, 31), 31)) * 31, 31)) * 31;
        MediaPickerDTO.VideoConfig videoConfig = this.videoConfig;
        int hashCode2 = (hashCode + (videoConfig == null ? 0 : videoConfig.hashCode())) * 31;
        t tVar = this.uploadEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.uploadErrorEvent;
        int hashCode4 = (hashCode3 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        MediaPickerDTO.PickerItemBadgeDTO.HideCondition hideCondition = this.hidePickerBadgeCondition;
        int hashCode5 = (hashCode4 + (hideCondition == null ? 0 : hideCondition.hashCode())) * 31;
        OnBoardingConfigVO onBoardingConfigVO = this.onBoardingConfigVO;
        return Boolean.hashCode(this.isModal) + C3532b.a((hashCode5 + (onBoardingConfigVO != null ? onBoardingConfigVO.hashCode() : 0)) * 31, 31, this.isExpanded);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isModal, reason: from getter */
    public final boolean getIsModal() {
        return this.isModal;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<MediaVO> list = this.items;
        PickerVO pickerVO = this.pickerItem;
        IconDTO iconDTO = this.removeIcon;
        IconDTO iconDTO2 = this.playIcon;
        EmptyVO emptyVO = this.emptyItem;
        int i11 = this.maxItemsCount;
        MediaPickerDTO.PhotoConfig photoConfig = this.photoConfig;
        MediaPickerDTO.VideoConfig videoConfig = this.videoConfig;
        t tVar = this.uploadEvent;
        t tVar2 = this.uploadErrorEvent;
        MediaPickerDTO.PickerItemBadgeDTO.HideCondition hideCondition = this.hidePickerBadgeCondition;
        OnBoardingConfigVO onBoardingConfigVO = this.onBoardingConfigVO;
        boolean z11 = this.isExpanded;
        boolean z12 = this.isModal;
        StringBuilder b11 = b.b(j11, "MediaPickerVO(id=", ", items=", list);
        b11.append(", pickerItem=");
        b11.append(pickerVO);
        b11.append(", removeIcon=");
        b11.append(iconDTO);
        b11.append(", playIcon=");
        b11.append(iconDTO2);
        b11.append(", emptyItem=");
        b11.append(emptyVO);
        b11.append(", maxItemsCount=");
        b11.append(i11);
        b11.append(", photoConfig=");
        b11.append(photoConfig);
        b11.append(", videoConfig=");
        b11.append(videoConfig);
        b11.append(", uploadEvent=");
        b11.append(tVar);
        b11.append(", uploadErrorEvent=");
        b11.append(tVar2);
        b11.append(", hidePickerBadgeCondition=");
        b11.append(hideCondition);
        b11.append(", onBoardingConfigVO=");
        b11.append(onBoardingConfigVO);
        b11.append(", isExpanded=");
        b11.append(z11);
        return Bi.b.f(b11, ", isModal=", z12, ")");
    }
}
