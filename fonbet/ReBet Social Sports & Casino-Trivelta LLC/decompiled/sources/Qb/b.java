package Qb;

/* loaded from: classes3.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: a, reason: collision with root package name */
    public final int f9615a;
    private final int[] characterCountBitsForVersions;

    b(int[] iArr, int i10) {
        this.characterCountBitsForVersions = iArr;
        this.f9615a = i10;
    }

    public int a() {
        return this.f9615a;
    }

    public int b(c cVar) {
        int f10 = cVar.f();
        return this.characterCountBitsForVersions[f10 <= 9 ? (char) 0 : f10 <= 26 ? (char) 1 : (char) 2];
    }
}
