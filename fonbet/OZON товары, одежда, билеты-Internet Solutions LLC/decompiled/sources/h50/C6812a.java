package h50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.ui.CbottomUIScrollableView;

/* renamed from: h50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6812a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final CbottomUIScrollableView f65021a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CbottomUIScrollableView f65022b;

    private C6812a(@NonNull CbottomUIScrollableView cbottomUIScrollableView, @NonNull CbottomUIScrollableView cbottomUIScrollableView2) {
        this.f65021a = cbottomUIScrollableView;
        this.f65022b = cbottomUIScrollableView2;
    }

    @NonNull
    public static C6812a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.cbottom_screen_fragment, viewGroup, false);
        if (inflate == null) {
            throw new NullPointerException("rootView");
        }
        CbottomUIScrollableView cbottomUIScrollableView = (CbottomUIScrollableView) inflate;
        return new C6812a(cbottomUIScrollableView, cbottomUIScrollableView);
    }

    @NonNull
    public final CbottomUIScrollableView a() {
        return this.f65021a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f65021a;
    }
}
