package t3;

import android.webkit.JavascriptInterface;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import t3.AbstractC6440g;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6435b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f65661c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f65662d = "function parseForm(form){\n\n    var values = '';\n    for(var i=0 ; i< form.elements.length; i++){\n        values +=\n            form.elements[i].name +\n            '=' +\n            form.elements[i].value +\n            '|'\n    }\n    FormInterceptorInterface.processFormData(values);\n}\n\n\nfor(var i=0 ; i< document.forms.length ; i++){\n    parseForm(document.forms[i]);\n}";

    /* renamed from: a, reason: collision with root package name */
    public final String f65663a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f65664b;

    /* renamed from: t3.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return C6435b.f65662d;
        }

        public a() {
        }
    }

    public C6435b(String expectedState, Function1 callback) {
        Intrinsics.checkNotNullParameter(expectedState, "expectedState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f65663a = expectedState;
        this.f65664b = callback;
    }

    @JavascriptInterface
    public final void processFormData(@NotNull String formData) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Intrinsics.checkNotNullParameter(formData, "formData");
        List split$default = StringsKt.split$default((CharSequence) formData, new String[]{"|"}, false, 0, 6, (Object) null);
        Iterator it = split$default.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (StringsKt.startsWith$default((String) obj, "id_token", false, 2, (Object) null)) {
                    break;
                }
            }
        }
        String str = (String) obj;
        Iterator it2 = split$default.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (StringsKt.startsWith$default((String) obj2, EventKeys.ERROR_CODE, false, 2, (Object) null)) {
                    break;
                }
            }
        }
        String str2 = (String) obj2;
        Iterator it3 = split$default.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            } else {
                obj3 = it3.next();
                if (StringsKt.startsWith$default((String) obj3, "state", false, 2, (Object) null)) {
                    break;
                }
            }
        }
        String str3 = (String) obj3;
        Iterator it4 = split$default.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            } else {
                obj4 = it4.next();
                if (StringsKt.startsWith$default((String) obj4, "user", false, 2, (Object) null)) {
                    break;
                }
            }
        }
        String str4 = (String) obj4;
        if (str3 == null || (str2 == null && str == null && str4 == null)) {
            this.f65664b.invoke(AbstractC6440g.a.f65668a);
            return;
        }
        String substringAfter$default = StringsKt.substringAfter$default(str3, "=", (String) null, 2, (Object) null);
        String substringAfter$default2 = str2 != null ? StringsKt.substringAfter$default(str2, "=", (String) null, 2, (Object) null) : null;
        String substringAfter$default3 = str != null ? StringsKt.substringAfter$default(str, "=", (String) null, 2, (Object) null) : null;
        String substringAfter$default4 = str4 != null ? StringsKt.substringAfter$default(str4, "=", (String) null, 2, (Object) null) : null;
        if (!Intrinsics.areEqual(substringAfter$default, this.f65663a)) {
            this.f65664b.invoke(new AbstractC6440g.b(new IllegalArgumentException("state does not match")));
            return;
        }
        Function1 function1 = this.f65664b;
        if (substringAfter$default2 == null) {
            substringAfter$default2 = "";
        }
        if (substringAfter$default3 == null) {
            substringAfter$default3 = "";
        }
        if (substringAfter$default4 == null) {
            substringAfter$default4 = "";
        }
        function1.invoke(new AbstractC6440g.c(substringAfter$default2, substringAfter$default3, substringAfter$default, substringAfter$default4));
    }
}
