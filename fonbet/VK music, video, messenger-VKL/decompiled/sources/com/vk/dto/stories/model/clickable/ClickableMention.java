package com.vk.dto.stories.model.clickable;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import defpackage.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.cqm0;
import xsna.drm0;
import xsna.epx;
import xsna.fkq0;
import xsna.hl10;
import xsna.j5g;
import xsna.q500;
import xsna.urd0;
import xsna.zcl;
import xsna.zk10;

/* compiled from: ClickableMention.kt */
/* loaded from: classes18.dex */
public final class ClickableMention extends ClickableSticker {
    public static final Serializer.c<ClickableMention> CREATOR = new b();
    public static final Pattern k = Pattern.compile("\\[(id|club|event|public)(\\d{1,30})(\\|(.+?))?]", 0);
    public final UserId e;
    public final String f;
    public final String g;
    public final UserProfile h;
    public final Group i;
    public final WebStickerType j;

    /* compiled from: ClickableMention.kt */
    public static final class a {
        public static ClickableMention a(String str, String str2, List list, Map map, Map map2, q500 q500Var, long j) {
            String obj = drm0.p0(str).toString();
            Pair c = c(obj);
            Group group = null;
            if (c == null) {
                L.l("Can't parse mention id for ".concat(obj));
                return null;
            }
            UserId userId = (UserId) c.i();
            String str3 = (String) c.j();
            UserProfile userProfile = (userId.b <= 0 || map == null) ? null : (UserProfile) map.get(userId);
            if (userId.b < 0 && map2 != null) {
                group = (Group) map2.get(fkq0.e(userId));
            }
            return new ClickableMention(j, list, q500Var, userId, str3, str2, userProfile, group);
        }

        public static Pair b(zk10 zk10Var) {
            String str;
            Long k;
            String obj;
            List<String> b = zk10Var.b();
            String str2 = (String) j5g.b0(1, b);
            if (str2 == null || (str = (String) j5g.b0(2, b)) == null || (k = cqm0.k(str)) == null) {
                return null;
            }
            long longValue = k.longValue();
            String str3 = (String) j5g.b0(4, b);
            if (str3 == null || (obj = drm0.p0(str3).toString()) == null) {
                return null;
            }
            if (!str2.equals("id")) {
                longValue = -longValue;
            }
            return new Pair(new UserId(longValue), obj);
        }

        public static Pair c(String str) {
            hl10 b = new Regex(ClickableMention.k).b(str);
            if (b == null) {
                return null;
            }
            return b(b);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClickableMention> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableMention a(Serializer serializer) {
            return new ClickableMention(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableMention[i];
        }
    }

    public /* synthetic */ ClickableMention(long j, List list, q500 q500Var, UserId userId, String str, String str2, UserProfile userProfile, Group group, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, userId, str, str2, (i & 64) != 0 ? null : userProfile, (i & 128) != 0 ? null : group);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final void Ab(ClickableStickerStatInfo.a aVar) {
        aVar.b(TtmlNode.TAG_STYLE, this.g);
        UserId userId = this.e;
        if ((userId != null ? Long.valueOf(userId.b) : null) == null) {
            aVar.b("text_value", this.f);
            return;
        }
        Long valueOf = Long.valueOf(userId.b);
        if (aVar.c == null) {
            aVar.c = new ArrayList<>();
        }
        ArrayList<Pair<String, Long>> arrayList = aVar.c;
        if (arrayList != null) {
            arrayList.add(new Pair<>("id_value", valueOf));
        }
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.e0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        String str;
        JSONObject e5 = super.e5();
        String str2 = this.f;
        UserId userId = this.e;
        if (userId != null) {
            StringBuilder sb = new StringBuilder(X3.j.d);
            long j = userId.b;
            if (j >= 0) {
                str = k0.a(j, "id");
            } else {
                str = "club" + Math.abs(j);
            }
            sb.append(str);
            sb.append('|');
            sb.append(str2);
            sb.append(']');
            str2 = sb.toString();
        }
        e5.put("mention", str2);
        e5.put(TtmlNode.TAG_STYLE, this.g);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableMention) || !super.equals(obj)) {
            return false;
        }
        ClickableMention clickableMention = (ClickableMention) obj;
        return epx.f(this.e, clickableMention.e) && epx.f(this.f, clickableMention.f) && epx.f(this.g, clickableMention.g) && epx.f(this.h, clickableMention.h) && epx.f(this.i, clickableMention.i) && this.j == clickableMention.j;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        UserId userId = this.e;
        int a2 = urd0.a((hashCode + (userId != null ? Long.hashCode(userId.b) : 0)) * 31, 31, this.f);
        String str = this.g;
        int hashCode2 = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        UserProfile userProfile = this.h;
        int hashCode3 = (hashCode2 + (userProfile != null ? userProfile.hashCode() : 0)) * 31;
        Group group = this.i;
        return this.j.hashCode() + ((hashCode3 + (group != null ? group.hashCode() : 0)) * 31);
    }

    public ClickableMention(long j, List<WebClickablePoint> list, q500 q500Var, UserId userId, String str, String str2, UserProfile userProfile, Group group) {
        super(j, list, q500Var);
        this.e = userId;
        this.f = str;
        this.g = str2;
        this.h = userProfile;
        this.i = group;
        this.j = WebStickerType.MENTION;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableMention(Serializer serializer) {
        this(r1, r3, r4, r5, r0 == null ? "" : r0, serializer.H(), (UserProfile) serializer.G(UserProfile.class.getClassLoader()), (Group) serializer.G(Group.class.getClassLoader()));
        long w = serializer.w();
        ArrayList k2 = serializer.k(WebClickablePoint.class);
        ArrayList arrayList = k2 == null ? new ArrayList() : k2;
        q500 y = serializer.y();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
    }
}
