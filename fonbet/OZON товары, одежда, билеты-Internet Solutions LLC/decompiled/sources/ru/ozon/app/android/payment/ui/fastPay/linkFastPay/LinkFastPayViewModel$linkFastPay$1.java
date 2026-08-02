package ru.ozon.app.android.payment.ui.fastPay.linkFastPay;

import He.b;
import Sc.s;
import W10.c;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayViewModel$linkFastPay$1", f = "LinkFastPayViewModel.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 50}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LinkFastPayViewModel$linkFastPay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $body;
    final /* synthetic */ c $trackingData;
    int label;
    final /* synthetic */ LinkFastPayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkFastPayViewModel$linkFastPay$1(LinkFastPayViewModel linkFastPayViewModel, String str, c cVar, Map<String, String> map, d<? super LinkFastPayViewModel$linkFastPay$1> dVar) {
        super(2, dVar);
        this.this$0 = linkFastPayViewModel;
        this.$actionName = str;
        this.$trackingData = cVar;
        this.$body = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LinkFastPayViewModel$linkFastPay$1(this.this$0, this.$actionName, this.$trackingData, this.$body, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r13 != r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object showDefaultError;
        Object showDefaultError2;
        Object processLinkFastPay;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
                try {
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Exception e12) {
                Lm0.a.f17149a.e(e12);
                LinkFastPayViewModel linkFastPayViewModel = this.this$0;
                this.label = 4;
                showDefaultError = linkFastPayViewModel.showDefaultError(this);
            }
            if (i11 == 0) {
                s.b(obj);
                this.this$0.sendShowLoader();
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                LinkFastPayViewModel$linkFastPay$1$response$1 linkFastPayViewModel$linkFastPay$1$response$1 = new LinkFastPayViewModel$linkFastPay$1$response$1(this.this$0, this.$actionName, this.$trackingData, this.$body, null);
                this.label = 1;
                obj = C10727i.f(bVar, linkFastPayViewModel$linkFastPay$1$response$1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        s.b(obj);
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    this.this$0.sendHideLoader();
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            LinkFastPayResponse linkFastPayResponse = (LinkFastPayResponse) ((ActionV2Response) obj).getData();
            if (linkFastPayResponse != null) {
                LinkFastPayViewModel linkFastPayViewModel2 = this.this$0;
                this.label = 2;
                processLinkFastPay = linkFastPayViewModel2.processLinkFastPay(linkFastPayResponse, this);
                if (processLinkFastPay == aVar) {
                    return aVar;
                }
                this.this$0.sendHideLoader();
                return Unit.f71690a;
            }
            LinkFastPayViewModel linkFastPayViewModel3 = this.this$0;
            this.label = 3;
            showDefaultError2 = linkFastPayViewModel3.showDefaultError(this);
        } catch (Throwable th2) {
            this.this$0.sendHideLoader();
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LinkFastPayViewModel$linkFastPay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
