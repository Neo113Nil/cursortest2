package cc0;

import android.text.Editable;
import android.text.SpannableString;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;

/* loaded from: classes3.dex */
public final class d extends OzonTextWatcher {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7735q f56902a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f56903b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f56904c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Function1<? super CharSequence, Unit> onTextChange) {
        Intrinsics.checkNotNullParameter(onTextChange, "onTextChange");
        this.f56902a = (C7735q) onTextChange;
        this.f56904c = "";
    }

    public final void a(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f56903b = true;
        ((b) function).invoke();
        this.f56903b = false;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        if (editable == null || (obj = editable.toString()) == null) {
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(editable);
        if (this.f56903b || obj.equals(this.f56904c)) {
            this.f56904c = obj;
        } else {
            editable.replace(0, editable.length(), this.f56904c);
            this.f56902a.invoke(valueOf);
        }
    }
}
