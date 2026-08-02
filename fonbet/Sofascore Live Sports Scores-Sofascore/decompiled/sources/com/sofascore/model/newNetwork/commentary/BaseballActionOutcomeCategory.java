package com.sofascore.model.newNetwork.commentary;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/BaseballActionOutcomeCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Strikes", "Outs", "Balls", "Advances", "Other", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballActionOutcomeCategory {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BaseballActionOutcomeCategory[] $VALUES;
    public static final BaseballActionOutcomeCategory Strikes = new BaseballActionOutcomeCategory("Strikes", 0);
    public static final BaseballActionOutcomeCategory Outs = new BaseballActionOutcomeCategory("Outs", 1);
    public static final BaseballActionOutcomeCategory Balls = new BaseballActionOutcomeCategory("Balls", 2);
    public static final BaseballActionOutcomeCategory Advances = new BaseballActionOutcomeCategory("Advances", 3);
    public static final BaseballActionOutcomeCategory Other = new BaseballActionOutcomeCategory("Other", 4);

    private static final /* synthetic */ BaseballActionOutcomeCategory[] $values() {
        return new BaseballActionOutcomeCategory[]{Strikes, Outs, Balls, Advances, Other};
    }

    static {
        BaseballActionOutcomeCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BaseballActionOutcomeCategory(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BaseballActionOutcomeCategory valueOf(String str) {
        return (BaseballActionOutcomeCategory) Enum.valueOf(BaseballActionOutcomeCategory.class, str);
    }

    public static BaseballActionOutcomeCategory[] values() {
        return (BaseballActionOutcomeCategory[]) $VALUES.clone();
    }
}
