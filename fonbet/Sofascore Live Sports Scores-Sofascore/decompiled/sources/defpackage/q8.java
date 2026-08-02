package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class q8 extends d50 {
    public final /* synthetic */ yia c;
    public final mqi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(@NotNull Application application) {
        super(application);
        application.getClass();
        this.c = new yia((byte) 0, 15);
        this.d = ypa.b(new z0(this, 3));
    }

    public final void g(u6b u6bVar, Function0 function0) {
        u6bVar.getClass();
        yia yiaVar = this.c;
        yiaVar.getClass();
        xw3.L(wca.x(u6bVar.getLifecycle()), null, null, new v1f(u6bVar, yiaVar, function0, (rq3) null, 13), 3);
    }

    public final ku3 h() {
        return (ku3) this.d.getValue();
    }

    public final Context i() {
        Application application = this.b;
        application.getClass();
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        applicationContext.getClass();
        locale.getClass();
        if (Build.VERSION.SDK_INT >= 32) {
            return applicationContext;
        }
        Configuration configuration = new Configuration(applicationContext.getResources().getConfiguration());
        configuration.setLocale(locale);
        Context createConfigurationContext = applicationContext.createConfigurationContext(configuration);
        createConfigurationContext.getClass();
        return createConfigurationContext;
    }

    public final Object j(rq3 rq3Var) {
        aeh aehVar = (aeh) this.c.b;
        Unit unit = Unit.a;
        Object emit = aehVar.emit(unit, rq3Var);
        return emit == lu3.a ? emit : unit;
    }
}
