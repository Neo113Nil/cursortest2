package uh;

import com.facebook.hermes.intl.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: uh.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6586j {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f66723a = Logger.getLogger(AbstractC6586j.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC6581e f66724b;

    static {
        AtomicReference atomicReference = new AtomicReference();
        InterfaceC6581e a10 = a(atomicReference);
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            a10 = C6588l.w0(a10);
        }
        Iterator it = AbstractC6583g.a().iterator();
        while (it.hasNext()) {
            a10 = (InterfaceC6581e) ((Function) it.next()).apply(a10);
        }
        f66724b = a10;
        AbstractC6583g.b();
        Throwable th2 = (Throwable) atomicReference.get();
        if (th2 != null) {
            f66723a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th2);
        }
    }

    public static InterfaceC6581e a(AtomicReference atomicReference) {
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if (Constants.COLLATION_DEFAULT.equals(property)) {
            return InterfaceC6581e.k();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(InterfaceC6582f.class).iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        if (arrayList.isEmpty()) {
            return InterfaceC6581e.k();
        }
        if (property.isEmpty()) {
            if (arrayList.size() == 1) {
                android.support.v4.media.session.b.a(arrayList.get(0));
                throw null;
            }
            atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.ContextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList));
            return InterfaceC6581e.k();
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
        atomicReference.set(new IllegalStateException("io.opentelemetry.context.ContextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList));
        return InterfaceC6581e.k();
    }

    public static InterfaceC6581e b() {
        return f66724b;
    }
}
