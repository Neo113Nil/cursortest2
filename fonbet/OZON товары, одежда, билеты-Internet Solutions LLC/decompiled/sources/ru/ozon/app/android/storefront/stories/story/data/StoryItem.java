package ru.ozon.app.android.storefront.stories.story.data;

import C.J;
import De.C2859b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+Jz\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001eR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b=\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010+¨\u0006D"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "Landroid/os/Parcelable;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "backgroundColor", "Lru/ozon/app/android/storefront/stories/story/data/StoryItemAsset;", "asset", "tagTitle", "Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "text", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "soundControl", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/StoryItemAsset;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/StoryText;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/lang/String;", "component4", "()Lru/ozon/app/android/storefront/stories/story/data/StoryItemAsset;", "component5", "component6", "()Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "component7", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component8", "()Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/StoryItemAsset;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/StoryText;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;)Lru/ozon/app/android/storefront/stories/story/data/StoryItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "Ljava/util/Map;", "getTrackingInfo", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/storefront/stories/story/data/StoryItemAsset;", "getAsset", "getTagTitle", "Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "getText", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "Lru/ozon/app/android/storefront/stories/story/data/StorySoundControlDTO;", "getSoundControl", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryItem implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StoryItem> CREATOR = new Creator();
    private final AtomActionDTO action;

    @NotNull
    private final StoryItemAsset asset;
    private final String backgroundColor;
    private final ButtonV3Atom.LargeButton button;
    private final StorySoundControlDTO soundControl;
    private final String tagTitle;
    private final StoryText text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryItem> {
        @Override // android.os.Parcelable.Creator
        public final StoryItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(StoryItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(StoryItem.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            String readString = parcel.readString();
            StoryItemAsset storyItemAsset = (StoryItemAsset) parcel.readValue(StoryItem.class.getClassLoader());
            StorySoundControlDTO storySoundControlDTO = null;
            String readString2 = parcel.readString();
            StoryText createFromParcel = parcel.readInt() == 0 ? null : StoryText.CREATOR.createFromParcel(parcel);
            ButtonV3Atom.LargeButton largeButton = (ButtonV3Atom.LargeButton) parcel.readParcelable(StoryItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                storySoundControlDTO = StorySoundControlDTO.CREATOR.createFromParcel(parcel);
            }
            return new StoryItem(atomActionDTO, linkedHashMap, readString, storyItemAsset, readString2, createFromParcel, largeButton, storySoundControlDTO);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryItem[] newArray(int i11) {
            return new StoryItem[i11];
        }
    }

    public StoryItem(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, String str, @NotNull StoryItemAsset asset, String str2, StoryText storyText, ButtonV3Atom.LargeButton largeButton, StorySoundControlDTO storySoundControlDTO) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.backgroundColor = str;
        this.asset = asset;
        this.tagTitle = str2;
        this.text = storyText;
        this.button = largeButton;
        this.soundControl = storySoundControlDTO;
    }

    public static /* synthetic */ StoryItem copy$default(StoryItem storyItem, AtomActionDTO atomActionDTO, Map map, String str, StoryItemAsset storyItemAsset, String str2, StoryText storyText, ButtonV3Atom.LargeButton largeButton, StorySoundControlDTO storySoundControlDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = storyItem.action;
        }
        if ((i11 & 2) != 0) {
            map = storyItem.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            str = storyItem.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            storyItemAsset = storyItem.asset;
        }
        if ((i11 & 16) != 0) {
            str2 = storyItem.tagTitle;
        }
        if ((i11 & 32) != 0) {
            storyText = storyItem.text;
        }
        if ((i11 & 64) != 0) {
            largeButton = storyItem.button;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            storySoundControlDTO = storyItem.soundControl;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        StorySoundControlDTO storySoundControlDTO2 = storySoundControlDTO;
        String str3 = str2;
        StoryText storyText2 = storyText;
        return storyItem.copy(atomActionDTO, map, str, storyItemAsset, str3, storyText2, largeButton2, storySoundControlDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final StoryItemAsset getAsset() {
        return this.asset;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTagTitle() {
        return this.tagTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final StoryText getText() {
        return this.text;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component8, reason: from getter */
    public final StorySoundControlDTO getSoundControl() {
        return this.soundControl;
    }

    @NotNull
    public final StoryItem copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, String backgroundColor, @NotNull StoryItemAsset asset, String tagTitle, StoryText text, ButtonV3Atom.LargeButton button, StorySoundControlDTO soundControl) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        return new StoryItem(action, trackingInfo, backgroundColor, asset, tagTitle, text, button, soundControl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryItem)) {
            return false;
        }
        StoryItem storyItem = (StoryItem) other;
        return Intrinsics.d(this.action, storyItem.action) && Intrinsics.d(this.trackingInfo, storyItem.trackingInfo) && Intrinsics.d(this.backgroundColor, storyItem.backgroundColor) && Intrinsics.d(this.asset, storyItem.asset) && Intrinsics.d(this.tagTitle, storyItem.tagTitle) && Intrinsics.d(this.text, storyItem.text) && Intrinsics.d(this.button, storyItem.button) && Intrinsics.d(this.soundControl, storyItem.soundControl);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final StoryItemAsset getAsset() {
        return this.asset;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final StorySoundControlDTO getSoundControl() {
        return this.soundControl;
    }

    public final String getTagTitle() {
        return this.tagTitle;
    }

    public final StoryText getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (this.asset.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.tagTitle;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoryText storyText = this.text;
        int hashCode5 = (hashCode4 + (storyText == null ? 0 : storyText.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.button;
        int hashCode6 = (hashCode5 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        StorySoundControlDTO storySoundControlDTO = this.soundControl;
        return hashCode6 + (storySoundControlDTO != null ? storySoundControlDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StoryItem(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", backgroundColor=" + this.backgroundColor + ", asset=" + this.asset + ", tagTitle=" + this.tagTitle + ", text=" + this.text + ", button=" + this.button + ", soundControl=" + this.soundControl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.action, flags);
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
        dest.writeString(this.backgroundColor);
        dest.writeValue(this.asset);
        dest.writeString(this.tagTitle);
        StoryText storyText = this.text;
        if (storyText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storyText.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.button, flags);
        StorySoundControlDTO storySoundControlDTO = this.soundControl;
        if (storySoundControlDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storySoundControlDTO.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StoryItem(AtomActionDTO atomActionDTO, Map map, String str, StoryItemAsset storyItemAsset, String str2, StoryText storyText, ButtonV3Atom.LargeButton largeButton, StorySoundControlDTO storySoundControlDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomActionDTO, map, str, storyItemAsset, str2, storyText, largeButton, r9);
        StorySoundControlDTO storySoundControlDTO2;
        StorySoundControlDTO defaultSoundControl;
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            defaultSoundControl = StoryCommonMoleculeKt.getDefaultSoundControl();
            storySoundControlDTO2 = defaultSoundControl;
        } else {
            storySoundControlDTO2 = storySoundControlDTO;
        }
    }
}
