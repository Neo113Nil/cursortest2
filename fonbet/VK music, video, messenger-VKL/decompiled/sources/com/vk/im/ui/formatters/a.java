package com.vk.im.ui.formatters;

import android.content.Context;
import android.content.res.Resources;
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
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.common.data.ApiApplication;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
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
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a0a;
import xsna.b810;
import xsna.bu00;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.g5g;
import xsna.g620;
import xsna.gdp;
import xsna.i5g;
import xsna.i5s;
import xsna.izs;
import xsna.j5g;
import xsna.ob50;
import xsna.rli0;
import xsna.ulp0;
import xsna.wqm0;

/* compiled from: MsgAttachFormatter.kt */
/* loaded from: classes2.dex */
public final class a {
    public final Context a;
    public final gdp b = new gdp();
    public final List<f> c;

    /* compiled from: MsgAttachFormatter.kt */
    /* renamed from: com.vk.im.ui.formatters.a$a, reason: collision with other inner class name */
    public static final class C1173a implements f {
        public final Context a;

        public C1173a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
        @Override // com.vk.im.ui.formatters.a.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String a(List<? extends Attach> list) {
            boolean z;
            boolean z2;
            int b = bu00.b(list, MiniAppSnippetDataAttach.class);
            if (b == 0) {
                return "";
            }
            Context context = this.a;
            boolean z3 = true;
            if (b != 1) {
                ApiApplication apiApplication = ((MiniAppSnippetDataAttach) j5g.Y(g5g.E(list, MiniAppSnippetDataAttach.class))).h;
                if (!epx.f(apiApplication != null ? apiApplication.C : null, "game")) {
                    if (!epx.f(apiApplication != null ? apiApplication.C : null, "standalone")) {
                        z2 = false;
                        if (!(apiApplication == null ? apiApplication.zb().equals(Boolean.TRUE) : false) && !z2) {
                            z3 = false;
                        }
                        return context.getResources().getQuantityString(!z3 ? R.plurals.vkim_msg_game_multiple : R.plurals.vkim_msg_mini_app_multiple, b, Integer.valueOf(b));
                    }
                }
                z2 = true;
                if (!(apiApplication == null ? apiApplication.zb().equals(Boolean.TRUE) : false)) {
                    z3 = false;
                }
                return context.getResources().getQuantityString(!z3 ? R.plurals.vkim_msg_game_multiple : R.plurals.vkim_msg_mini_app_multiple, b, Integer.valueOf(b));
            }
            MiniAppSnippetDataAttach miniAppSnippetDataAttach = (MiniAppSnippetDataAttach) j5g.Y(g5g.E(list, MiniAppSnippetDataAttach.class));
            ApiApplication apiApplication2 = miniAppSnippetDataAttach.h;
            if (!epx.f(apiApplication2 != null ? apiApplication2.C : null, "game")) {
                if (!epx.f(apiApplication2 != null ? apiApplication2.C : null, "standalone")) {
                    z = false;
                    if (!(apiApplication2 == null ? apiApplication2.zb().equals(Boolean.TRUE) : false) && !z) {
                        z3 = false;
                    }
                    return context.getString(!z3 ? R.string.vkim_text_game_action_attach : R.string.vkim_text_app_action_attach, miniAppSnippetDataAttach.c);
                }
            }
            z = true;
            if (!(apiApplication2 == null ? apiApplication2.zb().equals(Boolean.TRUE) : false)) {
                z3 = false;
            }
            return context.getString(!z3 ? R.string.vkim_text_game_action_attach : R.string.vkim_text_app_action_attach, miniAppSnippetDataAttach.c);
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class b implements f {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            Object obj;
            int b = bu00.b(list, AttachAudioMsg.class);
            if (b == 0) {
                return "";
            }
            Context context = this.a;
            if (b != 1) {
                return context.getResources().getQuantityString(R.plurals.vkim_msg_audiomsg_multiple, b, Integer.valueOf(b));
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof AttachAudioMsg) {
                    break;
                }
            }
            AttachAudioMsg attachAudioMsg = (AttachAudioMsg) (obj instanceof AttachAudioMsg ? obj : null);
            return (attachAudioMsg == null || !attachAudioMsg.I5() || attachAudioMsg.l.length() <= 0) ? context.getString(R.string.vkim_msg_audiomsg_single) : context.getString(R.string.vkim_msg_transcript_with_emoji, attachAudioMsg.l);
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class c implements f {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof AttachChannelStub) {
                    arrayList.add(obj);
                }
            }
            AttachChannelStub attachChannelStub = (AttachChannelStub) j5g.a0(arrayList);
            if (attachChannelStub == null) {
                return "";
            }
            int size = arrayList.size();
            Context context = this.a;
            if (size > 1 && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((AttachChannelStub) it.next()).b != attachChannelStub.b) {
                        return context.getResources().getQuantityString(R.plurals.vkim_msg_attach_multiple, size, Integer.valueOf(size));
                    }
                }
            }
            Resources resources = context.getResources();
            boolean z = attachChannelStub.l;
            if (z && size > 1) {
                return resources.getQuantityString(R.plurals.vkim_msg_photo_multiple, size, Integer.valueOf(size));
            }
            if (z) {
                return context.getString(R.string.vkim_msg_photo_single);
            }
            boolean z2 = attachChannelStub.m;
            if (z2 && size > 1) {
                return resources.getQuantityString(R.plurals.vkim_msg_video_multiple, size, Integer.valueOf(size));
            }
            if (z2) {
                return context.getString(R.string.vkim_msg_video_single);
            }
            boolean z3 = attachChannelStub.n;
            if (z3 && size > 1) {
                return resources.getQuantityString(R.plurals.vkim_msg_audio_multiple, size, Integer.valueOf(size));
            }
            if (!z3) {
                boolean z4 = attachChannelStub.o;
                return (!z4 || size <= 1) ? z4 ? resources.getString(R.string.vkim_msg_doc_single) : "" : resources.getQuantityString(R.plurals.vkim_msg_doc_multiple, size, Integer.valueOf(size));
            }
            return "♫ " + attachChannelStub.f + " – " + attachChannelStub.e;
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class d implements f {
        public final Class<? extends Attach> a;
        public final Context b;
        public final int c;
        public final int d;

        public d(Class<? extends Attach> cls, Context context, int i, int i2) {
            this.a = cls;
            this.b = context;
            this.c = i;
            this.d = i2;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, this.a);
            if (b == 0) {
                return "";
            }
            Context context = this.b;
            if (b == 1) {
                return context.getString(this.c);
            }
            return context.getResources().getQuantityString(this.d, b, Integer.valueOf(b));
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class e implements f {
        public final Context a;

        public e(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachDoc.class);
            if (b == 0) {
                return "";
            }
            int i = 0;
            for (int i2 = 0; i2 < b; i2++) {
                Attach attach = list.get(i2);
                if ((attach instanceof AttachDoc) && "gif".equalsIgnoreCase(((AttachDoc) attach).j)) {
                    i++;
                }
            }
            Resources resources = this.a.getResources();
            return b == i ? b == 1 ? resources.getString(R.string.vkim_msg_gif_single) : resources.getQuantityString(R.plurals.vkim_msg_gif_multiple, b, Integer.valueOf(b)) : b == 1 ? resources.getString(R.string.vkim_msg_doc_single) : resources.getQuantityString(R.plurals.vkim_msg_doc_multiple, b, Integer.valueOf(b));
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public interface f {
        String a(List<? extends Attach> list);
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class g implements f {
        public final Context a;

        public g(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            Context context = this.a;
            int b = bu00.b(list, AttachLink.class);
            if (b == 0) {
                return "";
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < b; i3++) {
                Attach attach = list.get(i3);
                boolean z = attach instanceof AttachLink;
                if (z) {
                    AttachLink attachLink = (AttachLink) attach;
                    if (drm0.D(attachLink.e, a0a.d, true) && drm0.D(attachLink.e, "narrative", true)) {
                        i++;
                    }
                }
                if (z) {
                    AttachLink attachLink2 = (AttachLink) attach;
                    if (drm0.D(attachLink2.e, a0a.d, true) && drm0.D(attachLink2.e, "textlive", true)) {
                        i2++;
                    }
                }
            }
            Resources resources = context.getResources();
            return b == i ? b == 1 ? resources.getString(R.string.vkim_msg_narrative_single) : resources.getQuantityString(R.plurals.vkim_msg_narrative_multiple, b, Integer.valueOf(b)) : b == i2 ? b == 1 ? resources.getString(R.string.vkim_msg_textlive_single) : resources.getQuantityString(R.plurals.vkim_msg_textlive_multiple, b, Integer.valueOf(b)) : b == 1 ? context.getString(R.string.vkim_msg_link_single) : context.getResources().getQuantityString(R.plurals.vkim_msg_link_multiple, b, Integer.valueOf(b));
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class h implements f {
        public final Context a;

        public h(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachMiniApp.class);
            if (b == 0) {
                return "";
            }
            Context context = this.a;
            if (b != 1) {
                ApiApplication apiApplication = ((AttachMiniApp) j5g.Y(g5g.E(list, AttachMiniApp.class))).b;
                return context.getResources().getQuantityString((apiApplication.zb().booleanValue() || (epx.f(apiApplication.C, "game") || epx.f(apiApplication.C, "standalone"))) ? R.plurals.vkim_msg_game_multiple : R.plurals.vkim_msg_mini_app_multiple, b, Integer.valueOf(b));
            }
            ApiApplication apiApplication2 = ((AttachMiniApp) j5g.Y(g5g.E(list, AttachMiniApp.class))).b;
            return context.getString((apiApplication2.zb().booleanValue() || (epx.f(apiApplication2.C, "game") || epx.f(apiApplication2.C, "standalone"))) ? R.string.vkim_msg_game_single : R.string.vkim_msg_mini_app_single);
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class i implements f {
        public final Context a;

        public i(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachAudio.class);
            if (b == 0) {
                return "";
            }
            for (Object obj : list) {
                if (((Attach) obj) instanceof AttachAudio) {
                    AttachAudio attachAudio = (AttachAudio) obj;
                    if (b != 1) {
                        return this.a.getResources().getQuantityString(R.plurals.vkim_msg_audio_multiple, b, Integer.valueOf(b));
                    }
                    return "♫ " + ob50.a(attachAudio.b) + " – " + attachAudio.b.d;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class j implements f {
        public final Context a;

        public j(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachPlaylist.class);
            String str = "";
            if (b == 0) {
                return "";
            }
            for (Object obj : list) {
                if (((Attach) obj) instanceof AttachPlaylist) {
                    AttachPlaylist attachPlaylist = (AttachPlaylist) obj;
                    if (b != 1) {
                        return this.a.getResources().getQuantityString(attachPlaylist.i() ? R.plurals.vkim_msg_album_multiple : R.plurals.vkim_msg_playlist_multiple, b, Integer.valueOf(b));
                    }
                    StringBuilder sb = new StringBuilder("♫ ");
                    String str2 = attachPlaylist.b.o;
                    if (str2 != null && str2.length() != 0) {
                        str = i5s.a(new StringBuilder(), attachPlaylist.b.o, " - ");
                    }
                    sb.append(str);
                    sb.append(attachPlaylist.getTitle());
                    return sb.toString();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class k implements f {
        public final Context a;

        public k(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachMarket.class);
            if (b == 0) {
                return "";
            }
            for (Object obj : list) {
                if (((Attach) obj) instanceof AttachMarket) {
                    Pair pair = ((AttachMarket) obj).p ? new Pair(Integer.valueOf(R.string.vkim_msg_market_service_single), Integer.valueOf(R.plurals.vkim_msg_market_service_multiple)) : new Pair(Integer.valueOf(R.string.vkim_msg_market_single), Integer.valueOf(R.plurals.vkim_msg_market_multiple));
                    int intValue = ((Number) pair.d()).intValue();
                    int intValue2 = ((Number) pair.g()).intValue();
                    Context context = this.a;
                    return b == 1 ? context.getString(intValue) : context.getResources().getQuantityString(intValue2, b, Integer.valueOf(b));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class l implements f {
        public final Context a;

        public l(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachRoom.class);
            if (b == 0) {
                return "";
            }
            for (Object obj : list) {
                if (((Attach) obj) instanceof AttachRoom) {
                    AttachRoom attachRoom = (AttachRoom) obj;
                    Context context = this.a;
                    if (b != 1) {
                        return context.getResources().getQuantityString(R.plurals.vkim_msg_room_multiple, b, Integer.valueOf(b));
                    }
                    String str = attachRoom.b.c;
                    return drm0.N(str) ? context.getString(R.string.vkim_msg_room_single) : str;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class m implements f {
        public final Class<? extends Attach> a;
        public final Context b;

        public m(Context context, Class cls) {
            this.a = cls;
            this.b = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            return bu00.b(list, this.a) == 0 ? "" : this.b.getString(R.string.vkim_msg_group_call_single);
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class n implements f {
        public final Context a;

        public n(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachVideo.class);
            if (b == 0) {
                return "";
            }
            for (Object obj : list) {
                if (((Attach) obj) instanceof AttachVideo) {
                    AttachVideo attachVideo = (AttachVideo) obj;
                    Context context = this.a;
                    if (b == 1) {
                        return context.getString(attachVideo.b.q0() ? R.string.vkim_msg_live_single : g620.f().c(attachVideo.b) ? R.string.vkim_msg_clip_single : R.string.vkim_msg_video_single);
                    }
                    return context.getResources().getQuantityString(g620.f().c(attachVideo.b) ? R.plurals.vkim_msg_clip_multiple : R.plurals.vkim_msg_video_multiple, b, Integer.valueOf(b));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final class o implements f {
        public final Context a;

        public o(Context context) {
            this.a = context;
        }

        @Override // com.vk.im.ui.formatters.a.f
        public final String a(List<? extends Attach> list) {
            int b = bu00.b(list, AttachVideoMsg.class);
            if (b == 0) {
                return "";
            }
            Context context = this.a;
            if (b != 1) {
                return context.getResources().getQuantityString(R.plurals.vkim_msg_video_msg_multiple, b, Integer.valueOf(b));
            }
            AttachVideoMsg attachVideoMsg = (AttachVideoMsg) j5g.Y(g5g.E(list, AttachVideoMsg.class));
            return (!attachVideoMsg.I5() || attachVideoMsg.r.length() <= 0) ? context.getString(R.string.vkim_msg_video_msg_single) : context.getString(R.string.vkim_msg_transcript_with_emoji, attachVideoMsg.r);
        }
    }

    /* compiled from: MsgAttachFormatter.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements izs<String, Boolean> {
        public static final p b = new p(1, wqm0.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);

        @Override // xsna.izs
        public final Boolean invoke(String str) {
            return Boolean.valueOf(str.length() > 0);
        }
    }

    public a(Context context) {
        this.a = context;
        this.c = e43.l(new d(AttachImage.class, context, R.string.vkim_msg_photo_single, R.plurals.vkim_msg_photo_multiple), new n(context), new o(context), new i(context), new d(AttachMap.class, context, R.string.vkim_msg_map_single, R.plurals.vkim_msg_map_multiple), new d(AttachSticker.class, context, R.string.vkim_msg_sticker_single, R.plurals.vkim_msg_sticker_multiple), new d(AttachUgcSticker.class, context, R.string.vkim_msg_sticker_single, R.plurals.vkim_msg_sticker_multiple), new d(AttachGift.class, context, R.string.vkim_msg_gift_simple_single, R.plurals.vkim_msg_gift_simple_multiple), new e(context), new d(AttachWall.class, context, R.string.vkim_msg_wall_single, R.plurals.vkim_msg_wall_multiple), new d(AttachWallReply.class, context, R.string.vkim_msg_wall_reply_single, R.plurals.vkim_msg_wall_reply_multiple), new d(AttachChannelMessage.class, context, R.string.vkim_msg_channel_message_single, R.plurals.vkim_msg_channel_message_multiple), new g(context), new k(context), new b(context), new d(AttachGraffiti.class, context, R.string.vkim_msg_graffiti_single, R.plurals.vkim_msg_graffiti_multiple), new j(context), new d(AttachArticle.class, context, R.string.vkim_msg_article_single, R.plurals.vkim_msg_article_multiple), new d(AttachCall.class, context, R.string.vkim_msg_call_single, R.plurals.vkim_msg_call_multiple), new m(context, AttachGroupCallFinished.class), new m(context, AttachGroupCallInProgress.class), new d(AttachStory.class, context, R.string.vkim_msg_story_single, R.plurals.vkim_msg_story_multiple), new d(AttachPoll.class, context, R.string.vkim_msg_poll_single, R.plurals.vkim_msg_poll_multiple), new d(AttachPodcastEpisode.class, context, R.string.vkim_msg_podcast_episode_single, R.plurals.vkim_msg_podcast_episode_multiple), new d(AttachArtist.class, context, R.string.vkim_msg_artist_renamed_single, R.plurals.vkim_msg_artist_renamed_multiple), new d(AttachCurator.class, context, R.string.vkim_msg_curator_single, R.plurals.vkim_msg_curator_multiple), new d(AttachEvent.class, context, R.string.vkim_msg_link_single, R.plurals.vkim_msg_link_multiple), new h(context), new C1173a(context), new d(AttachDonutLink.class, context, R.string.vkim_msg_link_single, R.plurals.vkim_msg_link_multiple), new d(AttachWidget.class, context, R.string.vkim_msg_widget_single, R.plurals.vkim_msg_widget_multiple), new d(AttachHighlight.class, context, R.string.vkim_msg_narrative_single, R.plurals.vkim_msg_narrative_multiple), new d(AttachQuestion.class, context, R.string.vkim_msg_narrative_single, R.plurals.vkim_msg_narrative_multiple), new l(context), new c(context));
    }

    public final String a(AttachDeleted attachDeleted) {
        int i2;
        int i3 = attachDeleted.e;
        if (i3 == 1) {
            i2 = R.string.vkim_msg_article_deleted;
        } else if (i3 == 2) {
            i2 = R.string.vkim_msg_audio_deleted;
        } else if (i3 == 3) {
            i2 = R.string.vkim_msg_audiomsg_deleted;
        } else if (i3 == 5) {
            i2 = R.string.vkim_msg_doc_deleted;
        } else if (i3 == 20) {
            i2 = R.string.vkim_msg_video_deleted;
        } else if (i3 == 23) {
            i2 = R.string.vkim_msg_podcast_deleted;
        } else if (i3 != 40) {
            switch (i3) {
                case 8:
                    i2 = R.string.vkim_msg_graffiti_deleted;
                    break;
                case 9:
                    i2 = R.string.vkim_msg_photo_deleted;
                    break;
                case 10:
                    i2 = R.string.vkim_msg_link_deleted;
                    break;
                case 11:
                    i2 = R.string.vkim_msg_map_deleted;
                    break;
                case 12:
                    i2 = R.string.vkim_msg_market_deleted;
                    break;
                default:
                    switch (i3) {
                        case 15:
                            i2 = R.string.vkim_msg_playlist_deleted;
                            break;
                        case 16:
                            i2 = R.string.vkim_msg_poll_deleted;
                            break;
                        case 17:
                            i2 = R.string.vkim_msg_sticker_deleted;
                            break;
                        case 18:
                            i2 = R.string.vkim_msg_story_deleted;
                            break;
                        default:
                            i2 = R.string.vkim_msg_etc_deleted;
                            break;
                    }
            }
        } else {
            i2 = R.string.vkim_msg_room_deleted;
        }
        return this.a.getString(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence b(Msg msg) {
        return msg instanceof MsgFromChannel ? c(((MsgFromChannel) msg).E) : msg instanceof com.vk.im.engine.models.messages.a ? c(((com.vk.im.engine.models.messages.a) msg).K0()) : "";
    }

    public final CharSequence c(List<? extends Attach> list) {
        if (list.isEmpty()) {
            return "";
        }
        int size = list.size();
        int b2 = bu00.b(list, AttachDeleted.class);
        Context context = this.a;
        if (size == b2) {
            return list.size() == 1 ? a((AttachDeleted) j5g.Y(list)) : context.getString(R.string.vkim_msg_etc_deleted);
        }
        if (list.size() == 2 && bu00.b(list, AttachStory.class) == 1 && bu00.b(list, AttachSticker.class) == 1) {
            return context.getString(R.string.vkim_story_reaction);
        }
        if (!list.isEmpty()) {
            Attach attach = list.get(0);
            int size2 = list.size();
            int i2 = 1;
            while (i2 < size2) {
                Attach attach2 = list.get(i2);
                if (attach2.getClass().equals(attach.getClass())) {
                    i2++;
                    attach = attach2;
                }
            }
            String str = (String) rli0.n(rli0.j(new ulp0(new i5g(this.c), new b810(list, 3)), p.b));
            if (str != null) {
                this.b.getClass();
                CharSequence a = gdp.a(str);
                if (a != null) {
                    return a;
                }
            }
            return context.getString(R.string.vkim_msg_unsupported);
        }
        int size3 = list.size();
        return size3 == 1 ? context.getString(R.string.vkim_msg_attach_single) : context.getResources().getQuantityString(R.plurals.vkim_msg_attach_multiple, size3, Integer.valueOf(size3));
    }
}
