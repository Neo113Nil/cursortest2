package com.vk.cameraui.impl;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.cameraui.ShutterStates;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.content.design.view.camera.AttachWithCounterView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.content.privacy.di.ContentPrivacyComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.camera.CameraEditorContentType;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.im.MsgType;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.dto.stories.entities.StoryImSharingData;
import com.vk.dto.stories.entities.StoryImSharingStats;
import com.vk.dto.stories.entities.StoryLocalPhotoSticker;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.QuestionInfo;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryQuestion;
import com.vk.dto.stories.model.StoryQuestionAnswer;
import com.vk.dto.stories.model.StoryQuestionSharing;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.camera.PhotoParams;
import com.vk.im.engine.models.camera.StoryParams;
import com.vk.im.engine.models.camera.UploadParams;
import com.vk.im.engine.models.camera.VideoParams;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import com.vk.libvideo.live.api.view.BroadcastContract$State;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsActivity;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.masks.MasksController;
import com.vk.masks.dynamic.DynamicMasksUseCase;
import com.vk.media.MediaUtils;
import com.vk.media.camera.CameraObject$CameraMode;
import com.vk.media.entities.CameraPhotoParameters;
import com.vk.media.entities.CameraVideoParameters;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.media.ok.utils.DuetAction;
import com.vk.media.recorder.RecorderBase;
import com.vk.medianative.MediaNative;
import com.vk.metrics.eventtracking.Event;
import com.vk.movika.sdk.base.observable.w;
import com.vk.movika.sdk.base.ui.g0;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.permission.PermissionHelper;
import com.vk.qrcode.QRStatsTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.t0;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vk.storycamera.entity.attach.StoryEditorPhotoAlbumAttachment;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.Features;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.d0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.n;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.l1;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import org.json.JSONArray;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.dto.UserInfo;
import xsna.a2m0;
import xsna.a72;
import xsna.aa6;
import xsna.ai3;
import xsna.am9;
import xsna.an9;
import xsna.anz;
import xsna.aoz;
import xsna.asu0;
import xsna.atd;
import xsna.awt0;
import xsna.b0u0;
import xsna.b7l;
import xsna.b9;
import xsna.bg8;
import xsna.bi9;
import xsna.bld;
import xsna.bm9;
import xsna.bn40;
import xsna.bn9;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwt0;
import xsna.c5g;
import xsna.c7l0;
import xsna.cb;
import xsna.cc50;
import xsna.cdt0;
import xsna.cg8;
import xsna.cn;
import xsna.cqm0;
import xsna.cvk;
import xsna.d0w;
import xsna.d1e0;
import xsna.dh9;
import xsna.dj1;
import xsna.dm9;
import xsna.dod;
import xsna.drm0;
import xsna.dug0;
import xsna.dw20;
import xsna.dwr;
import xsna.e10;
import xsna.e140;
import xsna.e3m;
import xsna.e43;
import xsna.e5;
import xsna.e60;
import xsna.e7;
import xsna.e8r;
import xsna.ec;
import xsna.eg8;
import xsna.ekh;
import xsna.eki0;
import xsna.el3;
import xsna.enj;
import xsna.epx;
import xsna.eqo;
import xsna.ey0;
import xsna.ez2;
import xsna.f2l0;
import xsna.f3m0;
import xsna.f4m;
import xsna.f7;
import xsna.ff3;
import xsna.fig;
import xsna.fj9;
import xsna.fkq0;
import xsna.fo4;
import xsna.fod;
import xsna.fpf0;
import xsna.fxc0;
import xsna.fy2;
import xsna.fza0;
import xsna.g1e;
import xsna.g1e0;
import xsna.g20;
import xsna.g53;
import xsna.g620;
import xsna.g8;
import xsna.g84;
import xsna.go1;
import xsna.gpd;
import xsna.grt0;
import xsna.gv5;
import xsna.gy;
import xsna.gzs;
import xsna.h03;
import xsna.h1e;
import xsna.h5;
import xsna.h6;
import xsna.h7m0;
import xsna.h7u0;
import xsna.hb;
import xsna.he3;
import xsna.hg1;
import xsna.hi3;
import xsna.hm9;
import xsna.ho1;
import xsna.ho9;
import xsna.hx4;
import xsna.hxd;
import xsna.hz10;
import xsna.i0q0;
import xsna.i22;
import xsna.i2w;
import xsna.i4m0;
import xsna.iah0;
import xsna.ij9;
import xsna.im9;
import xsna.io1;
import xsna.io9;
import xsna.iod;
import xsna.it80;
import xsna.itg0;
import xsna.iut0;
import xsna.iwg0;
import xsna.iy2;
import xsna.izs;
import xsna.j5g;
import xsna.j7;
import xsna.jeq0;
import xsna.jgp;
import xsna.jhu0;
import xsna.jm9;
import xsna.jp5;
import xsna.jpd;
import xsna.jsl;
import xsna.k840;
import xsna.ka;
import xsna.ka0;
import xsna.kbk;
import xsna.kl6;
import xsna.km9;
import xsna.kno;
import xsna.kod;
import xsna.kqo;
import xsna.ksl0;
import xsna.ktr;
import xsna.kwg0;
import xsna.kzz;
import xsna.l22;
import xsna.l3e0;
import xsna.l44;
import xsna.l63;
import xsna.l7v;
import xsna.l96;
import xsna.la2;
import xsna.lbk;
import xsna.ld;
import xsna.lf1;
import xsna.llu;
import xsna.lmv;
import xsna.lno;
import xsna.lo9;
import xsna.lsd;
import xsna.lyl0;
import xsna.m8v0;
import xsna.mat0;
import xsna.mf1;
import xsna.mgi;
import xsna.mk9;
import xsna.mo9;
import xsna.mpo;
import xsna.mts;
import xsna.mu1;
import xsna.my10;
import xsna.myc0;
import xsna.mz;
import xsna.n1d;
import xsna.n20;
import xsna.n6j;
import xsna.ne7;
import xsna.ne8;
import xsna.nf1;
import xsna.nf9;
import xsna.nhf0;
import xsna.ni9;
import xsna.nk9;
import xsna.nm9;
import xsna.no3;
import xsna.nov;
import xsna.ns1;
import xsna.nsn;
import xsna.nt;
import xsna.nts;
import xsna.nu0;
import xsna.nv2;
import xsna.o0m0;
import xsna.o0w;
import xsna.o1c;
import xsna.o25;
import xsna.o7m0;
import xsna.o8h;
import xsna.o93;
import xsna.oc0;
import xsna.ocw;
import xsna.oj9;
import xsna.oom0;
import xsna.op0;
import xsna.ov2;
import xsna.p5p;
import xsna.p8;
import xsna.pd;
import xsna.pe8;
import xsna.pf1;
import xsna.ph3;
import xsna.pj4;
import xsna.pjm0;
import xsna.pkj0;
import xsna.ps2;
import xsna.pxo0;
import xsna.pz;
import xsna.q1m0;
import xsna.q8;
import xsna.q850;
import xsna.q9e;
import xsna.qa;
import xsna.qc9;
import xsna.qd1;
import xsna.qgd;
import xsna.qm1;
import xsna.qt0;
import xsna.qx5;
import xsna.qxm0;
import xsna.r1r0;
import xsna.r44;
import xsna.r8;
import xsna.r9;
import xsna.r9e;
import xsna.ra;
import xsna.ra0;
import xsna.rc4;
import xsna.rg10;
import xsna.rgd;
import xsna.rhd;
import xsna.rit0;
import xsna.rkq0;
import xsna.rpo;
import xsna.rsg0;
import xsna.rxo0;
import xsna.s1;
import xsna.s1r0;
import xsna.s3q0;
import xsna.s9e;
import xsna.sa0;
import xsna.sf;
import xsna.sft0;
import xsna.sh6;
import xsna.sit0;
import xsna.sj9;
import xsna.sm9;
import xsna.sov;
import xsna.sqm;
import xsna.swe0;
import xsna.szl0;
import xsna.t20;
import xsna.t6g0;
import xsna.tam0;
import xsna.tf;
import xsna.tf1;
import xsna.tfx;
import xsna.tia0;
import xsna.tj9;
import xsna.tp0;
import xsna.tp1;
import xsna.tqm;
import xsna.txz;
import xsna.u40;
import xsna.u4g0;
import xsna.u90;
import xsna.udm0;
import xsna.uft0;
import xsna.ums0;
import xsna.v4m0;
import xsna.v74;
import xsna.v9;
import xsna.vb;
import xsna.ve0;
import xsna.vh9;
import xsna.vhk0;
import xsna.vkd;
import xsna.vky;
import xsna.vl0;
import xsna.vm9;
import xsna.vr0;
import xsna.vx6;
import xsna.w00;
import xsna.w1m0;
import xsna.wf1;
import xsna.wga;
import xsna.wh9;
import xsna.wm9;
import xsna.wn;
import xsna.wq3;
import xsna.wrp;
import xsna.wud;
import xsna.wzs;
import xsna.x4;
import xsna.x50;
import xsna.x7;
import xsna.xdr0;
import xsna.xee;
import xsna.xga;
import xsna.xkg;
import xsna.xl0;
import xsna.xm9;
import xsna.xmg0;
import xsna.xw70;
import xsna.xy2;
import xsna.y00;
import xsna.y1m0;
import xsna.y34;
import xsna.y50;
import xsna.y89;
import xsna.y8g0;
import xsna.yaa0;
import xsna.yf9;
import xsna.yfb;
import xsna.ykd;
import xsna.ym9;
import xsna.ynd;
import xsna.ysg0;
import xsna.yz10;
import xsna.z77;
import xsna.za;
import xsna.zd9;
import xsna.zhy0;
import xsna.zi9;
import xsna.zkd;
import xsna.zl0;
import xsna.zm9;
import xsna.zsb;
import xsna.zt4;

/* compiled from: CameraUIPresenter.kt */
/* loaded from: classes16.dex */
public final class a implements bm9 {
    public static final int q0 = y8g0.a(R.dimen.camera_preview_width);
    public static final int r0 = y8g0.a(R.dimen.camera_preview_height);
    public io.reactivex.rxjava3.disposables.c A;
    public io.reactivex.rxjava3.disposables.c B;
    public io.reactivex.rxjava3.disposables.c C;
    public io.reactivex.rxjava3.subjects.f<Boolean> D;
    public f E;
    public i F;
    public io.reactivex.rxjava3.disposables.c G;
    public io.reactivex.rxjava3.disposables.c H;
    public io.reactivex.rxjava3.disposables.c I;
    public volatile io.reactivex.rxjava3.disposables.c J;
    public io.reactivex.rxjava3.disposables.c K;
    public final Handler L;
    public final bi9 M;
    public final q850 N;
    public final fo4 O;
    public w1m0 P;
    public final d Q;
    public boolean R;
    public final pxo0 S;
    public ArrayList T;
    public boolean U;
    public StoryCameraMode V;
    public boolean W;
    public int X;
    public final AtomicBoolean Y;
    public boolean Z;
    public boolean a0;
    public final CameraUIView b;
    public boolean b0;
    public final StoryCameraParams c;
    public nhf0 c0;
    public final pkj0 d;
    public long d0;
    public final dm9 e;
    public final bpn0 e0;
    public boolean f;
    public final fza0 f0;
    public final aoz g;
    public volatile boolean g0;
    public DuetAction h0;
    public boolean i0;
    public Integer j;
    public final io.reactivex.rxjava3.disposables.b j0;
    public cn k;
    public final bn9 k0;
    public ActionLinks l0;
    public UserId m0;
    public final C0443a n;
    public int n0;
    public final c o;
    public final zm9 o0;
    public Location p;
    public final jpd p0;
    public Uri q;
    public ne8 r;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public xmg0 x;
    public int y;
    public int z;
    public final am9 h = new am9();
    public final an9 i = new an9();
    public final ym9 l = new ym9(this);
    public final anz m = fxc0.B().T();

    /* compiled from: CameraUIPresenter.kt */
    /* renamed from: com.vk.cameraui.impl.a$a, reason: collision with other inner class name */
    public static final class C0443a {
        public UserId a;
        public String b;
        public Integer c;
        public String d;
        public Long e;
        public BroadcastAuthor.Group f;
    }

    /* compiled from: CameraUIPresenter.kt */
    public final class b implements io9.c {
        public gzs<s3q0> b;

        public b(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.io9.c
        public final void c(Bitmap bitmap, byte[] bArr) {
            a aVar = a.this;
            if (bitmap != null) {
                gzs<s3q0> gzsVar = this.b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                p5p e = aVar.b.getPositions().e();
                if (e != null) {
                    e.t(bitmap);
                }
                aVar.N0();
                if (aVar.c.e.get(aVar.i.H) == StoryCameraMode.VMOJI_CAPTURE) {
                    aVar.C0();
                }
            } else {
                aVar.b.g0();
            }
            this.b = null;
        }
    }

    /* compiled from: CameraUIPresenter.kt */
    public static final class c {
        public UserId a;
    }

    /* compiled from: CameraUIPresenter.kt */
    public final class d {
        public String a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
    }

    /* compiled from: CameraUIPresenter.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BroadcastContract$State.values().length];
            try {
                iArr[BroadcastContract$State.UPCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BroadcastContract$State.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BroadcastContract$State.LIVE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BroadcastContract$State.NOT_INITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BroadcastContract$State.MODEL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BroadcastContract$State.END_SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BroadcastContract$State.LIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StoryCameraMode.values().length];
            try {
                iArr2[StoryCameraMode.CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StoryCameraMode.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StoryCameraMode.STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StoryCameraMode.PING_PONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StoryCameraMode.REVERSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StoryCameraMode.PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[StoryCameraMode.VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StoryCameraMode.STORY_VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[StoryCameraMode.QR_SCANNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[StoryCameraMode.VMOJI_CAPTURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DuetAction.values().length];
            try {
                iArr3[DuetAction.BLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[DuetAction.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[DuetAction.VERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[DuetAction.HOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: CameraUIPresenter.kt */
    public static final class f extends io.reactivex.rxjava3.observers.a<Boolean> {
        public final /* synthetic */ gzs<s3q0> d;

        public f(gzs<s3q0> gzsVar) {
            this.d = gzsVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a aVar = a.this;
            aVar.E = null;
            aVar.D = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            a aVar = a.this;
            aVar.E = null;
            aVar.D = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            ((Boolean) obj).booleanValue();
            this.d.invoke();
        }
    }

    /* compiled from: CameraUIPresenter.kt */
    public static final class g implements izs {
        public final /* synthetic */ AtomicBoolean c;

