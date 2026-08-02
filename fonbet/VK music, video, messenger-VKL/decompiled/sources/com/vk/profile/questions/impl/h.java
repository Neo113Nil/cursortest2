package com.vk.profile.questions.impl;

import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.questions.dto.QuestionsGetExtendedResponseDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a960;
import xsna.asu0;
import xsna.az60;
import xsna.be50;
import xsna.bwt0;
import xsna.c120;
import xsna.c5g;
import xsna.ck70;
import xsna.cq3;
import xsna.crx;
import xsna.d750;
import xsna.e43;
import xsna.edd;
import xsna.epx;
import xsna.f2u;
import xsna.fe60;
import xsna.hg1;
import xsna.hr;
import xsna.hub0;
import xsna.iub0;
import xsna.izs;
import xsna.j03;
import xsna.jr;
import xsna.kqe0;
import xsna.ksb0;
import xsna.lav;
import xsna.mm1;
import xsna.n240;
import xsna.n5e0;
import xsna.nr;
import xsna.o25;
import xsna.oqe0;
import xsna.or;
import xsna.pmu;
import xsna.pqe0;
import xsna.qg60;
import xsna.qm90;
import xsna.qr;
import xsna.r6g0;
import xsna.r7a0;
import xsna.rr;
import xsna.rrl;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s520;
import xsna.s6g0;
import xsna.t520;
import xsna.tfx;
import xsna.uga0;
import xsna.uh40;
import xsna.uqe0;
import xsna.vga0;
import xsna.wd10;
import xsna.wnt;
import xsna.x150;
import xsna.y8g0;
import xsna.yfb;
import xsna.ysi;
import xsna.zjm0;
import xsna.zn;
import xsna.zy60;

/* compiled from: QuestionsListPresenter.kt */
/* loaded from: classes5.dex */
public final class h extends ysi implements kqe0 {
    public final QuestionsListFragment c;
    public final StoryViewerRouter d;
    public final uqe0 e;
    public final s6g0 f;
    public final com.vk.profile.questions.impl.c g;
    public final ArrayList h;
    public int i;
    public final LinkedHashMap j;
    public final List<UsersFieldsDto> k;
    public final List<BaseUserGroupFieldsDto> l;

