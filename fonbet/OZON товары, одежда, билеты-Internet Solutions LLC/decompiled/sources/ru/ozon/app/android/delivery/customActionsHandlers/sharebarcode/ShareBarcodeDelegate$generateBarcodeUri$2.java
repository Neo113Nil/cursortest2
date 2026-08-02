package ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lxe/M;)Landroid/net/Uri;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeDelegate$generateBarcodeUri$2", f = "ShareBarcodeDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShareBarcodeDelegate$generateBarcodeUri$2 extends j implements Function2<M, d<? super Uri>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $visibleCode;
    int label;
    final /* synthetic */ ShareBarcodeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareBarcodeDelegate$generateBarcodeUri$2(ShareBarcodeDelegate shareBarcodeDelegate, Context context, String str, String str2, d<? super ShareBarcodeDelegate$generateBarcodeUri$2> dVar) {
        super(2, dVar);
        this.this$0 = shareBarcodeDelegate;
        this.$context = context;
        this.$code = str;
        this.$visibleCode = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShareBarcodeDelegate$generateBarcodeUri$2(this.this$0, this.$context, this.$code, this.$visibleCode, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ShareBarcodeBitmapGenerator shareBarcodeBitmapGenerator;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        shareBarcodeBitmapGenerator = this.this$0.shareBarcodeBitmapGenerator;
        Bitmap generateBitmap = shareBarcodeBitmapGenerator.generateBitmap(this.$context, this.$code, this.$visibleCode);
        File file = new File(this.$context.getCacheDir(), "docs");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "barcode.png");
        file2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            generateBitmap.compress(Bitmap.CompressFormat.PNG, 50, fileOutputStream);
            fileOutputStream.close();
            Context context = this.$context;
            return FileProvider.d(context, context.getPackageName() + ".fileprovider", file2);
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Uri> dVar) {
        return ((ShareBarcodeDelegate$generateBarcodeUri$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
