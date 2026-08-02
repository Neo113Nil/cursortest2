package com.blaze.blazesdk.style.players;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/players/BlazeTextCase;", "", "<init>", "(Ljava/lang/String;I)V", "UPPERCASE", "LOWERCASE", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeTextCase {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeTextCase[] $VALUES;
    public static final BlazeTextCase UPPERCASE = new BlazeTextCase("UPPERCASE", 0);
    public static final BlazeTextCase LOWERCASE = new BlazeTextCase("LOWERCASE", 1);

    private static final /* synthetic */ BlazeTextCase[] $values() {
        return new BlazeTextCase[]{UPPERCASE, LOWERCASE};
    }

    static {
        BlazeTextCase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeTextCase(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeTextCase valueOf(String str) {
        return (BlazeTextCase) Enum.valueOf(BlazeTextCase.class, str);
    }

    public static BlazeTextCase[] values() {
        return (BlazeTextCase[]) $VALUES.clone();
    }
}
