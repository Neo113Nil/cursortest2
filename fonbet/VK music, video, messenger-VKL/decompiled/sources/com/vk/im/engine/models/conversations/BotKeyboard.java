package com.vk.im.engine.models.conversations;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import defpackage.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.bpn0;
import xsna.epx;
import xsna.g5g;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: BotKeyboard.kt */
/* loaded from: classes2.dex */
public final class BotKeyboard extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<BotKeyboard> CREATOR = new a();
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final List<List<BotButton>> f;
    public final ArrayList g;
    public final bpn0 h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BotKeyboard> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BotKeyboard a(Serializer serializer) {
            Peer peer = (Peer) serializer.G(Peer.class.getClassLoader());
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            int u = serializer.u();
            int u2 = serializer.u();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < u2; i++) {
                arrayList.add(new ArrayList(serializer.l(BotButton.class.getClassLoader())));
            }
            return new BotKeyboard(peer, m, m2, u, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BotKeyboard[i];
        }
    }

    public /* synthetic */ BotKeyboard(Peer peer, boolean z, boolean z2, int i, List list, int i2, zcl zclVar) {
        this(peer, z, (i2 & 4) != 0 ? false : z2, i, list);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.S(this.e);
        List<List<BotButton>> list = this.f;
        serializer.S(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            serializer.W((List) it.next());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotKeyboard)) {
            return false;
        }
        BotKeyboard botKeyboard = (BotKeyboard) obj;
        return epx.f(this.b, botKeyboard.b) && this.c == botKeyboard.c && this.d == botKeyboard.d && this.e == botKeyboard.e && epx.f(this.f, botKeyboard.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BotKeyboard(author=");
        sb.append(this.b);
        sb.append(", oneTime=");
        sb.append(this.c);
        sb.append(", inline=");
        sb.append(this.d);
        sb.append(", columnCount=");
        sb.append(this.e);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.f);
    }

    public final BotKeyboard zb() {
        ArrayList arrayList = new ArrayList();
        List<List<BotButton>> list = this.f;
        if ((list instanceof List) && (list instanceof RandomAccess)) {
            List<List<BotButton>> list2 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<BotButton> list3 = list2.get(i);
                ArrayList arrayList2 = new ArrayList();
                List<BotButton> list4 = list3;
                if ((list4 instanceof List) && (list4 instanceof RandomAccess)) {
                    List<BotButton> list5 = list4;
                    int size2 = list5.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList2.add(list5.get(i2).zb());
                    }
                } else {
                    Iterator<T> it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((BotButton) it.next()).zb());
                    }
                }
                arrayList.add(arrayList2);
            }
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                List list6 = (List) it2.next();
                ArrayList arrayList3 = new ArrayList();
                List list7 = list6;
                if ((list7 instanceof List) && (list7 instanceof RandomAccess)) {
                    List list8 = list7;
                    int size3 = list8.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        arrayList3.add(((BotButton) list8.get(i3)).zb());
                    }
                } else {
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((BotButton) it3.next()).zb());
                    }
                }
                arrayList.add(arrayList3);
            }
        }
        return new BotKeyboard(this.b, this.c, this.d, this.e, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BotKeyboard(Peer peer, boolean z, boolean z2, int i, List<? extends List<? extends BotButton>> list) {
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g5g.y((List) it.next(), arrayList);
        }
        this.g = arrayList;
        this.h = new bpn0(new r(this, 11));
    }
}
