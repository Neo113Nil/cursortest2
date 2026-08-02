package y2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10825a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f105935a;

    /* renamed from: b, reason: collision with root package name */
    private final q f105936b;

    /* renamed from: c, reason: collision with root package name */
    private final int f105937c;

    public C10825a(int i11, @NonNull q qVar, int i12) {
        this.f105935a = i11;
        this.f105936b = qVar;
        this.f105937c = i12;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f105935a);
        this.f105936b.C(this.f105937c, bundle);
    }
}
