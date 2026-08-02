package com.vk.dto.music.audiobook;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: AudioBookPerson.kt */
/* loaded from: classes18.dex */
public final class AudioBookPerson extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioBookPerson> CREATOR = new b();
    public static final a h = new a();
    public final int b;
    public final String c;
    public final String d;
    public final Image e;
    public final List<AudioBookPersonRole> f;
    public final int g;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AudioBookPerson> {
        @Override // xsna.aay
        public final AudioBookPerson a(JSONObject jSONObject) {
            return new AudioBookPerson(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioBookPerson> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioBookPerson a(Serializer serializer) {
            return new AudioBookPerson(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioBookPerson[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioBookPerson(int i, String str, String str2, Image image, List<? extends AudioBookPersonRole> list, int i2) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = image;
        this.f = list;
        this.g = i2;
    }

    public static AudioBookPerson zb(AudioBookPerson audioBookPerson) {
        int i = audioBookPerson.b;
        String str = audioBookPerson.c;
        String str2 = audioBookPerson.d;
        Image image = audioBookPerson.e;
        List<AudioBookPersonRole> list = audioBookPerson.f;
        int i2 = audioBookPerson.g;
        audioBookPerson.getClass();
        return new AudioBookPerson(i, str, str2, image, list, i2);
    }

    public final AudioBookPersonRole Ab() {
        AudioBookPersonRole audioBookPersonRole;
        List<AudioBookPersonRole> list = this.f;
        if (list != null) {
            List<AudioBookPersonRole> list2 = list;
            boolean z = list2 instanceof Collection;
            if (!z || !list2.isEmpty()) {
                for (AudioBookPersonRole audioBookPersonRole2 : list2) {
                    audioBookPersonRole = AudioBookPersonRole.AUTHOR;
                    if (audioBookPersonRole2 == audioBookPersonRole) {
                        break;
                    }
                }
            }
            if (!z || !list2.isEmpty()) {
                for (AudioBookPersonRole audioBookPersonRole3 : list2) {
                    audioBookPersonRole = AudioBookPersonRole.NARRATOR;
                    if (audioBookPersonRole3 == audioBookPersonRole) {
                        break;
                    }
                }
            }
            audioBookPersonRole = AudioBookPersonRole.AUTHOR;
            if (audioBookPersonRole != null) {
                return audioBookPersonRole;
            }
        }
        return AudioBookPersonRole.AUTHOR;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.h0(this.f);
        serializer.S(this.g);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new com.vk.voip.ui.menu.feature.a(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookPerson)) {
            return false;
        }
        AudioBookPerson audioBookPerson = (AudioBookPerson) obj;
        return this.b == audioBookPerson.b && epx.f(this.c, audioBookPerson.c) && epx.f(this.d, audioBookPerson.d) && epx.f(this.e, audioBookPerson.e) && epx.f(this.f, audioBookPerson.f) && this.g == audioBookPerson.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.e;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        List<AudioBookPersonRole> list = this.f;
        return Integer.hashCode(this.g) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookPerson(id=");
        sb.append(this.b);
        sb.append(", name=");
        return ho8.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookPerson(JSONObject jSONObject) {
        this(r2, r3, r4, r1, r5, jSONObject.optInt("flags_context"));
        Image image;
        Object obj;
        int optInt = jSONObject.optInt("id");
        String optString = jSONObject.optString("name");
        String optString2 = jSONObject.optString("description");
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (jSONObject.has("photo")) {
            image = new Image(jSONObject.getJSONArray("photo"), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
        } else {
            image = null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_ROLES);
        if (optJSONArray != null) {
            ArrayList<AudioBookPersonRole> arrayList2 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                Iterator<E> it = AudioBookPersonRole.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f(((AudioBookPersonRole) obj).i(), string)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                arrayList2.add((AudioBookPersonRole) obj);
            }
            arrayList = new ArrayList();
            for (AudioBookPersonRole audioBookPersonRole : arrayList2) {
                if (audioBookPersonRole != null) {
                    arrayList.add(audioBookPersonRole);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioBookPerson(Serializer serializer) {
        this(r1, r0, r3 == null ? "" : r3, (Image) serializer.G(Image.class.getClassLoader()), serializer.D(), serializer.u());
        int u = serializer.u();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
