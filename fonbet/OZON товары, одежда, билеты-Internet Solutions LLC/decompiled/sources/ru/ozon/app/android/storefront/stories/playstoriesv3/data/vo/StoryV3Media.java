package ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo;

import Ak.b;
import Bi.a;
import H3.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Media;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Type;", "Landroid/os/Parcelable;", "", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3Item;", "items", "<init>", "(Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "position", "I", "getPosition", "setPosition", "(I)V", "isFrameChanged", "Z", "()Z", "setFrameChanged", "(Z)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3Media extends StoryV3Type implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoryV3Media> CREATOR = new Creator();
    private boolean isFrameChanged;

    @NotNull
    private final List<StoryV3Item> items;
    private int position;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryV3Media> {
        @Override // android.os.Parcelable.Creator
        public final StoryV3Media createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(StoryV3Item.CREATOR, parcel, arrayList, i11, 1);
            }
            return new StoryV3Media(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryV3Media[] newArray(int i11) {
            return new StoryV3Media[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryV3Media(@NotNull List<StoryV3Item> items) {
        super(null);
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoryV3Media) && Intrinsics.d(this.items, ((StoryV3Media) other).items);
    }

    @NotNull
    public final List<StoryV3Item> getItems() {
        return this.items;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.Position
    public int getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    /* renamed from: isFrameChanged, reason: from getter */
    public boolean getIsFrameChanged() {
        return this.isFrameChanged;
    }

    public void setFrameChanged(boolean z11) {
        this.isFrameChanged = z11;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.Position
    public void setPosition(int i11) {
        this.position = i11;
    }

    @NotNull
    public String toString() {
        return c.a("StoryV3Media(items=", ")", this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((StoryV3Item) c11.next()).writeToParcel(dest, flags);
        }
    }
}