        public g(AtomicBoolean atomicBoolean) {
            this.c = atomicBoolean;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
        @Override // xsna.izs
        public final Object invoke(Object obj) {
            o7m0 o7m0Var;
            q qVar;
            List list = (List) obj;
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_AUDIO_TRACK;
            storiesFeatures.getClass();
            if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                return q.T(list);
            }
            s0 s0Var = new s0(new xm9(0, this.c, list));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    o7m0Var = 0;
                    break;
                }
                o7m0Var = it.next();
                if (((nov) o7m0Var) instanceof o7m0) {
                    break;
                }
            }
            o7m0 o7m0Var2 = o7m0Var instanceof o7m0 ? o7m0Var : null;
            if (o7m0Var2 == null) {
                qVar = q.T(list);
            } else {
                MusicTrack musicTrack = o7m0Var2.getInfo().b;
                qVar = new io.reactivex.rxjava3.internal.operators.mixed.q(new r(rsg0.w0(new ksl0(musicTrack.c, musicTrack.b, musicTrack.y)), new pj4(new mu1(4, o7m0Var2, a.this), 8)), new b9(new pz(list, 10), 4));
            }
            return qVar.c0(s0Var);
        }
    }

    /* compiled from: CameraUIPresenter.kt */
    public static final class h implements q1m0.a {
        public final C0444a a;

        /* compiled from: CameraUIPresenter.kt */
        /* renamed from: com.vk.cameraui.impl.a$h$a, reason: collision with other inner class name */
        public static final class C0444a implements a2m0 {
            public final /* synthetic */ a a;
            public final /* synthetic */ Context b;

            public C0444a(a aVar, Context context) {
                this.a = aVar;
                this.b = context;
            }

            @Override // xsna.a2m0
            public final void a(long j) {
                ((ImBridgeComponent) this.a.e.k.getValue()).g5().b().d(j, this.b);
            }

            @Override // xsna.a2m0
            public final void b(u90 u90Var, int i) {
                o0w b = ((ImBridgeComponent) this.a.e.k.getValue()).g5().b();
                EmptyList emptyList = EmptyList.b;
                b.c(u90Var, i, null, null, emptyList, emptyList, null);
            }

            @Override // xsna.a2m0
            public final void c(StoryMultiData storyMultiData, long j) {
                storyMultiData.d.d = Collections.singletonList(Long.valueOf(j));
                int i = a.q0;
                this.a.z0(storyMultiData, true, j);
            }
        }

        public h(Context context) {
            this.a = new C0444a(a.this, context);
        }

        @Override // xsna.q1m0.a
        public final void a() {
            a aVar = a.this;
            zd9 camera1View = aVar.b.getCamera1View();
            if (camera1View != null) {
                camera1View.setVisibility(0);
            }
            aVar.B0();
        }

        @Override // xsna.q1m0.a
        public final void b(UserId userId) {
            a aVar = a.this;
            p5p Y = aVar.Y();
            if (Y != null) {
                Y.A2();
            }
            p5p Y2 = aVar.Y();
            if (Y2 != null) {
                Y2.b0();
            }
            CameraUIView cameraUIView = aVar.b;
            Intent intent = new Intent();
            intent.putExtra("UPLOAD_USER_ID", userId);
            s3q0 s3q0Var = s3q0.a;
            cameraUIView.O(-1, intent, false);
        }
    }

    /* compiled from: CameraUIPresenter.kt */
    public static final class j implements DialogInterface.OnDismissListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            Context context;
            a aVar = a.this;
            if (aVar.n0 <= 0 || aVar.i.G) {
                return;
            }
            CameraUIView cameraUIView = aVar.b;
            String id = HintId.INFO_LIVE_BUBBLE_ACTIONS_ADD_MORE.getId();
            Rect rect = new Rect();
            AttachWithCounterView attachWithCounterView = cameraUIView.l;
            Activity h = (attachWithCounterView == null || (context = attachWithCounterView.getContext()) == null) ? null : e3m.h(context);
            AttachWithCounterView attachWithCounterView2 = cameraUIView.l;
            if (attachWithCounterView2 != null) {
                attachWithCounterView2.getGlobalVisibleRect(rect);
            }
            if (h != null) {
                l7v b = cameraUIView.b.h().b();
                b.getClass();
                l7v.b bVar = new l7v.b(id, b, rect);
                bVar.m();
                bVar.i(new l44(cameraUIView, 1));
                bVar.j(h);
            }
        }
    }

    public a(CameraUIView cameraUIView, StoryCameraParams storyCameraParams, pkj0 pkj0Var, dm9 dm9Var) {
        this.b = cameraUIView;
        this.c = storyCameraParams;
        this.d = pkj0Var;
        this.e = dm9Var;
        this.g = new aoz(dm9Var.l);
        this.k = dm9Var.a().o();
        UserId userId = UserId.d;
        C0443a c0443a = new C0443a();
        c0443a.a = userId;
        c0443a.b = null;
        c0443a.c = null;
        c0443a.d = null;
        c0443a.e = null;
        c0443a.f = null;
        this.n = c0443a;
        c cVar = new c();
        cVar.a = userId;
        this.o = cVar;
        this.x = xmg0.b.a;
        this.L = new Handler(Looper.getMainLooper());
        this.M = new bi9(this, cameraUIView);
        Context context = e43.a;
        this.N = new q850(context == null ? null : context);
        Context context2 = e43.a;
        this.O = new fo4(context2 != null ? context2 : null, false);
        d dVar = new d();
        dVar.a = "";
        this.Q = dVar;
        this.S = new pxo0(1500L);
        this.V = StoryCameraMode.STORY;
        this.Y = new AtomicBoolean(false);
        this.a0 = true;
        this.e0 = new bpn0(new hm9(this, 1));
        this.f0 = new fza0();
        this.h0 = DuetAction.CANCEL;
        this.j0 = new io.reactivex.rxjava3.disposables.b();
        this.k0 = new bn9(cameraUIView);
        this.m0 = userId;
        this.o0 = new zm9(this);
        this.p0 = new jpd(this, cameraUIView, new vm9(this, 0), dm9Var);
    }

    public static void G0(a aVar, boolean z, boolean z2, int i2) {
        boolean z3 = (i2 & 2) != 0 ? true : z2;
        boolean z4 = (i2 & 4) != 0;
        boolean z5 = (i2 & 16) == 0;
        aVar.U(z5 ? RecorderBase.RecordingType.CLIP : RecorderBase.RecordingType.ORIGINAL, new nm9(z, false, aVar, z5, z3, z4));
    }

    public static List U0(WebStoryBox webStoryBox) {
        WebServiceInfo webServiceInfo = webStoryBox.i;
        String str = webStoryBox.d;
        String str2 = webStoryBox.b;
        boolean f2 = webServiceInfo != null ? epx.f(webServiceInfo.f, Boolean.TRUE) : false;
        WebServiceInfo webServiceInfo2 = webStoryBox.i;
        boolean f3 = webServiceInfo2 != null ? epx.f(webServiceInfo2.h, Boolean.TRUE) : false;
        boolean Db = webStoryBox.Db();
        boolean f4 = epx.f(str2, "image");
        boolean f5 = epx.f(str2, "video");
        Uri uri = null;
        if ((f4 || f5) && f2 && !Db) {
            Serializer.c<BackgroundInfo> cVar = BackgroundInfo.CREATOR;
            BackgroundInfo b2 = BackgroundInfo.a.b();
            if (str != null) {
                if (!f4) {
                    str = null;
                }
                if (str != null) {
                    uri = brm0.B(str, "http", false) ? Uri.parse(str) : Uri.parse("file://".concat(str));
                }
            }
            return Collections.singletonList(tam0.a.b(false, b2, uri, f3, 4));
        }
        if (f5) {
            return j5g.H0(tam0.x.d(new File(str), webStoryBox.f, Db ? f2 : false, f3), 1);
        }
        if (f4) {
            return Collections.singletonList(tam0.a.c(brm0.B(str, "http", false) ? Uri.parse(str) : Uri.parse("file://".concat(str)), webStoryBox.f, Db ? f2 : false, false, f3, null, 40));
        }
        b7l.a("You can't create story background with " + str2);
        return null;
    }

    public static ArrayList c0(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            nov novVar = (nov) obj;
            if ((novVar instanceof pjm0) || novVar.getStickerLayerType() == 2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static j1 f0(yz10 yz10Var) {
        return q.q(hz10.a(yz10Var, 111, -2, 0, 5, 4), hz10.a(yz10Var, 111, -2, 5, 0, 8)).U(new y34(new vr0(4), 8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024a, code lost:
    
        if (r12 <= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024d, code lost:
    
        r19 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x024f, code lost:
    
        r17 = r5;
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025e, code lost:
    
        if (r12 <= 0) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k0(a aVar, List list, boolean z, boolean z2, int i2) {
        String str;
        String str2;
        List list2;
        WebStoryBox webStoryBox;
        UserId userId;
        tam0 tam0Var;
        nov novVar;
        boolean z3;
        Iterator it;
        boolean z4;
        boolean z5;
        boolean z6;
        Iterator it2;
        long j2;
        int i3;
        List<tam0> list3;
        Mask selectedMask;
        tam0 tam0Var2;
        List<StoryAnswer> list4;
        StoryImSharingStats storyImSharingStats;
        p5p Y;
        w1m0 w1m0Var;
        WebStoryBox webStoryBox2;
        ArrayList y;
        p5p Y2;
        p5p Y3;
        p5p Y4;
        StopwatchView stopwatchView;
        StopwatchView stopwatchView2;
        MasksWrap masksWrap;
        zd9 camera1View;
        dw20 dw20Var;
        androidx.appcompat.app.d dVar;
        androidx.appcompat.app.d dVar2;
        p5p e2;
        p5p Y5;
        String str3;
        nov novVar2;
        int J;
        sov sovVar;
        int i4;
        boolean z7;
        mat0 d2;
        boolean z8 = (i2 & 2) != 0 ? true : z;
        boolean z9 = (i2 & 4) != 0 ? false : z2;
        boolean z10 = (i2 & 8) == 0;
        an9 an9Var = aVar.i;
        StoryCameraParams storyCameraParams = aVar.c;
        am9 am9Var = aVar.h;
        CameraUIView cameraUIView = aVar.b;
        if (list.isEmpty()) {
            return;
        }
        aVar.u0();
        d dVar3 = aVar.Q;
        if (list.size() == 1) {
            tam0 tam0Var3 = (tam0) list.get(0);
            str = tam0Var3.c ? tam0Var3.f() ? "camera_photo" : "camera_video" : tam0Var3.f() ? "gallery_photo" : "gallery_video";
        } else {
            str = list.size() > 1 ? "gallery_multi" : "";
        }
        dVar3.a = str;
        am9.a aVar2 = am9Var.a;
        if (list.size() == 1) {
            tam0 tam0Var4 = (tam0) list.get(0);
            if (tam0Var4.c) {
                str2 = tam0Var4.f() ? "photo" : "video";
                aVar2.f = str2;
                am9Var.b("change_state", new mz(am9Var, 17));
                aVar.y0();
                if (list.size() > 50) {
                    cvk.u(R.string.camera_ui_too_much_stories, false);
                }
                list2 = list;
                List<tam0> H0 = j5g.H0(list2, 50);
                List<? extends StoryCameraMode> list5 = storyCameraParams.e;
                webStoryBox = storyCameraParams.u;
                userId = storyCameraParams.g;
                StoryCameraMode storyCameraMode = list5.get(an9Var.H);
                tam0Var = (tam0) j5g.a0(list);
                h7m0 i5 = cameraUIView.getStickersState().i();
                novVar = !(i5 instanceof nov) ? (nov) i5 : null;
                if (novVar == null) {
                    z3 = z10;
                    if (!storyCameraMode.i()) {
                        if (((tam0Var == null || (d2 = tam0Var.d()) == null) ? Integer.MAX_VALUE : d2.a()) <= 1000) {
                            cameraUIView.getStickersState().w(novVar);
                            cvk.u(R.string.story_music_dialog_very_short_video, true);
                        }
                    }
                } else {
                    z3 = z10;
                }
                List<nov> stickersCopy = cameraUIView.getStickersCopy();
                cameraUIView.s();
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (((tam0) it.next()).g()) {
                            z4 = true;
                            break;
                        }
                    }
                }
                z4 = false;
                if (!z4) {
                    List<nov> list6 = stickersCopy;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator<T> it3 = list6.iterator();
                        while (it3.hasNext()) {
                            if (((nov) it3.next()) instanceof lo9) {
                                z7 = true;
                                break;
                            }
                        }
                    }
                    z7 = false;
                    if (!z7) {
                        z5 = false;
                        z6 = storyCameraParams.J != null;
                        int i6 = 255;
                        if (tam0Var != null) {
                            Iterator it4 = stickersCopy.iterator();
                            while (it4.hasNext()) {
                                Iterator it5 = it4;
                                nov novVar3 = (nov) it4.next();
                                novVar3.setStickerAlpha(i6);
                                if ((novVar3 instanceof dh9) || (novVar3 instanceof qx5)) {
                                    if (z9) {
                                        novVar3.setStickerVisible(true);
                                    } else {
                                        if (novVar3 instanceof grt0) {
                                            ((grt0) novVar3).w();
                                        }
                                        it4 = it5;
                                        i6 = 255;
                                    }
                                }
                                if (novVar3 instanceof u4g0) {
                                    ((u4g0) novVar3).setShowOnlyFirstFrame(z5);
                                }
                                if (!(novVar3 instanceof sov) || !z6) {
                                    tam0Var.h.a(novVar3);
                                }
                                it4 = it5;
                                i6 = 255;
                            }
                        }
                        List<tam0> list7 = H0;
                        it2 = list7.iterator();
                        while (it2.hasNext()) {
                            mat0 d3 = ((tam0) it2.next()).d();
                            if (d3 != null) {
                                d3.f = !z6;
                            }
                        }
                        if (z6) {
                            CopyOnWriteArrayList<nov> copyOnWriteArrayList = cameraUIView.getStickersState().a;
                            int i7 = 0;
                            while (true) {
                                if (i7 == copyOnWriteArrayList.size()) {
                                    novVar2 = null;
                                    break;
                                } else {
                                    if (copyOnWriteArrayList.get(i7) instanceof sov) {
                                        novVar2 = copyOnWriteArrayList.get(i7);
                                        break;
                                    }
                                    i7++;
                                }
                            }
                            sov sovVar2 = (sov) novVar2;
                            if (sovVar2 != null) {
                                StoryMusicInfo info = sovVar2.getInfo();
                                int i8 = sovVar2.getInfo().d;
                                Iterator it6 = list7.iterator();
                                int i9 = i8;
                                while (it6.hasNext()) {
                                    tam0 tam0Var5 = (tam0) it6.next();
                                    mat0 d4 = tam0Var5.d();
                                    Iterator it7 = it6;
                                    if (d4 != null) {
                                        d4.e = true;
                                    }
                                    sov sovVar3 = (sov) sovVar2.copy();
                                    int i10 = 5000;
                                    if (!tam0Var5.g()) {
                                        o0m0 o0m0Var = o0m0.b;
                                        J = o25.a().J();
                                    } else if (d4 != null) {
                                        i4 = d4.a();
                                        sovVar = sovVar2;
                                    } else {
                                        o0m0 o0m0Var2 = o0m0.b;
                                        J = o25.a().J();
                                    }
                                    int min = StrictMath.min(info.b.c0 - info.d, i4) + i9;
                                    StoryMusicInfo storyMusicInfo = info;
                                    sovVar3.c(StoryMusicInfo.zb(storyMusicInfo, null, i9, min, null, 0, 8179));
                                    sovVar3.setStickerAlpha(255);
                                    tam0Var5.h.a(sovVar3);
                                    it6 = it7;
                                    sovVar2 = sovVar;
                                    info = storyMusicInfo;
                                    i9 = min;
                                }
                            }
                        }
                        CameraUIView cameraUIView2 = aVar.b;
                        CommonUploadParams commonUploadParams = new CommonUploadParams(null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, MinElf.PN_XNUM, null);
                        commonUploadParams.b = aVar.e.a().c();
                        commonUploadParams.f = storyCameraParams.n;
                        commonUploadParams.g = storyCameraParams.f;
                        if (fkq0.b(userId)) {
                            commonUploadParams.e = fkq0.e(userId);
                        }
                        j2 = storyCameraParams.q;
                        if (j2 != 0) {
                            commonUploadParams.d = Collections.singletonList(Long.valueOf(j2));
                        }
                        i3 = e.$EnumSwitchMapping$1[storyCameraParams.d.ordinal()];
                        if (i3 == 1) {
                            list3 = H0;
                            String n = cqm0.n(storyCameraParams.c);
                            switch (n.hashCode()) {
                                case -1589557359:
                                    if (n.equals("CLIPS_DUET_MAKE")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case -1576495913:
                                    if (n.equals("CLUB_CLIPS_BUTTON")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case -1422646397:
                                    if (n.equals("CLUB_PLUS")) {
                                        commonUploadParams.h = "CLUB_PLUS_CLIPS";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case -724355440:
                                    if (n.equals("PROFILE_PLUS")) {
                                        commonUploadParams.h = "PROFILE_PLUS_CLIPS";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case -132061560:
                                    if (n.equals("CLIPS_GRID_MUSIC")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case 470743758:
                                    if (n.equals("CLIPS_VIEWER")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case 1147040571:
                                    if (n.equals("CATALOG_ADD")) {
                                        commonUploadParams.h = "FROM_VIDEO";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case 1172255643:
                                    if (n.equals("FEED_PLUS")) {
                                        commonUploadParams.h = "FEED_PLUS_CLIPS";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case 1212756693:
                                    if (n.equals("CLIP_GRID")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case 1222714223:
                                    if (n.equals("CLIPS_GRID_HASHTAG")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case 1482574564:
                                    if (n.equals("PROFILE_CLIPS_BUTTON")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                case 1488733389:
                                    if (n.equals("MY_CLIPS_LIST")) {
                                        commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                        break;
                                    }
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                                default:
                                    commonUploadParams.h = "FROM_CLIPS_CAMERA";
                                    break;
                            }
                        } else if (i3 != 2) {
                            String str4 = aVar2.a;
                            if (str4 == null) {
                                str4 = storyCameraParams.c;
                            }
                            commonUploadParams.h = str4;
                            list3 = H0;
                        } else {
                            String n2 = cqm0.n(storyCameraParams.c);
                            int hashCode = n2.hashCode();
                            list3 = H0;
                            if (hashCode == -724355440) {
                                if (n2.equals("PROFILE_PLUS")) {
                                    commonUploadParams.h = "PROFILE_PLUS_LIVE";
                                }
                                str3 = aVar2.a;
                                if (str3 == null) {
                                }
                                commonUploadParams.h = str3;
                            } else if (hashCode != 1147040571) {
                                if (hashCode == 1172255643 && n2.equals("FEED_PLUS")) {
                                    commonUploadParams.h = "FEED_PLUS_LIVE";
                                }
                                str3 = aVar2.a;
                                if (str3 == null) {
                                    str3 = storyCameraParams.c;
                                }
                                commonUploadParams.h = str3;
                            } else {
                                if (n2.equals("CATALOG_ADD")) {
                                    commonUploadParams.h = "FROM_VIDEO";
                                }
                                str3 = aVar2.a;
                                if (str3 == null) {
                                }
                                commonUploadParams.h = str3;
                            }
                        }
                        String str5 = commonUploadParams.h;
                        commonUploadParams.h = str5 != null ? cqm0.m(str5) : null;
                        commonUploadParams.j = storyCameraParams.b;
                        commonUploadParams.l = storyCameraParams.y;
                        commonUploadParams.n = storyCameraParams.I;
                        commonUploadParams.o = storyCameraParams.T;
                        commonUploadParams.q = storyCameraParams.X;
                        StoryUploadParams storyUploadParams = new StoryUploadParams();
                        storyUploadParams.e = aVar.p;
                        selectedMask = cameraUIView.getSelectedMask();
                        if (selectedMask != null) {
                            storyUploadParams.d = Integer.valueOf(selectedMask.h);
                        }
                        tam0Var2 = (tam0) list.get(0);
                        boolean z11 = list.size() > 1;
                        if (tam0Var2.g) {
                            storyUploadParams.f = StoryUploadParams.CameraType.REPOST;
                        } else if (webStoryBox != null) {
                            storyUploadParams.f = StoryUploadParams.CameraType.STORY_BOX;
                        } else if (tam0Var2.c) {
                            zd9 camera1View2 = cameraUIView.getCamera1View();
                            boolean z12 = (camera1View2 != null ? camera1View2.getCurrentMode() : null) == CameraObject$CameraMode.BACK;
                            storyUploadParams.f = z11 ? z12 ? StoryUploadParams.CameraType.BACK_MULTI_VIDEO : StoryUploadParams.CameraType.FRONT_MULTI_VIDEO : z12 ? StoryUploadParams.CameraType.BACK : StoryUploadParams.CameraType.FRONT;
                            zd9 camera1View3 = cameraUIView.getCamera1View();
                            storyUploadParams.l = Boolean.valueOf(camera1View3 != null && camera1View3.getFlashMode() == 2);
                        } else {
                            storyUploadParams.f = z11 ? StoryUploadParams.CameraType.GALLERY_MULTI : StoryUploadParams.CameraType.GALLERY;
                        }
                        storyUploadParams.i = storyCameraParams.B0 ? "COLLAGE".toLowerCase(Locale.ROOT) : aVar2.e;
                        list4 = storyCameraParams.L;
                        if (list4 != null) {
                            List<StoryAnswer> list8 = list4;
                            ArrayList arrayList = new ArrayList(c5g.u(list8, 10));
                            for (StoryAnswer storyAnswer : list8) {
                                arrayList.add(new QuestionInfo(storyAnswer.d, storyAnswer.b, storyAnswer.c));
                            }
                            storyUploadParams.v = arrayList;
                        }
                        storyUploadParams.s = storyCameraParams.K;
                        storyUploadParams.x = storyCameraParams.Y;
                        storyUploadParams.u = false;
                        StoryQuestion storyQuestion = storyCameraParams.f0;
                        storyUploadParams.y = storyQuestion instanceof StoryQuestionAnswer ? ((StoryQuestionAnswer) storyQuestion).b : epx.f(storyQuestion, StoryQuestionSharing.b) ? 1 : null;
                        storyImSharingStats = tam0Var2.s;
                        if (storyImSharingStats != null) {
                            storyUploadParams.M = Long.valueOf(storyImSharingStats.b);
                            storyUploadParams.N = Long.valueOf(storyImSharingStats.c);
                            String str6 = tam0Var2.r != null ? "VIDEO_MESSAGE" : tam0Var2.g() ? SignalingProtocol.MEDIA_OPTION_VIDEO : tam0Var2.f() ? "PHOTO" : aVar2.e;
                            storyUploadParams.i = str6 != null ? str6.toLowerCase(Locale.ROOT) : null;
                        }
                        View b2 = cameraUIView2.l(list3, commonUploadParams, storyUploadParams, storyCameraMode, aVar.c).b();
                        cameraUIView.r();
                        aVar.P0(false);
                        Y = aVar.Y();
                        if (Y != null) {
                            Y.z0();
                        }
                        w1m0Var = aVar.P;
                        if (w1m0Var != null && (Y5 = aVar.Y()) != null) {
                            Y5.p(w1m0Var, z9);
                        }
                        List<StoryCameraGalleryData> list9 = storyCameraParams.C;
                        boolean isEmpty = list9 != null ? list9.isEmpty() : true;
                        if (webStoryBox != null || ((isEmpty && !webStoryBox.Bb()) || aVar.f)) {
                            webStoryBox2 = storyCameraParams.u;
                            if ((webStoryBox2 == null && webStoryBox2.Db()) && (y = aVar.y()) != null && (Y2 = aVar.Y()) != null) {
                                Y2.j(y);
                            }
                        } else {
                            bwt0.T(b2, new com.vk.im.engine.commands.messages.a(3, aVar, webStoryBox));
                        }
                        Y3 = aVar.Y();
                        if (Y3 != null) {
                            Y3.u();
                        }
                        Y4 = aVar.Y();
                        CameraUIView cameraUIView3 = aVar.b;
                        if (Y4 != null) {
                            Y4.r(storyCameraParams.o);
                        }
                        if (!storyCameraParams.p0) {
                            cameraUIView3.m();
                        }
                        cameraUIView3.g1 = true;
                        stopwatchView = cameraUIView3.B0;
                        if (stopwatchView != null) {
                            stopwatchView.a(false);
                        }
                        stopwatchView2 = cameraUIView3.M0;
                        if (stopwatchView2 != null) {
                            stopwatchView2.a(false);
                        }
                        masksWrap = cameraUIView3.b0;
                        if (masksWrap != null) {
                            masksWrap.u();
                        }
                        camera1View = cameraUIView3.getCamera1View();
                        if (camera1View != null) {
                            camera1View.N();
                        }
                        aVar.v0();
                        an9Var.p = true;
                        cameraUIView.getPositions().d();
                        cameraUIView.setShutterPosition(z8);
                        lsd lsdVar = aVar.p0.j;
                        dw20Var = lsdVar.g;
                        if (dw20Var != null) {
                            dw20Var.hide();
                        }
                        dVar = lsdVar.h;
                        if (dVar != null) {
                            dVar.hide();
                        }
                        dVar2 = lsdVar.h;
                        if (dVar2 != null) {
                            dVar2.dismiss();
                        }
                        if (fkq0.c(userId)) {
                            i4m0 i4m0Var = i4m0.e;
                            T t = i4m0Var.b;
                            long j3 = i4m0Var.c;
                            if ((t == 0 || System.currentTimeMillis() - j3 >= i4m0Var.a) && i4m0Var.d == null) {
                                i4m0Var.c();
                            }
                        }
                        if (storyCameraParams.P) {
                            aVar.L.post(new a72(aVar, 5));
                        }
                        if (!z3 || (e2 = cameraUIView.getPositions().e()) == null) {
                            return;
                        }
                        e2.n();
                        return;
                    }
                }
                z5 = true;
                if (storyCameraParams.J != null) {
                }
                int i62 = 255;
                if (tam0Var != null) {
                }
                List<tam0> list72 = H0;
                it2 = list72.iterator();
                while (it2.hasNext()) {
                }
                if (z6) {
                }
                CameraUIView cameraUIView22 = aVar.b;
                CommonUploadParams commonUploadParams2 = new CommonUploadParams(null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, MinElf.PN_XNUM, null);
                commonUploadParams2.b = aVar.e.a().c();
                commonUploadParams2.f = storyCameraParams.n;
                commonUploadParams2.g = storyCameraParams.f;
                if (fkq0.b(userId)) {
                }
                j2 = storyCameraParams.q;
                if (j2 != 0) {
                }
                i3 = e.$EnumSwitchMapping$1[storyCameraParams.d.ordinal()];
                if (i3 == 1) {
                }
                String str52 = commonUploadParams2.h;
                commonUploadParams2.h = str52 != null ? cqm0.m(str52) : null;
                commonUploadParams2.j = storyCameraParams.b;
                commonUploadParams2.l = storyCameraParams.y;
                commonUploadParams2.n = storyCameraParams.I;
                commonUploadParams2.o = storyCameraParams.T;
                commonUploadParams2.q = storyCameraParams.X;
                StoryUploadParams storyUploadParams2 = new StoryUploadParams();
                storyUploadParams2.e = aVar.p;
                selectedMask = cameraUIView.getSelectedMask();
                if (selectedMask != null) {
                }
                tam0Var2 = (tam0) list.get(0);
                if (list.size() > 1) {
                }
                if (tam0Var2.g) {
                }
                storyUploadParams2.i = storyCameraParams.B0 ? "COLLAGE".toLowerCase(Locale.ROOT) : aVar2.e;
                list4 = storyCameraParams.L;
                if (list4 != null) {
                }
                storyUploadParams2.s = storyCameraParams.K;
                storyUploadParams2.x = storyCameraParams.Y;
                storyUploadParams2.u = false;
                StoryQuestion storyQuestion2 = storyCameraParams.f0;
                storyUploadParams2.y = storyQuestion2 instanceof StoryQuestionAnswer ? ((StoryQuestionAnswer) storyQuestion2).b : epx.f(storyQuestion2, StoryQuestionSharing.b) ? 1 : null;
                storyImSharingStats = tam0Var2.s;
                if (storyImSharingStats != null) {
                }
                View b22 = cameraUIView22.l(list3, commonUploadParams2, storyUploadParams2, storyCameraMode, aVar.c).b();
                cameraUIView.r();
                aVar.P0(false);
                Y = aVar.Y();
                if (Y != null) {
                }
                w1m0Var = aVar.P;
                if (w1m0Var != null) {
                    Y5.p(w1m0Var, z9);
                }
                List<StoryCameraGalleryData> list92 = storyCameraParams.C;
                if (list92 != null) {
                }
                if (webStoryBox != null) {
                }
                webStoryBox2 = storyCameraParams.u;
                if (webStoryBox2 == null && webStoryBox2.Db()) {
                    Y2.j(y);
                }
                Y3 = aVar.Y();
                if (Y3 != null) {
                }
                Y4 = aVar.Y();
                CameraUIView cameraUIView32 = aVar.b;
                if (Y4 != null) {
                }
                if (!storyCameraParams.p0) {
                }
                cameraUIView32.g1 = true;
                stopwatchView = cameraUIView32.B0;
                if (stopwatchView != null) {
                }
                stopwatchView2 = cameraUIView32.M0;
                if (stopwatchView2 != null) {
                }
                masksWrap = cameraUIView32.b0;
                if (masksWrap != null) {
                }
                camera1View = cameraUIView32.getCamera1View();
                if (camera1View != null) {
                }
                aVar.v0();
                an9Var.p = true;
                cameraUIView.getPositions().d();
                cameraUIView.setShutterPosition(z8);
                lsd lsdVar2 = aVar.p0.j;
                dw20Var = lsdVar2.g;
                if (dw20Var != null) {
                }
                dVar = lsdVar2.h;
                if (dVar != null) {
                }
                dVar2 = lsdVar2.h;
                if (dVar2 != null) {
                }
                if (fkq0.c(userId)) {
                }
                if (storyCameraParams.P) {
                }
                if (z3) {
                    return;
                } else {
                    return;
                }
            }
        }
        str2 = null;
        aVar2.f = str2;
        am9Var.b("change_state", new mz(am9Var, 17));
        aVar.y0();
        if (list.size() > 50) {
        }
        list2 = list;
        List<tam0> H02 = j5g.H0(list2, 50);
        List<? extends StoryCameraMode> list52 = storyCameraParams.e;
        webStoryBox = storyCameraParams.u;
        userId = storyCameraParams.g;
        StoryCameraMode storyCameraMode2 = list52.get(an9Var.H);
        tam0Var = (tam0) j5g.a0(list);
        h7m0 i52 = cameraUIView.getStickersState().i();
        if (!(i52 instanceof nov)) {
        }
        if (novVar == null) {
        }
        List<nov> stickersCopy2 = cameraUIView.getStickersCopy();
        cameraUIView.s();
        if (list2 instanceof Collection) {
        }
        it = list2.iterator();
        while (it.hasNext()) {
        }
        z4 = false;
        if (!z4) {
        }
        z5 = true;
        if (storyCameraParams.J != null) {
        }
        int i622 = 255;
        if (tam0Var != null) {
        }
        List<tam0> list722 = H02;
        it2 = list722.iterator();
        while (it2.hasNext()) {
        }
        if (z6) {
        }
        CameraUIView cameraUIView222 = aVar.b;
        CommonUploadParams commonUploadParams22 = new CommonUploadParams(null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, MinElf.PN_XNUM, null);
        commonUploadParams22.b = aVar.e.a().c();
        commonUploadParams22.f = storyCameraParams.n;
        commonUploadParams22.g = storyCameraParams.f;
        if (fkq0.b(userId)) {
        }
        j2 = storyCameraParams.q;
        if (j2 != 0) {
        }
        i3 = e.$EnumSwitchMapping$1[storyCameraParams.d.ordinal()];
        if (i3 == 1) {
        }
        String str522 = commonUploadParams22.h;
        commonUploadParams22.h = str522 != null ? cqm0.m(str522) : null;
        commonUploadParams22.j = storyCameraParams.b;
        commonUploadParams22.l = storyCameraParams.y;
        commonUploadParams22.n = storyCameraParams.I;
        commonUploadParams22.o = storyCameraParams.T;
        commonUploadParams22.q = storyCameraParams.X;
        StoryUploadParams storyUploadParams22 = new StoryUploadParams();
        storyUploadParams22.e = aVar.p;
        selectedMask = cameraUIView.getSelectedMask();
        if (selectedMask != null) {
        }
        tam0Var2 = (tam0) list.get(0);
        if (list.size() > 1) {
        }
        if (tam0Var2.g) {
        }
        storyUploadParams22.i = storyCameraParams.B0 ? "COLLAGE".toLowerCase(Locale.ROOT) : aVar2.e;
        list4 = storyCameraParams.L;
        if (list4 != null) {
        }
        storyUploadParams22.s = storyCameraParams.K;
        storyUploadParams22.x = storyCameraParams.Y;
        storyUploadParams22.u = false;
        StoryQuestion storyQuestion22 = storyCameraParams.f0;
        storyUploadParams22.y = storyQuestion22 instanceof StoryQuestionAnswer ? ((StoryQuestionAnswer) storyQuestion22).b : epx.f(storyQuestion22, StoryQuestionSharing.b) ? 1 : null;
        storyImSharingStats = tam0Var2.s;
        if (storyImSharingStats != null) {
        }
        View b222 = cameraUIView222.l(list3, commonUploadParams22, storyUploadParams22, storyCameraMode2, aVar.c).b();
        cameraUIView.r();
        aVar.P0(false);
        Y = aVar.Y();
        if (Y != null) {
        }
        w1m0Var = aVar.P;
        if (w1m0Var != null) {
        }
        List<StoryCameraGalleryData> list922 = storyCameraParams.C;
        if (list922 != null) {
        }
        if (webStoryBox != null) {
        }
        webStoryBox2 = storyCameraParams.u;
        if (webStoryBox2 == null && webStoryBox2.Db()) {
        }
        Y3 = aVar.Y();
        if (Y3 != null) {
        }
        Y4 = aVar.Y();
        CameraUIView cameraUIView322 = aVar.b;
        if (Y4 != null) {
        }
        if (!storyCameraParams.p0) {
        }
        cameraUIView322.g1 = true;
        stopwatchView = cameraUIView322.B0;
        if (stopwatchView != null) {
        }
        stopwatchView2 = cameraUIView322.M0;
        if (stopwatchView2 != null) {
        }
        masksWrap = cameraUIView322.b0;
        if (masksWrap != null) {
        }
        camera1View = cameraUIView322.getCamera1View();
        if (camera1View != null) {
        }
        aVar.v0();
        an9Var.p = true;
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(z8);
        lsd lsdVar22 = aVar.p0.j;
        dw20Var = lsdVar22.g;
        if (dw20Var != null) {
        }
        dVar = lsdVar22.h;
        if (dVar != null) {
        }
        dVar2 = lsdVar22.h;
        if (dVar2 != null) {
        }
        if (fkq0.c(userId)) {
        }
        if (storyCameraParams.P) {
        }
        if (z3) {
        }
    }

    @Override // xsna.di10
    public final void A() {
        ne8 ne8Var = this.r;
        if (ne8Var != null) {
            ne8Var.b1();
        }
        this.s = false;
        an9 an9Var = this.i;
        an9Var.r = false;
        CameraUIView cameraUIView = this.b;
        cameraUIView.getPositions().d();
        cameraUIView.Z(an9Var.r);
    }

    @Override // xsna.bm9
    public final StoryCameraParams A0() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bm9
    public final void A3(boolean z, boolean z2) {
        jpd jpdVar = this.p0;
        if (jpdVar.e.a().b()) {
            h1e h1eVar = jpdVar.t;
            h1eVar.getClass();
            boolean z3 = false;
            boolean z4 = z && !h1eVar.e;
            if (z2 && !h1eVar.d) {
                z3 = true;
            }
            if (z4 || z3) {
                ((io.reactivex.rxjava3.disposables.g) h1eVar.f.getValue()).b(rsg0.T(yfb.x(mts.a.b((nts) h1eVar.n.getValue(), h1eVar.b.c(), FriendsGetOrderDto.HINTS, null, 10, null, h1e.p, null, null, 980))).t0(1L).w(new aa6(new nt(18), 8)).U(new nu0(new la2(10), 10)).E0().m(asu0.a.d()).subscribe(new nf1(new g1e(h1eVar, z3), 12), new sh6(new p8(L.a, 1), 9)));
            } else {
                h1eVar.a.d(h1eVar.c);
            }
        }
    }

    @Override // xsna.bm9
    public final void A4() {
        h1e h1eVar = this.p0.t;
        if (!h1eVar.h.isEmpty()) {
            h1eVar.a.e(h1eVar.h);
            return;
        }
        xy2 e2 = wga.e(new xga(), null, "/audio_clips?section=playlist&block=random", null, 25);
        tfx tfxVar = (tfx) e2;
        ez2 ez2Var = new ez2(e2, tfxVar.a);
        ez2Var.i = tfxVar.e;
        ez2Var.j.putAll(tfxVar.d);
        h1eVar.i.b(rsg0.T(ez2Var).w(new ps2(new com.vk.movika.sdk.base.observable.i(13), 11)).w(new op0(new x4(17), 6)).E0().m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new zl0(new ka(h1eVar, 23), 10), new mf1(new q8(L.a, 2), 10)));
    }

    @Override // xsna.liz
    public final void B() {
        CameraUIView cameraUIView = this.b;
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            camera1View.h();
        }
        am9 am9Var = this.h;
        am9.a aVar = am9Var.a;
        zd9 camera1View2 = cameraUIView.getCamera1View();
        aVar.l = (camera1View2 != null ? camera1View2.getCurrentMode() : null) == CameraObject$CameraMode.FRONT;
        zd9 camera1View3 = cameraUIView.getCamera1View();
        am9Var.b("switch_camera", new qd1(4, (camera1View3 != null ? camera1View3.getCurrentMode() : null) == CameraObject$CameraMode.BACK ? "back" : "front", am9Var));
        am9Var.c(StoryPublishEvent.SWITCH_CAMERA, new e5(am9Var, 17));
    }

    public final void B0() {
        boolean z = false;
        if (Preference.f("clips_camera_settings").getBoolean("camera_grid", false) && p0()) {
            z = true;
        }
        L.e(zhy0.a("grid visible ", z));
        this.b.setCameraGridVisible(z);
    }

    @Override // xsna.bm9
    public final void B3() {
        CameraUIView cameraUIView = this.b;
        cameraUIView.d0();
        cameraUIView.requestFocus();
        Activity h2 = e3m.h(cameraUIView.getContext());
        if (h2 != null) {
            yf9.b o = this.e.o();
            C0443a c0443a = this.n;
            UserId userId = c0443a.a;
            Integer num = c0443a.c;
            ((fig) o).getClass();
            Intent intent = new Intent(h2, (Class<?>) BroadcastSettingsActivity.class);
            intent.putExtra("extra_preselected_author_id", userId);
            intent.putExtra("extra_preselected_stream_id", num);
            h2.startActivityForResult(intent, 4);
        }
    }

    @Override // xsna.bm9
    public final zm9 B4() {
        return this.o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // xsna.liz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(sit0 sit0Var, rit0 rit0Var, boolean z) {
        mo9.b bVar;
        sit0 sit0Var2;
        mo9.b bVar2;
        mo9.b bVar3;
        com.vk.media.recorder.f fVar;
        i();
        CameraUIView cameraUIView = this.b;
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            String liveNameText = cameraUIView.getLiveNameText();
            if (liveNameText != null) {
                bpn0 bpn0Var = ni9.a;
                Features.Type type = Features.Type.FEATURE_CLIPS_LIVES_DEBUG_TWEAK_TARGET;
                type.getClass();
                String i0 = (com.vk.toggle.b.A.a(type) && (brm0.B(liveNameText, "okmp://", true) || brm0.B(liveNameText, "rtmp://", true))) ? drm0.i0('|', liveNameText, "") : "";
                if (myc0.f(i0)) {
                    sit0Var2 = new sit0(sit0Var.a, brm0.B(liveNameText, "rtmp://", true) ? drm0.m0('|', liveNameText, "") : null, brm0.B(liveNameText, "okmp://", true) ? drm0.m0('|', liveNameText, "") : null, i0);
                    if (sit0Var2 != null) {
                        sit0Var = sit0Var2;
                    }
                    bVar2 = camera1View.s;
                    if (bVar2 != null) {
                        String str = sit0Var.a;
                        String str2 = sit0Var.b;
                        String str3 = sit0Var.c;
                        String str4 = sit0Var.d;
                        com.vk.media.recorder.f fVar2 = bVar2.a;
                        if (fVar2 != null) {
                            StringBuilder sb = new StringBuilder("setStreamingTargets() - state= ");
                            sb.append(fVar2.r);
                            sb.append(" rtmpUrl= ");
                            sb.append(str2);
                            sb.append(" okmpUrl= ");
                            n6j.b(sb, str3, " key= ", str4, " liveOvId= ");
                            sb.append(str);
                            ne7.t("RecorderBase", sb.toString());
                            fVar2.B = str;
                            fVar2.n = str2;
                            fVar2.o = str3;
                            fVar2.p = str4;
                        }
                    }
                    bVar3 = camera1View.s;
                    if (bVar3 != null && (fVar = bVar3.a) != null) {
                        fVar.C = z;
                    }
                    camera1View.r = rit0Var;
                }
            }
            sit0Var2 = null;
            if (sit0Var2 != null) {
            }
            bVar2 = camera1View.s;
            if (bVar2 != null) {
            }
            bVar3 = camera1View.s;
            if (bVar3 != null) {
                fVar.C = z;
            }
            camera1View.r = rit0Var;
        }
        zd9 camera1View2 = cameraUIView.getCamera1View();
        if (camera1View2 != null && (bVar = camera1View2.s) != null) {
            jhu0 jhu0Var = camera1View2.m;
            bVar.b = jhu0Var;
            if (bVar.a == null || jhu0Var == null) {
                Log.e("CameraRecorder", "error: can't setup on empty camera, recorder!");
            }
        }
        zd9 camera1View3 = cameraUIView.getCamera1View();
        if (camera1View3 != null) {
            camera1View3.u(null);
        }
    }

    public final void C0() {
        p5p Y = Y();
        if (Y != null) {
            Y.c();
        }
    }

    @Override // xsna.bm9
    public final int C3() {
        jpd jpdVar = this.p0;
        wud wudVar = jpdVar.i;
        wud wudVar2 = jpdVar.i;
        int i2 = wudVar.b;
        jpd.r(jpdVar, 3);
        int i3 = ynd.c;
        if (i2 == i3) {
            i2 = ynd.b;
        } else if (i2 == ynd.b) {
            i2 = i3;
        }
        jpdVar.l.d = 0;
        wudVar2.b = i2;
        wudVar2.a.setClipsProgressMaxDurationMs(i2);
        return (int) TimeUnit.MILLISECONDS.toMinutes(wudVar2.b);
    }

    @Override // xsna.bm9
    public final void C4() {
        this.Q.c = true;
        boolean i2 = c4().i();
        CameraUIView cameraUIView = this.b;
        if (i2) {
            zkd zkdVar = this.p0.w;
            zkdVar.a.d(1, zkdVar.b, new ykd(cameraUIView.getIsFullHdCamera(), 0));
        } else {
            this.e.d().w0().h().d(1, cameraUIView.getContext(), new zt4(this, 5));
        }
        this.h.c(StoryPublishEvent.OPEN_GALLERY, null);
    }

    @Override // xsna.liz
    public final void D(boolean z) {
        com.vk.media.recorder.f fVar;
        if (z) {
            zd9 camera1View = this.b.getCamera1View();
            if (camera1View != null) {
                L.e("CameraPreviewBase", "finish live");
                StopwatchView stopwatchView = ((mo9) camera1View.getCameraPreview()).g.D;
                if (stopwatchView != null) {
                    stopwatchView.c();
                    s3q0 s3q0Var = s3q0.a;
                }
                camera1View.b.removeCallbacks(camera1View.E);
                RecorderBase.RecordingType recordingType = RecorderBase.RecordingType.LIVE;
                mo9.b bVar = camera1View.s;
                if ((bVar != null ? bVar.c : null) == recordingType) {
                    if (bVar != null && (fVar = bVar.a) != null) {
                        fVar.c();
                    }
                    ho9.e(camera1View.getActivity(), false);
                }
            }
        } else {
            Q0();
        }
        this.O.b();
    }

    public final void D0() {
        an9 an9Var = this.i;
        if (!an9Var.Y && an9Var.c && fxc0.B().J().w0(this.n.a)) {
            CameraUIView cameraUIView = this.b;
            if (cameraUIView.getCollectionButton() != null) {
                l7v b2 = cameraUIView.getDeps().h().b();
                HintId hintId = HintId.INFO_LIVESHOPPING_ADMIN;
                if (b2.m(hintId)) {
                    Hint p = cameraUIView.getDeps().h().b().p(hintId.getId());
                    String description = p != null ? p.getDescription() : null;
                    if (description == null || description.length() == 0) {
                        return;
                    }
                    m8v0.a.a(cameraUIView.z0, description, new com.vk.movika.sdk.android.defaultplayer.interactive.a(cameraUIView, 11), null, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomRight, VkTooltip$BalloonTilt.Right, new w(cameraUIView, 15), new g53(3), null, null, new ec(cameraUIView, 16), new h5(cameraUIView, 16), null, 0, false, null, null, false, null, false, 16763944);
                    cameraUIView.getDeps().h().b().b(hintId.getId());
                }
            }
        }
    }

    @Override // xsna.bm9
    public final void D3(int i2) {
        boolean i3 = I3(i2).i();
        jpd jpdVar = this.p0;
        if (jpdVar.v) {
            zd9 camera1View = jpdVar.c.getCamera1View();
            if (camera1View != null) {
                camera1View.B(i3, false);
            }
            jpdVar.v = false;
        }
    }

    @Override // xsna.oe8
    public final void E(BroadcastContract$State broadcastContract$State) {
        int i2 = e.$EnumSwitchMapping$0[broadcastContract$State.ordinal()];
        CameraUIView cameraUIView = this.b;
        an9 an9Var = this.i;
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                an9Var.o = false;
                xmg0.b bVar = xmg0.b.a;
                this.x = bVar;
                cameraUIView.F0(bVar);
                break;
            case 7:
                an9Var.o = true;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (broadcastContract$State == BroadcastContract$State.END_SCREEN) {
            C0443a c0443a = this.n;
            c0443a.c = null;
            c0443a.d = null;
            c0443a.e = null;
            CameraUIView cameraUIView2 = this.b;
            cameraUIView2.setLiveNameText("");
            cameraUIView2.setLiveNameTextEditable(c0443a.d == null);
        }
        an9Var.e = broadcastContract$State == BroadcastContract$State.PREPARE;
        cameraUIView.getPositions().d();
    }

    public final void E0(ClipVideoFile clipVideoFile) {
        an9 state;
        PrivateFiles.a b2;
        int i2 = 1;
        this.i.M = true;
        bi9 bi9Var = this.M;
        io.reactivex.rxjava3.disposables.b bVar = bi9Var.c;
        CameraUIView cameraUIView = bi9Var.b;
        lmv clipsControls = cameraUIView.getClipsControls();
        if (clipsControls != null) {
            clipsControls.setTimerButtonEnabled(false);
        }
        int i3 = 3;
        if (bi9Var.a.c4() != StoryCameraMode.CLIPS) {
            bm9 presenter = cameraUIView.getPresenter();
            if (presenter == null || (state = presenter.getState()) == null || !state.g()) {
                return;
            }
            VkScreenSpinner vkScreenSpinner = cameraUIView.D0;
            if (vkScreenSpinner != null) {
                vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Error);
            }
            VkScreenSpinner vkScreenSpinner2 = cameraUIView.D0;
            if (vkScreenSpinner2 != null) {
                vkScreenSpinner2.setOnCancelListener(null);
            }
            cameraUIView.postDelayed(new vb(cameraUIView, i3), 1000L);
            return;
        }
        bVar.e();
        bi9Var.d = true;
        i0q0.i(0L, new r44(cameraUIView, 5));
        String Ab = clipVideoFile.f.Ab(VideoUrl.URL_720);
        if (Ab == null) {
            Ab = clipVideoFile.f.T7();
        }
        Regex regex = com.vk.core.files.a.a;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.DUETS_DOWNLOAD;
        privateFiles.getClass();
        b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        File file = new File(b2.a, "video");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "0.mp4");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        bVar.b(dug0.a(file2, Ab).a0(asu0.a.d()).subscribe(new pf1(new v74(i3, bi9Var, clipVideoFile), i2), new wf1(new za(bi9Var, 15), 8)));
    }

    @Override // xsna.bm9
    public final void E3() {
        this.p0.h();
    }

    @Override // xsna.liz
    public final void F() {
        this.O.b();
        CameraUIView cameraUIView = this.b;
        cameraUIView.G0();
        cameraUIView.t();
        am9.a aVar = this.h.a;
        aVar.f = "preview";
        aVar.d = null;
        aVar.c = null;
        pe8 f2 = cameraUIView.getPositions().f();
        if (f2 != null) {
            f2.release();
        }
        v0();
        boolean z = this.s;
        an9 an9Var = this.i;
        an9Var.r = z;
        an9Var.q = false;
        cameraUIView.R();
        cameraUIView.getPositions().d();
        this.r = null;
        cameraUIView.setShutterPosition(true);
        cameraUIView.setBroadcast(null);
        rg10 maskCallback = cameraUIView.getMaskCallback();
        if (maskCallback != null) {
            maskCallback.setMasksAuthorClickEnabled(true);
        }
        q4();
    }

    public final void F0() {
        File e2;
        i();
        if (c4().i()) {
            this.p0.getClass();
            e2 = PrivateFiles.e(e8r.a, PrivateSubdir.CLIPS_CAMERA, null, "mp4", 24);
        } else {
            e2 = c4().j() ? PrivateFiles.e(e8r.a, PrivateSubdir.STORIES_TEMP, null, "mp4", 24) : PrivateFiles.e(e8r.a, PrivateSubdir.MEDIA, null, "mp4", 24);
        }
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.u(e2);
        }
        i0q0.d(500L, new qc9(this, 1));
        l0();
    }

    @Override // xsna.bm9
    public final void F3(int i2) {
        this.j = Integer.valueOf(i2);
    }

    @Override // com.vk.content.design.view.camera.ShutterButton.e
    public final void G(float f2) {
        int i2 = (int) f2;
        if (i2 > this.X) {
            this.X = i2;
            this.Y.set(o0());
        }
        CameraUIView cameraUIView = this.b;
        cameraUIView.o0(f2 - i2, i2);
        if (this.W || 0.99666667f >= f2 || b0() <= 60000) {
            return;
        }
        cameraUIView.F(true, null);
        this.W = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    @Override // xsna.bm9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G2(String str) {
        boolean z;
        rxo0 rxo0Var;
        Activity h2;
        O0();
        CameraUIView cameraUIView = this.b;
        cameraUIView.r0();
        an9 an9Var = this.i;
        if (an9Var.a) {
            R0();
            cameraUIView.w();
            cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L);
            cameraUIView.v(0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
            cameraUIView.getPositions().d();
            y0();
            cameraUIView.C0();
            cameraUIView.J();
            an9Var.r = false;
            jhu0 jhu0Var = ((fj9) ij9.a.a.getValue()).a;
            if (jhu0Var != null) {
                int a = jhu0Var.a();
                Integer t = jhu0Var.t();
                if (t != null && a == t.intValue()) {
                    z = true;
                    this.w = z;
                    cameraUIView.Z(false);
                    cameraUIView.setShutterPosition(false);
                    cameraUIView.q();
                    v0();
                    an9Var.b = false;
                    jpd jpdVar = this.p0;
                    jpdVar.getClass();
                    jpdVar.q(false);
                    jpdVar.dispose();
                    iod iodVar = jpdVar.y;
                    rxo0Var = iodVar.g;
                    if (rxo0Var != null) {
                        rxo0Var.b.set(true);
                        rxo0Var.d.quitSafely();
                        rxo0Var.a.release();
                    }
                    iodVar.g = null;
                    if (this.w) {
                        an9Var.z = false;
                    } else {
                        an9Var.C = false;
                        an9Var.z = true;
                    }
                    an9Var.c = false;
                    an9Var.B = false;
                    an9Var.A = false;
                    v0();
                    cameraUIView.getPositions().a();
                    cameraUIView.getPositions().d();
                    cameraUIView.d0();
                    Context context = cameraUIView.getContext();
                    bpn0 bpn0Var = enj.a;
                    h2 = e3m.h(context);
                    if (h2 != null) {
                        h2.setRequestedOrientation(cameraUIView.getUnLockedOrientation());
                    }
                    cameraUIView.setShutterPosition(false);
                    ho9.e((Activity) cameraUIView.getContext(), false);
                    this.O.b();
                    an9Var.a = false;
                    if (this.e0.isInitialized()) {
                        Z().d(false);
                    }
                    MasksController.d();
                    V0(false);
                }
            }
            z = false;
            this.w = z;
            cameraUIView.Z(false);
            cameraUIView.setShutterPosition(false);
            cameraUIView.q();
            v0();
            an9Var.b = false;
            jpd jpdVar2 = this.p0;
            jpdVar2.getClass();
            jpdVar2.q(false);
            jpdVar2.dispose();
            iod iodVar2 = jpdVar2.y;
            rxo0Var = iodVar2.g;
            if (rxo0Var != null) {
            }
            iodVar2.g = null;
            if (this.w) {
            }
            an9Var.c = false;
            an9Var.B = false;
            an9Var.A = false;
            v0();
            cameraUIView.getPositions().a();
            cameraUIView.getPositions().d();
            cameraUIView.d0();
            Context context2 = cameraUIView.getContext();
            bpn0 bpn0Var2 = enj.a;
            h2 = e3m.h(context2);
            if (h2 != null) {
            }
            cameraUIView.setShutterPosition(false);
            ho9.e((Activity) cameraUIView.getContext(), false);
            this.O.b();
            an9Var.a = false;
            if (this.e0.isInitialized()) {
            }
            MasksController.d();
            V0(false);
        }
    }

    @Override // xsna.bm9
    public final int G3(int i2) {
        jpd jpdVar = this.p0;
        wud wudVar = jpdVar.i;
        int i3 = wudVar.b;
        jpdVar.l.d = 0;
        wudVar.b = i2;
        wudVar.a.setClipsProgressMaxDurationMs(i2);
        return i3;
    }

    @Override // xsna.liz
    public final oom0 H() {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            return camera1View.getRecorderAnalytics();
        }
        return null;
    }

    public final void H0() {
        this.v = System.currentTimeMillis();
        CameraUIView cameraUIView = this.b;
        cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 550L);
        cameraUIView.w();
        cameraUIView.v(550L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        an9 an9Var = this.i;
        an9Var.e = false;
        an9Var.i = false;
        cameraUIView.getPositions().d();
        R0();
        cameraUIView.setShutterPosition(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // xsna.bm9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H3() {
        int i2;
        boolean z;
        t20 a = this.e.d().a();
        Context context = this.b.getContext();
        UserId userId = this.n.a;
        StorySharingInfo storySharingInfo = this.c.f;
        String str = storySharingInfo != null ? storySharingInfo.f : null;
        int i3 = this.n0;
        boolean z2 = false;
        if (i3 == 0) {
            if ((storySharingInfo != null ? storySharingInfo.f : null) == null) {
                i2 = i3;
                z = true;
                if (i2 == 0) {
                    if ((storySharingInfo != null ? storySharingInfo.f : null) == null) {
                        z2 = true;
                    }
                }
                a.c(context, userId, str, z2, z, this.l0, new hb(this, 15), new j());
            }
        }
        i2 = i3;
        z = false;
        if (i2 == 0) {
        }
        a.c(context, userId, str, z2, z, this.l0, new hb(this, 15), new j());
    }

    @Override // xsna.di9
    public final AnimatorSet I() {
        this.i.f = true;
        this.b.getPositions().d();
        return new AnimatorSet();
    }

    public final void I0() {
        this.v = System.currentTimeMillis();
        u0();
        CameraUIView cameraUIView = this.b;
        cameraUIView.w();
        cameraUIView.u();
        cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 550L);
        this.i.e = false;
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(true);
        setShutterEnabled(true);
        R0();
    }

    @Override // xsna.bm9
    public final StoryCameraMode I3(int i2) {
        return this.c.e.get(i2);
    }

    @Override // xsna.di10
    public final boolean J() {
        return !this.i.X && this.c.N == null;
    }

    public final void J0() {
        this.v = System.currentTimeMillis();
        u0();
        an9 an9Var = this.i;
        an9Var.e = false;
        an9Var.h = false;
        CameraUIView cameraUIView = this.b;
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(true);
        cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 550L);
        R0();
    }

    @Override // xsna.bm9
    public final boolean J3() {
        zd9 camera1View;
        sj9 e2;
        if (!c4().i() || (camera1View = this.b.getCamera1View()) == null || camera1View.m == null || (e2 = ij9.a.e()) == null) {
            return false;
        }
        tj9 tj9Var = (tj9) e2;
        int i2 = tj9Var.c * ((int) 60.0f);
        List<int[]> j2 = tj9Var.j();
        if (j2 == null) {
            return false;
        }
        Iterator<int[]> it = j2.iterator();
        while (it.hasNext()) {
            if (it.next()[1] >= i2) {
                return true;
            }
        }
        return false;
    }

    public final void K0() {
        R();
        this.v = System.currentTimeMillis();
        CameraUIView cameraUIView = this.b;
        cameraUIView.w();
        cameraUIView.u();
        cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 500L);
        an9 an9Var = this.i;
        an9Var.e = false;
        an9Var.i = true;
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(true);
        Q0();
    }

    @Override // xsna.bm9
    public final am9 K3() {
        return this.h;
    }

    @Override // xsna.di9
    public final AnimatorSet L(float f2, TimeInterpolator timeInterpolator) {
        an9 an9Var = this.i;
        an9Var.V = true;
        an9Var.f = true;
        this.b.getPositions().d();
        return new AnimatorSet();
    }

    public final void L0() {
        this.v = System.currentTimeMillis();
        u0();
        CameraUIView cameraUIView = this.b;
        cameraUIView.w();
        cameraUIView.u();
        cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 550L);
        cameraUIView.setShutterPosition(true);
        Q0();
        this.h.c(StoryPublishEvent.END_STORY_VIDEO, new dj1(4));
    }

    @Override // xsna.bm9
    public final void L3(boolean z) {
        an9 an9Var = this.i;
        if (an9Var.a) {
            X0();
            g0(this.y);
        }
        StoryCameraMode I3 = I3(an9Var.H);
        if (z) {
            this.h.c(StoryPublishEvent.CHANGE_MODE, null);
        }
        boolean z2 = o0() && (I3 == StoryCameraMode.STORY || I3 == StoryCameraMode.STORY_VIDEO);
        CameraUIView cameraUIView = this.b;
        cameraUIView.setShutterEndless(z2);
        cameraUIView.setShutterProgressListener(z2 ? this : null);
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            camera1View.F(!I3.i());
        }
        if (I3.i()) {
            U(RecorderBase.RecordingType.CLIP, new g0(9));
        } else if (I3 == StoryCameraMode.LIVE && ni9.b()) {
            U(RecorderBase.RecordingType.LIVE, new iy2(7));
        } else {
            U(RecorderBase.RecordingType.ORIGINAL, new com.vk.movika.sdk.base.logic.interactor.g(6));
        }
        if (I3.i()) {
            if (!this.V.i()) {
                r0(false);
                cameraUIView.j0(true, true);
                cameraUIView.Z(an9Var.r);
            }
        } else if (this.V.i()) {
            cameraUIView.j0(false, true);
            cameraUIView.Z(an9Var.r);
            this.b.ff(false, null, null);
        }
        this.p0.m(I3.i());
        l0();
        B0();
        this.V = I3;
    }

    @Override // xsna.di9
    public final void M() {
        v(false, false);
    }

    public final void M0() {
        this.v = System.currentTimeMillis();
        u0();
        an9 an9Var = this.i;
        an9Var.e = false;
        an9Var.h = false;
        CameraUIView cameraUIView = this.b;
        cameraUIView.w();
        cameraUIView.u();
        cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 550L);
        Q0();
    }

    @Override // xsna.bm9
    public final boolean M3() {
        return this.c.e.size() == 1 && c4() == StoryCameraMode.QR_SCANNER;
    }

    @Override // xsna.di9
    public final bn9 N() {
        return this.k0;
    }

    public final void N0() {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.N();
        }
    }

    @Override // xsna.bm9
    public final void N3(boolean z) {
        an9 an9Var = this.i;
        an9Var.n = z;
        CameraUIView cameraUIView = this.b;
        Context context = cameraUIView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        an9Var.m = activity != null ? activity.isInMultiWindowMode() : false;
        cameraUIView.x(z);
        cameraUIView.R();
        cameraUIView.getPositions().d();
    }

    @Override // xsna.di9
    public final boolean O() {
        return this.b0;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    public final void O0() {
        io.reactivex.rxjava3.disposables.c cVar = this.A;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.B;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.C;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        f fVar = this.E;
        if (fVar != null) {
            fVar.dispose();
        }
        i iVar = this.F;
        if (iVar != null) {
            iVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.G;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar5 = this.H;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar6 = this.I;
        if (cVar6 != null) {
            cVar6.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar7 = this.J;
        if (cVar7 != null) {
            cVar7.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar8 = this.K;
        if (cVar8 != null) {
            cVar8.dispose();
        }
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        jpd jpdVar = this.p0;
        jpdVar.dispose();
        io.reactivex.rxjava3.disposables.c cVar9 = jpdVar.o;
        if (cVar9 != null) {
            cVar9.dispose();
        }
        jpdVar.o = null;
        h1e h1eVar = jpdVar.t;
        ((io.reactivex.rxjava3.disposables.g) h1eVar.f.getValue()).dispose();
        ((io.reactivex.rxjava3.disposables.g) h1eVar.g.getValue()).dispose();
        ((io.reactivex.rxjava3.disposables.g) h1eVar.l.getValue()).dispose();
        ((io.reactivex.rxjava3.disposables.g) h1eVar.m.getValue()).dispose();
        h1eVar.i.dispose();
        Iterator<T> it = h1eVar.c.iterator();
        while (it.hasNext()) {
            File file = ((UserInfo) it.next()).userAvatarFile;
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(file);
        }
        h1eVar.c = EmptyList.b;
        Iterator<T> it2 = h1eVar.h.iterator();
        while (it2.hasNext()) {
            File file2 = ((cc50) it2.next()).a;
            Regex regex2 = com.vk.core.files.a.a;
            vhk0.b(file2);
        }
        h1eVar.h = EmptyList.b;
        h1eVar.j = null;
        io.reactivex.rxjava3.disposables.c cVar10 = ((zi9) jpdVar.A.getValue()).a;
        if (cVar10 != null) {
            cVar10.dispose();
        }
        jpdVar.d().a(TemplatesFlowScreen.CAMERA);
        hg1.f(jpdVar.p);
    }

    @Override // xsna.bm9
    public final void O3(MsgType msgType) {
        p5p Y = Y();
        if (Y != null) {
            Y.setMsgType(msgType);
        }
        r3(null);
    }

    public final boolean P() {
        an9 an9Var = this.i;
        return (an9Var.p || an9Var.q || an9Var.i || an9Var.g || !an9Var.e) ? false : true;
    }

    public final void P0(boolean z) {
        nov novVar;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b.getStickersState().a;
        int i2 = 0;
        while (true) {
            if (i2 == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i2) instanceof sov) {
                    novVar = copyOnWriteArrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        q850 q850Var = this.N;
        if (z) {
            q850Var.m(null, 6, false, false);
        } else {
            q850Var.stop(26);
        }
        if (this.e0.isInitialized()) {
            vky Z = Z();
            Z.i.post(new rc4(Z, 9));
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bm9
    public final void P3(boolean z, boolean z2) {
        jpd jpdVar = this.p0;
        if (jpdVar.e.a().b()) {
            h1e h1eVar = jpdVar.t;
            UserInfo userInfo = h1eVar.j;
            if ((z && !h1eVar.k) || z2 || userInfo == null) {
                ((io.reactivex.rxjava3.disposables.g) h1eVar.l.getValue()).b(rsg0.y0(yfb.x(r1r0.a.b((s1r0) h1eVar.o.getValue(), Collections.singletonList(h1eVar.b.c()), h1e.p, null, null, 58)), null, null, 3).U(new j7(new qt0(13), 14)).U(new nu0(new la2(10), 10)).K().m(asu0.a.d()).subscribe(new sf(new hi3(h1eVar, z2, 1), 15), new tp0(new r8(L.a, 5), 11)));
            } else {
                h1eVar.a.f(userInfo);
            }
        }
    }

    public final void Q() {
        jpd.v(this.p0, null);
    }

    public final void Q0() {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.x(false);
        }
        if (c4().i()) {
            this.p0.z();
        }
        P0(false);
        l0();
        this.O.b();
    }

    @Override // xsna.bm9
    public final boolean Q3() {
        this.p0.getClass();
        boolean z = Preference.f("pref_clips_delegate").getBoolean("duet_tooltip_shown" + o25.a().c(), true);
        if (z) {
            Preference.f("pref_clips_delegate").edit().putBoolean("duet_tooltip_shown" + o25.a().c(), false).apply();
        }
        return z;
    }

    public final void R() {
        io.reactivex.rxjava3.disposables.c cVar = this.B;
        if (cVar != null) {
            cVar.dispose();
        }
        this.B = q.B0(10000L, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new lf1(new ns1(this, 13), 6));
    }

    public final void R0() {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.x(true);
        }
        P0(false);
        l0();
    }

    @Override // xsna.bm9
    public final void R3() {
        an9 an9Var = this.i;
        boolean z = an9Var.p;
        StoryCameraParams storyCameraParams = this.c;
        if (z && storyCameraParams.q != 0 && BuildInfo.t()) {
            CameraUIView cameraUIView = this.b;
            ShutterButton shutterButton = cameraUIView.e;
            if (shutterButton == null) {
                return;
            }
            Context context = cameraUIView.getContext();
            bpn0 bpn0Var = enj.a;
            e140.c(new e140(e3m.h(context), null), shutterButton, new ka(cameraUIView, 6));
            return;
        }
        if (P()) {
            if (this.W) {
                u0();
            }
            int i2 = e.$EnumSwitchMapping$1[storyCameraParams.e.get(an9Var.H).ordinal()];
            if (i2 == 1) {
                jpd.k(this.p0, null, 3);
                return;
            }
            if (i2 == 3) {
                if (System.currentTimeMillis() - this.u > 1500) {
                    L0();
                    return;
                } else {
                    I0();
                    return;
                }
            }
            if (i2 == 4) {
                if (System.currentTimeMillis() - this.u > 1500) {
                    K0();
                    return;
                } else {
                    H0();
                    return;
                }
            }
            if (i2 == 7) {
                if (System.currentTimeMillis() - this.u > 1500) {
                    M0();
                    return;
                } else {
                    J0();
                    return;
                }
            }
            if (i2 != 8) {
                return;
            }
            if (System.currentTimeMillis() - this.u > 1500) {
                L0();
            } else {
                I0();
            }
        }
    }

    public final List<tam0> S(boolean z) {
        VideoFile videoFile;
        ImageSize Fb;
        String str;
        StoryCameraParams storyCameraParams = this.c;
        Photo photo = storyCameraParams.F;
        StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment = storyCameraParams.z0;
        StoryLocalPhotoSticker storyLocalPhotoSticker = storyCameraParams.G;
        WebStoryBox webStoryBox = storyCameraParams.u;
        Uri uri = null;
        uri = null;
        uri = null;
        if (photo != null) {
            Uri parse = Uri.parse(photo.Fb(y8g0.a(R.dimen.editor_fragment_preview_height), false).d.d);
            w1m0 w1m0Var = this.P;
            return Collections.singletonList(new tam0(null, new ArrayList(), z, w1m0Var != null ? w1m0Var.c : null, null, false, true, null, null, null, null, null, false, new yaa0(parse), null, null, false, null, null, 516016));
        }
        if (storyLocalPhotoSticker != null) {
            Uri uri2 = storyLocalPhotoSticker.b;
            w1m0 w1m0Var2 = this.P;
            return Collections.singletonList(new tam0(null, new ArrayList(), z, w1m0Var2 != null ? w1m0Var2.c : null, null, false, true, null, null, null, null, null, false, null, new yaa0(uri2), null, false, null, null, 507824));
        }
        if (storyEditorPhotoAlbumAttachment != null) {
            Serializer.c<BackgroundInfo> cVar = BackgroundInfo.CREATOR;
            BackgroundInfo b2 = BackgroundInfo.a.b();
            if (storyEditorPhotoAlbumAttachment != null && (Fb = ((Photo) storyEditorPhotoAlbumAttachment.b).Fb(y8g0.a(R.dimen.editor_fragment_preview_height), false)) != null && (str = Fb.d.d) != null) {
                uri = jeq0.g(str);
            }
            return Collections.singletonList(tam0.a.b(z, b2, uri, false, 20));
        }
        if (storyCameraParams.n != null) {
            Serializer.c<BackgroundInfo> cVar2 = BackgroundInfo.CREATOR;
            return Collections.singletonList(tam0.a.b(z, BackgroundInfo.a.b(), null, false, 28));
        }
        if (storyCameraParams.v != null || storyCameraParams.x != null || storyCameraParams.f0 != null || storyCameraParams.L != null || storyCameraParams.w != null || storyCameraParams.m0 != null || storyCameraParams.k0) {
            w1m0 w1m0Var3 = this.P;
            return Collections.singletonList(tam0.a.b(z, w1m0Var3 != null ? w1m0Var3.c : null, null, false, 28));
        }
        if (storyCameraParams.h0 != null) {
            ArrayList arrayList = new ArrayList();
            Serializer.c<BackgroundInfo> cVar3 = BackgroundInfo.CREATOR;
            return Collections.singletonList(new tam0(null, arrayList, false, BackgroundInfo.a.b(), null, false, true, null, null, null, null, null, false, null, null, null, false, null, null, 524208));
        }
        if (storyCameraParams.n0 != null) {
            ArrayList arrayList2 = new ArrayList();
            Serializer.c<BackgroundInfo> cVar4 = BackgroundInfo.CREATOR;
            return Collections.singletonList(new tam0(null, arrayList2, false, BackgroundInfo.a.b(), null, false, true, null, null, null, null, null, false, null, null, null, false, null, null, 524208));
        }
        StorySharingInfo storySharingInfo = storyCameraParams.f;
        if (storySharingInfo == null || storySharingInfo.f == null || storySharingInfo.b != 30) {
            if (storyCameraParams.o0 != null) {
                Serializer.c<BackgroundInfo> cVar5 = BackgroundInfo.CREATOR;
                return Collections.singletonList(tam0.a.b(z, BackgroundInfo.a.b(), null, false, 28));
            }
            if (webStoryBox == null) {
                return null;
            }
            if (!epx.f(webStoryBox.b, "none")) {
                return U0(webStoryBox);
            }
            w1m0 w1m0Var4 = this.P;
            BackgroundInfo backgroundInfo = w1m0Var4 != null ? w1m0Var4.c : null;
            WebServiceInfo webServiceInfo = webStoryBox.i;
            return Collections.singletonList(tam0.a.b(z, backgroundInfo, null, webServiceInfo != null ? epx.f(webServiceInfo.h, Boolean.TRUE) : false, 12));
        }
        if (storySharingInfo != null) {
            Long l = storySharingInfo.c;
            Long l2 = storySharingInfo.d;
            uft0 uft0Var = new uft0();
            StringBuilder sb = new StringBuilder();
            sb.append(l);
            sb.append('_');
            sb.append(l2);
            VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) yfb.x(sft0.a.b(uft0Var, null, Collections.singletonList(sb.toString()), null, null, null, Boolean.TRUE, null, 16776183)).u(0L);
            if (videoGetResponseDto != null) {
                cdt0.a.getClass();
                videoFile = (VideoFile) j5g.a0(ums0.e(ums0.a, videoGetResponseDto.e(), videoGetResponseDto.g(), videoGetResponseDto.d(), false, 52));
            } else {
                videoFile = null;
            }
            if (videoFile != null) {
                storyCameraParams.o0 = videoFile;
                storyCameraParams.f = null;
            }
        }
        Serializer.c<BackgroundInfo> cVar6 = BackgroundInfo.CREATOR;
        return Collections.singletonList(tam0.a.b(z, BackgroundInfo.a.b(), null, false, 28));
    }

    public final void S0() {
        if (this.K == null) {
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            hg1.g gVar = new hg1.g();
            fVar.getClass();
            this.K = new i0(fVar, gVar).U(new hg1.f()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wn(new r9(this, 13), 9));
        }
    }

    @Override // xsna.bm9
    public final int S3() {
        return this.p0.i.b;
    }

    public final void T(StoryMusicInfo storyMusicInfo) {
        bi9 bi9Var = this.M;
        if (bi9Var.a.c4() == StoryCameraMode.CLIPS) {
            bi9Var.a(storyMusicInfo, null);
            return;
        }
        io.reactivex.rxjava3.disposables.b bVar = bi9Var.c;
        bVar.e();
        bi9Var.d = true;
        MusicTrack musicTrack = storyMusicInfo.b;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        bVar.b(rsg0.y0(new ksl0(musicTrack.c, musicTrack.b, musicTrack.y), null, null, 3).L(new e7(new vh9(ref$ObjectRef, bi9Var, musicTrack, 0), 7), false).subscribe(new sf(new wh9(bi9Var, storyMusicInfo, ref$ObjectRef, 0), 10), new tf(new g84(2, bi9Var, storyMusicInfo), 6)));
    }

    public final void T0() {
        dwr dwrVar;
        int i2;
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null && (dwrVar = camera1View.S) != null && dwrVar.d != null && dwrVar.o != null) {
            String d2 = dwrVar.d();
            if (d2.equals("infinity") || d2.equals("fixed") || d2.equals("edof") || (i2 = dwrVar.a) == 3 || i2 == 4) {
                dwrVar.c();
            } else if (i2 == 1) {
                dwrVar.a = 2;
            } else if (i2 == 0) {
                dwrVar.c();
            }
        }
        this.h.c(StoryPublishEvent.MAKE_PHOTO, null);
    }

    @Override // xsna.bm9
    public final void T3() {
        this.p0.y.g();
    }

    public final void U(RecorderBase.RecordingType recordingType, gzs<s3q0> gzsVar) {
        f fVar = this.E;
        if (fVar != null) {
            fVar.dispose();
        }
        io.reactivex.rxjava3.subjects.f<Boolean> fVar2 = new io.reactivex.rxjava3.subjects.f<>();
        this.D = fVar2;
        f fVar3 = new f(gzsVar);
        fVar2.subscribe(fVar3);
        this.E = fVar3;
        CameraUIView cameraUIView = this.b;
        zd9 camera1View = cameraUIView.getCamera1View();
        if ((camera1View != null ? camera1View.getRecordingType() : null) == recordingType) {
            zd9 camera1View2 = cameraUIView.getCamera1View();
            if ((camera1View2 != null ? camera1View2.getRecorderState() : null) == RecorderBase.State.PREPARED) {
                io.reactivex.rxjava3.subjects.f<Boolean> fVar4 = this.D;
                if (fVar4 != null) {
                    fVar4.onNext(Boolean.TRUE);
                }
                io.reactivex.rxjava3.subjects.f<Boolean> fVar5 = this.D;
                if (fVar5 != null) {
                    fVar5.onComplete();
                    return;
                }
                return;
            }
        }
        zd9 camera1View3 = cameraUIView.getCamera1View();
        if (camera1View3 != null) {
            camera1View3.setRecordingType(recordingType);
        }
    }

    @Override // xsna.bm9
    public final boolean U3() {
        an9 an9Var = this.i;
        return (an9Var.e || an9Var.d || an9Var.g || an9Var.i || an9Var.q || an9Var.p || an9Var.J != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
    }

    public final boolean V() {
        long currentTimeMillis = System.currentTimeMillis();
        StoryCameraMode currentState = getCurrentState();
        return currentTimeMillis - this.v < ((currentState == null ? -1 : e.$EnumSwitchMapping$1[currentState.ordinal()]) == 1 ? 300L : 1000L);
    }

    public final void V0(boolean z) {
        if (this.c.v0) {
            Context context = this.b.getContext();
            NavigationDelegateActivity navigationDelegateActivity = context instanceof NavigationDelegateActivity ? (NavigationDelegateActivity) context : null;
            if (navigationDelegateActivity != null) {
                xdr0<NavigationDelegateActivity> Y = navigationDelegateActivity.Y();
                ym9 ym9Var = this.l;
                if (z) {
                    Y.S(ym9Var);
                } else {
                    Y.H(ym9Var);
                }
            }
        }
    }

    @Override // xsna.bm9
    public final int V3() {
        Integer num = this.j;
        if (num != null) {
            return num.intValue();
        }
        StoryCameraParams storyCameraParams = this.c;
        return storyCameraParams.e.indexOf(storyCameraParams.d);
    }

    public final rhd W() {
        return ((CameraClipsComponent) this.e.i.getValue()).p9();
    }

    public final void W0() {
        String str;
        final String str2;
        if (this.e0.isInitialized()) {
            Z().d(false);
        }
        if (!c4().i()) {
            h7m0 i2 = this.b.getStickersState().i();
            if (i2 == null || (str = i2.getInfo().g) == null) {
                return;
            }
            int i3 = i2.getInfo().d;
            int i4 = i2.getInfo().e < i2.getInfo().d ? -1 : i2.getInfo().e;
            if (i3 <= i4 || i4 == -1) {
                q850 q850Var = this.N;
                bn40.f("url:", str, "boundsFromMs:", Integer.valueOf(i3), "boundsToMs:", Integer.valueOf(i4), "loop:", Boolean.FALSE, "partialPlayback:", Boolean.valueOf(q850Var.k));
                bn40.f(new Object[0]);
                q850Var.c.c(q850Var.b);
                q850Var.q(new q850.a(str, Math.max(0, i3), i4, false, false, null));
                if (i2 instanceof sov) {
                    return;
                }
                return;
            }
            return;
        }
        ClipsEditorMusicInfo d2 = this.p0.z.d();
        if (d2 == null || d2.i || (str2 = d2.g) == null) {
            return;
        }
        int i5 = d2.d;
        int i6 = d2.e;
        if (i5 >= i6 && i6 > 0) {
            Z().d(false);
            return;
        }
        vky Z = Z();
        float X = X();
        float f2 = X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f / X : 1.0f;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Z.getClass();
            throw new IllegalArgumentException();
        }
        Z.p = f2;
        final vky Z2 = Z();
        final long j2 = i5;
        final long j3 = i6;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Z2.i.post(new Runnable() { // from class: xsna.uky
            {
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            }

            @Override // java.lang.Runnable
            public final void run() {
                vky vkyVar = Z2;
                String str3 = str2;
                long j4 = j2;
                long j5 = j3;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                try {
                    synchronized (vkyVar) {
                        try {
                            vkyVar.e();
                            if (vkyVar.e == null) {
                                MediaExtractor mediaExtractor = new MediaExtractor();
                                vkyVar.e = mediaExtractor;
                                mediaExtractor.setDataSource(str3);
                                vkyVar.e.selectTrack(0);
                            }
                            vkyVar.a(j4, j5);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    vkyVar.a.getClass();
                    com.vk.metrics.eventtracking.b.a.a(new RuntimeException("failed to open audio track", th));
                }
            }
        });
    }

    @Override // xsna.bm9
    public final void W3() {
        eqo<rpo> eqoVar = this.b.D;
        if (eqoVar == null) {
            L.l("CameraUIView", "gestureDetectionDynamicPresenter is null");
        } else {
            eqoVar.d(rpo.b.b);
        }
    }

    public final float X() {
        lmv clipsControls = this.b.getClipsControls();
        if (clipsControls != null) {
            return clipsControls.getClipsCurrentSpeed();
        }
        return 1.0f;
    }

    public final void X0() {
        int i2 = e.$EnumSwitchMapping$1[c4().ordinal()];
        CameraUIView cameraUIView = this.b;
        switch (i2) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                Context context = cameraUIView.getContext();
                bpn0 bpn0Var = enj.a;
                Activity h2 = e3m.h(context);
                if (h2 != null) {
                    h2.setRequestedOrientation(cameraUIView.getLockedOrientation());
                    break;
                }
                break;
            case 2:
                if (!this.i.q) {
                    Context context2 = cameraUIView.getContext();
                    bpn0 bpn0Var2 = enj.a;
                    Activity h3 = e3m.h(context2);
                    if (h3 != null) {
                        h3.setRequestedOrientation(cameraUIView.getUnLockedOrientation());
                        break;
                    }
                } else {
                    cameraUIView.X();
                    break;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        cameraUIView.r();
    }

    @Override // xsna.bm9
    public final void X3() {
        eqo<DynamicMasksUseCase> eqoVar;
        if (!TextUtils.isEmpty(this.c.j) && (eqoVar = this.b.C) != null) {
            eqoVar.f(DynamicMasksUseCase.CameraInitAndMaskPreselected);
        }
        i0(0L);
    }

    public final p5p Y() {
        return this.b.getPositions().e();
    }

    @Override // xsna.bm9
    public final boolean Y3() {
        StoryCameraParams storyCameraParams = this.c;
        if (TextUtils.isEmpty(storyCameraParams.j)) {
            return false;
        }
        rg10 maskCallback = this.b.getMaskCallback();
        if (maskCallback != null) {
            maskCallback.f(storyCameraParams.j);
        }
        storyCameraParams.j = null;
        z();
        return true;
    }

    public final vky Z() {
        return (vky) this.e0.getValue();
    }

    @Override // xsna.bm9
    public final wm9 Z3() {
        return new wm9(this);
    }

    @Override // xsna.bm9
    public final void a(Mask mask) {
        this.p0.A(mask.Hb(), true);
    }

    @Override // xsna.qk6
    public final boolean a0() {
        boolean z;
        StoryCameraParams storyCameraParams = this.c;
        List<? extends StoryCameraMode> list = storyCameraParams.e;
        an9 an9Var = this.i;
        StoryCameraMode storyCameraMode = list.get(an9Var.H);
        boolean z2 = false;
        if (an9Var.r && !an9Var.p && (storyCameraMode == StoryCameraMode.LIVE || storyCameraMode == StoryCameraMode.STORY || storyCameraMode == StoryCameraMode.PHOTO || storyCameraMode == StoryCameraMode.VIDEO || storyCameraMode == StoryCameraMode.STORY_VIDEO)) {
            A();
            z = true;
        } else {
            z = false;
        }
        CameraUIView cameraUIView = this.b;
        if (!z) {
            switch (e.$EnumSwitchMapping$1[storyCameraMode.ordinal()]) {
                case 1:
                    if (!an9Var.p) {
                        jpd jpdVar = this.p0;
                        a aVar = jpdVar.b;
                        lmv clipsControls = jpdVar.c.getClipsControls();
                        if (clipsControls != null) {
                            lmv.J2(clipsControls, null, 6);
                        }
                        an9 an9Var2 = aVar.i;
                        if (!an9Var2.W) {
                            if (!an9Var2.e) {
                                if (!an9Var2.j) {
                                    z = false;
                                    break;
                                } else {
                                    jpdVar.h();
                                }
                            } else {
                                jpdVar.r = false;
                                jpdVar.y(false);
                            }
                        } else {
                            jpdVar.y.g();
                        }
                        z = true;
                        break;
                    } else {
                        p5p Y = Y();
                        z = Y != null ? Y.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
                case 2:
                    if (an9Var.q) {
                        pe8 f2 = cameraUIView.getPositions().f();
                        gv5 gv5Var = f2 instanceof gv5 ? (gv5) f2 : null;
                        z = gv5Var != null ? gv5Var.a0() : false;
                        if (!z) {
                            F();
                            break;
                        }
                    }
                    break;
                case 3:
                    if (!an9Var.p) {
                        if (an9Var.e) {
                            I0();
                            z = true;
                            break;
                        }
                    } else {
                        p5p Y2 = Y();
                        z = Y2 != null ? Y2.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
                case 4:
                    if (!an9Var.p) {
                        if (!an9Var.g) {
                            if (an9Var.e) {
                                H0();
                            }
                        }
                        z = true;
                        break;
                    } else {
                        p5p Y3 = Y();
                        z = Y3 != null ? Y3.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (!an9Var.p) {
                        if (!an9Var.g) {
                            if (an9Var.e) {
                                an9Var.e = false;
                                cameraUIView.getPositions().d();
                            }
                        }
                        z = true;
                        break;
                    } else {
                        p5p Y4 = Y();
                        z = Y4 != null ? Y4.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
                case 6:
                    if (!an9Var.p) {
                        if (an9Var.e) {
                            I0();
                            z = true;
                            break;
                        }
                    } else {
                        p5p Y5 = Y();
                        z = Y5 != null ? Y5.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
                case 7:
                    if (!an9Var.p) {
                        if (an9Var.e) {
                            I0();
                            cameraUIView.setShutterPosition(true);
                            z = true;
                            break;
                        }
                    } else {
                        p5p Y6 = Y();
                        z = Y6 != null ? Y6.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
                case 8:
                    if (!an9Var.p) {
                        if (an9Var.e) {
                            I0();
                            cameraUIView.setShutterPosition(true);
                            z = true;
                            break;
                        }
                    } else {
                        p5p Y7 = Y();
                        z = Y7 != null ? Y7.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
                case 9:
                    if (an9Var.p) {
                        p5p Y8 = Y();
                        z = Y8 != null ? Y8.d() : false;
                        if (!z) {
                            v(false, false);
                            break;
                        }
                    }
                    break;
            }
        }
        if (!z) {
            d dVar = this.Q;
            dVar.a = dVar.f ? "go_back_icon" : "go_back_button";
            y0();
            WebStoryBox webStoryBox = storyCameraParams.u;
            if (storyCameraParams.E0 != StoryEditorMode.WITH_BACKGROUND) {
                if (!(webStoryBox != null && webStoryBox.Db())) {
                    cameraUIView.M(true);
                    return true;
                }
            }
            if (storyCameraMode == StoryCameraMode.LIVE) {
                pe8 f3 = cameraUIView.getPositions().f();
                gv5 gv5Var2 = f3 instanceof gv5 ? (gv5) f3 : null;
                if (gv5Var2 != null) {
                    gv5Var2.a0();
                }
                F();
            }
            cameraUIView.P(StoryCameraMode.STORY);
            t0();
            if (this.P == null) {
                if (webStoryBox != null && webStoryBox.Db()) {
                    z2 = true;
                }
                if (z2) {
                    cameraUIView.M(true);
                    return true;
                }
            }
            cameraUIView.postDelayed(new sm9(this, 0), 25L);
        }
        return true;
    }

    @Override // xsna.bm9
    public final void a4(StoryCameraMode storyCameraMode) {
        yf9.b o = this.e.o();
        StorySharingInfo storySharingInfo = this.c.f;
        ((fig) o).getClass();
        if (storySharingInfo != null) {
            storySharingInfo.i = udm0.c(storySharingInfo.b, null, storyCameraMode == StoryCameraMode.LIVE);
        }
    }

    @Override // xsna.bm9
    public final void b(boolean z) {
        this.p0.F = z;
    }

    public final int b0() {
        int i2;
        if (c4().i()) {
            jpd jpdVar = this.p0;
            i2 = (int) (X() * (jpdVar.i.b - jpdVar.G));
        } else {
            i2 = o0() ? Integer.MAX_VALUE : 60000;
        }
        h7m0 i3 = c4().i() ? null : this.b.getStickersState().i();
        if (i3 == null) {
            return i2;
        }
        int i4 = i3.getInfo().b.c0 - i3.getInfo().d;
        if (i4 > 60000) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    @Override // xsna.bm9
    public final void b4() {
        if (P()) {
            int i2 = e.$EnumSwitchMapping$1[this.c.e.get(this.i.H).ordinal()];
            if (i2 != 3) {
                if (i2 == 4) {
                    K0();
                    return;
                } else if (i2 != 8) {
                    return;
                }
            }
            L0();
        }
    }

    @Override // xsna.bm9
    public final void c(float f2) {
        W0();
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View != null) {
            camera1View.setClipSpeed(f2);
        }
    }

    @Override // xsna.bm9
    public final StoryCameraMode c4() {
        return this.c.e.get(this.i.H);
    }

    @Override // xsna.bm9
    public final void clearSavedStorage() {
        lsd lsdVar = this.p0.j;
        lsdVar.getClass();
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        pd pdVar = new pd(lsdVar, 27);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(pdVar);
        jpd jpdVar = lsdVar.d;
        jpdVar.q(false);
        zd9 camera1View = jpdVar.c.getCamera1View();
        if (camera1View != null) {
            camera1View.C();
        }
    }

    @Override // xsna.bm9
    public final void d(Mask mask) {
        this.p0.A(mask.Hb(), false);
    }

    public final void d0(WebStoryBox webStoryBox, float f2, float f3, wzs<? super List<? extends nov>, ? super Boolean, s3q0> wzsVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        io.reactivex.rxjava3.disposables.c cVar = this.H;
        if (cVar != null) {
            cVar.dispose();
        }
        dm9 dm9Var = this.e;
        this.H = hg1.m(ktr.c(new szl0(f2, f3, ((StickersComponent) dm9Var.g.getValue()).zc(), ((StoriesComponent) dm9Var.d.getValue()).t0()).b(webStoryBox).L(new vx6(new g(atomicBoolean), 3), false).r0(asu0.a.c())), this.b.getContext(), 0L, false, 62).subscribe(new y00(new jp5(3, wzsVar, atomicBoolean), 6), new vl0(new wq3(7), 7));
    }

    @Override // xsna.bm9
    public final void d4(boolean z) {
        this.p0.n(z, true);
    }

    @Override // xsna.bm9
    public final void e(ArrayList<Long> arrayList) {
        this.p0.n = arrayList;
    }

    public final y1m0 e0() {
        return ((StoryEditorComponent) this.e.e.getValue()).n3();
    }

    @Override // xsna.bm9
    public final boolean e4() {
        an9 an9Var = this.i;
        return (!an9Var.a || an9Var.e || an9Var.d || an9Var.p || an9Var.q || an9Var.g || an9Var.i) ? false : true;
    }

    @Override // xsna.di9
    public final void f() {
        this.O.b();
    }

    @Override // xsna.bm9
    public final boolean f4() {
        StoryCameraParams storyCameraParams = this.c;
        List<? extends StoryCameraMode> list = storyCameraParams.e;
        an9 an9Var = this.i;
        if (list.get(an9Var.H) == StoryCameraMode.STORY || storyCameraParams.e.get(an9Var.H) == StoryCameraMode.STORY_VIDEO || storyCameraParams.e.get(an9Var.H) == StoryCameraMode.PING_PONG || storyCameraParams.e.get(an9Var.H) == StoryCameraMode.CLIPS) {
            return true;
        }
        return storyCameraParams.e.get(an9Var.H) == StoryCameraMode.LIVE && an9Var.t;
    }

    @Override // xsna.di9
    public final void finish() {
        this.b.M(true);
    }

    @Override // xsna.di9
    public final int g() {
        return this.z;
    }

    public final void g0(int i2) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator rotation2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator rotation3;
        ViewPropertyAnimator duration3;
        this.y = i2;
        if (c4() != StoryCameraMode.PHOTO && c4() != StoryCameraMode.LIVE) {
            i2 = 0;
        }
        if (this.z == i2) {
            return;
        }
        float f2 = i2 != 1 ? i2 != 3 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 90.0f : -90.0f;
        CameraUIView cameraUIView = this.b;
        bm9 presenter = cameraUIView.getPresenter();
        if ((presenter != null ? presenter.c4() : null) != StoryCameraMode.LIVE) {
            ImageView flashButton = cameraUIView.getFlashButton();
            if (flashButton != null && (animate3 = flashButton.animate()) != null && (rotation3 = animate3.rotation(f2)) != null && (duration3 = rotation3.setDuration(300L)) != null) {
                duration3.start();
            }
            ImageView switchButton = cameraUIView.getSwitchButton();
            if (switchButton != null && (animate2 = switchButton.animate()) != null && (rotation2 = animate2.rotation(f2)) != null && (duration2 = rotation2.setDuration(300L)) != null) {
                duration2.start();
            }
            ImageView imageView = cameraUIView.T;
            if (imageView != null && (animate = imageView.animate()) != null && (rotation = animate.rotation(f2)) != null && (duration = rotation.setDuration(300L)) != null) {
                duration.start();
            }
        } else if (cameraUIView.i1 != f2 && Math.abs(f2) == 90.0f) {
            cameraUIView.i1 = f2;
            cameraUIView.p0();
        }
        this.z = i2;
    }

    @Override // xsna.bm9
    public final void g4() {
        CameraUIView cameraUIView = this.b;
        cameraUIView.w();
        cameraUIView.u();
        R0();
    }

    @Override // xsna.bm9
    public final StoryCameraParams getCurCameraParams() {
        StoryCameraMode c4 = c4();
        float X = X();
        CameraUIView cameraUIView = this.b;
        Integer qrModeIndex = cameraUIView.getQrModeIndex();
        boolean gesturedControl = cameraUIView.getGesturedControl();
        ClipsEditorMusicInfo clipsEditorMusicInfo = this.p0.z.c;
        StoryMusicInfo d2 = clipsEditorMusicInfo != null ? hxd.d(clipsEditorMusicInfo) : null;
        Mask selectedMask = cameraUIView.getSelectedMask();
        String Db = selectedMask != null ? selectedMask.Db() : null;
        Float valueOf = Float.valueOf(X);
        Boolean valueOf2 = Boolean.valueOf(gesturedControl);
        StoryCameraParams storyCameraParams = this.c;
        return new StoryCameraParams(storyCameraParams.b, storyCameraParams.c, c4, storyCameraParams.e, storyCameraParams.f, storyCameraParams.g, storyCameraParams.h, storyCameraParams.i, Db, storyCameraParams.k, storyCameraParams.l, storyCameraParams.m, storyCameraParams.n, storyCameraParams.o, storyCameraParams.p, storyCameraParams.q, storyCameraParams.r, storyCameraParams.s, storyCameraParams.t, storyCameraParams.u, storyCameraParams.v, storyCameraParams.w, storyCameraParams.x, storyCameraParams.y, storyCameraParams.z, storyCameraParams.A, storyCameraParams.B, storyCameraParams.C, storyCameraParams.D, storyCameraParams.E, storyCameraParams.F, storyCameraParams.G, storyCameraParams.H, storyCameraParams.I, storyCameraParams.J, storyCameraParams.K, storyCameraParams.L, storyCameraParams.M, storyCameraParams.N, storyCameraParams.O, storyCameraParams.P, storyCameraParams.Q, storyCameraParams.R, storyCameraParams.S, storyCameraParams.T, storyCameraParams.U, storyCameraParams.V, storyCameraParams.W, storyCameraParams.X, storyCameraParams.Y, storyCameraParams.Z, storyCameraParams.a0, valueOf, qrModeIndex, valueOf2, d2, storyCameraParams.f0, storyCameraParams.g0, storyCameraParams.h0, storyCameraParams.i0, storyCameraParams.j0, storyCameraParams.k0, storyCameraParams.l0, storyCameraParams.m0, storyCameraParams.n0, storyCameraParams.o0, storyCameraParams.p0, storyCameraParams.q0, storyCameraParams.r0, storyCameraParams.s0, storyCameraParams.t0, storyCameraParams.u0, storyCameraParams.v0, storyCameraParams.w0, storyCameraParams.x0, storyCameraParams.y0, storyCameraParams.z0, storyCameraParams.A0, storyCameraParams.B0, storyCameraParams.C0, storyCameraParams.D0);
    }

    @Override // xsna.di9
    public final StoryCameraMode getCurrentState() {
        List<? extends StoryCameraMode> list = this.c.e;
        int i2 = this.i.H;
        if (i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    @Override // xsna.bm9
    public final an9 getState() {
        return this.i;
    }

    @Override // xsna.di9
    public final void h(boolean z) {
        if (z) {
            cvk.u(R.string.story_camera_message_attach_error, false);
        } else {
            this.b.t0(y8g0.e(R.string.story_camera_message_attach_error));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(ClipsEditorInputData clipsEditorInputData) {
        String str;
        String str2;
        StoryCameraParams storyCameraParams;
        ClipVideoFile clipVideoFile;
        String str3;
        p5p Y;
        boolean z;
        StopwatchView stopwatchView;
        StopwatchView stopwatchView2;
        MasksWrap masksWrap;
        zd9 camera1View;
        dw20 dw20Var;
        androidx.appcompat.app.d dVar;
        androidx.appcompat.app.d dVar2;
        String str4;
        DuetAction duetAction;
        String name;
        u0();
        y0();
        kbk context = ((CameraClipsComponent) this.e.i.getValue()).c4().getContext();
        int nextInt = context != null ? context.b : new SecureRandom().nextInt(Integer.MAX_VALUE);
        Location location = this.p;
        CameraUIView cameraUIView = this.b;
        Mask selectedMask = cameraUIView.getSelectedMask();
        Integer valueOf = selectedMask != null ? Integer.valueOf(selectedMask.h) : null;
        jpd jpdVar = this.p0;
        ArrayList arrayList = jpdVar.q;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MaskLight maskLight = ((ClipVideoItem) it.next()).f;
            if (maskLight != null) {
                arrayList2.add(maskLight);
            }
        }
        int size = jpdVar.q.size();
        int i2 = jpdVar.i.b;
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem.VideoDurationSetting videoDurationSetting = i2 == ynd.b ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.VideoDurationSetting.DURATION_60SEC : i2 == ynd.c ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.VideoDurationSetting.DURATION_180SEC : null;
        String lowerCase = (videoDurationSetting == null || (name = videoDurationSetting.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
        an9 an9Var = this.i;
        if (an9Var.M && (duetAction = an9Var.N) != null) {
            int i3 = e.$EnumSwitchMapping$2[duetAction.ordinal()];
            MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.TOP_BOTTOM : MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.LEFT_RIGHT : MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.WINDOW : MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.LEFT_RIGHT_CENTER;
            if (duetType != null) {
                str = duetType.toString();
                am9.a aVar = this.h.a;
                String str5 = lowerCase;
                String str6 = str;
                String str7 = aVar.e;
                str2 = aVar.a;
                storyCameraParams = this.c;
                if (str2 == null) {
                    str2 = storyCameraParams.c;
                }
                String str8 = str2;
                clipVideoFile = storyCameraParams.N;
                if (clipVideoFile == null) {
                    if (an9Var.M) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(clipVideoFile.b);
                        sb.append('_');
                        sb.append(clipVideoFile.c);
                        str4 = sb.toString();
                    } else {
                        str4 = null;
                    }
                    str3 = str4;
                } else {
                    str3 = null;
                }
                cameraUIView.k(clipsEditorInputData, new ClipsEditorUploadParams(nextInt, location, valueOf, size, str5, str6, null, str7, null, false, arrayList2, null, null, 0, false, false, false, false, null, str8, str3, null, storyCameraParams.y, storyCameraParams.I, storyCameraParams.b, null, 36174656, null));
                storyCameraParams.M = null;
                cameraUIView.r();
                P0(false);
                Y = Y();
                if (Y != null) {
                    Y.r(storyCameraParams.o);
                }
                z = storyCameraParams.p0;
                CameraUIView cameraUIView2 = this.b;
                if (!z) {
                    cameraUIView2.m();
                }
                cameraUIView2.g1 = true;
                stopwatchView = cameraUIView2.B0;
                if (stopwatchView != null) {
                    stopwatchView.a(false);
                }
                stopwatchView2 = cameraUIView2.M0;
                if (stopwatchView2 != null) {
                    stopwatchView2.a(false);
                }
                masksWrap = cameraUIView2.b0;
                if (masksWrap != null) {
                    masksWrap.u();
                }
                camera1View = cameraUIView2.getCamera1View();
                if (camera1View != null) {
                    camera1View.N();
                }
                v0();
                an9Var.p = true;
                cameraUIView.getPositions().d();
                cameraUIView.setShutterPosition(false);
                lsd lsdVar = jpdVar.j;
                dw20Var = lsdVar.g;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                dVar = lsdVar.h;
                if (dVar != null) {
                    dVar.hide();
                }
                dVar2 = lsdVar.h;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
                if (fkq0.c(storyCameraParams.g)) {
                    return;
                }
                xee xeeVar = xee.e;
                T t = xeeVar.b;
                long j2 = xeeVar.c;
                if ((t == 0 || System.currentTimeMillis() - j2 >= xeeVar.a) && xeeVar.d == null) {
                    xeeVar.c();
                    return;
                }
                return;
            }
        }
        str = null;
        am9.a aVar2 = this.h.a;
        String str52 = lowerCase;
        String str62 = str;
        String str72 = aVar2.e;
        str2 = aVar2.a;
        storyCameraParams = this.c;
        if (str2 == null) {
        }
        String str82 = str2;
        clipVideoFile = storyCameraParams.N;
        if (clipVideoFile == null) {
        }
        cameraUIView.k(clipsEditorInputData, new ClipsEditorUploadParams(nextInt, location, valueOf, size, str52, str62, null, str72, null, false, arrayList2, null, null, 0, false, false, false, false, null, str82, str3, null, storyCameraParams.y, storyCameraParams.I, storyCameraParams.b, null, 36174656, null));
        storyCameraParams.M = null;
        cameraUIView.r();
        P0(false);
        Y = Y();
        if (Y != null) {
        }
        z = storyCameraParams.p0;
        CameraUIView cameraUIView22 = this.b;
        if (!z) {
        }
        cameraUIView22.g1 = true;
        stopwatchView = cameraUIView22.B0;
        if (stopwatchView != null) {
        }
        stopwatchView2 = cameraUIView22.M0;
        if (stopwatchView2 != null) {
        }
        masksWrap = cameraUIView22.b0;
        if (masksWrap != null) {
        }
        camera1View = cameraUIView22.getCamera1View();
        if (camera1View != null) {
        }
        v0();
        an9Var.p = true;
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(false);
        lsd lsdVar2 = jpdVar.j;
        dw20Var = lsdVar2.g;
        if (dw20Var != null) {
        }
        dVar = lsdVar2.h;
        if (dVar != null) {
        }
        dVar2 = lsdVar2.h;
        if (dVar2 != null) {
        }
        if (fkq0.c(storyCameraParams.g)) {
        }
    }

    @Override // xsna.bm9
    public final void h3(Bundle bundle) {
        jpd jpdVar = this.p0;
        if (bundle == null) {
            jpdVar.getClass();
        } else {
            if (hg1.d(jpdVar.p) || !jpdVar.d().c(TemplatesFlowScreen.CAMERA)) {
                return;
            }
            jpdVar.g();
        }
    }

    @Override // xsna.bm9
    public final void h4() {
        W().c(this.b.getContext(), MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_CAMERA);
    }

    @Override // xsna.di9
    public final void i() {
        this.O.a.d(2);
    }

    public final void i0(long j2) {
        io.reactivex.rxjava3.disposables.c cVar = this.A;
        if (cVar != null) {
            cVar.dispose();
        }
        this.A = q.B0(j2, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ff3(new com.vk.im.ui.fragments.b(this, 15), 4));
    }

    @Override // xsna.bm9
    public final void i3(boolean z) {
        this.g0 = z;
    }

    @Override // xsna.bm9
    public final void i4() {
        jpd jpdVar = this.p0;
        CameraUIView cameraUIView = jpdVar.c;
        an9 an9Var = jpdVar.b.i;
        if (!jpdVar.D || jpdVar.C || an9Var.p) {
            return;
        }
        if (jpdVar.q.isEmpty()) {
            L.l("There are no clip fragments");
            cameraUIView.t0(y8g0.e(R.string.error));
            return;
        }
        if (an9Var.l) {
            StopwatchView stopwatchView = cameraUIView.B0;
            if (stopwatchView != null) {
                stopwatchView.a(false);
            }
            StopwatchView stopwatchView2 = cameraUIView.M0;
            if (stopwatchView2 != null) {
                stopwatchView2.a(false);
            }
            jpdVar.o();
            nf9 nf9Var = nf9.b;
            am9.a aVar = new am9.a();
            aVar.j = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
            nf9.b(nf9Var, StoryPublishEvent.GO_TO_EDITOR, aVar, null, null, true, null, 108).e();
        }
    }

    public final void j0() {
        Uri uri = this.q;
        if (uri != null) {
            this.b.b0(uri);
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = this.b.getContext();
        permissionHelper.getClass();
        if (PermissionHelper.q(context)) {
            io.reactivex.rxjava3.disposables.c cVar = this.J;
            if (cVar == null || cVar.h()) {
                io.reactivex.rxjava3.internal.operators.single.c cVar2 = new io.reactivex.rxjava3.internal.operators.single.c(new n() { // from class: xsna.mm9
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        io.reactivex.rxjava3.core.q t;
                        com.vk.cameraui.impl.a aVar = com.vk.cameraui.impl.a.this;
                        bpn0 bpn0Var = iz10.a;
                        Context context2 = e43.a;
                        if (context2 == null) {
                            context2 = null;
                        }
                        yz10 a = iz10.a(context2);
                        ArrayList arrayList = a.b.a;
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        if (arrayList == null) {
                            ref$BooleanRef.element = true;
                            t = com.vk.cameraui.impl.a.f0(a);
                        } else {
                            ref$BooleanRef.element = false;
                            t = io.reactivex.rxjava3.core.q.T(arrayList).t(new kb(new bi0(aVar, a, ref$BooleanRef), 9));
                        }
                        l8 l8Var = new l8(new lb(aVar, 16), 9);
                        t.getClass();
                        return new io.reactivex.rxjava3.internal.operators.observable.i0(t, l8Var).U(new nb(new mb(ref$BooleanRef, 14), 4)).J(new Pair(null, Boolean.valueOf(ref$BooleanRef.element)));
                    }
                });
                asu0 asu0Var = asu0.a;
                this.J = cVar2.q(asu0Var.c()).m(asu0Var.d()).subscribe(new n20(new com.vk.im.engine.internal.storage.delegates.messages.b(this, 16), 10), new tf1(new e60(8), 6));
            }
        }
    }

    @Override // xsna.bm9
    public final void j3() {
        ClipsControlsView clipsControls;
        bm9 presenter;
        an9 state;
        an9 state2;
        dm9 dm9Var = this.e;
        new nk9(dm9Var.o).b();
        an9 an9Var = this.i;
        int i2 = 1;
        an9Var.c = true;
        an9Var.E = ij9.a.f();
        an9Var.B = true;
        CameraUIView cameraUIView = this.b;
        cameraUIView.getPositions().a();
        j0();
        i0(500L);
        StoryCameraParams storyCameraParams = this.c;
        if (storyCameraParams.f != null) {
            cameraUIView.setShareButtonVisible(true);
            if (((fig) dm9Var.o()).a) {
                cameraUIView.x0(true);
            }
        }
        Context context = cameraUIView.getContext();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int i3 = 5;
        this.G = new y(new c0(new io.reactivex.rxjava3.internal.operators.observable.q(new nsn(context, ref$ObjectRef)), io.reactivex.rxjava3.internal.functions.a.d, new eki0(ref$ObjectRef, 0)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new ho1(new go1(this, 16), i3), new io1(new g8(i3), 9));
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            camera1View.setPreviewCallback(this);
        }
        B0();
        boolean i4 = I3(an9Var.H).i();
        jpd jpdVar = this.p0;
        jpdVar.getClass();
        jpdVar.a(jpdVar.e.f().k0().c().q(asu0.a.c()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new zsb(new com.vk.movika.sdk.base.ui.f(jpdVar, 19), i2), new defpackage.i0(new y89(L.a, 1), 11)));
        if (!jpdVar.E) {
            jpdVar.E = true;
            jpdVar.m(i4);
        }
        jpdVar.H.d(mpo.a.b);
        if (c4().i() && !cameraUIView.g1 && (clipsControls = cameraUIView.getClipsControls()) != null && !clipsControls.getClipsControlsTipsShown()) {
            bm9 presenter2 = cameraUIView.getPresenter();
            boolean z = (presenter2 == null || (state2 = presenter2.getState()) == null || !state2.e()) && ((presenter = cameraUIView.getPresenter()) == null || (state = presenter.getState()) == null || !state.g());
            ClipsControlsView clipsControls2 = cameraUIView.getClipsControls();
            if (clipsControls2 != null) {
                View[] viewArr = clipsControls2.y;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (clipsControls2.isLaidOut()) {
                    clipsControls2.v = true;
                    if (!z) {
                        ArrayList arrayList = new ArrayList();
                        for (View view : viewArr) {
                            if (!epx.f(view, clipsControls2.findViewById(R.id.camera_clips_controls_tip_settings))) {
                                arrayList.add(view);
                            }
                        }
                        viewArr = (View[]) arrayList.toArray(new View[0]);
                    }
                    dod.c(viewArr, new gy(clipsControls2, 6));
                } else {
                    clipsControls2.addOnLayoutChangeListener(new fod(clipsControls2, z));
                }
            }
        }
        if (this.i0) {
            this.i0 = false;
            ClipVideoFile clipVideoFile = storyCameraParams.N;
            if (clipVideoFile != null) {
                E0(clipVideoFile);
            }
        }
        D0();
    }

    @Override // xsna.bm9
    public final void j4(float f2, int i2, int i3) {
        an9 an9Var = this.i;
        an9Var.H = i2;
        an9Var.I = i3;
        an9Var.J = f2;
    }

    @Override // xsna.bm9
    public final void k3(boolean z) {
        this.b.j0(c4().i(), z);
    }

    @Override // xsna.bm9
    public final void k4() {
        this.b.x0(false);
    }

    @Override // xsna.di9
    public final AnimatorSet l(float f2, TimeInterpolator timeInterpolator) {
        an9 an9Var = this.i;
        an9Var.V = false;
        an9Var.f = false;
        this.b.getPositions().d();
        return new AnimatorSet();
    }

    public final void l0() {
        an9 an9Var = this.i;
        StoryCameraMode I3 = I3(an9Var.H);
        this.b.setQrProcessingEnabled((I3.i() || I3 == StoryCameraMode.LIVE || an9Var.h || an9Var.q || an9Var.g || an9Var.e) ? false : true);
    }

    @Override // xsna.bm9
    public final void l3(int i2) {
        if (this.i.o) {
            int d2 = io9.d();
            xmg0 xmg0Var = d2 != 0 ? d2 != 1 ? d2 != 2 ? d2 != 3 ? xmg0.b.a : (180 > i2 || i2 >= 271) ? (271 > i2 || i2 >= 361) ? xmg0.b.a : xmg0.c.a : xmg0.a.a : (270 > i2 || i2 >= 361) ? (i2 < 0 || i2 >= 91) ? xmg0.b.a : xmg0.c.a : xmg0.a.a : (i2 < 0 || i2 >= 91) ? (91 > i2 || i2 >= 181) ? xmg0.b.a : xmg0.c.a : xmg0.a.a : (90 > i2 || i2 >= 181) ? (181 > i2 || i2 >= 271) ? xmg0.b.a : xmg0.c.a : xmg0.a.a;
            if (epx.f(this.x, xmg0Var)) {
                return;
            }
            this.x = xmg0Var;
            this.b.F0(xmg0Var);
        }
    }

    @Override // xsna.bm9
    public final void l4() {
        int i2 = 13;
        if (!ni9.b()) {
            U(RecorderBase.RecordingType.LIVE, new ka0(this, i2));
            s3q0 s3q0Var = s3q0.a;
        } else if (!MediaNative.checkOrLoadOkPublisher()) {
            this.b.g0();
        } else {
            U(RecorderBase.RecordingType.LIVE, new ka0(this, i2));
            s3q0 s3q0Var2 = s3q0.a;
        }
    }

    public final void m0(StoryMultiData storyMultiData, boolean z) {
        p5p Y;
        dm9 dm9Var = this.e;
        CameraUIView cameraUIView = this.b;
        StoryCameraParams storyCameraParams = this.c;
        if (!z && (Y = Y()) != null) {
            zd9 camera1View = cameraUIView.getCamera1View();
            if (camera1View != null) {
                f4m.j(camera1View);
            }
            cameraUIView.setCameraGridVisible(false);
            ((StoryEditorComponent) dm9Var.e.getValue()).Sb().b(Y, storyMultiData, storyCameraParams.b, new h(Y.b().getContext()));
            return;
        }
        Intent a = dm9Var.d().A().a(cameraUIView.getContext());
        a.putExtra("story", storyMultiData);
        a.putExtra("show_sending_message", storyCameraParams.L != null || this.i.S);
        a.putExtra("description_text", storyCameraParams.t);
        Integer num = storyCameraParams.l0;
        if (num != null) {
            a.putExtra("request_sharing_success_code", num.intValue());
        }
        a.putExtra("instant", z);
        a.putExtra("only_user", storyCameraParams.E);
        Activity h2 = e3m.h(this.b.getContext());
        if (h2 != null) {
            h2.startActivityForResult(a, 2);
        }
    }

    @Override // xsna.bm9
    public final void m3(MusicCameraData musicCameraData) {
        if (this.p0.q.isEmpty()) {
            bi9 bi9Var = this.M;
            io.reactivex.rxjava3.disposables.b bVar = bi9Var.c;
            bVar.e();
            bi9Var.d = true;
            bVar.b(hg1.i(ktr.d(rsg0.w0(yfb.x(hx4.o(k840.b, Collections.singletonList(musicCameraData.b), null, 6))).l(new ai3(new oc0(9), 4))).h(new mf1(new com.vk.voip.ui.menu.feature.a(bi9Var, 14), 6)), new l22(2, bi9Var, musicCameraData)));
        }
    }

    @Override // xsna.bm9
    public final void m4() {
        final jpd jpdVar = this.p0;
        CameraUIView cameraUIView = jpdVar.c;
        cameraUIView.m();
        h7u0.a aVar = new h7u0.a(cameraUIView.getContext());
        aVar.U(jpdVar.F ? R.string.clips_remove_all_fragments : R.string.clips_remove_last_fragment);
        aVar.c0(R.string.delete, new gpd(jpdVar, 0));
        aVar.W(R.string.cancel, new o1c());
        aVar.a0(new DialogInterface.OnDismissListener() { // from class: xsna.hpd
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                jpd.this.c.t();
            }
        });
        aVar.m();
    }

    @Override // xsna.rl9.c
    public final void n(final int i2, final int i3, final int i4, final byte[] bArr) {
        if (bArr != null && this.Y.getAndSet(false)) {
            v vVar = new v(new Callable() { // from class: xsna.pm9
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    pes pesVar = new pes();
                    pesVar.g = true;
                    pesVar.h(i2, i3);
                    pesVar.g(bArr);
                    Bitmap b2 = kd7.b(kd7.k(egs.a(pesVar), i4, false), com.vk.cameraui.impl.a.q0, com.vk.cameraui.impl.a.r0, false, false);
                    it80.a aVar = it80.b;
                    Bitmap h2 = kd7.h(this.b.getContext(), b2, iah0.a(4));
                    aVar.getClass();
                    return new it80(h2);
                }
            });
            asu0.a.getClass();
            b0 m = vVar.q(asu0.p()).m(io.reactivex.rxjava3.android.schedulers.a.b());
            ph3 ph3Var = new ph3(new mz(this, 18), 9);
            int i5 = kwg0.a;
            this.I = m.subscribe(ph3Var, new iwg0());
        }
    }

    public final boolean n0() {
        WebStoryBox webStoryBox = this.c.u;
        if (epx.f(webStoryBox != null ? webStoryBox.b : null, "image")) {
            return false;
        }
        return !epx.f(webStoryBox != null ? webStoryBox.b : null, "video");
    }

    @Override // xsna.bm9
    public final void n3() {
        am9 am9Var = this.h;
        am9Var.getClass();
        am9Var.b("change_state", new mz(am9Var, 17));
    }

    @Override // xsna.bm9
    public final void n4() {
        this.e.a.getClass();
        xkg.c.m(null, true);
    }

    public final boolean o0() {
        return this.a0 && !c4().i();
    }

    @Override // xsna.bm9
    public final boolean o3() {
        an9 an9Var = this.i;
        if (an9Var.p || an9Var.q || an9Var.d || c4() == StoryCameraMode.QR_SCANNER || c4() == StoryCameraMode.CLIPS) {
            return false;
        }
        if (this.c.J != null) {
            zd9 camera1View = this.b.getCamera1View();
            if (camera1View == null) {
                return false;
            }
            mo9.b bVar = camera1View.s;
            if (bVar != null && bVar.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.bm9
    public final void o4() {
        am9.a aVar = this.h.a;
        zd9 camera1View = this.b.getCamera1View();
        boolean z = false;
        if (camera1View != null && camera1View.getFlashMode() == 2) {
            z = true;
        }
        aVar.k = z;
    }

    @Override // xsna.qk6
    public final void onActivityResult(int i2, int i3, Intent intent) {
        ArrayList parcelableArrayList;
        bg8 presenter;
        bg8 presenter2;
        bg8 presenter3;
        List list;
        WebServiceInfo webServiceInfo;
        StoryCameraParams storyCameraParams = this.c;
        int i4 = 0;
        this.b0 = i3 == -1 && i2 == 2;
        am9 am9Var = this.h;
        jpd jpdVar = this.p0;
        if (i2 == 13 && c4().i()) {
            a aVar = jpdVar.b;
            if (i3 == -1) {
                CameraUIView cameraUIView = jpdVar.c;
                zd9 camera1View = cameraUIView.getCamera1View();
                if (camera1View != null) {
                    camera1View.setPreferredVideoRecordQuality(null);
                }
                jpdVar.q.clear();
                jpdVar.q(false);
                kbk context = ((CameraClipsComponent) jpdVar.e.i.getValue()).c4().getContext();
                if (context == null || !context.d) {
                    g620.f().a().i(cameraUIView.getContext(), fpf0.a(ClipFeedTab.TopVideo.class), null);
                }
                cameraUIView.O(-1, null, false);
            } else {
                if (intent != null ? intent.getBooleanExtra("exit_creation_flow", false) : false) {
                    aVar.finish();
                } else {
                    aVar.v(true, false);
                }
            }
        } else if (i3 == -1) {
            CameraUIView cameraUIView2 = this.b;
            if (i2 == 1 && !this.i.p) {
                am9Var.c(StoryPublishEvent.CLOSE_GALLERY, null);
                if (intent == null) {
                    return;
                }
                int i5 = 6;
                if (c4().i()) {
                    int i6 = 11;
                    qm1 qm1Var = new qm1(this, i6);
                    CameraUIView cameraUIView3 = jpdVar.c;
                    l3e0.a aVar2 = new l3e0.a(cameraUIView3.getContext(), new l63(i5));
                    s9e s9eVar = new s9e(new bpn0(new s1(jpdVar, 21)), new bpn0(new u40(jpdVar, 15)), jpdVar.e.o);
                    jpdVar.h.b(new r(new v(new q9e(s9eVar, intent)), new e10(new r9e(s9eVar, cameraUIView3.getContext(), aVar2, i4), 14)).q(asu0.a.A(1, "clips-gallery-processing-thread")).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new w00(new he3(10, jpdVar, qm1Var), i6)));
                } else {
                    try {
                        boolean u = cameraUIView2.getStickersState().u();
                        WebStoryBox webStoryBox = storyCameraParams.u;
                        list = f3m0.a(intent, u, (webStoryBox == null || (webServiceInfo = webStoryBox.i) == null) ? false : epx.f(webServiceInfo.h, Boolean.TRUE));
                    } catch (Throwable th) {
                        L.g("Error handle result of onActivityResult for create story/clip", th);
                        h03.b(th);
                        list = EmptyList.b;
                    }
                    if (list.isEmpty()) {
                        return;
                    }
                    k0(this, list, false, false, 6);
                    itg0.j(io.reactivex.rxjava3.core.a.l(new my10(i4, storyCameraParams, list)).q(asu0.a.c()), null, 3);
                }
            } else if (i2 == 2) {
                p5p Y = Y();
                if (Y != null) {
                    Y.b0();
                }
                Intent intent2 = new Intent();
                intent2.putExtra("UPLOAD_USER_ID", this.m0);
                s3q0 s3q0Var = s3q0.a;
                cameraUIView2.O(-1, intent2, false);
            } else if (i2 == 3) {
                cameraUIView2.M(false);
            } else if (i2 == 4) {
                BroadcastAuthor broadcastAuthor = intent != null ? (BroadcastAuthor) intent.getParcelableExtra("result_extra_selected_author") : null;
                BroadcastStream broadcastStream = intent != null ? (BroadcastStream) intent.getParcelableExtra("result_extra_selected_stream") : null;
                boolean z = broadcastAuthor instanceof BroadcastAuthor.CurrentUser;
                C0443a c0443a = this.n;
                if (z) {
                    c0443a.a = ((BroadcastAuthor.CurrentUser) broadcastAuthor).b.c;
                    cn cnVar = this.k;
                    String str = cnVar.b;
                    c0443a.b = cnVar.c;
                    cg8 broadcastFriends = cameraUIView2.getBroadcastFriends();
                    if (broadcastFriends != null && (presenter3 = broadcastFriends.getPresenter()) != null) {
                        presenter3.m();
                    }
                } else if (broadcastAuthor instanceof BroadcastAuthor.Group) {
                    BroadcastAuthor.Group group = (BroadcastAuthor.Group) broadcastAuthor;
                    c0443a.a = fkq0.e(group.b.c);
                    Group group2 = group.b;
                    String str2 = group2.d;
                    c0443a.b = group2.e;
                    c0443a.f = group;
                    cg8 broadcastFriends2 = cameraUIView2.getBroadcastFriends();
                    if (broadcastFriends2 != null && (presenter = broadcastFriends2.getPresenter()) != null) {
                        presenter.o(group);
                    }
                }
                if (broadcastStream instanceof BroadcastStream.New) {
                    c0443a.c = null;
                    c0443a.d = null;
                    c0443a.e = null;
                } else if (broadcastStream instanceof BroadcastStream.Upcoming) {
                    BroadcastStream.Upcoming upcoming = (BroadcastStream.Upcoming) broadcastStream;
                    VideoFile videoFile = upcoming.b;
                    VideoFile videoFile2 = upcoming.b;
                    c0443a.c = Integer.valueOf(videoFile.o0());
                    c0443a.d = videoFile2.getTitle();
                    c0443a.e = Long.valueOf(videoFile2.Na() * 1000);
                }
                cg8 broadcastFriends3 = cameraUIView2.getBroadcastFriends();
                if (broadcastFriends3 != null && (presenter2 = broadcastFriends3.getPresenter()) != null) {
                    presenter2.k(c0443a.a);
                }
                am9Var.a.b = Long.valueOf(c0443a.a.b);
                q4();
                cameraUIView2.setLiveAuthorPhoto(c0443a.b);
                String str3 = c0443a.d;
                if (str3 == null) {
                    str3 = "";
                }
                cameraUIView2.setLiveNameText(str3);
                cameraUIView2.setLiveNameTextEditable(c0443a.d == null);
            } else if (i2 == 5) {
                cameraUIView2.M(false);
            } else {
                int i7 = 8;
                if (i2 == 8) {
                    rgd rgdVar = jpdVar.z;
                    if (intent == null) {
                        return;
                    }
                    rgdVar.getClass();
                    Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                    if (bundleExtra != null && (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) != null && !parcelableArrayList.isEmpty()) {
                        rgdVar.f = new s0(new qgd(i4, rgdVar, (Uri) j5g.Y(parcelableArrayList))).a0(io.reactivex.rxjava3.android.schedulers.a.b()).r0(asu0.a.c()).subscribe(new ov2(new nv2(i7, rgdVar, parcelableArrayList), 9));
                    }
                }
            }
        }
        if (i2 == 3) {
            am9Var.d(StoryPublishEvent.CLOSE_SETTINGS);
        }
    }

    @Override // xsna.qk6
    public final void onDestroy() {
        StoryCameraTarget storyCameraTarget = this.c.o;
        StoryCameraTarget storyCameraTarget2 = StoryCameraTarget.CLIP_FRAGMENT;
        dm9 dm9Var = this.e;
        if (storyCameraTarget != storyCameraTarget2 && ((CameraClipsComponent) dm9Var.i.getValue()).c4().getContext() != null) {
            ((CameraClipsComponent) dm9Var.i.getValue()).c4().i();
        }
        p5p Y = Y();
        if (Y != null) {
            Y.f();
        }
        dm9Var.d().e().i();
        O0();
        this.M.c.dispose();
        this.O.b();
        StickersDrawingViewGroup stickersDrawingViewGroup = this.b.p;
        if (stickersDrawingViewGroup != null) {
            stickersDrawingViewGroup.q();
        }
        if (this.e0.isInitialized()) {
            Z().d(true);
        }
        MasksController.d();
        e0().clear();
        ((ContentPrivacyComponent) dm9Var.l.getValue()).Z8().j().a.clear();
        this.j0.e();
    }

    @Override // xsna.qk6
    public final void onPause() {
        com.vk.media.recorder.f fVar;
        CameraUIView cameraUIView = this.b;
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            new Exception();
            mo9.b bVar = camera1View.s;
            if (bVar != null && (fVar = bVar.a) != null) {
                fVar.i();
            }
        }
        if (this.i.e) {
            cameraUIView.w();
            cameraUIView.u();
            R0();
            w0();
        }
        P0(true);
        u0();
        p5p Y = Y();
        if (Y != null) {
            Y.l();
        }
        pe8 f2 = cameraUIView.getPositions().f();
        if (f2 != null) {
            f2.pause();
        }
        ho9.e((Activity) cameraUIView.getContext(), false);
        this.O.b();
    }

    @Override // xsna.qk6
    public final void onResume() {
        com.vk.media.recorder.f fVar;
        an9 state;
        p5p Y = Y();
        if (Y != null) {
            Y.u();
        }
        CameraUIView cameraUIView = this.b;
        pe8 f2 = cameraUIView.getPositions().f();
        if (f2 != null) {
            f2.resume();
        }
        if (this.i.a) {
            ho9.e((Activity) cameraUIView.getContext(), true);
            X0();
        }
        StickersDrawingViewGroup stickersDrawingViewGroup = cameraUIView.p;
        if (stickersDrawingViewGroup != null) {
            stickersDrawingViewGroup.p();
        }
        B0();
        if (c4().i()) {
            jpd jpdVar = this.p0;
            CameraUIView cameraUIView2 = jpdVar.c;
            jpdVar.B();
            if (!jpdVar.q.isEmpty()) {
                bm9 presenter = cameraUIView2.getPresenter();
                if (presenter != null && (state = presenter.getState()) != null) {
                    state.e = false;
                }
                jpdVar.f.postDelayed(new o93(jpdVar, 4), 500L);
            }
            zd9 camera1View = cameraUIView2.getCamera1View();
            if (camera1View != null) {
                camera1View.P(jpdVar.n, false);
            }
            jpdVar.C(null);
        }
        W0();
        l0();
        zd9 camera1View2 = cameraUIView.getCamera1View();
        if (camera1View2 != null) {
            new Exception();
            camera1View2.A();
            mo9.b bVar = camera1View2.s;
            if (bVar == null || (fVar = bVar.a) == null) {
                return;
            }
            fVar.j();
        }
    }

    @Override // xsna.qk6
    public final void onStart() {
        CameraUIView cameraUIView = this.b;
        zd9 camera1View = cameraUIView.getCamera1View();
        if (camera1View != null) {
            camera1View.d();
        }
        if (this.i.a) {
            if (!this.U) {
                cameraUIView.y0();
                S0();
            }
            x0();
        }
    }

    @Override // xsna.qk6
    public final void onStop() {
        L.e("CameraUIPresenter.onStop()");
        N0();
        io.reactivex.rxjava3.disposables.c cVar = this.K;
        if (cVar != null) {
            cVar.dispose();
        }
        this.K = null;
        if (this.i.j()) {
            CameraUIView cameraUIView = this.b;
            cameraUIView.w();
            cameraUIView.u();
            R0();
            w0();
            io.reactivex.rxjava3.disposables.c cVar2 = this.B;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.I = null;
        }
    }

    @Override // xsna.di9
    public final void p(StoryMultiData storyMultiData, CameraEditorContentType cameraEditorContentType, boolean z) {
        StoryEntry storyEntry;
        List<StoryMediaData> list = storyMultiData.b;
        CommonUploadParams commonUploadParams = storyMultiData.d;
        this.m0 = commonUploadParams.Kb() ? commonUploadParams.e : commonUploadParams.b;
        StoryCameraParams storyCameraParams = this.c;
        StoryCameraTarget storyCameraTarget = storyCameraParams.o;
        StoryEntryExtended storyEntryExtended = storyCameraParams.n;
        StoryCameraTarget storyCameraTarget2 = StoryCameraTarget.IM;
        CameraUIView cameraUIView = this.b;
        if (storyCameraTarget == storyCameraTarget2) {
            boolean z2 = cameraEditorContentType == CameraEditorContentType.STORY;
            boolean z3 = list.size() == 1;
            long j2 = storyCameraParams.q;
            if (j2 != 0 && z3 && storyCameraParams.D) {
                z0(storyMultiData, z2, j2);
            }
            cameraUIView.O(-1, s0(storyMultiData, z2), true);
            return;
        }
        StoryCameraTarget storyCameraTarget3 = StoryCameraTarget.ME;
        dm9 dm9Var = this.e;
        if (storyCameraTarget == storyCameraTarget3) {
            Intent a = dm9Var.d().A().a(cameraUIView.getContext());
            a.putExtra("target_me", true);
            if (cameraEditorContentType == CameraEditorContentType.STORY || cameraEditorContentType == CameraEditorContentType.CLIP) {
                a.putExtra("story", storyMultiData);
            } else if (list.get(0).e) {
                a.putExtra("camera_photo", new CameraPhotoParameters(list.get(0).b, EmptyList.b));
            } else {
                a.putExtra("camera_video", new CameraVideoParameters(list.get(0).c, EmptyList.b));
            }
            Activity h2 = e3m.h(this.b.getContext());
            if (h2 != null) {
                h2.startActivityForResult(a, 5);
                return;
            }
            return;
        }
        if (storyCameraTarget == StoryCameraTarget.VMOJI_UPLOAD) {
            cameraUIView.O(-1, s0(storyMultiData, false), true);
            return;
        }
        if (storyEntryExtended == null || (storyEntry = storyEntryExtended.b) == null || !storyEntry.E) {
            storyCameraTarget.getClass();
            if (storyCameraTarget == StoryCameraTarget.UNDEFINED) {
                m0(storyMultiData, z);
                return;
            } else {
                m0(storyMultiData, true);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (storyEntryExtended != null) {
            arrayList.add(Long.valueOf(storyEntryExtended.c.Fb().b));
        }
        commonUploadParams.d = arrayList;
        ((StoriesComponent) dm9Var.d.getValue()).eb().b(storyMultiData);
        cameraUIView.M(true);
    }

    public final boolean p0() {
        if (c4().i()) {
            return this.b.getPositions().x().N == null && !this.i.X;
        }
        return true;
    }

    @Override // xsna.bm9
    public final ArrayList p3(Map map) {
        ArrayList arrayList = new ArrayList();
        Context context = this.b.getContext();
        pkj0 pkj0Var = this.d;
        pkj0Var.getClass();
        StoryCameraParams storyCameraParams = this.c;
        Iterator<T> it = storyCameraParams.e.iterator();
        while (it.hasNext()) {
            pkj0Var.a(context, (StoryCameraMode) it.next(), storyCameraParams, arrayList, map);
        }
        return arrayList;
    }

    @Override // xsna.bm9
    public final int p4(int i2, HashMap hashMap, LinkedList linkedList) {
        ShutterButton.d dVar;
        if (i2 < 0) {
            return i2;
        }
        int i3 = e.$EnumSwitchMapping$1[this.c.e.get(i2).ordinal()];
        an9 an9Var = this.i;
        switch (i3) {
            case 1:
                if (!an9Var.p) {
                    if (!an9Var.e) {
                        if (!an9Var.g && !an9Var.i) {
                            dVar = (ShutterButton.d) hashMap.get(ShutterStates.STORY_VIDEO);
                            break;
                        } else {
                            dVar = (ShutterButton.d) hashMap.get(ShutterStates.SEND_LOOP_PROCESSING);
                            break;
                        }
                    } else {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.VIDEO_RECORDING);
                        break;
                    }
                } else if (!an9Var.e) {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.SEND_CLIP_MULTIPLE_EMPTY);
                    break;
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.VIDEO_RECORDING);
                    break;
                }
                break;
            case 2:
                if (!an9Var.u) {
                    if (!an9Var.q) {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.LIVE);
                        break;
                    } else {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.START_LIVE);
                        break;
                    }
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.LIVE_LOADING);
                    break;
                }
            case 3:
                if (!an9Var.p) {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.STORY);
                    break;
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.EMPTY);
                    break;
                }
            case 4:
                if (!an9Var.e) {
                    if (!an9Var.g && !an9Var.i) {
                        if (!an9Var.p) {
                            dVar = (ShutterButton.d) hashMap.get(ShutterStates.LOOP);
                            break;
                        } else {
                            dVar = (ShutterButton.d) hashMap.get(ShutterStates.EMPTY);
                            break;
                        }
                    } else {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.SEND_LOOP_PROCESSING);
                        break;
                    }
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.SEND_LOOP_STOP);
                    break;
                }
                break;
            case 5:
                if (!an9Var.p) {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.REVERSE);
                    break;
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.EMPTY);
                    break;
                }
            case 6:
                if (!an9Var.p) {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.PHOTO);
                    break;
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.EMPTY);
                    break;
                }
            case 7:
                if (!an9Var.p) {
                    if (!an9Var.e) {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.VIDEO);
                        break;
                    } else {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.VIDEO_RECORDING);
                        break;
                    }
                } else if (!an9Var.e) {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.EMPTY);
                    break;
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.VIDEO_RECORDING);
                    break;
                }
            case 8:
                if (!an9Var.p) {
                    if (!an9Var.e) {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.STORY_VIDEO);
                        break;
                    } else {
                        dVar = (ShutterButton.d) hashMap.get(ShutterStates.VIDEO_RECORDING);
                        break;
                    }
                } else if (!an9Var.e) {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.EMPTY);
                    break;
                } else {
                    dVar = (ShutterButton.d) hashMap.get(ShutterStates.VIDEO_RECORDING);
                    break;
                }
            case 9:
                dVar = (ShutterButton.d) hashMap.get(ShutterStates.EMPTY);
                break;
            case 10:
                dVar = (ShutterButton.d) hashMap.get(ShutterStates.PHOTO);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return linkedList.indexOf(dVar);
    }

    @Override // xsna.di9
    public final AnimatorSet q() {
        this.i.f = false;
        this.b.getPositions().d();
        return new AnimatorSet();
    }

    public final boolean q0() {
        zd9 camera1View = this.b.getCamera1View();
        if (camera1View == null) {
            return false;
        }
        mo9.b bVar = camera1View.s;
        MediaUtils.e eVar = null;
        if (bVar != null) {
            com.vk.media.recorder.f fVar = bVar.a;
            oj9 oj9Var = fVar != null ? fVar.c : null;
            if (oj9Var != null) {
                eVar = oj9Var.e;
            }
        }
        return eVar != null;
    }

    @Override // xsna.bm9
    public final boolean q3() {
        return this.i.e;
    }

    @Override // xsna.bm9
    public final void q4() {
        bg8 presenter;
        bg8 presenter2;
        i iVar = this.F;
        if (iVar != null) {
            iVar.dispose();
        }
        CameraUIView cameraUIView = this.b;
        cg8 broadcastFriends = cameraUIView.getBroadcastFriends();
        C0443a c0443a = this.n;
        if (broadcastFriends != null && (presenter2 = broadcastFriends.getPresenter()) != null) {
            presenter2.k(c0443a.a);
        }
        cg8 broadcastFriends2 = cameraUIView.getBroadcastFriends();
        eg8 K = (broadcastFriends2 == null || (presenter = broadcastFriends2.getPresenter()) == null) ? null : presenter.K();
        if (K != null) {
            this.i.Y = true;
            q I0 = q.I0(K, this.e.d().a().g(c0443a.a), new xl0(new z77(this, 1), 9));
            i iVar2 = new i();
            I0.subscribe(iVar2);
            this.F = iVar2;
        }
    }

    @Override // xsna.di10
    public final void r() {
        this.Q.d = true;
        an9 an9Var = this.i;
        boolean z = true ^ an9Var.r;
        an9Var.r = z;
        this.s = z;
        CameraUIView cameraUIView = this.b;
        cameraUIView.getPositions().d();
        cameraUIView.Z(an9Var.r);
        this.h.c(an9Var.r ? StoryPublishEvent.OPEN_MASKS : StoryPublishEvent.CLOSE_MASKS, null);
    }

    public final void r0(boolean z) {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        jpd jpdVar = this.p0;
        vkd vkdVar = (vkd) jpdVar.g.getValue();
        String str = jpdVar.x.c;
        lbk lbkVar = vkdVar.a;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("clips_open_camera");
        aVar.d(jgp.b);
        aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        bVar.k(aVar.e());
        if (lbkVar.getContext() == null) {
            vkdVar.a.a(wrp.a(str), new SecureRandom().nextInt(Integer.MAX_VALUE), (r3 & 4) == 0);
        }
        if (z) {
            kbk context = lbkVar.getContext();
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType eventType = MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_CAMERA;
            if (context == null || (creationEntryPoint = context.a) == null) {
                creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
            }
            new kod(c2, new MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem(eventType, new MobileOfficialAppsClipsStat$ClipsCreateContext(context != null ? context.b : -1, creationEntryPoint))).q();
        }
    }

    @Override // xsna.bm9
    public final void r3(bm9.a aVar) {
        if (V()) {
            return;
        }
        an9 an9Var = this.i;
        if (an9Var.q || an9Var.i || an9Var.g) {
            return;
        }
        StoryCameraMode storyCameraMode = this.c.e.get(an9Var.H);
        if (this.M.d(storyCameraMode)) {
            return;
        }
        int i2 = e.$EnumSwitchMapping$1[storyCameraMode.ordinal()];
        int i3 = 11;
        int i4 = 0;
        CameraUIView cameraUIView = this.b;
        pxo0 pxo0Var = this.S;
        switch (i2) {
            case 1:
                jpd.k(this.p0, aVar, 2);
                break;
            case 2:
                i();
                if (!ni9.b()) {
                    l4();
                    break;
                } else {
                    eqo<kqo> eqoVar = cameraUIView.E;
                    if (eqoVar != null) {
                        eqoVar.d(kqo.a.b);
                        break;
                    }
                }
                break;
            case 3:
                if (!an9Var.p) {
                    G0(this, false, false, 30);
                    break;
                } else if (!pxo0Var.a()) {
                    C0();
                    break;
                }
                break;
            case 4:
                if (!an9Var.p) {
                    if (!an9Var.e) {
                        i();
                        U(RecorderBase.RecordingType.LOOP, new hm9(this, i4));
                        break;
                    } else if (System.currentTimeMillis() - this.t <= 1500) {
                        H0();
                        break;
                    } else {
                        K0();
                        break;
                    }
                } else if (!pxo0Var.a()) {
                    C0();
                    break;
                }
                break;
            case 5:
                ShutterButton shutterButton = cameraUIView.e;
                if (shutterButton != null) {
                    ValueAnimator valueAnimator = shutterButton.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    ofFloat.addUpdateListener(new o8h(shutterButton, 3));
                    ofFloat.setDuration(150L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.start();
                    shutterButton.x = ofFloat;
                }
                cvk.w("Not implemented yet", false);
                break;
            case 6:
                if (!an9Var.p) {
                    U(RecorderBase.RecordingType.ORIGINAL, new h6(this, i3));
                    break;
                } else if (!pxo0Var.a()) {
                    C0();
                    break;
                }
                break;
            case 7:
                if (!an9Var.p) {
                    if (!an9Var.e) {
                        U(RecorderBase.RecordingType.ORIGINAL, new ld(this, 14));
                        break;
                    } else if (System.currentTimeMillis() - this.t <= 1500) {
                        J0();
                        break;
                    } else {
                        M0();
                        break;
                    }
                } else if (!pxo0Var.a()) {
                    C0();
                    break;
                }
                break;
            case 8:
                if (!an9Var.p) {
                    if (!an9Var.e) {
                        G0(this, true, true, 28);
                        break;
                    } else if (System.currentTimeMillis() - this.t <= 1500) {
                        I0();
                        break;
                    } else {
                        L0();
                        break;
                    }
                } else if (!pxo0Var.a()) {
                    C0();
                    break;
                }
                break;
            case 10:
                U(RecorderBase.RecordingType.ORIGINAL, new h6(this, i3));
                break;
        }
        this.t = System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bm9
    public final void r4() {
        this.Q.b = true;
        StoryCameraParams storyCameraParams = this.c;
        List<? extends StoryCameraMode> list = storyCameraParams.e;
        an9 an9Var = this.i;
        StoryCameraMode storyCameraMode = list.get(an9Var.H);
        int i2 = 8;
        if (storyCameraMode == StoryCameraMode.CLIPS) {
            boolean p0 = p0();
            cb cbVar = new cb(this, 10);
            jpd jpdVar = this.p0;
            bld bldVar = jpdVar.m;
            Context context = jpdVar.c.getContext();
            bldVar.getClass();
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(bwt0.u(context)).inflate(R.layout.clips_camera_settings, (ViewGroup) null, false);
            VkSwitchItem vkSwitchItem = (VkSwitchItem) viewGroup.findViewById(R.id.camera_60_fps_settings_switch);
            vkSwitchItem.setChecked(Preference.f("clips_camera_settings").getBoolean("clips_camera_60_fps", true));
            bwt0.p0(vkSwitchItem, jpd.this.b.J3());
            vkSwitchItem.setListener(new j7(bldVar, 13));
            VkSwitchItem vkSwitchItem2 = (VkSwitchItem) viewGroup.findViewById(R.id.camera_grid_settings_switch);
            vkSwitchItem2.setChecked(Preference.f("clips_camera_settings").getBoolean("camera_grid", false));
            if (!p0) {
                vkSwitchItem2.setVisibility(8);
            }
            vkSwitchItem2.setListener(new qa(bldVar, i2));
            qxm0.r(viewGroup);
            bldVar.a(viewGroup, cbVar, null);
        } else {
            StoryCameraMode storyCameraMode2 = StoryCameraMode.LIVE;
            C0443a c0443a = this.n;
            CameraUIView cameraUIView = this.b;
            if (storyCameraMode == storyCameraMode2) {
                Context context2 = cameraUIView.getContext();
                UserId userId = c0443a.a;
                BroadcastAuthor.Group group = c0443a.f;
                ey0 ey0Var = new ey0(this, i2);
                x7 x7Var = new x7(this, 15);
                aoz aozVar = this.g;
                aozVar.getClass();
                if (userId != null && fkq0.d(userId)) {
                    rkq0 rkq0Var = (rkq0) aozVar.a.getValue();
                    rkq0Var.i = userId;
                    rkq0Var.g = ey0Var;
                    rkq0Var.h = x7Var;
                    View e2 = rkq0Var.e(context2);
                    rkq0Var.k = new WeakReference<>(e2);
                    rkq0Var.a(e2, new jsl(0, rkq0Var, rkq0.class, "handleBottomSheetClosed", "handleBottomSheetClosed()V", 0, 5), new lyl0(rkq0Var, userId));
                } else if (userId != null && fkq0.b(userId)) {
                    ((llu) aozVar.b.getValue()).e(context2, userId, group, ey0Var, x7Var);
                }
            } else {
                Activity h2 = e3m.h(cameraUIView.getContext());
                if (h2 != null) {
                    yf9.b o = this.e.o();
                    StoryCameraMode storyCameraMode3 = storyCameraParams.e.get(an9Var.H);
                    boolean J3 = J3();
                    UserId userId2 = storyCameraParams.e.get(an9Var.H) == storyCameraMode2 ? c0443a.a : this.o.a;
                    ((fig) o).getClass();
                    int i3 = StorySettingsActivity.P;
                    Intent intent = new Intent(h2, (Class<?>) StorySettingsActivity.class);
                    intent.putExtra(storyCameraMode3 == storyCameraMode2 ? "INTENT_MODE_LIVES" : "INTENT_MODE_STORIES", true);
                    intent.putExtra(fkq0.b(userId2) ? "INTENT_GROUP" : "INTENT_USER", true);
                    intent.putExtra("from_create_story", true);
                    intent.putExtra("INTENT_IS_CAMERA_60FPS_AVAILABLE ", J3);
                    h2.startActivityForResult(intent, 3);
                }
            }
        }
        this.h.d(StoryPublishEvent.OPEN_SETTINGS);
    }

    @Override // xsna.di10
    public final boolean s() {
        return this.i.r;
    }

    public final Intent s0(StoryMultiData storyMultiData, boolean z) {
        Intent intent = new Intent();
        CommonUploadParams commonUploadParams = storyMultiData.d;
        List<StoryMediaData> list = storyMultiData.b;
        intent.putExtra("camera_msg_type", commonUploadParams.i);
        if (z) {
            intent.putExtra("story", storyMultiData);
            return intent;
        }
        if (list.size() == 1) {
            StoryMediaData storyMediaData = list.get(0);
            boolean z2 = storyMediaData.e;
            File file = storyMediaData.b;
            StoryCameraParams storyCameraParams = this.c;
            if (z2) {
                if (storyCameraParams.o == StoryCameraTarget.VMOJI_UPLOAD) {
                    intent.putExtra("camera_photo_file", file);
                    return intent;
                }
                intent.putExtra("camera_photo", new CameraPhotoParameters(file, Collections.singletonList(Long.valueOf(storyCameraParams.q))));
                return intent;
            }
            intent.putExtra("camera_video", new CameraVideoParameters(storyMediaData.c, Collections.singletonList(Long.valueOf(storyCameraParams.q))));
        }
        return intent;
    }

    @Override // xsna.bm9
    public final void s3() {
        zd9 camera1View = this.b.getCamera1View();
        if ((camera1View != null ? camera1View.getCurrentMode() : null) != CameraObject$CameraMode.BACK) {
            B();
        }
    }

    @Override // xsna.di10
    public final void setNewMasksBadgeCount(String str) {
        this.b.setNewMasksBadgeCount(str);
    }

    @Override // xsna.di9
    public final void setShutterEnabled(boolean z) {
        this.b.setShutterEnabled(z);
    }

    @Override // xsna.di9
    public final void setShutterPosition(boolean z) {
        this.b.setShutterPosition(true);
    }

    @Override // xsna.di9
    public final void t(w1m0 w1m0Var) {
        this.P = w1m0Var;
        w1m0.a aVar = w1m0Var.a;
        this.b.setDrawingState(aVar.d.get(aVar.c));
    }

    public final void t0() {
        StoryCameraParams storyCameraParams = this.c;
        List<? extends StoryCameraMode> list = storyCameraParams.e;
        StoryCameraMode storyCameraMode = storyCameraParams.d;
        CameraUIView cameraUIView = this.b;
        an9 an9Var = this.i;
        cameraUIView.c0(list, storyCameraMode, an9Var);
        cameraUIView.x(an9Var.n);
        TabsRecycler tabsRecycler = cameraUIView.d;
        if (tabsRecycler != null) {
            tabsRecycler.setButtonTouchDelegate(cameraUIView.e);
            List<StoryCameraMode> z3 = ((bm9) cameraUIView.getPresenter()).z3();
            bm9 bm9Var = (bm9) cameraUIView.getPresenter();
            tabsRecycler.c(bm9Var != null ? bm9Var.V3() : 0, z3);
            tabsRecycler.post(new l96(0, tabsRecycler, cameraUIView));
        }
        cameraUIView.setShutterPosition(false);
        cameraUIView.R();
        cameraUIView.getPositions().b();
        cameraUIView.getPositions().a();
        cameraUIView.getPositions().d();
    }

    @Override // xsna.bm9
    public final void t3(boolean z) {
        this.p0.n(z && this.i.T, false);
    }

    @Override // xsna.bm9
    public final void t4(boolean z, boolean z2) {
        lmv clipsControls = this.b.getClipsControls();
        if (clipsControls != null) {
            clipsControls.x2(z);
        }
        this.p0.n(z && this.i.T, z2);
        if (z) {
            nf9 nf9Var = nf9.b;
            am9.a aVar = new am9.a();
            aVar.j = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
            nf9.b(nf9Var, StoryPublishEvent.ACTIVATED_GESTURE, aVar, null, null, true, null, 108).e();
            return;
        }
        nf9 nf9Var2 = nf9.b;
        am9.a aVar2 = new am9.a();
        aVar2.j = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
        nf9.b(nf9Var2, StoryPublishEvent.DEACTIVATED_GESTURE, aVar2, null, null, true, null, 108).e();
    }

    @Override // xsna.di9
    public final void u(float f2) {
        ShutterButton shutter = this.b.getShutter();
        if (shutter != null) {
            shutter.H.q0 = f2;
            shutter.invalidate();
        }
    }

    public final void u0() {
        this.b.F(false, new ra(this, 14));
        this.X = 0;
        this.W = false;
        this.Y.set(false);
    }

    @Override // xsna.bm9
    public final void u3() {
        y3(DuetAction.CANCEL);
        bi9 bi9Var = this.M;
        bi9Var.c.e();
        bi9Var.d = false;
        bi9Var.g = true;
    }

    @Override // xsna.bm9
    public final void u4() {
        this.Q.f = true;
        a0();
    }

    @Override // xsna.di9
    public final void v(boolean z, boolean z2) {
        boolean z3 = this.i.S;
        CameraUIView cameraUIView = this.b;
        if (z3 && !z2) {
            cameraUIView.M(false);
            return;
        }
        am9 am9Var = this.h;
        am9Var.a.f = "preview";
        MasksWrap masksWrap = cameraUIView.b0;
        if (masksWrap != null) {
            Mask selectedMask = masksWrap.getSelectedMask();
            Integer valueOf = selectedMask != null ? Integer.valueOf(selectedMask.d) : null;
            int i2 = -EffectRegistry.EffectId.RANDOM_MUSIC.id;
            if (valueOf != null && valueOf.intValue() == i2) {
                masksWrap.I(true);
            }
        }
        cameraUIView.g1 = false;
        p5p Y = Y();
        if (Y != null) {
            Y.o();
        }
        p5p Y2 = Y();
        if (Y2 != null) {
            Y2.f();
        }
        d dVar = this.Q;
        dVar.a = "";
        dVar.b = false;
        dVar.c = false;
        dVar.d = false;
        dVar.e = false;
        dVar.f = false;
        if (z) {
            this.a0 = false;
            this.b.setShutterEndless(false);
        }
        cameraUIView.y0();
        v0();
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(true);
        cameraUIView.t();
        am9Var.c(StoryPublishEvent.CLOSE_TO_CAMERA, null);
        if (c4().i()) {
            jpd jpdVar = this.p0;
            atd atdVar = jpdVar.k;
            atdVar.getClass();
            ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
            ka kaVar = new ka(atdVar, 22);
            clipsDraftPersistentStore.getClass();
            ClipsDraftPersistentStore.o(kaVar);
            jpdVar.C(null);
        }
        W0();
        l0();
    }

    public final void v0() {
        an9 an9Var = this.i;
        an9Var.q = false;
        an9Var.p = false;
        an9Var.g = false;
        an9Var.i = false;
        an9Var.h = false;
        an9Var.e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x014c, code lost:
    
        if (xsna.epx.f(r3.b, com.vk.stat.scheme.t0.a(com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen.PROFILE)) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0133, code lost:
    
        if (r2 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0136, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ad  */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, xsna.g0m0] */
    @Override // xsna.bm9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v1(String str, String str2) {
        boolean z;
        x k;
        boolean z2;
        x vVar;
        am9.a aVar;
        List<StoryAnswer> list;
        boolean z3;
        boolean z4;
        CameraUIView cameraUIView;
        CameraUIView cameraUIView2;
        am9.a aVar2;
        CameraUIView cameraUIView3;
        C0443a c0443a;
        boolean c2;
        c cVar;
        WebStoryBox webStoryBox;
        String str3;
        bn9 bn9Var;
        boolean i2;
        ClipVideoFile clipVideoFile;
        StoryCameraMode currentState;
        eqo<DynamicMasksUseCase> eqoVar;
        StoryAnswer storyAnswer;
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
        d dVar = this.Q;
        dVar.a = "";
        dVar.b = false;
        dVar.c = false;
        dVar.d = false;
        dVar.e = false;
        dVar.f = false;
        dVar.a = str != null ? str : "";
        an9 an9Var = this.i;
        int i3 = 1;
        if (!an9Var.b) {
            b.d dVar2 = new b.d("stories_open_camera");
            if (TextUtils.isEmpty(dVar.a)) {
                dVar2.b("other", "action");
            } else {
                dVar2.b(dVar.a, "action");
            }
            dVar2.h();
            if (c4() == StoryCameraMode.CLIPS) {
                r0(true);
            }
        }
        StoryCameraParams storyCameraParams = this.c;
        if (str != null) {
            storyCameraParams.c = str;
        }
        if (str2 != null) {
            String a = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE);
            if (!brm0.B(str2, a, false) || str2.length() == a.length()) {
                storyCameraParams.b = str2;
            } else {
                storyCameraParams.b = a;
            }
        }
        StoryCameraTarget storyCameraTarget = storyCameraParams.o;
        StoryMusicInfo storyMusicInfo = storyCameraParams.J;
        StoryCameraTarget storyCameraTarget2 = StoryCameraTarget.IM;
        int i4 = 11;
        int i5 = 15;
        io.reactivex.rxjava3.disposables.b bVar = this.j0;
        dm9 dm9Var = this.e;
        if (storyCameraTarget == storyCameraTarget2) {
            yf9.b o = dm9Var.o();
            long j2 = storyCameraParams.q;
            ((fig) o).getClass();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            Peer b2 = Peer.a.b(j2);
            b2.getClass();
            bVar.b((b2.Ab(Peer.Type.USER) ? i2w.a().E("PeerNameLoader", new d1e0(new g1e0(b2, Source.ACTUAL))).l(new xw70(new ekh(b2, 24), i3)).w() : b2.zb() ? i2w.a().E("PeerNameLoader", new tqm(new sqm(b2, Source.ACTUAL, false, (Object) null, 28))).l(new tp1(new d0w(b2, i4), 21)).w() : l1.b).subscribe(new i22(new v9(this, i5), 5), kwg0.b()));
        }
        an9Var.a = true;
        Integer num = storyCameraParams.c0;
        if (num != null) {
            int intValue = num.intValue();
            if (c4() == StoryCameraMode.QR_SCANNER) {
            }
            z = false;
        } else {
            if (M3()) {
            }
            z = false;
        }
        this.U = z;
        x0();
        CameraUIView cameraUIView4 = this.b;
        cameraUIView4.r0();
        u0();
        WebStoryBox webStoryBox2 = storyCameraParams.u;
        final List<StoryImSharingData> list2 = storyCameraParams.A0;
        if (webStoryBox2 == null || !webStoryBox2.Bb()) {
            if (list2.isEmpty()) {
                if (storyCameraParams.C == null || !(!r6.isEmpty())) {
                    if (storyCameraParams.i0 == null || !(!r6.isEmpty())) {
                        int i6 = 0;
                        if (storyCameraParams.E0 == StoryEditorMode.WITH_BACKGROUND) {
                            vVar = new v(new km9(this, i6));
                        } else {
                            if (webStoryBox2 != null && webStoryBox2.Db()) {
                                an9Var.S = true;
                            }
                            k = x.k(EmptyList.b);
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                        k = new v(new jm9(this, 0));
                    }
                    asu0 asu0Var = asu0.a;
                    int i7 = 6;
                    bVar.b(hg1.n(k.q(asu0Var.c()).m(asu0Var.d()), cameraUIView4.getContext(), false, new sa0(this, i5), 30).subscribe(new kl6(new g20(this, 12), 2), new y50(new x50(i7), i7)));
                    this.Z = z2;
                    if (!z2 && !this.U) {
                        cameraUIView4.y0();
                    }
                    X0();
                    am9 am9Var = this.h;
                    am9.a aVar3 = am9Var.a;
                    aVar = am9Var.a;
                    aVar3.f = "preview";
                    list = storyCameraParams.L;
                    if (list != null && (storyAnswer = (StoryAnswer) j5g.b0(0, list)) != null) {
                        aVar.g = Integer.valueOf(storyAnswer.c);
                        aVar.h = storyAnswer.e;
                        aVar.i = storyAnswer.f;
                    }
                    aVar.a = str;
                    aVar.j = storyCameraParams.b;
                    if (storyCameraParams.v != null) {
                        am9Var.c(StoryPublishEvent.SHARING_POST, null);
                    }
                    z3 = dm9Var.a().i().j;
                    z4 = this.R;
                    cameraUIView = this.b;
                    if (z4 != z3 && z3) {
                        this.R = z3;
                        rg10 maskCallback = cameraUIView.getMaskCallback();
                        an9Var.D = maskCallback == null ? maskCallback.a() : false;
                        an9Var.A = true;
                        an9Var.t = dm9Var.a().i().j;
                        t0();
                    }
                    if (storyCameraParams.j != null) {
                        setShutterEnabled(false);
                    }
                    S0();
                    if (an9Var.b) {
                        an9Var.b = true;
                        if (!this.Z) {
                            if (M3() || an9Var.Q) {
                                boolean z5 = an9Var.Q || (M3() && epx.f(storyCameraParams.b, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE)));
                                LayoutInflater.from(cameraUIView4.getContext()).inflate(R.layout.create_qr_camera_view, (ViewGroup) cameraUIView4.y0, true);
                                QrScannerUi qrScannerUi = new QrScannerUi(cameraUIView4, cameraUIView4.getPresenter(), cameraUIView4.w, new fy2(cameraUIView4), cameraUIView4.getDeps());
                                cameraUIView2 = cameraUIView4;
                                cameraUIView2.Q0 = qrScannerUi;
                                StoryCameraParams cameraParams = cameraUIView2.getCameraParams();
                                VkSegmentedControl e2 = qrScannerUi.e(z5, cameraParams != null ? cameraParams.Nb() : null);
                                StoryCameraParams cameraParams2 = cameraUIView2.getCameraParams();
                                if (cameraParams2 != null ? cameraParams2.Bb() : false) {
                                    View view = cameraUIView2.L0;
                                    if (view == null) {
                                        view = null;
                                    }
                                    view.setVisibility(4);
                                }
                                cameraUIView2.U = (ImageView) cameraUIView2.findViewById(R.id.top_left_button);
                                cameraUIView2.T = (ImageView) cameraUIView2.findViewById(R.id.top_right_button);
                                if (e2 != null) {
                                    bwt0.o(e2, new ra0(cameraUIView2, i5));
                                }
                                cameraUIView2.o(e2, new sa0(cameraUIView2, 16));
                                webStoryBox = storyCameraParams.u;
                                if (webStoryBox != null && !webStoryBox.Bb()) {
                                    d0(webStoryBox, cameraUIView2.getSceneWidth(), cameraUIView2.getSceneHeight(), new no3(this, i3));
                                }
                                str3 = storyCameraParams.s;
                                bn9Var = this.k0;
                                if (str3 != null && (currentState = getCurrentState()) != null) {
                                    o0m0 o0m0Var = o0m0.b;
                                    boolean z6 = currentState != StoryCameraMode.STORY || currentState == StoryCameraMode.STORY_VIDEO || currentState == StoryCameraMode.PING_PONG || currentState == StoryCameraMode.CLIPS;
                                    if (myc0.f(str3) && z6) {
                                        o0m0 o0m0Var2 = o0m0.b;
                                        v4m0 b3 = o0m0.b(str3, null, ((StoriesComponent) dm9Var.d.getValue()).t0(), new c7l0(null));
                                        nov.a.i(b3, (cameraUIView2.getSceneWidth() - b3.getOriginalWidth()) / 2.0f, (cameraUIView2.getSceneHeight() - b3.getOriginalHeight()) / 2.0f);
                                        b3.setStickerAlpha(163);
                                        bn9Var.a(b3);
                                    }
                                }
                                i2 = c4().i();
                                jpd jpdVar = this.p0;
                                if (i2) {
                                    String str4 = storyCameraParams.M;
                                    lsd lsdVar = jpdVar.j;
                                    StoryCameraParams storyCameraParams2 = jpdVar.x;
                                    if (!(storyCameraParams2.o == StoryCameraTarget.CLIP_FRAGMENT)) {
                                        if (str4 != null) {
                                            jpdVar.o();
                                        } else if (storyMusicInfo != null) {
                                            lsdVar.getClass();
                                            ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                                            ve0 ve0Var = new ve0(13);
                                            clipsDraftPersistentStore.getClass();
                                            ClipsDraftPersistentStore.o(ve0Var);
                                        } else if (storyCameraParams2.y0) {
                                            n1d n1dVar = new n1d(jpdVar, i3);
                                            if (!lsdVar.c.i.p) {
                                                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                                                he3 he3Var = new he3(11, lsdVar, n1dVar);
                                                clipsDraftPersistentStore2.getClass();
                                                ClipsDraftPersistentStore.o(he3Var);
                                            }
                                        }
                                    }
                                }
                                if (storyMusicInfo == null) {
                                    if (c4().i()) {
                                        int i8 = ynd.d;
                                        int i9 = storyMusicInfo.e;
                                        int i10 = storyMusicInfo.d;
                                        if (i9 <= i10) {
                                            i9 = storyMusicInfo.b.c0;
                                        }
                                        int g2 = swe0.g(i9 - i10, 0, i8) + i10;
                                        aVar2 = aVar;
                                        jpd.v(jpdVar, StoryMusicInfo.zb(storyMusicInfo, null, 0, g2, null, 0, 8183));
                                        cameraUIView3 = cameraUIView;
                                    } else {
                                        aVar2 = aVar;
                                        cameraUIView3 = cameraUIView;
                                        o7m0 o7m0Var = new o7m0(cameraUIView2.getContext(), storyMusicInfo, MusicStickerStyle.Horizontal);
                                        o7m0Var.setStickerAlpha(163);
                                        o7m0Var.setRemovable(false);
                                        float f2 = f2l0.a;
                                        bn9Var.a.sc(o7m0Var, new mgi(2));
                                        T(storyMusicInfo);
                                    }
                                    boolean z7 = b0() == Integer.MAX_VALUE;
                                    this.a0 = z7;
                                    cameraUIView3.setShutterEndless(z7);
                                } else {
                                    aVar2 = aVar;
                                    cameraUIView3 = cameraUIView;
                                    MusicCameraData musicCameraData = storyCameraParams.t0;
                                    if (musicCameraData != null && !g620.f().k0().a(cameraUIView2.getContext())) {
                                        m3(musicCameraData);
                                    }
                                }
                                clipVideoFile = storyCameraParams.N;
                                if (clipVideoFile != null) {
                                    PermissionHelper permissionHelper = PermissionHelper.a;
                                    Context context = cameraUIView3.getContext();
                                    permissionHelper.getClass();
                                    if (PermissionHelper.b(context, PermissionHelper.j)) {
                                        E0(clipVideoFile);
                                    } else {
                                        this.i0 = true;
                                    }
                                }
                                rg10 maskCallback2 = cameraUIView3.getMaskCallback();
                                an9Var.D = maskCallback2 == null ? maskCallback2.a() : false;
                                an9Var.A = true;
                                if (I3(an9Var.H) == StoryCameraMode.LIVE) {
                                    q4();
                                    String str5 = storyCameraParams.r;
                                    if (str5 != null) {
                                        cameraUIView2.setLiveNameText(str5);
                                    }
                                }
                                if (this.w) {
                                    an9Var.z = false;
                                } else {
                                    an9Var.C = false;
                                    an9Var.z = true;
                                }
                                if (!M3() && !v3()) {
                                    tia0.F0();
                                    ((fig) dm9Var.o()).getClass();
                                    t6g0.d().h();
                                }
                                cameraUIView2.setShutterPosition(false);
                            } else {
                                cameraUIView4.q0();
                                if (!TextUtils.isEmpty(storyCameraParams.j) && (eqoVar = cameraUIView4.C) != null) {
                                    eqoVar.d(DynamicMasksUseCase.CameraInitAndMaskPreselected);
                                }
                            }
                        }
                        cameraUIView2 = cameraUIView4;
                        webStoryBox = storyCameraParams.u;
                        if (webStoryBox != null) {
                            d0(webStoryBox, cameraUIView2.getSceneWidth(), cameraUIView2.getSceneHeight(), new no3(this, i3));
                        }
                        str3 = storyCameraParams.s;
                        bn9Var = this.k0;
                        if (str3 != null) {
                            o0m0 o0m0Var3 = o0m0.b;
                            if (currentState != StoryCameraMode.STORY) {
                            }
                            if (myc0.f(str3)) {
                                o0m0 o0m0Var22 = o0m0.b;
                                v4m0 b32 = o0m0.b(str3, null, ((StoriesComponent) dm9Var.d.getValue()).t0(), new c7l0(null));
                                nov.a.i(b32, (cameraUIView2.getSceneWidth() - b32.getOriginalWidth()) / 2.0f, (cameraUIView2.getSceneHeight() - b32.getOriginalHeight()) / 2.0f);
                                b32.setStickerAlpha(163);
                                bn9Var.a(b32);
                            }
                        }
                        i2 = c4().i();
                        jpd jpdVar2 = this.p0;
                        if (i2) {
                        }
                        if (storyMusicInfo == null) {
                        }
                        clipVideoFile = storyCameraParams.N;
                        if (clipVideoFile != null) {
                        }
                        rg10 maskCallback22 = cameraUIView3.getMaskCallback();
                        an9Var.D = maskCallback22 == null ? maskCallback22.a() : false;
                        an9Var.A = true;
                        if (I3(an9Var.H) == StoryCameraMode.LIVE) {
                        }
                        if (this.w) {
                        }
                        if (!M3()) {
                            tia0.F0();
                            ((fig) dm9Var.o()).getClass();
                            t6g0.d().h();
                        }
                        cameraUIView2.setShutterPosition(false);
                    } else {
                        cameraUIView2 = cameraUIView4;
                        aVar2 = aVar;
                        cameraUIView3 = cameraUIView;
                    }
                    c0443a = this.n;
                    c2 = fkq0.c(c0443a.a);
                    cVar = this.o;
                    if (!c2 || fkq0.c(cVar.a)) {
                        this.k = dm9Var.a().o();
                    }
                    if (c0443a.a.b < 0 || cVar.a.b >= 0) {
                        cn cnVar = this.k;
                        UserId userId = cnVar.a;
                        c0443a.a = userId;
                        c0443a.b = cnVar.c;
                        cVar.a = userId;
                        aVar2.b = Long.valueOf(userId.b);
                    }
                    cameraUIView3.setLiveAuthorPhoto(c0443a.b);
                    ho9.e((Activity) cameraUIView2.getContext(), true);
                    V0(true);
                }
                vVar = new v(new f7(this, i3));
            } else {
                vVar = new io.reactivex.rxjava3.internal.operators.single.c(new n() { // from class: xsna.lm9
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list3) {
                            if (obj instanceof StoryImSharingData.Photo) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            StoryImSharingData.Photo photo = (StoryImSharingData.Photo) it.next();
                            arrayList2.add(tam0.a.c(photo.d, false, false, false, false, photo.e, 30));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list3) {
                            StoryImSharingData storyImSharingData = (StoryImSharingData) obj2;
                            if ((storyImSharingData instanceof StoryImSharingData.Video) || (storyImSharingData instanceof StoryImSharingData.VideoMsg)) {
                                arrayList3.add(obj2);
                            }
                        }
                        return (arrayList3.isEmpty() ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : new io.reactivex.rxjava3.internal.operators.observable.m0(io.reactivex.rxjava3.core.q.O(arrayList3), new kf3(new com.vk.movika.sdk.base.observable.o(this, 12), 5)).E0()).l(new iw3(new com.vk.movika.sdk.base.observable.q(arrayList2, 12), 3));
                    }
                });
            }
            k = vVar;
        } else {
            an9Var.S = true;
            webStoryBox2.Db();
            k = new v(new im9(this, webStoryBox2));
        }
        z2 = true;
        asu0 asu0Var2 = asu0.a;
        int i72 = 6;
        bVar.b(hg1.n(k.q(asu0Var2.c()).m(asu0Var2.d()), cameraUIView4.getContext(), false, new sa0(this, i5), 30).subscribe(new kl6(new g20(this, 12), 2), new y50(new x50(i72), i72)));
        this.Z = z2;
        if (!z2) {
            cameraUIView4.y0();
        }
        X0();
        am9 am9Var2 = this.h;
        am9.a aVar32 = am9Var2.a;
        aVar = am9Var2.a;
        aVar32.f = "preview";
        list = storyCameraParams.L;
        if (list != null) {
            aVar.g = Integer.valueOf(storyAnswer.c);
            aVar.h = storyAnswer.e;
            aVar.i = storyAnswer.f;
        }
        aVar.a = str;
        aVar.j = storyCameraParams.b;
        if (storyCameraParams.v != null) {
        }
        z3 = dm9Var.a().i().j;
        z4 = this.R;
        cameraUIView = this.b;
        if (z4 != z3) {
            this.R = z3;
            rg10 maskCallback3 = cameraUIView.getMaskCallback();
            an9Var.D = maskCallback3 == null ? maskCallback3.a() : false;
            an9Var.A = true;
            an9Var.t = dm9Var.a().i().j;
            t0();
        }
        if (storyCameraParams.j != null) {
        }
        S0();
        if (an9Var.b) {
        }
        c0443a = this.n;
        c2 = fkq0.c(c0443a.a);
        cVar = this.o;
        if (!c2) {
        }
        this.k = dm9Var.a().o();
        if (c0443a.a.b < 0) {
        }
        cn cnVar2 = this.k;
        UserId userId2 = cnVar2.a;
        c0443a.a = userId2;
        c0443a.b = cnVar2.c;
        cVar.a = userId2;
        aVar2.b = Long.valueOf(userId2.b);
        cameraUIView3.setLiveAuthorPhoto(c0443a.b);
        ho9.e((Activity) cameraUIView2.getContext(), true);
        V0(true);
    }

    @Override // xsna.bm9
    public final boolean v3() {
        return this.c.e.size() == 1 && c4() == StoryCameraMode.VMOJI_CAPTURE;
    }

    @Override // xsna.bm9
    public final void v4() {
        j0();
        this.Q.c = true;
        Activity h2 = e3m.h(this.b.getContext());
        if (h2 != null) {
            yf9.b o = this.e.o();
            boolean z = this.c.z;
            ((fig) o).getClass();
            Intent intent = new Intent(h2, (Class<?>) PhotoVideoAttachActivity.class);
            intent.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
            intent.putExtra("camera_enabled", false);
            intent.putExtra("long_previews", false);
            intent.putExtra("short_divider", true);
            intent.putExtra("prevent_styling", true);
            intent.putExtra("single_mode", true);
            intent.putExtra("qr_detection", true);
            intent.putExtra("qr_result", z);
            h2.startActivityForResult(intent, 1010);
        }
        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
        b.d dVar = new b.d("qr_scanner");
        dVar.b("open_gallery", "action");
        dVar.b(SignalingProtocol.KEY_CAMERA, "ref");
        dVar.e();
    }

    @Override // xsna.di10
    public final void w(Boolean bool) {
        this.b.setNewMasksBadgeVisible(bool.booleanValue());
    }

    public final void w0() {
        CameraUIView cameraUIView = this.b;
        cameraUIView.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 500L);
        v0();
        cameraUIView.getPositions().d();
        cameraUIView.setShutterPosition(true);
    }

    @Override // xsna.bm9
    public final View w1(Context context) {
        return W().w1(context);
    }

    @Override // xsna.bm9
    public final void w3() {
        this.e.a.getClass();
        xkg.c.m(null, true);
        CameraUIView cameraUIView = this.b;
        t4(!cameraUIView.getGesturedControl(), true);
        float f2 = cameraUIView.A;
        ClipsControlsView clipsControls = cameraUIView.getClipsControls();
        String string = (clipsControls == null || !clipsControls.getGesturedControl()) ? cameraUIView.getContext().getString(R.string.clips_gesture_detector_disabled_toast) : cameraUIView.getContext().getString(R.string.clips_gesture_detector_enabled_toast);
        RectF G = bwt0.G(cameraUIView);
        float a = iah0.a(8.0f);
        awt0.t(cameraUIView, new d0(cameraUIView, string, new RectF(G.left + a, G.centerY() + f2, G.right - a, G.centerY() + f2), 1));
    }

    @Override // xsna.bm9
    public final void w4(lno lnoVar, DuetAction duetAction) {
        com.vk.media.ok.b bVar;
        zd9 camera1View = this.p0.c.getCamera1View();
        if (camera1View != null) {
            kno knoVar = new kno(lnoVar.a, lnoVar.b, lnoVar.c, lnoVar.d, lnoVar.e);
            mk9 mk9Var = ((mo9) camera1View.getCameraPreview()).g;
            com.vk.media.ok.b bVar2 = mk9Var.B;
            if (bVar2 != null) {
                bVar2.D(knoVar);
            }
            mk9Var.O = knoVar;
            if (duetAction == null || (bVar = mk9Var.B) == null || duetAction == DuetAction.CANCEL) {
                return;
            }
            bVar.I.presetDuetRenderMode(duetAction.h());
        }
    }

    @Override // xsna.di9
    public final StoryEditorCameraParams x() {
        return new StoryEditorCameraParams(this.c);
    }

    public final void x0() {
        io.reactivex.rxjava3.disposables.c cVar = this.C;
        if (cVar != null) {
            cVar.dispose();
        }
        CameraUIView cameraUIView = this.b;
        if (kzz.a(cameraUIView.getContext()) && txz.b()) {
            this.C = kzz.c(5000L, cameraUIView.getContext()).subscribe(new defpackage.d(new com.vk.movika.sdk.base.observable.c(this, 17), 12));
        }
    }

    @Override // xsna.bm9
    public final void x3() {
        an9 an9Var = this.i;
        if (an9Var.p || an9Var.q || an9Var.i || an9Var.g || an9Var.e) {
            return;
        }
        StoryCameraMode storyCameraMode = this.c.e.get(an9Var.H);
        if (this.M.d(storyCameraMode) || V()) {
            return;
        }
        this.u = System.currentTimeMillis();
        int i2 = e.$EnumSwitchMapping$1[storyCameraMode.ordinal()];
        if (i2 == 1) {
            jpd.k(this.p0, null, 1);
            return;
        }
        if (i2 == 3) {
            G0(this, true, false, 30);
            return;
        }
        if (i2 == 4) {
            i();
            U(RecorderBase.RecordingType.LOOP, new hm9(this, 0));
        } else if (i2 == 7) {
            U(RecorderBase.RecordingType.ORIGINAL, new ld(this, 14));
        } else {
            if (i2 != 8) {
                return;
            }
            G0(this, true, false, 28);
        }
    }

    @Override // xsna.bm9
    public final void x4(StoryMusicInfo storyMusicInfo) {
        jpd.v(this.p0, storyMusicInfo);
    }

    @Override // xsna.di9
    public final ArrayList y() {
        ArrayList arrayList = this.T;
        if (arrayList == null) {
            return null;
        }
        ArrayList c0 = c0(arrayList);
        ArrayList arrayList2 = new ArrayList(c5g.u(c0, 10));
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nov) it.next()).C0());
        }
        return arrayList2;
    }

    public final void y0() {
        d dVar = this.Q;
        if (dVar.e) {
            return;
        }
        dVar.e = true;
        b.d dVar2 = new b.d("stories_camera_screen");
        dVar2.b(dVar.a, "action");
        JSONArray jSONArray = new JSONArray();
        if (dVar.c) {
            jSONArray.put("use_gallery");
        }
        if (dVar.b) {
            jSONArray.put("use_settings");
        }
        if (dVar.d) {
            jSONArray.put("use_masks");
        }
        dVar2.b(jSONArray, "action_facts");
        dVar2.h();
    }

    @Override // xsna.bm9
    public final void y3(DuetAction duetAction) {
        this.h0 = duetAction;
        jpd jpdVar = this.p0;
        zd9 camera1View = jpdVar.c.getCamera1View();
        if (camera1View != null) {
            mk9 mk9Var = ((mo9) camera1View.getCameraPreview()).g;
            mk9Var.P = duetAction;
            com.vk.media.ok.b bVar = mk9Var.B;
            if (bVar != null) {
                if (duetAction != DuetAction.CANCEL) {
                    bVar.I.setCustomIntParameter(duetAction.h());
                } else {
                    bVar.D(null);
                }
            }
            if (duetAction == DuetAction.CANCEL) {
                mk9Var.O = null;
            }
        }
        if (duetAction == DuetAction.CANCEL) {
            B0();
            zd9 camera1View2 = jpdVar.c.getCamera1View();
            if (camera1View2 != null) {
                com.vk.media.ok.b bVar2 = ((mo9) camera1View2.getCameraPreview()).g.B;
            }
        }
    }

    @Override // xsna.bm9
    public final boolean y4() {
        StoryCameraParams storyCameraParams = this.c;
        List<? extends StoryCameraMode> list = storyCameraParams.e;
        an9 an9Var = this.i;
        return (list.get(an9Var.H) == StoryCameraMode.STORY || storyCameraParams.e.get(an9Var.H) == StoryCameraMode.STORY_VIDEO || storyCameraParams.e.get(an9Var.H) == StoryCameraMode.PING_PONG || storyCameraParams.e.get(an9Var.H) == StoryCameraMode.CLIPS || (storyCameraParams.e.get(an9Var.H) == StoryCameraMode.LIVE && an9Var.t)) && an9Var.J == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.di10
    public final void z() {
        ne8 ne8Var = this.r;
        if (ne8Var != null) {
            ne8Var.T0();
        }
        this.s = true;
        an9 an9Var = this.i;
        an9Var.r = true;
        CameraUIView cameraUIView = this.b;
        cameraUIView.getPositions().d();
        cameraUIView.Z(an9Var.r);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public final void z0(StoryMultiData storyMultiData, boolean z, long j2) {
        a aVar;
        ?? singletonList;
        List list;
        ArrayList arrayList;
        Iterator it;
        VideoParams videoParams;
        StoryMediaData storyMediaData = storyMultiData.b.get(0);
        if (z) {
            List<StoryMediaData> list2 = storyMultiData.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                StoryMediaData storyMediaData2 = (StoryMediaData) it2.next();
                CameraVideoEncoderParameters cameraVideoEncoderParameters = storyMediaData2.c;
                if (cameraVideoEncoderParameters == null) {
                    it = it2;
                    arrayList = arrayList2;
                    videoParams = null;
                } else {
                    arrayList = arrayList2;
                    it = it2;
                    videoParams = new VideoParams(cameraVideoEncoderParameters.b, cameraVideoEncoderParameters.i, cameraVideoEncoderParameters.d, cameraVideoEncoderParameters.e, cameraVideoEncoderParameters.f, cameraVideoEncoderParameters.h, cameraVideoEncoderParameters.g, cameraVideoEncoderParameters.j, cameraVideoEncoderParameters.k, cameraVideoEncoderParameters.l, cameraVideoEncoderParameters.r, cameraVideoEncoderParameters.s, cameraVideoEncoderParameters.t, cameraVideoEncoderParameters.u, cameraVideoEncoderParameters.m, cameraVideoEncoderParameters.o, cameraVideoEncoderParameters.v);
                    storyMediaData2 = storyMediaData2;
                }
                File file = storyMediaData2.b;
                PhotoParams photoParams = file != null ? new PhotoParams(file) : null;
                CommonUploadParams commonUploadParams = storyMultiData.d;
                StoryUploadParams storyUploadParams = storyMediaData2.d;
                StoryParams storyParams = new StoryParams(videoParams, photoParams, new UploadParams(storyUploadParams, commonUploadParams, nf9.b.d(commonUploadParams, storyUploadParams)));
                ArrayList arrayList3 = arrayList;
                arrayList3.add(storyParams);
                arrayList2 = arrayList3;
                it2 = it;
            }
            ArrayList arrayList4 = arrayList2;
            singletonList = new ArrayList(c5g.u(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                StoryParams storyParams2 = (StoryParams) it3.next();
                AttachStory attachStory = new AttachStory(storyParams2.d, storyParams2.b, storyParams2.c);
                attachStory.d = AttachSyncState.UPLOAD_REQUIRED;
                singletonList.add(attachStory);
            }
        } else {
            if (!storyMediaData.e) {
                aVar = this;
                CameraVideoEncoderParameters cameraVideoEncoderParameters2 = new CameraVideoParameters(storyMediaData.c, Collections.singletonList(Long.valueOf(aVar.c.q))).b;
                VideoParams videoParams2 = new VideoParams(cameraVideoEncoderParameters2.b, cameraVideoEncoderParameters2.i, cameraVideoEncoderParameters2.d, cameraVideoEncoderParameters2.e, cameraVideoEncoderParameters2.f, cameraVideoEncoderParameters2.h, cameraVideoEncoderParameters2.g, cameraVideoEncoderParameters2.j, cameraVideoEncoderParameters2.k, cameraVideoEncoderParameters2.l, cameraVideoEncoderParameters2.r, cameraVideoEncoderParameters2.s, cameraVideoEncoderParameters2.t, cameraVideoEncoderParameters2.u, cameraVideoEncoderParameters2.m, cameraVideoEncoderParameters2.o, cameraVideoEncoderParameters2.v);
                AttachVideo attachVideo = new AttachVideo(new VideoFileOld(), new ImageList(null, 1, null), null, 0L, ImageList.a.b(videoParams2.d), 0, 0, 0L, 0, 0L, null, Uri.fromFile(videoParams2.b).toString(), AttachSyncState.UPLOAD_REQUIRED, null, null, 26604, null);
                attachVideo.r = videoParams2;
                list = Collections.singletonList(attachVideo);
                List list3 = list;
                ocw ocwVar = ocw.a;
                ocw.a(j2, aVar, "", "unknown", list3);
            }
            PhotoParams photoParams2 = new PhotoParams(new CameraPhotoParameters(storyMediaData.b, Collections.singletonList(Long.valueOf(j2))).b);
            AttachImage attachImage = new AttachImage();
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            File file2 = photoParams2.b;
            attachImage.r = ImageList.a.b(file2);
            attachImage.l = file2;
            attachImage.m = DownloadState.DOWNLOADED;
            attachImage.c = AttachSyncState.UPLOAD_REQUIRED;
            singletonList = Collections.singletonList(attachImage);
        }
        aVar = this;
        list = singletonList;
        List list32 = list;
        ocw ocwVar2 = ocw.a;
        ocw.a(j2, aVar, "", "unknown", list32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bm9
    public final List<StoryCameraMode> z3() {
        StoryCameraParams storyCameraParams = this.c;
        List list = storyCameraParams.e;
        if (storyCameraParams.j0) {
            list = null;
        }
        return list == null ? EmptyList.b : list;
    }

    @Override // xsna.bm9
    public final void z4(boolean z) {
        an9 an9Var = this.i;
        if (an9Var.s == z) {
            return;
        }
        an9Var.s = z;
        CameraUIView cameraUIView = this.b;
        cameraUIView.getPositions().d();
        cameraUIView.Z(an9Var.r);
    }

    /* compiled from: CameraUIPresenter.kt */
    public static final class i extends io.reactivex.rxjava3.observers.a<Boolean> {
        public i() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a aVar = a.this;
            aVar.i.Y = false;
            aVar.b.getPositions().d();
            aVar.D0();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            ((Boolean) obj).booleanValue();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
        }
    }
}
