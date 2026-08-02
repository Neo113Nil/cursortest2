package net.time4j.history;

/* loaded from: classes5.dex */
public enum e {
    WESTERN,
    EASTERN;

    public int a(int i10) {
        int i11;
        int i12;
        if (i10 < 532) {
            throw new IllegalArgumentException("Out of range: " + i10);
        }
        int i13 = i10 / 100;
        if (this != WESTERN || i10 <= 1582) {
            i11 = 15;
            i12 = 0;
        } else {
            int i14 = ((i13 * 3) + 3) / 4;
            i11 = (i14 + 15) - (((i13 * 8) + 13) / 25);
            i12 = 2 - i14;
        }
        int i15 = i10 % 19;
        int i16 = ((i15 * 19) + i11) % 30;
        int i17 = i16 / 29;
        int i18 = (i16 + 21) - (i17 + (((i16 / 28) - i17) * (i15 / 11)));
        return i18 + (7 - ((i18 - (7 - (((i10 + (i10 / 4)) + i12) % 7))) % 7));
    }
}
