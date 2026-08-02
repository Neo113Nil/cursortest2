package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0007\u001a0\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bj\u0002`\n*\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\b¨\u0006\u000b"}, d2 = {"", "", "requestArgs", "", Constants.BRAZE_PUSH_CONTENT_KEY, "([Ljava/lang/Object;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/lang/Long;", "", "", "Lcom/braze/communication/HttpHeaders;", "android-sdk-base_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class v1 {
    private static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");
    private static final SimpleDateFormat b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not parse http-date value: ", this.b);
        }
    }

    public static final Long a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Double doubleOrNull = StringsKt.toDoubleOrNull(str);
            if (doubleOrNull != null) {
                return Long.valueOf((long) (doubleOrNull.doubleValue() * 1000));
            }
            Date parse = b.parse(str);
            if (parse == null) {
                return null;
            }
            return Long.valueOf(parse.getTime() - DateTimeUtils.nowInMilliseconds());
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, (Throwable) e, (Function0<String>) new a(str));
            return null;
        }
    }

    public static final String a(Object... requestArgs) {
        Intrinsics.checkNotNullParameter(requestArgs, "requestArgs");
        int length = requestArgs.length;
        long j = 1;
        int i = 0;
        while (i < length) {
            Object obj = requestArgs[i];
            i++;
            j *= obj.hashCode();
        }
        String hexString = Long.toHexString(j);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n    request…lement.hashCode()\n    }\n)");
        return hexString;
    }

    public static final Map<String, String> a(Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Intrinsics.checkNotNull(key);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = ((String) key).toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), CollectionsKt.joinToString$default((Iterable) entry3.getValue(), null, null, null, 0, null, null, 63, null));
        }
        return linkedHashMap3;
    }
}
