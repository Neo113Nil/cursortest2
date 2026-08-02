package com.vk.newsfeed.impl.requests;

import android.os.Bundle;
import android.util.SparseArray;
import com.ironsource.C4504q2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFriendsOnlyDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedResponseDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallCommentOrderDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.api.generated.wall.dto.WallGetCommentOrderResponseDto;
import com.vk.api.generated.wall.dto.WallGetCommentsExtendedSortDto;
import com.vk.api.generated.wall.dto.WallViewsDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.api.parsers.BadgesParsers;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bcg;
import xsna.bkh0;
import xsna.c5g;
import xsna.ccg;
import xsna.cqm0;
import xsna.dq;
import xsna.drm0;
import xsna.dz2;
import xsna.e43;
import xsna.epx;
import xsna.hz2;
import xsna.k0x;
import xsna.l370;
import xsna.l7r0;
import xsna.lax0;
import xsna.max0;
import xsna.o19;
import xsna.rsg0;
import xsna.s1r0;
import xsna.tci;
import xsna.tfx;
import xsna.tqt;
import xsna.uqt;
import xsna.vcl0;
import xsna.vqt;
import xsna.y8;
import xsna.yfb;

/* compiled from: GetCommentsRequest.kt */
/* loaded from: classes4.dex */
public final class a extends tqt {
    public final boolean A;
    public Integer B;
    public String C;
    public String D;
    public Integer E;
    public Boolean F;
    public Boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public final UserId s;
    public final int t;
    public int u;
    public final String v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public a(UserId userId, int i, String str, String str2, boolean z, boolean z2, int i2, boolean z3) {
        super("no_method");
        this.s = userId;
        this.t = i;
        this.u = 50;
        this.v = str;
        this.w = str2;
        this.x = z;
        this.y = z2;
        this.z = i2;
        this.A = z3;
        this.J = true;
    }

