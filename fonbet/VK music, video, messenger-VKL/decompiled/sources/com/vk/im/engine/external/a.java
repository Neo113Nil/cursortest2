package com.vk.im.engine.external;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Lazy;
import xsna.a1w;
import xsna.b25;
import xsna.cn70;
import xsna.e43;
import xsna.gek0;
import xsna.hek0;

/* compiled from: ImSocialProfilesProvider.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class a implements hek0 {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Object b;
    public final Context c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List<String> h;

    /* compiled from: ImSocialProfilesProvider.kt */
    /* renamed from: com.vk.im.engine.external.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C1112a implements gek0 {
        public final Contact a;

        public C1112a(Contact contact) {
            this.a = contact;
        }

        @Override // xsna.gek0
        public final String a() {
            UserNameCase.a aVar = UserNameCase.Companion;
            return this.a.name();
        }

        @Override // xsna.gek0
        public final String b(String str) {
            a aVar = a.this;
            if (str.equals(aVar.d)) {
                return aVar.c.getString(R.string.contact_profile_subtitle);
            }
            if (str.equals(aVar.e)) {
                return aVar.c.getString(R.string.voip_call_user);
            }
            if (str.equals(aVar.f)) {
                return aVar.c.getString(R.string.contact_message_subtitle);
            }
            if (str.equals(aVar.g)) {
                return aVar.c.getString(R.string.contact_message_subtitle);
            }
            throw new UnsupportedOperationException();
        }

        @Override // xsna.gek0
        public final String c() {
            String l;
            Contact contact = this.a;
            Long l2 = contact.j;
            return (l2 == null || (l = l2.toString()) == null) ? String.valueOf(contact.G3()) : l;
        }

        @Override // xsna.gek0
        public final String d() {
            UserNameCase.a aVar = UserNameCase.Companion;
            return "";
        }

        @Override // xsna.gek0
        public final boolean e(String str) {
            a aVar = a.this;
            if (str.equals(aVar.d)) {
                return g();
            }
            if (str.equals(aVar.e)) {
                return g() && this.a.ib();
            }
            if (str.equals(aVar.f)) {
                return g();
            }
            if (str.equals(aVar.g)) {
                return g();
            }
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (C1112a.class.equals(obj != null ? obj.getClass() : null)) {
                return this.a.equals(((C1112a) obj).a);
            }
            return false;
        }

        @Override // xsna.gek0
        public final String f() {
            return "+" + this.a.d;
        }

        public final boolean g() {
            return Peer.Type.CONTACT != Peer.Type.UNKNOWN;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public a(Lazy<? extends b25> lazy, Lazy<a1w> lazy2) {
        this.a = lazy;
        this.b = lazy2;
        Context context = e43.a;
        context = context == null ? null : context;
        this.c = context;
        String string = context.getString(R.string.vnd_profile);
        this.d = string;
        String string2 = context.getString(R.string.vnd_voipcall);
        this.e = string2;
        String string3 = context.getString(R.string.vnd_sendmsg);
        this.f = string3;
        String string4 = context.getString(R.string.vnd_google_assistant);
        this.g = string4;
        this.h = e43.l(string, string2, string3, string4);
        cn70.b(200);
    }
}
