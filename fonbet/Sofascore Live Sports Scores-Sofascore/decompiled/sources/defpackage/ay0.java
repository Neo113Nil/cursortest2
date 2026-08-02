package defpackage;

import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ay0 extends ltk {
    public final String b;
    public bka c;

    public ay0(@NotNull fqg fqgVar) {
        String str = (String) fqgVar.a("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            fqgVar.b(str, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = str;
    }

    @Override // defpackage.ltk
    public final void e() {
        bka bkaVar = this.c;
        if (bkaVar == null) {
            Intrinsics.i("saveableStateHolderRef");
            throw null;
        }
        mpg mpgVar = (mpg) ((WeakReference) bkaVar.b).get();
        if (mpgVar != null) {
            mpgVar.c(this.b);
        }
        bka bkaVar2 = this.c;
        if (bkaVar2 != null) {
            ((WeakReference) bkaVar2.b).clear();
        } else {
            Intrinsics.i("saveableStateHolderRef");
            throw null;
        }
    }
}
