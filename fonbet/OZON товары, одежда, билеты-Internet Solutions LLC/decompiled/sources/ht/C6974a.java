package ht;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import m1.InterfaceC8038i;
import qc.q;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;

/* renamed from: ht.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C6974a implements q, OnSuccessListener, InterfaceC8038i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f65639a;

    public /* synthetic */ C6974a(Object obj) {
        this.f65639a = obj;
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        m1.q qVar = (m1.q) this.f65639a;
        double a11 = qVar.a();
        return d11 >= qVar.d() ? Math.pow((a11 * d11) + qVar.b(), qVar.g()) : qVar.c() * d11;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((Function1) this.f65639a).invoke(obj);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeFavoritesUpdates$lambda$0;
        observeFavoritesUpdates$lambda$0 = FavoriteProductMoleculeInteractor.observeFavoritesUpdates$lambda$0((Function1) this.f65639a, obj);
        return observeFavoritesUpdates$lambda$0;
    }
}
