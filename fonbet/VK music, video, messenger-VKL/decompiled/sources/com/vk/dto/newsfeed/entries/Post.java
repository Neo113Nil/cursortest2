package com.vk.dto.newsfeed.entries;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.CommentsInfo;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.dto.newsfeed.entries.post.DonutBadgeInfo;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.c6z;
import xsna.cn70;
import xsna.ej90;
import xsna.epx;
import xsna.fsx0;
import xsna.g620;
import xsna.gmq;
import xsna.j5g;
import xsna.l490;
import xsna.o25;
import xsna.o2f0;
import xsna.rsx0;
import xsna.uij0;
import xsna.wee0;
import xsna.yg5;
import xsna.zcl;
import xsna.zg90;
import xsna.zrp;

/* compiled from: Post.kt */
/* loaded from: classes18.dex */
public final class Post extends NewsEntryWithAttachments implements c6z, l490, gmq, o2f0, Badgeable, wee0, rsx0 {
    public static final Serializer.c<Post> CREATOR = new b();
    public final AttachmentsMeta A;
    public final CommentsInfo B;
    public final Activity C;
    public Post D;
    public final Counters E;
    public final boolean F;
    public final String G;
    public final String H;
    public EasyPromote I;
    public boolean J;
    public final Bundle K;
    public final NewsEntry.TrackData L;
    public final Poster M;
    public final NewsEntryWithAttachments.Cut N;
    public final Copyright O;
    public ej90 P;
    public final Owner Q;
    public PostDonut R;
    public final int S;
    public final Float T;
    public final String U;
    public ReactionSet V;
    public ItemReactions W;
    public BadgesSet X;
    public final SourceFrom Y;
    public String Z;
    public final uij0 a0;
    public final BadgeItem b0;
    public final DonutBadgeInfo c0;
    public final BadgeInfo d0;
    public final String e0;
    public NewsfeedCoowners f0;
    public final NewsfeedResearch g0;
    public final Flags l;
    public final UserId m;
    public final int n;
    public final Owner o;
    public final UserId p;
    public final Owner q;
    public final int r;
    public String s;
    public final String t;
    public final Integer u;
    public final Integer v;
    public final boolean w;
    public Caption x;
    public EntryHeader y;
    public final ArrayList<EntryAttachment> z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Post.kt */
    public static final class SourceFrom {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceFrom[] $VALUES;
        public static final SourceFrom Discover;
        public static final SourceFrom Newsfeed;

        static {
            SourceFrom sourceFrom = new SourceFrom("Newsfeed", 0);
            Newsfeed = sourceFrom;
            SourceFrom sourceFrom2 = new SourceFrom("Discover", 1);
            Discover = sourceFrom2;
            SourceFrom[] sourceFromArr = {sourceFrom, sourceFrom2};
            $VALUES = sourceFromArr;
            $ENTRIES = new asp(sourceFromArr);
        }

        public SourceFrom() {
            throw null;
        }

        public static SourceFrom valueOf(String str) {
            return (SourceFrom) Enum.valueOf(SourceFrom.class, str);
        }

        public static SourceFrom[] values() {
            return (SourceFrom[]) $VALUES.clone();
        }
    }

    /* compiled from: Post.kt */
    public static final class a {
        public static boolean a(ArrayList arrayList, AttachmentsMeta attachmentsMeta, String str) {
            VideoFile videoFile;
            EntryAttachment entryAttachment = (EntryAttachment) j5g.a0(arrayList);
            Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
            VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
            if (videoAttachment == null || (videoFile = videoAttachment.k) == null) {
                return false;
            }
            boolean equals = str.equals("reply");
            if (g620.f().c(videoFile)) {
                return (attachmentsMeta != null ? attachmentsMeta.b : null) == AttachmentsMeta.PrimaryMode.SINGLE && !equals;
            }
            return false;
        }

        public static Post b(Post post) {
            if (post == null) {
                return null;
            }
            Serializer.c<Post> cVar = Post.CREATOR;
            Post b = b(post.D);
            ej90 ej90Var = post.P;
            Post Nb = Post.Nb(post, null, null, 0, null, 0, null, new ArrayList(post.z), b, ej90Var != null ? ej90Var.a() : null, -1074020353);
            Nb.c = post.c;
            Nb.g = post.g;
            Nb.h = post.h;
            return Nb;
        }

