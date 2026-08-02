package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import defpackage.lu3;
import defpackage.pog;
import defpackage.rq3;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidShow;", "Lcom/unity3d/ads/core/domain/Show;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "gameServerIdReader", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "handleGatewayAdResponse", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/configuration/GameServerIdReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/ValidateExtrasSize;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/UnityAdsShowOptions;", "showOptions", "Lz88;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/UnityAdsShowOptions;)Lz88;", "", "terminate", "(Lcom/unity3d/ads/core/data/model/AdObject;Lrq3;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidShow implements Show {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final GameServerIdReader gameServerIdReader;

    @NotNull
    private final HandleGatewayAdResponse handleGatewayAdResponse;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final ValidateExtrasSize validateExtrasSize;

    public AndroidShow(@NotNull Context context, @NotNull AdRepository adRepository, @NotNull GameServerIdReader gameServerIdReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull ValidateExtrasSize validateExtrasSize, @NotNull HandleGatewayAdResponse handleGatewayAdResponse) {
        context.getClass();
        adRepository.getClass();
        gameServerIdReader.getClass();
        sendDiagnosticEvent.getClass();
        validateExtrasSize.getClass();
        handleGatewayAdResponse.getClass();
        this.context = context;
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
    }

    @Override // com.unity3d.ads.core.domain.Show
    @NotNull
    public z88 invoke(@NotNull AdObject adObject, @Nullable UnityAdsShowOptions showOptions) {
        adObject.getClass();
        return new pog(new AndroidShow$invoke$1(adObject, this, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    @Nullable
    public Object terminate(@NotNull AdObject adObject, @NotNull rq3<? super Unit> rq3Var) {
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null) {
            return Unit.a;
        }
        Object destroy = adPlayer.destroy(rq3Var);
        return destroy == lu3.a ? destroy : Unit.a;
    }
}
