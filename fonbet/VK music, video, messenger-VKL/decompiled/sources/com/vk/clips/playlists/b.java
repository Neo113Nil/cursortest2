package com.vk.clips.playlists;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.clips.playlists.a;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.aee;
import xsna.awe;
import xsna.bve;
import xsna.f5z;
import xsna.gzs;
import xsna.izs;
import xsna.jve;
import xsna.nmv;
import xsna.nue;
import xsna.qjg;
import xsna.s3q0;
import xsna.uue;
import xsna.vve;
import xsna.w35;
import xsna.xg5;

/* compiled from: ClipsPlaylistsViewProviderImpl.kt */
/* loaded from: classes16.dex */
public final class b implements awe {
    public final vve a;
    public final com.vk.clips.playlists.a b;

    /* compiled from: ClipsPlaylistsViewProviderImpl.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<nue, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(nue nueVar) {
            ((uue) this.receiver).C(nueVar);
            return s3q0.a;
        }
    }

    /* compiled from: ClipsPlaylistsViewProviderImpl.kt */
    /* renamed from: com.vk.clips.playlists.b$b, reason: collision with other inner class name */
    public static final class C0624b extends aee {
        public final /* synthetic */ uue l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0624b(uue uueVar, ComposeView composeView) {
            super(composeView);
            this.l = uueVar;
        }

        @Override // xsna.aee
        public final void V5(nmv nmvVar) {
            if (nmvVar instanceof ClipsGridHeaderEntry.b) {
                UserId userId = ((ClipsGridHeaderEntry.b) nmvVar).a;
                this.l.C(new nue.g(userId, xg5.a().a(userId)));
                return;
            }
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.e, new Object[]{"bind wrong data for clip entry (expected ClipsGridHeaderEntry.Playlist, got " + qjg.a(nmvVar) + ')'});
        }
    }

    public b(vve vveVar, com.vk.clips.playlists.a aVar) {
        this.a = vveVar;
        this.b = aVar;
    }

    @Override // xsna.awe
    public final aee a(final Context context, final ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams, gzs<Boolean> gzsVar, f5z f5zVar, gzs<s3q0> gzsVar2) {
        boolean z;
        Context context2 = context;
        while (true) {
            z = context2 instanceof AppCompatActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        final AppCompatActivity appCompatActivity = (AppCompatActivity) (z ? (Activity) context2 : null);
        final jve jveVar = new jve(context, f5zVar, clipsPlaylistsSmallFoldersLaunchParams.d);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ComposeView composeView = jveVar.d;
        composeView.setLayoutParams(layoutParams);
        composeView.setClipChildren(false);
        composeView.setClipToOutline(false);
        composeView.setTag("PlaylistsRootContainer");
        uue uueVar = new uue(clipsPlaylistsSmallFoldersLaunchParams);
        uueVar.A();
        uueVar.h.a(new izs() { // from class: xsna.xve
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                boolean z2;
                com.vk.clips.playlists.a aVar = com.vk.clips.playlists.b.this.b;
                bve bveVar = (bve) obj;
                boolean z3 = bveVar instanceof bve.a;
                AppCompatActivity appCompatActivity2 = appCompatActivity;
                if (z3) {
                    Context context3 = jveVar.c;
                    UserId userId = ((bve.a) bveVar).a;
                    ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams2 = clipsPlaylistsSmallFoldersLaunchParams;
                    aVar.a(context3, new ClipsPlaylistNamingLaunchParams(userId, "", clipsPlaylistsSmallFoldersLaunchParams2.d, "playlist_result", 0, null, 48, null), appCompatActivity2.getSupportFragmentManager(), null);
                    final boolean z4 = clipsPlaylistsSmallFoldersLaunchParams2.d;
                    Context context4 = context;
                    Context context5 = context4;
                    while (true) {
                        z2 = context5 instanceof FragmentActivity;
                        if (z2 || !(context5 instanceof ContextWrapper)) {
                            break;
                        }
                        context5 = ((ContextWrapper) context5).getBaseContext();
                    }
                    FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) context5 : null);
                    final FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    final a.InterfaceC0623a c = aVar.c(context4, new yve(fragmentActivity, 0));
                    supportFragmentManager.l0("playlist_result", fragmentActivity, new pcs() { // from class: xsna.zve
                        @Override // xsna.pcs
                        public final void p(Bundle bundle, String str) {
                            Parcelable parcelable;
                            Object parcelable2;
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = bundle.getParcelable("playlist_selected", ClipsPlaylist.class);
                                parcelable = (Parcelable) parcelable2;
                            } else {
                                Parcelable parcelable3 = bundle.getParcelable("playlist_selected");
                                if (!(parcelable3 instanceof ClipsPlaylist)) {
                                    parcelable3 = null;
                                }
                                parcelable = (ClipsPlaylist) parcelable3;
                            }
                            ClipsPlaylist clipsPlaylist = (ClipsPlaylist) parcelable;
                            if (clipsPlaylist != null) {
                                c.a(new ClipsPlaylistPickerParams.AddClips(clipsPlaylist, z4));
                            }
                            FragmentManager.this.f("playlist_result");
                        }
                    });
                } else {
                    if (!(bveVar instanceof bve.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipsRouter.c(g620.f().a(), appCompatActivity2, Collections.singletonList(new ClipFeedTab.Playlist.FromBeginning(((bve.b) bveVar).a)), null, null, fpf0.a(ClipFeedTab.Playlist.FromBeginning.class), null, null, true, null, 1900);
                }
                return s3q0.a;
            }
        }, f5zVar);
        uueVar.i.a(new w35(this, clipsPlaylistsSmallFoldersLaunchParams, gzsVar2, uueVar, gzsVar, 1), f5zVar);
        uueVar.A();
        jveVar.f(uueVar.c.g(), new a(1, uueVar, uue.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        return new C0624b(uueVar, jveVar.c());
    }
}