        public static ej90 c(String str, Bundle bundle, float f, uij0 uij0Var, ej90.c cVar) {
            return ej90.a.a(str, new ej90.b(bundle, f, uij0Var, o25.a().i().U, new zg90(cn70.b(6)), 0, 0, null, null, 480), cVar);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Post> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x01b4, code lost:
        
            if (r4 == null) goto L18;
         */
        @Override // com.vk.core.serialize.Serializer.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Post a(Serializer serializer) {
            uij0 uij0Var;
            ej90 c;
            ArrayList k = serializer.k(EntryAttachment.class);
            if (k == null) {
                k = new ArrayList();
            }
            ArrayList arrayList = k;
            Flags flags = (Flags) serializer.G(Flags.class.getClassLoader());
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            int u = serializer.u();
            Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
            UserId userId2 = (UserId) serializer.A(UserId.class.getClassLoader());
            Owner owner2 = (Owner) serializer.G(Owner.class.getClassLoader());
            int u2 = serializer.u();
            String H = serializer.H();
            String H2 = serializer.H();
            Integer v = serializer.v();
            Integer v2 = serializer.v();
            boolean m = serializer.m();
            Caption caption = (Caption) serializer.G(Caption.class.getClassLoader());
            EntryHeader entryHeader = (EntryHeader) serializer.G(EntryHeader.class.getClassLoader());
            AttachmentsMeta attachmentsMeta = (AttachmentsMeta) serializer.G(AttachmentsMeta.class.getClassLoader());
            CommentsInfo commentsInfo = (CommentsInfo) serializer.G(CommentsInfo.class.getClassLoader());
            Activity activity = (Activity) serializer.G(Activity.class.getClassLoader());
            Post post = (Post) serializer.G(Post.class.getClassLoader());
            Counters counters = (Counters) serializer.G(Counters.class.getClassLoader());
            boolean m2 = serializer.m();
            String H3 = serializer.H();
            String H4 = serializer.H();
            EasyPromote easyPromote = (EasyPromote) serializer.G(EasyPromote.class.getClassLoader());
            boolean m3 = serializer.m();
            Bundle o = serializer.o(Post.class.getClassLoader());
            NewsEntry.TrackData trackData = (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader());
            Poster poster = (Poster) serializer.G(Poster.class.getClassLoader());
            NewsEntryWithAttachments.Cut cut = (NewsEntryWithAttachments.Cut) serializer.G(NewsEntryWithAttachments.Cut.class.getClassLoader());
            Copyright copyright = (Copyright) serializer.G(Copyright.class.getClassLoader());
            Owner owner3 = (Owner) serializer.G(Owner.class.getClassLoader());
            PostDonut postDonut = (PostDonut) serializer.G(PostDonut.class.getClassLoader());
            int u3 = serializer.u();
            Float t = serializer.t();
            String H5 = serializer.H();
            ReactionSet reactionSet = (ReactionSet) serializer.G(ReactionSet.class.getClassLoader());
            ItemReactions itemReactions = (ItemReactions) serializer.G(ItemReactions.class.getClassLoader());
            BadgesSet badgesSet = (BadgesSet) serializer.G(BadgesSet.class.getClassLoader());
            SourceFrom sourceFrom = (SourceFrom) serializer.C();
            if (sourceFrom == null) {
                sourceFrom = SourceFrom.Newsfeed;
            }
            SourceFrom sourceFrom2 = sourceFrom;
            String H6 = serializer.H();
            String H7 = serializer.H();
            if (H7 != null) {
                uij0Var = H7.equals("same_line") ? uij0.c.a : H7.equals("new_line") ? uij0.a.a : uij0.b.a;
            }
            uij0Var = uij0.a.a;
            BadgeItem badgeItem = (BadgeItem) serializer.G(BadgeItem.class.getClassLoader());
            DonutBadgeInfo donutBadgeInfo = (DonutBadgeInfo) serializer.G(DonutBadgeInfo.class.getClassLoader());
            BadgeInfo badgeInfo = (BadgeInfo) serializer.G(BadgeInfo.class.getClassLoader());
            ej90.c cVar = new ej90.c(0);
            FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
            feedFeatures.getClass();
            if (com.vk.toggle.b.A.a(feedFeatures)) {
                c = null;
            } else {
                Serializer.c<Post> cVar2 = Post.CREATOR;
                c = a.c(H, o, cut.d, uij0Var, cVar);
            }
            flags.Ab(68719476736L, cVar.a);
            flags.Ab(2199023255552L, serializer.m());
            Post post2 = new Post(flags, userId, u, owner, userId2, owner2, u2, H, H2, v, v2, m, caption, entryHeader, arrayList, attachmentsMeta, commentsInfo, activity, post, counters, m2, H3, H4, easyPromote, m3, o, trackData, poster, cut, copyright, c, owner3, postDonut, u3, t, H5, reactionSet, itemReactions, badgesSet, sourceFrom2, H6, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, serializer.H(), (NewsfeedCoowners) serializer.G(NewsfeedCoowners.class.getClassLoader()), (NewsfeedResearch) serializer.G(NewsfeedResearch.class.getClassLoader()));
            post2.c = serializer.m();
            return post2;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Post[i];
        }
    }

