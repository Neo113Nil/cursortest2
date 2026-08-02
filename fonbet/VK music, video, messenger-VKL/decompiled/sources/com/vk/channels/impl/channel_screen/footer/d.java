package com.vk.channels.impl.channel_screen.footer;

import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet;
import com.vk.channels.impl.channel_screen.footer.b;
import com.vk.channels.impl.channel_screen.footer.g;
import com.vk.channels.impl.channel_screen.footer.j;
import com.vk.channels.impl.channel_screen.footer.k;
import com.vk.channels.impl.channel_screen.footer.l;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.ChannelSource;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.observable.z;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1w;
import xsna.ad0;
import xsna.asu0;
import xsna.b40;
import xsna.bl6;
import xsna.c7b;
import xsna.di6;
import xsna.e43;
import xsna.epx;
import xsna.fkq0;
import xsna.gzs;
import xsna.ix2;
import xsna.ixa;
import xsna.j5g;
import xsna.m5;
import xsna.odb;
import xsna.s0b;
import xsna.s3q0;
import xsna.sv;
import xsna.sz;
import xsna.t34;
import xsna.tz;
import xsna.uj70;
import xsna.xuo0;
import xsna.z0b;

/* compiled from: ChannelFooterFeature.kt */
/* loaded from: classes16.dex */
public final class d extends di6<k, b, j, g> {
    public final f h;
    public final boolean i;
    public final io.reactivex.rxjava3.subjects.d<Channel> j;
    public final io.reactivex.rxjava3.subjects.f<ChannelActionInProgress> k;
    public io.reactivex.rxjava3.disposables.c l;

