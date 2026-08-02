package com.vk.stat.model.builders.aggregate;

import com.vk.core.apps.BuildInfo;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.ArrayList;
import xsna.i5s;
import xsna.j5g;
import xsna.ji;
import xsna.l5m;
import xsna.lhg;
import xsna.qrk0;

/* compiled from: AggregateEventBuilder.kt */
/* loaded from: classes11.dex */
public final class AggregateEventBuilder extends l5m {
    public final AggregateEventKey h;
    public final Integer[] i;
    public final String[] j;

    /* compiled from: AggregateEventBuilder.kt */
    /* loaded from: classes5.dex */
    public static final class ErroneousReplacementException extends RuntimeException {
        public ErroneousReplacementException(int i, boolean z) {
            super(i5s.a(ji.b(i, "You're trying to replace tag ", " of type "), z ? "Int" : "String", "! If it is indeed what you've intended, use a variant of replaceTag instead."));
        }
    }

    public AggregateEventBuilder(AggregateEventKey aggregateEventKey) {
        super(null, null, 3);
        this.h = aggregateEventKey;
        this.i = new Integer[16];
        this.j = new String[15];
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = this.j;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String str = strArr[i2];
            int i4 = i3 + 1;
            String str2 = str != null ? "stringValue" + (i3 + 2) + ": " + str : null;
            if (str2 != null) {
                arrayList.add(str2);
            }
            i2++;
            i3 = i4;
        }
        String g0 = j5g.g0(arrayList, null, null, null, 0, null, 63);
        ArrayList arrayList2 = new ArrayList();
        Integer[] numArr = this.i;
        int length2 = numArr.length;
        int i5 = 0;
        while (i < length2) {
            Integer num = numArr[i];
            int i6 = i5 + 1;
            String str3 = "intValue" + (i5 == 0 ? "" : String.valueOf(i6)) + ": " + num;
            if (num == null) {
                str3 = null;
            }
            if (str3 != null) {
                arrayList2.add(str3);
            }
            i++;
            i5 = i6;
        }
        String g02 = j5g.g0(arrayList2, null, null, null, 0, null, 63);
        StringBuilder sb = new StringBuilder("AggregateEventBuilder(");
        sb.append(this.h);
        sb.append(", [");
        sb.append(g0);
        sb.append("], [");
        return i5s.a(sb, g02, "])");
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final qrk0 p() {
        String h = DevNullEventKey.AGG_EVENT.h();
        String h2 = this.h.h();
        String[] strArr = this.j;
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String str4 = strArr[3];
        String str5 = strArr[4];
        String str6 = strArr[5];
        String str7 = strArr[6];
        String str8 = strArr[7];
        String str9 = strArr[8];
        String str10 = strArr[9];
        String str11 = strArr[10];
        String str12 = strArr[11];
        String str13 = strArr[12];
        String str14 = strArr[13];
        String str15 = strArr[14];
        Integer[] numArr = this.i;
        this.g = new SchemeStat$TypeDevNullItem(h, null, h2, numArr[0], str, numArr[1], str2, numArr[2], str3, numArr[3], str4, numArr[4], str5, numArr[5], str6, numArr[6], str7, numArr[7], str8, numArr[8], str9, numArr[9], str10, numArr[10], str11, numArr[11], str12, numArr[12], str13, numArr[13], str14, numArr[14], str15, numArr[15], 2, 0, null);
        return super.p();
    }

    public final void v(int i, int i2) {
        if (i < 0 || i >= 16) {
            throw new ArrayIndexOutOfBoundsException(lhg.a(i, "index should be in 0..15, but was "));
        }
        Integer[] numArr = this.i;
        if (numArr[i] != null && BuildInfo.h()) {
            throw new ErroneousReplacementException(i, true);
        }
        numArr[i] = Integer.valueOf(i2);
    }

    public final void w(int i, String str) {
        if (i < 0 || i >= 15) {
            throw new ArrayIndexOutOfBoundsException(lhg.a(i, "index should be in 0..14, but was "));
        }
        String[] strArr = this.j;
        if (strArr[i] != null && BuildInfo.h()) {
            throw new ErroneousReplacementException(i, false);
        }
        strArr[i] = str;
    }
}
