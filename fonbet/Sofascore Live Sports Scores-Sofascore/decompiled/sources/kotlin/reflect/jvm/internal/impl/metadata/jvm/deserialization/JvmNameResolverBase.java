package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import defpackage.k13;
import defpackage.nh0;
import defpackage.sc5;
import defpackage.sub;
import defpackage.wv8;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> PREDEFINED_STRINGS;

    @NotNull
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f3812kotlin;

    @NotNull
    private final Set<Integer> localNameIndices;

    @NotNull
    private final List<JvmProtoBuf.StringTableTypes.Record> records;

    @NotNull
    private final String[] strings;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String f0 = CollectionsKt.f0(b.j('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        f3812kotlin = f0;
        List<String> j = b.j(f0.concat("/Any"), f0.concat("/Nothing"), f0.concat("/Unit"), f0.concat("/Throwable"), f0.concat("/Number"), f0.concat("/Byte"), f0.concat("/Double"), f0.concat("/Float"), f0.concat("/Int"), f0.concat("/Long"), f0.concat("/Short"), f0.concat("/Boolean"), f0.concat("/Char"), f0.concat("/CharSequence"), f0.concat("/String"), f0.concat("/Comparable"), f0.concat("/Enum"), f0.concat("/Array"), f0.concat("/ByteArray"), f0.concat("/DoubleArray"), f0.concat("/FloatArray"), f0.concat("/IntArray"), f0.concat("/LongArray"), f0.concat("/ShortArray"), f0.concat("/BooleanArray"), f0.concat("/CharArray"), f0.concat("/Cloneable"), f0.concat("/Annotation"), f0.concat("/collections/Iterable"), f0.concat("/collections/MutableIterable"), f0.concat("/collections/Collection"), f0.concat("/collections/MutableCollection"), f0.concat("/collections/List"), f0.concat("/collections/MutableList"), f0.concat("/collections/Set"), f0.concat("/collections/MutableSet"), f0.concat("/collections/Map"), f0.concat("/collections/MutableMap"), f0.concat("/collections/Map.Entry"), f0.concat("/collections/MutableMap.MutableEntry"), f0.concat("/collections/Iterator"), f0.concat("/collections/MutableIterator"), f0.concat("/collections/ListIterator"), f0.concat("/collections/MutableListIterator"));
        PREDEFINED_STRINGS = j;
        nh0 X0 = CollectionsKt.X0(j);
        int c = sub.c(k13.r(X0, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        Iterator it = X0.iterator();
        while (true) {
            sc5 sc5Var = (sc5) it;
            if (!sc5Var.b.hasNext()) {
                PREDEFINED_STRINGS_MAP = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                linkedHashMap.put((String) indexedValue.b, Integer.valueOf(indexedValue.a));
            }
        }
    }

    public JvmNameResolverBase(@NotNull String[] strArr, @NotNull Set<Integer> set, @NotNull List<JvmProtoBuf.StringTableTypes.Record> list) {
        strArr.getClass();
        set.getClass();
        list.getClass();
        this.strings = strArr;
        this.localNameIndices = set;
        this.records = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i) {
        String str;
        JvmProtoBuf.StringTableTypes.Record record = this.records.get(i);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                List<String> list = PREDEFINED_STRINGS;
                int size = list.size();
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex < size) {
                    str = list.get(record.getPredefinedIndex());
                }
            }
            str = this.strings[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            substringIndexList.getClass();
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            num.getClass();
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                num2.getClass();
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                }
            }
        }
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            replaceCharList.getClass();
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            str.getClass();
            str = str.replace((char) num3.intValue(), (char) num4.intValue());
            str.getClass();
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i2 == 2) {
            str.getClass();
            str = str.replace('$', '.');
            str.getClass();
        } else if (i2 == 3) {
            if (str.length() >= 2) {
                str = wv8.h(1, 1, str);
            }
            str = str.replace('$', '.');
            str.getClass();
        }
        str.getClass();
        return str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
