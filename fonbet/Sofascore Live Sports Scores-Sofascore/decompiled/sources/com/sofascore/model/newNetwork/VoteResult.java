package com.sofascore.model.newNetwork;

import com.ironsource.Y1;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/VoteResult;", "", "<init>", "(Ljava/lang/String;I)V", "CORRECT", "WRONG", "UNKNOWN", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VoteResult {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ VoteResult[] $VALUES;

    @q5h("1")
    public static final VoteResult CORRECT = new VoteResult("CORRECT", 0);

    @q5h("0")
    public static final VoteResult WRONG = new VoteResult("WRONG", 1);

    @q5h(Y1.f)
    public static final VoteResult UNKNOWN = new VoteResult("UNKNOWN", 2);

    private static final /* synthetic */ VoteResult[] $values() {
        return new VoteResult[]{CORRECT, WRONG, UNKNOWN};
    }

    static {
        VoteResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private VoteResult(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static VoteResult valueOf(String str) {
        return (VoteResult) Enum.valueOf(VoteResult.class, str);
    }

    public static VoteResult[] values() {
        return (VoteResult[]) $VALUES.clone();
    }
}
