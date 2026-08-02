package com.usercentrics.sdk.v2.cookie.service;

import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIDeviceStorageContent;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.banner.service.mapper.tcf.storageinfo.DeviceStorageMapper;
import com.usercentrics.sdk.v2.cookie.repository.ICookieInformationRepository;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CookieInformationService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/models/settings/PredefinedUIDeviceStorageContent;", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.cookie.service.CookieInformationService$fetchCookieInfo$1", f = "CookieInformationService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class CookieInformationService$fetchCookieInfo$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super List<? extends PredefinedUIDeviceStorageContent>>, Object> {
    final /* synthetic */ String $cookieInfoURL;
    int label;
    final /* synthetic */ CookieInformationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CookieInformationService$fetchCookieInfo$1(CookieInformationService cookieInformationService, String str, Continuation<? super CookieInformationService$fetchCookieInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = cookieInformationService;
        this.$cookieInfoURL = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CookieInformationService$fetchCookieInfo$1(this.this$0, this.$cookieInfoURL, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(DispatcherScope dispatcherScope, Continuation<? super List<PredefinedUIDeviceStorageContent>> continuation) {
        return ((CookieInformationService$fetchCookieInfo$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(DispatcherScope dispatcherScope, Continuation<? super List<? extends PredefinedUIDeviceStorageContent>> continuation) {
        return invoke2(dispatcherScope, (Continuation<? super List<PredefinedUIDeviceStorageContent>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map vendorListOrTranslatedDeclarationsPurposes;
        ICookieInformationRepository iCookieInformationRepository;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            vendorListOrTranslatedDeclarationsPurposes = this.this$0.getVendorListOrTranslatedDeclarationsPurposes();
            iCookieInformationRepository = this.this$0.cookieInformationRepository;
            ConsentDisclosureObject fetchCookieInfo = iCookieInformationRepository.fetchCookieInfo(this.$cookieInfoURL);
            PredefinedUICookieInformationLabels cookieInformationLabels = this.this$0.cookieInformationLabels();
            Intrinsics.checkNotNull(cookieInformationLabels);
            if (vendorListOrTranslatedDeclarationsPurposes == null) {
                vendorListOrTranslatedDeclarationsPurposes = MapsKt.emptyMap();
            }
            return new DeviceStorageMapper(fetchCookieInfo, cookieInformationLabels, vendorListOrTranslatedDeclarationsPurposes).map();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
