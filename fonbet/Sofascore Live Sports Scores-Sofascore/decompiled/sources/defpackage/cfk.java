package defpackage;

import com.sofascore.local_persistance.UserAccount;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cfk implements c6h {
    public static final cfk a = new cfk();
    public static final UserAccount b = dfk.a;

    @Override // defpackage.c6h
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.c6h
    public final Object readFrom(InputStream inputStream, rq3 rq3Var) {
        try {
            return UserAccount.ADAPTER.decode(inputStream);
        } catch (IOException e) {
            s38.a().c(e);
            return dfk.a;
        }
    }

    @Override // defpackage.c6h
    public final Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        UserAccount userAccount = (UserAccount) obj;
        userAccount.adapter().encode(outputStream, (OutputStream) userAccount);
        return Unit.a;
    }
}
