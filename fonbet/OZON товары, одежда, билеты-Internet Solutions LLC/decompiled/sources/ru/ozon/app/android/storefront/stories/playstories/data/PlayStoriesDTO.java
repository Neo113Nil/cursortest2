package ru.ozon.app.android.storefront.stories.playstories.data;

import B90.C2618u;
import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J6\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesDTO;", "", "span", "", "pointer", "stories", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getSpan", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPointer", "getStories", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesDTO;", "equals", "", "other", "hashCode", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayStoriesDTO {
    public static final int $stable = 8;
    private final Integer pointer;
    private final Integer span;

    @NotNull
    private final List<StoryCommonMolecule> stories;

    public PlayStoriesDTO(Integer num, Integer num2, @NotNull List<StoryCommonMolecule> stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.span = num;
        this.pointer = num2;
        this.stories = stories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayStoriesDTO copy$default(PlayStoriesDTO playStoriesDTO, Integer num, Integer num2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = playStoriesDTO.span;
        }
        if ((i11 & 2) != 0) {
            num2 = playStoriesDTO.pointer;
        }
        if ((i11 & 4) != 0) {
            list = playStoriesDTO.stories;
        }
        return playStoriesDTO.copy(num, num2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getSpan() {
        return this.span;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPointer() {
        return this.pointer;
    }

    @NotNull
    public final List<StoryCommonMolecule> component3() {
        return this.stories;
    }

    @NotNull
    public final PlayStoriesDTO copy(Integer span, Integer pointer, @NotNull List<StoryCommonMolecule> stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        return new PlayStoriesDTO(span, pointer, stories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayStoriesDTO)) {
            return false;
        }
        PlayStoriesDTO playStoriesDTO = (PlayStoriesDTO) other;
        return Intrinsics.d(this.span, playStoriesDTO.span) && Intrinsics.d(this.pointer, playStoriesDTO.pointer) && Intrinsics.d(this.stories, playStoriesDTO.stories);
    }

    public final Integer getPointer() {
        return this.pointer;
    }

    public final Integer getSpan() {
        return this.span;
    }

    @NotNull
    public final List<StoryCommonMolecule> getStories() {
        return this.stories;
    }

    public int hashCode() {
        Integer num = this.span;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pointer;
        return this.stories.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        Integer num = this.span;
        Integer num2 = this.pointer;
        return C2618u.h(c.f("PlayStoriesDTO(span=", ", pointer=", num, num2, ", stories="), this.stories, ")");
    }
}
