package com.vk.repository.internal.repos.stickers.suggests;

import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.store.dto.StoreStickersKeywordDto;
import com.vk.api.generated.store.dto.StoreStickersKeywordSpecialItemDto;
import com.vk.api.generated.vmoji.dto.VmojiStickersSuggestionsDto;
import com.vk.dto.attaches.Attach;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photo.editor.features.colorgrading.g;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.core.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.bwt0;
import xsna.c5g;
import xsna.c95;
import xsna.epx;
import xsna.frf0;
import xsna.hoh;
import xsna.hx3;
import xsna.i3q0;
import xsna.izs;
import xsna.ja5;
import xsna.krz;
import xsna.la5;
import xsna.osz;
import xsna.qik;
import xsna.rsg0;
import xsna.s3q0;
import xsna.swe0;
import xsna.tec;
import xsna.vpc0;
import xsna.vyv0;
import xsna.wf8;
import xsna.xec;
import xsna.xo2;
import xsna.yfb;
import xsna.z8q0;
import xsna.zak0;
import xsna.zq70;

/* compiled from: VmojiPromoInSuggestsRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StickersDictionaryItemLight stickersDictionaryItemLight;
        PhotoAttachment photoAttachment;
        int i = 7;
        int i2 = 1;
        switch (this.b) {
            case 0:
                VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl = (VmojiPromoInSuggestsRepositoryImpl) this.receiver;
                vmojiPromoInSuggestsRepositoryImpl.getClass();
                ArrayList arrayList = new ArrayList();
                vmojiPromoInSuggestsRepositoryImpl.a.clear();
                for (StoreStickersKeywordDto storeStickersKeywordDto : (List) obj) {
                    List<BaseStickerDto> f = storeStickersKeywordDto.f();
                    if (f != null) {
                        Iterator<T> it = f.iterator();
                        while (it.hasNext()) {
                            Integer l = ((BaseStickerDto) it.next()).l();
                            if (l != null) {
                                arrayList.add(Integer.valueOf(l.intValue()));
                            }
                        }
                    }
                    if (storeStickersKeywordDto.f() == null) {
                        stickersDictionaryItemLight = null;
                    } else {
                        List<String> g = storeStickersKeywordDto.g();
                        List<BaseStickerDto> f2 = storeStickersKeywordDto.f();
                        ArrayList arrayList2 = new ArrayList(c5g.u(f2, 10));
                        for (BaseStickerDto baseStickerDto : f2) {
                            Integer j = baseStickerDto.j();
                            int intValue = j != null ? j.intValue() : 0;
                            Integer l2 = baseStickerDto.l();
                            arrayList2.add(new StickersDictionaryItemLight.DictionaryStickerModel(intValue, l2 != null ? l2.intValue() : 0));
                        }
                        List<StoreStickersKeywordSpecialItemDto> d = storeStickersKeywordDto.d();
                        stickersDictionaryItemLight = new StickersDictionaryItemLight(g, arrayList2, d != null && (d.isEmpty() ^ true));
                    }
                    if (stickersDictionaryItemLight != null) {
                        Iterator<String> it2 = stickersDictionaryItemLight.Ab().iterator();
                        while (it2.hasNext()) {
                            vmojiPromoInSuggestsRepositoryImpl.a.put(it2.next(), stickersDictionaryItemLight);
                        }
                    }
                }
                if (vmojiPromoInSuggestsRepositoryImpl.c == null || arrayList.isEmpty()) {
                    vmojiPromoInSuggestsRepositoryImpl.a();
                } else {
                    VmojiStickersSuggestionsDto vmojiStickersSuggestionsDto = vmojiPromoInSuggestsRepositoryImpl.c;
                    vmojiPromoInSuggestsRepositoryImpl.d.b(rsg0.w0(yfb.x(new zq70().H(vmojiStickersSuggestionsDto != null ? vmojiStickersSuggestionsDto.d() : null, arrayList))).m(asu0.a.c()).subscribe(new i3q0(new hx3(vmojiPromoInSuggestsRepositoryImpl, 10), i), new vyv0(new hoh(vmojiPromoInSuggestsRepositoryImpl, 13), i2)));
                }
                return s3q0.a;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                ja5 ja5Var = (ja5) this.receiver;
                ((zak0) ja5Var.a).setValue(la5.a(ja5Var.a(), 0, 0, swe0.f(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), 7));
                return s3q0.a;
            case 2:
                ((y) this.receiver).onSuccess((Cipher) obj);
                return s3q0.a;
            case 3:
                bwt0.p0(((wf8) this.receiver).m, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 4:
                ((tec) this.receiver).T((xec) obj);
                return s3q0.a;
            case 5:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((d) obj);
                return s3q0.a;
            case 6:
                ImageCropData imageCropData = (ImageCropData) obj;
                qik qikVar = (qik) this.receiver;
                if (qikVar.g && (photoAttachment = qikVar.b) != null) {
                    imageCropData.f(photoAttachment.Hb());
                    qik.a aVar = qikVar.d;
                    if (aVar != null) {
                        aVar.b(imageCropData);
                    }
                }
                return s3q0.a;
            case 7:
                ((g) this.receiver).c(((Number) obj).intValue());
                return s3q0.a;
            case 8:
                osz oszVar = (osz) obj;
                krz krzVar = (krz) this.receiver;
                krzVar.getClass();
                if (epx.f(oszVar, osz.a.a)) {
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MOBILE_QR_CLOSE_ALERT_TAP, null, null, null, null, null, null, 254);
                    FragmentActivity activity = krzVar.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                } else if (epx.f(oszVar, osz.c.a)) {
                    String str = krzVar.k;
                    b bVar = b.a;
                    SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.MOBILE_QR_ALERT_AUTH_ERROR;
                    SchemeStatSak$TypeRegistrationItem.Error error = SchemeStatSak$TypeRegistrationItem.Error.MOBILE_QR_AUTH_ERROR;
                    ArrayList arrayList3 = new ArrayList();
                    if (str != null) {
                        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID;
                        bVar.getClass();
                        arrayList3.add(b.d(name, str));
                    }
                    b.z(bVar, schemeStatSak$EventScreen, arrayList3, null, error, 12);
                } else {
                    if (!epx.f(oszVar, osz.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str2 = krzVar.k;
                    b bVar2 = b.a;
                    SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = SchemeStatSak$EventScreen.ALERT_ACCOUNTS_LIMIT_REACHED;
                    SchemeStatSak$TypeRegistrationItem.Error error2 = SchemeStatSak$TypeRegistrationItem.Error.ACCOUNTS_LIMIT_REACHED_ERROR;
                    ArrayList arrayList4 = new ArrayList();
                    if (str2 != null) {
                        SchemeStatSak$RegistrationFieldItem.Name name2 = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID;
                        bVar2.getClass();
                        arrayList4.add(b.d(name2, str2));
                    }
                    b.z(bVar2, schemeStatSak$EventScreen2, arrayList4, null, error2, 12);
                    MultiAccountEntryPoint.QrWebToApp qrWebToApp = MultiAccountEntryPoint.QrWebToApp.d;
                    RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                    SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.ACCOUNTS_LIMIT_REACHED_ERROR;
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.TO_SWITCHER_FROM, "", "", qrWebToApp.b));
                    s3q0 s3q0Var = s3q0.a;
                    frf0.a(eventType, arrayList5, null, null, null, null, null, 252);
                }
                return s3q0.a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.receiver;
                if (booleanValue) {
                    xo2.f(marketItemReviewsFragment.s0, true, true, 300L);
                } else {
                    ComposeView composeView = marketItemReviewsFragment.s0;
                    if (composeView != null) {
                        composeView.postDelayed(marketItemReviewsFragment.t0, 400L);
                    }
                }
                return s3q0.a;
            case 10:
                ((vpc0) this.receiver).getClass();
                return vpc0.b((PostingState) obj);
            default:
                MsgFromUser msgFromUser = (MsgFromUser) obj;
                z8q0 z8q0Var = (z8q0) this.receiver;
                z8q0Var.getClass();
                c95 c95Var = new c95(z8q0Var, 8);
                msgFromUser.getClass();
                Attach Q7 = com.vk.im.engine.models.messages.a.Q7(msgFromUser, c95Var, false);
                if (Q7 instanceof AttachPlaylist) {
                    return (AttachPlaylist) Q7;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, int i) {
        super(1, obj, ja5.class, "updateProgress", "updateProgress(F)V", 0);
        this.b = i;
        switch (i) {
            case 9:
                super(1, obj, MarketItemReviewsFragment.class, "setScreenSpinnerVisibility", "setScreenSpinnerVisibility(Z)V", 0);
                break;
            case 10:
                super(1, obj, vpc0.class, "mapCarouselSwitcherState", "mapCarouselSwitcherState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingCarouselSwitcherViewState;", 0);
                break;
            case 11:
                super(1, obj, z8q0.class, "mapMsgFromUserToAttachPlaylist", "mapMsgFromUserToAttachPlaylist(Lcom/vk/im/engine/models/messages/MsgFromUser;)Lcom/vk/im/engine/models/attaches/AttachPlaylist;", 0);
                break;
            default:
                break;
        }
    }
}
