package com.vk.movika.sdk.base.observable;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenArguments;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.catalog2.common.ui.holders.ads.AdSearchBannerVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import com.vkontakte.android.actionlinks.views.fragments.addpoll.AddPollView;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.am;
import xsna.ao8;
import xsna.asu0;
import xsna.awt0;
import xsna.bn4;
import xsna.bwt0;
import xsna.cea;
import xsna.cn50;
import xsna.cw50;
import xsna.dhd;
import xsna.ea6;
import xsna.ez;
import xsna.fq1;
import xsna.g2v;
import xsna.g54;
import xsna.gzs;
import xsna.h7d;
import xsna.hab;
import xsna.hg1;
import xsna.i330;
import xsna.if3;
import xsna.iu1;
import xsna.iwv;
import xsna.izs;
import xsna.j5g;
import xsna.kiw;
import xsna.l0n;
import xsna.lla;
import xsna.lp3;
import xsna.m8b;
import xsna.mde;
import xsna.mqd;
import xsna.nh3;
import xsna.nre;
import xsna.on3;
import xsna.p9m;
import xsna.qcy;
import xsna.qfa;
import xsna.rh3;
import xsna.rl3;
import xsna.s3q0;
import xsna.svj;
import xsna.tj50;
import xsna.u8;
import xsna.uab;
import xsna.uod;
import xsna.up2;
import xsna.ure;
import xsna.vod;
import xsna.w43;
import xsna.wb0;
import xsna.xn7;
import xsna.zak0;
import xsna.zi3;
import xsna.zld;
import xsna.zs9;
import xsna.zu50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v36, types: [android.view.ViewGroup, xsna.tod] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        l0n l0nVar;
        kiw kiwVar;
        Bitmap a;
        boolean flush$lambda$5;
        MasksWrap masksWrap;
        Object obj2;
        Object parcelable;
        int i = this.b;
        int i2 = 8;
        int i3 = 11;
        boolean z = false;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.listener.d) obj).j((Chapter) obj3);
                return s3q0.a;
            case 1:
                AdSearchBannerVh adSearchBannerVh = (AdSearchBannerVh) obj3;
                zu50 zu50Var = (zu50) obj;
                adSearchBannerVh.n = zu50Var;
                if (zu50Var != null) {
                    zu50Var.l = new AdSearchBannerVh.a(adSearchBannerVh);
                }
                cw50 d = zu50Var != null ? zu50Var.d() : null;
                if (d != null && (kiwVar = d.v) != null && (a = kiwVar.a()) != null) {
                    VKImageView vKImageView = adSearchBannerVh.i;
                    if (vKImageView == null) {
                        vKImageView = null;
                    }
                    vKImageView.setImageBitmap(a);
                }
                Integer valueOf = (d == null || (l0nVar = d.k) == null) ? null : Integer.valueOf(l0nVar.a);
                Integer valueOf2 = ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8)) ? Integer.valueOf(R.drawable.vk_icon_illustration_contraindications_26h) : (valueOf != null && valueOf.intValue() == 9) ? Integer.valueOf(R.drawable.vk_icon_illustration_bud) : (valueOf != null && valueOf.intValue() == 11) ? Integer.valueOf(R.drawable.vk_icon_illustration_credits_79h) : null;
                float f = ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8)) ? 0.07f : ((valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 11)) ? 0.12f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Guideline guideline = adSearchBannerVh.k;
                if (guideline == null) {
                    guideline = null;
                }
                ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
                ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                if (bVar != null) {
                    bVar.c = 1.0f - f;
                    Guideline guideline2 = adSearchBannerVh.k;
                    if (guideline2 == null) {
                        guideline2 = null;
                    }
                    guideline2.setLayoutParams(bVar);
                }
                if (valueOf2 != null) {
                    ImageView imageView = adSearchBannerVh.l;
                    if (imageView == null) {
                        imageView = null;
                    }
                    imageView.setVisibility(0);
                    ImageView imageView2 = adSearchBannerVh.l;
                    if (imageView2 == null) {
                        imageView2 = null;
                    }
                    imageView2.setImageResource(valueOf2.intValue());
                }
                TextView textView = adSearchBannerVh.f;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(d != null ? d.g : null);
                TextView textView2 = adSearchBannerVh.g;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(d != null ? d.i : null);
                TextView textView3 = adSearchBannerVh.h;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(j5g.g0(rl3.I(new String[]{d != null ? d.o : null, d != null ? d.l : null}), " ", null, null, 0, null, 62));
                View view = adSearchBannerVh.j;
                if (view == null) {
                    view = null;
                }
                view.setOnClickListener(adSearchBannerVh.o);
                zu50 zu50Var2 = adSearchBannerVh.n;
                if (zu50Var2 != null) {
                    AdSearchBannerVh.b bVar2 = (AdSearchBannerVh.b) adSearchBannerVh.m.getValue();
                    FrameLayout frameLayout = adSearchBannerVh.c;
                    if (frameLayout == null) {
                        frameLayout = null;
                    }
                    zu50Var2.h(bVar2, Collections.singletonList(frameLayout));
                }
                VkSkeleton vkSkeleton = adSearchBannerVh.e;
                (vkSkeleton != null ? vkSkeleton : null).setVisibility(8);
                return s3q0.a;
            case 2:
                AddPollView addPollView = (AddPollView) obj3;
                int i4 = AddPollView.R;
                if (((Boolean) obj).booleanValue()) {
                    ItemsDialogWrapper itemsDialogWrapper = addPollView.N;
                    if (itemsDialogWrapper != null) {
                        itemsDialogWrapper.eo(true);
                    }
                } else {
                    ItemsDialogWrapper itemsDialogWrapper2 = addPollView.N;
                    if (itemsDialogWrapper2 != null) {
                        itemsDialogWrapper2.eo(false);
                    }
                }
                return s3q0.a;
            case 3:
                VKList vKList = (VKList) obj;
                return new AlbumsRepository.a(vKList, vKList.size() < ((com.vk.lists.c) obj3).k());
            case 4:
                flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5((AndroidDiagnosticEventRepository) obj3, (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj);
                return Boolean.valueOf(flush$lambda$5);
            case 5:
                ((w43) obj3).q1();
                return s3q0.a;
            case 6:
                if3 if3Var = (if3) obj3;
                iwv.l(g2v.c().k(), if3Var.l, ((SimpleAttachListItem) obj).b.d, null, null, Long.valueOf(if3Var.o.b), null, false, 108);
                return s3q0.a;
            case 7:
                ((rh3) obj3).o.b((zi3) obj);
                return s3q0.a;
            case 8:
                on3.a aVar = (on3.a) obj3;
                lp3.a aVar2 = (lp3.a) aVar.m;
                if (aVar2 != null) {
                    aVar.n.invoke(aVar2);
                }
                return s3q0.a;
            case 9:
                bn4 bn4Var = (bn4) obj3;
                bn4Var.m.invoke(Integer.valueOf(bn4Var.getBindingAdapterPosition()));
                return s3q0.a;
            case 10:
                long j = ((ea6.b) obj3).a;
                return ((Optional) obj).isPresent() ? new ea6.d.c(j) : new ea6.d.b(j);
            case 11:
                ((izs) ((zak0) ((xn7) obj3).b).getValue()).invoke(a.c.b.b);
                return s3q0.a;
            case 12:
                awt0.r((am) obj, ((View) obj3).getContext());
                return s3q0.a;
            case 13:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i5 = CallOnboardingView.j;
                bwt0.p0((CallOnboardingView) obj3, booleanValue);
                return s3q0.a;
            case 14:
                ((i330) obj3).b((CallParticipantsViewModel.a) obj);
                return s3q0.a;
            case 15:
                CameraUIView cameraUIView = (CameraUIView) obj3;
                String str = (String) obj;
                float f2 = CameraUIView.w1;
                if (!cameraUIView.U() && (masksWrap = cameraUIView.b0) != null) {
                    masksWrap.G(1500L, str);
                }
                return s3q0.a;
            case 16:
                ((zs9) obj3).l.c();
                return s3q0.a;
            case 17:
                ao8.p(((CartCounterState) obj3).b, ((Integer) obj).intValue());
                return s3q0.a;
            case 18:
                CatalogSectionScreenFragment catalogSectionScreenFragment = (CatalogSectionScreenFragment) obj3;
                gzs gzsVar = (gzs) obj;
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                Bundle requireArguments = catalogSectionScreenFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arguments", CatalogSectionScreenArguments.class);
                    obj2 = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arguments");
                    obj2 = (CatalogSectionScreenArguments) (parcelable2 instanceof CatalogSectionScreenArguments ? parcelable2 : null);
                }
                final CatalogSectionScreenArguments catalogSectionScreenArguments = (CatalogSectionScreenArguments) obj2;
                final cea fo = catalogSectionScreenFragment.fo();
                final qfa qfaVar = new qfa(catalogSectionScreenFragment.fo().d());
                return new cn50(up2.d(new nh3(3, gzsVar, catalogSectionScreenArguments), new wb0() { // from class: xsna.rfa
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new kfa(CatalogSectionScreenArguments.this, fo, qfaVar, sj50Var);
                    }
                }, svj.b));
            case 19:
                awt0.r((am) obj, ((lla) obj3).itemView.getContext());
                return s3q0.a;
            case 20:
                int i6 = ChannelFragment.a1;
                m8b m8bVar = ((ChannelFragment) obj3).to();
                int i7 = ((Msg) obj).d;
                if (i7 != m8bVar.x) {
                    m8bVar.x = i7;
                    m8bVar.c1(i7, true);
                }
                return s3q0.a;
            case 21:
                ((uab) obj3).d.invoke(hab.c.b);
                return s3q0.a;
            case 22:
                zld zldVar = (zld) obj3;
                zldVar.f.a().d().a("ClipsChoosePreviewPresenter", (Throwable) obj);
                Toast.makeText(zldVar.b, R.string.vk_error, 0).show();
                return s3q0.a;
            case 23:
                vod vodVar = (vod) obj3;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    dhd dhdVar = (dhd) ((Pair) optional.get()).i();
                    vodVar.c.a(dhdVar);
                    if (!(dhdVar instanceof dhd.b)) {
                        vodVar.u7();
                    }
                    hg1.f(vodVar.f);
                    io.reactivex.rxjava3.internal.operators.mixed.q qVar = new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.v(new uod((Object) vodVar, (int) (z ? 1 : 0))), new fq1(new u8(vodVar, 25), 7));
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    io.reactivex.rxjava3.disposables.c subscribe = qVar.r0(asu0.k()).a0(asu0Var.d()).subscribe(new ez(new g(vodVar, 18), i3), new iu1(new i(12), i2));
                    vodVar.b.b(subscribe);
                    vodVar.f = subscribe;
                }
                return s3q0.a;
            case 24:
                ((mqd) obj3).y0();
                return s3q0.a;
            case 25:
                tj50.a aVar3 = (tj50.a) obj;
                g54 g54Var = new g54(i3);
                ao8 ao8Var = ao8.d;
                return new ClipsFavoriteFolderContentListViewState.h(aVar3.a(g54Var, ao8Var), aVar3.a(new com.vk.clips.favorites.impl.ui.folders.content.e(1, (com.vk.clips.favorites.impl.ui.folders.content.f) obj3, com.vk.clips.favorites.impl.ui.folders.content.f.class, "createMoreButtonState", "createMoreButtonState(Lcom/vk/clips/favorites/impl/ui/folders/content/ClipsFavoriteFolderContentListState;)Lcom/vk/clips/favorites/impl/ui/folders/content/ClipsFavoriteFolderContentListViewState$MoreButtonState;", 0), ao8Var));
            case 26:
                mde mdeVar = (mde) obj3;
                h7d h7dVar = (h7d) obj;
                List<VideoFile> list = h7dVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof ClipVideoFile) {
                        arrayList.add(obj4);
                    }
                }
                mdeVar.b(h7dVar.c.zb(), arrayList);
                return s3q0.a;
            case 27:
                nre nreVar = (nre) obj3;
                L.i((Throwable) obj);
                nreVar.q = true;
                nreVar.n.b(ure.b.a);
                return s3q0.a;
            case 28:
                return Boolean.valueOf(!((p9m) obj).equals((p9m) obj3));
            default:
                UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i8 = CommunityNameHistoryFragment.S;
                if (booleanValue2) {
                    usableRecyclerPaginatedView.K9();
                } else {
                    usableRecyclerPaginatedView.Mk();
                }
                return s3q0.a;
        }
    }
}
