package ru.ozon.app.android.storefront.stories.story.data;

import Ak.b;
import Bi.a;
import H3.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryMedia;", "Lru/ozon/app/android/storefront/stories/story/data/StoryType;", "Landroid/os/Parcelable;", "items", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryMedia extends StoryType implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StoryMedia> CREATOR = new Creator();

    @NotNull
    private final List<StoryItem> items;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryMedia> {
        @Override // android.os.Parcelable.Creator
        public final StoryMedia createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(StoryItem.CREATOR, parcel, arrayList, i11, 1);
            }
            return new StoryMedia(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryMedia[] newArray(int i11) {
            return new StoryMedia[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryMedia(@NotNull List<StoryItem> items) {
        super(null);
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryMedia copy$default(StoryMedia storyMedia, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = storyMedia.items;
        }
        return storyMedia.copy(list);
    }

    @NotNull
    public final List<StoryItem> component1() {
        return this.items;
    }

    @NotNull
    public final StoryMedia copy(@NotNull List<StoryItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new StoryMedia(items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoryMedia) && Intrinsics.d(this.items, ((StoryMedia) other).items);
    }

    @NotNull
    public final List<StoryItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("StoryMedia(items=", ")", this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((StoryItem) c11.next()).writeToParcel(dest, flags);
        }
    }
}
