package ru.ozon.app.android.storefront.stories.story.data;

import C.J;
import De.C2859b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.authorBlock.AuthorBlock;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010,\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010$¨\u0006:"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "Landroid/os/Parcelable;", "", "storyId", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;", "authorBlock", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "closeButton", "Lru/ozon/app/android/storefront/stories/story/data/StoryType;", "data", "", "wasViewed", "<init>", "(ILjava/util/Map;Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/storefront/stories/story/data/StoryType;Z)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/util/Map;", "component3", "()Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;", "component4", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "component5", "()Lru/ozon/app/android/storefront/stories/story/data/StoryType;", "component6", "()Z", "copy", "(ILjava/util/Map;Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/storefront/stories/story/data/StoryType;Z)Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getStoryId", "Ljava/util/Map;", "getTrackingInfo", "Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;", "getAuthorBlock", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getCloseButton", "Lru/ozon/app/android/storefront/stories/story/data/StoryType;", "getData", "Z", "getWasViewed", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryCommonMolecule implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StoryCommonMolecule> CREATOR = new Creator();
    private final AuthorBlock authorBlock;
    private final ButtonV3Atom.SmallIconButton closeButton;

    @NotNull
    private final StoryType data;
    private final int storyId;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final boolean wasViewed;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryCommonMolecule> {
        @Override // android.os.Parcelable.Creator
        public final StoryCommonMolecule createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    i11 = C2859b.a(StoryCommonMolecule.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new StoryCommonMolecule(readInt, linkedHashMap, (AuthorBlock) parcel.readParcelable(StoryCommonMolecule.class.getClassLoader()), (ButtonV3Atom.SmallIconButton) parcel.readParcelable(StoryCommonMolecule.class.getClassLoader()), (StoryType) parcel.readValue(StoryCommonMolecule.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryCommonMolecule[] newArray(int i11) {
            return new StoryCommonMolecule[i11];
        }
    }

    public StoryCommonMolecule(int i11, Map<String, TokenizedTrackingInfo> map, AuthorBlock authorBlock, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull StoryType data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.storyId = i11;
        this.trackingInfo = map;
        this.authorBlock = authorBlock;
        this.closeButton = smallIconButton;
        this.data = data;
        this.wasViewed = z11;
    }

    public static /* synthetic */ StoryCommonMolecule copy$default(StoryCommonMolecule storyCommonMolecule, int i11, Map map, AuthorBlock authorBlock, ButtonV3Atom.SmallIconButton smallIconButton, StoryType storyType, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = storyCommonMolecule.storyId;
        }
        if ((i12 & 2) != 0) {
            map = storyCommonMolecule.trackingInfo;
        }
        if ((i12 & 4) != 0) {
            authorBlock = storyCommonMolecule.authorBlock;
        }
        if ((i12 & 8) != 0) {
            smallIconButton = storyCommonMolecule.closeButton;
        }
        if ((i12 & 16) != 0) {
            storyType = storyCommonMolecule.data;
        }
        if ((i12 & 32) != 0) {
            z11 = storyCommonMolecule.wasViewed;
        }
        StoryType storyType2 = storyType;
        boolean z12 = z11;
        return storyCommonMolecule.copy(i11, map, authorBlock, smallIconButton, storyType2, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStoryId() {
        return this.storyId;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final AuthorBlock getAuthorBlock() {
        return this.authorBlock;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final StoryType getData() {
        return this.data;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getWasViewed() {
        return this.wasViewed;
    }

    @NotNull
    public final StoryCommonMolecule copy(int storyId, Map<String, TokenizedTrackingInfo> trackingInfo, AuthorBlock authorBlock, ButtonV3Atom.SmallIconButton closeButton, @NotNull StoryType data, boolean wasViewed) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new StoryCommonMolecule(storyId, trackingInfo, authorBlock, closeButton, data, wasViewed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryCommonMolecule)) {
            return false;
        }
        StoryCommonMolecule storyCommonMolecule = (StoryCommonMolecule) other;
        return this.storyId == storyCommonMolecule.storyId && Intrinsics.d(this.trackingInfo, storyCommonMolecule.trackingInfo) && Intrinsics.d(this.authorBlock, storyCommonMolecule.authorBlock) && Intrinsics.d(this.closeButton, storyCommonMolecule.closeButton) && Intrinsics.d(this.data, storyCommonMolecule.data) && this.wasViewed == storyCommonMolecule.wasViewed;
    }

    public final AuthorBlock getAuthorBlock() {
        return this.authorBlock;
    }

    public final ButtonV3Atom.SmallIconButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final StoryType getData() {
        return this.data;
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final boolean getWasViewed() {
        return this.wasViewed;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.storyId) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        AuthorBlock authorBlock = this.authorBlock;
        int hashCode3 = (hashCode2 + (authorBlock == null ? 0 : authorBlock.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.closeButton;
        return Boolean.hashCode(this.wasViewed) + ((this.data.hashCode() + ((hashCode3 + (smallIconButton != null ? smallIconButton.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "StoryCommonMolecule(storyId=" + this.storyId + ", trackingInfo=" + this.trackingInfo + ", authorBlock=" + this.authorBlock + ", closeButton=" + this.closeButton + ", data=" + this.data + ", wasViewed=" + this.wasViewed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.storyId);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeParcelable(this.authorBlock, flags);
        dest.writeParcelable(this.closeButton, flags);
        dest.writeValue(this.data);
        dest.writeInt(this.wasViewed ? 1 : 0);
    }

    public /* synthetic */ StoryCommonMolecule(int i11, Map map, AuthorBlock authorBlock, ButtonV3Atom.SmallIconButton smallIconButton, StoryType storyType, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, map, authorBlock, smallIconButton, storyType, (i12 & 32) != 0 ? false : z11);
    }
}
