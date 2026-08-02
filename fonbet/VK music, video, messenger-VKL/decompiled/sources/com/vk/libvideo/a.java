package com.vk.libvideo;

import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.video.dto.VideoGetByIdsVideoFieldsDto;
import com.vk.api.generated.video.dto.VideoSearchFiltersDto;
import com.vk.api.generated.video.dto.VideoSearchSortDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.impl.di.VideoApiHelperComponentImpl;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ahn;
import xsna.aoq0;
import xsna.bxj0;
import xsna.c5g;
import xsna.dls0;
import xsna.dx7;
import xsna.dz2;
import xsna.e43;
import xsna.f0j0;
import xsna.fkq0;
import xsna.fns0;
import xsna.fuc0;
import xsna.fz2;
import xsna.hyu;
import xsna.i3u;
import xsna.ie40;
import xsna.igj0;
import xsna.jyq0;
import xsna.l340;
import xsna.lgj0;
import xsna.lwp0;
import xsna.ly80;
import xsna.nft0;
import xsna.nh40;
import xsna.o7j0;
import xsna.ogj0;
import xsna.pi40;
import xsna.r1r0;
import xsna.rsg0;
import xsna.sft0;
import xsna.t0r;
import xsna.t6c0;
import xsna.tby;
import xsna.tft0;
import xsna.tfx;
import xsna.tuz;
import xsna.u1r0;
import xsna.u2k0;
import xsna.uft0;
import xsna.vtg0;
import xsna.weq0;
import xsna.wqu;
import xsna.xqu;
import xsna.yfb;
import xsna.yzt;
import xsna.z7w;
import xsna.z8l0;
import xsna.z9g;
import xsna.zqu;

