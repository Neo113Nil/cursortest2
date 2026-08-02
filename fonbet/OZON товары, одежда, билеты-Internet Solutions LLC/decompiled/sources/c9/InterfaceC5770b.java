package c9;

import a9.C4962a;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.X;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;

/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC5770b extends Closeable, I, OptionalModuleApi {
    @NonNull
    Task<C5769a> N(@NonNull C4962a c4962a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @X(AbstractC5434v.a.ON_DESTROY)
    void close();
}
