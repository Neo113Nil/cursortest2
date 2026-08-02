package com.vk.newsfeed.common.recycler.holders.attachments;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.tags.Tag;
import com.vk.im.channelcreation.impl.d;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.ui.components.contacts.b;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.profile.questions.impl.d;
import com.vk.profile.questions.impl.i;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.qrcode.QRStatsTracker;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.aos;
import xsna.asu0;
import xsna.b5e0;
import xsna.b810;
import xsna.be7;
import xsna.c8p;
import xsna.cvj0;
import xsna.d1q;
import xsna.dg9;
import xsna.dv1;
import xsna.dw20;
import xsna.dze0;
import xsna.e260;
import xsna.ens;
import xsna.fdj0;
import xsna.fix;
import xsna.fpf0;
import xsna.fw20;
import xsna.gzs;
import xsna.h38;
import xsna.h7m;
import xsna.hg1;
import xsna.iid0;
import xsna.il7;
import xsna.iqe0;
import xsna.iw7;
import xsna.izs;
import xsna.j5g;
import xsna.jbs;
import xsna.kz0;
import xsna.lm50;
import xsna.m5;
import xsna.m8d0;
import xsna.mbf;
import xsna.mns;
import xsna.myc0;
import xsna.nm1;
import xsna.nqd0;
import xsna.o0r0;
import xsna.oa70;
import xsna.oz;
import xsna.p6v;
import xsna.ptk0;
import xsna.qd00;
import xsna.qmq0;
import xsna.qv10;
import xsna.r0e0;
import xsna.rsg0;
import xsna.rxp;
import xsna.s13;
import xsna.s3q0;
import xsna.s7d0;
import xsna.t770;
import xsna.usd0;
import xsna.vj0;
import xsna.wh50;
import xsna.wls;
import xsna.xls;
import xsna.xwk;
import xsna.yfb;
import xsna.ynh;
import xsna.z0q;
import xsna.zq5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x022d, code lost:
    
        if (r3 == null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        int i2 = 3;
        int i3 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                cvj0 cvj0Var = (cvj0) obj2;
                Tag tag = (Tag) obj;
                PhotoAttachment photoAttachment = (PhotoAttachment) cvj0Var.C;
                if (photoAttachment != null) {
                    com.vk.newsfeed.common.recycler.holders.attachments.market.a aVar = (com.vk.newsfeed.common.recycler.holders.attachments.market.a) cvj0Var.K.getValue();
                    b810 b810Var = new b810(cvj0Var, 27);
                    aVar.getClass();
                    Photo photo = photoAttachment.l;
                    List<Tag> list = photo.x;
                    photo.x = j5g.s0(list, tag);
                    photo.r = !r12.isEmpty();
                    b810Var.invoke(photo);
                    m1 y0 = rsg0.y0(yfb.x(aVar.a.a(tag.e, tag.a, photo.e, Tag.ContentType.PHOTO.h(), photo.v)), null, null, 3);
                    int i4 = 19;
                    q<R> L = y0.L(new vj0(new kz0(i4), i4), false);
                    m5 m5Var = new m5(new il7(5, photo, list), 22);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    hg1.b(cvj0Var.itemView, L.E(m5Var, lVar, kVar, kVar).F(new oz(new nm1(12, photo, list), 15)).G(new be7(photo, b810Var, photoAttachment, i3)).subscribe());
                }
                break;
            case 1:
                dv1 dv1Var = (dv1) obj2;
                dv1Var.d.a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, null, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131038, null), (String) obj, 1, null));
                s13 s13Var = dv1Var.b;
                if (s13Var != null) {
                    s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GROUP_MESSAGES, MiniAppSettingsBoxAction.DENY);
                }
                break;
            case 2:
                ((izs) obj2).invoke((AuthorHeaderEvent) obj);
                break;
            case 3:
                break;
            case 4:
                ((ptk0) obj2).a((lm50) obj);
                break;
            case 5:
                ((izs) obj2).invoke(((iw7.a) ((wh50) obj).getValue()).c);
                break;
            case 6:
                h38 h38Var = (h38) obj2;
                h38Var.a((BotKeyboard) obj);
                RecyclerView recyclerView = h38Var.g;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                ViewPropertyAnimator animate = recyclerView.animate();
                animate.cancel();
                animate.setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(16L).setDuration(150L).scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setListener(null).start();
                break;
            case 7:
                ((dg9) obj2).a.d2((ClipGridParams.Data) obj);
                break;
            case 8:
                ((d) obj2).b.k().y((jbs) obj, 1);
                break;
            case 9:
                break;
            case 10:
                ynh ynhVar = (ynh) obj;
                UserProfileParamsComponent userProfileParamsComponent = (UserProfileParamsComponent) ((h7m) obj2).b(fpf0.a(UserProfileParamsComponent.class), (qmq0) ynhVar.N.getValue());
                r0e0 aa = userProfileParamsComponent.aa();
                Bundle arguments = ynhVar.a.getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable("id", UserId.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = arguments.getParcelable("id");
                        parcelable = (UserId) (parcelable3 instanceof UserId ? parcelable3 : null);
                    }
                    userId = (UserId) parcelable;
                    break;
                }
                userId = UserId.d;
                aa.b(userId);
                break;
            case 11:
                List list2 = (List) obj2;
                b bVar = (b) obj;
                if (!list2.isEmpty()) {
                    bVar.r = new ArrayList(j5g.S0(j5g.u0((Iterable) bVar.r, list2)));
                    io.reactivex.rxjava3.subjects.d<s3q0> dVar = bVar.q;
                    s3q0 s3q0Var = s3q0.a;
                    dVar.onNext(s3q0Var);
                    bVar.o.onNext(bVar.i(bVar.d()));
                    break;
                } else {
                    break;
                }
            case 12:
                ((izs) obj2).invoke(new mbf.c.x.b(null));
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 13:
                c8p c8pVar = (c8p) obj;
                c8p.b bVar2 = c8p.n1;
                dw20 dw20Var2 = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                c8pVar.getFeature().C(a.C1768a.b);
                break;
            case 14:
                rxp rxpVar = (rxp) obj;
                Iterator<z0q> it = ((d1q) obj2).b.iterator();
                while (it.hasNext()) {
                    it.next().b(rxpVar);
                }
                break;
            case 15:
                ((com.vk.core.fragments.b) obj2).e.c.Qb((ArrayList) obj);
                break;
            case 16:
                xls xlsVar = (xls) obj2;
                String str = xlsVar.b.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_MODAL, null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                ((wls) obj).l.f(xlsVar.b);
                break;
            case 17:
                ((mns) obj2).m.a(new aos(((ens) obj).b));
                break;
            case 18:
                Context context = (Context) obj;
                String str2 = (String) j5g.a0(((p6v.b) obj2).m);
                if (str2 != null) {
                    break;
                }
                break;
            case 19:
                fdj0 fdj0Var = (fdj0) obj2;
                fw20 fw20Var = (fw20) obj;
                if (fdj0Var.b.c.invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                    myc0.h(fw20Var.b, null, null, new fix(fdj0Var, null), 3);
                }
                break;
            case 20:
                break;
            case 21:
                asu0.a.getClass();
                asu0.x().execute(new zq5(i2, (e260) obj2, (qv10) obj));
                break;
            case 22:
                izs izsVar = (izs) obj2;
                izsVar.invoke(oa70.a.b);
                izsVar.invoke(((t770) obj).e);
                break;
            case 23:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).C(new a.s.g((Photo) obj));
                break;
            case 24:
                ((m8d0) obj2).g().invoke(s7d0.e.a);
                ((qd00) obj).invoke();
                break;
            case 25:
                ((izs) obj2).invoke(new nqd0.a(((usd0) obj).c));
                break;
            case 26:
                ((gzs) obj2).invoke();
                ((b5e0) obj).h.b(null);
                break;
            case 27:
                xwk.e().m((Activity) obj2, ((Article) obj).h.b, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK_FROM_AVATAR);
                break;
            case 28:
                ((izs) obj2).invoke(Integer.valueOf(((dze0) obj).b));
                break;
            default:
                d.a aVar2 = (d.a) obj;
                ((i) obj2).l.f(aVar2);
                iqe0.a(aVar2, SchemeStat$TypeQuestionItem.Type.CANCEL_DELETE);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a(dg9 dg9Var, ClipGridParams.Data data, ClipCameraParams clipCameraParams) {
        this.b = 7;
        this.c = dg9Var;
        this.d = data;
    }
}
