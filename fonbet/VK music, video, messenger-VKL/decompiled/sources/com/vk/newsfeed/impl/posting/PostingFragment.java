package com.vk.newsfeed.impl.posting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.C4504q2;
import com.vk.api.base.Document;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Copyright;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.internal.api.GsonHolder;
import com.vk.lists.c;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.impl.posting.dto.CommentNewsEntry;
import com.vk.newsfeed.impl.posting.newposter.NewPosterResult;
import com.vk.newsfeed.impl.posting.viewpresenter.ImPostingConfig;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.richcontent.api.MimeType;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingContext;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import com.vkontakte.android.VKActivity;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.l;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.onelog.NetworkClass;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.a960;
import xsna.ag20;
import xsna.asu0;
import xsna.b25;
import xsna.b94;
import xsna.be50;
import xsna.bfc0;
import xsna.bll;
import xsna.bpn0;
import xsna.bws;
import xsna.c120;
import xsna.c2c0;
import xsna.c3v;
import xsna.c5g;
import xsna.clc0;
import xsna.cn70;
import xsna.cra;
import xsna.cvk;
import xsna.d02;
import xsna.d750;
import xsna.d810;
import xsna.dfu;
import xsna.dh40;
import xsna.di60;
import xsna.dmc0;
import xsna.drm0;
import xsna.e0;
import xsna.e3j0;
import xsna.e3m;
import xsna.e43;
import xsna.em6;
import xsna.epx;
import xsna.f3j0;
import xsna.f4m;
import xsna.f550;
import xsna.f880;
import xsna.fhc0;
import xsna.fhi;
import xsna.fkq0;
import xsna.fnj;
import xsna.fr20;
import xsna.g420;
import xsna.g760;
import xsna.gd70;
import xsna.ghc0;
import xsna.gz80;
import xsna.gzn;
import xsna.ha20;
import xsna.hb40;
import xsna.hd60;
import xsna.hdc0;
import xsna.hg1;
import xsna.hhc0;
import xsna.hr80;
import xsna.i440;
import xsna.i5g;
import xsna.iah0;
import xsna.ies;
import xsna.ikc0;
import xsna.irt;
import xsna.iwg0;
import xsna.j0u0;
import xsna.j5d0;
import xsna.j5g;
import xsna.jbc0;
import xsna.jk6;
import xsna.jko0;
import xsna.juz;
import xsna.krv0;
import xsna.kwg0;
import xsna.l8r;
import xsna.lav;
import xsna.lfc0;
import xsna.lko0;
import xsna.ln20;
import xsna.lo10;
import xsna.mfk;
import xsna.mga0;
import xsna.msy;
import xsna.myc0;
import xsna.n3b0;
import xsna.n6j;
import xsna.ndc0;
import xsna.nds;
import xsna.o2a0;
import xsna.o84;
import xsna.ofc0;
import xsna.oko0;
import xsna.ozl;
import xsna.p010;
import xsna.p350;
import xsna.p90;
import xsna.px30;
import xsna.q420;
import xsna.q520;
import xsna.r7a0;
import xsna.rdc0;
import xsna.rli0;
import xsna.s3q0;
import xsna.s8;
import xsna.sbc0;
import xsna.scc0;
import xsna.sec0;
import xsna.shc0;
import xsna.sxu;
import xsna.t11;
import xsna.tac0;
import xsna.tb0;
import xsna.tfa0;
import xsna.tju;
import xsna.tu80;
import xsna.txu;
import xsna.u04;
import xsna.u620;
import xsna.uac0;
import xsna.ulp0;
import xsna.umc0;
import xsna.ux40;
import xsna.v68;
import xsna.vr0;
import xsna.vua0;
import xsna.wjg0;
import xsna.wmi0;
import xsna.wnt;
import xsna.wvw;
import xsna.wxu;
import xsna.xgc0;
import xsna.xjg0;
import xsna.xoc0;
import xsna.xs6;
import xsna.xsq;
import xsna.xuo0;
import xsna.xxu;
import xsna.yka0;
import xsna.yl10;
import xsna.ylc0;
import xsna.z84;
import xsna.zb60;
import xsna.zbc0;
import xsna.zf20;
import xsna.zgv0;
import xsna.zxu;

/* compiled from: PostingFragment.kt */
@ozl
/* loaded from: classes4.dex */
public class PostingFragment extends BaseMvpFragment<ikc0> implements rdc0, ies, nds {
    public static final int A0;
    public static final int s0;
    public static final int t0;
    public static final int u0;
    public static final int v0;
    public static final int w0;
    public static final int x0;
    public static final int y0;
    public static final int z0;
    public final bpn0 T = new bpn0(new lo10(this, 20));
    public final bpn0 U = new bpn0(new f550(this, 16));
    public final bpn0 V = new bpn0(new ag20(this, 23));
    public final bpn0 W = new bpn0(new ofc0(this, 0));
    public final Object X;
    public ArrayList<jk6<?>> Y;
    public g420 Z;
    public final bpn0 a0;
    public final bpn0 b0;
    public boolean c0;
    public ViewGroup d0;
    public ViewGroup e0;
    public Object f0;
    public boolean g0;
    public ikc0 h0;
    public final bpn0 i0;
    public final bpn0 j0;
    public PostingMetricsCreationEntryPoint k0;
    public final bll l0;
    public final shc0 m0;
    public final Object n0;
    public final bpn0 o0;
    public final bpn0 p0;
    public final bpn0 q0;
    public final bpn0 r0;

    static {
        int b = cn70.b(28);
        int b2 = cn70.b(44);
        s0 = b2;
        int b3 = cn70.b(104);
        t0 = b3;
        int b4 = cn70.b(44);
        u0 = b4;
        v0 = cn70.b(80);
        w0 = cn70.b(60);
        x0 = cn70.b(56);
        y0 = b2 - b;
        z0 = b3 - b;
        A0 = b4 - b;
    }

