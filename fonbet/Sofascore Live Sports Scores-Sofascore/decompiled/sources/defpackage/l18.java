package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l18 implements kfi {
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Object e = new Object();
    public final c6h a;
    public final Function1 b;
    public final Function0 c;

    public l18(c6h c6hVar, Function1 function1, Function0 function0) {
        c6hVar.getClass();
        this.a = c6hVar;
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.kfi
    public final lfi a() {
        File canonicalFile = ((File) this.c.invoke()).getCanonicalFile();
        synchronized (e) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = d;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            absolutePath.getClass();
            linkedHashSet.add(absolutePath);
        }
        return new o18(canonicalFile, this.a, (h7a) this.b.invoke(canonicalFile), new qo6(canonicalFile, 26));
    }
}
