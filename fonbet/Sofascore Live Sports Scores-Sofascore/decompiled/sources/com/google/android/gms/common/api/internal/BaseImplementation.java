package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class BaseImplementation {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        public final Api.ClientKey o;
        public final Api p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiMethodImpl(Api api, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            Preconditions.j(googleApiClient, "GoogleApiClient must not be null");
            Preconditions.j(api, "Api must not be null");
            this.o = api.b;
            this.p = api;
        }

        public abstract void n(Api.AnyClient anyClient);

        public final void o(Status status) {
            Preconditions.a("Failed result must not be success", !status.Y0());
            a(e(status));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public interface ResultHolder<R> {
        void a(Result result);
    }
}
