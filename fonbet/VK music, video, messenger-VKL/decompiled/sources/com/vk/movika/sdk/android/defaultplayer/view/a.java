package com.vk.movika.sdk.android.defaultplayer.view;

import android.text.TextUtils;
import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsGetEmbeddedUrlResponseDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsInitializePaymentForMessagesPaidReactionsResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.database.dto.DatabaseStationDto;
import com.vk.api.generated.market.dto.MarketEditCommunityReviewCommentResponseDto;
import com.vk.api.generated.market.dto.MarketGeoSuggestResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetDzenBlockResponseDto;
import com.vk.api.generated.places.dto.PlacesGetPostsExtendedResponseDto;
import com.vk.api.generated.podcasts.dto.PodcastsSuccessResponseDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSaveUploadedThumbResponseDto;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.functions.c;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.functions.m;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.util.Predicate;
import xsna.b03;
import xsna.bwg0;
import xsna.cew;
import xsna.f03;
import xsna.m99;
import xsna.q1w;
import xsna.u330;
import xsna.ucp;
import xsna.usl0;
import xsna.wwx;
import xsna.xtp0;
import xsna.xwk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements b03, m, f03, c, Predicate, ValueValidator, l, Preference.b {
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    public static void a(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        int i = SettingsGeneralFragment.z0;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        cew.b.getClass();
        cew.h().edit().putBoolean("setting_stories_enabled_messenger", booleanValue).apply();
        q1w.a.x(new usl0(booleanValue));
        return true;
    }

    @Override // ru.ok.tensorflow.util.Predicate, io.reactivex.rxjava3.functions.l
    public Boolean apply(Object obj) {
        Boolean lambda$process$3;
        lambda$process$3 = BodyPatternMatchingPipeline.lambda$process$3((PatternMatchRaw) obj);
        return lambda$process$3;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (AppsGetEmbeddedUrlResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGetEmbeddedUrlResponseDto.class).getType())).a();
            case 11:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 13:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, DatabaseStationDto.class).getType()).getType())).a();
            case 20:
                return (MarketGeoSuggestResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGeoSuggestResponseDto.class).getType())).a();
            case 21:
                return (MarketEditCommunityReviewCommentResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketEditCommunityReviewCommentResponseDto.class).getType())).a();
            case 22:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 25:
                return (PlacesGetPostsExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PlacesGetPostsExtendedResponseDto.class).getType())).a();
            case 26:
                return (PodcastsSuccessResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PodcastsSuccessResponseDto.class).getType())).a();
            default:
                return (PollsPollDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PollsPollDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetEmbeddedUrlResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetResponseDto.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 12:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsInitializePaymentForMessagesPaidReactionsResponseDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, UserId.class).getType()).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGetDzenBlockResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoSaveUploadedThumbResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 14:
                if (l.longValue() >= 0) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return obj instanceof bwg0;
            case 8:
                return m99.m(obj);
            default:
                float f = CameraUIView.w1;
                return obj instanceof u330;
        }
    }

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        LiveEventModel liveEventModel = (LiveEventModel) obj;
        if (!TextUtils.isEmpty(liveEventModel.n)) {
            ucp ucpVar = ucp.a;
            liveEventModel.q = ucp.i(xwk.d().a().m(liveEventModel.n));
        }
        if (!TextUtils.isEmpty(liveEventModel.d())) {
            ucp ucpVar2 = ucp.a;
            liveEventModel.r = ucp.i(liveEventModel.d().replace(" ", " "));
        }
        return liveEventModel;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        LinkedList linkedList = (LinkedList) obj;
        linkedList.addLast((Attachment) obj2);
        return linkedList;
    }
}
