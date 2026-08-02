package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.settings.SettingsPriority;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PostingSettings implements Serializer.StreamParcelable {
    public static final Serializer.c<PostingSettings> CREATOR = new a();
    public final PostingPollSettings b;
    public final int c;
    public final PostingRules d;
    public final SettingsPriority e;
    public final boolean f;
    public final UserWallPostingSettings g;
    public final GroupWallPostingSettings h;
    public final List<ActionButton> i;
    public final ActionButton j;
    public final LoadingState k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final List<DonutLevel> o;
    public final String p;
    public final CurrentUser q;
    public final int r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostingSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostingSettings a(Serializer serializer) {
            return new PostingSettings((PostingPollSettings) serializer.G(PostingPollSettings.class.getClassLoader()), serializer.u(), (PostingRules) serializer.G(PostingRules.class.getClassLoader()), (SettingsPriority) serializer.A(SettingsPriority.class.getClassLoader()), serializer.m(), (UserWallPostingSettings) serializer.G(UserWallPostingSettings.class.getClassLoader()), (GroupWallPostingSettings) serializer.G(GroupWallPostingSettings.class.getClassLoader()), serializer.B(ActionButton.class.getClassLoader()), (ActionButton) serializer.A(ActionButton.class.getClassLoader()), (LoadingState) serializer.A(LoadingState.class.getClassLoader()), serializer.u(), serializer.m(), serializer.m(), serializer.B(DonutLevel.class.getClassLoader()), serializer.H(), (CurrentUser) serializer.A(CurrentUser.class.getClassLoader()), serializer.u(), serializer.u(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostingSettings[i];
        }
    }

    public PostingSettings(PostingPollSettings postingPollSettings, int i, PostingRules postingRules, SettingsPriority settingsPriority, boolean z, UserWallPostingSettings userWallPostingSettings, GroupWallPostingSettings groupWallPostingSettings, List<ActionButton> list, ActionButton actionButton, LoadingState loadingState, int i2, boolean z2, boolean z3, List<DonutLevel> list2, String str, CurrentUser currentUser, int i3, int i4, boolean z4, boolean z5, boolean z6) {
        this.b = postingPollSettings;
        this.c = i;
        this.d = postingRules;
        this.e = settingsPriority;
        this.f = z;
        this.g = userWallPostingSettings;
        this.h = groupWallPostingSettings;
        this.i = list;
        this.j = actionButton;
        this.k = loadingState;
        this.l = i2;
        this.m = z2;
        this.n = z3;
        this.o = list2;
        this.p = str;
        this.q = currentUser;
        this.r = i3;
        this.s = i4;
        this.t = z4;
        this.u = z5;
        this.v = z6;
    }

    public static PostingSettings a(PostingSettings postingSettings, SettingsPriority settingsPriority, UserWallPostingSettings userWallPostingSettings, GroupWallPostingSettings groupWallPostingSettings, LoadingState loadingState, int i) {
        PostingPollSettings postingPollSettings = postingSettings.b;
        int i2 = postingSettings.c;
        PostingRules postingRules = postingSettings.d;
        SettingsPriority settingsPriority2 = (i & 8) != 0 ? postingSettings.e : settingsPriority;
        boolean z = postingSettings.f;
        UserWallPostingSettings userWallPostingSettings2 = (i & 32) != 0 ? postingSettings.g : userWallPostingSettings;
        GroupWallPostingSettings groupWallPostingSettings2 = (i & 64) != 0 ? postingSettings.h : groupWallPostingSettings;
        List<ActionButton> list = postingSettings.i;
        SettingsPriority settingsPriority3 = settingsPriority2;
        UserWallPostingSettings userWallPostingSettings3 = userWallPostingSettings2;
        GroupWallPostingSettings groupWallPostingSettings3 = groupWallPostingSettings2;
        ActionButton actionButton = postingSettings.j;
        LoadingState loadingState2 = (i & 512) != 0 ? postingSettings.k : loadingState;
        int i3 = postingSettings.l;
        boolean z2 = postingSettings.m;
        boolean z3 = postingSettings.n;
        List<DonutLevel> list2 = postingSettings.o;
        String str = postingSettings.p;
        LoadingState loadingState3 = loadingState2;
        CurrentUser currentUser = postingSettings.q;
        int i4 = postingSettings.r;
        int i5 = postingSettings.s;
        boolean z4 = postingSettings.t;
        boolean z5 = postingSettings.u;
        boolean z6 = postingSettings.v;
        postingSettings.getClass();
        return new PostingSettings(postingPollSettings, i2, postingRules, settingsPriority3, z, userWallPostingSettings3, groupWallPostingSettings3, list, actionButton, loadingState3, i3, z2, z3, list2, str, currentUser, i4, i5, z4, z5, z6);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.i0(this.d);
        serializer.e0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.f0(this.i);
        serializer.e0(this.j);
        serializer.e0(this.k);
        serializer.S(this.l);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.f0(this.o);
        serializer.j0(this.p);
        serializer.e0(this.q);
        serializer.S(this.r);
        serializer.S(this.s);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
    }

    public final boolean d() {
        GroupWallPostingSettings groupWallPostingSettings = this.h;
        return (groupWallPostingSettings == null || !groupWallPostingSettings.b || groupWallPostingSettings.e == GroupAdminLevel.MODERATOR) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingSettings)) {
            return false;
        }
        PostingSettings postingSettings = (PostingSettings) obj;
        return epx.f(this.b, postingSettings.b) && this.c == postingSettings.c && epx.f(this.d, postingSettings.d) && this.e == postingSettings.e && this.f == postingSettings.f && epx.f(this.g, postingSettings.g) && epx.f(this.h, postingSettings.h) && epx.f(this.i, postingSettings.i) && epx.f(this.j, postingSettings.j) && this.k == postingSettings.k && this.l == postingSettings.l && this.m == postingSettings.m && this.n == postingSettings.n && epx.f(this.o, postingSettings.o) && epx.f(this.p, postingSettings.p) && epx.f(this.q, postingSettings.q) && this.r == postingSettings.r && this.s == postingSettings.s && this.t == postingSettings.t && this.u == postingSettings.u && this.v == postingSettings.v;
    }

    public final int hashCode() {
        int b = qoy.b((this.e.hashCode() + fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d.b)) * 31, 31, this.f);
        UserWallPostingSettings userWallPostingSettings = this.g;
        int hashCode = (b + (userWallPostingSettings == null ? 0 : userWallPostingSettings.hashCode())) * 31;
        GroupWallPostingSettings groupWallPostingSettings = this.h;
        int a2 = fw3.a((hashCode + (groupWallPostingSettings == null ? 0 : groupWallPostingSettings.hashCode())) * 31, 31, this.i);
        ActionButton actionButton = this.j;
        int a3 = fw3.a(qoy.b(qoy.b(shy.a(this.l, (this.k.hashCode() + ((a2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31)) * 31, 31), 31, this.m), 31, this.n), 31, this.o);
        String str = this.p;
        return Boolean.hashCode(this.v) + qoy.b(qoy.b(shy.a(this.s, shy.a(this.r, (this.q.hashCode() + ((a3 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31), 31), 31, this.t), 31, this.u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingSettings(poll=");
        sb.append(this.b);
        sb.append(", mediaAttachmentsMaxCount=");
        sb.append(this.c);
        sb.append(", rules=");
        sb.append(this.d);
        sb.append(", priority=");
        sb.append(this.e);
        sb.append(", isAdmin=");
        sb.append(this.f);
        sb.append(", userWallPostingSettings=");
        sb.append(this.g);
        sb.append(", groupWallPostingSettings=");
        sb.append(this.h);
        sb.append(", actions=");
        sb.append(this.i);
        sb.append(", rememberedAction=");
        sb.append(this.j);
        sb.append(", loadingState=");
        sb.append(this.k);
        sb.append(", postTextMaxLength=");
        sb.append(this.l);
        sb.append(", isDonutAvailable=");
        sb.append(this.m);
        sb.append(", canAllDons=");
        sb.append(this.n);
        sb.append(", privacyDonutLevels=");
        sb.append(this.o);
        sb.append(", donutTeaserText=");
        sb.append(this.p);
        sb.append(", currentUser=");
        sb.append(this.q);
        sb.append(", geoChipMaxLength=");
        sb.append(this.r);
        sb.append(", audioMaxCount=");
        sb.append(this.s);
        sb.append(", isMultiSelectEnabled=");
        sb.append(this.t);
        sb.append(", isNotificationEnabled=");
        sb.append(this.u);
        sb.append(", isProductAttachmentAvailable=");
        return q0.a(sb, this.v, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
