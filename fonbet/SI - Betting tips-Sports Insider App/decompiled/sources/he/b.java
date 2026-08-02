package he;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.d2;
import c4.o;
import c4.v;
import c4.y;
import com.sports.insider.R;
import kotlin.jvm.internal.Intrinsics;
import q4.e;
import q4.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends d2 {
    public final void b(String str) {
        View findViewById = this.itemView.findViewById(R.id.bgnImg);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        o a7 = y.a(imageView.getContext());
        e eVar = new e(imageView.getContext());
        eVar.f21940c = str;
        j.d(eVar, imageView);
        j.c(eVar, R.drawable.bg_prediction);
        ((v) a7).a(eVar.a());
    }
}
