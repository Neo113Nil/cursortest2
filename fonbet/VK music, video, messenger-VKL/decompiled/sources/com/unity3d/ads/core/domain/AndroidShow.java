package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.izg0;
import xsna.ksr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: AndroidShow.kt */
/* loaded from: classes14.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final Context context;
    private final GameServerIdReader gameServerIdReader;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final ValidateExtrasSize validateExtrasSize;

    public AndroidShow(Context context, AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize, HandleGatewayAdResponse handleGatewayAdResponse) {
        this.context = context;
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public ksr<ShowEvent> invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        return new izg0(new AndroidShow$invoke$1(adObject, this, unityAdsShowOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, spj<? super s3q0> spjVar) {
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null) {
            return s3q0.a;
        }
        Object destroy = adPlayer.destroy(spjVar);
        return destroy == CoroutineSingletons.COROUTINE_SUSPENDED ? destroy : s3q0.a;
    }
}
