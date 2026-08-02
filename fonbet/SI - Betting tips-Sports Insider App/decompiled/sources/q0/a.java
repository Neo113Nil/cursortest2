package q0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f21895a;

    /* renamed from: b, reason: collision with root package name */
    public final c f21896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21897c;

    public a(int i5, c cVar, int i10) {
        this.f21895a = i5;
        this.f21896b = cVar;
        this.f21897c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f21895a);
        this.f21896b.f21914a.performAction(this.f21897c, bundle);
    }
}
