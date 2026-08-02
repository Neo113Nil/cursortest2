package com.plaid.internal.core.crashreporting.internal.models;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashContextTypeAdapter;", "Lcom/google/gson/p;", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/o;", "context", "Lcom/google/gson/h;", "serialize", "(Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;Ljava/lang/reflect/Type;Lcom/google/gson/o;)Lcom/google/gson/h;", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrashContextTypeAdapter implements p {
    @Override // com.google.gson.p
    @NotNull
    public h serialize(@Nullable CrashContext src, @Nullable Type typeOfSrc, @Nullable o context) {
        if (src == null) {
            return new k();
        }
        Map<String, String> tags$crash_reporting_release = src.getTags$crash_reporting_release();
        if (tags$crash_reporting_release == null) {
            new k();
        }
        k kVar = new k();
        Intrinsics.checkNotNull(tags$crash_reporting_release);
        for (Map.Entry<String, String> entry : tags$crash_reporting_release.entrySet()) {
            kVar.p(entry.getKey(), entry.getValue());
        }
        return kVar;
    }
}
