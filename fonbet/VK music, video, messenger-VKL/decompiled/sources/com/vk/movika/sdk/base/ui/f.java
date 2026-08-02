package com.vk.movika.sdk.base.ui;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.channels.impl.channel_screen.search.ChannelMsgSearchFragment;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.common.Peer;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.mapper.attachment.di.AttachmentMappersComponentImpl;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.features.colorgrading.b;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ag00;
import xsna.al40;
import xsna.atd;
import xsna.b6m;
import xsna.bce;
import xsna.bqp0;
import xsna.bzb0;
import xsna.c1d;
import xsna.c9o0;
import xsna.cg00;
import xsna.clt;
import xsna.d9f;
import xsna.du10;
import xsna.due;
import xsna.e43;
import xsna.ekd;
import xsna.es7;
import xsna.ez20;
import xsna.fpf0;
import xsna.fvu;
import xsna.gzs;
import xsna.h0d;
import xsna.h7m;
import xsna.i0n0;
import xsna.ix2;
import xsna.j5g;
import xsna.j96;
import xsna.jpd;
import xsna.k7i;
import xsna.k7m;
import xsna.k9p0;
import xsna.ka;
import xsna.ki3;
import xsna.kke;
import xsna.kni0;
import xsna.l5q0;
import xsna.lak;
import xsna.lh1;
import xsna.ltj0;
import xsna.m7m;
import xsna.m99;
import xsna.mhd;
import xsna.n200;
import xsna.n830;
import xsna.nxd0;
import xsna.oga0;
import xsna.p1e;
import xsna.pbe;
import xsna.pje;
import xsna.q8p;
import xsna.qbm;
import xsna.qcy;
import xsna.rab0;
import xsna.s01;
import xsna.s3q0;
import xsna.t53;
import xsna.tej0;
import xsna.tij;
import xsna.tj70;
import xsna.uax0;
import xsna.ucg0;
import xsna.ueq;
import xsna.v19;
import xsna.v49;
import xsna.vi3;
import xsna.w8o0;
import xsna.wa6;
import xsna.wi9;
import xsna.xkg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, xsna.owa0] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                y yVar = (y) obj;
                Chapter chapter = yVar.i;
                if (chapter != null) {
                    yVar.d.t.j(chapter);
                }
                return s3q0.a;
            case 1:
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                return Boolean.valueOf(((AboutAppFragment) obj).requireArguments().getBoolean("SHOW_UNVERIFIED", false));
            case 2:
                int i2 = AbstractClipsGridListFragment.e0;
                ((AbstractClipsGridListFragment) obj).ko().a();
                return s3q0.a;
            case 3:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj;
                int i3 = AlbumDetailsFragment.p0;
                return new lh1((oga0) albumDetailsFragment.c0.getValue(), albumDetailsFragment.io());
            case 4:
                return (WebApiApplication) ((t53.g.b) obj).l;
            case 5:
                ArchiveFragment archiveFragment = (ArchiveFragment) obj;
                int i4 = ArchiveFragment.e0;
                return new ki3((vi3) archiveFragment.T.getValue(), archiveFragment.getFeature().e, new ix2(archiveFragment, 1));
            case 6:
                return (ucg0) ((AttachVideoFragment.b) obj).B.getValue();
            case 7:
                qcy<Object>[] qcyVarArr2 = AttachmentMappersComponentImpl.g;
                return new uax0(((AttachmentMappersComponentImpl) obj).f3());
            case 8:
                return ((CommonEditorComponent) ((k7m) m7m.c((View) ((j96) obj).g.invoke())).a(fpf0.a(CommonEditorComponent.class))).Zc();
            case 9:
                return new s01((wa6) obj, 1);
            case 10:
                ((es7) obj).d(false);
                return s3q0.a;
            case 11:
                return new bzb0(((v19) obj).b);
            case 12:
                return ((m99) obj).e.b(null, true);
            case 13:
                return ((v49) obj).b.j();
            case 14:
                int i5 = ChannelMsgSearchFragment.Q;
                return Long.valueOf(((ChannelMsgSearchFragment) obj).requireArguments().getLong("channel_id"));
            case 15:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) obj;
                int i6 = ChatClipsReplyFragment.T;
                try {
                    chatClipsReplyFragment.tn();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
                return s3q0.a;
            case 16:
                ChatFragment.d dVar = ChatFragment.w1;
                Bundle arguments = ((ChatFragment) obj).getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable("owner_id", Peer.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = arguments.getParcelable("owner_id");
                        parcelable = (Peer) (parcelable3 instanceof Peer ? parcelable3 : null);
                    }
                    Peer peer = (Peer) parcelable;
                    if (peer != null) {
                        return peer;
                    }
                }
                return Peer.Unknown.e;
            case 17:
                h0d h0dVar = (h0d) obj;
                return new c1d(h0dVar.a, h0dVar.b);
            case 18:
                return ((ClipsViewerComponent) ((ekd) obj).g.getValue()).Y();
            case 19:
                jpd jpdVar = (jpd) obj;
                jpdVar.c.s0(true);
                atd atdVar = jpdVar.k;
                atdVar.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                ka kaVar = new ka(atdVar, 22);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(kaVar);
                jpdVar.b.k3(false);
                jpdVar.e.a.getClass();
                xkg.c.m(null, true);
                CameraUIView cameraUIView = jpdVar.c;
                cameraUIView.Z0 = false;
                cameraUIView.Y();
                return s3q0.a;
            case 20:
                Integer num = ClipsEditorFragment.W;
                return ((ClipsConfigAuthorsComponent) m7m.d((ClipsEditorFragment) obj).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 21:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) obj;
                return new bce(bVar, bVar.h.b(), new pbe(1, bVar.getFeature(), com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
            case 22:
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                return (ClipsFavoritesComponent) m7m.d((ClipsGridFragment) obj).mo408a(fpf0.a(ClipsFavoritesComponent.class));
            case 23:
                kke kkeVar = (kke) obj;
                List<pje> list = kkeVar.d;
                tj70 tj70Var = new tj70();
                ?? r8 = kkeVar.f;
                wi9 wi9Var = new wi9((mhd) r8.getValue());
                du10 du10Var = new du10((mhd) r8.getValue(), (p1e) kkeVar.j.getValue());
                ltj0 ltj0Var = new ltj0(kkeVar.c(), kkeVar.c, (qbm) kkeVar.i.getValue());
                cg00 cg00Var = new cg00(kkeVar.c());
                n200 n200Var = new n200(kkeVar.c());
                ag00 ag00Var = new ag00(kkeVar.c());
                i0n0 i0n0Var = new i0n0(kkeVar.c());
                k9p0 k9p0Var = new k9p0(kkeVar.c());
                ?? r2 = kkeVar.h;
                return j5g.u0(e43.l(tj70Var, wi9Var, du10Var, ltj0Var, cg00Var, n200Var, ag00Var, i0n0Var, k9p0Var, new c9o0((d9f) r2.getValue()), new w8o0((d9f) r2.getValue()), new rab0((due) kkeVar.g.getValue(), kkeVar.c(), (mhd) r8.getValue()), new nxd0(kkeVar.c()), new fvu(kkeVar.c()), new al40(kkeVar.c()), new q8p(kkeVar.c()), new k7i(kkeVar.c()), new clt(), new n830(kkeVar.c()), new kni0(kkeVar.c()), new tej0(kkeVar.c()), new bqp0(kkeVar.c()), new ueq(kkeVar.c()), new l5q0()), list);
            case 24:
                ez20 ez20Var = ((com.vk.clips.playlists.folders.root.a) obj).g;
                if (ez20Var != null) {
                    ez20Var.Ff("ClipsPlaylistsFoldersMviBottomSheet");
                }
                return s3q0.a;
            case 25:
                ColorGradingTool colorGradingTool = (ColorGradingTool) obj;
                colorGradingTool.n.b(b.a.a);
                colorGradingTool.c.c(false);
                return s3q0.a;
            case 26:
                return ((SharingComponent) ((h7m) obj).a(fpf0.a(SharingComponent.class))).v();
            case 27:
                b6m.a().f(((tij) obj).e);
                return s3q0.a;
            case 28:
                return (TextInputLayout) ((lak) obj).findViewById(R.id.voip_rooms_time_limit_input_layout);
            default:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
        }
    }
}
