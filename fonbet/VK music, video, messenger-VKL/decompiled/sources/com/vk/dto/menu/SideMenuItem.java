package com.vk.dto.menu;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: SideMenuItem.kt */
/* loaded from: classes18.dex */
public final class SideMenuItem extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<SideMenuItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Action f;
    public final AdditionalInfo g;

    /* compiled from: SideMenuItem.kt */
    public static final class AdditionalInfo extends Serializer.StreamParcelableAdapter implements bxx {
        public static final Serializer.c<AdditionalInfo> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<AdditionalInfo> {
            @Override // com.vk.core.serialize.Serializer.c
            public final AdditionalInfo a(Serializer serializer) {
                return new AdditionalInfo(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInfo[i];
            }
        }

        public AdditionalInfo(String str) {
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
            return (obj instanceof AdditionalInfo) && epx.f(this.b, ((AdditionalInfo) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AdditionalInfo(text="), this.b, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SideMenuItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SideMenuItem a(Serializer serializer) {
            return new SideMenuItem(serializer.H(), serializer.H(), serializer.H(), serializer.H(), (Action) serializer.G(Action.class.getClassLoader()), (AdditionalInfo) serializer.G(AdditionalInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SideMenuItem[i];
        }
    }

    public SideMenuItem(String str, String str2, String str3, String str4, Action action, AdditionalInfo additionalInfo) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = action;
        this.g = additionalInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b);
        jSONObject.put("icon", this.c);
        jSONObject.put("title", this.d);
        jSONObject.put("subtitle", this.e);
        Action action = this.f;
        jSONObject.put("action", action != null ? action.e5() : null);
        AdditionalInfo additionalInfo = this.g;
        jSONObject.put("additional_info", additionalInfo != null ? additionalInfo.e5() : null);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SideMenuItem)) {
            return false;
        }
        SideMenuItem sideMenuItem = (SideMenuItem) obj;
        return epx.f(this.b, sideMenuItem.b) && epx.f(this.c, sideMenuItem.c) && epx.f(this.d, sideMenuItem.d) && epx.f(this.e, sideMenuItem.e) && epx.f(this.f, sideMenuItem.f) && epx.f(this.g, sideMenuItem.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.f;
        int hashCode2 = (hashCode + (action == null ? 0 : action.hashCode())) * 31;
        AdditionalInfo additionalInfo = this.g;
        return hashCode2 + (additionalInfo != null ? additionalInfo.hashCode() : 0);
    }

    public final String toString() {
        return "SideMenuItem(id=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", action=" + this.f + ", additionalInfo=" + this.g + ')';
    }
}
