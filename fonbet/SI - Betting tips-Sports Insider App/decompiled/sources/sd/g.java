package sd;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Size;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.d2;
import c4.v;
import c4.y;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import eg.c0;
import eg.m0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends d2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.graphics.Bitmap] */
    public final void b(lc.e eVar) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewWithTag("iv");
        Continuation continuation = null;
        try {
            ContentResolver contentResolver = this.itemView.getContext().getContentResolver();
            continuation = Build.VERSION.SDK_INT >= 29 ? contentResolver.loadThumbnail(eVar.f19674b, new Size(io.sentry.config.a.o(96), io.sentry.config.a.o(96)), null) : MediaStore.Images.Thumbnails.getThumbnail(contentResolver, eVar.f19673a, 1, null);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar2 = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, continuation, 18), 2);
        }
        Intrinsics.checkNotNull(appCompatImageView);
        c4.o a7 = y.a(appCompatImageView.getContext());
        q4.e eVar3 = new q4.e(appCompatImageView.getContext());
        eVar3.f21940c = continuation;
        q4.j.d(eVar3, appCompatImageView);
        q4.j.c(eVar3, R.drawable.bg_prediction);
        ((v) a7).a(eVar3.a());
    }
}
