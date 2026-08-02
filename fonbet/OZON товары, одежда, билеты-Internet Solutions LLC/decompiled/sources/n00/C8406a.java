package n00;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.app.Application;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import p00.InterfaceC8826b;

/* renamed from: n00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8406a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f76251a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76252b;

    /* renamed from: n00.a$a, reason: collision with other inner class name */
    static final class C1283a extends AbstractC7737t implements Function0<SharedPreferences> {
        C1283a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return C8406a.this.f76251a.getSharedPreferences("ComposerDebugMenuPrefs", 0);
        }
    }

    public C8406a(@NotNull Application appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f76251a = appContext;
        this.f76252b = k.b(new C1283a());
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.f76252b.getValue();
    }

    public final boolean b() {
        Intrinsics.checkNotNullParameter("SHOULD_DELETE_X03_COMPOSE_DEBUG_TOKEN", "key");
        return d().getBoolean("SHOULD_DELETE_X03_COMPOSE_DEBUG_TOKEN", true);
    }

    @NotNull
    public final <T> T c(@NotNull InterfaceC8826b<T> flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        if (flag instanceof InterfaceC8826b.a) {
            return (T) Boolean.valueOf(d().getBoolean(((InterfaceC8826b.a) flag).getName(), false));
        }
        if (!(flag instanceof InterfaceC8826b.AbstractC1343b)) {
            throw new o();
        }
        InterfaceC8826b.AbstractC1343b abstractC1343b = (InterfaceC8826b.AbstractC1343b) flag;
        T t2 = (T) d().getString(((C8829e) abstractC1343b).getName(), null);
        if (t2 != null) {
            return t2;
        }
        abstractC1343b.getClass();
        return "";
    }

    public final void e(@NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        SharedPreferences d11 = d();
        Intrinsics.checkNotNullExpressionValue(d11, "<get-sharedPrefs>(...)");
        SharedPreferences.Editor edit = d11.edit();
        edit.putBoolean(name, z11);
        edit.commit();
    }

    public final <T> void f(@NotNull InterfaceC8826b<T> flagInfo, @NotNull T value) {
        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
        Intrinsics.checkNotNullParameter(value, "value");
        if (flagInfo instanceof InterfaceC8826b.a) {
            InterfaceC8826b.a aVar = (InterfaceC8826b.a) flagInfo;
            String name = aVar.getName();
            Boolean bool = (Boolean) kotlin.reflect.e.b(aVar.a(), value);
            e(name, bool != null ? bool.booleanValue() : false);
            return;
        }
        if (!(flagInfo instanceof InterfaceC8826b.AbstractC1343b)) {
            throw new o();
        }
        InterfaceC8826b.AbstractC1343b abstractC1343b = (InterfaceC8826b.AbstractC1343b) flagInfo;
        String name2 = ((C8829e) abstractC1343b).getName();
        String str = (String) kotlin.reflect.e.b(abstractC1343b.a(), value);
        if (str == null) {
            str = "";
        }
        SharedPreferences d11 = d();
        Intrinsics.checkNotNullExpressionValue(d11, "<get-sharedPrefs>(...)");
        SharedPreferences.Editor edit = d11.edit();
        edit.putString(name2, str);
        edit.commit();
    }

    public final void g(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences d11 = d();
        Intrinsics.checkNotNullExpressionValue(d11, "<get-sharedPrefs>(...)");
        SharedPreferences.Editor edit = d11.edit();
        edit.remove(key);
        edit.commit();
    }
}
