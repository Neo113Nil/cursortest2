package o4;

import android.text.TextUtils;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8637a {

    /* renamed from: a, reason: collision with root package name */
    public final int f77631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77633c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77634d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77635e;

    /* renamed from: f, reason: collision with root package name */
    public final int f77636f;

    private C8637a(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f77631a = i11;
        this.f77632b = i12;
        this.f77633c = i13;
        this.f77634d = i14;
        this.f77635e = i15;
        this.f77636f = i16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C8637a a(String str) {
        char c11;
        G10.a.c(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < split.length; i16++) {
            String b11 = O7.b.b(split[i16].trim());
            b11.getClass();
            switch (b11.hashCode()) {
                case 100571:
                    if (b11.equals("end")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3556653:
                    if (b11.equals("text")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 102749521:
                    if (b11.equals("layer")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109757538:
                    if (b11.equals("start")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109780401:
                    if (b11.equals("style")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    i13 = i16;
                    break;
                case 1:
                    i15 = i16;
                    break;
                case 2:
                    i11 = i16;
                    break;
                case 3:
                    i12 = i16;
                    break;
                case 4:
                    i14 = i16;
                    break;
            }
        }
        if (i12 == -1 || i13 == -1 || i15 == -1) {
            return null;
        }
        return new C8637a(i11, i12, i13, i14, i15, split.length);
    }
}