    /* compiled from: ChannelFooterFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ChannelType.values().length];
            try {
                iArr[ChannelType.COMMUNITY_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelType.PERSONAL_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChannelBanInfo.Reason.values().length];
            try {
                iArr2[ChannelBanInfo.Reason.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChannelBanInfo.Reason.SPAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChannelBanInfo.Reason.VERBAL_ABUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChannelBanInfo.Reason.STRONG_LANGUAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChannelBanInfo.Reason.FLOOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public d(ixa ixaVar, f fVar, boolean z) {
        super(k.c.a);
        this.h = fVar;
        this.i = z;
        io.reactivex.rxjava3.subjects.d<Channel> N0 = io.reactivex.rxjava3.subjects.d.N0();
        y a2 = ixaVar.a();
        bl6 bl6Var = new bl6(1, N0);
        a.n nVar = io.reactivex.rxjava3.internal.functions.a.e;
        i(a2, nVar, bl6Var);
        this.j = N0;
        io.reactivex.rxjava3.subjects.f<ChannelActionInProgress> fVar2 = new io.reactivex.rxjava3.subjects.f<>();
        this.k = fVar2;
        z zVar = new z(N0, new sv(new sz(this, 9), 11));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        i(new y(zVar, qVar, aVar), nVar, new tz(this, 7));
        i(new i0(new y(fVar2, qVar, aVar), new t34(new b40(4), 6)).a0(asu0.a.d()), nVar, new m5(this, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.di6
    public final void d(b bVar) {
        ChannelBanInfo channelBanInfo;
        ChannelSource channelSource;
        b bVar2 = bVar;
        io.reactivex.rxjava3.subjects.d<Channel> dVar = this.j;
        if (!(bVar2 instanceof b.c)) {
            if (bVar2.equals(b.d.b)) {
                m(new g.c(u()));
                return;
            }
            boolean z = true;
            Integer num = null;
            k s = null;
            if (bVar2 instanceof b.a) {
                if (g() instanceof k.e) {
                    return;
                }
                Channel P0 = dVar.P0();
                Object[] objArr = j5g.P(e43.l(MemberStatus.DECLINED_INVITATION, MemberStatus.INVITED, MemberStatus.INTERESTED, MemberStatus.UNKNOWN), P0 != null ? P0.D : null) && j5g.P(e43.l(GroupPrivacy.CLOSED, GroupPrivacy.PRIVATE), P0 != null ? P0.B : null);
                if (P0.z == ChannelType.COMMUNITY_CHANNEL && objArr != false) {
                    z = false;
                }
                if (((b.a) bVar2).b && z) {
                    s = k.b.a;
                } else {
                    Channel P02 = dVar.P0();
                    if (P02 != null) {
                        s = s(P02);
                    }
                }
                if (s != null) {
                    q(new ix2(s, 13));
                    return;
                }
                return;
            }
            if (!bVar2.equals(b.C0528b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z2 = this.i;
            Channel P03 = dVar.P0();
            if (P03 == null || (channelBanInfo = P03.C) == null) {
                return;
            }
            String str = channelBanInfo.b;
            if (str == null) {
                str = "";
            }
            int i = a.$EnumSwitchMapping$1[channelBanInfo.d.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    num = Integer.valueOf(R.string.vkim_channel_ban_reason_spam);
                } else if (i == 3) {
                    num = Integer.valueOf(R.string.vkim_channel_ban_reason_verbal_abuse);
                } else if (i == 4) {
                    num = Integer.valueOf(R.string.vkim_channel_ban_reason_strong_language);
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = Integer.valueOf(R.string.vkim_channel_ban_reason_flood);
                }
            }
            n(new j.a(channelBanInfo.e ? new BanReasonBottomSheet.Params.TemporaryBan(num, str, z2, channelBanInfo.c) : new BanReasonBottomSheet.Params.PermanentBan(num, str, z2)));
            return;
        }
        int i2 = ((b.c) bVar2).b;
        f fVar = this.h;
        switch (i2) {
            case 0:
                n(j.b.a);
                long u = u();
                a1w a1wVar = fVar.a;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                a1wVar.D(fVar, new odb(Collections.singletonList(Peer.a.b(u))));
                return;
            case 1:
                long u2 = u();
                ChannelEntryPoint channelEntryPoint = fVar.b;
                if (epx.f(channelEntryPoint, ChannelEntryPoint.Search.b)) {
                    channelSource = ChannelSource.Search.c;
                } else if (epx.f(channelEntryPoint, ChannelEntryPoint.SearchRecommendations.b)) {
                    channelSource = ChannelSource.Recommendations.c;
                } else if (epx.f(channelEntryPoint, ChannelEntryPoint.FeedRecommendations.b)) {
                    channelSource = ChannelSource.FeedRecommendations.c;
                } else if (epx.f(channelEntryPoint, ChannelEntryPoint.FolderRecommendations.b)) {
                    channelSource = ChannelSource.FolderRecommendations.c;
                } else if (channelEntryPoint instanceof ChannelEntryPoint.Global) {
                    channelSource = new ChannelSource.Global(((ChannelEntryPoint.Global) channelEntryPoint).b);
                } else if (epx.f(channelEntryPoint, ChannelEntryPoint.ShareInMessenger.b)) {
                    channelSource = ChannelSource.ShareInMessenger.c;
                } else {
                    if (channelEntryPoint != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    channelSource = ChannelSource.Channel.c;
                }
                a1w a1wVar2 = fVar.a;
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                a1wVar2.D(fVar, new s0b(Peer.a.b(u2), channelSource));
                return;
            case 2:
                n(j.e.a);
                long u3 = u();
                a1w a1wVar3 = fVar.a;
                Serializer.c<Peer> cVar3 = Peer.CREATOR;
                a1wVar3.D(fVar, new c7b(Peer.a.b(u3), new uj70.a(0L)));
                fVar.c.c(u3);
                return;
            case 3:
                n(j.f.a);
                long u4 = u();
                a1w a1wVar4 = fVar.a;
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                a1wVar4.D(fVar, new c7b(Peer.a.b(u4), uj70.b.a));
                fVar.c.a(u4);
                return;
            case 4:
                m(new g.b(u()));
                return;
            case 5:
                long u5 = u();
                a1w a1wVar5 = fVar.a;
                Serializer.c<Peer> cVar5 = Peer.CREATOR;
                a1wVar5.D(fVar, new z0b(Peer.a.b(u5)));
                return;
            case 6:
                Serializer.c<Peer> cVar6 = Peer.CREATOR;
                Channel P04 = dVar.P0();
                if (P04 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                long e = Peer.a.e(P04.A.d, Peer.Type.GROUP);
                gzs<s3q0> gzsVar = fkq0.a;
                m(new g.a(new UserId(e)));
                return;
            default:
                return;
        }
    }

    @Override // xsna.di6, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final k s(Channel channel) {
        l lVar;
        ChannelType channelType = channel.z;
        boolean z = channel.o;
        boolean z2 = channel.x;
        if (ad0.B(channelType) && z2 && z) {
            return k.e.a;
        }
        ChannelBanInfo channelBanInfo = channel.C;
        if (channelBanInfo != null) {
            boolean z3 = channelBanInfo.f;
            boolean z4 = this.i;
            return new k.a(z3 ? z4 ? R.string.vkim_channel_ban_footer_msg_forever_comminity : R.string.vkim_channel_ban_footer_msg_forever : z4 ? R.string.vkim_channel_ban_footer_msg_until_community : R.string.vkim_channel_ban_footer_msg_until, channelBanInfo.c, channelBanInfo.g || channelBanInfo.h);
        }
        ChannelType channelType2 = channel.z;
        GroupPrivacy groupPrivacy = channel.B;
        MemberStatus memberStatus = channel.D;
        if (z2 && z) {
            lVar = new l(4, new l.a.b(R.string.vkim_channel_create_message));
        } else {
            if (channel.t != ChannelActionInProgress.NONE) {
                lVar = new l(-1, l.a.C0529a.a);
            } else if (e43.l(MemberStatus.DECLINED_INVITATION, MemberStatus.INVITED, MemberStatus.INTERESTED, MemberStatus.UNKNOWN).contains(memberStatus) && e43.l(GroupPrivacy.CLOSED, GroupPrivacy.PRIVATE).contains(groupPrivacy) && channelType2 == ChannelType.COMMUNITY_CHANNEL) {
                lVar = new l(6, new l.a.b(R.string.vkim_open_channel));
            } else if (memberStatus == MemberStatus.REQUEST_SENT) {
                lVar = new l(5, new l.a.b(R.string.vkim_channel_cancel_member_request));
            } else if (!z) {
                int i = channelType2 != null ? a.$EnumSwitchMapping$0[channelType2.ordinal()] : -1;
                int i2 = R.string.vkapp_channels_join_to_channel_only;
                if (i != 1) {
                    if (i != 2) {
                        if (groupPrivacy != GroupPrivacy.CLOSED || memberStatus == MemberStatus.MEMBER) {
                            i2 = R.string.vkim_channels_join_to_channel;
                        }
                        i2 = R.string.vkim_channels_profile_action_send_request_vkapp;
                    }
                    lVar = new l(1, new l.a.b(i2));
                } else {
                    if (groupPrivacy != GroupPrivacy.CLOSED || memberStatus == MemberStatus.MEMBER) {
                        if (memberStatus != MemberStatus.MEMBER) {
                            i2 = R.string.vkapp_channels_join_to_channel_and_community;
                        }
                        lVar = new l(1, new l.a.b(i2));
                    }
                    i2 = R.string.vkim_channels_profile_action_send_request_vkapp;
                    lVar = new l(1, new l.a.b(i2));
                }
            } else if (channel.n) {
                lVar = new l(0, new l.a.b(R.string.vkim_channels_unarchive_channels));
            } else {
                xuo0.a.getClass();
                lVar = channel.Db(xuo0.a()) ? new l(3, new l.a.b(R.string.vkim_dialogs_list_option_notifications_on)) : new l(2, new l.a.b(R.string.vkim_dialogs_list_option_notifications_off));
            }
        }
        if (z2 && z) {
            r3 = true;
        }
        return new k.d(lVar, r3);
    }

    public final long u() {
        Channel P0 = this.j.P0();
        if (P0 != null) {
            return P0.b;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
