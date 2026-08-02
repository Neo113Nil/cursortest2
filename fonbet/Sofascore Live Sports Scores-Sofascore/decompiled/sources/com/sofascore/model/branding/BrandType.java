package com.sofascore.model.branding;

import com.ironsource.U3;
import com.ironsource.mediationsdk.j;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/branding/BrandType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STRIPE", j.a, "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BrandType[] $VALUES;

    @NotNull
    private final String value;
    public static final BrandType STRIPE = new BrandType("STRIPE", 0, "stripe");
    public static final BrandType BANNER = new BrandType(j.a, 1, "banner");

    private static final /* synthetic */ BrandType[] $values() {
        return new BrandType[]{STRIPE, BANNER};
    }

    static {
        BrandType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BrandType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BrandType valueOf(String str) {
        return (BrandType) Enum.valueOf(BrandType.class, str);
    }

    public static BrandType[] values() {
        return (BrandType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
