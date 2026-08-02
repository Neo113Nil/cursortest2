package com.vk.newsfeed.impl.posting;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.ImageCropData;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.internal.api.GsonHolder;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.api.posting.dto.PostingPrimaryMode;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.s;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.aac0;
import xsna.ap80;
import xsna.bax0;
import xsna.bpn0;
import xsna.c230;
import xsna.c5g;
import xsna.d230;
import xsna.dgc0;
import xsna.do3;
import xsna.ea3;
import xsna.edd;
import xsna.epx;
import xsna.fbc0;
import xsna.fkq0;
import xsna.fl40;
import xsna.flc0;
import xsna.hd60;
import xsna.hfr;
import xsna.i5g;
import xsna.j5g;
import xsna.kfk;
import xsna.m6r0;
import xsna.msy;
import xsna.nl30;
import xsna.o25;
import xsna.ptt;
import xsna.qj4;
import xsna.quz;
import xsna.rl3;
import xsna.rli0;
import xsna.rsg0;
import xsna.t11;
import xsna.u9c0;
import xsna.zo80;

/* compiled from: PostingInteractor.kt */
/* loaded from: classes4.dex */
public final class a {
    public static a e;
    public final bpn0 a = new bpn0(new zo80(1));
    public final Object b;
    public final Object c;
    public Boolean d;

    /* compiled from: PostingInteractor.kt */
    /* renamed from: com.vk.newsfeed.impl.posting.a$a, reason: collision with other inner class name */
    public static final class C1384a {
        public static a a() {
            if (a.e == null) {
                a.e = new a();
            }
            return a.e;
        }
    }

