package og;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class i {
    public static final Object a(Object obj) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            m147constructorimpl = Result.m147constructorimpl(readObject);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            return null;
        }
        return m147constructorimpl;
    }

    public static final String b() {
        return "";
    }

    public static final int c(List list, Function1 predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static final boolean d(Number number, int i10) {
        return r(number) > ((long) i10);
    }

    public static final boolean e(Object obj) {
        return obj != null;
    }

    public static final boolean f(String str) {
        return !(str == null || str.length() == 0);
    }

    public static final boolean g(Object obj) {
        return obj == null;
    }

    public static final Object h(List list, Function1 predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            if (((Boolean) predicate.invoke(previous)).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    public static final boolean i(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean j(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final int k(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int l(Object obj, int i10) {
        String obj2;
        Integer intOrNull;
        return (obj == null || (obj2 = obj.toString()) == null || (intOrNull = StringsKt.toIntOrNull(obj2)) == null) ? i10 : intOrNull.intValue();
    }

    public static final int m(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static final int n(Object obj) {
        String obj2;
        Integer intOrNull;
        if (obj == null || (obj2 = obj.toString()) == null || (intOrNull = StringsKt.toIntOrNull(obj2)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static final com.google.gson.k o(String str) {
        com.google.gson.h d10 = com.google.gson.m.d(str);
        Intrinsics.checkNotNullExpressionValue(d10, "parseString(...)");
        return AbstractC5896h.d(d10);
    }

    public static final long p(Number number, long j10) {
        return number != null ? number.longValue() : j10;
    }

    public static final long q(String str, long j10) {
        Long longOrNull;
        return (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? j10 : longOrNull.longValue();
    }

    public static final long r(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0L;
    }

    public static final long s(String str) {
        Long longOrNull;
        if (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) {
            return 0L;
        }
        return longOrNull.longValue();
    }

    public static final String t(InputStream inputStream) {
        Unit unit;
        StringBuilder sb2 = new StringBuilder();
        try {
            Result.Companion companion = Result.INSTANCE;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
            bufferedReader.close();
            if (inputStream != null) {
                inputStream.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m147constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final String u(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("&#x24;").replace(new Regex("&#x23;").replace(new Regex("&#x22;").replace(new Regex("&#x3e;").replace(new Regex("&#x3f;").replace(new Regex("&#x2f;").replace(new Regex("&#x29;").replace(new Regex("&#x28;").replace(new Regex("&#x27;").replace(new Regex("&#x3d;").replace(StringsKt.replace$default(new Regex("<br>").replace(new Regex("<br/>").replace(new Regex("&nbsp;").replace(new Regex("&#x3a;").replace(new Regex("&#x40;").replace(new Regex("&#x21;").replace(new Regex("&#39;").replace(new Regex("&amp;").replace(new Regex("&apos;").replace(new Regex("&quot;").replace(new Regex("&gt;").replace(new Regex("&lt;").replace(str, "<"), ">"), "\""), "'"), "&"), "'"), "!"), "@"), ":"), " "), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE), "\\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, false, 4, (Object) null), "="), "'"), "("), ")"), "/"), "?"), ">"), "\""), "#"), "$");
    }

    public static final void v(OutputStream outputStream, Map value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Result.Companion companion = Result.INSTANCE;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charsets.UTF_8));
            bufferedWriter.write(new JSONObject(value).toString());
            bufferedWriter.flush();
            bufferedWriter.close();
            if (outputStream != null) {
                outputStream.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m147constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
