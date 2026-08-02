package com.vk.im.ui.components.viewcontrollers.dialog_header.info;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketGetByIdResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookPerson;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonInfoVh;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.compose.component.cell.content.t;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.imageloader.view.VKOverlayImageView;
import com.vk.log.L;
import com.vk.masks.dynamic.DynamicMasksUseCase;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.adb;
import xsna.aqb;
import xsna.c5g;
import xsna.c9m;
import xsna.cte;
import xsna.d2h;
import xsna.dhr0;
import xsna.dtk0;
import xsna.dyr0;
import xsna.efm;
import xsna.eno;
import xsna.eqo;
import xsna.g2v;
import xsna.ham;
import xsna.hda;
import xsna.hza;
import xsna.ikv0;
import xsna.iqb;
import xsna.it80;
import xsna.iz0;
import xsna.izs;
import xsna.j37;
import xsna.j5g;
import xsna.jda;
import xsna.jgz;
import xsna.jyd;
import xsna.k15;
import xsna.k1a0;
import xsna.k4b;
import xsna.kab;
import xsna.m8;
import xsna.m99;
import xsna.n0v0;
import xsna.nj3;
import xsna.nlh0;
import xsna.nt7;
import xsna.ov3;
import xsna.pab;
import xsna.qcy;
import xsna.qv3;
import xsna.r1f;
import xsna.r280;
import xsna.s3q0;
import xsna.spb;
import xsna.sxp;
import xsna.tny;
import xsna.u6e;
import xsna.u8;
import xsna.v8m;
import xsna.w8l;
import xsna.wjs0;
import xsna.wqb;
import xsna.x3b;
import xsna.xn50;
import xsna.y1a;
import xsna.yse;
import xsna.z0a;
import xsna.z37;
import xsna.z68;
import xsna.z73;
import xsna.z8m;
import xsna.zak0;
import xsna.zjq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v47, types: [T, xsna.ikv0] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        z8m z8mVar;
        AudioBookPerson audioBookPerson;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        ArrayList<UIBlock> arrayList2;
        UIBlock uIBlock2;
        int i = this.b;
        int i2 = 6;
        Integer num = 0;
        num = 0;
        boolean z = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                dtk0 dtk0Var = bVar.N;
                c9m c9mVar = bVar.J;
                if (!bVar.I || bVar.K == null) {
                    efm efmVar = bVar.e;
                    if (efmVar != null) {
                        efmVar.z();
                    }
                } else {
                    efm efmVar2 = bVar.e;
                    if (efmVar2 != null) {
                        efmVar2.f();
                    }
                    z8m z8mVar2 = bVar.K;
                    n0v0 n0v0Var = n0v0.a;
                    if (z8mVar2 == null) {
                        if (!c9mVar.isVisible()) {
                            v8m.a = new Object();
                            g2v.c().getClass();
                            c9mVar.b(n0v0Var.a(bVar.K == null, dtk0Var.g, dtk0Var.b), new m8(1, bVar, b.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 2));
                        } else if (c9mVar.isVisible()) {
                            c9mVar.a(true);
                        }
                    } else if (z8mVar2.isVisible()) {
                        z8m z8mVar3 = bVar.K;
                        if (z8mVar3 != null && z8mVar3.isVisible() && (z8mVar = bVar.K) != null) {
                            z8mVar.a(true);
                        }
                    } else {
                        v8m.a = new Object();
                        z8m z8mVar4 = bVar.K;
                        if (z8mVar4 != null) {
                            g2v.c().getClass();
                            z8mVar4.b(n0v0Var.a(bVar.K == null, dtk0Var.g, dtk0Var.b), new j37(1, bVar, b.class, "handleDialogActionClick", "handleDialogActionClick(Lcom/vk/im/ui/components/common/DialogAction;)V", 0, 5));
                        }
                    }
                }
                break;
            case 1:
                xn50.a.c(((com.vk.photos.root.albumdetails.presentation.c) obj2).c, new a.u(((k.c.C1491c) obj).a));
                break;
            case 2:
                VKList vKList = (VKList) obj;
                break;
            case 3:
                ((z73) obj2).invoke();
                break;
            case 4:
                PhotoFlowToolbarView photoFlowToolbarView = ((nj3) obj2).i;
                if (((Boolean) obj).booleanValue()) {
                    photoFlowToolbarView.T4(R.drawable.vk_icon_more_vertical_28, R.string.accessibility_actions);
                } else {
                    photoFlowToolbarView.t.setVisibility(8);
                }
                break;
            case 5:
                ((ov3) obj2).a(new qv3((Throwable) obj));
                break;
            case 6:
                qcy<Object>[] qcyVarArr = AttachedClipsFragment.P;
                final AttachedClipsFragmentInternalComponent attachedClipsFragmentInternalComponent = (AttachedClipsFragmentInternalComponent) ((AttachedClipsFragment) obj2).N.getValue();
                attachedClipsFragmentInternalComponent.getClass();
                break;
            case 7:
                AudioBookPersonInfoVh audioBookPersonInfoVh = (AudioBookPersonInfoVh) obj2;
                VKOverlayImageView vKOverlayImageView = audioBookPersonInfoVh.e;
                if (vKOverlayImageView != null) {
                    UIBlockAudioBookPerson uIBlockAudioBookPerson = audioBookPersonInfoVh.p;
                    if (uIBlockAudioBookPerson != null && (audioBookPerson = uIBlockAudioBookPerson.y) != null) {
                        num = Integer.valueOf(audioBookPerson.b);
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setGradientType(1);
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColors(new int[]{((Number) j5g.Y(k1a0.a(num != 0 ? num.intValue() : 0))).intValue(), dhr0.t.c(R.attr.vk_ui_background)});
                    gradientDrawable.setGradientCenter(0.4f, 1.0f);
                    gradientDrawable.setGradientRadius(audioBookPersonInfoVh.e != null ? r2.getMeasuredWidth() * 0.8f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    vKOverlayImageView.setBackground(gradientDrawable);
                }
                break;
            case 8:
                ((BonusCatalogFragment) obj2).io();
                break;
            case 9:
                ((z37) obj2).b((nt7) obj);
                break;
            case 10:
                z68 z68Var = (z68) obj2;
                View view = (View) obj;
                e.b bVar2 = z68Var.q;
                if (bVar2 != null && !bVar2.c) {
                    view.performHapticFeedback(3);
                    z68Var.l.invoke(bVar2.b);
                }
                break;
            case 11:
                ((m99) obj2).d(new iz0((it80) obj, i2));
                break;
            case 12:
                eqo<DynamicMasksUseCase> eqoVar = ((CameraUIView) obj2).C;
                if (eqoVar != null) {
                    eqoVar.d(DynamicMasksUseCase.MasksClicked);
                }
                break;
            case 13:
                a.C0919a c0919a = (a.C0919a) obj2;
                List<MarketMarketItemDto> d = ((MarketGetByIdResponseDto) obj).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList3.add(eno.a((MarketMarketItemDto) it.next(), c0919a.b));
                }
                break;
            case 14:
                y1a y1aVar = (y1a) obj2;
                hda hdaVar = (hda) obj;
                String str = hdaVar.c;
                List a = jda.a(y1aVar.i, hdaVar.a, hdaVar.b, false, false, 12);
                UIBlockList uIBlockList = y1aVar.k;
                UIBlockList uIBlockList2 = new UIBlockList(uIBlockList.b, uIBlockList.d, uIBlockList.e, uIBlockList.f, uIBlockList.g, uIBlockList.h, uIBlockList.Db(), uIBlockList.j, uIBlockList.m, uIBlockList.z, a, str, uIBlockList.B, uIBlockList.C, uIBlockList.D, uIBlockList.I, uIBlockList.E, uIBlockList.F, uIBlockList.G, uIBlockList.H, false, null, false, null, uIBlockList.l, false, null, uIBlockList.p, null, null, 921698304, null);
                z0a z0aVar = (z0a) y1aVar.m.getValue();
                ArrayList<UIBlock> arrayList4 = uIBlockList2.y;
                UIBlockList uIBlockList3 = y1aVar.k;
                int i3 = (uIBlockList3 == null || (arrayList2 = uIBlockList3.y) == null || (uIBlock2 = (UIBlock) j5g.k0(arrayList2)) == null) ? 1 : uIBlock2.t;
                UIBlockList uIBlockList4 = y1aVar.k;
                int i4 = (uIBlockList4 == null || (arrayList = uIBlockList4.y) == null || (uIBlock = (UIBlock) j5g.k0(arrayList)) == null) ? 0 : uIBlock.u;
                z0aVar.getClass();
                z0a.a(i3, i4, arrayList4);
                UIBlockList uIBlockList5 = y1aVar.k;
                if (uIBlockList5 != null) {
                    uIBlockList5.A = uIBlockList2.A;
                    uIBlockList5.y.addAll(uIBlockList2.y);
                }
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = y1aVar.c;
                if (catalogPaginatedListViewHolder != null) {
                    catalogPaginatedListViewHolder.N5(uIBlockList2);
                }
                com.vk.lists.c cVar = y1aVar.d;
                if (cVar != null) {
                    cVar.s(str);
                }
                break;
            case 15:
                ChannelFragment channelFragment = (ChannelFragment) obj2;
                int i5 = ChannelFragment.a1;
                ((hza) channelFragment.W0.getValue()).a((Channel) obj, ((ham) channelFragment.X0.getValue()).d);
                break;
            case 16:
                ((k4b) obj2).d.invoke(x3b.g.b);
                break;
            case 17:
                ((kab) obj2).T(new pab.a(((Channel) obj).O));
                break;
            case 18:
                adb adbVar = (adb) obj2;
                sxp sxpVar = (sxp) obj;
                if ((sxpVar instanceof OnChannelsCacheInvalidateEvent) || ((sxpVar instanceof r280) && ((r280) sxpVar).b.b(Long.valueOf(adbVar.a)))) {
                    z = true;
                }
                break;
            case 19:
                aqb aqbVar = (aqb) obj2;
                iqb.a aVar = aqbVar.m;
                spb.a aVar2 = aqbVar.o;
                aVar.invoke(aVar2 != null ? aVar2 : null);
                break;
            case 20:
                ChatFragment chatFragment = (ChatFragment) obj2;
                ChatFragment.d dVar = ChatFragment.w1;
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ikv0.a aVar3 = new ikv0.a(chatFragment.requireContext());
                    aVar3.u = new ikv0.d(chatFragment.requireContext().getString(R.string.sticker_popup_animation_interrupter_snackbar_text), (String) num, (ikv0.d.a) num, i2);
                    aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, chatFragment.requireContext().getString(R.string.sticker_popup_animation_interrupter_snackbar_disable_button), new wqb(z ? 1 : 0, chatFragment, ref$ObjectRef));
                    aVar3.h = new u8(chatFragment, 20);
                    ?? b = aVar3.b();
                    b.c();
                    ref$ObjectRef.element = b;
                    break;
                }
            case 21:
                VideoFile A = k15.A(((nlh0) obj2).k());
                ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                if (clipVideoFile != null) {
                    wjs0.a(new dyr0(clipVideoFile));
                }
                break;
            case 22:
                break;
            case 23:
                int intValue = ((Integer) obj).intValue();
                w8l w8lVar = ((u6e) obj2).f.m;
                if (w8lVar != null) {
                    w8lVar.b(intValue);
                }
                break;
            case 24:
                View view2 = (View) obj2;
                float floatValue = ((Float) obj).floatValue();
                view2.setScaleX(floatValue);
                view2.setScaleY(floatValue);
                break;
            case 25:
                L.i((Throwable) obj);
                ((yse) obj2).T(cte.b);
                break;
            case 26:
                r1f r1fVar = (r1f) obj2;
                List list = (List) obj;
                ArrayList arrayList5 = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(jyd.a((ClipsProcessedItem) it2.next()));
                }
                break;
            case 27:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i6 = ClipsVideoAttachmentPickerFragment.W;
                ((ClipsVideoAttachmentPickerFragment.b) obj2).c.setEnabled(booleanValue);
                break;
            case 28:
                tny tnyVar = (tny) obj;
                izs izsVar = (izs) ((zak0) ((t) obj2).h).getValue();
                if (izsVar != null) {
                    izsVar.invoke(zjq.n(jgz.j(tnyVar, true)));
                }
                break;
            default:
                d2h d2hVar = (d2h) obj2;
                int i7 = d2h.p1;
                d2hVar.Yn();
                d2hVar.Zn((Throwable) obj);
                break;
        }
        return s3q0.a;
    }
}