    /* compiled from: PostingInteractor.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a() {
        ap80 ap80Var = new ap80(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, ap80Var);
        this.c = msy.a(lazyThreadSafetyMode, new dgc0(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bax0 a(flc0 flc0Var, Post post, List list) {
        List list2;
        String str;
        boolean z;
        boolean z2;
        Integer num;
        Double d;
        Double d2;
        Integer num2;
        String str2;
        String str3;
        boolean z3;
        int i;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        boolean z4 = post != null;
        UserId userId = flc0Var.o;
        kfk kfkVar = flc0Var.C;
        boolean z5 = flc0Var.g;
        GeoAttachment geoAttachment = flc0Var.j;
        if (userId != null) {
            if (!fkq0.c(userId)) {
                userId = null;
            }
        }
        userId = flc0Var.a();
        UserId userId2 = userId;
        if (z4) {
            Iterable iterable = (Iterable) b(flc0Var).j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(((Attachment) obj) instanceof GeoAttachment)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Attachment) it.next()).toString());
            }
            list2 = arrayList2;
        } else {
            list2 = list;
        }
        UiTrackingScreen b2 = UiTracker.j.b();
        String a = (b2 == null || (mobileOfficialAppsCoreNavStat$EventScreen = b2.a) == null) ? null : t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
        if (epx.f(a, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE))) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Posting entryPoint screen is not set for UiTracker"));
            str = null;
        } else {
            str = a;
        }
        String g0 = j5g.g0(rl3.I(new String[]{flc0Var.e ? "facebook" : null, flc0Var.f ? "twitter" : null}), StringUtils.COMMA, null, null, 0, null, 62);
        String str4 = g0.length() > 0 ? g0 : null;
        NewsEntry newsEntry = flc0Var.p;
        Post post2 = newsEntry instanceof Post ? (Post) newsEntry : null;
        Integer valueOf = (post2 == null || (i = post2.n) <= 0 || !flc0Var.q || o25.a().a(post2.o.b)) ? null : Integer.valueOf(i);
        PostingOrd postingOrd = flc0Var.B;
        aac0 aac0Var = flc0Var.n;
        String str5 = flc0Var.a;
        Boolean valueOf2 = z5 ? Boolean.valueOf(z5) : null;
        Boolean valueOf3 = z5 ? Boolean.valueOf(flc0Var.h) : null;
        boolean z6 = flc0Var.y;
        boolean z7 = flc0Var.d;
        boolean z8 = flc0Var.v;
        boolean z9 = flc0Var.l;
        boolean z10 = flc0Var.m;
        Date date = flc0Var.i;
        if (date != null) {
            z = z10;
            z2 = z9;
            num = Integer.valueOf((int) (date.getTime() / 1000));
        } else {
            z = z10;
            z2 = z9;
            num = null;
        }
        if (geoAttachment != null) {
            GeoAttachment geoAttachment2 = geoAttachment.k <= 0 ? geoAttachment : null;
            if (geoAttachment2 != null) {
                d = Double.valueOf(geoAttachment2.f);
                if (geoAttachment != null) {
                    GeoAttachment geoAttachment3 = geoAttachment.k <= 0 ? geoAttachment : null;
                    if (geoAttachment3 != null) {
                        d2 = Double.valueOf(geoAttachment3.g);
                        if (geoAttachment != null) {
                            if (geoAttachment.k <= 0) {
                                geoAttachment = null;
                            }
                            if (geoAttachment != null) {
                                num2 = Integer.valueOf(geoAttachment.k);
                                String str6 = flc0Var.t;
                                Integer num3 = flc0Var.u;
                                PostingPrimaryMode postingPrimaryMode = flc0Var.x;
                                Integer num4 = num;
                                if (kfkVar == null) {
                                    List<ImageCropData> list3 = kfkVar.a;
                                    str2 = str6;
                                    if (list3 != null) {
                                        str3 = GsonHolder.a().toJson(list3);
                                        String str7 = kfkVar != null ? kfkVar.b : null;
                                        String str8 = flc0Var.z;
                                        String str9 = flc0Var.A;
                                        z3 = flc0Var.w;
                                        String str10 = flc0Var.s;
                                        if (z3) {
                                            if (epx.f(str10, "newsfeed")) {
                                                str10 = "newsfeed_from_plus";
                                            } else if (epx.f(str10, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                                                str10 = "profile_from_plus";
                                            }
                                        }
                                        String str11 = str10;
                                        int i2 = flc0Var.k;
                                        return new bax0(userId2, str5, list2, valueOf2, valueOf3, z6, z7, z8, z2, z, false, false, num4, d, d2, num2, str2, num3, str3, str7, postingPrimaryMode, null, str8, null, null, str9, null, str, str11, null, postingOrd != null ? postingOrd.c : null, postingOrd != null ? postingOrd.d : null, null, i2 >= 0 ? Integer.valueOf(i2) : null, post != null ? Integer.valueOf(post.n) : null, flc0Var.h, null, flc0Var.e, flc0Var.f, false, null, valueOf, postingOrd != null ? Boolean.valueOf(postingOrd.b) : null, null, null, null, str4, null, aac0Var != null ? aac0Var.a : null, aac0Var != null ? aac0Var.c : null, aac0Var != null ? aac0Var.f : null, 631244800, 47505);
                                    }
                                } else {
                                    str2 = str6;
                                }
                                str3 = null;
                                if (kfkVar != null) {
                                }
                                String str82 = flc0Var.z;
                                String str92 = flc0Var.A;
                                z3 = flc0Var.w;
                                String str102 = flc0Var.s;
                                if (z3) {
                                }
                                String str112 = str102;
                                int i22 = flc0Var.k;
                                if (i22 >= 0) {
                                }
                                return new bax0(userId2, str5, list2, valueOf2, valueOf3, z6, z7, z8, z2, z, false, false, num4, d, d2, num2, str2, num3, str3, str7, postingPrimaryMode, null, str82, null, null, str92, null, str, str112, null, postingOrd != null ? postingOrd.c : null, postingOrd != null ? postingOrd.d : null, null, i22 >= 0 ? Integer.valueOf(i22) : null, post != null ? Integer.valueOf(post.n) : null, flc0Var.h, null, flc0Var.e, flc0Var.f, false, null, valueOf, postingOrd != null ? Boolean.valueOf(postingOrd.b) : null, null, null, null, str4, null, aac0Var != null ? aac0Var.a : null, aac0Var != null ? aac0Var.c : null, aac0Var != null ? aac0Var.f : null, 631244800, 47505);
                            }
                        }
                        num2 = null;
                        String str62 = flc0Var.t;
                        Integer num32 = flc0Var.u;
                        PostingPrimaryMode postingPrimaryMode2 = flc0Var.x;
                        Integer num42 = num;
                        if (kfkVar == null) {
                        }
                        str3 = null;
                        if (kfkVar != null) {
                        }
                        String str822 = flc0Var.z;
                        String str922 = flc0Var.A;
                        z3 = flc0Var.w;
                        String str1022 = flc0Var.s;
                        if (z3) {
                        }
                        String str1122 = str1022;
                        int i222 = flc0Var.k;
                        if (i222 >= 0) {
                        }
                        return new bax0(userId2, str5, list2, valueOf2, valueOf3, z6, z7, z8, z2, z, false, false, num42, d, d2, num2, str2, num32, str3, str7, postingPrimaryMode2, null, str822, null, null, str922, null, str, str1122, null, postingOrd != null ? postingOrd.c : null, postingOrd != null ? postingOrd.d : null, null, i222 >= 0 ? Integer.valueOf(i222) : null, post != null ? Integer.valueOf(post.n) : null, flc0Var.h, null, flc0Var.e, flc0Var.f, false, null, valueOf, postingOrd != null ? Boolean.valueOf(postingOrd.b) : null, null, null, null, str4, null, aac0Var != null ? aac0Var.a : null, aac0Var != null ? aac0Var.c : null, aac0Var != null ? aac0Var.f : null, 631244800, 47505);
                    }
                }
                d2 = null;
                if (geoAttachment != null) {
                }
                num2 = null;
                String str622 = flc0Var.t;
                Integer num322 = flc0Var.u;
                PostingPrimaryMode postingPrimaryMode22 = flc0Var.x;
                Integer num422 = num;
                if (kfkVar == null) {
                }
                str3 = null;
                if (kfkVar != null) {
                }
                String str8222 = flc0Var.z;
                String str9222 = flc0Var.A;
                z3 = flc0Var.w;
                String str10222 = flc0Var.s;
                if (z3) {
                }
                String str11222 = str10222;
                int i2222 = flc0Var.k;
                if (i2222 >= 0) {
                }
                return new bax0(userId2, str5, list2, valueOf2, valueOf3, z6, z7, z8, z2, z, false, false, num422, d, d2, num2, str2, num322, str3, str7, postingPrimaryMode22, null, str8222, null, null, str9222, null, str, str11222, null, postingOrd != null ? postingOrd.c : null, postingOrd != null ? postingOrd.d : null, null, i2222 >= 0 ? Integer.valueOf(i2222) : null, post != null ? Integer.valueOf(post.n) : null, flc0Var.h, null, flc0Var.e, flc0Var.f, false, null, valueOf, postingOrd != null ? Boolean.valueOf(postingOrd.b) : null, null, null, null, str4, null, aac0Var != null ? aac0Var.a : null, aac0Var != null ? aac0Var.c : null, aac0Var != null ? aac0Var.f : null, 631244800, 47505);
            }
        }
        d = null;
        if (geoAttachment != null) {
        }
        d2 = null;
        if (geoAttachment != null) {
        }
        num2 = null;
        String str6222 = flc0Var.t;
        Integer num3222 = flc0Var.u;
        PostingPrimaryMode postingPrimaryMode222 = flc0Var.x;
        Integer num4222 = num;
        if (kfkVar == null) {
        }
        str3 = null;
        if (kfkVar != null) {
        }
        String str82222 = flc0Var.z;
        String str92222 = flc0Var.A;
        z3 = flc0Var.w;
        String str102222 = flc0Var.s;
        if (z3) {
        }
        String str112222 = str102222;
        int i22222 = flc0Var.k;
        if (i22222 >= 0) {
        }
        return new bax0(userId2, str5, list2, valueOf2, valueOf3, z6, z7, z8, z2, z, false, false, num4222, d, d2, num2, str2, num3222, str3, str7, postingPrimaryMode222, null, str82222, null, null, str92222, null, str, str112222, null, postingOrd != null ? postingOrd.c : null, postingOrd != null ? postingOrd.d : null, null, i22222 >= 0 ? Integer.valueOf(i22222) : null, post != null ? Integer.valueOf(post.n) : null, flc0Var.h, null, flc0Var.e, flc0Var.f, false, null, valueOf, postingOrd != null ? Boolean.valueOf(postingOrd.b) : null, null, null, null, str4, null, aac0Var != null ? aac0Var.a : null, aac0Var != null ? aac0Var.c : null, aac0Var != null ? aac0Var.f : null, 631244800, 47505);
    }

    public static Pair b(flc0 flc0Var) {
        List<Owner> list;
        Target target = flc0Var.c;
        boolean z = flc0Var.g;
        Group group = flc0Var.r;
        NewsEntry newsEntry = flc0Var.p;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        Owner owner = post != null ? post.o : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (target != null && !target.k) {
            UserId e2 = fkq0.e(target.c);
            linkedHashMap.put(e2, group != null ? new Owner(e2, group.d, group.f, group.e, group.y, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194272, null) : new Owner(e2, target.d, target.f, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null));
        }
        if (owner != null) {
            linkedHashMap.put(owner.b, owner);
        }
        Collection values = linkedHashMap.values();
        boolean z2 = false;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (fkq0.d(((Owner) it.next()).b)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (!z || !z2) {
            m6r0 a = hd60.a().a();
            Owner owner2 = new Owner(a.y(), a.r(), null, a.u(), a.z(), null, null, null, null, null, a.w(), null, null, false, false, false, false, null, 0, null, null, false, 4193248, null);
            linkedHashMap.put(owner2.b, owner2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        List<? extends Attachment> list2 = flc0Var.b;
        int i = com.vkontakte.android.attachments.a.a;
        Collections.sort(list2);
        hfr.a aVar = new hfr.a(rli0.j(new i5g(list2), new quz(16)));
        while (aVar.hasNext()) {
            Attachment attachment = (Attachment) aVar.next();
            Owner s = ((AttachmentWithMedia) attachment).s();
            if (s != null) {
            }
            if ((attachment instanceof EventAttachment) && (list = ((EventAttachment) attachment).m) != null) {
                for (Owner owner3 : list) {
                    linkedHashMap2.put(owner3.b, owner3);
                }
            }
        }
        return new Pair(linkedHashMap2, list2);
    }

    public static j1 c(a aVar, UserId userId, List list, int i) {
        if ((i & 1) != 0) {
            userId = null;
        }
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        boolean z3 = (i & 16) == 0;
        if ((i & 32) != 0) {
            list = EmptyList.b;
        }
        List list2 = list;
        aVar.getClass();
        if (userId == null) {
            userId = t11.b();
        }
        return rsg0.y0(new ptt(userId, z, z2, !list2.isEmpty(), z3, list2), null, null, 3).U(new qj4(new c230(aVar, 17), 29));
    }

    public static q e(flc0 flc0Var) {
        Integer num;
        aac0 aac0Var = flc0Var.n;
        String str = aac0Var != null ? aac0Var.b : null;
        if (aac0Var == null || (num = aac0Var.a) == null || num.intValue() != -2 || str == null) {
            return q.T(flc0Var);
        }
        f fVar = new f();
        com.vk.upload.impl.a.h(new s(str, aac0Var.c, aac0Var.d, null), new ea3(fVar, flc0Var, aac0Var, 7));
        return fVar;
    }

    public final q d(ArrayList arrayList, flc0 flc0Var) {
        aac0 aac0Var = flc0Var.n;
        Integer num = aac0Var != null ? aac0Var.a : null;
        if (aac0Var == null || num == null) {
            return q.T(arrayList);
        }
        UserId a = flc0Var.a();
        fbc0 fbc0Var = new fbc0("wall.getPosterFallbackUploadLink");
        fbc0Var.F(a, "owner_id");
        q<R> L = rsg0.y0(fbc0Var, null, null, 3).L(new u9c0(new edd(flc0Var, aac0Var, num, 3), 1), false);
        fl40 fl40Var = new fl40(new d230(this), 4);
        L.getClass();
        return new p1(L, fl40Var).U(new do3(new nl30(arrayList, 16), 28));
    }

    public final void f(Boolean bool) {
        if (epx.f(this.d, bool)) {
            return;
        }
        this.d = bool;
        Preference.l().edit().putBoolean((String) this.a.getValue(), bool.booleanValue()).apply();
    }
}
