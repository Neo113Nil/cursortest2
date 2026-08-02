package com.usercentrics.sdk.v2.tcf.facade;

import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.models.api.ApiErrors;
import com.usercentrics.sdk.v2.tcf.service.ITCFService;
import com.usercentrics.tcf.core.model.gvl.Declarations;
import com.usercentrics.tcf.core.model.gvl.VendorList;
import io.sentry.protocol.Device;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TCFFacadeImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lcom/usercentrics/sdk/v2/tcf/facade/TCFFacadeImpl;", "Lcom/usercentrics/sdk/v2/tcf/facade/TCFFacade;", "tcfService", "Lcom/usercentrics/sdk/v2/tcf/service/ITCFService;", "(Lcom/usercentrics/sdk/v2/tcf/service/ITCFService;)V", "getDeclarations", "Lkotlin/Result;", "Lcom/usercentrics/tcf/core/model/gvl/Declarations;", Device.JsonKeys.LANGUAGE, "", "getDeclarations-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVendorList", "Lcom/usercentrics/tcf/core/model/gvl/VendorList;", "getVendorList-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TCFFacadeImpl implements TCFFacade {
    private final ITCFService tcfService;

    public TCFFacadeImpl(ITCFService tcfService) {
        Intrinsics.checkNotNullParameter(tcfService, "tcfService");
        this.tcfService = tcfService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.usercentrics.sdk.v2.tcf.facade.TCFFacade
    /* renamed from: getVendorList-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10627getVendorListIoAF18A(Continuation<? super Result<VendorList>> continuation) {
        TCFFacadeImpl$getVendorList$1 tCFFacadeImpl$getVendorList$1;
        int i;
        TCFFacadeImpl tCFFacadeImpl;
        try {
            if (continuation instanceof TCFFacadeImpl$getVendorList$1) {
                tCFFacadeImpl$getVendorList$1 = (TCFFacadeImpl$getVendorList$1) continuation;
                if ((tCFFacadeImpl$getVendorList$1.label & Integer.MIN_VALUE) != 0) {
                    tCFFacadeImpl$getVendorList$1.label -= Integer.MIN_VALUE;
                    Object obj = tCFFacadeImpl$getVendorList$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tCFFacadeImpl$getVendorList$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ITCFService iTCFService = this.tcfService;
                        tCFFacadeImpl$getVendorList$1.L$0 = this;
                        tCFFacadeImpl$getVendorList$1.label = 1;
                        if (iTCFService.loadVendorList(tCFFacadeImpl$getVendorList$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tCFFacadeImpl = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tCFFacadeImpl = (TCFFacadeImpl) tCFFacadeImpl$getVendorList$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    VendorList vendorList = tCFFacadeImpl.tcfService.getVendorList();
                    Intrinsics.checkNotNull(vendorList);
                    return Result.m11180constructorimpl(vendorList);
                }
            }
            if (i != 0) {
            }
            Result.Companion companion2 = Result.INSTANCE;
            VendorList vendorList2 = tCFFacadeImpl.tcfService.getVendorList();
            Intrinsics.checkNotNull(vendorList2);
            return Result.m11180constructorimpl(vendorList2);
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException(ApiErrors.FETCH_TCF_DATA, e)));
        }
        tCFFacadeImpl$getVendorList$1 = new TCFFacadeImpl$getVendorList$1(this, continuation);
        Object obj2 = tCFFacadeImpl$getVendorList$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCFFacadeImpl$getVendorList$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.usercentrics.sdk.v2.tcf.facade.TCFFacade
    /* renamed from: getDeclarations-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo10626getDeclarationsgIAlus(String str, Continuation<? super Result<Declarations>> continuation) {
        TCFFacadeImpl$getDeclarations$1 tCFFacadeImpl$getDeclarations$1;
        int i;
        TCFFacadeImpl tCFFacadeImpl;
        try {
            if (continuation instanceof TCFFacadeImpl$getDeclarations$1) {
                tCFFacadeImpl$getDeclarations$1 = (TCFFacadeImpl$getDeclarations$1) continuation;
                if ((tCFFacadeImpl$getDeclarations$1.label & Integer.MIN_VALUE) != 0) {
                    tCFFacadeImpl$getDeclarations$1.label -= Integer.MIN_VALUE;
                    Object obj = tCFFacadeImpl$getDeclarations$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tCFFacadeImpl$getDeclarations$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ITCFService iTCFService = this.tcfService;
                        tCFFacadeImpl$getDeclarations$1.L$0 = this;
                        tCFFacadeImpl$getDeclarations$1.label = 1;
                        if (iTCFService.loadDeclarations(str, tCFFacadeImpl$getDeclarations$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tCFFacadeImpl = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tCFFacadeImpl = (TCFFacadeImpl) tCFFacadeImpl$getDeclarations$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    Declarations declarations = tCFFacadeImpl.tcfService.getDeclarations();
                    Intrinsics.checkNotNull(declarations);
                    return Result.m11180constructorimpl(declarations);
                }
            }
            if (i != 0) {
            }
            Result.Companion companion2 = Result.INSTANCE;
            Declarations declarations2 = tCFFacadeImpl.tcfService.getDeclarations();
            Intrinsics.checkNotNull(declarations2);
            return Result.m11180constructorimpl(declarations2);
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new UsercentricsException(ApiErrors.FETCH_TCF_DATA, e)));
        }
        tCFFacadeImpl$getDeclarations$1 = new TCFFacadeImpl$getDeclarations$1(this, continuation);
        Object obj2 = tCFFacadeImpl$getDeclarations$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCFFacadeImpl$getDeclarations$1.label;
    }
}
