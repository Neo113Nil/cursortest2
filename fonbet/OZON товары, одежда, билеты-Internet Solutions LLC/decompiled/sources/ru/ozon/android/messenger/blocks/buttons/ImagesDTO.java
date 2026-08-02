package ru.ozon.android.messenger.blocks.buttons;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/ImagesDTO;", "", "urls", "", "", "plus", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getUrls", "()Ljava/util/List;", "getPlus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ImagesDTO {
    public static final int $stable = 0;
    private final String plus;

    @NotNull
    private final List<String> urls;

    public ImagesDTO(@NotNull List<String> urls, String str) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        this.urls = urls;
        this.plus = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImagesDTO copy$default(ImagesDTO imagesDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = imagesDTO.urls;
        }
        if ((i11 & 2) != 0) {
            str = imagesDTO.plus;
        }
        return imagesDTO.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.urls;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlus() {
        return this.plus;
    }

    @NotNull
    public final ImagesDTO copy(@NotNull List<String> urls, String plus) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        return new ImagesDTO(urls, plus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImagesDTO)) {
            return false;
        }
        ImagesDTO imagesDTO = (ImagesDTO) other;
        return Intrinsics.d(this.urls, imagesDTO.urls) && Intrinsics.d(this.plus, imagesDTO.plus);
    }

    public final String getPlus() {
        return this.plus;
    }

    @NotNull
    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        int hashCode = this.urls.hashCode() * 31;
        String str = this.plus;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return Bi.b.e("ImagesDTO(urls=", ", plus=", this.plus, ")", this.urls);
    }
}
