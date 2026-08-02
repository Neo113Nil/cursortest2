package ru.ozon.android.messenger.blocks.messageimage;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Sc.InterfaceC3999a;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB9\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\rJE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003JR\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/android/messenger/blocks/messageimage/ImageDTO;", "", ImagesContract.URL, "", "localUrl", "mime", "width", "", "height", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getLocalUrl", "getMime", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/messageimage/ImageDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/android/messenger/blocks/messageimage/ImageDTO;", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ImageDTO {
    public static final int $stable = 0;
    private final AtomActionDTO action;
    private final Integer height;
    private final String localUrl;

    @NotNull
    private final String mime;

    @NotNull
    private final String url;
    private final Integer width;

    public ImageDTO(@NotNull String url, String str, @NotNull String mime, Integer num, Integer num2, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mime, "mime");
        this.url = url;
        this.localUrl = str;
        this.mime = mime;
        this.width = num;
        this.height = num2;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, String str2, String str3, Integer num, Integer num2, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageDTO.url;
        }
        if ((i11 & 2) != 0) {
            str2 = imageDTO.localUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = imageDTO.mime;
        }
        if ((i11 & 8) != 0) {
            num = imageDTO.width;
        }
        if ((i11 & 16) != 0) {
            num2 = imageDTO.height;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = imageDTO.action;
        }
        Integer num3 = num2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return imageDTO.copy(str, str2, str3, num, num3, atomActionDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLocalUrl() {
        return this.localUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMime() {
        return this.mime;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ImageDTO copy(@NotNull String url, String localUrl, @NotNull String mime, Integer width, Integer height, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mime, "mime");
        return new ImageDTO(url, localUrl, mime, width, height, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDTO)) {
            return false;
        }
        ImageDTO imageDTO = (ImageDTO) other;
        return Intrinsics.d(this.url, imageDTO.url) && Intrinsics.d(this.localUrl, imageDTO.localUrl) && Intrinsics.d(this.mime, imageDTO.mime) && Intrinsics.d(this.width, imageDTO.width) && Intrinsics.d(this.height, imageDTO.height) && Intrinsics.d(this.action, imageDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getLocalUrl() {
        return this.localUrl;
    }

    @NotNull
    public final String getMime() {
        return this.mime;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.localUrl;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.mime);
        Integer num = this.width;
        int hashCode2 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.localUrl;
        String str3 = this.mime;
        Integer num = this.width;
        Integer num2 = this.height;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder d11 = C3660k.d("ImageDTO(url=", str, ", localUrl=", str2, ", mime=");
        C2454a.f(num, str3, ", width=", ", height=", d11);
        d11.append(num2);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(")");
        return d11.toString();
    }

    public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, String str2, String str3, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageDTO.url;
        }
        if ((i11 & 2) != 0) {
            str2 = imageDTO.localUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = imageDTO.mime;
        }
        if ((i11 & 8) != 0) {
            num = imageDTO.width;
        }
        if ((i11 & 16) != 0) {
            num2 = imageDTO.height;
        }
        Integer num3 = num2;
        String str4 = str3;
        return imageDTO.copy(str, str2, str4, num, num3);
    }

    @InterfaceC3999a
    public final /* synthetic */ ImageDTO copy(String url, String localUrl, String mime, Integer width, Integer height) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mime, "mime");
        return copy(url, localUrl, mime, width, height, this.action);
    }

    public /* synthetic */ ImageDTO(String str, String str2, String str3, Integer num, Integer num2, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, str3, num, num2, (i11 & 32) != 0 ? null : atomActionDTO);
    }

    public /* synthetic */ ImageDTO(String str, String str2, String str3, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, str3, num, num2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public ImageDTO(@NotNull String url, String str, @NotNull String mime, Integer num, Integer num2) {
        this(url, str, mime, num, num2, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mime, "mime");
    }
}
