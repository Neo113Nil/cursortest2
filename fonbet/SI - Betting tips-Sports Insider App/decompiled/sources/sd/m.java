package sd;

import android.content.res.Resources;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sports.insider.R;
import com.sports.insider.ui.views.BottomListMenuOptionView;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends BottomSheetDialog implements ve.b {

    /* renamed from: a, reason: collision with root package name */
    public d f23493a;

    /* renamed from: b, reason: collision with root package name */
    public kf.f f23494b;

    /* renamed from: c, reason: collision with root package name */
    public final BottomListMenuOptionView f23495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p0 activity) {
        super(activity, R.style.BottomSheetDialogMenuOption);
        Intrinsics.checkNotNullParameter(activity, "activity");
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_menu_option, (ViewGroup) null);
        setOnDismissListener(new i(1, this));
        setContentView(inflate);
        this.f23495c = (BottomListMenuOptionView) inflate.findViewById(R.id.menuView);
    }

    public final void b(int i5) {
        d dVar = this.f23493a;
        if (dVar != null) {
            List list = dVar.f23477a;
            n nVar = !list.isEmpty() ? (n) CollectionsKt.G(i5, list) : null;
            if (nVar == null) {
                nVar = n.f23496c;
            }
            Intrinsics.checkNotNullParameter(nVar, "<set-?>");
            dVar.f23478b = nVar;
        }
        kf.f fVar = this.f23494b;
        if (fVar != null) {
            d dVar2 = this.f23493a;
            if (dVar2 == null) {
                dVar2 = new d(null, 3);
            }
            gf.o oVar = q.f10031a;
            fVar.resumeWith(dVar2);
        }
        this.f23494b = null;
        dismiss();
    }

    public final Object c(d dVar, Continuation frame) {
        this.f23493a = dVar;
        show();
        kf.f fVar = new kf.f(lf.d.b(frame));
        this.f23494b = fVar;
        Object b10 = fVar.b();
        if (b10 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return b10;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, e.l, android.app.Dialog
    public final void onStart() {
        SpannableString spannableString;
        super.onStart();
        BottomListMenuOptionView bottomListMenuOptionView = this.f23495c;
        if (bottomListMenuOptionView != null) {
            bottomListMenuOptionView.setClickListener(this);
        }
        d dVar = this.f23493a;
        if (dVar != null) {
            Resources resources = getContext().getResources();
            List<n> list = dVar.f23477a;
            ArrayList arrayList = new ArrayList(v.k(list, 10));
            for (n nVar : list) {
                arrayList.add(new Pair(Integer.valueOf(nVar.f23512a), resources.getString(nVar.f23513b)));
            }
            String string = resources.getString(dVar.f23478b.f23513b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (bottomListMenuOptionView != null) {
                if (string != null) {
                    spannableString = new SpannableString(string);
                } else {
                    spannableString = bottomListMenuOptionView.f7198o;
                    if (spannableString == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cancel");
                        spannableString = null;
                    }
                }
                bottomListMenuOptionView.f7198o = spannableString;
                if (arrayList.isEmpty()) {
                    bottomListMenuOptionView.H = e0.f19204a;
                    bottomListMenuOptionView.invalidate();
                    return;
                }
                ArrayList arrayList2 = new ArrayList(v.k(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    arrayList2.add(new Pair(pair.f19192a, new SpannableString((CharSequence) pair.f19193b)));
                }
                bottomListMenuOptionView.H = arrayList2;
                bottomListMenuOptionView.requestLayout();
            }
        }
    }

    @Override // androidx.appcompat.app.n0, e.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        BottomListMenuOptionView bottomListMenuOptionView = this.f23495c;
        if (bottomListMenuOptionView != null) {
            bottomListMenuOptionView.setClickListener(null);
        }
    }
}
