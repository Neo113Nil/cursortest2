package com.google.android.gms.common.server.response;

import android.util.Base64;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import g6.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import q6.b;
import q6.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class FastSafeParcelableJsonResponse implements SafeParcelable {
    public static final Object f(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f4591k;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.f4576c.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.f4575b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    public static final void g(StringBuilder sb2, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        int i5 = fastJsonResponse$Field.f4583b;
        if (i5 == 11) {
            Class cls = fastJsonResponse$Field.f4589h;
            v.h(cls);
            sb2.append(((FastSafeParcelableJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i5 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(c.a((String) obj));
            sb2.append("\"");
        }
    }

    public abstract Map a();

    public Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        String str = fastJsonResponse$Field.f4587f;
        if (fastJsonResponse$Field.f4589h == null) {
            return c();
        }
        if (c() != null) {
            throw new IllegalStateException(c1.m("Concrete field shouldn't be value object: ", str));
        }
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb2 = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(substring).length());
            sb2.append("get");
            sb2.append(upperCase);
            sb2.append(substring);
            return getClass().getMethod(sb2.toString(), null).invoke(this, null);
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public Object c() {
        return null;
    }

    public boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.f4585d != 11) {
            return e();
        }
        if (fastJsonResponse$Field.f4586e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastSafeParcelableJsonResponse fastSafeParcelableJsonResponse = (FastSafeParcelableJsonResponse) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (d(fastJsonResponse$Field)) {
                if (!fastSafeParcelableJsonResponse.d(fastJsonResponse$Field) || !v.k(b(fastJsonResponse$Field), fastSafeParcelableJsonResponse.b(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (fastSafeParcelableJsonResponse.d(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i5 = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : a().values()) {
            if (d(fastJsonResponse$Field)) {
                Object b10 = b(fastJsonResponse$Field);
                v.h(b10);
                i5 = (i5 * 31) + b10.hashCode();
            }
        }
        return i5;
    }

    public String toString() {
        Map a7 = a();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : a7.keySet()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a7.get(str);
            if (d(fastJsonResponse$Field)) {
                Object f6 = f(fastJsonResponse$Field, b(fastJsonResponse$Field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (f6 != null) {
                    switch (fastJsonResponse$Field.f4585d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) f6, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) f6, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            b.i(sb2, (HashMap) f6);
                            break;
                        default:
                            if (fastJsonResponse$Field.f4584c) {
                                ArrayList arrayList = (ArrayList) f6;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    if (i5 > 0) {
                                        sb2.append(StringUtils.COMMA);
                                    }
                                    Object obj = arrayList.get(i5);
                                    if (obj != null) {
                                        g(sb2, fastJsonResponse$Field, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            } else {
                                g(sb2, fastJsonResponse$Field, f6);
                                break;
                            }
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }
}
