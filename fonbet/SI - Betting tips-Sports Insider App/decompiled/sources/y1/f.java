package y1;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.d5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends q0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f25546r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i5, boolean z5) {
        super(z5);
        this.f25546r = i5;
    }

    @Override // y1.q0
    public final Object a(Bundle source, String key) {
        switch (this.f25546r) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                boolean z5 = source.getBoolean(key, false);
                if (z5 || !source.getBoolean(key, true)) {
                    return Boolean.valueOf(z5);
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                float f6 = source.getFloat(key, Float.MIN_VALUE);
                if (f6 != Float.MIN_VALUE || source.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f6);
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                return Integer.valueOf(d5.u(source, key));
            case 3:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                long j = source.getLong(key, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || source.getLong(key, LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
            case 4:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                return Integer.valueOf(d5.u(source, key));
            default:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!d5.k(source, key) || d5.B(source, key)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                String string = source.getString(key);
                if (string != null) {
                    return string;
                }
                com.google.android.play.core.appupdate.b.v(key);
                throw null;
        }
    }

    @Override // y1.q0
    public final String b() {
        switch (this.f25546r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // y1.q0
    public final Object d(String value) {
        boolean z5;
        int parseInt;
        String str;
        long parseLong;
        int parseInt2;
        switch (this.f25546r) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.areEqual(value, "true")) {
                    z5 = true;
                } else {
                    if (!Intrinsics.areEqual(value, "false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 2:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.z.o(value, "0x", false)) {
                    String substring = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    parseInt = Integer.parseInt(substring, CharsKt.checkRadix(16));
                } else {
                    parseInt = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt);
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.z.i(value, "L", false)) {
                    str = value.substring(0, value.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                } else {
                    str = value;
                }
                if (kotlin.text.z.o(value, "0x", false)) {
                    String substring2 = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    parseLong = Long.parseLong(substring2, CharsKt.checkRadix(16));
                } else {
                    parseLong = Long.parseLong(str);
                }
                return Long.valueOf(parseLong);
            case 4:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.z.o(value, "0x", false)) {
                    String substring3 = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    parseInt2 = Integer.parseInt(substring3, CharsKt.checkRadix(16));
                } else {
                    parseInt2 = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt2);
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.areEqual(value, "null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // y1.q0
    public final void e(Bundle source, String key, Object obj) {
        switch (this.f25546r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putBoolean(key, booleanValue);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putFloat(key, floatValue);
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putInt(key, intValue);
                break;
            case 3:
                long longValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putLong(key, longValue);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.putInt(key, intValue2);
                break;
            default:
                String value = (String) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value == null) {
                    h8.b.w(source, key);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    source.putString(key, value);
                    break;
                }
        }
    }

    @Override // y1.q0
    public String f(Object obj) {
        switch (this.f25546r) {
            case 5:
                String s8 = (String) obj;
                if (s8 != null) {
                    Intrinsics.checkNotNullParameter(s8, "s");
                    String encode = Uri.encode(s8, null);
                    Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
                    if (encode != null) {
                        return encode;
                    }
                }
                return "null";
            default:
                return super.f(obj);
        }
    }
}
