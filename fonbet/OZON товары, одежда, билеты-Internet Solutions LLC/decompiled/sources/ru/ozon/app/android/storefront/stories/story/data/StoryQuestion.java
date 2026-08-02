package ru.ozon.app.android.storefront.stories.story.data;

import B90.C2616s;
import Bi.b;
import C.J;
import C.o0;
import De.C2859b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u008d\u0001\u0010-\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0004HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018¨\u0006;"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryQuestion;", "Landroid/os/Parcelable;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "backgroundColor", "image", "Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;", "tagTitle", "text", "Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "direction", "Lru/ozon/app/android/storefront/stories/story/data/Direction;", "answers", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "buttons", "next", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/StoryText;Lru/ozon/app/android/storefront/stories/story/data/Direction;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getTrackingInfo", "()Ljava/util/Map;", "getBackgroundColor", "()Ljava/lang/String;", "getImage", "()Lru/ozon/app/android/storefront/stories/story/data/StoryWithImage;", "getTagTitle", "getText", "()Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "getDirection", "()Lru/ozon/app/android/storefront/stories/story/data/Direction;", "getAnswers", "()Ljava/util/List;", "getButtons", "getNext", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryQuestion implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StoryQuestion> CREATOR = new Creator();
    private final List<ButtonV3Atom.LargeButton> answers;
    private final String backgroundColor;
    private final List<ButtonV3Atom.LargeButton> buttons;
    private final Direction direction;
    private final StoryWithImage image;
    private final String next;
    private final String tagTitle;
    private final StoryText text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryQuestion> {
        @Override // android.os.Parcelable.Creator
        public final StoryQuestion createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = C2859b.a(StoryQuestion.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            String readString = parcel.readString();
            StoryWithImage createFromParcel = parcel.readInt() == 0 ? null : StoryWithImage.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            StoryText createFromParcel2 = parcel.readInt() == 0 ? null : StoryText.CREATOR.createFromParcel(parcel);
            Direction valueOf = parcel.readInt() == 0 ? null : Direction.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i13 = 0;
                while (i13 != readInt2) {
                    i13 = b.a(StoryQuestion.class, parcel, arrayList3, i13, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i11 != readInt3) {
                    i11 = b.a(StoryQuestion.class, parcel, arrayList2, i11, 1);
                }
            }
            return new StoryQuestion(linkedHashMap, readString, createFromParcel, readString2, createFromParcel2, valueOf, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryQuestion[] newArray(int i11) {
            return new StoryQuestion[i11];
        }
    }

    public StoryQuestion(Map<String, TokenizedTrackingInfo> map, String str, StoryWithImage storyWithImage, String str2, StoryText storyText, Direction direction, List<ButtonV3Atom.LargeButton> list, List<ButtonV3Atom.LargeButton> list2, String str3) {
        this.trackingInfo = map;
        this.backgroundColor = str;
        this.image = storyWithImage;
        this.tagTitle = str2;
        this.text = storyText;
        this.direction = direction;
        this.answers = list;
        this.buttons = list2;
        this.next = str3;
    }

    public static /* synthetic */ StoryQuestion copy$default(StoryQuestion storyQuestion, Map map, String str, StoryWithImage storyWithImage, String str2, StoryText storyText, Direction direction, List list, List list2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = storyQuestion.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            str = storyQuestion.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            storyWithImage = storyQuestion.image;
        }
        if ((i11 & 8) != 0) {
            str2 = storyQuestion.tagTitle;
        }
        if ((i11 & 16) != 0) {
            storyText = storyQuestion.text;
        }
        if ((i11 & 32) != 0) {
            direction = storyQuestion.direction;
        }
        if ((i11 & 64) != 0) {
            list = storyQuestion.answers;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list2 = storyQuestion.buttons;
        }
        if ((i11 & 256) != 0) {
            str3 = storyQuestion.next;
        }
        List list3 = list2;
        String str4 = str3;
        Direction direction2 = direction;
        List list4 = list;
        StoryText storyText2 = storyText;
        StoryWithImage storyWithImage2 = storyWithImage;
        return storyQuestion.copy(map, str, storyWithImage2, str2, storyText2, direction2, list4, list3, str4);
    }

    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final StoryWithImage getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTagTitle() {
        return this.tagTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final StoryText getText() {
        return this.text;
    }

    /* renamed from: component6, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    public final List<ButtonV3Atom.LargeButton> component7() {
        return this.answers;
    }

    public final List<ButtonV3Atom.LargeButton> component8() {
        return this.buttons;
    }

    /* renamed from: component9, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    @NotNull
    public final StoryQuestion copy(Map<String, TokenizedTrackingInfo> trackingInfo, String backgroundColor, StoryWithImage image, String tagTitle, StoryText text, Direction direction, List<ButtonV3Atom.LargeButton> answers, List<ButtonV3Atom.LargeButton> buttons, String next) {
        return new StoryQuestion(trackingInfo, backgroundColor, image, tagTitle, text, direction, answers, buttons, next);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryQuestion)) {
            return false;
        }
        StoryQuestion storyQuestion = (StoryQuestion) other;
        return Intrinsics.d(this.trackingInfo, storyQuestion.trackingInfo) && Intrinsics.d(this.backgroundColor, storyQuestion.backgroundColor) && Intrinsics.d(this.image, storyQuestion.image) && Intrinsics.d(this.tagTitle, storyQuestion.tagTitle) && Intrinsics.d(this.text, storyQuestion.text) && this.direction == storyQuestion.direction && Intrinsics.d(this.answers, storyQuestion.answers) && Intrinsics.d(this.buttons, storyQuestion.buttons) && Intrinsics.d(this.next, storyQuestion.next);
    }

    public final List<ButtonV3Atom.LargeButton> getAnswers() {
        return this.answers;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonV3Atom.LargeButton> getButtons() {
        return this.buttons;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final StoryWithImage getImage() {
        return this.image;
    }

    public final String getNext() {
        return this.next;
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
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StoryWithImage storyWithImage = this.image;
        int hashCode3 = (hashCode2 + (storyWithImage == null ? 0 : storyWithImage.hashCode())) * 31;
        String str2 = this.tagTitle;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoryText storyText = this.text;
        int hashCode5 = (hashCode4 + (storyText == null ? 0 : storyText.hashCode())) * 31;
        Direction direction = this.direction;
        int hashCode6 = (hashCode5 + (direction == null ? 0 : direction.hashCode())) * 31;
        List<ButtonV3Atom.LargeButton> list = this.answers;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<ButtonV3Atom.LargeButton> list2 = this.buttons;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.next;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str = this.backgroundColor;
        StoryWithImage storyWithImage = this.image;
        String str2 = this.tagTitle;
        StoryText storyText = this.text;
        Direction direction = this.direction;
        List<ButtonV3Atom.LargeButton> list = this.answers;
        List<ButtonV3Atom.LargeButton> list2 = this.buttons;
        String str3 = this.next;
        StringBuilder sb2 = new StringBuilder("StoryQuestion(trackingInfo=");
        sb2.append(map);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", image=");
        sb2.append(storyWithImage);
        sb2.append(", tagTitle=");
        sb2.append(str2);
        sb2.append(", text=");
        sb2.append(storyText);
        sb2.append(", direction=");
        sb2.append(direction);
        sb2.append(", answers=");
        C2616s.g(", buttons=", ", next=", sb2, list, list2);
        return o0.c(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
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
        StoryWithImage storyWithImage = this.image;
        if (storyWithImage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storyWithImage.writeToParcel(dest, flags);
        }
        dest.writeString(this.tagTitle);
        StoryText storyText = this.text;
        if (storyText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storyText.writeToParcel(dest, flags);
        }
        Direction direction = this.direction;
        if (direction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(direction.name());
        }
        List<ButtonV3Atom.LargeButton> list = this.answers;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), flags);
            }
        }
        List<ButtonV3Atom.LargeButton> list2 = this.buttons;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                dest.writeParcelable((Parcelable) c12.next(), flags);
            }
        }
        dest.writeString(this.next);
    }
}
