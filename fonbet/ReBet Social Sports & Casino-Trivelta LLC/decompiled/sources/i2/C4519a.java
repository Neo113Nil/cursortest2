package i2;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import e1.AbstractC4134a;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4519a {

    /* renamed from: a, reason: collision with root package name */
    public final int f48016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48019d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48020e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48021f;

    public C4519a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f48016a = i10;
        this.f48017b = i11;
        this.f48018c = i12;
        this.f48019d = i13;
        this.f48020e = i14;
        this.f48021f = i15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4519a a(String str) {
        char c10;
        AbstractC4134a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < split.length; i15++) {
            String e10 = Ra.c.e(split[i15].trim());
            e10.getClass();
            switch (e10.hashCode()) {
                case 100571:
                    if (e10.equals(ViewProps.END)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (e10.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102749521:
                    if (e10.equals("layer")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (e10.equals(ViewProps.START)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (e10.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i12 = i15;
                    break;
                case 1:
                    i14 = i15;
                    break;
                case 2:
                    i10 = i15;
                    break;
                case 3:
                    i11 = i15;
                    break;
                case 4:
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new C4519a(i10, i11, i12, i13, i14, split.length);
    }
}
