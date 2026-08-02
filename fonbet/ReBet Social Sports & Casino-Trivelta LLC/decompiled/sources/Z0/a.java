package Z0;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.W;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: Z0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0302a {
        c onCreateLoader(int i10, Bundle bundle);

        void onLoadFinished(c cVar, Object obj);

        void onLoaderReset(c cVar);
    }

    public static a b(InterfaceC2193s interfaceC2193s) {
        return new b(interfaceC2193s, ((W) interfaceC2193s).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract c c(int i10, Bundle bundle, InterfaceC0302a interfaceC0302a);

    public abstract void d();
}
