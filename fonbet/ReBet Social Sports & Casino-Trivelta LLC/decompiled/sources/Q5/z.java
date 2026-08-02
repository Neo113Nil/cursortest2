package Q5;

import android.view.View;
import android.widget.EditText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final b f9512c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function2 f9513d = new Function2() { // from class: Q5.y
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            boolean b10;
            b10 = z.b((View) obj, (String) obj2);
            return Boolean.valueOf(b10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f9514a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f9515b;

    public static final class a implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9516a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public z(Function1 resolveTargetName, Function2 shouldSendInnerTextForTarget) {
        Intrinsics.checkNotNullParameter(resolveTargetName, "resolveTargetName");
        Intrinsics.checkNotNullParameter(shouldSendInnerTextForTarget, "shouldSendInnerTextForTarget");
        this.f9514a = resolveTargetName;
        this.f9515b = shouldSendInnerTextForTarget;
    }

    public static final boolean b(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (!(view instanceof EditText)) {
            return true;
        }
        EditText editText = (EditText) view;
        int inputType = editText.getInputType() & 15;
        int inputType2 = editText.getInputType() & 4080;
        return inputType != 1 ? (inputType == 2 && inputType2 == 16) ? false : true : (inputType2 == 128 || inputType2 == 144 || inputType2 == 224) ? false : true;
    }

    public final Function1 c() {
        return this.f9514a;
    }

    public final Function2 d() {
        return this.f9515b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f9514a, zVar.f9514a) && Intrinsics.areEqual(this.f9515b, zVar.f9515b);
    }

    public int hashCode() {
        return (this.f9514a.hashCode() * 31) + this.f9515b.hashCode();
    }

    public String toString() {
        return "UserInteractionOptions(resolveTargetName=" + this.f9514a + ", shouldSendInnerTextForTarget=" + this.f9515b + ")";
    }

    public /* synthetic */ z(Function1 function1, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.f9516a : function1, (i10 & 2) != 0 ? f9513d : function2);
    }
}
