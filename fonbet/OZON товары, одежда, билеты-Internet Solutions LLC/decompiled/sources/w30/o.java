package w30;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f103541a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Q90.c f103542b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f103543c;

    public o(@NotNull Context context, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        this.f103541a = context;
        this.f103542b = featureToggles;
        this.f103543c = fintechSettings;
    }

    public final ArrayList a() {
        ArrayList arrayList = null;
        if (Tl.a.f(this.f103542b, S90.c.MOB_DISCLOSURE_SCREEN) ? Intrinsics.d(this.f103543c.o(), Boolean.TRUE) : true) {
            Object systemService = this.f103541a.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
                Intrinsics.checkNotNullExpressionValue(enabledInputMethodList, "getEnabledInputMethodList(...)");
                arrayList = new ArrayList();
                Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
                while (it.hasNext()) {
                    String packageName = it.next().getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                    arrayList.add(packageName);
                }
            }
        }
        return arrayList;
    }
}
