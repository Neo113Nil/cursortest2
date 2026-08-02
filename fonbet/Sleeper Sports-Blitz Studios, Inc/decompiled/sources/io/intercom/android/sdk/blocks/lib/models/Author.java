package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public class Author implements Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new Parcelable.Creator<Author>() { // from class: io.intercom.android.sdk.blocks.lib.models.Author.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author createFromParcel(Parcel parcel) {
            return new Author(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author[] newArray(int i) {
            return new Author[i];
        }
    };
    private final String avatar;
    private final String firstName;
    private final String lastName;
    private final String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Author() {
        this(new Builder());
    }

    private Author(Builder builder) {
        this.name = builder.name == null ? "" : builder.name;
        this.avatar = builder.avatar == null ? "" : builder.avatar;
        this.firstName = builder.firstName == null ? "" : builder.firstName;
        this.lastName = builder.lastName != null ? builder.lastName : "";
    }

    public String getName() {
        return this.name;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public static final class Builder {
        String avatar;
        String firstName;
        String lastName;
        String name;

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withAvatar(String str) {
            this.avatar = str;
            return this;
        }

        public Builder withFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder withLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Author build() {
            return new Author(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Author author = (Author) obj;
            String str = this.name;
            if (str == null ? author.name != null : !str.equals(author.name)) {
                return false;
            }
            String str2 = this.firstName;
            if (str2 == null ? author.firstName != null : !str2.equals(author.firstName)) {
                return false;
            }
            String str3 = this.lastName;
            if (str3 == null ? author.lastName != null : !str3.equals(author.lastName)) {
                return false;
            }
            String str4 = this.avatar;
            String str5 = author.avatar;
            if (str4 == null ? str5 == null : str4.equals(str5)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.avatar;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    protected Author(Parcel parcel) {
        this.name = parcel.readString();
        this.avatar = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }
}
