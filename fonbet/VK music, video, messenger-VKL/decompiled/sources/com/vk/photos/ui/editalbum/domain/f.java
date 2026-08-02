package com.vk.photos.ui.editalbum.domain;

import com.vk.photos.ui.editalbum.domain.Mode;
import com.vk.photos.ui.editalbum.domain.e;
import kotlin.NoWhenBranchMatchedException;
import xsna.ci3;
import xsna.dm50;
import xsna.epx;

/* compiled from: EditAlbumReducer.kt */
/* loaded from: classes3.dex */
public final class f extends dm50<i, e, h> {
    @Override // xsna.dm50
    public final h c(h hVar, e eVar) {
        Mode systemAlbum;
        h hVar2 = hVar;
        e eVar2 = eVar;
        Mode mode = hVar2.g;
        if (eVar2.equals(e.c.b)) {
            return hVar2;
        }
        if (eVar2 instanceof e.a) {
            Mode.Community community = (Mode.Community) mode;
            boolean z = community.b;
            community.getClass();
            return h.a(hVar2, null, null, false, new Mode.Community(z, false), false, 2015);
        }
        if (eVar2 instanceof e.C1517e) {
            Mode.Community community2 = (Mode.Community) mode;
            boolean z2 = community2.c;
            community2.getClass();
            return h.a(hVar2, null, null, false, new Mode.Community(false, z2), false, 2015);
        }
        Mode mode2 = null;
        if (eVar2 instanceof e.g) {
            return h.a(hVar2, null, null, false, Mode.User.a((Mode.User) mode, null, ((e.g) eVar2).b, 1), false, 2015);
        }
        if (eVar2 instanceof e.h) {
            return h.a(hVar2, null, ((e.h) eVar2).b, false, null, false, 2039);
        }
        if (eVar2 instanceof e.i) {
            Mode.User user = mode instanceof Mode.User ? (Mode.User) mode : null;
            if (user != null) {
                mode2 = Mode.User.a(user, ((e.i) eVar2).b, null, 2);
            } else {
                Mode.SystemAlbum systemAlbum2 = mode instanceof Mode.SystemAlbum ? (Mode.SystemAlbum) mode : null;
                if (systemAlbum2 != null) {
                    mode2 = new Mode.SystemAlbum(((e.i) eVar2).b, systemAlbum2.c);
                }
            }
            if (mode2 == null) {
                mode2 = mode;
            }
            return h.a(hVar2, null, null, false, mode2, false, 2015);
        }
        if (eVar2 instanceof e.k) {
            String str = ((e.k) eVar2).b;
            int length = str.length() - 1;
            int i = 0;
            boolean z3 = false;
            while (i <= length) {
                boolean z4 = epx.g(str.charAt(!z3 ? i : length), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    }
                    length--;
                } else if (z4) {
                    i++;
                } else {
                    z3 = true;
                }
            }
            return h.a(hVar2, str, null, str.subSequence(i, length + 1).toString().length() >= 1, null, false, 2027);
        }
        if (eVar2.equals(e.b.b)) {
            return h.a(hVar2, null, null, false, null, false, 1983);
        }
        if (eVar2.equals(e.d.b)) {
            return h.a(hVar2, null, null, false, null, true, 1983);
        }
        if (eVar2.equals(e.f.b)) {
            return h.a(hVar2, null, null, false, null, false, 1791);
        }
        if (eVar2 instanceof e.j.b) {
            if (mode instanceof Mode.User) {
                Mode.User user2 = (Mode.User) mode;
                mode = Mode.User.a(user2, null, PrivacySettingData.a(user2.c, ((e.j.b) eVar2).b), 1);
            }
            return h.a(hVar2, null, null, false, mode, false, 2015);
        }
        if (!(eVar2 instanceof e.j.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (mode instanceof Mode.User) {
            Mode.User user3 = (Mode.User) mode;
            mode = Mode.User.a(user3, PrivacySettingData.a(user3.b, ((e.j.a) eVar2).b), null, 2);
        } else if (mode instanceof Mode.SystemAlbum) {
            Mode.SystemAlbum systemAlbum3 = (Mode.SystemAlbum) mode;
            systemAlbum = new Mode.SystemAlbum(PrivacySettingData.a(systemAlbum3.b, ((e.j.a) eVar2).b), systemAlbum3.c);
            return h.a(hVar2, null, null, false, systemAlbum, false, 2015);
        }
        systemAlbum = mode;
        return h.a(hVar2, null, null, false, systemAlbum, false, 2015);
    }

    @Override // xsna.dm50
    public final i d() {
        return new i(e(new ci3(27)));
    }

    @Override // xsna.dm50
    public final void h(h hVar, i iVar) {
        f(iVar.a, hVar);
    }
}
