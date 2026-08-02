package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* compiled from: UiBlocks.kt */
/* loaded from: classes6.dex */
public final class BadgeBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final Type b;
    public final String c;
    public final HorizontalAlignment d;

    /* compiled from: UiBlocks.kt */
    public static abstract class Type implements Parcelable {

        /* compiled from: UiBlocks.kt */
        public static final class Image extends Type implements Parcelable {
            public static final a CREATOR = new a();
            public final WebImage b;

            /* compiled from: UiBlocks.kt */
            public static final class a implements Parcelable.Creator<Image> {
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    return new Image(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i) {
                    return new Image[i];
                }
            }

            public Image(WebImage webImage) {
                super(null);
                this.b = webImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Image) && epx.f(this.b, ((Image) obj).b);
            }

            public final int hashCode() {
                return this.b.b.hashCode();
            }

            public final String toString() {
                return "Image(value=" + this.b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
            }

            public Image(Parcel parcel) {
                this((WebImage) parcel.readParcelable(WebImage.class.getClassLoader()));
            }
        }

        public /* synthetic */ Type(zcl zclVar) {
            this();
        }

        public Type() {
        }

        /* compiled from: UiBlocks.kt */
        public static final class Discount extends Type implements Parcelable {
            public static final a CREATOR = new a();

            /* compiled from: UiBlocks.kt */
            public static final class a implements Parcelable.Creator<Discount> {
                @Override // android.os.Parcelable.Creator
                public final Discount createFromParcel(Parcel parcel) {
                    return new Discount();
                }

                @Override // android.os.Parcelable.Creator
                public final Discount[] newArray(int i) {
                    return new Discount[i];
                }
            }

            public Discount() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
            }
        }

        /* compiled from: UiBlocks.kt */
        public static final class New extends Type implements Parcelable {
            public static final a CREATOR = new a();

            /* compiled from: UiBlocks.kt */
            public static final class a implements Parcelable.Creator<New> {
                @Override // android.os.Parcelable.Creator
                public final New createFromParcel(Parcel parcel) {
                    return new New();
                }

                @Override // android.os.Parcelable.Creator
                public final New[] newArray(int i) {
                    return new New[i];
                }
            }

            public New() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
            }
        }
    }

    /* compiled from: UiBlocks.kt */
    public static final class a implements Parcelable.Creator<BadgeBlock> {
        /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static BadgeBlock a(JSONObject jSONObject, HorizontalAlignment horizontalAlignment) {
            Type type;
            String string = jSONObject.getString("type");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != 108960) {
                    if (hashCode != 100313435) {
                        if (hashCode == 273184065 && string.equals("discount")) {
                            type = new Type.Discount();
                        }
                    } else if (string.equals("image")) {
                        WebImage.a aVar = WebImage.CREATOR;
                        JSONArray optJSONArray = jSONObject.optJSONArray("images");
                        aVar.getClass();
                        WebImage a = WebImage.a.a(optJSONArray);
                        if (!a.b.isEmpty()) {
                            type = new Type.Image(a);
                        }
                    }
                } else if (string.equals("new")) {
                    type = new Type.New();
                }
                String optString = jSONObject.optString("value");
                if (type == null) {
                    return new BadgeBlock(type, optString, horizontalAlignment);
                }
                return null;
            }
            type = null;
            String optString2 = jSONObject.optString("value");
            if (type == null) {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBlock createFromParcel(Parcel parcel) {
            return new BadgeBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBlock[] newArray(int i) {
            return new BadgeBlock[i];
        }
    }

    public BadgeBlock(Type type, String str, HorizontalAlignment horizontalAlignment) {
        this.b = type;
        this.c = str;
        this.d = horizontalAlignment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
    }

    public BadgeBlock(Parcel parcel) {
        this((Type) parcel.readParcelable(Type.class.getClassLoader()), parcel.readString(), HorizontalAlignment.valueOf(parcel.readString()));
    }
}