    public /* synthetic */ Post(Flags flags, UserId userId, int i, Owner owner, UserId userId2, Owner owner2, int i2, String str, String str2, Integer num, Integer num2, boolean z, Caption caption, EntryHeader entryHeader, ArrayList arrayList, AttachmentsMeta attachmentsMeta, CommentsInfo commentsInfo, Activity activity, Post post, Counters counters, boolean z2, String str3, String str4, EasyPromote easyPromote, boolean z3, Bundle bundle, NewsEntry.TrackData trackData, Poster poster, NewsEntryWithAttachments.Cut cut, Copyright copyright, ej90 ej90Var, Owner owner3, PostDonut postDonut, int i3, Float f, String str5, ReactionSet reactionSet, ItemReactions itemReactions, BadgesSet badgesSet, SourceFrom sourceFrom, String str6, uij0 uij0Var, BadgeItem badgeItem, DonutBadgeInfo donutBadgeInfo, BadgeInfo badgeInfo, String str7, NewsfeedCoowners newsfeedCoowners, NewsfeedResearch newsfeedResearch, int i4, int i5, zcl zclVar) {
        this(flags, userId, i, owner, userId2, owner2, i2, str, str2, num, num2, z, caption, entryHeader, arrayList, attachmentsMeta, commentsInfo, activity, post, counters, z2, str3, str4, easyPromote, z3, bundle, trackData, poster, cut, copyright, ej90Var, owner3, postDonut, i3, f, (i5 & 8) != 0 ? null : str5, reactionSet, itemReactions, badgesSet, (i5 & 128) != 0 ? SourceFrom.Newsfeed : sourceFrom, (i5 & 256) != 0 ? null : str6, (i5 & 512) != 0 ? uij0.a.a : uij0Var, (i5 & 1024) != 0 ? null : badgeItem, (i5 & 2048) != 0 ? null : donutBadgeInfo, (i5 & 4096) != 0 ? null : badgeInfo, (i5 & 8192) != 0 ? null : str7, (i5 & 16384) != 0 ? null : newsfeedCoowners, (i5 & 32768) != 0 ? null : newsfeedResearch);
    }

