package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ButtonActionModalPage.kt */
/* loaded from: classes18.dex */
public final class ButtonActionModalPage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ButtonActionModalPage> CREATOR;
    public final Type b;
    public final ClassifiedsWorkiContact c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonActionModalPage.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type WORKI_CONTACT;
        private final String value = "worki_contact";

        /* compiled from: ButtonActionModalPage.kt */
        public static final class a {
        }

        static {
            Type type = new Type();
            WORKI_CONTACT = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ButtonActionModalPage> {
        @Override // xsna.aay
        public final ButtonActionModalPage a(JSONObject jSONObject) {
            return new ButtonActionModalPage(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ButtonActionModalPage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ButtonActionModalPage a(Serializer serializer) {
            return new ButtonActionModalPage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ButtonActionModalPage[i];
        }
    }

    static {
        new a();
        CREATOR = new b();
    }

    public /* synthetic */ ButtonActionModalPage(Type type, ClassifiedsWorkiContact classifiedsWorkiContact, String str, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : classifiedsWorkiContact, (i & 4) != 0 ? null : str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Type type = this.b;
        serializer.j0(type != null ? type.h() : null);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonActionModalPage)) {
            return false;
        }
        ButtonActionModalPage buttonActionModalPage = (ButtonActionModalPage) obj;
        return this.b == buttonActionModalPage.b && epx.f(this.c, buttonActionModalPage.c) && epx.f(this.d, buttonActionModalPage.d);
    }

    public final int hashCode() {
        Type type = this.b;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        ClassifiedsWorkiContact classifiedsWorkiContact = this.c;
        int hashCode2 = (hashCode + (classifiedsWorkiContact == null ? 0 : classifiedsWorkiContact.b.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonActionModalPage(type=");
        sb.append(this.b);
        sb.append(", workiContact=");
        sb.append(this.c);
        sb.append(", trackCode=");
        return ho8.a(sb, this.d, ')');
    }

    public ButtonActionModalPage(Type type, ClassifiedsWorkiContact classifiedsWorkiContact, String str) {
        this.b = type;
        this.c = classifiedsWorkiContact;
        this.d = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ButtonActionModalPage(JSONObject jSONObject) {
        this(r4, new ClassifiedsWorkiContact(jSONObject.getJSONObject("worki_contact")), f370.D(jSONObject, "track_code"));
        Type type;
        Type.a aVar = Type.Companion;
        String string = jSONObject.getString("type");
        aVar.getClass();
        Type[] values = Type.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                type = null;
                break;
            }
            type = values[i];
            if (epx.f(type.h(), string)) {
                break;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ButtonActionModalPage(Serializer serializer) {
        this(r1, (ClassifiedsWorkiContact) serializer.G(ClassifiedsWorkiContact.class.getClassLoader()), serializer.H());
        String H = serializer.H();
        Type type = null;
        if (H != null) {
            Type.Companion.getClass();
            Type[] values = Type.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Type type2 = values[i];
                if (epx.f(type2.h(), H)) {
                    type = type2;
                    break;
                }
                i++;
            }
        }
    }
}
