package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.z;

/* loaded from: classes10.dex */
public abstract class v<STATE, ACTION> extends w0 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f86924d = {I1.w.c(v.class, "viewState", "getViewState()Ljava/lang/Object;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<STATE> f86925a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M0<STATE> f86926b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final z f86927c;

    public v() {
        throw null;
    }

    public v(Object initialState) {
        z.a logLevel = z.a.NONE;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        x0<STATE> a11 = O0.a(initialState);
        this.f86925a = a11;
        this.f86926b = C2399j.b(a11);
        this.f86927c = new z(a11, initialState, logLevel);
    }

    public static final void e0(v vVar, Object obj) {
        vVar.getClass();
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        vVar.f86927c.setValue(vVar, f86924d[0], obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final STATE f0() {
        return this.f86927c.getValue(this, f86924d[0]);
    }

    public abstract void g0(@NotNull ACTION action);

    @NotNull
    public final M0<STATE> getState() {
        return this.f86926b;
    }
}
