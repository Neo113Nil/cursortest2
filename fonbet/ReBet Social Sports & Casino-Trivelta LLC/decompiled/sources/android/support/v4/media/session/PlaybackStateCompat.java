package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f16303a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16304b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16305c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16306d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16308f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f16309g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16310h;

    /* renamed from: i, reason: collision with root package name */
    public List f16311i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16312j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f16313k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f16314a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f16315b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16316c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f16317d;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f16314a = parcel.readString();
            this.f16315b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f16316c = parcel.readInt();
            this.f16317d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f16315b) + ", mIcon=" + this.f16316c + ", mExtras=" + this.f16317d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f16314a);
            TextUtils.writeToParcel(this.f16315b, parcel, i10);
            parcel.writeInt(this.f16316c);
            parcel.writeBundle(this.f16317d);
        }
    }

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f16303a = parcel.readInt();
        this.f16304b = parcel.readLong();
        this.f16306d = parcel.readFloat();
        this.f16310h = parcel.readLong();
        this.f16305c = parcel.readLong();
        this.f16307e = parcel.readLong();
        this.f16309g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f16311i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f16312j = parcel.readLong();
        this.f16313k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f16308f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f16303a + ", position=" + this.f16304b + ", buffered position=" + this.f16305c + ", speed=" + this.f16306d + ", updated=" + this.f16310h + ", actions=" + this.f16307e + ", error code=" + this.f16308f + ", error message=" + this.f16309g + ", custom actions=" + this.f16311i + ", active item id=" + this.f16312j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16303a);
        parcel.writeLong(this.f16304b);
        parcel.writeFloat(this.f16306d);
        parcel.writeLong(this.f16310h);
        parcel.writeLong(this.f16305c);
        parcel.writeLong(this.f16307e);
        TextUtils.writeToParcel(this.f16309g, parcel, i10);
        parcel.writeTypedList(this.f16311i);
        parcel.writeLong(this.f16312j);
        parcel.writeBundle(this.f16313k);
        parcel.writeInt(this.f16308f);
    }
}
