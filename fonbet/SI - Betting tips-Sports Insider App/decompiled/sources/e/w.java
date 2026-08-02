package e;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends u {

    /* renamed from: a, reason: collision with root package name */
    public final Field f8442a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f8443b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f8444c;

    public w(Field hField, Field servedViewField, Field nextServedViewField) {
        Intrinsics.checkNotNullParameter(hField, "hField");
        Intrinsics.checkNotNullParameter(servedViewField, "servedViewField");
        Intrinsics.checkNotNullParameter(nextServedViewField, "nextServedViewField");
        this.f8442a = hField;
        this.f8443b = servedViewField;
        this.f8444c = nextServedViewField;
    }

    @Override // e.u
    public final boolean a(InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
        try {
            this.f8444c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // e.u
    public final Object b(InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
        try {
            return this.f8442a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // e.u
    public final View c(InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "<this>");
        try {
            return (View) this.f8443b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
