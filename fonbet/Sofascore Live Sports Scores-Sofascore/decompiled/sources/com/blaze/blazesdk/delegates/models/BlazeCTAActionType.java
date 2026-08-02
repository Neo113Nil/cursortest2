package com.blaze.blazesdk.delegates.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeCTAActionType;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WEB", "DEEPLINK", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeCTAActionType implements EnumWithValue {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeCTAActionType[] $VALUES;

    @NotNull
    private final String value;
    public static final BlazeCTAActionType WEB = new BlazeCTAActionType("WEB", 0, "Web");
    public static final BlazeCTAActionType DEEPLINK = new BlazeCTAActionType("DEEPLINK", 1, "Deeplink");

    private static final /* synthetic */ BlazeCTAActionType[] $values() {
        return new BlazeCTAActionType[]{WEB, DEEPLINK};
    }

    static {
        BlazeCTAActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeCTAActionType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeCTAActionType valueOf(String str) {
        return (BlazeCTAActionType) Enum.valueOf(BlazeCTAActionType.class, str);
    }

    public static BlazeCTAActionType[] values() {
        return (BlazeCTAActionType[]) $VALUES.clone();
    }

    @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
    @NotNull
    public String getValue() {
        return this.value;
    }
}