    /* compiled from: QuestionsListPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: QuestionsListPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: QuestionsListPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: QuestionsListPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: QuestionsListPresenter.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: QuestionsListPresenter.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    /* compiled from: QuestionsListPresenter.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            j03.l(th);
            return s3q0.a;
        }
    }

    public h(QuestionsListFragment questionsListFragment, StoryViewerRouter storyViewerRouter) {
        uqe0 uqe0Var = new uqe0();
        s6g0 s6g0Var = new s6g0();
        this.c = questionsListFragment;
        this.d = storyViewerRouter;
        this.e = uqe0Var;
        this.f = s6g0Var;
        this.g = new com.vk.profile.questions.impl.c();
        this.h = new ArrayList();
        this.j = new LinkedHashMap();
        this.k = e43.l(UsersFieldsDto.FIRST_NAME_GEN, UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.PHOTO_BASE);
        this.l = e43.l(BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, BaseUserGroupFieldsDto.PHOTO_BASE);
    }

    public static UserId j7(com.vk.profile.questions.impl.d dVar) {
        return epx.f(dVar.b().j(), Boolean.TRUE) ? new UserId(-1L) : dVar.b().g();
    }

    @Override // xsna.kqe0
    public final void Dl(com.vk.profile.questions.impl.d dVar) {
        UserId c2 = o25.a().c();
        int id = dVar.b().getId();
        this.e.getClass();
        tfx tfxVar = new tfx("questions.deleteFromAuthor", new or(28), new ck70(6));
        tfx.n(tfxVar, "owner_id", c2, 1L, 0L, 8);
        tfx.l(tfxVar, "question_id", id, 0, 0, 8);
        hg1.e(this.b, hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), this.c.getActivity(), 0L, false, 62).subscribe(new t520(new qm90(6, this, dVar), 15), new lav(new b(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 25)));
    }

    @Override // xsna.kqe0
    public final void Mi(com.vk.profile.questions.impl.d dVar) {
        UserId c2 = o25.a().c();
        int id = dVar.b().getId();
        this.e.getClass();
        tfx tfxVar = new tfx("questions.restore", new zn(27), new n5e0(1));
        tfx.n(tfxVar, "owner_id", c2, 1L, 0L, 8);
        tfx.l(tfxVar, "question_id", id, 0, 0, 8);
        hg1.e(this.b, hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), this.c.getActivity(), 0L, false, 62).subscribe(new d750(new mm1(27, this, dVar), 11), new a960(new f(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 14)));
    }

    @Override // com.vk.lists.c.m
    public final q<QuestionsGetExtendedResponseDto> O9(String str, com.vk.lists.c cVar) {
        ArrayList arrayList;
        UserId c2 = o25.a().c();
        Integer valueOf = Integer.valueOf(cVar.k());
        this.e.getClass();
        tfx tfxVar = new tfx("questions.get", new iub0(1), new uga0(1));
        tfx.n(tfxVar, "owner_id", c2, 1L, 0L, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_LIMIT, valueOf.intValue(), 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        tfxVar.j("extended", true);
        List<UsersFieldsDto> list = this.k;
        if (list != null) {
            List<UsersFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return rsg0.T(yfb.x(tfxVar));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.kqe0
    public final void an(com.vk.profile.questions.impl.d dVar, com.vk.lists.c cVar) {
        UserId c2 = o25.a().c();
        int id = dVar.b().getId();
        this.e.getClass();
        tfx tfxVar = new tfx("questions.restoreFromAuthor", new qr(27), new rr(27));
        tfx.n(tfxVar, "owner_id", c2, 1L, 0L, 8);
        tfx.l(tfxVar, "question_id", id, 0, 0, 8);
        hg1.e(this.b, hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), this.c.getActivity(), 0L, false, 62).subscribe(new pmu(new edd(this, dVar, cVar, 4), 16), new r7a0(new e(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 7)));
    }

    @Override // xsna.kqe0
    public final void e5(zjm0 zjm0Var) {
        Object obj;
        QuestionsQuestionDto b2;
        Iterator it = this.h.iterator();
        while (true) {
            obj = null;
            r2 = null;
            Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            com.vk.profile.questions.impl.d dVar = (com.vk.profile.questions.impl.d) next;
            if (dVar == null) {
                dVar = null;
            }
            if (dVar != null && (b2 = dVar.b()) != null) {
                num = Integer.valueOf(b2.getId());
            }
            if (num.equals(zjm0Var.k.y)) {
                obj = next;
                break;
            }
        }
        com.vk.profile.questions.impl.d dVar2 = (com.vk.profile.questions.impl.d) obj;
        if (dVar2 == null) {
            return;
        }
        l5(dVar2.b().getId());
    }

    @Override // com.vk.lists.c.k
    public final q<QuestionsGetExtendedResponseDto> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // xsna.kqe0
    public final void k4(com.vk.profile.questions.impl.d dVar) {
        UserId c2 = o25.a().c();
        int id = dVar.b().getId();
        this.e.getClass();
        tfx tfxVar = new tfx("questions.delete", new az60(3), new jr(27));
        tfx.n(tfxVar, "owner_id", c2, 1L, 0L, 8);
        tfx.l(tfxVar, "question_id", id, 0, 0, 8);
        hg1.e(this.b, hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), this.c.getActivity(), 0L, false, 62).subscribe(new c120(new cq3(25, this, dVar), 22), new be50(new c(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 10)));
    }

    @Override // xsna.kqe0
    public final void kb(com.vk.profile.questions.impl.d dVar, boolean z) {
        tfx tfxVar;
        int i;
        uqe0 uqe0Var = this.e;
        if (z) {
            UserId c2 = o25.a().c();
            int id = dVar.b().getId();
            uqe0Var.getClass();
            tfxVar = new tfx("questions.authorBan", new hub0(1), new zy60(4));
            tfx.n(tfxVar, "owner_id", c2, 1L, 0L, 8);
            tfx.l(tfxVar, "question_id", id, 0, 0, 8);
        } else {
            UserId c3 = o25.a().c();
            int id2 = dVar.b().getId();
            uqe0Var.getClass();
            tfxVar = new tfx("questions.authorUnBan", new wd10(9), new hr(29));
            tfx.n(tfxVar, "owner_id", c3, 1L, 0L, 8);
            tfx.l(tfxVar, "question_id", id2, 0, 0, 8);
        }
        ArrayList arrayList = this.h;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (epx.f(((com.vk.profile.questions.impl.d) it.next()).b().g(), dVar.b().g()) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        hg1.e(this.b, hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), this.c.getActivity(), 0L, false, 62).subscribe(new n240(new oqe0(this, dVar, z, i > 1), 14), new qg60(new a(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 11)));
    }

    @Override // xsna.kqe0
    public final void l1(com.vk.profile.questions.impl.d dVar) {
        FragmentActivity activity;
        StoriesStoryDto e2 = dVar.b().e();
        if (e2 == null || (activity = this.c.getActivity()) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e2.q().b);
        sb.append('_');
        sb.append(e2.getId());
        StoryViewerRouter.d(this.d, activity, null, sb.toString(), null, LoadContext.Story.b, null, null, null, null, 4074);
    }

    @Override // xsna.kqe0
    public final void l5(int i) {
        ArrayList arrayList;
        UserId c2 = o25.a().c();
        this.e.getClass();
        tfx tfxVar = new tfx("questions.getById", new nr(26), new vga0(2));
        tfx.n(tfxVar, "owner_id", c2, 1L, 0L, 8);
        tfx.l(tfxVar, "question_id", i, 0, 0, 8);
        tfxVar.j("extended", true);
        List<BaseUserGroupFieldsDto> list = this.l;
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        hg1.e(this.b, rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new x150(new rrl(this, i, 2), 10)));
    }

    @Override // xsna.kqe0
    public final void o3(com.vk.profile.questions.impl.d dVar) {
        hg1.e(this.b, hg1.m(rsg0.y0(yfb.x(r6g0.a.a(this.f, null, ReportsAddTypeDto.PROFILE_STORY_QUESTION, null, dVar.a().s1(), Integer.valueOf(dVar.b().getId()), null, 32737)), null, null, 3), this.c.getActivity(), 0L, false, 62).subscribe(new f2u(new uh40(this, 17), 14), new wnt(new g(1, j03.a, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0), 26)));
    }

    public final void u7() {
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.vk.profile.questions.impl.d) it.next()).c());
        }
        int i = this.i;
        QuestionsListFragment questionsListFragment = this.c;
        questionsListFragment.getClass();
        if (arrayList2.isEmpty()) {
            VkTopBar vkTopBar = questionsListFragment.V;
            if (vkTopBar != null) {
                vkTopBar.setMiddle(questionsListFragment.jo(null));
            }
        } else {
            VkTopBar vkTopBar2 = questionsListFragment.V;
            if (vkTopBar2 != null) {
                vkTopBar2.setMiddle(questionsListFragment.jo(y8g0.d(R.plurals.questions_list_amount, i, Integer.valueOf(i))));
            }
        }
        VkButton vkButton = questionsListFragment.W;
        if (vkButton != null) {
            bwt0.p0(vkButton, !arrayList2.isEmpty());
        }
        questionsListFragment.X.setItems(arrayList2);
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<QuestionsGetExtendedResponseDto> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.e(this.b, qVar.U(new fe60(new crx(cVar, z, this), 8)).a0(asu0.a.d()).subscribe(new s520(new pqe0(this, z), 14), new ksb0(new d(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 6)));
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
