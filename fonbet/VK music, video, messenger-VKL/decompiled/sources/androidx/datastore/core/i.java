package androidx.datastore.core;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {MBSupportMuteAdType.INTERSTITIAL_VIDEO, 296, Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "readDataAndUpdateCache")
/* loaded from: classes.dex */
public final class i extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DataStoreImpl<Object> dataStoreImpl, spj<? super i> spjVar) {
        super(spjVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DataStoreImpl.e(this.this$0, false, this);
    }
}
