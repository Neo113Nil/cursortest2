package I0;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface A {
    Object a(Object obj, OutputStream outputStream, Continuation continuation);

    Object b(InputStream inputStream, Continuation continuation);

    Object getDefaultValue();
}
