package com.vk.video.ui.upload.impl.publish.presentation.publish.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import com.vk.clips.upload.vk.ui.api.ClipUploadScreenRuntimeConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragment;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseResult;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragment;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseResult;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorItem;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionArguments;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragment;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsResult;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragment;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a840;
import xsna.ace0;
import xsna.akd0;
import xsna.bce0;
import xsna.bn50;
import xsna.bnc0;
import xsna.c5g;
import xsna.dbe0;
import xsna.fks0;
import xsna.fnj;
import xsna.fpf0;
import xsna.gd70;
import xsna.h7u0;
import xsna.hbe0;
import xsna.iah0;
import xsna.ibe0;
import xsna.ies;
import xsna.ikv0;
import xsna.izs;
import xsna.jw30;
import xsna.mgz;
import xsna.msy;
import xsna.nt10;
import xsna.nwy;
import xsna.obe0;
import xsna.oz50;
import xsna.pkd;
import xsna.qcy;
import xsna.s3q0;
import xsna.sbe0;
import xsna.so40;
import xsna.sw50;
import xsna.u1h0;
import xsna.uij;
import xsna.up2;
import xsna.v95;
import xsna.vee0;
import xsna.w910;
import xsna.wcy;
import xsna.xpi;
import xsna.xq70;
import xsna.y5;

/* compiled from: PublishFragment.kt */
/* loaded from: classes7.dex */
public final class PublishFragment extends FragmentImpl implements ies {
    public static final /* synthetic */ qcy<Object>[] Q;
    public final Object N;
    public final u1h0 O;
    public final Object P;

