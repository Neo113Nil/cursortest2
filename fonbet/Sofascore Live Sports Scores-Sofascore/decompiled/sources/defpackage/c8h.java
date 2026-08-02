package defpackage;

import java.util.Locale;
import java.util.UUID;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c8h {
    public final vhj a;
    public final kjk b;

    public c8h(vhj vhjVar, kjk kjkVar) {
        vhjVar.getClass();
        kjkVar.getClass();
        this.a = vhjVar;
        this.b = kjkVar;
    }

    public final x7h a(x7h x7hVar) {
        String str;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = c.r(uuid, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (x7hVar == null || (str = x7hVar.b) == null) ? lowerCase : str;
        int i = x7hVar != null ? x7hVar.c + 1 : 0;
        this.a.getClass();
        return new x7h(lowerCase, str2, i, vhj.a().b);
    }
}
