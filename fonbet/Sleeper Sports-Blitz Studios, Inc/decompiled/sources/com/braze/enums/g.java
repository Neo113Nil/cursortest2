package com.braze.enums;

import com.braze.models.IPutIntoJson;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class g implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public static final g f506a;
    public static final g b;
    public static final /* synthetic */ g[] c;

    static {
        g gVar = new g("SUBSCRIBED", 0);
        f506a = gVar;
        g gVar2 = new g("UNSUBSCRIBED", 1);
        b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        c = gVarArr;
        EnumEntriesKt.enumEntries(gVarArr);
    }

    public g(String str, int i) {
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) c.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "subscribed";
        }
        if (ordinal == 1) {
            return "unsubscribed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
