package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.ph0;
import defpackage.tub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public enum KotlinTarget {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE(U3.i.b, false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);

    private static final /* synthetic */ jp5 $ENTRIES;

    @NotNull
    private static final Set<KotlinTarget> ALL_TARGET_SET;

    @NotNull
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST;

    @NotNull
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET;

    @NotNull
    private static final List<KotlinTarget> ENUM_ENTRY_LIST;

    @NotNull
    private static final List<KotlinTarget> ENUM_LIST;

    @NotNull
    private static final List<KotlinTarget> FILE_LIST;

    @NotNull
    private static final List<KotlinTarget> FUNCTION_LIST;

    @NotNull
    private static final List<KotlinTarget> INTERFACE_LIST;

    @NotNull
    private static final List<KotlinTarget> LOCAL_CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> OBJECT_LIST;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST;

    @NotNull
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING;

    @NotNull
    private final String description;
    private final boolean isDefault;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final HashMap<String, KotlinTarget> map = new HashMap<>();

    static {
        for (KotlinTarget kotlinTarget : values()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : values) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = CollectionsKt.W0(arrayList);
        ALL_TARGET_SET = ph0.a0(values());
        KotlinTarget kotlinTarget3 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget4 = CLASS;
        ANNOTATION_CLASS_LIST = b.j(kotlinTarget3, kotlinTarget4);
        LOCAL_CLASS_LIST = b.j(LOCAL_CLASS, kotlinTarget4);
        CLASS_LIST = b.j(CLASS_ONLY, kotlinTarget4);
        KotlinTarget kotlinTarget5 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget6 = OBJECT;
        COMPANION_OBJECT_LIST = b.j(kotlinTarget5, kotlinTarget6, kotlinTarget4);
        OBJECT_LIST = b.j(STANDALONE_OBJECT, kotlinTarget6, kotlinTarget4);
        INTERFACE_LIST = b.j(INTERFACE, kotlinTarget4);
        ENUM_LIST = b.j(ENUM_CLASS, kotlinTarget4);
        KotlinTarget kotlinTarget7 = ENUM_ENTRY;
        KotlinTarget kotlinTarget8 = PROPERTY;
        KotlinTarget kotlinTarget9 = FIELD;
        ENUM_ENTRY_LIST = b.j(kotlinTarget7, kotlinTarget8, kotlinTarget9);
        KotlinTarget kotlinTarget10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = a.c(kotlinTarget10);
        KotlinTarget kotlinTarget11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = a.c(kotlinTarget11);
        FUNCTION_LIST = a.c(FUNCTION);
        KotlinTarget kotlinTarget12 = FILE;
        FILE_LIST = a.c(kotlinTarget12);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = tub.h(new Pair(annotationUseSiteTarget, kotlinTarget13), new Pair(AnnotationUseSiteTarget.FIELD, kotlinTarget9), new Pair(AnnotationUseSiteTarget.PROPERTY, kotlinTarget8), new Pair(AnnotationUseSiteTarget.FILE, kotlinTarget12), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget11), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget10), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget13), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget13), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget9));
        $ENTRIES = gz8.G($VALUES);
    }

    /* synthetic */ KotlinTarget(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }
}
