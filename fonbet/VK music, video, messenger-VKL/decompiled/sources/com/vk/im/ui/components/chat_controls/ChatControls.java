package com.vk.im.ui.components.chat_controls;

import android.util.SparseArray;
import com.ironsource.C4217a2;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: ChatControls.kt */
/* loaded from: classes2.dex */
public final class ChatControls extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ChatControls> CREATOR = new a();
    public static final SparseArray<ChatControls> n;
    public static final ChatControls o;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Boolean j;
    public String k;
    public String l;
    public String m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChatControls> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChatControls a(Serializer serializer) {
            return new ChatControls(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatControls[i];
        }
    }

    static {
        SparseArray<ChatControls> sparseArray = new SparseArray<>();
        sparseArray.put(0, new ChatControls("all", "all", "all", "all", "all", "all", "owner_and_admins", "all", null, "enabled", "enabled", C4217a2.e, 256, null));
        sparseArray.put(1, new ChatControls("owner", "owner", "owner", "owner", "owner", "owner", "owner", "owner", null, "enabled", "enabled", C4217a2.e, 256, null));
        n = sparseArray;
        o = sparseArray.get(0);
    }

    public ChatControls() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static ChatControls zb(ChatControls chatControls, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, int i) {
        if ((i & 1) != 0) {
            str = chatControls.b;
        }
        String str12 = str;
        if ((i & 2) != 0) {
            str2 = chatControls.c;
        }
        String str13 = str2;
        String str14 = (i & 4) != 0 ? chatControls.d : str3;
        String str15 = (i & 8) != 0 ? chatControls.e : str4;
        String str16 = (i & 16) != 0 ? chatControls.f : str5;
        String str17 = (i & 32) != 0 ? chatControls.g : str6;
        String str18 = (i & 64) != 0 ? chatControls.h : str7;
        String str19 = (i & 128) != 0 ? chatControls.i : str8;
        Boolean bool2 = (i & 256) != 0 ? chatControls.j : bool;
        String str20 = (i & 512) != 0 ? chatControls.k : str9;
        String str21 = (i & 1024) != 0 ? chatControls.l : str10;
        String str22 = (i & 2048) != 0 ? chatControls.m : str11;
        chatControls.getClass();
        return new ChatControls(str12, str13, str14, str15, str16, str17, str18, str19, bool2, str20, str21, str22);
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
        serializer.J(this.j);
        serializer.m0(this.k);
        serializer.m0(this.l);
        serializer.m0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatControls)) {
            return false;
        }
        ChatControls chatControls = (ChatControls) obj;
        return epx.f(this.b, chatControls.b) && epx.f(this.c, chatControls.c) && epx.f(this.d, chatControls.d) && epx.f(this.e, chatControls.e) && epx.f(this.f, chatControls.f) && epx.f(this.g, chatControls.g) && epx.f(this.h, chatControls.h) && epx.f(this.i, chatControls.i) && epx.f(this.j, chatControls.j) && epx.f(this.k, chatControls.k) && epx.f(this.l, chatControls.l) && epx.f(this.m, chatControls.m);
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
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.k;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.l;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.m;
        return hashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatControls(whoCanInvite=");
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
        sb.append(this.i);
        sb.append(", isService=");
        sb.append(this.j);
        sb.append(", isDisableStickersPopupAutoplay=");
        sb.append(this.k);
        sb.append(", isServiceMessagesDisabled=");
        sb.append(this.l);
        sb.append(", isMessageForwardDisabled=");
        return ho8.a(sb, this.m, ')');
    }

    public /* synthetic */ ChatControls(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11);
    }

    public ChatControls(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = bool;
        this.k = str9;
        this.l = str10;
        this.m = str11;
    }

    public ChatControls(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.n(), serializer.I(), serializer.I(), serializer.I());
    }
}
