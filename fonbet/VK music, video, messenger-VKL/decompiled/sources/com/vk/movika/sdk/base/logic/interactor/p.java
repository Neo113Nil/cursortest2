package com.vk.movika.sdk.base.logic.interactor;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.bridges.di.BridgeComponent;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.ClipsGeoPickerState;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.a;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.b;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.content.design.view.photo.albums.AlbumsHeaderView;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.configureitemlist.ConfigureItemListFragment;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItemId;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.location.common.LocationCommon;
import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a1b;
import xsna.a1c;
import xsna.az2;
import xsna.c06;
import xsna.c11;
import xsna.c5g;
import xsna.ca9;
import xsna.cvk;
import xsna.dhr0;
import xsna.dy0;
import xsna.e20;
import xsna.eb7;
import xsna.ei4;
import xsna.gg1;
import xsna.gm50;
import xsna.gmf;
import xsna.hj7;
import xsna.i0q0;
import xsna.i3r;
import xsna.it80;
import xsna.ixb;
import xsna.izi;
import xsna.izs;
import xsna.jsa;
import xsna.kb7;
import xsna.kbj0;
import xsna.ke8;
import xsna.le8;
import xsna.lpe0;
import xsna.m8b;
import xsna.m99;
import xsna.mwa;
import xsna.n1j;
import xsna.o29;
import xsna.o48;
import xsna.o8b;
import xsna.otb;
import xsna.q2j;
import xsna.qaj0;
import xsna.qp3;
import xsna.r3a;
import xsna.r96;
import xsna.s3q0;
import xsna.s8g0;
import xsna.s99;
import xsna.sa;
import xsna.sg8;
import xsna.u2j;
import xsna.uib;
import xsna.ums0;
import xsna.v1j;
import xsna.v9e;
import xsna.vp1;
import xsna.vqg;
import xsna.vxh;
import xsna.w19;
import xsna.wpe0;
import xsna.wxh;
import xsna.xg8;
import xsna.xgl0;
import xsna.xn50;
import xsna.xp1;
import xsna.y0c;
import xsna.yfb;
import xsna.z1z;
import xsna.zaa0;
import xsna.zak0;
import xsna.zg8;
import xsna.zh4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(com.vk.catalog2.common.ui.mvp.util.a aVar, c06 c06Var) {
        this.b = 14;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterator it;
        ConfigureItem.Owner owner;
        ConfigureItem.Rating rating;
        boolean z;
        boolean z2;
        ConfigureItemId configureItemId;
        ConfigureItem.Moderation.Reject reject;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(!((com.vk.movika.sdk.base.logic.e) this.c).f.contains(((com.vk.movika.sdk.base.model.h) obj).a));
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) this.c;
                gm50.a.a(cVar, ((c11.b) obj).a, new com.vk.im.engine.internal.storage.delegates.messages.b(cVar, r4));
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((zaa0) obj).a == ((gg1) this.c).o);
            case 3:
                AlbumsHeaderView.a aVar = ((AlbumsHeaderView) this.c).d;
                if (aVar != null) {
                    aVar.b();
                }
                return s3q0.a;
            case 4:
                xp1 xp1Var = (xp1) this.c;
                int i = xp1.l1;
                xp1Var.getFeature().C((vp1) obj);
                return s3q0.a;
            case 5:
                zh4 zh4Var = (zh4) this.c;
                ?? r2 = zh4Var.j1;
                ei4 ei4Var = (ei4) obj;
                int i2 = zh4.k1;
                if (ei4Var instanceof ei4.b) {
                    ((BridgeComponent) r2.getValue()).Le().G(zh4Var.requireContext(), ((ei4.b) ei4Var).a, MusicPlaybackLaunchContext.Fb(zh4Var.requireArguments().getString("ref", "")).Cb(zh4Var.requireArguments().getString("LAUNCH_ORIGIN", "unknown")));
                } else if (ei4Var.equals(ei4.c.a)) {
                    AudioBookPersonModel b = zh4.b.b(zh4Var.requireArguments());
                    if (b != null) {
                        kbj0.c(((BridgeComponent) r2.getValue()).h8(), zh4Var.requireContext(), b.d, true, null, null, false, 120);
                    }
                } else if (ei4Var.equals(ei4.a.a)) {
                    ClipboardManager clipboardManager = (ClipboardManager) zh4Var.requireContext().getSystemService("clipboard");
                    AudioBookPersonModel b2 = zh4.b.b(zh4Var.requireArguments());
                    String str = b2 != null ? b2.d : null;
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                    cvk.u(R.string.link_copied, false);
                } else {
                    if (!ei4Var.equals(ei4.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i0q0.f(new i3r(zh4Var.requireContext(), 2));
                }
                zh4Var.hide();
                return s3q0.a;
            case 6:
                r96 r96Var = (r96) this.c;
                int ceil = (int) Math.ceil(((Long) obj).longValue() / 1000);
                r96Var.b = ceil;
                r96Var.b(r96Var.c.b(ceil));
                return s3q0.a;
            case 7:
                eb7 eb7Var = (eb7) this.c;
                eb7Var.g.setVisibility(0);
                eb7Var.h.setVisibility(8);
                eb7Var.i.setVisibility(8);
                eb7Var.j.setVisibility(8);
                gm50.a.a(eb7Var, ((kb7.b) obj).a, new sa(eb7Var, 9));
                return s3q0.a;
            case 8:
                o48 o48Var = (o48) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) o48Var.c).setValue(bool);
                return s3q0.a;
            case 9:
                ((ke8) this.c).b(new le8.c((String) obj));
                return s3q0.a;
            case 10:
                xg8 xg8Var = ((sg8) this.c).d;
                zg8 zg8Var = (zg8) ((it80) obj).a;
                if (!xg8Var.k) {
                    throw new IllegalStateException("Instance is destroyed");
                }
                xg8Var.j.b(zg8Var);
                xg8Var.l = false;
                return s3q0.a;
            case 11:
                ((o29) this.c).b.invoke(w19.g.b);
                return s3q0.a;
            case 12:
                m99 m99Var = (m99) this.c;
                Set set = (Set) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, null, null, null, null, false, set, null, null, null, false, null, false, null, false, null, -268435457, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 13:
                wpe0 wpe0Var = (wpe0) obj;
                izs<lpe0, s3q0> actionListener = ((r3a) this.c).getActionListener();
                if (actionListener != null) {
                    actionListener.invoke(new lpe0.b(wpe0Var.a));
                }
                return s3q0.a;
            case 14:
                ((com.vk.catalog2.common.ui.mvp.util.a) this.c).i = null;
                return s3q0.a;
            case 15:
                jsa jsaVar = (jsa) this.c;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 9002) {
                    qaj0.c(jsaVar.b.c(), "changed_name", null);
                }
                return s3q0.a;
            case 16:
                ((mwa) this.c).d = (mwa.a) obj;
                return s3q0.a;
            case 17:
                a1b a1bVar = (a1b) this.c;
                xgl0 xgl0Var = (xgl0) obj;
                uib a = xgl0Var.a();
                Peer peer = a1bVar.c;
                a.q(peer.b, ChannelActionInProgress.NONE, Boolean.FALSE);
                xgl0Var.a().C(peer.b);
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((o8b) obj).b == ((m8b) this.c).i);
            case 19:
                otb otbVar = ((ixb) this.c).c.m;
                DialogExt zb = DialogExt.zb(otbVar.l.a);
                otbVar.g();
                otbVar.f(zb);
                return s3q0.a;
            case 20:
                a1c a1cVar = (a1c) this.c;
                int i3 = a1c.k1;
                a1cVar.getFeature().C(y0c.b.b);
                return s3q0.a;
            case 21:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i4 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.go(new az2(6, (ClipsFavoriteFolderContentListViewState.e) obj, clipsFavoriteFolderContentListFragment));
                return s3q0.a;
            case 22:
                com.vk.clips.attachments.impl.publish.geolocation.presentation.b bVar = (com.vk.clips.attachments.impl.publish.geolocation.presentation.b) this.c;
                v9e v9eVar = (v9e) obj;
                b.C0547b c0547b = com.vk.clips.attachments.impl.publish.geolocation.presentation.b.k1;
                if (v9eVar.equals(v9e.a.a)) {
                    bVar.On(3);
                } else if (v9eVar.equals(v9e.c.a)) {
                    Context requireContext = bVar.requireContext();
                    LocationCommon.a.getClass();
                    if (!LocationCommon.b(requireContext)) {
                        Context requireContext2 = bVar.requireContext();
                        new AlertDialog.Builder(requireContext2).setTitle(R.string.location_disabled_title).setMessage(R.string.location_disabled).setPositiveButton(R.string.open_settings, new hj7(true ? 1 : 0, requireContext2, new e20(7))).setNegativeButton(R.string.cancel, new z1z(null, 1)).show();
                    } else if (LocationCommon.a(bVar.requireContext())) {
                        xn50.a.c(bVar, a.C0546a.b);
                    } else {
                        ((s8g0) bVar.j1.getValue()).c(false);
                    }
                } else {
                    if (!(v9eVar instanceof v9e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentManager parentFragmentManager = bVar.getParentFragmentManager();
                    v9e.b bVar2 = (v9e.b) v9eVar;
                    ClipsGeoPickerState.a aVar2 = bVar2.a;
                    parentFragmentManager.k0(yfb.b(new Pair(aVar2.a, bVar2.b.a)), aVar2.b);
                    bVar.dismiss();
                }
                return s3q0.a;
            case 23:
                gmf gmfVar = (gmf) this.c;
                VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
                qp3 qp3Var = gmfVar.b;
                Integer f = videoGetResponseDto.f();
                qp3Var.invoke(new a.i(f != null ? f.intValue() : 3));
                gmfVar.f = videoGetResponseDto.getCount();
                return new VKList(ums0.e(ums0.a, videoGetResponseDto.e(), videoGetResponseDto.g(), videoGetResponseDto.d(), false, 52));
            case 24:
                ((vqg) this.c).c.ro((Throwable) obj);
                return s3q0.a;
            case 25:
                wxh wxhVar = (wxh) this.c;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(wxhVar.itemView, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, new ArgbEvaluator(), 0, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_background_secondary)));
                ofObject.setDuration(1000L);
                ofObject.addListener(new vxh(wxhVar));
                wxhVar.r = ofObject;
                ofObject.start();
                return s3q0.a;
            case 26:
                ((dy0) this.c).invoke();
                return s3q0.a;
            case 27:
                ConfigureItemListFragment configureItemListFragment = (ConfigureItemListFragment) this.c;
                int i5 = ConfigureItemListFragment.S;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    MultipickerProduct multipickerProduct = (MultipickerProduct) it2.next();
                    MultipickerProductId multipickerProductId = multipickerProduct.b;
                    ConfigureItemId configureItemId2 = new ConfigureItemId(multipickerProductId.b, multipickerProductId.c);
                    String str2 = multipickerProduct.c;
                    MultipickerProduct.Price price = multipickerProduct.d;
                    ConfigureItem.ProductPrice productPrice = new ConfigureItem.ProductPrice(price.b, price.c, price.d, price.e);
                    Image image = multipickerProduct.f;
                    boolean z3 = multipickerProduct.h;
                    boolean z4 = multipickerProduct.g;
                    String str3 = multipickerProduct.i;
                    String str4 = multipickerProduct.j;
                    MultipickerProduct.Owner owner2 = multipickerProduct.k;
                    if (owner2 != null) {
                        it = it2;
                        owner = new ConfigureItem.Owner(owner2.b, owner2.c, owner2.d);
                    } else {
                        it = it2;
                        owner = null;
                    }
                    MultipickerProduct.Rating rating2 = multipickerProduct.l;
                    if (rating2 != null) {
                        configureItemId2 = configureItemId2;
                        rating = new ConfigureItem.Rating(rating2.b, rating2.c, rating2.d);
                    } else {
                        rating = null;
                    }
                    MultipickerProduct.Moderation moderation = multipickerProduct.e;
                    boolean z5 = moderation.b;
                    boolean z6 = moderation.c;
                    boolean z7 = moderation.d;
                    Integer num = moderation.e;
                    Image image2 = moderation.f;
                    MultipickerProduct.Moderation.Reject reject2 = moderation.g;
                    if (reject2 != null) {
                        z = z6;
                        z2 = z7;
                        configureItemId = configureItemId2;
                        reject = new ConfigureItem.Moderation.Reject(reject2.b, reject2.c, reject2.d, reject2.e);
                    } else {
                        z = z6;
                        z2 = z7;
                        configureItemId = configureItemId2;
                        reject = null;
                    }
                    arrayList.add(new ConfigureItem(configureItemId, str2, productPrice, image, z3, z4, str3, str4, owner, rating, new ConfigureItem.Moderation(z5, z, z2, num, image2, reject)));
                    it2 = it;
                }
                xn50.a.c(configureItemListFragment, new izi.a(arrayList));
                return s3q0.a;
            case 28:
                n1j n1jVar = (n1j) this.c;
                int i6 = n1j.k1;
                if (((q2j.a) obj) instanceof q2j.a.C3544a) {
                    n1jVar.getFeature().C(v1j.f.b);
                }
                return s3q0.a;
            default:
                u2j u2jVar = (u2j) this.c;
                int i7 = u2j.f1;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.B0.g();
                u2jVar.tn();
                return s3q0.a;
        }
    }

    public /* synthetic */ p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
