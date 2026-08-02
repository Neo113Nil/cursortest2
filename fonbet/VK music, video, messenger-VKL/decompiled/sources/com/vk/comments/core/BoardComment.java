package com.vk.comments.core;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeDonutInfo;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserSex;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a0a;
import xsna.e43;
import xsna.ej90;
import xsna.fkq0;
import xsna.hd60;
import xsna.iag;
import xsna.m6r0;
import xsna.o2f0;
import xsna.pvo0;
import xsna.qaz;
import xsna.t6g0;
import xsna.ucp;
import xsna.uij0;

/* loaded from: classes17.dex */
public class BoardComment extends Serializer.StreamParcelableAdapter implements iag {

    @Nullable
    public final ImageStatus A;

    @Nullable
    public VerifyInfo B;
    public final int b;
    public String c;
    public boolean d;
    public CharSequence e;
    public final ArrayList<Attachment> f;
    public final String g;
    public final String h;
    public final String i;
    public final UserId j;
    public final int k;
    public final ArrayList<String> l;
    public final ArrayList<String> m;
    public int n;
    public final UserId o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final String u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public boolean y;
    public boolean z;
    public static final Pattern C = Pattern.compile("\\[((id|club)[0-9]+)(?::bp[-_0-9]+)?\\|([^\\]]+)\\]");
    public static final Pattern D = Pattern.compile("\\[id(\\d+):bp\\-(\\d+)_(\\d+)\\|([^\\]]+)\\]");
    public static final Pattern E = Pattern.compile("\\[club(\\d+):bp\\-(\\d+)_(\\d+)\\|([^\\]]+)\\]");
    public static final Pattern F = Pattern.compile("\\[id(\\d+)\\|([^\\]]+)\\]");
    public static final Pattern G = Pattern.compile("\\[club(\\d+)\\|([^\\]]+)\\]");
    public static final Serializer.c<BoardComment> CREATOR = new a();

