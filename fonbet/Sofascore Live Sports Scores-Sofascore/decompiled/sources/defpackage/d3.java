package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class d3 {
    public abstract of2 a();

    public abstract bt3 b();

    public final Object c(CharSequence charSequence) {
        String str;
        charSequence.getClass();
        try {
            v9e v9eVar = a().c;
            v9eVar.getClass();
            try {
                return d(aba.B(v9eVar, charSequence, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new gk4(str, e);
            }
        } catch (m9e e2) {
            throw new gk4("Failed to parse value from '" + ((Object) charSequence) + '\'', e2);
        }
    }

    public abstract Object d(bt3 bt3Var);
}
