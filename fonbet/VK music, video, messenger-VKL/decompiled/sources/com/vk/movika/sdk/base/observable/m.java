package com.vk.movika.sdk.base.observable;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.picker.c;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.utils.newtork.d;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.log.L;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ao8;
import xsna.asu0;
import xsna.biq;
import xsna.bqh0;
import xsna.bwt0;
import xsna.c2e;
import xsna.d5v;
import xsna.ebb;
import xsna.gu7;
import xsna.h30;
import xsna.i8;
import xsna.io1;
import xsna.ipm;
import xsna.ir0;
import xsna.it80;
import xsna.izs;
import xsna.j5g;
import xsna.j60;
import xsna.kb;
import xsna.l8;
import xsna.la2;
import xsna.lds0;
import xsna.lnw;
import xsna.lu1;
import xsna.lu7;
import xsna.lz;
import xsna.m0f;
import xsna.mm6;
import xsna.mo1;
import xsna.mu7;
import xsna.mz;
import xsna.ni0;
import xsna.noa;
import xsna.nu0;
import xsna.ogb;
import xsna.ph;
import xsna.po6;
import xsna.pw3;
import xsna.qcy;
import xsna.qo1;
import xsna.r0c;
import xsna.r480;
import xsna.rv3;
import xsna.s3q0;
import xsna.sv1;
import xsna.tb;
import xsna.tj50;
import xsna.tv3;
import xsna.uib;
import xsna.ul1;
import xsna.uwb;
import xsna.va9;
import xsna.vrf;
import xsna.vyh0;
import xsna.wf8;
import xsna.wgb;
import xsna.xf1;
import xsna.xf8;
import xsna.xgl0;
import xsna.ymb;
import xsna.ypf;
import xsna.zak0;
import xsna.zjw0;
import xsna.zk70;
import xsna.zmp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        Object obj2;
        int i2 = this.b;
        int i3 = 0;
        int i4 = 2;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                ((com.vk.movika.sdk.base.listener.a) obj).c((Throwable) obj3);
                return s3q0.a;
            case 1:
                bqh0 bqh0Var = (bqh0) obj3;
                qcy<Object>[] qcyVarArr = ph.n1;
                bqh0Var.b(bqh0Var.e);
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                ((h30) obj3).n = null;
                return s3q0.a;
            case 3:
                AlbumsListFragment albumsListFragment = (AlbumsListFragment) obj3;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                qo1 qo1Var = albumsListFragment.W;
                if (qo1Var == null || !qo1Var.e) {
                    new PhotoAlbumFragment.a(albumsListFragment.Z, photoAlbum, false).l(albumsListFragment);
                } else {
                    albumsListFragment.jo(photoAlbum);
                }
                return s3q0.a;
            case 4:
                lu1 lu1Var = (lu1) obj3;
                AllHighlightsFragment allHighlightsFragment = lu1Var.c;
                d5v d5vVar = (d5v) ((Pair) obj).g();
                if (d5vVar instanceof d5v.b) {
                    Narrative narrative = ((d5v.b) d5vVar).a;
                    ArrayList arrayList = lu1Var.k;
                    if (arrayList != null) {
                        ArrayList arrayList2 = lu1Var.l;
                        arrayList.add(0, narrative);
                        if (!lu1Var.m) {
                            allHighlightsFragment.ko(arrayList);
                        } else if (arrayList2 != null) {
                            arrayList2.add(0, narrative);
                            allHighlightsFragment.ko(arrayList2);
                        }
                    }
                } else if (d5vVar instanceof d5v.a) {
                    Narrative narrative2 = ((d5v.a) d5vVar).a;
                    ArrayList arrayList3 = lu1Var.k;
                    if (arrayList3 != null) {
                        ArrayList arrayList4 = lu1Var.l;
                        Iterator<Narrative> it = arrayList3.iterator();
                        int i5 = 0;
                        while (true) {
                            i = -1;
                            if (!it.hasNext()) {
                                i5 = -1;
                            } else if (it.next().b != narrative2.b) {
                                i5++;
                            }
                        }
                        arrayList3.set(i5, narrative2);
                        if (!lu1Var.m) {
                            allHighlightsFragment.ko(arrayList3);
                        } else if (arrayList4 != null) {
                            Iterator<Narrative> it2 = arrayList4.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (it2.next().b == narrative2.b) {
                                        i = i3;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            arrayList4.set(i, narrative2);
                            allHighlightsFragment.ko(arrayList4);
                        }
                    }
                }
                return s3q0.a;
            case 5:
                int i6 = AnimatedGiftView.g;
                ((AnimatedGiftView) obj3).getClass();
                return Boolean.valueOf(obj instanceof lnw);
            case 6:
                File file = (File) obj3;
                com.vk.core.files.a.O(file, (byte[]) obj);
                file.deleteOnExit();
                return file;
            case 7:
                com.vk.superapp.miniapps.picker.i iVar = ((AppsPickerFragment) obj3).S;
                if (iVar != null) {
                    iVar.setItems(Collections.singletonList(PickerItem.a.b));
                }
                return s3q0.a;
            case 8:
                com.vk.articles.a aVar = (com.vk.articles.a) obj3;
                if ((((com.vk.core.utils.newtork.d) obj) instanceof d.b) && aVar.k && !aVar.j) {
                    aVar.a();
                }
                return s3q0.a;
            case 9:
                pw3 pw3Var = (pw3) obj;
                int i7 = AsrRecordStartFragment.U;
                ((AsrRecordStartFragment) obj3).S.getClass();
                if (pw3Var instanceof pw3.b) {
                    obj2 = new tv3(((pw3.b) pw3Var).a);
                } else {
                    if (!(pw3Var instanceof pw3.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = rv3.a;
                }
                return new it80(obj2);
            case 10:
                r0c r0cVar = (r0c) obj3;
                r0cVar.s0(r0cVar.u + 1);
                r0cVar.t0(r0cVar.v + 1);
                return s3q0.a;
            case 11:
                int i8 = BaseDebugTogglesFragment.X;
                ((BaseDebugTogglesFragment) obj3).ho();
                return s3q0.a;
            case 12:
                ((BonusCatalogFragment) obj3).io();
                return s3q0.a;
            case 13:
                return gu7.a((lu7) obj, ((mu7) obj3).k());
            case 14:
                zjw0 zjw0Var = (zjw0) obj3;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ViewGroup viewGroup = zjw0Var.a;
                ViewParent parent = viewGroup.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 == null) {
                    viewGroup2 = viewGroup;
                }
                biq biqVar = new biq();
                biqVar.addTarget(viewGroup);
                zmp0.a(viewGroup2, biqVar);
                bwt0.p0(viewGroup, booleanValue);
                zjw0Var.c.invoke(bool);
                if (booleanValue) {
                    wf8 wf8Var = new wf8(viewGroup.getContext());
                    viewGroup.addView(wf8Var.b);
                    int i9 = 5;
                    int i10 = 4;
                    int i11 = 7;
                    io.reactivex.rxjava3.disposables.c subscribe = new i0(zjw0Var.b.c().a0(asu0.a.d()).U(new mm6(new mo1(zjw0Var, i9), i4)), new nu0(new la2(i10), i4)).subscribe(new io1(new ul1(wf8Var, 11), i11));
                    io.reactivex.rxjava3.disposables.b bVar = zjw0Var.g;
                    bVar.b(subscribe);
                    wf8Var.a();
                    kb kbVar = new kb(new i8(zjw0Var), i11);
                    io.reactivex.rxjava3.subjects.f<xf8> fVar = wf8Var.x;
                    i0 i0Var = new i0(fVar.U(kbVar), new l8(new j60(i9), i11));
                    int i12 = 13;
                    bVar.b(i0Var.subscribe(new ir0(new p(zjw0Var, i12), i4)));
                    wf8Var.a();
                    bVar.b(fVar.b0(xf8.g.class).subscribe(new lz(new tb(zjw0Var, 17), i11)));
                    wf8Var.a();
                    bVar.b(fVar.b0(xf8.f.class).subscribe(new xf1(new mz(zjw0Var, i12), i10)));
                    zjw0Var.e = wf8Var;
                } else {
                    zjw0Var.a();
                }
                return s3q0.a;
            case 15:
                ((com.vk.voip.ui.settings.participants_view.c) obj3).o.setText(zk70.b((Throwable) obj));
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((va9) obj3).q);
            case 17:
                ((zak0) ((noa) obj3).p).setValue((String) obj);
                return s3q0.a;
            case 18:
                po6 po6Var = (po6) obj3;
                if (((Boolean) obj).booleanValue()) {
                    po6Var.a1();
                } else {
                    po6Var.Q0();
                }
                return s3q0.a;
            case 19:
                ebb ebbVar = (ebb) obj3;
                uib a = ((xgl0) obj).a();
                a.g(ebbVar.d, ebbVar.c.b);
                Integer num = ebbVar.e;
                if (num != null) {
                    a.L(num.intValue(), ebbVar.f);
                }
                return s3q0.a;
            case 20:
                wgb wgbVar = (wgb) obj3;
                Throwable th = (Throwable) obj;
                if (!sv1.t(th)) {
                    wgbVar.b.c(th, new com.vk.movika.sdk.android.defaultplayer.interactive.a(wgbVar, 14));
                }
                wgbVar.b(new w(wgbVar, 18));
                wgbVar.m.onNext(new ogb.b.a(th));
                return s3q0.a;
            case 21:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new ni0(i4, (r480) obj, (ymb) obj3));
                return s3q0.a;
            case 22:
                return ((ipm) obj).a(((uwb) obj3).i.f.b);
            case 23:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) obj3;
                String str = (String) obj;
                if (classifiedsCatalogRootVh.e0.r instanceof vyh0) {
                    classifiedsCatalogRootVh.X = null;
                    SearchResultsVh.cb(classifiedsCatalogRootVh.a0, str, null, null, false, null, false, 60);
                }
                return s3q0.a;
            case 24:
                int i13 = ClipFeedListFragment.a2;
                ((ClipFeedListFragment) obj3).Ko((m0f.a) obj);
                return s3q0.a;
            case 25:
                c2e c2eVar = (c2e) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> Sb = uIBlockList.Sb();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : Sb) {
                    if (((UIBlock) obj4).Cb() == CatalogDataType.DATA_TYPE_OWNERS) {
                        arrayList5.add(obj4);
                    }
                }
                boolean M = j5g.M(arrayList5);
                if (!M) {
                    for (UIBlock uIBlock : uIBlockList.Sb()) {
                        c2eVar.getClass();
                        if (uIBlock instanceof UIBlockList) {
                            ArrayList<UIBlock> Sb2 = ((UIBlockList) uIBlock).Sb();
                            if (Sb2 == null || !Sb2.isEmpty()) {
                                Iterator<T> it3 = Sb2.iterator();
                                while (it3.hasNext()) {
                                    if (((UIBlock) it3.next()).Cb() == CatalogDataType.DATA_TYPE_OWNERS) {
                                        M = true;
                                    }
                                }
                            }
                        } else if ((uIBlock instanceof UIBlockSearchAuthor) && uIBlock.Cb() == CatalogDataType.DATA_TYPE_OWNERS) {
                            M = true;
                        }
                    }
                }
                return Boolean.valueOf(M);
            case 26:
                return new ClipsFavoriteFolderContentListViewState.c(((tj50.a) obj).a(new ul1((com.vk.clips.favorites.impl.ui.folders.content.f) obj3, 23), ao8.d));
            case 27:
                ((com.vk.clips.favorites.impl.ui.folders.picker.b) obj3).T(c.e.a.b);
                return s3q0.a;
            case 28:
                ((vrf) obj3).a.v((ypf) obj);
                return s3q0.a;
            default:
                int i14 = com.vk.attachpicker.collages.a.k1;
                ((lds0) obj3).onFirstFrameRendered();
                return s3q0.a;
        }
    }
}
