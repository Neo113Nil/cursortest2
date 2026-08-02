package ud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC7696c;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ud.r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC10040r {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10040r[] $VALUES;

    @NotNull
    private static final Set<EnumC10040r> ALL_TARGET_SET;
    public static final EnumC10040r ANNOTATION_CLASS;

    @NotNull
    private static final List<EnumC10040r> ANNOTATION_CLASS_LIST;
    public static final EnumC10040r ANONYMOUS_FUNCTION;
    public static final EnumC10040r BACKING_FIELD;
    public static final EnumC10040r CLASS;

    @NotNull
    private static final List<EnumC10040r> CLASS_LIST;
    public static final EnumC10040r CLASS_ONLY;
    public static final EnumC10040r COMPANION_OBJECT;

    @NotNull
    private static final List<EnumC10040r> COMPANION_OBJECT_LIST;
    public static final EnumC10040r CONSTRUCTOR;

    @NotNull
    public static final a Companion;

    @NotNull
    private static final Set<EnumC10040r> DEFAULT_TARGET_SET;
    public static final EnumC10040r DESTRUCTURING_DECLARATION;
    public static final EnumC10040r ENUM_CLASS;
    public static final EnumC10040r ENUM_ENTRY;

    @NotNull
    private static final List<EnumC10040r> ENUM_ENTRY_LIST;

    @NotNull
    private static final List<EnumC10040r> ENUM_LIST;
    public static final EnumC10040r EXPRESSION;
    public static final EnumC10040r FIELD;
    public static final EnumC10040r FILE;

    @NotNull
    private static final List<EnumC10040r> FILE_LIST;
    public static final EnumC10040r FUNCTION;

    @NotNull
    private static final List<EnumC10040r> FUNCTION_LIST;
    public static final EnumC10040r INITIALIZER;
    public static final EnumC10040r INTERFACE;

    @NotNull
    private static final List<EnumC10040r> INTERFACE_LIST;
    public static final EnumC10040r LAMBDA_EXPRESSION;
    public static final EnumC10040r LOCAL_CLASS;

    @NotNull
    private static final List<EnumC10040r> LOCAL_CLASS_LIST;
    public static final EnumC10040r LOCAL_FUNCTION;
    public static final EnumC10040r LOCAL_VARIABLE;
    public static final EnumC10040r MEMBER_FUNCTION;
    public static final EnumC10040r MEMBER_PROPERTY;
    public static final EnumC10040r MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final EnumC10040r MEMBER_PROPERTY_WITH_BACKING_FIELD;
    public static final EnumC10040r MEMBER_PROPERTY_WITH_DELEGATE;
    public static final EnumC10040r OBJECT;

    @NotNull
    private static final List<EnumC10040r> OBJECT_LIST;
    public static final EnumC10040r OBJECT_LITERAL;
    public static final EnumC10040r PROPERTY;
    public static final EnumC10040r PROPERTY_GETTER;

    @NotNull
    private static final List<EnumC10040r> PROPERTY_GETTER_LIST;
    public static final EnumC10040r PROPERTY_PARAMETER;
    public static final EnumC10040r PROPERTY_SETTER;

    @NotNull
    private static final List<EnumC10040r> PROPERTY_SETTER_LIST;
    public static final EnumC10040r STANDALONE_OBJECT;
    public static final EnumC10040r STAR_PROJECTION;
    public static final EnumC10040r TOP_LEVEL_FUNCTION;
    public static final EnumC10040r TOP_LEVEL_PROPERTY;
    public static final EnumC10040r TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final EnumC10040r TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD;
    public static final EnumC10040r TOP_LEVEL_PROPERTY_WITH_DELEGATE;
    public static final EnumC10040r TYPE;
    public static final EnumC10040r TYPEALIAS;
    public static final EnumC10040r TYPE_PARAMETER;
    public static final EnumC10040r TYPE_PROJECTION;

    @NotNull
    private static final Map<EnumC10027e, EnumC10040r> USE_SITE_MAPPING;
    public static final EnumC10040r VALUE_PARAMETER;

    @NotNull
    private static final HashMap<String, EnumC10040r> map;

    @NotNull
    private final String description;
    private final boolean isDefault;

    /* renamed from: ud.r$a */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC10040r enumC10040r = new EnumC10040r("CLASS", 0, "class", true);
        CLASS = enumC10040r;
        EnumC10040r enumC10040r2 = new EnumC10040r("ANNOTATION_CLASS", 1, "annotation class", true);
        ANNOTATION_CLASS = enumC10040r2;
        EnumC10040r enumC10040r3 = new EnumC10040r("TYPE_PARAMETER", 2, "type parameter", false);
        TYPE_PARAMETER = enumC10040r3;
        EnumC10040r enumC10040r4 = new EnumC10040r("PROPERTY", 3, "property", true);
        PROPERTY = enumC10040r4;
        EnumC10040r enumC10040r5 = new EnumC10040r("FIELD", 4, "field", true);
        FIELD = enumC10040r5;
        EnumC10040r enumC10040r6 = new EnumC10040r("LOCAL_VARIABLE", 5, "local variable", true);
        LOCAL_VARIABLE = enumC10040r6;
        EnumC10040r enumC10040r7 = new EnumC10040r("VALUE_PARAMETER", 6, "value parameter", true);
        VALUE_PARAMETER = enumC10040r7;
        EnumC10040r enumC10040r8 = new EnumC10040r("CONSTRUCTOR", 7, "constructor", true);
        CONSTRUCTOR = enumC10040r8;
        EnumC10040r enumC10040r9 = new EnumC10040r("FUNCTION", 8, "function", true);
        FUNCTION = enumC10040r9;
        EnumC10040r enumC10040r10 = new EnumC10040r("PROPERTY_GETTER", 9, "getter", true);
        PROPERTY_GETTER = enumC10040r10;
        EnumC10040r enumC10040r11 = new EnumC10040r("PROPERTY_SETTER", 10, "setter", true);
        PROPERTY_SETTER = enumC10040r11;
        EnumC10040r enumC10040r12 = new EnumC10040r("TYPE", 11, "type usage", false);
        TYPE = enumC10040r12;
        EnumC10040r enumC10040r13 = new EnumC10040r("EXPRESSION", 12, "expression", false);
        EXPRESSION = enumC10040r13;
        EnumC10040r enumC10040r14 = new EnumC10040r("FILE", 13, "file", false);
        FILE = enumC10040r14;
        EnumC10040r enumC10040r15 = new EnumC10040r("TYPEALIAS", 14, "typealias", false);
        TYPEALIAS = enumC10040r15;
        EnumC10040r enumC10040r16 = new EnumC10040r("TYPE_PROJECTION", 15, "type projection", false);
        TYPE_PROJECTION = enumC10040r16;
        EnumC10040r enumC10040r17 = new EnumC10040r("STAR_PROJECTION", 16, "star projection", false);
        STAR_PROJECTION = enumC10040r17;
        EnumC10040r enumC10040r18 = new EnumC10040r("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
        PROPERTY_PARAMETER = enumC10040r18;
        EnumC10040r enumC10040r19 = new EnumC10040r("CLASS_ONLY", 18, "class", false);
        CLASS_ONLY = enumC10040r19;
        EnumC10040r enumC10040r20 = new EnumC10040r("OBJECT", 19, "object", false);
        OBJECT = enumC10040r20;
        EnumC10040r enumC10040r21 = new EnumC10040r("STANDALONE_OBJECT", 20, "standalone object", false);
        STANDALONE_OBJECT = enumC10040r21;
        EnumC10040r enumC10040r22 = new EnumC10040r("COMPANION_OBJECT", 21, "companion object", false);
        COMPANION_OBJECT = enumC10040r22;
        EnumC10040r enumC10040r23 = new EnumC10040r("INTERFACE", 22, "interface", false);
        INTERFACE = enumC10040r23;
        EnumC10040r enumC10040r24 = new EnumC10040r("ENUM_CLASS", 23, "enum class", false);
        ENUM_CLASS = enumC10040r24;
        EnumC10040r enumC10040r25 = new EnumC10040r("ENUM_ENTRY", 24, "enum entry", false);
        ENUM_ENTRY = enumC10040r25;
        EnumC10040r enumC10040r26 = new EnumC10040r("LOCAL_CLASS", 25, "local class", false);
        LOCAL_CLASS = enumC10040r26;
        EnumC10040r enumC10040r27 = new EnumC10040r("LOCAL_FUNCTION", 26, "local function", false);
        LOCAL_FUNCTION = enumC10040r27;
        EnumC10040r enumC10040r28 = new EnumC10040r("MEMBER_FUNCTION", 27, "member function", false);
        MEMBER_FUNCTION = enumC10040r28;
        EnumC10040r enumC10040r29 = new EnumC10040r("TOP_LEVEL_FUNCTION", 28, "top level function", false);
        TOP_LEVEL_FUNCTION = enumC10040r29;
        EnumC10040r enumC10040r30 = new EnumC10040r("MEMBER_PROPERTY", 29, "member property", false);
        MEMBER_PROPERTY = enumC10040r30;
        EnumC10040r enumC10040r31 = new EnumC10040r("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
        MEMBER_PROPERTY_WITH_BACKING_FIELD = enumC10040r31;
        EnumC10040r enumC10040r32 = new EnumC10040r("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
        MEMBER_PROPERTY_WITH_DELEGATE = enumC10040r32;
        EnumC10040r enumC10040r33 = new EnumC10040r("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
        MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = enumC10040r33;
        EnumC10040r enumC10040r34 = new EnumC10040r("TOP_LEVEL_PROPERTY", 33, "top level property", false);
        TOP_LEVEL_PROPERTY = enumC10040r34;
        EnumC10040r enumC10040r35 = new EnumC10040r("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
        TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = enumC10040r35;
        EnumC10040r enumC10040r36 = new EnumC10040r("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
        TOP_LEVEL_PROPERTY_WITH_DELEGATE = enumC10040r36;
        EnumC10040r enumC10040r37 = new EnumC10040r("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
        TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = enumC10040r37;
        EnumC10040r enumC10040r38 = new EnumC10040r("BACKING_FIELD", 37, "backing field", true);
        BACKING_FIELD = enumC10040r38;
        EnumC10040r enumC10040r39 = new EnumC10040r("INITIALIZER", 38, "initializer", false);
        INITIALIZER = enumC10040r39;
        EnumC10040r enumC10040r40 = new EnumC10040r("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
        DESTRUCTURING_DECLARATION = enumC10040r40;
        EnumC10040r enumC10040r41 = new EnumC10040r("LAMBDA_EXPRESSION", 40, "lambda expression", false);
        LAMBDA_EXPRESSION = enumC10040r41;
        EnumC10040r enumC10040r42 = new EnumC10040r("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
        ANONYMOUS_FUNCTION = enumC10040r42;
        EnumC10040r enumC10040r43 = new EnumC10040r("OBJECT_LITERAL", 42, "object literal", false);
        OBJECT_LITERAL = enumC10040r43;
        EnumC10040r[] enumC10040rArr = {enumC10040r, enumC10040r2, enumC10040r3, enumC10040r4, enumC10040r5, enumC10040r6, enumC10040r7, enumC10040r8, enumC10040r9, enumC10040r10, enumC10040r11, enumC10040r12, enumC10040r13, enumC10040r14, enumC10040r15, enumC10040r16, enumC10040r17, enumC10040r18, enumC10040r19, enumC10040r20, enumC10040r21, enumC10040r22, enumC10040r23, enumC10040r24, enumC10040r25, enumC10040r26, enumC10040r27, enumC10040r28, enumC10040r29, enumC10040r30, enumC10040r31, enumC10040r32, enumC10040r33, enumC10040r34, enumC10040r35, enumC10040r36, enumC10040r37, enumC10040r38, enumC10040r39, enumC10040r40, enumC10040r41, enumC10040r42, enumC10040r43};
        $VALUES = enumC10040rArr;
        Xc.a a11 = Xc.b.a(enumC10040rArr);
        $ENTRIES = a11;
        Companion = new a();
        map = new HashMap<>();
        Iterator it = ((AbstractC7696c) a11).iterator();
        while (it.hasNext()) {
            EnumC10040r enumC10040r44 = (EnumC10040r) it.next();
            map.put(enumC10040r44.name(), enumC10040r44);
        }
        Xc.a aVar = $ENTRIES;
        ArrayList arrayList = new ArrayList();
        for (Object obj : aVar) {
            if (((EnumC10040r) obj).isDefault) {
                arrayList.add(obj);
            }
        }
        DEFAULT_TARGET_SET = C7714v.Y0(arrayList);
        ALL_TARGET_SET = C7714v.Y0($ENTRIES);
        EnumC10040r enumC10040r45 = ANNOTATION_CLASS;
        EnumC10040r enumC10040r46 = CLASS;
        ANNOTATION_CLASS_LIST = C7714v.b0(enumC10040r45, enumC10040r46);
        LOCAL_CLASS_LIST = C7714v.b0(LOCAL_CLASS, enumC10040r46);
        CLASS_LIST = C7714v.b0(CLASS_ONLY, enumC10040r46);
        EnumC10040r enumC10040r47 = COMPANION_OBJECT;
        EnumC10040r enumC10040r48 = OBJECT;
        COMPANION_OBJECT_LIST = C7714v.b0(enumC10040r47, enumC10040r48, enumC10040r46);
        OBJECT_LIST = C7714v.b0(STANDALONE_OBJECT, enumC10040r48, enumC10040r46);
        INTERFACE_LIST = C7714v.b0(INTERFACE, enumC10040r46);
        ENUM_LIST = C7714v.b0(ENUM_CLASS, enumC10040r46);
        EnumC10040r enumC10040r49 = ENUM_ENTRY;
        EnumC10040r enumC10040r50 = PROPERTY;
        EnumC10040r enumC10040r51 = FIELD;
        ENUM_ENTRY_LIST = C7714v.b0(enumC10040r49, enumC10040r50, enumC10040r51);
        EnumC10040r enumC10040r52 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = C7714v.a0(enumC10040r52);
        EnumC10040r enumC10040r53 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = C7714v.a0(enumC10040r53);
        FUNCTION_LIST = C7714v.a0(FUNCTION);
        EnumC10040r enumC10040r54 = FILE;
        FILE_LIST = C7714v.a0(enumC10040r54);
        EnumC10027e enumC10027e = EnumC10027e.CONSTRUCTOR_PARAMETER;
        EnumC10040r enumC10040r55 = VALUE_PARAMETER;
        USE_SITE_MAPPING = U.j(new Pair(enumC10027e, enumC10040r55), new Pair(EnumC10027e.FIELD, enumC10040r51), new Pair(EnumC10027e.PROPERTY, enumC10040r50), new Pair(EnumC10027e.FILE, enumC10040r54), new Pair(EnumC10027e.PROPERTY_GETTER, enumC10040r53), new Pair(EnumC10027e.PROPERTY_SETTER, enumC10040r52), new Pair(EnumC10027e.RECEIVER, enumC10040r55), new Pair(EnumC10027e.SETTER_PARAMETER, enumC10040r55), new Pair(EnumC10027e.PROPERTY_DELEGATE_FIELD, enumC10040r51));
    }

    private EnumC10040r(String str, int i11, String str2, boolean z11) {
        this.description = str2;
        this.isDefault = z11;
    }

    public static EnumC10040r valueOf(String str) {
        return (EnumC10040r) Enum.valueOf(EnumC10040r.class, str);
    }

    public static EnumC10040r[] values() {
        return (EnumC10040r[]) $VALUES.clone();
    }
}
