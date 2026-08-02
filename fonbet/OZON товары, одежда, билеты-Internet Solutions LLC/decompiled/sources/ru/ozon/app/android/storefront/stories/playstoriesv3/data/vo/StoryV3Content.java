package ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo;

import Bi.a;
import Bi.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.Alignment;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Content;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "align", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "contentList", "<init>", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "getAlign", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "Ljava/util/List;", "getContentList", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3Content implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoryV3Content> CREATOR = new Creator();

    @NotNull
    private final Alignment align;

    @NotNull
    private final List<AtomDTO> contentList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryV3Content> {
        @Override // android.os.Parcelable.Creator
        public final StoryV3Content createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Alignment valueOf = Alignment.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(StoryV3Content.class, parcel, arrayList, i11, 1);
            }
            return new StoryV3Content(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryV3Content[] newArray(int i11) {
            return new StoryV3Content[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryV3Content(@NotNull Alignment align, @NotNull List<? extends AtomDTO> contentList) {
        Intrinsics.checkNotNullParameter(align, "align");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        this.align = align;
        this.contentList = contentList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryV3Content)) {
            return false;
        }
        StoryV3Content storyV3Content = (StoryV3Content) other;
        return this.align == storyV3Content.align && Intrinsics.d(this.contentList, storyV3Content.contentList);
    }

    @NotNull
    public final Alignment getAlign() {
        return this.align;
    }

    @NotNull
    public final List<AtomDTO> getContentList() {
        return this.contentList;
    }

    public int hashCode() {
        return this.contentList.hashCode() + (this.align.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "StoryV3Content(align=" + this.align + ", contentList=" + this.contentList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.align.name());
        Iterator c11 = a.c(this.contentList, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), flags);
        }
    }
}
