package com.vk.movika.sdk.base.flow.binding;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.user.UserProfile;
import com.vk.editor.spoiler.tool.domain.stat.SpoilerStatEvent;
import com.vk.feed.core.models.channels.ChannelsRecommendation;
import com.vk.feed.core.models.channels.ChannelsRecommendations;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.ui.m;
import com.vk.movika.sdk.base.ui.p;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.features.colorgrading.b;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import com.vk.photo.editor.features.mlenhance.b;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.qrcode.QRStatsTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$CollageEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$CropEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$EditorEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$FilterEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$StickerEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TextEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$ZoomEvent;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.stat.scheme.t0;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vkontakte.android.R;
import defpackage.f0;
import defpackage.g0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.a7y0;
import xsna.anm0;
import xsna.b7d0;
import xsna.bpn0;
import xsna.c5g;
import xsna.cgt;
import xsna.cvs;
import xsna.dhr0;
import xsna.dhw0;
import xsna.epx;
import xsna.ewk0;
import xsna.f1v0;
import xsna.f4m;
import xsna.fpx0;
import xsna.fzc;
import xsna.g1d;
import xsna.g1v0;
import xsna.gd60;
import xsna.go5;
import xsna.gzs;
import xsna.h1v0;
import xsna.hd60;
import xsna.hfr;
import xsna.i5g;
import xsna.ine0;
import xsna.io70;
import xsna.izs;
import xsna.j6;
import xsna.jd;
import xsna.jeb;
import xsna.jjc;
import xsna.jw30;
import xsna.k00;
import xsna.k0d;
import xsna.kd;
import xsna.kdw;
import xsna.keb;
import xsna.ksk0;
import xsna.m1e;
import xsna.m33;
import xsna.mbt0;
import xsna.mg00;
import xsna.mh40;
import xsna.mih0;
import xsna.mkl;
import xsna.mrj0;
import xsna.msy;
import xsna.n82;
import xsna.nbc0;
import xsna.nek0;
import xsna.nme;
import xsna.o0r0;
import xsna.o6a0;
import xsna.o8m0;
import xsna.ojo;
import xsna.ok30;
import xsna.olq0;
import xsna.oxz;
import xsna.p7y;
import xsna.pbt0;
import xsna.pw;
import xsna.qcy;
import xsna.qta;
import xsna.quv0;
import xsna.qzg;
import xsna.r7t;
import xsna.rli0;
import xsna.s3q0;
import xsna.slq0;
import xsna.srk0;
import xsna.tcf0;
import xsna.ucf0;
import xsna.uh3;
import xsna.vm30;
import xsna.vmb0;
import xsna.vmd;
import xsna.vq6;
import xsna.vvr;
import xsna.w9;
import xsna.wh50;
import xsna.x6d;
import xsna.xd3;
import xsna.xdr;
import xsna.xn50;
import xsna.xwk;
import xsna.y2p0;
import xsna.y3d;
import xsna.yve;
import xsna.z6l0;
import xsna.z7k;
import xsna.zf00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v195, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 26;
        int i2 = 12;
        int i3 = 23;
        int i4 = 16;
        int i5 = 21;
        int i6 = 29;
        int i7 = 0;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.player.base.observable.c) this.c).k((k) this.d);
                return s3q0.a;
            case 1:
                ((qta) this.c).f(this.d);
                return s3q0.a;
            case 2:
                ((xd3) this.c).b.invoke((SimpleAttachListItem) this.d);
                return s3q0.a;
            case 3:
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) this.c;
                OneVideoPlayer.f fVar = (OneVideoPlayer.f) this.d;
                return "addTransferListener() - count= " + baseVideoPlayer.n.a.size() + " listener= " + fVar;
            case 4:
                ((k0d) this.c).b.a(new y3d(((mih0.g) this.d).i));
                return s3q0.a;
            case 5:
                g1d g1dVar = (g1d) this.c;
                x6d x6dVar = (x6d) this.d;
                ClipActionButton clipActionButton = new ClipActionButton(g1dVar.m.getContext());
                jjc.g(clipActionButton, new k00(x6dVar, i));
                return clipActionButton;
            case 6:
                ClipsEntryPointsComponentImpl clipsEntryPointsComponentImpl = (ClipsEntryPointsComponentImpl) this.c;
                ClipsBlacklistsComponent clipsBlacklistsComponent = (ClipsBlacklistsComponent) this.d;
                qcy<Object>[] qcyVarArr = ClipsEntryPointsComponentImpl.f;
                return new m1e(new bpn0(new jd(clipsEntryPointsComponentImpl, i)), new bpn0(new kd(clipsBlacklistsComponent, i5)));
            case 7:
                nek0 nek0Var = (nek0) this.c;
                vvr vvrVar = (vvr) this.d;
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                vvrVar.y(false);
                return s3q0.a;
            case 8:
                nek0 nek0Var2 = (nek0) this.c;
                izs izsVar = (izs) this.d;
                if (nek0Var2 != null) {
                    nek0Var2.hide();
                }
                izsVar.invoke(z7k.c.b);
                return s3q0.a;
            case 9:
                ((cgt) this.c).b.invoke((r7t) this.d);
                return s3q0.a;
            case 10:
                Activity activity = (Activity) this.c;
                p7y p7yVar = (p7y) this.d;
                quv0 quv0Var = new quv0();
                quv0Var.a = activity.getString(R.string.vk_vkpay_touch_id_dialog_title);
                quv0Var.b = activity.getString(R.string.vk_vkpay_touch_id_dialog_subtitle);
                quv0Var.c = new yve(p7yVar, i6);
                quv0Var.d = new qzg(p7yVar, i6);
                quv0Var.e = new cvs(p7yVar, i2);
                quv0Var.a((FragmentActivity) activity);
                return s3q0.a;
            case 11:
                nme.a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.SIMILAR_CLIPS, SchemeStat$TypeClipViewerItem.EventType.UNHIDE, fzc.b(((nme) this.c).a), (SdkVideoFile) this.d);
                return s3q0.a;
            case 12:
                vm30.c cVar = (vm30.c) this.c;
                vm30 vm30Var = (vm30) this.d;
                cVar.a();
                View view = vm30Var.t;
                ok30 ok30Var = vm30Var.H;
                if (ok30Var != null) {
                    hfr t = rli0.t(new i5g(ok30Var.f), new n82(i6));
                    HashSet hashSet = new HashSet();
                    rli0.z(t, hashSet);
                    i7 = hashSet.size();
                }
                cVar.h(i7, vm30Var.h(), view);
                return s3q0.a;
            case 13:
                io70 io70Var = (io70) this.c;
                VoipChatInfo voipChatInfo = (VoipChatInfo) this.d;
                dhw0 dhw0Var = OKVoipEngine.B;
                if (dhw0Var == null) {
                    return s3q0.a;
                }
                io70Var.b.invoke(dhw0Var.w(voipChatInfo));
                return s3q0.a;
            case 14:
                srk0 srk0Var = (srk0) this.c;
                o6a0 o6a0Var = (o6a0) this.d;
                int i8 = 4;
                if (srk0Var instanceof CropStatEvent) {
                    CropStatEvent cropStatEvent = (CropStatEvent) srk0Var;
                    if (epx.f(cropStatEvent, CropStatEvent.a.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.CANCEL_CROP, null, null, 6);
                    } else if (epx.f(cropStatEvent, CropStatEvent.b.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.CHANGE_ANGLE, null, null, 6);
                    } else if (epx.f(cropStatEvent, CropStatEvent.i.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.ROTATE, null, null, 6);
                    } else if (cropStatEvent instanceof CropStatEvent.c) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.CHANGE_CROP_MODE, null, (CropStatEvent.c) cropStatEvent, 2);
                    } else if (epx.f(cropStatEvent, CropStatEvent.d.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.CHANGE_SIZE, null, null, 6);
                    } else if (epx.f(cropStatEvent, CropStatEvent.f.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.NAVIGATE, null, null, 6);
                    } else if (cropStatEvent instanceof CropStatEvent.j) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.SAVE_CROP, (CropStatEvent.j) cropStatEvent, null, 4);
                    } else if (epx.f(cropStatEvent, CropStatEvent.k.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.UNZOOM, null, null, 6);
                    } else if (epx.f(cropStatEvent, CropStatEvent.l.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.ZOOM, null, null, 6);
                    } else if (epx.f(cropStatEvent, CropStatEvent.e.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.REFLECT, null, null, 6);
                    } else if (epx.f(cropStatEvent, CropStatEvent.h.a)) {
                        o6a0.g(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CropEvent.CLEAR_CROP, null, null, 6);
                    } else {
                        if (!epx.f(cropStatEvent, CropStatEvent.g.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_CROP);
                    }
                } else if (srk0Var instanceof go5) {
                    go5 go5Var = (go5) srk0Var;
                    if (epx.f(go5Var, go5.a.a)) {
                        ksk0.b(new g0(o6a0Var, r6, MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent.CANCEL_AUTOCORRECTION, i8));
                    } else if (epx.f(go5Var, go5.b.a)) {
                        ksk0.b(new g0(o6a0Var, r6, MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent.CHANGE_AUTOCORRECTION_VALUE, i8));
                    } else if (go5Var instanceof go5.d) {
                        ksk0.b(new g0(o6a0Var, (go5.d) go5Var, MobileOfficialAppsCorePhotoEditorStat$AutocorrectionEvent.SAVE_AUTOCORRECTION, i8));
                    } else {
                        if (!epx.f(go5Var, go5.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_AUTOCORRECTION);
                    }
                } else if (srk0Var instanceof xdr) {
                    xdr xdrVar = (xdr) srk0Var;
                    if (xdrVar instanceof xdr.a) {
                        o6a0.h(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$FilterEvent.ADD_FILTER, null, null, (xdr.a) xdrVar, 6);
                    } else if (epx.f(xdrVar, xdr.b.a)) {
                        o6a0.h(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$FilterEvent.CANCEL_FILTER, null, null, null, 14);
                    } else if (xdrVar instanceof xdr.c) {
                        o6a0.h(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$FilterEvent.CHANGE_FILTER_VALUE, null, (xdr.c) xdrVar, null, 10);
                    } else if (xdrVar instanceof xdr.e) {
                        o6a0.h(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$FilterEvent.SAVE_FILTER, (xdr.e) xdrVar, null, null, 12);
                    } else {
                        if (!epx.f(xdrVar, xdr.d.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_FILTER);
                    }
                } else if (srk0Var instanceof CollageStatEvent) {
                    CollageStatEvent collageStatEvent = (CollageStatEvent) srk0Var;
                    if (collageStatEvent instanceof CollageStatEvent.g) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CLICK_TO_FRAME_COLOR_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.h) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CLICK_TO_FRAME_LAYOUT_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.i) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CLICK_TO_FRAME_ANGLE_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.j) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CLICK_TO_FORMAT_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.k) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CLICK_TO_FRAME_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.f) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.SELECT_GRID_TYPE_COLLAGE, ((CollageStatEvent.f) collageStatEvent).a, null, 4);
                    } else if (collageStatEvent instanceof CollageStatEvent.e) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.SELECT_FORMAT_COLLAGE, null, ((CollageStatEvent.e) collageStatEvent).a, 2);
                    } else if (collageStatEvent instanceof CollageStatEvent.c) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CHANGE_FRAME_LAYOUT_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.d) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CHANGE_FRAME_ANGLE_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.b) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CHANGE_FRAME_COLOR_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.p) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.SELECT_ONE_PHOTO_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.m) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.DELETE_ONE_PHOTO_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.q) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CLICK_TO_ADD_PHOTO_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.l) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.UPLOAD_PHOTO_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.r) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.REPLACE_ONE_PHOTO_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.a) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.CANCEL_COLLAGE, null, null, 6);
                    } else if (collageStatEvent instanceof CollageStatEvent.o) {
                        o6a0.e(o6a0Var, MobileOfficialAppsCorePhotoEditorStat$CollageEvent.SAVE_COLLAGE, null, null, 6);
                    } else {
                        if (!(collageStatEvent instanceof CollageStatEvent.n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_COLLAGE);
                    }
                } else if (srk0Var instanceof zf00) {
                    zf00 zf00Var = (zf00) srk0Var;
                    if (epx.f(zf00Var, zf00.a.a)) {
                        o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.REDO);
                    } else if (zf00Var instanceof zf00.b) {
                        ksk0.b(new f0(20, (zf00.b) zf00Var, o6a0Var));
                    } else {
                        if (!epx.f(zf00Var, zf00.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.UNDO);
                    }
                } else if (srk0Var instanceof z6l0) {
                    z6l0 z6l0Var = (z6l0) srk0Var;
                    if (epx.f(z6l0Var, z6l0.a.a)) {
                        o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_STICKER);
                    } else {
                        if (!(z6l0Var instanceof z6l0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ksk0.b(new j6(i2, o6a0Var, (z6l0.b) z6l0Var));
                    }
                } else if (srk0Var instanceof TextStatEvent) {
                    TextStatEvent textStatEvent = (TextStatEvent) srk0Var;
                    if (!epx.f(textStatEvent, TextStatEvent.a.a)) {
                        if (epx.f(textStatEvent, TextStatEvent.b.a)) {
                            ksk0.b(new uh3(i5, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$TextEvent.EDIT_TEXT));
                        } else if (epx.f(textStatEvent, TextStatEvent.c.a)) {
                            o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_TEXT);
                        } else {
                            if (!(textStatEvent instanceof TextStatEvent.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ksk0.b(new m(14, o6a0Var, (TextStatEvent.d) textStatEvent));
                        }
                    }
                } else if (srk0Var instanceof DrawStatEvent) {
                    DrawStatEvent drawStatEvent = (DrawStatEvent) srk0Var;
                    if (!epx.f(drawStatEvent, DrawStatEvent.a.a)) {
                        if (epx.f(drawStatEvent, DrawStatEvent.c.a)) {
                            o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_GRAFFITY);
                        } else {
                            if (!(drawStatEvent instanceof DrawStatEvent.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ksk0.b(new pw(i3, o6a0Var, (DrawStatEvent.d) drawStatEvent));
                        }
                    }
                } else {
                    int i9 = 19;
                    if (srk0Var instanceof h1v0) {
                        h1v0 h1v0Var = (h1v0) srk0Var;
                        if (epx.f(h1v0Var, f1v0.a)) {
                            ksk0.b(new g(i9, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$StickerEvent.CLICK_TO_CREATE_VMOJI));
                        } else {
                            if (!epx.f(h1v0Var, g1v0.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ksk0.b(new g(i9, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$StickerEvent.CLICK_TO_SHOP));
                        }
                    } else if (srk0Var instanceof com.vk.photo.editor.features.colorgrading.b) {
                        com.vk.photo.editor.features.colorgrading.b bVar = (com.vk.photo.editor.features.colorgrading.b) srk0Var;
                        if (epx.f(bVar, b.C1455b.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_BRIGHTNESS);
                        } else if (epx.f(bVar, b.c.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_CONTRAST);
                        } else if (epx.f(bVar, b.d.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_DARKS);
                        } else if (epx.f(bVar, b.e.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_GRAIN);
                        } else if (epx.f(bVar, b.f.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_HSL);
                        } else if (epx.f(bVar, b.g.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_LIGHTS);
                        } else if (epx.f(bVar, b.h.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_SATURATION);
                        } else if (epx.f(bVar, b.i.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_SHARPNESS);
                        } else if (epx.f(bVar, b.j.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_TEMPERATURE);
                        } else if (epx.f(bVar, b.k.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_TONE);
                        } else if (epx.f(bVar, b.l.a)) {
                            o6a0Var.f(MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.ColorGradingEvent.CLICK_TO_VIGNETTE);
                        } else if (epx.f(bVar, b.m.a)) {
                            o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_PHOTO_CORRECTION);
                        }
                    } else if (srk0Var instanceof a7y0) {
                        a7y0 a7y0Var = (a7y0) srk0Var;
                        if (o6a0Var.c.add(a7y0Var)) {
                            int i10 = 17;
                            if (epx.f(a7y0Var, mg00.a)) {
                                ksk0.b(new vq6(i10, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$ZoomEvent.ZOOM_MAIN_SCREEN));
                            } else if (epx.f(a7y0Var, ojo.a)) {
                                ksk0.b(new vq6(i10, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$ZoomEvent.ZOOM_BRUSH_SCREEN));
                            }
                        }
                    } else if (srk0Var instanceof com.vk.photo.editor.features.mlenhance.b) {
                        com.vk.photo.editor.features.mlenhance.b bVar2 = (com.vk.photo.editor.features.mlenhance.b) srk0Var;
                        if (epx.f(bVar2, b.c.a)) {
                            o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_UPGRADE);
                        } else if (epx.f(bVar2, b.a.a)) {
                            ksk0.b(new j(i9, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent.CANCEL_UPGRADE));
                        } else if (epx.f(bVar2, b.d.a)) {
                            ksk0.b(new j(i9, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent.READY_UPGRADE));
                        } else if (epx.f(bVar2, b.C1464b.a)) {
                            ksk0.b(new j(i9, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent.CHANGE_UPGRADE_VALUE));
                        } else {
                            if (!epx.f(bVar2, b.e.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ksk0.b(new j(i9, o6a0Var, MobileOfficialAppsCorePhotoEditorStat$UpgradeEvent.SAVE_UPGRADE));
                        }
                    } else if (srk0Var instanceof SpoilerStatEvent) {
                        SpoilerStatEvent spoilerStatEvent = (SpoilerStatEvent) srk0Var;
                        if (epx.f(spoilerStatEvent, SpoilerStatEvent.a.a)) {
                            o6a0Var.i(MobileOfficialAppsCorePhotoEditorStat$EditorEvent.CLICK_TO_SPOILER);
                        } else {
                            if (!(spoilerStatEvent instanceof SpoilerStatEvent.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ksk0.b(new p(15, o6a0Var, (SpoilerStatEvent.b) spoilerStatEvent));
                        }
                    }
                }
                return s3q0.a;
            case 15:
                com.vk.newsfeed.posting.geo_picker.presentation.e eVar = (com.vk.newsfeed.posting.geo_picker.presentation.e) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                int i11 = com.vk.newsfeed.posting.geo_picker.presentation.e.t1;
                AtomicReference<Location> atomicReference = oxz.a;
                LocationCommon.a.getClass();
                xn50.a.c(eVar, new a.b.C1409b(!LocationCommon.b(fragmentActivity), !LocationCommon.a(fragmentActivity)));
                return s3q0.a;
            case 16:
                b7d0 b7d0Var = (b7d0) this.c;
                mkl mklVar = (mkl) this.d;
                ine0 ine0Var = b7d0Var.F;
                Context context = b7d0Var.itemView.getContext();
                vmb0 vmb0Var = b7d0Var.E;
                ine0Var.getClass();
                vmb0Var.getClass();
                gd60 a = hd60.a();
                Poll poll = (Poll) mklVar.b;
                String str = poll.j ? "board_poll" : "poll";
                Integer valueOf = Integer.valueOf(poll.b);
                UserId userId = poll.c;
                gd60.a aVar = gd60.a;
                a.L0(context, str, valueOf, userId);
                return s3q0.a;
            case 17:
                UserProfile userProfile = (UserProfile) this.c;
                Activity activity2 = (Activity) this.d;
                if (userProfile != null) {
                    xwk.e().m(activity2, userProfile.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_PROFILE);
                return s3q0.a;
            case 18:
                tcf0 tcf0Var = (tcf0) this.c;
                ChannelsRecommendations channelsRecommendations = ((ucf0) this.d).h;
                ArrayList arrayList = new ArrayList();
                ArrayList<ChannelsRecommendation> arrayList2 = channelsRecommendations.j;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new jeb((ChannelsRecommendation) it.next()));
                }
                arrayList.addAll(arrayList3);
                arrayList.add(keb.a);
                tcf0Var.H.setItems(arrayList);
                tcf0Var.F.getRecyclerView().scrollToPosition(0);
                return s3q0.a;
            case 19:
                com.vk.clips.sdk.shared.item.static_ads.c cVar2 = (com.vk.clips.sdk.shared.item.static_ads.c) this.c;
                Context context2 = (Context) this.d;
                jw30 jw30Var = new jw30(cVar2, 28);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a2 = msy.a(lazyThreadSafetyMode, jw30Var);
                return new ewk0(msy.a(lazyThreadSafetyMode, new m(i3, cVar2, context2)), msy.a(lazyThreadSafetyMode, new j6(i4, a2, cVar2)), a2, new w9(i6));
            case 20:
                StoryArchiveFragment.b bVar3 = (StoryArchiveFragment.b) this.c;
                ((wh50) this.d).setValue(Boolean.TRUE);
                StoryArchiveFragment storyArchiveFragment = StoryArchiveFragment.this;
                int i12 = StoryArchiveFragment.h0;
                anm0.E((anm0) storyArchiveFragment.U.getValue(), StoryViewAction.DELETE_FROM_ARCHIVE, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_ARCHIVE), MobileOfficialAppsConStoriesStat$ViewEntryPoint.ARCHIVE, null, null, 56);
                return s3q0.a;
            case 21:
                ((mrj0) ((o8m0) this.c).f.getValue()).a((Activity) this.d, 50, new kdw(i5));
                return s3q0.a;
            case 22:
                ((y2p0) this.c).a.p2(((y2p0.a.b) ((y2p0.a) this.d)).a);
                return s3q0.a;
            case 23:
                izs izsVar2 = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                izsVar2.invoke(vmd.d.b);
                wh50Var.setValue("");
                return s3q0.a;
            case 24:
                ((slq0) this.c).a(new UserProfileAction.s.c.a.C1695c(new mh40((olq0) this.d, 16)));
                return s3q0.a;
            case 25:
                dhr0.b bVar4 = (dhr0.b) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                r6 = bVar4 != null ? bVar4 : null;
                if (r6 != null) {
                    r6.f = false;
                    r6.b.clear();
                }
                frameLayout.removeView(bVar4);
                return s3q0.a;
            case 26:
                pbt0.a aVar2 = (pbt0.a) this.c;
                mbt0 mbt0Var = (mbt0) this.d;
                VKImageView vKImageView = aVar2.r;
                vKImageView.setVisibility(0);
                f4m.j(aVar2.s);
                dhr0.a.getClass();
                vKImageView.setPlaceholderColor(dhr0.f.a(R.attr.vk_ui_image_placeholder_alpha, dhr0.s()));
                if (!aVar2.E) {
                    vKImageView.F0(m33.a(R.drawable.video_placeholder_64, aVar2.itemView.getContext()), ImageView.ScaleType.FIT_XY);
                }
                ImageSize Cb = mbt0Var.b.getImage().Cb(aVar2.itemView.getResources().getDimensionPixelSize(R.dimen.video_minimizable_dialog_playlist_preview_height), true, false);
                vKImageView.s0(Cb != null ? Cb.d.d : null);
                return s3q0.a;
            case 27:
                Context context3 = (Context) this.c;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) this.d;
                new ProfileFriendsFragment.a(FriendsListParams.BestFriendsList.b, FriendsListPrivacyType.CLIP, null, null, false, 60).k(context3);
                if (mobileOfficialAppsCoreNavStat$EventScreen != null) {
                    nbc0.a.a(mobileOfficialAppsCoreNavStat$EventScreen);
                }
                return s3q0.a;
            default:
                fpx0 fpx0Var = (fpx0) this.c;
                QueueParams queueParams = (QueueParams) this.d;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"KeyExpired: key=" + queueParams.d});
                }
                fpx0Var.c.e(queueParams.d, true);
                return s3q0.a;
        }
    }
}
