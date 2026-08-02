package lc;

import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;

/* renamed from: lc.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7917b extends Spannable.Factory {

    /* renamed from: lc.b$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C7917b f73167a = new C7917b();
    }

    @NonNull
    public static C7917b a() {
        return a.f73167a;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }
}
