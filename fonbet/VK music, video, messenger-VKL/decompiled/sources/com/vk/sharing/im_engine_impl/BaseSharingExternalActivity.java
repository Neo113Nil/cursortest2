package com.vk.sharing.im_engine_impl;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.video.VideoSave;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.metrics.eventtracking.Event;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.permission.PermissionHelper;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.BaseSharingActivity;
import com.vk.sharing.core.target.Targets;
import com.vk.sharing.core.view.IntentAction;
import com.vk.sharing.core.view.l;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.stories.StoryShareActivity;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.entity.attach.StoryEditorPhotoAlbumAttachment;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import com.vkontakte.android.activities.LogoutReceiver;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import defpackage.z;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.observable.u0;
import io.reactivex.rxjava3.internal.operators.observable.v1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.an6;
import xsna.ao8;
import xsna.asu0;
import xsna.bbr;
import xsna.bc6;
import xsna.bin0;
import xsna.bwt0;
import xsna.c70;
import xsna.cbj0;
import xsna.ccj0;
import xsna.cg1;
import xsna.cn6;
import xsna.cvk;
import xsna.dag0;
import xsna.dcj0;
import xsna.dhr0;
import xsna.dn6;
import xsna.ecj0;
import xsna.el3;
import xsna.en6;
import xsna.er;
import xsna.ev6;
import xsna.fkq0;
import xsna.fn6;
import xsna.g2v;
import xsna.g620;
import xsna.gl0;
import xsna.gv;
import xsna.gz80;
import xsna.h7u0;
import xsna.hlu0;
import xsna.hn6;
import xsna.hv;
import xsna.i0q0;
import xsna.i2w;
import xsna.in6;
import xsna.j5g;
import xsna.ji0;
import xsna.jlu0;
import xsna.jn6;
import xsna.kn6;
import xsna.l4o0;
import xsna.l7s;
import xsna.m340;
import xsna.mb;
import xsna.mn6;
import xsna.mui0;
import xsna.myc0;
import xsna.ner0;
import xsna.o0w;
import xsna.o25;
import xsna.ocw;
import xsna.pq9;
import xsna.rao;
import xsna.rok;
import xsna.s3q0;
import xsna.s5a;
import xsna.sok;
import xsna.t2i0;
import xsna.tok;
import xsna.tz;
import xsna.udm0;
import xsna.usi0;
import xsna.v16;
import xsna.v8k0;
import xsna.xa4;
import xsna.xm6;
import xsna.xwk;
import xsna.ym6;
import xsna.z74;
import xsna.ze6;
import xsna.zm6;

/* loaded from: classes5.dex */
public abstract class BaseSharingExternalActivity extends BaseSharingActivity implements rok {
    public static final /* synthetic */ int Z = 0;

    @Nullable
    public ze6 J;

    @Nullable
    public Bundle L;

    @Nullable
    public ecj0 P;

    @Nullable
    public l4o0 Q;

    @Nullable
    public ActionsInfo R;

    @Nullable
    public ccj0 T;

    @Nullable
    public v8k0 U;

    @Nullable
    public m340 V;

    @Nullable
    public Article W;

    @Nullable
    public MarketFavable X;
    public boolean G = true;
    public LogoutReceiver H = null;
    public boolean I = false;
    public final io.reactivex.rxjava3.disposables.b K = new io.reactivex.rxjava3.disposables.b();
    public boolean M = false;
    public Intent N = null;

    @Nullable
    public Targets O = new Targets();
    public io.reactivex.rxjava3.disposables.c S = EmptyDisposable.INSTANCE;
    public final sok Y = new sok(this);

    public final class SharedItems extends ArrayList<g> {
        public SharedItems() {
        }

