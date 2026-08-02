package com.vk.im.ui.components.viewcontrollers.msg_list.entry;

import android.content.Context;
import android.util.SparseArray;
import androidx.car.app.hardware.common.CarZone;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDeleted;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachMarketRejectInfo;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachUnsupported;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.attaches.Merchant;
import com.vk.dto.attaches.Product;
import com.vk.dto.attaches.Reaction;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.stereo.StereoRoom;
import com.vk.dto.stereo.a;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.attaches.AttachGroupCallFinished;
import com.vk.im.engine.models.attaches.AttachGroupCallInProgress;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachRoom;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.engine.models.attaches.VmojiAttach;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniAppButton;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.attaches.miniapp.UserStack;
import com.vk.im.engine.models.content.PodcastEpisode;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.MsgPartGroupCallHolderItem;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import defpackage.k0;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonToken;
import xsna.abi0;
import xsna.aeg;
import xsna.at30;
import xsna.av30;
import xsna.bh10;
import xsna.bpn0;
import xsna.bu00;
import xsna.bw30;
import xsna.c530;
import xsna.c5g;
import xsna.cau0;
import xsna.cp30;
import xsna.cq30;
import xsna.dr30;
import xsna.drm0;
import xsna.ds30;
import xsna.e530;
import xsna.eo30;
import xsna.epx;
import xsna.eq30;
import xsna.et30;
import xsna.fs30;
import xsna.fu30;
import xsna.g34;
import xsna.gr30;
import xsna.gtx0;
import xsna.hs30;
import xsna.i7o0;
import xsna.iq30;
import xsna.j3f0;
import xsna.j5g;
import xsna.jq30;
import xsna.jr30;
import xsna.js30;
import xsna.ju30;
import xsna.k9q0;
import xsna.kq30;
import xsna.kt30;
import xsna.lp30;
import xsna.lt30;
import xsna.lu30;
import xsna.myc0;
import xsna.nsr0;
import xsna.o040;
import xsna.o140;
import xsna.o25;
import xsna.pn;
import xsna.po30;
import xsna.pr30;
import xsna.qoy;
import xsna.qtd0;
import xsna.shy;
import xsna.so30;
import xsna.ssr0;
import xsna.t3w0;
import xsna.ucp;
import xsna.uk30;
import xsna.up2;
import xsna.vk30;
import xsna.vn30;
import xsna.vr30;
import xsna.wo30;
import xsna.ws30;
import xsna.xp30;
import xsna.xpm0;
import xsna.xr30;
import xsna.xuo0;
import xsna.yab;
import xsna.ys30;
import xsna.yt30;
import xsna.zdw;
import xsna.zh30;
import xsna.zo30;
import xsna.zr30;

/* compiled from: MsgAttachBuilder.kt */
/* loaded from: classes2.dex */
public final class a {
    public final o040 a = new o040();
    public final boolean b;

    /* compiled from: MsgAttachBuilder.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list.entry.a$a, reason: collision with other inner class name */
    public static final class C1170a {
        public final List<Attach> a;
        public final Msg b;
        public final NestedMsg c;
        public final int d;
        public final long e;
        public final boolean f;
        public final boolean g;
        public final uk30 h;

        public /* synthetic */ C1170a(List list, Msg msg, NestedMsg nestedMsg, int i, long j, boolean z, uk30 uk30Var, int i2) {
            this((List<? extends Attach>) list, msg, nestedMsg, i, (i2 & 16) != 0 ? 0L : j, (i2 & 32) == 0, (i2 & 64) != 0 ? true : z, uk30Var);
        }

