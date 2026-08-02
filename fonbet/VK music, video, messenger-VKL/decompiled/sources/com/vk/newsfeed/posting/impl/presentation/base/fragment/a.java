package com.vk.newsfeed.posting.impl.presentation.base.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.p;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.channels.impl.channel_screen.exceptions.PostDeletedException;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectInputModel;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.coauthors.domain.model.CoauthorType;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.ui.utils.ItemType;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.feed.tool.view.posting.photoviewer.PhotoViewerLayout;
import com.vk.libvideo.bottomsheet.about.delegate.w;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.movika.sdk.base.ui.k;
import com.vk.movika.sdk.base.ui.m;
import com.vk.mvi.binder.compose.rx.RxBindingScopeExtKt$bindStates$$inlined$map$1;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.action_button.presentation.ActionButtonsFragment;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.presentation.base.fragment.AdditionalSettingsFragment;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageCropResult;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.presentation.base.fragment.CropEditorFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.e;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerPageLoadType;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.MediaViewerOpenPoint;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$NewRatioSet;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$ReloadLocalAlbums;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveStartTime;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.presentation.base.view.PostingContentView;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerBottomSheetBehavior;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.b;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.f;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$VkTicket;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedTicketItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import defpackage.r;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.n1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a120;
import xsna.awt0;
import xsna.b2;
import xsna.b4;
import xsna.b6a0;
import xsna.bjc;
import xsna.bpn0;
import xsna.brj0;
import xsna.bwr0;
import xsna.c5g;
import xsna.c5u;
import xsna.cb9;
import xsna.cdn;
import xsna.cfd;
import xsna.cfd0;
import xsna.cse;
import xsna.cvk;
import xsna.d370;
import xsna.d47;
import xsna.dhr0;
import xsna.dk5;
import xsna.drm0;
import xsna.dw20;
import xsna.e3m;
import xsna.e43;
import xsna.ebd;
import xsna.ebs;
import xsna.eed0;
import xsna.eeu0;
import xsna.efc0;
import xsna.enc0;
import xsna.enj;
import xsna.eoc;
import xsna.epx;
import xsna.ey90;
import xsna.f9t;
import xsna.feo;
import xsna.ffc;
import xsna.fkq0;
import xsna.fmc0;
import xsna.fw6;
import xsna.fxc0;
import xsna.g1;
import xsna.g47;
import xsna.ga10;
import xsna.gd40;
import xsna.gdu;
import xsna.gmc0;
import xsna.gtd0;
import xsna.gz80;
import xsna.h1;
import xsna.h13;
import xsna.h1m;
import xsna.h7u0;
import xsna.hb40;
import xsna.hmc0;
import xsna.hrz;
import xsna.i6a0;
import xsna.iah0;
import xsna.ibc0;
import xsna.ikv0;
import xsna.imc0;
import xsna.iza;
import xsna.izs;
import xsna.j5g;
import xsna.j6;
import xsna.jeq0;
import xsna.jmc0;
import xsna.jmd;
import xsna.ju;
import xsna.k4z;
import xsna.k7y;
import xsna.khc0;
import xsna.kmc0;
import xsna.kn4;
import xsna.kz0;
import xsna.l20;
import xsna.l370;
import xsna.lfg;
import xsna.lhc0;
import xsna.ljh;
import xsna.lmc0;
import xsna.loc0;
import xsna.maz;
import xsna.mhy;
import xsna.mmc0;
import xsna.mph;
import xsna.mr;
import xsna.mx6;
import xsna.myc0;
import xsna.n0w0;
import xsna.n9w;
import xsna.nbq0;
import xsna.nhc0;
import xsna.nm60;
import xsna.nmc0;
import xsna.noj0;
import xsna.o25;
import xsna.od3;
import xsna.ogd;
import xsna.omc0;
import xsna.p3o;
import xsna.p4g;
import xsna.pco;
import xsna.phc0;
import xsna.pmc;
import xsna.poc;
import xsna.q970;
import xsna.qaz;
import xsna.qg1;
import xsna.qhc0;
import xsna.qi60;
import xsna.qmc0;
import xsna.qv20;
import xsna.qzg;
import xsna.r320;
import xsna.r46;
import xsna.r6e0;
import xsna.re40;
import xsna.rec;
import xsna.rhc0;
import xsna.rkb;
import xsna.rmc0;
import xsna.rmk0;
import xsna.rt40;
import xsna.rve;
import xsna.s2h;
import xsna.s3q0;
import xsna.s8g0;
import xsna.s9j;
import xsna.sc4;
import xsna.td20;
import xsna.tsa;
import xsna.tte;
import xsna.tzp0;
import xsna.u2u0;
import xsna.u9r;
import xsna.ud20;
import xsna.uqe;
import xsna.uw3;
import xsna.uxd0;
import xsna.uzp0;
import xsna.vbc0;
import xsna.vcv0;
import xsna.vq10;
import xsna.vrv0;
import xsna.vve;
import xsna.w020;
import xsna.w65;
import xsna.wci0;
import xsna.wf8;
import xsna.wh50;
import xsna.wq10;
import xsna.wr0;
import xsna.wxr0;
import xsna.x020;
import xsna.x7q;
import xsna.xb20;
import xsna.xd40;
import xsna.xde;
import xsna.xf8;
import xsna.xi80;
import xsna.xn50;
import xsna.xw0;
import xsna.xxd0;
import xsna.xyf;
import xsna.y1q0;
import xsna.y7f;
import xsna.y8g0;
import xsna.ydt0;
import xsna.yx90;
import xsna.yyf;
import xsna.zak0;
import xsna.zgc0;
import xsna.zte;
import xsna.zwb;
import xsna.zzq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v122, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r0v78, types: [T, xsna.dh6, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v36, types: [com.google.android.material.bottomsheet.c] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.Lazy] */
    private final Object a(Object obj) {
        ?? I0;
        String str;
        h7u0.a c;
        Context b;
        boolean z;
        h7u0.a c2;
        PostingFragment postingFragment = (PostingFragment) this.c;
        nbq0 nbq0Var = postingFragment.F0;
        bpn0 bpn0Var = postingFragment.E0;
        fmc0 fmc0Var = (fmc0) obj;
        int i = PostingFragment.L0;
        int i2 = 1;
        if (fmc0Var instanceof fmc0.j) {
            final rhc0 rhc0Var = postingFragment.e0;
            fmc0.j jVar = (fmc0.j) fmc0Var;
            final FragmentActivity kn = postingFragment.kn();
            eed0 eed0Var = rhc0Var.u;
            ?? r5 = rhc0Var.n;
            gd40 gd40Var = rhc0Var.f;
            re40 re40Var = rhc0Var.g;
            PostingFragment postingFragment2 = rhc0Var.c;
            PostingFragment postingFragment3 = rhc0Var.b;
            if (jVar instanceof fmc0.j.c) {
                fmc0.j.c cVar = (fmc0.j.c) jVar;
                rhc0Var.a(kn, cVar.a, cVar.b, cVar.c);
            } else if (jVar instanceof fmc0.j.u) {
                fmc0.j.u uVar = (fmc0.j.u) jVar;
                final boolean z2 = uVar.a;
                final PostEditingReason postEditingReason = uVar.b;
                int i3 = h7u0.p;
                c2 = h7u0.b.c(kn);
                c2.g0(R.string.exit_confirmation_without_saving);
                c2.W(R.string.cancel_exit, new lhc0());
                c2.c0(R.string.exit_without_save, new DialogInterface.OnClickListener() { // from class: xsna.mhc0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        boolean z3 = z2;
                        rhc0 rhc0Var2 = rhc0Var;
                        if (z3) {
                            xn50.a.c(rhc0Var2.c, PostingAction.LocalDraft.RemoveDraft.b);
                        }
                        rhc0Var2.a(kn, true, postEditingReason, false);
                    }
                });
                c2.m();
            } else if (jVar instanceof fmc0.j.v) {
                final PostEditingReason postEditingReason2 = ((fmc0.j.v) jVar).a;
                if (postEditingReason2 instanceof PostEditingReason.EditRemoteDraft) {
                    eeu0.a aVar = new eeu0.a(kn, R.style.VkAlertDialogThemeRedNeutral);
                    aVar.B(R.string.new_post_update_draft_dialog_title);
                    aVar.q(R.string.new_post_update_draft_dialog_text);
                    aVar.setPositiveButton(R.string.new_post_draft_dialog_button_save, new hrz(rhc0Var, i2));
                    aVar.v(R.string.new_post_save_draft_dialog_cancel, new nhc0());
                    aVar.setNegativeButton(R.string.exit_without_save, new DialogInterface.OnClickListener() { // from class: xsna.ohc0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            rhc0.this.a(kn, true, postEditingReason2, false);
                        }
                    });
                    aVar.m();
                } else {
                    eeu0.a aVar2 = new eeu0.a(kn, R.style.VkAlertDialogThemeRedNeutral);
                    aVar2.B(R.string.new_post_save_draft_dialog_title);
                    aVar2.setPositiveButton(R.string.new_post_draft_dialog_button_save, new vbc0(rhc0Var, i2));
                    aVar2.v(R.string.new_post_save_draft_dialog_cancel, new phc0());
                    aVar2.setNegativeButton(R.string.exit_without_save, new td20(rhc0Var, kn, postEditingReason2, i2));
                    aVar2.m();
                }
            } else {
                int i4 = 6;
                Boolean bool = null;
                if (jVar instanceof fmc0.j.a) {
                    PostingContentView postingContentView = (PostingContentView) rhc0Var.d.invoke();
                    if (postingContentView != null) {
                        enc0 enc0Var = postingContentView.m;
                        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = enc0Var.A;
                        if ((mediaPickerBottomSheetBehavior == null || mediaPickerBottomSheetBehavior.k != 3) && (mediaPickerBottomSheetBehavior == null || mediaPickerBottomSheetBehavior.k != 6)) {
                            z = false;
                        } else {
                            enc0Var.h(4);
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    if (!epx.f(bool, Boolean.TRUE)) {
                        postingFragment2.e2(PostingAction.Navigation.Back.b);
                    }
                } else if (jVar instanceof fmc0.j.b) {
                    postingFragment2.e2(PostingAction.Navigation.Back.b);
                } else if (jVar instanceof imc0) {
                    imc0 imc0Var = (imc0) jVar;
                    Context b2 = rhc0.b(postingFragment3);
                    if (b2 != null) {
                        new PollEditorModalBottomSheet.a(b2, imc0Var.a, imc0Var.b, imc0Var.c, imc0Var.d, imc0Var.e, SystemClock.elapsedRealtime(), rhc0Var.h).I0(null);
                    }
                } else if (jVar instanceof hmc0) {
                    hmc0 hmc0Var = (hmc0) jVar;
                    CropEditorFragment.a aVar3 = new CropEditorFragment.a(CropEditorFragment.class, null, null);
                    ImageLink imageLink = hmc0Var.a;
                    Bundle bundle = aVar3.j;
                    bundle.putParcelable("ImageLink", imageLink);
                    ImageCropArea imageCropArea = hmc0Var.b;
                    if (imageCropArea != null) {
                        bundle.putParcelable("CropData", imageCropArea);
                    }
                    MediaStoreEntry mediaStoreEntry = hmc0Var.d;
                    if (mediaStoreEntry != null) {
                        bundle.putParcelable("OriginalMediaEntry", mediaStoreEntry);
                    }
                    bundle.putParcelable("currentRatio", hmc0Var.c);
                    bundle.putBoolean("recalculateRatio", hmc0Var.e);
                    bundle.putBoolean("hasGoods", hmc0Var.f);
                    bundle.putBoolean("editEnabled", hmc0Var.g);
                    bundle.putInt("fitContainerMode", hmc0Var.h.ordinal());
                    bundle.putSerializable("targetScreenUniqueId", hmc0Var.i);
                    aVar3.g(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, postingFragment3);
                } else {
                    int i5 = 10;
                    if (jVar instanceof lmc0) {
                        lmc0 lmc0Var = (lmc0) jVar;
                        Context mo2getContext = postingFragment3.mo2getContext();
                        if (mo2getContext != null) {
                            new e.a(mo2getContext, lmc0Var.a, SystemClock.elapsedRealtime(), rhc0Var.i, new xd40(rhc0Var, i5)).I0(null);
                        }
                    } else if (jVar instanceof kmc0) {
                        kmc0 kmc0Var = (kmc0) jVar;
                        Context b3 = rhc0.b(postingFragment3);
                        if (b3 != null) {
                            new rt40.a(b3, new rt40.a.C3631a(kmc0Var.a, rhc0Var.j, SystemClock.elapsedRealtime(), kmc0Var.b, kmc0Var.c, kmc0Var.d, kmc0Var.e, kmc0Var.f, kmc0Var.g)).H0(postingFragment3.getChildFragmentManager(), "PostingMusicPicker");
                        }
                    } else {
                        int i6 = 28;
                        if (jVar instanceof omc0) {
                            omc0 omc0Var = (omc0) jVar;
                            FragmentActivity activity = postingFragment3.getActivity();
                            if (activity != null) {
                                ((ibc0) gd40Var.invoke()).u().n();
                                int i7 = omc0Var.c;
                                ArrayList arrayList = omc0Var.b;
                                gtd0 gtd0Var = new gtd0((ibc0) gd40Var.invoke());
                                ga10 ga10Var = omc0Var.a;
                                qhc0 qhc0Var = new qhc0(1, postingFragment2, xn50.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                                if (!arrayList.isEmpty()) {
                                    dhr0.a.getClass();
                                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, dhr0.u().c);
                                    f fVar = new f(arrayList, new b(activity, gtd0Var), gtd0Var, activity, ga10Var, qhc0Var);
                                    com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = new com.vk.newsfeed.posting.market_picker.presentation.base.view.e(i7, arrayList, activity, contextThemeWrapper, fVar, fVar.q);
                                    PhotoViewerLayout photoViewerLayout = eVar.q;
                                    Activity b4 = enj.b(photoViewerLayout);
                                    if (b4 != null && !b4.isFinishing() && !b4.isDestroyed()) {
                                        photoViewerLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        fVar.j.getClass();
                                        RectF rectF = com.vk.newsfeed.posting.market_picker.presentation.base.view.e.x;
                                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2, -2013134846, 1);
                                        layoutParams.softInputMode = 1;
                                        layoutParams.dimAmount = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        if (gz80.a(28)) {
                                            layoutParams.layoutInDisplayCutoutMode = 1;
                                        }
                                        eVar.p.addView(photoViewerLayout, layoutParams);
                                        awt0.t(photoViewerLayout, new k7y(eVar, i4));
                                    }
                                }
                            }
                        } else if (jVar instanceof fmc0.j.e) {
                            fmc0.j.e eVar2 = (fmc0.j.e) jVar;
                            AdditionalSettingsFragment.a aVar4 = new AdditionalSettingsFragment.a(AdditionalSettingsFragment.class, null, null);
                            AdditionalSettingsConfiguration additionalSettingsConfiguration = eVar2.c;
                            Bundle bundle2 = aVar4.j;
                            if (additionalSettingsConfiguration != null) {
                                bundle2.putParcelable("ADDITIONAL_SETTINGS_CONFIGURATION", additionalSettingsConfiguration);
                            }
                            boolean z3 = eVar2.g;
                            PostEditingReason postEditingReason3 = eVar2.a;
                            boolean z4 = postEditingReason3 instanceof PostEditingReason.EditExistingPost;
                            boolean z5 = postEditingReason3 instanceof PostEditingReason.EditRemoteDraft;
                            boolean z6 = eVar2.e;
                            boolean z7 = eVar2.f;
                            UserType userType = eVar2.h;
                            boolean Ja = postEditingReason3.Ja();
                            boolean z8 = eVar2.i;
                            String str2 = eVar2.j;
                            String str3 = eVar2.k;
                            bundle2.putBoolean("IS_COMMENT_CHANGE_AVAILABLE", z3);
                            bundle2.putBoolean("IS_EDIT_MODE", z4);
                            bundle2.putBoolean("IS_DRAFT", z5);
                            bundle2.putBoolean("HAS_COAUTHORS", z7);
                            bundle2.putBoolean("IS_COMMUNITY", z6);
                            bundle2.putSerializable("USER_TYPE", userType);
                            bundle2.putBoolean("IS_SUGGEST", Ja);
                            bundle2.putBoolean("IS_COMMUNITY_ADMIN", z8);
                            bundle2.putString("AUTHOR_FIRST_NAME_GEN", str2);
                            bundle2.putString("AUTHOR_LAST_NAME_GEN", str3);
                            bundle2.putBoolean("SHOULD_SHOW_NOTIFICATIONS_BUTTON", eVar2.d);
                            bundle2.putParcelable("OWNER", eVar2.b);
                            bundle2.putSerializable("TARGET_SCREEN_UNIQUE_ID", eVar2.l);
                            aVar4.g(11, postingFragment3);
                        } else if (jVar instanceof fmc0.j.f) {
                            ((NewsfeedRouter) rhc0Var.o.getValue()).u(postingFragment3);
                        } else if (jVar instanceof fmc0.j.p) {
                            eed0Var.getClass();
                            PostPrivacyData postPrivacyData = ((fmc0.j.p) jVar).a;
                            PrivacyPostType privacyPostType = postPrivacyData.d;
                            PostingFragment postingFragment4 = eed0Var.a;
                            Context mo2getContext2 = !postingFragment4.isAdded() ? null : postingFragment4.mo2getContext();
                            if (mo2getContext2 != null) {
                                if (epx.f(privacyPostType, PrivacyPostType.BestFriends.b)) {
                                    privacyPostType = PrivacyPostType.AllUsers.b;
                                }
                                eed0Var.d = privacyPostType;
                                eed0Var.f = -1;
                                eed0Var.g = null;
                                eed0Var.e = false;
                                new cfd0.a(mo2getContext2, postPrivacyData, eed0Var.c).I0(null);
                            }
                        } else if (jVar instanceof fmc0.j.r) {
                            eed0Var.getClass();
                            PostPrivacyData postPrivacyData2 = ((fmc0.j.r) jVar).a;
                            PrivacyPostType privacyPostType2 = postPrivacyData2.d;
                            PrivacyPostType.SingleDonutLevel singleDonutLevel = privacyPostType2 instanceof PrivacyPostType.SingleDonutLevel ? (PrivacyPostType.SingleDonutLevel) privacyPostType2 : null;
                            DonutLevel donutLevel = singleDonutLevel != null ? singleDonutLevel.b : null;
                            DonutLevelsFragment.a aVar5 = new DonutLevelsFragment.a();
                            Bundle bundle3 = aVar5.j;
                            bundle3.putParcelable("level", donutLevel);
                            bundle3.putParcelableArrayList("levels", new ArrayList<>(postPrivacyData2.f));
                            bundle3.putSerializable("uuid", UUID.randomUUID());
                            aVar5.g(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, eed0Var.a);
                        } else if (jVar instanceof fmc0.j.h) {
                            fmc0.j.h hVar = (fmc0.j.h) jVar;
                            String str4 = hVar.a;
                            String str5 = hVar.b;
                            if (postingFragment3.isAdded() && (b = rhc0.b(postingFragment3)) != null) {
                                postingFragment3.getChildFragmentManager().l0("request_donut_teaser", postingFragment3, new khc0(rhc0Var, 0));
                                new p3o.a(b, str4, str5).H0(postingFragment3.getChildFragmentManager(), p3o.class.getName());
                            }
                        } else {
                            int i8 = 18;
                            if (jVar instanceof mmc0) {
                                Date date = ((mmc0) jVar).a;
                                if (date != null) {
                                    Context b5 = rhc0.b(postingFragment3);
                                    if (b5 != null) {
                                        new tsa(new qg1(i8, rhc0Var, date), new nm60(rhc0Var, 9)).a(b5);
                                    }
                                } else {
                                    rhc0Var.c(null);
                                }
                            } else if (jVar instanceof jmc0) {
                                postingFragment2.e2(new PostingAction$TechStats$Picker$SaveStartTime(MobileOfficialAppsFeedStat$PickerType.DOCUMENT, SystemClock.elapsedRealtime()));
                                rhc0.c cVar2 = rhc0Var.l;
                                FragmentManager childFragmentManager = postingFragment3.getChildFragmentManager();
                                if (!childFragmentManager.T()) {
                                    Fragment H = childFragmentManager.H("file_picker_bottom_sheet");
                                    u9r u9rVar = H instanceof c ? (c) H : null;
                                    if (u9rVar == null) {
                                        u9rVar = new u9r();
                                        u9rVar.z = cVar2;
                                    }
                                    u9rVar.Td(childFragmentManager, "file_picker_bottom_sheet");
                                }
                            } else if (jVar instanceof fmc0.j.g) {
                                fmc0.j.g gVar = (fmc0.j.g) jVar;
                                yyf yyfVar = (yyf) rhc0Var.m.getValue();
                                UserId userId = gVar.a;
                                Iterable iterable = gVar.b;
                                if (iterable == null) {
                                    iterable = EmptyList.b;
                                }
                                PostingFragment postingFragment5 = yyfVar.b;
                                Context mo2getContext3 = postingFragment5.mo2getContext();
                                if (mo2getContext3 != null) {
                                    FragmentManager parentFragmentManager = postingFragment5.getParentFragmentManager();
                                    jmd jmdVar = (jmd) yyfVar.d.getValue();
                                    Iterable iterable2 = iterable;
                                    ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
                                    Iterator it = iterable2.iterator();
                                    while (it.hasNext()) {
                                        Owner owner = ((CoauthorDto) it.next()).b;
                                        UserId userId2 = owner.b;
                                        String str6 = owner.c;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        String f = owner.f(iah0.a(i6));
                                        if (f == null) {
                                            f = "";
                                        }
                                        arrayList2.add(new ClipsCoauthorsSelectInputModel(userId2, str6, f, false, fkq0.b(owner.b) ? CoauthorType.Community : owner.l() ? CoauthorType.Female : CoauthorType.Male));
                                        i6 = 28;
                                    }
                                    jmdVar.b(mo2getContext3, new ClipsCoauthorsSelectorInputParams(false, j5g.S0(arrayList2), "post_co_request", "post_co_result", userId, true, null, ClipsCoauthorsSelectorInputParams.OpenFrom.Posting.b, 64, null), parentFragmentManager);
                                    parentFragmentManager.l0("post_co_request", postingFragment5.getViewLifecycleOwner(), new xyf(parentFragmentManager, yyfVar));
                                }
                            } else if (jVar instanceof fmc0.j.l) {
                                x020 x020Var = (x020) re40Var.invoke();
                                com.vk.core.simplescreen.a aVar6 = x020Var.e;
                                if (aVar6 == null) {
                                    aVar6 = new com.vk.core.simplescreen.a(kn, false, false);
                                    x020Var.e = aVar6;
                                    aVar6.setOnDismissListener(new w020(x020Var));
                                }
                                com.vk.core.simplescreen.a aVar7 = aVar6;
                                aVar7.show();
                                com.vk.attachpicker.c cVar3 = new com.vk.attachpicker.c();
                                cVar3.c = new a120();
                                p pVar = new p(p4g.q(null), 0, cVar3, x020Var.l, true, aVar7, x020Var.k);
                                pVar.U = x020Var.k;
                                pVar.P = false;
                                pVar.j.b = false;
                                aVar7.b(pVar);
                                pVar.K();
                                x020Var.f = pVar;
                            } else if (jVar instanceof fmc0.j.k) {
                                fmc0.j.k kVar = (fmc0.j.k) jVar;
                                x020 x020Var2 = (x020) re40Var.invoke();
                                ArrayList arrayList3 = kVar.a;
                                List<Pair<Integer, MediaStoreEntry>> list = kVar.b;
                                int i9 = kVar.d;
                                MediaViewerOpenPoint mediaViewerOpenPoint = kVar.g;
                                boolean z9 = kVar.e;
                                boolean z10 = kVar.f;
                                u2u0 u2u0Var = kVar.h;
                                x020Var2.g = false;
                                x020Var2.h.clear();
                                x020Var2.c(kn, arrayList3, list, i9, mediaViewerOpenPoint, z10, z9, u2u0Var);
                            } else if (jVar instanceof fmc0.j.q) {
                                fmc0.j.q qVar = (fmc0.j.q) jVar;
                                x020 x020Var3 = (x020) re40Var.invoke();
                                List<Photo> list2 = qVar.a;
                                List<Pair<Integer, Photo>> list3 = qVar.b;
                                int i10 = qVar.d;
                                x020Var3.g = true;
                                LinkedHashMap linkedHashMap = x020Var3.h;
                                linkedHashMap.clear();
                                List<Photo> list4 = list2;
                                for (Photo photo : list4) {
                                    linkedHashMap.put(Integer.valueOf(photo.c), photo);
                                }
                                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                                Iterator it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(w65.j((Photo) it2.next()));
                                }
                                List<Pair<Integer, Photo>> list5 = list3;
                                ArrayList arrayList5 = new ArrayList(c5g.u(list5, 10));
                                Iterator it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    Pair pair = (Pair) it3.next();
                                    arrayList5.add(new Pair(pair.i(), w65.j((Photo) pair.j())));
                                }
                                x020Var3.c(kn, arrayList4, arrayList5, i10, MediaViewerOpenPoint.VK_PHOTO_PICKER, true, false, u2u0.b.a);
                            } else if (jVar instanceof fmc0.j.o) {
                                i6a0 i6a0Var = rhc0Var.r;
                                MediaPickerEntry mediaPickerEntry = ((fmc0.j.o) jVar).a;
                                h13 h13Var = new h13(i8);
                                i6a0Var.getClass();
                                boolean z11 = mediaPickerEntry instanceof LocalMediaEntry;
                                Uri f2 = z11 ? ((LocalMediaEntry) mediaPickerEntry).ba().f() : (!(mediaPickerEntry instanceof VkMediaEntry$VkPhoto) || (str = ((VkMediaEntry$VkPhoto) mediaPickerEntry).b.t) == null) ? null : Uri.parse(str);
                                if (f2 != null) {
                                    if (URLUtil.isFileUrl(f2.toString()) || URLUtil.isContentUrl(f2.toString())) {
                                        String path = f2.getPath();
                                        if (path != null) {
                                            File file = new File(path);
                                            if (i6a0Var.c.b(file)) {
                                                LocalMediaEntry localMediaEntry = z11 ? (LocalMediaEntry) mediaPickerEntry : null;
                                                i6a0Var.f = localMediaEntry != null ? localMediaEntry.ba() : null;
                                                efc0 feature = i6a0Var.a.getFeature();
                                                if (feature == null || !efc0.k0(feature, i6a0Var.f)) {
                                                    i6a0Var.a(file, kn, new n9w(h13Var, 13));
                                                } else {
                                                    xi80 xi80Var = new xi80(i6a0Var, file, kn, h13Var, 2);
                                                    String e = y8g0.e(R.string.edit_photo_alert_title);
                                                    String e2 = y8g0.e(R.string.edit_photo_alert_description);
                                                    int i11 = h7u0.p;
                                                    c = h7u0.b.c(kn);
                                                    c.h0(e);
                                                    c.a.f = e2;
                                                    c.X(y8g0.e(R.string.vk_bottomsheet_confirmation_cancel), new qi60(1));
                                                    c.d0(y8g0.e(R.string.photo_editor_edit_button), new b6a0(xi80Var));
                                                    c.m();
                                                }
                                            } else {
                                                s3q0 s3q0Var = s3q0.a;
                                            }
                                        }
                                    } else {
                                        s3q0 s3q0Var2 = s3q0.a;
                                    }
                                }
                            } else if (jVar instanceof fmc0.j.s) {
                                vcv0 vcv0Var = rhc0Var.t;
                                vcv0Var.getClass();
                                myc0.d().g(0, null, kn, vcv0Var.a, o25.a().c());
                            } else if (jVar instanceof fmc0.j.t) {
                                n0w0 n0w0Var = rhc0Var.s;
                                VideoFile videoFile = ((fmc0.j.t) jVar).a;
                                n0w0Var.getClass();
                                ydt0.s(fxc0.B().Y(), kn, videoFile, n0w0Var.a, true, null, null, null, null, null, 16320);
                            } else if (jVar.equals(fmc0.j.n.a)) {
                                Context b6 = rhc0.b(postingFragment3);
                                if (b6 != null) {
                                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                    ?? a = new q970.a(b6, rhc0Var.k, new k(19, rhc0Var, ref$ObjectRef)).a();
                                    ref$ObjectRef.element = a;
                                    a.Td(postingFragment3.getChildFragmentManager(), q970.class.getName());
                                }
                            } else if (jVar instanceof fmc0.j.d) {
                                fmc0.j.d dVar = (fmc0.j.d) jVar;
                                ActionButtonsFragment.a aVar8 = new ActionButtonsFragment.a(ActionButtonsFragment.class, null, null);
                                ArrayList<? extends Parcelable> q = p4g.q(dVar.a);
                                Bundle bundle4 = aVar8.j;
                                bundle4.putParcelableArrayList("available_actions", q);
                                bundle4.putParcelable("selected_action", dVar.b);
                                bundle4.putSerializable("target_screen_unique_id", dVar.c);
                                bundle4.putParcelable("owner", dVar.d);
                                aVar8.s(true);
                                aVar8.g(426, postingFragment3);
                            } else if (jVar instanceof fmc0.j.m) {
                                ((maz) r5.getValue()).d(kn, jeq0.g(((fmc0.j.m) jVar).a), LaunchContext.A, null);
                            } else if (jVar instanceof nmc0) {
                                PostPrivacyData postPrivacyData3 = ((nmc0) jVar).a;
                                h1 h1Var = new h1(29, rhc0Var, postPrivacyData3);
                                if (postPrivacyData3.g != null) {
                                    Context b7 = rhc0.b(postingFragment3);
                                    if (b7 != null) {
                                        new tsa(new s9j(rhc0Var, postPrivacyData3, h1Var, 5), new m(17, rhc0Var, postPrivacyData3)).a(b7);
                                    }
                                } else {
                                    rhc0Var.d(null, h1Var);
                                }
                            } else if (jVar instanceof fmc0.j.C2885j) {
                                maz.c((maz) r5.getValue(), kn, "https://m.vkvideo.ru/legal/terms", LaunchContext.A, null, null, 24);
                            } else {
                                if (!(jVar instanceof fmc0.j.i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fmc0.j.i iVar = (fmc0.j.i) jVar;
                                Context b8 = rhc0.b(postingFragment3);
                                if (b8 != null) {
                                    ((ibc0) gd40Var.invoke()).i().a();
                                    ((feo) rhc0Var.p.getValue()).a(b8, iVar.a);
                                }
                            }
                        }
                    }
                }
            }
            ikv0 ikv0Var = ((ud20) bpn0Var.getValue()).b;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            s3q0 s3q0Var3 = s3q0.a;
        } else if (fmc0Var instanceof fmc0.w) {
            fmc0.w wVar = (fmc0.w) fmc0Var;
            if (wVar instanceof fmc0.w.a) {
                PostingContentView postingContentView2 = postingFragment.R;
                if (postingContentView2 != null) {
                    enc0 enc0Var2 = postingContentView2.m;
                    List<MediaPickerState.Tab> list6 = enc0.q0;
                    enc0Var2.f(true);
                }
            } else {
                if (!(wVar instanceof fmc0.w.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                PostingContentView postingContentView3 = postingFragment.R;
                if (postingContentView3 != null) {
                    String str7 = ((fmc0.w.b) wVar).a;
                    enc0 enc0Var3 = postingContentView3.m;
                    hb40 hb40Var = enc0Var3.U;
                    loc0 loc0Var = enc0Var3.k0;
                    VkInputSelect vkInputSelect = enc0Var3.n;
                    Editable editableText = vkInputSelect.getEditableText();
                    if (editableText != null) {
                        vkInputSelect.e(loc0Var);
                        ArrayList arrayList6 = new ArrayList();
                        qaz[] qazVarArr = (qaz[]) editableText.getSpans(0, editableText.length(), qaz.class);
                        int i12 = 0;
                        while (i12 < qazVarArr.length) {
                            int i13 = i12 + 1;
                            try {
                                qaz qazVar = qazVarArr[i12];
                                if (!(qazVar instanceof r320) && !(qazVar instanceof x7q)) {
                                    if (qazVar == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String i14 = qazVar.i();
                                    if (i14 == null) {
                                        i14 = "";
                                    }
                                    if (drm0.D(str7, i14, false)) {
                                        int spanStart = editableText.getSpanStart(qazVar);
                                        int spanEnd = editableText.getSpanEnd(qazVar);
                                        int i15 = spanEnd + 1;
                                        if (i15 < editableText.length() && editableText.charAt(i15) == ' ') {
                                            spanEnd = i15;
                                        }
                                        editableText.removeSpan(qazVar);
                                        if (spanStart < spanEnd && spanEnd <= editableText.length()) {
                                            editableText.delete(spanStart, spanEnd);
                                        }
                                        String i16 = qazVar.i();
                                        if (i16 == null) {
                                            i16 = "";
                                        }
                                        arrayList6.add(i16);
                                    }
                                }
                                i12 = i13;
                            } catch (ArrayIndexOutOfBoundsException e3) {
                                throw new NoSuchElementException(e3.getMessage());
                            }
                        }
                        hb40Var.invoke(new PostingAction.Editing.Text.Changed(editableText.toString(), false));
                        hb40Var.invoke(new PostingAction.Editing.Text.RemoveLinks(arrayList6));
                        vkInputSelect.b(loc0Var);
                    }
                }
            }
        } else if (fmc0Var instanceof fmc0.h) {
            zgc0 zgc0Var = (zgc0) postingFragment.i0.getValue();
            fmc0.h hVar2 = (fmc0.h) fmc0Var;
            PostingContentView postingContentView4 = postingFragment.d0;
            vq10 vq10Var = zgc0Var.c;
            if (hVar2 instanceof fmc0.h.f) {
                fmc0.h.f fVar2 = (fmc0.h.f) hVar2;
                vq10Var.a(new wci0(new wq10.c(fVar2.a), fVar2.b));
            } else if (hVar2 instanceof fmc0.h.e) {
                fmc0.h.e eVar3 = (fmc0.h.e) hVar2;
                vq10Var.a(new wci0(new wq10.b(eVar3.a), eVar3.b));
            } else if (hVar2 instanceof fmc0.h.c) {
                y1q0 y1q0Var = zgc0Var.d;
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO;
                if (c3 != mobileOfficialAppsCoreNavStat$EventScreen && c3 != MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO) {
                    y1q0Var.c(new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen), true);
                }
            } else if (hVar2 instanceof fmc0.h.d) {
                fmc0.h.d dVar2 = (fmc0.h.d) hVar2;
                Context context = zgc0Var.a;
                if (context != null) {
                    zgc0Var.b.b(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_circle_outline_28, R.attr.vk_ui_icon_warning), new PostingUserMessageText.StringText(context.getString(R.string.media_picker_max_count_media_enriched_message, String.valueOf(dVar2.a))), null, 4, null)));
                }
            } else if (hVar2 instanceof fmc0.h.b) {
                fmc0.h.b bVar = (fmc0.h.b) hVar2;
                vq10Var.a(new wci0(bVar.a, bVar.b));
            } else {
                if (!(hVar2 instanceof fmc0.h.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (postingContentView4 != null) {
                    postingContentView4.o6(hVar2);
                }
            }
        } else if (fmc0Var instanceof gmc0) {
            mhy.b(postingFragment.requireContext());
        } else if (fmc0Var instanceof fmc0.c) {
            gdu gduVar = postingFragment.f0;
            fmc0.c cVar4 = (fmc0.c) fmc0Var;
            PostingFragment postingFragment6 = gduVar.c;
            if (cVar4 instanceof fmc0.c.b) {
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context requireContext = postingFragment6.requireContext();
                String[] strArr = PermissionHelper.d;
                permissionHelper.getClass();
                if (PermissionHelper.b(requireContext, strArr) || PermissionHelper.o(postingFragment6.requireContext())) {
                    gduVar.a.e2(new PostingAction.Permissions.PermissionGranted(PermissionType.GalleryView));
                } else {
                    rmk0 rmk0Var = new rmk0(2);
                    String[] strArr2 = PermissionHelper.e;
                    rmk0Var.b(strArr2);
                    rmk0Var.b(PermissionHelper.f);
                    ArrayList<Object> arrayList7 = rmk0Var.a;
                    postingFragment6.requestPermissions((String[]) arrayList7.toArray(new String[arrayList7.size()]), 16);
                    ebs c4 = kn4.c(postingFragment6);
                    dhr0.a.getClass();
                    Context E = dhr0.E();
                    gduVar.d = new s8g0(c4, null, new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E)), new yx90(R.string.media_picker_grant_gallery_view_permission_rationale, 16, PermissionHelper.g, strArr2, false), new qzg(gduVar, 20), null, null, null, null, null);
                }
            } else {
                if (!(cVar4 instanceof fmc0.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ebs c5 = kn4.c(postingFragment6);
                dhr0.a.getClass();
                Context E2 = dhr0.E();
                ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E2), e3m.f(R.attr.vk_ui_text_subhead, E2));
                PermissionHelper.a.getClass();
                String[] strArr3 = PermissionHelper.l;
                s8g0 s8g0Var = new s8g0(c5, null, ey90Var, new yx90(R.string.media_picker_grant_camera_permission_rationale, 16, strArr3, strArr3, true), new j6(9, gduVar, (fmc0.c.a) cVar4), null, null, null, null, null);
                s8g0Var.c(false);
                gduVar.d = s8g0Var;
            }
        } else if (fmc0Var instanceof fmc0.b) {
            PostingContentView postingContentView5 = postingFragment.R;
            if (postingContentView5 != null) {
                postingContentView5.m.j(((fmc0.b) fmc0Var).a);
            }
        } else if (fmc0Var instanceof fmc0.m) {
            postingFragment.g0.b((fmc0.m) fmc0Var);
        } else if (fmc0Var instanceof fmc0.f) {
            k4z k4zVar = postingFragment.h0;
            k4zVar.getClass();
            if (!((fmc0.f) fmc0Var).equals(fmc0.f.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingFragment postingFragment7 = k4zVar.a;
            postingFragment7.e2(PostingAction$MediaPicker$Album$ReloadLocalAlbums.b);
            postingFragment7.e2(new PostingAction.MediaPicker.LoadLocalMediaPage(MediaPickerPageLoadType.Reload));
        } else if (fmc0Var instanceof fmc0.y) {
            PostingContentView postingContentView6 = postingFragment.d0;
            if (postingContentView6 != null) {
                postingContentView6.o6(fmc0Var);
            }
        } else if (fmc0Var instanceof fmc0.q) {
            Context mo2getContext4 = postingFragment.mo2getContext();
            if (mo2getContext4 != null) {
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                dw20.b bVar2 = new dw20.b(mo2getContext4);
                ItemType itemType = ItemType.DEFAULT;
                I0 = bVar2.P(e43.l(new brj0(0, 0, null, R.string.posting_step2_content_on_click_edit, null, false, false, itemType, 0, null, TitleColorAttr.DEFAULT, null, null, null, 126646), new brj0(1, 0, null, R.string.posting_step2_content_on_click_cancel, null, true, false, itemType, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126646)), new ju(21, postingFragment, ref$ObjectRef2)).I0(null);
                ref$ObjectRef2.element = I0;
            }
        } else if (fmc0Var instanceof fmc0.p) {
            ((ud20) bpn0Var.getValue()).b(postingFragment.requireContext(), (fmc0.p) fmc0Var);
        } else if (fmc0Var instanceof fmc0.s) {
            postingFragment.S.postDelayed(new sc4(postingFragment, 11), ((fmc0.s) fmc0Var).a);
        } else if (fmc0Var instanceof fmc0.t) {
            postingFragment.io();
        } else if (fmc0Var instanceof fmc0.n) {
            PostingContentView postingContentView7 = postingFragment.R;
            if (postingContentView7 != null) {
                ImageCropResult imageCropResult = ((fmc0.n) fmc0Var).a;
                enc0 enc0Var4 = postingContentView7.m;
                enc0Var4.getClass();
                float d = w65.d(imageCropResult.c);
                e43.m(imageCropResult.d);
                enc0Var4.p.i.b.invoke(new PostingAction$Editing$CropPhoto$NewRatioSet(d));
            }
        } else if (fmc0Var instanceof fmc0.u) {
            izs<? super fmc0.u, s3q0> izsVar = postingFragment.I0;
            if (izsVar != null) {
                izsVar.invoke(fmc0Var);
            }
        } else if (fmc0Var instanceof fmc0.k) {
            PostingContentView postingContentView8 = postingFragment.R;
            if (postingContentView8 != null) {
                postingContentView8.c(((fmc0.k) fmc0Var).a);
            }
        } else if (fmc0Var instanceof qmc0) {
            qmc0 qmc0Var = (qmc0) fmc0Var;
            nbq0Var.c(qmc0Var.a, qmc0Var.b, qmc0Var.c);
        } else if (fmc0Var instanceof rmc0) {
            nbq0Var.a(((rmc0) fmc0Var).a.I4().d);
        } else if (fmc0Var instanceof fmc0.r) {
            com.vk.core.view.components.spinner.c e4 = qv20.e(postingFragment.mo2getContext(), Integer.valueOf(R.string.rx_loading));
            e4.setCancelable(false);
            e4.create();
            e4.show();
            postingFragment.T = e4;
        } else if (fmc0Var instanceof fmc0.e) {
            postingFragment.go();
        } else if (fmc0Var instanceof fmc0.g) {
            postingFragment.jo();
        } else if (fmc0Var instanceof fmc0.l) {
            postingFragment.ho((fmc0.l) fmc0Var);
        } else if (!(fmc0Var instanceof fmc0.o)) {
            if (fmc0Var instanceof fmc0.d) {
                ikv0 ikv0Var2 = ((ud20) bpn0Var.getValue()).b;
                if (ikv0Var2 != null) {
                    ikv0Var2.a();
                }
            } else if (fmc0Var instanceof fmc0.v) {
                postingFragment.l0.a((fmc0.v) fmc0Var);
            } else if (fmc0Var instanceof fmc0.a) {
                PostingContentView postingContentView9 = postingFragment.R;
                if (postingContentView9 != null) {
                    postingContentView9.b();
                }
            } else if (fmc0Var instanceof fmc0.i) {
                postingFragment.fo((fmc0.i) fmc0Var);
            } else {
                if (!(fmc0Var instanceof fmc0.x)) {
                    throw new NoWhenBranchMatchedException();
                }
                fmc0.x xVar = (fmc0.x) fmc0Var;
                postingFragment.V.c(xVar.a, xVar.b);
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, kotlin.collections.EmptyList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList<UIBlock> arrayList;
        q q;
        CommunityEventsState.Content items;
        int i = this.b;
        int i2 = 8;
        int i3 = 2;
        int i4 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return a(obj);
            case 1:
                ((g1) obj2).T(b2.a.b);
                return s3q0.a;
            case 2:
                w.a aVar = (w.a) obj2;
                noj0 noj0Var = aVar.v;
                if (noj0Var == null) {
                    return s3q0.a;
                }
                aVar.l.d(new b4.k(noj0Var.a, aVar.m));
                return s3q0.a;
            case 3:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 4:
                ArtistBiographyVh artistBiographyVh = (ArtistBiographyVh) obj2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (artistBiographyVh.j != null && ((arrayList = uIBlockList.y) == null || !arrayList.isEmpty())) {
                    Iterator<T> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String Fb = ((UIBlock) it.next()).Fb();
                            UIBlockArtistBio uIBlockArtistBio = artistBiographyVh.j;
                            if (epx.f(Fb, uIBlockArtistBio != null ? uIBlockArtistBio.y.b : null)) {
                                r4 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(r4);
            case 5:
                dk5 dk5Var = (dk5) obj2;
                StickersDictionaryItem stickersDictionaryItem = (StickersDictionaryItem) obj;
                if (stickersDictionaryItem.d.isEmpty()) {
                    return q.T(stickersDictionaryItem);
                }
                r6e0 B = dk5Var.a.B();
                B.getClass();
                List<StickerItem> list = stickersDictionaryItem.d;
                int i5 = 10;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((StickerItem) it2.next()).b));
                }
                L l = L.a;
                l.getClass();
                LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl [" + Thread.currentThread().getName() + "] getStickersDictionaryWithPromotedStickersObservable ide[" + arrayList2.size() + "]=" + arrayList2});
                }
                q c = B.c(arrayList2);
                if (c == null) {
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl promotedStickersObservable = null"});
                    }
                    q = q.T(stickersDictionaryItem);
                } else {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = EmptyList.b;
                    q = q.q(q.T(stickersDictionaryItem), c.U(new xb20(new ogd(ref$ObjectRef, stickersDictionaryItem, arrayList2, 5), i5)));
                }
                com.vk.movika.sdk.base.flow.binding.c cVar = new com.vk.movika.sdk.base.flow.binding.c(new wr0(i3), 4);
                q.getClass();
                return new n1(q, cVar);
            case 6:
                ((r46) obj2).k(new uxd0.w((Throwable) obj));
                return s3q0.a;
            case 7:
                fw6 fw6Var = (fw6) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    fw6Var.a();
                }
                return s3q0.a;
            case 8:
                ((mx6) obj2).c.j((Throwable) obj);
                return s3q0.a;
            case 9:
                ((d47) obj2).a.b(new xw0.k.a((Throwable) obj));
                return s3q0.a;
            case 10:
                wf8 wf8Var = (wf8) obj2;
                boolean z = wf8Var.v;
                if (z || wf8Var.w) {
                    wf8Var.d(new xf8.h(z, wf8Var.w));
                } else {
                    wf8Var.e();
                }
                return s3q0.a;
            case 11:
                d<Boolean> dVar = ((cb9) obj2).d;
                dVar.getClass();
                return new i0(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new mr(new od3(i4), i2)).y(5000L, TimeUnit.MILLISECONDS);
            case 12:
                iza izaVar = (iza) obj2;
                izaVar.getClass();
                izaVar.e.d(((Throwable) obj) instanceof PostDeletedException ? R.string.vkim_channel_post_deleted : R.string.vkim_channels_message_not_found);
                return s3q0.a;
            case 13:
                ((rkb) obj2).d.c((Throwable) obj, new uw3(7));
                return s3q0.a;
            case 14:
                ((zwb) obj2).Y0(new xxd0.a((Throwable) obj));
                return s3q0.a;
            case 15:
                ((wh50) obj2).setValue(new pco(((pco) obj).b));
                return s3q0.a;
            case 16:
                ffc ffcVar = (ffc) obj2;
                int i6 = rec.j1;
                ffcVar.b(ffcVar.d);
                return s3q0.a;
            case 17:
                eoc eocVar = (eoc) obj2;
                g47 g47Var = (g47) obj;
                tzp0.c.a aVar2 = poc.l1;
                g47Var.b(new h1m(new RxBindingScopeExtKt$bindStates$$inlined$map$1(cdn.a(d370.z(eocVar)), new kz0(i2)), new r(eocVar, 24)));
                l370.m(g47Var, f9t.w(eocVar));
                g47Var.d(new poc.c(eocVar));
                return s3q0.a;
            case 18:
                ((ebd) obj2).s();
                return s3q0.a;
            case 19:
                cfd cfdVar = (cfd) obj2;
                ?? r0 = cfdVar.y0;
                pmc pmcVar = (pmc) obj;
                if (pmcVar instanceof c5u) {
                    ClipVideoFile N7 = cfdVar.N7();
                    if (N7 != null) {
                        zzq zzqVar = (zzq) r0.getValue();
                        c5u c5uVar = (c5u) pmcVar;
                        int i7 = (int) c5uVar.a;
                        long j = c5uVar.b.b;
                        String str = N7.W;
                        zzqVar.getClass();
                        zzq.b(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PIN, i7, j, null, null, str);
                    }
                } else if (pmcVar instanceof vrv0) {
                    zzq zzqVar2 = (zzq) r0.getValue();
                    vrv0 vrv0Var = (vrv0) pmcVar;
                    String str2 = vrv0Var.a;
                    String str3 = vrv0Var.e.a;
                    zzqVar2.getClass();
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_BUY_TICKET, null, null, null, null, null, 62, null), new MobileOfficialAppsFeedStat$TypeFeedTicketItemClick(MobileOfficialAppsFeedStat$TypeFeedTicketItemClick.EntryPoint.PIN, new MobileOfficialAppsConPostingStat$VkTicket(str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null, str3 != null ? new CommonStat$TypeTrackCodeItem(str3) : null)), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c2, b, uzp0Var.a).q();
                } else if (!(pmcVar instanceof l20)) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 20:
                ((com.vk.clips.favorites.impl.ui.folders.list.b) obj2).T(c.d.a.b);
                return s3q0.a;
            case 21:
                xde xdeVar = (xde) obj2;
                if (((bwr0) obj) instanceof wxr0) {
                    xdeVar.j();
                }
                return s3q0.a;
            case 22:
                ((com.vk.clips.playlists.ui.picker.b) obj2).k.b(new uqe.c(((cse.a.C2680a) obj).a));
                return s3q0.a;
            case 23:
                tte tteVar = (tte) obj2;
                zte zteVar = (zte) obj;
                tte.c cVar2 = tte.o1;
                if (zteVar instanceof zte.a) {
                    vve Ff = ((ClipsPlaylistsComponentImpl) tteVar.i1.getValue()).Ff();
                    boolean z2 = ((ClipsPlaylistsFolderLaunchParams) tteVar.n1.getValue(tteVar, tte.p1[3])).c;
                    Ff.getClass();
                    vve.d(rve.a, z2, false);
                } else {
                    if (!zteVar.equals(zte.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvk.u(R.string.loading_error, false);
                }
                return s3q0.a;
            case 24:
                L.e("TemplateFlow", " success");
                ((y7f) obj2).a.finish();
                return s3q0.a;
            case 25:
                return Boolean.valueOf(((lfg) obj2).k0.contains((NewsComment) obj));
            case 26:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((CommunitiesSearchTopBarVh) obj2).h).setValue(bool);
                return s3q0.a;
            case 27:
                s2h s2hVar = (s2h) obj2;
                CommunityEventsState communityEventsState = (CommunityEventsState) obj;
                if (s2hVar.a.isEmpty()) {
                    items = CommunityEventsState.Content.a.a;
                } else {
                    ArrayList arrayList3 = s2hVar.a;
                    items = new CommunityEventsState.Content.Items(arrayList3, arrayList3.size() < s2hVar.b, CommunityEventsState.Content.Items.Paging.None);
                }
                return CommunityEventsState.a(communityEventsState, items);
            case 28:
                ljh ljhVar = (ljh) obj2;
                return new ljh.b((ViewGroup) obj, ljhVar.j, ljhVar.k, ljhVar.l, ljhVar.m, ljhVar.n);
            default:
                ((mph) obj2).f.a.l(new WeakReference<>((View) obj));
                return s3q0.a;
        }
    }
}
