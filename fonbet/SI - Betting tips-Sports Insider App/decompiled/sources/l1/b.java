package l1;

import android.text.Editable;
import j1.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f19316a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f19317b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f19318c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f19318c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
