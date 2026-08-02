package com.vk.im.engine.models.dialogs;

import com.vk.core.serialize.Serializer;
import java.util.Set;
import xsna.epx;
import xsna.ho8;
import xsna.rl3;
import xsna.zcl;

/* compiled from: ChatSettings.kt */
/* loaded from: classes2.dex */
public final class ChatPermissions extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public static final Set<String> j = rl3.y0(new String[]{"owner", "owner_and_admins", "all"});
    public static final Set<String> k = rl3.y0(new String[]{"owner", "owner_and_admins"});
    public static final Set<String> l = rl3.y0(new String[]{"owner_and_admins", "all"});
    public static final Serializer.c<ChatPermissions> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChatPermissions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChatPermissions a(Serializer serializer) {
            return new ChatPermissions(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatPermissions[i];
        }
    }

    public ChatPermissions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatPermissions)) {
            return false;
        }
        ChatPermissions chatPermissions = (ChatPermissions) obj;
        return epx.f(this.b, chatPermissions.b) && epx.f(this.c, chatPermissions.c) && epx.f(this.d, chatPermissions.d) && epx.f(this.e, chatPermissions.e) && epx.f(this.f, chatPermissions.f) && epx.f(this.g, chatPermissions.g) && epx.f(this.h, chatPermissions.h) && epx.f(this.i, chatPermissions.i);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatPermissions(whoCanInvite=");
        sb.append(this.b);
        sb.append(", whoCanChangeInfo=");
        sb.append(this.c);
        sb.append(", whoCanChangePin=");
        sb.append(this.d);
        sb.append(", whoCanUseMassMentions=");
        sb.append(this.e);
        sb.append(", whoCanSeeInviteLink=");
        sb.append(this.f);
        sb.append(", whoCanCall=");
        sb.append(this.g);
        sb.append(", whoCanChangeAdmins=");
        sb.append(this.h);
        sb.append(", whoCanChangeTheme=");
        return ho8.a(sb, this.i, ')');
    }

    public ChatPermissions(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