        public static C1170a a(C1170a c1170a, List list) {
            return new C1170a((List<? extends Attach>) list, c1170a.b, c1170a.c, c1170a.d, c1170a.e, c1170a.f, c1170a.g, c1170a.h);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1170a)) {
                return false;
            }
            C1170a c1170a = (C1170a) obj;
            return epx.f(this.a, c1170a.a) && epx.f(this.b, c1170a.b) && epx.f(this.c, c1170a.c) && this.d == c1170a.d && this.e == c1170a.e && this.f == c1170a.f && this.g == c1170a.g && epx.f(this.h, c1170a.h);
        }

        public final int hashCode() {
            int a = pn.a(this.b, this.a.hashCode() * 31, 31);
            NestedMsg nestedMsg = this.c;
            return this.h.hashCode() + qoy.b(qoy.b(bh10.a(shy.a(this.d, (a + (nestedMsg == null ? 0 : nestedMsg.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            return "Args(attachList=" + this.a + ", parentMsg=" + this.b + ", parentNestedMsg=" + this.c + ", nestedLevel=" + this.d + ", scopeDate=" + this.e + ", inWallPost=" + this.f + ", isAllowShowTime=" + this.g + ", builderState=" + this.h + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1170a(List<? extends Attach> list, Msg msg, NestedMsg nestedMsg, int i, long j, boolean z, boolean z2, uk30 uk30Var) {
            this.a = list;
            this.b = msg;
            this.c = nestedMsg;
            this.d = i;
            this.e = j;
            this.f = z;
            this.g = z2;
            this.h = uk30Var;
        }
    }

    public a(cau0 cau0Var) {
        ImFeatures imFeatures = ImFeatures.BLUR_POST;
        imFeatures.getClass();
        this.b = com.vk.toggle.b.A.a(imFeatures);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A(Attach attach, List list) {
        boolean z;
        boolean z2;
        if (!(attach instanceof AttachImage)) {
            if (list.size() == 1) {
                if (attach instanceof AttachVideo) {
                    AttachVideo attachVideo = (AttachVideo) attach;
                    if (!attachVideo.isExternal() && !attachVideo.k()) {
                        z = true;
                    }
                }
                z = false;
            } else {
                z = attach instanceof AttachVideo;
            }
            if (!z && (!(attach instanceof AttachDoc) || !((AttachDoc) attach).i())) {
                if (attach instanceof AttachChannelStub) {
                    AttachChannelStub attachChannelStub = (AttachChannelStub) attach;
                    if (!attachChannelStub.n) {
                        z2 = attachChannelStub.o ? attachChannelStub.p : true;
                        if (z2) {
                            return false;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        return true;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof AttachChannelStub)) {
            return false;
        }
        AttachChannelStub attachChannelStub = (AttachChannelStub) obj;
        return attachChannelStub.l || attachChannelStub.m;
    }

    public static boolean C(AttachWithTranscription attachWithTranscription) {
        return attachWithTranscription.gb() && attachWithTranscription.I5() && attachWithTranscription.v7();
    }

    public static List D(List list) {
        SparseArray sparseArray = new SparseArray();
        List<Attach> list2 = list;
        if ((list2 instanceof List) && (list2 instanceof RandomAccess)) {
            List list3 = list2;
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                Attach attach = (Attach) list3.get(i);
                int z = z(attach);
                if (sparseArray.get(z) == null) {
                    sparseArray.put(z, new ArrayList());
                }
                ((List) sparseArray.get(z)).add(attach);
            }
        } else {
            for (Attach attach2 : list2) {
                int z2 = z(attach2);
                if (sparseArray.get(z2) == null) {
                    sparseArray.put(z2, new ArrayList());
                }
                ((List) sparseArray.get(z2)).add(attach2);
            }
        }
        if (sparseArray.size() <= 5) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.addAll((Collection) sparseArray.get(sparseArray.keyAt(i2)));
        }
        return j5g.O0(arrayList);
    }

    public static void b(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_APP_ACTION;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof MiniAppSnippetDataAttach) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static void c(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_ARTIST;
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_ARTIST_COMPACT;
        gtx0 gtx0Var = c1170a.b;
        List<Attach> list = c1170a.a;
        com.vk.im.engine.models.messages.a aVar = gtx0Var instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
        int i = 0;
        boolean z = c1170a.d != 0;
        boolean z2 = aVar != null && aVar.db();
        boolean z3 = aVar != null && aVar.E2();
        if (((aVar instanceof MsgFromUser) || (aVar instanceof MsgFromChannel)) && !z && !z2 && z3) {
            int size = list.size();
            while (i < size) {
                Attach attach = list.get(i);
                if (attach instanceof AttachArtist) {
                    arrayList.add(w(c1170a, adapterEntryType, attach, null));
                }
                i++;
            }
            return;
        }
        int size2 = list.size();
        while (i < size2) {
            Attach attach2 = list.get(i);
            if (attach2 instanceof AttachArtist) {
                arrayList.add(w(c1170a, adapterEntryType2, attach2, null));
            }
            i++;
        }
    }

    public static void f(ArrayList arrayList, C1170a c1170a) {
        gtx0 gtx0Var = c1170a.b;
        List<Attach> list = c1170a.a;
        com.vk.im.engine.models.messages.a aVar = gtx0Var instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
        int i = 0;
        boolean z = c1170a.d != 0;
        boolean z2 = aVar != null && aVar.db();
        boolean z3 = aVar != null && aVar.E2();
        if (z || z2 || !z3) {
            AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO_COMPACT;
            int size = list.size();
            while (i < size) {
                Attach attach = list.get(i);
                if ((attach instanceof AttachChannelStub) && ((AttachChannelStub) attach).n) {
                    arrayList.add(w(c1170a, adapterEntryType, attach, null));
                }
                i++;
            }
            return;
        }
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_AUDIO;
        int size2 = list.size();
        while (i < size2) {
            Attach attach2 = list.get(i);
            if ((attach2 instanceof AttachChannelStub) && ((AttachChannelStub) attach2).n) {
                arrayList.add(w(c1170a, adapterEntryType2, attach2, null));
            }
            i++;
        }
    }

    public static void g(ArrayList arrayList, C1170a c1170a) {
        List<Attach> list = c1170a.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Attach attach = list.get(i2);
            if (attach instanceof AttachChannelStub) {
                AttachChannelStub attachChannelStub = (AttachChannelStub) attach;
                if (attachChannelStub.o && attachChannelStub.p) {
                    i++;
                }
            }
        }
        if (i == 1) {
            AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC_PREVIEW;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Attach attach2 = list.get(i3);
                if (attach2 instanceof AttachChannelStub) {
                    AttachChannelStub attachChannelStub2 = (AttachChannelStub) attach2;
                    if (attachChannelStub2.o && attachChannelStub2.p) {
                        arrayList.add(w(c1170a, adapterEntryType, attach2, null));
                    }
                }
            }
        }
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC;
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Attach attach3 = list.get(i4);
            if (attach3 instanceof AttachChannelStub) {
                AttachChannelStub attachChannelStub3 = (AttachChannelStub) attach3;
                if (attachChannelStub3.o && !attachChannelStub3.p) {
                    arrayList.add(w(c1170a, adapterEntryType2, attach3, null));
                }
            }
        }
    }

    public static void h(ArrayList arrayList, C1170a c1170a) {
        List<Attach> list = c1170a.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Attach attach = list.get(i2);
            if (B(attach) || (attach instanceof AttachImage) || (attach instanceof AttachVideo)) {
                i++;
            }
        }
        if (i == 1) {
            AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_PHOTO_VIDEO;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Attach attach2 = list.get(i3);
                if (B(attach2)) {
                    arrayList.add(w(c1170a, adapterEntryType, attach2, null));
                }
            }
        }
    }

    public static void i(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_CURATOR;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof AttachCurator) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static final boolean j(Object obj) {
        if ((obj instanceof AttachDoc) && ((AttachDoc) obj).i()) {
            return true;
        }
        if (!(obj instanceof AttachChannelStub)) {
            return false;
        }
        AttachChannelStub attachChannelStub = (AttachChannelStub) obj;
        return attachChannelStub.o && attachChannelStub.p;
    }

    public static void k(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_DONUT_LINK;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof AttachDonutLink) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static void l(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_LINK_EXTERNAL_MARKET;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof AttachLink) {
                String str = ((AttachLink) attach).m;
                if (!(str == null || drm0.N(str)) && c1170a.d < 3) {
                    arrayList.add(w(c1170a, adapterEntryType, attach, null));
                }
            }
        }
    }

    public static void n(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_HIGHLIGHT;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if ((attach instanceof AttachHighlight) && ((AttachHighlight) attach).b.Ab()) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_TWO_ROW_SNIPPET;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Attach attach2 = list.get(i2);
            if ((attach2 instanceof AttachHighlight) && !((AttachHighlight) attach2).b.Ab()) {
                arrayList.add(w(c1170a, adapterEntryType2, attach2, null));
            }
        }
    }

    public static void o(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_MINI_APP;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof AttachMiniApp) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static void p(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_QUESTION;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof AttachQuestion) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static void q(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_ROOM;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof AttachRoom) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static void r(ArrayList arrayList, C1170a c1170a) {
        VmojiAttach vmojiAttach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_VMOJI_CHARACTER_LINK;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if ((attach instanceof AttachLink) && (vmojiAttach = ((AttachLink) attach).x) != null && !vmojiAttach.b) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static void s(ArrayList arrayList, C1170a c1170a) {
        VmojiAttach vmojiAttach;
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_VMOJI_PACK_LINK;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if ((attach instanceof AttachLink) && (vmojiAttach = ((AttachLink) attach).x) != null && vmojiAttach.b) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    public static void v(ArrayList arrayList, C1170a c1170a) {
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_WIDGET;
        List<Attach> list = c1170a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attach attach = list.get(i);
            if (attach instanceof AttachWidget) {
                arrayList.add(w(c1170a, adapterEntryType, attach, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0804 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0d15  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g w(C1170a c1170a, AdapterEntryType adapterEntryType, Attach attach, CharSequence charSequence) {
        String str;
        Integer valueOf;
        Integer valueOf2;
        String str2;
        Integer num;
        int i;
        Integer valueOf3;
        String str3;
        MsgPartGroupCallHolderItem.AttachGroupCallInProgressType attachGroupCallInProgressType;
        String str4;
        String str5;
        boolean z;
        int i2;
        ArrayList arrayList;
        Object[] objArr;
        String str6;
        bpn0 bpn0Var;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        ArrayList arrayList2;
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        List<ClickableSticker> list2;
        bpn0 bpn0Var2;
        UserId userId;
        zh30 zh30Var;
        String str7;
        String str8;
        kt30.a bVar;
        String str9;
        ImageList imageList;
        VerifyInfo q9;
        NestedMsg nestedMsg = c1170a.c;
        int i5 = c1170a.d;
        Msg msg = c1170a.b;
        uk30 uk30Var = c1170a.h;
        List<CallState> list3 = o140.a;
        vk30 vk30Var = uk30Var.a;
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar = uk30Var.h0;
        Peer peer = uk30Var.l;
        ProfilesInfo profilesInfo = uk30Var.e;
        int i6 = o140.a.$EnumSwitchMapping$0[adapterEntryType.ordinal()];
        str = "";
        if (i6 == 1) {
            return o140.y(msg, charSequence != null ? charSequence : "", i5, attach, null, uk30Var, 16);
        }
        if (i6 == 3) {
            return o140.l(i5, attach, msg, uk30Var);
        }
        if (i6 == 5) {
            AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL;
            lt30 lt30Var = new lt30((com.vk.im.engine.models.messages.a) msg, adapterEntryType2);
            lt30Var.d = attach;
            return o140.a(lt30Var, msg, null, adapterEntryType2, i5, null, null, false, nestedMsg, uk30Var, 224);
        }
        r11 = false;
        boolean z5 = false;
        switch (i6) {
            case 19:
                return o140.f(i5, attach, msg, charSequence == null ? "" : charSequence, uk30Var);
            case 20:
                return o140.s(attach, msg, nestedMsg, i5, uk30Var);
            case 21:
                return o140.e(AdapterEntryType.TYPE_AUDIO, attach, msg, nestedMsg, i5, uk30Var);
            case 22:
                return o140.e(AdapterEntryType.TYPE_AUDIO_COMPACT, attach, msg, nestedMsg, i5, uk30Var);
            case 23:
                return o140.B(attach, msg, nestedMsg, i5, uk30Var);
            case 24:
                return o140.k(attach, msg, nestedMsg, i5, uk30Var);
            case 25:
                return o140.v(adapterEntryType, attach, msg, nestedMsg, i5, uk30Var);
            case 26:
                return o140.v(adapterEntryType, attach, msg, nestedMsg, i5, uk30Var);
            case 27:
                return o140.D(attach, msg, nestedMsg, i5, uk30Var);
            case 28:
                return o140.C(attach, msg, nestedMsg, i5, uk30Var);
            case 29:
                return o140.n(attach, msg, nestedMsg, i5, uk30Var);
            case 30:
                return o140.r(attach, msg, nestedMsg, i5, uk30Var);
            case 31:
                return o140.x(attach, msg, nestedMsg, i5, uk30Var);
            case 32:
                return o140.A(attach, msg, nestedMsg, i5, uk30Var);
            case 33:
                return o140.u(attach, msg, nestedMsg, i5, uk30Var);
            case 34:
                return o140.o(attach, msg, nestedMsg, i5, charSequence, uk30Var);
            case 35:
                return o140.G(attach, msg, nestedMsg, i5, uk30Var);
            case 36:
                return o140.J(i5, attach, msg, charSequence == null ? "" : charSequence, uk30Var);
            case 37:
                return o140.F(i5, attach, msg, uk30Var);
            case 38:
                return o140.E(attach, msg, nestedMsg, i5, uk30Var);
            case 39:
                return o140.I(attach, msg, nestedMsg, i5, uk30Var);
            case 40:
                return o140.H(i5, attach, msg, uk30Var);
            case 41:
                return o140.i(i5, attach, msg, uk30Var);
            case 42:
                return o140.h(i5, attach, msg, uk30Var);
            case 43:
                return o140.m(i5, attach, msg, uk30Var);
            case 44:
                return o140.z(attach, msg, nestedMsg, i5, uk30Var);
            case 45:
                return o140.j(attach, msg, nestedMsg, i5, uk30Var);
            case 46:
                return o140.g(attach, msg, nestedMsg, i5, uk30Var);
            case 47:
                return o140.q(attach, msg, nestedMsg, i5, uk30Var);
            case 48:
                return o140.p(attach, msg, nestedMsg, i5, uk30Var);
            case 49:
                AttachLink attachLink = (AttachLink) attach;
                AdapterEntryType adapterEntryType3 = AdapterEntryType.TYPE_LINK_EXTERNAL_MARKET;
                eq30 eq30Var = new eq30(new jr30(0), i5, attachLink.g, attachLink.f, attachLink.n, attachLink.i, attachLink.m, attachLink.k, attachLink.l, adapterEntryType3, null);
                eq30Var.n = msg;
                eq30Var.o = nestedMsg;
                eq30Var.m = attach;
                return o140.a(eq30Var, msg, attach, adapterEntryType3, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 50:
                AttachLink attachLink2 = (AttachLink) attach;
                AdapterEntryType adapterEntryType4 = AdapterEntryType.TYPE_LINK_PRODUCT;
                ImageList imageList2 = attachLink2.i;
                String str10 = attachLink2.f;
                String str11 = attachLink2.o;
                float f = attachLink2.k;
                Product product = attachLink2.w;
                Merchant merchant = product != null ? product.g : null;
                int i7 = product != null ? product.e : 0;
                int i8 = product != null ? product.b : 0;
                int i9 = product != null ? product.d : 0;
                String str12 = product != null ? product.c : null;
                pr30 pr30Var = new pr30(new jr30(0), i5, str10, str11, imageList2, f, merchant, i7, i8, i9, str12 != null ? str12 : "", adapterEntryType4, null);
                pr30Var.o = msg;
                pr30Var.p = nestedMsg;
                pr30Var.q = attach;
                return o140.a(pr30Var, msg, attach, adapterEntryType4, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 51:
                AttachMarket attachMarket = (AttachMarket) attach;
                c530 d = e530.d(attachMarket);
                boolean z6 = d.c;
                AttachMarketRejectInfo attachMarketRejectInfo = attachMarket.o;
                AdapterEntryType adapterEntryType5 = AdapterEntryType.TYPE_MARKET_SMALL;
                String str13 = attachMarket.f;
                boolean z7 = d.b;
                if (z7) {
                    if (attachMarketRejectInfo != null && attachMarketRejectInfo.g) {
                        valueOf = Integer.valueOf(R.drawable.vk_icon_clock_outline_16);
                    } else if (z6 || attachMarketRejectInfo != null) {
                        valueOf = Integer.valueOf(R.drawable.vk_icon_error_circle_outline_16);
                    }
                    if (z7) {
                        if (attachMarketRejectInfo != null && attachMarketRejectInfo.g) {
                            valueOf2 = Integer.valueOf(R.attr.vk_ui_accent_gray);
                        } else if (z6) {
                            valueOf2 = Integer.valueOf(R.attr.vk_ui_accent_red);
                        } else if (attachMarketRejectInfo != null) {
                            valueOf2 = Integer.valueOf(R.attr.vk_ui_accent_orange);
                        }
                        str2 = str13;
                        num = valueOf2;
                        zr30 zr30Var = new zr30(new jr30(0), i5, str2, valueOf, num, adapterEntryType5, null);
                        zr30Var.i = msg;
                        zr30Var.j = nestedMsg;
                        zr30Var.k = attach;
                        return o140.a(zr30Var, msg, attach, adapterEntryType5, i5, null, null, false, nestedMsg, uk30Var, 224);
                    }
                    str2 = str13;
                    num = null;
                    zr30 zr30Var2 = new zr30(new jr30(0), i5, str2, valueOf, num, adapterEntryType5, null);
                    zr30Var2.i = msg;
                    zr30Var2.j = nestedMsg;
                    zr30Var2.k = attach;
                    return o140.a(zr30Var2, msg, attach, adapterEntryType5, i5, null, null, false, nestedMsg, uk30Var, 224);
                }
                valueOf = null;
                if (z7) {
                }
                str2 = str13;
                num = null;
                zr30 zr30Var22 = new zr30(new jr30(0), i5, str2, valueOf, num, adapterEntryType5, null);
                zr30Var22.i = msg;
                zr30Var22.j = nestedMsg;
                zr30Var22.k = attach;
                return o140.a(zr30Var22, msg, attach, adapterEntryType5, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 52:
                Integer num2 = null;
                AttachMarket attachMarket2 = (AttachMarket) attach;
                c530 d2 = e530.d(attachMarket2);
                boolean z8 = d2.c;
                boolean z9 = d2.b;
                AttachMarketRejectInfo attachMarketRejectInfo2 = attachMarket2.o;
                String str14 = attachMarket2.n.length() > 0 ? attachMarket2.n : attachMarket2.l;
                AdapterEntryType adapterEntryType6 = AdapterEntryType.TYPE_MARKET_LARGE;
                ImageList imageList3 = attachMarket2.q;
                String str15 = attachMarket2.f;
                String str16 = attachMarket2.m;
                if (z9) {
                    i = R.attr.vk_ui_accent_gray;
                    num2 = (attachMarketRejectInfo2 == null || !attachMarketRejectInfo2.g) ? (z8 || attachMarketRejectInfo2 != null) ? Integer.valueOf(R.drawable.vk_icon_error_circle_outline_16) : null : Integer.valueOf(R.drawable.vk_icon_clock_outline_16);
                } else {
                    i = R.attr.vk_ui_accent_gray;
                }
                if (z9) {
                    if (attachMarketRejectInfo2 != null && attachMarketRejectInfo2.g) {
                        valueOf3 = Integer.valueOf(i);
                    } else if (z8) {
                        valueOf3 = Integer.valueOf(R.attr.vk_ui_accent_red);
                    } else if (attachMarketRejectInfo2 != null) {
                        valueOf3 = Integer.valueOf(R.attr.vk_ui_accent_orange);
                    }
                    str3 = str14;
                    xr30 xr30Var = new xr30(new jr30(0), uk30Var.N, i5, d2, imageList3, str15, str3, str16, num2, valueOf3, adapterEntryType6, null);
                    xr30Var.n = msg;
                    xr30Var.o = nestedMsg;
                    xr30Var.p = attach;
                    return o140.a(xr30Var, msg, attach, adapterEntryType6, i5, null, null, false, nestedMsg, uk30Var, 224);
                }
                str3 = str14;
                valueOf3 = null;
                xr30 xr30Var2 = new xr30(new jr30(0), uk30Var.N, i5, d2, imageList3, str15, str3, str16, num2, valueOf3, adapterEntryType6, null);
                xr30Var2.n = msg;
                xr30Var2.o = nestedMsg;
                xr30Var2.p = attach;
                return o140.a(xr30Var2, msg, attach, adapterEntryType6, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 53:
                AdapterEntryType adapterEntryType7 = AdapterEntryType.TYPE_MARKET_BLOCKED;
                vr30 vr30Var = new vr30(new jr30(0), i5, adapterEntryType7, null);
                vr30Var.f = attach;
                return o140.a(vr30Var, msg, attach, adapterEntryType7, i5, null, null, false, null, uk30Var, 480);
            case 54:
                AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach;
                AdapterEntryType adapterEntryType8 = AdapterEntryType.TYPE_AUDIOMSG;
                NestedMsg nestedMsg2 = nestedMsg == null ? msg : nestedMsg;
                boolean z10 = nestedMsg != null;
                MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
                eo30 eo30Var = new eo30(new jr30(0), uk30Var.K, i5, adapterEntryType8, null, nestedMsg2, z10, msgFromUser != null && msgFromUser.cc(), attachAudioMsg.o, b.a(msg, uk30Var.l), attachAudioMsg.b, attachAudioMsg.f, uk30Var.F, attachAudioMsg.g, attachAudioMsg.m);
                eo30Var.q = msg;
                eo30Var.r = nestedMsg;
                eo30Var.s = attach;
                return o140.a(eo30Var, msg, attach, adapterEntryType8, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 55:
                AttachWithTranscription attachWithTranscription = (AttachWithTranscription) attach;
                AdapterEntryType adapterEntryType9 = AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT;
                hs30 hs30Var = new hs30(msg.b, attachWithTranscription.I5(), attachWithTranscription.J3(), attachWithTranscription.l3(), attachWithTranscription.Y4(), attachWithTranscription.u1(), attach instanceof AttachVideoMsg, adapterEntryType9);
                hs30Var.j = attach;
                return o140.a(hs30Var, msg, attach, adapterEntryType9, i5, null, null, false, null, uk30Var, 480);
            case 56:
                AttachWithTranscription attachWithTranscription2 = (AttachWithTranscription) attach;
                AdapterEntryType adapterEntryType10 = AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT;
                hs30 hs30Var2 = new hs30(msg.b, attachWithTranscription2.I5(), attachWithTranscription2.J3(), attachWithTranscription2.l3(), attachWithTranscription2.Y4(), attachWithTranscription2.u1(), attach instanceof AttachVideoMsg, adapterEntryType10);
                hs30Var2.j = attach;
                return o140.a(hs30Var2, msg, attach, adapterEntryType10, i5, null, null, false, null, uk30Var, 480);
            case 57:
                AttachWithTranscription attachWithTranscription3 = (AttachWithTranscription) attach;
                AdapterEntryType adapterEntryType11 = AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE;
                js30 js30Var = new js30(uk30Var.q, uk30Var.G.c(), uk30Var.l, uk30Var.y, uk30Var.z, uk30Var.h, uk30Var.j, uk30Var.H, attachWithTranscription3.b3(), attachWithTranscription3.v7(), attachWithTranscription3.L6() == Reaction.DISLIKE, msg, adapterEntryType11);
                js30Var.o = attach;
                return o140.a(js30Var, msg, attach, adapterEntryType11, i5, null, null, false, null, uk30Var, 480);
            case 58:
                AttachGraffiti attachGraffiti = (AttachGraffiti) attach;
                AdapterEntryType adapterEntryType12 = AdapterEntryType.TYPE_GRAFFITI;
                dr30 dr30Var = new dr30(i5, new jr30(0), b.a(msg, peer), uk30Var.P, attachGraffiti.g, attachGraffiti.f, attachGraffiti.b, msg.b, adapterEntryType12, null, uk30Var.V);
                dr30Var.m = msg;
                dr30Var.n = nestedMsg;
                dr30Var.o = attach;
                return o140.a(dr30Var, msg, attach, adapterEntryType12, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 59:
                return o140.t(AdapterEntryType.TYPE_PLAYLIST, attach, msg, nestedMsg, i5, uk30Var);
            case 60:
                return o140.t(AdapterEntryType.TYPE_PLAYLIST_COMPACT, attach, msg, nestedMsg, i5, uk30Var);
            case 61:
                AttachArticle attachArticle = (AttachArticle) attach;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b = Peer.a.b(attachArticle.d.b);
                AdapterEntryType adapterEntryType13 = AdapterEntryType.TYPE_ARTICLE;
                boolean equals = "available".equals(attachArticle.f);
                boolean equals2 = "banned".equals(attachArticle.f);
                boolean equals3 = "protected".equals(attachArticle.f);
                boolean equals4 = "paid".equals(attachArticle.f);
                boolean equals5 = "deleted".equals(attachArticle.f);
                String str17 = attachArticle.g;
                ArticleDonut articleDonut = attachArticle.r;
                vn30 vn30Var = new vn30(new jr30(0), uk30Var.e.Bb(b), i5, adapterEntryType13, null, equals, equals2, equals3, equals4, equals5, str17, articleDonut != null ? articleDonut.c : null, attachArticle.n, b);
                vn30Var.p = msg;
                vn30Var.q = nestedMsg;
                vn30Var.r = attach;
                return o140.a(vn30Var, msg, attach, adapterEntryType13, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 62:
                vk30 vk30Var2 = uk30Var.a;
                AttachCall attachCall = (AttachCall) attach;
                if (aVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Context context = aVar.a;
                boolean z11 = msg.i && o140.a.contains(attachCall.e);
                if (attachCall.i && z11 && uk30Var.D) {
                    BubbleColors c = vk30Var2.c(0L, true, false);
                    BubbleColors c2 = vk30Var2.c(0L, true, true);
                    return new ssr0(context.getString(R.string.vkim_msg_list_call_missed), context.getString(R.string.vkim_msg_list_call_snippet_description), context.getString(R.string.vkim_msg_list_call_snippet_button), true, c, c2, vk30Var2.b(c2, 0, false).a, vk30Var2.b(c, 0, false).a, AdapterEntryType.TYPE_CALL_SETTINGS_SNIPPET, msg.g);
                }
                AdapterEntryType adapterEntryType14 = AdapterEntryType.TYPE_CALL;
                po30 po30Var = new po30(new jr30(0), uk30Var.l, i5, epx.f(attachCall.f, peer), attachCall.h, attachCall.g, attachCall.e, adapterEntryType14, null);
                po30Var.k = msg;
                po30Var.l = nestedMsg;
                po30Var.m = attach;
                return o140.a(po30Var, msg, attach, adapterEntryType14, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 63:
                AttachGroupCall attachGroupCall = (AttachGroupCall) attach;
                CallState callState = CallState.DONE;
                MsgPartGroupCallHolderItem.AttachGroupCallInProgressType attachGroupCallInProgressType2 = MsgPartGroupCallHolderItem.AttachGroupCallInProgressType.Unknown;
                List<Long> list4 = attachGroupCall.B6().b;
                int i10 = attachGroupCall.B6().c;
                if (attach instanceof AttachGroupCallInProgress) {
                    MsgPartGroupCallHolderItem.AttachGroupCallInProgressType attachGroupCallInProgressType3 = MsgPartGroupCallHolderItem.AttachGroupCallInProgressType.AttachGroupCallInProgress;
                    AttachGroupCallInProgress attachGroupCallInProgress = (AttachGroupCallInProgress) attach;
                    String str18 = attachGroupCallInProgress.g;
                    str5 = attachGroupCallInProgress.h;
                    attachGroupCallInProgressType = attachGroupCallInProgressType3;
                    str4 = str18;
                } else {
                    if (attach instanceof AttachGroupCallFinished) {
                        MsgPartGroupCallHolderItem.AttachGroupCallInProgressType attachGroupCallInProgressType4 = MsgPartGroupCallHolderItem.AttachGroupCallInProgressType.AttachGroupCallFinished;
                        AttachGroupCallFinished attachGroupCallFinished = (AttachGroupCallFinished) attach;
                        boolean f2 = epx.f(attachGroupCallFinished.f, peer);
                        int i11 = attachGroupCallFinished.h;
                        callState = attachGroupCallFinished.g;
                        z = f2;
                        attachGroupCallInProgressType = attachGroupCallInProgressType4;
                        i2 = i11;
                        str4 = null;
                        str5 = null;
                        AdapterEntryType adapterEntryType15 = AdapterEntryType.TYPE_GROUP_CALL;
                        MsgPartGroupCallHolderItem msgPartGroupCallHolderItem = new MsgPartGroupCallHolderItem(new jr30(0), uk30Var.l, uk30Var.S, i5, str4, str5, list4, z, i2, callState, i10, attachGroupCallInProgressType, adapterEntryType15, null);
                        msgPartGroupCallHolderItem.p = msg;
                        msgPartGroupCallHolderItem.q = nestedMsg;
                        msgPartGroupCallHolderItem.r = attach;
                        return o140.a(msgPartGroupCallHolderItem, msg, attach, adapterEntryType15, i5, null, null, false, nestedMsg, uk30Var, 224);
                    }
                    attachGroupCallInProgressType = attachGroupCallInProgressType2;
                    str4 = null;
                    str5 = null;
                }
                z = false;
                i2 = 0;
                AdapterEntryType adapterEntryType152 = AdapterEntryType.TYPE_GROUP_CALL;
                MsgPartGroupCallHolderItem msgPartGroupCallHolderItem2 = new MsgPartGroupCallHolderItem(new jr30(0), uk30Var.l, uk30Var.S, i5, str4, str5, list4, z, i2, callState, i10, attachGroupCallInProgressType, adapterEntryType152, null);
                msgPartGroupCallHolderItem2.p = msg;
                msgPartGroupCallHolderItem2.q = nestedMsg;
                msgPartGroupCallHolderItem2.r = attach;
                return o140.a(msgPartGroupCallHolderItem2, msg, attach, adapterEntryType152, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 64:
                AttachStory attachStory = (AttachStory) attach;
                AdapterEntryType adapterEntryType16 = AdapterEntryType.TYPE_NESTED_STORY;
                ImageList imageList4 = attachStory.e;
                bpn0 bpn0Var3 = attachStory.k;
                ImageList imageList5 = attachStory.f;
                int i12 = attachStory.c;
                StoryEntry storyEntry = attachStory.b;
                boolean z12 = storyEntry.i0;
                AttachSyncState attachSyncState = attachStory.d;
                boolean Jb = msg.Jb(peer);
                Peer peer2 = (Peer) bpn0Var3.getValue();
                boolean z13 = storyEntry.k;
                boolean z14 = storyEntry.B;
                boolean z15 = storyEntry.C;
                xuo0.a.getClass();
                boolean i13 = attachStory.i(xuo0.a());
                boolean z16 = msg instanceof MsgFromUser;
                MsgFromUser msgFromUser2 = z16 ? (MsgFromUser) msg : null;
                int size = (msgFromUser2 == null || (arrayList = msgFromUser2.H) == null) ? 0 : arrayList.size();
                int i14 = storyEntry.n0;
                UserId userId2 = storyEntry.d;
                MsgFromUser msgFromUser3 = z16 ? (MsgFromUser) msg : null;
                String str19 = msgFromUser3 != null ? msgFromUser3.F : null;
                yt30 yt30Var = new yt30(uk30Var.q, profilesInfo.Bb(msg.getFrom()), profilesInfo.Bb((Peer) bpn0Var3.getValue()), uk30Var.P, i5, adapterEntryType16, imageList5, imageList4, i12, z12, attachSyncState, Jb, peer2, msg.getFrom(), z13, z14, z15, userId2, i13, i14, size, str19 == null ? "" : str19, msg.b, attachStory.b(peer, xuo0.a()), uk30Var.V, false);
                yt30Var.E = msg;
                yt30Var.F = nestedMsg;
                yt30Var.G = attach;
                return o140.a(yt30Var, msg, attach, adapterEntryType16, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 65:
                AttachStory attachStory2 = (AttachStory) attach;
                StoryEntry storyEntry2 = attachStory2.b;
                bpn0 bpn0Var4 = attachStory2.k;
                if (msg instanceof t3w0) {
                    List<Attach> K0 = ((t3w0) msg).K0();
                    if (!(K0 instanceof Collection) || !K0.isEmpty()) {
                        Iterator<T> it = K0.iterator();
                        while (it.hasNext()) {
                            if (((Attach) it.next()) instanceof AttachSticker) {
                                objArr = true;
                                if (storyEntry2.q && storyEntry2.D && (clickableStickers = storyEntry2.X) != null && (list = clickableStickers.d) != null) {
                                    list2 = list;
                                    if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                        for (ClickableSticker clickableSticker : list2) {
                                            ClickableMention clickableMention = clickableSticker instanceof ClickableMention ? (ClickableMention) clickableSticker : null;
                                            if (clickableMention == null || (userId = clickableMention.e) == null) {
                                                str6 = str;
                                                bpn0Var2 = bpn0Var4;
                                            } else {
                                                bpn0Var2 = bpn0Var4;
                                                str6 = str;
                                                if (userId.b == peer.d) {
                                                    bpn0Var = bpn0Var2;
                                                    z2 = true;
                                                    AdapterEntryType adapterEntryType17 = AdapterEntryType.TYPE_STORY;
                                                    ImageList imageList6 = attachStory2.e;
                                                    ImageList imageList7 = attachStory2.f;
                                                    int i15 = attachStory2.c;
                                                    boolean z17 = storyEntry2.i0;
                                                    AttachSyncState attachSyncState2 = attachStory2.d;
                                                    boolean Jb2 = msg.Jb(peer);
                                                    Peer peer3 = (Peer) bpn0Var.getValue();
                                                    boolean z18 = storyEntry2.k;
                                                    boolean z19 = storyEntry2.B;
                                                    boolean z20 = storyEntry2.C;
                                                    xuo0.a.getClass();
                                                    z3 = z2;
                                                    bpn0 bpn0Var5 = bpn0Var;
                                                    boolean i16 = attachStory2.i(xuo0.a());
                                                    boolean z21 = msg instanceof MsgFromUser;
                                                    MsgFromUser msgFromUser4 = z21 ? (MsgFromUser) msg : null;
                                                    int size2 = (msgFromUser4 != null || (arrayList2 = msgFromUser4.H) == null) ? 0 : arrayList2.size();
                                                    int i17 = storyEntry2.n0;
                                                    UserId userId3 = storyEntry2.d;
                                                    MsgFromUser msgFromUser5 = z21 ? (MsgFromUser) msg : null;
                                                    String str20 = msgFromUser5 != null ? msgFromUser5.F : null;
                                                    String str21 = str20 == null ? str6 : str20;
                                                    boolean b2 = attachStory2.b(peer, xuo0.a());
                                                    i3 = msg.b;
                                                    Peer from = msg.getFrom();
                                                    qtd0 Bb = profilesInfo.Bb(msg.getFrom());
                                                    qtd0 Bb2 = profilesInfo.Bb((Peer) bpn0Var5.getValue());
                                                    boolean z22 = uk30Var.q;
                                                    abi0 abi0Var = uk30Var.V;
                                                    Object[] objArr2 = objArr;
                                                    g34 g34Var = uk30Var.P;
                                                    if (z3 || objArr2 == true) {
                                                        i4 = i3;
                                                    } else {
                                                        i4 = i3;
                                                        if (uk30Var.G.c().H()) {
                                                            z4 = true;
                                                            yt30 yt30Var2 = new yt30(z22, Bb, Bb2, g34Var, i5, adapterEntryType17, imageList7, imageList6, i15, z17, attachSyncState2, Jb2, peer3, from, z18, z19, z20, userId3, i16, i17, size2, str21, i4, b2, abi0Var, z4);
                                                            yt30Var2.E = msg;
                                                            yt30Var2.F = nestedMsg;
                                                            yt30Var2.G = attach;
                                                            return o140.a(yt30Var2, msg, attach, adapterEntryType17, i5, null, null, false, nestedMsg, uk30Var, 224);
                                                        }
                                                    }
                                                    z4 = false;
                                                    yt30 yt30Var22 = new yt30(z22, Bb, Bb2, g34Var, i5, adapterEntryType17, imageList7, imageList6, i15, z17, attachSyncState2, Jb2, peer3, from, z18, z19, z20, userId3, i16, i17, size2, str21, i4, b2, abi0Var, z4);
                                                    yt30Var22.E = msg;
                                                    yt30Var22.F = nestedMsg;
                                                    yt30Var22.G = attach;
                                                    return o140.a(yt30Var22, msg, attach, adapterEntryType17, i5, null, null, false, nestedMsg, uk30Var, 224);
                                                }
                                            }
                                            bpn0Var4 = bpn0Var2;
                                            str = str6;
                                        }
                                    }
                                }
                                str6 = str;
                                bpn0Var = bpn0Var4;
                                z2 = false;
                                AdapterEntryType adapterEntryType172 = AdapterEntryType.TYPE_STORY;
                                ImageList imageList62 = attachStory2.e;
                                ImageList imageList72 = attachStory2.f;
                                int i152 = attachStory2.c;
                                boolean z172 = storyEntry2.i0;
                                AttachSyncState attachSyncState22 = attachStory2.d;
                                boolean Jb22 = msg.Jb(peer);
                                Peer peer32 = (Peer) bpn0Var.getValue();
                                boolean z182 = storyEntry2.k;
                                boolean z192 = storyEntry2.B;
                                boolean z202 = storyEntry2.C;
                                xuo0.a.getClass();
                                z3 = z2;
                                bpn0 bpn0Var52 = bpn0Var;
                                boolean i162 = attachStory2.i(xuo0.a());
                                boolean z212 = msg instanceof MsgFromUser;
                                if (z212) {
                                }
                                if (msgFromUser4 != null) {
                                }
                                int i172 = storyEntry2.n0;
                                UserId userId32 = storyEntry2.d;
                                if (z212) {
                                }
                                if (msgFromUser5 != null) {
                                }
                                if (str20 == null) {
                                }
                                boolean b22 = attachStory2.b(peer, xuo0.a());
                                i3 = msg.b;
                                Peer from2 = msg.getFrom();
                                qtd0 Bb3 = profilesInfo.Bb(msg.getFrom());
                                qtd0 Bb22 = profilesInfo.Bb((Peer) bpn0Var52.getValue());
                                boolean z222 = uk30Var.q;
                                abi0 abi0Var2 = uk30Var.V;
                                Object[] objArr22 = objArr;
                                g34 g34Var2 = uk30Var.P;
                                if (z3) {
                                }
                                i4 = i3;
                                z4 = false;
                                yt30 yt30Var222 = new yt30(z222, Bb3, Bb22, g34Var2, i5, adapterEntryType172, imageList72, imageList62, i152, z172, attachSyncState22, Jb22, peer32, from2, z182, z192, z202, userId32, i162, i172, size2, str21, i4, b22, abi0Var2, z4);
                                yt30Var222.E = msg;
                                yt30Var222.F = nestedMsg;
                                yt30Var222.G = attach;
                                return o140.a(yt30Var222, msg, attach, adapterEntryType172, i5, null, null, false, nestedMsg, uk30Var, 224);
                            }
                        }
                    }
                }
                objArr = false;
                if (storyEntry2.q) {
                    list2 = list;
                    if (list2 instanceof Collection) {
                    }
                    while (r14.hasNext()) {
                    }
                }
                str6 = str;
                bpn0Var = bpn0Var4;
                z2 = false;
                AdapterEntryType adapterEntryType1722 = AdapterEntryType.TYPE_STORY;
                ImageList imageList622 = attachStory2.e;
                ImageList imageList722 = attachStory2.f;
                int i1522 = attachStory2.c;
                boolean z1722 = storyEntry2.i0;
                AttachSyncState attachSyncState222 = attachStory2.d;
                boolean Jb222 = msg.Jb(peer);
                Peer peer322 = (Peer) bpn0Var.getValue();
                boolean z1822 = storyEntry2.k;
                boolean z1922 = storyEntry2.B;
                boolean z2022 = storyEntry2.C;
                xuo0.a.getClass();
                z3 = z2;
                bpn0 bpn0Var522 = bpn0Var;
                boolean i1622 = attachStory2.i(xuo0.a());
                boolean z2122 = msg instanceof MsgFromUser;
                if (z2122) {
                }
                if (msgFromUser4 != null) {
                }
                int i1722 = storyEntry2.n0;
                UserId userId322 = storyEntry2.d;
                if (z2122) {
                }
                if (msgFromUser5 != null) {
                }
                if (str20 == null) {
                }
                boolean b222 = attachStory2.b(peer, xuo0.a());
                i3 = msg.b;
                Peer from22 = msg.getFrom();
                qtd0 Bb32 = profilesInfo.Bb(msg.getFrom());
                qtd0 Bb222 = profilesInfo.Bb((Peer) bpn0Var522.getValue());
                boolean z2222 = uk30Var.q;
                abi0 abi0Var22 = uk30Var.V;
                Object[] objArr222 = objArr;
                g34 g34Var22 = uk30Var.P;
                if (z3) {
                }
                i4 = i3;
                z4 = false;
                yt30 yt30Var2222 = new yt30(z2222, Bb32, Bb222, g34Var22, i5, adapterEntryType1722, imageList722, imageList622, i1522, z1722, attachSyncState222, Jb222, peer322, from22, z1822, z1922, z2022, userId322, i1622, i1722, size2, str21, i4, b222, abi0Var22, z4);
                yt30Var2222.E = msg;
                yt30Var2222.F = nestedMsg;
                yt30Var2222.G = attach;
                return o140.a(yt30Var2222, msg, attach, adapterEntryType1722, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 66:
                AttachPoll attachPoll = (AttachPoll) attach;
                boolean z23 = (msg instanceof MsgFromUser) || (msg instanceof MsgFromChannel);
                AdapterEntryType adapterEntryType18 = AdapterEntryType.TYPE_POLL;
                at30 at30Var = new at30(false, false, i5, false, uk30Var.l, k9q0.n(msg), attachPoll.d, msg.b, z23, false, false, adapterEntryType18, uk30Var.V, uk30Var.a0);
                at30Var.p = msg;
                at30Var.q = nestedMsg;
                at30Var.r = attach;
                return o140.a(at30Var, msg, attach, adapterEntryType18, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 67:
                AttachPodcastEpisode attachPodcastEpisode = (AttachPodcastEpisode) attach;
                AdapterEntryType adapterEntryType19 = AdapterEntryType.TYPE_PODCAST_EPISODE;
                boolean e = attachPodcastEpisode.e();
                boolean d3 = attachPodcastEpisode.d();
                PodcastEpisode podcastEpisode = attachPodcastEpisode.d;
                LinkButton linkButton = podcastEpisode.h;
                String str22 = linkButton != null ? linkButton.b : null;
                Image image = podcastEpisode.i;
                List list5 = image != null ? image.b : null;
                if (list5 == null) {
                    list5 = EmptyList.b;
                }
                List list6 = list5;
                String str23 = podcastEpisode.g;
                String str24 = podcastEpisode.e;
                ws30 ws30Var = new ws30(new jr30(0), i5, e, d3, str22, list6, str23, str24 == null ? "" : str24, adapterEntryType19, null);
                ws30Var.l = msg;
                ws30Var.m = nestedMsg;
                ws30Var.n = attach;
                return o140.a(ws30Var, msg, attach, adapterEntryType19, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 68:
                AdapterEntryType adapterEntryType20 = AdapterEntryType.TYPE_PODCAST_EPISODE_RESTRICTED;
                ys30 ys30Var = new ys30(new jr30(0), i5, adapterEntryType20, null);
                ys30Var.f = attach;
                return o140.a(ys30Var, msg, attach, adapterEntryType20, i5, null, null, false, null, uk30Var, 480);
            case 69:
                return o140.d(AdapterEntryType.TYPE_ARTIST, attach, msg, nestedMsg, i5, uk30Var);
            case 70:
                return o140.d(AdapterEntryType.TYPE_ARTIST_COMPACT, attach, msg, nestedMsg, i5, uk30Var);
            case 71:
                AttachEvent attachEvent = (AttachEvent) attach;
                AdapterEntryType adapterEntryType21 = AdapterEntryType.TYPE_EVENT;
                ImageList imageList8 = attachEvent.h;
                String str25 = attachEvent.e;
                String str26 = str25 == null ? "" : str25;
                long j = attachEvent.f;
                String str27 = attachEvent.g;
                cq30 cq30Var = new cq30(new jr30(0), i5, imageList8, str26, j, str27 == null ? "" : str27, adapterEntryType21, null);
                cq30Var.j = msg;
                cq30Var.k = nestedMsg;
                cq30Var.l = attach;
                return o140.a(cq30Var, msg, attach, adapterEntryType21, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 72:
                AttachMiniApp attachMiniApp = (AttachMiniApp) attach;
                AdapterEntryType adapterEntryType22 = AdapterEntryType.TYPE_MINI_APP;
                String str28 = attachMiniApp.c;
                String str29 = attachMiniApp.d;
                String str30 = attachMiniApp.f;
                ImageList imageList9 = attachMiniApp.e;
                AttachMiniAppButton attachMiniAppButton = attachMiniApp.g;
                AttachMiniAppButton.State state = attachMiniAppButton != null ? attachMiniAppButton.c : null;
                com.vk.im.engine.models.messages.a aVar2 = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
                fs30 fs30Var = new fs30(new jr30(0), i5, str28, str29, str30, state, imageList9, aVar2 != null ? aVar2.p8() : false, adapterEntryType22, null);
                fs30Var.l = msg;
                fs30Var.m = nestedMsg;
                fs30Var.n = attach;
                return o140.a(fs30Var, msg, attach, adapterEntryType22, i5, null, null, false, nestedMsg, uk30Var, 224);
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                AdapterEntryType adapterEntryType23 = AdapterEntryType.TYPE_UNSUPPORTED;
                fu30 fu30Var = new fu30(new jr30(0), i5, adapterEntryType23, null);
                fu30Var.f = msg;
                fu30Var.g = nestedMsg;
                fu30Var.h = attach;
                return o140.a(fu30Var, msg, attach, adapterEntryType23, i5, null, null, false, nestedMsg, uk30Var, 224);
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                AttachCurator attachCurator = (AttachCurator) attach;
                AdapterEntryType adapterEntryType24 = AdapterEntryType.TYPE_CURATOR;
                lp30 lp30Var = new lp30(new jr30(0), i5, attachCurator.c, attachCurator.d, adapterEntryType24, null);
                lp30Var.h = msg;
                lp30Var.i = nestedMsg;
                lp30Var.j = attach;
                return o140.a(lp30Var, msg, attach, adapterEntryType24, i5, null, null, false, nestedMsg, uk30Var, 224);
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                ArrayList arrayList3 = null;
                AttachDonutLink attachDonutLink = (AttachDonutLink) attach;
                AdapterEntryType adapterEntryType25 = AdapterEntryType.TYPE_DONUT_LINK;
                ImageList imageList10 = attachDonutLink.i;
                String str31 = attachDonutLink.f;
                String str32 = str31 == null ? "" : str31;
                boolean z24 = attachDonutLink.g;
                String str33 = attachDonutLink.h;
                String str34 = str33 == null ? "" : str33;
                String str35 = attachDonutLink.m.b;
                List<AttachDonutLink.Friend> list7 = attachDonutLink.l;
                if (list7 != null) {
                    List<AttachDonutLink.Friend> list8 = list7;
                    arrayList3 = new ArrayList(c5g.u(list8, 10));
                    Iterator<T> it2 = list8.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((AttachDonutLink.Friend) it2.next()).c);
                    }
                }
                xp30 xp30Var = new xp30(new jr30(0), i5, imageList10, str32, str34, z24, str35, arrayList3, attachDonutLink.j, attachDonutLink.k, adapterEntryType25, null);
                xp30Var.n = msg;
                xp30Var.o = nestedMsg;
                xp30Var.p = attach;
                return o140.a(xp30Var, msg, attach, AdapterEntryType.TYPE_DONUT_LINK, i5, null, null, false, nestedMsg, uk30Var, 224);
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                boolean a = b.a(msg, peer);
                boolean Ib = msg.Ib();
                long Fb = msg.Fb();
                BubbleColors c3 = vk30Var.c(Fb, a, true);
                BubbleColors c4 = vk30Var.c(Fb, a, false);
                AdapterEntryType adapterEntryType26 = AdapterEntryType.TYPE_WIDGET;
                av30 av30Var = new av30(uk30Var.e(a, false), i5, vk30Var.b(c3, i5, Ib), vk30Var.b(c4, i5, Ib), uk30Var.h, uk30Var.M, (JSONObject) ((AttachWidget) attach).f.getValue(), msg.b, a, Ib, Fb, adapterEntryType26);
                av30Var.n = attach;
                return o140.a(av30Var, msg, attach, adapterEntryType26, i5, null, null, false, null, uk30Var, 480);
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                AttachHighlight attachHighlight = (AttachHighlight) attach;
                AdapterEntryType adapterEntryType27 = AdapterEntryType.TYPE_HIGHLIGHT;
                Narrative narrative = attachHighlight.b;
                String str36 = narrative.d;
                ImageList m = up2.m(narrative.e);
                Owner owner = attachHighlight.b.f;
                gr30 gr30Var = new gr30(new jr30(0), i5, str36, m, owner != null ? owner.c : null, adapterEntryType27, null);
                gr30Var.i = msg;
                gr30Var.j = nestedMsg;
                gr30Var.k = attach;
                return o140.a(gr30Var, msg, attach, adapterEntryType27, i5, null, null, false, nestedMsg, uk30Var, 224);
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                AttachLink attachLink3 = (AttachLink) attach;
                AdapterEntryType adapterEntryType28 = AdapterEntryType.TYPE_VMOJI_CHARACTER_LINK;
                ImageList imageList11 = attachLink3.i;
                String str37 = attachLink3.f;
                String str38 = attachLink3.g;
                VmojiAttach vmojiAttach = attachLink3.x;
                lu30 lu30Var = new lu30(i5, imageList11, str37, str38, vmojiAttach != null ? vmojiAttach.c : null, adapterEntryType28);
                lu30Var.j = msg;
                lu30Var.k = nestedMsg;
                lu30Var.l = attach;
                return o140.a(lu30Var, msg, attach, adapterEntryType28, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 79:
                AttachLink attachLink4 = (AttachLink) attach;
                AdapterEntryType adapterEntryType29 = AdapterEntryType.TYPE_VMOJI_PACK_LINK;
                ImageList imageList12 = attachLink4.i;
                String str39 = attachLink4.f;
                String str40 = attachLink4.g;
                VmojiAttach vmojiAttach2 = attachLink4.x;
                lu30 lu30Var2 = new lu30(i5, imageList12, str39, str40, vmojiAttach2 != null ? vmojiAttach2.c : null, adapterEntryType29);
                lu30Var2.j = msg;
                lu30Var2.k = nestedMsg;
                lu30Var2.l = attach;
                return o140.a(lu30Var2, msg, attach, adapterEntryType29, i5, null, null, false, nestedMsg, uk30Var, 224);
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                MiniAppSnippetDataAttach miniAppSnippetDataAttach = (MiniAppSnippetDataAttach) attach;
                AdapterEntryType adapterEntryType30 = AdapterEntryType.TYPE_APP_ACTION;
                ImageList imageList13 = miniAppSnippetDataAttach.i;
                String str41 = miniAppSnippetDataAttach.c;
                String str42 = miniAppSnippetDataAttach.e;
                String str43 = str42 == null ? "" : str42;
                String str44 = miniAppSnippetDataAttach.f;
                String str45 = str44 == null ? "" : str44;
                boolean z25 = miniAppSnippetDataAttach.d == MiniAppSnippetDataAttach.Type.GAME;
                UserStack userStack = miniAppSnippetDataAttach.j;
                List<ImageList> list9 = userStack != null ? userStack.c : null;
                String str46 = userStack != null ? userStack.b : null;
                ds30 ds30Var = new ds30(new jr30(0), i5, imageList13, str41, str43, str45, z25, list9, str46 == null ? "" : str46, !msg.i, adapterEntryType30, null);
                ds30Var.n = msg;
                ds30Var.o = nestedMsg;
                ds30Var.p = attach;
                return o140.a(ds30Var, msg, attach, adapterEntryType30, i5, null, null, false, nestedMsg, uk30Var, 224);
            case IMAGES_IMAGE_LOADED_VALUE:
                AttachWall attachWall = (AttachWall) attach;
                if (!(msg instanceof MsgFromUser)) {
                    zh30Var = msg instanceof MsgFromChannel ? new zh30(null, null, null, 15) : new zh30(null, null, null, 15);
                } else if (attachWall.A || attachWall.y == 0) {
                    zh30Var = null;
                } else {
                    AttachComments attachComments = attachWall.v;
                    zh30Var = new zh30(xpm0.a(attachComments != null ? attachComments.b : 0), xpm0.a(attachWall.w), xpm0.a(attachWall.y), 1);
                }
                str7 = zh30Var != null ? zh30Var.c : null;
                str = str7 != null ? str7 : "";
                AdapterEntryType adapterEntryType31 = AdapterEntryType.TYPE_VIEWS_AND_TIME;
                ju30 ju30Var = new ju30(new jr30(0), str, zh30Var, adapterEntryType31);
                ju30Var.f = attach;
                return o140.a(ju30Var, msg, attach, adapterEntryType31, 0, null, null, false, null, uk30Var, 496);
            case 82:
                AttachQuestion attachQuestion = (AttachQuestion) attach;
                AdapterEntryType adapterEntryType32 = AdapterEntryType.TYPE_QUESTION;
                et30 et30Var = new et30(adapterEntryType32, attachQuestion.d, attachQuestion.e, msg.i);
                et30Var.f = attach;
                return o140.a(et30Var, msg, attach, adapterEntryType32, i5, null, null, false, nestedMsg, uk30Var, 224);
            case 83:
                Context context2 = aVar.a;
                AttachComments attachComments2 = ((MsgFromChannel) msg).I.l;
                int i18 = attachComments2 != null ? attachComments2.b : 0;
                aeg aegVar = new aeg(i18 == 0 ? context2.getString(R.string.vkim_comment) : context2.getResources().getQuantityString(R.plurals.vkim_comments_count, i18, Arrays.copyOf(new Object[]{xpm0.a(i18)}, 1)), true);
                AdapterEntryType adapterEntryType33 = AdapterEntryType.TYPE_COMMENTS_BUTTON;
                return o140.a(new cp30(msg, adapterEntryType33, aegVar), msg, null, adapterEntryType33, 0, null, null, false, null, uk30Var, 496);
            case 84:
                AttachWall attachWall2 = (AttachWall) attach;
                Peer peer4 = attachWall2.B;
                qtd0 Bb4 = profilesInfo.Bb(peer4);
                String name = Bb4 != null ? Bb4.name() : null;
                String Ra = Bb4 != null ? Bb4.Ra() : null;
                long j2 = peer4.d;
                str7 = name != null ? drm0.p0(name).toString() : null;
                if (str7 == null || drm0.N(str7)) {
                    if (Ra != null && !drm0.N(Ra)) {
                        str8 = Ra;
                        AdapterEntryType adapterEntryType34 = AdapterEntryType.TYPE_CHANNEL_POST_HEADER;
                        boolean z26 = attachWall2.h;
                        PostDonut postDonut = attachWall2.s;
                        zo30 zo30Var = new zo30(peer4, str8, z26, postDonut == null && postDonut.b, adapterEntryType34);
                        zo30Var.g = attach;
                        return o140.a(zo30Var, msg, attach, adapterEntryType34, 0, null, null, false, null, uk30Var, 496);
                    }
                    name = k0.a(j2, "id");
                }
                str8 = name;
                AdapterEntryType adapterEntryType342 = AdapterEntryType.TYPE_CHANNEL_POST_HEADER;
                boolean z262 = attachWall2.h;
                PostDonut postDonut2 = attachWall2.s;
                zo30 zo30Var2 = new zo30(peer4, str8, z262, postDonut2 == null && postDonut2.b, adapterEntryType342);
                zo30Var2.g = attach;
                return o140.a(zo30Var2, msg, attach, adapterEntryType342, 0, null, null, false, null, uk30Var, 496);
            case 85:
                StereoRoom stereoRoom = ((AttachRoom) attach).b;
                jr30 jr30Var = new jr30(0);
                String str47 = stereoRoom.b;
                String str48 = stereoRoom.c;
                String str49 = stereoRoom.d;
                String str50 = stereoRoom.m;
                com.vk.dto.stereo.a aVar3 = stereoRoom.o;
                if (aVar3 instanceof a.c) {
                    Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                    bVar = new kt30.a.C3205a(ImageList.a.c(-1, -1, ((a.c) aVar3).a));
                } else {
                    if (!(aVar3 instanceof a.C0914a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new kt30.a.b(((a.C0914a) aVar3).a);
                }
                kt30 kt30Var = new kt30(str47, str48, str49, str50, bVar, jr30Var);
                kt30Var.j = attach;
                kt30Var.i = nestedMsg;
                kt30Var.h = msg;
                return o140.a(kt30Var, msg, attach, AdapterEntryType.TYPE_ROOM, 0, null, null, false, null, uk30Var, 496);
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                AttachChannelMessage attachChannelMessage = (AttachChannelMessage) attach;
                qtd0 Bb5 = profilesInfo.Bb(new Peer.Channel(attachChannelMessage.b.b));
                PostDonut postDonut3 = attachChannelMessage.k;
                boolean z27 = postDonut3 != null && postDonut3.b && postDonut3.g == null;
                UserId userId4 = attachChannelMessage.b;
                Peer peer5 = attachChannelMessage.d;
                String str51 = ((Bb5 == null || (str9 = Bb5.name()) == null) && (str9 = attachChannelMessage.m) == null) ? "" : str9;
                if ((Bb5 == null || (imageList = Bb5.C8()) == null) && (imageList = attachChannelMessage.l) == null) {
                    imageList = new ImageList(null, 1, null);
                }
                ImageList imageList14 = imageList;
                if (Bb5 != null && (q9 = Bb5.q9()) != null) {
                    z5 = q9.b;
                }
                AdapterEntryType adapterEntryType35 = AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER;
                jq30 jq30Var = new jq30(userId4, peer5, str51, imageList14, z5, z27, adapterEntryType35, uk30Var.S);
                jq30Var.j = attach;
                jq30Var.k = msg;
                return o140.a(jq30Var, msg, attach, adapterEntryType35, i5, null, null, false, null, uk30Var, 480);
            case 87:
                String str52 = ((AttachChannelMessage) attach).i;
                kq30.a c3197a = str52.length() > 0 ? new kq30.a.C3197a(str52) : kq30.a.b.a;
                AdapterEntryType adapterEntryType36 = AdapterEntryType.TYPE_FWD_CHANNEL_MSG_UNAVAILABLE;
                kq30 kq30Var = new kq30(c3197a, adapterEntryType36);
                kq30Var.d = attach;
                return o140.a(kq30Var, msg, attach, adapterEntryType36, i5, null, null, false, null, uk30Var, 480);
            case 88:
                AdapterEntryType adapterEntryType37 = AdapterEntryType.TYPE_FAKE_NEWS;
                return o140.a(new iq30(adapterEntryType37), msg, attach, adapterEntryType37, i5, null, null, false, null, uk30Var, 480);
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
            case JsonToken.BEGIN_ARRAY /* 91 */:
                long Fb2 = msg.Fb();
                return o140.a(new wo30((AttachChannelStub) attach, msg.b, new jr30(0), Fb2, vk30Var.b(vk30Var.c(Fb2, true, false), i5, false), vk30Var.b(vk30Var.c(Fb2, true, true), i5, false), i5, adapterEntryType, false, false, false, false, null, false), msg, attach, adapterEntryType, 0, null, null, false, null, uk30Var, 496);
            case 92:
            case JsonToken.END_ARRAY /* 93 */:
                AttachChannelStub attachChannelStub = (AttachChannelStub) attach;
                return o140.a(new so30(attachChannelStub.e, attachChannelStub.f, msg.b, i5, adapterEntryType, new jr30(0), false, null, false, false), msg, attach, adapterEntryType, 0, null, null, false, null, uk30Var, 496);
            default:
                throw new UnsupportedOperationException("Unknown type " + adapterEntryType + JwtParser.SEPARATOR_CHAR);
        }
    }

    public static nsr0 x(a aVar, C1170a c1170a, AdapterEntryType adapterEntryType, List list) {
        NestedMsg nestedMsg = c1170a.c;
        int i = c1170a.d;
        Msg msg = c1170a.b;
        if (list == null) {
            list = EmptyList.b;
        }
        return o140.b(adapterEntryType, msg, nestedMsg, i, list, null, c1170a.h);
    }

    public static int z(Attach attach) {
        if ((attach instanceof AttachImage) || (attach instanceof AttachVideo)) {
            return 1;
        }
        if (attach instanceof AttachHighlight) {
            return 2;
        }
        if (attach instanceof AttachPodcastEpisode) {
            return 3;
        }
        if (attach instanceof AttachArticle) {
            return 4;
        }
        if (attach instanceof AttachPlaylist) {
            return 5;
        }
        if (attach instanceof AttachArtist) {
            return 6;
        }
        if (attach instanceof AttachPoll) {
            return 7;
        }
        if (attach instanceof AttachMarket) {
            return 8;
        }
        if (attach instanceof AttachMap) {
            return 9;
        }
        if (attach instanceof AttachGraffiti) {
            return 10;
        }
        if (attach instanceof AttachAudio) {
            return 11;
        }
        if (attach instanceof AttachLink) {
            return 12;
        }
        if (attach instanceof AttachEvent) {
            return 13;
        }
        return attach instanceof AttachDoc ? 14 : 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x028e, code lost:
    
        if ((r3 != null ? r3.b : 0) > 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0290, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x029a, code lost:
    
        if (r3.c == true) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(C1170a c1170a) {
        Object obj;
        Object obj2;
        yab b;
        Object obj3;
        PostDonut postDonut;
        Msg msg = c1170a.b;
        ArrayList arrayList = new ArrayList();
        if (!c1170a.a.isEmpty() || (msg instanceof MsgFromChannel)) {
            List<Attach> list = c1170a.a;
            uk30 uk30Var = c1170a.h;
            NestedMsg nestedMsg = c1170a.c;
            int i = c1170a.d;
            bw30.a.getClass();
            C1170a c1170a2 = new C1170a(list, msg, nestedMsg, i, bw30.b(msg), c1170a.g, uk30Var, 32);
            if (!(msg instanceof MsgFromChannel)) {
                d(arrayList, c1170a2);
                return arrayList;
            }
            MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
            AttachWall Yb = msgFromChannel.Yb();
            MsgFromChannel.b bVar = msgFromChannel.I;
            PostDonut postDonut2 = bVar.g;
            PostDonut.Placeholder placeholder = postDonut2 != null ? postDonut2.c : null;
            boolean z = this.b;
            if (placeholder != null && (!bVar.z || !z)) {
                arrayList.add(w(C1170a.a(c1170a2, msgFromChannel.E), AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN, Yb, null));
                return arrayList;
            }
            if (bVar.y) {
                arrayList.add(w(c1170a2, AdapterEntryType.TYPE_FAKE_NEWS, Yb, null));
            }
            Iterator<T> it = msgFromChannel.E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof AttachWall) {
                    break;
                }
            }
            if (!(obj instanceof AttachWall)) {
                obj = null;
            }
            boolean z2 = false;
            boolean z3 = ((AttachWall) obj) != null;
            MsgFromChannel.b bVar2 = msgFromChannel.I;
            boolean z4 = bVar2.n || ((postDonut = bVar2.g) != null && postDonut.b && postDonut.g == null);
            Peer peer = bVar2.m;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            boolean f = epx.f(peer, Peer.Unknown.e);
            if (!z3 && (z4 || !f)) {
                arrayList.add(w(c1170a2, AdapterEntryType.TYPE_CHANNEL_POST_HEADER, Yb, null));
            }
            List<Attach> list2 = msgFromChannel.E;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list2) {
                if (A((Attach) obj4, msgFromChannel.E)) {
                    arrayList2.add(obj4);
                }
            }
            if (!arrayList2.isEmpty()) {
                d(arrayList, C1170a.a(c1170a2, arrayList2));
            }
            boolean N = drm0.N(msgFromChannel.I.j);
            if (!drm0.N(msgFromChannel.I.a) && N) {
                String str = msgFromChannel.I.a;
                ucp ucpVar = ucp.a;
                arrayList.add(w(c1170a2, AdapterEntryType.TYPE_TEXT, Yb, o040.b(this.a, msgFromChannel.I.a, msgFromChannel.T, com.vk.im.ui.components.viewcontrollers.msg_list.a.b(str), !o25.b(o25.a()), 8)));
            }
            if (!N) {
                arrayList.add(w(c1170a2, AdapterEntryType.TYPE_BLOCKED_POST, Yb, o040.a(this.a, msgFromChannel.I.j + ' ' + msgFromChannel.I.k, 14)));
            }
            MsgFromChannel.b bVar3 = msgFromChannel.I;
            PostDonut postDonut3 = bVar3.g;
            boolean z5 = (postDonut3 != null ? postDonut3.g : null) != null;
            if (z && bVar3.z && z5) {
                arrayList.add(w(c1170a2, AdapterEntryType.TYPE_DONATE_BUTTON, Yb, null));
            }
            if (!msgFromChannel.E.isEmpty()) {
                List<Attach> list3 = msgFromChannel.E;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    Attach attach = (Attach) obj5;
                    if (!(attach instanceof AttachWall) && !(attach instanceof AttachUnsupported) && !A(attach, msgFromChannel.E)) {
                        arrayList3.add(obj5);
                    }
                }
                C1170a a = C1170a.a(c1170a2, arrayList3);
                if (!arrayList3.isEmpty()) {
                    d(arrayList, a);
                }
                List<Attach> list4 = msgFromChannel.E;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list4) {
                    if (obj6 instanceof AttachUnsupported) {
                        arrayList4.add(obj6);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(w(a, AdapterEntryType.TYPE_WALL_POST_COLLAPSE_TEXT, Yb, null));
                    arrayList.add(w(a, AdapterEntryType.TYPE_WALL_POST_BUTTON, Yb, null));
                }
                Iterator<T> it2 = msgFromChannel.E.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (obj3 instanceof AttachWall) {
                        break;
                    }
                }
                if (!(obj3 instanceof AttachWall)) {
                    obj3 = null;
                }
                AttachWall attachWall = (AttachWall) obj3;
                if (attachWall != null) {
                    m(attachWall, c1170a2, arrayList);
                }
            }
            if (c1170a2.d == 0) {
                Iterator<T> it3 = msgFromChannel.E.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (obj2 instanceof AttachVideoMsg) {
                        break;
                    }
                }
                if (!(obj2 instanceof AttachVideoMsg)) {
                    obj2 = null;
                }
                AttachVideoMsg attachVideoMsg = (AttachVideoMsg) obj2;
                boolean Qa = msgFromChannel.Qa();
                uk30 uk30Var2 = c1170a2.h;
                if (Qa || uk30Var2.x) {
                    zdw zdwVar = i7o0.b;
                    if (zdwVar == null) {
                        zdwVar = null;
                    }
                    j3f0 e = zdwVar.e();
                    if (e != null && (b = e.b()) != null) {
                        b.e(msgFromChannel);
                    }
                    arrayList.add(o140.w(c1170a2.b, 0, uk30Var2));
                }
                if (attachVideoMsg == null) {
                    if (!msgFromChannel.L) {
                        if (msgFromChannel.K) {
                            AttachComments attachComments = msgFromChannel.I.l;
                        } else {
                            AttachComments attachComments2 = msgFromChannel.I.l;
                            if (attachComments2 != null) {
                            }
                        }
                    }
                    if (z2) {
                        arrayList.add(w(c1170a2, AdapterEntryType.TYPE_COMMENTS_BUTTON, Yb, null));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:353:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0571  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ArrayList arrayList, C1170a c1170a) {
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        int size;
        int i;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        int size5;
        int i5;
        int size6;
        int i6;
        int size7;
        int i7;
        int size8;
        int i8;
        int size9;
        int i9;
        int size10;
        int i10;
        int size11;
        int i11;
        int size12;
        int i12;
        int size13;
        int i13;
        int size14;
        int i14;
        com.vk.im.engine.models.messages.a aVar;
        boolean z4;
        boolean z5;
        int size15;
        int i15;
        List<Attach> list;
        int size16;
        int i16;
        int size17;
        int i17;
        int size18;
        int i18;
        Iterator<T> it;
        boolean z6;
        int i19;
        Product product;
        boolean z7;
        Merchant merchant;
        int i20;
        Product product2;
        Merchant merchant2;
        boolean z8;
        String platform;
        List<Attach> list2 = c1170a.a;
        gtx0 gtx0Var = c1170a.b;
        int i21 = c1170a.d;
        NestedMsg nestedMsg = c1170a.c;
        List<Attach> list3 = list2;
        if ((list3 instanceof List) && (list3 instanceof RandomAccess)) {
            List<Attach> list4 = list3;
            int size19 = list4.size();
            for (int i22 = 0; i22 < size19; i22++) {
                Attach attach = list4.get(i22);
                if (attach instanceof AttachStory) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        Attach attach2 = (Attach) obj2;
                        if (!(attach2 instanceof AttachStory) && !(attach2 instanceof AttachAudioMsg) && !(attach2 instanceof AttachSticker)) {
                            arrayList2.add(obj2);
                        }
                    }
                    boolean z9 = nestedMsg != null;
                    boolean z10 = !arrayList2.isEmpty() || list2.size() > 2;
                    if (z9 || z10) {
                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_NESTED_STORY, attach, null));
                    } else {
                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_STORY, attach, null));
                    }
                }
            }
        } else {
            for (Attach attach3 : list3) {
                if (attach3 instanceof AttachStory) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        Attach attach4 = (Attach) obj3;
                        if (!(attach4 instanceof AttachStory) && !(attach4 instanceof AttachAudioMsg) && !(attach4 instanceof AttachSticker)) {
                            arrayList3.add(obj3);
                        }
                    }
                    boolean z11 = nestedMsg != null;
                    if (arrayList3.isEmpty() && list2.size() <= 2) {
                        z = false;
                        if (!z11 || z) {
                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_NESTED_STORY, attach3, null));
                        } else {
                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_STORY, attach3, null));
                        }
                    }
                    z = true;
                    if (z11) {
                    }
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_NESTED_STORY, attach3, null));
                }
            }
        }
        List<Attach> list5 = list2;
        if ((list5 instanceof List) && (list5 instanceof RandomAccess)) {
            List<Attach> list6 = list5;
            int size20 = list6.size();
            for (int i23 = 0; i23 < size20; i23++) {
                Attach attach5 = list6.get(i23);
                if (attach5 instanceof AttachGift) {
                    arrayList.add(y(c1170a, AdapterEntryType.TYPE_GIFT, (AttachGift) attach5));
                }
            }
        } else {
            for (Attach attach6 : list5) {
                if (attach6 instanceof AttachGift) {
                    arrayList.add(y(c1170a, AdapterEntryType.TYPE_GIFT, (AttachGift) attach6));
                }
            }
        }
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_STICKER;
        int size21 = list2.size();
        for (int i24 = 0; i24 < size21; i24++) {
            Attach attach7 = list2.get(i24);
            if ((attach7 instanceof AttachSticker) && !((AttachSticker) attach7).g.z9()) {
                arrayList.add(w(c1170a, adapterEntryType, attach7, null));
            }
        }
        AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_POPUP_STICKER;
        int size22 = list2.size();
        for (int i25 = 0; i25 < size22; i25++) {
            Attach attach8 = list2.get(i25);
            if ((attach8 instanceof AttachSticker) && ((AttachSticker) attach8).g.z9()) {
                arrayList.add(w(c1170a, adapterEntryType2, attach8, null));
            }
        }
        AdapterEntryType adapterEntryType3 = AdapterEntryType.TYPE_UGC_STICKER;
        int size23 = list2.size();
        for (int i26 = 0; i26 < size23; i26++) {
            Attach attach9 = list2.get(i26);
            if (attach9 instanceof AttachUgcSticker) {
                arrayList.add(w(c1170a, adapterEntryType3, attach9, null));
            }
        }
        AdapterEntryType adapterEntryType4 = AdapterEntryType.TYPE_GRAFFITI;
        int size24 = list2.size();
        for (int i27 = 0; i27 < size24; i27++) {
            Attach attach10 = list2.get(i27);
            if (attach10 instanceof AttachGraffiti) {
                arrayList.add(w(c1170a, adapterEntryType4, attach10, null));
            }
        }
        int size25 = list2.size();
        int i28 = 0;
        for (int i29 = 0; i29 < size25; i29++) {
            if (list2.get(i29) instanceof AttachImage) {
                i28++;
            }
        }
        int size26 = list2.size();
        int i30 = 0;
        for (int i31 = 0; i31 < size26; i31++) {
            if (list2.get(i31) instanceof AttachVideo) {
                i30++;
            }
        }
        if (i28 == 1 && i30 == 0) {
            AdapterEntryType adapterEntryType5 = AdapterEntryType.TYPE_PHOTO;
            int size27 = list2.size();
            for (int i32 = 0; i32 < size27; i32++) {
                Attach attach11 = list2.get(i32);
                if (attach11 instanceof AttachImage) {
                    arrayList.add(w(c1170a, adapterEntryType5, attach11, null));
                }
            }
        }
        int size28 = list2.size();
        int i33 = 0;
        for (int i34 = 0; i34 < size28; i34++) {
            Attach attach12 = list2.get(i34);
            if ((attach12 instanceof AttachImage) || ((attach12 instanceof AttachChannelStub) && ((AttachChannelStub) attach12).l)) {
                i33++;
            }
        }
        int size29 = list2.size();
        int i35 = 0;
        for (int i36 = 0; i36 < size29; i36++) {
            Attach attach13 = list2.get(i36);
            if ((attach13 instanceof AttachVideo) || ((attach13 instanceof AttachChannelStub) && ((AttachChannelStub) attach13).m)) {
                i35++;
            }
        }
        if (i33 + i35 > 1) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                Attach attach14 = (Attach) obj4;
                if ((attach14 instanceof AttachImage) || (attach14 instanceof AttachVideo) || B(attach14)) {
                    arrayList4.add(obj4);
                }
            }
            arrayList.add(x(this, c1170a, AdapterEntryType.TYPE_BOX_PHOTO_VIDEO, arrayList4));
        }
        boolean z12 = bu00.b(list2, AttachImage.class) != 0;
        boolean z13 = bu00.b(list2, AttachVideo.class) != 1;
        if (!z12 && !z13) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : list2) {
                if (obj5 instanceof AttachWithVideo) {
                    arrayList5.add(obj5);
                }
            }
            AttachWithVideo attachWithVideo = (AttachWithVideo) j5g.Y(arrayList5);
            boolean W9 = attachWithVideo.A().W9();
            boolean z14 = (!attachWithVideo.A().isExternal() || (platform = attachWithVideo.A().getPlatform()) == null || platform.length() == 0) ? false : true;
            boolean Ia = attachWithVideo.A().Ia();
            com.vk.im.engine.models.messages.a aVar2 = gtx0Var instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
            boolean z15 = aVar2 != null && aVar2.E2();
            if (W9) {
                AdapterEntryType adapterEntryType6 = AdapterEntryType.TYPE_INTERACTIVE_VIDEO;
                int size30 = list2.size();
                for (int i37 = 0; i37 < size30; i37++) {
                    Attach attach15 = list2.get(i37);
                    if (attach15 instanceof AttachWithVideo) {
                        arrayList.add(w(c1170a, adapterEntryType6, attach15, null));
                    }
                }
            } else if (z14 && z15) {
                AdapterEntryType adapterEntryType7 = AdapterEntryType.TYPE_EXTERNAL_VIDEO;
                int size31 = list2.size();
                for (int i38 = 0; i38 < size31; i38++) {
                    Attach attach16 = list2.get(i38);
                    if (attach16 instanceof AttachWithVideo) {
                        arrayList.add(w(c1170a, adapterEntryType7, attach16, null));
                    }
                }
            } else if (attachWithVideo.Q5() && !Ia && !attachWithVideo.A().C2() && z15) {
                AdapterEntryType adapterEntryType8 = AdapterEntryType.TYPE_PUBLIC_VIDEO;
                int size32 = list2.size();
                for (int i39 = 0; i39 < size32; i39++) {
                    Attach attach17 = list2.get(i39);
                    if (attach17 instanceof AttachWithVideo) {
                        arrayList.add(w(c1170a, adapterEntryType8, attach17, null));
                    }
                }
            } else if (attachWithVideo.Q5()) {
                AdapterEntryType adapterEntryType9 = AdapterEntryType.TYPE_VIDEO_AUTOPLAY;
                int size33 = list2.size();
                for (int i40 = 0; i40 < size33; i40++) {
                    Attach attach18 = list2.get(i40);
                    if (attach18 instanceof AttachWithVideo) {
                        arrayList.add(w(c1170a, adapterEntryType9, attach18, null));
                    }
                }
            } else {
                AdapterEntryType adapterEntryType10 = AdapterEntryType.TYPE_VIDEO;
                int size34 = list2.size();
                for (int i41 = 0; i41 < size34; i41++) {
                    Attach attach19 = list2.get(i41);
                    if (attach19 instanceof AttachWithVideo) {
                        arrayList.add(w(c1170a, adapterEntryType10, attach19, null));
                    }
                }
            }
        }
        List<Attach> list7 = list2;
        boolean z16 = list7 instanceof List;
        if (z16 && (list7 instanceof RandomAccess)) {
            List<Attach> list8 = list7;
            int size35 = list8.size();
            for (int i42 = 0; i42 < size35; i42++) {
                Attach attach20 = list8.get(i42);
                if (attach20 instanceof AttachVideoMsg) {
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_VIDEO_MSG, attach20, null));
                    AttachVideoMsg attachVideoMsg = (AttachVideoMsg) attach20;
                    if (attachVideoMsg.o) {
                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT, attach20, attachVideoMsg.r));
                        if (C((AttachWithTranscription) attach20)) {
                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE, attach20, null));
                        }
                    }
                }
            }
        } else {
            for (Attach attach21 : list7) {
                if (attach21 instanceof AttachVideoMsg) {
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_VIDEO_MSG, attach21, null));
                    AttachVideoMsg attachVideoMsg2 = (AttachVideoMsg) attach21;
                    if (attachVideoMsg2.o) {
                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT, attach21, attachVideoMsg2.r));
                        if (C((AttachWithTranscription) attach21)) {
                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE, attach21, null));
                        }
                    }
                }
            }
        }
        int size36 = list2.size();
        int i43 = 0;
        for (int i44 = 0; i44 < size36; i44++) {
            if (j(list2.get(i44))) {
                i43++;
            }
        }
        List<Attach> list9 = list2;
        Iterator<T> it2 = list9.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((Attach) obj) instanceof AttachDoc) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AttachDoc attachDoc = obj instanceof AttachDoc ? (AttachDoc) obj : null;
        if (i43 > 1) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : list9) {
                if (j((Attach) obj6)) {
                    arrayList6.add(obj6);
                }
            }
            arrayList.add(x(this, c1170a, AdapterEntryType.TYPE_BOX_DOC_PREVIEW, arrayList6));
        } else if (i43 == 1 && attachDoc != null && attachDoc.x5()) {
            AdapterEntryType adapterEntryType11 = AdapterEntryType.TYPE_GIF_AUTOPLAY;
            int size37 = list2.size();
            for (int i45 = 0; i45 < size37; i45++) {
                Attach attach22 = list2.get(i45);
                if ((attach22 instanceof AttachDoc) && ((AttachDoc) attach22).i()) {
                    arrayList.add(w(c1170a, adapterEntryType11, attach22, null));
                }
            }
        } else {
            AdapterEntryType adapterEntryType12 = AdapterEntryType.TYPE_DOC_PREVIEW;
            int size38 = list2.size();
            for (int i46 = 0; i46 < size38; i46++) {
                Attach attach23 = list2.get(i46);
                if ((attach23 instanceof AttachDoc) && ((AttachDoc) attach23).i()) {
                    arrayList.add(w(c1170a, adapterEntryType12, attach23, null));
                }
            }
        }
        AdapterEntryType adapterEntryType13 = AdapterEntryType.TYPE_PLAYLIST;
        AdapterEntryType adapterEntryType14 = AdapterEntryType.TYPE_PLAYLIST_COMPACT;
        boolean z17 = gtx0Var instanceof com.vk.im.engine.models.messages.a;
        com.vk.im.engine.models.messages.a aVar3 = z17 ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
        boolean z18 = i21 != 0;
        if (aVar3 != null) {
            z2 = true;
            if (aVar3.db()) {
                z3 = true;
                boolean z19 = aVar3 == null && aVar3.E2() == z2;
                if ((!(aVar3 instanceof MsgFromUser) || (aVar3 instanceof MsgFromChannel)) && !z18 && !z3 && z19) {
                    size = list2.size();
                    for (i = 0; i < size; i++) {
                        Attach attach24 = list2.get(i);
                        if (attach24 instanceof AttachPlaylist) {
                            arrayList.add(w(c1170a, adapterEntryType13, attach24, null));
                        }
                    }
                } else {
                    int size39 = list2.size();
                    for (int i47 = 0; i47 < size39; i47++) {
                        Attach attach25 = list2.get(i47);
                        if (attach25 instanceof AttachPlaylist) {
                            arrayList.add(w(c1170a, adapterEntryType14, attach25, null));
                        }
                    }
                }
                AdapterEntryType adapterEntryType15 = AdapterEntryType.TYPE_MARKET_LARGE;
                size2 = list2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    Attach attach26 = list2.get(i2);
                    if (attach26 instanceof AttachMarket) {
                        AttachMarket attachMarket = (AttachMarket) attach26;
                        if ((!attachMarket.u || attachMarket.s) && i21 < 3) {
                            arrayList.add(w(c1170a, adapterEntryType15, attach26, null));
                        }
                    }
                }
                AdapterEntryType adapterEntryType16 = AdapterEntryType.TYPE_MARKET_BLOCKED;
                size3 = list2.size();
                for (i3 = 0; i3 < size3; i3++) {
                    Attach attach27 = list2.get(i3);
                    if (attach27 instanceof AttachMarket) {
                        AttachMarket attachMarket2 = (AttachMarket) attach27;
                        if (attachMarket2.u && !attachMarket2.s && i21 < 3) {
                            arrayList.add(w(c1170a, adapterEntryType16, attach27, null));
                        }
                    }
                }
                AdapterEntryType adapterEntryType17 = AdapterEntryType.TYPE_LINK_PRODUCT;
                size4 = list2.size();
                i4 = 0;
                while (i4 < size4) {
                    Attach attach28 = list2.get(i4);
                    if (attach28 instanceof AttachLink) {
                        AttachLink attachLink = (AttachLink) attach28;
                        if (attachLink.i.Jb() && (product2 = attachLink.w) != null && (merchant2 = product2.g) != null) {
                            i20 = size4;
                            if (merchant2 != Merchant.NONE && i21 < 3) {
                                VmojiAttach vmojiAttach = attachLink.x;
                                if (vmojiAttach != null) {
                                    z8 = true;
                                    if (!vmojiAttach.b) {
                                    }
                                } else {
                                    z8 = true;
                                }
                                if (vmojiAttach == null || vmojiAttach.b != z8) {
                                    arrayList.add(w(c1170a, adapterEntryType17, attach28, null));
                                }
                            }
                            i4++;
                            size4 = i20;
                        }
                    }
                    i20 = size4;
                    i4++;
                    size4 = i20;
                }
                AdapterEntryType adapterEntryType18 = AdapterEntryType.TYPE_LINK_LARGE;
                size5 = list2.size();
                i5 = 0;
                while (i5 < size5) {
                    Attach attach29 = list2.get(i5);
                    if (attach29 instanceof AttachLink) {
                        AttachLink attachLink2 = (AttachLink) attach29;
                        if (attachLink2.i.Jb() && (((product = attachLink2.w) == null || (merchant = product.g) == null || merchant == Merchant.NONE) && i21 < 3)) {
                            VmojiAttach vmojiAttach2 = attachLink2.x;
                            if (vmojiAttach2 != null) {
                                i19 = size5;
                                z7 = true;
                                if (!vmojiAttach2.b) {
                                    i5++;
                                    size5 = i19;
                                }
                            } else {
                                i19 = size5;
                                z7 = true;
                            }
                            if (vmojiAttach2 == null || vmojiAttach2.b != z7) {
                                String str = attachLink2.m;
                                if (str == null || drm0.N(str)) {
                                    arrayList.add(w(c1170a, adapterEntryType18, attach29, null));
                                }
                            }
                            i5++;
                            size5 = i19;
                        }
                    }
                    i19 = size5;
                    i5++;
                    size5 = i19;
                }
                AdapterEntryType adapterEntryType19 = AdapterEntryType.TYPE_MAP;
                size6 = list2.size();
                for (i6 = 0; i6 < size6; i6++) {
                    Attach attach30 = list2.get(i6);
                    if (attach30 instanceof AttachMap) {
                        arrayList.add(w(c1170a, adapterEntryType19, attach30, null));
                    }
                }
                AdapterEntryType adapterEntryType20 = AdapterEntryType.TYPE_ARTICLE;
                size7 = list2.size();
                for (i7 = 0; i7 < size7; i7++) {
                    Attach attach31 = list2.get(i7);
                    if (attach31 instanceof AttachArticle) {
                        arrayList.add(w(c1170a, adapterEntryType20, attach31, null));
                    }
                }
                AdapterEntryType adapterEntryType21 = AdapterEntryType.TYPE_CALL;
                size8 = list2.size();
                for (i8 = 0; i8 < size8; i8++) {
                    Attach attach32 = list2.get(i8);
                    if (attach32 instanceof AttachCall) {
                        arrayList.add(w(c1170a, adapterEntryType21, attach32, null));
                    }
                }
                AdapterEntryType adapterEntryType22 = AdapterEntryType.TYPE_GROUP_CALL;
                size9 = list2.size();
                for (i9 = 0; i9 < size9; i9++) {
                    Attach attach33 = list2.get(i9);
                    if (attach33 instanceof AttachGroupCall) {
                        arrayList.add(w(c1170a, adapterEntryType22, attach33, null));
                    }
                }
                AdapterEntryType adapterEntryType23 = AdapterEntryType.TYPE_PODCAST_EPISODE;
                size10 = list2.size();
                for (i10 = 0; i10 < size10; i10++) {
                    Attach attach34 = list2.get(i10);
                    if (attach34 instanceof AttachPodcastEpisode) {
                        AttachPodcastEpisode attachPodcastEpisode = (AttachPodcastEpisode) attach34;
                        if (attachPodcastEpisode.d.f == 0 || attachPodcastEpisode.d()) {
                            arrayList.add(w(c1170a, adapterEntryType23, attach34, null));
                        }
                    }
                }
                AdapterEntryType adapterEntryType24 = AdapterEntryType.TYPE_MARKET_SMALL;
                size11 = list2.size();
                for (i11 = 0; i11 < size11; i11++) {
                    Attach attach35 = list2.get(i11);
                    if (attach35 instanceof AttachMarket) {
                        AttachMarket attachMarket3 = (AttachMarket) attach35;
                        if ((!attachMarket3.u || attachMarket3.s) && i21 >= 3) {
                            arrayList.add(w(c1170a, adapterEntryType24, attach35, null));
                        }
                    }
                }
                AdapterEntryType adapterEntryType25 = AdapterEntryType.TYPE_LINK_SMALL;
                size12 = list2.size();
                for (i12 = 0; i12 < size12; i12++) {
                    Attach attach36 = list2.get(i12);
                    if (attach36 instanceof AttachLink) {
                        AttachLink attachLink3 = (AttachLink) attach36;
                        if (attachLink3.i.Jb() && i21 < 3) {
                        }
                        VmojiAttach vmojiAttach3 = attachLink3.x;
                        if (vmojiAttach3 != null) {
                            z6 = true;
                            if (!vmojiAttach3.b) {
                            }
                        } else {
                            z6 = true;
                        }
                        if (vmojiAttach3 == null || vmojiAttach3.b != z6) {
                            arrayList.add(w(c1170a, adapterEntryType25, attach36, null));
                        }
                    }
                }
                AdapterEntryType adapterEntryType26 = AdapterEntryType.TYPE_DOC_SIMPLE;
                size13 = list2.size();
                for (i13 = 0; i13 < size13; i13++) {
                    Attach attach37 = list2.get(i13);
                    if ((attach37 instanceof AttachDoc) && !((AttachDoc) attach37).i()) {
                        arrayList.add(w(c1170a, adapterEntryType26, attach37, null));
                    }
                }
                if (z16 || !(list7 instanceof RandomAccess)) {
                    for (Attach attach38 : list7) {
                        if (attach38 instanceof AttachWall) {
                            if (i21 > 0) {
                                m((AttachWall) attach38, c1170a, arrayList);
                            } else {
                                AttachWall attachWall = (AttachWall) attach38;
                                List<Attach> list10 = attachWall.o;
                                if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                                    Iterator<T> it3 = list10.iterator();
                                    while (it3.hasNext()) {
                                        if (((Attach) it3.next()) instanceof AttachUnsupported) {
                                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_TWO_ROW_SNIPPET, attach38, null));
                                            break;
                                        }
                                    }
                                }
                                t(attachWall, c1170a, arrayList);
                            }
                        }
                    }
                } else {
                    List<Attach> list11 = list7;
                    int size40 = list11.size();
                    for (int i48 = 0; i48 < size40; i48++) {
                        Attach attach39 = list11.get(i48);
                        if (attach39 instanceof AttachWall) {
                            if (i21 > 0) {
                                m((AttachWall) attach39, c1170a, arrayList);
                            } else {
                                AttachWall attachWall2 = (AttachWall) attach39;
                                List<Attach> list12 = attachWall2.o;
                                if (!(list12 instanceof Collection) || !list12.isEmpty()) {
                                    Iterator<T> it4 = list12.iterator();
                                    while (it4.hasNext()) {
                                        if (((Attach) it4.next()) instanceof AttachUnsupported) {
                                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_TWO_ROW_SNIPPET, attach39, null));
                                            break;
                                        }
                                    }
                                }
                                t(attachWall2, c1170a, arrayList);
                            }
                        }
                    }
                }
                AdapterEntryType adapterEntryType27 = AdapterEntryType.TYPE_WALL_POST_REPLY;
                size14 = list2.size();
                for (i14 = 0; i14 < size14; i14++) {
                    Attach attach40 = list2.get(i14);
                    if (attach40 instanceof AttachWallReply) {
                        arrayList.add(w(c1170a, adapterEntryType27, attach40, null));
                    }
                }
                boolean z20 = c1170a.g;
                if (z16 || !(list7 instanceof RandomAccess)) {
                    for (Attach attach41 : list7) {
                        if (attach41 instanceof AttachAudioMsg) {
                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_AUDIOMSG, attach41, null));
                            List<Peer.Type> list13 = com.vk.im.engine.utils.a.b;
                            AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach41;
                            if (com.vk.im.engine.utils.a.i(attachAudioMsg.f) && attachAudioMsg.o) {
                                arrayList.add(w(c1170a, AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT, attach41, null));
                                if (C((AttachWithTranscription) attach41)) {
                                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE, attach41, null));
                                }
                                if (i21 == 0 && z20) {
                                    MsgFromUser msgFromUser = gtx0Var instanceof MsgFromUser ? (MsgFromUser) gtx0Var : null;
                                    if (msgFromUser == null || !msgFromUser.Qa()) {
                                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_TIME, attach41, null));
                                    }
                                }
                            }
                        }
                    }
                } else {
                    List<Attach> list14 = list7;
                    int size41 = list14.size();
                    for (int i49 = 0; i49 < size41; i49++) {
                        Attach attach42 = list14.get(i49);
                        if (attach42 instanceof AttachAudioMsg) {
                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_AUDIOMSG, attach42, null));
                            List<Peer.Type> list15 = com.vk.im.engine.utils.a.b;
                            AttachAudioMsg attachAudioMsg2 = (AttachAudioMsg) attach42;
                            if (com.vk.im.engine.utils.a.i(attachAudioMsg2.f) && attachAudioMsg2.o) {
                                arrayList.add(w(c1170a, AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT, attach42, null));
                                if (C((AttachWithTranscription) attach42)) {
                                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE, attach42, null));
                                }
                                if (i21 == 0 && z20) {
                                    MsgFromUser msgFromUser2 = gtx0Var instanceof MsgFromUser ? (MsgFromUser) gtx0Var : null;
                                    if (msgFromUser2 == null || !msgFromUser2.Qa()) {
                                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_TIME, attach42, null));
                                    }
                                }
                            }
                        }
                    }
                }
                AdapterEntryType adapterEntryType28 = AdapterEntryType.TYPE_AUDIO;
                AdapterEntryType adapterEntryType29 = AdapterEntryType.TYPE_AUDIO_COMPACT;
                aVar = !z17 ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
                boolean z21 = i21 == 0;
                if (aVar == null) {
                    z4 = true;
                    if (aVar.db()) {
                        z5 = true;
                        boolean z22 = aVar == null && aVar.E2() == z4;
                        if ((!(aVar instanceof MsgFromUser) || (aVar instanceof MsgFromChannel)) && !z21 && !z5 && z22) {
                            size15 = list2.size();
                            for (i15 = 0; i15 < size15; i15++) {
                                Attach attach43 = list2.get(i15);
                                if (attach43 instanceof AttachAudio) {
                                    arrayList.add(w(c1170a, adapterEntryType28, attach43, null));
                                }
                            }
                        } else {
                            int size42 = list2.size();
                            for (int i50 = 0; i50 < size42; i50++) {
                                Attach attach44 = list2.get(i50);
                                if (attach44 instanceof AttachAudio) {
                                    arrayList.add(w(c1170a, adapterEntryType29, attach44, null));
                                }
                            }
                        }
                        List<Attach> list16 = c1170a.a;
                        boolean z23 = c1170a.f;
                        list = list16;
                        if ((list instanceof List) || !(list instanceof RandomAccess)) {
                            for (Attach attach45 : list) {
                                if (attach45 instanceof AttachPoll) {
                                    if (z23 && list16.size() > 1) {
                                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_TWO_ROW_SNIPPET, attach45, null));
                                    }
                                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_POLL, attach45, null));
                                }
                            }
                        } else {
                            List<Attach> list17 = list;
                            int size43 = list17.size();
                            for (int i51 = 0; i51 < size43; i51++) {
                                Attach attach46 = list17.get(i51);
                                if (attach46 instanceof AttachPoll) {
                                    if (!z23 || list16.size() <= 1) {
                                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_POLL, attach46, null));
                                    } else {
                                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_TWO_ROW_SNIPPET, attach46, null));
                                    }
                                }
                            }
                        }
                        c(arrayList, c1170a);
                        AdapterEntryType adapterEntryType30 = AdapterEntryType.TYPE_PODCAST_EPISODE_RESTRICTED;
                        size16 = list2.size();
                        for (i16 = 0; i16 < size16; i16++) {
                            Attach attach47 = list2.get(i16);
                            if (attach47 instanceof AttachPodcastEpisode) {
                                AttachPodcastEpisode attachPodcastEpisode2 = (AttachPodcastEpisode) attach47;
                                if (attachPodcastEpisode2.d.f != 0 && !attachPodcastEpisode2.d()) {
                                    arrayList.add(w(c1170a, adapterEntryType30, attach47, null));
                                }
                            }
                        }
                        AdapterEntryType adapterEntryType31 = AdapterEntryType.TYPE_EVENT;
                        size17 = list2.size();
                        for (i17 = 0; i17 < size17; i17++) {
                            Attach attach48 = list2.get(i17);
                            if (attach48 instanceof AttachEvent) {
                                arrayList.add(w(c1170a, adapterEntryType31, attach48, null));
                            }
                        }
                        AdapterEntryType adapterEntryType32 = AdapterEntryType.TYPE_UNSUPPORTED;
                        List<Attach> list18 = c1170a.a;
                        size18 = list18.size();
                        for (i18 = 0; i18 < size18; i18++) {
                            Attach attach49 = list18.get(i18);
                            if (attach49 instanceof AttachUnsupported) {
                                arrayList.add(w(c1170a, adapterEntryType32, attach49, null));
                            }
                        }
                        o(arrayList, c1170a);
                        i(arrayList, c1170a);
                        k(arrayList, c1170a);
                        v(arrayList, c1170a);
                        n(arrayList, c1170a);
                        r(arrayList, c1170a);
                        s(arrayList, c1170a);
                        b(arrayList, c1170a);
                        l(arrayList, c1170a);
                        p(arrayList, c1170a);
                        q(arrayList, c1170a);
                        e(arrayList, c1170a);
                        h(arrayList, c1170a);
                        f(arrayList, c1170a);
                        g(arrayList, c1170a);
                        if ((list9 instanceof Collection) || !list9.isEmpty()) {
                            it = list9.iterator();
                            while (it.hasNext()) {
                                if (!(((Attach) it.next()) instanceof AttachDeleted)) {
                                    return;
                                }
                            }
                        }
                        arrayList.add(x(this, c1170a, AdapterEntryType.TYPE_DELETED, list2));
                    }
                } else {
                    z4 = true;
                }
                z5 = false;
                if (aVar == null) {
                }
                if (aVar instanceof MsgFromUser) {
                }
                size15 = list2.size();
                while (i15 < size15) {
                }
                List<Attach> list162 = c1170a.a;
                boolean z232 = c1170a.f;
                list = list162;
                if (list instanceof List) {
                }
                while (r6.hasNext()) {
                }
                c(arrayList, c1170a);
                AdapterEntryType adapterEntryType302 = AdapterEntryType.TYPE_PODCAST_EPISODE_RESTRICTED;
                size16 = list2.size();
                while (i16 < size16) {
                }
                AdapterEntryType adapterEntryType312 = AdapterEntryType.TYPE_EVENT;
                size17 = list2.size();
                while (i17 < size17) {
                }
                AdapterEntryType adapterEntryType322 = AdapterEntryType.TYPE_UNSUPPORTED;
                List<Attach> list182 = c1170a.a;
                size18 = list182.size();
                while (i18 < size18) {
                }
                o(arrayList, c1170a);
                i(arrayList, c1170a);
                k(arrayList, c1170a);
                v(arrayList, c1170a);
                n(arrayList, c1170a);
                r(arrayList, c1170a);
                s(arrayList, c1170a);
                b(arrayList, c1170a);
                l(arrayList, c1170a);
                p(arrayList, c1170a);
                q(arrayList, c1170a);
                e(arrayList, c1170a);
                h(arrayList, c1170a);
                f(arrayList, c1170a);
                g(arrayList, c1170a);
                if (list9 instanceof Collection) {
                }
                it = list9.iterator();
                while (it.hasNext()) {
                }
                arrayList.add(x(this, c1170a, AdapterEntryType.TYPE_DELETED, list2));
            }
        } else {
            z2 = true;
        }
        z3 = false;
        if (aVar3 == null) {
        }
        if (aVar3 instanceof MsgFromUser) {
        }
        size = list2.size();
        while (i < size) {
        }
        AdapterEntryType adapterEntryType152 = AdapterEntryType.TYPE_MARKET_LARGE;
        size2 = list2.size();
        while (i2 < size2) {
        }
        AdapterEntryType adapterEntryType162 = AdapterEntryType.TYPE_MARKET_BLOCKED;
        size3 = list2.size();
        while (i3 < size3) {
        }
        AdapterEntryType adapterEntryType172 = AdapterEntryType.TYPE_LINK_PRODUCT;
        size4 = list2.size();
        i4 = 0;
        while (i4 < size4) {
        }
        AdapterEntryType adapterEntryType182 = AdapterEntryType.TYPE_LINK_LARGE;
        size5 = list2.size();
        i5 = 0;
        while (i5 < size5) {
        }
        AdapterEntryType adapterEntryType192 = AdapterEntryType.TYPE_MAP;
        size6 = list2.size();
        while (i6 < size6) {
        }
        AdapterEntryType adapterEntryType202 = AdapterEntryType.TYPE_ARTICLE;
        size7 = list2.size();
        while (i7 < size7) {
        }
        AdapterEntryType adapterEntryType212 = AdapterEntryType.TYPE_CALL;
        size8 = list2.size();
        while (i8 < size8) {
        }
        AdapterEntryType adapterEntryType222 = AdapterEntryType.TYPE_GROUP_CALL;
        size9 = list2.size();
        while (i9 < size9) {
        }
        AdapterEntryType adapterEntryType232 = AdapterEntryType.TYPE_PODCAST_EPISODE;
        size10 = list2.size();
        while (i10 < size10) {
        }
        AdapterEntryType adapterEntryType242 = AdapterEntryType.TYPE_MARKET_SMALL;
        size11 = list2.size();
        while (i11 < size11) {
        }
        AdapterEntryType adapterEntryType252 = AdapterEntryType.TYPE_LINK_SMALL;
        size12 = list2.size();
        while (i12 < size12) {
        }
        AdapterEntryType adapterEntryType262 = AdapterEntryType.TYPE_DOC_SIMPLE;
        size13 = list2.size();
        while (i13 < size13) {
        }
        if (z16) {
        }
        while (r7.hasNext()) {
        }
        AdapterEntryType adapterEntryType272 = AdapterEntryType.TYPE_WALL_POST_REPLY;
        size14 = list2.size();
        while (i14 < size14) {
        }
        boolean z202 = c1170a.g;
        if (z16) {
        }
        while (r6.hasNext()) {
        }
        AdapterEntryType adapterEntryType282 = AdapterEntryType.TYPE_AUDIO;
        AdapterEntryType adapterEntryType292 = AdapterEntryType.TYPE_AUDIO_COMPACT;
        if (!z17) {
        }
        if (i21 == 0) {
        }
        if (aVar == null) {
        }
        z5 = false;
        if (aVar == null) {
        }
        if (aVar instanceof MsgFromUser) {
        }
        size15 = list2.size();
        while (i15 < size15) {
        }
        List<Attach> list1622 = c1170a.a;
        boolean z2322 = c1170a.f;
        list = list1622;
        if (list instanceof List) {
        }
        while (r6.hasNext()) {
        }
        c(arrayList, c1170a);
        AdapterEntryType adapterEntryType3022 = AdapterEntryType.TYPE_PODCAST_EPISODE_RESTRICTED;
        size16 = list2.size();
        while (i16 < size16) {
        }
        AdapterEntryType adapterEntryType3122 = AdapterEntryType.TYPE_EVENT;
        size17 = list2.size();
        while (i17 < size17) {
        }
        AdapterEntryType adapterEntryType3222 = AdapterEntryType.TYPE_UNSUPPORTED;
        List<Attach> list1822 = c1170a.a;
        size18 = list1822.size();
        while (i18 < size18) {
        }
        o(arrayList, c1170a);
        i(arrayList, c1170a);
        k(arrayList, c1170a);
        v(arrayList, c1170a);
        n(arrayList, c1170a);
        r(arrayList, c1170a);
        s(arrayList, c1170a);
        b(arrayList, c1170a);
        l(arrayList, c1170a);
        p(arrayList, c1170a);
        q(arrayList, c1170a);
        e(arrayList, c1170a);
        h(arrayList, c1170a);
        f(arrayList, c1170a);
        g(arrayList, c1170a);
        if (list9 instanceof Collection) {
        }
        it = list9.iterator();
        while (it.hasNext()) {
        }
        arrayList.add(x(this, c1170a, AdapterEntryType.TYPE_DELETED, list2));
    }

    public final void e(ArrayList arrayList, C1170a c1170a) {
        List<Attach> list;
        List<Attach> list2 = c1170a.a;
        int i = c1170a.d;
        List<Attach> list3 = list2;
        if (!(list3 instanceof List) || !(list3 instanceof RandomAccess)) {
            for (Attach attach : list3) {
                if (attach instanceof AttachChannelMessage) {
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER, attach, null));
                    AttachChannelMessage attachChannelMessage = (AttachChannelMessage) attach;
                    String str = attachChannelMessage.h;
                    String str2 = attachChannelMessage.e;
                    List<Attach> list4 = attachChannelMessage.g;
                    if (myc0.f(str)) {
                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_CHANNEL_MSG_UNAVAILABLE, attach, null));
                        if (i == 0) {
                            arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_TIME, attach, null));
                            return;
                        }
                        return;
                    }
                    PostDonut postDonut = attachChannelMessage.k;
                    if ((postDonut != null ? postDonut.g : null) != null) {
                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN, attach, null));
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list4) {
                        if (A((Attach) obj, list4)) {
                            arrayList2.add(obj);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        d(arrayList, C1170a.a(c1170a, arrayList2));
                    }
                    if (myc0.f(str2)) {
                        ucp ucpVar = ucp.a;
                        boolean b = com.vk.im.ui.components.viewcontrollers.msg_list.a.b(str2);
                        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_TEXT;
                        MsgTextFormat msgTextFormat = MsgTextFormat.d;
                        arrayList.add(w(c1170a, adapterEntryType, attach, o040.b(this.a, str2, MsgTextFormat.a.a(attachChannelMessage.f), b, true, 8)));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list4) {
                        Attach attach2 = (Attach) obj2;
                        if (!(attach2 instanceof AttachWall) && !(attach2 instanceof AttachUnsupported) && !A(attach2, list4)) {
                            arrayList3.add(obj2);
                        }
                    }
                    C1170a a = C1170a.a(c1170a, arrayList3);
                    if (!arrayList3.isEmpty()) {
                        d(arrayList, a);
                    }
                }
            }
            return;
        }
        List<Attach> list5 = list3;
        int size = list5.size();
        for (int i2 = 0; i2 < size; i2++) {
            Attach attach3 = list5.get(i2);
            if (attach3 instanceof AttachChannelMessage) {
                arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER, attach3, null));
                AttachChannelMessage attachChannelMessage2 = (AttachChannelMessage) attach3;
                String str3 = attachChannelMessage2.h;
                String str4 = attachChannelMessage2.e;
                List<Attach> list6 = attachChannelMessage2.g;
                if (myc0.f(str3)) {
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_CHANNEL_MSG_UNAVAILABLE, attach3, null));
                    if (i == 0) {
                        arrayList.add(w(c1170a, AdapterEntryType.TYPE_FWD_TIME, attach3, null));
                        return;
                    }
                    return;
                }
                PostDonut postDonut2 = attachChannelMessage2.k;
                if ((postDonut2 != null ? postDonut2.g : null) != null) {
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_DONATE_PLACEHOLDER_REDESIGN, attach3, null));
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list6) {
                    if (A((Attach) obj3, list6)) {
                        arrayList4.add(obj3);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    d(arrayList, C1170a.a(c1170a, arrayList4));
                }
                if (myc0.f(str4)) {
                    ucp ucpVar2 = ucp.a;
                    boolean b2 = com.vk.im.ui.components.viewcontrollers.msg_list.a.b(str4);
                    AdapterEntryType adapterEntryType2 = AdapterEntryType.TYPE_TEXT;
                    MsgTextFormat msgTextFormat2 = MsgTextFormat.d;
                    MsgTextFormat a2 = MsgTextFormat.a.a(attachChannelMessage2.f);
                    list = list6;
                    arrayList.add(w(c1170a, adapterEntryType2, attach3, o040.b(this.a, str4, a2, b2, true, 8)));
                } else {
                    list = list6;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list) {
                    Attach attach4 = (Attach) obj4;
                    if (!(attach4 instanceof AttachWall) && !(attach4 instanceof AttachUnsupported) && !A(attach4, list)) {
                        arrayList5.add(obj4);
                    }
                }
                C1170a a3 = C1170a.a(c1170a, arrayList5);
                if (!arrayList5.isEmpty()) {
                    d(arrayList, a3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.g8() == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(AttachWall attachWall, C1170a c1170a, ArrayList arrayList) {
        EmptyList emptyList = EmptyList.b;
        Msg msg = c1170a.b;
        int i = c1170a.d;
        if (c1170a.f) {
            i++;
        }
        C1170a c1170a2 = new C1170a((List) emptyList, msg, (NestedMsg) null, i, c1170a.e, false, c1170a.h, 64);
        if (attachWall.o.size() != 1 || !(j5g.b0(0, attachWall.o) instanceof AttachVideo) || !drm0.N(attachWall.m)) {
            arrayList.add(w(c1170a2, AdapterEntryType.TYPE_WALL_POST_OWNER, attachWall, null));
        }
        com.vk.im.engine.models.messages.a aVar = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
        int S8 = aVar != null ? aVar.S8(NestedMsg.Type.FWD) : 0;
        if (msg instanceof MsgFromUser) {
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            if (!msgFromUser.k8()) {
            }
            arrayList.add(w(c1170a2, AdapterEntryType.TYPE_FWD_WALL_POST_TEXT, attachWall, null));
            arrayList.add(w(c1170a2, AdapterEntryType.TYPE_WALL_POST_BUTTON, attachWall, null));
        }
        if (S8 <= 1) {
            List D = D(attachWall.o);
            u(attachWall, D, C1170a.a(c1170a2, D), arrayList);
            arrayList.add(w(c1170a2, AdapterEntryType.TYPE_WALL_POST_BUTTON, attachWall, null));
        }
        arrayList.add(w(c1170a2, AdapterEntryType.TYPE_FWD_WALL_POST_TEXT, attachWall, null));
        arrayList.add(w(c1170a2, AdapterEntryType.TYPE_WALL_POST_BUTTON, attachWall, null));
    }

    public final void t(AttachWall attachWall, C1170a c1170a, ArrayList arrayList) {
        List D = D(attachWall.o);
        Msg msg = c1170a.b;
        boolean z = c1170a.f;
        C1170a c1170a2 = new C1170a((List<? extends Attach>) D, msg, (NestedMsg) null, z ? c1170a.d + 1 : 0, c1170a.e, true, !z, c1170a.h);
        arrayList.add(w(c1170a2, AdapterEntryType.TYPE_WALL_POST_OWNER, attachWall, null));
        u(attachWall, D, c1170a2, arrayList);
    }

    public final void u(AttachWall attachWall, List list, C1170a c1170a, ArrayList arrayList) {
        if (!attachWall.A) {
            PostDonut postDonut = attachWall.s;
            if ((postDonut != null ? postDonut.c : null) == null) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (A((Attach) obj, list)) {
                        arrayList2.add(obj);
                    } else {
                        arrayList3.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                List list2 = (List) pair.d();
                List list3 = (List) pair.g();
                if (!list2.isEmpty()) {
                    d(arrayList, C1170a.a(c1170a, list2));
                }
                if (!drm0.N(attachWall.m)) {
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_WALL_POST_TEXT, attachWall, o040.a(this.a, attachWall.m, 10)));
                }
                if (!list3.isEmpty()) {
                    d(arrayList, C1170a.a(c1170a, list3));
                }
                if (attachWall.o.size() > list.size()) {
                    new ArrayList(attachWall.o).removeAll(list);
                    arrayList.add(w(c1170a, AdapterEntryType.TYPE_WALL_POST_COLLAPSE_TEXT, attachWall, null));
                    return;
                }
                return;
            }
        }
        arrayList.add(w(c1170a, AdapterEntryType.TYPE_WALL_POST_PLACEHOLDER, attachWall, null));
    }

    public final g y(C1170a c1170a, AdapterEntryType adapterEntryType, AttachGift attachGift) {
        String body;
        gtx0 gtx0Var = c1170a.b;
        CharSequence charSequence = null;
        com.vk.im.engine.models.messages.a aVar = gtx0Var instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
        if (aVar != null && (body = aVar.getBody()) != null) {
            charSequence = o040.a(this.a, body, 8);
        }
        return w(c1170a, adapterEntryType, attachGift, charSequence);
    }
}
