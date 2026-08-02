package bo.app;

import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\b\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0007J:\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007¨\u0006\u0010"}, d2 = {"Lbo/app/w0;", "", "", "TargetEnum", "", "enumValue", "Ljava/lang/Class;", "targetEnumClass", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;", "Ljava/util/EnumSet;", "sourceEnumSet", "", "sourceStringSet", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class w0 {
    public static final w0 a = new w0();

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "TargetEnum", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
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
            return Intrinsics.stringPlus("Failed to create valid enum from string: ", this.b);
        }
    }

    private w0() {
    }

    @JvmStatic
    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum a(String enumValue, Class<TargetEnum> targetEnumClass) {
        Intrinsics.checkNotNullParameter(enumValue, "enumValue");
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        return (TargetEnum) Enum.valueOf(targetEnumClass, enumValue);
    }

    @JvmStatic
    public static final <TargetEnum extends Enum<TargetEnum>> EnumSet<TargetEnum> a(Class<TargetEnum> targetEnumClass, Set<String> sourceStringSet) {
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        Intrinsics.checkNotNullParameter(sourceStringSet, "sourceStringSet");
        EnumSet<TargetEnum> result = EnumSet.noneOf(targetEnumClass);
        for (String str : sourceStringSet) {
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = str.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                result.add(a(upperCase, targetEnumClass));
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, new a(str));
            }
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @JvmStatic
    public static final Set<String> a(EnumSet<?> sourceEnumSet) {
        Intrinsics.checkNotNullParameter(sourceEnumSet, "sourceEnumSet");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sourceEnumSet, 10));
        Iterator<T> it = sourceEnumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return CollectionsKt.toSet(arrayList);
    }
}
