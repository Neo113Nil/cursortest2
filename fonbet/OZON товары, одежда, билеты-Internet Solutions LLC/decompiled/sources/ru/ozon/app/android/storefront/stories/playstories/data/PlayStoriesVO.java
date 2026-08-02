package ru.ozon.app.android.storefront.stories.playstories.data;

import Ak.b;
import Lh.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Landroid/os/Parcelable;", "", "id", "", "span", "pointer", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "stories", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getSpan", "()Ljava/lang/Integer;", "getPointer", "Ljava/util/List;", "getStories", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayStoriesVO implements c, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlayStoriesVO> CREATOR = new Creator();
    private final long id;
    private final Integer pointer;
    private final Integer span;

    @NotNull
    private final List<StoryCommonMolecule> stories;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlayStoriesVO> {
        @Override // android.os.Parcelable.Creator
        public final PlayStoriesVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(StoryCommonMolecule.CREATOR, parcel, arrayList, i11, 1);
            }
            return new PlayStoriesVO(readLong, valueOf, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlayStoriesVO[] newArray(int i11) {
            return new PlayStoriesVO[i11];
        }
    }

    public PlayStoriesVO(long j11, Integer num, Integer num2, @NotNull List<StoryCommonMolecule> stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.id = j11;
        this.span = num;
        this.pointer = num2;
        this.stories = stories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayStoriesVO)) {
            return false;
        }
        PlayStoriesVO playStoriesVO = (PlayStoriesVO) other;
        return this.id == playStoriesVO.id && Intrinsics.d(this.span, playStoriesVO.span) && Intrinsics.d(this.pointer, playStoriesVO.pointer) && Intrinsics.d(this.stories, playStoriesVO.stories);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getPointer() {
        return this.pointer;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSpan() {
        return this.span;
    }

    @NotNull
    public final List<StoryCommonMolecule> getStories() {
        return this.stories;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.span;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pointer;
        return this.stories.hashCode() + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.span;
        Integer num2 = this.pointer;
        List<StoryCommonMolecule> list = this.stories;
        StringBuilder c11 = a.c("PlayStoriesVO(id=", j11, ", span=", num);
        c11.append(", pointer=");
        c11.append(num2);
        c11.append(", stories=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        Integer num = this.span;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Integer num2 = this.pointer;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        Iterator c11 = Bi.a.c(this.stories, dest);
        while (c11.hasNext()) {
            ((StoryCommonMolecule) c11.next()).writeToParcel(dest, flags);
        }
    }
}
