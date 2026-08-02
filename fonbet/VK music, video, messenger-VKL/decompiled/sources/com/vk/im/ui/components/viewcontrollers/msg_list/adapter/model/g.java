package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import xsna.epx;
import xsna.oh30;
import xsna.ol8;
import xsna.rl3;
import xsna.uk30;
import xsna.y060;
import xsna.zwk;

/* compiled from: ChatListInterfaces.kt */
/* loaded from: classes2.dex */
public interface g extends ol8, zwk {
    static /* synthetic */ g o0(g gVar, Boolean bool, Integer num, int i) {
        Boolean bool2 = Boolean.FALSE;
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return gVar.H(bool, bool2, num);
    }

    default boolean A() {
        return l() == AdapterEntryType.TYPE_GIFT_BANNER;
    }

    default boolean A0() {
        return t() > 0;
    }

    default boolean B() {
        return false;
    }

    default boolean C0() {
        return !o();
    }

    default boolean D() {
        return l() == AdapterEntryType.TYPE_INTERACTIVE_VIDEO;
    }

    default NestedMsg D0() {
        return null;
    }

    default boolean E() {
        int h = l().h();
        return 16 <= h && h < 48;
    }

    default c E0() {
        return null;
    }

    default boolean F0() {
        return l() == AdapterEntryType.TYPE_VIDEO_MSG;
    }

    default boolean G() {
        return l() == AdapterEntryType.TYPE_CUSTOM_BANNER;
    }

    default boolean H0() {
        return l() == AdapterEntryType.TYPE_REACTIONS;
    }

    default boolean I() {
        return l() == AdapterEntryType.TYPE_WIDGET;
    }

    default boolean I0(g gVar) {
        c E0;
        c E02;
        if (gVar == null || gVar.o() || (E0 = gVar.E0()) == null || (E02 = E0()) == null) {
            return false;
        }
        Peer peer = E0.j;
        Peer.Type type = peer.c;
        Peer peer2 = E02.j;
        return type == peer2.c && peer.d == peer2.d;
    }

    default boolean J() {
        c E0 = E0();
        if (E0 != null) {
            c.C1166c c1166c = E0.D;
            if ((c1166c != null ? c1166c.I : false) && x0()) {
                return true;
            }
        }
        return false;
    }

    default CharSequence K() {
        return null;
    }

    default boolean K0() {
        return false;
    }

    default boolean L() {
        return l() == AdapterEntryType.TYPE_DISAPPEARED;
    }

    default boolean L0() {
        return l() == AdapterEntryType.TYPE_PUBLIC_VIDEO;
    }

    default boolean M() {
        return l() == AdapterEntryType.TYPE_DATE;
    }

    default boolean N() {
        return l() == AdapterEntryType.TYPE_STORY;
    }

    default boolean N0() {
        return l() == AdapterEntryType.TYPE_LOAD_MORE;
    }

    default boolean O() {
        c.C1166c c1166c;
        c E0 = E0();
        if (E0 == null || (c1166c = E0.D) == null) {
            return false;
        }
        return c1166c.n;
    }

    default boolean O0() {
        return l() == AdapterEntryType.TYPE_FWD_TIME;
    }

    default boolean P0() {
        return l() == AdapterEntryType.TYPE_POLL;
    }

    default Msg Q() {
        return null;
    }

    default boolean Q0(g gVar) {
        if (gVar == null || !gVar.m()) {
            return false;
        }
        c E0 = gVar.E0();
        Integer valueOf = E0 != null ? Integer.valueOf(E0.b) : null;
        c E02 = E0();
        return epx.f(valueOf, E02 != null ? Integer.valueOf(E02.b) : null);
    }

    default boolean R(g gVar) {
        c E0;
        return gVar == null || (E0 = gVar.E0()) == null || E0.s || !I0(gVar) || gVar.E();
    }

    default boolean S() {
        return l() == AdapterEntryType.TYPE_USER_NAME;
    }

    default boolean S0() {
        return l() == AdapterEntryType.TYPE_AUDIOMSG;
    }

    default boolean U() {
        return i0() || rl3.y0(new AdapterEntryType[]{AdapterEntryType.TYPE_EXTERNAL_VIDEO, AdapterEntryType.TYPE_PUBLIC_VIDEO, AdapterEntryType.TYPE_INTERACTIVE_VIDEO}).contains(l());
    }

    default boolean V() {
        return l() == AdapterEntryType.TYPE_PROFILE_BANNER;
    }

    default boolean b0() {
        return l() == AdapterEntryType.TYPE_CAROUSEL;
    }

    default boolean c0() {
        return l() == AdapterEntryType.TYPE_BOX_PHOTO_VIDEO;
    }

    default boolean e0() {
        return l() == AdapterEntryType.TYPE_EXTERNAL_VIDEO;
    }

