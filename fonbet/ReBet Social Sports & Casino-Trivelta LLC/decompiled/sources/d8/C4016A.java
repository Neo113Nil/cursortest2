package d8;

import kotlin.text.StringsKt;

/* renamed from: d8.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4016A {

    /* renamed from: a, reason: collision with root package name */
    public static final C4016A f45021a = new C4016A();

    public static final boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null) >= 0);
    }
}
