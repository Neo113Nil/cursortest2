package com.vk.sharing.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.entities.StoryImSharingData;
import com.vk.dto.stories.entities.StoryImSharingStats;
import com.vk.dto.stories.entities.StoryLocalPhotoSticker;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryQuestionSharing;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.RepostAttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.sharing.core.SharingActivity;
import com.vk.sharing.core.target.Targets;
import com.vk.sharing.core.view.l;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stories.StoryPostInfo;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.entity.attach.StoryEditorPhotoAlbumAttachment;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.activities.LogoutReceiver;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.StoryAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VmojiAttachment;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.b3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.a0a;
import xsna.ao8;
import xsna.b410;
import xsna.b4z;
import xsna.bcj0;
import xsna.bin0;
import xsna.bjc;
import xsna.bwt0;
import xsna.cbj0;
import xsna.cc20;
import xsna.cuz;
import xsna.cvk;
import xsna.dbj0;
import xsna.dcj0;
import xsna.dhr0;
import xsna.ecj0;
import xsna.f370;
import xsna.fbj0;
import xsna.fkq0;
import xsna.g620;
import xsna.go9;
import xsna.gu50;
import xsna.gxh;
import xsna.iah0;
import xsna.ixj0;
import xsna.j5g;
import xsna.j6i;
import xsna.k9q0;
import xsna.ksg0;
import xsna.l4o0;
import xsna.l7s;
import xsna.lh8;
import xsna.lhg;
import xsna.m0q0;
import xsna.m7m;
import xsna.mhy;
import xsna.mqe0;
import xsna.msy;
import xsna.myd0;
import xsna.pq9;
import xsna.q9i0;
import xsna.qao;
import xsna.t5m;
import xsna.tmq;
import xsna.u74;
import xsna.udm0;
import xsna.v43;
import xsna.w74;
import xsna.wzs;
import xsna.xa4;
import xsna.xwk;
import xsna.y1k;
import xsna.z23;
import xsna.z250;
import xsna.z74;

/* loaded from: classes5.dex */
public abstract class SharingActivity extends BaseSharingActivity implements m0q0 {
    public static Bundle n0;
    public LogoutReceiver J;
    public Targets K;

    @Nullable
    public AttachmentInfo L;
    public Integer M;

    @Nullable
    public MobileOfficialAppsSharingStat$TypeEventSource N;
    public l4o0 O;
    public w74 P;
    public ActionsInfo Q;

    @Nullable
    public Post R;

    @Nullable
    public UserProfile S;

    @Nullable
    public Article T;

    @Nullable
    public Parcelable U;

    @Nullable
    public String V;

    @Nullable
    public String W;

    @Nullable
    public String X;

    @Nullable
    public String Y;

