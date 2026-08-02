package com.giphy.sdk.core.models.json;

import android.text.TextUtils;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.n;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/giphy/sdk/core/models/json/IntDeserializer;", "Lcom/google/gson/g;", "", "<init>", "()V", "Lcom/google/gson/h;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/f;", "context", "deserialize", "(Lcom/google/gson/h;Ljava/lang/reflect/Type;Lcom/google/gson/f;)Ljava/lang/Integer;", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IntDeserializer implements g {
    @Override // com.google.gson.g
    @Nullable
    public Integer deserialize(@NotNull h json, @NotNull Type typeOfT, @NotNull f context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        n f10 = json.f();
        if (!f10.r()) {
            if (f10.q()) {
                return Integer.valueOf(json.b());
            }
            return 0;
        }
        String h10 = json.h();
        if (TextUtils.isEmpty(h10)) {
            return 0;
        }
        return Integer.valueOf(Integer.parseInt(h10));
    }
}
