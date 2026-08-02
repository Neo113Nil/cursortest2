package co.paystack.android.api.request;

import i3.AbstractC4521b;
import java.util.HashMap;
import q3.C6111c;
import r3.AbstractC6202b;
import r3.AbstractC6203c;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f27900a;

    @Gb.c("access_code")
    private final String access_code;

    @Gb.c("amount")
    private final String amount;

    @Gb.c("bearer")
    private final String bearer;

    @Gb.c("clientdata")
    private final String clientData;

    @Gb.c("currency")
    private String currency;

    @Gb.c("email")
    private final String email;

    @Gb.c("handle")
    private String handle;

    @Gb.c("last4")
    private final String last4;

    @Gb.c("metadata")
    private String metadata;

    @Gb.c("plan")
    private String plan;

    @Gb.c("public_key")
    private final String public_key;

    @Gb.c("reference")
    private final String reference;

    @Gb.c("subaccount")
    private final String subaccount;

    @Gb.c("transaction_charge")
    private final String transaction_charge;

    public b(C6111c c6111c) {
        a();
        this.clientData = AbstractC6202b.a(AbstractC6203c.a(c6111c.g()));
        this.last4 = c6111c.g().d();
        this.public_key = AbstractC4521b.b();
        this.email = c6111c.i();
        this.amount = Integer.toString(c6111c.e());
        this.reference = c6111c.l();
        this.subaccount = c6111c.m();
        this.transaction_charge = c6111c.n() > 0 ? Integer.toString(c6111c.n()) : null;
        this.bearer = c6111c.f() != null ? c6111c.f().name() : null;
        this.metadata = c6111c.j();
        this.plan = c6111c.k();
        this.currency = c6111c.h();
        this.access_code = c6111c.c();
        this.f27900a = c6111c.d();
    }

    public b b(String str) {
        this.handle = AbstractC6202b.a(str);
        return this;
    }

    public HashMap c() {
        HashMap hashMap = this.f27900a;
        hashMap.put("public_key", this.public_key);
        hashMap.put("clientdata", this.clientData);
        hashMap.put("last4", this.last4);
        String str = this.access_code;
        if (str != null) {
            hashMap.put("access_code", str);
        }
        String str2 = this.email;
        if (str2 != null) {
            hashMap.put("email", str2);
        }
        String str3 = this.amount;
        if (str3 != null) {
            hashMap.put("amount", str3);
        }
        String str4 = this.handle;
        if (str4 != null) {
            hashMap.put("handle", str4);
        }
        String str5 = this.reference;
        if (str5 != null) {
            hashMap.put("reference", str5);
        }
        String str6 = this.subaccount;
        if (str6 != null) {
            hashMap.put("subaccount", str6);
        }
        String str7 = this.transaction_charge;
        if (str7 != null) {
            hashMap.put("transaction_charge", str7);
        }
        String str8 = this.bearer;
        if (str8 != null) {
            hashMap.put("bearer", str8);
        }
        String str9 = this.metadata;
        if (str9 != null) {
            hashMap.put("metadata", str9);
        }
        String str10 = this.plan;
        if (str10 != null) {
            hashMap.put("plan", str10);
        }
        String str11 = this.currency;
        if (str11 != null) {
            hashMap.put("currency", str11);
        }
        String str12 = this.device;
        if (str12 != null) {
            hashMap.put("device", str12);
        }
        return hashMap;
    }
}
