package u70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.onboarding.ui.DisclosureItemView;

/* renamed from: u70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9979a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f100350a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f100351b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f100352c;

    private C9979a(@NonNull ViewGroup viewGroup, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView) {
        this.f100350a = viewGroup;
        this.f100351b = imageView;
        this.f100352c = appCompatTextView;
    }

    @NonNull
    public static C9979a a(@NonNull LayoutInflater layoutInflater, @NonNull DisclosureItemView disclosureItemView) {
        layoutInflater.inflate(R.layout.disclosure_item, disclosureItemView);
        int i11 = R.id.iv_icon;
        ImageView imageView = (ImageView) C2548q.d(R.id.iv_icon, disclosureItemView);
        if (imageView != null) {
            i11 = R.id.tv_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.tv_title, disclosureItemView);
            if (appCompatTextView != null) {
                return new C9979a(disclosureItemView, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(disclosureItemView.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f100350a;
    }
}
