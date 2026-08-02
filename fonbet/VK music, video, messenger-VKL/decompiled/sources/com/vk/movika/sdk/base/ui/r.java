package com.vk.movika.sdk.base.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.ui.api.ClipUploadScreenRuntimeConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.dynamic_loader.b;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.search.ModernSearchView;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.ui.y;
import com.vk.newsfeed.impl.fragments.PostPreviewFragment;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.OneVideoPlayer;
import org.json.JSONObject;
import xsna.b0y;
import xsna.c5g;
import xsna.d220;
import xsna.dwk0;
import xsna.e370;
import xsna.ei50;
import xsna.el30;
import xsna.epx;
import xsna.eqo;
import xsna.etv0;
import xsna.gik;
import xsna.gvw0;
import xsna.gzs;
import xsna.hqo;
import xsna.izs;
import xsna.jfk;
import xsna.jqp;
import xsna.jtm;
import xsna.kb50;
import xsna.kfd;
import xsna.m4m;
import xsna.m6p0;
import xsna.mj80;
import xsna.ndk0;
import xsna.nhp0;
import xsna.nxz;
import xsna.odk0;
import xsna.p63;
import xsna.prz;
import xsna.q4i;
import xsna.qgp0;
import xsna.rs0;
import xsna.s3q0;
import xsna.s6c0;
import xsna.sf2;
import xsna.sk3;
import xsna.t44;
import xsna.tnt;
import xsna.u6c0;
import xsna.u7r;
import xsna.uab0;
import xsna.ubb0;
import xsna.uik;
import xsna.uqn0;
import xsna.uxz;
import xsna.vdx0;
import xsna.vtk0;
import xsna.wqs0;
import xsna.x990;
import xsna.xq8;
import xsna.y7f;
import xsna.yu20;
import xsna.yvj;
import xsna.ztm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v30, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.subjects.d<b.AbstractC0762b> remove;
        PostingUserMessage postingUserMessage;
        yvj initialize$lambda$220$lambda$8;
        StoriesContainer storiesContainer;
        StoryOwner storyOwner;
        StoriesContainer storiesContainer2;
        StoryOwner storyOwner2;
        int i = this.b;
        int i2 = 10;
        b.a aVar = null;
        r5 = null;
        r5 = null;
        String str = null;
        Object obj = this.d;
        ?? r7 = this.c;
        switch (i) {
            case 0:
                y yVar = (y) r7;
                v0 v0Var = (v0) obj;
                y.d dVar = yVar.p;
                if (dVar.d != null) {
                    yVar.p = y.d.a(dVar, null, false, null, null, 47);
                }
                if (epx.f(yVar.p.e, Boolean.TRUE)) {
                    yVar.p = y.d.a(yVar.p, null, false, null, null, 31);
                    mj80 mj80Var = v0Var.d.c;
                    mj80Var.e.invoke().post(new xq8(2, mj80Var, new prz(mj80Var, 10, 2)));
                }
                return s3q0.a;
            case 1:
                uxz uxzVar = (uxz) obj;
                nxz.d dVar2 = ((p63) r7).d;
                if (dVar2 != null) {
                    dVar2.h(uxzVar.b);
                }
                return s3q0.a;
            case 2:
                ((izs) r7).invoke(new t44.c.b(((kfd) obj).a, !r6.d));
                return s3q0.a;
            case 3:
                ((izs) r7).invoke((yu20) obj);
                return s3q0.a;
            case 4:
                y7f y7fVar = (y7f) r7;
                ((ClipsUploadUiVkComponent) y7fVar.b.c.getValue()).f().a(y7fVar.a.B(), 1543, new ClipsUploadUiVkNavigator.ClipUploadDataFull((ClipUploadData) obj, true, new ClipUploadScreenRuntimeConfig(false, false, false, 4, null)));
                return s3q0.a;
            case 5:
                ((q4i) r7).dismiss();
                ((q4i.a) obj).d.invoke();
                return s3q0.a;
            case 6:
                uik uikVar = (uik) obj;
                ((tnt) r7).c = !r7.c;
                sf2 sf2Var = uikVar.j;
                if (sf2Var != null) {
                    ((gik) sf2Var.b).L(true);
                }
                jfk jfkVar = uikVar.o;
                if (jfkVar != null) {
                    jfkVar.i();
                }
                uikVar.n = false;
                return s3q0.a;
            case 7:
                ztm ztmVar = (ztm) r7;
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                if (!ztmVar.b()) {
                    ztmVar.a();
                } else if (((x990) e0Var).l) {
                    ((jtm) ztmVar.c.invoke()).e();
                }
                return s3q0.a;
            case 8:
                eqo eqoVar = (eqo) r7;
                hqo hqoVar = (hqo) obj;
                DynamicTask dynamicTask = eqoVar.b;
                if (BuildInfo.o()) {
                    sk3<b.a> sk3Var = com.vk.core.dynamic_loader.b.k;
                    ReentrantLock reentrantLock = com.vk.core.dynamic_loader.b.l;
                    reentrantLock.lock();
                    try {
                        Iterator<b.a> it = sk3Var.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b.a next = it.next();
                                if (next.a == dynamicTask) {
                                    aVar = next;
                                }
                            }
                        }
                        b.a aVar2 = aVar;
                        if (aVar2 == null) {
                            reentrantLock.unlock();
                        } else {
                            sk3Var.remove(aVar2);
                            aVar2.b.onError(new DynamicException.Cancellation("Cancel loading dynamic library - " + dynamicTask.name()));
                            s3q0 s3q0Var = s3q0.a;
                            reentrantLock.unlock();
                        }
                        Integer num = com.vk.core.dynamic_loader.b.g.get(dynamicTask);
                        if (num != null) {
                            com.vk.core.dynamic_loader.b.e().b(num.intValue());
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    Integer remove2 = com.vk.core.dynamic_loader.a.b.remove(dynamicTask);
                    if (remove2 != null && (remove = com.vk.core.dynamic_loader.a.c.remove(remove2)) != null) {
                        uqn0 remove3 = com.vk.core.dynamic_loader.a.d.remove(dynamicTask);
                        if (remove3 != null) {
                            remove3.c();
                        }
                        remove.onError(new DynamicException.Cancellation("Cancel loading dynamic library - " + dynamicTask.name()));
                    }
                }
                eqo.a<UseCase> aVar3 = eqoVar.g;
                if (aVar3 != 0) {
                    aVar3.c(hqoVar);
                }
                return s3q0.a;
            case 9:
                gzs gzsVar = (gzs) r7;
                jqp jqpVar = (jqp) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                jqpVar.m(null);
                return s3q0.a;
            case 10:
                return "Appending data into " + ((u7r) r7).a + " failed: " + ((Exception) obj).getMessage();
            case 11:
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                Iterator<OneVideoPlayer.c> it2 = ((one.video.player.j) r7).b.iterator();
                while (it2.hasNext()) {
                    it2.next().r(oneVideoPlayer);
                }
                return s3q0.a;
            case 12:
                ubb0 ubb0Var = (ubb0) r7;
                UserId userId = (UserId) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b});
                }
                List<uab0> l2 = ubb0Var.c.l(String.valueOf(userId.b));
                ArrayList arrayList = new ArrayList(c5g.u(l2, 10));
                for (uab0 uab0Var : l2) {
                    Playlist playlist = new Playlist(new JSONObject(uab0Var.e));
                    playlist.H = uab0Var.d;
                    arrayList.add(playlist);
                }
                return arrayList;
            case 13:
                u6c0 u6c0Var = (u6c0) r7;
                s6c0 s6c0Var = (s6c0) obj;
                PostPreviewFragment postPreviewFragment = u6c0Var.a;
                vdx0 vdx0Var = e370.e;
                postPreviewFragment.a((vdx0Var != null ? vdx0Var : null).d().B(s6c0Var.a, String.valueOf(s6c0Var.d)).subscribe(new m4m(new d220(i2), 1), new b0y(new el30(u6c0Var, 18), 17)));
                return s3q0.a;
            case 14:
                izs izsVar = (izs) r7;
                ActionsAvailabilityState.Availability availability = (ActionsAvailabilityState.Availability) obj;
                PostingAction.Navigation.OpenInCurrentStep openInCurrentStep = new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PrivacySettingsBottomSheet.b);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(openInCurrentStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, openInCurrentStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                s3q0 s3q0Var2 = s3q0.a;
                return s3q0.a;
            case 15:
                ((izs) r7).invoke(((com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b) obj).d);
                return s3q0.a;
            case 16:
                initialize$lambda$220$lambda$8 = ServiceProvider.initialize$lambda$220$lambda$8((UnityAdsModule) r7, (ServicesRegistry) obj);
                return initialize$lambda$220$lambda$8;
            case 17:
                odk0 odk0Var = (odk0) obj;
                if (vtk0.d().b(((ModernSearchView) r7).getContext())) {
                    vtk0.d().d((LifecycleHandler) odk0Var.t.getValue(), new ndk0(odk0Var));
                }
                return s3q0.a;
            case 18:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) obj;
                return new dwk0(r7, cVar.B, cVar.m.o(), cVar.o);
            case 19:
                Pair pair = (Pair) r7;
                Pair pair2 = (Pair) obj;
                StringBuilder sb = new StringBuilder("nextAuthor=");
                sb.append((pair == null || (storiesContainer2 = (StoriesContainer) pair.i()) == null || (storyOwner2 = storiesContainer2.b) == null) ? null : storyOwner2.Db());
                sb.append(" | prevAuthor=");
                if (pair2 != null && (storiesContainer = (StoriesContainer) pair2.i()) != null && (storyOwner = storiesContainer.b) != null) {
                    str = storyOwner.Db();
                }
                sb.append(str);
                return sb.toString();
            case 20:
                m6p0 m6p0Var = (m6p0) obj;
                ((etv0) r7).b(false);
                m6p0Var.e.invoke();
                m6p0Var.f.invoke();
                return s3q0.a;
            case 21:
                qgp0 qgp0Var = (qgp0) r7;
                kb50 kb50Var = (kb50) obj;
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.i, new Object[]{"mid=" + kb50Var.c});
                }
                qgp0Var.b.D(kb50Var);
                return s3q0.a;
            case 22:
                return "UnstableNetworkDetector: current screen is set to " + ((nhp0) r7) + ", previous " + ((nhp0) obj);
            case 23:
                ((izs) r7).invoke(new wqs0.b((BlockId.CompositeId) obj));
                return s3q0.a;
            case 24:
                VkFormField vkFormField = (VkFormField) obj;
                List<Class<? extends View>> list = VkFormField.C;
                if (!(((View) r7) instanceof ei50)) {
                    return s3q0.a;
                }
                vkFormField.f();
                return s3q0.a;
            default:
                com.vk.voip.ui.hint.a aVar4 = (com.vk.voip.ui.hint.a) r7;
                ?? r6 = (FunctionReferenceImpl) obj;
                com.vk.voip.ui.c cVar2 = aVar4.b;
                cVar2.getClass();
                if (com.vk.voip.ui.c.z0()) {
                    r6.invoke();
                    aVar4.c();
                } else {
                    gvw0 gvw0Var = aVar4.f;
                    rs0 rs0Var = new rs0(aVar4, r6);
                    cVar2.getClass();
                    com.vk.voip.ui.c.s1(gvw0Var, rs0Var);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r(com.vk.voip.ui.hint.a aVar, gzs gzsVar) {
        this.b = 25;
        this.c = aVar;
        this.d = (FunctionReferenceImpl) gzsVar;
    }
}
