package com.vk.voip.ui.members;

import android.util.LruCache;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import xsna.a1w;
import xsna.erm0;
import xsna.eu2;
import xsna.fxj0;
import xsna.ixj0;
import xsna.m4s;
import xsna.sew0;
import xsna.whr0;

/* compiled from: VoipDataProviderFromVkIm.kt */
/* loaded from: classes7.dex */
public final class a {
    public final a1w a;
    public final eu2 b;

    public a(a1w a1wVar, eu2 eu2Var) {
        this.a = a1wVar;
        this.b = eu2Var;
    }

    public final whr0 a(Contact contact) {
        sew0 b;
        String str = contact.p;
        ImageList imageList = contact.h;
        if (str == null) {
            return null;
        }
        String valueOf = String.valueOf(contact.B7().b);
        String str2 = contact.c;
        Image Ab = imageList.Ab();
        String str3 = Ab != null ? Ab.d : null;
        fxj0 o = ixj0.o(imageList);
        Character y0 = erm0.y0(str2);
        String valueOf2 = String.valueOf(y0 != null ? y0.charValue() : erm0.A0(String.valueOf(contact.b)));
        if (((Boolean) this.b.invoke()).booleanValue()) {
            LruCache<String, fxj0> lruCache = sew0.a;
            b = new sew0.c(str2, m4s.G(str2 + ':' + valueOf));
        } else if (o != null) {
            LruCache<String, fxj0> lruCache2 = sew0.a;
            b = sew0.a.b(o.getUrl(), false, true);
        } else if (str3 == null) {
            LruCache<String, fxj0> lruCache3 = sew0.a;
            b = new sew0.c(valueOf2, m4s.G(str2 + ':' + valueOf));
        } else {
            LruCache<String, fxj0> lruCache4 = sew0.a;
            b = sew0.a.b(str3, false, false);
        }
        sew0 sew0Var = b;
        UserNameCase.a aVar = UserNameCase.Companion;
        String str4 = contact.c;
        boolean z = UserSex.UNKNOWN == UserSex.FEMALE;
        boolean z2 = contact.q9().b;
        Long l = contact.j;
        return new whr0(str, sew0Var, z, z2, false, contact.ib(), VoipFriendStatus.NOT_FRIENDS, str4, "", str4, "", str4, true, false, new whr0.a(l != null ? l.toString() : null), false, null, null, 237568);
    }
}
