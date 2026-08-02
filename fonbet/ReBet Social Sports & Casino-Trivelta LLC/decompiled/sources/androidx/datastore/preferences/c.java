package androidx.datastore.preferences;

import I0.InterfaceC1344i;
import Ph.P;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class c implements ReadOnlyProperty {

    /* renamed from: a, reason: collision with root package name */
    public final String f19380a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.b f19381b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f19382c;

    /* renamed from: d, reason: collision with root package name */
    public final P f19383d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f19384e;

    /* renamed from: f, reason: collision with root package name */
    public volatile InterfaceC1344i f19385f;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f19386d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f19387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.f19386d = context;
            this.f19387e = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f19386d;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f19387e.f19380a);
        }
    }

    public c(String name, J0.b bVar, Function1 produceMigrations, P scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f19380a = name;
        this.f19381b = bVar;
        this.f19382c = produceMigrations;
        this.f19383d = scope;
        this.f19384e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1344i getValue(Context thisRef, KProperty property) {
        InterfaceC1344i interfaceC1344i;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        InterfaceC1344i interfaceC1344i2 = this.f19385f;
        if (interfaceC1344i2 != null) {
            return interfaceC1344i2;
        }
        synchronized (this.f19384e) {
            try {
                if (this.f19385f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    L0.e eVar = L0.e.f6748a;
                    J0.b bVar = this.f19381b;
                    Function1 function1 = this.f19382c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f19385f = eVar.b(bVar, (List) function1.invoke(applicationContext), this.f19383d, new a(applicationContext, this));
                }
                interfaceC1344i = this.f19385f;
                Intrinsics.checkNotNull(interfaceC1344i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC1344i;
    }
}