    public final void F0(rsg0 rsg0Var) {
        if (this.d) {
            rsg0Var.d = this.d;
        }
        if (this.c) {
            rsg0Var.c = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148 A[LOOP:2: B:44:0x0142->B:46:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ca  */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        WallGetCommentsExtendedSortDto wallGetCommentsExtendedSortDto;
        JSONObject jSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder;
        String str;
        PostAuthor postAuthor;
        int optInt;
        int i;
        UserId userId;
        vqt.a aVar;
        CommentsOrder commentsOrder;
        String i2;
        String e;
        ReactionSet reactionSet;
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto;
        Iterator it;
        Integer d;
        LikeInfo likeInfo;
        int i3;
        BaseLikesInfoDto S0;
        Object obj;
        JSONArray optJSONArray2;
        int length;
        int i4;
        max0 max0Var = new max0();
        int i5 = this.t;
        Integer valueOf = Integer.valueOf(i5);
        Integer num = this.E;
        Integer num2 = this.B;
        Integer valueOf2 = Integer.valueOf(this.u);
        String str2 = this.v;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 96881) {
                if (hashCode != 3079825) {
                    if (hashCode == 109549001 && str2.equals("smart")) {
                        wallGetCommentsExtendedSortDto = WallGetCommentsExtendedSortDto.MOST_INTERESTING;
                    }
                } else if (str2.equals(CampaignEx.JSON_KEY_DESC)) {
                    wallGetCommentsExtendedSortDto = WallGetCommentsExtendedSortDto.REVERSE_CHRONOLOGICAL;
                }
            } else if (str2.equals("asc")) {
                wallGetCommentsExtendedSortDto = WallGetCommentsExtendedSortDto.CHRONOLOGICAL;
            }
            String str3 = this.C;
            String str4 = this.D;
            Boolean bool = this.F;
            List l = e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.HAS_UNSEEN_STORIES, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.DEACTIVATED);
            Boolean bool2 = this.G;
            Boolean valueOf3 = Boolean.valueOf(this.A);
            UserId userId2 = this.s;
            hz2 z = yfb.z(max0Var.m(userId2, valueOf, num, num2, valueOf2, wallGetCommentsExtendedSortDto, str3, str4, bool, l, null, bool2, valueOf3), new y8(22));
            F0(z);
            jSONObject = ((JSONObject) z.f(l7r0Var)).getJSONObject("response");
            String a = cqm0.a(jSONObject.optString(C4504q2.u));
            ArrayList arrayList = new ArrayList();
            optJSONArray = jSONObject.optJSONArray("profiles");
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                for (int i6 = 0; i6 < length2; i6++) {
                    long optLong = optJSONArray.getJSONObject(i6).optLong("id");
                    if (optLong != 0) {
                        dq.h(optLong, arrayList);
                    }
                }
            }
            optJSONObject = jSONObject.optJSONObject("comments");
            if (optJSONObject != null && (optJSONArray2 = optJSONObject.optJSONArray("items")) != null) {
                length = optJSONArray2.length();
                for (i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i4);
                    long optLong2 = jSONObject2.optLong("from_id");
                    if (optLong2 != 0) {
                        dq.h(optLong2, arrayList);
                    }
                    long optLong3 = jSONObject2.optLong("reply_to_user");
                    if (optLong2 != 0) {
                        dq.h(optLong3, arrayList);
                    }
                }
            }
            List<UsersUserFullDto> list = (List) yfb.x(s1r0.a.a((54 & 8) == 0 ? null : "dat", arrayList, null)).f(l7r0Var);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (UsersUserFullDto usersUserFullDto : list) {
                jSONArray.put(usersUserFullDto.D0());
                jSONArray2.put(usersUserFullDto.s1().b);
            }
            jSONObject.put("names_dat", jSONArray);
            jSONObject.put("ids_dat", jSONArray2);
            optJSONObject2 = jSONObject.optJSONObject("negative_replies_placeholder");
            String a2 = cqm0.a(jSONObject.optString("next_from"));
            String a3 = cqm0.a(jSONObject.optString("prev_from"));
            if (optJSONObject2 == null) {
                Serializer.c<WallNegativeRepliesPlaceholder> cVar = WallNegativeRepliesPlaceholder.CREATOR;
                wallNegativeRepliesPlaceholder = WallNegativeRepliesPlaceholder.a.a(optJSONObject2);
            } else {
                wallNegativeRepliesPlaceholder = null;
            }
            jSONObject.optBoolean("can_like_as_author", false);
            int optInt2 = jSONObject.optInt("current_level_count", jSONObject.optInt("count"));
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            ccg.a(jSONObject, hashMap, hashMap2);
            tci.q(jSONObject);
            SparseArray<BadgeItem> b = BadgesParsers.b(jSONObject);
            if (jSONObject.has("post_author_id")) {
                str = a2;
            } else {
                str = a2;
                Owner owner = (Owner) hashMap.get(new UserId(jSONObject.optLong("post_author_id")));
                if (owner != null) {
                    Serializer.c<PostAuthor> cVar2 = PostAuthor.CREATOR;
                    postAuthor = PostAuthor.a.a(owner);
                    VKList vKList = new VKList(jSONObject, new uqt(new bcg(postAuthor, hashMap, hashMap2, b, 0)));
                    Integer num3 = this.B;
                    optInt = jSONObject.optInt("real_offset", num3 != null ? num3.intValue() : 0);
                    if (optInt < 0) {
                        optInt = 0;
                    }
                    vqt.a aVar2 = new vqt.a(EmptyList.b, -1, -1, -1, false, null, null);
                    if (this.J) {
                        max0 max0Var2 = new max0();
                        StringBuilder sb = new StringBuilder();
                        sb.append(userId2.b);
                        sb.append('_');
                        i = i5;
                        sb.append(i);
                        dz2 x = yfb.x(lax0.c(max0Var2, Collections.singletonList(sb.toString()), null, this.w, 42));
                        F0(x);
                        WallGetByIdResponseDto wallGetByIdResponseDto = (WallGetByIdResponseDto) x.f(l7r0Var);
                        List<WallWallItemDto> e2 = wallGetByIdResponseDto.e();
                        WallWallItemDto wallWallItemDto = e2 != null ? e2.get(0) : null;
                        WallWallItemDto.WallWallpostFullDto wallWallpostFullDto = wallWallItemDto instanceof WallWallItemDto.WallWallpostFullDto ? (WallWallItemDto.WallWallpostFullDto) wallWallItemDto : null;
                        if (wallWallpostFullDto != null) {
                            LikesItemReactionsDto t1 = wallWallpostFullDto.t1();
                            boolean z2 = (t1 != null ? t1.e() : null) != null;
                            List<LikesReactionSetDto> f = wallGetByIdResponseDto.f();
                            if (f != null) {
                                Iterator<T> it2 = f.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (epx.f(((LikesReactionSetDto) obj).getId(), wallWallpostFullDto.s1())) {
                                        break;
                                    }
                                }
                                LikesReactionSetDto likesReactionSetDto = (LikesReactionSetDto) obj;
                                if (likesReactionSetDto != null) {
                                    reactionSet = o19.q(likesReactionSetDto);
                                    LikesItemReactionsDto t12 = wallWallpostFullDto.t1();
                                    ItemReactions D = t12 == null ? l370.D(t12, reactionSet) : null;
                                    LikesGetListExtendedFilterDto likesGetListExtendedFilterDto2 = LikesGetListExtendedFilterDto.LIKES;
                                    if (this.y) {
                                        if (!z2) {
                                            BaseLikesInfoDto S02 = wallWallpostFullDto.S0();
                                            if ((S02 != null ? S02.i() : null) != BaseBoolIntDto.YES) {
                                                i3 = 0;
                                                LikesGetListExtendedFilterDto likesGetListExtendedFilterDto3 = LikesGetListExtendedFilterDto.COPIES;
                                                S0 = wallWallpostFullDto.S0();
                                                if ((S0 == null ? S0.getCount() : 0) <= i3) {
                                                    likesGetListExtendedFilterDto = likesGetListExtendedFilterDto3;
                                                    userId = userId2;
                                                    dz2 x2 = yfb.x(k0x.f(new k0x(4), "post", this.s, Integer.valueOf(i), likesGetListExtendedFilterDto, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(this.z), Boolean.valueOf(this.x), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                                                    F0(x2);
                                                    List<UsersSubscriptionsItemDto> d2 = ((LikesGetListExtendedResponseDto) x2.f(l7r0Var)).d();
                                                    ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
                                                    it = d2.iterator();
                                                    while (it.hasNext()) {
                                                        UsersSubscriptionsItemDto usersSubscriptionsItemDto = (UsersSubscriptionsItemDto) it.next();
                                                        Bundle bundle = new Bundle();
                                                        Iterator it3 = it;
                                                        if (usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.UsersUserFullDto) {
                                                            bundle.putString("photo", ((UsersSubscriptionsItemDto.UsersUserFullDto) usersSubscriptionsItemDto).o());
                                                            likeInfo = new LikeInfo(1, bundle, false);
                                                        } else {
                                                            if (!(usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.GroupsGroupFullDto)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            bundle.putString("photo", ((UsersSubscriptionsItemDto.GroupsGroupFullDto) usersSubscriptionsItemDto).p());
                                                            likeInfo = new LikeInfo(2, bundle, false);
                                                        }
                                                        arrayList2.add(likeInfo);
                                                        it = it3;
                                                    }
                                                    BaseLikesInfoDto S03 = wallWallpostFullDto.S0();
                                                    int count = S03 != null ? S03.getCount() : -1;
                                                    WallViewsDto l2 = wallWallpostFullDto.l2();
                                                    int intValue = (l2 != null || (d = l2.d()) == null) ? -1 : d.intValue();
                                                    BaseRepostsInfoDto z1 = wallWallpostFullDto.z1();
                                                    int count2 = z1 != null ? z1.getCount() : -1;
                                                    BaseLikesInfoDto S04 = wallWallpostFullDto.S0();
                                                    aVar = new vqt.a(arrayList2, count, intValue, count2, (S04 != null ? S04.i() : null) == BaseBoolIntDto.YES, reactionSet, D);
                                                    if (this.I) {
                                                        commentsOrder = null;
                                                    } else {
                                                        tfx tfxVar = new tfx("wall.getCommentOrder", new bkh0(9), new vcl0(13));
                                                        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                                                        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
                                                        WallGetCommentOrderResponseDto wallGetCommentOrderResponseDto = (WallGetCommentOrderResponseDto) yfb.x(tfxVar).f(l7r0Var);
                                                        String i7 = wallGetCommentOrderResponseDto.d().i();
                                                        List<WallCommentOrderDto> e3 = wallGetCommentOrderResponseDto.e();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (WallCommentOrderDto wallCommentOrderDto : e3) {
                                                            WallCommentOrderDto.IdDto d3 = wallCommentOrderDto.d();
                                                            CommentsOrder.Item item = (d3 == null || (i2 = d3.i()) == null || (e = wallCommentOrderDto.e()) == null) ? null : new CommentsOrder.Item(i2, e);
                                                            if (item != null) {
                                                                arrayList3.add(item);
                                                            }
                                                        }
                                                        commentsOrder = new CommentsOrder(i7, arrayList3);
                                                    }
                                                    return new vqt(vKList, optInt2, Math.max(optInt, 0), a3, str, commentsOrder, a, aVar, null, wallNegativeRepliesPlaceholder, this.H);
                                                }
                                            }
                                        }
                                        i3 = 1;
                                        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto32 = LikesGetListExtendedFilterDto.COPIES;
                                        S0 = wallWallpostFullDto.S0();
                                        if ((S0 == null ? S0.getCount() : 0) <= i3) {
                                        }
                                    }
                                    likesGetListExtendedFilterDto = likesGetListExtendedFilterDto2;
                                    userId = userId2;
                                    dz2 x22 = yfb.x(k0x.f(new k0x(4), "post", this.s, Integer.valueOf(i), likesGetListExtendedFilterDto, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(this.z), Boolean.valueOf(this.x), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                                    F0(x22);
                                    List<UsersSubscriptionsItemDto> d22 = ((LikesGetListExtendedResponseDto) x22.f(l7r0Var)).d();
                                    ArrayList arrayList22 = new ArrayList(c5g.u(d22, 10));
                                    it = d22.iterator();
                                    while (it.hasNext()) {
                                    }
                                    BaseLikesInfoDto S032 = wallWallpostFullDto.S0();
                                    if (S032 != null) {
                                    }
                                    WallViewsDto l22 = wallWallpostFullDto.l2();
                                    if (l22 != null) {
                                    }
                                    BaseRepostsInfoDto z12 = wallWallpostFullDto.z1();
                                    int count22 = z12 != null ? z12.getCount() : -1;
                                    BaseLikesInfoDto S042 = wallWallpostFullDto.S0();
                                    aVar = new vqt.a(arrayList22, count, intValue, count22, (S042 != null ? S042.i() : null) == BaseBoolIntDto.YES, reactionSet, D);
                                    if (this.I) {
                                    }
                                    return new vqt(vKList, optInt2, Math.max(optInt, 0), a3, str, commentsOrder, a, aVar, null, wallNegativeRepliesPlaceholder, this.H);
                                }
                            }
                            reactionSet = null;
                            LikesItemReactionsDto t122 = wallWallpostFullDto.t1();
                            if (t122 == null) {
                            }
                            LikesGetListExtendedFilterDto likesGetListExtendedFilterDto22 = LikesGetListExtendedFilterDto.LIKES;
                            if (this.y) {
                            }
                            likesGetListExtendedFilterDto = likesGetListExtendedFilterDto22;
                            userId = userId2;
                            dz2 x222 = yfb.x(k0x.f(new k0x(4), "post", this.s, Integer.valueOf(i), likesGetListExtendedFilterDto, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(this.z), Boolean.valueOf(this.x), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                            F0(x222);
                            List<UsersSubscriptionsItemDto> d222 = ((LikesGetListExtendedResponseDto) x222.f(l7r0Var)).d();
                            ArrayList arrayList222 = new ArrayList(c5g.u(d222, 10));
                            it = d222.iterator();
                            while (it.hasNext()) {
                            }
                            BaseLikesInfoDto S0322 = wallWallpostFullDto.S0();
                            if (S0322 != null) {
                            }
                            WallViewsDto l222 = wallWallpostFullDto.l2();
                            if (l222 != null) {
                            }
                            BaseRepostsInfoDto z122 = wallWallpostFullDto.z1();
                            int count222 = z122 != null ? z122.getCount() : -1;
                            BaseLikesInfoDto S0422 = wallWallpostFullDto.S0();
                            aVar = new vqt.a(arrayList222, count, intValue, count222, (S0422 != null ? S0422.i() : null) == BaseBoolIntDto.YES, reactionSet, D);
                            if (this.I) {
                            }
                            return new vqt(vKList, optInt2, Math.max(optInt, 0), a3, str, commentsOrder, a, aVar, null, wallNegativeRepliesPlaceholder, this.H);
                        }
                    } else {
                        i = i5;
                    }
                    userId = userId2;
                    aVar = aVar2;
                    if (this.I) {
                    }
                    return new vqt(vKList, optInt2, Math.max(optInt, 0), a3, str, commentsOrder, a, aVar, null, wallNegativeRepliesPlaceholder, this.H);
                }
            }
            postAuthor = null;
            VKList vKList2 = new VKList(jSONObject, new uqt(new bcg(postAuthor, hashMap, hashMap2, b, 0)));
            Integer num32 = this.B;
            optInt = jSONObject.optInt("real_offset", num32 != null ? num32.intValue() : 0);
            if (optInt < 0) {
            }
            vqt.a aVar22 = new vqt.a(EmptyList.b, -1, -1, -1, false, null, null);
            if (this.J) {
            }
            userId = userId2;
            aVar = aVar22;
            if (this.I) {
            }
            return new vqt(vKList2, optInt2, Math.max(optInt, 0), a3, str, commentsOrder, a, aVar, null, wallNegativeRepliesPlaceholder, this.H);
        }
        wallGetCommentsExtendedSortDto = null;
        String str32 = this.C;
        String str42 = this.D;
        Boolean bool3 = this.F;
        List l3 = e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.HAS_UNSEEN_STORIES, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.DEACTIVATED);
        Boolean bool22 = this.G;
        Boolean valueOf32 = Boolean.valueOf(this.A);
        UserId userId22 = this.s;
        hz2 z3 = yfb.z(max0Var.m(userId22, valueOf, num, num2, valueOf2, wallGetCommentsExtendedSortDto, str32, str42, bool3, l3, null, bool22, valueOf32), new y8(22));
        F0(z3);
        jSONObject = ((JSONObject) z3.f(l7r0Var)).getJSONObject("response");
        String a4 = cqm0.a(jSONObject.optString(C4504q2.u));
        ArrayList arrayList4 = new ArrayList();
        optJSONArray = jSONObject.optJSONArray("profiles");
        if (optJSONArray != null) {
        }
        optJSONObject = jSONObject.optJSONObject("comments");
        if (optJSONObject != null) {
            length = optJSONArray2.length();
            while (i4 < length) {
            }
        }
        List<UsersUserFullDto> list2 = (List) yfb.x(s1r0.a.a((54 & 8) == 0 ? null : "dat", arrayList4, null)).f(l7r0Var);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray22 = new JSONArray();
        while (r4.hasNext()) {
        }
        jSONObject.put("names_dat", jSONArray3);
        jSONObject.put("ids_dat", jSONArray22);
        optJSONObject2 = jSONObject.optJSONObject("negative_replies_placeholder");
        String a22 = cqm0.a(jSONObject.optString("next_from"));
        String a32 = cqm0.a(jSONObject.optString("prev_from"));
        if (optJSONObject2 == null) {
        }
        jSONObject.optBoolean("can_like_as_author", false);
        int optInt22 = jSONObject.optInt("current_level_count", jSONObject.optInt("count"));
        HashMap hashMap3 = new HashMap();
        HashMap hashMap22 = new HashMap();
        ccg.a(jSONObject, hashMap3, hashMap22);
        tci.q(jSONObject);
        SparseArray<BadgeItem> b2 = BadgesParsers.b(jSONObject);
        if (jSONObject.has("post_author_id")) {
        }
        postAuthor = null;
        VKList vKList22 = new VKList(jSONObject, new uqt(new bcg(postAuthor, hashMap3, hashMap22, b2, 0)));
        Integer num322 = this.B;
        optInt = jSONObject.optInt("real_offset", num322 != null ? num322.intValue() : 0);
        if (optInt < 0) {
        }
        vqt.a aVar222 = new vqt.a(EmptyList.b, -1, -1, -1, false, null, null);
        if (this.J) {
        }
        userId = userId22;
        aVar = aVar222;
        if (this.I) {
        }
        return new vqt(vKList22, optInt22, Math.max(optInt, 0), a32, str, commentsOrder, a4, aVar, null, wallNegativeRepliesPlaceholder, this.H);
    }
}