    public class a extends Serializer.c<BoardComment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BoardComment a(Serializer serializer) {
            return new BoardComment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BoardComment[0];
        }
    }

    public BoardComment(int i, String str, String str2, String str3, UserId userId, int i2, int i3, UserId userId2, @Nullable String str4, int i4, @Nullable ImageStatus imageStatus, boolean z, boolean z2) {
        this.d = false;
        this.f = new ArrayList<>();
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        this.p = 0;
        this.q = false;
        this.r = true;
        this.s = false;
        this.t = true;
        this.y = false;
        this.z = false;
        this.B = null;
        this.o = userId2;
        this.b = i;
        this.c = str;
        this.g = str2;
        this.h = null;
        this.i = str3;
        this.j = userId;
        this.k = i2;
        this.n = i3;
        this.u = str4;
        this.v = i4;
        this.A = imageStatus;
        this.w = z;
        this.x = z2;
        Ab();
    }

    public static BoardComment zb(int i, String str, List list, int i2, UserId userId, boolean z, @Nullable String str2) {
        String r;
        boolean z2;
        UserId userId2;
        String str3;
        boolean z3;
        String str4;
        if (z) {
            UserId e = fkq0.e(fkq0.a(userId));
            t6g0 t6g0Var = t6g0.b;
            Group C0 = t6g0.b().C0(fkq0.a(userId));
            if (C0 != null) {
                r = C0.d;
                str4 = C0.e;
            } else {
                r = e43.a.getString(R.string.group);
                str4 = null;
            }
            z3 = false;
            z2 = false;
            userId2 = e;
            str3 = str4;
        } else {
            m6r0 a2 = hd60.a().a();
            UserId y = a2.y();
            r = a2.r();
            String u = a2.u();
            boolean e2 = a2.e(m6r0.s1);
            z2 = a2.w() == UserSex.FEMALE;
            userId2 = y;
            str3 = u;
            z3 = e2;
        }
        BoardComment boardComment = new BoardComment(i, str, r, str3, userId2, pvo0.a(), 0, userId, str2, i2, null, z3, z2);
        boardComment.f.addAll(list);
        return boardComment;
    }

    public final void Ab() {
        CharSequence charSequence = ej90.a.a(this.c, new ej90.d(uij0.a.a, hd60.a().a().t(), 11019, 0, null, LinksParserData.HashtagService.Posts), new ej90.c(0)).a;
        this.e = charSequence;
        Matcher matcher = D.matcher(charSequence);
        while (matcher.find()) {
            this.m.add("vkontakte://profile/" + matcher.group(1));
            this.l.add(matcher.group(4));
        }
        Matcher matcher2 = E.matcher(this.e);
        while (matcher2.find()) {
            this.m.add("vkontakte://profile/-" + matcher2.group(1));
            this.l.add(matcher2.group(4));
        }
        Matcher matcher3 = F.matcher(this.e);
        while (matcher3.find()) {
            this.m.add("vkontakte://profile/" + matcher3.group(1));
            this.l.add(matcher3.group(2));
        }
        Matcher matcher4 = G.matcher(this.e);
        while (matcher4.find()) {
            this.m.add("vkontakte://profile/-" + matcher4.group(1));
            this.l.add(matcher4.group(2));
        }
        CharSequence charSequence2 = this.e;
        if (charSequence2 instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence2;
            for (qaz qazVar : (qaz[]) spannableStringBuilder.getSpans(0, charSequence2.length() - 1, qaz.class)) {
                String i = qazVar.i();
                if (!TextUtils.isEmpty(i)) {
                    int spanStart = spannableStringBuilder.getSpanStart(qazVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(qazVar);
                    if (spanStart >= 0 && spanEnd <= this.e.length() && spanStart < spanEnd) {
                        String charSequence3 = this.e.subSequence(spanStart, spanEnd).toString();
                        this.m.add("vklink://view/?" + i);
                        this.l.add(charSequence3);
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.e);
        Matcher matcher5 = C.matcher(this.e);
        int i2 = 0;
        while (matcher5.find()) {
            qaz qazVar2 = new qaz("vkontakte://" + a0a.d + DomExceptionUtils.SEPARATOR + matcher5.group(1), 0);
            spannableStringBuilder2 = spannableStringBuilder2.replace(matcher5.start() - i2, matcher5.end() - i2, (CharSequence) matcher5.group(3));
            spannableStringBuilder2.setSpan(qazVar2, matcher5.start() - i2, matcher5.group(3).length() + (matcher5.start() - i2), 0);
            i2 += matcher5.group().length() - matcher5.group(3).length();
        }
        ucp ucpVar = ucp.a;
        this.e = ucp.i(spannableStringBuilder2);
    }

    @Override // xsna.iag
    public final int C() {
        return this.k;
    }

    @Override // xsna.iag
    public final boolean D4() {
        ArrayList<Attachment> arrayList = this.f;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof GraffitiAttachment) {
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
    public final boolean G4() {
        return false;
    }

    @Override // xsna.iag
    @Nullable
    public final BadgeItem G6() {
        return null;
    }

    @Override // xsna.grj0
    public final boolean J() {
        return this.q;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ItemReactions K() {
        return null;
    }

    @Override // xsna.iag
    public final int K4() {
        return 0;
    }

    @Override // xsna.iag
    public final boolean K8() {
        return false;
    }

    @Override // xsna.iag
    @Nullable
    public final String N1() {
        return null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.W(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.e0(this.j);
        serializer.S(this.k);
        serializer.l0(this.l);
        serializer.l0(this.m);
        serializer.S(this.n);
        serializer.e0(this.o);
        serializer.S(this.p);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.j0(this.u);
        serializer.S(this.v);
        serializer.i0(this.A);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.o2f0
    @Nullable
    public final ArrayList<ReactionMeta> O8(int i) {
        return null;
    }

    @Override // xsna.iag
    public final boolean Q6() {
        return false;
    }

    @Override // xsna.iag
    @Nullable
    public final BadgeDonutInfo Q9() {
        return null;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ReactionMeta R3() {
        return null;
    }

    @Override // xsna.o2f0
    public final void S7(int i) {
        r9().e = null;
        r2.d--;
        r2.c--;
    }

    @Override // xsna.o2f0
    public final void S9(@NonNull o2f0 o2f0Var) {
        o2f0Var.K();
    }

    @Override // xsna.o2f0
    public final boolean T8() {
        return false;
    }

    @Override // xsna.grj0
    public final int T9() {
        return this.p;
    }

    @Override // xsna.iag
    public final boolean Ta() {
        return false;
    }

    @Override // xsna.iag
    public final boolean V8() {
        ArrayList<Attachment> arrayList = this.f;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof StickerAttachment) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.iag
    public final CharSequence X3() {
        return this.e;
    }

    @Override // xsna.iag
    @Nullable
    public final VerifyInfo Y() {
        return this.B;
    }

    @Override // xsna.iag
    public final String Z4() {
        return this.u;
    }

    @Override // xsna.o2f0
    public final int c4(int i) {
        return 1;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ReactionMeta c8() {
        return null;
    }

    @Override // xsna.iag
    public final boolean d5() {
        return false;
    }

    @Override // xsna.o2f0
    public final int e(int i) {
        return 0;
    }

    public final boolean equals(Object obj) {
        int i = this.b;
        if (obj == null || obj.hashCode() != i) {
            return (obj instanceof BoardComment) && ((BoardComment) obj).b == i;
        }
        return true;
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
        return 0;
    }

    @Override // xsna.iag
    public final boolean g6() {
        return this.w;
    }

    @Override // xsna.iag
    public final int getId() {
        return this.b;
    }

    @Override // xsna.iag
    public final String getText() {
        return this.c;
    }

    @Override // xsna.iag
    public final UserId getUid() {
        return this.j;
    }

    @Override // xsna.o2f0
    public final void h6(ReactionMeta reactionMeta) {
        reactionMeta.getClass();
        int id = reactionMeta.getId();
        int f = reactionMeta.f();
        ItemReactions r9 = r9();
        r9.e = Integer.valueOf(id);
        r9.d += f;
        r9.c++;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // xsna.iag
    public final boolean isReported() {
        return false;
    }

    @Override // xsna.o2f0
    public final void j9(@Nullable Integer num) {
        r9().e = num;
    }

    @Override // xsna.iag
    @Nullable
    public final ImageStatus l5() {
        return this.A;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ReactionMeta p4() {
        return null;
    }

    @Override // xsna.iag
    @Nullable
    public final BadgeInfo p6() {
        return null;
    }

    @Override // xsna.iag
    public final boolean r3() {
        return false;
    }

    @Override // xsna.o2f0
    @NonNull
    public final ItemReactions r9() {
        return new ItemReactions(new ArrayList(), 0, 0, null);
    }

    @Override // xsna.o2f0
    @Nullable
    public final ReactionSet s4() {
        return null;
    }

    @Override // xsna.iag
    public final ArrayList<Attachment> u() {
        return this.f;
    }

    @Override // xsna.iag
    public final boolean u4() {
        return false;
    }

    @Override // xsna.o2f0
    @Nullable
    public final ArrayList<ReactionMeta> v8() {
        return null;
    }

    @Override // xsna.iag
    public final String va() {
        return this.i;
    }

    @Override // xsna.iag
    public final boolean wa() {
        return this.x;
    }

    @Override // xsna.iag
    public final String y1() {
        return this.g;
    }

    @Override // xsna.iag
    public final int y4() {
        return 0;
    }

    @Override // xsna.iag
    public final boolean z1() {
        return (!this.z || D4() || V8()) ? false : true;
    }

    @Override // xsna.iag
    public final boolean z3() {
        return false;
    }

    @Override // xsna.o2f0
    public final void G2() {
    }

    @Override // xsna.o2f0
    public final void b4(@Nullable ItemReactions itemReactions) {
    }

    @Override // xsna.o2f0
    public final void hb(@Nullable ReactionSet reactionSet) {
    }

    @Override // xsna.iag
    public final void i4(boolean z) {
    }

    public BoardComment(JSONObject jSONObject, Map<UserId, Owner> map, int i, UserId userId, @Nullable Map<UserId, String> map2) throws JSONException {
        String str;
        this.d = false;
        this.f = new ArrayList<>();
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        this.p = 0;
        this.q = false;
        this.r = true;
        this.s = false;
        this.t = true;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.B = null;
        this.o = userId;
        this.b = jSONObject.getInt("id");
        UserId userId2 = new UserId(jSONObject.getLong("from_id"));
        this.j = userId2;
        String string = jSONObject.getString("text");
        this.k = jSONObject.getInt("date");
        Owner owner = map.get(userId2);
        if (owner == null) {
            str = "";
        } else {
            str = owner.c;
        }
        this.g = str;
        this.h = map2 != null ? map2.get(userId2) : null;
        this.i = owner != null ? owner.e : "";
        this.A = owner != null ? owner.k : null;
        this.w = owner != null && owner.i(1024);
        this.x = owner != null && owner.l();
        this.z = jSONObject.optInt("can_edit") == 1;
        if (jSONObject.has("reply_to_user")) {
            int i2 = jSONObject.getInt("reply_to_user");
            if (i2 < 0) {
                this.u = e43.a.getString(R.string.comment_to_community);
            } else if (map2 != null) {
                this.u = map2.get(new UserId(i2));
            } else {
                this.u = null;
            }
        } else {
            this.u = null;
        }
        this.v = jSONObject.optInt("reply_to_comment");
        if (jSONObject.has("attachments")) {
            JSONArray jSONArray = jSONObject.getJSONArray("attachments");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                this.f.add(com.vkontakte.android.attachments.a.c(jSONArray.getJSONObject(i3), map, null));
            }
        }
        ArrayList<Attachment> arrayList = this.f;
        int i4 = com.vkontakte.android.attachments.a.a;
        Collections.sort(arrayList);
        if (jSONObject.has("likes")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("likes");
            this.p = jSONObject2.optInt("count", this.p);
            this.q = jSONObject2.optInt("user_likes", 0) != 0;
            this.r = jSONObject2.optInt("can_like", 1) != 0;
        }
        this.c = string;
        Ab();
        this.n = i;
    }

    @Override // xsna.o2f0
    public final void ub(int i, int i2) {
    }

    public BoardComment(Serializer serializer) {
        this.d = false;
        ArrayList<Attachment> arrayList = new ArrayList<>();
        this.f = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.l = arrayList2;
        ArrayList<String> arrayList3 = new ArrayList<>();
        this.m = arrayList3;
        this.p = 0;
        this.q = false;
        this.r = true;
        this.s = false;
        this.t = true;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.B = null;
        this.b = serializer.u();
        this.c = serializer.H();
        Ab();
        arrayList.addAll(serializer.l(Attachment.class.getClassLoader()));
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = serializer.H();
        this.j = (UserId) serializer.A(UserId.class.getClassLoader());
        this.k = serializer.u();
        arrayList2.addAll(serializer.h());
        arrayList3.addAll(serializer.h());
        this.n = serializer.u();
        this.o = (UserId) serializer.A(UserId.class.getClassLoader());
        this.p = serializer.u();
        this.q = serializer.p() != 0;
        this.r = serializer.p() != 0;
        this.u = serializer.H();
        this.v = serializer.u();
        this.A = (ImageStatus) serializer.G(ImageStatus.class.getClassLoader());
        this.w = serializer.m();
        this.x = serializer.m();
        this.s = serializer.m();
        this.t = serializer.m();
        this.z = serializer.m();
    }
}
