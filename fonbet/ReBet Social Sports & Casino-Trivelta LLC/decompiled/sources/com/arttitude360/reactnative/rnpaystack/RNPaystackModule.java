package com.arttitude360.reactnative.rnpaystack;

import android.util.Patterns;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import i3.AbstractC4521b;
import i3.C4520a;
import i3.C4526g;
import q3.C6110b;
import q3.C6111c;

/* loaded from: classes.dex */
public class RNPaystackModule extends ReactContextBaseJavaModule {
    public static String REACT_CLASS = "RNPaystackModule";
    public static final String TAG = "RNPaystack";
    private static RNPaystackModule sInstance;
    protected C6110b card;
    private C6111c charge;
    private ReadableMap chargeOptions;
    private String mPublicKey;
    private Promise pendingPromise;
    private ReactApplicationContext reactContext;
    private C4526g transaction;

    public class a implements C4520a.InterfaceC0724a {
        public a() {
        }

        @Override // i3.C4520a.InterfaceC0724a
        public void a(Throwable th2, C4526g c4526g) {
            RNPaystackModule.this.transaction = c4526g;
            if (c4526g.b() == null) {
                RNPaystackModule.this.rejectPromise("E_TRANSACTION_ERROR", th2.getMessage());
                return;
            }
            RNPaystackModule.this.rejectPromise("E_TRANSACTION_ERROR", c4526g.b() + " concluded with error: " + th2.getMessage());
        }

        @Override // i3.C4520a.InterfaceC0724a
        public void b(C4526g c4526g) {
            RNPaystackModule.this.transaction = c4526g;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("reference", c4526g.b());
            RNPaystackModule.this.resolvePromise(createMap);
        }

        @Override // i3.C4520a.InterfaceC0724a
        public void c(C4526g c4526g) {
            RNPaystackModule.this.transaction = c4526g;
        }
    }

