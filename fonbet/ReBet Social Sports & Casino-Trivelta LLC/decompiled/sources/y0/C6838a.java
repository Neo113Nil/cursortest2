package y0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6838a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f68190a;

    /* renamed from: b, reason: collision with root package name */
    public final z f68191b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68192c;

    public C6838a(int i10, z zVar, int i11) {
        this.f68190a = i10;
        this.f68191b = zVar;
        this.f68192c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f68190a);
        this.f68191b.m0(this.f68192c, bundle);
    }
}