    public PostingFragment() {
        tju tjuVar = new tju(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.X = msy.a(lazyThreadSafetyMode, tjuVar);
        this.a0 = new bpn0(new o2a0(3));
        this.b0 = new bpn0(new c2c0(2));
        this.c0 = true;
        this.i0 = new bpn0(new gd70(this, 12));
        this.j0 = new bpn0(new fr20(this, 19));
        this.k0 = PostingMetricsCreationEntryPoint.Other;
        bll bllVar = new bll();
        this.l0 = bllVar;
        this.m0 = new shc0(this, bllVar);
        this.n0 = msy.a(lazyThreadSafetyMode, new xs6(22));
        this.o0 = new bpn0(new tu80(this, 10));
        this.p0 = new bpn0(new ln20(this, 14));
        this.q0 = new bpn0(new i440(this, 19));
        this.r0 = new bpn0(new zf20(this, 20));
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final ikc0 io() {
        return this.h0;
    }

    public final oko0 jo() {
        return (oko0) this.a0.getValue();
    }

    public final void ko(boolean z) {
        ikc0 ikc0Var = this.h0;
        boolean z2 = false;
        if (ikc0Var != null && !ikc0Var.P && !ikc0Var.d0) {
            sbc0 sbc0Var = ikc0Var.x;
            if (sbc0Var == null) {
                sbc0Var = null;
            }
            if (!fkq0.c(sbc0Var.f)) {
                z2 = true;
            }
        }
        int i = z ? w0 : z2 ? z0 : t0;
        int i2 = z ? x0 : z2 ? A0 : u0;
        if (this.c0) {
            ViewGroup viewGroup = this.d0;
            if (viewGroup != null) {
                f4m.q(i, viewGroup);
            }
            ViewGroup viewGroup2 = this.e0;
            if (viewGroup2 != null) {
                f4m.q(i2, viewGroup2);
            }
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    public final void lo(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        cvk.w(str, false);
    }

    public final void mo(int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            lo(activity.getString(i));
        }
    }

    public final <T> q<T> no(q<T> qVar) {
        return hg1.m(qVar, getActivity(), 0L, false, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:423:0x07e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0766 A[SYNTHETIC] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        PendingDocumentAttachment pendingDocumentAttachment;
        File file;
        String str;
        l8r.a a;
        String str2;
        ArrayList<Document> arrayList;
        boolean z;
        ArrayList<VideoFile> arrayList2;
        boolean z2;
        ArrayList arrayList3;
        List list;
        boolean[] zArr;
        List list2;
        List list3;
        PhotoAttachment photoAttachment;
        boolean z3;
        boolean z4;
        super.onActivityResult(i, i2, intent);
        ikc0 ikc0Var = this.h0;
        xoc0 xoc0Var = ikc0Var.g;
        jbc0 jbc0Var = ikc0Var.e;
        scc0 scc0Var = ikc0Var.s;
        if (i2 != -1) {
            if (intent != null) {
                ikc0.L7(intent);
                ikc0.K7(intent);
                ikc0.M7(intent);
                xoc0Var.c(intent);
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        if (vua0.s(i)) {
            File l = vua0.l(i);
            if (l != null) {
                scc0Var.i(Collections.singletonList(l.toURI().toString()));
                return;
            }
            return;
        }
        if (intent == null) {
            return;
        }
        if (i != 31) {
            if (i == 32) {
                int i3 = 14;
                if (intent.hasExtra("result_attachments")) {
                    Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                    if (bundleExtra == null || (list = bundleExtra.getParcelableArrayList("result_files")) == null) {
                        list = EmptyList.b;
                    }
                    if (bundleExtra == null || (zArr = bundleExtra.getBooleanArray("result_video_flags")) == null) {
                        zArr = new boolean[0];
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int min = Math.min(list.size(), zArr.length);
                    for (int i4 = 0; i4 < min; i4++) {
                        String uri = ((Uri) list.get(i4)).toString();
                        if (zArr[i4]) {
                            arrayList5.add(uri);
                        } else {
                            arrayList4.add(uri);
                        }
                    }
                    ikc0 ikc0Var2 = scc0Var.a;
                    ikc0 ikc0Var3 = scc0Var.a;
                    if (scc0.n(scc0Var) && (!arrayList4.isEmpty() || !arrayList5.isEmpty())) {
                        if (arrayList4.size() + ikc0Var2.v7() > ikc0Var2.K) {
                            PostingFragment postingFragment = ikc0Var3.c;
                            int i5 = ikc0Var3.K;
                            postingFragment.getClass();
                            postingFragment.lo(postingFragment.getString(i5 == 1 ? R.string.attachments_limit_one : R.string.attachments_limit, Integer.valueOf(i5)));
                            list2 = arrayList4.subList(0, Math.max(ikc0Var2.K - ikc0Var2.v7(), 0));
                        } else {
                            list2 = arrayList4;
                        }
                        if (list2.size() + arrayList5.size() + ikc0Var2.v7() > ikc0Var2.K) {
                            PostingFragment postingFragment2 = ikc0Var3.c;
                            int i6 = ikc0Var3.K;
                            postingFragment2.getClass();
                            postingFragment2.lo(postingFragment2.getString(i6 == 1 ? R.string.attachments_limit_one : R.string.attachments_limit, Integer.valueOf(i6)));
                            list3 = arrayList5.subList(0, Math.max(ikc0Var2.K - (list2.size() + ikc0Var2.v7()), 0));
                        } else {
                            list3 = arrayList5;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        List list4 = list2;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it = list4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str3 = (String) it.next();
                                z84 z84Var = scc0Var.f;
                                if (epx.f(z84Var != null ? Boolean.valueOf(z84Var.i0(str3)) : null, Boolean.TRUE)) {
                                    r9 = true;
                                    break;
                                }
                            }
                        }
                        if (r9) {
                            scc0Var.q();
                        }
                        arrayList6.addAll(rli0.A(new ulp0(rli0.j(new i5g(list4), new p010(scc0Var, 21)), new q520(14))));
                        List A = rli0.A(rli0.m(new ulp0(new i5g(list3), new ux40(scc0Var, 17))));
                        if (!r9 && A.size() != list3.size()) {
                            scc0Var.q();
                        }
                        arrayList6.addAll(A);
                        scc0Var.c.e(arrayList6);
                        if (scc0Var.p()) {
                            scc0Var.f();
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                    }
                    if (!arrayList5.isEmpty()) {
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                    }
                    ikc0Var.O7(intent);
                } else if (intent.hasExtra("photoVk")) {
                    PhotoAttachment photoAttachment2 = (PhotoAttachment) intent.getParcelableExtra("photoVk");
                    if (photoAttachment2 != null) {
                        scc0Var.h(photoAttachment2);
                        jbc0Var.e();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else if (intent.hasExtra("photoDevice")) {
                    String stringExtra = intent.getStringExtra("photoDevice");
                    if (stringExtra != null) {
                        scc0Var.i(Collections.singletonList(stringExtra));
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType3 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                } else if (intent.hasExtra("videoDevice")) {
                    String stringExtra2 = intent.getStringExtra("videoDevice");
                    if (stringExtra2 != null) {
                        scc0Var.k(Collections.singletonList(stringExtra2));
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType4 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var4 = s3q0.a;
                    }
                } else if (intent.hasExtra("audio")) {
                    MusicTrack musicTrack = (MusicTrack) intent.getParcelableExtra("audio");
                    if (musicTrack != null) {
                        scc0Var.g(Collections.singletonList(musicTrack));
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType5 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var5 = s3q0.a;
                    }
                } else if (intent.hasExtra("playlist")) {
                    Playlist playlist = (Playlist) intent.getParcelableExtra("playlist");
                    if (playlist != null) {
                        scc0Var.getClass();
                        if (scc0.n(scc0Var)) {
                            AudioPlaylistAttachment audioPlaylistAttachment = new AudioPlaylistAttachment(playlist);
                            scc0Var.r(Collections.singletonList(audioPlaylistAttachment), false);
                            scc0Var.c.d(audioPlaylistAttachment);
                        }
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType6 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var6 = s3q0.a;
                    }
                } else if (intent.hasExtra("mMusic")) {
                    Bundle extras = intent.getExtras();
                    if (extras == null || (arrayList3 = extras.getParcelableArrayList("mMusic")) == null) {
                        arrayList3 = new ArrayList();
                    }
                    scc0Var.g(arrayList3);
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType7 = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                    ikc0Var.O7(intent);
                } else if (intent.hasExtra("video")) {
                    VideoFile videoFile = (VideoFile) intent.getParcelableExtra("video");
                    if (videoFile != null) {
                        scc0Var.j(videoFile);
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType8 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var7 = s3q0.a;
                    }
                } else if (intent.hasExtra("mVideo")) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 == null || (arrayList2 = extras2.getParcelableArrayList("mVideo")) == null) {
                        arrayList2 = new ArrayList();
                    }
                    scc0Var.getClass();
                    if (scc0.n(scc0Var)) {
                        if (!arrayList2.isEmpty()) {
                            for (VideoFile videoFile2 : arrayList2) {
                                z84 z84Var2 = scc0Var.f;
                                if (epx.f(z84Var2 != null ? Boolean.valueOf(z84Var2.p0(videoFile2)) : null, Boolean.TRUE)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                            scc0Var.q();
                        }
                        List<? extends Attachment> A2 = rli0.A(new ulp0(rli0.j(new i5g(arrayList2), new mga0(scc0Var, 6)), new juz(14)));
                        scc0Var.c.e(A2);
                        scc0Var.r(A2, false);
                    }
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType9 = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                    ikc0Var.O7(intent);
                } else if (intent.hasExtra("document")) {
                    Document document = (Document) intent.getParcelableExtra("document");
                    if (document != null) {
                        scc0Var.getClass();
                        if (scc0.n(scc0Var)) {
                            z84 z84Var3 = scc0Var.f;
                            if (z84Var3 != null ? z84Var3.f0(document) : false) {
                                scc0Var.q();
                            } else {
                                DocumentAttachment documentAttachment = new DocumentAttachment(document);
                                scc0Var.c.d(documentAttachment);
                                scc0Var.r(Collections.singletonList(documentAttachment), false);
                            }
                        }
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType10 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var8 = s3q0.a;
                    }
                } else if (intent.hasExtra("mDocuments")) {
                    Bundle extras3 = intent.getExtras();
                    if (extras3 == null || (arrayList = extras3.getParcelableArrayList("mDocuments")) == null) {
                        arrayList = new ArrayList();
                    }
                    scc0Var.getClass();
                    if (scc0.n(scc0Var)) {
                        if (!arrayList.isEmpty()) {
                            for (Document document2 : arrayList) {
                                z84 z84Var4 = scc0Var.f;
                                if (epx.f(z84Var4 != null ? Boolean.valueOf(z84Var4.f0(document2)) : null, Boolean.TRUE)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            scc0Var.q();
                        }
                        List<? extends Attachment> A3 = rli0.A(new ulp0(rli0.j(new i5g(arrayList), new zb60(scc0Var, 12)), new irt(i3)));
                        scc0Var.c.e(A3);
                        scc0Var.r(A3, false);
                    }
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType11 = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                    ikc0Var.O7(intent);
                } else if (intent.hasExtra("documents")) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("documents");
                    if (parcelableArrayListExtra != null) {
                        scc0Var.getClass();
                        if (scc0.n(scc0Var)) {
                            if (!parcelableArrayListExtra.isEmpty()) {
                                Iterator it2 = parcelableArrayListExtra.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    PendingDocumentAttachment pendingDocumentAttachment2 = (PendingDocumentAttachment) it2.next();
                                    z84 z84Var5 = scc0Var.f;
                                    if (epx.f(z84Var5 != null ? Boolean.valueOf(z84Var5.g0(pendingDocumentAttachment2)) : null, Boolean.TRUE)) {
                                        r9 = true;
                                        break;
                                    }
                                }
                            }
                            if (r9) {
                                scc0Var.q();
                            }
                            scc0Var.c.e(rli0.A(rli0.j(new i5g(parcelableArrayListExtra), new px30(scc0Var, 22))));
                        }
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType12 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var9 = s3q0.a;
                    }
                } else if (intent.hasExtra("place")) {
                    GeoLocation geoLocation = (GeoLocation) intent.getParcelableExtra("place");
                    if (geoLocation != null) {
                        String stringExtra3 = intent.getStringExtra(RTCStatsConstants.KEY_ADDRESS);
                        String str4 = stringExtra3 != null ? stringExtra3 : "";
                        if (ikc0Var.f0) {
                            z84 z84Var6 = ikc0Var.B;
                            (z84Var6 == null ? null : z84Var6).getClass();
                            GeoAttachment geoAttachment = new GeoAttachment();
                            geoAttachment.f = geoLocation.g;
                            geoAttachment.g = geoLocation.h;
                            int i7 = geoLocation.b;
                            if (i7 >= 0) {
                                geoAttachment.k = i7;
                                geoAttachment.h = geoLocation.i;
                                geoAttachment.j = geoLocation.j;
                                str4 = geoLocation.k;
                            }
                            geoAttachment.i = str4;
                            scc0Var.a(geoAttachment);
                        }
                        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType13 = SchemeStat$PostDraftItemEventType.POST_NOW;
                        jbc0Var.g();
                        ikc0.K7(intent);
                        xoc0Var.c(intent);
                        s3q0 s3q0Var10 = s3q0.a;
                    }
                } else if (intent.hasExtra(SharedKt.PARAM_ATTACHMENT)) {
                    Attachment attachment = (Attachment) intent.getParcelableExtra(SharedKt.PARAM_ATTACHMENT);
                    if (attachment != null) {
                        scc0Var.a(attachment);
                        ikc0Var.O7(intent);
                        s3q0 s3q0Var11 = s3q0.a;
                    }
                } else if (intent.hasExtra("files")) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("files");
                    if (stringArrayListExtra != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (String str5 : stringArrayListExtra) {
                            String[] strArr = (String[]) n6j.a(0, "\\.", str5).toArray(new String[0]);
                            try {
                                file = new File(Uri.parse(str5).getPath());
                                str = "file://" + file.getAbsolutePath();
                                Context context = e43.a;
                                if (context == null) {
                                    context = null;
                                }
                                a = l8r.a(context, Uri.parse(str));
                            } catch (Exception unused) {
                                pendingDocumentAttachment = null;
                            }
                            if (!a.d && !a.e) {
                                str2 = "";
                                pendingDocumentAttachment = new PendingDocumentAttachment(file.getName(), str, file.length(), str2, UserId.d, com.vk.upload.impl.a.d.getAndIncrement(), strArr[strArr.length - 1]);
                                if (pendingDocumentAttachment == null) {
                                    arrayList7.add(pendingDocumentAttachment);
                                }
                            }
                            str2 = str;
                            pendingDocumentAttachment = new PendingDocumentAttachment(file.getName(), str, file.length(), str2, UserId.d, com.vk.upload.impl.a.d.getAndIncrement(), strArr[strArr.length - 1]);
                            if (pendingDocumentAttachment == null) {
                            }
                        }
                        scc0Var.b(arrayList7);
                        s3q0 s3q0Var12 = s3q0.a;
                    }
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType14 = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                    ikc0Var.O7(intent);
                } else if (intent.hasExtra("poll")) {
                    Poll poll = (Poll) intent.getParcelableExtra("poll");
                    if (poll != null) {
                        PollAttachment pollAttachment = new PollAttachment(poll);
                        scc0Var.getClass();
                        if (scc0.n(scc0Var)) {
                            scc0Var.r(Collections.singletonList(pollAttachment), false);
                            scc0Var.c.d(pollAttachment);
                        }
                        s3q0 s3q0Var13 = s3q0.a;
                    }
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType15 = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                    ikc0.M7(intent);
                    ikc0Var.O7(intent);
                } else if (intent.hasExtra(NetworkClass.GOOD)) {
                    Parcelable parcelableExtra = intent.getParcelableExtra(NetworkClass.GOOD);
                    if (parcelableExtra != null) {
                        scc0Var.getClass();
                        if (parcelableExtra instanceof SnippetAttachment) {
                            ((SnippetAttachment) parcelableExtra).t = true;
                            scc0Var.a((Attachment) parcelableExtra);
                        } else if (parcelableExtra instanceof Good) {
                            Good good = (Good) parcelableExtra;
                            MarketAttachment marketAttachment = new MarketAttachment(good);
                            if (good.m || !scc0Var.o()) {
                                scc0Var.a(marketAttachment);
                            } else {
                                scc0Var.b(e43.l(new MarketAttachment(good), new MarketLinkAttachment((String) scc0Var.e.invoke(Integer.valueOf(scc0Var.m())), null, 2, null)));
                            }
                        } else if (parcelableExtra instanceof Attachment) {
                            scc0Var.a((Attachment) parcelableExtra);
                        }
                        s3q0 s3q0Var14 = s3q0.a;
                    }
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType16 = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                    ikc0.L7(intent);
                    xoc0Var.c(intent);
                }
            } else if (i == 40) {
                boolean booleanExtra = intent.getBooleanExtra("fb", false);
                boolean booleanExtra2 = intent.getBooleanExtra("tw", false);
                boolean booleanExtra3 = intent.getBooleanExtra("commentsClosing", false);
                boolean booleanExtra4 = intent.getBooleanExtra(C4504q2.x, false);
                String stringExtra4 = intent.getStringExtra("copyrightLink");
                long longExtra = intent.getLongExtra("postponeDate", 0L);
                boolean booleanExtra5 = intent.getBooleanExtra("needHideName", false);
                PostingOrd postingOrd = (PostingOrd) intent.getParcelableExtra("token_advertising_ord");
                ikc0Var.i0 = (ikc0Var.l0 == booleanExtra && ikc0Var.m0 == booleanExtra2 && ikc0Var.n0 == booleanExtra3 && ikc0Var.o0 == booleanExtra4 && epx.f(ikc0Var.r0, stringExtra4)) ? false : true;
                ikc0Var.l0 = booleanExtra;
                ikc0Var.m0 = booleanExtra2;
                ikc0Var.n0 = booleanExtra3;
                ikc0Var.o0 = booleanExtra4;
                ikc0Var.S7(stringExtra4);
                ikc0Var.p0 = postingOrd;
                if (ikc0Var.j) {
                    ikc0Var.e1(longExtra > 0 ? new Date(longExtra) : null);
                }
                ikc0Var.Y = booleanExtra5;
                ikc0Var.u7();
            } else if (i == 50) {
                NewPosterResult newPosterResult = (NewPosterResult) intent.getParcelableExtra("psoterBackground");
                if (newPosterResult != null) {
                    ikc0Var.P7(newPosterResult, false);
                    s3q0 s3q0Var15 = s3q0.a;
                }
            } else if (i != 10009) {
                if (i == 10666) {
                    z84 z84Var7 = ikc0Var.B;
                    if (z84Var7 == null) {
                        z84Var7 = null;
                    }
                    if (i == 10666) {
                        o84 o84Var = z84Var7.m;
                        if (o84Var != null) {
                            Object obj = o84Var.m;
                            em6 em6Var = obj instanceof em6 ? (em6) obj : null;
                            if (em6Var != null) {
                                em6Var.f(i, intent);
                            }
                        }
                    } else {
                        z84Var7.getClass();
                    }
                } else if (i != 42) {
                    if (i == 43) {
                        if (intent.hasExtra("article_attach")) {
                            ArticleAttachment articleAttachment = (ArticleAttachment) intent.getParcelableExtra("article_attach");
                            if (articleAttachment == null) {
                                return;
                            }
                            scc0Var.getClass();
                            if (scc0.n(scc0Var)) {
                                z84 z84Var8 = scc0Var.f;
                                if (!(z84Var8 != null ? z84Var8.Bc(4) : true)) {
                                    z84 z84Var9 = scc0Var.f;
                                    if (z84Var9 != null) {
                                        ArrayList arrayList8 = (ArrayList) z84Var9.u();
                                        if (!arrayList8.isEmpty()) {
                                            Iterator it3 = arrayList8.iterator();
                                            while (it3.hasNext()) {
                                                Attachment attachment2 = (Attachment) it3.next();
                                                if ((attachment2 instanceof ArticleAttachment) && epx.f(((ArticleAttachment) attachment2).f.i, articleAttachment.f.i)) {
                                                    z4 = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    z4 = false;
                                    if (z4) {
                                        scc0Var.q();
                                    } else {
                                        scc0Var.c.d(articleAttachment);
                                        scc0Var.r(Collections.singletonList(articleAttachment), false);
                                    }
                                }
                            }
                            ikc0Var.O7(intent);
                        } else if (intent.hasExtra("album_attach")) {
                            AlbumAttachment albumAttachment = (AlbumAttachment) intent.getParcelableExtra("album_attach");
                            if (albumAttachment == null) {
                                return;
                            }
                            scc0Var.getClass();
                            if (scc0.n(scc0Var)) {
                                z84 z84Var10 = scc0Var.f;
                                if (!(z84Var10 != null ? z84Var10.Bc(7) : true)) {
                                    z84 z84Var11 = scc0Var.f;
                                    if (z84Var11 != null) {
                                        ArrayList arrayList9 = (ArrayList) z84Var11.u();
                                        if (!arrayList9.isEmpty()) {
                                            Iterator it4 = arrayList9.iterator();
                                            while (it4.hasNext()) {
                                                Attachment attachment3 = (Attachment) it4.next();
                                                if (attachment3 instanceof AlbumAttachment) {
                                                    AlbumAttachment albumAttachment2 = (AlbumAttachment) attachment3;
                                                    if (albumAttachment.f == albumAttachment2.f && epx.f(albumAttachment.g, albumAttachment2.g) && albumAttachment.l.d == albumAttachment2.l.d) {
                                                        z3 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                        scc0Var.q();
                                    } else {
                                        scc0Var.c.d(albumAttachment);
                                        scc0Var.r(Collections.singletonList(albumAttachment), false);
                                    }
                                }
                            }
                            ikc0Var.O7(intent);
                        } else if (intent.hasExtra("photo_vk_attach")) {
                            Photo photo = (Photo) intent.getParcelableExtra("photo_vk_attach");
                            if (photo == null) {
                                return;
                            }
                            scc0Var.h(new PhotoAttachment(photo));
                            ikc0Var.O7(intent);
                        } else if (intent.hasExtra("video_vk_attach")) {
                            VideoFile videoFile3 = (VideoFile) intent.getParcelableExtra("video_vk_attach");
                            if (videoFile3 == null) {
                                return;
                            }
                            scc0Var.j(videoFile3);
                            ikc0Var.O7(intent);
                        }
                    }
                } else if (intent.hasExtra(SharedKt.PARAM_ATTACHMENT) && (photoAttachment = (PhotoAttachment) intent.getParcelableExtra(SharedKt.PARAM_ATTACHMENT)) != null) {
                    scc0Var.h(photoAttachment);
                    jbc0Var.e();
                    ikc0Var.Ca();
                    ikc0Var.O7(intent);
                    s3q0 s3q0Var16 = s3q0.a;
                }
            }
            ikc0Var.Ca();
        }
        Poll poll2 = (Poll) intent.getParcelableExtra("poll");
        if (poll2 != null) {
            PollAttachment pollAttachment2 = new PollAttachment(poll2);
            scc0Var.getClass();
            if (scc0.n(scc0Var)) {
                scc0Var.r(Collections.singletonList(pollAttachment2), false);
                scc0Var.c.d(pollAttachment2);
            }
            ikc0.M7(intent);
            ikc0Var.O7(intent);
            s3q0 s3q0Var17 = s3q0.a;
        }
        ikc0Var.Ca();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        double d;
        double d2;
        int i;
        super.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext) && this.g0) {
            TabletDialogActivity tabletDialogActivity = (TabletDialogActivity) getActivity();
            int i2 = configuration.orientation;
            if (i2 == 1) {
                d = iah0.f().heightPixels;
                d2 = 0.75d;
            } else if (i2 != 2) {
                i = 0;
                tabletDialogActivity.A = i;
                tabletDialogActivity.getResources().getConfiguration();
                tabletDialogActivity.X1(tabletDialogActivity.getWindow(), tabletDialogActivity.getWindow().getAttributes(), tabletDialogActivity.q, p90.f(tabletDialogActivity));
            } else {
                d = iah0.f().heightPixels;
                d2 = 0.9d;
            }
            i = (int) (d * d2);
            tabletDialogActivity.A = i;
            tabletDialogActivity.getResources().getConfiguration();
            tabletDialogActivity.X1(tabletDialogActivity.getWindow(), tabletDialogActivity.getWindow().getAttributes(), tabletDialogActivity.q, p90.f(tabletDialogActivity));
        }
        ikc0 ikc0Var = this.h0;
        wxu wxuVar = ikc0Var.y;
        if (wxuVar == null) {
            wxuVar = null;
        }
        wxuVar.z();
        tac0 tac0Var = ikc0Var.A;
        (tac0Var != null ? tac0Var : null).c.m8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        ImPostingConfig imPostingConfig;
        MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint creationEntryPoint;
        txu xxuVar;
        PostingFragment postingFragment;
        v68 v68Var;
        ikc0 ikc0Var;
        ikc0 ikc0Var2;
        Parcelable parcelable;
        Object parcelable2;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments != null && arguments.containsKey("creationEntryPoint")) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (string = arguments2.getString("creationEntryPoint")) != null) {
                PostingCreationEntryPoint.Companion.getClass();
                PostingCreationEntryPoint a = PostingCreationEntryPoint.a.a(string);
                if (a != null) {
                    switch (hhc0.a.$EnumSwitchMapping$0[a.ordinal()]) {
                        case 1:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.FeedPlus;
                            break;
                        case 2:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.GroupWallButton;
                            break;
                        case 3:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.ProfilePlusButton;
                            break;
                        case 4:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.ProfileWallButton;
                            break;
                        case 5:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.ChannelWriteBarButton;
                            break;
                        case 6:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.PostThreeDotMenuEditItem;
                            break;
                        case 7:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.FeedEditDraft;
                            break;
                        case 8:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.FeedEditDraftThreeDots;
                            break;
                        case 9:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.FeedDeleteDraft;
                            break;
                        case 10:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.FeedDeleteDraftThreeDots;
                            break;
                        case 11:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.ListEditDraft;
                            break;
                        case 12:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.ListEditDraftThreeDots;
                            break;
                        case 13:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.CommunityCreationOnboarding;
                            break;
                        default:
                            postingMetricsCreationEntryPoint = PostingMetricsCreationEntryPoint.Other;
                            break;
                    }
                    if (postingMetricsCreationEntryPoint == null) {
                        postingMetricsCreationEntryPoint = this.k0;
                    }
                    this.k0 = postingMetricsCreationEntryPoint;
                }
            }
            postingMetricsCreationEntryPoint = null;
            if (postingMetricsCreationEntryPoint == null) {
            }
            this.k0 = postingMetricsCreationEntryPoint;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments3.getParcelable("imPostingDesignConfig", ImPostingConfig.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments3.getParcelable("imPostingDesignConfig");
                if (!(parcelable3 instanceof ImPostingConfig)) {
                    parcelable3 = null;
                }
                parcelable = (ImPostingConfig) parcelable3;
            }
            imPostingConfig = (ImPostingConfig) parcelable;
        } else {
            imPostingConfig = null;
        }
        if (imPostingConfig != null) {
            this.c0 = imPostingConfig.c;
        }
        boolean z2 = imPostingConfig != null ? imPostingConfig.g : false;
        boolean z3 = imPostingConfig != null ? imPostingConfig.d : true;
        ?? r3 = this.n0;
        if (imPostingConfig == null) {
            ((dfu) r3.getValue()).getClass();
        }
        boolean z4 = imPostingConfig != null ? imPostingConfig.c : true;
        boolean z5 = imPostingConfig != null ? imPostingConfig.e : true;
        boolean z6 = imPostingConfig != null ? imPostingConfig.b : false;
        if (imPostingConfig != null) {
            z = imPostingConfig.f.equals("1");
        } else {
            ((dfu) r3.getValue()).getClass();
        }
        ndc0 ndc0Var = new ndc0(z2, z3, z4, z5, z6, Boolean.valueOf(z));
        if (a.e == null) {
            a.e = new a();
        }
        a aVar = a.e;
        j5d0 j5d0Var = new j5d0();
        ?? r9 = this.X;
        ikc0 ikc0Var3 = new ikc0(this, aVar, (jbc0) r9.getValue(), j5d0Var, this.l0, ndc0Var);
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint2 = this.k0;
        ikc0Var3.J = postingMetricsCreationEntryPoint2;
        ikc0Var3.s.i = postingMetricsCreationEntryPoint2;
        switch (ikc0.d.$EnumSwitchMapping$2[postingMetricsCreationEntryPoint2.ordinal()]) {
            case 1:
                creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.FEED_PLUS_BUTTON;
                break;
            case 2:
                creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.GROUP_WALL_BUTTON;
                break;
            case 3:
                creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.PROFILE_PLUS_BUTTON;
                break;
            case 4:
                creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.PROFILE_WALL_BUTTON;
                break;
            case 5:
                creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.CHANNEL_WRITE_BAR_BUTTON;
                break;
            case 6:
                creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.POST_THREE_DOT_MENU_EDIT_ITEM;
                break;
            default:
                creationEntryPoint = MobileOfficialAppsFeedStat$PostingContext.CreationEntryPoint.OTHER;
                break;
        }
        ikc0Var3.g.t2(creationEntryPoint);
        this.h0 = ikc0Var3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (ikc0Var2 = this.h0) != null) {
            j0u0 j0u0Var = new j0u0(5);
            j0u0Var.g(arguments4);
            arguments4.remove("startScreenTime");
            arguments4.remove("startScreenElapsedTime");
            ikc0Var2.g.p3(j0u0Var, ikc0Var2);
        }
        this.Y = new ArrayList<>();
        UserId b = t11.b();
        if (this.c0) {
            Bundle arguments5 = getArguments();
            xxuVar = new zxu(arguments5 != null ? arguments5.getBoolean("open_from_group") : false);
        } else {
            xxuVar = new xxu();
        }
        txu txuVar = xxuVar;
        ArrayList<jk6<?>> arrayList = this.Y;
        if (arrayList == null) {
            arrayList = null;
        }
        arrayList.add(txuVar);
        ikc0 ikc0Var4 = this.h0;
        jbc0 jbc0Var = (jbc0) r9.getValue();
        bpn0 bpn0Var = this.i0;
        wxu wxuVar = new wxu(ikc0Var4, txuVar, aVar, jbc0Var, (fhc0) bpn0Var.getValue());
        wxuVar.o = this.k0;
        txuVar.setPresenter(wxuVar);
        this.h0.y = wxuVar;
        ArrayList<jk6<?>> arrayList2 = this.Y;
        if (arrayList2 == null) {
            arrayList2 = null;
        }
        arrayList2.add(jo());
        ArrayList<jk6<?>> arrayList3 = this.Y;
        if (arrayList3 == null) {
            arrayList3 = null;
        }
        bpn0 bpn0Var2 = this.b0;
        arrayList3.add((uac0) bpn0Var2.getValue());
        zbc0 zbc0Var = new zbc0();
        b94 b94Var = new b94(kn(), b, this.m0, this.c0, (clc0) this.V.getValue(), (jbc0) r9.getValue(), (fhc0) bpn0Var.getValue(), this.k0, ndc0Var, zbc0Var);
        ArrayList<jk6<?>> arrayList4 = this.Y;
        if (arrayList4 == null) {
            arrayList4 = null;
        }
        arrayList4.add(b94Var);
        hdc0 hdc0Var = new hdc0();
        ArrayList<jk6<?>> arrayList5 = this.Y;
        if (arrayList5 == null) {
            arrayList5 = null;
        }
        arrayList5.add(hdc0Var);
        hdc0Var.b = new u04(hdc0Var);
        lko0 lko0Var = new lko0(this.h0, jo(), ndc0Var);
        jo().b = lko0Var;
        ikc0 ikc0Var5 = this.h0;
        ikc0Var5.z = lko0Var;
        tac0 tac0Var = new tac0(ikc0Var5, (uac0) bpn0Var2.getValue(), ndc0Var);
        ((uac0) bpn0Var2.getValue()).b = tac0Var;
        ikc0 ikc0Var6 = this.h0;
        ikc0Var6.A = tac0Var;
        z84 z84Var = new z84(ikc0Var6, b94Var, tfa0.a, ((fhc0) bpn0Var.getValue()).b(), (g760) this.W.getValue(), (jbc0) r9.getValue(), (fhc0) bpn0Var.getValue(), this.k0, ndc0Var, j5d0Var, zbc0Var);
        z84Var.i = this.k0;
        b94Var.t = z84Var;
        ikc0 ikc0Var7 = this.h0;
        ikc0Var7.B = z84Var;
        ikc0Var7.s.f = z84Var;
        if (this.c0) {
            z84Var.l = b94Var;
            dmc0 dmc0Var = new dmc0();
            dmc0Var.b = this.k0;
            ArrayList<jk6<?>> arrayList6 = this.Y;
            if (arrayList6 == null) {
                arrayList6 = null;
            }
            arrayList6.add(dmc0Var);
            ylc0 ylc0Var = new ylc0(this.h0, dmc0Var);
            PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint3 = this.k0;
            ylc0Var.d = postingMetricsCreationEntryPoint3;
            ylc0Var.b().f = postingMetricsCreationEntryPoint3;
            ylc0Var.g().m = postingMetricsCreationEntryPoint3;
            dmc0Var.c = ylc0Var;
            eo(ylc0Var.e);
            this.h0.C = ylc0Var;
        } else {
            f3j0 f3j0Var = new f3j0(z84Var);
            z84Var.l = f3j0Var;
            ArrayList<jk6<?>> arrayList7 = this.Y;
            if (arrayList7 == null) {
                arrayList7 = null;
            }
            arrayList7.add(f3j0Var);
            e3j0 e3j0Var = new e3j0(this.h0, f3j0Var);
            eo(e3j0Var.d);
            f3j0Var.o = e3j0Var;
            this.h0.C = e3j0Var;
        }
        ikc0 ikc0Var8 = this.h0;
        if (this.c0) {
            postingFragment = this;
            d dVar = new d(ikc0Var8, (b25) this.T.getValue(), (wvw) this.U.getValue(), (fhc0) bpn0Var.getValue(), getActivity(), new s8(1, this, PostingFragment.class, "invokeActionAfterKeyboardClosed", "invokeActionAfterKeyboardClosed(Lkotlin/jvm/functions/Function0;)V", 0, 14), ndc0Var);
            dVar.g.k = postingFragment.k0;
            v68Var = dVar;
        } else {
            postingFragment = this;
            v68Var = new v68();
        }
        postingFragment.f0 = v68Var;
        ArrayList<jk6<?>> arrayList8 = postingFragment.Y;
        if (arrayList8 == null) {
            arrayList8 = null;
        }
        arrayList8.add(v68Var);
        v68Var.setPresenter(postingFragment.h0);
        postingFragment.h0.D = v68Var;
        g420 D0 = hd60.a().D0(postingFragment.h0);
        postingFragment.Z = D0;
        ikc0 ikc0Var9 = postingFragment.h0;
        if (D0 == null) {
            D0 = null;
        }
        ikc0Var9.E = D0;
        Bundle arguments6 = postingFragment.getArguments();
        if (arguments6 == null) {
            arguments6 = Bundle.EMPTY;
        }
        Bundle bundle2 = arguments6;
        lko0 lko0Var2 = ikc0Var9.z;
        lko0 lko0Var3 = lko0Var2 == null ? null : lko0Var2;
        wxu wxuVar2 = ikc0Var9.y;
        ikc0Var9.x = new sbc0(bundle2, lko0Var3, ikc0Var9, wxuVar2 == null ? null : wxuVar2, ikc0Var9.s);
        if (bundle == null && (ikc0Var = postingFragment.h0) != null) {
            sbc0 sbc0Var = ikc0Var.x;
            if (sbc0Var == null) {
                sbc0Var = null;
            }
            if (sbc0Var.U) {
                ghc0.f a2 = ikc0Var.C7().a();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint4 = ikc0Var.J;
                a2.getClass();
                a2.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.OPEN_POSTING_FROM_PLUS, postingMetricsCreationEntryPoint4);
            } else if (ikc0Var.G7()) {
                ghc0.f a3 = ikc0Var.C7().a();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint5 = ikc0Var.J;
                a3.getClass();
                a3.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.EDIT_POSTPONED_POST, postingMetricsCreationEntryPoint5);
            } else if (ikc0Var.F7()) {
                ghc0.f a4 = ikc0Var.C7().a();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint6 = ikc0Var.J;
                a4.getClass();
                a4.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.EDIT_PUBLISHED_POST, postingMetricsCreationEntryPoint6);
            } else {
                ghc0.f a5 = ikc0Var.C7().a();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint7 = ikc0Var.J;
                a5.getClass();
                a5.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.OPEN, postingMetricsCreationEntryPoint7);
            }
        }
        FragmentActivity activity = postingFragment.getActivity();
        TabletDialogActivity tabletDialogActivity = activity instanceof TabletDialogActivity ? (TabletDialogActivity) activity : null;
        if (tabletDialogActivity != null) {
            tabletDialogActivity.Li((tb0) postingFragment.j0.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(this.c0 ? R.layout.fragment_posting_redesign : R.layout.fragment_posting, viewGroup, false);
        if (this.c0) {
            this.d0 = (ViewGroup) viewGroup3.findViewById(R.id.posting_scroll_content);
            this.e0 = (ViewGroup) viewGroup3.findViewById(R.id.posting_poster_preview_recycler_view);
        }
        View findViewById = viewGroup3.findViewById(R.id.posting_mention_select_stub);
        g420 g420Var = this.Z;
        if (g420Var == null) {
            g420Var = null;
        }
        View d = g420Var.d(viewGroup3, null);
        int dimensionPixelSize = viewGroup3.getResources().getDimensionPixelSize(R.dimen.newsfeed_newpost_bottom_panel_height);
        g420 g420Var2 = this.Z;
        (g420Var2 != null ? g420Var2 : null).a(dimensionPixelSize);
        int indexOfChild = viewGroup3.indexOfChild(findViewById);
        viewGroup3.removeViewAt(indexOfChild);
        viewGroup3.addView(d, indexOfChild);
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("open_from_group") : false;
        if (this.c0 && z && (viewGroup2 = this.d0) != null) {
            f4m.t(v0, viewGroup2);
        }
        return viewGroup3;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FragmentActivity activity = getActivity();
        TabletDialogActivity tabletDialogActivity = activity instanceof TabletDialogActivity ? (TabletDialogActivity) activity : null;
        if (tabletDialogActivity != null) {
            tabletDialogActivity.yk((tb0) this.j0.getValue());
        }
        hd60.a().C0();
        a.e = null;
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ArrayList<jk6<?>> arrayList = this.Y;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            ((jk6) it.next()).onDestroyView();
        }
        FragmentActivity activity = getActivity();
        VKActivity vKActivity = activity instanceof VKActivity ? (VKActivity) activity : null;
        if (vKActivity != null) {
            vKActivity.r = true;
        }
        g420 g420Var = this.Z;
        (g420Var != null ? g420Var : null).onDestroyView();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || !gz80.a(23)) {
            return;
        }
        HashSet hashSet = iah0.a;
        if (fnj.d(activity)) {
            return;
        }
        p90.b(activity, krv0.l(R.attr.vk_ui_background_modal), false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        ikc0 ikc0Var = this.h0;
        if (ikc0Var != null) {
            ikc0Var.g.b(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x05fc, code lost:
    
        if (r9.isEmpty() == true) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x07f5, code lost:
    
        if (r4.U != false) goto L534;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:495:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x03b7  */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xsna.ikc0] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v94, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r6v101, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v102 */
    /* JADX WARN: Type inference failed for: r6v105, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r6v106 */
    /* JADX WARN: Type inference failed for: r6v109, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r6v110 */
    /* JADX WARN: Type inference failed for: r6v113, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r6v114 */
    /* JADX WARN: Type inference failed for: r6v123, types: [java.lang.Object, xsna.tac0] */
    /* JADX WARN: Type inference failed for: r6v127 */
    /* JADX WARN: Type inference failed for: r6v135 */
    /* JADX WARN: Type inference failed for: r6v136 */
    /* JADX WARN: Type inference failed for: r6v137 */
    /* JADX WARN: Type inference failed for: r6v138 */
    /* JADX WARN: Type inference failed for: r6v139 */
    /* JADX WARN: Type inference failed for: r6v140 */
    /* JADX WARN: Type inference failed for: r6v141 */
    /* JADX WARN: Type inference failed for: r6v142 */
    /* JADX WARN: Type inference failed for: r6v143 */
    /* JADX WARN: Type inference failed for: r6v144 */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r6v146 */
    /* JADX WARN: Type inference failed for: r6v147 */
    /* JADX WARN: Type inference failed for: r6v148 */
    /* JADX WARN: Type inference failed for: r6v149 */
    /* JADX WARN: Type inference failed for: r6v150 */
    /* JADX WARN: Type inference failed for: r6v151 */
    /* JADX WARN: Type inference failed for: r6v21, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v47, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v60, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v63, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v67, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v71, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v75, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v79, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v83, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v88, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v92, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v93 */
    /* JADX WARN: Type inference failed for: r6v96, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r6v97 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        sbc0 sbc0Var;
        sbc0 sbc0Var2;
        boolean z2;
        Long l;
        sbc0 sbc0Var3;
        long j;
        Poster poster;
        sbc0 sbc0Var4;
        sbc0 sbc0Var5;
        sbc0 sbc0Var6;
        sbc0 sbc0Var7;
        sbc0 sbc0Var8;
        sbc0 sbc0Var9;
        Integer num;
        sbc0 sbc0Var10;
        sbc0 sbc0Var11;
        sbc0 sbc0Var12;
        Object obj;
        sbc0 sbc0Var13;
        sbc0 sbc0Var14;
        sbc0 sbc0Var15;
        sbc0 sbc0Var16;
        sbc0 sbc0Var17;
        sbc0 sbc0Var18;
        sbc0 sbc0Var19;
        sbc0 sbc0Var20;
        sbc0 sbc0Var21;
        sbc0 sbc0Var22;
        g420 g420Var;
        SelectionChangeEditText selectionChangeEditText;
        VKActivity vKActivity;
        Object obj2;
        sbc0 sbc0Var23;
        c cVar;
        String str;
        boolean z3;
        ?? r13;
        boolean z4;
        SnippetAttachment snippetAttachment;
        String str2;
        String str3;
        jko0 jko0Var;
        sbc0 sbc0Var24;
        ArrayList arrayList;
        ImageCropData imageCropData;
        super.onViewCreated(view, bundle);
        ArrayList<jk6<?>> arrayList2 = this.Y;
        if (arrayList2 == null) {
            arrayList2 = null;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((jk6) it.next()).d3(view);
        }
        ?? r1 = this.h0;
        getArguments();
        a aVar = r1.d;
        scc0 scc0Var = r1.s;
        boolean z5 = r1.j;
        PostingFragment postingFragment = r1.c;
        sbc0 sbc0Var25 = r1.x;
        if (sbc0Var25 == null) {
            sbc0Var25 = null;
        }
        if (fkq0.c(sbc0Var25.e)) {
            wxu wxuVar = r1.y;
            if (wxuVar == null) {
                wxuVar = null;
            }
            sbc0 sbc0Var26 = r1.x;
            wxuVar.i = (sbc0Var26 == null ? null : sbc0Var26).e;
            if (sbc0Var26 == null) {
                sbc0Var26 = null;
            }
            r1.B0 = sbc0Var26.e;
        }
        xgc0 xgc0Var = (xgc0) r1.c0.getValue();
        rdc0 rdc0Var = xgc0Var.b;
        ExtendedProfilesRepository extendedProfilesRepository = xgc0Var.d;
        UserId uid = xgc0Var.a.getUid();
        int i = 17;
        byte b = 0;
        if (fkq0.b(uid)) {
            q I0 = q.I0(extendedProfilesRepository.w(new com.vk.repository.data.api.a(xgc0Var.c.c(), false, false, false, null, false, false, new u620(17), new vr0(22), ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST, null, null, null)), extendedProfilesRepository.S0(new ExtendedProfilesRepository.a(uid, new gzn(26), new vr0(22), ExtendedProfilesRepository.LoadStrategy.ONLY_CACHE, null, GroupsFieldsDto.COUNTERS.k(), Tensorflow.FRAME_HEIGHT)), new d810(new fhi(b, 1), 10));
            asu0 asu0Var = asu0.a;
            rdc0Var.a(I0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new wnt(new yka0(xgc0Var, 3), 23), new c120(new xsq(20), 18)));
        } else {
            io.reactivex.rxjava3.internal.operators.observable.a w = extendedProfilesRepository.w(new com.vk.repository.data.api.a(uid, false, false, false, null, false, false, new u620(i), new vr0(22), ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST, null, null, null));
            asu0 asu0Var2 = asu0.a;
            rdc0Var.a(w.r0(asu0Var2.c()).a0(asu0Var2.d()).subscribe(new be50(new mga0(xgc0Var, 7), 9), new dh40(new bws(13), 12)));
        }
        sbc0 sbc0Var27 = r1.x;
        if ((sbc0Var27 == null ? null : sbc0Var27).A) {
            r1.n0 = true;
        }
        if ((sbc0Var27 == null ? null : sbc0Var27).B) {
            r1.q0 = true;
        }
        if ((sbc0Var27 == null ? null : sbc0Var27).h != null) {
            r1.v0 = (sbc0Var27 == null ? null : sbc0Var27).h;
        }
        if ((sbc0Var27 == null ? null : sbc0Var27).i) {
            r1.C0 = (sbc0Var27 == null ? null : sbc0Var27).i;
        }
        wxu wxuVar2 = r1.y;
        if (wxuVar2 == null) {
            wxuVar2 = null;
        }
        boolean z6 = r1.C0;
        if (sbc0Var27 == null) {
            sbc0Var27 = null;
        }
        Group group = sbc0Var27.h;
        wxuVar2.c.S5(z6, group != null ? group.i : false);
        lko0 lko0Var = r1.z;
        if (lko0Var == null) {
            lko0Var = null;
        }
        lko0Var.c.setHintText(r1.C0 ? R.string.suggest_news : R.string.what_new);
        sbc0 sbc0Var28 = r1.x;
        if (sbc0Var28 == null) {
            sbc0Var28 = null;
        }
        if (sbc0Var28.j) {
            r1.ue(true);
        }
        sbc0 sbc0Var29 = r1.x;
        if (sbc0Var29 == null) {
            sbc0Var29 = null;
        }
        if (myc0.f(sbc0Var29.n)) {
            sbc0 sbc0Var30 = r1.x;
            if (sbc0Var30 == null) {
                sbc0Var30 = null;
            }
            scc0Var.i(Collections.singletonList(sbc0Var30.n));
        }
        sbc0 sbc0Var31 = r1.x;
        if (sbc0Var31 == null) {
            sbc0Var31 = null;
        }
        if (!sbc0Var31.o.isEmpty()) {
            sbc0 sbc0Var32 = r1.x;
            if (sbc0Var32 == null) {
                sbc0Var32 = null;
            }
            scc0Var.i(sbc0Var32.o);
        }
        sbc0 sbc0Var33 = r1.x;
        Long l2 = (sbc0Var33 == null ? null : sbc0Var33).p;
        if ((sbc0Var33 == null ? null : sbc0Var33).q != null) {
            if ((sbc0Var33 == null ? null : sbc0Var33).q instanceof CommentNewsEntry) {
                z = true;
                if (l2 == null) {
                    if ((sbc0Var33 == null ? null : sbc0Var33).q != null) {
                        if (sbc0Var33 == null) {
                            sbc0Var33 = null;
                        }
                        NewsEntry newsEntry = sbc0Var33.q;
                        if ((newsEntry != null ? di60.r(newsEntry) : null) != null) {
                            sbc0 sbc0Var34 = r1.x;
                            if (sbc0Var34 == null) {
                                sbc0Var34 = null;
                            }
                            NewsEntry newsEntry2 = sbc0Var34.q;
                            if (newsEntry2 != null) {
                                di60.r(newsEntry2);
                            }
                            AttachmentsMeta.PrimaryMode primaryMode = AttachmentsMeta.PrimaryMode.SINGLE;
                        }
                    }
                    boolean booleanValue = r1.h.f.booleanValue();
                    sbc0 sbc0Var35 = r1.x;
                    if (sbc0Var35 == null) {
                        sbc0Var35 = null;
                    }
                    NewsEntry newsEntry3 = sbc0Var35.q;
                    if (newsEntry3 == null || !(newsEntry3 instanceof Post)) {
                        arrayList = null;
                    } else {
                        ArrayList<EntryAttachment> arrayList3 = ((Post) newsEntry3).z;
                        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((EntryAttachment) it2.next()).b);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (next instanceof PhotoAttachment) {
                                arrayList5.add(next);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            ImageCropData Gb = ((PhotoAttachment) it4.next()).l.Gb();
                            if (Gb != null) {
                                arrayList6.add(Gb);
                            }
                        }
                        arrayList = arrayList6;
                    }
                    z84 z84Var = r1.B;
                    if (z84Var == null) {
                        z84Var = null;
                    }
                    z84Var.e0(new mfk(!r1.F7(), z, booleanValue, (arrayList == null || (imageCropData = (ImageCropData) j5g.a0(arrayList)) == null) ? null : r1.f.a(imageCropData.c() / imageCropData.a()), arrayList, null));
                    sbc0 sbc0Var36 = r1.x;
                    if (sbc0Var36 == null) {
                        sbc0Var36 = null;
                    }
                    Parcelable[] parcelableArr = sbc0Var36.m;
                    ArrayList arrayList7 = new ArrayList();
                    for (Parcelable parcelable : parcelableArr) {
                        Attachment attachment = parcelable instanceof Attachment ? (Attachment) parcelable : null;
                        if (attachment != null) {
                            arrayList7.add(attachment);
                        }
                    }
                    if (!arrayList7.isEmpty()) {
                        scc0Var.b(arrayList7);
                    }
                }
                sbc0Var = r1.x;
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                if (myc0.f(sbc0Var.l)) {
                    sbc0 sbc0Var37 = r1.x;
                    if (sbc0Var37 == null) {
                        sbc0Var37 = null;
                    }
                    String str4 = sbc0Var37.l;
                    if (str4.length() > 0) {
                        Matcher matcher = hd60.a().Y().matcher(str4);
                        if (matcher.find()) {
                            str3 = drm0.p0(matcher.group()).toString();
                            str2 = drm0.p0(matcher.replaceFirst("")).toString();
                            jko0Var = sbc0Var37.a;
                            if (jko0Var != null) {
                                jko0Var.setText(str2);
                            }
                            if (str3 != null) {
                                sbc0Var37.d.d(new LinkAttachment(str3, "", ""), true);
                            }
                            sbc0Var24 = r1.x;
                            if (sbc0Var24 == null) {
                                sbc0Var24 = null;
                            }
                            r1.U7(sbc0Var24.l);
                        }
                    }
                    str2 = str4;
                    str3 = null;
                    jko0Var = sbc0Var37.a;
                    if (jko0Var != null) {
                    }
                    if (str3 != null) {
                    }
                    sbc0Var24 = r1.x;
                    if (sbc0Var24 == null) {
                    }
                    r1.U7(sbc0Var24.l);
                }
                sbc0Var2 = r1.x;
                if ((sbc0Var2 != null ? null : sbc0Var2).q == null) {
                    if (sbc0Var2 == null) {
                        sbc0Var2 = null;
                    }
                    ikc0 ikc0Var = sbc0Var2.b;
                    d02 d02Var = sbc0Var2.k0;
                    scc0 scc0Var2 = sbc0Var2.d;
                    ikc0 ikc0Var2 = sbc0Var2.b;
                    NewsEntry newsEntry4 = sbc0Var2.q;
                    if (newsEntry4 == null) {
                        z2 = z5;
                        l = l2;
                    } else {
                        sxu sxuVar = sbc0Var2.c;
                        if (sxuVar != null) {
                            sxuVar.K6();
                        }
                        if (newsEntry4 instanceof Post) {
                            Post post = (Post) newsEntry4;
                            Flags flags = post.l;
                            UserId userId = post.m;
                            String str5 = post.s;
                            ArrayList<EntryAttachment> arrayList8 = post.z;
                            z2 = z5;
                            Poster poster2 = post.M;
                            l = l2;
                            ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
                            Iterator it5 = arrayList8.iterator();
                            while (it5.hasNext()) {
                                Attachment attachment2 = ((EntryAttachment) it5.next()).b;
                                LinkAttachment linkAttachment = attachment2 instanceof LinkAttachment ? (LinkAttachment) attachment2 : null;
                                if (linkAttachment != null && (snippetAttachment = linkAttachment.n) != null) {
                                    attachment2 = snippetAttachment;
                                }
                                arrayList9.add(attachment2);
                            }
                            ikc0Var2.B0 = userId;
                            if (poster2 == null) {
                                scc0Var2.b(arrayList9);
                                d02Var.getClass();
                                ikc0Var2.U7(d02.t(str5, true));
                            }
                            ikc0Var.ue(post.q != null || sbc0Var2.j);
                            ikc0Var.p0 = new PostingOrd(post.F, null, post.H, 2, null);
                            if (flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                                ikc0Var.e1(new Date(post.r * 1000));
                            }
                            ikc0Var.Q(flags.zb(512L) ? PostingVisibilityMode.FRIENDS : flags.zb(2147483648L) ? PostingVisibilityMode.BEST_FRIENDS : PostingVisibilityMode.ALL);
                            ikc0Var.m0 = flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                            ikc0Var.l0 = flags.zb(PlaybackStateCompat.ACTION_PREPARE);
                            Copyright copyright = post.O;
                            ikc0Var.S7(copyright != null ? copyright.b : null);
                            PostDonut postDonut = post.R;
                            Integer num2 = postDonut != null ? postDonut.d : null;
                            if (num2 != null) {
                                ikc0Var.w0 = true;
                                ikc0Var.M6(num2);
                            }
                        } else {
                            z2 = z5;
                            l = l2;
                            if (newsEntry4 instanceof CommentNewsEntry) {
                                ikc0Var.D0 = true;
                                CommentNewsEntry commentNewsEntry = (CommentNewsEntry) newsEntry4;
                                UserId userId2 = commentNewsEntry.i;
                                String str6 = commentNewsEntry.j;
                                List<Attachment> list = commentNewsEntry.k;
                                ikc0Var2.B0 = userId2;
                                scc0Var2.b(list);
                                d02Var.getClass();
                                ikc0Var2.U7(d02.t(str6, true));
                                hr80 hr80Var = new hr80();
                                lko0 lko0Var2 = ikc0Var.z;
                                if (lko0Var2 == null) {
                                    lko0Var2 = null;
                                }
                                q420 q420Var = lko0Var2.l;
                                if (q420Var == null) {
                                    q420Var = null;
                                }
                                q420Var.g = hr80Var;
                            }
                        }
                    }
                    umc0 umc0Var = (umc0) r1.w.getValue();
                    if (umc0Var != null) {
                        CharSequence text = umc0Var.b.getText();
                        Handler handler = umc0Var.d;
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new e0(6, umc0Var, text), 500L);
                        text.toString();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    sbc0 sbc0Var38 = r1.x;
                    if (sbc0Var38 == null) {
                        sbc0Var38 = null;
                    }
                    NewsEntry newsEntry5 = sbc0Var38.q;
                    Post post2 = newsEntry5 instanceof Post ? (Post) newsEntry5 : null;
                    if (post2 != null) {
                        r1.C7().i(Integer.valueOf(post2.n));
                        Object obj3 = r1.C;
                        ?? r4 = obj3;
                        if (obj3 == null) {
                            r4 = 0;
                        }
                        r4.V6(!post2.Pb());
                        r1.Y = post2.Pb();
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else {
                    z2 = z5;
                    l = l2;
                }
                sbc0Var3 = r1.x;
                if (sbc0Var3 == null) {
                    sbc0Var3 = null;
                }
                j = sbc0Var3.j0;
                if (j > 0) {
                    r1.e1(new Date(j * 1000));
                    if (r1.Um() != null) {
                        xuo0.a.getClass();
                        z4 = yl10.a(xuo0.a(), r1.Um().getTime());
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        postingFragment.mo(R.string.invalid_date);
                        r1.e1(null);
                    }
                }
                sbc0 sbc0Var39 = r1.x;
                poster = (sbc0Var39 != null ? null : sbc0Var39).s;
                if (poster != null) {
                    NewsEntry newsEntry6 = (sbc0Var39 == null ? null : sbc0Var39).q;
                    Post post3 = newsEntry6 instanceof Post ? (Post) newsEntry6 : null;
                    if (post3 == null || (str = post3.s) == null) {
                        if (sbc0Var39 == null) {
                            sbc0Var39 = null;
                        }
                        str = sbc0Var39.l;
                    }
                    tac0 tac0Var = r1.A;
                    ?? r6 = tac0Var;
                    if (tac0Var == null) {
                        r6 = 0;
                    }
                    r6.getClass();
                    int i2 = poster.b;
                    r6.i = Integer.valueOf(i2);
                    UserId userId3 = poster.c;
                    r6.j = userId3;
                    r6.m = new PosterBackground(poster.b, poster.c, poster.e, poster.d, null, poster.f, poster.g, null, 128, null);
                    ArrayList arrayList10 = r6.h;
                    if (arrayList10 != null) {
                        r13 = 1;
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    r6.c.di(Collections.singletonList(r6.m));
                    r13 = z3;
                    r6.d0(i2, poster.e, r13, userId3);
                    r1.T7(r13);
                    tac0 tac0Var2 = r1.A;
                    if (tac0Var2 == null) {
                        tac0Var2 = null;
                    }
                    tac0Var2.setText(str);
                    tac0Var2.Z(str.length());
                    Owner owner = poster.j;
                    if (owner != null) {
                        tac0Var2.x(owner);
                    }
                    r1.H0 = poster.k;
                    s3q0 s3q0Var3 = s3q0.a;
                }
                sbc0Var4 = r1.x;
                if (sbc0Var4 == null) {
                    sbc0Var4 = null;
                }
                if (sbc0Var4.v) {
                    r1.j0 = true;
                    wxu wxuVar3 = r1.y;
                    if (wxuVar3 == null) {
                        wxuVar3 = null;
                    }
                    wxuVar3.c.xg();
                }
                sbc0Var5 = r1.x;
                if (sbc0Var5 == null) {
                    sbc0Var5 = null;
                }
                if (sbc0Var5.w) {
                    r1.d0 = false;
                    Object obj4 = r1.C;
                    ?? r62 = obj4;
                    if (obj4 == null) {
                        r62 = 0;
                    }
                    r62.s1();
                }
                sbc0Var6 = r1.x;
                if (sbc0Var6 == null) {
                    sbc0Var6 = null;
                }
                if (sbc0Var6.x) {
                    r1.e0 = false;
                    Object obj5 = r1.C;
                    ?? r63 = obj5;
                    if (obj5 == null) {
                        r63 = 0;
                    }
                    r63.r5();
                }
                sbc0Var7 = r1.x;
                if (sbc0Var7 == null) {
                    sbc0Var7 = null;
                }
                if (sbc0Var7.y) {
                    r1.g0 = false;
                    Object obj6 = r1.C;
                    ?? r64 = obj6;
                    if (obj6 == null) {
                        r64 = 0;
                    }
                    r64.T0();
                }
                sbc0Var8 = r1.x;
                if (sbc0Var8 == null) {
                    sbc0Var8 = null;
                }
                if (sbc0Var8.Z) {
                    r1.f0 = false;
                    Object obj7 = r1.D;
                    ?? r65 = obj7;
                    if (obj7 == null) {
                        r65 = 0;
                    }
                    r65.b4();
                }
                sbc0Var9 = r1.x;
                if ((sbc0Var9 != null ? null : sbc0Var9).r != null) {
                    lko0 lko0Var3 = r1.z;
                    if (lko0Var3 == null) {
                        lko0Var3 = null;
                    }
                    q420 q420Var2 = lko0Var3.l;
                    if (q420Var2 == null) {
                        q420Var2 = null;
                    }
                    q420Var2.g = new hr80();
                    s3q0 s3q0Var4 = s3q0.a;
                }
                if (sbc0Var9 == null) {
                    sbc0Var9 = null;
                }
                num = sbc0Var9.z;
                if (num != null) {
                    r1.K = num.intValue();
                    s3q0 s3q0Var5 = s3q0.a;
                }
                sbc0Var10 = r1.x;
                if (sbc0Var10 == null) {
                    sbc0Var10 = null;
                }
                if (sbc0Var10.V) {
                    Object obj8 = r1.D;
                    ?? r66 = obj8;
                    if (obj8 == null) {
                        r66 = 0;
                    }
                    r66.l4();
                }
                sbc0Var11 = r1.x;
                if (sbc0Var11 == null) {
                    sbc0Var11 = null;
                }
                if (sbc0Var11.X) {
                    Object obj9 = r1.D;
                    ?? r67 = obj9;
                    if (obj9 == null) {
                        r67 = 0;
                    }
                    r67.G3();
                }
                sbc0Var12 = r1.x;
                if (sbc0Var12 == null) {
                    sbc0Var12 = null;
                }
                if (sbc0Var12.W) {
                    Object obj10 = r1.D;
                    ?? r68 = obj10;
                    if (obj10 == null) {
                        r68 = 0;
                    }
                    r68.O5();
                }
                obj = r1.D;
                ?? r69 = obj;
                if (obj == null) {
                    r69 = 0;
                }
                sbc0Var13 = r1.x;
                if (sbc0Var13 == null) {
                    sbc0Var13 = null;
                }
                r69.p4(!sbc0Var13.Y);
                sbc0Var14 = r1.x;
                if (sbc0Var14 == null) {
                    sbc0Var14 = null;
                }
                if (sbc0Var14.a0) {
                    Object obj11 = r1.D;
                    ?? r610 = obj11;
                    if (obj11 == null) {
                        r610 = 0;
                    }
                    r610.M3();
                }
                sbc0Var15 = r1.x;
                if (sbc0Var15 == null) {
                    sbc0Var15 = null;
                }
                if (sbc0Var15.b0) {
                    Object obj12 = r1.D;
                    ?? r611 = obj12;
                    if (obj12 == null) {
                        r611 = 0;
                    }
                    r611.gk();
                }
                sbc0Var16 = r1.x;
                if (sbc0Var16 == null) {
                    sbc0Var16 = null;
                }
                if (sbc0Var16.c0) {
                    Object obj13 = r1.D;
                    ?? r612 = obj13;
                    if (obj13 == null) {
                        r612 = 0;
                    }
                    r612.p6();
                }
                sbc0Var17 = r1.x;
                if (sbc0Var17 == null) {
                    sbc0Var17 = null;
                }
                if (sbc0Var17.d0) {
                    Object obj14 = r1.D;
                    ?? r613 = obj14;
                    if (obj14 == null) {
                        r613 = 0;
                    }
                    r613.Z9();
                }
                sbc0Var18 = r1.x;
                if (sbc0Var18 == null) {
                    sbc0Var18 = null;
                }
                if (sbc0Var18.e0) {
                    Object obj15 = r1.D;
                    ?? r614 = obj15;
                    if (obj15 == null) {
                        r614 = 0;
                    }
                    r614.g7();
                }
                sbc0Var19 = r1.x;
                if (sbc0Var19 == null) {
                    sbc0Var19 = null;
                }
                if (sbc0Var19.f0) {
                    if (z2) {
                        Object obj16 = r1.C;
                        ?? r615 = obj16;
                        if (obj16 == null) {
                            r615 = 0;
                        }
                        r615.k2(false);
                    } else {
                        Object obj17 = r1.D;
                        ?? r616 = obj17;
                        if (obj17 == null) {
                            r616 = 0;
                        }
                        r616.k2(false);
                    }
                }
                postingFragment.go(new f880(r1, 10));
                int i3 = 11;
                if (l != null) {
                    sbc0 sbc0Var40 = r1.x;
                    if (sbc0Var40 == null) {
                        sbc0Var40 = null;
                    }
                    if (fkq0.c(sbc0Var40.f)) {
                        sbc0 sbc0Var41 = r1.x;
                        boolean z7 = (sbc0Var41 == null ? null : sbc0Var41).t;
                        boolean z8 = (sbc0Var41 == null ? null : sbc0Var41).u;
                        wxu wxuVar4 = r1.y;
                        if (wxuVar4 == null) {
                            wxuVar4 = null;
                        }
                        if (sbc0Var41 == null) {
                            sbc0Var41 = null;
                        }
                        wxuVar4.Z(sbc0Var41.h, z7, z8);
                    } else {
                        wxu wxuVar5 = r1.y;
                        if (wxuVar5 == null) {
                            wxuVar5 = null;
                        }
                        if (r1.F7()) {
                            wxuVar5.w3((r3 & 1) != 0, false);
                            wxuVar5.i = hd60.a().a().y();
                        } else {
                            sbc0 sbc0Var42 = r1.x;
                            if (sbc0Var42 == null) {
                                sbc0Var42 = null;
                            }
                            if (!epx.f(sbc0Var42.e, hd60.a().a().y())) {
                                if (z2) {
                                    sbc0 sbc0Var43 = r1.x;
                                    if (sbc0Var43 == null) {
                                        sbc0Var43 = null;
                                    }
                                }
                                wxuVar5.f0();
                                sbc0Var23 = r1.x;
                                if (sbc0Var23 == null) {
                                    sbc0Var23 = null;
                                }
                                if (!fkq0.c(sbc0Var23.e) && (cVar = wxuVar5.h) != null) {
                                    cVar.r(true);
                                }
                            }
                            wxuVar5.d0(new Target(hd60.a().a().H()));
                            wxuVar5.f0();
                            sbc0Var23 = r1.x;
                            if (sbc0Var23 == null) {
                            }
                            if (!fkq0.c(sbc0Var23.e)) {
                                cVar.r(true);
                            }
                        }
                        s3q0 s3q0Var6 = s3q0.a;
                    }
                } else {
                    bfc0 bfc0Var = sec0.a;
                    final long longValue = l.longValue();
                    final bfc0 bfc0Var2 = sec0.a;
                    bfc0Var2.getClass();
                    l h = new v(new Callable() { // from class: xsna.wec0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r12v0, types: [xsna.lec0] */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Cursor query;
                            SQLiteDatabase readableDatabase = ((SQLiteOpenHelper) bfc0.this.a.getValue()).getReadableDatabase();
                            long j2 = longValue;
                            if (readableDatabase != null && (query = readableDatabase.query("draft", null, "draft_id = ?", new String[]{String.valueOf(j2)}, null, null, null)) != null) {
                                try {
                                    if (query.moveToFirst()) {
                                        long C = fl3.C(query, "draft_id");
                                        UserId userId4 = new UserId(fl3.C(query, "uid"));
                                        Date date = new Date(fl3.C(query, "updated_ts"));
                                        String E = fl3.E(query, "text");
                                        String F = fl3.F(query, "attachments");
                                        ArrayList c = F != null ? bfc0.c(new JSONArray(F)) : null;
                                        String F2 = fl3.F(query, "geo");
                                        GeoAttachment geoAttachment = F2 != null ? new GeoAttachment(new JSONObject(F2)) : null;
                                        String F3 = fl3.F(query, "copyright");
                                        Integer B = fl3.B(query, "poster_background_id");
                                        Long D = fl3.D(query, "poster_owner_id");
                                        UserId userId5 = D != null ? new UserId(D.longValue()) : null;
                                        String F4 = fl3.F(query, "poster_bg_path");
                                        Integer B2 = fl3.B(query, "poster_text_color");
                                        String F5 = fl3.F(query, "author");
                                        Target target = F5 != null ? new Target(new JSONObject(F5)) : null;
                                        long C2 = fl3.C(query, "postpone");
                                        Date date2 = C2 == 0 ? null : new Date(C2);
                                        boolean x = fl3.x(query, "export_fb");
                                        boolean x2 = fl3.x(query, "export_tw");
                                        PostingVisibilityMode.a aVar2 = PostingVisibilityMode.Companion;
                                        int A = fl3.A(query, "only_friends");
                                        aVar2.getClass();
                                        PostingVisibilityMode a = PostingVisibilityMode.a.a(A);
                                        boolean x3 = fl3.x(query, "signed");
                                        boolean x4 = fl3.x(query, "comments_closed");
                                        boolean x5 = fl3.x(query, "notifications_disabled");
                                        Integer B3 = fl3.B(query, "paid_duration_id");
                                        Boolean valueOf = Boolean.valueOf(fl3.x(query, "grid_layout"));
                                        String F6 = fl3.F(query, "advertising_ord");
                                        PostingOrd postingOrd = F6 != null ? new PostingOrd(new JSONObject(F6)) : null;
                                        String F7 = fl3.F(query, "images_crops");
                                        r3 = new lec0(C, userId4, date, E, c, geoAttachment, F3, B, userId5, F4, B2, target, date2, x, x2, a, x3, x4, x5, B3, valueOf, postingOrd, F7 != null ? (CropsForRatio) GsonHolder.a().fromJson(F7, new afc0().getType()) : null);
                                    }
                                    query.close();
                                    if (r3 != null) {
                                        return r3;
                                    }
                                } catch (Throwable th) {
                                    query.close();
                                    throw th;
                                }
                            }
                            throw new IllegalArgumentException(defpackage.k0.a(j2, "No draft for draftId: "));
                        }
                    }).m(io.reactivex.rxjava3.android.schedulers.a.b()).q(asu0.a.c()).h(new a960(new c3v(11), 9));
                    aVar.getClass();
                    x B = x.B(h, new v(new ha20(aVar, 1)), new com.vk.movika.sdk.android.defaultplayer.interactive.c(25));
                    lav lavVar = new lav(r1, 20);
                    int i4 = kwg0.a;
                    postingFragment.eo(B.subscribe(lavVar, new iwg0()));
                    s3q0 s3q0Var7 = s3q0.a;
                    new b.d("posting_draft_open").e();
                }
                if (((Boolean) r1.T.getValue()).booleanValue() && !z2) {
                    obj2 = r1.D;
                    ?? r617 = obj2;
                    if (obj2 == null) {
                        r617 = 0;
                    }
                    r617.Pi(((Number) r1.S.getValue()).intValue());
                }
                sbc0Var20 = r1.x;
                if (sbc0Var20 == null) {
                    sbc0Var20 = null;
                }
                if (sbc0Var20.K) {
                    aVar.getClass();
                    q h2 = wmi0.a.h("posterSettings");
                    p350 p350Var = new p350(r1, 8);
                    int i5 = kwg0.a;
                    io.reactivex.rxjava3.disposables.c subscribe = h2.subscribe(p350Var, new iwg0());
                    if (subscribe != null) {
                        postingFragment.eo(subscribe);
                        s3q0 s3q0Var8 = s3q0.a;
                    }
                }
                sbc0Var21 = r1.x;
                if (sbc0Var21 == null) {
                    sbc0Var21 = null;
                }
                r1.z0 = sbc0Var21.N;
                postingFragment.eo(a.c(r1.d, r1.Qj(), null, 58).subscribe(new r7a0(new n3b0(r1, 3), 4), new d750(new hb40((Object) r1, i3), 6)));
                s3q0 s3q0Var9 = s3q0.a;
                r1.h0 = false;
                r1.Ca();
                if (z2) {
                    r1.u7();
                }
                sbc0Var22 = r1.x;
                if (sbc0Var22 == null) {
                    sbc0Var22 = null;
                }
                postingFragment.requireView().post(new lfc0(sbc0Var22.H, postingFragment));
                this.g0 = getActivity() instanceof TabletDialogActivity;
                onConfigurationChanged(getResources().getConfiguration());
                Context context = view.getContext();
                int d = e3m.d(android.R.attr.actionBarSize, context) - context.getResources().getDimensionPixelSize(R.dimen.newsfeed_newpost_shade_shadow_height);
                g420Var = this.Z;
                if (g420Var == null) {
                    g420Var = null;
                }
                g420Var.i(d);
                oko0 jo = jo();
                xjg0 xjg0Var = new xjg0() { // from class: xsna.ifc0
                    @Override // xsna.xjg0
                    public final void a(wjg0 wjg0Var) {
                        ikc0 ikc0Var3 = PostingFragment.this.h0;
                        if (ikc0Var3 == null || !(wjg0Var instanceof wjg0.a)) {
                            return;
                        }
                        ikc0Var3.a(new io.reactivex.rxjava3.internal.operators.single.b(new gl60(ikc0Var3, wjg0Var)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xj50(new isb0(2, ikc0Var3, wjg0Var), 8), new x150(new uv20(wjg0Var, 26), 5)));
                    }
                };
                selectionChangeEditText = jo.c;
                if (selectionChangeEditText != null) {
                    bpn0 bpn0Var = zgv0.a.a;
                    if (bpn0Var == null) {
                        bpn0Var = null;
                    }
                    cra a = ((zgv0) bpn0Var.getValue()).a();
                    ((HashSet) a.b).add(MimeType.IMAGE);
                    ((HashSet) a.c).add(xjg0Var);
                    a.a(selectionChangeEditText);
                }
                FragmentActivity activity = getActivity();
                vKActivity = !(activity instanceof VKActivity) ? (VKActivity) activity : null;
                if (vKActivity == null) {
                    vKActivity.r = false;
                    return;
                }
                return;
            }
        }
        z = false;
        if (l2 == null) {
        }
        sbc0Var = r1.x;
        if (sbc0Var == null) {
        }
        if (myc0.f(sbc0Var.l)) {
        }
        sbc0Var2 = r1.x;
        if ((sbc0Var2 != null ? null : sbc0Var2).q == null) {
        }
        sbc0Var3 = r1.x;
        if (sbc0Var3 == null) {
        }
        j = sbc0Var3.j0;
        if (j > 0) {
        }
        sbc0 sbc0Var392 = r1.x;
        poster = (sbc0Var392 != null ? null : sbc0Var392).s;
        if (poster != null) {
        }
        sbc0Var4 = r1.x;
        if (sbc0Var4 == null) {
        }
        if (sbc0Var4.v) {
        }
        sbc0Var5 = r1.x;
        if (sbc0Var5 == null) {
        }
        if (sbc0Var5.w) {
        }
        sbc0Var6 = r1.x;
        if (sbc0Var6 == null) {
        }
        if (sbc0Var6.x) {
        }
        sbc0Var7 = r1.x;
        if (sbc0Var7 == null) {
        }
        if (sbc0Var7.y) {
        }
        sbc0Var8 = r1.x;
        if (sbc0Var8 == null) {
        }
        if (sbc0Var8.Z) {
        }
        sbc0Var9 = r1.x;
        if ((sbc0Var9 != null ? null : sbc0Var9).r != null) {
        }
        if (sbc0Var9 == null) {
        }
        num = sbc0Var9.z;
        if (num != null) {
        }
        sbc0Var10 = r1.x;
        if (sbc0Var10 == null) {
        }
        if (sbc0Var10.V) {
        }
        sbc0Var11 = r1.x;
        if (sbc0Var11 == null) {
        }
        if (sbc0Var11.X) {
        }
        sbc0Var12 = r1.x;
        if (sbc0Var12 == null) {
        }
        if (sbc0Var12.W) {
        }
        obj = r1.D;
        ?? r692 = obj;
        if (obj == null) {
        }
        sbc0Var13 = r1.x;
        if (sbc0Var13 == null) {
        }
        r692.p4(!sbc0Var13.Y);
        sbc0Var14 = r1.x;
        if (sbc0Var14 == null) {
        }
        if (sbc0Var14.a0) {
        }
        sbc0Var15 = r1.x;
        if (sbc0Var15 == null) {
        }
        if (sbc0Var15.b0) {
        }
        sbc0Var16 = r1.x;
        if (sbc0Var16 == null) {
        }
        if (sbc0Var16.c0) {
        }
        sbc0Var17 = r1.x;
        if (sbc0Var17 == null) {
        }
        if (sbc0Var17.d0) {
        }
        sbc0Var18 = r1.x;
        if (sbc0Var18 == null) {
        }
        if (sbc0Var18.e0) {
        }
        sbc0Var19 = r1.x;
        if (sbc0Var19 == null) {
        }
        if (sbc0Var19.f0) {
        }
        postingFragment.go(new f880(r1, 10));
        int i32 = 11;
        if (l != null) {
        }
        if (((Boolean) r1.T.getValue()).booleanValue()) {
            obj2 = r1.D;
            ?? r6172 = obj2;
            if (obj2 == null) {
            }
            r6172.Pi(((Number) r1.S.getValue()).intValue());
        }
        sbc0Var20 = r1.x;
        if (sbc0Var20 == null) {
        }
        if (sbc0Var20.K) {
        }
        sbc0Var21 = r1.x;
        if (sbc0Var21 == null) {
        }
        r1.z0 = sbc0Var21.N;
        postingFragment.eo(a.c(r1.d, r1.Qj(), null, 58).subscribe(new r7a0(new n3b0(r1, 3), 4), new d750(new hb40((Object) r1, i32), 6)));
        s3q0 s3q0Var92 = s3q0.a;
        r1.h0 = false;
        r1.Ca();
        if (z2) {
        }
        sbc0Var22 = r1.x;
        if (sbc0Var22 == null) {
        }
        postingFragment.requireView().post(new lfc0(sbc0Var22.H, postingFragment));
        this.g0 = getActivity() instanceof TabletDialogActivity;
        onConfigurationChanged(getResources().getConfiguration());
        Context context2 = view.getContext();
        int d2 = e3m.d(android.R.attr.actionBarSize, context2) - context2.getResources().getDimensionPixelSize(R.dimen.newsfeed_newpost_shade_shadow_height);
        g420Var = this.Z;
        if (g420Var == null) {
        }
        g420Var.i(d2);
        oko0 jo2 = jo();
        xjg0 xjg0Var2 = new xjg0() { // from class: xsna.ifc0
            @Override // xsna.xjg0
            public final void a(wjg0 wjg0Var) {
                ikc0 ikc0Var3 = PostingFragment.this.h0;
                if (ikc0Var3 == null || !(wjg0Var instanceof wjg0.a)) {
                    return;
                }
                ikc0Var3.a(new io.reactivex.rxjava3.internal.operators.single.b(new gl60(ikc0Var3, wjg0Var)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xj50(new isb0(2, ikc0Var3, wjg0Var), 8), new x150(new uv20(wjg0Var, 26), 5)));
            }
        };
        selectionChangeEditText = jo2.c;
        if (selectionChangeEditText != null) {
        }
        FragmentActivity activity2 = getActivity();
        if (!(activity2 instanceof VKActivity)) {
        }
        if (vKActivity == null) {
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        ikc0 ikc0Var = this.h0;
        if (ikc0Var == null || bundle == null) {
            return;
        }
        ikc0Var.g.g(bundle);
    }
}
