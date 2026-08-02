package com.vk.newsfeed.impl.posting.profilefriendslists;

import com.vk.newsfeed.impl.posting.profilefriendslists.holders.ProfileFriendsListHeaderVh;
import kotlin.collections.EmptyList;
import xsna.axd0;
import xsna.hfz;
import xsna.iah0;
import xsna.j5g;
import xsna.jjv0;
import xsna.kxd0;
import xsna.rx6;
import xsna.sxm;
import xsna.uhz;
import xsna.vic;
import xsna.w7k;
import xsna.xwd0;

/* compiled from: ProfileFriendsListAdapter.kt */
/* loaded from: classes4.dex */
public final class a extends sxm implements vic, jjv0 {

    /* compiled from: ProfileFriendsListAdapter.kt */
    /* renamed from: com.vk.newsfeed.impl.posting.profilefriendslists.a$a, reason: collision with other inner class name */
    public interface InterfaceC1385a extends xwd0.d, ProfileFriendsListHeaderVh.a, rx6.d, kxd0.a, w7k.a, uhz.d {
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        hfz hfzVar = (hfz) j5g.b0(i, this.h);
        if (hfzVar instanceof com.vk.newsfeed.impl.posting.profilefriendslists.holders.a) {
            return 1;
        }
        return ((hfzVar instanceof axd0) && ((axd0) hfzVar).c) ? 1 : 0;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return iah0.a(4);
    }
}
