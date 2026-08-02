package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken;
import com.moloco.sdk.service_locator.a;

/* loaded from: classes3.dex */
public interface o {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final o a() {
            a.e eVar = a.e.a;
            return new p(eVar.l(), eVar.m());
        }
    }

    BidToken.ClientBidToken a(byte[] bArr);

    BidToken.ClientBidTokenComponents a(com.moloco.sdk.internal.services.bidtoken.providers.k kVar, f fVar);

    byte[] a(byte[] bArr, byte[] bArr2);

    BidToken.ClientBidTokenComponents b(byte[] bArr);
}
