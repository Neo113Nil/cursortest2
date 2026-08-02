package d8;

import T7.N;
import android.content.Context;
import android.os.Bundle;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: d8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4036l extends N {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4036l(Context context, LoginClient.Request request) {
        super(context, PKIFailureInfo.notAuthorized, 65537, 20121101, request.getApplicationId(), request.getNonce());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // T7.N
    public void e(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
