package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: ButtonActionModalPage.kt */
/* loaded from: classes18.dex */
public final class ClassifiedsWorkiContact extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClassifiedsWorkiContact> CREATOR;
    public final String b;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClassifiedsWorkiContact> {
        @Override // xsna.aay
        public final ClassifiedsWorkiContact a(JSONObject jSONObject) {
            return new ClassifiedsWorkiContact(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClassifiedsWorkiContact> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClassifiedsWorkiContact a(Serializer serializer) {
            return new ClassifiedsWorkiContact(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClassifiedsWorkiContact[i];
        }
    }

    static {
        new a();
        CREATOR = new b();
    }

    public ClassifiedsWorkiContact(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassifiedsWorkiContact) && epx.f(this.b, ((ClassifiedsWorkiContact) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ClassifiedsWorkiContact(vacancyId="), this.b, ')');
    }

    public ClassifiedsWorkiContact(JSONObject jSONObject) {
        this(jSONObject.getString("vacancy_id"));
    }

    public ClassifiedsWorkiContact(Serializer serializer) {
        this(serializer.H());
    }
}
