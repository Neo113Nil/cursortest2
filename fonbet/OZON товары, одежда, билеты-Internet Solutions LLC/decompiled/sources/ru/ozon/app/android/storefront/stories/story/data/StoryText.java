package ru.ozon.app.android.storefront.stories.story.data;

import B90.C2619v;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/StoryText;", "Landroid/os/Parcelable;", "backgroundColor", "", "align", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/Alignment;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getBackgroundColor", "()Ljava/lang/String;", "getAlign", "()Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryText implements Parcelable {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    public static final Parcelable.Creator<StoryText> CREATOR = new Creator();
    private final Alignment align;
    private final String backgroundColor;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryText> {
        @Override // android.os.Parcelable.Creator
        public final StoryText createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoryText(parcel.readString(), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), (TextAtom) parcel.readParcelable(StoryText.class.getClassLoader()), (TextAtom) parcel.readParcelable(StoryText.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoryText[] newArray(int i11) {
            return new StoryText[i11];
        }
    }

    public StoryText(String str, Alignment alignment, @NotNull TextAtom title, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.backgroundColor = str;
        this.align = alignment;
        this.title = title;
        this.subtitle = textAtom;
    }

    public static /* synthetic */ StoryText copy$default(StoryText storyText, String str, Alignment alignment, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storyText.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            alignment = storyText.align;
        }
        if ((i11 & 4) != 0) {
            textAtom = storyText.title;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = storyText.subtitle;
        }
        return storyText.copy(str, alignment, textAtom, textAtom2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Alignment getAlign() {
        return this.align;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final StoryText copy(String backgroundColor, Alignment align, @NotNull TextAtom title, TextAtom subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new StoryText(backgroundColor, align, title, subtitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryText)) {
            return false;
        }
        StoryText storyText = (StoryText) other;
        return Intrinsics.d(this.backgroundColor, storyText.backgroundColor) && this.align == storyText.align && Intrinsics.d(this.title, storyText.title) && Intrinsics.d(this.subtitle, storyText.subtitle);
    }

    public final Alignment getAlign() {
        return this.align;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Alignment alignment = this.align;
        int b11 = C2619v.b((hashCode + (alignment == null ? 0 : alignment.hashCode())) * 31, 31, this.title);
        TextAtom textAtom = this.subtitle;
        return b11 + (textAtom != null ? textAtom.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StoryText(backgroundColor=" + this.backgroundColor + ", align=" + this.align + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.backgroundColor);
        Alignment alignment = this.align;
        if (alignment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(alignment.name());
        }
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.subtitle, flags);
    }
}
