package ru.ozon.android.messenger.blocks.messagefile;

import C.o0;
import N3.C3660k;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/android/messenger/blocks/messagefile/FileDTO;", "", ImagesContract.URL, "", "localUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "mime", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getLocalUrl", "getName", "getMime", "getSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FileDTO {
    public static final int $stable = 0;
    private final String localUrl;

    @NotNull
    private final String mime;

    @NotNull
    private final String name;

    @NotNull
    private final String size;

    @NotNull
    private final String url;

    public FileDTO(@NotNull String url, String str, @NotNull String name, @NotNull String mime, @NotNull String size) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mime, "mime");
        Intrinsics.checkNotNullParameter(size, "size");
        this.url = url;
        this.localUrl = str;
        this.name = name;
        this.mime = mime;
        this.size = size;
    }

    public static /* synthetic */ FileDTO copy$default(FileDTO fileDTO, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fileDTO.url;
        }
        if ((i11 & 2) != 0) {
            str2 = fileDTO.localUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = fileDTO.name;
        }
        if ((i11 & 8) != 0) {
            str4 = fileDTO.mime;
        }
        if ((i11 & 16) != 0) {
            str5 = fileDTO.size;
        }
        String str6 = str5;
        String str7 = str3;
        return fileDTO.copy(str, str2, str7, str4, str6);
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
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMime() {
        return this.mime;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final FileDTO copy(@NotNull String url, String localUrl, @NotNull String name, @NotNull String mime, @NotNull String size) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mime, "mime");
        Intrinsics.checkNotNullParameter(size, "size");
        return new FileDTO(url, localUrl, name, mime, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileDTO)) {
            return false;
        }
        FileDTO fileDTO = (FileDTO) other;
        return Intrinsics.d(this.url, fileDTO.url) && Intrinsics.d(this.localUrl, fileDTO.localUrl) && Intrinsics.d(this.name, fileDTO.name) && Intrinsics.d(this.mime, fileDTO.mime) && Intrinsics.d(this.size, fileDTO.size);
    }

    public final String getLocalUrl() {
        return this.localUrl;
    }

    @NotNull
    public final String getMime() {
        return this.mime;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.localUrl;
        return this.size.hashCode() + G.g.a(G.g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.mime);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.localUrl;
        String str3 = this.name;
        String str4 = this.mime;
        String str5 = this.size;
        StringBuilder d11 = C3660k.d("FileDTO(url=", str, ", localUrl=", str2, ", name=");
        Nh.a.h(d11, str3, ", mime=", str4, ", size=");
        return o0.c(d11, str5, ")");
    }
}
