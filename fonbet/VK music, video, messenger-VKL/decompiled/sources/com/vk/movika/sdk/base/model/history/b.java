package com.vk.movika.sdk.base.model.history;

import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetPrivacySettingsResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsMessageDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetInviteLinkPreviewResponseDto;
import com.vk.api.generated.identity.dto.IdentityPhoneResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewCreateConfigResponseDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsGetCheckoutUrlResponseDto;
import com.vk.api.generated.messages.dto.MessagesJoinChatByInviteLinkResponseDto;
import com.vk.api.generated.messages.dto.MessagesScheduledCallSingleItemDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCreatedRecordDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetByIdExtendedResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppGetShowcasePageResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.group.Group;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.functions.e;
import io.reactivex.rxjava3.functions.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b03;
import xsna.b25;
import xsna.bn00;
import xsna.f03;
import xsna.o25;
import xsna.s3q0;
import xsna.tlo0;
import xsna.wh50;
import xsna.wwx;
import xsna.xao0;
import xsna.xtp0;
import xsna.zak0;
import xsna.zrb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements f03, l, b03, Preference.b, ListValidator, ValueValidator, s {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, tlo0 tlo0Var) {
        return (tlo0Var.hashCode() + i) * i2;
    }

    public static String b(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static void c(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        wh50 wh50Var = xao0.a;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        ((zak0) xao0.a).setValue(bool);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return ((zrb0) obj).a;
            case 7:
                return s3q0.a;
            case 23:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
            default:
                return new Group();
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 4:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 6:
                return (ChannelsMessageDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsMessageDto.class).getType())).a();
            case 13:
                return (GroupsGetInviteLinkPreviewResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsGetInviteLinkPreviewResponseDto.class).getType())).a();
            case 15:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 22:
                return (MessagesJoinChatByInviteLinkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesJoinChatByInviteLinkResponseDto.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 26:
                return (ServiceBookingCreatedRecordDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingCreatedRecordDto.class).getType())).a();
            default:
                return (ShortVideoSetCoOwnerStatusResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoSetCoOwnerStatusResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetPrivacySettingsResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 12:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemSendOtpResponseDto.class).getType());
            case 14:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, IdentityPhoneResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketIntegrationsGetCheckoutUrlResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCommunityReviewCreateConfigResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesScheduledCallSingleItemDto.class).getType());
            case 28:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetByIdExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SuperAppGetShowcasePageResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Double) obj).doubleValue() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.b25$a, xsna.knz] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final r rVar) {
        int i = LiveVideoDialog.B0;
        final ?? r0 = new b25.a() { // from class: xsna.knz
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                int i2 = LiveVideoDialog.B0;
                io.reactivex.rxjava3.core.r.this.onNext(Boolean.valueOf(tbu0Var.b()));
            }
        };
        o25.a().b0(r0);
        rVar.a(new e() { // from class: xsna.inz
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                int i2 = LiveVideoDialog.B0;
                o25.a().B(knz.this);
            }
        });
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
