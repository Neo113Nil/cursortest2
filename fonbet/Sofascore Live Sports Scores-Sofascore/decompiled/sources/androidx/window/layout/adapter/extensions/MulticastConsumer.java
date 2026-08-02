package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.ironsource.U3;
import defpackage.cl6;
import defpackage.hal;
import defpackage.yn3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lyn3;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", U3.i.X, "", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MulticastConsumer implements yn3 {
    public final Context a;
    public hal c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.a = context;
    }

    public final void a(yn3 yn3Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            hal halVar = this.c;
            if (halVar != null) {
                yn3Var.accept(halVar);
            }
            this.d.add(yn3Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.yn3
    public void accept(@NotNull WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            hal c = cl6.c(this.a, value);
            this.c = c;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((yn3) it.next()).accept(c);
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
