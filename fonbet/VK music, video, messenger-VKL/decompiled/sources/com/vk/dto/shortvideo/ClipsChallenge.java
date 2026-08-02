package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fw3;

/* compiled from: ClipsChallenge.kt */
/* loaded from: classes18.dex */
public final class ClipsChallenge implements Serializer.StreamParcelable {
    public static final Serializer.c<ClipsChallenge> CREATOR = new a();
    public final String b;
    public final String c;
    public final ClipCameraParams d;
    public final NotificationImage e;
    public final List<ClipVideoFile> f;
    public final List<String> g;
    public final UserProfile h;
    public final Group i;
    public final String j;
    public final String k;
    public final List<ChallengeRule> l;
    public final ChallengeStyle m;
    public final ActionLink n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipsChallenge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsChallenge a(Serializer serializer) {
            return new ClipsChallenge(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsChallenge[i];
        }
    }

    public ClipsChallenge(String str, String str2, ClipCameraParams clipCameraParams, NotificationImage notificationImage, List<ClipVideoFile> list, List<String> list2, UserProfile userProfile, Group group, String str3, String str4, List<ChallengeRule> list3, ChallengeStyle challengeStyle, ActionLink actionLink) {
        this.b = str;
        this.c = str2;
        this.d = clipCameraParams;
        this.e = notificationImage;
        this.f = list;
        this.g = list2;
        this.h = userProfile;
        this.i = group;
        this.j = str3;
        this.k = str4;
        this.l = list3;
        this.m = challengeStyle;
        this.n = actionLink;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.W(this.f);
        serializer.l0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.W(this.l);
        serializer.i0(this.m);
        serializer.i0(this.n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsChallenge)) {
            return false;
        }
        ClipsChallenge clipsChallenge = (ClipsChallenge) obj;
        return epx.f(this.b, clipsChallenge.b) && epx.f(this.c, clipsChallenge.c) && epx.f(this.d, clipsChallenge.d) && epx.f(this.e, clipsChallenge.e) && epx.f(this.f, clipsChallenge.f) && epx.f(this.g, clipsChallenge.g) && epx.f(this.h, clipsChallenge.h) && epx.f(this.i, clipsChallenge.i) && epx.f(this.j, clipsChallenge.j) && epx.f(this.k, clipsChallenge.k) && epx.f(this.l, clipsChallenge.l) && epx.f(this.m, clipsChallenge.m) && epx.f(this.n, clipsChallenge.n);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ClipCameraParams clipCameraParams = this.d;
        int hashCode3 = (hashCode2 + (clipCameraParams == null ? 0 : clipCameraParams.hashCode())) * 31;
        NotificationImage notificationImage = this.e;
        int a2 = fw3.a(fw3.a((hashCode3 + (notificationImage == null ? 0 : notificationImage.hashCode())) * 31, 31, this.f), 31, this.g);
        UserProfile userProfile = this.h;
        int hashCode4 = (a2 + (userProfile == null ? 0 : userProfile.hashCode())) * 31;
        Group group = this.i;
        int hashCode5 = (hashCode4 + (group == null ? 0 : group.hashCode())) * 31;
        String str3 = this.j;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int a3 = fw3.a((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l);
        ChallengeStyle challengeStyle = this.m;
        int hashCode7 = (a3 + (challengeStyle == null ? 0 : challengeStyle.hashCode())) * 31;
        ActionLink actionLink = this.n;
        return hashCode7 + (actionLink != null ? actionLink.hashCode() : 0);
    }

    public final String toString() {
        return "ClipsChallenge(description=" + this.b + ", disclaimer=" + this.c + ", cameraParams=" + this.d + ", image=" + this.e + ", pinnedItems=" + this.f + ", labels=" + this.g + ", ownerProfile=" + this.h + ", ownerGroup=" + this.i + ", termsTitle=" + this.j + ", termsUrl=" + this.k + ", rules=" + this.l + ", style=" + this.m + ", actionLink=" + this.n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsChallenge(Serializer serializer) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r0 == null ? EmptyList.b : r0, (ChallengeStyle) serializer.G(ChallengeStyle.class.getClassLoader()), (ActionLink) serializer.G(ActionLink.class.getClassLoader()));
        String H = serializer.H();
        String H2 = serializer.H();
        ClipCameraParams clipCameraParams = (ClipCameraParams) serializer.G(ClipCameraParams.class.getClassLoader());
        NotificationImage notificationImage = (NotificationImage) serializer.G(NotificationImage.class.getClassLoader());
        List k = serializer.k(ClipVideoFile.class);
        List list = k == null ? EmptyList.b : k;
        ArrayList a2 = com.vk.core.serialize.a.a(serializer);
        UserProfile userProfile = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        Group group = (Group) serializer.G(Group.class.getClassLoader());
        String H3 = serializer.H();
        String H4 = serializer.H();
        List k2 = serializer.k(ChallengeRule.class);
    }
}
