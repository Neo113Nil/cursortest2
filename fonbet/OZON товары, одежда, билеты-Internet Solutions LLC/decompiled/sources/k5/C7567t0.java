package k5;

import android.accounts.AccountManager;
import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: k5.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7567t0 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    private final Context f70866e;

    C7567t0(@NonNull Context context) {
        super(Mm0.e.GoogleID);
        this.f70866e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        Context context = this.f70866e;
        try {
            return AccountManager.get(context).getAccountsByType("com.google")[0].name;
        } catch (Throwable th2) {
            if (androidx.core.content.a.checkSelfPermission(context, "android.permission.READ_CONTACTS") != 0) {
                throw new C7502c2(EnumC7578w.READ_CONTACTS);
            }
            if (androidx.core.content.a.checkSelfPermission(context, "android.permission.GET_ACCOUNTS") == 0) {
                throw new P1(th2.toString());
            }
            throw new C7502c2(EnumC7578w.GET_ACCOUNTS);
        }
    }
}
