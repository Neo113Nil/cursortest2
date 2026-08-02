package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class il5 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile il5 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new swh(cls, charSequence) : super.newEditable(charSequence);
    }
}
