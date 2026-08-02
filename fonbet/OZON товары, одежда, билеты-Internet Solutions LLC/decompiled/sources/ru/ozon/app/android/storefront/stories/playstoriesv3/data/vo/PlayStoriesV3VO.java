package ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo;

import Ak.b;
import D3.h;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/PlayStoriesV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Landroid/os/Parcelable;", "", "id", "", "span", "pointer", "frame", "", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "stories", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getSpan", "()Ljava/lang/Integer;", "getPointer", "getFrame", "Ljava/util/List;", "getStories", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlayStoriesV3VO implements c, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlayStoriesV3VO> CREATOR = new Creator();
    private final Integer frame;
    private final long id;
    private final Integer pointer;
    private final Integer span;

    @NotNull
    private final List<StoryV3> stories;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlayStoriesV3VO> {
        @Override // android.os.Parcelable.Creator
        public final PlayStoriesV3VO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(StoryV3.CREATOR, parcel, arrayList, i11, 1);
            }
            return new PlayStoriesV3VO(readLong, valueOf, valueOf2, valueOf3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlayStoriesV3VO[] newArray(int i11) {
            return new PlayStoriesV3VO[i11];
        }
    }

    public PlayStoriesV3VO(long j11, Integer num, Integer num2, Integer num3, @NotNull List<StoryV3> stories) {
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.id = j11;
        this.span = num;
        this.pointer = num2;
        this.frame = num3;
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
        if (!(other instanceof PlayStoriesV3VO)) {
            return false;
        }
        PlayStoriesV3VO playStoriesV3VO = (PlayStoriesV3VO) other;
        return this.id == playStoriesV3VO.id && Intrinsics.d(this.span, playStoriesV3VO.span) && Intrinsics.d(this.pointer, playStoriesV3VO.pointer) && Intrinsics.d(this.frame, playStoriesV3VO.frame) && Intrinsics.d(this.stories, playStoriesV3VO.stories);
    }

    public final Integer getFrame() {
        return this.frame;
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
    public final List<StoryV3> getStories() {
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
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.frame;
        return this.stories.hashCode() + ((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.span;
        Integer num2 = this.pointer;
        Integer num3 = this.frame;
        List<StoryV3> list = this.stories;
        StringBuilder c11 = a.c("PlayStoriesV3VO(id=", j11, ", span=", num);
        c11.append(", pointer=");
        c11.append(num2);
        c11.append(", frame=");
        c11.append(num3);
        return h.c(c11, ", stories=", list, ")");
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
        Integer num3 = this.frame;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num3);
        }
        Iterator c11 = Bi.a.c(this.stories, dest);
        while (c11.hasNext()) {
            ((StoryV3) c11.next()).writeToParcel(dest, flags);
        }
    }
}
