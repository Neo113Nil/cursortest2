package com.vk.dto.market;

import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.s3q0;
import xsna.urd0;

/* compiled from: CharacteristicsItem.kt */
/* loaded from: classes18.dex */
public final class CharacteristicsItem extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<CharacteristicsItem> CREATOR = new c();
    public static final b e = new b();
    public final int b;
    public final String c;
    public final List<Value> d;

    /* compiled from: CharacteristicsItem.kt */
    public static final class Value extends Serializer.StreamParcelableAdapter implements bxx {
        public static final Serializer.c<Value> CREATOR;
        public static final b c;
        public final String b;

        /* compiled from: CharacteristicsItem.kt */
        public static final class a {
        }

        /* compiled from: JsonParser.kt */
        public static final class b extends aay<Value> {
            public final /* synthetic */ a a;

            public b(a aVar) {
                this.a = aVar;
            }

            @Override // xsna.aay
            public final Value a(JSONObject jSONObject) {
                this.a.getClass();
                return new Value(jSONObject.optString("text"));
            }
        }

        /* compiled from: Serializer.kt */
        public static final class c extends Serializer.c<Value> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Value a(Serializer serializer) {
                return new Value(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Value[i];
            }
        }

        static {
            a aVar = new a();
            CREATOR = new c();
            c = new b(aVar);
        }

        public Value(String str) {
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", this.b);
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && epx.f(this.b, ((Value) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Value(text="), this.b, ')');
        }
    }

    /* compiled from: CharacteristicsItem.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<CharacteristicsItem> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        @Override // xsna.aay
        public final CharacteristicsItem a(JSONObject jSONObject) {
            ?? r5;
            int i = jSONObject.getInt("id");
            String string = jSONObject.getString("name");
            Value.b bVar = Value.c;
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                r5 = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        try {
                            r5.add(bVar.a(optJSONObject));
                        } catch (Exception e) {
                            L.i(e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
            } else {
                r5 = 0;
            }
            if (r5 == 0) {
                r5 = EmptyList.b;
            }
            return new CharacteristicsItem(i, string, r5);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<CharacteristicsItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CharacteristicsItem a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List j = serializer.j(Value.CREATOR);
            if (j == null) {
                j = EmptyList.b;
            }
            return new CharacteristicsItem(u, H, j);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CharacteristicsItem[i];
        }
    }

    public CharacteristicsItem(int i, String str, List<Value> list) {
        this.b = i;
        this.c = str;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.o0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b);
        jSONObject.put("name", this.c);
        jSONObject.put("values", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CharacteristicsItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        CharacteristicsItem characteristicsItem = (CharacteristicsItem) obj;
        return this.b == characteristicsItem.b && epx.f(this.c, characteristicsItem.c) && epx.f(this.d, characteristicsItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharacteristicsItem(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", values=");
        return ms9.a(')', sb, this.d);
    }
}
