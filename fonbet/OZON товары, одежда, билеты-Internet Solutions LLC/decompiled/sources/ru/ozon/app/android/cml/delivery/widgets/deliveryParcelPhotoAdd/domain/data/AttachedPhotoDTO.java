package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data;

import Ak.C2436a;
import B0.A0;
import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO;", "", "data", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;", "constructor-impl", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;", "getData", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;", "equals", "", "other", "equals-impl", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;)I", "toString", "", "toString-impl", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;)Ljava/lang/String;", "Data", "UploadedPhotoDTO", "FailedPhotoDTO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AttachedPhotoDTO {
    private final Data data;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;", "", "uploaded", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$UploadedPhotoDTO;", "failed", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$FailedPhotoDTO;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getUploaded", "()Ljava/util/List;", "getFailed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        private final List<FailedPhotoDTO> failed;
        private final List<UploadedPhotoDTO> uploaded;

        public Data(List<UploadedPhotoDTO> list, List<FailedPhotoDTO> list2) {
            this.uploaded = list;
            this.failed = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = data.uploaded;
            }
            if ((i11 & 2) != 0) {
                list2 = data.failed;
            }
            return data.copy(list, list2);
        }

        public final List<UploadedPhotoDTO> component1() {
            return this.uploaded;
        }

        public final List<FailedPhotoDTO> component2() {
            return this.failed;
        }

        @NotNull
        public final Data copy(List<UploadedPhotoDTO> uploaded, List<FailedPhotoDTO> failed) {
            return new Data(uploaded, failed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.uploaded, data.uploaded) && Intrinsics.d(this.failed, data.failed);
        }

        public final List<FailedPhotoDTO> getFailed() {
            return this.failed;
        }

        public final List<UploadedPhotoDTO> getUploaded() {
            return this.uploaded;
        }

        public int hashCode() {
            List<UploadedPhotoDTO> list = this.uploaded;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<FailedPhotoDTO> list2 = this.failed;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return C2436a.b("Data(uploaded=", this.uploaded, ", failed=", ")", this.failed);
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$FailedPhotoDTO;", "", "photoKey", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getPhotoKey", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class FailedPhotoDTO {

        @NotNull
        private final String photoKey;

        private /* synthetic */ FailedPhotoDTO(String str) {
            this.photoKey = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FailedPhotoDTO m586boximpl(String str) {
            return new FailedPhotoDTO(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m587constructorimpl(@NotNull String photoKey) {
            Intrinsics.checkNotNullParameter(photoKey, "photoKey");
            return photoKey;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m588equalsimpl(String str, Object obj) {
            return (obj instanceof FailedPhotoDTO) && Intrinsics.d(str, ((FailedPhotoDTO) obj).m592unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m589equalsimpl0(String str, String str2) {
            return Intrinsics.d(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m590hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m591toStringimpl(String str) {
            return A0.b("FailedPhotoDTO(photoKey=", str, ")");
        }

        public boolean equals(Object obj) {
            return m588equalsimpl(this.photoKey, obj);
        }

        @NotNull
        public final String getPhotoKey() {
            return this.photoKey;
        }

        public int hashCode() {
            return m590hashCodeimpl(this.photoKey);
        }

        public String toString() {
            return m591toStringimpl(this.photoKey);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m592unboximpl() {
            return this.photoKey;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$UploadedPhotoDTO;", "", "photoKey", "", "photoId", "cdnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhotoKey", "()Ljava/lang/String;", "getPhotoId", "getCdnUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadedPhotoDTO {
        private final String cdnUrl;

        @NotNull
        private final String photoId;

        @NotNull
        private final String photoKey;

        public UploadedPhotoDTO(@NotNull String photoKey, @NotNull String photoId, String str) {
            Intrinsics.checkNotNullParameter(photoKey, "photoKey");
            Intrinsics.checkNotNullParameter(photoId, "photoId");
            this.photoKey = photoKey;
            this.photoId = photoId;
            this.cdnUrl = str;
        }

        public static /* synthetic */ UploadedPhotoDTO copy$default(UploadedPhotoDTO uploadedPhotoDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uploadedPhotoDTO.photoKey;
            }
            if ((i11 & 2) != 0) {
                str2 = uploadedPhotoDTO.photoId;
            }
            if ((i11 & 4) != 0) {
                str3 = uploadedPhotoDTO.cdnUrl;
            }
            return uploadedPhotoDTO.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPhotoKey() {
            return this.photoKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPhotoId() {
            return this.photoId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCdnUrl() {
            return this.cdnUrl;
        }

        @NotNull
        public final UploadedPhotoDTO copy(@NotNull String photoKey, @NotNull String photoId, String cdnUrl) {
            Intrinsics.checkNotNullParameter(photoKey, "photoKey");
            Intrinsics.checkNotNullParameter(photoId, "photoId");
            return new UploadedPhotoDTO(photoKey, photoId, cdnUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadedPhotoDTO)) {
                return false;
            }
            UploadedPhotoDTO uploadedPhotoDTO = (UploadedPhotoDTO) other;
            return Intrinsics.d(this.photoKey, uploadedPhotoDTO.photoKey) && Intrinsics.d(this.photoId, uploadedPhotoDTO.photoId) && Intrinsics.d(this.cdnUrl, uploadedPhotoDTO.cdnUrl);
        }

        public final String getCdnUrl() {
            return this.cdnUrl;
        }

        @NotNull
        public final String getPhotoId() {
            return this.photoId;
        }

        @NotNull
        public final String getPhotoKey() {
            return this.photoKey;
        }

        public int hashCode() {
            int a11 = g.a(this.photoKey.hashCode() * 31, 31, this.photoId);
            String str = this.cdnUrl;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.photoKey;
            String str2 = this.photoId;
            return o0.c(C3660k.d("UploadedPhotoDTO(photoKey=", str, ", photoId=", str2, ", cdnUrl="), this.cdnUrl, ")");
        }
    }

    private /* synthetic */ AttachedPhotoDTO(Data data) {
        this.data = data;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AttachedPhotoDTO m579boximpl(Data data) {
        return new AttachedPhotoDTO(data);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Data m580constructorimpl(Data data) {
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m581equalsimpl(Data data, Object obj) {
        return (obj instanceof AttachedPhotoDTO) && Intrinsics.d(data, ((AttachedPhotoDTO) obj).m585unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m582equalsimpl0(Data data, Data data2) {
        return Intrinsics.d(data, data2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m583hashCodeimpl(Data data) {
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m584toStringimpl(Data data) {
        return "AttachedPhotoDTO(data=" + data + ")";
    }

    public boolean equals(Object obj) {
        return m581equalsimpl(this.data, obj);
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return m583hashCodeimpl(this.data);
    }

    public String toString() {
        return m584toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Data m585unboximpl() {
        return this.data;
    }
}
