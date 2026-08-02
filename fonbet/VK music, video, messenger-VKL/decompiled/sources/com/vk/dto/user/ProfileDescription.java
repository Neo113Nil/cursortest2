package com.vk.dto.user;

import android.os.Parcel;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.cqm0;
import xsna.zrp;

/* compiled from: ProfileDescription.kt */
/* loaded from: classes18.dex */
public final class ProfileDescription implements Serializer.StreamParcelable {
    public static final Serializer.c<ProfileDescription> CREATOR = new b();
    public final Type b;
    public final Icon c;
    public final List<Image> d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileDescription.kt */
    public static final class Icon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        public static final Icon EDUCATION;

        static {
            Icon icon = new Icon("EDUCATION", 0);
            EDUCATION = icon;
            Icon[] iconArr = {icon};
            $VALUES = iconArr;
            $ENTRIES = new asp(iconArr);
        }

        public Icon() {
            throw null;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileDescription.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ICON;
        public static final Type IMAGES;
        public static final Type TEXT;

        static {
            Type type = new Type(NativeAdContent.ViewTag.AD_ICON, 0);
            ICON = type;
            Type type2 = new Type("IMAGES", 1);
            IMAGES = type2;
            Type type3 = new Type("TEXT", 2);
            TEXT = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: ProfileDescription.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static ProfileDescription a(Object obj) {
            ArrayList arrayList;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (!(obj instanceof JSONObject)) {
                if (obj instanceof String) {
                    return new ProfileDescription((String) obj);
                }
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("images")) {
                arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("images");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(new Image(optJSONArray.getJSONArray(i), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
                    }
                }
            } else {
                arrayList = null;
            }
            String string = jSONObject.getString("content_type");
            Locale locale = Locale.ROOT;
            Type valueOf = Type.valueOf(string.toUpperCase(locale));
            String a = cqm0.a(jSONObject.optString("icon"));
            return new ProfileDescription(valueOf, a != null ? Icon.valueOf(a.toUpperCase(locale)) : null, arrayList, cqm0.a(jSONObject.optString("text")));
        }

        public static ArrayList b(JSONArray jSONArray) {
            ProfileDescription a;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object opt = jSONArray.opt(i);
                if (opt != null && (a = a(opt)) != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ProfileDescription> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfileDescription a(Serializer serializer) {
            Type type = (Type) serializer.C();
            if (type == null) {
                type = Type.TEXT;
            }
            return new ProfileDescription(type, (Icon) serializer.C(), serializer.k(Image.class), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfileDescription[i];
        }
    }

    public ProfileDescription(Type type, Icon icon, List<Image> list, String str) {
        this.b = type;
        this.c = icon;
        this.d = list;
        this.e = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.g0(this.c);
        serializer.W(this.d);
        serializer.j0(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ProfileDescription(String str) {
        this(Type.TEXT, null, null, str);
    }
}
