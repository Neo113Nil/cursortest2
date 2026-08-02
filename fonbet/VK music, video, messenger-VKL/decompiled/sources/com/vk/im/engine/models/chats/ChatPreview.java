package com.vk.im.engine.models.chats;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: ChatPreview.kt */
/* loaded from: classes2.dex */
public final class ChatPreview extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ChatPreview> CREATOR = new a();
    public final String b;
    public final ImageList c;
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final LinkButton k;
    public final int l;
    public final List<Peer> m;
    public final List<User> n;
    public final List<Group> o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChatPreview> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChatPreview a(Serializer serializer) {
            return new ChatPreview(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatPreview[i];
        }
    }

    public ChatPreview() {
        this(null, null, 0, 0L, false, false, false, false, false, null, 0, null, null, null, 16383, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.S(this.d);
        serializer.Y(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.i0(this.k);
        serializer.S(this.l);
        serializer.o0(this.m);
        serializer.o0(this.n);
        serializer.o0(this.o);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatPreview)) {
            return false;
        }
        ChatPreview chatPreview = (ChatPreview) obj;
        return epx.f(this.b, chatPreview.b) && epx.f(this.c, chatPreview.c) && this.d == chatPreview.d && this.e == chatPreview.e && this.f == chatPreview.f && this.g == chatPreview.g && this.h == chatPreview.h && this.i == chatPreview.i && this.j == chatPreview.j && epx.f(this.k, chatPreview.k) && this.l == chatPreview.l && epx.f(this.m, chatPreview.m) && epx.f(this.n, chatPreview.n) && epx.f(this.o, chatPreview.o);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(shy.a(this.d, fw3.a(this.b.hashCode() * 31, 31, this.c.b), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        LinkButton linkButton = this.k;
        return this.o.hashCode() + fw3.a(fw3.a(shy.a(this.l, (b + (linkButton == null ? 0 : linkButton.hashCode())) * 31, 31), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatPreview(title=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", adminId=");
        sb.append(this.d);
        sb.append(", chatId=");
        sb.append(this.e);
        sb.append(", isChannel=");
        sb.append(this.f);
        sb.append(", isCasperChat=");
        sb.append(this.g);
        sb.append(", isDonutChat=");
        sb.append(this.h);
        sb.append(", isUserDonating=");
        sb.append(this.i);
        sb.append(", isDeletedForAll=");
        sb.append(this.j);
        sb.append(", button=");
        sb.append(this.k);
        sb.append(", membersCount=");
        sb.append(this.l);
        sb.append(", membersList=");
        sb.append(this.m);
        sb.append(", users=");
        sb.append(this.n);
        sb.append(", groups=");
        return ms9.a(')', sb, this.o);
    }

    public ChatPreview(String str, ImageList imageList, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, LinkButton linkButton, int i2, List list, List list2, List list3, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? new ImageList(null, 1, null) : imageList, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? false : z4, (i3 & 256) != 0 ? false : z5, (i3 & 512) == 0 ? linkButton : null, (i3 & 1024) == 0 ? i2 : 0, (i3 & 2048) != 0 ? EmptyList.b : list, (i3 & 4096) != 0 ? EmptyList.b : list2, (i3 & 8192) != 0 ? EmptyList.b : list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatPreview(String str, ImageList imageList, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, LinkButton linkButton, int i2, List<? extends Peer> list, List<User> list2, List<Group> list3) {
        this.b = str;
        this.c = imageList;
        this.d = i;
        this.e = j;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = linkButton;
        this.l = i2;
        this.m = list;
        this.n = list2;
        this.o = list3;
    }

    public ChatPreview(Serializer serializer, zcl zclVar) {
        this(serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.u(), serializer.w(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.u(), serializer.j(Peer.CREATOR), serializer.j(User.CREATOR), serializer.j(Group.CREATOR));
    }
}
