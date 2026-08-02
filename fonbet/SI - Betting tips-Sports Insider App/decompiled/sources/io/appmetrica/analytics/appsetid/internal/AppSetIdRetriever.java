package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d7.e;
import d7.g;
import e6.y;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import io.sentry.hints.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import q5.a;
import q5.c;
import w7.h;
import w7.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/appsetid/internal/AppSetIdRetriever;", "Lio/appmetrica/analytics/appsetid/internal/IAppSetIdRetriever;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", "listener", "", "retrieveAppSetId", "<init>", "()V", "appsetid_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a, reason: collision with root package name */
    private final Object f11402a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f11403b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i5) {
        appSetIdRetriever.getClass();
        return i5 != 1 ? i5 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(@NotNull Context context, @NotNull final AppSetIdListener listener) throws Throwable {
        m p10;
        e eVar = new e(context, 1);
        g gVar = (g) eVar.f8268b;
        if (gVar.f8274m.b(gVar.f8273l, 212800000) == 0) {
            e6.m a7 = y.a();
            a7.f8725d = new Feature[]{c.f22037a};
            a7.f8722a = new j(gVar);
            a7.f8724c = true;
            a7.f8723b = false;
            a7.f8726e = 27601;
            p10 = gVar.c(0, a7.a());
        } else {
            p10 = d5.p(new d6.e(new Status(17, null, null, null)));
        }
        h9.c cVar = new h9.c(20, eVar);
        p10.getClass();
        Task h10 = p10.h(h.f24980a, cVar);
        OnCompleteListener<a> onCompleteListener = new OnCompleteListener<a>() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NotNull Task<a> completedTask) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.f11402a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f11403b;
                    list.remove(this);
                }
                if (completedTask.isSuccessful()) {
                    listener.onAppSetIdRetrieved(completedTask.getResult().f22034a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, completedTask.getResult().f22035b));
                } else {
                    listener.onFailure(completedTask.getException());
                }
            }
        };
        synchronized (this.f11402a) {
            this.f11403b.add(onCompleteListener);
        }
        h10.addOnCompleteListener(onCompleteListener);
    }
}
