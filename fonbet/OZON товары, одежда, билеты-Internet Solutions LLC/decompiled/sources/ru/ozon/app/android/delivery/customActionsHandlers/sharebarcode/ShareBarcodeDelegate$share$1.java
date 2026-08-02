package ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.app.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeDelegate$share$1", f = "ShareBarcodeDelegate.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShareBarcodeDelegate$share$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $text;
    final /* synthetic */ String $visibleCode;
    int label;
    final /* synthetic */ ShareBarcodeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareBarcodeDelegate$share$1(ShareBarcodeDelegate shareBarcodeDelegate, Context context, String str, String str2, String str3, d<? super ShareBarcodeDelegate$share$1> dVar) {
        super(2, dVar);
        this.this$0 = shareBarcodeDelegate;
        this.$context = context;
        this.$code = str;
        this.$visibleCode = str2;
        this.$text = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShareBarcodeDelegate$share$1(this.this$0, this.$context, this.$code, this.$visibleCode, this.$text, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ShareBarcodeDelegate shareBarcodeDelegate = this.this$0;
            Context context = this.$context;
            String str = this.$code;
            String str2 = this.$visibleCode;
            this.label = 1;
            obj = shareBarcodeDelegate.generateBarcodeUri(context, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        t.a aVar2 = new t.a(this.$context);
        aVar2.g(MimeTypeMap.getSingleton().getMimeTypeFromExtension("png"));
        aVar2.e((Uri) obj);
        aVar2.f(this.$text);
        aVar2.h();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ShareBarcodeDelegate$share$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
