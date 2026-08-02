package com.capacitor.google.play.games.services;

import com.google.android.gms.games.AuthenticationResult;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class GooglePlayGamesServices$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final /* synthetic */ Consumer f$0;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f$0.accept((AuthenticationResult) obj);
    }
}
