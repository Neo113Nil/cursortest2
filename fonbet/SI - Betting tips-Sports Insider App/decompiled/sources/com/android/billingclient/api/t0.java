package com.android.billingclient.api;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;

    /* renamed from: a, reason: collision with root package name */
    public static final k f4080a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f4081b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f4082c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f4083d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f4084e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f4085f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f4086g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f4087h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f4088i;
    public static final k j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f4089k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f4090l;

    /* renamed from: m, reason: collision with root package name */
    public static final k f4091m;

    /* renamed from: n, reason: collision with root package name */
    public static final k f4092n;

    /* renamed from: o, reason: collision with root package name */
    public static final k f4093o;

    /* renamed from: p, reason: collision with root package name */
    public static final k f4094p;
    public static final k q;

    /* renamed from: r, reason: collision with root package name */
    public static final k f4095r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f4096s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f4097t;

    /* renamed from: u, reason: collision with root package name */
    public static final k f4098u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f4099v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f4100w;

    /* renamed from: x, reason: collision with root package name */
    public static final k f4101x;

    /* renamed from: y, reason: collision with root package name */
    public static final k f4102y;

    /* renamed from: z, reason: collision with root package name */
    public static final k f4103z;

    static {
        j a7 = k.a();
        a7.f4033a = 3;
        a7.f4034b = "Google Play In-app Billing API version is less than 3";
        f4080a = a7.a();
        j a10 = k.a();
        a10.f4033a = 3;
        a10.f4034b = "Google Play In-app Billing API version is less than 9";
        f4081b = a10.a();
        j a11 = k.a();
        a11.f4033a = 3;
        a11.f4034b = "Billing service unavailable on device.";
        f4082c = a11.a();
        j a12 = k.a();
        a12.f4033a = 2;
        a12.f4034b = "Billing service unavailable on device.";
        f4083d = a12.a();
        j a13 = k.a();
        a13.f4033a = 5;
        a13.f4034b = "Client is already in the process of connecting to billing service.";
        f4084e = a13.a();
        j a14 = k.a();
        a14.f4033a = 5;
        a14.f4034b = "The list of SKUs can't be empty.";
        a14.a();
        j a15 = k.a();
        a15.f4033a = 5;
        a15.f4034b = "SKU type can't be empty.";
        f4085f = a15.a();
        j a16 = k.a();
        a16.f4033a = 5;
        a16.f4034b = "Product type can't be empty.";
        f4086g = a16.a();
        j a17 = k.a();
        a17.f4033a = -2;
        a17.f4034b = "Client does not support extra params.";
        f4087h = a17.a();
        j a18 = k.a();
        a18.f4033a = 5;
        a18.f4034b = "Invalid purchase token.";
        f4088i = a18.a();
        j a19 = k.a();
        a19.f4033a = 6;
        a19.f4034b = "An internal error occurred.";
        j = a19.a();
        j a20 = k.a();
        a20.f4033a = 5;
        a20.f4034b = "SKU can't be null.";
        a20.a();
        j a21 = k.a();
        a21.f4033a = 0;
        f4089k = a21.a();
        j a22 = k.a();
        a22.f4033a = -1;
        a22.f4034b = "Service connection is disconnected.";
        f4090l = a22.a();
        j a23 = k.a();
        a23.f4033a = 2;
        a23.f4034b = "Timeout communicating with service.";
        f4091m = a23.a();
        j a24 = k.a();
        a24.f4033a = -2;
        a24.f4034b = "Client does not support subscriptions.";
        f4092n = a24.a();
        j a25 = k.a();
        a25.f4033a = -2;
        a25.f4034b = "Client does not support subscriptions update.";
        f4093o = a25.a();
        j a26 = k.a();
        a26.f4033a = -2;
        a26.f4034b = "Client does not support get purchase history.";
        f4094p = a26.a();
        j a27 = k.a();
        a27.f4033a = -2;
        a27.f4034b = "Client does not support price change confirmation.";
        q = a27.a();
        j a28 = k.a();
        a28.f4033a = -2;
        a28.f4034b = "Play Store version installed does not support cross selling products.";
        f4095r = a28.a();
        j a29 = k.a();
        a29.f4033a = -2;
        a29.f4034b = "Client does not support multi-item purchases.";
        f4096s = a29.a();
        j a30 = k.a();
        a30.f4033a = -2;
        a30.f4034b = "Client does not support offer_id_token.";
        f4097t = a30.a();
        j a31 = k.a();
        a31.f4033a = -2;
        a31.f4034b = "Client does not support ProductDetails.";
        f4098u = a31.a();
        j a32 = k.a();
        a32.f4033a = -2;
        a32.f4034b = "Client does not support in-app messages.";
        f4099v = a32.a();
        j a33 = k.a();
        a33.f4033a = -2;
        a33.f4034b = "Client does not support user choice billing.";
        a33.a();
        j a34 = k.a();
        a34.f4033a = -2;
        a34.f4034b = "Play Store version installed does not support external offer.";
        f4100w = a34.a();
        j a35 = k.a();
        a35.f4033a = -2;
        a35.f4034b = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        f4101x = a35.a();
        j a36 = k.a();
        a36.f4033a = 5;
        a36.f4034b = "Unknown feature";
        f4102y = a36.a();
        j a37 = k.a();
        a37.f4033a = -2;
        a37.f4034b = "Play Store version installed does not support get billing config.";
        f4103z = a37.a();
        j a38 = k.a();
        a38.f4033a = -2;
        a38.f4034b = "Query product details with serialized docid is not supported.";
        A = a38.a();
        j a39 = k.a();
        a39.f4033a = 4;
        a39.f4034b = "Item is unavailable for purchase.";
        B = a39.a();
        j a40 = k.a();
        a40.f4033a = -2;
        a40.f4034b = "Query product details with developer specified account is not supported.";
        C = a40.a();
        j a41 = k.a();
        a41.f4033a = -2;
        a41.f4034b = "Play Store version installed does not support alternative billing only.";
        D = a41.a();
        j a42 = k.a();
        a42.f4033a = 5;
        a42.f4034b = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        E = a42.a();
        j a43 = k.a();
        a43.f4033a = 6;
        a43.f4034b = "An error occurred while retrieving billing override.";
        F = a43.a();
    }

    public static k a(int i5, String str) {
        j a7 = k.a();
        a7.f4033a = i5;
        a7.f4034b = str;
        return a7.a();
    }
}
