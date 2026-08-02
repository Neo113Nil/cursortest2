package com.plaid.gson;

import com.facebook.react.devsupport.StackTraceHelper;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountVerificationStatus;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/gson/RNAccountAdapter;", "Lcom/google/gson/p;", "Lcom/plaid/link/result/LinkAccount;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/o;", "context", "Lcom/google/gson/h;", "serialize", "(Lcom/plaid/link/result/LinkAccount;Ljava/lang/reflect/Type;Lcom/google/gson/o;)Lcom/google/gson/h;", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNAccountAdapter implements p {
    @Override // com.google.gson.p
    @NotNull
    public h serialize(@Nullable LinkAccount src, @Nullable Type typeOfSrc, @Nullable o context) {
        h serialize;
        h serialize2;
        k e10;
        if (src == null) {
            return new k();
        }
        k kVar = new k();
        kVar.p(StackTraceHelper.ID_KEY, src.getId());
        kVar.p("name", src.getName());
        String mask = src.getMask();
        if (mask != null) {
            kVar.p("mask", mask);
        }
        LinkAccountVerificationStatus verificationStatus = src.getVerificationStatus();
        if (verificationStatus != null && context != null && (serialize2 = context.serialize(verificationStatus)) != null && (e10 = serialize2.e()) != null) {
            kVar.p("verification_status", e10.r("json").h());
            kVar.p("verificationStatus", e10.r("json").h());
        }
        k e11 = (context == null || (serialize = context.serialize(src.getSubtype())) == null) ? null : serialize.e();
        if (e11 != null) {
            h r10 = e11.r("accountType");
            kVar.p("type", r10 != null ? r10.h() : null);
            h r11 = e11.r("json");
            kVar.p("subtype", r11 != null ? r11.h() : null);
        }
        return kVar;
    }
}
