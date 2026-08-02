package com.vk.movika.sdk.android.defaultplayer.interactive;

import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetBannedResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.calls.dto.CallsGetGroupTokenResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetRecommendationsResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumByIdResponseDto;
import com.vk.api.generated.market.dto.MarketUpdateCommunityReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetSubscriptionsShortVideosResponseDto;
import com.vk.api.generated.stickers.dto.StickersMarkPopupAnimationInterruptedResponseDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.core.util.NoLocation;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.log.L;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.functions.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.b03;
import xsna.f03;
import xsna.l5g;
import xsna.lec0;
import xsna.s3q0;
import xsna.wwx;
import xsna.xtp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements f03, b03, l, Preference.b, ValueValidator, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ c(int i) {
        this.b = i;
    }

    public static String a(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static JSONObject b(String str, boolean z) {
        return new JSONObject().put(str, z);
    }

    public static l5g c(long j, androidx.compose.runtime.a aVar) {
        aVar.j();
        return new l5g(j);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        ((Boolean) obj).getClass();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 6:
                L.g("CameraLocationHelper", (Throwable) obj);
                return NoLocation.b;
            default:
                return s3q0.a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return Integer.valueOf(((Number) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 7:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 14:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 15:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 16:
                return (GroupsGetFriendsInvitationListResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetFriendsInvitationListResponseDto.class).getType())).a();
            case 17:
                return (MarketGetAlbumByIdResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetAlbumByIdResponseDto.class).getType())).a();
            case 21:
                return (MessagesGetConversationMembersDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetConversationMembersDto.class).getType())).a();
            case 23:
                return (BaseUploadServerDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseUploadServerDto.class).getType())).a();
            case 27:
                return (ShortVideoGetSubscriptionsShortVideosResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoGetSubscriptionsShortVideosResponseDto.class).getType())).a();
            default:
                return (StickersMarkPopupAnimationInterruptedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StickersMarkPopupAnimationInterruptedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetBannedResponseDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsGetGroupTokenResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsGetRecommendationsResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketUpdateCommunityReviewResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PodcastsGetGroupInfoResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UtilsDomainResolvedWithDataDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 12:
                return ((String) obj).length() >= 1;
            default:
                return ((Long) obj).longValue() >= 0;
        }
    }

    public /* synthetic */ c(Object obj, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 19:
                Integer num = (Integer) obj2;
                return (num != null && num.intValue() == -1) ? num : Integer.valueOf(Integer.max(((Integer) obj).intValue(), num.intValue()));
            default:
                return new Pair((lec0) obj, (Boolean) obj2);
        }
    }

    public void d() {
    }
}