/* compiled from: VideoApiHelperRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class a implements VideoApiHelperRepository {
    public static final ArrayList h = tby.d(UsersFieldsDto.FOLLOWERS_COUNT, GroupsFieldsDto.MEMBERS_COUNT, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, UsersFieldsDto.PHOTO_BASE, GroupsFieldsDto.VIDEO_LIVES_DATA, GroupsFieldsDto.TRUST_MARK);
    public static final List<VideoGetByIdsVideoFieldsDto> i = e43.l(VideoGetByIdsVideoFieldsDto.FILES, VideoGetByIdsVideoFieldsDto.IS_FAVORITE, VideoGetByIdsVideoFieldsDto.SUBTITLES, VideoGetByIdsVideoFieldsDto.TIMELINE_THUMBS, VideoGetByIdsVideoFieldsDto.VOLUME_MULTIPLIER, VideoGetByIdsVideoFieldsDto.EPISODES, VideoGetByIdsVideoFieldsDto.IMAGE);
    public final VideoApiHelperComponentImpl.b a;
    public final VideoApiHelperComponentImpl.c b;
    public final VideoApiHelperComponentImpl.d c;
    public final uft0 d = new uft0();
    public final zqu e = new zqu();
    public final u1r0 f = new u1r0();
    public final ogj0 g = new ogj0();

    /* compiled from: VideoApiHelperRepositoryImpl.kt */
    /* renamed from: com.vk.libvideo.a$a, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class C1190a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoApiHelperRepository.SearchVideosParams.Length.values().length];
            try {
                iArr[VideoApiHelperRepository.SearchVideosParams.Length.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoApiHelperRepository.SearchVideosParams.Length.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoApiHelperRepository.SearchVideosParams.Sort.values().length];
            try {
                iArr2[VideoApiHelperRepository.SearchVideosParams.Sort.DURATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoApiHelperRepository.SearchVideosParams.Sort.RELEVANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoApiHelperRepository.SearchVideosParams.Sort.DATE_ADDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a(VideoApiHelperComponentImpl.b bVar, VideoApiHelperComponentImpl.c cVar, VideoApiHelperComponentImpl.d dVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = dVar;
    }

    @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
    public final q a(int i2, UserId userId, UserId userId2) {
        return rsg0.y0(yfb.x(new uft0().a(i2, userId2, userId)), null, null, 3).U(new vtg0(new o7j0(8), 7));
    }

    @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
    public final q b(int i2, UserId userId, String str) {
        List<dls0> singletonList = Collections.singletonList(new dls0(userId, i2, str));
        ArrayList arrayList = new ArrayList(c5g.u(singletonList, 10));
        for (dls0 dls0Var : singletonList) {
            StringBuilder sb = new StringBuilder();
            sb.append(VideoFile.a.a(dls0Var.c(), dls0Var.b()));
            String a = dls0Var.a();
            if (a != null && a.length() != 0) {
                sb.append(BundleUtil.UNDERLINE_TAG + dls0Var.a());
            }
            arrayList.add(sb.toString());
        }
        dz2 x = yfb.x(tft0.s(this.d, arrayList, i, 12));
        ahn.D(x);
        m1 T = rsg0.T(x);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : singletonList) {
            if (((dls0) obj).b().b < 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(fkq0.a(((dls0) it.next()).b()));
        }
        dz2 x2 = yfb.x(wqu.a.b(this.e, arrayList3, e43.l(GroupsFieldsDto.NAME, GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.MEMBERS_COUNT), null, 4));
        ahn.D(x2);
        p1 p1Var = new p1(rsg0.T(x2), new pi40(new jyq0(3), 16));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : singletonList) {
            if (((dls0) obj2).b().b >= 0) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((dls0) it2.next()).b());
        }
        dz2 x3 = yfb.x(r1r0.a.b(this.f, arrayList5, e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.FOLLOWERS_COUNT), null, null, 58));
        ahn.D(x3);
        return q.J0(T, p1Var, new p1(rsg0.T(x3), new aoq0(new t6c0(12), 1)), new ie40(new t0r(this, 4), 21)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new tuz(new weq0(3), 21));
    }

    @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
    public final q<fns0> c(UserId userId, int i2, UserId userId2, int i3, int i4) {
        UserId userId3;
        if (userId2 != null) {
            UserId userId4 = userId2.b < 0 ? userId2 : null;
            if (userId4 != null) {
                userId3 = fkq0.e(userId4);
                return q.I0(rsg0.y0(yfb.x(new uft0().a(i2, userId, userId2)), null, null, 3), rsg0.y0(yfb.x(new uft0().E(null, userId3, Integer.valueOf(i4), Integer.valueOf(i3), Boolean.TRUE)), null, null, 3), new yzt(new z9g(this), 20));
            }
        }
        userId3 = null;
        return q.I0(rsg0.y0(yfb.x(new uft0().a(i2, userId, userId2)), null, null, 3), rsg0.y0(yfb.x(new uft0().E(null, userId3, Integer.valueOf(i4), Integer.valueOf(i3), Boolean.TRUE)), null, null, 3), new yzt(new z9g(this), 20));
    }

    @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
    public final q<VKList<VideoFile>> d(VideoApiHelperRepository.SearchVideosParams searchVideosParams) {
        List list;
        VideoSearchSortDto videoSearchSortDto;
        ArrayList arrayList;
        VideoApiHelperRepository.SearchVideosParams.Length c = searchVideosParams.c();
        int i2 = c == null ? -1 : C1190a.$EnumSwitchMapping$0[c.ordinal()];
        if (i2 == -1) {
            list = null;
        } else if (i2 == 1) {
            list = Collections.singletonList(VideoSearchFiltersDto.SHORT);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            list = Collections.singletonList(VideoSearchFiltersDto.LONG);
        }
        VideoApiHelperRepository.SearchVideosParams.Sort h2 = searchVideosParams.h();
        int i3 = h2 == null ? -1 : C1190a.$EnumSwitchMapping$1[h2.ordinal()];
        if (i3 == -1) {
            videoSearchSortDto = null;
        } else if (i3 == 1) {
            videoSearchSortDto = VideoSearchSortDto.DURATION;
        } else if (i3 == 2) {
            videoSearchSortDto = VideoSearchSortDto.RELEVANCE;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            videoSearchSortDto = VideoSearchSortDto.DATE_ADDED;
        }
        String e = searchVideosParams.e();
        Integer d = searchVideosParams.d();
        Integer a = searchVideosParams.a();
        Boolean b = searchVideosParams.b();
        Integer valueOf = b != null ? Integer.valueOf(b.booleanValue() ? 1 : 0) : null;
        Boolean f = searchVideosParams.f();
        Boolean valueOf2 = f != null ? Boolean.valueOf(true ^ f.booleanValue()) : null;
        Boolean g = searchVideosParams.g();
        Boolean i4 = searchVideosParams.i();
        tfx tfxVar = new tfx("video.search", new nft0(0), new igj0(8));
        if (e != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, e, 0, 0, 12);
        }
        if (videoSearchSortDto != null) {
            tfx.l(tfxVar, "sort", videoSearchSortDto.i(), 0, 0, 12);
        }
        if (valueOf != null) {
            tfx.l(tfxVar, "hd", valueOf.intValue(), 0, 0, 12);
        }
        if (valueOf2 != null) {
            tfxVar.j("adult", valueOf2.booleanValue());
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoSearchFiltersDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filters", arrayList);
        }
        if (g != null) {
            tfxVar.j("search_own", g.booleanValue());
        }
        if (d != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, d.intValue(), 0, 0, 8);
        }
        if (a != null) {
            tfxVar.f(a.intValue(), 0, 200, "count");
        }
        if (i4 != null) {
            tfxVar.j("extended", i4.booleanValue());
        }
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.y0(x, null, null, 3).L(new l340(new u2k0(this, 17), 19), false);
    }

    @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
    public final x<List<VideoFile>> e(UserId userId, String str) {
        fz2 y = yfb.y(xqu.c(new zqu(), userId, str, 6), new fuc0(this, 23));
        y.c = true;
        return rsg0.D0(y);
    }

    @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
    public final q f(int i2, UserId userId) {
        fz2 y = yfb.y(lgj0.a.d(this.g, Collections.singletonList(VideoFile.a.a(i2, userId)), h, 58), this.b);
        ahn.D(y);
        return rsg0.y0(y, null, null, 3);
    }

    @Override // com.vk.libvideo.repositories.VideoApiHelperRepository
    public final q<VKList<VideoFile>> g(UserId userId, Integer num, Integer num2, Integer num3) {
        dz2 x = yfb.x(sft0.a.b(new uft0(), userId, null, num3, num2, num, Boolean.TRUE, null, 16775982));
        ahn.D(x);
        return rsg0.y0(x, null, null, 3).L(new f0j0(new z8l0(this, 10), 6), false);
    }

    public final q h(int i2, List list) {
        q T;
        t T2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserId q = ((VideoVideoFullDto) it.next()).q();
            if (q != null) {
                arrayList3.add(q);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            UserId userId = (UserId) it2.next();
            if (userId.b < 0) {
                arrayList2.add(fkq0.a(userId));
            } else {
                arrayList.add(userId);
            }
        }
        if (arrayList.isEmpty()) {
            T = q.T(EmptyList.b);
        } else {
            dz2 x = yfb.x(r1r0.a.b(new u1r0(), arrayList, e43.l(UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.PHOTO_100, UsersFieldsDto.PHOTO_50), null, null, 58));
            ahn.D(x);
            T = new p1(rsg0.y0(x, null, null, 3), new bxj0(new lwp0(5)));
        }
        if (arrayList2.isEmpty()) {
            T2 = q.T(EmptyList.b);
        } else {
            dz2 x2 = yfb.x(wqu.a.b(new zqu(), arrayList2, e43.l(GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.PHOTO_100, GroupsFieldsDto.PHOTO_50), null, 4));
            ahn.D(x2);
            T2 = new p1(rsg0.y0(x2, null, null, 3).U(new nh40(new hyu(28), 22)), new ly80(new z7w(26), 9));
        }
        return q.I0(T, T2, new i3u(new dx7(this, list, i2, 4), 18));
    }
}
