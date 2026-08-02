package com.vk.dto.nft;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: NftOrigin.kt */
/* loaded from: classes18.dex */
public final class NftOrigin extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NftOrigin> CREATOR = new b();
    public final Type b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final Boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NftOrigin.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type COLLECTION;
        public static final Type CREATOR;
        public static final Type OWNER;
        public static final Type TITLE;

        static {
            Type type = new Type(NativeAdContent.ViewTag.AD_TITLE, 0);
            TITLE = type;
            Type type2 = new Type("OWNER", 1);
            OWNER = type2;
            Type type3 = new Type(SignalingProtocol.KEY_ROLE_CREATOR, 2);
            CREATOR = type3;
            Type type4 = new Type("COLLECTION", 3);
            COLLECTION = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    /* compiled from: NftOrigin.kt */
    public static final class a {
        public static ArrayList a(JSONObject jSONObject) {
            Type type;
            JSONArray optJSONArray = jSONObject.optJSONArray("origins");
            if (optJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String string = jSONObject2.getString("origin_type");
                int hashCode = string.hashCode();
                if (hashCode == -1741312354) {
                    if (string.equals("collection")) {
                        type = Type.COLLECTION;
                    }
                    type = Type.TITLE;
                } else if (hashCode != 106164915) {
                    if (hashCode == 1028554796 && string.equals("creator")) {
                        type = Type.CREATOR;
                    }
                    type = Type.TITLE;
                } else {
                    if (string.equals("owner")) {
                        type = Type.OWNER;
                    }
                    type = Type.TITLE;
                }
                String optString = jSONObject2.optString("name");
                String optString2 = jSONObject2.optString("type_name");
                long optLong = jSONObject2.optLong("vk_user_id", 0L);
                arrayList.add(new NftOrigin(type, optString, optString2, optLong != 0 ? Long.valueOf(optLong) : null, jSONObject2.optString("image"), Boolean.valueOf(jSONObject2.optBoolean("is_nft_avatar")), jSONObject2.optString("link"), jSONObject2.optBoolean("confirmed"), jSONObject2.optBoolean("is_internal")));
            }
            return arrayList;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NftOrigin> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NftOrigin a(Serializer serializer) {
            return new NftOrigin((Type) serializer.C(), serializer.H(), serializer.H(), serializer.x(), serializer.H(), serializer.n(), serializer.H(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NftOrigin[i];
        }
    }

    public NftOrigin(Type type, String str, String str2, Long l, String str3, Boolean bool, String str4, boolean z, boolean z2) {
        this.b = type;
        this.c = str;
        this.d = str2;
        this.e = l;
        this.f = str3;
        this.g = bool;
        this.h = str4;
        this.i = z;
        this.j = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.b0(this.e);
        serializer.j0(this.f);
        serializer.J(this.g);
        serializer.j0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
    }
}
