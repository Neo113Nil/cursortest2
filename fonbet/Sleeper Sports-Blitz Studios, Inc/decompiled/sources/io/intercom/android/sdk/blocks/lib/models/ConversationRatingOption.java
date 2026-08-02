package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public class ConversationRatingOption implements Parcelable {
    public static final Parcelable.Creator<ConversationRatingOption> CREATOR = new Parcelable.Creator<ConversationRatingOption>() { // from class: io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption createFromParcel(Parcel parcel) {
            return new ConversationRatingOption(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption[] newArray(int i) {
            return new ConversationRatingOption[i];
        }
    };
    private final String emoji;
    private final int index;
    private final String unicode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ConversationRatingOption(Builder builder) {
        this.index = builder.index == null ? -1 : builder.index.intValue();
        this.emoji = builder.emoji == null ? "" : builder.emoji;
        this.unicode = builder.unicode != null ? builder.unicode : "";
    }

    public static final class Builder {
        String emoji;
        Integer index;
        String unicode;

        public Builder withIndex(Integer num) {
            this.index = num;
            return this;
        }

        public Builder withEmoji(String str) {
            this.emoji = str;
            return this;
        }

        public Builder withUnicode(String str) {
            this.unicode = str;
            return this;
        }

        public ConversationRatingOption build() {
            return new ConversationRatingOption(this);
        }
    }

    public Integer getIndex() {
        return Integer.valueOf(this.index);
    }

    public String getEmoji() {
        return this.emoji;
    }

    public String getUnicode() {
        return this.unicode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationRatingOption conversationRatingOption = (ConversationRatingOption) obj;
            if (this.index != conversationRatingOption.index) {
                return false;
            }
            String str = this.emoji;
            if (str == null ? conversationRatingOption.emoji != null : !str.equals(conversationRatingOption.emoji)) {
                return false;
            }
            String str2 = this.unicode;
            String str3 = conversationRatingOption.unicode;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.index * 31;
        String str = this.emoji;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.unicode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    protected ConversationRatingOption(Parcel parcel) {
        this.index = parcel.readInt();
        this.emoji = parcel.readString();
        this.unicode = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.emoji);
        parcel.writeString(this.unicode);
    }
}
