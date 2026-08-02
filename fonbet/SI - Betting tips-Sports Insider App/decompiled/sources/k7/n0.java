package k7;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f18899a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n0[] f18900b;

    static {
        n0 n0Var = new n0("INSTANCE", 0);
        f18899a = n0Var;
        f18900b = new n0[]{n0Var};
    }

    public static n0[] values() {
        return (n0[]) f18900b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i5 = 0; i5 < min; i5++) {
            int i10 = (bArr[i5] & 255) - (bArr2[i5] & 255);
            if (i10 != 0) {
                return i10;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
