package ru.ozon.app.android.storefront.stories.story.data;

import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryWithPoll;", "Lru/ozon/app/android/storefront/stories/story/data/StoryType;", "Landroid/os/Parcelable;", "root", "", "questions", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryQuestion;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getRoot", "()Ljava/lang/String;", "getQuestions", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryWithPoll extends StoryType implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<StoryWithPoll> CREATOR = new Creator();

    @NotNull
    private final Map<String, StoryQuestion> questions;

    @NotNull
    private final String root;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryWithPoll> {
        @Override // android.os.Parcelable.Creator
        public final StoryWithPoll createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashMap.put(parcel.readString(), StoryQuestion.CREATOR.createFromParcel(parcel));
            }
            return new StoryWithPoll(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryWithPoll[] newArray(int i11) {
            return new StoryWithPoll[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryWithPoll(@NotNull String root, @NotNull Map<String, StoryQuestion> questions) {
        super(null);
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.root = root;
        this.questions = questions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryWithPoll copy$default(StoryWithPoll storyWithPoll, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storyWithPoll.root;
        }
        if ((i11 & 2) != 0) {
            map = storyWithPoll.questions;
        }
        return storyWithPoll.copy(str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRoot() {
        return this.root;
    }

    @NotNull
    public final Map<String, StoryQuestion> component2() {
        return this.questions;
    }

    @NotNull
    public final StoryWithPoll copy(@NotNull String root, @NotNull Map<String, StoryQuestion> questions) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new StoryWithPoll(root, questions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryWithPoll)) {
            return false;
        }
        StoryWithPoll storyWithPoll = (StoryWithPoll) other;
        return Intrinsics.d(this.root, storyWithPoll.root) && Intrinsics.d(this.questions, storyWithPoll.questions);
    }

    @NotNull
    public final Map<String, StoryQuestion> getQuestions() {
        return this.questions;
    }

    @NotNull
    public final String getRoot() {
        return this.root;
    }

    public int hashCode() {
        return this.questions.hashCode() + (this.root.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("StoryWithPoll(root=", this.root, ", questions=", ")", this.questions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.root);
        Map<String, StoryQuestion> map = this.questions;
        dest.writeInt(map.size());
        for (Map.Entry<String, StoryQuestion> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            entry.getValue().writeToParcel(dest, flags);
        }
    }
}
