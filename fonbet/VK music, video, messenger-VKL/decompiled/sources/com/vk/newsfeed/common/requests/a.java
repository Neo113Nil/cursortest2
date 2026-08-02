package com.vk.newsfeed.common.requests;

import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFilterDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedFriendsOnlyDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedResponseDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.photos.dto.PhotosGetCommentsExtendedSortDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
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
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aha0;
import xsna.awi;
import xsna.bcg;
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
import xsna.ly80;
import xsna.max0;
import xsna.o19;
import xsna.p9x0;
import xsna.rsg0;
import xsna.s1r0;
import xsna.s3q0;
import xsna.sft0;
import xsna.tci;
import xsna.tft0;
import xsna.tfx;
import xsna.uft0;
import xsna.vqt;
import xsna.xga0;
import xsna.y8;
import xsna.yfb;
import xsna.zga0;

/* compiled from: WallGetCommentsRequest.kt */
/* loaded from: classes4.dex */
public final class a extends awi<vqt> {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final Integer D;
    public String E;
    public String F;
    public Integer G;
    public Boolean H;
    public Integer I;
    public Boolean J;
    public Boolean K;
    public int L;
    public Boolean M;
    public final UserId s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public final String x;
    public final boolean y;
    public final String z;

    public /* synthetic */ a(int i, int i2, UserId userId, String str, String str2) {
        this(userId, i, 50, i2, false, str, false, str2, true, true, 2);
    }