    default int f0() {
        c.g gVar;
        c E0 = E0();
        if (E0 == null || (gVar = E0.E) == null) {
            return 0;
        }
        return gVar.g;
    }

    default boolean g0() {
        if (z() || k0() || h0()) {
            c E0 = E0();
            if (E0 != null) {
                c.C1166c c1166c = E0.D;
                if (c1166c != null ? c1166c.I : false) {
                }
            }
            return true;
        }
        return false;
    }

    default boolean h0() {
        return l() == AdapterEntryType.TYPE_ARTIST;
    }

    default boolean i0() {
        return rl3.y0(new AdapterEntryType[]{AdapterEntryType.TYPE_PHOTO, AdapterEntryType.TYPE_VIDEO, AdapterEntryType.TYPE_VIDEO_MSG, AdapterEntryType.TYPE_STICKER, AdapterEntryType.TYPE_GRAFFITI, AdapterEntryType.TYPE_MAP, AdapterEntryType.TYPE_DOC_PREVIEW, AdapterEntryType.TYPE_GIF_AUTOPLAY, AdapterEntryType.TYPE_VIDEO_AUTOPLAY, AdapterEntryType.TYPE_POLL, AdapterEntryType.TYPE_UGC_STICKER, AdapterEntryType.TYPE_POPUP_STICKER, AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_PHOTO_VIDEO, AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC_PREVIEW}).contains(l());
    }

    default boolean j0() {
        return l() == AdapterEntryType.TYPE_COMMENTS_BUTTON;
    }

    default boolean k0() {
        return l() == AdapterEntryType.TYPE_PLAYLIST;
    }

    AdapterEntryType l();

    default boolean l0() {
        return l() == AdapterEntryType.TYPE_TEXT;
    }

    default boolean m() {
        return l().h() >= 48;
    }

    default boolean n0() {
        return l() == AdapterEntryType.TYPE_REPLY;
    }

    default boolean o() {
        return l().h() < 16;
    }

    default boolean q() {
        return false;
    }

    default y060 q0() {
        return null;
    }

    default int r0() {
        c E0 = E0();
        if (E0 == null) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(E0.a);
        if (!C0()) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    default a s0() {
        return null;
    }

    default int t() {
        return 0;
    }

    default boolean t0() {
        return l() == AdapterEntryType.TYPE_PHOTO;
    }

    default boolean u0() {
        oh30 M0;
        if (E0() == null || (M0 = M0()) == null) {
            return false;
        }
        return M0.f || M0.i;
    }

    default long v() {
        return 0L;
    }

    default boolean v0() {
        return l() == AdapterEntryType.TYPE_UNREAD_FROM;
    }

    default boolean w() {
        return l() == AdapterEntryType.TYPE_KEYBOARD;
    }

    default boolean w0() {
        return false;
    }

    default Attach x() {
        return null;
    }

    default boolean x0() {
        return rl3.y0(new AdapterEntryType[]{AdapterEntryType.TYPE_PHOTO, AdapterEntryType.TYPE_VIDEO, AdapterEntryType.TYPE_PUBLIC_VIDEO, AdapterEntryType.TYPE_BOX_PHOTO_VIDEO, AdapterEntryType.TYPE_EXTERNAL_VIDEO, AdapterEntryType.TYPE_VIDEO_AUTOPLAY, AdapterEntryType.TYPE_WALL_POST_PLACEHOLDER, AdapterEntryType.TYPE_ARTIST, AdapterEntryType.TYPE_PLAYLIST, AdapterEntryType.TYPE_AUDIO, AdapterEntryType.TYPE_DOC_PREVIEW, AdapterEntryType.TYPE_GIF_AUTOPLAY, AdapterEntryType.TYPE_INTERACTIVE_VIDEO, AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_PHOTO_VIDEO, AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO, AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC_PREVIEW, AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN}).contains(l());
    }

    default boolean y0() {
        return l() == AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT;
    }

    default boolean z() {
        return l() == AdapterEntryType.TYPE_AUDIO;
    }

    default boolean z0(boolean z, Integer num) {
        if (num == null || !z) {
            return false;
        }
        c E0 = E0();
        return num.equals(E0 != null ? Integer.valueOf(E0.b) : null);
    }

    @CheckResult
    default g X(uk30 uk30Var) {
        return this;
    }

    @CheckResult
    default g n(oh30 oh30Var) {
        return this;
    }

    @CheckResult
    default g u(boolean z) {
        return this;
    }

    @CheckResult
    default g y(boolean z) {
        return this;
    }

    @CheckResult
    default g s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }

    @CheckResult
    default g B0(g gVar, g gVar2, uk30 uk30Var) {
        return this;
    }

    @CheckResult
    default g H(Boolean bool, Boolean bool2, Integer num) {
        return this;
    }
}
