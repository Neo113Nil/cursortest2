package s90;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* renamed from: s90.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9636e {

    /* renamed from: s90.e$a */
    public static final class a {
        @NotNull
        public static Intent a(@NotNull InterfaceC9636e interfaceC9636e) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", interfaceC9636e.getContext().getPackageName(), null));
            intent.addFlags(268435456);
            return intent;
        }
    }

    @NotNull
    String a();

    int b();

    int c();

    int d();

    boolean e();

    @NotNull
    Intent f();

    @NotNull
    Context getContext();
}
