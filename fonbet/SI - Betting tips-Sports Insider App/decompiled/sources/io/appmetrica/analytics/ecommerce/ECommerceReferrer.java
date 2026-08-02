package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f11784a;

    /* renamed from: b, reason: collision with root package name */
    private String f11785b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f11786c;

    public String getIdentifier() {
        return this.f11785b;
    }

    public ECommerceScreen getScreen() {
        return this.f11786c;
    }

    public String getType() {
        return this.f11784a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(String str) {
        this.f11785b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f11786c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(String str) {
        this.f11784a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f11784a + "', identifier='" + this.f11785b + "', screen=" + this.f11786c + '}';
    }
}
