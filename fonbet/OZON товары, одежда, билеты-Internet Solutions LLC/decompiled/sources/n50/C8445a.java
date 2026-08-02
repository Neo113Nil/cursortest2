package n50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;

/* renamed from: n50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8445a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final RecyclerView f76550a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f76551b;

    private C8445a(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f76550a = recyclerView;
        this.f76551b = recyclerView2;
    }

    @NonNull
    public static C8445a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.cbottom_fragment, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) inflate;
        return new C8445a(recyclerView, recyclerView);
    }

    @NonNull
    public final RecyclerView a() {
        return this.f76550a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f76550a;
    }
}