    public RNPaystackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        sInstance = this;
        AbstractC4521b.c(reactApplicationContext);
    }

    private void createTransaction() {
        this.transaction = null;
        AbstractC4521b.a(getCurrentActivity(), this.charge, new a());
    }

    public static RNPaystackModule getInstance() {
        return sInstance;
    }

    private boolean hasIntKey(String str) {
        return this.chargeOptions.hasKey(str) && !this.chargeOptions.isNull(str) && this.chargeOptions.getInt(str) > 0;
    }

    private boolean hasStringKey(String str) {
        return (!this.chargeOptions.hasKey(str) || this.chargeOptions.isNull(str) || this.chargeOptions.getString(str).isEmpty()) ? false : true;
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rejectPromise(String str, String str2) {
        Promise promise = this.pendingPromise;
        if (promise != null) {
            promise.reject(str, str2);
            this.pendingPromise = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolvePromise(Object obj) {
        Promise promise = this.pendingPromise;
        if (promise != null) {
            promise.resolve(obj);
            this.pendingPromise = null;
        }
    }

    private void validateAccessCodeTransaction() {
        validateCard(this.chargeOptions.getString("cardNumber"), this.chargeOptions.getString("expiryMonth"), this.chargeOptions.getString("expiryYear"), this.chargeOptions.getString("cvc"));
        C6111c c6111c = new C6111c();
        this.charge = c6111c;
        c6111c.r(this.card);
        if (hasStringKey("accessCode")) {
            this.charge.o(this.chargeOptions.getString("accessCode"));
        }
    }

    private void validateCard(String str, String str2, String str3, String str4) {
        int i10;
        if (isEmpty(str)) {
            rejectPromise("E_INVALID_NUMBER", "Empty card number");
            return;
        }
        C6110b n10 = new C6110b.c(str, 0, 0, "").n();
        this.card = n10;
        if (!n10.m()) {
            rejectPromise("E_INVALID_NUMBER", "Invalid card number");
            return;
        }
        if (isEmpty(str4)) {
            rejectPromise("E_INVALID_CVC", "Empty CVC");
            return;
        }
        this.card.h(str4);
        if (!this.card.k()) {
            rejectPromise("E_INVALID_CVC", "Invalid CVC");
            return;
        }
        int i11 = -1;
        try {
            i10 = Integer.parseInt(str2);
        } catch (Exception unused) {
            i10 = -1;
        }
        if (i10 < 1) {
            rejectPromise("E_INVALID_MONTH", "Invalid expiration month");
            return;
        }
        this.card.i(Integer.valueOf(i10));
        try {
            i11 = Integer.parseInt(str3);
        } catch (Exception unused2) {
        }
        if (i11 < 1) {
            rejectPromise("E_INVALID_YEAR", "Invalid expiration year");
            return;
        }
        this.card.j(Integer.valueOf(i11));
        if (this.card.l()) {
            return;
        }
        rejectPromise("E_INVALID_DATE", "Invalid expiration date");
    }

    private void validateFullTransaction() {
        String string = this.chargeOptions.getString("cardNumber");
        String string2 = this.chargeOptions.getString("expiryMonth");
        String string3 = this.chargeOptions.getString("expiryYear");
        String string4 = this.chargeOptions.getString("cvc");
        String string5 = this.chargeOptions.getString("email");
        int i10 = this.chargeOptions.getInt("amountInKobo");
        validateCard(string, string2, string3, string4);
        C6111c c6111c = new C6111c();
        this.charge = c6111c;
        c6111c.r(this.card);
        if (isEmpty(string5)) {
            rejectPromise("E_INVALID_EMAIL", "Email cannot be empty");
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(string5).matches()) {
            rejectPromise("E_INVALID_EMAIL", "Invalid email");
            return;
        }
        this.charge.t(string5);
        if (i10 < 1) {
            rejectPromise("E_INVALID_AMOUNT", "Invalid amount");
            return;
        }
        this.charge.p(i10);
        if (hasStringKey("currency")) {
            this.charge.s(this.chargeOptions.getString("currency"));
        }
        if (hasStringKey("plan")) {
            this.charge.u(this.chargeOptions.getString("plan"));
        }
        if (hasStringKey("subAccount")) {
            this.charge.w(this.chargeOptions.getString("subAccount"));
            if (hasStringKey("bearer") && this.chargeOptions.getString("bearer") == "subaccount") {
                this.charge.q(C6111c.a.subaccount);
            }
            if (hasStringKey("bearer") && this.chargeOptions.getString("bearer") == "account") {
                this.charge.q(C6111c.a.account);
            }
            if (hasIntKey("transactionCharge")) {
                this.charge.x(this.chargeOptions.getInt("transactionCharge"));
            }
        }
        if (hasStringKey("reference")) {
            this.charge.v(this.chargeOptions.getString("reference"));
        }
    }

    @ReactMethod
    public void chargeCard(ReadableMap readableMap, Promise promise) {
        this.pendingPromise = promise;
        this.chargeOptions = readableMap;
        validateFullTransaction();
        C6110b c6110b = this.card;
        if (c6110b == null || !c6110b.isValid()) {
            return;
        }
        try {
            createTransaction();
        } catch (Exception e10) {
            rejectPromise("E_CHARGE_ERROR", e10.getMessage());
        }
    }

    @ReactMethod
    public void chargeCardWithAccessCode(ReadableMap readableMap, Promise promise) {
        this.pendingPromise = promise;
        this.chargeOptions = readableMap;
        validateAccessCodeTransaction();
        C6110b c6110b = this.card;
        if (c6110b == null || !c6110b.isValid()) {
            return;
        }
        try {
            createTransaction();
        } catch (Exception e10) {
            rejectPromise("E_CHARGE_ERROR", e10.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void init(ReadableMap readableMap) {
        String string = readableMap.getString("publicKey");
        if (string != null) {
            this.mPublicKey = string;
            AbstractC4521b.h(string);
        }
    }
}
