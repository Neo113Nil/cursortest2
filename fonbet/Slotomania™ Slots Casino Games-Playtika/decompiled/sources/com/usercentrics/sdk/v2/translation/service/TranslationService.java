package com.usercentrics.sdk.v2.translation.service;

import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import com.usercentrics.sdk.v2.translation.repository.ITranslationRepository;
import io.sentry.protocol.Device;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslationService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/usercentrics/sdk/v2/translation/service/TranslationService;", "Lcom/usercentrics/sdk/v2/translation/service/ITranslationService;", "translationRepository", "Lcom/usercentrics/sdk/v2/translation/repository/ITranslationRepository;", "(Lcom/usercentrics/sdk/v2/translation/repository/ITranslationRepository;)V", "<set-?>", "Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "translations", "getTranslations", "()Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;", "loadTranslations", "", Device.JsonKeys.LANGUAGE, "", "bypassCache", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TranslationService implements ITranslationService {
    private final ITranslationRepository translationRepository;
    private LegalBasisLocalization translations;

    public TranslationService(ITranslationRepository translationRepository) {
        Intrinsics.checkNotNullParameter(translationRepository, "translationRepository");
        this.translationRepository = translationRepository;
    }

    @Override // com.usercentrics.sdk.v2.translation.service.ITranslationService
    public LegalBasisLocalization getTranslations() {
        return this.translations;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.translation.service.ITranslationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadTranslations(String str, boolean z, Continuation<? super Unit> continuation) {
        TranslationService$loadTranslations$1 translationService$loadTranslations$1;
        int i;
        TranslationService translationService;
        if (continuation instanceof TranslationService$loadTranslations$1) {
            translationService$loadTranslations$1 = (TranslationService$loadTranslations$1) continuation;
            if ((translationService$loadTranslations$1.label & Integer.MIN_VALUE) != 0) {
                translationService$loadTranslations$1.label -= Integer.MIN_VALUE;
                Object obj = translationService$loadTranslations$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = translationService$loadTranslations$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ITranslationRepository iTranslationRepository = this.translationRepository;
                    translationService$loadTranslations$1.L$0 = this;
                    translationService$loadTranslations$1.label = 1;
                    obj = iTranslationRepository.fetchTranslations(str, z, translationService$loadTranslations$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    translationService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    translationService = (TranslationService) translationService$loadTranslations$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                translationService.translations = (LegalBasisLocalization) obj;
                return Unit.INSTANCE;
            }
        }
        translationService$loadTranslations$1 = new TranslationService$loadTranslations$1(this, continuation);
        Object obj2 = translationService$loadTranslations$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = translationService$loadTranslations$1.label;
        if (i != 0) {
        }
        translationService.translations = (LegalBasisLocalization) obj2;
        return Unit.INSTANCE;
    }
}
