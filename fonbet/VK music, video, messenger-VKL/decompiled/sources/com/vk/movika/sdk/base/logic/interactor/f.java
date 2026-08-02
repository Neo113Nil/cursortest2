package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.core.view.components.cell.VkCell;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.chat.clips.decoration.api.di.ImChatClipsDecorationScopedComponent;
import com.vk.im.chat.clips.decoration.api.models.ImClipsDecorationKey;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.awq;
import xsna.b1f;
import xsna.d6n;
import xsna.dli0;
import xsna.e3m;
import xsna.f6p;
import xsna.fpf0;
import xsna.h03;
import xsna.izs;
import xsna.jet;
import xsna.jwg0;
import xsna.k7m;
import xsna.kwg0;
import xsna.m7m;
import xsna.mnh0;
import xsna.myc0;
import xsna.op1;
import xsna.pwm;
import xsna.qcy;
import xsna.qgi0;
import xsna.rbj;
import xsna.rli0;
import xsna.s3q0;
import xsna.s4m;
import xsna.sa30;
import xsna.tgi0;
import xsna.tvf0;
import xsna.vwh;
import xsna.x8j;
import xsna.x960;
import xsna.xzi;
import xsna.zk70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ f(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        awq awqVar;
        int i = 6;
        MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason reason = null;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(com.vk.movika.sdk.base.model.m.b((com.vk.movika.sdk.base.model.f) obj) != null);
            case 1:
                return s3q0.a;
            case 2:
                Log.e("ClipsEditorVoiceOverAudioWaveVoiceoverStubController", "error on calc wave height", (Throwable) obj);
                return s3q0.a;
            case 3:
                return Base64.decode((String) obj, 2);
            case 4:
                com.vk.core.compose.component.datetime.a aVar = (com.vk.core.compose.component.datetime.a) obj;
                return rli0.r(dli0.e(aVar.e, new d(aVar, 14)), "", new op1(aVar, i), 30);
            case 5:
                qgi0.r((tgi0) obj, "CatalogBannerTitle");
                return s3q0.a;
            case 6:
                qgi0.r((tgi0) obj, "category_list_item_title");
                return s3q0.a;
            case 7:
                int i2 = kwg0.a;
                new jwg0("ecb").accept((Throwable) obj);
                return s3q0.a;
            case 8:
                MotionEvent motionEvent = (MotionEvent) obj;
                if (!mnh0.o(motionEvent) && !mnh0.r(motionEvent)) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 9:
                ClipsDecorationKey clipsDecorationKey = (ClipsDecorationKey) obj;
                if (!(clipsDecorationKey instanceof ImClipsDecorationKey)) {
                    return null;
                }
                k7m k7mVar = (k7m) m7m.f(new b1f());
                return ((ImChatClipsDecorationScopedComponent) k7mVar.d(((ImFeatureScopeProviderComponent) k7mVar.a(fpf0.a(ImFeatureScopeProviderComponent.class))).getProvider().a(((ImClipsDecorationKey) clipsDecorationKey).b)).a(fpf0.a(ImChatClipsDecorationScopedComponent.class))).Rc();
            case 10:
                L.g("ClipsTemplateEditorProcessingDelegateImpl", (Throwable) obj);
                return s3q0.a;
            case 11:
                return Boolean.valueOf((((com.vk.photo.editor.features.colorgrading.a) obj).i == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : 0) ^ 1);
            case 12:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 13:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                if (myc0.f(extendedCommunityProfile.O0)) {
                    return new s4m(extendedCommunityProfile.X0, R.drawable.vk_icon_article_outline_20, null, null, null, "about", extendedCommunityProfile.a.c, null, 2296);
                }
                return null;
            case 14:
                return Boolean.valueOf(((vwh) obj).q);
            case 15:
                return Long.valueOf(((xzi) obj).a);
            case 16:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, x8jVar.b, x8jVar.d, false, null, 384);
            case 17:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_receive_msgs_disable, (Context) obj);
            case 18:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 19:
                return pwm.a((pwm) obj, false, 0, false, null, false, 0, null, null, true, 16383);
            case 20:
                x960 x960Var = (x960) obj;
                if (x960Var instanceof tvf0) {
                    tvf0 tvf0Var = (tvf0) x960Var;
                    NewsEntriesContainer newsEntriesContainer = tvf0Var.c;
                    NewsEntriesContainer.Info info = newsEntriesContainer.b;
                    List<NewsEntry> list = newsEntriesContainer.c;
                    String str = info.b;
                    if (str == null || str.length() == 0) {
                        reason = MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason.EMPTY_NEXT_FROM;
                    } else if (list.isEmpty()) {
                        reason = MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason.EMPTY_PAGE;
                    }
                    if (reason != null && (awqVar = tvf0Var.d) != null) {
                        awqVar.k(list.size(), reason);
                    }
                }
                return s3q0.a;
            case 21:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return Boolean.valueOf(((d6n) obj).b.d);
            case 22:
                VkCell vkCell = new VkCell(((ViewGroup) obj).getContext(), objArr == true ? 1 : 0, i, r4);
                vkCell.setLeftMainAvatarController(new f6p.b());
                vkCell.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, f6p.p));
                return new f6p.g(vkCell);
            case 23:
                ((Throwable) obj).printStackTrace();
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                Throwable th = (Throwable) obj;
                h03.b(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((jet) obj).c);
            case 27:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 28:
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                return optJSONObject == null ? WallWithCounters.b : sa30.d(0, optJSONObject, 0, 0);
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ f(Object obj, int i) {
        this.b = i;
    }
}
