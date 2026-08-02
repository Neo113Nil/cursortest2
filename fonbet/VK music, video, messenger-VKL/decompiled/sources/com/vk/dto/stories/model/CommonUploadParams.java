package com.vk.dto.stories.model;

import com.facebook.soloader.MinElf;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.im.MsgType;
import com.vk.dto.stories.entities.StorySharingInfo;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.j5g;
import xsna.qoy;
import xsna.rl3;
import xsna.zcl;

/* compiled from: CommonUploadParams.kt */
/* loaded from: classes18.dex */
public final class CommonUploadParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CommonUploadParams> CREATOR = new a();
    public UserId b;
    public boolean c;
    public List<Long> d;
    public UserId e;
    public StoryEntryExtended f;
    public StorySharingInfo g;
    public String h;
    public MsgType i;
    public String j;
    public StoryUploadType k;
    public Integer l;
    public final boolean m;
    public String n;
    public boolean o;
    public List<Integer> p;
    public String q;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommonUploadParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommonUploadParams a(Serializer serializer) {
            return new CommonUploadParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommonUploadParams[i];
        }
    }

    public CommonUploadParams() {
        this(null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, MinElf.PN_XNUM, null);
    }

    public static CommonUploadParams zb(CommonUploadParams commonUploadParams, String str) {
        UserId userId = commonUploadParams.b;
        boolean z = commonUploadParams.c;
        List<Long> list = commonUploadParams.d;
        UserId userId2 = commonUploadParams.e;
        StoryEntryExtended storyEntryExtended = commonUploadParams.f;
        StorySharingInfo storySharingInfo = commonUploadParams.g;
        String str2 = commonUploadParams.h;
        MsgType msgType = commonUploadParams.i;
        StoryUploadType storyUploadType = commonUploadParams.k;
        Integer num = commonUploadParams.l;
        boolean z2 = commonUploadParams.m;
        String str3 = commonUploadParams.n;
        boolean z3 = commonUploadParams.o;
        List<Integer> list2 = commonUploadParams.p;
        String str4 = commonUploadParams.q;
        commonUploadParams.getClass();
        return new CommonUploadParams(userId, z, list, userId2, storyEntryExtended, storySharingInfo, str2, msgType, str, storyUploadType, num, z2, str3, z3, list2, str4);
    }

    public final boolean Ab() {
        return this.c;
    }

    public final List<Long> Bb() {
        return this.d;
    }

    public final String Cb() {
        return this.h;
    }

    public final UserId Db() {
        return this.e;
    }

    public final Integer Eb() {
        return this.l;
    }

    public final List<Integer> Fb() {
        return this.p;
    }

    public final StoryEntryExtended Gb() {
        return this.f;
    }

    public final String Hb() {
        return this.j;
    }

    public final StorySharingInfo Ib() {
        return this.g;
    }

    public final UserId Jb() {
        return this.b;
    }

    public final boolean Kb() {
        return !epx.f(this.e, UserId.d);
    }

    public final boolean Lb() {
        return this.m;
    }

    public final boolean Mb() {
        StoryEntryExtended storyEntryExtended = this.f;
        return (storyEntryExtended == null || storyEntryExtended == null || storyEntryExtended.d) ? false : true;
    }

    public final boolean Nb() {
        return this.o;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.Z(j5g.P0(this.d));
        serializer.e0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.i0(this.i);
        serializer.j0(this.j);
        serializer.g0(this.k);
        serializer.V(this.l);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.j0(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.U(this.p);
        serializer.j0(this.q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonUploadParams)) {
            return false;
        }
        CommonUploadParams commonUploadParams = (CommonUploadParams) obj;
        return epx.f(this.b, commonUploadParams.b) && this.c == commonUploadParams.c && epx.f(this.d, commonUploadParams.d) && epx.f(this.e, commonUploadParams.e) && epx.f(this.f, commonUploadParams.f) && epx.f(this.g, commonUploadParams.g) && epx.f(this.h, commonUploadParams.h) && epx.f(this.i, commonUploadParams.i) && epx.f(this.j, commonUploadParams.j) && this.k == commonUploadParams.k && epx.f(this.l, commonUploadParams.l) && this.m == commonUploadParams.m && epx.f(this.n, commonUploadParams.n) && this.o == commonUploadParams.o && epx.f(this.p, commonUploadParams.p) && epx.f(this.q, commonUploadParams.q);
    }

    public final int hashCode() {
        int a2 = bh10.a(fw3.a(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e.b);
        StoryEntryExtended storyEntryExtended = this.f;
        int hashCode = (a2 + (storyEntryExtended == null ? 0 : storyEntryExtended.hashCode())) * 31;
        StorySharingInfo storySharingInfo = this.g;
        int hashCode2 = (hashCode + (storySharingInfo == null ? 0 : storySharingInfo.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MsgType msgType = this.i;
        int hashCode4 = (hashCode3 + (msgType == null ? 0 : msgType.hashCode())) * 31;
        String str2 = this.j;
        int hashCode5 = (this.k.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Integer num = this.l;
        int b = qoy.b((hashCode5 + (num == null ? 0 : num.hashCode())) * 31, 31, this.m);
        String str3 = this.n;
        int b2 = qoy.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.o);
        List<Integer> list = this.p;
        int hashCode6 = (b2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.q;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonUploadParams(uploadUserId=");
        sb.append(this.b);
        sb.append(", addToNews=");
        sb.append(this.c);
        sb.append(", dialogIds=");
        sb.append(this.d);
        sb.append(", groupId=");
        sb.append(this.e);
        sb.append(", parentStory=");
        sb.append(this.f);
        sb.append(", sharingInfo=");
        sb.append(this.g);
        sb.append(", entryPoint=");
        sb.append(this.h);
        sb.append(", msgType=");
        sb.append(this.i);
        sb.append(", ref=");
        sb.append(this.j);
        sb.append(", uploadType=");
        sb.append(this.k);
        sb.append(", miniAppId=");
        sb.append(this.l);
        sb.append(", isOneTime=");
        sb.append(this.m);
        sb.append(", requestId=");
        sb.append(this.n);
        sb.append(", isSaveToDevice=");
        sb.append(this.o);
        sb.append(", narrativeIds=");
        sb.append(this.p);
        sb.append(", storyTeaserType=");
        return ho8.a(sb, this.q, ')');
    }

    public CommonUploadParams(UserId userId, boolean z, List list, UserId userId2, StoryEntryExtended storyEntryExtended, StorySharingInfo storySharingInfo, String str, MsgType msgType, String str2, StoryUploadType storyUploadType, Integer num, boolean z2, String str3, boolean z3, List list2, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? UserId.d : userId, (i & 2) != 0 ? false : z, (i & 4) != 0 ? EmptyList.b : list, (i & 8) != 0 ? UserId.d : userId2, (i & 16) != 0 ? null : storyEntryExtended, (i & 32) != 0 ? null : storySharingInfo, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : msgType, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? StoryUploadType.PUBLISH_WITH_RECEIVERS : storyUploadType, (i & 1024) != 0 ? null : num, (i & 2048) == 0 ? z2 : false, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? true : z3, (i & 16384) != 0 ? null : list2, (i & 32768) != 0 ? null : str4);
    }

    public CommonUploadParams(UserId userId, boolean z, List<Long> list, UserId userId2, StoryEntryExtended storyEntryExtended, StorySharingInfo storySharingInfo, String str, MsgType msgType, String str2, StoryUploadType storyUploadType, Integer num, boolean z2, String str3, boolean z3, List<Integer> list2, String str4) {
        this.b = userId;
        this.c = z;
        this.d = list;
        this.e = userId2;
        this.f = storyEntryExtended;
        this.g = storySharingInfo;
        this.h = str;
        this.i = msgType;
        this.j = str2;
        this.k = storyUploadType;
        this.l = num;
        this.m = z2;
        this.n = str3;
        this.o = z3;
        this.p = list2;
        this.q = str4;
    }

    public CommonUploadParams(Serializer serializer) {
        this((UserId) serializer.A(UserId.class.getClassLoader()), serializer.m(), rl3.t0(serializer.e()), (UserId) serializer.A(UserId.class.getClassLoader()), (StoryEntryExtended) serializer.G(StoryEntryExtended.class.getClassLoader()), (StorySharingInfo) serializer.G(StorySharingInfo.class.getClassLoader()), serializer.H(), (MsgType) serializer.G(MsgType.class.getClassLoader()), serializer.H(), (StoryUploadType) serializer.C(), serializer.v(), serializer.m(), serializer.H(), serializer.m(), serializer.d(), serializer.H());
    }
}
