package sd;

import android.app.Dialog;
import android.view.View;
import com.sports.insider.R;
import gf.q;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends Dialog implements View.OnClickListener, ve.e {

    /* renamed from: a, reason: collision with root package name */
    public kf.f f23490a;

    /* renamed from: b, reason: collision with root package name */
    public d f23491b;

    /* renamed from: c, reason: collision with root package name */
    public ve.h f23492c;

    public static final void a(l lVar, n nVar) {
        kf.f fVar = lVar.f23490a;
        if (fVar != null) {
            d dVar = lVar.f23491b;
            if (dVar != null) {
                Intrinsics.checkNotNullParameter(nVar, "<set-?>");
                dVar.f23478b = nVar;
            } else {
                dVar = new d(null, 3);
            }
            gf.o oVar = q.f10031a;
            fVar.resumeWith(dVar);
        }
        lVar.f23490a = null;
        lVar.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null) {
            if (valueOf.intValue() == R.id.cancel) {
                kf.f fVar = this.f23490a;
                if (fVar != null) {
                    gf.o oVar = q.f10031a;
                    fVar.resumeWith(new d(null, 3));
                }
                this.f23490a = null;
                dismiss();
                return;
            }
            kf.f fVar2 = this.f23490a;
            if (fVar2 != null) {
                gf.o oVar2 = q.f10031a;
                fVar2.resumeWith(new d(null, 3));
            }
            this.f23490a = null;
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.f23492c.setClickListener(this);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f23492c.setClickListener(null);
    }
}
