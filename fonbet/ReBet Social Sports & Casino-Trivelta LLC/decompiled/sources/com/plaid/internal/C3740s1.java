package com.plaid.internal;

import com.plaid.internal.AbstractC3654i4;
import com.twilio.voice.EventKeys;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3740s1 {
    public static final boolean a(@NotNull AbstractC3654i4.a<Object> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.f40673a;
        if (obj instanceof com.google.gson.internal.g) {
            String upperCase = String.valueOf(((Map) obj).get(EventKeys.ERROR_CODE_KEY)).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (aVar.f40674b == 400 && Intrinsics.areEqual("INVALID_CHANNEL_ID", upperCase)) {
                return true;
            }
        }
        return false;
    }
}
