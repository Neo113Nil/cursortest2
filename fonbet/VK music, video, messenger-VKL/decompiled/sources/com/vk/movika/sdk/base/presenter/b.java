package com.vk.movika.sdk.base.presenter;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.debug.internal.DebugCpuIntensiveTaskService;
import com.vk.debug.internal.DebugCpuIntensiveTaskService.a;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.ClipVideoFile;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.im.chat.onlines.api.ChatOnlineMembersFeatureComponent;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.movika.sdk.base.logic.dto.d;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.webapp.fragments.CommunityCreationFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import one.video.player.BaseVideoPlayer;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.utils.Logger;
import xsna.asu0;
import xsna.b8h;
import xsna.bwt0;
import xsna.cmd;
import xsna.d4h;
import xsna.e43;
import xsna.fbh;
import xsna.fl6;
import xsna.fpf0;
import xsna.gik;
import xsna.gza;
import xsna.gzs;
import xsna.h7m;
import xsna.hk0;
import xsna.i70;
import xsna.iff;
import xsna.is1;
import xsna.j2j;
import xsna.jgp;
import xsna.js1;
import xsna.k7m;
import xsna.krv0;
import xsna.m6h;
import xsna.m7m;
import xsna.mph;
import xsna.nmg0;
import xsna.oph;
import xsna.pec;
import xsna.poc;
import xsna.r2g;
import xsna.rec;
import xsna.rtb;
import xsna.rul;
import xsna.s3q0;
import xsna.tzp0;
import xsna.u6p;
import xsna.uik;
import xsna.vm30;
import xsna.vw3;
import xsna.xwb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [xsna.j8i, xsna.xwb$a] */
    @Override // xsna.gzs
    public final Object invoke() {
        Boolean init$lambda$7;
        Parcelable parcelable;
        Object parcelable2;
        switch (this.b) {
            case 0:
                return "distributeActions: Empty result! Reason: " + ((d.a.c) ((d.a) this.c)).c;
            case 1:
                rul rulVar = (rul) this.c;
                io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
                if (rulVar.j()) {
                    e43.l(com.vk.dto.common.a.a(rulVar.c.c()), rulVar.h);
                    u6p ue = ((EduCommonComponent) ((k7m) m7m.f(new fl6.i())).mo408a(fpf0.a(EduCommonComponent.class))).ue();
                    rulVar.h(x.e(ue.a(), ue.a()).m(asu0.a.c()).subscribe(new is1(N0, 4), new js1(new fl6.h(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 5)));
                } else {
                    N0.onNext(jgp.b);
                }
                return N0;
            case 2:
                hk0 hk0Var = (hk0) this.c;
                vw3 vw3Var = BaseVideoPlayer.H;
                return "adaptiveTrackSelectionConfig set to " + hk0Var;
            case 3:
                init$lambda$7 = CallAnalyticsInitializer.init$lambda$7((i70) this.c);
                return init$lambda$7;
            case 4:
                return (CommonEditorComponent) ((nmg0) this.c).a(fpf0.a(CommonEditorComponent.class));
            case 5:
                vm30 vm30Var = ((gza) this.c).b().o;
                View view = vm30Var != null ? vm30Var.t : null;
                if (view != null) {
                    return bwt0.C(view);
                }
                return null;
            case 6:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                return ((ChatOnlineMembersFeatureComponent) m7m.a(chatFragment.kn()).mo408a(fpf0.a(ChatOnlineMembersFeatureComponent.class))).m();
            case 7:
                return ((rtb) this.c).i.q();
            case 8:
                ((xwb) this.c).b.n();
                return s3q0.a;
            case 9:
                rec recVar = (rec) this.c;
                int i = rec.j1;
                recVar.getFeature().C(pec.d.b);
                return s3q0.a;
            case 10:
                poc pocVar = (poc) this.c;
                tzp0.c.a aVar = poc.l1;
                Bundle requireArguments = pocVar.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("clip", ClipVideoFile.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("clip");
                    parcelable = (ClipVideoFile) (parcelable3 instanceof ClipVideoFile ? parcelable3 : null);
                }
                ClipVideoFile clipVideoFile = (ClipVideoFile) parcelable;
                if (clipVideoFile != null) {
                    return clipVideoFile;
                }
                throw new IllegalArgumentException("Clip must be provided by input arguments");
            case 11:
                Context context = (Context) this.c;
                int i2 = ClipEndOverlayView.u;
                return Integer.valueOf(krv0.m(R.attr.vk_ui_overlay_secondary, context));
            case 12:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i3 = ClipFeedListFragment.a2;
                return clipFeedListFragment.qo().Df();
            case 13:
                return (MultiVideoTimelineView) ((cmd) this.c).findViewById(R.id.timeline);
            case 14:
                ClipsEditorVoiceOverRecordButton clipsEditorVoiceOverRecordButton = (ClipsEditorVoiceOverRecordButton) this.c;
                int i4 = ClipsEditorVoiceOverRecordButton.B;
                return (VkImageSimple) clipsEditorVoiceOverRecordButton.findViewById(R.id.clips_editor_voiceover_button_img);
            case 15:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) this.c;
                int i5 = ClipsEntryPointDraftsFragment.Y;
                return ((ClipsTemplatesEditorComponent) m7m.d(clipsEntryPointDraftsFragment).a(fpf0.a(ClipsTemplatesEditorComponent.class))).l5();
            case 16:
                ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) this.c;
                int i6 = ClipsGridDraftsListFragment.l0;
                return (CameraClipsComponent) m7m.d(clipsGridDraftsListFragment).a(fpf0.a(CameraClipsComponent.class));
            case 17:
                ClipsStickersView clipsStickersView = (ClipsStickersView) this.c;
                int i7 = ClipsStickersView.Q;
                clipsStickersView.invalidate();
                return null;
            case 18:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) this.c;
                String str = ClipsUploadFragmentImpl.a0;
                return new iff(m7m.d(clipsUploadFragmentImpl), clipsUploadFragmentImpl.requireContext());
            case 19:
                return ((r2g) this.c).e.u();
            case 20:
                ((CommunityCreationFragment) this.c).eo();
                return s3q0.a;
            case 21:
                ((d4h) this.c).i.invoke(CommunityProfileAction.n.e.d.b);
                return s3q0.a;
            case 22:
                gzs<s3q0> gzsVar = ((b8h) this.c).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 23:
                return (DonutPriceComponent) ((h7m) this.c).a(fpf0.a(DonutPriceComponent.class));
            case 24:
                return new oph((mph) this.c);
            case 25:
                ((m6h) this.c).b(false, false, null);
                return s3q0.a;
            case 26:
                com.vk.profile.community.impl.ui.trust_mark.a aVar2 = (com.vk.profile.community.impl.ui.trust_mark.a) this.c;
                int i8 = com.vk.profile.community.impl.ui.trust_mark.a.p1;
                return ((StorefrontServicesComponent) m7m.d(aVar2).a(fpf0.a(StorefrontServicesComponent.class))).a();
            case 27:
                return (TextView) ((j2j) this.c).itemView.findViewById(R.id.voip_assign_randomly_subtitle);
            case 28:
                gik gikVar = (gik) this.c;
                uik uikVar = gikVar.n;
                if (uikVar != null) {
                    uikVar.c(false, new fbh(gikVar, 9));
                }
                return s3q0.a;
            default:
                DebugCpuIntensiveTaskService debugCpuIntensiveTaskService = (DebugCpuIntensiveTaskService) this.c;
                debugCpuIntensiveTaskService.b = true ^ debugCpuIntensiveTaskService.b;
                debugCpuIntensiveTaskService.a();
                if (debugCpuIntensiveTaskService.b) {
                    int availableProcessors = Runtime.getRuntime().availableProcessors();
                    for (int i9 = 0; i9 < availableProcessors; i9++) {
                        asu0.a.getClass();
                        asu0.h().execute(debugCpuIntensiveTaskService.new a());
                    }
                }
                return s3q0.a;
        }
    }
}