    /* compiled from: PublishFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: PublishFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<dbe0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(dbe0 dbe0Var) {
            ((bn50) this.receiver).b(dbe0Var);
            return s3q0.a;
        }
    }

    /* compiled from: PublishFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<sbe0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(sbe0 sbe0Var) {
            sbe0 sbe0Var2 = sbe0Var;
            PublishFragment publishFragment = (PublishFragment) this.receiver;
            qcy<Object>[] qcyVarArr = PublishFragment.Q;
            publishFragment.getClass();
            if (sbe0Var2 instanceof sbe0.n) {
                sbe0.n nVar = (sbe0.n) sbe0Var2;
                ikv0.c cVar = nVar.a;
                ikv0.d dVar = nVar.b;
                FragmentActivity kn = publishFragment.kn();
                ikv0.a aVar = new ikv0.a(kn);
                if (cVar != null) {
                    aVar.t = cVar;
                }
                if (dVar != null) {
                    aVar.u = dVar;
                }
                HashSet hashSet = iah0.a;
                if (fnj.d(kn)) {
                    aVar.k = 1;
                    aVar.g(1);
                }
                aVar.b().c();
            } else {
                int i = 4;
                if (sbe0Var2 instanceof sbe0.c) {
                    sbe0.c cVar2 = (sbe0.c) sbe0Var2;
                    List<VideoAuthorDo> list = cVar2.a;
                    int i2 = cVar2.b;
                    boolean z = cVar2.c;
                    FragmentActivity kn2 = publishFragment.kn();
                    FragmentManager supportFragmentManager = kn2.getSupportFragmentManager();
                    supportFragmentManager.f("AuthorResult.MODAL_RESULT_REQUEST_KEY");
                    supportFragmentManager.e("AuthorResult.MODAL_RESULT_REQUEST_KEY");
                    supportFragmentManager.l0("AuthorResult.MODAL_RESULT_REQUEST_KEY", kn2, new a840(publishFragment, i));
                    Context requireContext = publishFragment.requireContext();
                    List<VideoAuthorDo> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (VideoAuthorDo videoAuthorDo : list2) {
                        arrayList.add(new AuthorItem(videoAuthorDo.d, videoAuthorDo.e, videoAuthorDo.b));
                    }
                    new b.a(requireContext, new AuthorArguments(arrayList, i2, z)).a0(new jw30(publishFragment, 22)).I0(null);
                } else if (sbe0Var2 instanceof sbe0.b) {
                    SettingsArguments settingsArguments = ((sbe0.b) sbe0Var2).a;
                    SettingsFragment.a aVar2 = new SettingsFragment.a(SettingsFragment.class, null, null);
                    aVar2.j.putParcelable("arguments", settingsArguments);
                    aVar2.g(4, publishFragment);
                } else if (sbe0Var2 instanceof sbe0.j) {
                    sbe0.j jVar = (sbe0.j) sbe0Var2;
                    AlbumChooseArguments.WithInitialAlbums withInitialAlbums = new AlbumChooseArguments.WithInitialAlbums(jVar.c, jVar.b, jVar.a ? AlbumChooseArguments.EntryPoint.VIDEO_UPLOAD : AlbumChooseArguments.EntryPoint.VIDEO_EDIT);
                    AlbumChooseFragment.a aVar3 = new AlbumChooseFragment.a(AlbumChooseFragment.class, null, null);
                    aVar3.j.putParcelable("arguments", withInitialAlbums);
                    aVar3.g(3, publishFragment);
                } else if (sbe0Var2 instanceof sbe0.i) {
                    sbe0.i iVar = (sbe0.i) sbe0Var2;
                    PrivacySetting privacySetting = iVar.b;
                    DonutLevel donutLevel = iVar.c;
                    UserId userId = iVar.a;
                    privacySetting.c = publishFragment.requireContext().getString(R.string.video_publish_edit_privacy);
                    nwy nwyVar = publishFragment.eo().i;
                    qcy<Object>[] qcyVarArr2 = PublishFragmentInternalComponent.w;
                    qcy<Object> qcyVar = qcyVarArr2[0];
                    if (((fks0) nwyVar.c()).e()) {
                        nwy nwyVar2 = publishFragment.eo().j;
                        qcy<Object> qcyVar2 = qcyVarArr2[1];
                        ((uij) nwyVar2.c()).b(publishFragment.requireContext(), privacySetting, userId, donutLevel, new w910(publishFragment, 19), new v95(publishFragment, 12));
                    } else {
                        nwy nwyVar3 = publishFragment.eo().j;
                        qcy<Object> qcyVar3 = qcyVarArr2[1];
                        ((uij) nwyVar3.c()).d(publishFragment.requireContext(), privacySetting, userId, donutLevel, new mgz(publishFragment, 29), new y5(publishFragment, 8));
                    }
                } else if (sbe0Var2 instanceof sbe0.h) {
                    PrivacySetting privacySetting2 = ((sbe0.h) sbe0Var2).a;
                    privacySetting2.c = publishFragment.requireContext().getString(R.string.video_publish_edit_privacy_comments);
                    nwy nwyVar4 = publishFragment.eo().j;
                    qcy<Object> qcyVar4 = PublishFragmentInternalComponent.w[1];
                    ((uij) nwyVar4.c()).a(publishFragment.requireContext(), privacySetting2, new nt10(publishFragment, 18));
                } else if (sbe0Var2 instanceof sbe0.k) {
                    new VideoViewerFragment.a(new VideoViewerArguments.Local(((sbe0.k) sbe0Var2).a)).l(publishFragment);
                } else if (sbe0Var2 instanceof sbe0.f) {
                    nwy nwyVar5 = publishFragment.eo().l;
                    qcy<Object> qcyVar5 = PublishFragmentInternalComponent.w[3];
                    ((sw50.f) nwyVar5.c()).d(publishFragment, 1, 1, new sw50.f.a(null, null, 31));
                } else {
                    int i3 = 2;
                    if (sbe0Var2 instanceof sbe0.g) {
                        sbe0.g gVar = (sbe0.g) sbe0Var2;
                        CoverChooseArguments.VideoCoverChooseArguments videoCoverChooseArguments = new CoverChooseArguments.VideoCoverChooseArguments(gVar.a, gVar.b, gVar.c, gVar.d);
                        CoverChooseFragment.a aVar4 = new CoverChooseFragment.a(CoverChooseFragment.class, null, null);
                        aVar4.j.putParcelable("arguments", videoCoverChooseArguments);
                        aVar4.s(true);
                        aVar4.g(2, publishFragment);
                    } else if (sbe0Var2 instanceof sbe0.m) {
                        sbe0.m mVar = (sbe0.m) sbe0Var2;
                        String str = mVar.a;
                        Integer num = mVar.b;
                        UserId userId2 = mVar.c;
                        FragmentActivity kn3 = publishFragment.kn();
                        FragmentManager supportFragmentManager2 = kn3.getSupportFragmentManager();
                        supportFragmentManager2.f("DescriptionResult.MODAL_RESULT_REQUEST_KEY");
                        supportFragmentManager2.e("DescriptionResult.MODAL_RESULT_REQUEST_KEY");
                        supportFragmentManager2.l0("DescriptionResult.MODAL_RESULT_REQUEST_KEY", kn3, new xq70(publishFragment, 6));
                        new b.a(publishFragment.requireContext(), new DescriptionArguments(str, num, userId2)).a0(new akd0(publishFragment, i)).I0(null);
                    } else if (sbe0Var2 instanceof sbe0.d) {
                        sbe0.d dVar2 = (sbe0.d) sbe0Var2;
                        Uri uri = dVar2.a;
                        UserId userId3 = dVar2.b;
                        File u = up2.u(uri);
                        if (u != null) {
                            publishFragment.eo().b.f().b(publishFragment.requireContext(), 5, new ClipsUploadUiVkNavigator.ClipUploadDataCompact(null, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.VIDEO_AS_CLIP_VIDEO_UPLOAD, u, userId3, new VideoToClipInfo(0L, 0L, false, false, 3, null), new ClipUploadScreenRuntimeConfig(true, true, false, 4, null)));
                        }
                    } else if (sbe0Var2 instanceof sbe0.e) {
                        nwy nwyVar6 = publishFragment.eo().k;
                        qcy<Object>[] qcyVarArr3 = PublishFragmentInternalComponent.w;
                        qcy<Object> qcyVar6 = qcyVarArr3[2];
                        ClipsRouter a = ((pkd) nwyVar6.c()).a();
                        Context requireContext2 = publishFragment.requireContext();
                        nwy nwyVar7 = publishFragment.eo().k;
                        qcy<Object> qcyVar7 = qcyVarArr3[2];
                        ClipsRouter.c(a, requireContext2, ((pkd) nwyVar7.c()).p(null), null, null, null, null, null, false, null, 2044);
                    } else if (!(sbe0Var2 instanceof sbe0.l)) {
                        if (sbe0Var2 instanceof sbe0.o) {
                            int i4 = h7u0.p;
                            h7u0.a c = h7u0.b.c(publishFragment.requireContext());
                            c.g0(R.string.save_draft_confirmation_dialog_title);
                            c.U(R.string.save_draft_confirmation_dialog_message);
                            c.c0(R.string.save_draft_confirmation_dialog_save, new com.vk.stickers.bonus.catalog.a(publishFragment, i3));
                            c.W(R.string.save_draft_confirmation_dialog_cancel, new ace0());
                            c.m();
                        } else {
                            if (!(sbe0Var2 instanceof sbe0.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            publishFragment.finish();
                        }
                    }
                }
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PublishFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        Q = new qcy[]{propertyReference1Impl};
    }

    public PublishFragment() {
        so40 so40Var = new so40(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, so40Var);
        bnc0 bnc0Var = new bnc0(this, 2);
        int i = wcy.c;
        this.O = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(PublishState.class)), wcy.a.a(fpf0.d(PublishState.class)), wcy.a.a(fpf0.d(dbe0.class)), wcy.a.a(fpf0.d(sbe0.class))).toString(), this, this, bnc0Var);
        this.P = msy.a(lazyThreadSafetyMode, new gd70(this, 20));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        fo().b(dbe0.d.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PublishFragmentInternalComponent eo() {
        return (PublishFragmentInternalComponent) this.N.getValue();
    }

    public final bn50<PublishState, PublishState, dbe0, sbe0> fo() {
        qcy<Object> qcyVar = Q[0];
        return (bn50) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        String path;
        Parcelable parcelable;
        Object parcelableExtra;
        Parcelable parcelable2;
        Object parcelableExtra2;
        Parcelable parcelable3;
        Object parcelableExtra3;
        super.onActivityResult(i, i2, intent);
        b bVar = ((bce0) this.P.getValue()).a;
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            if (intent == null || (stringExtra = intent.getStringExtra(X3.i.b)) == null || (path = Uri.parse(stringExtra).getPath()) == null) {
                return;
            }
            bVar.invoke(new ibe0(path));
            return;
        }
        if (i == 2) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("arguments", CoverChooseResult.class);
                    parcelable = (Parcelable) parcelableExtra;
                } else {
                    Parcelable parcelableExtra4 = intent.getParcelableExtra("arguments");
                    parcelable = (CoverChooseResult) (parcelableExtra4 instanceof CoverChooseResult ? parcelableExtra4 : null);
                }
                CoverChooseResult coverChooseResult = (CoverChooseResult) parcelable;
                if (coverChooseResult != null) {
                    bVar.invoke(new hbe0(coverChooseResult));
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra("arguments", AlbumChooseResult.class);
                    parcelable2 = (Parcelable) parcelableExtra2;
                } else {
                    Parcelable parcelableExtra5 = intent.getParcelableExtra("arguments");
                    parcelable2 = (AlbumChooseResult) (parcelableExtra5 instanceof AlbumChooseResult ? parcelableExtra5 : null);
                }
                AlbumChooseResult albumChooseResult = (AlbumChooseResult) parcelable2;
                if (albumChooseResult != null) {
                    bVar.invoke(new dbe0.b.C2718b(albumChooseResult.b));
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            bVar.invoke(dbe0.q.b);
        } else if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra3 = intent.getParcelableExtra("arguments", SettingsResult.class);
                parcelable3 = (Parcelable) parcelableExtra3;
            } else {
                Parcelable parcelableExtra6 = intent.getParcelableExtra("arguments");
                parcelable3 = (SettingsResult) (parcelableExtra6 instanceof SettingsResult ? parcelableExtra6 : null);
            }
            SettingsResult settingsResult = (SettingsResult) parcelable3;
            if (settingsResult != null) {
                bVar.invoke(new dbe0.a.C2717a(settingsResult));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwy nwyVar = eo().m;
        qcy<Object> qcyVar = PublishFragmentInternalComponent.w[4];
        obe0 obe0Var = new obe0((vee0) nwyVar.c(), new c(1, this, PublishFragment.class, "handleEvent", "handleEvent(Lcom/vk/video/ui/upload/impl/publish/presentation/publish/feature/entity/PublishEvent;)V", 0));
        ComposeView a2 = xpi.a(layoutInflater.getContext());
        a2.setFitsSystemWindows(true);
        obe0Var.c(fo(), a2);
        return a2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fo().b(dbe0.l.b);
    }
}