    @Nullable
    public Peer Z;
    public int a0;
    public final Object j0;
    public final Object k0;
    public final a l0;
    public final Object m0;
    public boolean G = false;
    public boolean H = false;
    public boolean I = true;
    public boolean b0 = false;
    public final boolean c0 = true;
    public boolean d0 = false;
    public boolean e0 = false;
    public final io.reactivex.rxjava3.subjects.f<String> f0 = new io.reactivex.rxjava3.subjects.f<>();
    public io.reactivex.rxjava3.disposables.c g0 = null;
    public io.reactivex.rxjava3.disposables.c h0 = EmptyDisposable.INSTANCE;
    public final gxh i0 = ((DataRepositoryComponent) j6i.b(m7m.f(this), DataRepositoryComponent.class)).D();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.vkontakte.android.ACTION_SHARING_ERROR_STATUS".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("extra_show_failure_sharing_msg");
                SharingActivity sharingActivity = SharingActivity.this;
                if (stringExtra != null) {
                    sharingActivity.f0.onNext(intent.getStringExtra("extra_show_failure_sharing_msg"));
                }
                if (intent.getParcelableExtra("userId") != null) {
                    UserId userId = (UserId) intent.getParcelableExtra("userId");
                    Bundle bundle = SharingActivity.n0;
                    sharingActivity.b2(userId);
                }
            }
        }
    }

    public class b extends ArrayList {
        final /* synthetic */ List val$targets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, List list) {
            super(i);
            this.val$targets = list;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                add(((Target) it.next()).c);
            }
        }
    }

    public static final class c {
        public l4o0 a;
        public w74 b;
    }

    public SharingActivity() {
        b410 b410Var = new b410(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j0 = msy.a(lazyThreadSafetyMode, b410Var);
        this.k0 = msy.a(lazyThreadSafetyMode, new mqe0(this, 7));
        this.l0 = new a();
        ComFeatures comFeatures = ComFeatures.COM_DEFAULT_AUTHOR;
        Objects.requireNonNull(comFeatures);
        this.m0 = msy.a(lazyThreadSafetyMode, new dbj0(comFeatures, 0));
    }

    public static StorySharingInfo Y1(@NonNull AttachmentInfo attachmentInfo, ActionsInfo actionsInfo) {
        Attachment attachment = (Attachment) attachmentInfo.f.getParcelable("attachments");
        int i = attachmentInfo.b;
        return new StorySharingInfo(attachmentInfo.b, Long.valueOf(attachmentInfo.c), Long.valueOf(attachmentInfo.d), attachmentInfo.e, z74.l(attachmentInfo, actionsInfo), udm0.b(i, attachment), udm0.a(i, attachment), udm0.c(i, attachment, false), true, true);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void A3() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.TEXT", Z1(null));
        ThemableActivity themableActivity = this.i;
        if (themableActivity.getPackageManager().resolveActivity(intent, 0) != null) {
            themableActivity.startActivity(intent);
        } else {
            cvk.u(R.string.error_open_app, false);
        }
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final boolean C3() {
        return this.e0;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final boolean D3() {
        return this.I;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final boolean E3() {
        return this.b0;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void K2(@NonNull Target target, int i) {
        this.v.d(target.c);
        this.y.K2(target, i);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.sharing.core.BaseSharingActivity
    public final String U1() {
        String l = z74.l(this.L, this.Q);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures) ? ((VideoShareComponent) this.k0.getValue()).S().c(l) : l;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity
    public final void X1(UserId userId, boolean z) {
        com.vk.sharing.core.view.f fVar = this.w;
        e2(fVar != null ? fVar.getCommentText() : "", "share_create_chat", Collections.singletonList(userId), false, z);
        this.v.a(AppShareType.CREATE_CHAT);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @NonNull
    public final String Z1(@Nullable String str) {
        if (this.L == null) {
            String str2 = this.Q.c;
            return str2 != null ? str2 : "";
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.Q.c)) {
            sb.append(this.Q.c);
        }
        String l = z74.l(this.L, this.Q);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            l = ((VideoShareComponent) this.k0.getValue()).S().b(l, str);
        }
        if (!this.Q.c.equalsIgnoreCase(l)) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(l);
        }
        return sb.toString();
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void Z2(@Nullable String str) {
        cbj0.e(this, Z1(str), SharingDataType.OTHER, true, null, null, str, null);
        this.v.a(AppShareType.OTHER);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void a3() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:"));
        intent.putExtra("sms_body", Z1(null));
        ThemableActivity themableActivity = this.i;
        if (themableActivity.getPackageManager().resolveActivity(intent, 0) != null) {
            themableActivity.startActivity(intent);
        } else {
            cvk.u(R.string.error_open_app, false);
        }
    }

    public final void b2(UserId userId) {
        this.v.d(userId);
        List<Target> g = fkq0.b(userId) ? this.K.g() : this.K.f();
        for (int i = 0; i < g.size(); i++) {
            Target target = g.get(i);
            if (userId.equals(target.c)) {
                target.g = false;
                K2(target, i);
            }
        }
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void b3(@NonNull String str, @NonNull List<Target> list, boolean z) {
        e2(str, "share", new b(list.size(), list), z, false);
        this.v.a(AppShareType.MESSAGE);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void c3(@NonNull String str, @NonNull List<Target> list) {
        Intent intent = new Intent(this, (Class<?>) SharingService.class);
        intent.putExtra(NotificationCompat.CATEGORY_CALL, 3);
        intent.putExtra("repost_attachment_info", RepostAttachmentInfo.a(this.L));
        intent.putExtra("total_targets", list.size());
        intent.putExtra("text", str);
        intent.putExtra("referer", this.V);
        intent.putExtra("referer_src", this.W);
        intent.putExtra("ref", this.X);
        intent.putExtra("showToastOnSuccess", false);
        intent.putExtra("extra_sharing_success_request_code", this.a0);
        Iterator<Target> it = list.iterator();
        while (it.hasNext()) {
            intent.putExtra("target", it.next());
            b4z.E(intent, false);
        }
        this.v.a(AppShareType.POST);
    }

    public final boolean d2() {
        int i = this.L.b;
        return (i == 30 || i == 18) && Objects.equals(this.Y, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.MESSAGE_REPOST.name());
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final ActionsInfo d3() {
        return this.Q;
    }

    @Override // androidx.core.app.ComponentActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void destroy() {
        pq9 pq9Var = this.x;
        if (pq9Var != null) {
            pq9Var.a();
        }
        ecj0 ecj0Var = this.v;
        int i = 0;
        if (ecj0Var != null && !ecj0Var.e.isEmpty()) {
            i = -1;
        }
        ecj0 ecj0Var2 = this.v;
        setResult(i, ecj0Var2 != null ? ecj0Var2.b() : new Intent());
        finish();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void e2(@NonNull String str, String str2, @NonNull List<UserId> list, boolean z, boolean z2) {
        AttachmentInfo attachmentInfo;
        int i;
        AttachmentInfo attachmentInfo2 = this.L;
        if (attachmentInfo2 != null && ((i = attachmentInfo2.b) == 18 || i == 22)) {
            String r = attachmentInfo2.r();
            if (!TextUtils.isEmpty(r)) {
                UiTracker uiTracker = UiTracker.a;
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null), null, new MobileOfficialAppsFeedStat$TypePhotoShareToMessageItem(r))).q();
            }
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures) && (attachmentInfo = this.L) != null && attachmentInfo.zb() != null) {
            String zb = this.L.zb();
            String d = ((VideoShareComponent) this.k0.getValue()).S().d(zb);
            if (!zb.equals(d)) {
                this.L.f.putString("link", d);
            }
        }
        Intent intent = new Intent(this, (Class<?>) SharingService.class);
        intent.putExtra(NotificationCompat.CATEGORY_CALL, 1);
        intent.putExtra("attachment_info", this.L);
        intent.putExtra("total_targets", list.size());
        intent.putExtra("text", str);
        intent.putExtra("referer", this.V);
        intent.putExtra("referer_src", this.W);
        intent.putExtra("ref", this.X);
        intent.putExtra("entryPoint", str2);
        intent.putExtra("owner_id", this.Z);
        intent.putExtra("showToastOnSuccess", z2);
        intent.putExtra("extra_sharing_success_request_code", this.a0);
        Iterator<UserId> it = list.iterator();
        while (it.hasNext()) {
            intent.putExtra("dialog_id", it.next().b);
            b4z.E(intent, false);
        }
        if (z && this.z) {
            mhy.b(this);
        }
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final boolean e3() {
        return getIntent().getBooleanExtra("is_direct_message_action_disabled", false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void f2(Owner owner, com.vk.storycamera.builder.a aVar) {
        if (owner != null && fkq0.b(owner.b) && ((Boolean) this.m0.getValue()).booleanValue() && this.i0.g0(owner.b)) {
            String str = owner.d;
            if (str == null) {
                str = owner.e;
            }
            aVar.q(owner.b, owner.c, str);
        }
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void f3(@NonNull com.vk.sharing.core.a aVar) {
        this.y = aVar;
        com.vk.sharing.core.view.f fVar = this.w;
        if (fVar != null) {
            fVar.setDelegatePresenter(aVar);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.c0) {
            overridePendingTransition(0, android.R.anim.fade_out);
        }
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void g3() {
        Post post = this.R;
        UserProfile userProfile = this.S;
        Article article = this.T;
        Parcelable parcelable = this.U;
        final AttachmentInfo attachmentInfo = this.L;
        final com.vk.sharing.core.view.f fVar = this.w;
        final com.vk.sharing.core.a aVar = this.y;
        ecj0 ecj0Var = this.v;
        if (fVar == null || aVar == null) {
            return;
        }
        ThemableActivity themableActivity = this.i;
        if (post != null) {
            g.b(themableActivity, post, attachmentInfo, fVar, aVar);
        } else {
            if (userProfile != null) {
                fVar.setToggleFaveActionIsEnabled(false);
                tmq.a().b(themableActivity, userProfile, new y1k(userProfile, aVar, fVar, attachmentInfo), new ksg0(fVar, 2), attachmentInfo != null ? attachmentInfo.e : null, null, attachmentInfo != null ? attachmentInfo.r() : null);
            } else if (article != null) {
                g.a(themableActivity, article, attachmentInfo, fVar, aVar);
            } else {
                if (parcelable == null) {
                    return;
                }
                final Group group = parcelable instanceof Group ? (Group) parcelable : null;
                Good good = parcelable instanceof Good ? (Good) parcelable : null;
                VideoAttachment videoAttachment = parcelable instanceof VideoAttachment ? (VideoAttachment) parcelable : parcelable instanceof VideoFile ? new VideoAttachment((VideoFile) parcelable) : null;
                if (group != null) {
                    fVar.setToggleFaveActionIsEnabled(false);
                    tmq.a().c(themableActivity, group, new wzs() { // from class: xsna.rbj0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            Group.this.k = booleanValue;
                            ActionsInfo d3 = aVar.f.d3();
                            d3.h = booleanValue;
                            AttachmentInfo attachmentInfo2 = attachmentInfo;
                            int i = attachmentInfo2 != null ? attachmentInfo2.b : 0;
                            com.vk.sharing.core.view.l lVar = fVar;
                            lVar.ae(d3, i);
                            lVar.setToggleFaveActionIsEnabled(true);
                            return s3q0.a;
                        }
                    }, new q9i0(fVar, 3), attachmentInfo != null ? attachmentInfo.e : null, null, attachmentInfo != null ? attachmentInfo.r() : null);
                } else if (good != null) {
                    g.b(themableActivity, ao8.s(good), attachmentInfo, fVar, aVar);
                } else if (videoAttachment != null) {
                    g.b(themableActivity, videoAttachment, attachmentInfo, fVar, aVar);
                }
            }
        }
        ecj0Var.a(AppShareType.OTHER);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final Targets getTargets() {
        return this.K;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final l getView() {
        return this.w;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a, com.vk.sharing.core.view.l.a
    public final boolean h(@NonNull Target target) {
        return this.v.d.contains(target);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    @Nullable
    public final AttachmentInfo i3() {
        return this.L;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final Integer j3() {
        return this.M;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void l2(@NonNull Target target, int i, boolean z) {
        this.y.l2(target, i, z);
        ecj0 ecj0Var = this.v;
        HashSet hashSet = ecj0Var.d;
        target.g = z;
        if (z) {
            hashSet.add(target);
        } else {
            ecj0Var.d(target.c);
        }
        int size = hashSet.size();
        HashSet hashSet2 = this.v.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Target) next).k) {
                arrayList.add(next);
            }
        }
        int size2 = arrayList.size();
        HashSet hashSet3 = this.v.d;
        boolean z2 = false;
        if (hashSet3 == null || !hashSet3.isEmpty()) {
            Iterator it2 = hashSet3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((Target) it2.next()).h) {
                    z2 = true;
                    break;
                }
            }
        }
        this.w.D0(i);
        this.w.d2(size, size2, z2);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final int l3() {
        return this.a0;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void m3() {
        new lh8(this.i0).a(this);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final l4o0 o3() {
        return this.O;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        com.vk.sharing.core.view.f fVar = this.w;
        if (fVar != null) {
            fVar.B1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.sharing.core.BaseSharingActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int i;
        w74 w74Var;
        int i2 = 0;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Window window = getWindow();
        if (getIntent().getBooleanExtra("fullscreen", false)) {
            window.getDecorView().setSystemUiVisibility(4);
        }
        boolean z = dhr0.C().b;
        int i3 = R.style.Theme_App_TransparentMilkDark;
        int i4 = z ? R.style.Theme_App_TransparentMilk : 2132018221;
        boolean booleanExtra = getIntent().getBooleanExtra("force_dark_theme", false);
        if (!booleanExtra) {
            i3 = i4;
        }
        setTheme(i3);
        getWindow().setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (booleanExtra) {
            dhr0.u0(getWindow(), NavigationBarStyle.DARK);
        } else {
            dhr0.r0(this);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setOnClickListener(new com.vk.im.video.d(this, 11));
        frameLayout.setId(R.id.fragment_wrapper);
        ActionsInfo actionsInfo = (ActionsInfo) getIntent().getParcelableExtra("actions_info");
        Integer num = null;
        z250 z250Var = (actionsInfo == null || (actionsInfo.b & 128) <= 0) ? null : new z250(this, 7);
        Intent intent = getIntent();
        Integer valueOf = intent.hasExtra("extra_accent_color") ? Integer.valueOf(intent.getIntExtra("extra_accent_color", 0)) : null;
        l7s u = booleanExtra ? bwt0.u(this) : this;
        if (this.D == null) {
            this.D = W1().F2();
        }
        this.D.getClass();
        com.vk.sharing.core.view.f fVar = new com.vk.sharing.core.view.f(u, false, z250Var, valueOf, true, false, null);
        this.w = fVar;
        frameLayout.addView(fVar);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        boolean booleanExtra2 = getIntent().getBooleanExtra("with_external_apps", false);
        this.b0 = booleanExtra2;
        if (booleanExtra2) {
            this.w.K1();
        }
        this.d0 = getIntent().getBooleanExtra("extra_is_open_external_chat_after_sharing", false);
        this.I = getIntent().getBooleanExtra("extra_show_add_comment", true);
        this.e0 = getIntent().getBooleanExtra("extra_is_open_from_sharing", false);
        this.Z = (Peer) getIntent().getParcelableExtra("owner_id");
        Bundle bundle2 = n0;
        if (bundle2 != null) {
            this.L = (AttachmentInfo) bundle2.getParcelable("attachment_info");
            this.R = (Post) n0.getParcelable("post");
            this.S = (UserProfile) n0.getParcelable("extra_user_profile");
            this.T = (Article) n0.getParcelable("extra_article");
            this.U = n0.getParcelable("extra_related_object");
        } else {
            this.L = (AttachmentInfo) getIntent().getParcelableExtra("attachment_info");
            this.R = (Post) getIntent().getParcelableExtra("post");
            this.S = (UserProfile) getIntent().getParcelableExtra("extra_user_profile");
            this.T = (Article) getIntent().getParcelableExtra("extra_article");
            this.U = getIntent().getParcelableExtra("extra_related_object");
        }
        this.V = getIntent().getStringExtra("referer");
        this.W = getIntent().getStringExtra("referer_src");
        this.X = getIntent().getStringExtra("ref");
        this.Y = getIntent().getStringExtra("extra_entry_point");
        String stringExtra = getIntent().getStringExtra("extra_share_source");
        if (stringExtra != null) {
            this.N = MobileOfficialAppsSharingStat$TypeEventSource.valueOf(stringExtra);
        }
        this.a0 = getIntent().getIntExtra("extra_sharing_success_request_code", -1);
        c cVar = (c) getLastCustomNonConfigurationInstance();
        if (cVar == null) {
            dcj0 V1 = V1();
            if (this.E == null) {
                this.E = W1().jc();
            }
            this.O = new l4o0(true, V1, this.E);
            AttachmentInfo attachmentInfo = this.L;
            if (attachmentInfo != null) {
                int i5 = attachmentInfo.b;
                gu50 gu50Var = z74.a;
                Bundle bundle3 = attachmentInfo.f;
                if (i5 != 1 && i5 != 15 && i5 != 24) {
                    if (i5 == 26) {
                        w74Var = new u74.c(R.string.sharing_story_attachment_preview_label, bundle3);
                    } else if (i5 != 37) {
                        if (i5 == 3) {
                            w74Var = new u74.c(R.string.sharing_article_attachment_preview_label, bundle3);
                        } else if (i5 == 4) {
                            w74Var = new u74.a(bundle3);
                        } else if (i5 != 5) {
                            if (i5 != 7) {
                                if (i5 == 8) {
                                    w74Var = new u74.f(bundle3);
                                } else if (i5 != 11) {
                                    if (i5 == 12) {
                                        w74Var = new u74.g(bundle3);
                                    } else if (i5 != 49 && i5 != 50) {
                                        switch (i5) {
                                            case 18:
                                                w74Var = new u74.h(bundle3, "thumbUrl");
                                                break;
                                            case 19:
                                                w74Var = new u74.i(bundle3);
                                                break;
                                            default:
                                                switch (i5) {
                                                    case 30:
                                                        break;
                                                    case 31:
                                                        w74Var = new u74.c(R.string.sharing_post_attachment_preview_label, bundle3);
                                                        break;
                                                    case 32:
                                                        w74Var = new u74.c(R.string.sharing_ads_post_attachment_preview_label, bundle3);
                                                        break;
                                                    case 33:
                                                        w74Var = new u74.c(R.string.sharing_post_comment_attachment_preview_label, bundle3);
                                                        break;
                                                    case 34:
                                                        w74Var = new u74.d(bundle3);
                                                        break;
                                                    default:
                                                        switch (i5) {
                                                            case 39:
                                                            case 41:
                                                                w74Var = new u74.h(bundle3, "pending_photo_uri");
                                                                break;
                                                            case 40:
                                                            case 42:
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException(lhg.a(i5, "Unsupported type:"));
                                                        }
                                                }
                                            case 20:
                                            case 21:
                                                w74Var = null;
                                                break;
                                        }
                                    }
                                }
                            }
                            w74Var = new u74.j(bundle3);
                        } else {
                            w74Var = new u74.b(bundle3);
                        }
                    }
                    this.P = w74Var;
                }
                w74Var = null;
                this.P = w74Var;
            }
        } else {
            this.O = cVar.a;
            this.P = cVar.b;
        }
        w74 w74Var2 = this.P;
        if (w74Var2 != null) {
            this.w.setAttachmentViewHolder(w74Var2);
        }
        Intent intent2 = getIntent();
        this.M = intent2.hasExtra("extra_list_item_position") ? Integer.valueOf(intent2.getIntExtra("extra_list_item_position", 0)) : null;
        if (actionsInfo != null) {
            AttachmentInfo attachmentInfo2 = this.L;
            if (attachmentInfo2 != null) {
                i = attachmentInfo2.b;
            } else {
                if (bundle != null && bundle.containsKey("attachment_info")) {
                    AttachmentInfo attachmentInfo3 = (AttachmentInfo) bundle.getParcelable("attachment_info");
                    this.L = attachmentInfo3;
                    if (attachmentInfo3 != null) {
                        i = attachmentInfo3.b;
                    }
                }
                i = 0;
            }
            this.w.E1(actionsInfo, null, i);
        }
        this.Q = actionsInfo;
        this.x = new pq9(this.w, new bin0() { // from class: xsna.ebj0
            @Override // xsna.bin0
            public final Object get() {
                Bundle bundle4 = SharingActivity.n0;
                SharingActivity sharingActivity = SharingActivity.this;
                return new Pair(sharingActivity.y, sharingActivity.v);
            }
        });
        if (bundle == null) {
            this.K = new Targets();
            ArrayList arrayList = new ArrayList();
            AttachmentInfo attachmentInfo4 = this.L;
            if (attachmentInfo4 != null) {
                long j = attachmentInfo4.f.getLong("user_id");
                if (j > 0) {
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    arrayList.add(Peer.a.b(j));
                }
                num = Integer.valueOf(this.L.b);
            }
            this.y = new com.vk.sharing.core.b(this, true, arrayList, num);
        } else {
            this.G = bundle.getBoolean("BOTTOMSHEET_FULLSCREEN");
            Targets targets = (Targets) bundle.getParcelable("STATE_TARGETS");
            this.K = targets;
            if (targets == null) {
                this.K = new Targets();
            }
            if (this.U == null) {
                this.U = bundle.getParcelable("related_favable");
            }
            com.vk.sharing.core.a b2 = f.b(this, bundle.getInt("STATE_DELEGATE"));
            this.y = b2;
            b2.b();
            this.x.e(bundle);
            this.w.h0(this.G);
        }
        this.w.setPresenter(this);
        this.w.setDelegatePresenter(this.y);
        this.O.h = this;
        this.r = false;
        cuz.a(this.i).b(this.l0, z23.a("com.vkontakte.android.ACTION_SHARING_ERROR_STATUS"));
        io.reactivex.rxjava3.subjects.f<String> fVar2 = this.f0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fVar2.getClass();
        w a2 = io.reactivex.rxjava3.schedulers.a.a();
        int i6 = io.reactivex.rxjava3.core.g.b;
        io.reactivex.rxjava3.internal.functions.b.a(i6, "bufferSize");
        Objects.requireNonNull(a2, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        io.reactivex.rxjava3.internal.functions.b.b(Long.MAX_VALUE, "count");
        this.g0 = new b3(fVar2, a2, i6).t(new fbj0(i2)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qao(i2));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!this.g0.h()) {
            this.g0.dispose();
        }
        this.g0 = null;
        cuz.a(this.i).d(this.l0);
        this.O.c.dispose();
        this.O.h = null;
        n0 = null;
        super.onDestroy();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.H = false;
    }

    @Override // androidx.activity.ComponentActivity
    public final Object onRetainCustomNonConfigurationInstance() {
        c cVar = new c();
        cVar.a = this.O;
        cVar.b = this.P;
        return cVar;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putParcelable("STATE_TARGETS", this.K);
        com.vk.sharing.core.a aVar = this.y;
        if (aVar != null) {
            bundle.putInt("STATE_DELEGATE", f.a(aVar));
        }
        ecj0 ecj0Var = this.v;
        if (ecj0Var != null) {
            ecj0Var.c(bundle);
        }
        com.vk.sharing.core.view.f fVar = this.w;
        bundle.putBoolean("BOTTOMSHEET_FULLSCREEN", fVar != null && fVar.getFullScreen());
        AttachmentInfo attachmentInfo = this.L;
        if (attachmentInfo != null) {
            bundle.putParcelable("attachment_info", attachmentInfo);
        }
        Parcelable parcelable = this.U;
        if (parcelable != null) {
            bundle.putParcelable("related_favable", parcelable);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.pushes.PushAwareActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.J = LogoutReceiver.a(this);
        this.h0 = V1().a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cc20(this, 21));
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        io.reactivex.rxjava3.disposables.c cVar = this.h0;
        if (cVar != null) {
            cVar.dispose();
            this.h0 = null;
        }
        this.J.b();
        this.J = null;
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void q3() {
        AttachmentInfo attachmentInfo = this.L;
        if (attachmentInfo == null) {
            return;
        }
        Attachment attachment = (Attachment) attachmentInfo.f.getParcelable("attachments");
        if (this.L.b != 7) {
            L.l("trying to download a non-clip object");
            return;
        }
        VideoAttachment videoAttachment = (VideoAttachment) attachment;
        ClipVideoFile clipVideoFile = (ClipVideoFile) videoAttachment.k;
        ?? r2 = this.j0;
        if (!((ClipsDownloadComponent) r2.getValue()).Q5().c(clipVideoFile)) {
            ((ClipsDownloadComponent) r2.getValue()).Q5().a(this, clipVideoFile);
            return;
        }
        ((ClipsDownloadComponent) r2.getValue()).Gc().a(this.i, (ClipVideoFile) videoAttachment.k, true, new myd0(this, 10), null);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void r3() {
        AttachmentInfo attachmentInfo = this.L;
        if (attachmentInfo == null) {
            return;
        }
        Attachment attachment = (Attachment) attachmentInfo.f.getParcelable("attachments");
        if (this.L.b != 7) {
            L.l("trying to make a duet by sharing from a non-clip object");
        } else {
            g620.f().i(this, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS.name(), MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_DUET_MAKE, null, null, null, (ClipVideoFile) ((VideoAttachment) attachment).k, null, 0, null);
        }
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void u2(@NonNull Target target, int i, @Nullable String str) {
        this.v.d.add(target);
        this.y.u2(target, i, str);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void u3() {
        VideoAttachment l;
        Playlist playlist;
        MusicTrack musicTrack;
        AttachmentInfo attachmentInfo = this.L;
        if (attachmentInfo == null) {
            return;
        }
        Attachment attachment = (Attachment) attachmentInfo.f.getParcelable("attachments");
        int i = this.L.b;
        VideoFile videoFile = null;
        if (i == 5 && (attachment instanceof AudioAttachment) && (musicTrack = ((AudioAttachment) attachment).f) != null) {
            com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a("STORY_VIEWER", MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.MUSIC_COVER_SHARING.toString().toLowerCase(Locale.ROOT));
            aVar.W = false;
            aVar.k0 = musicTrack;
            aVar.C(this);
            this.v.a(AppShareType.STORY);
            com.vk.sharing.core.view.f fVar = this.w;
            if (fVar != null) {
                fVar.t1(null);
                return;
            }
            return;
        }
        if (i == 19 && (attachment instanceof AudioPlaylistAttachment) && (playlist = ((AudioPlaylistAttachment) attachment).f) != null) {
            StorySharingInfo B = f370.B(playlist);
            com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.MUSIC_COVER_SHARING);
            aVar2.W = false;
            aVar2.i = B;
            aVar2.q0 = playlist;
            aVar2.C(this);
            this.v.a(AppShareType.STORY);
            com.vk.sharing.core.view.f fVar2 = this.w;
            if (fVar2 != null) {
                fVar2.t1(null);
                return;
            }
            return;
        }
        String str = this.Y;
        if (str == null) {
            str = "story_repost";
        }
        com.vk.storycamera.builder.a aVar3 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.SHARE, str);
        aVar3.g = xa4.t();
        if (i == 26) {
            StoryAttachment storyAttachment = (StoryAttachment) attachment;
            aVar3.q = new StoryEntryExtended(storyAttachment.f, storyAttachment.g);
        } else if (i == 31 || i == 33 || i == 32) {
            Post post = (Post) this.L.f.getParcelable("post");
            if (post != null) {
                StoryPostInfo storyPostInfo = new StoryPostInfo(post);
                Post post2 = storyPostInfo.b;
                if (post2 != null && (l = k9q0.l(post2)) != null) {
                    videoFile = l.k;
                }
                if (videoFile != null) {
                    aVar3.r0 = videoFile;
                } else {
                    aVar3.z = storyPostInfo;
                }
                f2(post.o, aVar3);
            }
        } else if (i == 18) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            if (d2()) {
                StoryImSharingData[] storyImSharingDataArr = {new StoryImSharingData.Photo(Uri.parse(ixj0.h(photoAttachment.l.y.b)), new StoryImSharingStats(photoAttachment.g.b, photoAttachment.c))};
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, storyImSharingDataArr);
                aVar3.B0 = arrayList;
                aVar3.m0 = true;
            } else {
                aVar3.J = photoAttachment.l;
            }
            aVar3.U = false;
        } else if (i == 21) {
            PollAttachment pollAttachment = (PollAttachment) attachment;
            if (pollAttachment != null) {
                StoryCameraParams.a.p(aVar3, pollAttachment.f);
            }
        } else {
            if (i == 5) {
                MusicTrack musicTrack2 = ((AudioAttachment) attachment).f;
                if (musicTrack2.E) {
                    aVar3.O = new StoryMusicInfo(musicTrack2, "", 0, 0, 0, null, false, 0, false, false, null, false, false);
                }
            }
            if (i == 11 && MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PROFILE_QUESTION.name().equalsIgnoreCase(this.Y)) {
                aVar3.i0 = StoryQuestionSharing.b;
                aVar3.i = new StorySharingInfo(11, null, null, null, this.L.zb(), udm0.b(i, attachment), "questions", udm0.c(i, attachment, false), true, true);
                aVar3.I = true;
            } else if (i == 11 && (attachment instanceof AlbumAttachment)) {
                AlbumAttachment albumAttachment = (AlbumAttachment) attachment;
                Photo photo = albumAttachment.l;
                String str2 = albumAttachment.z;
                aVar3.A0 = new StoryEditorPhotoAlbumAttachment(photo, null, true, str2 == null ? "" : str2, albumAttachment.y);
                aVar3.U = false;
            } else if (i == 1 && (attachment instanceof AlbumAttachment)) {
                AlbumAttachment albumAttachment2 = (AlbumAttachment) attachment;
                Photo photo2 = albumAttachment2.l;
                String str3 = albumAttachment2.z;
                aVar3.A0 = new StoryEditorPhotoAlbumAttachment(photo2, null, true, str3 == null ? "" : str3, albumAttachment2.y);
                aVar3.U = false;
            } else if (i == 40) {
                aVar3.p0 = ((VmojiAttachment) attachment).g;
                Long valueOf = Long.valueOf(this.L.c);
                Long valueOf2 = Long.valueOf(this.L.d);
                AttachmentInfo attachmentInfo2 = this.L;
                aVar3.i = new StorySharingInfo(40, valueOf, valueOf2, attachmentInfo2.e, attachmentInfo2.zb(), udm0.b(i, attachment), udm0.a(i, attachment), udm0.c(i, attachment, false), true, true);
            } else if (i == 39) {
                aVar3.K = new StoryLocalPhotoSticker(Uri.parse(this.L.f.getString("pending_photo_uri")), iah0.a(8));
                aVar3.L = StoryBackgroundType.MARUSIA;
                aVar3.W = false;
                aVar3.i = new StorySharingInfo(39, null, null, null, this.L.zb(), udm0.b(i, attachment), "ask_marusia", udm0.c(i, attachment, false), false, false);
                aVar3.m0 = true;
                int i2 = this.a0;
                if (i2 != -1) {
                    aVar3.o0 = Integer.valueOf(i2);
                }
            } else if (i == 41) {
                aVar3.K = new StoryLocalPhotoSticker(Uri.parse(this.L.f.getString("pending_photo_uri")), iah0.a(8));
                aVar3.W = false;
                aVar3.i = new StorySharingInfo(41, null, null, null, this.L.zb(), udm0.b(i, attachment), "attach_audio_playlist", udm0.c(i, attachment, false), false, false);
                aVar3.m0 = true;
                int i3 = this.a0;
                if (i3 != -1) {
                    aVar3.o0 = Integer.valueOf(i3);
                }
            } else if (i == 7) {
                ClipVideoFile clipVideoFile = (ClipVideoFile) ((VideoAttachment) attachment).k;
                f2(clipVideoFile.v0, aVar3);
                aVar3.r0 = clipVideoFile;
            } else if (i == 30) {
                VideoAttachment videoAttachment = (VideoAttachment) attachment;
                if (videoAttachment != null) {
                    f2(videoAttachment.s(), aVar3);
                }
                if (d2()) {
                    String T7 = videoAttachment.k.w9().T7();
                    if (T7 != null) {
                        StoryImSharingData[] storyImSharingDataArr2 = {new StoryImSharingData.Video(Uri.parse(T7), new StoryImSharingStats(videoAttachment.k.I0().b, videoAttachment.c))};
                        ArrayList arrayList2 = new ArrayList();
                        Collections.addAll(arrayList2, storyImSharingDataArr2);
                        aVar3.B0 = arrayList2;
                        aVar3.m0 = true;
                    }
                } else {
                    aVar3.r0 = videoAttachment.k;
                }
            } else if (i == 49 && (attachment instanceof ChannelMessageAttachment)) {
                ChannelMessageAttachment channelMessageAttachment = (ChannelMessageAttachment) attachment;
                aVar3.D0 = channelMessageAttachment;
                String string = this.L.f.getString("authorName", channelMessageAttachment.i);
                String string2 = this.L.f.getString("authorPhotoUrl");
                long j = this.L.f.getLong("user_id");
                aVar3.q(new UserId(j), string, string2);
                aVar3.e0 = Boolean.valueOf(j > 0);
            } else {
                aVar3.i = Y1(this.L, this.Q);
            }
        }
        aVar3.n0 = !d2();
        this.v.a(AppShareType.STORY);
        this.w.t1(new v43(17, this, aVar3));
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void v3(@NonNull String str, @NonNull WallRepostSettings wallRepostSettings) {
        b4z.E(new Intent(this, (Class<?>) SharingService.class).putExtra(NotificationCompat.CATEGORY_CALL, 2).putExtra("repost_attachment_info", RepostAttachmentInfo.a(this.L)).putExtra("text", str).putExtra("settings", wallRepostSettings).putExtra("referer", this.V).putExtra("referer_src", this.W).putExtra("ref", this.X).putExtra("showToastOnSuccess", true).putExtra("extra_sharing_success_request_code", this.a0), false);
        if (this.z) {
            mhy.b(this);
        }
        this.v.a(AppShareType.WALL);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @Nullable
    public final MobileOfficialAppsSharingStat$TypeEventSource w3() {
        return this.N;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void x3(@NonNull Target target) {
        if (this.H) {
            return;
        }
        if (!this.d0) {
            this.H = true;
            if (this.C == null) {
                this.C = W1().a();
            }
            this.C.a(this, target.c.b, target.i != null ? new DialogExt(target.i) : null);
            return;
        }
        xwk.d().getBrowser().i(this, Uri.parse("https://" + a0a.d + "/im?sel=" + target.c.b), new LaunchContext(false, false, true, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108856), null);
    }

    @Override // xsna.m0q0
    public final void y(@NonNull UiTrackingScreen uiTrackingScreen) {
        com.vk.sharing.core.a aVar = this.y;
        if (aVar == null || aVar.d() == null) {
            return;
        }
        aVar.d().y(uiTrackingScreen);
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void y2(@NonNull Target target, int i, @Nullable String str) {
        this.y.y2(target, i, str);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final boolean y3() {
        return this.G;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void z3(@NonNull bcj0 bcj0Var) {
        bcj0 bcj0Var2;
        boolean z;
        SharingDataType sharingDataType;
        Playlist playlist;
        Bundle bundle;
        MusicTrack musicTrack;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Bundle bundle7;
        int i;
        String str = this.Y;
        if (str == null) {
            str = "story_repost";
        }
        String str2 = str;
        StorySharingInfo storySharingInfo = null;
        String Z1 = Z1(null);
        if (t5m.c()) {
            Z1 = go9.b(" ", Z1);
        }
        String str3 = Z1;
        AttachmentInfo attachmentInfo = this.L;
        ActionsInfo actionsInfo = this.Q;
        Intent intent = getIntent();
        SharingDataType sharingDataType2 = SharingDataType.OTHER;
        int intExtra = intent.getIntExtra("extra_data_type", sharingDataType2.ordinal());
        SharingDataType.Companion.getClass();
        SharingDataType sharingDataType3 = (SharingDataType) j5g.b0(intExtra, SharingDataType.h());
        SharingDataType sharingDataType4 = sharingDataType3 == null ? sharingDataType2 : sharingDataType3;
        String string = attachmentInfo != null ? attachmentInfo.f.getString("pending_photo_uri") : null;
        if (string == null || !((i = attachmentInfo.b) == 39 || i == 41)) {
            bcj0Var2 = bcj0Var;
            z = false;
        } else {
            Intent intent2 = new Intent("android.intent.action.SEND");
            String path = Uri.parse(string).getPath();
            if (path != null) {
                Uri uriForFile = FileProvider.getUriForFile(this, getString(R.string.vk_file_provider_authority), new File(path));
                intent2.setDataAndType(uriForFile, getContentResolver().getType(uriForFile));
                intent2.putExtra("android.intent.extra.STREAM", uriForFile);
                intent2.addFlags(1);
            }
            if (!TextUtils.isEmpty(str3)) {
                intent2.putExtra("android.intent.extra.TEXT", str3);
            }
            bcj0Var2 = bcj0Var;
            cbj0.d(this, intent2, null, bcj0Var2);
            z = true;
        }
        if (!z) {
            Attachment attachment = (attachmentInfo == null || (bundle7 = attachmentInfo.f) == null) ? null : (Attachment) bundle7.getParcelable("attachments");
            if (attachment instanceof AlbumAttachment) {
                AlbumAttachment albumAttachment = (AlbumAttachment) attachment;
                cbj0.b(this, SharingDataType.ALBUM, attachment, str3, str2, bcj0Var2, null, albumAttachment.y > 0 && albumAttachment.A);
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            Attachment attachment2 = (attachmentInfo == null || (bundle6 = attachmentInfo.f) == null) ? null : (Attachment) bundle6.getParcelable("attachments");
            if (attachment2 instanceof PhotoAttachment) {
                cbj0.c(this, SharingDataType.PHOTO, ((PhotoAttachment) attachment2).l.y, str3, str2, bcj0Var, Y1(attachmentInfo, actionsInfo), 128);
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            Attachment attachment3 = (attachmentInfo == null || (bundle5 = attachmentInfo.f) == null) ? null : (Attachment) bundle5.getParcelable("attachments");
            if (!(attachment3 instanceof VideoAttachment) || (((VideoAttachment) attachment3).k instanceof ClipVideoFile)) {
                z = false;
            } else {
                cbj0.c(this, SharingDataType.VIDEO, Y1(attachmentInfo, actionsInfo), str3, str2, bcj0Var, null, PsExtractor.AUDIO_STREAM);
                z = true;
            }
        }
        if (!z) {
            Attachment attachment4 = (attachmentInfo == null || (bundle4 = attachmentInfo.f) == null) ? null : (Attachment) bundle4.getParcelable("attachments");
            if (attachmentInfo != null && attachmentInfo.b == 7 && (attachment4 instanceof VideoAttachment)) {
                VideoFile videoFile = ((VideoAttachment) attachment4).k;
                if (videoFile instanceof ClipVideoFile) {
                    cbj0.c(this, SharingDataType.CLIP, videoFile, str3, str2, bcj0Var, null, PsExtractor.AUDIO_STREAM);
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            Attachment attachment5 = (attachmentInfo == null || (bundle3 = attachmentInfo.f) == null) ? null : (Attachment) bundle3.getParcelable("attachments");
            if (attachment5 instanceof PollAttachment) {
                cbj0.c(this, SharingDataType.POLL, ((PollAttachment) attachment5).f, str3, str2, bcj0Var, null, PsExtractor.AUDIO_STREAM);
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            Attachment attachment6 = (attachmentInfo == null || (bundle2 = attachmentInfo.f) == null) ? null : (Attachment) bundle2.getParcelable("attachments");
            if (!(attachment6 instanceof AudioAttachment) || (musicTrack = ((AudioAttachment) attachment6).f) == null) {
                z = false;
            } else {
                cbj0.c(this, SharingDataType.AUDIO, musicTrack, str3, str2, bcj0Var, null, PsExtractor.AUDIO_STREAM);
                z = true;
            }
        }
        if (!z) {
            Attachment attachment7 = (attachmentInfo == null || (bundle = attachmentInfo.f) == null) ? null : (Attachment) bundle.getParcelable("attachments");
            if (!(attachment7 instanceof AudioPlaylistAttachment) || (playlist = ((AudioPlaylistAttachment) attachment7).f) == null) {
                z = false;
            } else {
                cbj0.c(this, SharingDataType.PLAYLIST, playlist, str3, str2, bcj0Var, null, PsExtractor.AUDIO_STREAM);
                z = true;
            }
        }
        if (z) {
            sharingDataType = sharingDataType4;
        } else {
            Article article = this.T;
            if (article == null || sharingDataType4 != SharingDataType.ARTICLE) {
                sharingDataType = sharingDataType4;
                z = false;
            } else {
                SharingDataType sharingDataType5 = sharingDataType4;
                cbj0.c(this, sharingDataType5, article, str3, str2, bcj0Var, null, PsExtractor.AUDIO_STREAM);
                sharingDataType = sharingDataType5;
                z = true;
            }
        }
        if (!z) {
            Parcelable parcelable = this.U;
            if (parcelable instanceof Good) {
                Good good = (Good) parcelable;
                if (good == null || sharingDataType != SharingDataType.GOOD) {
                    z = false;
                } else {
                    SharingDataType sharingDataType6 = sharingDataType;
                    cbj0.c(this, sharingDataType6, good, str3, str2, bcj0Var, attachmentInfo != null ? Y1(attachmentInfo, actionsInfo) : null, 128);
                    sharingDataType = sharingDataType6;
                    z = true;
                }
            }
        }
        if (!z) {
            int i2 = this.Q.b;
            boolean z2 = (i2 & 1) > 0;
            if (((i2 & 4) > 0) && attachmentInfo != null && (sharingDataType == SharingDataType.ALBUM || sharingDataType == SharingDataType.LINK || sharingDataType == SharingDataType.MINI_APP || sharingDataType == SharingDataType.NARRATIVE || sharingDataType == SharingDataType.ARTIST)) {
                storySharingInfo = Y1(attachmentInfo, actionsInfo);
            }
            cbj0.e(this, str3, sharingDataType, z2, storySharingInfo, str2, null, bcj0Var);
        }
        this.v.a(AppShareType.OTHER);
    }
}
