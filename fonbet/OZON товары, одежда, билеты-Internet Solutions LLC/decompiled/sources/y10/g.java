package y10;

import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f105921a;

    public g(i iVar) {
        this.f105921a = iVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        ImageView imageView;
        ImageView imageView2;
        view.removeOnLayoutChangeListener(this);
        i iVar = this.f105921a;
        imageView = iVar.f105929f;
        if (Intrinsics.d(imageView.getTag(), i.d(iVar))) {
            imageView2 = iVar.f105929f;
            imageView2.setY(i.a(iVar));
        }
    }
}
