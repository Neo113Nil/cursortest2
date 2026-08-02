package com.vk.newsfeed.api.data;

import android.graphics.Color;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.parsers.BadgesParsers;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.badges.BadgeDonutInfo;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ImageStatus;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bcg;
import xsna.c2f0;
import xsna.e43;
import xsna.ej90;
import xsna.fkq0;
import xsna.hd60;
import xsna.iag;
import xsna.lns0;
import xsna.o2f0;
import xsna.tci;
import xsna.uij0;
import xsna.vj90;

/* loaded from: classes3.dex */
public class NewsComment extends Serializer.StreamParcelableAdapter implements iag {
    public static final Serializer.c<NewsComment> CREATOR = new a();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;

    @Nullable
    public PostAuthor E;

    @Nullable
    public final PostAuthor F;
    public final boolean G;
    public final boolean H;
    public ej90 I;
    public ArrayList<Attachment> J;

    @Nullable
    public String K;

    @Nullable
    public CommentThread L;

    @Nullable
    public CommentDonut M;

    @NonNull
    public final VerifyInfo N;

    @Nullable
    public ImageStatus O;

    @Nullable
    public ReactionSet P;

    @Nullable
    public ItemReactions Q;

    @Nullable
    public Boolean R;

    @Nullable
    public final Boolean S;
    public final boolean T;
    public final boolean U;

    @Nullable
    public BadgeItem V;

    @Nullable
    public BadgeDonutInfo W;

    @Nullable
    public final BadgeInfo X;
    public boolean Y;
    public boolean Z;
    public final int a0;

    @Nullable
    public String b;
    public boolean b0;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public String e;
    public int f;
    public String g;

    @Nullable
    public String h;
    public int i;
    public UserId j;
    public int k;

