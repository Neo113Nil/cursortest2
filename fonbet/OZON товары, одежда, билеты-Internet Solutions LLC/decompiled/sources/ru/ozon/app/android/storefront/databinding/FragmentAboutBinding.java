package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;

/* loaded from: classes2.dex */
public final class FragmentAboutBinding implements a {

    @NonNull
    public final TextView commitHashTv;

    @NonNull
    public final TextView copyrightRange;

    @NonNull
    public final TextView legalName;

    @NonNull
    public final Button license;

    @NonNull
    public final ImageView logo;

    @NonNull
    public final Button personalData;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final ViewStub toolbarSelect;

    @NonNull
    public final TextView userId;

    @NonNull
    public final TextView version;

    @NonNull
    public final TextView versionMoreInfo;

    private FragmentAboutBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Button button, @NonNull ImageView imageView, @NonNull Button button2, @NonNull Toolbar toolbar, @NonNull ViewStub viewStub, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = linearLayoutCompat;
        this.commitHashTv = textView;
        this.copyrightRange = textView2;
        this.legalName = textView3;
        this.license = button;
        this.logo = imageView;
        this.personalData = button2;
        this.toolbar = toolbar;
        this.toolbarSelect = viewStub;
        this.userId = textView4;
        this.version = textView5;
        this.versionMoreInfo = textView6;
    }

    @NonNull
    public static FragmentAboutBinding bind(@NonNull View view) {
        int i11 = R$id.commitHashTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.copyrightRange;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                i11 = R$id.legalName;
                TextView textView3 = (TextView) C2548q.d(i11, view);
                if (textView3 != null) {
                    i11 = R$id.license;
                    Button button = (Button) C2548q.d(i11, view);
                    if (button != null) {
                        i11 = R$id.logo;
                        ImageView imageView = (ImageView) C2548q.d(i11, view);
                        if (imageView != null) {
                            i11 = R$id.personalData;
                            Button button2 = (Button) C2548q.d(i11, view);
                            if (button2 != null) {
                                i11 = R$id.toolbar;
                                Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                                if (toolbar != null) {
                                    i11 = R$id.toolbarSelect;
                                    ViewStub viewStub = (ViewStub) C2548q.d(i11, view);
                                    if (viewStub != null) {
                                        i11 = R$id.userId;
                                        TextView textView4 = (TextView) C2548q.d(i11, view);
                                        if (textView4 != null) {
                                            i11 = R$id.version;
                                            TextView textView5 = (TextView) C2548q.d(i11, view);
                                            if (textView5 != null) {
                                                i11 = R$id.versionMoreInfo;
                                                TextView textView6 = (TextView) C2548q.d(i11, view);
                                                if (textView6 != null) {
                                                    return new FragmentAboutBinding((LinearLayoutCompat) view, textView, textView2, textView3, button, imageView, button2, toolbar, viewStub, textView4, textView5, textView6);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentAboutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_about, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayoutCompat getConstraintLayout() {
        return this.rootView;
    }
}
