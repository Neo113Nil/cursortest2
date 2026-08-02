package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation;

import B0.C2454a;
import B3.p;
import El.C2971a;
import G.g;
import Nh.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005DEFGHB\u008b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\bA\u0010?R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0019\u0010=\u001a\u0004\bB\u0010?R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\bC\u0010?¨\u0006I"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoVO;", "photos", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerVO;", "pickerItem", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "removeIcon", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$EmptyVO;", "emptyItem", "", "maxItemsCount", "", "deliveryNumber", "postingNumber", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoConfig;", "photoConfig", "LWZ/t;", "widgetEvent", "uploadEvent", "uploadErrorEvent", "deleteEvent", "deleteErrorEvent", "<init>", "(JLjava/util/List;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerVO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$EmptyVO;ILjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoConfig;LWZ/t;LWZ/t;LWZ/t;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getPhotos", "()Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerVO;", "getPickerItem", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerVO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$EmptyVO;", "getEmptyItem", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$EmptyVO;", "I", "getMaxItemsCount", "Ljava/lang/String;", "getDeliveryNumber", "getPostingNumber", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoConfig;", "getPhotoConfig", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoConfig;", "LWZ/t;", "getWidgetEvent", "()LWZ/t;", "getUploadEvent", "getUploadErrorEvent", "getDeleteEvent", "getDeleteErrorEvent", "PickerItemVO", "PhotoVO", "PickerVO", "EmptyVO", "PhotoConfig", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ParcelPhotoAddVO implements c {
    private final t deleteErrorEvent;
    private final t deleteEvent;
    private final String deliveryNumber;

    @NotNull
    private final EmptyVO emptyItem;
    private final long id;
    private final int maxItemsCount;

    @NotNull
    private final PhotoConfig photoConfig;

    @NotNull
    private final List<PhotoVO> photos;

    @NotNull
    private final PickerVO pickerItem;
    private final String postingNumber;

    @NotNull
    private final IconDTO removeIcon;
    private final t uploadErrorEvent;
    private final t uploadEvent;
    private final t widgetEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$EmptyVO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "borderColor", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/lang/String;", "getBorderColor", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyVO implements PickerItemVO {
        private final String borderColor;

        @NotNull
        private final ImageDTO image;

        public EmptyVO(@NotNull ImageDTO image, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.borderColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyVO)) {
                return false;
            }
            EmptyVO emptyVO = (EmptyVO) other;
            return Intrinsics.d(this.image, emptyVO.image) && Intrinsics.d(this.borderColor, emptyVO.borderColor);
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO.PickerItemVO
        @NotNull
        public ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.borderColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "EmptyVO(image=" + this.image + ", borderColor=" + this.borderColor + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoConfig;", "", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "uploadPhotoAction", "deletePhotoAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getUploadPhotoAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getDeletePhotoAction", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoConfig {
        private final AtomAction.ComposerAction deletePhotoAction;
        private final AtomAction.ComposerAction uploadPhotoAction;

        public PhotoConfig(AtomAction.ComposerAction composerAction, AtomAction.ComposerAction composerAction2) {
            this.uploadPhotoAction = composerAction;
            this.deletePhotoAction = composerAction2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoConfig)) {
                return false;
            }
            PhotoConfig photoConfig = (PhotoConfig) other;
            return Intrinsics.d(this.uploadPhotoAction, photoConfig.uploadPhotoAction) && Intrinsics.d(this.deletePhotoAction, photoConfig.deletePhotoAction);
        }

        public final AtomAction.ComposerAction getDeletePhotoAction() {
            return this.deletePhotoAction;
        }

        public final AtomAction.ComposerAction getUploadPhotoAction() {
            return this.uploadPhotoAction;
        }

        public int hashCode() {
            AtomAction.ComposerAction composerAction = this.uploadPhotoAction;
            int hashCode = (composerAction == null ? 0 : composerAction.hashCode()) * 31;
            AtomAction.ComposerAction composerAction2 = this.deletePhotoAction;
            return hashCode + (composerAction2 != null ? composerAction2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PhotoConfig(uploadPhotoAction=" + this.uploadPhotoAction + ", deletePhotoAction=" + this.deletePhotoAction + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoVO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "removeIcon", "", "cdnUrl", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "photo", "LWZ/t;", "deletePhotoEvent", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;LWZ/t;)V", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;LWZ/t;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getCdnUrl", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "getPhoto", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "LWZ/t;", "getDeletePhotoEvent", "()LWZ/t;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoVO implements PickerItemVO {
        private final String cdnUrl;
        private final t deletePhotoEvent;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final AttachedPhoto photo;

        @NotNull
        private final IconDTO removeIcon;

        public PhotoVO(@NotNull ImageDTO image, @NotNull IconDTO removeIcon, String str, @NotNull AttachedPhoto photo, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
            Intrinsics.checkNotNullParameter(photo, "photo");
            this.image = image;
            this.removeIcon = removeIcon;
            this.cdnUrl = str;
            this.photo = photo;
            this.deletePhotoEvent = tVar;
        }

        public static /* synthetic */ PhotoVO copy$default(PhotoVO photoVO, ImageDTO imageDTO, IconDTO iconDTO, String str, AttachedPhoto attachedPhoto, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = photoVO.image;
            }
            if ((i11 & 2) != 0) {
                iconDTO = photoVO.removeIcon;
            }
            if ((i11 & 4) != 0) {
                str = photoVO.cdnUrl;
            }
            if ((i11 & 8) != 0) {
                attachedPhoto = photoVO.photo;
            }
            if ((i11 & 16) != 0) {
                tVar = photoVO.deletePhotoEvent;
            }
            t tVar2 = tVar;
            String str2 = str;
            return photoVO.copy(imageDTO, iconDTO, str2, attachedPhoto, tVar2);
        }

        @NotNull
        public final PhotoVO copy(@NotNull ImageDTO image, @NotNull IconDTO removeIcon, String cdnUrl, @NotNull AttachedPhoto photo, t deletePhotoEvent) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
            Intrinsics.checkNotNullParameter(photo, "photo");
            return new PhotoVO(image, removeIcon, cdnUrl, photo, deletePhotoEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoVO)) {
                return false;
            }
            PhotoVO photoVO = (PhotoVO) other;
            return Intrinsics.d(this.image, photoVO.image) && Intrinsics.d(this.removeIcon, photoVO.removeIcon) && Intrinsics.d(this.cdnUrl, photoVO.cdnUrl) && Intrinsics.d(this.photo, photoVO.photo) && Intrinsics.d(this.deletePhotoEvent, photoVO.deletePhotoEvent);
        }

        public final t getDeletePhotoEvent() {
            return this.deletePhotoEvent;
        }

        @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO.PickerItemVO
        @NotNull
        public ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final AttachedPhoto getPhoto() {
            return this.photo;
        }

        @NotNull
        public final IconDTO getRemoveIcon() {
            return this.removeIcon;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.removeIcon, this.image.hashCode() * 31, 31);
            String str = this.cdnUrl;
            int hashCode = (this.photo.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            t tVar = this.deletePhotoEvent;
            return hashCode + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            IconDTO iconDTO = this.removeIcon;
            String str = this.cdnUrl;
            AttachedPhoto attachedPhoto = this.photo;
            t tVar = this.deletePhotoEvent;
            StringBuilder sb2 = new StringBuilder("PhotoVO(image=");
            sb2.append(imageDTO);
            sb2.append(", removeIcon=");
            sb2.append(iconDTO);
            sb2.append(", cdnUrl=");
            sb2.append(str);
            sb2.append(", photo=");
            sb2.append(attachedPhoto);
            sb2.append(", deletePhotoEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$EmptyVO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PhotoVO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerVO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PickerItemVO {
        @NotNull
        ImageDTO getImage();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerVO;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO$PickerItemVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickerVO implements PickerItemVO {
        private final IconDTO icon;

        @NotNull
        private final ImageDTO image;
        private final t tokenizedEvent;

        public PickerVO(@NotNull ImageDTO image, IconDTO iconDTO, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.icon = iconDTO;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickerVO)) {
                return false;
            }
            PickerVO pickerVO = (PickerVO) other;
            return Intrinsics.d(this.image, pickerVO.image) && Intrinsics.d(this.icon, pickerVO.icon) && Intrinsics.d(this.tokenizedEvent, pickerVO.tokenizedEvent);
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @Override // ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO.PickerItemVO
        @NotNull
        public ImageDTO getImage() {
            return this.image;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            IconDTO iconDTO = this.icon;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("PickerVO(image=");
            sb2.append(imageDTO);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    public ParcelPhotoAddVO(long j11, @NotNull List<PhotoVO> photos, @NotNull PickerVO pickerItem, @NotNull IconDTO removeIcon, @NotNull EmptyVO emptyItem, int i11, String str, String str2, @NotNull PhotoConfig photoConfig, t tVar, t tVar2, t tVar3, t tVar4, t tVar5) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(pickerItem, "pickerItem");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(emptyItem, "emptyItem");
        Intrinsics.checkNotNullParameter(photoConfig, "photoConfig");
        this.id = j11;
        this.photos = photos;
        this.pickerItem = pickerItem;
        this.removeIcon = removeIcon;
        this.emptyItem = emptyItem;
        this.maxItemsCount = i11;
        this.deliveryNumber = str;
        this.postingNumber = str2;
        this.photoConfig = photoConfig;
        this.widgetEvent = tVar;
        this.uploadEvent = tVar2;
        this.uploadErrorEvent = tVar3;
        this.deleteEvent = tVar4;
        this.deleteErrorEvent = tVar5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelPhotoAddVO)) {
            return false;
        }
        ParcelPhotoAddVO parcelPhotoAddVO = (ParcelPhotoAddVO) other;
        return this.id == parcelPhotoAddVO.id && Intrinsics.d(this.photos, parcelPhotoAddVO.photos) && Intrinsics.d(this.pickerItem, parcelPhotoAddVO.pickerItem) && Intrinsics.d(this.removeIcon, parcelPhotoAddVO.removeIcon) && Intrinsics.d(this.emptyItem, parcelPhotoAddVO.emptyItem) && this.maxItemsCount == parcelPhotoAddVO.maxItemsCount && Intrinsics.d(this.deliveryNumber, parcelPhotoAddVO.deliveryNumber) && Intrinsics.d(this.postingNumber, parcelPhotoAddVO.postingNumber) && Intrinsics.d(this.photoConfig, parcelPhotoAddVO.photoConfig) && Intrinsics.d(this.widgetEvent, parcelPhotoAddVO.widgetEvent) && Intrinsics.d(this.uploadEvent, parcelPhotoAddVO.uploadEvent) && Intrinsics.d(this.uploadErrorEvent, parcelPhotoAddVO.uploadErrorEvent) && Intrinsics.d(this.deleteEvent, parcelPhotoAddVO.deleteEvent) && Intrinsics.d(this.deleteErrorEvent, parcelPhotoAddVO.deleteErrorEvent);
    }

    public final t getDeleteErrorEvent() {
        return this.deleteErrorEvent;
    }

    public final t getDeleteEvent() {
        return this.deleteEvent;
    }

    public final String getDeliveryNumber() {
        return this.deliveryNumber;
    }

    @NotNull
    public final EmptyVO getEmptyItem() {
        return this.emptyItem;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxItemsCount() {
        return this.maxItemsCount;
    }

    @NotNull
    public final PhotoConfig getPhotoConfig() {
        return this.photoConfig;
    }

    @NotNull
    public final List<PhotoVO> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final PickerVO getPickerItem() {
        return this.pickerItem;
    }

    public final String getPostingNumber() {
        return this.postingNumber;
    }

    @NotNull
    public final IconDTO getRemoveIcon() {
        return this.removeIcon;
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getWidgetEvent() {
        return this.widgetEvent;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxItemsCount, (this.emptyItem.hashCode() + C2971a.a(this.removeIcon, (this.pickerItem.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.photos)) * 31, 31)) * 31, 31);
        String str = this.deliveryNumber;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postingNumber;
        int hashCode2 = (this.photoConfig.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        t tVar = this.widgetEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.uploadEvent;
        int hashCode4 = (hashCode3 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.uploadErrorEvent;
        int hashCode5 = (hashCode4 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
        t tVar4 = this.deleteEvent;
        int hashCode6 = (hashCode5 + (tVar4 == null ? 0 : tVar4.hashCode())) * 31;
        t tVar5 = this.deleteErrorEvent;
        return hashCode6 + (tVar5 != null ? tVar5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<PhotoVO> list = this.photos;
        PickerVO pickerVO = this.pickerItem;
        IconDTO iconDTO = this.removeIcon;
        EmptyVO emptyVO = this.emptyItem;
        int i11 = this.maxItemsCount;
        String str = this.deliveryNumber;
        String str2 = this.postingNumber;
        PhotoConfig photoConfig = this.photoConfig;
        t tVar = this.widgetEvent;
        t tVar2 = this.uploadEvent;
        t tVar3 = this.uploadErrorEvent;
        t tVar4 = this.deleteEvent;
        t tVar5 = this.deleteErrorEvent;
        StringBuilder b11 = Lh.b.b(j11, "ParcelPhotoAddVO(id=", ", photos=", list);
        b11.append(", pickerItem=");
        b11.append(pickerVO);
        b11.append(", removeIcon=");
        b11.append(iconDTO);
        b11.append(", emptyItem=");
        b11.append(emptyVO);
        b11.append(", maxItemsCount=");
        b11.append(i11);
        a.h(b11, ", deliveryNumber=", str, ", postingNumber=", str2);
        b11.append(", photoConfig=");
        b11.append(photoConfig);
        b11.append(", widgetEvent=");
        b11.append(tVar);
        p.d(b11, ", uploadEvent=", tVar2, ", uploadErrorEvent=", tVar3);
        p.d(b11, ", deleteEvent=", tVar4, ", deleteErrorEvent=", tVar5);
        b11.append(")");
        return b11.toString();
    }
}