    public final void F0(rsg0 rsg0Var) {
        if (this.d) {
            rsg0Var.d = this.d;
        }
        if (this.c) {
            rsg0Var.c = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d5 A[LOOP:2: B:59:0x02cf->B:61:0x02d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b1  */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        String str;
        Integer num;
        UserId userId;
        boolean z;
        String str2;
        Integer num2;
        PhotosGetCommentsExtendedSortDto photosGetCommentsExtendedSortDto;
        List l;
        tfx tfxVar;
        UserId userId2;
        tfx tfxVar2;
        tfx tfxVar3;
        String str3;
        tfx tfxVar4;
        ArrayList arrayList;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        Integer num3;
        Integer num4;
        long j;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder;
        PostAuthor postAuthor;
        int optInt;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        BaseBoolIntDto baseBoolIntDto;
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto;
        Integer d;
        LikeInfo likeInfo;
        Integer d2;
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto2;
        Integer d3;
        LikeInfo likeInfo2;
        Integer d4;
        ReactionSet reactionSet;
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto3;
        Integer d5;
        LikeInfo likeInfo3;
        int i4;
        BaseLikesInfoDto S0;
        Object obj;
        Owner owner;
        JSONArray optJSONArray2;
        int length;
        int i5;
        Integer num5 = 1;
        String str4 = "post";
        int i6 = this.v;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2 || i6 == 6) {
                    str = "video";
                    num = this.D;
                    userId = this.s;
                    int i7 = this.u;
                    z = this.y;
                    str2 = this.x;
                    int i8 = this.t;
                    if (i6 != 1) {
                        if (i6 == 2 || i6 == 6) {
                            hz2 z5 = yfb.z(tft0.C(new uft0(), this.t, this.s, this.x, Boolean.TRUE, this.G, this.D, Integer.valueOf(i7), z ? VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST : VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST, drm0.b0("photo_base,trending,verified,emoji_status,image_status,is_verified,video_files,deactivated", new char[]{','}, 0, 6), this.M, null, null, 14592), new y8(22));
                            F0(z5);
                            jSONObject = (JSONObject) z5.f(l7r0Var);
                        } else if (i6 != 7 && i6 != 9) {
                            hz2 z6 = yfb.z(new max0().m(this.s, Integer.valueOf(i8), this.G, this.D, Integer.valueOf(i7), z ? WallGetCommentsExtendedSortDto.REVERSE_CHRONOLOGICAL : WallGetCommentsExtendedSortDto.CHRONOLOGICAL, this.E, this.F, this.H, e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.DEACTIVATED), this.I, this.J, this.K), new y8(22));
                            F0(z6);
                            jSONObject = (JSONObject) z6.f(l7r0Var);
                        }
                        str3 = str2;
                        userId2 = userId;
                        jSONObject2 = jSONObject.getJSONObject("response");
                        ArrayList arrayList2 = new ArrayList();
                        optJSONArray = jSONObject2.optJSONArray("profiles");
                        if (optJSONArray == null) {
                            int length2 = optJSONArray.length();
                            int i9 = 0;
                            j = 0;
                            while (i9 < length2) {
                                Integer num6 = num;
                                Integer num7 = num5;
                                int i10 = length2;
                                long optLong = optJSONArray.getJSONObject(i9).optLong("id");
                                if (optLong != 0) {
                                    dq.h(optLong, arrayList2);
                                }
                                i9++;
                                num = num6;
                                num5 = num7;
                                length2 = i10;
                            }
                            num3 = num;
                            num4 = num5;
                            s3q0 s3q0Var = s3q0.a;
                        } else {
                            num3 = num;
                            num4 = num5;
                            j = 0;
                        }
                        optJSONObject = jSONObject2.optJSONObject("comments");
                        if (optJSONObject != null && (optJSONArray2 = optJSONObject.optJSONArray("items")) != null) {
                            length = optJSONArray2.length();
                            for (i5 = 0; i5 < length; i5++) {
                                JSONObject jSONObject3 = optJSONArray2.getJSONObject(i5);
                                long optLong2 = jSONObject3.optLong("from_id");
                                if (optLong2 != j) {
                                    dq.h(optLong2, arrayList2);
                                }
                                long optLong3 = jSONObject3.optLong("reply_to_user");
                                if (optLong2 != j) {
                                    dq.h(optLong3, arrayList2);
                                }
                            }
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        List<UsersUserFullDto> list = (List) yfb.x(s1r0.a.a((54 & 8) == 0 ? null : "dat", arrayList2, null)).f(l7r0Var);
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (UsersUserFullDto usersUserFullDto : list) {
                            jSONArray.put(usersUserFullDto.D0());
                            jSONArray2.put(usersUserFullDto.s1().b);
                        }
                        jSONObject2.put("names_dat", jSONArray);
                        jSONObject2.put("ids_dat", jSONArray2);
                        optJSONObject2 = jSONObject2.optJSONObject("negative_replies_placeholder");
                        String a = cqm0.a(jSONObject2.optString("next_from"));
                        String a2 = cqm0.a(jSONObject2.optString("prev_from"));
                        if (optJSONObject2 == null) {
                            Serializer.c<WallNegativeRepliesPlaceholder> cVar = WallNegativeRepliesPlaceholder.CREATOR;
                            wallNegativeRepliesPlaceholder = WallNegativeRepliesPlaceholder.a.a(optJSONObject2);
                        } else {
                            wallNegativeRepliesPlaceholder = null;
                        }
                        jSONObject2.optBoolean("can_like_as_author", false);
                        int optInt2 = jSONObject2.optInt("current_level_count", jSONObject2.optInt("count"));
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        ccg.a(jSONObject2, hashMap, hashMap2);
                        tci.q(jSONObject2);
                        SparseArray<BadgeItem> b = BadgesParsers.b(jSONObject2);
                        if (jSONObject2.has("post_author_id") || (owner = (Owner) hashMap.get(new UserId(jSONObject2.optLong("post_author_id")))) == null) {
                            postAuthor = null;
                        } else {
                            Serializer.c<PostAuthor> cVar2 = PostAuthor.CREATOR;
                            postAuthor = PostAuthor.a.a(owner);
                        }
                        VKList vKList = new VKList(jSONObject2, new p9x0(new bcg(postAuthor, hashMap, hashMap2, b, this.v)));
                        if (z) {
                            Collections.reverse(vKList);
                        }
                        optInt = jSONObject2.optInt("real_offset", num3 == null ? num3.intValue() : 0);
                        if (optInt < 0) {
                            optInt = 0;
                        }
                        String optString = jSONObject2.optString("next_from_toxic");
                        vqt.a aVar = new vqt.a(EmptyList.b, -1, -1, -1, false, null, null);
                        if (this.w) {
                            boolean z7 = this.A;
                            int i11 = this.C;
                            boolean z8 = this.B;
                            if (i6 == 1) {
                                i = optInt;
                                z2 = z7;
                                z3 = z8;
                                i3 = i8;
                                z4 = 0;
                                baseBoolIntDto = null;
                            } else {
                                if (i6 == 2 || i6 == 6) {
                                    int i12 = optInt;
                                    uft0 uft0Var = new uft0();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(userId2.b);
                                    sb.append('_');
                                    sb.append(i8);
                                    i = i12;
                                    i2 = 0;
                                    dz2 x = yfb.x(sft0.a.b(uft0Var, this.s, Collections.singletonList(sb.toString()), null, num4, 0, Boolean.TRUE, null, 16775990));
                                    F0(x);
                                    VideoVideoFullDto videoVideoFullDto = ((VideoGetResponseDto) x.f(l7r0Var)).e().get(0);
                                    LikesGetListExtendedFilterDto likesGetListExtendedFilterDto4 = LikesGetListExtendedFilterDto.LIKES;
                                    if (z8) {
                                        BaseLikesDto y1 = videoVideoFullDto.y1();
                                        int i13 = (y1 != null ? y1.e() : null) == BaseBoolIntDto.YES ? 1 : 0;
                                        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto5 = LikesGetListExtendedFilterDto.COPIES;
                                        BaseLikesDto y12 = videoVideoFullDto.y1();
                                        if (((y12 == null || (d4 = y12.d()) == null) ? 0 : d4.intValue()) <= i13) {
                                            likesGetListExtendedFilterDto2 = likesGetListExtendedFilterDto5;
                                            dz2 x2 = yfb.x(k0x.f(new k0x(4), str, this.s, Integer.valueOf(i8), likesGetListExtendedFilterDto2, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(i11), Boolean.valueOf(z7), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                                            F0(x2);
                                            x2.K("access_key", str3);
                                            List<UsersSubscriptionsItemDto> d6 = ((LikesGetListExtendedResponseDto) x2.f(l7r0Var)).d();
                                            ArrayList arrayList3 = new ArrayList(c5g.u(d6, 10));
                                            for (UsersSubscriptionsItemDto usersSubscriptionsItemDto : d6) {
                                                Bundle bundle = new Bundle();
                                                if (usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.UsersUserFullDto) {
                                                    bundle.putString("photo", ((UsersSubscriptionsItemDto.UsersUserFullDto) usersSubscriptionsItemDto).o());
                                                    likeInfo2 = new LikeInfo(1, bundle, false);
                                                } else {
                                                    if (!(usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.GroupsGroupFullDto)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    bundle.putString("photo", ((UsersSubscriptionsItemDto.GroupsGroupFullDto) usersSubscriptionsItemDto).p());
                                                    likeInfo2 = new LikeInfo(2, bundle, false);
                                                }
                                                arrayList3.add(likeInfo2);
                                            }
                                            BaseLikesDto y13 = videoVideoFullDto.y1();
                                            int intValue = (y13 != null || (d3 = y13.d()) == null) ? -1 : d3.intValue();
                                            Integer V2 = videoVideoFullDto.V2();
                                            int intValue2 = V2 == null ? V2.intValue() : -1;
                                            BaseRepostsInfoDto E2 = videoVideoFullDto.E2();
                                            int count = E2 != null ? E2.getCount() : -1;
                                            BaseLikesDto y14 = videoVideoFullDto.y1();
                                            vqt.a aVar2 = new vqt.a(arrayList3, intValue, intValue2, count, (y14 == null ? y14.e() : null) != BaseBoolIntDto.YES, null, null);
                                            s3q0 s3q0Var3 = s3q0.a;
                                            aVar = aVar2;
                                            return new vqt(vKList, optInt2, Math.max(i, i2), a2, a, null, null, aVar, optString, wallNegativeRepliesPlaceholder, this.L);
                                        }
                                    }
                                    likesGetListExtendedFilterDto2 = likesGetListExtendedFilterDto4;
                                    dz2 x22 = yfb.x(k0x.f(new k0x(4), str, this.s, Integer.valueOf(i8), likesGetListExtendedFilterDto2, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(i11), Boolean.valueOf(z7), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                                    F0(x22);
                                    x22.K("access_key", str3);
                                    List<UsersSubscriptionsItemDto> d62 = ((LikesGetListExtendedResponseDto) x22.f(l7r0Var)).d();
                                    ArrayList arrayList32 = new ArrayList(c5g.u(d62, 10));
                                    while (r1.hasNext()) {
                                    }
                                    BaseLikesDto y132 = videoVideoFullDto.y1();
                                    if (y132 != null) {
                                    }
                                    Integer V22 = videoVideoFullDto.V2();
                                    if (V22 == null) {
                                    }
                                    BaseRepostsInfoDto E22 = videoVideoFullDto.E2();
                                    int count2 = E22 != null ? E22.getCount() : -1;
                                    BaseLikesDto y142 = videoVideoFullDto.y1();
                                    vqt.a aVar22 = new vqt.a(arrayList32, intValue, intValue2, count2, (y142 == null ? y142.e() : null) != BaseBoolIntDto.YES, null, null);
                                    s3q0 s3q0Var32 = s3q0.a;
                                    aVar = aVar22;
                                    return new vqt(vKList, optInt2, Math.max(i, i2), a2, a, null, null, aVar, optString, wallNegativeRepliesPlaceholder, this.L);
                                }
                                if (i6 == 7 || i6 == 9) {
                                    baseBoolIntDto = null;
                                    i = optInt;
                                    z2 = z7;
                                    z3 = z8;
                                    i3 = i8;
                                    z4 = 0;
                                } else {
                                    max0 max0Var = new max0();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(userId2.b);
                                    sb2.append('_');
                                    sb2.append(i8);
                                    dz2 x3 = yfb.x(lax0.c(max0Var, Collections.singletonList(sb2.toString()), null, this.z, 42));
                                    F0(x3);
                                    WallGetByIdResponseDto wallGetByIdResponseDto = (WallGetByIdResponseDto) x3.f(l7r0Var);
                                    List<WallWallItemDto> e = wallGetByIdResponseDto.e();
                                    WallWallItemDto wallWallItemDto = e != null ? e.get(0) : null;
                                    WallWallItemDto.WallWallpostFullDto wallWallpostFullDto = wallWallItemDto instanceof WallWallItemDto.WallWallpostFullDto ? (WallWallItemDto.WallWallpostFullDto) wallWallItemDto : null;
                                    if (wallWallpostFullDto != null) {
                                        LikesItemReactionsDto t1 = wallWallpostFullDto.t1();
                                        boolean z9 = (t1 != null ? t1.e() : null) != null;
                                        List<LikesReactionSetDto> f = wallGetByIdResponseDto.f();
                                        if (f != null) {
                                            Iterator<T> it = f.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    obj = null;
                                                    break;
                                                }
                                                obj = it.next();
                                                if (epx.f(((LikesReactionSetDto) obj).getId(), wallWallpostFullDto.s1())) {
                                                    break;
                                                }
                                            }
                                            LikesReactionSetDto likesReactionSetDto = (LikesReactionSetDto) obj;
                                            if (likesReactionSetDto != null) {
                                                reactionSet = o19.q(likesReactionSetDto);
                                                LikesItemReactionsDto t12 = wallWallpostFullDto.t1();
                                                ItemReactions D = t12 == null ? l370.D(t12, reactionSet) : null;
                                                LikesGetListExtendedFilterDto likesGetListExtendedFilterDto6 = LikesGetListExtendedFilterDto.LIKES;
                                                if (z8) {
                                                    if (!z9) {
                                                        BaseLikesInfoDto S02 = wallWallpostFullDto.S0();
                                                        if ((S02 != null ? S02.i() : null) != BaseBoolIntDto.YES) {
                                                            i4 = 0;
                                                            LikesGetListExtendedFilterDto likesGetListExtendedFilterDto7 = LikesGetListExtendedFilterDto.COPIES;
                                                            S0 = wallWallpostFullDto.S0();
                                                            if ((S0 == null ? S0.getCount() : 0) <= i4) {
                                                                likesGetListExtendedFilterDto3 = likesGetListExtendedFilterDto7;
                                                                dz2 x4 = yfb.x(k0x.f(new k0x(4), str, this.s, Integer.valueOf(i8), likesGetListExtendedFilterDto3, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(i11), Boolean.valueOf(z7), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                                                                F0(x4);
                                                                x4.K("access_key", str3);
                                                                List<UsersSubscriptionsItemDto> d7 = ((LikesGetListExtendedResponseDto) x4.f(l7r0Var)).d();
                                                                ArrayList arrayList4 = new ArrayList(c5g.u(d7, 10));
                                                                for (UsersSubscriptionsItemDto usersSubscriptionsItemDto2 : d7) {
                                                                    Bundle bundle2 = new Bundle();
                                                                    if (usersSubscriptionsItemDto2 instanceof UsersSubscriptionsItemDto.UsersUserFullDto) {
                                                                        bundle2.putString("photo", ((UsersSubscriptionsItemDto.UsersUserFullDto) usersSubscriptionsItemDto2).o());
                                                                        likeInfo3 = new LikeInfo(1, bundle2, false);
                                                                    } else {
                                                                        if (!(usersSubscriptionsItemDto2 instanceof UsersSubscriptionsItemDto.GroupsGroupFullDto)) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        bundle2.putString("photo", ((UsersSubscriptionsItemDto.GroupsGroupFullDto) usersSubscriptionsItemDto2).p());
                                                                        likeInfo3 = new LikeInfo(2, bundle2, false);
                                                                    }
                                                                    arrayList4.add(likeInfo3);
                                                                }
                                                                BaseLikesInfoDto S03 = wallWallpostFullDto.S0();
                                                                int count3 = S03 != null ? S03.getCount() : -1;
                                                                WallViewsDto l2 = wallWallpostFullDto.l2();
                                                                int intValue3 = (l2 != null || (d5 = l2.d()) == null) ? -1 : d5.intValue();
                                                                BaseRepostsInfoDto z1 = wallWallpostFullDto.z1();
                                                                int count4 = z1 != null ? z1.getCount() : -1;
                                                                BaseLikesInfoDto S04 = wallWallpostFullDto.S0();
                                                                aVar = new vqt.a(arrayList4, count3, intValue3, count4, (S04 != null ? S04.i() : null) == BaseBoolIntDto.YES, reactionSet, D);
                                                            }
                                                        }
                                                    }
                                                    i4 = 1;
                                                    LikesGetListExtendedFilterDto likesGetListExtendedFilterDto72 = LikesGetListExtendedFilterDto.COPIES;
                                                    S0 = wallWallpostFullDto.S0();
                                                    if ((S0 == null ? S0.getCount() : 0) <= i4) {
                                                    }
                                                }
                                                likesGetListExtendedFilterDto3 = likesGetListExtendedFilterDto6;
                                                dz2 x42 = yfb.x(k0x.f(new k0x(4), str, this.s, Integer.valueOf(i8), likesGetListExtendedFilterDto3, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(i11), Boolean.valueOf(z7), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                                                F0(x42);
                                                x42.K("access_key", str3);
                                                List<UsersSubscriptionsItemDto> d72 = ((LikesGetListExtendedResponseDto) x42.f(l7r0Var)).d();
                                                ArrayList arrayList42 = new ArrayList(c5g.u(d72, 10));
                                                while (r1.hasNext()) {
                                                }
                                                BaseLikesInfoDto S032 = wallWallpostFullDto.S0();
                                                if (S032 != null) {
                                                }
                                                WallViewsDto l22 = wallWallpostFullDto.l2();
                                                if (l22 != null) {
                                                }
                                                BaseRepostsInfoDto z12 = wallWallpostFullDto.z1();
                                                int count42 = z12 != null ? z12.getCount() : -1;
                                                BaseLikesInfoDto S042 = wallWallpostFullDto.S0();
                                                aVar = new vqt.a(arrayList42, count3, intValue3, count42, (S042 != null ? S042.i() : null) == BaseBoolIntDto.YES, reactionSet, D);
                                            }
                                        }
                                        reactionSet = null;
                                        LikesItemReactionsDto t122 = wallWallpostFullDto.t1();
                                        if (t122 == null) {
                                        }
                                        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto62 = LikesGetListExtendedFilterDto.LIKES;
                                        if (z8) {
                                        }
                                        likesGetListExtendedFilterDto3 = likesGetListExtendedFilterDto62;
                                        dz2 x422 = yfb.x(k0x.f(new k0x(4), str, this.s, Integer.valueOf(i8), likesGetListExtendedFilterDto3, LikesGetListExtendedFriendsOnlyDto.TYPE_3, Integer.valueOf(i11), Boolean.valueOf(z7), drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", new char[]{','}, 0, 6), 584));
                                        F0(x422);
                                        x422.K("access_key", str3);
                                        List<UsersSubscriptionsItemDto> d722 = ((LikesGetListExtendedResponseDto) x422.f(l7r0Var)).d();
                                        ArrayList arrayList422 = new ArrayList(c5g.u(d722, 10));
                                        while (r1.hasNext()) {
                                        }
                                        BaseLikesInfoDto S0322 = wallWallpostFullDto.S0();
                                        if (S0322 != null) {
                                        }
                                        WallViewsDto l222 = wallWallpostFullDto.l2();
                                        if (l222 != null) {
                                        }
                                        BaseRepostsInfoDto z122 = wallWallpostFullDto.z1();
                                        int count422 = z122 != null ? z122.getCount() : -1;
                                        BaseLikesInfoDto S0422 = wallWallpostFullDto.S0();
                                        aVar = new vqt.a(arrayList422, count3, intValue3, count422, (S0422 != null ? S0422.i() : null) == BaseBoolIntDto.YES, reactionSet, D);
                                    }
                                    s3q0 s3q0Var4 = s3q0.a;
                                }
                            }
                            aha0 aha0Var = new aha0();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(userId2.b);
                            sb3.append('_');
                            int i14 = i3;
                            sb3.append(i14);
                            sb3.append((str3 == null || str3.length() == 0) ? "" : BundleUtil.UNDERLINE_TAG.concat(str3));
                            dz2 x5 = yfb.x(zga0.l(aha0Var, Collections.singletonList(sb3.toString()), 4));
                            F0(x5);
                            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) ((List) x5.f(l7r0Var)).get(z4 ? 1 : 0);
                            LikesGetListExtendedFilterDto likesGetListExtendedFilterDto8 = LikesGetListExtendedFilterDto.LIKES;
                            if (z3) {
                                BaseLikesDto u = photosPhotoDto.u();
                                int i15 = (u != null ? u.e() : baseBoolIntDto) == BaseBoolIntDto.YES ? 1 : z4 ? 1 : 0;
                                LikesGetListExtendedFilterDto likesGetListExtendedFilterDto9 = LikesGetListExtendedFilterDto.COPIES;
                                BaseLikesDto u2 = photosPhotoDto.u();
                                if (((u2 == null || (d2 = u2.d()) == null) ? z4 ? 1 : 0 : d2.intValue()) <= i15) {
                                    likesGetListExtendedFilterDto = likesGetListExtendedFilterDto9;
                                    k0x k0xVar = new k0x(4);
                                    Integer valueOf = Integer.valueOf(i14);
                                    LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto = LikesGetListExtendedFriendsOnlyDto.TYPE_3;
                                    Integer valueOf2 = Integer.valueOf(i11);
                                    Boolean valueOf3 = Boolean.valueOf(z2);
                                    char[] cArr = new char[1];
                                    cArr[z4 ? 1 : 0] = ',';
                                    dz2 x6 = yfb.x(k0x.f(k0xVar, str, this.s, valueOf, likesGetListExtendedFilterDto, likesGetListExtendedFriendsOnlyDto, valueOf2, valueOf3, drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", cArr, z4 ? 1 : 0, 6), 584));
                                    F0(x6);
                                    x6.K("access_key", str3);
                                    List<UsersSubscriptionsItemDto> d8 = ((LikesGetListExtendedResponseDto) x6.f(l7r0Var)).d();
                                    ArrayList arrayList5 = new ArrayList(c5g.u(d8, 10));
                                    for (UsersSubscriptionsItemDto usersSubscriptionsItemDto3 : d8) {
                                        Bundle bundle3 = new Bundle();
                                        if (usersSubscriptionsItemDto3 instanceof UsersSubscriptionsItemDto.UsersUserFullDto) {
                                            bundle3.putString("photo", ((UsersSubscriptionsItemDto.UsersUserFullDto) usersSubscriptionsItemDto3).o());
                                            likeInfo = new LikeInfo(1, bundle3, z4);
                                        } else {
                                            if (!(usersSubscriptionsItemDto3 instanceof UsersSubscriptionsItemDto.GroupsGroupFullDto)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bundle3.putString("photo", ((UsersSubscriptionsItemDto.GroupsGroupFullDto) usersSubscriptionsItemDto3).p());
                                            likeInfo = new LikeInfo(2, bundle3, z4);
                                        }
                                        arrayList5.add(likeInfo);
                                    }
                                    BaseLikesDto u3 = photosPhotoDto.u();
                                    int intValue4 = (u3 != null || (d = u3.d()) == null) ? -1 : d.intValue();
                                    BaseRepostsInfoDto K = photosPhotoDto.K();
                                    int count5 = K != null ? K.getCount() : -1;
                                    BaseLikesDto u4 = photosPhotoDto.u();
                                    vqt.a aVar3 = new vqt.a(arrayList5, intValue4, -1, count5, (u4 == null ? u4.e() : baseBoolIntDto) != BaseBoolIntDto.YES ? true : z4 ? 1 : 0, null, null);
                                    s3q0 s3q0Var5 = s3q0.a;
                                    aVar = aVar3;
                                    i2 = z4;
                                    return new vqt(vKList, optInt2, Math.max(i, i2), a2, a, null, null, aVar, optString, wallNegativeRepliesPlaceholder, this.L);
                                }
                            }
                            likesGetListExtendedFilterDto = likesGetListExtendedFilterDto8;
                            k0x k0xVar2 = new k0x(4);
                            Integer valueOf4 = Integer.valueOf(i14);
                            LikesGetListExtendedFriendsOnlyDto likesGetListExtendedFriendsOnlyDto2 = LikesGetListExtendedFriendsOnlyDto.TYPE_3;
                            Integer valueOf22 = Integer.valueOf(i11);
                            Boolean valueOf32 = Boolean.valueOf(z2);
                            char[] cArr2 = new char[1];
                            cArr2[z4 ? 1 : 0] = ',';
                            dz2 x62 = yfb.x(k0x.f(k0xVar2, str, this.s, valueOf4, likesGetListExtendedFilterDto, likesGetListExtendedFriendsOnlyDto2, valueOf22, valueOf32, drm0.b0("photo_base,first_name_dat,last_name_dat,sex,is_friend,is_nft,is_nft_photo", cArr2, z4 ? 1 : 0, 6), 584));
                            F0(x62);
                            x62.K("access_key", str3);
                            List<UsersSubscriptionsItemDto> d82 = ((LikesGetListExtendedResponseDto) x62.f(l7r0Var)).d();
                            ArrayList arrayList52 = new ArrayList(c5g.u(d82, 10));
                            while (r1.hasNext()) {
                            }
                            BaseLikesDto u32 = photosPhotoDto.u();
                            if (u32 != null) {
                            }
                            BaseRepostsInfoDto K2 = photosPhotoDto.K();
                            int count52 = K2 != null ? K2.getCount() : -1;
                            BaseLikesDto u42 = photosPhotoDto.u();
                            vqt.a aVar32 = new vqt.a(arrayList52, intValue4, -1, count52, (u42 == null ? u42.e() : baseBoolIntDto) != BaseBoolIntDto.YES ? true : z4 ? 1 : 0, null, null);
                            s3q0 s3q0Var52 = s3q0.a;
                            aVar = aVar32;
                            i2 = z4;
                            return new vqt(vKList, optInt2, Math.max(i, i2), a2, a, null, null, aVar, optString, wallNegativeRepliesPlaceholder, this.L);
                        }
                        i = optInt;
                        i2 = 0;
                        return new vqt(vKList, optInt2, Math.max(i, i2), a2, a, null, null, aVar, optString, wallNegativeRepliesPlaceholder, this.L);
                    }
                    num2 = this.G;
                    photosGetCommentsExtendedSortDto = z ? PhotosGetCommentsExtendedSortDto.NEW_FIRST : PhotosGetCommentsExtendedSortDto.OLD_FIRST;
                    l = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.TRENDING, UsersFieldsDto.VERIFIED, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.IS_VERIFIED);
                    tfx tfxVar5 = new tfx("photos.getComments", new xga0(0), new ly80(1));
                    tfx.l(tfxVar5, "photo_id", this.t, 0, 0, 12);
                    if (userId != null) {
                        tfx.n(tfxVar5, "owner_id", userId, 0L, 0L, 12);
                        tfxVar = tfxVar5;
                    } else {
                        tfxVar = tfxVar5;
                    }
                    userId2 = userId;
                    tfxVar.j("need_likes", true);
                    if (num2 != null) {
                        tfxVar2 = tfxVar;
                        tfx.l(tfxVar2, "start_comment_id", num2.intValue(), 0, 0, 8);
                    } else {
                        tfxVar2 = tfxVar;
                    }
                    if (num != null) {
                        tfx.l(tfxVar2, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 12);
                    }
                    tfx tfxVar6 = tfxVar2;
                    tfxVar6.f(i7, 0, 100, "count");
                    if (photosGetCommentsExtendedSortDto != null) {
                        tfxVar3 = tfxVar6;
                        tfx.o(tfxVar3, "sort", photosGetCommentsExtendedSortDto.i(), 0, 0, 12);
                    } else {
                        tfxVar3 = tfxVar6;
                    }
                    if (str2 != null) {
                        tfx tfxVar7 = tfxVar3;
                        tfx.o(tfxVar7, "access_key", str2, 0, 0, 12);
                        tfxVar4 = tfxVar7;
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tfxVar4 = tfxVar3;
                    }
                    tfxVar4.j("extended", true);
                    if (l != null) {
                        List list2 = l;
                        arrayList = new ArrayList(c5g.u(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((UsersFieldsDto) it2.next()).i());
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        tfxVar4.i("fields", arrayList);
                    }
                    hz2 z10 = yfb.z(tfxVar4, new y8(22));
                    F0(z10);
                    jSONObject = (JSONObject) z10.f(l7r0Var);
                    jSONObject2 = jSONObject.getJSONObject("response");
                    ArrayList arrayList22 = new ArrayList();
                    optJSONArray = jSONObject2.optJSONArray("profiles");
                    if (optJSONArray == null) {
                    }
                    optJSONObject = jSONObject2.optJSONObject("comments");
                    if (optJSONObject != null) {
                        length = optJSONArray2.length();
                        while (i5 < length) {
                        }
                        s3q0 s3q0Var22 = s3q0.a;
                    }
                    List<UsersUserFullDto> list3 = (List) yfb.x(s1r0.a.a((54 & 8) == 0 ? null : "dat", arrayList22, null)).f(l7r0Var);
                    JSONArray jSONArray3 = new JSONArray();
                    JSONArray jSONArray22 = new JSONArray();
                    while (r3.hasNext()) {
                    }
                    jSONObject2.put("names_dat", jSONArray3);
                    jSONObject2.put("ids_dat", jSONArray22);
                    optJSONObject2 = jSONObject2.optJSONObject("negative_replies_placeholder");
                    String a3 = cqm0.a(jSONObject2.optString("next_from"));
                    String a22 = cqm0.a(jSONObject2.optString("prev_from"));
                    if (optJSONObject2 == null) {
                    }
                    jSONObject2.optBoolean("can_like_as_author", false);
                    int optInt22 = jSONObject2.optInt("current_level_count", jSONObject2.optInt("count"));
                    HashMap hashMap3 = new HashMap();
                    HashMap hashMap22 = new HashMap();
                    ccg.a(jSONObject2, hashMap3, hashMap22);
                    tci.q(jSONObject2);
                    SparseArray<BadgeItem> b2 = BadgesParsers.b(jSONObject2);
                    if (jSONObject2.has("post_author_id")) {
                    }
                    postAuthor = null;
                    VKList vKList2 = new VKList(jSONObject2, new p9x0(new bcg(postAuthor, hashMap3, hashMap22, b2, this.v)));
                    if (z) {
                    }
                    optInt = jSONObject2.optInt("real_offset", num3 == null ? num3.intValue() : 0);
                    if (optInt < 0) {
                    }
                    String optString2 = jSONObject2.optString("next_from_toxic");
                    vqt.a aVar4 = new vqt.a(EmptyList.b, -1, -1, -1, false, null, null);
                    if (this.w) {
                    }
                    i = optInt;
                    i2 = 0;
                    return new vqt(vKList2, optInt22, Math.max(i, i2), a22, a3, null, null, aVar4, optString2, wallNegativeRepliesPlaceholder, this.L);
                }
                if (i6 != 7 && i6 != 9) {
                    if (i6 == 12) {
                        str4 = "post_ads";
                    }
                }
            }
            str = "photo";
            num = this.D;
            userId = this.s;
            int i72 = this.u;
            z = this.y;
            str2 = this.x;
            int i82 = this.t;
            if (i6 != 1) {
            }
            num2 = this.G;
            if (z) {
            }
            l = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.TRENDING, UsersFieldsDto.VERIFIED, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.IS_VERIFIED);
            tfx tfxVar52 = new tfx("photos.getComments", new xga0(0), new ly80(1));
            tfx.l(tfxVar52, "photo_id", this.t, 0, 0, 12);
            if (userId != null) {
            }
            userId2 = userId;
            tfxVar.j("need_likes", true);
            if (num2 != null) {
            }
            if (num != null) {
            }
            tfx tfxVar62 = tfxVar2;
            tfxVar62.f(i72, 0, 100, "count");
            if (photosGetCommentsExtendedSortDto != null) {
            }
            if (str2 != null) {
            }
            tfxVar4.j("extended", true);
            if (l != null) {
            }
            if (arrayList != null) {
            }
            hz2 z102 = yfb.z(tfxVar4, new y8(22));
            F0(z102);
            jSONObject = (JSONObject) z102.f(l7r0Var);
            jSONObject2 = jSONObject.getJSONObject("response");
            ArrayList arrayList222 = new ArrayList();
            optJSONArray = jSONObject2.optJSONArray("profiles");
            if (optJSONArray == null) {
            }
            optJSONObject = jSONObject2.optJSONObject("comments");
            if (optJSONObject != null) {
            }
            List<UsersUserFullDto> list32 = (List) yfb.x(s1r0.a.a((54 & 8) == 0 ? null : "dat", arrayList222, null)).f(l7r0Var);
            JSONArray jSONArray32 = new JSONArray();
            JSONArray jSONArray222 = new JSONArray();
            while (r3.hasNext()) {
            }
            jSONObject2.put("names_dat", jSONArray32);
            jSONObject2.put("ids_dat", jSONArray222);
            optJSONObject2 = jSONObject2.optJSONObject("negative_replies_placeholder");
            String a32 = cqm0.a(jSONObject2.optString("next_from"));
            String a222 = cqm0.a(jSONObject2.optString("prev_from"));
            if (optJSONObject2 == null) {
            }
            jSONObject2.optBoolean("can_like_as_author", false);
            int optInt222 = jSONObject2.optInt("current_level_count", jSONObject2.optInt("count"));
            HashMap hashMap32 = new HashMap();
            HashMap hashMap222 = new HashMap();
            ccg.a(jSONObject2, hashMap32, hashMap222);
            tci.q(jSONObject2);
            SparseArray<BadgeItem> b22 = BadgesParsers.b(jSONObject2);
            if (jSONObject2.has("post_author_id")) {
            }
            postAuthor = null;
            VKList vKList22 = new VKList(jSONObject2, new p9x0(new bcg(postAuthor, hashMap32, hashMap222, b22, this.v)));
            if (z) {
            }
            optInt = jSONObject2.optInt("real_offset", num3 == null ? num3.intValue() : 0);
            if (optInt < 0) {
            }
            String optString22 = jSONObject2.optString("next_from_toxic");
            vqt.a aVar42 = new vqt.a(EmptyList.b, -1, -1, -1, false, null, null);
            if (this.w) {
            }
            i = optInt;
            i2 = 0;
            return new vqt(vKList22, optInt222, Math.max(i, i2), a222, a32, null, null, aVar42, optString22, wallNegativeRepliesPlaceholder, this.L);
        }
        str = str4;
        num = this.D;
        userId = this.s;
        int i722 = this.u;
        z = this.y;
        str2 = this.x;
        int i822 = this.t;
        if (i6 != 1) {
        }
        num2 = this.G;
        if (z) {
        }
        l = e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.TRENDING, UsersFieldsDto.VERIFIED, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.IS_VERIFIED);
        tfx tfxVar522 = new tfx("photos.getComments", new xga0(0), new ly80(1));
        tfx.l(tfxVar522, "photo_id", this.t, 0, 0, 12);
        if (userId != null) {
        }
        userId2 = userId;
        tfxVar.j("need_likes", true);
        if (num2 != null) {
        }
        if (num != null) {
        }
        tfx tfxVar622 = tfxVar2;
        tfxVar622.f(i722, 0, 100, "count");
        if (photosGetCommentsExtendedSortDto != null) {
        }
        if (str2 != null) {
        }
        tfxVar4.j("extended", true);
        if (l != null) {
        }
        if (arrayList != null) {
        }
        hz2 z1022 = yfb.z(tfxVar4, new y8(22));
        F0(z1022);
        jSONObject = (JSONObject) z1022.f(l7r0Var);
        jSONObject2 = jSONObject.getJSONObject("response");
        ArrayList arrayList2222 = new ArrayList();
        optJSONArray = jSONObject2.optJSONArray("profiles");
        if (optJSONArray == null) {
        }
        optJSONObject = jSONObject2.optJSONObject("comments");
        if (optJSONObject != null) {
        }
        List<UsersUserFullDto> list322 = (List) yfb.x(s1r0.a.a((54 & 8) == 0 ? null : "dat", arrayList2222, null)).f(l7r0Var);
        JSONArray jSONArray322 = new JSONArray();
        JSONArray jSONArray2222 = new JSONArray();
        while (r3.hasNext()) {
        }
        jSONObject2.put("names_dat", jSONArray322);
        jSONObject2.put("ids_dat", jSONArray2222);
        optJSONObject2 = jSONObject2.optJSONObject("negative_replies_placeholder");
        String a322 = cqm0.a(jSONObject2.optString("next_from"));
        String a2222 = cqm0.a(jSONObject2.optString("prev_from"));
        if (optJSONObject2 == null) {
        }
        jSONObject2.optBoolean("can_like_as_author", false);
        int optInt2222 = jSONObject2.optInt("current_level_count", jSONObject2.optInt("count"));
        HashMap hashMap322 = new HashMap();
        HashMap hashMap2222 = new HashMap();
        ccg.a(jSONObject2, hashMap322, hashMap2222);
        tci.q(jSONObject2);
        SparseArray<BadgeItem> b222 = BadgesParsers.b(jSONObject2);
        if (jSONObject2.has("post_author_id")) {
        }
        postAuthor = null;
        VKList vKList222 = new VKList(jSONObject2, new p9x0(new bcg(postAuthor, hashMap322, hashMap2222, b222, this.v)));
        if (z) {
        }
        optInt = jSONObject2.optInt("real_offset", num3 == null ? num3.intValue() : 0);
        if (optInt < 0) {
        }
        String optString222 = jSONObject2.optString("next_from_toxic");
        vqt.a aVar422 = new vqt.a(EmptyList.b, -1, -1, -1, false, null, null);
        if (this.w) {
        }
        i = optInt;
        i2 = 0;
        return new vqt(vKList222, optInt2222, Math.max(i, i2), a2222, a322, null, null, aVar422, optString222, wallNegativeRepliesPlaceholder, this.L);
    }

    public a(UserId userId, int i, int i2, int i3, boolean z, String str, boolean z2, String str2, boolean z3, boolean z4, int i4) {
        this.s = userId;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = z;
        this.x = str;
        this.y = z2;
        this.z = str2;
        this.A = z3;
        this.B = z4;
        this.C = i4;
    }

    public /* synthetic */ a(UserId userId, int i, int i2, int i3, int i4, boolean z, String str, boolean z2, String str2) {
        this(userId, i, i2, i3, i4, z, str, z2, str2, true, true, 2);
    }

    public a(UserId userId, int i, int i2, int i3, int i4, boolean z, String str, boolean z2, String str2, boolean z3, boolean z4, int i5) {
        this(userId, i, i3, i4, z, str, z2, str2, z3, z4, i5);
        this.D = Integer.valueOf(i2);
    }
}
