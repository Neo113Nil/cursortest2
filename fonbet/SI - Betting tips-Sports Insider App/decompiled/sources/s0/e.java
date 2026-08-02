package s0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22609b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f22609b = gVar;
        this.f22608a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.f22608a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        g gVar = this.f22609b;
        if (gVar.f22616e != color) {
            gVar.f22616e = color;
            for (int size = gVar.f22613b.size() - 1; size >= 0; size--) {
                ((c) gVar.f22613b.get(size)).b(color);
            }
        }
    }
}
