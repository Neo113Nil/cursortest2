package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JB\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/PlayStoriesV3DTO;", "", "span", "", "pointer", "frame", "stories", "", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3DTO;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getSpan", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPointer", "getFrame", "getStories", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/PlayStoriesV3DTO;", "equals", "", "other", "hashCode", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayStoriesV3DTO {
    public static final int $stable = 8;
    private final Integer frame;
    private final Integer pointer;
    private final Integer span;

    @NotNull
    private final List<StoryV3DTO> stories;

    public PlayStoriesV3DTO(Integer num, Integer num2, Integer num3, @NotNull List<StoryV3DTO> stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.span = num;
        this.pointer = num2;
        this.frame = num3;
        this.stories = stories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayStoriesV3DTO copy$default(PlayStoriesV3DTO playStoriesV3DTO, Integer num, Integer num2, Integer num3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = playStoriesV3DTO.span;
        }
        if ((i11 & 2) != 0) {
            num2 = playStoriesV3DTO.pointer;
        }
        if ((i11 & 4) != 0) {
            num3 = playStoriesV3DTO.frame;
        }
        if ((i11 & 8) != 0) {
            list = playStoriesV3DTO.stories;
        }
        return playStoriesV3DTO.copy(num, num2, num3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getSpan() {
        return this.span;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPointer() {
        return this.pointer;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getFrame() {
        return this.frame;
    }

    @NotNull
    public final List<StoryV3DTO> component4() {
        return this.stories;
    }

    @NotNull
    public final PlayStoriesV3DTO copy(Integer span, Integer pointer, Integer frame, @NotNull List<StoryV3DTO> stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        return new PlayStoriesV3DTO(span, pointer, frame, stories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayStoriesV3DTO)) {
            return false;
        }
        PlayStoriesV3DTO playStoriesV3DTO = (PlayStoriesV3DTO) other;
        return Intrinsics.d(this.span, playStoriesV3DTO.span) && Intrinsics.d(this.pointer, playStoriesV3DTO.pointer) && Intrinsics.d(this.frame, playStoriesV3DTO.frame) && Intrinsics.d(this.stories, playStoriesV3DTO.stories);
    }

    public final Integer getFrame() {
        return this.frame;
    }

    public final Integer getPointer() {
        return this.pointer;
    }

    public final Integer getSpan() {
        return this.span;
    }

    @NotNull
    public final List<StoryV3DTO> getStories() {
        return this.stories;
    }

    public int hashCode() {
        Integer num = this.span;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pointer;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.frame;
        return this.stories.hashCode() + ((hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        Integer num = this.span;
        Integer num2 = this.pointer;
        Integer num3 = this.frame;
        List<StoryV3DTO> list = this.stories;
        StringBuilder f7 = c.f("PlayStoriesV3DTO(span=", ", pointer=", num, num2, ", frame=");
        f7.append(num3);
        f7.append(", stories=");
        f7.append(list);
        f7.append(")");
        return f7.toString();
    }
}
