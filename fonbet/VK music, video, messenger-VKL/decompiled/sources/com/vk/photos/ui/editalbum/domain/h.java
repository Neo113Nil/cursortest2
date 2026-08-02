package com.vk.photos.ui.editalbum.domain;

import android.content.Context;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.editalbum.domain.Mode;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.e43;
import xsna.epx;
import xsna.km50;
import xsna.qoy;
import xsna.urd0;

/* compiled from: EditAlbumState.kt */
/* loaded from: classes3.dex */
public final class h implements km50 {
    public static final List<String> m = e43.l("all", "friends", "friends_of_friends", "only_me", "some");
    public static final List<PrivacyRules.PredefinedSet> n = Collections.singletonList(PrivacyRules.a);
    public static final List<String> o = e43.l("friends", "only_me", "some");
    public static final List<PrivacyRules.PredefinedSet> p = Collections.singletonList(PrivacyRules.h);
    public final boolean b;
    public final PhotoAlbum c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Mode g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    /* compiled from: EditAlbumState.kt */
    public static final class a {
        public static h a(Context context, PhotoAlbum photoAlbum, UserId userId, boolean z) {
            return new h(false, photoAlbum, photoAlbum.g, photoAlbum.h, true, userId.b > 0 ? b(context, photoAlbum, z) : new Mode.Community(photoAlbum.o, photoAlbum.p), photoAlbum.b < 0, false, z, Tensorflow.FRAME_HEIGHT);
        }

        public static Mode b(Context context, PhotoAlbum photoAlbum, boolean z) {
            if (photoAlbum == null) {
                Pair pair = z ? new Pair(h.o, h.p) : new Pair(h.m, h.n);
                List<String> list = (List) pair.d();
                List<PrivacySetting.PrivacyRule> list2 = (List) pair.g();
                PrivacySetting privacySetting = new PrivacySetting();
                privacySetting.c = context.getString(R.string.create_album_privacy);
                privacySetting.f = list;
                privacySetting.e = list2;
                PrivacySetting privacySetting2 = new PrivacySetting();
                privacySetting2.c = context.getString(R.string.create_album_privacy_comments);
                privacySetting2.f = list;
                privacySetting2.e = list2;
                return new Mode.User(new PrivacySettingData(privacySetting, null), new PrivacySettingData(privacySetting2, null));
            }
            PrivacySetting privacySetting3 = new PrivacySetting();
            List<String> list3 = h.m;
            privacySetting3.f = list3;
            privacySetting3.c = context.getString(R.string.create_album_privacy);
            List<PrivacySetting.PrivacyRule> list4 = photoAlbum.i;
            if (list4 == null) {
                list4 = Collections.singletonList(PrivacyRules.a);
            }
            privacySetting3.e = list4;
            PrivacySetting privacySetting4 = new PrivacySetting();
            privacySetting4.f = list3;
            privacySetting4.c = context.getString(R.string.create_album_privacy_comments);
            List<PrivacySetting.PrivacyRule> list5 = photoAlbum.j;
            if (list5 == null) {
                list5 = Collections.singletonList(PrivacyRules.a);
            }
            privacySetting4.e = list5;
            return photoAlbum.b < 0 ? new Mode.SystemAlbum(new PrivacySettingData(privacySetting3, null), null, 2, null) : new Mode.User(new PrivacySettingData(privacySetting3, null), new PrivacySettingData(privacySetting4, null));
        }

        public static h c(Context context, UserId userId, boolean z, boolean z2) {
            return new h(true, null, "", "", false, userId.b >= 0 ? b(context, null, z2) : new Mode.Community(false, false), false, z, z2, 256);
        }
    }

    public /* synthetic */ h(boolean z, PhotoAlbum photoAlbum, String str, String str2, boolean z2, Mode mode, boolean z3, boolean z4, boolean z5, int i) {
        this(z, photoAlbum, str, str2, z2, mode, false, z3, false, (i & 512) != 0 ? false : z4, z5);
    }

    public static h a(h hVar, String str, String str2, boolean z, Mode mode, boolean z2, int i) {
        boolean z3 = hVar.b;
        PhotoAlbum photoAlbum = hVar.c;
        if ((i & 4) != 0) {
            str = hVar.d;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = hVar.e;
        }
        String str4 = str2;
        boolean z4 = (i & 16) != 0 ? hVar.f : z;
        Mode mode2 = (i & 32) != 0 ? hVar.g : mode;
        boolean z5 = (i & 64) != 0 ? hVar.h : z2;
        boolean z6 = hVar.i;
        boolean z7 = (i & 256) != 0 ? hVar.j : true;
        boolean z8 = hVar.k;
        boolean z9 = hVar.l;
        hVar.getClass();
        return new h(z3, photoAlbum, str3, str4, z4, mode2, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.b == hVar.b && epx.f(this.c, hVar.c) && epx.f(this.d, hVar.d) && epx.f(this.e, hVar.e) && this.f == hVar.f && epx.f(this.g, hVar.g) && this.h == hVar.h && this.i == hVar.i && this.j == hVar.j && this.k == hVar.k && this.l == hVar.l;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        PhotoAlbum photoAlbum = this.c;
        return Boolean.hashCode(this.l) + qoy.b(qoy.b(qoy.b(qoy.b((this.g.hashCode() + qoy.b(urd0.a(urd0.a((hashCode + (photoAlbum == null ? 0 : photoAlbum.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditAlbumState(newAlbumMode=");
        sb.append(this.b);
        sb.append(", album=");
        sb.append(this.c);
        sb.append(", albumTitle=");
        sb.append(this.d);
        sb.append(", albumDescription=");
        sb.append(this.e);
        sb.append(", canSave=");
        sb.append(this.f);
        sb.append(", mode=");
        sb.append(this.g);
        sb.append(", loading=");
        sb.append(this.h);
        sb.append(", systemAlbum=");
        sb.append(this.i);
        sb.append(", updateAlbumMode=");
        sb.append(this.j);
        sb.append(", restore=");
        sb.append(this.k);
        sb.append(", closedProfile=");
        return q0.a(sb, this.l, ')');
    }

    public h(boolean z, PhotoAlbum photoAlbum, String str, String str2, boolean z2, Mode mode, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.b = z;
        this.c = photoAlbum;
        this.d = str;
        this.e = str2;
        this.f = z2;
        this.g = mode;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
    }
}
