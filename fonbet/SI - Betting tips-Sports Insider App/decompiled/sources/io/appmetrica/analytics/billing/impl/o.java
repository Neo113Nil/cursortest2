package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String str;
        z zVar = new z();
        zVar.f11481a = productInfo.quantity;
        zVar.f11486f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        Charset charset = Charsets.UTF_8;
        zVar.f11482b = str.getBytes(charset);
        zVar.f11483c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f11448a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f11449b = productInfo.signature.getBytes(charset);
        zVar.f11485e = uVar;
        zVar.f11487g = true;
        zVar.f11488h = 1;
        int i5 = n.f11435a[productInfo.type.ordinal()];
        zVar.f11489i = (i5 == 1 || i5 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f11471a = productInfo.purchaseToken.getBytes(charset);
        yVar.f11472b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f11464a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f11461a = period.number;
                int i10 = n.f11436b[period.timeUnit.ordinal()];
                wVar.f11462b = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f11465b = wVar;
            }
            v vVar = new v();
            vVar.f11451a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f11461a = period2.number;
                int i11 = n.f11436b[period2.timeUnit.ordinal()];
                wVar2.f11462b = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f11452b = wVar2;
            }
            vVar.f11453c = productInfo.introductoryPriceCycles;
            xVar.f11466c = vVar;
            zVar.f11490k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
