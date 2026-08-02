package com.plaid.internal.classic.networking.adapter;

import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.plaid.link.result.LinkAccountVerificationStatus;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/plaid/internal/classic/networking/adapter/LinkAccountVerificationStatusAdapter;", "Lcom/google/gson/p;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "Lcom/google/gson/g;", "<init>", "()V", "Lcom/google/gson/h;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/f;", "context", "deserialize", "(Lcom/google/gson/h;Ljava/lang/reflect/Type;Lcom/google/gson/f;)Lcom/plaid/link/result/LinkAccountVerificationStatus;", "src", "typeOfSrc", "Lcom/google/gson/o;", "serialize", "(Lcom/plaid/link/result/LinkAccountVerificationStatus;Ljava/lang/reflect/Type;Lcom/google/gson/o;)Lcom/google/gson/h;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkAccountVerificationStatusAdapter implements p, g {
    @Override // com.google.gson.g
    @Nullable
    public LinkAccountVerificationStatus deserialize(@Nullable h json, @Nullable Type typeOfT, @Nullable f context) {
        if (json == null) {
            return null;
        }
        return LinkAccountVerificationStatus.INSTANCE.convert(json.h());
    }

    @Override // com.google.gson.p
    @NotNull
    public h serialize(@Nullable LinkAccountVerificationStatus src, @Nullable Type typeOfSrc, @Nullable o context) {
        String str;
        if (src == null || (str = src.getJson()) == null) {
            str = "";
        }
        return new n(str);
    }
}
