package z10;

import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

/* renamed from: z10.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC10973a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10974b f106909a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f106910b;

    public ViewOnLayoutChangeListenerC10973a(C10974b c10974b, ViewGroup viewGroup) {
        this.f106909a = c10974b;
        this.f106910b = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        view.removeOnLayoutChangeListener(this);
        this.f106909a.f106912b.setY(this.f106910b.getY());
    }
}
