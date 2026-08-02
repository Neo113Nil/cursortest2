package defpackage;

import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y3h {
    public static final /* synthetic */ KProperty[] a = {new t0d(y3h.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new t0d(y3h.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new t0d(y3h.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new t0d(y3h.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new t0d(y3h.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new t0d(y3h.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new t0d(y3h.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new t0d(y3h.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new t0d(y3h.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new t0d(y3h.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new t0d(y3h.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new t0d(y3h.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new t0d(y3h.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new t0d(y3h.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new t0d(y3h.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new t0d(y3h.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new t0d(y3h.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new t0d(y3h.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new t0d(y3h.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new t0d(y3h.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new t0d(y3h.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new t0d(y3h.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new t0d(y3h.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new t0d(y3h.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new t0d(y3h.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new t0d(y3h.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new t0d(y3h.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new t0d(y3h.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new t0d(y3h.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new t0d(y3h.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new t0d(y3h.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new t0d(y3h.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        a4h a4hVar = w3h.a;
        a4h a4hVar2 = k3h.a;
    }

    public static void a(b4h b4hVar, Function1 function1) {
        b4hVar.a(k3h.a, new m9(null, function1));
    }

    public static void b(b4h b4hVar, Function1 function1) {
        b4hVar.a(k3h.h, new m9(null, function1));
    }

    public static void c(b4h b4hVar, int i, Function0 function0) {
        b4hVar.a(w3h.J, new lu9(i));
        b4hVar.a(k3h.p, new m9(null, function0));
    }

    public static final void d(b4h b4hVar) {
        a4h a4hVar = w3h.m;
        KProperty kProperty = a[5];
        b4hVar.a(a4hVar, Boolean.TRUE);
    }

    public static final void e(b4h b4hVar, String str) {
        a4h a4hVar = w3h.a;
        b4hVar.a(w3h.a, a.c(str));
    }

    public static final void f(b4h b4hVar, vp3 vp3Var) {
        a4h a4hVar = w3h.a;
        a4h a4hVar2 = w3h.r;
        KProperty kProperty = a[8];
        b4hVar.a(a4hVar2, vp3Var);
    }

    public static final void g(b4h b4hVar, int i) {
        a4h a4hVar = w3h.k;
        KProperty kProperty = a[3];
        b4hVar.a(a4hVar, new yeb(i));
    }

    public static final void h(b4h b4hVar, String str) {
        a4h a4hVar = w3h.a;
        a4h a4hVar2 = w3h.d;
        KProperty kProperty = a[2];
        b4hVar.a(a4hVar2, str);
    }

    public static final void i(b4h b4hVar, dcf dcfVar) {
        a4h a4hVar = w3h.a;
        a4h a4hVar2 = w3h.c;
        KProperty kProperty = a[1];
        b4hVar.a(a4hVar2, dcfVar);
    }

    public static final void j(b4h b4hVar, int i) {
        a4h a4hVar = w3h.z;
        KProperty kProperty = a[14];
        b4hVar.a(a4hVar, new u5g(i));
    }

    public static final void k(b4h b4hVar, uah uahVar) {
        a4h a4hVar = w3h.a;
        a4h a4hVar2 = w3h.S;
        KProperty kProperty = a[30];
        b4hVar.a(a4hVar2, uahVar);
    }

    public static final void l(b4h b4hVar, String str) {
        a4h a4hVar = w3h.a;
        a4h a4hVar2 = w3h.A;
        KProperty kProperty = a[15];
        b4hVar.a(a4hVar2, str);
    }

    public static final void m(b4h b4hVar) {
        a4h a4hVar = w3h.n;
        KProperty kProperty = a[6];
        b4hVar.a(a4hVar, Boolean.TRUE);
    }
}
