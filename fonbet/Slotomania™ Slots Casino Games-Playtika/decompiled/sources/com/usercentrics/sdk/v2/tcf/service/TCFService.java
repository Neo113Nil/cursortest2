package com.usercentrics.sdk.v2.tcf.service;

import com.usercentrics.sdk.v2.tcf.repository.ITCFDeclarationsRepository;
import com.usercentrics.sdk.v2.tcf.repository.ITCFVendorListRepository;
import com.usercentrics.tcf.core.model.gvl.Declarations;
import com.usercentrics.tcf.core.model.gvl.VendorList;
import io.sentry.protocol.Device;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TCFService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\f@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/usercentrics/sdk/v2/tcf/service/TCFService;", "Lcom/usercentrics/sdk/v2/tcf/service/ITCFService;", "vendorListRepository", "Lcom/usercentrics/sdk/v2/tcf/repository/ITCFVendorListRepository;", "declarationsRepository", "Lcom/usercentrics/sdk/v2/tcf/repository/ITCFDeclarationsRepository;", "(Lcom/usercentrics/sdk/v2/tcf/repository/ITCFVendorListRepository;Lcom/usercentrics/sdk/v2/tcf/repository/ITCFDeclarationsRepository;)V", "<set-?>", "Lcom/usercentrics/tcf/core/model/gvl/Declarations;", "declarations", "getDeclarations", "()Lcom/usercentrics/tcf/core/model/gvl/Declarations;", "Lcom/usercentrics/tcf/core/model/gvl/VendorList;", "vendorList", "getVendorList", "()Lcom/usercentrics/tcf/core/model/gvl/VendorList;", "loadDeclarations", "", Device.JsonKeys.LANGUAGE, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadVendorList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TCFService implements ITCFService {
    private Declarations declarations;
    private final ITCFDeclarationsRepository declarationsRepository;
    private VendorList vendorList;
    private final ITCFVendorListRepository vendorListRepository;

    public TCFService(ITCFVendorListRepository vendorListRepository, ITCFDeclarationsRepository declarationsRepository) {
        Intrinsics.checkNotNullParameter(vendorListRepository, "vendorListRepository");
        Intrinsics.checkNotNullParameter(declarationsRepository, "declarationsRepository");
        this.vendorListRepository = vendorListRepository;
        this.declarationsRepository = declarationsRepository;
    }

    @Override // com.usercentrics.sdk.v2.tcf.service.ITCFService
    public VendorList getVendorList() {
        return this.vendorList;
    }

    @Override // com.usercentrics.sdk.v2.tcf.service.ITCFService
    public Declarations getDeclarations() {
        return this.declarations;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.tcf.service.ITCFService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadVendorList(Continuation<? super Unit> continuation) {
        TCFService$loadVendorList$1 tCFService$loadVendorList$1;
        int i;
        TCFService tCFService;
        if (continuation instanceof TCFService$loadVendorList$1) {
            tCFService$loadVendorList$1 = (TCFService$loadVendorList$1) continuation;
            if ((tCFService$loadVendorList$1.label & Integer.MIN_VALUE) != 0) {
                tCFService$loadVendorList$1.label -= Integer.MIN_VALUE;
                Object obj = tCFService$loadVendorList$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tCFService$loadVendorList$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ITCFVendorListRepository iTCFVendorListRepository = this.vendorListRepository;
                    tCFService$loadVendorList$1.L$0 = this;
                    tCFService$loadVendorList$1.label = 1;
                    obj = iTCFVendorListRepository.fetchVendorList(tCFService$loadVendorList$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tCFService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tCFService = (TCFService) tCFService$loadVendorList$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                tCFService.vendorList = (VendorList) obj;
                return Unit.INSTANCE;
            }
        }
        tCFService$loadVendorList$1 = new TCFService$loadVendorList$1(this, continuation);
        Object obj2 = tCFService$loadVendorList$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCFService$loadVendorList$1.label;
        if (i != 0) {
        }
        tCFService.vendorList = (VendorList) obj2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.usercentrics.sdk.v2.tcf.service.ITCFService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadDeclarations(String str, Continuation<? super Unit> continuation) {
        TCFService$loadDeclarations$1 tCFService$loadDeclarations$1;
        int i;
        TCFService tCFService;
        if (continuation instanceof TCFService$loadDeclarations$1) {
            tCFService$loadDeclarations$1 = (TCFService$loadDeclarations$1) continuation;
            if ((tCFService$loadDeclarations$1.label & Integer.MIN_VALUE) != 0) {
                tCFService$loadDeclarations$1.label -= Integer.MIN_VALUE;
                Object obj = tCFService$loadDeclarations$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tCFService$loadDeclarations$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ITCFDeclarationsRepository iTCFDeclarationsRepository = this.declarationsRepository;
                    tCFService$loadDeclarations$1.L$0 = this;
                    tCFService$loadDeclarations$1.label = 1;
                    obj = iTCFDeclarationsRepository.fetchDeclarations(str, tCFService$loadDeclarations$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tCFService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tCFService = (TCFService) tCFService$loadDeclarations$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                tCFService.declarations = (Declarations) obj;
                return Unit.INSTANCE;
            }
        }
        tCFService$loadDeclarations$1 = new TCFService$loadDeclarations$1(this, continuation);
        Object obj2 = tCFService$loadDeclarations$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tCFService$loadDeclarations$1.label;
        if (i != 0) {
        }
        tCFService.declarations = (Declarations) obj2;
        return Unit.INSTANCE;
    }
}