        public static ArrayList a(SharedItems sharedItems) {
            ArrayList arrayList = new ArrayList();
            Iterator<g> it = sharedItems.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b);
            }
            return arrayList;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IntentAction.values().length];
            a = iArr;
            try {
                iArr[IntentAction.COPY_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IntentAction.MAKE_DUET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IntentAction.ADD_FAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IntentAction.REMOVE_FAVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IntentAction.SHARE_IN_STORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IntentAction.SHARE_TO_WALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IntentAction.SHARE_EXTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IntentAction.SHARE_TO_MESSAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IntentAction.SHARE_TO_ALBUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IntentAction.SHARE_TO_DOCS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IntentAction.ADD_TO_MY_VIDEOS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public final class b<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends h<T> {
        public final IntentAction[] i;

        public b(@NonNull MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, @Nullable String str, @NonNull ArrayList arrayList, @Nullable UserId userId, boolean z) {
            super(mobileOfficialAppsCoreNavStat$EventScreen, str, arrayList, userId, z);
            this.i = new IntentAction[]{IntentAction.SHARE_TO_WALL, IntentAction.SHARE_TO_MESSAGE};
        }

        @Override // xsna.ze6
        public final IntentAction[] a() {
            return this.i;
        }

        @Override // xsna.ze6
        public final void d(IntentAction intentAction) {
            int i = a.a[intentAction.ordinal()];
            if (i == 6) {
                l();
            } else {
                if (i != 8) {
                    return;
                }
                BaseSharingExternalActivity.b2(BaseSharingExternalActivity.this);
            }
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h, xsna.ze6
        public final void e(@NonNull PhotoAlbum photoAlbum) {
            throw new UnsupportedOperationException("Unsupported");
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.c
        public final void h(@NonNull UserId userId) {
            BaseSharingExternalActivity.this.K.b(j(IntentAction.SHARE_TO_MESSAGE).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new zm6(0, this, userId), new rao()));
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final l2 i(IntentAction intentAction) {
            return new q(new an6(this, intentAction)).r0(asu0.a.c());
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final String k() {
            return BaseSharingExternalActivity.this.getString(this.g ? R.string.sys_share_audio_multiple : R.string.sys_share_audio);
        }
    }

    public static abstract class c<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends ze6<T> {

        @Nullable
        public final UserId c;
        public final boolean d;

        public c(@Nullable UserId userId, @NonNull MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z) {
            super(mobileOfficialAppsCoreNavStat$EventScreen);
            this.c = userId;
            this.d = z;
        }

        @Override // xsna.ze6
        public final T c() {
            UserId userId = this.c;
            if (userId == null || this.d) {
                this.b = false;
                return g();
            }
            ocw.b.D(ocw.a, new gl0(com.vk.dto.common.a.a(userId)));
            h(userId);
            return this.a;
        }

        public abstract T g();

        public abstract void h(@NonNull UserId userId);
    }

    public final class d<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends h<T> {
        public final IntentAction[] i;

        public d(@NonNull MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, @Nullable String str, @NonNull ArrayList arrayList, @Nullable UserId userId, boolean z) {
            super(mobileOfficialAppsCoreNavStat$EventScreen, str, arrayList, userId, z);
            this.i = new IntentAction[]{IntentAction.SHARE_TO_WALL, IntentAction.SHARE_TO_DOCS, IntentAction.SHARE_TO_MESSAGE};
        }

        @Override // xsna.ze6
        public final IntentAction[] a() {
            return this.i;
        }

        @Override // xsna.ze6
        public final void d(IntentAction intentAction) {
            int i = a.a[intentAction.ordinal()];
            if (i == 6) {
                l();
                return;
            }
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            if (i == 8) {
                BaseSharingExternalActivity.b2(baseSharingExternalActivity);
            } else {
                if (i != 10) {
                    return;
                }
                BaseSharingExternalActivity.f2(baseSharingExternalActivity, this.f);
            }
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.c
        public final void h(@NonNull final UserId userId) {
            BaseSharingExternalActivity.this.K.b(j(IntentAction.SHARE_TO_MESSAGE).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.bn6
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    BaseSharingExternalActivity.d dVar = BaseSharingExternalActivity.d.this;
                    BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
                    String str = dVar.e;
                    BaseSharingExternalActivity.Q2(baseSharingExternalActivity, userId, str, (List) obj);
                }
            }, new rao()));
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final l2 i(IntentAction intentAction) {
            u0 O;
            IntentAction intentAction2 = IntentAction.SHARE_TO_WALL;
            ArrayList arrayList = this.f;
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            if (intentAction == intentAction2) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    int i = BaseSharingExternalActivity.Z;
                    String m = com.vk.core.files.a.m(baseSharingExternalActivity.i, uri);
                    String l = m == null ? null : com.vk.core.files.a.l(new File(m));
                    if (l == null) {
                        arrayList2.add(BaseSharingExternalActivity.Y1(baseSharingExternalActivity, uri));
                    } else if (l.startsWith("video")) {
                        arrayList2.add(BaseSharingExternalActivity.Z1(baseSharingExternalActivity, intentAction, uri));
                    } else if (l.startsWith("image")) {
                        arrayList2.add(new PendingPhotoAttachment(uri.toString()));
                    } else {
                        arrayList2.add(BaseSharingExternalActivity.Y1(baseSharingExternalActivity, uri));
                    }
                }
                O = io.reactivex.rxjava3.core.q.O(arrayList2);
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(BaseSharingExternalActivity.Y1(baseSharingExternalActivity, (Uri) it2.next()));
                }
                O = io.reactivex.rxjava3.core.q.O(arrayList3);
            }
            return O.r0(asu0.a.c());
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final String k() {
            return BaseSharingExternalActivity.this.getString(this.g ? R.string.sys_share_file_multiple : R.string.sys_share_file);
        }
    }

    public final class e<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends h<T> {
        public final IntentAction[] i;
        public final IntentAction[] j;
        public final boolean k;

        public e(@NonNull MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, @Nullable String str, @NonNull ArrayList arrayList, @Nullable UserId userId, boolean z, boolean z2) {
            super(mobileOfficialAppsCoreNavStat$EventScreen, str, arrayList, userId, z2);
            IntentAction intentAction = IntentAction.SHARE_IN_STORY;
            IntentAction intentAction2 = IntentAction.SHARE_TO_ALBUM;
            IntentAction intentAction3 = IntentAction.SHARE_TO_DOCS;
            this.i = new IntentAction[]{intentAction, intentAction2, intentAction3};
            this.j = new IntentAction[]{intentAction, IntentAction.SHARE_TO_WALL, intentAction2, intentAction3, IntentAction.SHARE_TO_MESSAGE};
            this.k = z;
        }

        @Override // xsna.ze6
        public final IntentAction[] a() {
            IntentAction[] intentActionArr = this.f.size() > 10 ? this.i : this.j;
            return !this.k ? (IntentAction[]) Arrays.stream(intentActionArr).filter(new dn6()).toArray(new en6()) : intentActionArr;
        }

        @Override // xsna.ze6
        public final void d(IntentAction intentAction) {
            int i = a.a[intentAction.ordinal()];
            ArrayList arrayList = this.f;
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            switch (i) {
                case 5:
                    BaseSharingExternalActivity.e2(baseSharingExternalActivity, arrayList, true);
                    break;
                case 6:
                    l();
                    break;
                case 8:
                    BaseSharingExternalActivity.b2(baseSharingExternalActivity);
                    break;
                case 9:
                    baseSharingExternalActivity.H3();
                    break;
                case 10:
                    BaseSharingExternalActivity.f2(baseSharingExternalActivity, arrayList);
                    break;
            }
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h, xsna.ze6
        public final void e(@NonNull PhotoAlbum photoAlbum) {
            int i;
            int i2;
            int i3;
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            ArrayList arrayList = this.f;
            int i4 = BaseSharingExternalActivity.Z;
            ArrayList arrayList2 = new ArrayList();
            UserId c = o25.a().c();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String uri = ((Uri) it.next()).toString();
                int i5 = photoAlbum.b;
                UserId userId = photoAlbum.c;
                arrayList2.add(i5 > 0 ? new com.vk.upload.impl.tasks.b(uri, c, i5, userId, "", true) : new com.vk.upload.impl.tasks.a(uri, c, i5, userId, "", true));
            }
            Uri parse = Uri.parse("vkontakte://" + a0a.d + "/album" + photoAlbum.c + BundleUtil.UNDERLINE_TAG + photoAlbum.b);
            if (arrayList2.size() > 1) {
                i = R.string.uploading_photo_multiple;
                i2 = R.string.photo_upload_ok_multiple;
                i3 = R.string.photo_upload_ok_multiple_long;
            } else {
                i = R.string.uploading_photo;
                i2 = R.string.photo_upload_ok;
                i3 = R.string.photo_upload_ok_long;
            }
            com.vk.upload.impl.a.i(baseSharingExternalActivity.S2(arrayList2, i, i2, i3, parse));
            baseSharingExternalActivity.P.a(AppShareType.OTHER);
            baseSharingExternalActivity.finish();
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.c
        public final void h(@NonNull UserId userId) {
            BaseSharingExternalActivity.this.K.b(j(IntentAction.SHARE_TO_MESSAGE).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cn6(0, this, userId), new rao()));
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final l2 i(IntentAction intentAction) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                int i = BaseSharingExternalActivity.Z;
                arrayList.add(new PendingPhotoAttachment(uri.toString()));
            }
            return io.reactivex.rxjava3.core.q.O(arrayList).r0(asu0.a.c());
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final String k() {
            return BaseSharingExternalActivity.this.getString(this.g ? R.string.sys_share_image_multiple : R.string.sys_share_image);
        }
    }

    public static final class f {
        public l4o0 a;
    }

    public static final class g {
        public final int a;
        public final Uri b;

        public g(int i, @NonNull Uri uri) {
            this.a = i;
            this.b = uri;
        }
    }

    public final class i<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends c<T> {
        public final IntentAction[] e;
        public final IntentAction[] f;
        public final IntentAction[] g;
        public final IntentAction[] h;
        public final IntentAction[] i;
        public final IntentAction[] j;
        public final IntentAction[] k;
        public final IntentAction[] l;
        public final IntentAction[] m;
        public final IntentAction[] n;
        public final IntentAction[] o;
        public final String p;
        public final SharingDataType q;
        public final boolean r;
        public final boolean s;
        public final String t;
        public final String u;
        public final LinkAttachment v;
        public final Boolean w;

        public class a implements DialogInterface.OnCancelListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                BaseSharingExternalActivity.this.finish();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                i iVar = i.this;
                iVar.d(iVar.a()[i]);
            }
        }

        public i(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str, String str2, UserId userId, SharingDataType sharingDataType, boolean z, boolean z2, boolean z3) {
            super(userId, mobileOfficialAppsCoreNavStat$EventScreen, z3);
            IntentAction intentAction = IntentAction.SHARE_TO_WALL;
            IntentAction intentAction2 = IntentAction.SHARE_TO_MESSAGE;
            this.e = new IntentAction[]{intentAction, intentAction2};
            this.f = new IntentAction[]{intentAction2};
            IntentAction intentAction3 = IntentAction.SHARE_IN_STORY;
            IntentAction intentAction4 = IntentAction.COPY_LINK;
            this.g = new IntentAction[]{intentAction3, intentAction4};
            this.h = new IntentAction[]{intentAction3, intentAction4, IntentAction.MAKE_DUET};
            IntentAction intentAction5 = IntentAction.ADD_FAVE;
            this.i = new IntentAction[]{intentAction3, intentAction5, intentAction4};
            IntentAction intentAction6 = IntentAction.REMOVE_FAVE;
            this.j = new IntentAction[]{intentAction3, intentAction6, intentAction4};
            this.k = new IntentAction[]{intentAction3, intentAction5, intentAction4};
            this.l = new IntentAction[]{intentAction3, intentAction6, intentAction4};
            this.m = new IntentAction[]{intentAction4};
            IntentAction intentAction7 = IntentAction.SHARE_EXTERNAL;
            this.n = new IntentAction[]{intentAction, intentAction2, intentAction7};
            this.o = new IntentAction[]{intentAction4, intentAction2, intentAction7};
            this.w = Boolean.valueOf(BaseSharingExternalActivity.this.getIntent().getBooleanExtra("_internal", false));
            this.p = str;
            this.q = sharingDataType;
            this.r = z;
            this.s = z2;
            if (xwk.d().a().g(str)) {
                this.t = BaseSharingExternalActivity.this.getString(R.string.sys_share_link);
                this.u = str2 == null ? "" : str2;
                this.v = new LinkAttachment(str, "", "");
            } else {
                this.t = BaseSharingExternalActivity.this.getString(R.string.sys_share_text);
                this.u = str;
                this.v = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x009a, code lost:
        
            if (xsna.o25.a().i().r != false) goto L43;
         */
        @Override // xsna.ze6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final IntentAction[] a() {
            IntentAction[] intentActionArr;
            Boolean bool = this.w;
            if (bool.booleanValue()) {
                intentActionArr = this.o;
            } else if (bool.booleanValue()) {
                intentActionArr = this.n;
            } else {
                SharingDataType sharingDataType = SharingDataType.PHOTO;
                IntentAction[] intentActionArr2 = this.g;
                IntentAction[] intentActionArr3 = this.m;
                SharingDataType sharingDataType2 = this.q;
                if (sharingDataType2 != sharingDataType && sharingDataType2 != SharingDataType.VIDEO && sharingDataType2 != SharingDataType.ALBUM && sharingDataType2 != SharingDataType.POLL && sharingDataType2 != SharingDataType.AUDIO && sharingDataType2 != SharingDataType.PLAYLIST && sharingDataType2 != SharingDataType.LINK && sharingDataType2 != SharingDataType.MINI_APP && sharingDataType2 != SharingDataType.NARRATIVE && sharingDataType2 != SharingDataType.ARTIST) {
                    if (sharingDataType2 != SharingDataType.DOCUMENT && sharingDataType2 != SharingDataType.CHAT_LINK) {
                        SharingDataType sharingDataType3 = SharingDataType.ARTICLE;
                        BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
                        if (sharingDataType2 == sharingDataType3) {
                            Article article = baseSharingExternalActivity.W;
                            if (article != null) {
                                intentActionArr = article.n ? this.j : this.i;
                            }
                            intentActionArr = intentActionArr2;
                        } else if (sharingDataType2 == SharingDataType.GOOD) {
                            MarketFavable marketFavable = baseSharingExternalActivity.X;
                            if (marketFavable != null) {
                                intentActionArr = marketFavable.f ? this.l : this.k;
                            }
                        } else {
                            intentActionArr = sharingDataType2 == SharingDataType.CLIP ? this.h : (sharingDataType2 == SharingDataType.COMMENT || sharingDataType2 != SharingDataType.POST) ? this.f : this.e;
                        }
                    }
                    intentActionArr = intentActionArr3;
                }
            }
            if (!this.r) {
                intentActionArr = (IntentAction[]) Arrays.stream(intentActionArr).filter(new hn6(0)).toArray(new in6());
            }
            return !this.s ? (IntentAction[]) Arrays.stream(intentActionArr).filter(new jn6()).toArray(new kn6(0)) : intentActionArr;
        }

        @Override // xsna.ze6
        public final String b() {
            return this.p;
        }

        @Override // xsna.ze6
        public final void d(IntentAction intentAction) {
            int i = a.a[intentAction.ordinal()];
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            switch (i) {
                case 1:
                    baseSharingExternalActivity.T1();
                    baseSharingExternalActivity.w.t1(null);
                    break;
                case 2:
                    baseSharingExternalActivity.r3();
                    break;
                case 3:
                case 4:
                    baseSharingExternalActivity.g3();
                    break;
                case 5:
                    baseSharingExternalActivity.u3();
                    break;
                case 6:
                    List<? extends Attachment> singletonList = Collections.singletonList(this.v);
                    int i2 = BaseSharingExternalActivity.Z;
                    baseSharingExternalActivity.M3(this.u, singletonList);
                    break;
                case 7:
                    int i3 = BaseSharingExternalActivity.Z;
                    baseSharingExternalActivity.getClass();
                    cbj0.a(baseSharingExternalActivity, this.p);
                    baseSharingExternalActivity.P.a(AppShareType.OTHER);
                    baseSharingExternalActivity.finish();
                    break;
                case 8:
                    BaseSharingExternalActivity.b2(baseSharingExternalActivity);
                    break;
            }
        }

        @Override // xsna.ze6
        public final void e(@NonNull PhotoAlbum photoAlbum) {
            throw new UnsupportedOperationException("Unsupported");
        }

        @Override // xsna.ze6
        public final void f(@NonNull UserId userId, String str) {
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            boolean z = baseSharingExternalActivity.G;
            String str2 = this.p;
            if (!z) {
                BaseSharingExternalActivity.Q2(baseSharingExternalActivity, userId, str2, null);
                return;
            }
            if (!myc0.f(str)) {
                str = str2;
            }
            BaseSharingExternalActivity.d2(baseSharingExternalActivity, userId, str, null);
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.c
        public final T g() {
            boolean z = this.d;
            T t = this.a;
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            if (z) {
                List<? extends Attachment> singletonList = Collections.singletonList(this.v);
                int i = BaseSharingExternalActivity.Z;
                baseSharingExternalActivity.M3(this.u, singletonList);
                return t;
            }
            h7u0.a aVar = new h7u0.a(baseSharingExternalActivity);
            aVar.h0(this.t);
            IntentAction[] a2 = a();
            String[] strArr = new String[a2.length];
            for (int i2 = 0; i2 < a2.length; i2++) {
                strArr[i2] = baseSharingExternalActivity.getString(a2[i2].h());
            }
            aVar.T(strArr, new b());
            aVar.a.n = new a();
            aVar.m();
            return t;
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.c
        public final void h(@NonNull UserId userId) {
            BaseSharingExternalActivity.Q2(BaseSharingExternalActivity.this, userId, this.p, null);
        }
    }

    public final class j<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends ze6<T> {
        @Override // xsna.ze6
        public final IntentAction[] a() {
            return null;
        }

        @Override // xsna.ze6
        public final T c() {
            cvk.u(R.string.share_unsupported, false);
            return this.a;
        }

        @Override // xsna.ze6
        public final void d(IntentAction intentAction) {
            throw new UnsupportedOperationException("Unsupported");
        }

        @Override // xsna.ze6
        public final void e(@NonNull PhotoAlbum photoAlbum) {
            throw new UnsupportedOperationException("Unsupported");
        }

        @Override // xsna.ze6
        public final void f(@NonNull UserId userId, String str) {
            throw new UnsupportedOperationException("Unsupported");
        }
    }

    public final class k<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends h<T> {
        public final IntentAction[] i;

        public k(@NonNull MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, @Nullable String str, @NonNull ArrayList arrayList, @Nullable UserId userId, boolean z) {
            super(mobileOfficialAppsCoreNavStat$EventScreen, str, arrayList, userId, z);
            this.i = new IntentAction[]{IntentAction.SHARE_IN_STORY, IntentAction.SHARE_TO_WALL, IntentAction.ADD_TO_MY_VIDEOS, IntentAction.SHARE_TO_MESSAGE, IntentAction.SHARE_TO_DOCS};
        }

        @Override // xsna.ze6
        public final IntentAction[] a() {
            return this.i;
        }

        @Override // xsna.ze6
        public final void d(IntentAction intentAction) {
            int i = a.a[intentAction.ordinal()];
            ArrayList arrayList = this.f;
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            if (i == 5) {
                BaseSharingExternalActivity.e2(baseSharingExternalActivity, arrayList, false);
                return;
            }
            if (i == 6) {
                l();
                return;
            }
            if (i == 8) {
                BaseSharingExternalActivity.b2(baseSharingExternalActivity);
            } else if (i == 10) {
                BaseSharingExternalActivity.f2(baseSharingExternalActivity, arrayList);
            } else {
                if (i != 11) {
                    return;
                }
                baseSharingExternalActivity.K.b(j(intentAction).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new z(this, 7), new rao()));
            }
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.c
        public final void h(@NonNull final UserId userId) {
            BaseSharingExternalActivity.this.K.b(j(IntentAction.SHARE_TO_MESSAGE).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.ln6
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    BaseSharingExternalActivity.k kVar = BaseSharingExternalActivity.k.this;
                    BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
                    String str = kVar.e;
                    BaseSharingExternalActivity.Q2(baseSharingExternalActivity, userId, str, (List) obj);
                }
            }, new rao()));
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final l2 i(IntentAction intentAction) {
            return new q(new mn6(this, intentAction)).r0(asu0.a.c());
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.h
        public final String k() {
            return BaseSharingExternalActivity.this.getString(this.g ? R.string.sys_share_video_multiple : R.string.sys_share_video);
        }
    }

    public static void Q2(BaseSharingExternalActivity baseSharingExternalActivity, UserId userId, String str, List list) {
        baseSharingExternalActivity.getClass();
        g2v.c().b().B(baseSharingExternalActivity, com.vk.dto.common.a.a(userId), str, list, baseSharingExternalActivity.getIntent().getStringExtra("android.intent.extra.shortcut.ID") != null ? "share_external_direct" : "share_external", "share", false);
        baseSharingExternalActivity.F3("message");
        baseSharingExternalActivity.finish();
    }

    public static PendingDocumentAttachment Y1(BaseSharingExternalActivity baseSharingExternalActivity, Uri uri) {
        String uri2 = uri.toString();
        return new PendingDocumentAttachment(com.vk.core.files.a.F(uri), uri2, ((dag0) com.vk.core.files.a.h.getValue()).a(uri), uri2, UserId.d, com.vk.upload.impl.a.d.getAndIncrement(), com.vk.core.files.a.E(uri));
    }

    public static PendingVideoAttachment Z1(BaseSharingExternalActivity baseSharingExternalActivity, IntentAction intentAction, Uri uri) {
        VideoFileOld videoFileOld = new VideoFileOld();
        HashMap hashMap = new HashMap();
        VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
        String uri2 = uri.toString();
        if (uri2 != null) {
            if (!myc0.f(uri2)) {
                uri2 = null;
            }
            if (uri2 != null) {
                VideoUrlStorage.b bVar = VideoUrlStorage.c;
                VideoUrlStorage.d.b(hashMap, videoUrl, uri2);
            }
        }
        videoFileOld.f = new VideoUrlStorage(hashMap);
        videoFileOld.c = com.vk.upload.impl.a.d.getAndIncrement();
        ThemableActivity themableActivity = baseSharingExternalActivity.i;
        MediaUtils.f c2 = MediaUtils.a.c(themableActivity, uri, false);
        if (c2 != null) {
            int i2 = c2.a;
            int i3 = c2.b;
            String str = c2.i;
            if (str == null) {
                String name = com.vk.core.files.a.i(themableActivity, uri).getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf < 0) {
                    lastIndexOf = name.length() - 1;
                }
                videoFileOld.l = name.substring(0, lastIndexOf);
            } else {
                videoFileOld.l = str;
            }
            videoFileOld.I0 = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(uri.toString(), i2, i3)));
            videoFileOld.e = c2.f / 1000;
            videoFileOld.m0 = i2;
            videoFileOld.n0 = i3;
        }
        PendingVideoAttachment pendingVideoAttachment = new PendingVideoAttachment(videoFileOld, intentAction == IntentAction.SHARE_TO_MESSAGE ? VideoSave.Target.MESSAGES : VideoSave.Target.VIDEO, o25.a().c());
        pendingVideoAttachment.s = videoFileOld.m0;
        pendingVideoAttachment.t = videoFileOld.n0;
        return pendingVideoAttachment;
    }

    public static void b2(BaseSharingExternalActivity baseSharingExternalActivity) {
        baseSharingExternalActivity.getClass();
        g2v.c().b().W(xa4.L(baseSharingExternalActivity), new Bundle(), false);
    }

    public static void d2(BaseSharingExternalActivity baseSharingExternalActivity, UserId userId, String str, List list) {
        baseSharingExternalActivity.getClass();
        if (str != null) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                int codePointAt = str.codePointAt(i2);
                if (!Character.isWhitespace(codePointAt)) {
                    break;
                } else {
                    i2 += Character.charCount(codePointAt);
                }
            }
        }
        if (list == null || list.isEmpty()) {
            cvk.u(R.string.vkim_message_send_failed, false);
            return;
        }
        g2v.c().b().n(baseSharingExternalActivity, userId, str, list, "share_external", new defpackage.g(userId, 12));
        baseSharingExternalActivity.P.a(AppShareType.MESSAGE);
        baseSharingExternalActivity.F3("message");
    }

    public static void e2(BaseSharingExternalActivity baseSharingExternalActivity, ArrayList arrayList, final boolean z) {
        List<StoryCameraGalleryData> list = (List) arrayList.stream().map(new Function() { // from class: xsna.wm6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = BaseSharingExternalActivity.Z;
                return new StoryCameraGalleryData((Uri) obj, z, false, false);
            }
        }).collect(Collectors.toList());
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(SchemeStat$TypeNavgo.Subtype.SYSTEM.name().toLowerCase(), MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.SYSTEM_SHARING);
        aVar.G = list;
        baseSharingExternalActivity.P.a(AppShareType.STORY);
        baseSharingExternalActivity.w.t1(new cg1(2, baseSharingExternalActivity, aVar));
    }

    public static void f2(BaseSharingExternalActivity baseSharingExternalActivity, ArrayList arrayList) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.vk.upload.impl.tasks.i(((Uri) it.next()).toString(), o25.a().c(), false, false));
        }
        if (arrayList2.size() > 1) {
            i2 = R.string.uploading_document_multiple;
            i3 = R.string.doc_upload_ok_multiple;
            i4 = R.string.doc_upload_ok_multiple_long;
        } else {
            i2 = R.string.uploading_document;
            i3 = R.string.doc_upload_ok;
            i4 = R.string.doc_upload_ok_long;
        }
        int i5 = i4;
        com.vk.upload.impl.a.i(baseSharingExternalActivity.S2(arrayList2, i2, i3, i5, Uri.parse("vkontakte://" + a0a.d + "/docs" + o25.a().c())));
        baseSharingExternalActivity.P.a(AppShareType.OTHER);
        baseSharingExternalActivity.finish();
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void B3(Target target, pq9 pq9Var) {
        if (this.T == null) {
            this.T = new ccj0(this.i, i2w.a());
        }
        this.T.a(target, pq9Var);
    }

    public final void F3(String str) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("CRUCIAL.SHARE");
        aVar.c("type", str);
        aVar.a(Boolean.valueOf(this.I), "direct_share");
        aVar.a(Boolean.valueOf(gz80.a(23)), "has_direct_share");
        bVar.k(aVar.e());
    }

    public abstract void G3(@Nullable String str, @Nullable List<? extends Attachment> list);

    public abstract void H3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, android.content.Context, androidx.activity.ComponentActivity, androidx.appcompat.app.AppCompatActivity, com.vk.pushes.PushAwareActivity, com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a$a, com.vk.sharing.core.view.l$a, com.vk.sharing.im_engine_impl.BaseSharingExternalActivity, com.vkontakte.android.VKActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.util.List] */
    public final void J3() {
        mui0 J2;
        List<usi0> g2;
        hlu0 experiments;
        ?? arrayList;
        Intent intent = getIntent();
        int i2 = 0;
        if ((intent.getFlags() & 1) == 1 && getIntent().hasExtra("android.intent.extra.STREAM")) {
            if (getIntent().hasExtra("android.intent.extra.STREAM")) {
                arrayList = new ArrayList();
                if ("android.intent.action.SEND".equals(getIntent().getAction())) {
                    Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                } else if ("android.intent.action.SEND_MULTIPLE".equals(getIntent().getAction())) {
                    ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (parcelableArrayListExtra == null) {
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        Iterator it = parcelableArrayListExtra.iterator();
                        while (it.hasNext()) {
                            Parcelable parcelable = (Parcelable) it.next();
                            if (parcelable != null) {
                                arrayList.add((Uri) parcelable);
                            }
                        }
                    }
                }
            } else {
                arrayList = Collections.EMPTY_LIST;
            }
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Uri uri2 = (Uri) it2.next();
                        if (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(uri2.getScheme()) || !com.vk.core.files.a.c.b(uri2)) {
                            break;
                        }
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : arrayList) {
                            String authority = ((Uri) obj).getAuthority();
                            if (authority != null && authority.contains("@")) {
                                authority = authority.substring(authority.indexOf("@") + 1);
                            }
                            Object obj2 = linkedHashMap.get(authority);
                            if (obj2 == null) {
                                obj2 = s5a.a(authority, linkedHashMap);
                            }
                            ((List) obj2).add(obj);
                        }
                        Set entrySet = linkedHashMap.entrySet();
                        if (entrySet.size() > 0) {
                            L.G("Uris have more than one authority!");
                        }
                        if (entrySet.size() <= 0) {
                            return;
                        }
                        Map.Entry entry = (Map.Entry) j5g.X(entrySet);
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        ProviderInfo resolveContentProvider = getPackageManager().resolveContentProvider(str, 0);
                        if (resolveContentProvider != null) {
                            boolean z = resolveContentProvider.readPermission == null || getPackageManager().checkPermission(resolveContentProvider.readPermission, getPackageName()) == 0;
                            if (!resolveContentProvider.exported || !z) {
                                ym6 ym6Var = new ym6(this, new ner0(this));
                                Regex regex = com.vk.core.files.a.a;
                                String string = ym6Var.b.getString(R.string.loading);
                                ner0 ner0Var = ym6Var.a;
                                ner0Var.setMessage(string);
                                ner0Var.show();
                                asu0.a.getClass();
                                asu0.h().execute(new bbr(list, this, ym6Var, i2));
                                return;
                            }
                        }
                    }
                }
            }
        }
        ze6 T2 = T2(intent);
        this.J = T2;
        if (!(T2 instanceof j)) {
            if (this.G) {
                FrameLayout frameLayout = new FrameLayout(this);
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setOnClickListener(new v16(this, 2));
                frameLayout.setId(R.id.fragment_wrapper);
                l7s u = getIntent().getBooleanExtra("force_dark_theme", false) ? bwt0.u(this) : this;
                gv gvVar = new gv(this, 5);
                if (this.D == null) {
                    this.D = W1().F2();
                }
                this.D.getClass();
                m340 U2 = U2();
                Intent intent2 = getIntent();
                VkClientMultiAccountComponent b2 = U2.b();
                boolean z2 = (b2 == null || (experiments = b2.getExperiments()) == null || !experiments.a()) ? false : true;
                SessionManagementComponent a2 = U2.a();
                boolean z3 = (a2 == null || (J2 = a2.J2()) == null || (g2 = J2.g()) == null || g2.size() <= 1) ? false : true;
                Bundle extras = intent2.getExtras();
                com.vk.sharing.core.view.f fVar = new com.vk.sharing.core.view.f(u, true, gvVar, null, true, (z2 && z3) || (extras != null && extras.getBoolean("feature_has_been_shown", false)), Boolean.FALSE);
                this.w = fVar;
                frameLayout.addView(fVar);
                setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                c70.b bVar = new c70.b();
                bVar.t = this.J;
                ActionsInfo b3 = bVar.b();
                f fVar2 = (f) getLastCustomNonConfigurationInstance();
                if (fVar2 == null) {
                    dcj0 V1 = V1();
                    if (this.E == null) {
                        this.E = W1().jc();
                    }
                    this.Q = new l4o0(true, V1, this.E);
                } else {
                    this.Q = fVar2.a;
                }
                this.w.E1(b3, this.J, 0);
                this.R = b3;
                this.x = new pq9(this.w, new bin0() { // from class: xsna.vm6
                    @Override // xsna.bin0
                    public final Object get() {
                        int i3 = BaseSharingExternalActivity.Z;
                        BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
                        return new Pair(baseSharingExternalActivity.y, baseSharingExternalActivity.P);
                    }
                });
                Bundle bundle = this.L;
                if (bundle == null) {
                    this.P = new ecj0();
                    this.y = new com.vk.sharing.core.b(this, true, null, null);
                } else {
                    this.O = (Targets) bundle.getParcelable("STATE_TARGETS");
                    this.P = new ecj0(this.L);
                    com.vk.sharing.core.a b4 = com.vk.sharing.core.f.b(this, this.L.getInt("STATE_DELEGATE"));
                    this.y = b4;
                    b4.b();
                    this.x.e(this.L);
                    this.w.h0(true);
                }
                com.vk.sharing.core.a.j = false;
                this.w.setPresenter(this);
                this.w.setDelegatePresenter(this.y);
                this.Q.h = this;
                this.r = false;
                this.S = V1().a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hv(this, 4));
            } else {
                UiTracker.e.b(new UiTrackingScreen(T2.c()));
            }
        }
        if (this.J.b) {
            if (!this.G || (this.J instanceof j)) {
                finish();
            }
        }
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void K2(@NonNull Target target, int i2) {
        ecj0 ecj0Var = this.P;
        if (ecj0Var != null) {
            ecj0Var.d(target.c);
        }
        this.y.K2(target, i2);
    }

    public abstract void K3();

    public final void M3(@Nullable String str, @Nullable List<? extends Attachment> list) {
        G3(str, list);
        ecj0 ecj0Var = this.P;
        if (ecj0Var != null) {
            ecj0Var.a(AppShareType.WALL);
        }
        finish();
        F3("wall");
    }

    @Override // xsna.rok
    @Nullable
    public final tok R() {
        return this.Y;
    }

    public abstract Intent R2();

    public final ev6 S2(@NonNull ArrayList arrayList, int i2, int i3, int i4, @NonNull Uri uri) {
        ev6 ev6Var = new ev6(arrayList, getString(i2));
        com.vk.upload.impl.a.g(ev6Var, new UploadNotification.a(t2i0.a(this, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri), 33554432), getString(i3), getString(i4)));
        return ev6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ze6 T2(@NonNull Intent intent) {
        UserId userId;
        ze6 bVar;
        boolean equals = "sharing_external_wall_post_shortcut".equals(getIntent().getStringExtra("android.intent.extra.shortcut.ID"));
        String stringExtra = getIntent().getStringExtra("android.intent.extra.shortcut.ID");
        if (!equals && stringExtra != null) {
            try {
                userId = new UserId(Long.parseLong(stringExtra));
            } catch (NumberFormatException unused) {
            }
            int i2 = 0;
            if (intent.hasExtra("android.intent.extra.STREAM")) {
                if (!intent.hasExtra("android.intent.extra.TEXT")) {
                    return new j(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE);
                }
                String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                String str = stringExtra2;
                SharingDataType sharingDataType = SharingDataType.OTHER;
                int intExtra = intent.getIntExtra("extra_data_type", sharingDataType.ordinal());
                SharingDataType.Companion.getClass();
                SharingDataType sharingDataType2 = (SharingDataType) j5g.b0(intExtra, SharingDataType.h());
                if (sharingDataType2 != null) {
                    sharingDataType = sharingDataType2;
                }
                return new i(equals ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING : MobileOfficialAppsCoreNavStat$EventScreen.DIALOG, str, intent.getStringExtra("android.intent.extra.SUBJECT"), userId, sharingDataType, intent.getBooleanExtra("extra_can_post_user_wall", true), intent.getBooleanExtra("extra_can_post_story", false), equals);
            }
            boolean booleanExtra = intent.getBooleanExtra("extra_can_post_story", true);
            String action = intent.getAction();
            SharedItems sharedItems = new SharedItems();
            if ("android.intent.action.SEND_MULTIPLE".equals(action)) {
                ArrayList<Uri> parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra == null) {
                    return new j(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE);
                }
                for (Uri uri : parcelableArrayListExtra) {
                    if (!com.vk.core.files.a.c.b(uri)) {
                        return new j(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE);
                    }
                    sharedItems.add(new g(com.vk.core.files.a.G(uri), uri));
                }
            } else if ("android.intent.action.SEND".equals(action)) {
                Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                if (uri2 == null || !com.vk.core.files.a.c.b(uri2)) {
                    return new j(MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE);
                }
                sharedItems.add(new g(com.vk.core.files.a.G(uri2), uri2));
            }
            String stringExtra3 = intent.getStringExtra("android.intent.extra.TEXT");
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = equals ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING : MobileOfficialAppsCoreNavStat$EventScreen.DIALOG;
            if (!sharedItems.isEmpty()) {
                Iterator<g> it = sharedItems.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g next = it.next();
                    if (i2 != 0) {
                        if (i2 != next.a) {
                            i2 = 4;
                            break;
                        }
                    } else {
                        i2 = next.a;
                    }
                }
            }
            if (i2 == 1) {
                bVar = new b(mobileOfficialAppsCoreNavStat$EventScreen, stringExtra3, SharedItems.a(sharedItems), userId, equals);
            } else if (i2 == 2) {
                bVar = new e(mobileOfficialAppsCoreNavStat$EventScreen, stringExtra3, SharedItems.a(sharedItems), userId, booleanExtra, equals);
            } else if (i2 == 3) {
                bVar = new k(mobileOfficialAppsCoreNavStat$EventScreen, stringExtra3, SharedItems.a(sharedItems), userId, equals);
            } else {
                if (i2 != 4) {
                    UiTracker uiTracker = UiTracker.a;
                    return new j(UiTracker.c());
                }
                bVar = new d(mobileOfficialAppsCoreNavStat$EventScreen, stringExtra3, SharedItems.a(sharedItems), userId, equals);
            }
            return bVar;
        }
        userId = null;
        int i22 = 0;
        if (intent.hasExtra("android.intent.extra.STREAM")) {
        }
    }

    @NonNull
    public final m340 U2() {
        if (this.V == null) {
            this.V = new m340(new WeakReference(this));
        }
        return this.V;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity
    public final void X1(UserId userId, boolean z) {
        ze6 ze6Var = this.J;
        if (ze6Var != null) {
            ze6Var.f(userId, this.w.getCommentText());
        }
    }

    public final void X2() {
        Intent intent = getIntent();
        this.N = intent;
        if (intent.hasExtra("extra_article")) {
            byte[] byteArrayExtra = this.N.getByteArrayExtra("extra_article");
            ClassLoader classLoader = Article.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            this.W = (Article) Serializer.b.a(byteArrayExtra, classLoader);
        }
        if (this.N.hasExtra("extra_good")) {
            byte[] byteArrayExtra2 = this.N.getByteArrayExtra("extra_good");
            ClassLoader classLoader2 = Good.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
            this.X = ao8.s((Good) Serializer.b.a(byteArrayExtra2, classLoader2));
        }
        if (!fkq0.c(o25.a().c())) {
            startActivityForResult(R2(), 100);
            return;
        }
        if (!getIntent().hasExtra("android.intent.extra.STREAM")) {
            J3();
        } else {
            if (gz80.a(34)) {
                J3();
                return;
            }
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.h(permissionHelper, this, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new ji0(this, 8), new mb(this, 10), 64);
        }
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void b3(@NonNull String str, @NonNull List<Target> list, boolean z) {
        ze6 ze6Var;
        if (list.isEmpty() || list.get(0) == null || (ze6Var = this.J) == null) {
            return;
        }
        ze6Var.f(list.get(0).c, str);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final ActionsInfo d3() {
        return this.R;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final boolean e3() {
        return false;
    }

    @Override // android.app.Activity
    public final void finish() {
        ecj0 ecj0Var = this.P;
        if (ecj0Var != null) {
            setResult(!ecj0Var.e.isEmpty() ? -1 : 0, this.P.b());
        } else {
            setResult(0, null);
        }
        super.finish();
        io.reactivex.rxjava3.disposables.c cVar = this.S;
        if (cVar != null) {
            cVar.dispose();
            this.S = null;
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void g3() {
        com.vk.sharing.core.a aVar;
        getIntent();
        com.vk.sharing.core.view.f fVar = this.w;
        if (fVar == null || (aVar = this.y) == null) {
            return;
        }
        Article article = this.W;
        ThemableActivity themableActivity = this.i;
        if (article != null) {
            com.vk.sharing.core.g.a(themableActivity, article, null, fVar, aVar);
        } else {
            MarketFavable marketFavable = this.X;
            if (marketFavable != null) {
                com.vk.sharing.core.g.b(themableActivity, marketFavable, null, fVar, aVar);
            }
        }
        this.P.a(AppShareType.OTHER);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final Targets getTargets() {
        return this.O;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final l getView() {
        return this.w;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a, com.vk.sharing.core.view.l.a
    public final boolean h(Target target) {
        ecj0 ecj0Var = this.P;
        return (ecj0Var != null ? Boolean.valueOf(ecj0Var.d.contains(target)) : null).booleanValue();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void l2(@NonNull Target target, int i2, boolean z) {
        this.y.l2(target, i2, z);
        ecj0 ecj0Var = this.P;
        HashSet hashSet = ecj0Var.d;
        target.g = z;
        if (z) {
            hashSet.add(target);
        } else {
            ecj0Var.d(target.c);
        }
        hashSet.size();
        this.w.D0(i2);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void n3() {
        bc6 L = xa4.L(this);
        o0w b2 = g2v.c().b();
        ThemableActivity themableActivity = this.i;
        String string = themableActivity.getString(R.string.sharing_create_chat_title);
        String string2 = themableActivity.getString(R.string.sharing_create_chat_confirm);
        List<Long> list = Collections.EMPTY_LIST;
        b2.c(L, 21804, string, string2, list, list, "share_to_new_chat");
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void o2() {
        jlu0 a2;
        BaseSharingExternalActivity baseSharingExternalActivity;
        m340 U2 = U2();
        VkClientMultiAccountComponent b2 = U2.b();
        if (b2 == null || (a2 = b2.a()) == null || (baseSharingExternalActivity = U2.a.get()) == null) {
            return;
        }
        a2.j(baseSharingExternalActivity.getSupportFragmentManager(), MultiAccountEntryPoint.Sharing.d, SwitcherLaunchMode.DefaultMode.b, SwitcherUiMode.EcoplateRestricted.b);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @NonNull
    public final l4o0 o3() {
        return this.Q;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 != -1) {
            finish();
            return;
        }
        if (i2 == 100) {
            J3();
            return;
        }
        String str = null;
        str = null;
        if (i2 == 101) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("images");
            if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                str = stringArrayListExtra.get(0);
            }
            M3(getIntent().getStringExtra("android.intent.extra.TEXT"), TextUtils.isEmpty(str) ? Collections.EMPTY_LIST : Collections.singletonList(new PendingPhotoAttachment(str)));
            return;
        }
        if (i2 != 103) {
            if (i2 != 201) {
                finish();
                return;
            } else {
                this.J.f(com.vk.dto.common.a.b((Peer) intent.getParcelableExtra("dialog_id")), "");
                return;
            }
        }
        PhotoAlbum photoAlbum = intent != null ? (PhotoAlbum) intent.getParcelableExtra("album") : null;
        if (photoAlbum != null) {
            this.J.e(photoAlbum);
        } else {
            cvk.w(this.i.getString(R.string.general_error_description), false);
            finish();
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        com.vk.sharing.core.view.f fVar;
        if (!this.G || (fVar = this.w) == null) {
            super.onBackPressed();
        } else {
            fVar.B1();
        }
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        mui0 J2;
        overridePendingTransition(0, 0);
        boolean z = getIntent().getStringExtra("android.intent.extra.shortcut.ID") != null;
        this.I = z;
        if (z || (this instanceof StoryShareActivity)) {
            this.G = false;
        }
        setTheme(dhr0.L() ? R.style.TranslucentStyle : R.style.TranslucentStyleDark);
        super.onCreate(bundle);
        this.L = bundle;
        if (this.G) {
            Window window = getWindow();
            if (getIntent().getBooleanExtra("fullscreen", false)) {
                window.getDecorView().setSystemUiVisibility(4);
            }
            boolean z2 = dhr0.C().b;
            int i2 = R.style.Theme_App_TransparentMilkDark;
            int i3 = z2 ? R.style.Theme_App_TransparentMilk : 2132018221;
            if (!getIntent().getBooleanExtra("force_dark_theme", false)) {
                i2 = i3;
            }
            setTheme(i2);
            getWindow().setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (getIntent().getBooleanExtra("force_dark_theme", false)) {
                dhr0.u0(getWindow(), NavigationBarStyle.DARK);
            } else {
                dhr0.r0(this);
            }
        }
        o25.a().N();
        this.H = LogoutReceiver.a(this);
        v8k0 v8k0Var = new v8k0(this, i2w.a());
        this.U = v8k0Var;
        v8k0Var.a();
        m340 U2 = U2();
        SessionManagementComponent a2 = U2.a();
        if (a2 != null && (J2 = a2.J2()) != null) {
            J2.f(U2.g);
        }
        X2();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        mui0 J2;
        this.H.b();
        this.K.dispose();
        m340 U2 = U2();
        SessionManagementComponent a2 = U2.a();
        if (a2 != null && (J2 = a2.J2()) != null) {
            J2.k(U2.g);
        }
        i0q0.g(U2.f);
        io.reactivex.rxjava3.disposables.c cVar = U2.e;
        if (cVar != null) {
            cVar.dispose();
        }
        U2.e = null;
        v8k0 v8k0Var = this.U;
        if (v8k0Var != null) {
            io.reactivex.rxjava3.disposables.c cVar2 = v8k0Var.c;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            v8k0Var.c = null;
        }
        l4o0 l4o0Var = this.Q;
        if (l4o0Var != null) {
            l4o0Var.h = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        X2();
    }

    @Override // com.vk.core.activity.BaseActivity, android.app.Activity
    public final void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Intent intent = (Intent) bundle.getParcelable("STATE_INTENT_KEY");
        if (intent != null) {
            setIntent(intent);
            J3();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        K3();
        super.onResume();
        this.M = false;
    }

    @Override // androidx.activity.ComponentActivity
    public final Object onRetainCustomNonConfigurationInstance() {
        f fVar = new f();
        fVar.a = this.Q;
        return fVar;
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("STATE_TARGETS", this.O);
        com.vk.sharing.core.a aVar = this.y;
        if (aVar != null) {
            bundle.putInt("STATE_DELEGATE", com.vk.sharing.core.f.a(aVar));
        }
        ecj0 ecj0Var = this.P;
        if (ecj0Var != null) {
            ecj0Var.c(bundle);
        }
        bundle.putParcelable("STATE_INTENT_KEY", getIntent());
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void r3() {
        Intent intent = getIntent();
        if (intent.hasExtra("extra_clip")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("extra_clip");
            ClassLoader classLoader = ClipVideoFile.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            g620.f().i(this, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS.name(), MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_DUET_MAKE, null, null, null, (ClipVideoFile) Serializer.b.a(byteArrayExtra, classLoader), null, 0, null);
        }
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void u2(@NonNull Target target, int i2, @Nullable String str) {
        this.P.d.add(target);
        this.y.u2(target, i2, str);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity, com.vk.sharing.core.a.InterfaceC1778a
    public final void u3() {
        byte[] byteArrayExtra;
        StorySharingInfo storySharingInfo;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("extra_entry_point");
        if (stringExtra == null) {
            return;
        }
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.SHARE, stringExtra);
        aVar.g = xa4.t();
        int i2 = 0;
        if (intent.hasExtra("extra_photo")) {
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("extra_photo");
            ClassLoader classLoader = Image.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            Photo photo = new Photo((Image) Serializer.b.a(byteArrayExtra2, classLoader));
            if (intent.hasExtra("extra_story_sharing_info") && (storySharingInfo = (StorySharingInfo) Serializer.b.a(intent.getByteArrayExtra("extra_story_sharing_info"), StorySharingInfo.class.getClassLoader())) != null) {
                Long l = storySharingInfo.c;
                if (l != null) {
                    photo.e = new UserId(l.longValue());
                }
                Long l2 = storySharingInfo.d;
                if (l2 != null) {
                    photo.c = (int) l2.longValue();
                }
                String str = storySharingInfo.e;
                if (str != null) {
                    photo.v = str;
                }
            }
            aVar.J = photo;
            aVar.U = false;
        } else if (intent.hasExtra("extra_story_sharing_info")) {
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("extra_story_sharing_info");
            ClassLoader classLoader2 = StorySharingInfo.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
            aVar.i = (StorySharingInfo) Serializer.b.a(byteArrayExtra3, classLoader2);
        } else if (intent.hasExtra("extra_poll")) {
            byte[] byteArrayExtra4 = intent.getByteArrayExtra("extra_poll");
            ClassLoader classLoader3 = Poll.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
            StoryCameraParams.a.p(aVar, (Poll) Serializer.b.a(byteArrayExtra4, classLoader3));
        } else if (intent.hasExtra("extra_audio")) {
            byte[] byteArrayExtra5 = intent.getByteArrayExtra("extra_audio");
            ClassLoader classLoader4 = MusicTrack.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
            MusicTrack musicTrack = (MusicTrack) Serializer.b.a(byteArrayExtra5, classLoader4);
            aVar.W = false;
            aVar.k0 = musicTrack;
        } else if (intent.hasExtra("extra_playlist")) {
            byte[] byteArrayExtra6 = intent.getByteArrayExtra("extra_playlist");
            ClassLoader classLoader5 = Playlist.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
            Playlist playlist = (Playlist) Serializer.b.a(byteArrayExtra6, classLoader5);
            aVar.W = false;
            AttachmentInfo h2 = z74.h(playlist);
            Attachment attachment = (Attachment) h2.f.getParcelable("attachments");
            int i3 = h2.b;
            aVar.i = new StorySharingInfo(h2.b, Long.valueOf(h2.c), Long.valueOf(h2.d), h2.e, z74.l(h2, null), udm0.b(i3, attachment), udm0.a(i3, attachment), udm0.c(i3, attachment, false), true, true);
            aVar.q0 = playlist;
        } else if (intent.hasExtra("extra_clip")) {
            byte[] byteArrayExtra7 = intent.getByteArrayExtra("extra_clip");
            ClassLoader classLoader6 = ClipVideoFile.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap6 = Serializer.a;
            aVar.r0 = (ClipVideoFile) Serializer.b.a(byteArrayExtra7, classLoader6);
        } else if (intent.hasExtra("extra_album") && (byteArrayExtra = intent.getByteArrayExtra("extra_album")) != null) {
            ClassLoader classLoader7 = AlbumAttachment.class.getClassLoader();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap7 = Serializer.a;
            AlbumAttachment albumAttachment = (AlbumAttachment) Serializer.b.a(byteArrayExtra, classLoader7);
            if (albumAttachment != null) {
                Photo photo2 = albumAttachment.l;
                String str2 = albumAttachment.z;
                if (str2 == null) {
                    str2 = "";
                }
                aVar.A0 = new StoryEditorPhotoAlbumAttachment(photo2, null, true, str2, albumAttachment.y);
                aVar.U = false;
                aVar.n0 = true;
            }
        }
        this.P.a(AppShareType.STORY);
        this.w.t1(new xm6(i2, this, aVar));
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void x3(@NonNull Target target) {
        if (this.M) {
            return;
        }
        this.M = true;
        o0w b2 = g2v.c().b();
        UserId userId = target.c;
        Dialog dialog = target.i;
        b2.t(this, userId.b, dialog != null ? new DialogExt(dialog) : null, "share_external_additional", "unknown");
    }

    public abstract class h<T extends MobileOfficialAppsCoreNavStat$EventScreen> extends c<T> {

        @Nullable
        public final String e;

        @NonNull
        public final ArrayList f;
        public final boolean g;

        public class a implements DialogInterface.OnCancelListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                BaseSharingExternalActivity.this.finish();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                h hVar = h.this;
                hVar.d(hVar.a()[i]);
            }
        }

        public h(@NonNull MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, @Nullable String str, @NonNull ArrayList arrayList, @Nullable UserId userId, boolean z) {
            super(userId, mobileOfficialAppsCoreNavStat$EventScreen, z);
            this.e = str;
            this.f = arrayList;
            this.g = arrayList.size() > 1;
        }

        @Override // xsna.ze6
        public void f(@NonNull final UserId userId, String str) {
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            io.reactivex.rxjava3.disposables.b bVar = baseSharingExternalActivity.K;
            if (baseSharingExternalActivity.G) {
                bVar.b(j(IntentAction.SHARE_TO_MESSAGE).l(new er(5)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fn6(0, userId, this, str), new rao()));
            } else {
                bVar.b(j(IntentAction.SHARE_TO_MESSAGE).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.gn6
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        BaseSharingExternalActivity.h hVar = BaseSharingExternalActivity.h.this;
                        BaseSharingExternalActivity baseSharingExternalActivity2 = BaseSharingExternalActivity.this;
                        String str2 = hVar.e;
                        BaseSharingExternalActivity.Q2(baseSharingExternalActivity2, userId, str2, (List) obj);
                    }
                }, new rao()));
            }
        }

        @Override // com.vk.sharing.im_engine_impl.BaseSharingExternalActivity.c
        public final T g() {
            boolean z = this.d;
            T t = this.a;
            if (z) {
                l();
                return t;
            }
            BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
            h7u0.a aVar = new h7u0.a(baseSharingExternalActivity);
            aVar.h0(k());
            IntentAction[] a2 = a();
            String[] strArr = new String[a2.length];
            for (int i = 0; i < a2.length; i++) {
                strArr[i] = baseSharingExternalActivity.getString(a2[i].h());
            }
            aVar.T(strArr, new b());
            aVar.a.n = new a();
            aVar.m();
            return t;
        }

        public abstract l2 i(IntentAction intentAction);

        public final v1 j(IntentAction intentAction) {
            return i(intentAction).f0(new LinkedList(), new com.vk.movika.sdk.android.defaultplayer.view.a(6));
        }

        public abstract String k();

        public final void l() {
            BaseSharingExternalActivity.this.K.b(j(IntentAction.SHARE_TO_WALL).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tz(this, 5), new rao()));
        }

        @Override // xsna.ze6
        public void e(@NonNull PhotoAlbum photoAlbum) {
        }
    }
}
