package com.vk.movika.sdk.base.ui;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4243ba;
import com.ironsource.O6;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.channels.impl.list.domain.PinnedChannelsLimitExceededException;
import com.vk.clips.edit.impl.deps.features.ClipEditVkFeatures;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.picture.b;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.editor.spoiler.tool.domain.stat.SpoilerStatEvent;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.movika.sdk.base.ui.l0;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import com.vk.profile.community.members.impl.domain.User;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.stories.d;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionStop$Response;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.adl0;
import xsna.af50;
import xsna.ajm;
import xsna.asm;
import xsna.b1a;
import xsna.bqs;
import xsna.bzb0;
import xsna.c7;
import xsna.cmi0;
import xsna.cwb0;
import xsna.cy0;
import xsna.d2m0;
import xsna.dp0;
import xsna.dz2;
import xsna.e3m;
import xsna.e4y;
import xsna.enj;
import xsna.ezy;
import xsna.f20;
import xsna.f4m;
import xsna.fi9;
import xsna.fkq0;
import xsna.fo20;
import xsna.g1i;
import xsna.g2v;
import xsna.g440;
import xsna.gbh;
import xsna.gzs;
import xsna.hg1;
import xsna.hod0;
import xsna.i6w;
import xsna.i7o0;
import xsna.ig;
import xsna.ikv0;
import xsna.imf;
import xsna.irb;
import xsna.it7;
import xsna.iyo0;
import xsna.izs;
import xsna.j5g;
import xsna.jfk;
import xsna.k150;
import xsna.k2q0;
import xsna.kax0;
import xsna.kbl0;
import xsna.l6w;
import xsna.lse0;
import xsna.m5r0;
import xsna.mj80;
import xsna.msy;
import xsna.mxv;
import xsna.nmo;
import xsna.nwy;
import xsna.o6a0;
import xsna.oey;
import xsna.osp;
import xsna.oub;
import xsna.p7w;
import xsna.pf40;
import xsna.pvd;
import xsna.qbj;
import xsna.qcy;
import xsna.qg3;
import xsna.r1r0;
import xsna.r6c0;
import xsna.rew;
import xsna.rg50;
import xsna.rkz;
import xsna.rsg0;
import xsna.rub0;
import xsna.s3q0;
import xsna.s6c0;
import xsna.sh6;
import xsna.slh0;
import xsna.sw7;
import xsna.sx40;
import xsna.tfx;
import xsna.tlo0;
import xsna.tmh;
import xsna.tq;
import xsna.u3u;
import xsna.u440;
import xsna.u6c0;
import xsna.u8m;
import xsna.uej;
import xsna.uik;
import xsna.ujm0;
import xsna.uvd;
import xsna.vf3;
import xsna.vh9;
import xsna.vmh;
import xsna.w4r0;
import xsna.w6c0;
import xsna.w8m;
import xsna.wqs0;
import xsna.wqu;
import xsna.wul;
import xsna.xg2;
import xsna.xq8;
import xsna.xuy;
import xsna.xvy;
import xsna.yfb;
import xsna.yve;
import xsna.yza;
import xsna.zdw;
import xsna.zk70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [xsna.jx2, xsna.qyn0] */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // xsna.gzs
    public final Object invoke() {
        int s;
        int s2;
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams.BlurType blurType;
        tfx tfxVar;
        ?? r8;
        dz2 x;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        int i = this.b;
        int i2 = 2;
        int i3 = 8;
        int i4 = 7;
        int i5 = 16;
        int i6 = 10;
        int i7 = 5;
        boolean z = false;
        z = false;
        z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                l0.a aVar = (l0.a) obj2;
                y yVar = (y) obj;
                List<com.vk.movika.sdk.base.model.f> list = aVar.i;
                com.vk.movika.sdk.base.observable.d dVar = yVar.d.l;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    dVar.l((com.vk.movika.sdk.base.model.f) it.next());
                }
                List<com.vk.movika.sdk.base.model.f> list2 = aVar.j;
                com.vk.movika.sdk.base.observable.b bVar = yVar.d.p;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    bVar.x((com.vk.movika.sdk.base.model.f) it2.next());
                }
                return s3q0.a;
            case 1:
                ((Ref$ObjectRef) obj2).element = ((gzs) obj).invoke();
                return s3q0.a;
            case 2:
                return "removeListener() - count= " + ((BaseVideoPlayer) obj2).l.b.size() + " listener= " + ((OneVideoPlayer.c) obj);
            case 3:
                rg50 rg50Var = (rg50) obj;
                rg50Var.C(rg50Var.getIntValue() + 1);
                ((izs) obj2).invoke(sx40.b.k.b);
                return s3q0.a;
            case 4:
                Set set = (Set) obj;
                pvd pvdVar = new pvd((imf) ((uvd) obj2).c.getValue());
                if (set.contains(ClipEditVkFeatures.All) || set.contains(ClipEditVkFeatures.VideoAttach)) {
                    return pvdVar;
                }
                return null;
            case 5:
                vmh vmhVar = (vmh) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                tmh tmhVar = vmhVar.a;
                g1i g1iVar = tmhVar.k;
                if (g1iVar != null) {
                    g1iVar.a(extendedCommunityProfile, new cy0(i4, tmhVar, vmhVar.b));
                }
                return s3q0.a;
            case 6:
                uik uikVar = (uik) obj2;
                gzs gzsVar = (gzs) obj;
                uikVar.e(false, false, false, false);
                jfk jfkVar = uikVar.o;
                if (jfkVar != null) {
                    jfkVar.i();
                }
                gzsVar.invoke();
                return s3q0.a;
            case 7:
                osp.a aVar2 = (osp.a) obj2;
                aVar2.getClass();
                f4m.v((int) ((1.0f - osp.g1.a(aVar2.c)) * ((CoordinatorLayout) r13.getRootView().findViewById(R.id.coordinator)).getHeight()), ((View) obj).findViewById(R.id.recycler));
                return s3q0.a;
            case 8:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj2;
                gbh gbhVar = (gbh) obj;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - ref$LongRef.element >= 500) {
                    ref$LongRef.element = elapsedRealtime;
                    gbhVar.invoke();
                }
                return s3q0.a;
            case 9:
                l6w l6wVar = (l6w) obj2;
                final p7w p7wVar = (p7w) obj;
                ?? r0 = p7wVar.o;
                Context context = p7wVar.e;
                qcy<Object>[] qcyVarArr = ImItemListFragment.S;
                if (l6wVar instanceof l6w.b) {
                    l6w.b bVar2 = (l6w.b) l6wVar;
                    p7w.a aVar3 = p7wVar.h;
                    oub oubVar = p7wVar.n;
                    if (bVar2.equals(l6w.b.f.a)) {
                        RecyclerView.o layoutManager = aVar3.a.getLayoutManager();
                        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                        if (linearLayoutManager != null && (s = linearLayoutManager.s()) != -1 && s != 0) {
                            RecyclerView recyclerView = aVar3.a;
                            RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
                            LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                            if (linearLayoutManager2 != null && (s2 = linearLayoutManager2.s()) != -1) {
                                if (s2 < 50) {
                                    linearLayoutManager2.smoothScrollToPosition(recyclerView, null, 0);
                                } else {
                                    linearLayoutManager2.scrollToPosition(50);
                                    linearLayoutManager2.smoothScrollToPosition(recyclerView, null, 0);
                                }
                            }
                        }
                    } else if (bVar2 instanceof l6w.b.d) {
                        ((asm) r0.getValue()).i(((l6w.b.d) bVar2).a);
                    } else if (bVar2 instanceof l6w.b.c) {
                        l6w.b.c cVar = (l6w.b.c) bVar2;
                        List<u8m> list3 = cVar.b;
                        final long j = cVar.a;
                        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        int i8 = w8m.a;
                        ref$ObjectRef.element = new rew(context, w8m.c(new cwb0.z(list3), ((Boolean) p7wVar.f.getValue()).booleanValue()), new izs() { // from class: xsna.o7w
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.izs
                            public final Object invoke(Object obj3) {
                                u8m a = u8m.q.a(((Integer) obj3).intValue());
                                if (a != null) {
                                    p7wVar.d.invoke(new i6w.b(j, a));
                                }
                                dw20 dw20Var = (dw20) Ref$ObjectRef.this.element;
                                if (dw20Var != null) {
                                    dw20Var.dismiss();
                                }
                                return s3q0.a;
                            }
                        }, null).c.b(context, "IM_ACTIONS_CHOOSER_DIALOG_TAG");
                    } else if (bVar2 instanceof l6w.b.j) {
                        bzb0.d(p7wVar.a(), new wul(p7wVar.a().a, R.string.vkim_channels_delete_submit_title, R.string.vkim_vkapp_channels_delete_submit_msg), new i(i5, p7wVar, bVar2), null, null, 28);
                    } else if (bVar2 instanceof l6w.b.m) {
                        l6w.b.m mVar = (l6w.b.m) bVar2;
                        bzb0.d(p7wVar.a(), new ezy(p7wVar.a().a, R.string.vkim_leave_channel_dialog_title, R.string.vkim_leave_channel_dialog_subtitle, R.string.vkim_leave_channel_dialog_close, R.string.vkim_channel_leave), new p(i6, p7wVar, mVar), new xg2(i4, p7wVar, mVar), null, 24);
                    } else if (bVar2 instanceof l6w.b.o) {
                        k2q0.a(context, new dp0(i6, p7wVar, bVar2));
                    } else if (bVar2 instanceof l6w.b.i) {
                        uej.a(context, new qbj(p7wVar, i5), ((l6w.b.i) bVar2).a);
                    } else if (bVar2 instanceof l6w.b.n) {
                        tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_enable_private_message_notifications_snackbar_desc);
                        ikv0.a aVar4 = new ikv0.a(context);
                        aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                        aVar4.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                        aVar4.n();
                    } else if (bVar2 instanceof l6w.b.l) {
                        Throwable th = ((l6w.b.l) bVar2).a;
                        if (th instanceof PinnedChannelsLimitExceededException) {
                            bzb0.d(p7wVar.a(), new cwb0.a1(0, null, 0, enj.f(R.plurals.vkim_pin_im_item_limit_exceded_msg, ((PinnedChannelsLimitExceededException) th).d(), p7wVar.a().a), 0, null, R.string.vkim_close, null, null, null, 951), null, null, null, 30);
                        } else {
                            String b = zk70.b(th);
                            ikv0.a aVar5 = new ikv0.a(context);
                            aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                            aVar5.u = new ikv0.d(b, (String) null, (ikv0.d.a) null, 6);
                            aVar5.n();
                        }
                    } else if (bVar2 instanceof l6w.b.e) {
                        hg1.a(hg1.i(p7wVar.c.b(context), new yve(p7wVar, 28)), p7wVar.a.getViewLifecycleOwner());
                    } else if (bVar2 instanceof l6w.b.k) {
                        l6w.b.k kVar = (l6w.b.k) bVar2;
                        DialogExt dialogExt = kVar.a;
                        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = kVar.b;
                        FragmentActivity activity = oubVar.a.getActivity();
                        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                        if (appCompatActivity != null) {
                            Peer peer = (Peer) oubVar.c.invoke();
                            List<lse0> a = ajm.a(dialogExt, oubVar.b, peer, appCompatActivity);
                            mxv c = g2v.c();
                            zdw zdwVar = i7o0.b;
                            irb irbVar = new irb(appCompatActivity, c, zdwVar != null ? zdwVar : null, dialogExt, peer, a, new c7(oubVar, 13));
                            oubVar.f.b(i0Var.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sh6(new vh9(irbVar, new Ref$ObjectRef(), oubVar), i4)));
                            oubVar.e = irbVar;
                            irbVar.f();
                        }
                    } else if (bVar2 instanceof l6w.b.C3237b) {
                        irb irbVar2 = oubVar.e;
                        if (irbVar2 != null) {
                            irbVar2.a();
                        }
                        oubVar.e = null;
                    } else if (bVar2 instanceof l6w.b.a) {
                        irb irbVar3 = oubVar.e;
                        if (irbVar3 != null) {
                            irbVar3.a();
                        }
                        oubVar.e = null;
                        l6w.b.a aVar6 = (l6w.b.a) bVar2;
                        ((asm) r0.getValue()).f(aVar6.a, aVar6.b);
                    } else {
                        boolean z2 = bVar2 instanceof l6w.b.g;
                        ikv0.c.f fVar = ikv0.c.f.a;
                        if (z2) {
                            m mVar2 = new m(9, p7wVar, bVar2);
                            ikv0.a aVar7 = new ikv0.a(context);
                            aVar7.t = fVar;
                            aVar7.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channel_was_hidden_from_all_folder)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                            aVar7.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.vkim_channels_return_channel_in_all_folder_action), new yza(false ? 1 : 0, mVar2));
                            aVar7.n();
                        } else {
                            if (!(bVar2 instanceof l6w.b.h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ikv0.a aVar8 = new ikv0.a(context);
                            aVar8.t = fVar;
                            aVar8.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channel_was_shown_from_all_folder)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                            aVar8.n();
                        }
                    }
                }
                return s3q0.a;
            case 10:
                ((p7w) obj2).d.invoke(new i6w.t(((l6w.b.m) obj).a));
                return s3q0.a;
            case 11:
                e4y e4yVar = (e4y) obj2;
                String str = (String) obj;
                try {
                    io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) e4yVar.a;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    e4yVar.a = null;
                    com.vk.superapp.base.js.bridge.b.p(e4yVar.b.a, new JsMethod("VKWebAppDeviceMotionStop"), new DeviceMotionStop$Response(null, new DeviceMotionStop$Response.Data(true, str), str, 1, null), null, null, false, null, 60);
                } catch (Throwable th2) {
                    e4yVar.c.g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th2.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str, 1, null));
                }
                return s3q0.a;
            case 12:
                ((izs) obj2).invoke(((User) obj).b);
                return s3q0.a;
            case 13:
                xvy xvyVar = (xvy) obj2;
                k150 k150Var = (k150) obj;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                if (xuyVar != null && !k150Var.i.getValue().booleanValue() && xuyVar.getIndex() >= xvyVar.j().d() - 5) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                mj80 mj80Var = (mj80) obj;
                mj80Var.e.invoke().post(new xq8(i2, mj80Var, new sw7(1, (com.vk.movika.sdk.base.flow.binding.g) obj2)));
                return s3q0.a;
            case 15:
                o6a0 o6a0Var = (o6a0) obj2;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c2 = o6a0Var.c();
                String a2 = o6a0Var.b.a();
                MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent = MobileOfficialAppsCorePhotoEditorStat$SpoilerEvent.SAVE_SPOILER;
                int i9 = o6a0.a.$EnumSwitchMapping$0[((SpoilerStatEvent.b) obj).a.ordinal()];
                if (i9 == 1) {
                    blurType = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.BlurType.ONLY_FOR_DONUTS;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    blurType = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.BlurType.FOR_ALL;
                }
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c2, a2, null, null, null, mobileOfficialAppsCorePhotoEditorStat$SpoilerEvent, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, blurType, 100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147385343, null), 32728, null);
            case 16:
                u6c0 u6c0Var = (u6c0) obj2;
                s6c0 s6c0Var = (s6c0) obj;
                u6c0.a(u6c0Var, 5);
                PostPreviewFragment postPreviewFragment = u6c0Var.a;
                String str2 = u6c0Var.d;
                int i10 = 25;
                r6c0 r6c0Var = new r6c0(new u3u(msy.a(LazyThreadSafetyMode.NONE, new f20(27)), i10), new qg3(4), new it7(u6c0Var.b, i7), new fo20(i6), new oey(i5), new ig(i10));
                Uri parse = str2 != null ? Uri.parse(str2) : null;
                UserId userId = new UserId((parse == null || (queryParameter4 = parse.getQueryParameter("owner_id")) == null) ? 0L : Long.parseLong(queryParameter4));
                dz2 x2 = yfb.x(vf3.a.b(null, null, Integer.valueOf((int) s6c0Var.a), null, null));
                String valueOf = String.valueOf(parse != null ? parse.getQueryParameter("message") : null);
                List singletonList = Collections.singletonList(String.valueOf(parse != null ? parse.getQueryParameter("attachments") : null));
                boolean z3 = s6c0Var.c;
                Boolean valueOf2 = parse != null ? Boolean.valueOf(parse.getBooleanQueryParameter("friends_only", false)) : null;
                Boolean valueOf3 = parse != null ? Boolean.valueOf(parse.getBooleanQueryParameter("signed", false)) : null;
                Integer valueOf4 = (parse == null || (queryParameter3 = parse.getQueryParameter("publish_date")) == null) ? null : Integer.valueOf(Integer.parseInt(queryParameter3));
                Float valueOf5 = (parse == null || (queryParameter2 = parse.getQueryParameter(O6.s)) == null) ? null : Float.valueOf(Float.parseFloat(queryParameter2));
                Integer valueOf6 = (parse == null || (queryParameter = parse.getQueryParameter("place_id")) == null) ? null : Integer.valueOf(Integer.parseInt(queryParameter));
                Integer num = valueOf4;
                tfx tfxVar2 = new tfx("wall.getPostPreview", new iyo0(3), new kax0());
                tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 12);
                if (valueOf2 != null) {
                    tfxVar2.j("friends_only", valueOf2.booleanValue());
                }
                tfxVar2.j("from_group", z3);
                tfx.o(tfxVar2, "message", valueOf, 0, 0, 12);
                if (singletonList != null) {
                    tfxVar2.i("attachments", singletonList);
                }
                if (valueOf3 != null) {
                    tfxVar2.j("signed", valueOf3.booleanValue());
                }
                if (num != null) {
                    tfxVar = tfxVar2;
                    tfx.l(tfxVar, "publish_date", num.intValue(), 0, 0, 8);
                } else {
                    tfxVar = tfxVar2;
                }
                if (valueOf5 != null) {
                    tfxVar.h(O6.s, valueOf5.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
                }
                if (valueOf6 != null) {
                    tfx.l(tfxVar, "place_id", valueOf6.intValue(), 0, 0, 8);
                }
                dz2 x3 = yfb.x(tfxVar);
                boolean d = fkq0.d(userId);
                if (d) {
                    List singletonList2 = Collections.singletonList(userId);
                    if ((54 & 1) != 0) {
                        singletonList2 = null;
                    }
                    r8 = 0;
                    x = yfb.x(r1r0.a.a(singletonList2, null, null, (54 & 8) != 0 ? null : C4243ba.n, null));
                } else {
                    r8 = 0;
                    x = yfb.x(wqu.a.a(null, Collections.singletonList(fkq0.a(new UserId(userId.b))), null));
                }
                postPreviewFragment.a(rsg0.y0(new com.vk.api.request.rx.batch.f(x2, x, x3, new w6c0(d, r6c0Var, userId)), r8, r8, 3).subscribe(new rkz(new b1a(27, u6c0Var, s6c0Var), 17), new bqs(new af50(u6c0Var, 13), 18)));
                return s3q0.a;
            case 17:
                hod0 hod0Var = (hod0) obj2;
                hod0Var.l.invoke((nmo) obj, Integer.valueOf(hod0Var.getBindingAdapterPosition()));
                return s3q0.a;
            case 18:
                return cmi0.b((String) obj2, rub0.b.a, new SerialDescriptor[0], new pf40((slh0) obj, 14));
            case 19:
                ((adl0) obj2).getClass();
                HashMap<UserId, kbl0> hashMap = kbl0.b;
                Preference.H(kbl0.a.b().a, "stickers_favorites_hash_code", (String) obj);
                return s3q0.a;
            case 20:
                CameraVideoEncoderParameters cameraVideoEncoderParameters = (CameraVideoEncoderParameters) obj2;
                com.vk.stories.b bVar3 = com.vk.stories.b.a;
                d2m0 d2m0Var = new d2m0(((g440) u440.this.s).getRequireContext());
                bVar3.getClass();
                d2m0Var.a.setOnCancelListener(new fi9(com.vk.stories.b.a(new d.a.c(cameraVideoEncoderParameters.b), cameraVideoEncoderParameters, d2m0Var)));
                return s3q0.a;
            case 21:
                UxPollsComponentImpl uxPollsComponentImpl = (UxPollsComponentImpl) obj2;
                qcy<Object>[] qcyVarArr2 = UxPollsComponentImpl.i;
                nwy nwyVar = uxPollsComponentImpl.e;
                qcy<Object> qcyVar = UxPollsComponentImpl.i[1];
                return new w4r0((m5r0) nwyVar.c(), ((AuthBridgeComponent) obj).s(), new ujm0(uxPollsComponentImpl, i3));
            case 22:
                ((izs) obj2).invoke(new wqs0.j((BlockId.CompositeId) obj));
                return s3q0.a;
            case 23:
                ((izs) obj2).invoke(((MusicPlayerInformerViewState.a) obj).b);
                return s3q0.a;
            default:
                com.vk.core.view.components.picture.b bVar4 = (com.vk.core.view.components.picture.b) obj2;
                AppCompatTextView appCompatTextView = new AppCompatTextView(bVar4.getContext());
                appCompatTextView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_display_title1_semi_bold, bVar4.getContext()));
                Paint paint = new Paint();
                paint.set(appCompatTextView.getPaint());
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setColor(((b.C0852b) obj).b);
                return paint;
        }
    }
}
