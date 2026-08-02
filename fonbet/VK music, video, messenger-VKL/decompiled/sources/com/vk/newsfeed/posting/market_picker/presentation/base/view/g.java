package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveStartTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a53;
import xsna.dhr0;
import xsna.drp;
import xsna.e0o0;
import xsna.fa10;
import xsna.fkq0;
import xsna.ga10;
import xsna.gd60;
import xsna.hd60;
import xsna.m1k;
import xsna.n0o0;
import xsna.o0o0;
import xsna.p010;
import xsna.qhc0;
import xsna.rop;
import xsna.via0;

/* compiled from: MarketPickerCallback.kt */
/* loaded from: classes4.dex */
public final class g implements o0o0 {
    public final /* synthetic */ f a;
    public final /* synthetic */ qhc0 b;

    public g(f fVar, qhc0 qhc0Var) {
        this.a = fVar;
        this.b = qhc0Var;
    }

    @Override // xsna.o0o0
    public final void a(Photo photo, via0 via0Var, double d, double d2) {
        h hVar;
        h hVar2;
        f fVar = this.a;
        LinkedHashMap linkedHashMap = fVar.p;
        if (via0Var instanceof via0.a) {
            via0.a aVar = (via0.a) via0Var;
            List list = (List) linkedHashMap.get(photo);
            if (list != null) {
                list.removeIf(new a53(new rop(aVar, 17), 1));
            }
            List list2 = (List) linkedHashMap.get(photo);
            if (list2 != null) {
                list2.add(new e0o0.a(new via0.a(Tag.a(aVar.a, d, d2), aVar.b, aVar.c, aVar.d)));
            }
            List list3 = (List) linkedHashMap.get(photo);
            if (list3 != null && list3.isEmpty()) {
                linkedHashMap.remove(photo);
            }
            fVar.l();
            e eVar = fVar.t;
            if (eVar == null || (hVar2 = eVar.l) == null) {
                return;
            }
            hVar2.c(photo, fVar.e(photo), f.g(photo));
            return;
        }
        if (!(via0Var instanceof via0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        via0.b bVar = (via0.b) via0Var;
        List list4 = (List) linkedHashMap.get(photo);
        if (list4 != null) {
            list4.removeIf(new drp(new m1k(bVar, 25), 1));
        }
        via0.b bVar2 = new via0.b(Tag.a(bVar.a, d, d2), bVar.b, bVar.c);
        List list5 = (List) linkedHashMap.get(photo);
        if (list5 == null) {
            list5 = new ArrayList();
        }
        list5.add(new e0o0.c(bVar2));
        list5.add(new e0o0.b(bVar2));
        linkedHashMap.put(photo, list5);
        List list6 = (List) linkedHashMap.get(photo);
        if (list6 != null && list6.isEmpty()) {
            linkedHashMap.remove(photo);
        }
        fVar.l();
        e eVar2 = fVar.t;
        if (eVar2 == null || (hVar = eVar2.l) == null) {
            return;
        }
        hVar.c(photo, fVar.e(photo), f.g(photo));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, xsna.ysd0] */
    @Override // xsna.o0o0
    public final void b(Photo photo, float f, float f2) {
        f fVar = this.a;
        ga10 ga10Var = fVar.d;
        if (fVar.e(photo).size() >= 5) {
            fVar.j(fVar.c.getApplicationContext().getString(R.string.market_picker_too_many_tagged_goods));
            return;
        }
        fVar.e.u().k();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        PostingAction$TechStats$Picker$SaveStartTime postingAction$TechStats$Picker$SaveStartTime = new PostingAction$TechStats$Picker$SaveStartTime(MobileOfficialAppsFeedStat$PickerType.MARKET, SystemClock.elapsedRealtime());
        qhc0 qhc0Var = this.b;
        qhc0Var.invoke(postingAction$TechStats$Picker$SaveStartTime);
        UserId userId = (UserId) ga10Var.b;
        NewsfeedRouter newsfeedRouter = (NewsfeedRouter) fVar.g.getValue();
        Context context = (Context) fVar.o.getValue();
        fa10 fa10Var = new fa10(ref$ObjectRef, this, photo, f, f2);
        p010 p010Var = new p010(qhc0Var, 3);
        dhr0.a.getClass();
        int i = dhr0.u().c;
        if (!fkq0.b(userId)) {
            userId = null;
        }
        ref$ObjectRef.element = newsfeedRouter.n(context, fa10Var, p010Var, i, userId, (Integer) ga10Var.d);
    }

    @Override // xsna.o0o0
    public final void c(Photo photo, via0 via0Var) {
        ArrayList arrayList;
        h hVar;
        ArrayList arrayList2;
        if (f.g(photo)) {
            f fVar = this.a;
            LinkedHashMap linkedHashMap = fVar.p;
            PostingAttachmentInfo postingAttachmentInfo = null;
            if (via0Var instanceof via0.b) {
                List list = (List) linkedHashMap.get(photo);
                if (list != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        e0o0 e0o0Var = (e0o0) obj;
                        if ((!(e0o0Var instanceof e0o0.b) && !(e0o0Var instanceof e0o0.c)) || e0o0Var.getTag().getTag().a != ((via0.b) via0Var).a.a) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                linkedHashMap.put(photo, arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList());
                List list2 = (List) linkedHashMap.get(photo);
                if (list2 != null && list2.isEmpty()) {
                    linkedHashMap.remove(photo);
                }
                via0.b bVar = (via0.b) via0Var;
                fVar.b(photo, new e0o0.c(bVar));
                UserId userId = bVar.b;
                Long l = bVar.c;
                Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
                if (userId != null && valueOf != null) {
                    postingAttachmentInfo = f.f(photo, userId, valueOf.intValue());
                }
            } else {
                if (!(via0Var instanceof via0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list3 = (List) linkedHashMap.get(photo);
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        e0o0 e0o0Var2 = (e0o0) obj2;
                        if (!(e0o0Var2 instanceof e0o0.a) || ((e0o0.a) e0o0Var2).a.a.a != ((via0.a) via0Var).a.a) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                linkedHashMap.put(photo, arrayList != null ? new ArrayList(arrayList) : new ArrayList());
                List list4 = (List) linkedHashMap.get(photo);
                if (list4 != null && list4.isEmpty()) {
                    linkedHashMap.remove(photo);
                }
                via0.a aVar = (via0.a) via0Var;
                UserId userId2 = aVar.b;
                int i = (int) aVar.c;
                if (userId2 != null) {
                    postingAttachmentInfo = f.f(photo, userId2, i);
                }
            }
            if (postingAttachmentInfo != null) {
                fVar.e.u().J(postingAttachmentInfo);
            }
            e eVar = fVar.t;
            if (eVar != null && (hVar = eVar.l) != null) {
                hVar.c(photo, fVar.e(photo), f.g(photo));
            }
            fVar.l();
        }
    }

    @Override // xsna.o0o0
    public final void d(via0 via0Var) {
        f fVar = this.a;
        FragmentActivity fragmentActivity = fVar.c;
        if (!(via0Var instanceof via0.b)) {
            if (!(via0Var instanceof via0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((NewsfeedRouter) fVar.g.getValue()).I(fragmentActivity.getApplicationContext(), ((via0.a) via0Var).d);
            return;
        }
        Tag tag = ((via0.b) via0Var).a;
        gd60 a = hd60.a();
        Context applicationContext = fragmentActivity.getApplicationContext();
        n0o0 n0o0Var = tag.f;
        String str = n0o0Var.b;
        String str2 = n0o0Var.f;
        n0o0 n0o0Var2 = tag.f;
        String str3 = n0o0Var2.b;
        String h = tag.c.h();
        n0o0.a aVar = n0o0Var2.e;
        gd60.Q0(a, applicationContext, str, str2, null, new LaunchContext(false, false, false, null, null, null, null, null, str3, h, null, false, false, false, null, null, null, aVar != null ? aVar.e : null, null, false, false, null, null, null, 66583807), 8);
    }
}
