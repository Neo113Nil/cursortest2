package kotlin.reflect.jvm.internal.impl.util;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.ph0;
import defpackage.tub;
import defpackage.w9h;
import defpackage.y9h;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class OperatorNameConventions {

    @NotNull
    public static final Set<Name> ALL_BINARY_OPERATION_NAMES;

    @NotNull
    public static final Name AND;

    @NotNull
    public static final Set<Name> ASSIGNMENT_OPERATIONS;

    @NotNull
    public static final Set<Name> BINARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> BITWISE_OPERATION_NAMES;

    @NotNull
    public static final Name COMPARE_TO;

    @NotNull
    public static final Regex COMPONENT_REGEX;

    @NotNull
    public static final Name CONTAINS;

    @NotNull
    public static final Name DEC;

    @NotNull
    public static final Set<Name> DELEGATED_PROPERTY_OPERATORS;

    @NotNull
    public static final Name DIV;

    @NotNull
    public static final Name DIV_ASSIGN;

    @NotNull
    public static final Name EQUALS;

    @NotNull
    public static final Name GET;

    @NotNull
    public static final Name GET_VALUE;

    @NotNull
    public static final Name HASH_CODE;

    @NotNull
    public static final Name HAS_NEXT;

    @NotNull
    public static final Name INC;

    @NotNull
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    @NotNull
    public static final Name INV;

    @NotNull
    public static final Name INVOKE;

    @NotNull
    public static final Name ITERATOR;

    @NotNull
    public static final Name MINUS;

    @NotNull
    public static final Name MINUS_ASSIGN;

    @NotNull
    public static final Name MOD;

    @NotNull
    public static final Name MOD_ASSIGN;

    @NotNull
    public static final Map<Name, Name> MOD_OPERATORS_REPLACEMENT;

    @NotNull
    public static final Name NEXT;

    @NotNull
    public static final Name NOT;

    @NotNull
    public static final Name OR;

    @NotNull
    public static final Name PLUS;

    @NotNull
    public static final Name PLUS_ASSIGN;

    @NotNull
    public static final Name PROVIDE_DELEGATE;

    @NotNull
    public static final Name RANGE_TO;

    @NotNull
    public static final Name RANGE_UNTIL;

    @NotNull
    public static final Name REM;

    @NotNull
    public static final Name REM_ASSIGN;

    @NotNull
    public static final Name SET;

    @NotNull
    public static final Name SET_VALUE;

    @NotNull
    public static final Name SHL;

    @NotNull
    public static final Name SHR;

    @NotNull
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES;

    @NotNull
    public static final Set<Name> STATEMENT_LIKE_OPERATORS;

    @NotNull
    public static final Name TIMES;

    @NotNull
    public static final Name TIMES_ASSIGN;

    @NotNull
    public static final Name TO_STRING;

    @NotNull
    public static final Name UNARY_MINUS;

    @NotNull
    public static final Set<Name> UNARY_OPERATION_NAMES;

    @NotNull
    public static final Name UNARY_PLUS;

    @NotNull
    public static final Name USHR;

    @NotNull
    public static final Name XOR;

    static {
        Name identifier = Name.identifier("getValue");
        identifier.getClass();
        GET_VALUE = identifier;
        Name identifier2 = Name.identifier("setValue");
        identifier2.getClass();
        SET_VALUE = identifier2;
        Name identifier3 = Name.identifier("provideDelegate");
        identifier3.getClass();
        PROVIDE_DELEGATE = identifier3;
        Name identifier4 = Name.identifier("equals");
        identifier4.getClass();
        EQUALS = identifier4;
        Name identifier5 = Name.identifier("hashCode");
        identifier5.getClass();
        HASH_CODE = identifier5;
        Name identifier6 = Name.identifier("compareTo");
        identifier6.getClass();
        COMPARE_TO = identifier6;
        Name identifier7 = Name.identifier("contains");
        identifier7.getClass();
        CONTAINS = identifier7;
        Name identifier8 = Name.identifier("invoke");
        identifier8.getClass();
        INVOKE = identifier8;
        Name identifier9 = Name.identifier("iterator");
        identifier9.getClass();
        ITERATOR = identifier9;
        Name identifier10 = Name.identifier("get");
        identifier10.getClass();
        GET = identifier10;
        Name identifier11 = Name.identifier("set");
        identifier11.getClass();
        SET = identifier11;
        Name identifier12 = Name.identifier("next");
        identifier12.getClass();
        NEXT = identifier12;
        Name identifier13 = Name.identifier("hasNext");
        identifier13.getClass();
        HAS_NEXT = identifier13;
        Name identifier14 = Name.identifier("toString");
        identifier14.getClass();
        TO_STRING = identifier14;
        COMPONENT_REGEX = new Regex("component\\d+");
        Name identifier15 = Name.identifier("and");
        identifier15.getClass();
        AND = identifier15;
        Name identifier16 = Name.identifier("or");
        identifier16.getClass();
        OR = identifier16;
        Name identifier17 = Name.identifier("xor");
        identifier17.getClass();
        XOR = identifier17;
        Name identifier18 = Name.identifier("inv");
        identifier18.getClass();
        INV = identifier18;
        Name identifier19 = Name.identifier("shl");
        identifier19.getClass();
        SHL = identifier19;
        Name identifier20 = Name.identifier("shr");
        identifier20.getClass();
        SHR = identifier20;
        Name identifier21 = Name.identifier("ushr");
        identifier21.getClass();
        USHR = identifier21;
        Name identifier22 = Name.identifier("inc");
        identifier22.getClass();
        INC = identifier22;
        Name identifier23 = Name.identifier("dec");
        identifier23.getClass();
        DEC = identifier23;
        Name identifier24 = Name.identifier("plus");
        identifier24.getClass();
        PLUS = identifier24;
        Name identifier25 = Name.identifier("minus");
        identifier25.getClass();
        MINUS = identifier25;
        Name identifier26 = Name.identifier("not");
        identifier26.getClass();
        NOT = identifier26;
        Name identifier27 = Name.identifier("unaryMinus");
        identifier27.getClass();
        UNARY_MINUS = identifier27;
        Name identifier28 = Name.identifier("unaryPlus");
        identifier28.getClass();
        UNARY_PLUS = identifier28;
        Name identifier29 = Name.identifier("times");
        identifier29.getClass();
        TIMES = identifier29;
        Name identifier30 = Name.identifier(TtmlNode.TAG_DIV);
        identifier30.getClass();
        DIV = identifier30;
        Name identifier31 = Name.identifier("mod");
        identifier31.getClass();
        MOD = identifier31;
        Name identifier32 = Name.identifier("rem");
        identifier32.getClass();
        REM = identifier32;
        Name identifier33 = Name.identifier("rangeTo");
        identifier33.getClass();
        RANGE_TO = identifier33;
        Name identifier34 = Name.identifier("rangeUntil");
        identifier34.getClass();
        RANGE_UNTIL = identifier34;
        Name identifier35 = Name.identifier("timesAssign");
        identifier35.getClass();
        TIMES_ASSIGN = identifier35;
        Name identifier36 = Name.identifier("divAssign");
        identifier36.getClass();
        DIV_ASSIGN = identifier36;
        Name identifier37 = Name.identifier("modAssign");
        identifier37.getClass();
        MOD_ASSIGN = identifier37;
        Name identifier38 = Name.identifier("remAssign");
        identifier38.getClass();
        REM_ASSIGN = identifier38;
        Name identifier39 = Name.identifier("plusAssign");
        identifier39.getClass();
        PLUS_ASSIGN = identifier39;
        Name identifier40 = Name.identifier("minusAssign");
        identifier40.getClass();
        MINUS_ASSIGN = identifier40;
        UNARY_OPERATION_NAMES = ph0.a0(new Name[]{identifier22, identifier23, identifier28, identifier27, identifier26, identifier18});
        SIMPLE_UNARY_OPERATION_NAMES = ph0.a0(new Name[]{identifier28, identifier27, identifier26, identifier18});
        Set<Name> a0 = ph0.a0(new Name[]{identifier29, identifier24, identifier25, identifier30, identifier31, identifier32, identifier33, identifier34});
        BINARY_OPERATION_NAMES = a0;
        Set<Name> a02 = ph0.a0(new Name[]{identifier15, identifier16, identifier17, identifier18, identifier19, identifier20, identifier21});
        BITWISE_OPERATION_NAMES = a02;
        ALL_BINARY_OPERATION_NAMES = y9h.f(y9h.f(a0, a02), ph0.a0(new Name[]{identifier4, identifier7, identifier6}));
        Set<Name> a03 = ph0.a0(new Name[]{identifier35, identifier36, identifier37, identifier38, identifier39, identifier40});
        ASSIGNMENT_OPERATIONS = a03;
        DELEGATED_PROPERTY_OPERATORS = ph0.a0(new Name[]{identifier, identifier2, identifier3});
        MOD_OPERATORS_REPLACEMENT = tub.h(new Pair(identifier31, identifier32), new Pair(identifier37, identifier38));
        STATEMENT_LIKE_OPERATORS = y9h.f(w9h.b(identifier11), a03);
    }

    private OperatorNameConventions() {
    }
}