    public static Post Nb(Post post, Flags flags, UserId userId, int i, Owner owner, int i2, EntryHeader entryHeader, ArrayList arrayList, Post post2, ej90 ej90Var, int i3) {
        Flags flags2 = (i3 & 1) != 0 ? post.l : flags;
        UserId userId2 = (i3 & 2) != 0 ? post.m : userId;
        int i4 = (i3 & 4) != 0 ? post.n : i;
        Owner owner2 = (i3 & 8) != 0 ? post.o : owner;
        UserId userId3 = post.p;
        Owner owner3 = post.q;
        int i5 = (i3 & 64) != 0 ? post.r : i2;
        String str = post.s;
        String str2 = post.t;
        Integer num = post.u;
        Integer num2 = post.v;
        boolean z = post.w;
        Caption caption = post.x;
        EntryHeader entryHeader2 = (i3 & 8192) != 0 ? post.y : entryHeader;
        ArrayList arrayList2 = (i3 & 16384) != 0 ? post.z : arrayList;
        AttachmentsMeta attachmentsMeta = post.A;
        CommentsInfo commentsInfo = post.B;
        Activity activity = (i3 & 131072) != 0 ? post.C : null;
        Post post3 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? post.D : post2;
        Counters counters = post.E;
        boolean z2 = post.F;
        String str3 = post.G;
        String str4 = post.H;
        EasyPromote easyPromote = post.I;
        boolean z3 = post.J;
        Bundle bundle = post.K;
        NewsEntry.TrackData trackData = post.L;
        Poster poster = post.M;
        NewsEntryWithAttachments.Cut cut = post.N;
        Copyright copyright = post.O;
        ej90 ej90Var2 = (i3 & 1073741824) != 0 ? post.P : ej90Var;
        Owner owner4 = post.Q;
        PostDonut postDonut = post.R;
        int i6 = post.S;
        Float f = post.T;
        String str5 = post.U;
        ReactionSet reactionSet = post.V;
        ItemReactions itemReactions = post.W;
        BadgesSet badgesSet = post.X;
        SourceFrom sourceFrom = post.Y;
        String str6 = post.Z;
        uij0 uij0Var = post.a0;
        BadgeItem badgeItem = post.b0;
        DonutBadgeInfo donutBadgeInfo = post.c0;
        BadgeInfo badgeInfo = post.d0;
        String str7 = post.e0;
        NewsfeedCoowners newsfeedCoowners = post.f0;
        NewsfeedResearch newsfeedResearch = post.g0;
        post.getClass();
        return new Post(flags2, userId2, i4, owner2, userId3, owner3, i5, str, str2, num, num2, z, caption, entryHeader2, arrayList2, attachmentsMeta, commentsInfo, activity, post3, counters, z2, str3, str4, easyPromote, z3, bundle, trackData, poster, cut, copyright, ej90Var2, owner4, postDonut, i6, f, str5, reactionSet, itemReactions, badgesSet, sourceFrom, str6, uij0Var, badgeItem, donutBadgeInfo, badgeInfo, str7, newsfeedCoowners, newsfeedResearch);
    }

