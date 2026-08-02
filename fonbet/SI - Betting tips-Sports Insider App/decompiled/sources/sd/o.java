package sd;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.q2;
import c4.v;
import c4.y;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.sports.insider.R;
import gf.q;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends BottomSheetDialog implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public d f23514a;

    /* renamed from: b, reason: collision with root package name */
    public kf.f f23515b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Activity activity) {
        super(activity, R.style.BottomSheetDialogMenuOptionG2);
        Window window;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 35 && (window = getWindow()) != null) {
            q2 q2Var = new q2(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(q2Var, "getInsetsController(...)");
            q2Var.f1386a.w(false);
            window.setNavigationBarContrastEnforced(false);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_menu_option_giftap, (ViewGroup) null);
        setOnDismissListener(new i(2, this));
        setContentView(inflate);
        Object parent = inflate.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setBackgroundColor(0);
        }
        Object parent2 = inflate.getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            view2.setElevation(0.0f);
        }
        float o3 = io.sentry.config.a.o(10);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.image);
        if (appCompatImageView != null) {
            Integer valueOf = Integer.valueOf(R.drawable.girl3);
            c4.o a7 = y.a(appCompatImageView.getContext());
            q4.e eVar = new q4.e(appCompatImageView.getContext());
            eVar.f21940c = valueOf;
            q4.j.d(eVar, appCompatImageView);
            eVar.f21951o = r4.g.f22298a;
            ((v) a7).a(eVar.a());
        }
        inflate.setBackgroundColor(0);
        inflate.setElevation(0.0f);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.gift);
        if (materialButton != null) {
            materialButton.setOnClickListener(this);
            ShapeAppearanceModel build = ShapeAppearanceModel.builder().setAllCornerSizes(o3).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            MaterialButton materialButton2 = new MaterialButton[]{materialButton}[0];
            if (materialButton2 != null) {
                materialButton2.setShapeAppearanceModel(build);
            }
            if (materialButton2 != null) {
                Context context = materialButton2.getContext();
                Intrinsics.checkNotNull(context);
                materialButton2.setBackgroundDrawable(context.getDrawable(R.drawable.background_pick_up_a_gift));
            }
        }
        inflate.setOnClickListener(this);
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        behavior.setState(3);
        behavior.setPeekHeight(io.sentry.config.a.o(84));
    }

    public final Object b(d dVar, Continuation frame) {
        this.f23514a = dVar;
        show();
        kf.f fVar = new kf.f(lf.d.b(frame));
        this.f23515b = fVar;
        Object b10 = fVar.b();
        if (b10 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return b10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar;
        List list;
        Object obj;
        n nVar2;
        List list2;
        Object obj2;
        n nVar3;
        List list3;
        Object obj3;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.gift) {
            d dVar = this.f23514a;
            if (dVar == null || (list3 = dVar.f23477a) == null) {
                nVar3 = null;
            } else {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it.next();
                        if (((n) obj3) == n.j) {
                            break;
                        }
                    }
                }
                nVar3 = (n) obj3;
            }
            kf.f fVar = this.f23515b;
            if (fVar != null) {
                d dVar2 = this.f23514a;
                if (dVar2 != null) {
                    if (nVar3 == null) {
                        nVar3 = n.f23496c;
                    }
                    Intrinsics.checkNotNullParameter(nVar3, "<set-?>");
                    dVar2.f23478b = nVar3;
                } else {
                    dVar2 = new d(null, 3);
                }
                gf.o oVar = q.f10031a;
                fVar.resumeWith(dVar2);
            }
            this.f23515b = null;
            dismiss();
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.cancel) {
            d dVar3 = this.f23514a;
            if (dVar3 == null || (list2 = dVar3.f23477a) == null) {
                nVar2 = null;
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (((n) obj2) == n.j) {
                            break;
                        }
                    }
                }
                nVar2 = (n) obj2;
            }
            kf.f fVar2 = this.f23515b;
            if (fVar2 != null) {
                d dVar4 = this.f23514a;
                if (dVar4 != null) {
                    if (nVar2 == null) {
                        nVar2 = n.f23496c;
                    }
                    Intrinsics.checkNotNullParameter(nVar2, "<set-?>");
                    dVar4.f23478b = nVar2;
                } else {
                    dVar4 = new d(null, 3);
                }
                gf.o oVar2 = q.f10031a;
                fVar2.resumeWith(dVar4);
            }
            this.f23515b = null;
            dismiss();
            return;
        }
        d dVar5 = this.f23514a;
        if (dVar5 == null || (list = dVar5.f23477a) == null) {
            nVar = null;
        } else {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it3.next();
                    if (((n) obj) == n.j) {
                        break;
                    }
                }
            }
            nVar = (n) obj;
        }
        kf.f fVar3 = this.f23515b;
        if (fVar3 != null) {
            d dVar6 = this.f23514a;
            if (dVar6 != null) {
                if (nVar == null) {
                    nVar = n.f23496c;
                }
                Intrinsics.checkNotNullParameter(nVar, "<set-?>");
                dVar6.f23478b = nVar;
            } else {
                dVar6 = new d(null, 3);
            }
            gf.o oVar3 = q.f10031a;
            fVar3.resumeWith(dVar6);
        }
        this.f23515b = null;
        dismiss();
    }
}