    @Nullable
    public int[] l;
    public boolean m;
    public boolean n;
    public final boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a extends Serializer.c<NewsComment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsComment a(@NonNull Serializer serializer) {
            return new NewsComment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsComment[i];
        }
    }

    public NewsComment() {
        this.j = UserId.d;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = false;
        this.J = new ArrayList<>();
        this.K = null;
        this.L = null;
        this.N = new VerifyInfo();
        this.T = false;
        this.U = false;
        this.Y = true;
        this.Z = false;
        this.b0 = false;
        this.a0 = 0;
    }

    public static void Ab(@Nullable NewsComment newsComment, @Nullable NewsComment newsComment2) {
        if (newsComment == newsComment2 || newsComment == null || newsComment2 == null || newsComment.i != newsComment2.i) {
            return;
        }
        newsComment.x = newsComment2.x;
        newsComment.s = newsComment2.s;
        newsComment.u = newsComment2.u;
        newsComment.v = newsComment2.v;
        newsComment.q = newsComment2.q;
        newsComment.p = newsComment2.p;
        newsComment.z = newsComment2.z;
        newsComment.b = newsComment2.b;
        ej90 ej90Var = newsComment2.I;
        if (ej90Var != null) {
            newsComment.I = ej90Var.a();
        }
        newsComment.Z = newsComment2.Z;
        newsComment.J.clear();
        newsComment.J.addAll(newsComment2.J);
        newsComment.K = newsComment2.K;
        newsComment.M = newsComment2.M;
    }

    public final void Bb(String str, boolean z) {
        Cb(str, z, false, 0, null);
    }

    @Override // xsna.iag
    public final int C() {
        return this.f;
    }

    public final void Cb(String str, boolean z, boolean z2, int i, lns0.a aVar) {
        this.Y = z;
        if (Objects.equals(str, this.b)) {
            return;
        }
        ej90.d dVar = new ej90.d(uij0.a.a, hd60.a().a().t(), z2 ? 11147 : 11019, i, aVar, this.a0 == 2 ? LinksParserData.HashtagService.Video : LinksParserData.HashtagService.Posts);
        ej90.c cVar = new ej90.c(0);
        this.I = ej90.a.a(str, dVar, cVar);
        this.Z = cVar.a;
        this.b = str;
    }

    @Override // xsna.iag
    public final boolean D4() {
        if (this.J != null) {
            for (int i = 0; i < this.J.size(); i++) {
                if (this.J.get(i) instanceof GraffitiAttachment) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.o2f0
    public final void E6(int i) {
        r9().d = i;
    }

    @Override // xsna.o2f0
    public final void G2() {
        ItemReactions itemReactions = this.Q;
        if (itemReactions != null) {
            itemReactions.f = null;
            itemReactions.g = null;
            itemReactions.h = null;
        }
    }

    @Override // xsna.o2f0
    public final boolean G4() {
        ItemReactions itemReactions = this.Q;
        return (itemReactions == null || itemReactions.e == null) ? false : true;
    }

    @Override // xsna.iag
    @Nullable
    public final BadgeItem G6() {
        return this.V;
    }

    @Override // xsna.grj0
    public final boolean J() {
        return this.q;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ItemReactions K() {
        return this.Q;
    }

    @Override // xsna.iag
    public final int K4() {
        CommentThread commentThread = this.L;
        if (commentThread == null) {
            return 0;
        }
        List<NewsComment> list = commentThread.f;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            NewsComment newsComment = list.get(i2);
            if (!newsComment.u && !newsComment.y) {
                i++;
            }
        }
        return i;
    }

    @Override // xsna.iag
    public final boolean K8() {
        CommentDonut commentDonut = this.M;
        return commentDonut != null && commentDonut.b;
    }

    @Override // xsna.iag
    @Nullable
    public final String N1() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.S(this.i);
        serializer.e0(this.j);
        serializer.S(this.k);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.S(this.p);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.W(this.J);
        serializer.j0(this.K);
        serializer.T(this.l);
        this.N.O7(serializer);
        serializer.i0(this.O);
        serializer.i0(this.M);
        serializer.i0(this.P);
        serializer.i0(this.Q);
        serializer.J(this.R);
        serializer.i0(this.V);
        serializer.i0(this.W);
        serializer.i0(this.X);
        serializer.L(this.T ? (byte) 1 : (byte) 0);
        serializer.L(this.U ? (byte) 1 : (byte) 0);
        serializer.i0(this.L);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.L(this.G ? (byte) 1 : (byte) 0);
        serializer.L(this.H ? (byte) 1 : (byte) 0);
        serializer.i0(this.E);
        serializer.i0(this.F);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.o2f0
    @Nullable
    public final ArrayList<ReactionMeta> O8(int i) {
        ItemReactions itemReactions = this.Q;
        if (itemReactions != null) {
            return ItemReactions.e(itemReactions, i, this.P);
        }
        return null;
    }

    @Override // xsna.iag
    public final boolean Q6() {
        return this.r;
    }

    @Override // xsna.iag
    @Nullable
    public final BadgeDonutInfo Q9() {
        return this.W;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ReactionMeta R3() {
        ReactionSet reactionSet = this.P;
        if (reactionSet != null) {
            return c2f0.d(reactionSet, 0);
        }
        return null;
    }

    @Override // xsna.o2f0
    public final void S7(int i) {
        int c4 = c4(i);
        ub(i, e(i) - 1);
        ItemReactions r9 = r9();
        r9.e = null;
        r9.d -= c4;
        r9.c--;
    }

    @Override // xsna.o2f0
    public final void S9(@NonNull o2f0 o2f0Var) {
        this.Q = o2f0Var.K();
    }

    @Override // xsna.o2f0
    public final boolean T8() {
        ReactionSet reactionSet = this.P;
        return (reactionSet == null || reactionSet.c.isEmpty()) ? false : true;
    }

    @Override // xsna.grj0
    public final int T9() {
        return this.p;
    }

    @Override // xsna.iag
    public final boolean Ta() {
        int[] iArr = this.l;
        return iArr != null && iArr.length > 0;
    }

    @Override // xsna.iag
    public final boolean V8() {
        if (this.J != null) {
            for (int i = 0; i < this.J.size(); i++) {
                if (this.J.get(i) instanceof StickerAttachment) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.iag
    public final CharSequence X3() {
        return this.Y ? this.I.b : this.I.a;
    }

    @Override // xsna.iag
    @NonNull
    public final VerifyInfo Y() {
        return this.N;
    }

    @Override // xsna.iag
    public final String Z4() {
        return this.g;
    }

    @Override // xsna.o2f0
    public final void b4(@Nullable ItemReactions itemReactions) {
        this.Q = itemReactions;
    }

    @Override // xsna.o2f0
    public final int c4(int i) {
        ReactionMeta d;
        ReactionSet reactionSet = this.P;
        if (reactionSet == null || (d = c2f0.d(reactionSet, i)) == null) {
            return 1;
        }
        return d.f();
    }

    @Override // xsna.o2f0
    @Nullable
    public final ReactionMeta c8() {
        ItemReactions itemReactions = this.Q;
        if (itemReactions != null) {
            return itemReactions.f(this.P);
        }
        return null;
    }

    @Override // xsna.iag
    public final boolean d5() {
        return this.x;
    }

    @Override // xsna.o2f0
    public final int e(int i) {
        ItemReactions itemReactions = this.Q;
        if (itemReactions == null) {
            return 0;
        }
        Iterator<ItemReaction> it = itemReactions.b.iterator();
        while (it.hasNext()) {
            ItemReaction next = it.next();
            if (next.b == i) {
                return next.c;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsComment) && ((NewsComment) obj).i == this.i;
    }

    @Override // xsna.grj0
    public final void f(int i) {
        this.p = i;
    }

    @Override // xsna.grj0
    public final void f0(boolean z) {
        this.q = z;
    }

    @Override // xsna.iag
    public final int f4() {
        CommentThread commentThread = this.L;
        if (commentThread != null) {
            return commentThread.b;
        }
        return 0;
    }

    @Override // xsna.iag
    public final boolean g6() {
        return this.T;
    }

    @Override // xsna.iag
    public final int getId() {
        return this.i;
    }

    @Override // xsna.iag
    @Nullable
    public final String getText() {
        return this.b;
    }

    @Override // xsna.iag
    public final UserId getUid() {
        return this.j;
    }

    @Override // xsna.o2f0
    public final void h6(@NonNull ReactionMeta reactionMeta) {
        int e = e(reactionMeta.getId());
        int id = reactionMeta.getId();
        int f = reactionMeta.f();
        ub(id, e + 1);
        ItemReactions r9 = r9();
        r9.e = Integer.valueOf(id);
        r9.d += f;
        r9.c++;
    }

    public final int hashCode() {
        return this.i;
    }

    @Override // xsna.o2f0
    public final void hb(@Nullable ReactionSet reactionSet) {
        this.P = reactionSet;
    }

    @Override // xsna.iag
    public final boolean i3() {
        return this.b0;
    }

    @Override // xsna.iag
    public final void i4(boolean z) {
        this.r = z;
    }

    @Override // xsna.iag
    public final boolean isReported() {
        return this.w;
    }

    @Override // xsna.o2f0
    public final void j9(@Nullable Integer num) {
        r9().e = num;
    }

    @Override // xsna.iag
    @Nullable
    public final ImageStatus l5() {
        return this.O;
    }

    @Override // xsna.iag
    @Nullable
    public final BadgeInfo p6() {
        return this.X;
    }

    @Override // xsna.iag
    public final boolean r3() {
        Boolean bool = this.R;
        return bool != null && bool.booleanValue();
    }

    @Override // xsna.o2f0
    @NonNull
    public final ItemReactions r9() {
        ItemReactions itemReactions = this.Q;
        if (itemReactions != null) {
            return itemReactions;
        }
        ItemReactions itemReactions2 = new ItemReactions(new ArrayList(), 0, 0, null);
        this.Q = itemReactions2;
        return itemReactions2;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ReactionSet s4() {
        return this.P;
    }

    @Override // xsna.iag
    public final ArrayList<Attachment> u() {
        return this.J;
    }

    @Override // xsna.iag
    public final boolean u4() {
        Boolean bool = this.S;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // xsna.o2f0
    public final void ub(int i, int i2) {
        r9().g(i, i2);
    }

    @Override // xsna.iag
    @Nullable
    public final String va() {
        return this.h;
    }

    @Override // xsna.iag
    public final boolean wa() {
        return this.U;
    }

    @Override // xsna.iag
    @Nullable
    public final String y1() {
        return this.c;
    }

    @Override // xsna.iag
    public final int y4() {
        if (!Ta()) {
            return 0;
        }
        return this.l[r0.length - 1];
    }

    @Override // xsna.iag
    public final boolean z1() {
        return (!this.z || D4() || V8()) ? false : true;
    }

    @Override // xsna.iag
    public final boolean z3() {
        return this.v;
    }

    public final boolean zb(NewsComment newsComment) {
        CommentThread commentThread = this.L;
        if (commentThread == null) {
            return false;
        }
        return commentThread.f.contains(newsComment);
    }

    public NewsComment(int i) {
        this.j = UserId.d;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = false;
        this.J = new ArrayList<>();
        this.K = null;
        this.L = null;
        this.N = new VerifyInfo();
        this.T = false;
        this.U = false;
        this.Y = true;
        this.Z = false;
        this.b0 = false;
        this.a0 = i;
    }

    public NewsComment(Serializer serializer) {
        this.j = UserId.d;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = false;
        this.J = new ArrayList<>();
        this.K = null;
        this.L = null;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.N = verifyInfo;
        this.T = false;
        this.U = false;
        this.Y = true;
        this.Z = false;
        this.b0 = false;
        this.a0 = 0;
        Bb(serializer.H(), true);
        this.c = serializer.H();
        this.d = serializer.H();
        this.e = serializer.H();
        this.f = serializer.u();
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = serializer.u();
        this.j = (UserId) serializer.A(UserId.class.getClassLoader());
        this.k = serializer.u();
        this.m = serializer.m();
        this.p = serializer.u();
        this.q = serializer.m();
        this.s = serializer.m();
        this.u = serializer.m();
        this.v = serializer.m();
        this.n = serializer.m();
        this.J.addAll(serializer.l(Attachment.class.getClassLoader()));
        this.K = serializer.H();
        this.l = serializer.c();
        verifyInfo.zb(serializer);
        this.O = (ImageStatus) serializer.G(ImageStatus.class.getClassLoader());
        this.M = (CommentDonut) serializer.G(CommentDonut.class.getClassLoader());
        this.P = (ReactionSet) serializer.G(ReactionSet.class.getClassLoader());
        this.Q = (ItemReactions) serializer.G(ItemReactions.class.getClassLoader());
        this.R = serializer.n();
        this.V = (BadgeItem) serializer.G(BadgeItem.class.getClassLoader());
        this.W = (BadgeDonutInfo) serializer.G(BadgeDonutInfo.class.getClassLoader());
        this.X = (BadgeInfo) serializer.G(BadgeInfo.class.getClassLoader());
        this.T = serializer.m();
        this.U = serializer.m();
        this.L = (CommentThread) serializer.G(CommentThread.class.getClassLoader());
        this.A = serializer.m();
        this.B = serializer.m();
        this.C = serializer.m();
        this.G = serializer.m();
        this.H = serializer.m();
        this.E = (PostAuthor) serializer.G(PostAuthor.class.getClassLoader());
        this.F = (PostAuthor) serializer.G(PostAuthor.class.getClassLoader());
        this.x = serializer.m();
        this.D = serializer.m();
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public NewsComment(JSONObject jSONObject, @NonNull bcg bcgVar) throws JSONException {
        Owner owner;
        Integer num;
        BadgeDonutInfo badgeDonutInfo;
        WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder;
        this.j = UserId.d;
        this.B = false;
        this.C = false;
        this.D = false;
        BadgeInfo badgeInfo = null;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = false;
        this.J = new ArrayList<>();
        this.K = null;
        this.L = null;
        VerifyInfo verifyInfo = new VerifyInfo();
        this.N = verifyInfo;
        this.T = false;
        this.U = false;
        this.Y = true;
        this.Z = false;
        this.b0 = false;
        int i = bcgVar.e;
        SparseArray<BadgeItem> sparseArray = bcgVar.d;
        ?? r9 = bcgVar.c;
        this.a0 = i;
        this.i = jSONObject.optInt("id");
        this.j = new UserId(jSONObject.optLong("from_id"));
        Bb(jSONObject.optString("text"), true);
        HashMap hashMap = bcgVar.b;
        Owner owner2 = (Owner) hashMap.get(this.j);
        if (owner2 != null) {
            this.h = owner2.e;
            this.c = owner2.c;
            this.d = (String) r9.get(this.j);
            verifyInfo.Ab(owner2.f);
            this.O = owner2.k;
            this.R = Boolean.valueOf(owner2.q);
            this.S = Boolean.valueOf(owner2.r);
            this.T = owner2.i(1024);
            this.U = owner2.l();
            this.t = owner2.i(4096);
        }
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        if (fkq0.c(userId)) {
            owner = (Owner) hashMap.get(userId);
        } else {
            owner = (Owner) hashMap.get(this.j);
        }
        String str = this.d;
        if (str == null || str.isEmpty()) {
            this.d = this.c;
        }
        if (jSONObject.has("reply_to_user")) {
            UserId userId2 = new UserId(jSONObject.getLong("reply_to_user"));
            if (fkq0.b(userId2)) {
                this.g = e43.a.getString(R.string.comment_to_community);
            } else {
                this.g = (String) r9.get(userId2);
            }
        }
        this.f = jSONObject.optInt("date");
        this.z = jSONObject.optInt("can_edit") == 1;
        this.A = jSONObject.optBoolean("is_from_post_author");
        this.s = jSONObject.optBoolean("deleted");
        this.k = jSONObject.optInt("reply_to_comment");
        if (jSONObject.has("likes")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("likes");
            this.p = jSONObject2.getInt("count");
            this.q = jSONObject2.optInt("user_likes") == 1;
            this.r = jSONObject2.optInt("is_liked_by_owner", 0) == 1;
            this.n = jSONObject2.optInt("can_like", 1) == 1;
            this.o = jSONObject2.optInt("can_like_as_group", 0) == 1;
            this.B = jSONObject2.optBoolean("author_liked", false);
            this.C = jSONObject2.optBoolean("group_liked", false);
            this.G = jSONObject2.optInt("can_like_by_group", 0) == 1;
            this.H = jSONObject2.optInt("can_like_as_author", 0) == 1;
        }
        this.E = bcgVar.a;
        if (owner != null) {
            Serializer.c<PostAuthor> cVar = PostAuthor.CREATOR;
            this.F = PostAuthor.a.a(owner);
        }
        if (jSONObject.has("attachments")) {
            JSONArray jSONArray = jSONObject.getJSONArray("attachments");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Attachment c = com.vkontakte.android.attachments.a.c(jSONArray.getJSONObject(i2), hashMap, null);
                if (c instanceof SnippetAttachment) {
                    ((SnippetAttachment) c).t = true;
                } else if (c instanceof ArticleAttachment) {
                    ((ArticleAttachment) c).h = true;
                }
                this.J.add(c);
            }
            ArrayList<Attachment> arrayList = this.J;
            int i3 = com.vkontakte.android.attachments.a.a;
            Collections.sort(arrayList);
        }
        String optString = jSONObject.optString("attachments_placeholder");
        this.K = optString;
        if (optString.isEmpty()) {
            this.K = null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("thread");
        if (optJSONObject != null) {
            Serializer.c<CommentThread> cVar2 = CommentThread.CREATOR;
            int optInt = optJSONObject.optInt("count");
            boolean optBoolean = optJSONObject.optBoolean("can_post");
            boolean optBoolean2 = optJSONObject.optBoolean("groups_can_post");
            boolean optBoolean3 = optJSONObject.optBoolean("show_reply_button");
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList2.add(new NewsComment(optJSONArray.getJSONObject(i4), bcgVar));
                }
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("negative_replies_placeholder");
            if (optJSONObject2 != null) {
                Serializer.c<WallNegativeRepliesPlaceholder> cVar3 = WallNegativeRepliesPlaceholder.CREATOR;
                wallNegativeRepliesPlaceholder = WallNegativeRepliesPlaceholder.a.a(optJSONObject2);
            } else {
                wallNegativeRepliesPlaceholder = null;
            }
            this.L = new CommentThread(optInt, optBoolean, optBoolean2, optBoolean3, arrayList2, wallNegativeRepliesPlaceholder, optJSONObject.optString("next_from"), optJSONObject.optBoolean("author_replied", false), bcgVar.a);
        } else {
            this.L = null;
        }
        if (jSONObject.has("parents_stack")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("parents_stack");
            int length2 = jSONArray2.length();
            this.l = new int[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                this.l[i5] = jSONArray2.getInt(i5);
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("donut");
        if (optJSONObject3 != null) {
            this.M = vj90.b(optJSONObject3);
        }
        ReactionSet reactionSet = this.P;
        this.P = reactionSet;
        this.Q = tci.p(jSONObject, reactionSet);
        if (sparseArray != null) {
            this.V = sparseArray.get(jSONObject.optInt("badge_id", -1));
            JSONObject optJSONObject4 = jSONObject.optJSONObject("donut_badge_info");
            if (optJSONObject4 == null) {
                badgeDonutInfo = null;
            } else {
                String optString2 = optJSONObject4.optString("amount");
                try {
                    num = Integer.valueOf(Color.parseColor(optJSONObject4.getString("background_color")));
                } catch (IllegalArgumentException unused) {
                    num = null;
                }
                badgeDonutInfo = new BadgeDonutInfo(optString2, num, optJSONObject4.optString("comment_text"));
            }
            this.W = badgeDonutInfo;
            JSONObject optJSONObject5 = jSONObject.optJSONObject("badge_info");
            if (optJSONObject5 != null) {
                boolean optBoolean4 = optJSONObject5.optBoolean("is_disabled");
                BadgeItem.BadgeLockStatus.a aVar = BadgeItem.BadgeLockStatus.Companion;
                int optInt2 = optJSONObject5.optInt("lock_status");
                aVar.getClass();
                BadgeItem.BadgeLockStatus a2 = BadgeItem.BadgeLockStatus.a.a(optInt2);
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject("unlock_info");
                badgeInfo = new BadgeInfo(optBoolean4, a2, optJSONObject6 != null ? BadgesParsers.a(optJSONObject6) : null);
            }
            this.X = badgeInfo;
        }
        this.x = jSONObject.optBoolean("is_blacklisted", false);
        this.D = jSONObject.optBoolean("is_pinned", false);
    }
}
