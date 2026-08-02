package ze;

import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.appcompat.app.l;
import com.viewer.MultiTouchViewPager;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements i, DialogInterface.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public a f25925a;

    /* renamed from: b, reason: collision with root package name */
    public l f25926b;

    /* renamed from: c, reason: collision with root package name */
    public g f25927c;

    @Override // ze.i
    public final void onDismiss() {
        l lVar = this.f25926b;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialog, int i5, KeyEvent event) {
        MultiTouchViewPager multiTouchViewPager;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(event, "event");
        if (i5 == 4 && event.getAction() == 1 && !event.isCanceled()) {
            g gVar = this.f25927c;
            if (gVar != null && (multiTouchViewPager = gVar.f25942b) != null) {
                int currentItem = multiTouchViewPager.getCurrentItem();
                d dVar = gVar.f25943c;
                if (dVar != null) {
                    dVar.e(currentItem);
                }
            }
            dialog.cancel();
        }
        return true;
    }
}