    public static boolean bc(fsx0 fsx0Var, UserId userId) {
        List<EntryAttachment> N7 = fsx0Var.N7();
        if (N7 == null) {
            return false;
        }
        Iterator<EntryAttachment> it = N7.iterator();
        while (it.hasNext()) {
            Attachment attachment = it.next().b;
            if (attachment instanceof PodcastAttachment) {
                PodcastAttachment podcastAttachment = (PodcastAttachment) attachment;
                if (epx.f(podcastAttachment.f.c, userId) && podcastAttachment.Db()) {
                    return true;
                }
            } else if (attachment instanceof ArticleAttachment) {
                Article article = ((ArticleAttachment) attachment).f;
                if (epx.f(article.c, userId) && (article.d() || article.k())) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r4.equals("topic") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r4.equals("photo") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4.equals("video") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0091, code lost:
    
        return r4 + r3 + '_' + r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.vk.feed.core.models.news.NewsEntry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String Ab() {
        int i = this.n;
        UserId userId = this.m;
        String str = this.t;
        if (str != null) {
            switch (str.hashCode()) {
                case -1081306052:
                    if (str.equals("market")) {
                        return "market" + userId + "?w=product" + userId + '_' + i;
                    }
                    break;
                case 106642994:
                    break;
                case 108401386:
                    if (str.equals("reply")) {
                        Integer num = this.u;
                        Integer num2 = this.v;
                        if (num2 == null) {
                            return "wall" + userId + '_' + i + "?reply=" + num;
                        }
                        return "wall" + userId + '_' + i + "?reply=" + num + "&thread=" + num2;
                    }
                    break;
                case 110546223:
                    break;
                case 112202875:
                    break;
            }
        }
        return "wall" + userId + '_' + i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append('_');
        sb.append(this.n);
        return sb.toString();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.L;
    }

    @Override // xsna.rsx0
    public final int D() {
        return this.r;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "post";
    }

    @Override // xsna.c6z
    public final int E1() {
        return this.E.e;
    }

    @Override // xsna.wee0
    public final Owner G() {
        return this.o;
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments
    public final List Gb() {
        return this.z;
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments
    public final NewsEntryWithAttachments.Cut Hb() {
        return this.N;
    }

    @Override // xsna.grj0
    public final boolean J() {
        return this.l.zb(8L);
    }

    @Override // xsna.o2f0
    public final ItemReactions K() {
        return this.W;
    }

    public final boolean Lb() {
        return this.l.zb(33554432L);
    }

    public final boolean Mb() {
        if (hc() || lc()) {
            return false;
        }
        Flags flags = this.l;
        if (flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) || flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            return false;
        }
        PostDonut postDonut = this.R;
        if ((postDonut != null ? postDonut.c : null) == null) {
            return (postDonut != null ? postDonut.g : null) == null;
        }
        return false;
    }

    @Override // xsna.fsx0
    public final List<EntryAttachment> N7() {
        return this.z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.z);
        serializer.i0(this.l);
        serializer.e0(this.m);
        serializer.S(this.n);
        serializer.i0(this.o);
        serializer.e0(this.p);
        serializer.i0(this.q);
        serializer.S(this.r);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.V(this.u);
        serializer.V(this.v);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.i0(this.x);
        serializer.i0(this.y);
        serializer.i0(this.A);
        serializer.i0(this.B);
        serializer.i0(this.C);
        serializer.i0(this.D);
        serializer.i0(this.E);
        serializer.L(this.F ? (byte) 1 : (byte) 0);
        serializer.j0(this.G);
        serializer.j0(this.H);
        serializer.i0(this.I);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.K(this.K);
        serializer.i0(this.L);
        serializer.i0(this.M);
        serializer.i0(this.N);
        serializer.i0(this.O);
        serializer.i0(this.Q);
        serializer.i0(this.R);
        serializer.S(this.S);
        serializer.R(this.T);
        serializer.j0(this.U);
        serializer.i0(this.V);
        serializer.i0(this.W);
        serializer.i0(this.X);
        serializer.g0(this.Y);
        serializer.j0(this.Z);
        serializer.j0(this.a0.toString());
        serializer.i0(this.b0);
        serializer.i0(this.c0);
        serializer.i0(this.d0);
        serializer.L(Pb() ? (byte) 1 : (byte) 0);
        serializer.j0(this.e0);
        serializer.i0(this.f0);
        serializer.i0(this.g0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    public final BadgeItem Ob() {
        return this.b0;
    }

    public final boolean Pb() {
        return this.l.zb(2199023255552L);
    }

    public final DonutBadgeInfo Qb() {
        return this.c0;
    }

    public final Flags Rb() {
        return this.l;
    }

    public final boolean Sb() {
        Iterator<EntryAttachment> it = this.z.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            Attachment attachment = it.next().b;
            boolean z = attachment instanceof PodcastAttachment;
            UserId userId = this.m;
            if (z) {
                MusicTrack musicTrack = ((PodcastAttachment) attachment).f;
                Episode episode = musicTrack.w;
                if ((episode != null ? episode.k : false) && epx.f(musicTrack.c, userId)) {
                    return true;
                }
            } else if (attachment instanceof ArticleAttachment) {
                Article article = ((ArticleAttachment) attachment).f;
                ArticleDonut articleDonut = article.q;
                if ((articleDonut != null ? articleDonut.b : false) && epx.f(article.c, userId)) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }

    @Override // xsna.grj0
    public final int T9() {
        return this.E.b;
    }

    public final boolean Tb() {
        PostDonut postDonut = this.R;
        return (postDonut != null ? postDonut.g : null) != null;
    }

    @Override // xsna.c6z
    public final void U8(int i) {
        this.E.c = i;
    }

    public final boolean Ub() {
        PostDonut postDonut = this.R;
        return (postDonut != null ? postDonut.c : null) != null;
    }

    public final boolean Vb() {
        return this.F;
    }

    @Override // xsna.c6z
    public final void W2() {
        this.l.Ab(4L, true);
    }

    public final ej90 Wb() {
        return this.P;
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.l.zb(67108864L);
    }

    public final int Xb() {
        return this.n;
    }

    public final Poster Yb() {
        return this.M;
    }

    public final boolean Z1() {
        return this.l.zb(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public final Post Zb() {
        return this.D;
    }

    public final Owner ac() {
        return this.q;
    }

    @Override // xsna.o2f0
    public final void b4(ItemReactions itemReactions) {
        this.W = itemReactions;
    }

    @Override // xsna.c6z
    public final boolean b9() {
        return this.l.zb(1L);
    }

    @Override // com.vk.dto.badges.Badgeable
    public final String ca() {
        return this.e0;
    }

    public final boolean cc(UserId userId) {
        PostDonut postDonut;
        PostDonut postDonut2;
        Post post = this.D;
        UserId userId2 = this.m;
        if (epx.f(userId2, userId) && Ub()) {
            return true;
        }
        PostDonut.Placeholder placeholder = null;
        if (epx.f(userId2, userId)) {
            CommentsInfo commentsInfo = this.B;
            if (((commentsInfo == null || (postDonut2 = commentsInfo.b) == null) ? null : postDonut2.c) != null) {
                return true;
            }
        }
        if (bc(this, userId)) {
            return true;
        }
        if (post == null) {
            return false;
        }
        UserId userId3 = post.m;
        if (epx.f(userId3, userId) && post.Ub()) {
            return true;
        }
        if (epx.f(userId3, userId)) {
            CommentsInfo commentsInfo2 = post.B;
            if (commentsInfo2 != null && (postDonut = commentsInfo2.b) != null) {
                placeholder = postDonut.c;
            }
            if (placeholder != null) {
                return true;
            }
        }
        return bc(post, userId);
    }

    public final boolean dc() {
        return epx.f(this.t, "post_ads");
    }

    public final boolean ec() {
        return this.l.zb(134217728L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Post) {
            Post post = (Post) obj;
            if (this.n == post.n && epx.f(this.m, post.m) && epx.f(this.u, post.u)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.grj0
    public final void f(int i) {
        this.E.b = i;
    }

    @Override // xsna.grj0
    public final void f0(boolean z) {
        yg5 yg5Var;
        VideoFile A;
        this.l.Ab(8L, z);
        Attachment Ib = Ib();
        if (Ib instanceof PhotoAttachment) {
            ((PhotoAttachment) Ib).l.l = false;
            return;
        }
        if (Ib instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) Ib;
            VideoFile videoFile = videoAttachment.k;
            if (videoFile != null) {
                videoFile.setTimestamp(0L);
                videoFile.f0(tc(z, videoFile.O9()));
            }
            VideoFile videoFile2 = videoAttachment.k;
            yg5 yg5Var2 = videoAttachment.i;
            if (videoFile2 == (yg5Var2 != null ? yg5Var2.A() : null) || (yg5Var = videoAttachment.i) == null || (A = yg5Var.A()) == null) {
                return;
            }
            A.setTimestamp(0L);
            A.f0(tc(z, A.O9()));
        }
    }

    @Override // xsna.c6z
    public final int fa() {
        return this.E.d;
    }

    public final boolean fc() {
        return this.l.zb(70368744177664L);
    }

    public final boolean gc() {
        return this.l.zb(137438953472L);
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments, xsna.wsx0
    public final EntryHeader getHeader() {
        return this.y;
    }

    public final String getText() {
        return this.s;
    }

    public final String getType() {
        return this.t;
    }

    public final int hashCode() {
        int a2 = bh10.a((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.n) * 31, 31, this.m.b);
        Integer num = this.u;
        return a2 + (num != null ? num.hashCode() : 0);
    }

    @Override // xsna.o2f0
    public final void hb(ReactionSet reactionSet) {
        this.V = reactionSet;
    }

    public final boolean hc() {
        return epx.f(this.t, "reply");
    }

    @Override // xsna.c6z
    public final int i7() {
        return this.E.c;
    }

    public final boolean ic() {
        return this.l.zb(549755813888L);
    }

    public final boolean isReported() {
        return this.l.zb(140737488355328L);
    }

    public final boolean jc() {
        Boolean bool;
        PostDonut postDonut = this.R;
        if (postDonut == null || (bool = postDonut.i) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean kc() {
        return this.l.zb(17592186044416L);
    }

    @Override // xsna.c6z
    public final boolean l0() {
        return this.l.zb(2L);
    }

    public final boolean lc() {
        return epx.f(this.t, "market");
    }

    public final boolean mc() {
        return this.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }

    public final boolean nc() {
        String str = this.t;
        return str == null || str.length() == 0 || epx.f(str, "post");
    }

    public final boolean o1() {
        PostDonut postDonut = this.R;
        return postDonut != null && postDonut.b;
    }

    public final boolean oc() {
        return this.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
    }

    public final boolean pc() {
        return this.l.zb(32L);
    }

    public final UserId q() {
        return this.m;
    }

    @Override // xsna.c6z
    public final boolean qa() {
        return this.l.zb(4294967296L);
    }

    public final boolean qc() {
        return this.l.zb(274877906944L);
    }

    @Override // xsna.c6z
    public final String r() {
        return this.L.b;
    }

    @Override // xsna.c6z
    public final void r0(boolean z) {
        this.l.Ab(2L, z);
    }

    public final boolean rc() {
        return this.l.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
    }

    @Override // xsna.l490
    public final Owner s() {
        return this.o;
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.l.Ab(67108864L, z);
    }

    @Override // xsna.o2f0
    public final ReactionSet s4() {
        return this.V;
    }

    @Override // xsna.c6z
    public final void sb(int i) {
        this.E.d = i;
    }

    public final boolean sc() {
        return epx.f(this.t, "video");
    }

    public final boolean tc(boolean z, boolean z2) {
        ItemReactions itemReactions;
        Integer num;
        if (!super.T8()) {
            return z;
        }
        if (!z || (itemReactions = this.W) == null || (num = itemReactions.e) == null || num.intValue() != 0) {
            return z && z2;
        }
        return true;
    }

    public final String toString() {
        return "Post(flags=" + this.l + ", ownerId=" + this.m + ", postId=" + this.n + ", publisher=" + this.o + ", createdBy=" + this.p + ", signer=" + this.q + ", date=" + this.r + ", text=" + this.s + ", type=" + this.t + ", replyId=" + this.u + ", replyThreadId=" + this.v + ", zoomText=" + this.w + ", caption=" + this.x + ", header=" + this.y + ", attachments=" + this.z + ", attachmentsMeta=" + this.A + ", commentsInfo=" + this.B + ", activity=" + this.C + ", repost=" + this.D + ", counters=" + this.E + ", markedAsAd=" + this.F + ", advertiserInfoUrl=" + this.G + ", adMarker=" + this.H + ", easyPromote=" + this.I + ", suggestSubscribe=" + this.J + ", awayParams=" + this.K + ", trackData=" + this.L + ", poster=" + this.M + ", cut=" + this.N + ", copyright=" + this.O + ", parsedText=" + this.P + ", postOwner=" + this.Q + ", donut=" + this.R + ", carouselOffset=" + this.S + ", thumbsMaxHeight=" + this.T + ", subtitle=" + this.U + ", reactionSet=" + this.V + ", reactions=" + this.W + ", badges=" + this.X + ", postFrom=" + this.Y + ", translationLang=" + this.Z + ", showMoreType=" + this.a0 + ", badgeItem=" + this.b0 + ", donutBadgeInfo=" + this.c0 + ", badgeInfo=" + this.d0 + ", oneTimeDonutMiniAppUrl=" + this.e0 + ", coowners=" + this.f0 + ", research=" + this.g0 + ')';
    }

    public final ArrayList<EntryAttachment> u() {
        return this.z;
    }

    @Override // com.vk.dto.badges.Badgeable
    public final BadgesSet u0() {
        return this.X;
    }

    public final void uc(boolean z) {
        this.l.Ab(70368744177664L, z);
    }

    @Override // xsna.c6z
    public final void v6(int i) {
        this.E.e = i;
    }

    public final void vc(Post post) {
        Post post2;
        this.s = post.s;
        ej90 ej90Var = post.P;
        this.P = ej90Var != null ? ej90Var.a() : null;
        this.Z = post.Z;
        Post post3 = post.D;
        if (post3 != null && (post2 = this.D) != null) {
            post2.vc(post3);
        }
        this.l.Ab(68719476736L, post.l.zb(68719476736L));
    }

    @Override // xsna.c6z
    public final int w0() {
        return this.E.d;
    }

    public final void wc(Photo photo) {
        if (super.G4() || !photo.n) {
            return;
        }
        g(0, e(0), c4(0));
        this.l.Ab(8L, true);
        this.E.b++;
    }

    @Override // xsna.c6z
    public final boolean x1() {
        return this.l.zb(4L);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 0;
    }

    public Post(Flags flags, UserId userId, int i, Owner owner, UserId userId2, Owner owner2, int i2, String str, String str2, Integer num, Integer num2, boolean z, Caption caption, EntryHeader entryHeader, ArrayList<EntryAttachment> arrayList, AttachmentsMeta attachmentsMeta, CommentsInfo commentsInfo, Activity activity, Post post, Counters counters, boolean z2, String str3, String str4, EasyPromote easyPromote, boolean z3, Bundle bundle, NewsEntry.TrackData trackData, Poster poster, NewsEntryWithAttachments.Cut cut, Copyright copyright, ej90 ej90Var, Owner owner3, PostDonut postDonut, int i3, Float f, String str5, ReactionSet reactionSet, ItemReactions itemReactions, BadgesSet badgesSet, SourceFrom sourceFrom, String str6, uij0 uij0Var, BadgeItem badgeItem, DonutBadgeInfo donutBadgeInfo, BadgeInfo badgeInfo, String str7, NewsfeedCoowners newsfeedCoowners, NewsfeedResearch newsfeedResearch) {
        super(trackData, entryHeader, arrayList, cut);
        Attachment attachment;
        this.l = flags;
        this.m = userId;
        this.n = i;
        this.o = owner;
        this.p = userId2;
        this.q = owner2;
        this.r = i2;
        this.s = str;
        this.t = str2;
        this.u = num;
        this.v = num2;
        this.w = z;
        this.x = caption;
        this.y = entryHeader;
        this.z = arrayList;
        this.A = attachmentsMeta;
        this.B = commentsInfo;
        this.C = activity;
        this.D = post;
        this.E = counters;
        this.F = z2;
        this.G = str3;
        this.H = str4;
        this.I = easyPromote;
        this.J = z3;
        this.K = bundle;
        this.L = trackData;
        this.M = poster;
        this.N = cut;
        this.O = copyright;
        this.P = ej90Var;
        this.Q = owner3;
        this.R = postDonut;
        this.S = i3;
        this.T = f;
        this.U = str5;
        this.V = reactionSet;
        this.W = itemReactions;
        this.X = badgesSet;
        this.Y = sourceFrom;
        this.Z = str6;
        this.a0 = uij0Var;
        this.b0 = badgeItem;
        this.c0 = donutBadgeInfo;
        this.d0 = badgeInfo;
        this.e0 = str7;
        this.f0 = newsfeedCoowners;
        this.g0 = newsfeedResearch;
        int size = arrayList.size();
        ArrayList<MusicTrack> arrayList2 = null;
        for (int i4 = 0; i4 < size; i4++) {
            EntryAttachment entryAttachment = (EntryAttachment) j5g.b0(i4, arrayList);
            if (entryAttachment != null && (attachment = entryAttachment.b) != null && (attachment instanceof AudioAttachment)) {
                arrayList2 = arrayList2 == null ? new ArrayList<>() : arrayList2;
                AudioAttachment audioAttachment = (AudioAttachment) attachment;
                audioAttachment.g = arrayList2;
                arrayList2.size();
                arrayList2.add(audioAttachment.f);
            }
        }
    }
}
