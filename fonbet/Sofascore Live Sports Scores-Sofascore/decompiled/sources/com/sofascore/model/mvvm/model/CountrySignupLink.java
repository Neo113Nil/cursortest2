package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010 J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b4\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b5\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b6\u0010 ¨\u00069"}, d2 = {"Lcom/sofascore/model/mvvm/model/CountrySignupLink;", "", "", "id", "Lcom/sofascore/model/mvvm/model/SignupLink;", "signupLink", "", U3.i.G0, "button", "disclaimer", "disclaimerUrl", "url", "<init>", "(ILcom/sofascore/model/mvvm/model/SignupLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/SignupLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/CountrySignupLink;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/SignupLink;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "copy", "(ILcom/sofascore/model/mvvm/model/SignupLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/CountrySignupLink;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/mvvm/model/SignupLink;", "getSignupLink", "Ljava/lang/String;", "getCta", "getButton", "getDisclaimer", "getDisclaimerUrl", "getUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CountrySignupLink {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String button;

    @Nullable
    private final String cta;

    @Nullable
    private final String disclaimer;

    @Nullable
    private final String disclaimerUrl;
    private final int id;

    @NotNull
    private final SignupLink signupLink;

    @Nullable
    private final String url;

    public /* synthetic */ CountrySignupLink(int i, int i2, SignupLink signupLink, String str, String str2, String str3, String str4, String str5, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, CountrySignupLink$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.signupLink = signupLink;
        this.cta = str;
        this.button = str2;
        this.disclaimer = str3;
        this.disclaimerUrl = str4;
        this.url = str5;
    }

    public static /* synthetic */ CountrySignupLink copy$default(CountrySignupLink countrySignupLink, int i, SignupLink signupLink, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = countrySignupLink.id;
        }
        if ((i2 & 2) != 0) {
            signupLink = countrySignupLink.signupLink;
        }
        if ((i2 & 4) != 0) {
            str = countrySignupLink.cta;
        }
        if ((i2 & 8) != 0) {
            str2 = countrySignupLink.button;
        }
        if ((i2 & 16) != 0) {
            str3 = countrySignupLink.disclaimer;
        }
        if ((i2 & 32) != 0) {
            str4 = countrySignupLink.disclaimerUrl;
        }
        if ((i2 & 64) != 0) {
            str5 = countrySignupLink.url;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return countrySignupLink.copy(i, signupLink, str9, str2, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$model_release(CountrySignupLink self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, SignupLink$$serializer.INSTANCE, self.signupLink);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.cta);
        output.h(serialDesc, 3, uhiVar, self.button);
        output.h(serialDesc, 4, uhiVar, self.disclaimer);
        output.h(serialDesc, 5, uhiVar, self.disclaimerUrl);
        output.h(serialDesc, 6, uhiVar, self.url);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SignupLink getSignupLink() {
        return this.signupLink;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getDisclaimerUrl() {
        return this.disclaimerUrl;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final CountrySignupLink copy(int id, @NotNull SignupLink signupLink, @Nullable String cta, @Nullable String button, @Nullable String disclaimer, @Nullable String disclaimerUrl, @Nullable String url) {
        signupLink.getClass();
        return new CountrySignupLink(id, signupLink, cta, button, disclaimer, disclaimerUrl, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountrySignupLink)) {
            return false;
        }
        CountrySignupLink countrySignupLink = (CountrySignupLink) other;
        return this.id == countrySignupLink.id && Intrinsics.c(this.signupLink, countrySignupLink.signupLink) && Intrinsics.c(this.cta, countrySignupLink.cta) && Intrinsics.c(this.button, countrySignupLink.button) && Intrinsics.c(this.disclaimer, countrySignupLink.disclaimer) && Intrinsics.c(this.disclaimerUrl, countrySignupLink.disclaimerUrl) && Intrinsics.c(this.url, countrySignupLink.url);
    }

    @Nullable
    public final String getButton() {
        return this.button;
    }

    @Nullable
    public final String getCta() {
        return this.cta;
    }

    @Nullable
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    public final String getDisclaimerUrl() {
        return this.disclaimerUrl;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final SignupLink getSignupLink() {
        return this.signupLink;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.signupLink.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        String str = this.cta;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.button;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclaimer;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.disclaimerUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        SignupLink signupLink = this.signupLink;
        String str = this.cta;
        String str2 = this.button;
        String str3 = this.disclaimer;
        String str4 = this.disclaimerUrl;
        String str5 = this.url;
        StringBuilder sb = new StringBuilder("CountrySignupLink(id=");
        sb.append(i);
        sb.append(", signupLink=");
        sb.append(signupLink);
        sb.append(", cta=");
        bf3.v(sb, str, ", button=", str2, ", disclaimer=");
        bf3.v(sb, str3, ", disclaimerUrl=", str4, ", url=");
        return mz1.o(sb, str5, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/CountrySignupLink$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/CountrySignupLink;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CountrySignupLink$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CountrySignupLink(int i, @NotNull SignupLink signupLink, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        signupLink.getClass();
        this.id = i;
        this.signupLink = signupLink;
        this.cta = str;
        this.button = str2;
        this.disclaimer = str3;
        this.disclaimerUrl = str4;
        this.url = str5;
    }
}
