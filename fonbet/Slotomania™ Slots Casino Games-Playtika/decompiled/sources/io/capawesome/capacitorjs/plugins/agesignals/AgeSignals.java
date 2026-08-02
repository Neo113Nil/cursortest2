package io.capawesome.capacitorjs.plugins.agesignals;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.agesignals.AgeSignalsManagerFactory;
import com.google.android.play.agesignals.AgeSignalsRequest;
import com.google.android.play.agesignals.AgeSignalsResult;
import io.capawesome.capacitorjs.plugins.agesignals.classes.CustomExceptions;
import io.capawesome.capacitorjs.plugins.agesignals.classes.results.CheckAgeSignalsResult;
import io.capawesome.capacitorjs.plugins.agesignals.interfaces.NonEmptyResultCallback;

/* loaded from: classes8.dex */
public class AgeSignals {
    private final AgeSignalsPlugin plugin;

    public AgeSignals(AgeSignalsPlugin ageSignalsPlugin) {
        this.plugin = ageSignalsPlugin;
    }

    public void checkAgeSignals(final NonEmptyResultCallback<CheckAgeSignalsResult> nonEmptyResultCallback) {
        Task<AgeSignalsResult> checkAgeSignals = AgeSignalsManagerFactory.create(this.plugin.getActivity()).checkAgeSignals(AgeSignalsRequest.builder().build());
        checkAgeSignals.addOnSuccessListener(new OnSuccessListener() { // from class: io.capawesome.capacitorjs.plugins.agesignals.AgeSignals$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                AgeSignals.lambda$checkAgeSignals$0(NonEmptyResultCallback.this, (AgeSignalsResult) obj);
            }
        });
        checkAgeSignals.addOnFailureListener(new OnFailureListener() { // from class: io.capawesome.capacitorjs.plugins.agesignals.AgeSignals$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                AgeSignals.this.lambda$checkAgeSignals$1(nonEmptyResultCallback, exc);
            }
        });
    }

    static /* synthetic */ void lambda$checkAgeSignals$0(NonEmptyResultCallback nonEmptyResultCallback, AgeSignalsResult ageSignalsResult) {
        try {
            nonEmptyResultCallback.success(new CheckAgeSignalsResult(ageSignalsResult));
        } catch (Exception e) {
            nonEmptyResultCallback.error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkAgeSignals$1(NonEmptyResultCallback nonEmptyResultCallback, Exception exc) {
        nonEmptyResultCallback.error(mapErrorCodeToException(exc));
    }

    private Exception mapErrorCodeToException(Exception exc) {
        if (!(exc instanceof ApiException)) {
            return exc;
        }
        switch (((ApiException) exc).getStatusCode()) {
            case 25000:
                return CustomExceptions.API_NOT_AVAILABLE;
            case 25001:
                return CustomExceptions.PLAY_STORE_NOT_FOUND;
            case 25002:
                return CustomExceptions.NETWORK_ERROR;
            case 25003:
                return CustomExceptions.PLAY_SERVICES_NOT_FOUND;
            case 25004:
                return CustomExceptions.CANNOT_BIND_TO_SERVICE;
            case 25005:
                return CustomExceptions.PLAY_STORE_VERSION_OUTDATED;
            case 25006:
                return CustomExceptions.PLAY_SERVICES_VERSION_OUTDATED;
            case 25007:
                return CustomExceptions.CLIENT_TRANSIENT_ERROR;
            case 25008:
                return CustomExceptions.APP_NOT_OWNED;
            case 25009:
                return CustomExceptions.INTERNAL_ERROR;
            case 25010:
                return CustomExceptions.SDK_VERSION_OUTDATED;
            default:
                return exc;
        }
    }
}
