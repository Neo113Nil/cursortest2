package ge;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f9973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nc.b f9974c;

    public /* synthetic */ h(b bVar, nc.b bVar2, int i5) {
        this.f9972a = i5;
        this.f9973b = bVar;
        this.f9974c = bVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b bVar;
        b bVar2;
        b bVar3;
        View view = (View) obj;
        switch (this.f9972a) {
            case 0:
                if ((view instanceof AppCompatImageView) && (bVar = this.f9973b) != null) {
                    bVar.b(this.f9974c);
                }
                break;
            case 1:
                if ((view instanceof TextView) && (bVar2 = this.f9973b) != null) {
                    bVar2.n(this.f9974c);
                }
                break;
            case 2:
                b bVar4 = this.f9973b;
                if (bVar4 != null) {
                    bVar4.r(this.f9974c);
                }
                break;
            default:
                if ((view instanceof ImageView) && (bVar3 = this.f9973b) != null) {
                    bVar3.t(this.f9974c.getImageUrl());
                }
                break;
        }
        return Unit.f19194a;
    }
}
