package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mf implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public static final mf f25759a;

    /* renamed from: b, reason: collision with root package name */
    public static final mf f25760b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ mf[] f25761c;

    static {
        mf mfVar = new mf("SUBSCRIBED", 0);
        f25759a = mfVar;
        mf mfVar2 = new mf("UNSUBSCRIBED", 1);
        f25760b = mfVar2;
        mf[] mfVarArr = {mfVar, mfVar2};
        f25761c = mfVarArr;
        EnumEntriesKt.enumEntries(mfVarArr);
    }

    public mf(String str, int i10) {
    }

    public static mf valueOf(String str) {
        return (mf) Enum.valueOf(mf.class, str);
    }

    public static mf[] values() {
        return (mf[]) f25761c.clone();
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
