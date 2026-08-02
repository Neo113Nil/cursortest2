package u80;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateViewV20;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* renamed from: u80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9985a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f100393a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ScreenStateViewV20 f100394b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final WebView f100395c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f100396d;

    private C9985a(@NonNull FrameLayout frameLayout, @NonNull ScreenStateViewV20 screenStateViewV20, @NonNull WebView webView, @NonNull FinToolbarView finToolbarView) {
        this.f100393a = frameLayout;
        this.f100394b = screenStateViewV20;
        this.f100395c = webView;
        this.f100396d = finToolbarView;
    }

    @NonNull
    public static C9985a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_bank_cards_web_view_fragment, viewGroup, false);
        int i11 = R.id.screen_state;
        ScreenStateViewV20 screenStateViewV20 = (ScreenStateViewV20) C2548q.d(R.id.screen_state, inflate);
        if (screenStateViewV20 != null) {
            i11 = R.id.web_view;
            WebView webView = (WebView) C2548q.d(R.id.web_view, inflate);
            if (webView != null) {
                i11 = R.id.web_view_toolbar;
                FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.web_view_toolbar, inflate);
                if (finToolbarView != null) {
                    return new C9985a((FrameLayout) inflate, screenStateViewV20, webView, finToolbarView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f100393a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f100393a;
    }
}
