package d8;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum y {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* renamed from: b, reason: collision with root package name */
    public static final a f45146b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f45149a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(String str) {
            y[] valuesCustom = y.valuesCustom();
            int length = valuesCustom.length;
            int i10 = 0;
            while (i10 < length) {
                y yVar = valuesCustom[i10];
                i10++;
                if (Intrinsics.areEqual(yVar.toString(), str)) {
                    return yVar;
                }
            }
            return y.FACEBOOK;
        }

        public a() {
        }
    }

    y(String str) {
        this.f45149a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static y[] valuesCustom() {
        y[] valuesCustom = values();
        return (y[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f45149a;
    }
}
